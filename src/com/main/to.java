package com.main;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.WindowManager;
import com.lazyswipe.SwipeApplication;
import java.lang.reflect.Method;
import java.util.List;

public class to {

	private static final String a;
	private static final String b;
	private static final String c;
	private static final String d;

	public static boolean A() {
		String s1 = a("ro.miui.ui.version.name");
		return s1 != null
				&& (s1.equalsIgnoreCase("V5") || s1.equalsIgnoreCase("V6"));
	}

	public static boolean B() {
		String s1 = a("ro.miui.ui.version.name");
		return s1 != null && s1.equalsIgnoreCase("V5");
	}

	public static boolean C() {
		String s1 = a("ro.miui.ui.version.name");
		return s1 != null && s1.equalsIgnoreCase("V6");
	}

	public static boolean D() {
		return c.equalsIgnoreCase("huawei");
	}

	public static boolean E() {
		return vk.a(a("ro.build.version.emui"),(Object)"EmotionUI_2.3")
				|| Build.DISPLAY.startsWith("EMUI2.3");
	}

	/*
	 * public static boolean E() { if
	 * (vk.a((Object)to.a("ro.build.version.emui"), (Object)"EmotionUI_2.3") ||
	 * Build.DISPLAY.startsWith("EMUI2.3")) { return true; } return false; }
	 */
	public static boolean F() {
		return c.equalsIgnoreCase("huawei") && b.contains("p6-u06");
	}

	public static boolean G() {
		return c.equalsIgnoreCase("huawei") && b.contains("u9508");
	}

	public static boolean H() {
		return android.os.Build.VERSION.SDK_INT >= 17;
	}

	public static boolean I() {
		return android.os.Build.VERSION.SDK_INT >= 21;
	}

	public static boolean J() {
		return "amoi n826".equalsIgnoreCase(b)
				|| "amoi n821".equalsIgnoreCase(b)
				|| "amoi n820".equalsIgnoreCase(b);
	}

	public static boolean K() {
		return c.equals("coolpad") && a.contains("7298a");
	}

	public static boolean L() {
		return c.equals("coolpad") && b.contains("7295");
	}

	public static String M() {
		Object obj;
		try {
			obj = SwipeApplication.e();
			DisplayMetrics displaymetrics = ((Context) (obj)).getResources()
					.getDisplayMetrics();
			obj = (new StringBuilder()).append("MANUFACTURER:")
					.append(Build.MANUFACTURER).append(", PRODUCT:")
					.append(Build.PRODUCT).append("\uFF0C ID:")
					.append(Build.ID).append(", brand:").append(Build.BRAND)
					.append(", display:").append(Build.DISPLAY)
					.append(", MODEL:").append(Build.MODEL).append(", DPI:")
					.append(tn.d(((Context) (obj)))).append(", screenWidth:")
					.append(displaymetrics.widthPixels)
					.append(", screenHeight:")
					.append(displaymetrics.heightPixels).toString();
		} catch (Exception exception) {
			return "UNKNOWN";
		}
		return ((String) (obj));
	}

	public static String N() {
		String s1;
		try {
			s1 = a("ro.serialno");
		} catch (Exception exception) {
			return "";
		}
		return s1;
	}

	public static boolean O() {
		return Build.MODEL.startsWith("XT103")
				&& Build.MANUFACTURER.equals("motorola");
	}

	public static boolean P() {
		return Build.MODEL.equals("XT1254")
				&& Build.MANUFACTURER.equals("motorola");
	}

	public static int a(int i1) {
		char c1 = '\u01E0';
		if (i1 < 480) {
			c1 = '\u0140';
		} else if (i1 >= 720) {
			return i1 >= 1080 ? 1080 : 720;
		}
		return c1;
	}

	public static String a(String s1) {
		try {
			s1 = (String) Class.forName("android.os.SystemProperties")
					.getMethod("get", new Class[] { java.lang.String.class })
					.invoke(null, new Object[] { s1 });
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return s1;
	}

	public static boolean a() {
		return a.contains("meizu_mx");
	}

	public static boolean a(Context context) {
		if (android.os.Build.VERSION.SDK_INT >= 19) {
			return a(context, 24);
		}
		String string = Integer
				.toBinaryString(context.getApplicationInfo().flags);
		int i1 = string.length() - 28;
		return i1 >= 0 && string.charAt(i1) == '1';
	}

	@SuppressLint("NewApi")
	public static boolean a(Context context, int i1) {
		AppOpsManager appOpsManager = (AppOpsManager) context
				.getSystemService("appops");
		Method method = uo.a(android.app.AppOpsManager.class, "checkOp",
				new Class[] { Integer.TYPE, Integer.TYPE,
						java.lang.String.class });
		try {
			i1 = ((Integer) uo.a(
					appOpsManager,
					method,
					new Object[] { Integer.valueOf(i1),
							Integer.valueOf(Binder.getCallingUid()),
							"com.lazyswipe.zev" })).intValue();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.DeviceUtils", "checkOp failed", exception);
			return false;
		}
		return i1 == 0;
	}

	public static void b(Context context) {
		vk.c(context, (new Intent()).setClassName("com.oppo.safe",
				"com.oppo.safe.permission.PermissionTopActivity"));
	}

	public static boolean b() {
		return a.contains("meizu_mx2");
	}

	public static void c(Context context) {
		try {
			context.startActivity((new Intent()).setClassName(
					"com.oppo.purebackground",
					"com.oppo.purebackground.PurebackgroundTopActivity")
					.addFlags(0x10000000));
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.DeviceUtils",
					(new StringBuilder())
							.append("Failed to launch Oppo pure background: ")
							.append(M()).toString());
		}
	}

