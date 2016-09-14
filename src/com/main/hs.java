package com.main;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.AsyncTask
 *  android.os.AsyncTask$Status
 *  android.os.Handler
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */

public class hs {
	private static Map a = new ConcurrentHashMap();
	private static Map b = new ConcurrentHashMap();
	private final Context c;
	private final String d;
	private final gn e;
	private final hx f;
	private final hr g;
	private final hy h;
	private final int i;
	private static boolean j;
	private static hu k;
	private boolean l;
	private static int m = 30000;
	private boolean n = false;
	private volatile static boolean o = false;
	private static Handler p;
	private static Runnable q;
	private AsyncTask r;
	private int s = 8;

	public hs(Context context, String string, gn gn, hx hx, boolean bl, hy hy,
			int n, hr hr) {
		if (hr == null) {
			throw new IllegalArgumentException("adViewRequestCallback");
		}
		this.c = context;
		this.d = string;
		this.e = gn;
		this.f = hx;
		this.j = bl;
		this.h = hy;
		this.i = n;
		this.g = hr;
		this.k = new hu(this);
		this.p = new Handler();
		this.q = new Runnable() {

			public void run() {
				hs.this.o = false;
				hs.this.a();
			}
		};
		this.b();
	}

	static int a(hs hs1, int i1) {
		hs1.m = i1;
		return i1;
	}

	static hr a(hs hs1) {
		return hs1.g;
	}

	private void a(int n) {
		b.put((Object) this.e(), (Object) n);
	}

	private void a(long l) {
		a.put((Object) this.e(), (Object) l);
	}

	static void a(hs hs, String string) {
		hs.b(string);
	}

	static int b(hs hs) {
		return hs.s;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private void b(String string) {
		hs hs = this;
		synchronized (hs) {
			boolean bl = this.o;
			if (bl) {
				this.p.removeCallbacks(this.q);
				this.o = false;
			}
			return;
		}
	}

	private int c() {
		Integer n = this.g();
		if (n == null) {
			if (this.j) {
				return 20000;
			}
			return -1000;
		}
		return n;
	}

	private ht d() {
		if (hy.b == this.h) {
			return ht.c;
		}
		if (gn.b == this.e) {
			return ht.b;
		}
		return ht.a;
	}

	private String e() {
		return this.d + ":" + this.d().toString();
	}

	private Long f() {
		return (Long) a.get((Object) this.e());
	}

	private Integer g() {
		return (Integer) b.get((Object) this.e());
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private boolean h() {
		if (this.c
				.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
			return true;
		}
		NetworkInfo networkInfo = ((ConnectivityManager) this.c
				.getSystemService("connectivity")).getActiveNetworkInfo();
		if (networkInfo == null)
			return false;
		if (!networkInfo.isConnected())
			return false;
		return true;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a() {
		hs hs = this;
		synchronized (hs) {
			long l = System.currentTimeMillis();
			Long l2 = this.f();
			if (l2 != null && l < l2 + (long) this.c()) {
				this.g.a(gk.c);
			} else {
				if (this.o) {
					this.b((hs) null);
				}
				if (this.r != null
						&& this.r.getStatus() != AsyncTask.Status.FINISHED) {
					this.r.cancel(true);
				}
				if (!this.h()) {
					this.m = 30000;
					this.g.a(gk.a);
					this.a("no network connection");
				} else {
					this.a(l);
					this.r = new hp(this.c, this.d, this.e, this.f, this.h,
							this.i, gm.a(this.c), new hr() {

								@Override
								public void a(gk gk) {
									hs.this.g.a(gk);
									hs.this.n = true;
									hs.this.a("onError");
								}

								@Override
								public void a(hv hv) {
									hs.this.m = hv.a();
									hs.this.a(hv.b());
									hs.this.g.a(hv);
									hs.this.n = true;
								}
							}).a();
				}
			}
			return;
		}
	}

	static boolean a(hs hs1, boolean flag) {
		hs1.o = flag;
		return flag;
	}

	private void b() {
		if (!j) {
			return;
		} else {
			IntentFilter intentfilter = new IntentFilter(
					"android.intent.action.SCREEN_ON");
			intentfilter.addAction("android.intent.action.SCREEN_OFF");
			c.registerReceiver(k, intentfilter);
			l = true;
			return;
		}
	}

	static void b(hs hs1, int i1) {
		hs1.a(i1);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a(String string) {
		hs hs = this;
		synchronized (hs) {
			boolean bl = this.j;
			if (bl && this.m > 0 && !this.o) {
				this.p.postDelayed(this.q, (long) this.m);
				this.o = true;
			}
			return;
		}
	}

}
