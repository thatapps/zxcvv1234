//zevienin
package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;

import com.lazyswipe.SwipeApplication;

public final class ir {

	public static final int a[] = { 1, 2, 4, 8 };
	public static boolean b;
	private static boolean c;
	private static final Set d = new HashSet();

	public static boolean A(Context context) {
		return a(context).getBoolean("key_hint_app_installed", true);
	}

	public static boolean B(Context context) {
		return a(context).getBoolean("key_hint_notification_service_enabled",
				true);
	}

	public static boolean C(Context context) {
		return a(context).getBoolean("key_sms_notification", true);
	}

	public static int D(Context context) {
		SharedPreferences preferences = a(context);
		int i1;
		try {
			i1 = preferences.getInt("key_toucher_position", 3);
		} catch (ClassCastException classcastexception) {
			int j1 = Integer.parseInt(preferences.getString(
					"key_toucher_position", null));
			preferences.edit().remove("key_toucher_position").apply();
			preferences.edit().putInt("key_toucher_position", j1).apply();
			return j1;
		}
		return i1;
	}

	public static boolean E(Context context) {
		return a(context).getBoolean("key_pop_on_left", false);
	}

	public static long F(Context context) {
		return a(context).getLong("key_daily_report_sent", 0L);
	}

	public static void G(Context context) {
		long l1 = System.currentTimeMillis() / 0x5265c00L;
		a(context).edit().putLong("key_daily_report_sent", l1).apply();
	}

	public static boolean H(Context context) {
		return System.currentTimeMillis() / 0x5265c00L == F(context);
	}

	public static int I(Context context) {
		int i1 = 1;
		SharedPreferences preferences = a(context);
		if (!preferences.contains("key_is_first_startup")) {
			preferences.edit().putBoolean("key_is_first_startup", true).apply();
			i1 = 0;
		} else if (!preferences.getBoolean("key_is_first_startup", true)) {
			return !preferences.getBoolean("key_enable_float_window", true) ? 3
					: 2;
		}
		return i1;
	}

	public static int J(Context context) {
		return a(context).getInt("key_tutorial_step", 1);
	}

	public static void K(Context context) {
		a(context).edit().putBoolean("key_is_first_startup", false).apply();
		if (uj.d(context)) {
			ji.a(context.getApplicationContext());
		}
	}

	public static boolean L(Context context) {
		return d(context, "key_enable_float_window", true);
	}

	public static String M(Context context) {
		return a(context, "key_when_to_pop", "3");
	}

	public static boolean N(Context context) {
		return a(M(context));
	}

	public static boolean O(Context context) {
		return b(M(context));
	}

	public static String P(Context context) {
		return a(context, "key_white_list", ((String) (null)));
	}

	public static int Q(Context context) {
		List list = R(context);
		if (list != null) {
			return list.size();
		} else {
			return 0;
		}
	}

	public static List R(Context context) {
		String s1 = P(context);
		context = null;
		List list = null;
		if (!TextUtils.isEmpty(s1)) {
			list = Arrays.asList(s1.split(","));
			return list;

		}
		return list;
	}

	public static Set S(Context context) {
	
		if (!c) {
			a(context, ((List) (null)));
		}
		Set set = d;

		return set;

	}

	public static SharedPreferences T(Context context) {
		return context.getSharedPreferences(
				(new StringBuilder()).append(context.getPackageName())
						.append("_preferences").toString(), 4);
	}

	public static int U(Context context) {
		SharedPreferences preferences = T(context);
		int i1 = preferences.getInt("key_theme", -1);
		if (i1 >= 0) {
			return i1;
		} else {
			preferences.edit().putInt("key_theme", 0)
					.putInt("key_default_theme", 0).apply();
			return 0;
		}
	}

	public static int a(Context context, String s1, int i1) {
		return a(context).getInt(s1, i1);
	}

	private static int a(String s1, int i1) {
		try {
			i1 = Integer.parseInt(s1.substring(0, i1));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return 0;
		}
		return i1;
	}

	public static long a(Context context, String s1, long l1) {
		return a(context).getLong(s1, l1);
	}

	public static SharedPreferences a(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}

	public static String a(Context context, String s1, String s2) {
		return a(context).getString(s1, s2);
	}

	public static void a() {
		if (b() <= 0L) {
			b(SwipeApplication.e(), "key_first_install_time",
					System.currentTimeMillis());
		}
	}

