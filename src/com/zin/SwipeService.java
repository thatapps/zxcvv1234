package com.lazyswipe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.widget.PopupWindow;

//import com.google.android.gms.internal.ex;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.ui.MainActivity;
import com.lazyswipe.widget.FixedTip;
import com.lazyswipe.zev.R;
import com.main.io;
import com.main.ip;
import com.main.iq;
import com.main.ir;
import com.main.iu;
import com.main.iv;
import com.main.iz;
import com.main.ja;
import com.main.jb;
import com.main.jc;
import com.main.jd;
import com.main.js;
import com.main.jw;
import com.main.jx;
import com.main.lr;
import com.main.oe;
import com.main.oh;
import com.main.pd;
import com.main.pi;
import com.main.pq;
import com.main.pr;
import com.main.pv;
import com.main.qb;
import com.main.tj;
import com.main.tn;
import com.main.ts;
import com.main.vj;
import com.main.vk;
import com.main.wg;

@SuppressWarnings("unchecked")
public class SwipeService extends Service implements Handler.Callback,
		PopupWindow.OnDismissListener, ip, iq, jx, pr {
	public static long a;
	private static final HashMap i;
	private static Notification j;
	private static SwipeService k;
	public iu b;
	public Handler c;
	public boolean d;
	boolean e;
	public Map f;
	public Map g;
	public iz h;
	private io l;
	private long m;
	private boolean n;
	private boolean o;
	private iv p;
	private boolean q;
	private boolean r;
	private boolean s;
	private jc t;
	private ComponentName u;

	public SwipeService() {
		d = true;
		f = new LinkedHashMap(0);
		g = new HashMap(0);
		s = false;
	}

	static {
		i = new HashMap();
		HashSet hashset = new HashSet();
		hashset.add(new ComponentName("com.textra",
				"com.mplus.lib.ui.convo.ConvoActivity"));
		hashset.add(new ComponentName("com.whatsapp",
				"com.whatsapp.Conversation"));
		hashset.add(new ComponentName("com.vkontakte.android",
				"com.vkontakte.android.FragmentWrapperActivity"));
		hashset.add(new ComponentName("ch.threema.app",
				"ch.threema.app.activities.ComposeMessageActivity"));
		hashset.add(new ComponentName("org.telegram.messenger",
				"org.telegram.ui.LaunchActivity"));
		hashset.add(new ComponentName("com.bsb.hike",
				"com.bsb.hike.ui.ChatThread"));
		i.put("com.lazyswipe.zev", hashset);
		hashset = new HashSet();
		hashset.add(new ComponentName("com.android.mms",
				"com.android.mms.ui.ConversationComposer"));
		i.put("samsung", hashset);
	}

	public static Intent a(Context paramContext, boolean paramBoolean) {
		return d(paramContext).putExtra("param_2", paramBoolean);
	}

	public static Handler a() {
		if (k != null) {
			return k.c;
		} else {
			return null;
		}
	}

	public static void a(Context paramContext) {
		if ((ir.L(paramContext)) && (!d())) {
			Bundle localBundle = new Bundle(1);
			localBundle.putInt("operation", 1);
			a(paramContext, localBundle);
		}
	}

	public static void a(Context paramContext, int paramInt) {
		paramContext.startService(new Intent(paramContext, SwipeService.class)
				.putExtra("param_1", paramInt).putExtra("operation", 10));
	}

	public static void a(Context paramContext, Bundle paramBundle) {
		paramContext.startService(new Intent(paramContext, SwipeService.class)
				.replaceExtras(paramBundle));
	}

	public static void a(Context context, Map map, Map map1) {
		map.clear();
		map1.clear();
		Cursor cursor;

		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
		cursor = contentresolver.query(qb.a, new String[] { "address", "date",
				"body", "thread_id" }, "type=1 AND read=0", null,
				"address, date DESC");
		Object obj;
		Object obj1;
		Object obj3 = null;
		obj = null;
		obj1 = null;
		// _L8:
		if (cursor.moveToNext()) {
/*
			if (cursor != null) {
				cursor.close();
			}
			return;
			// context;
			// map = null;

		} else {*/
			Object obj2 = cursor.getString(0);
			if (((String) (obj2)).equals(obj1)) {
				Object obj4 = null;
				obj2 = obj1;
				obj1 = obj4;
				ts ts1 = (ts) map.get(obj);
				obj3 = ts1;
				if (ts1 != null) {
					// break MISSING_BLOCK_LABEL_195;
				}
				obj3 = new ts(15);
				map.put(obj, obj3);
				map1.put(obj, cursor.getString(0));
				((ts) (obj3)).offer(pi.a(cursor, ((pv) (obj)),
						((String) (obj1))));
				obj1 = obj2;

			} else {

				obj = tj.a(contentresolver, ((String) (obj2)));
				if (obj == null) {

					if (obj == null) {
						// break MISSING_BLOCK_LABEL_309;
					}
					obj = ((pv) (obj)).d;

				} else {

					if (pv.a(context).contains(obj)) {

						int i1 = pv.a(context).indexOf(obj);
						if (i1 < 0) {
							obj1 = null;
							ts ts1 = (ts) map.get(obj);
							obj3 = ts1;
							if (ts1 != null) {
								// break MISSING_BLOCK_LABEL_195;
							}
							obj3 = new ts(15);
							map.put(obj, obj3);
							map1.put(obj, cursor.getString(0));
							((ts) (obj3)).offer(pi.a(cursor, ((pv) (obj)),
									((String) (obj1))));
							obj1 = obj2;
							obj = null;
							obj3 = pv.a;
							obj1 = obj;
							obj = obj3;

						} else {

							obj = (pv) pv.a(context).get(i1);
							obj1 = null;

						}

					} else {
						if (obj == null) {
							// break MISSING_BLOCK_LABEL_309;
						}
						obj = ((pv) (obj)).d;

					}

				}
			}

		}
		map = (Map) cursor;
		if (cursor != null) {
			cursor.close();
		}

		// context;

	}

	public static void a(String string) {
		if (k == null || SwipeApplication.c || Fan.j()
				|| vk.a((Object) jw.f(), (Object) string)) {
			return;
		}
		SwipeService.k.d = false;
		k.u();
	}

	private void a(js js1, ComponentName componentname) {
		if (js1 != null && componentname != null) {
			if (o) {
				q = js1.a.b(componentname);
				if (!q) {
					h.e();
					return;
				}
			}
			if (!h.l()) {
				if (oe.b(componentname.getPackageName())) {
					h.e();
					return;
				}
				if (s) {
					h.e();
					return;
				}
			}
			if (r && "2".equals(ir.M(this))) {
				h.e();
				return;
			}
			if (!Fan.j()) {
				h.c();
				return;
			}
		}
	}

	public static void a(pv parampv) {
		pv.a(parampv);
	}

	public static void b() {
		if (k != null) {
			if (k.b != null) {
				k.b.dispatchChange(true);
				return;
			}
			if (!k.e) {
				k.c.sendEmptyMessage(3);
				return;
			}
		}
	}

	public static void b(Context paramContext) {
		paramContext.startService(new Intent(paramContext, SwipeService.class)
				.putExtra("operation", 11));
	}

	private boolean b(String paramString) {
		Iterator localIterator1 = ((HashSet) i.get("com.lazyswipe.zev")).iterator();
		boolean bool;
		bool = false;
		while (localIterator1.hasNext()) {
			if (((ComponentName) localIterator1.next()).getPackageName()
					.equals(paramString)) {
				bool = true;
			}
		}

		HashSet localHashSet = (HashSet) i.get(Build.MANUFACTURER);
		if (localHashSet != null) {
			Iterator localIterator2 = localHashSet.iterator();

			if (localIterator2.hasNext()) {
				if (((ComponentName) localIterator2.next()).getPackageName()
						.equals(paramString)) {
					bool = true;
					// break;
				}

			}
		}

		return bool;
	}

	public static void c() {
		if (k == null) {
			return;
		} else {
			k.h.h();
			k.f.clear();
			k.g.clear();
			return;
		}
	}

	public static void c(Context paramContext) {
		a(paramContext, null);
	}

	private boolean c(ComponentName paramComponentName) {
		boolean bool;
		if (((HashSet) i.get("com.lazyswipe")).contains(paramComponentName)) {
			bool = true;
		}

		HashSet localHashSet = (HashSet) i.get(Build.MANUFACTURER);
		if ((localHashSet != null)
				&& (localHashSet.contains(paramComponentName))) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}

	public static Intent d(Context paramContext) {
		return new Intent(paramContext, SwipeService.class).putExtra("param_1",
				true).putExtra("operation", 1);
	}

	public static boolean d() {
		return k != null;
	}

	public static PendingIntent e(Context paramContext) {
		return PendingIntent.getService(paramContext, 1, d(paramContext), 0);
	}

	public static void e() {
		if ((k == null) || (Fan.j())) {
		}

		k.d = true;
		k.h.h();

	}

	@SuppressWarnings("deprecation")
	// static Notification f(Context paramContext) {
	// PendingIntent localPendingIntent;
	// if (j == null) {
	// j = new Notification();
	// j.flags = 64;
	// Intent localIntent = new Intent(
	// paramContext.getApplicationContext(), MainActivity.class)
	// .setFlags(268435456);
	// localPendingIntent = PendingIntent.getActivity(
	// paramContext.getApplicationContext(), 0, localIntent,
	// 134217728);
	// if (Build.VERSION.SDK_INT < 18) {
	// j.contentIntent = localPendingIntent;
	// }
	// j.icon = R.mipmap.ic_launcher;
	// j.setLatestEventInfo(paramContext.getApplicationContext(),
	// paramContext.getString(R.string.notification_title),
	// paramContext.getString(R.string.notification_tip),
	// localPendingIntent);
	// }
	//
	// return j;
	//
	// }
	static Notification f(Context context) {
		if (j == null) {
			j = new Notification();
			j.flags = 64;
			Object obj = (new Intent(context.getApplicationContext(),
					com.lazyswipe.ui.MainActivity.class)).setFlags(0x10000000);
			obj = PendingIntent.getActivity(context.getApplicationContext(), 0,
					((Intent) (obj)), 0x8000000);
			if (android.os.Build.VERSION.SDK_INT >= 18) {
				j.icon = 0x7f030000;
				j.setLatestEventInfo(context.getApplicationContext(),
						context.getString(0x7f0f0054),
						context.getString(0x7f0f0053), ((PendingIntent) (obj)));
			} else {
				j.contentIntent = ((PendingIntent) (obj));
			}
		}
		return j;
	}

	public static void f() {
		if ((k == null) || (Fan.j())) {
		}

		if (k.h != null) {
			k.h.i();
		}

	}

	private void f(boolean paramBoolean) {
		if (paramBoolean) {
			if (this.l == null) {
				this.l = new io(this);
				this.l.d();
			}
			this.l.setOnFullScreenChangedListener(this);
		}

		if (this.l != null) {
			this.l.setOnFullScreenChangedListener(null);
			if (!this.l.g()) {
				this.c.removeMessages(6);
				this.c.removeMessages(5);
				this.l.e();
				this.l = null;
			}

		}
	}

	public static boolean g() {
		return k != null && k.e;
	}

	static boolean g(Context paramContext) {
		return ((SwipeApplication) paramContext.getApplicationContext()).a();
	}

	public static boolean h() {
		return k != null && k.l != null && k.l.f();
	}

	public static void i() {
		if ((k != null) && (g(k))) {
			k.c.sendEmptyMessageDelayed(14, 15000L);
		}
	}

	public static void j() {
		if (k != null) {
			k.c.removeMessages(14);
		}
	}

	public static void k() {
		if (k == null) {
		}

		vj.a("Swipe.Service", "Reset Flurry session");
		if (!ir.H(k)) {
			ir.G(k);
			jd.a(k);
		}
		jb.d(k);
		k.c.sendEmptyMessageDelayed(1, 5500L);
	}

	public static boolean l() {
		return k != null && k.f.size() >= 0;
	}

	public static Map m() {
		if (k != null) {
			return k.g;
		} else {
			return null;
		}
	}

	public static Map n() {
		if (k != null) {
			return k.f;
		} else {
			return null;
		}
	}

	public static SwipeService o() {
		return k;
	}

	public static void q() {
		if (k != null) {
			k.r();
		}
	}

	public static void s() {
		if ((o() != null) && (o().h != null)) {
			o().h.e();
		}
	}

	private void v() {
		if ((this.h.l()) || (SwipeApplication.e().b() == null)
				|| (this.u == null)) {
			this.h.c();
		}

		a(SwipeApplication.e().b(), this.u);

	}

	private void w() {
		if (!this.n) {
			c(getApplicationContext());
		}
	}

	private void x() {
		a(((SwipeApplication) getApplication()).b(), this.u);
	}

	// public void a(ComponentName paramComponentName) {
	// this.u = paramComponentName;
	// js localjs = ((SwipeApplication) getApplication()).b();
	// localjs.b(paramComponentName);
	// if (!this.h.l()) {
	// if ((this.o) || (!oe.d())) {
	// a(localjs, paramComponentName);
	// String str = paramComponentName.getPackageName();
	// if (oe.b(str)) {
	// Message localMessage = this.c.obtainMessage(11, str);
	// this.c.sendMessageDelayed(localMessage, 500L);
	// }
	// }
	// if (Build.VERSION.SDK_INT >= 21) {
	// this.c.sendEmptyMessage(7);
	// }
	// FixedTip.c();
	// }
	//
	// if (Build.VERSION.SDK_INT < 18) {
	// pq.c(paramComponentName.getPackageName());
	// }
	//
	// a(localjs, paramComponentName);
	// return;
	// }
	public void a(ComponentName componentname) {
		u = componentname;
		Object obj = ((SwipeApplication) getApplication()).b();
		((js) (obj)).b(componentname);
		if (!h.l()) {
			if (o || !oe.d()) {
				a(((js) (obj)), componentname);
				obj = componentname.getPackageName();
				if (oe.b(((String) (obj)))) {
					obj = c.obtainMessage(11, obj);
					c.sendMessageDelayed(((Message) (obj)), 500L);
				}
			}
			if (android.os.Build.VERSION.SDK_INT >= 21) {
				c.sendEmptyMessage(7);
			}
			FixedTip.c();
		} else {
			a(((js) (obj)), componentname);
		}
		if (android.os.Build.VERSION.SDK_INT < 18) {
			pq.c(componentname.getPackageName());
		}
	}

	public void a(lr lr1) {
		if (l() || pq.c()) {
			String s1;
			if (!d) {
				s1 = "recentlyUsed";
			} else {
				s1 = null;
			}
			lr1.f = s1;
		}
		if (NewGuide.j()) {
			lr1.f = "mostUsed";
		}
		if (a() != null) {
			a().removeMessages(15);
		}
		if (!Fan.n()) {
			h.e();
		}
		Fan.a(getApplicationContext(), this);
		d = true;
	}

	public void a(boolean paramBoolean) {
		this.r = paramBoolean;
		if (paramBoolean) {
			this.h.e();
		}

		if (this.h.l()) {
			this.h.c();
		} else {
			v();
		}

	}

	public void a(boolean paramBoolean1, boolean paramBoolean2) {
		a(Fan.a.a(paramBoolean1, paramBoolean2));
	}

	public void b(ComponentName paramComponentName) {
		if (((paramComponentName.getPackageName().equals("FORCE")) && (paramComponentName
				.getClassName().equals("FORCE_DISMISS")))
				|| ((c(paramComponentName)) && (this.l != null) && (this.l.f()))) {
			jw.a(true);
			this.c.sendEmptyMessage(8);
		}

		jw.a(false);
		if (this.l != null) {
			this.c.sendEmptyMessage(7);
		}
		return;
	}

	public void b(boolean flag) {
		if (!h.l()) {
			if (flag) {
				h.e();
				if (!pq.a()) {
					Object obj = jw.b();
					if (obj != null) {
						if (android.os.Build.VERSION.SDK_INT <= 19) {
							((jw) (obj)).g();
							return;
						}
						obj = ((jw) (obj)).c(true);
						if (obj != null
								&& b(((ComponentName) (obj)).getPackageName())) {
							l.e();
							m = System.currentTimeMillis();
							return;
						}
					}
				}
			} else {
				v();
				return;
			}
		}
	}

	public void c(boolean bl) {
		this.e = bl;
		if (bl) {
			if (SwipeApplication.c) {
				SwipeService.a((Context) this, SwipeService.d((Context) this)
						.getExtras());
			} else if (SwipeApplication.d
					|| System.currentTimeMillis() - a <= 120000
					&& ir.B((Context) this)) {
				SwipeApplication.d = true;
				ir.f((Context) this, 102);
				SwipeService.a((Context) this, SwipeService.d((Context) this)
						.getExtras());
			}
			a = 0;
			if (!pq.a())
				return;
			{
				this.e(false);
				return;
			}
		} else {
			ir.a((Context) this, System.currentTimeMillis());
			if (!pq.a())
				return;
			{
				this.e(true);
				return;
			}
		}
	}

	public void d(boolean paramBoolean) {
		a(paramBoolean, false);
	}

	public void e(boolean paramBoolean) {
		if (paramBoolean) {
			if (this.l == null) {
				this.l = new io(this);
				this.l.d();
			}
			this.l.setOnSoftKeyboardChangedListener(this);
		}

		if (this.l != null) {
			this.l.setOnSoftKeyboardChangedListener(null);
			if (!this.l.g()) {
				this.c.removeMessages(6);
				this.c.removeMessages(5);
				this.l.e();
				this.l = null;
			}
		}

	}

	public boolean handleMessage(Message var1) {
		StringBuilder stringbuilder;
		boolean flag;
		try {
			switch (var1.what) {
			case 2:
				vj.a("Swipe.Service", "Start a new Flurry session");
				ja.a().a(k);
				jb.b = 0L;
				return true;

			case 3:
				if (b == null) {

					b = new iu(this, c);
					b.a();
				}
				return true;
			case 4:
				if (b != null) {

					b.b();
				}
				return true;

			default:
				break;
			case 5:
				this.l.b();
				return true;
			case 6:
				try {
					l.c();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					stringbuilder = (new StringBuilder())
							.append("Exception in handleMessage [Screen monitor is null? ");
					if (l == null) {
						flag = true;
					} else {
						flag = false;
					}
					Log.w("Swipe.Service",
							stringbuilder.append(flag).append("]").toString(),
							exception);
					return true;
				}
				return true;
			case 7:
				if (android.os.Build.VERSION.SDK_INT >= 21
						&& System.currentTimeMillis() - m <= 200L || l == null) {
					this.l.d();
					return true;
				}
				break;
			case 8:
				this.l.e();
				return true;
			case 9:
				this.startService(new Intent(this, SwipeServicePhantom.class));
				return true;
			case 10:
				if (var1.obj instanceof String) {
					oh.a((String) ((String) var1.obj));
					return true;
				}
				break;
			case 11:
				if (g(this)) {
					this.startActivity((new Intent(this, MainActivity.class))
							.addFlags(268435456).addFlags(67108864)
							.addFlags(8388608).putExtra("finish", true));
					return true;
				}
				break;
			case 12:
				Fan.q();
				return true;
			}

			return true;
		} catch (Throwable var4) {
			StringBuilder var3 = (new StringBuilder())
					.append("Exception in handleMessage [Screen monitor is null? ");
			boolean var2;
			if (this.i == null) {
				var2 = true;
			} else {
				var2 = false;
			}

			Log.w("Swipe.Service", var3.append(var2).append("]").toString(),
					var4);
			return true;
		}
	}

	public IBinder onBind(Intent paramIntent) {
		return null;
	}

	public void onConfigurationChanged(Configuration paramConfiguration) {
		super.onConfigurationChanged(paramConfiguration);
		this.h.a(paramConfiguration);
	}

	public void onCreate() {
		boolean flag = true;
		super.onCreate();
		h = new iz(this);
		t = new jc();
		ja ja1;
		t.a(this);
		if (!ir.q(this)) {
			jc.d(this);
		}
		k = this;
		c = new Handler(this);
		e = pq.a(this, this);
		vj.a("Swipe.Service", "SwipeService created");
		if (tn.a) {

			try {
				startForeground(1, f(this));
			} catch (Throwable throwable) {
			}
			if (android.os.Build.VERSION.SDK_INT >= 18) {
				startService(new Intent(this,
						com.lazyswipe.SwipeServicePhantom.class));
			}
		}
		if (ir.L(this)) {
			h.c();
			t();
		}
		jw.a(getApplicationContext(), this);
		o = jw.c();
		if (o) {
			flag = false;
		}
		q = flag;
		ja1 = ja.a();
		ja1.a(5000L);
		ja1.c(this);
		ja1.a(this);
		p = new iv(this);
		p.a();
		b = new iu(this, c);
		b.a();
	}

	public void onDestroy() {
		super.onDestroy();
		t.b(this);
		pq.a(this, (CharSequence) null);
		vj.a("Swipe.Service", "SwipeService destroyed");
		if (tn.a) {
			try {
				stopForeground(true);
			} catch (Throwable throwable) {
			}
		}
		p.b();
		if (b != null) {
			b.b();
		}
		h.e();
		h.a();
		if (l != null && l.a()) {
			l.e();
		}
		jw.a();
		c.removeCallbacksAndMessages(null);
		ja.a().b(this);
		w();
		k = null;
	}

	public void onDismiss() {
		v();
		if (this.c != null) {
			this.c.sendEmptyMessageDelayed(15, 2000L);
		}
	}

	/*
	 * public int onStartCommand(Intent var1, int var2, int var3) { if(var1 ==
	 * null) { return 1; } else { var2 = var1.getIntExtra("operation", 0);
	 * vj.a("Swipe.Service", "onStartCommand " + var2); boolean var4;
	 * switch(var2) { case 1: this.n = false; this.h.c(); this.o();
	 * if(var1.getBooleanExtra("param_1", false)) { if(var1.hasExtra("param_2"))
	 * { var4 = var1.getBooleanExtra("param_2", false); } else { var4 =
	 * ir.E(this); }
	 * 
	 * this.a(var4, var1.getBooleanExtra("suppress_notifications", false)); }
	 * break; case 2: this.n = true; this.stopSelf(); return 2; case 3: case 4:
	 * default: break; case 5: var2 = var1.getIntExtra("type", -1); if(var2 !=
	 * -1) { String var6 = var1.getStringExtra("param_1"); var4
	 * =ir.b((String)var6); if(var2 == 0) { this.f(var4); ir.c(this,
	 * "full_screen_detector", var4); jw.b().e(); } else if(var2 == 1) {
	 * this.e(var4); ir.c(this, "soft_keyboard_detector", var4); }
	 * 
	 * o = ir.a(var6); jw.b(o); a(((SwipeApplication)getApplication()).b(),
	 * vk.c(this)); } break; case 6: this.h.a(var1.getIntExtra("param_1", 0),
	 * var1.getBooleanExtra("param_2", false)); break; case 7: var4 =
	 * var1.getBooleanExtra("param_1", false); this.h.a(var4); break; case 8:
	 * this.h.f(); break; case 9: this.s(); break; case 10: var2 =
	 * var1.getIntExtra("param_1", -1); if(var2 >= 0) { ir.g(this, var2); Bundle
	 * var5 = a((Context)this, true).getExtras();
	 * var5.putBoolean("suppress_notifications", true); a((Context)this,
	 * (Bundle)var5); } break; case 11: // this.c.removeMessages(14);
	 * 
	 * return 1; } }
	 */
	// public int onStartCommand(Intent var1_1, int var2_2, int var3_3) {
	// if (var1_1 == null) {
	// return 1;
	// }
	//
	// int var4_4 = var1_1.getIntExtra("operation", 0);
	// vj.a("Swipe.Service", "onStartCommand " + var4_4);
	// switch (var4_4) {
	// case 1: {
	// this.n = false;
	// this.h.c();
	// this.t();
	// if (var1_1.getBooleanExtra("param_1", false) == false)
	// return 1;
	// boolean var11_5 = var1_1.hasExtra("param_2") != false ? var1_1
	// .getBooleanExtra("param_2", false) : ir.E((Context) this);
	// this.a(var11_5,
	// var1_1.getBooleanExtra("suppress_notifications", false));
	// break;
	// }
	// case 2: {
	// this.n = true;
	// this.stopSelf();
	// return 2;
	// }
	// case 5: {
	// int var8_6 = var1_1.getIntExtra("type", -1);
	// if (var8_6 == -1)
	// return 1;
	// String var9_7 = var1_1.getStringExtra("param_1");
	// boolean var10_8 = ir.b(var9_7);
	// if (var8_6 == 0) {
	// this.f(var10_8);
	// ir.c((Context) this, "full_screen_detector", var10_8);
	// jw.b().e();
	// } else if (var8_6 == 1) {
	// this.e(var10_8);
	// ir.c((Context) this, "soft_keyboard_detector", var10_8);
	// }
	// this.o = ir.a(var9_7);
	// jw.b(this.o);
	// this.a(((SwipeApplication) this.getApplication()).b(),
	// vk.c((Context) this));
	// break;
	// }
	// case 6: {
	// this.h.a(var1_1.getIntExtra("param_1", 0),
	// var1_1.getBooleanExtra("param_2", false));
	// break;
	// }
	// case 7: {
	// Boolean var7_9 = var1_1.getBooleanExtra("param_1", false);
	// this.h.a(var7_9);
	// break;
	// }
	// case 8: {
	// this.h.f();
	// break;
	// }
	// case 9: {
	// this.x();
	// break;
	// }
	// case 10: {
	// int var5_10 = var1_1.getIntExtra("param_1", -1);
	// if (var5_10 < 0)
	// return 1;
	// ir.g((Context) this, var5_10);
	// Bundle var6_11 = SwipeService.a((Context) this, true).getExtras();
	// var6_11.putBoolean("suppress_notifications", true);
	// SwipeService.a((Context) this, var6_11);
	// }
	// // lbl55: // 8 sources:
	// default: {
	// return 1;
	// }
	// case 11:
	//
	// this.c.removeMessages(14);
	// }
	// return 1;
	// }
	// public int onStartCommand(Intent var1_1, int var2_2, int var3_3) {
	// if (var1_1 == null) {
	// return 1;
	// }
	//
	// int var4_4 = var1_1.getIntExtra("operation", 0);
	// vj.a("Swipe.Service", "onStartCommand " + var4_4);
	// switch (var4_4) {
	// case 1:
	// return 1;
	// case 2:
	// this.n = false;
	// this.h.c();
	// this.t();
	// if (var1_1.getBooleanExtra("param_1", false) == false)
	// return 1;
	// boolean var11_5 = var1_1.hasExtra("param_2") != false ? var1_1
	// .getBooleanExtra("param_2", false) : ir.E((Context) this);
	// this.a(var11_5,
	// var1_1.getBooleanExtra("suppress_notifications", false));
	// break;
	//
	// case 3: {
	// this.n = true;
	// this.stopSelf();
	// return 2;
	// }
	// case 4: {
	// int var8_6 = var1_1.getIntExtra("type", -1);
	// if (var8_6 == -1)
	// return 1;
	// String var9_7 = var1_1.getStringExtra("param_1");
	// boolean var10_8 = ir.b(var9_7);
	// if (var8_6 == 0) {
	// this.f(var10_8);
	// ir.c((Context) this, "full_screen_detector", var10_8);
	// jw.b().e();
	// } else if (var8_6 == 1) {
	// this.e(var10_8);
	// ir.c((Context) this, "soft_keyboard_detector", var10_8);
	// }
	// this.o = ir.a(var9_7);
	// jw.b(this.o);
	// this.a(((SwipeApplication) this.getApplication()).b(),
	// vk.c((Context) this));
	// break;
	// }
	// case 5: {
	// this.h.a(var1_1.getIntExtra("param_1", 0),
	// var1_1.getBooleanExtra("param_2", false));
	// break;
	// }
	// case 6: {
	// Boolean var7_9 = var1_1.getBooleanExtra("param_1", false);
	// this.h.a(var7_9);
	// break;
	// }
	// case 7: {
	// this.h.f();
	// break;
	// }
	// case 8: {
	// this.x();
	// break;
	// }
	// case 9: {
	// int var5_10 = var1_1.getIntExtra("param_1", -1);
	// if (var5_10 < 0)
	// return 1;
	// ir.g((Context) this, var5_10);
	// Bundle var6_11 = SwipeService.a((Context) this, true).getExtras();
	// var6_11.putBoolean("suppress_notifications", true);
	// SwipeService.a((Context) this, var6_11);
	// }
	// break;
	//
	// case 10:
	//
	// this.c.removeMessages(14);
	// return 1;
	//
	// default:
	// return 1;
	// }
	// return 1;
	//
	// }
	public int onStartCommand(Intent var1, int var2, int var3) {
		if (var1 == null) {
			return 1;
		} else {
			var2 = var1.getIntExtra("operation", 0);
			vk.a("Swipe.Service", "onStartCommand " + var2);
			boolean var4;
			switch (var2) {
			case 1:
				this.n = false;
				this.h.c();
				this.o();
				if (var1.getBooleanExtra("param_1", false)) {
					if (var1.hasExtra("param_2")) {
						var4 = var1.getBooleanExtra("param_2", false);
					} else {
						var4 = ir.E(this);
					}

					this.a(var4, var1.getBooleanExtra("suppress_notifications",
							false));
				}
				break;
			case 2:
				this.n = true;
				this.stopSelf();
				return 2;
			case 3:
			case 4:
			default:
				break;
			case 5:
				var2 = var1.getIntExtra("type", -1);
				if (var2 != -1) {
					String var6 = var1.getStringExtra("param_1");
					var4 = ir.b((String) var6);
					if (var2 == 0) {
						this.f(var4);
						ir.c(this, "full_screen_detector", var4);
						jw.b().e();
					} else if (var2 == 1) {
						this.e(var4);
						ir.c(this, "soft_keyboard_detector", var4);
					}

					this.o = ir.a((String) var6);
					jw.b(this.o);
					this.a(((SwipeApplication) this.getApplication()).b(),
							(ComponentName) vk.c((Context) this));
				}
				break;
			case 6:
				this.h.a(var1.getIntExtra("param_1", 0),
						var1.getBooleanExtra("param_2", false));
				break;
			case 7:
				var4 = var1.getBooleanExtra("param_1", false);
				this.h.a(var4);
				break;
			case 8:
				this.h.f();
				break;
			case 9:
				this.s();
				break;
			case 10:
				var2 = var1.getIntExtra("param_1", -1);
				if (var2 >= 0) {
					ir.g(this, var2);
					Bundle var5 = a((Context) this, true).getExtras();
					var5.putBoolean("suppress_notifications", true);
					a((Context) this, (Bundle) var5);
				}
				break;
			case 11:
				this.c.removeMessages(14);
			}

			return 1;
		}
	}

	public boolean p() {
		return this.r;
	}

	public void r() {
		d(ir.E(this));
	}

	public void t() {
		if (ir.O(this)) {
			f(true);
		}
		if ((!this.h.l()) && ((!pq.a()) || (!this.e))) {
			e(true);
		}
	}

	public void u() {
		if (!SwipeApplication.c && !d) {
			boolean flag;
			if (f.size() > 0 || pq.c()) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				try {
					ir.b(this, "recentlyUsed", ir.E(this));
				} catch (Exception exception) {
				}
				h.g();
			}
		}
	}

}
