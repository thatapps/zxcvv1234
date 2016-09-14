package com.main;

import android.content.Context;
import android.widget.FrameLayout;

public abstract class rn {
	/*
	 * Enabled aggressive block sorting
	 */
	// public static rn a(Context context) {
	// String string = tn.a(context).toLowerCase();
	// if (rn.a(string))
	// return null;
	// if (string.equalsIgnoreCase("xt702")
	// || string.equalsIgnoreCase("milestone")
	// || string.equalsIgnoreCase("milestone xt720") || to.o()) {
	// ru ru = new ru();
	// if (!ru.a())
	// return null;
	// return ru;
	// }
	// if (string.startsWith("gt-s5830") || string.startsWith("gt-s5838")
	// || to.n() || to.s() || to.e()) {
	// return new rr(context);
	// }
	// if (!(!to.a() || to.b() || to.c() || to.d())) {
	// rs rs = new rs();
	// if (!rs.a())
	// return null;
	// return rs;
	// }
	// ro ro = new ro(context);
	// if (ro.a()) {
	// return ro;
	// }
	// rt rt = new rt(context);
	// if (rt.a()) {
	// return rt;
	// }
	// rq rq = new rq(context);
	// if (rq.a())
	// return rq;
	// return null;
	// }
	public static rn a(Context var0) {
		String var1 = tn.a(var0).toLowerCase();
		if (!a((String) var1)) {
			if (!var1.equalsIgnoreCase("xt702")
					&& !var1.equalsIgnoreCase("milestone")
					&& !var1.equalsIgnoreCase("milestone xt720") && !to.o()) {
				if (var1.startsWith("gt-s5830") || var1.startsWith("gt-s5838")
						|| to.n() || to.s() || to.e()) {
					return new rr(var0);
				}

				if (to.a() && !to.b() && !to.c() && !to.d()) {
					ru var4 = new ru();
					if (var4.a()) {
						return var4;
					}
				} else {
					ro var5 = new ro(var0);
					if (var5.a()) {
						return var5;
					}

					rt var6 = new rt(var0);
					if (var6.a()) {
						return var6;
					}

					rq var3 = new rq(var0);
					if (var3.a()) {
						return var3;
					}
				}
			} else {
				ru var2 = new ru();
				if (var2.a()) {
					return var2;
				}
			}
		}

		return null;
	}

	private static boolean a(String string) {
		if (string.equalsIgnoreCase("c8500")
				|| string.equalsIgnoreCase("amoi n807")
				|| string.equalsIgnoreCase("e15i")
				|| string.equalsIgnoreCase("zte-c n600")) {
			return true;
		}
		return false;
	}

	public void a(FrameLayout frameLayout) {
	}

	public abstract boolean a();

	public abstract boolean b();

	public abstract void c();

	public abstract void d();
}