	public static void a(Context context, int i1) {
		a(context).edit().putInt("key_toucher_type", i1).apply();
	}

	public static void a(Context context, int i1, int j1) {
		a(context)
				.edit()
				.putInt((new StringBuilder())
						.append("key_persistent_toucher_pos_").append(j1)
						.toString(), i1).apply();
	}

	public static void a(Context context, long l1) {
		SharedPreferences preferences = a(context);
		if (preferences.getLong("key_notification_apps", 0L) == -1L) {
			return;
		} else {
			preferences.edit().putLong("key_notification_apps", l1).apply();
			return;
		}
	}

	public static void a(Context context, String s1) {
		a(context).edit().putString("key_touch_date", s1).apply();
	}

	public static void a(Context context, String s1, boolean flag) {
		a(context).edit().putString("key_user_id", s1)
				.putBoolean("key_is_new_user", flag).apply();
	}

	public static void a(Context context, List list) {
		
		List list1;
		d.clear();
		list1 = c();
		d.addAll(list1);
		list1.clear();
		list1 = d();
		if (list1 != null) {
			d.addAll(list1);
			list1.clear();
		}

		if (list == null) {
			List list2 = R(context);
			if (list2 == null) {
				return;
			}
			if (list2.size() > 0) {
				d.addAll(list2);
			}
			c = true;
		
			return;
		} else {
			d.addAll(list);
			c = true;

		}

	}

	public static void a(Context context, boolean flag) {
		a(context).edit().putBoolean("key_install_referrer_sent", flag).apply();
	}

	public static boolean a(SharedPreferences sharedpreferences, long l1) {
		return System.currentTimeMillis()
				- sharedpreferences.getLong("key_first_install_time", 0L) > l1;
	}

	public static boolean a(String s1) {
		return "1".equals(s1);
	}

	public static int b(Context context) {
		return a(context).getInt("key_toucher_type", 0);
	}

	public static int b(Context context, int i1) {
		return a(context).getInt(
				(new StringBuilder()).append("key_persistent_toucher_pos_")
						.append(i1).toString(), -60);
	}

	public static int b(Context context, int i1, int j1) {
		String string = x(context);
		if (TextUtils.isEmpty(string)) {
			return j1;
		} else {
			return Math.abs(string.hashCode()) % i1;
		}
	}

	public static long b() {
		return a(SwipeApplication.e(), "key_first_install_time", -1L);
	}

	private static long b(String s1, int i1) {
		long l1;
		try {
			l1 = Long.parseLong(s1.substring(i1));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return 0L;
		}
		return l1;
	}

	public static String b(Context context, String s1) {
		return a(context).getString("key_user_id", s1);
	}

	public static void b(Context context, String s1, int i1) {
		a(context).edit().putInt(s1, i1).apply();
	}

	public static void b(Context context, String s1, long l1) {
		a(context).edit().putLong(s1, l1).apply();
	}

	public static void b(Context context, String s1, String s2) {
		a(context).edit().putString(s1, s2).apply();
	}

	public static void b(Context context, String s1, boolean flag) {
		String s2;
		if (flag) {
			s2 = "key_last_tab_left";
		} else {
			s2 = "key_last_section";
		}
		b(context, s2, s1);
	}

	public static void b(Context context, boolean flag) {
		a(context).edit().putBoolean("key_root_enabled", flag).apply();
	}

	public static boolean b(String s1) {
		return "2".equals(s1);
	}

	public static String c(Context context) {
		return a(context).getString("key_touch_date", null);
	}

	public static List c() {
		ArrayList arraylist = new ArrayList();
		arraylist.add("com.lazyswipe");
		arraylist.add("android");
		arraylist.add("com.android.phone");
		arraylist.add("com.android.mms");
		arraylist.add("com.android.settings");
		arraylist.add("com.android.systemui");
		arraylist.add("com.android.providers.settings");
		arraylist.add("com.android.providers.applications");
		arraylist.add("com.android.providers.contacts");
		arraylist.add("com.android.providers.userdictionary");
		arraylist.add("com.android.providers.telephony");
		arraylist.add("com.android.providers.drm");
		arraylist.add("com.android.providers.downloads");
		arraylist.add("com.android.providers.media");
		return arraylist;
	}

	public static void c(Context context, int i1) {
		a(context).edit().putInt("key_toucher_size_scale", i1).apply();
	}

