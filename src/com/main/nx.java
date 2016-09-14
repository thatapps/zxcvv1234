package com.main;

import java.io.File;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.lazyswipe.zev.R;

//zevienin

public class nx implements gl {

	private Context a;
	private ns b;
	private ok c;
	private long d;
	private Handler e;
	private gp f;
	private int g;
	private boolean h;

	public nx(Context context, ns ns1) {
		a = context;
		b = ns1;
		if (c == null) {
			c = ol.a(a, 1);
		}
		e = new Handler();
	}

	static int a(nx nx1, int i) {
		nx1.g = i;
		return i;
	}

	private void a(final String s, final String s1, final int i, final int j) {
		final boolean flag = TextUtils.isEmpty(s);
		if (!flag) {
			e.removeCallbacksAndMessages(null);
		}
		e.postDelayed(new Runnable() {

			boolean a= flag;
			String b= s;
			String c = s1;
			int d= i;
			int e= j;
			nx f=nx.this;

			public void run() {
				try {
					if (a) {
						nx.a(f);
						return;
					}
				} catch (Throwable throwable) {
					return;
				}
				nx.a(f, b, c, d, e);
				return;
			}

			
		}, (3000L - System.currentTimeMillis()) + d);
	}

	static void a(nx nx1) {
		nx1.d();
	}

	static void a(nx nx1, String s, String s1, int i, int j) {
		nx1.c(s, s1, i, j);
	}

	static Context b(nx nx1) {
		return nx1.a;
	}

	private void b(String s, String s1, int i, int j) {
		if (b.a()) {
			return;
		}
		if (b()) {
			c(s, s1, i, j);
			return;
		} else {
			a(s, s1, i, j);
			return;
		}
	}

	static void b(nx nx1, String s, String s1, int i, int j) {
		nx1.b(s, s1, i, j);
	}

	private boolean b() {
		return System.currentTimeMillis() - d >= 3000L;
	}

	static ns c(nx nx1) {
		return nx1.b;
	}

	private void c() {
		a(null, null, 0, 0);
	}

	private void c(String s, String s1, int i, int j) {
		h = false;
		b.getAdView().a(f, s, s1, i, j);
		b.a(true);
	}

	static gp d(nx nx1) {
		return nx1.f;
	}

	private void d() {
		Object obj = null;
		h = false;
		if (!b.e() || b.f()) {
			b.a(false);
			if (c != null) {
				ja.a().a("FbLucky-SelfClick");
				ol.a(a, c, null, true);
				ol.a(a, c.c, c.q, 1, false);
				b.c();
				return;
			} else {
				ja.a().a("FbLucky-NoData");
				vi.a(a, R.string.msg_no_data);
				return;
			}
		}
		android.graphics.Bitmap bitmap = (Bitmap) obj;
		if (a.getExternalCacheDir() != null) {
			bitmap = (Bitmap) obj;
			if ((new File(a.getExternalCacheDir(), "app_promotion.png"))
					.exists()) {
				try {
					bitmap = tf.a(
							(new StringBuilder())
									.append(a.getExternalCacheDir()
											.getAbsolutePath())
									.append("/app_promotion.png").toString(),
							2560, 2560);
				} catch (Throwable throwable) {
					throwable = (Throwable) obj;
				}
			}
		}
		if (bitmap != null) {
			b.getAdView().a(bitmap, a.getString(R.string.app_promotion_download),
					new android.view.View.OnClickListener() {

						final nx a;

						public void onClick(View view) {
							ja.a().a("Hola\u62C9\u7EF3\u8BE6\u60C5\u8DF3");
							vk.f(nx.b(a),
									"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_message");
							nx.c(a).c();
						}

						{
							a = nx.this;
							// super();
						}
					});
			b.a(true);
			ja.a().a("Hola\u62C9\u7EF3\u8BE6\u60C5");
		} else {
			b.a(false);
			ja.a().a("Hola\u62C9\u7EF3\u62C9\u8DF3");
			vk.f(a,
					"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_message");
			b.c();
		}
		ir.g(a);
	}

	public void a() {
		e.removeCallbacksAndMessages(null);
		ja ja1 = ja.a();
		String s;
		if (h) {
			s = "FbLucky-FbBack";
		} else {
			s = "FbLucky-AnimBack";
		}
		ja1.a(s);
	}

	public void a(Context context) {
		boolean flag = true;
		if (f != null) {
			f.h();
			f = null;
		}
		h = true;
		d = System.currentTimeMillis();
		ol ol1 = ol.a(context);
		if (ol1 == null || !ol1.a(context.getContentResolver(), 1, 2)) {
			flag = false;
		}
		if ((!b.e() || b.f()) && flag) {
			e.postDelayed(new Runnable() {

				final nx a;

				public void run() {
					try {
						a.a(null, null);
						return;
					} catch (Throwable throwable) {
						return;
					}
				}

				{
					a = nx.this;
					// super();
				}
			}, 8000L);
			f = new gp(context, "774443062592078_841894569180260");
			f.a(this);
			f.a();
			return;
		}
		if (b()) {
			d();
			return;
		} else {
			c();
			return;
		}
	}

	public void a(gj gj) {
		e.removeCallbacksAndMessages(null);
		jc.a(1, 1, 1, "fb");
		if (b.a()) {
			return;
		}
		if (f != gj) {
			Log.w("Swipe.AdRunner",
					"The returned AD is not the one started the load");
			return;
		} else {
			(new ny(a, this)).execute(new Void[0]);
			return;
		}
	}

	public void a(gj gj, gk gk1) {
		e.removeCallbacksAndMessages(null);
		jc.a(1, gk1);
		if (gj != null) {
			Log.w("Swipe.AdRunner",
					(new StringBuilder())
							.append("Failed to load Facebook AD; error: ")
							.append(gk1.a()).append("/").append(gk1.b())
							.toString());
		} else {
			Log.w("Swipe.AdRunner",
					"Failed to download facebook cover and icon");
		}
		if (b.a()) {
			return;
		}
		if (b()) {
			d();
			return;
		} else {
			c();
			return;
		}
	}

	public void b(gj gj) {
		ja.a().a("FbLucky-FbClick");
		ol.a(a, g, 2, 1, false);
		b.c();
	}
}
