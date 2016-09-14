package com.main;

import java.util.Random;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.friend.FriendSector;
import com.lazyswipe.ui.RateView;

public class oa extends View implements View.OnClickListener {
	private static final int j = Math.max(300,
			ViewConfiguration.getLongPressTimeout());
	private ob a = new ob();
	private oc b = new oc();
	private nw c;
	private PointF d = new PointF();
	private PointF e = new PointF();
	private int f = -1;
	private int g = 30;
	private VelocityTracker h;
	private int i;
	private boolean k = false;
	private boolean l = true;
	private ViewGroup m;
	private FrameLayout.LayoutParams n;
	private Fan o;
	private boolean p = false;
	private Long q;
	private Long r;
	private Long s;
	private Handler t;
	private long u;
	private ValueAnimator v;
	private ValueAnimator w;
	private PointF x = new PointF();
	private PointF y = new PointF();
	private Random z = new Random();

	public oa(Context context, Fan fan) {
		super(context);
		this.t = new Handler(Looper.getMainLooper()) {

			/*
			 * Unable to fully structure code Enabled aggressive block sorting
			 * Lifted jumps to return sites
			 */
			public void handleMessage(Message var1_1) {
				boolean var3_2 = false;
				if (!oa.this.c()) {
					return;
				}
				switch (var1_1.what) {
				default: {
					return;
				}
				case 0: {
					if (oa.a(oa.this) != 0)
						return;
					oa.a(oa.this, true);
					oa.this.performHapticFeedback(0);
					oa.b(oa.this);
					return;
				}
				case 1: {
					if (!oa.c(oa.this).b())
						break;
					oa.d(oa.this).a();
					var3_2 = true;
					if (var3_2) {
						oa.this.invalidate();
						this.sendEmptyMessageDelayed(1, 17);
						return;
					}
					if (oa.a(oa.this) == 2)
						return;
					oa.b(oa.this, false);
				}
				case 2: {
					if (oa.e(oa.this)) {
						oa.f(oa.this);
						return;
					}
					oa.g(oa.this);
					return;
				}
				case 3: {
					if (oa.a(oa.this) != -1) {
						oa.f(oa.this);
						return;
					}
					if (oa.c(oa.this).b()) {
						oa.d(oa.this).a();
						oa.this.invalidate();
						this.sendEmptyMessageDelayed(3, 17);
						return;
					}
					oa.h(oa.this);
					return;
				}
				}

				// 2 sources:

			}
		};
		this.x = new PointF();
		this.y = new PointF();
		this.z = new Random();
		this.o = fan;
		this.i = ViewConfiguration.get((Context) context)
				.getScaledMaximumFlingVelocity();
		Resources resources = context.getResources();
		Bitmap bitmap = ta.a().a(context);
		Bitmap bitmap2 = ta.a().b(context);
		int n = vk.a(context, 108.0f);
		this.b.a(resources.getDisplayMetrics().density);
		this.b.a(bitmap, (float) bitmap.getWidth());
		this.b.a(this.b(bitmap2.getWidth()), 0.0f);
		this.b.b(n);
		this.a.a(
				(float) Math.min((int) bitmap2.getWidth(),
						(int) bitmap2.getHeight()) / 2.0f, bitmap2);
		this.a.a(this.b);
		this.i();
		this.n = new FrameLayout.LayoutParams(-1,
				(int) ((float) n + 1.5f * (float) bitmap2.getHeight()));
		this.setVisibility(8);
	}

	static int a(oa oa1) {
		return oa1.f;
	}

	private void a(float f1) {
		f();
		if (c != null) {
			c.a(f1);
		}
	}

	private void a(MotionEvent motionevent) {
		if (h == null) {
			h = VelocityTracker.obtain();
		}
		h.addMovement(motionevent);
	}

	private boolean a(long l1) {
		long l2 = l1 - u;
		if (l2 >= 0L && l2 <= 300L) {
			u = l1;
			return true;
		} else {
			u = l1;
			return false;
		}
	}