	public static void c(Context context, String s1) {
		a(context).edit().putString("key_installed_app_package", s1).apply();
	}

	public static void c(Context context, String s1, boolean flag) {
		a(context).edit().putBoolean(s1, flag).apply();
	}

	public static void c(Context context, boolean flag) {
		a(context).edit().putBoolean("key_hint_app_installed", flag).apply();
	}

	public static int d(Context context, int i1) {
		return b(context, i1, i1 + 1);
	}

	public static List d() {
		String s1 = Build.MODEL;
		String s2 = Build.MANUFACTURER;
		ArrayList arraylist = new ArrayList();
		if (s2.equalsIgnoreCase("HTC")) {
			arraylist.add("com.android.htccontacts");
			arraylist.add("com.android.htcdialer");
			arraylist.add("com.htc.messagecs");
			arraylist.add("com.htc.idlescreen.shortcut");
			arraylist.add("com.android.providers.htcCheckin");
		} else if (s2.equalsIgnoreCase("ZTE")) {
			arraylist.add("zte.com.cn.alarmclock");
			arraylist.add("com.android.utk");
		} else if (s2.equalsIgnoreCase("huawei")) {
			arraylist.add("com.huawei.widget.localcityweatherclock");
		} else if (s2.equalsIgnoreCase("Sony Ericsson")) {
			arraylist.add("com.sonyericsson.provider.useragent");
			arraylist.add("com.sonyericsson.provider.customization");
			arraylist.add("com.sonyericsson.secureclockservice");
			arraylist.add("com.sonyericsson.widget.digitalclock");
			arraylist.add("com.sonyericsson.digitalclockwidget");
		} else if (s2.equalsIgnoreCase("samsung")) {
			arraylist.add("com.samsung.inputmethod");
			arraylist.add("com.sec.android.app.controlpanel");
			arraylist.add("com.sonyericsson.provider.customization");
		} else if (s2.equalsIgnoreCase("motorola")) {
			arraylist.add("com.motorola.numberlocation");
			arraylist.add("com.motorola.android.fota");
			arraylist.add("com.motorola.atcmd");
			arraylist.add("com.motorola.locationsensor");
			arraylist.add("com.motorola.blur.conversations");
			arraylist.add("com.motorola.blur.alarmclock");
			arraylist.add("com.motorola.blur.providers.contacts");
		} else if (s2.equalsIgnoreCase("LGE")) {
			arraylist.add("com.lge.clock");
		} else if (s2.equalsIgnoreCase("magnum2x")) {
			arraylist.add("ty.com.android.TYProfileSetting");
		}
		if (s1.equalsIgnoreCase("HTC Sensation Z710e")
				|| s1.equalsIgnoreCase("HTC Sensation G14")
				|| s1.equalsIgnoreCase("HTC Z710e")) {
			arraylist.add("android.process.acore");
		} else if (s1.equalsIgnoreCase("LT18i")) {
			arraylist.add("com.sonyericsson.provider.customization");
			arraylist.add("com.sonyericsson.provider.useragent");
		} else if (s1.equalsIgnoreCase("U8500")
				|| s1.equalsIgnoreCase("U8500 HiQQ")) {
			arraylist.add("android.process.launcherdb");
			arraylist.add("com.motorola.process.system");
			arraylist.add("com.nd.assistance.ServerService");
		} else if (s1.equalsIgnoreCase("MT15I")) {
			arraylist.add("com.sonyericsson.eventstream.calllogplugin");
		} else if (s1.equalsIgnoreCase("GT-I9100")
				|| s1.equalsIgnoreCase("GT-I9100G")) {
			arraylist.add("com.samsung.inputmethod");
			arraylist.add("com.sec.android.app.controlpanel");
			arraylist.add("com.sec.android.app.FileTransferManager");
			arraylist.add("com.sec.android.providers.downloads");
			arraylist.add("com.android.providers.downloads.ui");
		} else if (s1.equalsIgnoreCase("DROIDX")) {
			arraylist.add("com.motorola.blur.contacts.data");
			arraylist.add("com.motorola.blur.contacts");
		} else if (s1.equalsIgnoreCase("DROID2")
				|| s1.equalsIgnoreCase("DROID2 GLOBA")) {
			arraylist.add("com.motorola.blur.contacts");
		} else if (to.r()) {
			arraylist.add("com.huawei.android.gpms");
			arraylist.add("com.android.hwdrm");
			arraylist.add("com.huawei.omadownload");
		} else if (s1.equalsIgnoreCase("LG-P503")) {
			arraylist.add("com.lge.simcontacts");
		} else if (s1.equalsIgnoreCase("XT702")) {
			arraylist.add("com.motorola.usb");
			arraylist.add("com.android.alarmclock");
		} else if (s1.equalsIgnoreCase("e15i")) {
			arraylist.add("com.sec.ccl.csp.app.secretwallpaper.themetwo");
		} else if (s1.equalsIgnoreCase("zte-c n600")) {
			d.add("com.android.wallpaper");
			d.add("com.android.musicvis");
			d.add("com.android.magicsmoke");
		} else if (to.l() || to.m() || s1.startsWith("HTC Velocity 4G")) {
			d.add("com.android.providers.downloads.ui");
		}
		if (arraylist.size() != 0) {
			return arraylist;
		} else {
			return null;
		}
	}

