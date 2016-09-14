//zevienin

package com.lazyswipe.fan;

import java.lang.reflect.Field;
import java.util.List;

import org.json.JSONObject;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.friend.FriendSector;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.ui.RateView;
import com.main.ir;
import com.main.is;
import com.main.jc;
import com.main.jg;
import com.main.ji;
import com.main.li;
import com.main.lk;
import com.main.ll;
import com.main.lr;
import com.main.ls;
import com.main.lw;
import com.main.mf;
import com.main.mg;
import com.main.mm;
import com.main.mt;
import com.main.nc;
import com.main.nd;
import com.main.oa;
import com.main.ox;
import com.main.oy;
import com.main.pb;
import com.main.pc;
import com.main.rj;
import com.main.ss;
import com.main.tx;
import com.main.uc;
import com.main.uo;
import com.main.ve;
import com.main.vf;
import com.main.vj;
import com.main.vk;
import com.main.wg;
import com.main.wh;
import com.main.ww;
import com.main.wy;
import com.main.xa;

// Referenced classes of package com.lazyswipe.fan:
//            NotificationView, TutorialView, FanItem

public class Fan extends FrameLayout implements android.os.Handler.Callback,
		android.view.View.OnClickListener,
		android.widget.PopupWindow.OnDismissListener {

	public static final lr a = new lr();
	public static boolean b;
	private static long m;
	private static Fan x;
	ll c;
	public nc d[];
	boolean e;
	public int f;
	final mm g;
	public final Handler h = new Handler(this);
	NotificationView i;
	li j;
	wg k;
	pc l;
	private final int n;
	private final int o;
	private final int p;
	private final int q;
	private mg r;
	private boolean s;
	private PopupWindow t;
	private oa u;
	private View v;
	private boolean w;
	private lw y;
	private float z;

	public Fan(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		z = -1F;
		Resources resources = getResources();
		x = this;
		g = new mm(context, h);
		n = resources.getDimensionPixelSize(0x7f0b0038);
		o = resources.getDimensionPixelSize(0x7f0b0039);
		p = resources.getDimensionPixelSize(0x7f0b002a);
		q = resources.getDimensionPixelSize(0x7f0b002c);
		setOnClickListener(this);
		l = new pc(this);
	}

	public static Fan a(Context context,
			android.widget.PopupWindow.OnDismissListener ondismisslistener) {
		if (j()) {
			return null;
		}
		b = false;
		is.a();
		rj.c();
		vf.b();
		m = System.currentTimeMillis();
		boolean flag1 = a.a;
		ir.g(context, flag1);
		Fan fan;
		ww ww1;
		Field field;
		int i1;
		boolean flag;
		if (oy.a()) {
			i1 = 0x7f04001b;
		} else {
			i1 = 0x7f040018;
		}
		fan = (Fan) LayoutInflater.from(context).inflate(i1, null);
		if (a.f != null) {
			flag = true;
		} else {
			flag = false;
		}
		fan.w = flag;
		fan.setDirection(flag1);
		if (oa.a(context) && fan.u == null) {
			try {
				fan.u = new oa(context, fan);
			} catch (Throwable throwable) {
				fan.u = null;
			}
		}
		ww1 = new ww(fan, -1, -1);
		field = uo.c(android.widget.PopupWindow.class, "mWindowLayoutType");
		try {
			field.setAccessible(true);
			field.set(ww1, Integer.valueOf(ir.r(context)));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
		}
		ww1.setFocusable(true);
		ww1.setContentView(fan);
		ww1.setOnDismissListener(ondismisslistener);
		fan.t = ww1;
		ww1.showAtLocation(fan, 112, 0, 0);
		if (!fan.isHardwareAccelerated()) {
			try {
				tx.a(ww1);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				vj.a("Swipe.Fan", "Failed to enable hardware acceleration",
						exception);
			}
		}
		fan.a(a.f);
		return fan;
	}

	public void a(View view) {
		if (!f()) {
			view.getId();
			if (!rj.b() && !c.c()) {
				if (g()) {
					h();
					return;
				} else {
					t();
					return;
				}
			}
		}
	}

	public static void a(View view, boolean flag) {
		android.view.ViewGroup.LayoutParams layoutParams = view
				.getLayoutParams();
		if (layoutParams != null) {
			int i1;
			if (flag) {
				i1 = SwipeApplication.a;
			} else {
				i1 = SwipeApplication.b;
			}
			i1 |= 0x50;
			if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
				((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = i1;
			} else if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
				((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = i1;
				return;
			}
		}
	}

	public static void a(FanItem fanitem, mt mt1) {
		if (x != null) {
			if (x.i == null) {
				x.i = (NotificationView) LayoutInflater.from(x.getContext())
						.inflate(0x7f040033, null, false);
				x.addView(x.i);
			}
			x.i.a(fanitem, mt1);
		}
	}

	private void a(wh wh, int i1) {
		int j1;
		if (k == null) {
			k = new wg(getContext());
			ViewGroup viewgroup = getItemSector();
			wg wg1 = k;
			if (s) {
				j1 = SwipeApplication.a;
			} else {
				j1 = SwipeApplication.b;
			}
			viewgroup.addView(wg1, 0,
					new android.widget.FrameLayout.LayoutParams(-2, -2,
							j1 | 0x50));
			k.setOnFanSeekBarChangeListener(wh);
			k.setAlpha(0.0F);
		}
		if (oy.a()) {
			j1 = 0x7f0b003c;
		} else if (getCurrentTab().i() <= 4) {
			j1 = 0x7f0b0032;
		} else {
			j1 = 0x7f0b0031;
		}
		k.setRadius(j1);
		k.a();
		k.setProgress(i1);
		k.setAutoDismiss(3000L);
	}

	public static void a(boolean flag, wh wh, int i1) {
		if (x != null) {
			if (flag) {
				if (x.k == null || !x.k.isShown()) {
					x.a(wh, i1);
					return;
				} else {
					x.k.setProgress(i1);
					return;
				}
			}
			if (x.k != null && x.k.isShown()) {
				x.w();
				return;
			}
		}
	}

	private boolean a(int i1, boolean flag) {
		return a(i1, flag, false);
	}

	@SuppressWarnings("rawtypes")
	private boolean a(int i1, boolean flag, boolean flag1) {
		List list = a(d[i1]);
		if (flag && list.size() == 1 && ((mt) list.get(0)).c()) {
			list.clear();
			return false;
		}
		if (flag1) {
			return true;
		}
		if (!NewGuide.k()) {
			c.setTab(i1);
			c.a(i1, true);
			d[i1].a(getContext(), this);
		}
		return true;
	}

	private boolean a(Context var1) {
		boolean var5 = true;
		boolean var3 = true;
		boolean var6 = false;
		boolean var4 = false;
		if (pb.b) {
			if (this.getResources().getConfiguration().orientation != 1
					|| !this.l.a()) {
				var3 = false;
			}

			pb.b = false;
		} else if (!SwipeApplication.c && !SwipeApplication.d) {
			if (SwipeApplication.e != null) {
				JSONObject var7 = SwipeApplication.e;
				var3 = var4;
				if (this.w) {
					return var3;
				}

				var3 = var4;
				if (this.getResources().getConfiguration().orientation != 1) {
					return var3;
				}

				try {
					if (System.currentTimeMillis() - var7.getLong("endTime") > 0L) {
						SwipeApplication.e = ji.g(this.getContext()
								.getApplicationContext());
						return false;
					}
				} catch (Throwable var10) {
					;
				}

				try {
					String var8 = var7.getString("pkg");
					if (!TextUtils.isEmpty(var8)
							&& !jg.a(var1, var8,
									ve.a(var7.optString("appVer", ""), 0))) {
						ji.a(var1, (String) var7.getString("code"));
						SwipeApplication.e = ji.g(this.getContext()
								.getApplicationContext());
						return false;
					}
				} catch (Throwable var9) {
					;
				}

				this.j = li.a(this.getContext(), this, var7);
				if (this.j != null) {
					this.addView(this.j, 0,
							new android.widget.FrameLayout.LayoutParams(-1, -1));
					this.c();
					var3 = var5;
					return var3;
				}
			} else {
				SwipeApplication.e = ji.g(this.getContext()
						.getApplicationContext());
				if (this.getResources().getConfiguration().orientation == 1) {
					var3 = var5;
					if (this.l.a()) {
						return var3;
					}
				}
			}

			var3 = false;
		} else {
			int var2 = ir.J(var1);
			if (SwipeApplication.d && 200 == var2) {
				SwipeApplication.d = false;
				this.h.sendEmptyMessageDelayed(4, 1250L);
				var3 = var6;
			} else if ((!SwipeApplication.d || var2 < 100)
					&& (!SwipeApplication.c || var2 >= 100 || var2 < 4)) {
				var3 = var6;
				if (!NewGuide.j()) {
					SwipeApplication.d = false;
					SwipeApplication.c = false;
					NewGuide.h();
					var3 = var6;
				}
			} else {
				this.b();
				var3 = true;
			}
		}

		return var3;
	}

	private String c(String s1) {
		return a(s1, false);
	}

	public static void c(boolean flag) {
		if (j() && x != null) {
			Handler handler = x.h;
			int i1;
			if (flag) {
				i1 = 1;
			} else {
				i1 = 0;
			}
			handler.obtainMessage(1, i1, 0).sendToTarget();
		}
	}

	public static Fan getInstance() {
		return x;
	}

	public static boolean j() {
		return x != null && x.isShown();
	}

	public static void k() {
		c(false);
	}

	public static void l() {
		if (x != null && x.k != null) {
			x.getItemSector().removeView(x.k);
			x.k = null;
		}
	}

	public static boolean n() {
		return a.j;
	}

	public static void q() {
		uc.b();
		ox.g();
		vk.b();
	}

	private String r() {
		return c(ir.i(getContext(), s));
	}

	private void s() {
		t.dismiss();
		onDismiss();
	}

	private void t() {
		if (e) {
			return;
		}
		e = true;
		if (j != null) {
			li.b(j);
			v.animate().alpha(0.0F).setDuration(ls.a() / 2)
					.setStartDelay(ls.a() / 2);
		} else {
			v.animate().alpha(0.0F)
					.setDuration((int) ((double) ls.a() * 2.7000000000000002D))
					.setStartDelay((int) ((double) ls.a() * 1.3D))
					.setInterpolator(new AccelerateInterpolator(2.0F));
		}
		c.a();
	}

	private void u() {
		nc anc[] = d;
		int j1 = anc.length;
		for (int i1 = 0; i1 < j1; i1++) {
			anc[i1].e();
		}

		c.b();
	}

	// private boolean v() {
	// View view = null;
	// if (u == null || !u.j()) {
	// if (NewGuide.j()) {
	// if (!((view = getChildAt(getChildCount() - 1)) instanceof NewGuide)) {
	// return true;
	// }
	//
	// } else {
	//
	// ((NewGuide) view).g();
	//
	// if (f() || RateView.b() || c.c() || FriendSector.b()) {
	// return true;
	// } else {
	//
	// if (g()) {
	// h();
	// return true;
	// } else {
	// a(true);
	// return true;
	// }
	//
	// }
	//
	// }
	//
	// } else {
	//
	// return true;
	// }
	// return true;
	//
	// }

	private boolean v() {
		if (this.u == null || !this.u.j()) {
			if (NewGuide.j()) {
				View var1 = this.getChildAt(this.getChildCount() - 1);
				if (var1 instanceof NewGuide) {
					((NewGuide) var1).g();
					return true;
				}
			} else if (!this.g() && !RateView.b() && !this.c.c()
					&& !FriendSector.b()) {
				if (this.g()) {
					this.h();
					return true;
				}

				this.a(true);
				return true;
			}
		}

		return true;
	}

	private void w() {
		k.b();
	}

	String a(String s1, boolean flag) {
		int i1 = 0;
		do {
			if (i1 >= d.length) {
				break;
			}
			if (s1.equals(d[i1].b())) {
				if (a(i1, false, flag)) {
					return s1;
				}
				break;
			}
			i1++;
		} while (true);
		return null;
	}

	public List a(nc nc1) {
		return g.a(nc1);
	}

	public void a() {
		if (u != null) {
			u.k();
		}
	}

	public void a(float f1, float f2) {
		getHandTracker().a(f1, f2);
	}

	public void a(int i1) {
		getHandTracker().a(i1);
	}

	public void a(String s1) {
		s1 = b(s1);
		int i1 = vk.a(d, s1);
		if (NewGuide.k()) {
			NewGuide.a(this);
		} else {
			c.a(i1);
			if (a.k) {
				Log.i("Swipe.Fan", "Notifications suppressed");
				return;
			}
			if (!a(getContext()) && u != null) {
				u.d();
				return;
			}
		}
	}

	public void a(boolean flag) {
		h.removeCallbacksAndMessages(null);
		if (flag) {
			if (k != null && k.isShown()) {
				w();
			}
			h();
			t();
			return;
		} else {
			s();
			return;
		}
	}

	public void addView(View view, int i1,
			android.view.ViewGroup.LayoutParams layoutparams) {
		super.addView(view, i1, layoutparams);
		if (((view instanceof TutorialView) || (view instanceof li))
				&& u != null) {
			u.e();
		}
	}

	String b(String s1) {
		if (TextUtils.isEmpty(s1) || c(s1) == null) {
			String s2 = r();
			s1 = s2;
			if (s2 == null) {
				if (a(0, true)) {
					return d[0].b();
				} else {
					return null;
				}
			}
		}
		return s1;
	}

	public void b() {
		addView((TutorialView) LayoutInflater.from(getContext()).inflate(
				0x7f04004d, this, false),
				new android.widget.FrameLayout.LayoutParams(-1, -1));
	}

	public void b(boolean flag) {
		boolean flag1;
		flag1 = false;
		if (e) {
			return;
		}
		ll ll1;
		int i1;
		getCurrentTab().e();
		ll1 = c;
		i1 = c.a;
		if (!flag) {
			flag1 = true;
		}
		try {
			ll1.a(i1, flag1, false);
			return;
		} catch (Exception exception) {
			s();
		}
		return;
	}

	public void c() {
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams) c
				.getLayoutParams();
		if (layoutparams != null) {
			layoutparams.height = getResources().getDimensionPixelSize(
					0x7f0b002c);
			boolean flag;
			if (ox.a(0x7f010014) != 0) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				layoutparams.height = layoutparams.height
						+ getResources().getDimensionPixelSize(0x7f0b002b);
			}
			c.setLayoutParams(layoutparams);
		}
	}

	public void d() {
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams) c
				.getLayoutParams();
		if (layoutparams != null) {
			layoutparams.height = -1;
			c.setLayoutParams(layoutparams);
		}
	}

	public boolean dispatchDragEvent(DragEvent dragevent) {
		boolean flag;
		try {
			flag = super.dispatchDragEvent(dragevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return flag;
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent) {
		if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1
				&& !keyevent.isCanceled()) {
			v();
			return true;
		} else {
			return super.dispatchKeyEvent(keyevent);
		}
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent) {
		boolean flag;
		try {
			flag = super.dispatchTouchEvent(motionevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return flag;
	}

	public boolean e() {
		return getHeight() == c.getHeight();
	}

	public boolean f() {
		return SwipeApplication.c;
	}

	public boolean g() {
		return i != null && i.isShown();
	}

	public ll getBaseSectorArea() {
		return c;
	}

	public nc getCurrentTab() {
		return d[c.a];
	}

	public float getHandTrackRatio() {
		return getHandTracker().b();
	}

	public lw getHandTracker() {
		if (y == null) {
			y = new lw(this);
		}
		return y;
	}

	public lk getItemLayer() {
		return c.getItemLayer();
	}

	public ViewGroup getItemSector() {
		return c.getItemSector();
	}

	public View getItemSectorBg() {
		return c.getItemSectorBg();
	}

	public mg getStartPosition() {
		if (r == null) {
			return mf.a(n, false);
		} else {
			return r;
		}
	}

	int getTabCount() {
		return f;
	}

	public ViewGroup getTabSector() {
		return c.getTabSector();
	}

	public View getTabSectorBg() {
		return c.getTabSectorBg();
	}

	public int getTabSectorInnerSize() {
		return n;
	}

	public int getTabSectorOuterSize() {
		return o;
	}

	nc[] getTabs() {
		return d;
	}

	int getTextOffset() {
		return 0;
	}

	public int getTileSectorInnerSize() {
		return p;
	}

	public int getTileSectorOuterSize() {
		return q;
	}

	public void h() {
		if (i != null && i.isShown()) {
			i.a();
		}
	}

	public boolean handleMessage(Message message) {
		boolean flag = false;

		switch (message.what) {
		default:
			return true;
		case 0:
			if (!e && !NewGuide.k()) {
				c.a(c.a, false);
				return true;
			}
			return true;

		case 1:
			if (message.arg1 != 0) {
				flag = true;
			}
			a(flag);
			return true;
		case 2:
			try {
				removeView(v);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return true;
			}
			return true;
		case 3:

			a((View) message.obj);
			return true;
		case 4:
			ir.e(getContext(), true);
			RateView.a(this);
			return true;
		}

	}

	public boolean i() {
		return s;
	}

	public void m() {
		getHandTracker().a();
	}

	public void o() {
		try {
			float f1 = getHandTrackRatio();
			if (z < 0.0F) {
				z = f1;
			}
			c.d();
			f1 = vk.a((f1 - z) / (1.0F - z));
			v.setAlpha(1.0F - (1.0F - f1) * (1.0F - f1));
			return;
		} catch (Exception exception) {
			return;
		}
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		if (u != null) {
			u.a(this);
		}
	}

	public void onClick(View view) {
		a(view);
	}

	public void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (u != null) {
			u.a();
		}
	}

	// public void onDismiss() {
	// if (u != null) {
	// u.e();
	// }
	// u();
	// if (j != null) {
	// j.destroy();
	// long l1 = j.getBannerShowedTime();
	// if (l1 > 0L) {
	// ji.a(getContext().getApplicationContext(), l1);
	// }
	// j = null;
	// }
	// FanItem.d();
	// if (!SwipeApplication.c && a != null) {
	// boolean flag;
	// if (System.currentTimeMillis() - m > 2000L || b) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// jc.a(flag, a);
	// }
	// rj.c();
	// vf.b();
	// l.b();
	// ss.a();
	// a.j = false;
	// is.a();
	// x = null;
	// }
	public void onDismiss() {
		if (this.u != null) {
			this.u.e();
		}

		this.u();
		if (this.j != null) {
			this.j.destroy();
			long var1 = this.j.getBannerShowedTime();
			if (var1 > 0L) {
				ji.a(this.getContext().getApplicationContext(), var1);
			}

			this.j = null;
		}

		if (!SwipeApplication.c && a != null) {
			boolean var3;
			if (System.currentTimeMillis() - m <= 2000L && !b) {
				var3 = false;
			} else {
				var3 = true;
			}

			jc.a(var3, a);
		}

		rj.c();
		vf.b();
		this.l.b();
		ss.a();
		a.j = false;
		is.a();
		x = null;
	}

	public void onFinishInflate() {
		super.onFinishInflate();
		c = (ll) findViewById(0x7f0c004f);
		c.setFan(this);
		List list = nd.a(getContext());
		d = (nc[]) list.toArray(new nc[list.size()]);
		f = d.length;
		ls.a(f);
		v = findViewById(0x7f0c004e);
		v.setBackgroundColor(ox.a(0x7f010012));
		if (n()) {
			// break MISSING_BLOCK_LABEL_120;
		}
		v.animate().alpha(1.0F).setDuration(120L);

		v.setAlpha(1.0F);
		return;
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent) {
		if (rj.b()) {
			return true;
		} else {
			return super.onInterceptTouchEvent(motionevent);
		}
	}

	public void onWindowFocusChanged(boolean flag) {
		super.onWindowFocusChanged(flag);
		if (flag || NewGuide.j() || wy.g() || xa.b()) {
			return;
		} else {
			s();
			return;
		}
	}

	public void p() {
		if (n()) {
			c.e();
			a.j = false;
			if (j()) {
				SwipeService.s();
				return;
			}
		}
	}

	public void removeView(View view) {
		super.removeView(view);
		if (((view instanceof TutorialView) || (view instanceof li))
				&& u != null) {
			u.d();
		}
	}

	public void setBrightnessPanelVisibility(int i1) {
		d[i1].b();
		a(false, ((wh) (null)), 0);
	}

	void setDirection(boolean flag) {
		s = flag;
		r = mf.a(n, flag);
		a(this, flag);
		a(c, flag);
		c.setDirection(flag);
		Resources resources = getContext().getResources();
		int i1 = resources.getDimensionPixelSize(0x7f0b002f);
		int j1 = resources.getDimensionPixelSize(0x7f0b0030);
		if (s) {
			c.setPadding(j1, 0, 0, i1);
			return;
		} else {
			c.setPadding(0, 0, j1, i1);
			return;
		}
	}

}