	public static boolean a(Context context) {
		return ol.a() && !SwipeApplication.c;
	}

	static boolean a(oa oa1, boolean flag) {
		oa1.k = flag;
		return flag;
	}

	private float b(float f1) {
		float f3 = od.a(getContext());
		float f2 = f3;
		float f4;
		if (f3 <= 0.0F) {
			if (o.i()) {
				f2 = 0.09F;
			} else {
				f2 = 0.91F;
			}
		}
		f4 = to.p(getContext());
		f3 = f2 * f4;
		if (f3 - f1 / 2.0F < 0.0F) {
			f2 = f1 / 2.0F;
			od.a(getContext(), f2 / f4);
		} else {
			f2 = f3;
			if (f1 / 2.0F + f3 > f4) {
				f1 = f4 - f1 / 2.0F;
				od.a(getContext(), f1 / f4);
				return f1;
			}
		}
		return f2;
	}

	static void b(oa oa1) {
		oa1.p();
	}

	static void b(oa oa1, boolean flag) {
		oa1.setFullScreen(flag);
	}

	static oc c(oa oa1) {
		return oa1.b;
	}

	static ob d(oa oa1) {
		return oa1.a;
	}

	static boolean e(oa oa1) {
		return oa1.r();
	}

	static void f(oa oa1) {
		oa1.s();
	}

	static void g(oa oa1) {
		oa1.v();
	}

	static void h(oa oa1) {
		oa1.w();
	}

	static ValueAnimator i(oa oa1) {
		return oa1.v;
	}

	static PointF j(oa oa1) {
		return oa1.x;
	}

	static Random k(oa oa1) {
		return oa1.z;
	}

	static PointF l(oa oa1) {
		return oa1.y;
	}

	static PointF m(oa oa1) {
		return oa1.d;
	}

	static Handler n(oa oa1) {
		return oa1.t;
	}

	private void a(float paramFloat1, float paramFloat2) {
		this.b.c(paramFloat1, paramFloat2);
		if ((this.c != null)
				&& ((!this.c.i()) || (paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))) {
			this.c.g();
		}
		this.t.sendEmptyMessageDelayed(1, 17L);
	}

	private void m() {
		if (this.h != null) {
			this.h.recycle();
		}
		this.h = null;
	}

	private void n() {
	}

	private boolean o() {
		return false;
	}

	private void p() {
	}

	private void q() {
		od.a(getContext(), this.b.a.x / to.p(getContext()));
	}

	// private boolean r() {
	// if (c == null && f == -1 && !wy.g() && !xa.b() && !RateView.c()
	// && !FriendSector.a() && !Fan.getInstance().getItemLayer().e()
	// && !SwipeApplication.c && !SwipeApplication.d && !is.a) {
	// if (s == null) {
	// s = Long.valueOf(ir.a(getContext(), "key_lucky_apt", 0L));
	// }
	// if (System.currentTimeMillis() >= s.longValue()) {
	// return false;
	// }
	// }
	// return true;
	// }
	private boolean r() {
		if (c == null && f == -1 && !wy.g() && !xa.b() && !RateView.c()
				&& !FriendSector.a() && !Fan.getInstance().getItemLayer().e()
				&& !SwipeApplication.c && !SwipeApplication.d && !is.a) {
			if (s == null) {
				s = Long.valueOf(ir.a(getContext(), "key_lucky_apt", 0L));
			}
			if (System.currentTimeMillis() >= s.longValue()) {
				return false;
			}
		}
		return true;
	}

	private void s() {
		t.removeMessages(2);
		Handler handler = t;
		long l1;
		if (a.j) {
			l1 = 5000L;
		} else {
			l1 = 20000L;
		}
		handler.sendEmptyMessageDelayed(2, l1);
	}