	public static void d(Context context, String s1) {
		b(context, "key_notification_apps_selected", s1);
	}

	// public static boolean d(Context context)
	// {
	// if (ol.u && ol.t.a(2)) {
	//
	// if (!a(context , 0xa4cb800L)) {
	//
	// return false;
	//
	//
	//
	// } else goto _L3
	//
	//
	// }else goto _L1
	// _L1:
	// return false;
	// _L2:
	// if (!a(context = a(context), 0xa4cb800L)) goto _L1; else goto _L3
	// _L3:
	// Object obj;
	// int i1;
	// long l1;
	// obj = context.getString("key_notify_app_click", null);
	// if (TextUtils.isEmpty(((CharSequence) (obj))))
	// {
	// return true;
	// }
	// i1 = ((String) (obj)).indexOf('-');
	// if (i1 < 1)
	// {
	// return true;
	// }
	// int j1 = a(((String) (obj)), i1);
	// l1 = b(((String) (obj)), i1 + 1);
	// if (ol.t.b(2, j1))
	// {
	// continue; /* Loop/switch isn't completed */
	// }
	// obj = Calendar.getInstance();
	// i1 = ((Calendar) (obj)).get(6);
	// ((Calendar) (obj)).setTimeInMillis(l1);
	// if (i1 == ((Calendar) (obj)).get(6)) goto _L1; else goto _L4
	// _L4:
	// context.edit().remove("key_notify_app_click").apply();
	// return true;
	// if (!ol.t.a(2, l1)) goto _L1; else goto _L5
	// _L5:
	// return true;
	// }
	// public static boolean d(Context context) {
	// SharedPreferences sharedPreferences;
	// if (!ol.u || !ol.t.a(2)
	// || !ir.a(sharedPreferences = ir.a(context), 172800000))
	// return false;
	// String string = sharedPreferences.getString("key_notify_app_click",
	// null);
	// if (TextUtils.isEmpty((CharSequence) string)) {
	// return true;
	// }
	// int n = string.indexOf(45);
	// if (n < 1) {
	// return true;
	// }
	// int n2 = ir.a(string, n);
	// long l = ir.b(string, n + 1);
	// if (!ol.t.b(2, n2)) {
	// Calendar calendar = Calendar.getInstance();
	// int n3 = calendar.get(6);
	// calendar.setTimeInMillis(l);
	// if (n3 == calendar.get(6))
	// return false;
	// {
	// sharedPreferences.edit().remove("key_notify_app_click").apply();
	// return true;
	// }
	// }
	// if (ol.t.a(2, l))
	// return true;
	// return false;
	// }
	public static boolean d(Context context) {
		Object obj;
		int i1;
		long l1;
		SharedPreferences sharedPreferences = null;
		if (ol.u && ol.t.a(2)) {

			if (!a(sharedPreferences = a(context), 0xa4cb800L)) {
				return false;
			} else {
				obj = sharedPreferences.getString("key_notify_app_click", null);
				if (TextUtils.isEmpty(((CharSequence) (obj)))) {
					return true;
				}
				i1 = ((String) (obj)).indexOf('-');
				if (i1 < 1) {
					return true;
				}
				int j1 = a(((String) (obj)), i1);
				l1 = b(((String) (obj)), i1 + 1);
				if (!ol.t.b(2, j1)) {
					obj = Calendar.getInstance();
					i1 = ((Calendar) (obj)).get(6);
					((Calendar) (obj)).setTimeInMillis(l1);
				}

				if (i1 == ((Calendar) (obj)).get(6)) {
					return false;
				} else {

					sharedPreferences.edit().remove("key_notify_app_click")
							.apply();

					if (!ol.t.a(2, l1)) {
						return false;
					} else {
						return true;
					}
				}
			}
		} else {
			return false;
		}

	}