	public static boolean c() {
		return a.contains("meizu_mx3");
	}

	public static void d(Context context) {
		try {
			Intent intent = new Intent();
			intent.setClassName("com.huawei.systemmanager",
					"com.huawei.systemmanager.optimize.process.ProtectActivity");
			intent.addFlags(0x10000000);
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.DeviceUtils",
					(new StringBuilder())
							.append("Failed to launch HuaWei Proected Apps: ")
							.append(M()).toString());
		}
	}

	public static boolean d() {
		return a.contains("meizu_mx4");
	}

	public static void e(Context context) {
		try {
			Intent intent = new Intent();
			intent.setClassName("com.huawei.systemmanager",
					"com.huawei.systemmanager.optimize.bootstart.BootStartActivity");
			intent.addFlags(0x10000000);
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.DeviceUtils",
					(new StringBuilder())
							.append("Failed to launch HuaWei Startup Manager: ")
							.append(M()).toString());
		}
	}

	public static boolean e() {
		return c.equals("zte") && b.contains("zte u985");
	}

	public static void f(Context context) {
		Intent intent = new Intent();
		String s1;
		if (E()) {
			s1 = "com.huawei.systemmanager.SystemManagerMainActivity";
		} else {
			s1 = "com.huawei.notificationmanager.ui.NotificationManagmentActivity";
		}
		try {
			intent.setClassName("com.huawei.systemmanager", s1);
			intent.addFlags(0x10000000);
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.DeviceUtils",
					(new StringBuilder())
							.append("Failed to launch HuaWei NotificationManagementActivity: ")
							.append(M()).toString());
		}
		return;
	}

	public static boolean f() {
		return c.equals("htc") && b.contains("htc one x");
	}

	public static boolean g() {
		return b.contains("htc 801e");
	}

	public static boolean g(Context context) {
		Intent intent = (new Intent()).setClassName("com.miui.securitycenter",
				"com.miui.permcenter.autostart.AutoStartManagementActivity");
		if (!C() || !vk.c(context, intent)) {
			h(context);
			return false;
		} else {
			return true;
		}
	}

	public static void h(Context context) {
		Intent intent;
		if (C()) {
			intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
			intent.setClassName("com.miui.securitycenter",
					"com.miui.permcenter.permissions.AppPermissionsEditorActivity");
			intent.putExtra("extra_pkgname", "com.lazyswipe");
		} else {
			intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
			intent.addFlags(32768);
			intent.setData(Uri.fromParts("package", "com.lazyswipe", null));
		}
		try {
			intent.addFlags(0x10000000);
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e("Swipe.DeviceUtils",
					(new StringBuilder())
							.append("startMiuiPermissionActivity failed, no activity found: ")
							.append(intent).toString());
		}
	}

	public static boolean h() {
		return c.equals("samsung") && b.equals("gt-i9100");
	}

	public static boolean i() {
		return b.startsWith("mi-one");
	}

	public static boolean i(Context context) {
		return vk.b(context, "com.huawei.systemmanager");
	}

	public static String j(Context context) {
		String str = null;
		try {
			str = android.provider.Settings.Secure.getString(
					context.getContentResolver(), "android_id");
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return str;
	}

	public static boolean j() {
		return c.equals("xiaomi") && Build.DEVICE.startsWith("HM");
	}

	public static String k(Context context) {
		String s3;
		String s4;

		String s1 = j(context);
		s3 = s1;
		if (s1 == null) {
			s3 = "";
		}
		s1 = vh.b(context);
		if (s1 != null) {
			s4 = s1;
			if (!s1.equals(s3)) {

			}
		}
		s4 = "";

		String s2 = null;
		if (TextUtils.isEmpty(s3) || TextUtils.isEmpty(s4)) {
			s2 = uj.a(context);
		}
		// context = s2;
		if (s2 == null) {
			s2 = "";
		}
		return (new StringBuilder()).append(s3).append("_").append(s4)
				.append("_").append(context).toString();
	}

	public static boolean k() {
		return c.equals("xiaomi");
	}

	public static String l(Context context) {
		String s2 = vh.b(context);
		String s1 = N();
		if (TextUtils.isEmpty(s2)) {
			String str = uj.a(context);
			if (!TextUtils.isEmpty(str)) {
				return uh.b((new StringBuilder()).append(context).append("_")
						.append(s1).toString());
			} else {
				return "";
			}
		} else {
			return uh.b((new StringBuilder()).append(s2).append("_").append(s1)
					.toString());
		}
	}

	public static boolean l() {
		return b.equalsIgnoreCase("gt-s5830");
	}

	public static String m(Context context) {
		String s1 = vh.b(context);
		String str = j(context);
		String s2 = N();
		return uh.a((new StringBuilder()).append(s1).append(str).append(s2)
				.toString());
	}

	public static boolean m() {
		return b.equalsIgnoreCase("gt-s5830i");
	}

	public static boolean n() {
		return b.equalsIgnoreCase("gt-p1000");
	}

	public static boolean n(Context context) {
		return (context.getResources().getConfiguration().screenLayout & 0xf) >= 3;
	}

	public static boolean o() {
		return b.startsWith("me525");
	}

	public static boolean o(Context context) {
		if (q()) {
			return true;
		}
		SensorManager sensorManager = (SensorManager) context
				.getSystemService("sensor");
		if (context != null) {
			List list = sensorManager.getSensorList(5);
			boolean flag;
			if (list != null && !list.isEmpty()) {
				flag = true;
			} else {
				flag = false;
			}
			return flag;
		} else {
			return false;
		}
	}

	public static int p(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}

	public static boolean p() {
		return b.startsWith("me860");
	}

	public static int q(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}

	public static boolean q() {
		return b.startsWith("lg-p970");
	}

	public static int r(Context context) {
		DisplayMetrics displayMetrics = context.getResources()
				.getDisplayMetrics();
		return Math.min(((DisplayMetrics) (displayMetrics)).widthPixels,
				((DisplayMetrics) (displayMetrics)).heightPixels);
	}

	public static boolean r() {
		return b.startsWith("u8800");
	}

	public static int s(Context context) {
		DisplayMetrics displayMetrics = context.getResources()
				.getDisplayMetrics();
		return Math.max(((DisplayMetrics) (displayMetrics)).widthPixels,
				((DisplayMetrics) (displayMetrics)).heightPixels);
	}

	public static boolean s() {
		return b.equalsIgnoreCase("deovo v5");
	}

	public static int t(Context context) {
		DisplayMetrics displayMetrics = context.getResources()
				.getDisplayMetrics();
		return (int) Math.hypot(
				((DisplayMetrics) (displayMetrics)).widthPixels,
				((DisplayMetrics) (displayMetrics)).heightPixels);
	}

	public static boolean t() {
		return b.contains("lenovo a850");
	}

	public static int u(Context context) {
		return a(r(context));
	}

	public static boolean u() {
		return android.os.Build.VERSION.SDK_INT >= 16;
	}

	public static boolean v() {
		return android.os.Build.VERSION.SDK_INT >= 14;
	}

	public static boolean v(Context context) {
		boolean flag = true;
		if (android.os.Build.VERSION.SDK_INT < 17) {

			int j1 = context.getResources().getIdentifier(
					"config_showNavigationBar", "bool", "android");
			if (j1 > 0) {
				flag = context.getResources().getBoolean(j1);
			} else {
				boolean flag1 = KeyCharacterMap.deviceHasKey(4);
				boolean flag2 = KeyCharacterMap.deviceHasKey(3);
				if (flag1 || flag2) {
					flag = false;
				}
			}

		} else {

			Display display = ((WindowManager) context
					.getSystemService("window")).getDefaultDisplay();
			Point point = new Point();
			display.getRealSize(point);
			int i1 = point.x;
			int k1 = point.y;
			display.getSize(point);
			int l1 = point.x;
			int i2 = point.y;
			if (i1 - l1 > 0 || k1 - i2 > 0) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public static void w() {
	}

	public static boolean x() {
		return c.equals("samsung") && b.equals("sm-n9006");
	}

	public static boolean y() {
		return d.contains("miui") || d.contains("mione");
	}

	public static boolean z() {
		return !TextUtils.isEmpty(a("ro.build.version.opporom"));
	}

	static {
		a = Build.PRODUCT.toLowerCase();
		b = Build.MODEL.toLowerCase();
		c = Build.MANUFACTURER.toLowerCase();
		d = Build.DISPLAY.toLowerCase();
	}
}
