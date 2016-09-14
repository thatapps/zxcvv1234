package com.main;

import java.util.HashMap;
import java.util.Map;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.notification.SwipeAccessibilityService;

public final class jc extends ja {

	private static final boolean b = to.v(SwipeApplication.e());
	private static volatile boolean c;

	public jc() {
	}

	public static void a(int i) {
		a(((Context) (SwipeApplication.e())), 4, "BQ", String.valueOf(i));
	}

	public static void a(int i, int j) {
		a(String.valueOf(i), j);
	}

	public static void a(int i, int j, int k, String s) {
		a("A9", s, i, String.valueOf(k), String.valueOf(j));
	}

	public static void a(int i, gk gk1) {
		if (gk1 != null && gk1.a() == 1000) {
			a("AA", "fb", i, "-1", "1");
			return;
		} else {
			a(i, 1, 0, "fb");
			return;
		}
	}

	public static void a(Context context, int i) {
		a(context, "C3", String.valueOf(i));
	}

	// public static void a(Context var0, int var1_1, String var2_2, Object
	// var3_3) {
	// if (TextUtils.isEmpty((CharSequence) var2_2) && 9 != var1_1) {
	// return;
	// }
	// jc var4_4 = new jc();
	// var4_4.a(var0);
	// switch (var1_1) {
	// case 0: {
	// ge.c().e(var2_2);
	// break;
	// }
	// case 1: {
	// ge var9_5 = ge.c();
	// String var10_6 = var3_3 == null ? "" : (String) var3_3;
	// var9_5.a(var2_2, var10_6);
	// break;
	// }
	// case 2: {
	// ge.c().a(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 3: {
	// ge.c().g(var2_2);
	// break;
	// }
	// case 4: {
	// ge var7_7 = ge.c();
	// String var8_8 = var3_3 == null ? "" : (String) var3_3;
	// var7_7.b(var2_2, var8_8);
	// break;
	// }
	// case 5: {
	// ge.c().c(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 6: {
	// ge.c().h(var2_2);
	// break;
	// }
	// case 7: {
	// ge.c().b(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 9: {
	// ge var5_9 = ge.c();
	// String var6_10 = var3_3 == null ? "" : (String) var3_3;
	// var5_9.i(var6_10);
	// }
	// // lbl38: // 10 sources:
	// default: {
	// var4_4.b(var0);
	// }
	// case -1:
	//
	// ge.c().f(var2_2);
	// }
	//
	//
	// }