	public static boolean d(Context context, String s1, boolean flag) {
		return a(context).getBoolean(s1, flag);
	}

	public static boolean d(Context context, boolean flag) {
		int i1 = 7;
		boolean flag1 = false;
		boolean flag2 = false;
		DisplayMetrics displaymetrics = context.getResources()
				.getDisplayMetrics();
		if (displaymetrics.densityDpi != 120
				|| displaymetrics.heightPixels > 320) {
			SharedPreferences preferences = a(context);
			long l1 = preferences.getLong("key_hint_rate", 0L);
			if (-1L != l1) {
				if (l1 > 0L) {
					int j1 = preferences.getInt("key_rate_cancel_times", 1);
					if (j1 <= 7) {
						i1 = j1;
					}
					if (System.currentTimeMillis() - l1 > (long) i1 * 0x5265c00L) {
						flag1 = true;
					} else {
						flag1 = false;
					}
				} else {
					flag1 = true;
				}
			}
			flag2 = flag1;
			if (flag) {
				flag2 = flag1;
				if (flag1) {
					preferences
							.edit()
							.putLong("key_hint_rate",
									System.currentTimeMillis()).apply();
					return flag1;
				}
			}
		}
		return flag2;
	}

	public static void e(Context context) {
		String s1;
		int i1;
		i1 = 0;
		SharedPreferences preferences = a(context);
		s1 = preferences.getString("key_notify_app_click", null);
		if (!TextUtils.isEmpty(s1)) {

			int j1 = s1.indexOf('-');
			if (j1 >= 1) {
				i1 = a(s1, j1);
			}

		} else {
			long l1 = System.currentTimeMillis();
			preferences
					.edit()
					.putString(
							"key_notify_app_click",
							(new StringBuilder())
									.append(String.valueOf(i1 + 1)).append("-")
									.append(String.valueOf(l1)).toString())
					.apply();
			return;

		}

	}

	public static void e(Context context, int i1) {
		b(context, "key_toucher_position", i1);
	}

	public static void e(Context context, String s1) {
		b(context, "key_when_to_pop", s1);
	}

	public static void e(Context context, boolean flag) {
		SharedPreferences preferences = a(context);
		android.content.SharedPreferences.Editor editor = preferences.edit();
		long l1;
		if (flag) {
			l1 = System.currentTimeMillis();
		} else {
			l1 = -1L;
		}
		editor = editor.putLong("key_hint_rate", l1);
		if (flag) {
			int i1 = preferences.getInt("key_rate_cancel_times", 0);
			if (i1 < 7) {
				editor.putInt("key_rate_cancel_times", i1 + 1);
			}
		}
		editor.apply();
	}

	public static void f(Context context, int i1) {
		if ((SwipeApplication.c || I(context) <= 1) && i1 > 100) {
			return;
		} else {
			a(context).edit().putInt("key_tutorial_step", i1).apply();
			return;
		}
	}

	public static void f(Context context, String s1) {
		c = false;
		b(context, "key_white_list", s1);
	}

	public static void f(Context context, boolean flag) {
		a(context).edit()
				.putBoolean("key_hint_notification_service_enabled", flag)
				.apply();
	}

	public static boolean f(Context context) {
		SharedPreferences preferences = a(context);
		boolean flag = false;
		if (!ir.a(preferences, 86400000)) {
			return false;
		}
		String str = preferences.getString("key_hola_item_valid_since", null);
		if (!TextUtils.isEmpty(str)) {

			int i1 = Character.digit(str.charAt(0), 10);
			if (i1 < 3 && i1 > 0) {
				long l1;
				long l2;
				if (i1 == 1) {
					l1 = 0xf731400L;
				} else {
					l1 = 0x240c8400L;
				}
				l2 = Long.parseLong(str.substring(1));
				if (System.currentTimeMillis() - l2 > l1) {
					flag = true;
					/* Loop/switch isn't completed */
				}
			}

		} else {
			flag = true;
		}

		return flag;
	}