	private void setFullScreen(boolean paramBoolean) {
		if (this.m == null) {
			return;
		}

		if (paramBoolean) {

			try {
				this.n.height = -1;
				this.m.updateViewLayout(this, this.n);
			} catch (Exception localException) {
			}
			this.n.height = ((int) (Math.max(this.b.k,
					Math.abs(this.b.c.y - this.b.a.y)) + 3.0F * this.a.e));
		}
	}

	private void t() {
		if (this.a.j) {
			ja.a().a("Hola拉绳点击跳");
			vk.f(getContext(),
					"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_message");
			ir.g(getContext());
			getController().a(false);
		}
		long l1 = System.currentTimeMillis();
		if (a(l1)) {
			this.s = Long.valueOf(l1 + 86400000L);
			ir.b(getContext(), "key_lucky_apt", this.s.longValue());
		}
	}

	// private void u() {
	// if (this.r == null) {
	// this.r = Long.valueOf(ir.a(getContext(), "key_lucky_rst", 0L));
	// }
	// long l1 = System.currentTimeMillis();
	// if ((l1 >= this.r.longValue()) && (l1 - this.r.longValue() < 21600000L))
	// {
	// s();
	// }
	//
	// this.r = Long.valueOf(l1);
	// ir.b(getContext(), "key_lucky_rst", l1);
	// w();
	//
	// }
	private void u() {
		if (r == null) {
			r = Long.valueOf(ir.a(getContext(), "key_lucky_rst", 0L));
		}
		long l1 = System.currentTimeMillis();
		if (l1 >= r.longValue() && l1 - r.longValue() < 0x1499700L) {
			s();
			return;
		} else {
			r = Long.valueOf(l1);
			ir.b(getContext(), "key_lucky_rst", l1);
			w();
			return;
		}
	}

