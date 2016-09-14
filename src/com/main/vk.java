package com.main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import android.animation.Animator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class vk {
	public static Collator a = Collator.getInstance();
	public static final DecimalFormat b = new DecimalFormat("#0.#");
	public static final DecimalFormat c = new DecimalFormat("#");

	public static double a(double d, double d2) {
		return vk.a(0.0, 0.0, d, d2);
	}

	public static double a(double d, double d2, double d3, double d4) {
		return Math.toDegrees((double) Math.atan2((double) (d3 - d),
				(double) (d4 - d2)));
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static float a(float f) {
		if (f < 0.0f) {
			return 0.0f;
		}
		if (f <= 1.0f)
			return f;
		return 1.0f;
	}

	// public static int a(Context context, float f) {
	// return (int) (0.5f + f
	// * context.getResources().getDisplayMetrics().density);
	// }
	public static int a(Context var0, float var1) {
		return (int) (var0.getResources().getDisplayMetrics().density * var1 + 0.5F);
	}

	public static int a(Context context, int n) {
		return (int) (0.5f + (float) n
				/ context.getResources().getDisplayMetrics().density);
	}

	public static int a(Object[] arrobject, String string) {
		if (arrobject != null && string != null) {
			for (int i = -1 + arrobject.length; i >= 0; --i) {
				if (!arrobject[i].toString().equals((Object) string))
					continue;
				return i;
			}
		}
		return -1;
	}

	public static int a(String[] arrstring, String string) {
		if (arrstring != null && string != null) {
			for (int i = -1 + arrstring.length; i >= 0; --i) {
				if (!arrstring[i].equals((Object) string))
					continue;
				return i;
			}
		}
		return -1;
	}

	public static ComponentName a(Context context,
			ActivityManager.RecentTaskInfo recentTaskInfo) {
		return vk.b(context, recentTaskInfo.baseIntent);
	}

	public static ComponentName a(Context context, ComponentName componentName,
			boolean bl) {
		if (vk.a(context, vk.a(componentName))) {
			return componentName;
		}
		if (bl) {
			return vk.g(context, componentName.getPackageName());
		}
		return null;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static ComponentName a(Context context, Intent intent, boolean bl) {
		ComponentName componentName = intent.getComponent();
		if (intent.hasCategory("android.intent.category.LAUNCHER")) {
			return componentName;
		}
		ComponentName componentName2 = vk.b(context, componentName);
		if (componentName2 != null) {
			return componentName2;
		}
		if (!bl)
			return null;
		return componentName;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static ComponentName a(ResolveInfo resolveinfo) {
		String s;
		if (resolveinfo.activityInfo.targetActivity != null) {
			s = resolveinfo.activityInfo.targetActivity;
		} else {
			s = resolveinfo.activityInfo.name;
		}
		return new ComponentName(resolveinfo.activityInfo.packageName, s);
	}

	public static Intent a(PendingIntent pendingIntent) {
		try {
			Method method = PendingIntent.class.getDeclaredMethod("getIntent",
					new Class[0]);
			method.setAccessible(true);
			Intent intent = (Intent) method.invoke((Object) pendingIntent,
					new Object[0]);
			return intent;
		} catch (Throwable var1_3) {
			return null;
		}
	}

	public static Intent a(ComponentName componentName) {
		return vk.a((String) null).setComponent(componentName);
	}

	public static Intent a(Uri uri, String string) {
		return new Intent("android.intent.action.VIEW").addFlags(268435456)
				.setDataAndType(uri, string);
	}

	public static Intent a(String string) {
		Intent intent = new Intent("android.intent.action.MAIN")
				.addCategory("android.intent.category.LAUNCHER");
		if (!TextUtils.isEmpty((CharSequence) string)) {
			intent.setPackage(string);
		}
		return intent;
	}

	public static Intent a(String string, String string2) {
		return vk.a(Uri.parse((String) string), string2);
	}

	public static Drawable a(PackageManager packageManager, String string) {
		return vk.a(packageManager, string, null);
	}

	public static Drawable a(PackageManager packagemanager, String s, String s1) {
		Drawable drawable = null;
		try {
			if (TextUtils.isEmpty(s1) || s1.equals("null")) {
				return packagemanager.getApplicationIcon(s);
			}
			drawable = packagemanager.getActivityInfo(new ComponentName(s, s1),
					16).loadIcon(packagemanager);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.Utils", "Could not get app icon", exception);
			return null;
		}
		return drawable;
	}

	public static Message a(Handler handler, int n, Bundle bundle, Object object) {
		Message message = Message.obtain((Handler) handler, (int) n);
		if (object != null) {
			message.obj = object;
		}
		if (bundle != null) {
			message.setData(bundle);
		}
		return message;
	}

	public static Object a(Collection collection,
			Object... arrobject) {
		if (collection != null) {
			for (Object object : arrobject) {
				if (!collection.contains(object))
					continue;
				return object;
			}
		}
		return null;
	}

	// public static String a(long l, DecimalFormat decimalFormat) {
	// if (decimalFormat == null) {
	// return "" + l + "B";
	// }
	// if (l > 0x40000000) {
	// return decimalFormat.format((double) ((float) l / 1.0737418E9f))
	// + "G";
	// }
	// if (l > 0x100000) {
	// return decimalFormat.format((double) ((float) l / 1048576.0f))
	// + "M";
	// }
	// if (l > 1024) {
	// return decimalFormat.format((double) ((float) l / 1024.0f)) + "K";
	// }
	// return "" + l + "B";
	// }
	public static String a(long l1, DecimalFormat decimalformat) {
		if (decimalformat == null) {
			return (new StringBuilder()).append(l1).append("B").toString();
		}
		if (l1 > 0x40000000L) {
			return (new StringBuilder())
					.append(decimalformat.format((float) l1 / 1.073742E+09F))
					.append("G").toString();
		}
		if (l1 > 0x100000L) {
			return (new StringBuilder())
					.append(decimalformat.format((float) l1 / 1048576F))
					.append("M").toString();
		}
		if (l1 > 1024L) {
			return (new StringBuilder())
					.append(decimalformat.format((float) l1 / 1024F))
					.append("K").toString();
		} else {
			return (new StringBuilder()).append(l1).append("B").toString();
		}
	}

	public static String a(Context context) {
		return vk.c(context).getPackageName();
	}

	// public static String a(Context context, long l) {
	// if (l <= 0) {
	// return "";
	// }
	// long l2 = java.lang.System.currentTimeMillis() - l;
	// if (l2 < 0) {
	// return "";
	// }
	// Resources resources = context.getResources();
	// if (l2 < 60000) {
	// return resources.getString(R.string.notification_time_now);
	// }
	// if (l2 < 3600000) {
	// int n = (int) (l2 / 60000);
	// Object[] arrobject = new Object[] { n };
	// return resources.getQuantityString(
	// R.plurals.notification_time_minutes, n, arrobject);
	// }
	// if (l2 < 86400000) {
	// int n = (int) (l2 / 3600000);
	// Object[] arrobject = new Object[] { n };
	// return resources.getQuantityString(
	// R.plurals.notification_time_hours, n, arrobject);
	// }
	// int n = (int) (l2 / 86400000);
	// Object[] arrobject = new Object[] { n };
	// return resources.getQuantityString(R.plurals.notification_time_days, n,
	// arrobject);
	// }
	public static String a(Context context, long l1) {
		if (l1 <= 0L) {
			return "";
		}
		l1 = System.currentTimeMillis() - l1;
		if (l1 < 0L) {
			return "";
		}
		Resources resources = context.getResources();
		if (l1 < 60000L) {
			return context.getString(0x7f0f0052);
		}
		if (l1 < 0x36ee80L) {
			int i1 = (int) (l1 / 60000L);
			return resources.getQuantityString(0x7f0e0002, i1,
					new Object[] { Integer.valueOf(i1) });
		}
		if (l1 < 0x5265c00L) {
			int j1 = (int) (l1 / 0x36ee80L);
			return resources.getQuantityString(0x7f0e0001, j1,
					new Object[] { Integer.valueOf(j1) });
		} else {
			int k1 = (int) (l1 / 0x5265c00L);
			return resources.getQuantityString(0x7f0e0000, k1,
					new Object[] { Integer.valueOf(k1) });
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public static String a(Context context, String string, String string2)
			throws PackageManager.NameNotFoundException {
		String string4;
		PackageManager packageManager = context.getPackageManager();
		if (!TextUtils.isEmpty((CharSequence) string2)) {
			return vk.a(packageManager, new ComponentName(string, string2));
		}
		try {
			ApplicationInfo applicationInfo = packageManager
					.getApplicationInfo(string, 0);
			String string3 = null;
			if (applicationInfo == null)
				return string3;
			string4 = applicationInfo.loadLabel(packageManager).toString();
		} catch (PackageManager.NameNotFoundException nameNotFoundException) {
			return null;
		}
		if (!string.equals((Object) string4))
			return string4;
		List list = packageManager.queryIntentActivities(vk.a(string), 0);
		if (list == null)
			return string4;
		if (list.size() <= 0)
			return string4;
		ResolveInfo resolveInfo = (ResolveInfo) list.iterator().next();
		if (resolveInfo == null)
			return string4;
		String string5 = resolveInfo.loadLabel(packageManager).toString();
		return string5;
	}

	public static String a(PackageManager packageManager,
			ComponentName componentName) {
		try {
			String string = packageManager.getActivityInfo(componentName, 0)
					.loadLabel(packageManager).toString();
			return string;
		} catch (Throwable var2_3) {
			Log.w((String) "Swipe.Utils", (String) "Could not get app Name",
					(Throwable) var2_3);
			return componentName.getPackageName();
		}
	}

	public static Map a(Map map, Comparator comparator) {
		LinkedList<Map.Entry> linkedList = new LinkedList(
				(Collection) map.entrySet());
		Collections.sort((List) linkedList, (Comparator) comparator);
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		for (Map.Entry entry : linkedList) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		return linkedHashMap;
	}

	public static void a() {
		vk.b();
	}

	public static void a(Activity activity, File file, int n) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setDataAndType(Uri.fromFile((File) file),
				"application/vnd.android.package-archive");
		activity.startActivityForResult(intent, n);
	}

	public static void a(Context context, File file) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setDataAndType(Uri.fromFile((File) file),
				"application/vnd.android.package-archive");
		if (!(context instanceof Activity)) {
			intent.addFlags(268435456);
		}
		context.startActivity(intent);
	}

	public static void a(View view, Runnable runnable) {
		if (Build.VERSION.SDK_INT < 16) {
			view.post(runnable);
			return;
		}
		view.postOnAnimation(runnable);
	}

	public static void a(ViewPropertyAnimator viewpropertyanimator,
			final Runnable runnable) {
		if (viewpropertyanimator == null || runnable == null) {
			return;
		}
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			viewpropertyanimator.withEndAction(new Runnable() {

				final Runnable a;

				public void run() {
					a.run();
				}

				{
					a = runnable;
					// super();
				}
			});
			return;
		} else {
			viewpropertyanimator.setListener(new sy() {

				final Runnable a;

				public void onAnimationEnd(Animator animator) {
					a.run();
				}

				{
					a = runnable;
					// super();
				}
			});
			return;
		}
	}

	public static void a(Iterable iterable, String s) {
		Iterator iterator = iterable.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			if (((ComponentName) iterator.next()).getPackageName().equals(s)) {
				iterator.remove();
			}
		} while (true);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public static void a(String string, Class[] arrclass, Object[] arrobject) {
		try {
			Object object = vk.e("statusbar");
			Class class_ = object.getClass();
			Method method = arrclass == null ? class_.getMethod(string,
					new Class[0]) : class_.getMethod(string, arrclass);
			method.setAccessible(true);
			if (arrclass == null) {
				method.invoke(object, new Object[0]);
				return;
			}
			method.invoke(object, arrobject);
			return;
		} catch (InvocationTargetException var5_6) {
			Log.w((String) "Swipe.Utils", (String) ("Execution of method "
					+ string + " failed"),
					(Throwable) var5_6.getTargetException());
			return;
		} catch (Throwable var3_7) {
			Log.w((String) "Swipe.Utils", (String) ("Execution of method "
					+ string + " failed"), (Throwable) var3_7);
			return;
		}
	}

	public static void a(Throwable throwable) {
		a(throwable, 6, "Swipe.Utils", ((String) (null)));
	}

	public static void a(Throwable throwable, int i1, String s, String s1) {
		String s3;
		switch (i1) {
		case 5: // '\005'
		default:
			String s2 = s1;
			if (TextUtils.isEmpty(s1)) {
				s2 = "Unexpected error";
			}
			vj.a(s, s2, throwable);
			// fall through

		case 2: // '\002'
		case 3: // '\003'
			return;

		case 4: // '\004'
			// throwable = s1;
			if (TextUtils.isEmpty(s1)) {
				String str = "Unexpected error";

				vj.a(s, str);
			}
			return;

		case 6: // '\006'
			s3 = s1;
			break;
		}
		if (TextUtils.isEmpty(s1)) {
			s3 = "Unexpected error";
		}
		vj.b(s, s3, throwable);
	}

	public static void a(Throwable throwable, boolean bl, int n, String string,
			String string2) {
		if (bl) {
			vk.a(throwable, n, string, string2);
		}
	}

	public static boolean a(Context context, ComponentName componentName) {
		return ((DevicePolicyManager) context.getSystemService("device_policy"))
				.isAdminActive(componentName);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static boolean a(Context context, Intent intent) {
		if (intent == null
				|| context.getPackageManager().resolveActivity(intent, 0) == null) {
			return false;
		}
		return true;
	}

	public static boolean a(Context context, Class class_) {
		return vk.c(context).getClassName().equals((Object) class_.getName());
	}

	public static boolean a(Context context, String s) {
		Intent intent = new Intent();
		intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
		intent.setData(Uri.parse((new StringBuilder()).append("package:")
				.append(s).toString()));
		intent.addFlags(0x10000000);
		try {
			context.startActivity(intent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return true;
	}

	public static boolean a(Context context, String s, boolean flag,
			boolean flag1) {
		String s1 = s;
		if (s.charAt(0) != '?') {
			s1 = (new StringBuilder()).append("?id=").append(s).toString();
		}
		Intent intent = (new Intent("android.intent.action.VIEW")).setData(Uri
				.parse((new StringBuilder()).append("market://details")
						.append(s1).toString()));
		if (flag && flag1) {
			intent.setPackage("com.android.vending");
		}
		if (!(context instanceof Activity)) {
			intent.addFlags(0x10000000);
		}
		try {
			context.startActivity(intent);
		} catch (Throwable throwable) {
			if (flag && flag1) {
				return a(context, s1, false, true);
			}
			intent.setData(Uri.parse((new StringBuilder())
					.append("https://play.google.com/store/apps/details")
					.append(s1).toString()));
			try {
				context.startActivity(intent);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return false;
			}
			return true;
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	public static boolean a(Intent intent) {
		boolean flag = false;
		boolean flag1;
		try {
			flag1 = a(((Collection) (SwipeApplication.e().getPackageManager()
					.queryIntentActivities(intent, 0))));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		if (!flag1) {
			flag = true;
		}
		return flag;
	}

	public static boolean a(Object obj, Object obj1) {
		if (obj == null) {
			return obj1 == null;
		} else {
			return obj.equals(obj1);
		}
	}

	public static boolean a(Collection collection) {
		return collection == null || collection.isEmpty();
	}

	public static String[] a(ConnectivityManager connectivityManager) {
		try {
			String[] arrstring = (String[]) uo.a((Object) connectivityManager,
					uo.a(connectivityManager.getClass(),
							"getTetherableBluetoothRegexs"));
			return arrstring;
		} catch (Throwable var1_2) {
			return null;
		}
	}

	public static ComponentName b(Context context, ComponentName componentName) {
		return vk.a(context, componentName, true);
	}

	public static ComponentName b(Context context, Intent intent) {
		return vk.a(context, intent, true);
	}

	public static Intent b(String string) {
		Intent intent = new Intent("android.intent.action.MAIN")
				.addCategory("android.intent.category.HOME");
		if (!TextUtils.isEmpty((CharSequence) string)) {
			intent.setPackage(string);
		}
		return intent;
	}

	public static Drawable b(Context context, String string, String string2) {
		return vk.a(context.getPackageManager(), string, string2);
	}

	public static String b(ResolveInfo resolveInfo) {
		if (resolveInfo.activityInfo.targetActivity == null) {
			return null;
		}
		return resolveInfo.activityInfo.name;
	}

	/*
	 * Exception decompiling
	 */
	public static Set b(Context context) {
		Object obj;
		ActivityManager manager = (ActivityManager) context
				.getSystemService("activity");
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			// break MISSING_BLOCK_LABEL_98;
		}
		obj = manager.getRecentTasks(0x7fffffff, 2);
		if (obj == null) {
			// break MISSING_BLOCK_LABEL_192;
		}
		HashSet hashSet = new HashSet(((List) (obj)).size());
		obj = ((List) (obj)).iterator();
		// _L1:
		android.app.ActivityManager.RecentTaskInfo recenttaskinfo;
		if (!((Iterator) (obj)).hasNext()) {
			// break MISSING_BLOCK_LABEL_96;
		}
		recenttaskinfo = (android.app.ActivityManager.RecentTaskInfo) ((Iterator) (obj))
				.next();
		try {
			hashSet.add(recenttaskinfo.baseIntent.getComponent()
					.getPackageName());
		} catch (Throwable throwable) {
		}

		obj = manager.getRunningAppProcesses();
		if (obj == null) {
			// break MISSING_BLOCK_LABEL_192;
		}

		obj = ((List) (obj)).iterator();
		// _L5:
		String as[];
		int j1;
		if (!((Iterator) (obj)).hasNext()) {
			// break; /* Loop/switch isn't completed */
		}
		as = ((android.app.ActivityManager.RunningAppProcessInfo) ((Iterator) (obj))
				.next()).pkgList;
		j1 = as.length;
		int i1 = 0;
		// _L3:
		if (i1 >= j1) {
			// break; /* Loop/switch isn't completed */
		}
		hashSet.add(as[i1]);
		i1++;

		Log.w("Swipe.Utils", "Could not get running packages");
		return hashSet;
	}

	public static void b() {
		try {
			Runtime.getRuntime().gc();
			return;
		} catch (Throwable var0) {
			return;
		}
	}

	public static void b(Throwable throwable) {
		vk.a(throwable, false, 0, null, null);
	}

	public static void b(Throwable throwable, int n, String string,
			String string2) {
		vk.a(throwable, true, n, string, string2);
	}

	public static boolean b(Context context, String string) {
		if (vk.c(context, string) != null) {
			return true;
		}
		return false;
	}

	/*
	 * Exception decompiling
	 */
	public static ComponentName c(Context context) {

		Object obj;
		Object obj1;
		Throwable throwable;
		ComponentName componentName = null;
		int i1;
		try {
			if (android.os.Build.VERSION.SDK_INT >= 21) {
				// break label0;
			}
			componentName = ((android.app.ActivityManager.RunningTaskInfo) ((ActivityManager) context
					.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.Utils", "Failed to get the foreground component");
			return new ComponentName("DUMMY", "DUMMY");
		}
		if (componentName != null) {
			return componentName;
		}

		obj = ((ActivityManager) context.getSystemService("activity"))
				.getRunningAppProcesses();
		Field field = null;
		try {
			field = android.app.ActivityManager.RunningAppProcessInfo.class
					.getDeclaredField("processState");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = ((List) (obj)).iterator();

		do {
			do {
				if (!((Iterator) (obj)).hasNext()) {
					// break MISSING_BLOCK_LABEL_160;
				}
				obj1 = (android.app.ActivityManager.RunningAppProcessInfo) ((Iterator) (obj))
						.next();
			} while (((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).importance != 100);
			i1 = ((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).importanceReasonCode;
		} while (i1 != 0);
		try {
			if (field.getInt(obj1) != 2) {

			} else {

				obj1 = new ComponentName(
						((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).pkgList[0],
						"");

				vj.a("Swipe.Utils", "Failed to get the foreground package");

				vj.a("Swipe.Utils", "Failed to get the foreground package");
				componentName = new ComponentName("", "");
				return componentName;
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return componentName;
	}

	public static Intent c() {
		return vk.a((String) null);
	}

	public static Intent c(String string) {
		return vk.a(string, null);
	}

	public static PackageInfo c(Context context, String string) {
		try {
			PackageInfo packageInfo = context.getPackageManager()
					.getPackageInfo(string, 0);
			return packageInfo;
		} catch (Exception var2_3) {
			return null;
		}
	}

	public static boolean c(Context context, Intent intent) {
		try {
			if (!(context instanceof Activity || (268435456 & intent.getFlags()) != 0)) {
				intent.addFlags(268435456);
			}
			context.startActivity(intent);
			return true;
		} catch (Throwable var2_2) {
			Log.w((String) "Swipe.Utils",
					(String) ("Failed to start activity: " + (Object) intent),
					(Throwable) var2_2);
			return false;
		}
	}

	public static boolean c(Context context, String string, String string2) {
		return vk.a(context, new ComponentName(string, string2));
	}

	public static Intent d() {
		return vk.b((String) null);
	}

	public static String d(Context context, String string) {
		try {
			return vk.a(context, string, null);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}

	public static void d(String string) {
		vk.a(string, null, null);
	}

	public static boolean d(Context context) {
		if (context instanceof Activity && ((Activity) context).isFinishing()) {
			return true;
		}
		return false;
	}

	public static Drawable e(Context context, String string) {
		return vk.b(context, string, null);
	}

	public static Object e(String s) {
		Class class1 = null;
		try {
			class1 = Class.forName("android.os.ServiceManager");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IBinder iBinder = null;
		try {
			iBinder = (IBinder) class1.getMethod("getService",
					new Class[] { java.lang.String.class }).invoke(class1,
					new Object[] { iBinder });
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			return Class.forName(iBinder.getInterfaceDescriptor()).getClasses()[0]
					.getMethod("asInterface",
							new Class[] { android.os.IBinder.class }).invoke(
							null, new Object[] { iBinder });
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return iBinder;
	}

	public static List e(Context context) {
		try {
			List list = ((SwipeApplication) context.getApplicationContext())
					.b().a.a();
			return list;
		} catch (Exception var1_2) {
			return new ArrayList(0);
		}
	}

	public static boolean e() {
		try {
			BluetoothAdapter bluetoothAdapter = BluetoothAdapter
					.getDefaultAdapter();
			boolean bl = false;
			if (bluetoothAdapter != null) {
				bl = true;
			}
			return bl;
		} catch (Throwable var0_2) {
			return false;
		}
	}

	public static Intent f(String string) {
		return new Intent(string).addFlags(270532608);
	}

	public static void f(Context context) {
		Intent intent = vk.d();
		intent.addFlags(268435456);
		try {
			context.startActivity(intent);
			return;
		} catch (Exception var3_2) {
			return;
		}
	}

	public static boolean f() {
		if (Camera.getNumberOfCameras() > 0) {
			return true;
		}
		return false;
	}

	public static boolean f(Context context, String string) {
		return vk.a(context, string, true, true);
	}

	public static ComponentName g(Context context, String string) {
		for (ResolveInfo resolveInfo : context.getPackageManager()
				.queryIntentActivities(vk.a(string), 0)) {
			if (resolveInfo == null)
				continue;
			return vk.a(resolveInfo);
		}
		return null;
	}

	public static void g() {
		vk.d("toggleRecentApps");
	}

	public static boolean g(Context context) {
		try {
			Intent intent = new Intent("android.intent.action.MAIN");
			intent.addFlags(268468224);
			intent.setComponent(new ComponentName("com.lazyswipe.lock",
					"com.qigame.dockonelock.StartMainActivity"));
			context.startActivity(intent);
			return true;
		} catch (Exception var2_2) {
			return false;
		}
	}

	public static boolean g(String string) {
		return vk.a((Object) Locale.getDefault().getCountry(), (Object) string);
	}

	public static void h() {
		vk.d("expandNotificationsPanel");
	}

	public static boolean h(Context context) {
		try {
			context.getPackageManager().getPackageInfo("com.lazyswipe.lock", 0);
			return true;
		} catch (PackageManager.NameNotFoundException var1_1) {
			return false;
		}
	}

	public static boolean h(Context context, String string) {
		return vk.c(context, vk.f(string));
	}

	public static boolean h(String string) {
		return vk
				.a((Object) Locale.getDefault().getLanguage(), (Object) string);
	}

	public static Intent i() {
		return vk.f("android.settings.SETTINGS");
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public static Map i(String string) {
	// if (TextUtils.isEmpty((CharSequence) string)) {
	// return Collections.emptyMap();
	// }
	// String[] arrstring = string.split("&");
	// if (arrstring == null) {
	// return Collections.emptyMap();
	// }
	// Map map = new HashMap(arrstring.length);
	// for (String string2 : arrstring) {
	// String[] arrstring2;
	// if (TextUtils.isEmpty((CharSequence) string2)
	// || (arrstring2 = string2.split("=")) == null
	// || arrstring2.length != 2)
	// continue;
	// map.put((Object) arrstring2[0].trim(),
	// (Object) arrstring2[1].trim());
	// }
	// return map;
	// }
	public static Map i(String var0) {
		Object var5;
		if (TextUtils.isEmpty(var0)) {
			var5 = Collections.emptyMap();
		} else {
			String[] var4 = var0.split("&");
			if (var4 == null) {
				return Collections.emptyMap();
			}

			HashMap var3 = new HashMap(var4.length);
			int var2 = var4.length;
			int var1 = 0;

			while (true) {
				var5 = var3;
				if (var1 >= var2) {
					break;
				}

				var0 = var4[var1];
				if (!TextUtils.isEmpty(var0)) {
					String[] var6 = var0.split("=");
					if (var6 != null && var6.length == 2) {
						var3.put(var6[0].trim(), var6[1].trim());
					}
				}

				++var1;
			}
		}

		return (Map) var5;
	}

	public static boolean i(Context context) {
		return vk.c(context, "com.lazyswipe.lock",
				"com.qigame.dockonelock.DeviceAdmin");
	}

	public static Intent j(String string) {
		Intent intent = new Intent("android.intent.action.SENDTO");
		intent.setData(Uri.parse((String) "mailto:"));
		intent.putExtra("android.intent.extra.EMAIL", new String[] { string });
		return intent;
	}

	public static String j() {
		Locale locale = Locale.getDefault();
		return locale.getLanguage() + "_" + locale.getCountry();
	}

	public static boolean j(Context context) {
		if (((ConnectivityManager) context.getSystemService("connectivity"))
				.getNetworkInfo(0) != null) {
			return true;
		}
		return false;
	}

	public static boolean k() {
		return vk.g(Locale.CHINA.getCountry());
	}

	public static String[] k(Context context) {
		return vk.a((ConnectivityManager) context
				.getSystemService("connectivity"));
	}

	public static boolean l() {
		return vk.h(Locale.CHINESE.getLanguage());
	}

	public static boolean l(Context context) {
		String[] arrstring = vk.k(context);
		if (arrstring != null && arrstring.length > 0) {
			return true;
		}
		return false;
	}

	public static int m(Context context) {
		return Settings.System.getInt(
				(ContentResolver) context.getContentResolver(),
				(String) "screen_brightness_mode", (int) 0);
	}

	public static String m() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	public static int n(Context context) {
		return Settings.System.getInt(
				(ContentResolver) context.getContentResolver(),
				(String) "screen_brightness", (int) 124);
	}

	/*
	 * Exception decompiling
	 */
	public static String n() {
		Object obj1;
		byte abyte0[];
		obj1 = null;
		abyte0 = new byte[256];
		BufferedInputStream inputStream = null;

		try {
			inputStream = new BufferedInputStream(new FileInputStream(
					"/proc/self/cmdline"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			((BufferedInputStream) (inputStream)).read(abyte0, 0, 255);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i1;
		i1 = 0;
		if (inputStream != null) {
			try {
				((BufferedInputStream) (inputStream)).close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}

		if (inputStream != null) {
			try {
				((BufferedInputStream) (inputStream)).close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}

		do {
			if (i1 >= 256 || abyte0[i1] == 0) {
				byte[] obj = new byte[i1];
				System.arraycopy(abyte0, 0, obj, 0, i1);
				return new String(((byte[]) (obj)));
			}
			i1++;
		} while (true);

	}

	public static boolean o() {
		if (Looper.getMainLooper() == Looper.myLooper()) {
			return true;
		}
		return false;
	}

	public static boolean o(Context context) {
		return vk.h(context, "android.settings.SETTINGS");
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static Vibrator p(Context context) {
		Vibrator vibrator;
		try {
			vibrator = (Vibrator) context.getSystemService("vibrator");
			if (vibrator == null)
				return null;
		} catch (Throwable var1_3) {
			return null;
		}
		boolean bl = vibrator.hasVibrator();
		if (!bl)
			return null;
		return vibrator;
	}

	public static boolean p() {
		try {
			boolean bl = ((PowerManager) SwipeApplication.e().getSystemService(
					"power")).isScreenOn();
			return bl;
		} catch (Throwable var0_1) {
			return true;
		}
	}

}