	public static void g(Context context) {
		int i1 = 0;
		SharedPreferences preferences = a(context);
		String s1 = preferences.getString("key_hola_item_valid_since", null);
		if (!TextUtils.isEmpty(s1)) {
			i1 = Character.digit(s1.charAt(0), 10);
		}
		i1++;
		if (i1 <= 3) {
			long l1 = System.currentTimeMillis();
			preferences
					.edit()
					.putString(
							"key_hola_item_valid_since",
							(new StringBuilder()).append(String.valueOf(i1))
									.append(String.valueOf(l1)).toString())
					.apply();
		}
	}

	public static void g(Context context, int i1) {
		T(context).edit().putInt("key_theme", i1).apply();
		ox.b(i1);
	}

	public static void g(Context context, boolean flag) {
		a(context).edit().putBoolean("key_pop_on_left", flag)
				.putLong("key_last_fan_open", System.currentTimeMillis())
				.apply();
	}

	public static void h(Context context, boolean flag) {
		c(context, "key_enable_float_window", flag);
	}

	public static boolean h(Context context) {
		boolean flag = false;
		if ((a(context).getInt("key_pref_clicked", 0) & 1) != 0) {
			flag = true;
		}
		return flag;
	}

	public static String i(Context context, boolean flag) {
		SharedPreferences preferences = a(context);
		if (flag) {
			String s1 = preferences.getString("key_last_tab_left", null);
			if (s1 != null) {
				return s1;
			}
		}
		return preferences.getString("key_last_section", "mostUsed");
	}

	public static void i(Context context) {
		SharedPreferences preferences = a(context);
		int i1 = preferences.getInt("key_pref_clicked", 0);
		preferences.edit().putInt("key_pref_clicked", i1 | 1).apply();
	}

	public static void j(Context context) {
		SharedPreferences preferences = a(context);
		int i1 = preferences.getInt("key_pref_clicked", 0);
		preferences.edit().putInt("key_pref_clicked", i1 & -2).apply();
	}

	public static boolean k(Context context) {
		boolean flag = false;
		if ((a(context).getInt("key_pref_clicked", 0) & 2) != 0) {
			flag = true;
		}
		return flag;
	}

	public static void l(Context context) {
		SharedPreferences preferences = a(context);
		int i1 = preferences.getInt("key_pref_clicked", 0);
		preferences.edit().putInt("key_pref_clicked", i1 | 2).apply();
	}

	public static boolean m(Context context) {
		boolean flag = false;
		if ((a(context).getInt("key_pref_clicked", 0) & 4) != 0) {
			flag = true;
		}
		return flag;
	}

	public static void n(Context context) {
		SharedPreferences preferences = a(context);
		int i1 = preferences.getInt("key_pref_clicked", 0);
		preferences.edit().putInt("key_pref_clicked", i1 | 4).apply();
	}

	public static boolean o(Context context) {
		boolean flag = false;
		if ((a(context).getInt("key_pref_clicked", 0) & 8) != 0) {
			flag = true;
		}
		return flag;
	}

	public static void p(Context context) {
		SharedPreferences preferences = a(context);
		int i1 = preferences.getInt("key_pref_clicked", 0);
		preferences.edit().putInt("key_pref_clicked", i1 | 8).apply();
	}

	public static boolean q(Context context) {
		return a(context).getBoolean("key_install_referrer_sent", false);
	}

	public static int r(Context context) {
		return !s(context) ? 2003 : 2010;
	}

	public static boolean s(Context context) {
		return a(context).getBoolean("key_show_over_lockscreen", false);
	}

	public static int t(Context context) {
		return a(context).getInt("key_toucher_size_scale", 32);
	}

	public static boolean u(Context context) {
		long l1 = a(context).getLong("key_last_fan_open", 0L);
		return l1 > 0L && System.currentTimeMillis() - l1 >= 0x5265c00L;
	}

	public static boolean v(Context context) {
		return a(context).getBoolean("key_is_new_user", true);
	}

	public static int w(Context context) {
		return b(context, 10, 11);
	}

	public static String x(Context context) {
		return b(context, ((String) (null)));
	}

	public static boolean y(Context context) {
		return a(context).getBoolean("key_root_enabled", false);
	}

	public static String z(Context context) {
		return a(context).getString("key_installed_app_package", null);
	}

}