	// private void v() {
	// if (q == null) {
	// q = Long.valueOf(ir.a(getContext(), "key_lucky_sst", 0L));
	// }
	// long l1 = System.currentTimeMillis();
	// if (l1 >= q.longValue() && l1 - q.longValue() < 0x5265c00L) {
	// u();
	// return;
	// }
	// Fan fan = Fan.getInstance();
	// if (fan != null && (fan.getCurrentTab() instanceof my)) {
	// u();
	// return;
	// }
	// q = Long.valueOf(l1);
	// ir.b(getContext(), "key_lucky_sst", l1);
	// if (v == null) {
	// v = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
	// v.setDuration(500L);
	// v.setRepeatCount(0);
	// v.addUpdateListener(new
	// android.animation.ValueAnimator.AnimatorUpdateListener() {
	//
	// final oa a;
	//
	// public void onAnimationUpdate(ValueAnimator valueanimator) {
	// float f2;
	// float f3;
	// float f4;
	// float f5;
	// float f6;
	// float f7;
	// float f8;
	// float f1;
	// byte byte0 = -1;
	// if (oa.a(a) != -1) {
	// oa.i(a).cancel();
	// return;
	// }
	// Object s = valueanimator.getAnimatedValue();
	// if (((Long) s).floatValue() <= 0.0F) {
	// oa.j(a).set(oa.d(a).c.x, oa.d(a).c.y);
	// PointF pointf = oa.l(a);
	// f1 = oa.d(a).c.x;
	// int i1 = vk.a(a.getContext(), 50F);
	//
	// if (oa.k(a).nextInt(2) % 2 != 0) {
	// byte0 = 1;
	// }
	// pointf.set(f1 - (float) (byte0 * i1), oa.d(a).c.y
	// + (float) vk.a(a.getContext(), 3F));
	// }
	// f1 = oa.l(a).x;
	// f2 = oa.j(a).x;
	// f3 = ((Long) s).floatValue();
	// f4 = oa.j(a).x;
	// f5 = oa.l(a).y;
	// f6 = oa.j(a).y;
	// f7 = ((Long) s).floatValue();
	// f8 = oa.j(a).y;
	// oa.d(a)
	// .a((f1 - f2) * f3 + f4, f7 * (f5 - f6) + f8,
	// oa.m(a));
	// oa.c(a).b(oa.m(a).x, oa.m(a).y);
	// oa.d(a).a();
	// a.invalidate();
	// }
	//
	// {
	// a = oa.this;
	// // super();
	// }
	// });
	// v.addListener(new android.animation.Animator.AnimatorListener() {
	//
	// final oa a;
	//
	// public void onAnimationCancel(Animator animator) {
	// oa.f(a);
	// }
	//
	// public void onAnimationEnd(Animator animator) {
	// oa.c(a).c(0.0F, 0.0F);
	// oa.n(a).sendEmptyMessageDelayed(3, 17L);
	// }
	//
	// public void onAnimationRepeat(Animator animator) {
	// }
	//
	// public void onAnimationStart(Animator animator) {
	// }
	//
	// {
	// a = oa.this;
	// // super();
	// }
	// });
	// }
	// v.start();
	// }
	private void v() {

		if (q == null) {
			q = Long.valueOf(ir.a(getContext(), "key_lucky_sst", 0L));
		}
		long l1 = System.currentTimeMillis();
		if (l1 >= q.longValue() && l1 - q.longValue() < 0x5265c00L) {
			u();
			return;
		}
		Fan fan = Fan.getInstance();
		if (fan != null && (fan.getCurrentTab() instanceof my)) {
			u();
			return;
		}
		q = Long.valueOf(l1);
		ir.b(getContext(), "key_lucky_sst", l1);
		if (v == null) {
			v = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
			v.setDuration(500L);
			v.setRepeatCount(0);
			v.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				final oa a;

				public void onAnimationUpdate(ValueAnimator valueanimator) {
					float f2;
					float f3;
					float f4;
					float f5;
					float f6;
					float f7;
					float f8;
					float f1;
					byte byte0 = -1;
					if (oa.a(a) != -1) {
						oa.i(a).cancel();
						return;
					}
					float object = (Float) valueanimator.getAnimatedValue();
					if (object <= 0.0F) {
						oa.j(a).set(oa.d(a).c.x, oa.d(a).c.y);
						PointF pointf = oa.l(a);
						f1 = oa.d(a).c.x;
						int i1 = vk.a(a.getContext(), 50F);

						if (oa.k(a).nextInt(2) % 2 != 0) {
							byte0 = 1;
						}
						pointf.set(f1 - (float) (byte0 * i1), oa.d(a).c.y
								+ (float) vk.a(a.getContext(), 3F));
					}
					f1 = oa.l(a).x;
					f2 = oa.j(a).x;
					f3 = object;
					f4 = oa.j(a).x;
					f5 = oa.l(a).y;
					f6 = oa.j(a).y;
					f7 = object;
					f8 = oa.j(a).y;
					oa.d(a)
							.a((f1 - f2) * f3 + f4, f7 * (f5 - f6) + f8,
									oa.m(a));
					oa.c(a).b(oa.m(a).x, oa.m(a).y);
					oa.d(a).a();
					a.invalidate();
				}

				{
					a = oa.this;
					// super();
				}
			});
			v.addListener(new android.animation.Animator.AnimatorListener() {

				final oa a;

				public void onAnimationCancel(Animator animator) {
					oa.f(a);
				}

				public void onAnimationEnd(Animator animator) {
					oa.c(a).c(0.0F, 0.0F);
					oa.n(a).sendEmptyMessageDelayed(3, 17L);
				}

				public void onAnimationRepeat(Animator animator) {
				}

				public void onAnimationStart(Animator animator) {
				}

				{
					a = oa.this;
					// super();
				}
			});
		}
		v.start();
	}

	// private void w() {
	// if (this.w == null) {
	// this.w = ValueAnimator
	// .ofFloat((float[]) new float[] { 0.0f, 1.0f });
	// this.w.setDuration(1000);
	// this.w.setRepeatCount(0);
	// this.w.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new
	// ValueAnimator.AnimatorUpdateListener() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void onAnimationUpdate(ValueAnimator valueAnimator) {
	// Float f = (Float) valueAnimator.getAnimatedValue();
	// if (oa.d((oa) oa.this).i != null) {
	// oa.this.a.b(180.0f * f.floatValue());
	// } else {
	// oa.this.a.b(360.0f * f.floatValue());
	// }
	// oa.this.invalidate();
	// }
	// });
	// this.w.addListener((Animator.AnimatorListener) new
	// Animator.AnimatorListener() {
	//
	// public void onAnimationCancel(Animator animator) {
	// }
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void onAnimationEnd(Animator animator) {
	// if (oa.d((oa) oa.this).i != null) {
	// ob ob = oa.this.a;
	// boolean bl = !oa.d((oa) oa.this).j;
	// ob.j = bl;
	// }
	// oa.this.s();
	// }
	//
	// public void onAnimationRepeat(Animator animator) {
	// }
	//
	// public void onAnimationStart(Animator animator) {
	// }
	// });
	// }
	// this.w.start();
	// }
	private void w() {
		if (w == null) {
			w = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
			w.setDuration(1000L);
			w.setRepeatCount(0);
			w.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				final oa a;

				public void onAnimationUpdate(ValueAnimator valueanimator) {
					float f = (Float) valueanimator.getAnimatedValue();
					if (oa.d(a).i != null) {
						oa.this.a.b(180.0f * f);
					} else {
						oa.this.a.b(360.0f * f);
					}
					a.invalidate();
				}

				{
					a = oa.this;
					// super();
				}
			});
			w.addListener(new android.animation.Animator.AnimatorListener() {

				final oa a;

				public void onAnimationCancel(Animator animator) {
				}

				public void onAnimationEnd(Animator animator) {
					if (oa.d(a).i != null) {
						ob ob = oa.d(a);
						boolean flag;
						if (!oa.d(a).j) {
							flag = true;
						} else {
							flag = false;
						}
						ob.j = flag;
					}
					oa.f(a);
				}

				public void onAnimationRepeat(Animator animator) {
				}

				public void onAnimationStart(Animator animator) {
				}

				{
					a = oa.this;
					// super();
				}
			});
		}
		w.start();
	}

	public void a() {
		try {
			this.m.removeView(this);
			this.m = null;
			return;
		} catch (Exception localException) {
			
				Log.e("Swipe.LuckyView", "Failed to detach", localException);
			
		}
	}

	public void a(ViewGroup paramViewGroup) {
		try {
			paramViewGroup.addView(this, this.n);
			this.m = paramViewGroup;
			return;
		} catch (Exception localException) {
			
				Log.e("Swipe.LuckyView", "Failed to attach", localException);
			
		}
	}

	public boolean b() {
		if ((this.m != null) && (getParent() == this.m)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public boolean c() {
		if ((b()) && (getVisibility() == 0)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public void d() {
		setVisibility(0);
		if (this.p) {
			s();
		}
		this.p = true;
	}

	public void e() {
		this.t.removeCallbacksAndMessages(null);
		setVisibility(8);
	}

	public void f() {
		if ((this.m != null) && (this.c == null)) {
			this.c = new nw(getContext(), this);
			this.c.setOnClickListener(this);
			int i1 = this.m.indexOfChild(this);
			this.m.addView(this.c, i1, new FrameLayout.LayoutParams(-1, -1));
		}
	}

	public void g() {
		if ((this.m != null) && (this.c != null)) {
			this.m.removeView(this.c);
			this.c = null;
		}
	}

	public Fan getController() {
		return this.o;
	}

	public void h() {
		this.b.c(b(2.0F * this.a.e));
		this.a.a();
		invalidate();
	}

	public void i() {
		this.a.a(1.0F);
		invalidate();
	}

	public boolean j() {
		if (this.c != null) {
			g();
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public void k() {
		this.t.removeMessages(2);
		this.t.sendEmptyMessageDelayed(2, 500L);
		if ((ir.f(getContext())) && (!vk.b(getContext(), "com.hola.launcher"))) {
			this.a.a(ta.a().c(getContext()));
		}
	}

	public boolean l() {
		return this.a.j;
	}

	public void onAttachedToWindow() {
		super.onAttachedToWindow();
	}

	public void onClick(View paramView) {
		if (this.c == paramView) {
		}
	}

	protected void onConfigurationChanged(Configuration paramConfiguration) {
		super.onConfigurationChanged(paramConfiguration);
		h();
	}

	public void onDetachedFromWindow() {
		super.onDetachedFromWindow();
	}

	protected void onDraw(Canvas paramCanvas) {
		super.onDraw(paramCanvas);
		this.b.a(paramCanvas);
		this.a.a(paramCanvas);
	}

	public boolean onTouchEvent(MotionEvent motionEvent) {
		boolean bl = true;
		if (this.c != null && this.c.h()) {
			return false;
		}
		float f = motionEvent.getX();
		float f2 = motionEvent.getY();
		this.a(motionEvent);
		switch (255 & motionEvent.getAction()) {
		case 0: {
			this.f = -1;
			this.k = false;
			this.l = false;
			if (this.l) {
				this.n();
				break;
			}
			if (this.a.a(f, f2)) {
				this.b.a();
				this.f = 0;
				if (this.o()) {
					this.t.sendEmptyMessageDelayed(0, (long) j);
				}
				this.invalidate();
			}
			this.e.set(f, f2);
			break;
		}
		case 2: {
			if (this.l || this.k)
				break;
			if (this.f == 0) {
				float f3 = f - this.e.x;
				float f4 = f2 - this.e.y;
				this.h.computeCurrentVelocity(1000, (float) this.i);
				float f5 = this.h.getXVelocity();
				float f6 = this.h.getYVelocity();
				if (f6 > 0.0f && Math.abs((float) f6) > Math.abs((float) f5)
						&& f4 > (float) this.g) {
					this.f = 2;
					this.e.set(f, f2);
					this.t.removeMessages(0);
					this.setFullScreen(bl);
					break;
				}
				if (Math.abs((float) f5) <= Math.abs((float) f6)
						|| Math.abs((float) f3) <= (float) this.g)
					break;
				// this.f = bl;
				this.e.set(f, f2);
				this.t.removeMessages(0);
				break;
			}
			if (this.f == 2) {
				this.a.a(f, f2, this.d);
				this.b.b(this.d.x, this.d.y);
				this.a.a();
				this.a(this.b.d());
				this.invalidate();
				break;
			}
			/*
			 * if (this.f != bl) break;
			 */
			this.b.c(Math.max((float) Math.min(
					(float) ((float) this.getWidth() - this.a.e),
					(float) this.e.x), (float) this.a.e));
			this.e.set(f, f2);
			this.a.a();
			this.invalidate();
			break;
		}
		case 1:
		case 3: {
			if (this.l)
				break;
			this.t.removeMessages(0);
			if (this.f == 0) {
				this.h.computeCurrentVelocity(1000, (float) this.i);
				this.a(this.h.getXVelocity(),
						-900.0f
								* Math.min(
										(float) 1.0f,
										(float) (this.getResources()
												.getDisplayMetrics().density / 1.5f)));
				this.f = -1;
				if (!this.k) {
					this.t();
				}
			} else if (/* this.f == */bl) {
				this.a(0.0f, 0.0f);
				this.q();
				this.f = -1;
			} else if (this.f == 2) {
				if (this.k) {
					this.a(0.0f, 0.0f);
				} else {
					this.h.computeCurrentVelocity(1000, (float) this.i);
					this.a(this.h.getXVelocity(), this.h.getYVelocity());
				}
				this.f = -1;
			} else {
				this.f = -1;
			}
			this.m();
			this.invalidate();
		}
		}
		if (this.f == -1)
			return false;
		return bl;
	}
}