	// public static void a(Context context, int i, String s, Object obj) {
	// jc jc1;
	// if (TextUtils.isEmpty((CharSequence) s) && 9 != i) {
	// return;
	// }
	// jc1 = new jc();
	// jc1.a(context);
	//
	// // goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L11
	//
	// switch (i) {
	// case 1:
	// jc1.b(context);
	// return;
	// case 2:
	// ge.c().f(s);
	// break;
	// case 3:
	// ge.c().e(s);
	// break;
	// case 4:
	// ge ge1 = ge.c();
	// if (obj == null) {
	// obj = "";
	// } else {
	// obj = (String) obj;
	// }
	// ge1.a(s, ((String) (obj)));
	// break;
	// case 5:
	// ge.c().a(s, (HashMap[]) (HashMap[]) obj);
	// break;
	// case 6:
	// ge.c().g(s);
	// break;
	// case 7:
	// ge ge2 = ge.c();
	// if (obj == null) {
	// obj = "";
	// } else {
	// obj = (String) obj;
	// }
	// ge2.b(s, ((String) (obj)));
	// break;
	// case 8:
	// ge.c().c(s, (HashMap[]) (HashMap[]) obj);
	// break;
	// case 9:
	// ge.c().h(s);
	// break;
	// case 10:
	//
	// ge.c().b(s, (HashMap[]) (HashMap[]) obj);
	// jc1.b(context);
	// return;
	//
	// case 11:
	//
	// ge ge3 = ge.c();
	// if (obj == null) {
	// s = "";
	// } else {
	// s = (String) obj;
	// }
	// ge3.i(s);
	//
	// }
	//
	// }
	// public static void a(Context var0, int var1_1, String var2_2, Object
	// var3_3) {
	// if (TextUtils.isEmpty((CharSequence) var2_2) && 9 != var1_1) {
	// return;
	// }
	// jc var4_4 = new jc();
	// var4_4.a(var0);
	// switch (var1_1) {
	// case 0: {
	// ge.c().e(var2_2);
	// break;
	// }
	// case 1: {
	// ge var9_5 = ge.c();
	// String var10_6 = var3_3 == null ? "" : (String) var3_3;
	// var9_5.a(var2_2, var10_6);
	// break;
	// }
	// case 2: {
	// ge.c().a(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 3: {
	// ge.c().g(var2_2);
	// break;
	// }
	// case 4: {
	// ge var7_7 = ge.c();
	// String var8_8 = var3_3 == null ? "" : (String) var3_3;
	// var7_7.b(var2_2, var8_8);
	// break;
	// }
	// case 5: {
	// ge.c().c(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 6: {
	// ge.c().h(var2_2);
	// break;
	// }
	// case 7: {
	// ge.c().b(var2_2, (HashMap[]) var3_3);
	// break;
	// }
	// case 9: {
	// ge var5_9 = ge.c();
	// String var6_10 = var3_3 == null ? "" : (String) var3_3;
	// var5_9.i(var6_10);
	// }
	//
	// default: {
	// var4_4.b(var0);
	// }
	// case -1:
	//
	// ge.c().f(var2_2);
	// }
	//
	// }
	// public static void a(Context var0, int var1, String var2, Object var3) {
	// if (!TextUtils.isEmpty(var2) || 9 == var1) {
	// jc var4 = new jc();
	// var4.a((Context) var0);
	// ge var5;
	// String var6;
	// switch (var1) {
	// case -1:
	// ge.c().f((String) var2);
	// break;
	// case 0:
	// ge.c().e((String) var2);
	// break;
	// case 1:
	// var5 = ge.c();
	// if (var3 == null) {
	// var6 = "";
	// } else {
	// var6 = (String) var3;
	// }
	//
	// var5.a((String) var2, (String) var6);
	// break;
	// case 2:
	// ge.c().a((String) var2,
	// (HashMap[]) ((HashMap[]) ((HashMap[]) var3)));
	// break;
	// case 3:
	// ge.c().g((String) var2);
	// break;
	// case 4:
	// var5 = ge.c();
	// if (var3 == null) {
	// var6 = "";
	// } else {
	// var6 = (String) var3;
	// }
	//
	// var5.b((String) var2, (String) var6);
	// break;
	// case 5:
	// ge.c().c((String) var2,
	// (HashMap[]) ((HashMap[]) ((HashMap[]) var3)));
	// break;
	// case 6:
	// ge.c().h((String) var2);
	// break;
	// case 7:
	// ge.c().b((String) var2,
	// (HashMap[]) ((HashMap[]) ((HashMap[]) var3)));
	// case 8:
	// default:
	// break;
	// case 9:
	// var5 = ge.c();
	// if (var3 == null) {
	// var2 = "";
	// } else {
	// var2 = (String) var3;
	// }
	//
	// var5.i((String) var2);
	// }
	//
	// var4.b((Context) var0);
	// }
	// }
	public static void a(Context context, int i, String s, Object obj) {
		jc jc1;
		if (TextUtils.isEmpty(s) && 9 != i) {
			return;
		}
		jc1 = new jc();
		jc1.a(context);
		// i;
		// JVM INSTR tableswitch -1 9: default 88
		// -1 265
		// 0 95
		// 1 105
		// 2 135
		// 3 152
		// 4 162
		// 5 192
		// 6 209
		// 7 219
		// 8 88
		// 9 236;
		// goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L11

		switch (i) {

		default:
			jc1.b(context);
			return;
		case -1:
			ge.c().f(s);
			return;
		case 0:
			ge.c().e(s);
			return;
		case 1:
			ge ge1 = ge.c();
			if (obj == null) {
				obj = "";
			} else {
				obj = (String) obj;
			}
			ge1.a(s, ((String) (obj)));

			return;

		case 2:
			ge.c().a(s, (HashMap[]) (HashMap[]) obj);
			return;
		case 3:
			ge.c().g(s);
			return;
		case 4:
			ge ge2 = ge.c();
			if (obj == null) {
				obj = "";
			} else {
				obj = (String) obj;
			}
			ge2.b(s, ((String) (obj)));
			return;
		case 5:
			ge.c().c(s, (HashMap[]) (HashMap[]) obj);
			return;
		case 6:
			ge.c().h(s);
			return;
		case 7:
			ge.c().b(s, (HashMap[]) (HashMap[]) obj);
			return;
		case 8:
			jc1.b(context);
			return;
		case 9:

			ge ge3 = ge.c();
			if (obj == null) {
				s = "";
			} else {
				s = (String) obj;
			}
			ge3.i(s);
		}

	}

	public static void a(Context context, String s) {
		a(context, 3, s, null);
	}

	public static void a(Context context, String s, String s1) {
		a(context, 4, s, s1);
	}

	public static void a(String s, int i) {
		b("A0", s, i);
	}

	public static void a(String s, int i, int j) {
		b(s, String.valueOf(i), j);
	}

	public static void a(String s, String s1, int i, String s2, String s3) {
		HashMap hashmap = new HashMap(4);
		hashmap.put("V", (new StringBuilder()).append("b").append(i).toString());
		hashmap.put("P", s2);
		hashmap.put("T", s3);
		hashmap.put("I", s1);
		a(((Context) (SwipeApplication.e())), 7, s, new HashMap[] { hashmap });
	}

	public static void a(boolean flag) {
		SwipeApplication swipeapplication = SwipeApplication.e();
		String s;
		if (flag) {
			s = "1";
		} else {
			s = "0";
		}
		a(((Context) (swipeapplication)), 4, "BM", s);
	}

	public static void a(boolean flag, lr lr1) {
		Object obj = vk.c(SwipeApplication.e());
		String str = null;
		HashMap hashmap;
		hashmap = new HashMap(8);
		hashmap.put("S", String.valueOf(lr1.b));
		hashmap.put("D", String.valueOf(lr1.c));
		hashmap.put("B", ((ComponentName) (obj)).getPackageName());
		hashmap.put("C", ((ComponentName) (obj)).getClassName());
		hashmap.put("X", String.valueOf(lr1.g));
		hashmap.put("Y", String.valueOf(lr1.h));
		hashmap.put("T", String.valueOf(lr1.i));
		if (SwipeAccessibilityService.a() != null) {
			str = "1";
		} else {
			str = "0";
		}
		hashmap.put("A", lr1);
		if (b) {
			str = "1";
		} else {
			str = "0";
		}
		hashmap.put("N", String.valueOf(lr1));
		hashmap.put("V", String.valueOf("-1"));
		obj = SwipeApplication.e();
		if (flag) {
			str = "BY";
		} else {
			str = "BZ";
		}
		try {
			a(((Context) (obj)), 5, ((String) (str)), new HashMap[] { hashmap });
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception ex) {
			vk.b(str);
		}
		return;
	}

	public static void b() {
		ge.c().j(String.valueOf(2001));
	}

	public static void b(int i, int j) {
		a("A1", i, j);
	}

	public static void b(Context context, String s) {
		a(context, 6, s, null);
	}

	public static void b(String s, int i) {
		b("A3", s, i);
	}

	public static void b(String s, String s1, int i) {
		String s2;
		if (1 == i) {
			s2 = "2";
		} else {
			s2 = "1";
		}
		a(s, s1, i, s2, "8");
	}

	static boolean b(boolean flag) {
		c = flag;
		return flag;
	}

	public static void c() {
		ui.a(new jk(null));
	}

	public static void c(int i, int j) {
		a("A4", i, j);
	}

	public static void c(String s) {
		a(SwipeApplication.e(), 4, "BC", s);
	}

	public static void d() {
		SwipeApplication swipeapplication = SwipeApplication.e();
		if (kk.a(swipeapplication, 2L, 0x5265c00L)) {
			kk.a(swipeapplication, 2L);
			a(swipeapplication, -1, "B0", null);
		}
	}

	public static void d(int i, int j) {
		a("A2", i, j);
	}

	public static void d(final Context context) {
		if (c) {
			Log.i("Swipe.SwipeAnalysis", "Sending referrer on progress...");
			return;
		} else {
			c = true;
			jc jc1 = new jc();
			jc1.a(context);
			ge.c().d(true);
			ge.c().b("400105");
			ge.c().c(to.k(context));
			ge.c().d(vh.c(context));
			ge.c().a(new gb() {

				final Context a;

				public void a(boolean flag, int i) {
					StringBuilder stringbuilder = (new StringBuilder())
							.append("Install referrer ");
					String s;
					if (flag) {
						s = "sent successfully";
					} else {
						s = "failed to sent";
					}
					vj.a("Swipe.SwipeAnalysis",
							stringbuilder.append(s).append("; Result code: ")
									.append(i).toString());
					if (flag) {
						ir.a(a, true);
					}
					jc.b(false);
				}

				{
					a = context;
					// super();
				}
			});
			jc1.b(context);
			return;
		}
	}

	public static void d(String s) {
		a(SwipeApplication.e(), 4, "BD", s);
	}

	public static void e() {
		a(SwipeApplication.e(), 3, "B6", null);
	}

	public static void e(int i, int j) {
		b(String.valueOf(i), j);
	}

	public static void e(String s) {
		if (!TextUtils.isEmpty(s)) {
			a(SwipeApplication.e(), 4, "BV", s);
		}
	}

	public static String f() {
		return ge.c().r();
	}

	public static void f(int i, int j) {
		a("A6", i, j);
	}

	public static void f(String s) {
		if (!TextUtils.isEmpty(s)) {
			a(SwipeApplication.e(), 4, "BU", s);
		}
	}

	public static void g() {
		a(SwipeApplication.e(), 3, "BP", null);
	}

	public static void h() {
		a(SwipeApplication.e(), 3, "BO", null);
	}

	public void a(Context context) {
		vj.a("Swipe.SwipeAnalysis", "Product:400105, Vendor:00, Channel:32400");
		ge.c().a(context, "0", "400105", "00", "32400", String.valueOf(2001));
		ge.c().a(false);
		ge.c().b(true);
		ge.c().c(false);
		ge.c().f(false);
		ge.c().k("");
		String str = ir.x(context);
		if (!TextUtils.isEmpty(str) && !str.equals(ge.c().d())) {
			b(str);
		}
		b();
	}

	public void a(String s) {
		throw new RuntimeException(
				"Unimplemented, please use logEvent(Context, int, String, Object)");
	}

	public void a(String s, String s1, Throwable throwable) {
		throw new RuntimeException(
				"Unimplemented, please use logEvent(Context, int, String, Object)");
	}

	public void a(String s, Map map) {
		throw new RuntimeException(
				"Unimplemented, please use logEvent(Context, int, String, Object)");
	}

	public void b(Context context) {
		ge.c().a();
	}

	public void b(String s) {
		ge.c().a(s);
		ge.c().e(ir.v(SwipeApplication.e()));
	}

}