package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import com.hola.alliance.AppInfo;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 */

public class iF {
	private static final List a = new ArrayList(
			(Collection) Arrays.asList((Object[]) new String[] {
					"com.lazyswipe", "com.hola.launcher" }));
	private static Thread b;
	private static boolean c;

	public static int a() {
		return 1;
	}

	private static AppInfo a(Context context) {
		AppInfo appInfo = new AppInfo();
		appInfo.a = context.getPackageName();
		appInfo.b = iF.a();
		return appInfo;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static AppInfo a(Intent intent) {
		if (intent == null)
			return null;
		try {
			AppInfo appInfo = (AppInfo) intent
					.getParcelableExtra("source_info");
			if (appInfo == null)
				return null;
			return appInfo;
		} catch (Exception var1_2) {
			ig.a("Alliance", "Error happens.", (Throwable) var1_2);
			return null;
		}
	}

	public static void a(final Context context, final ih ih) {
		if (b != null) {
			return;
		}
		b = new Thread() {

			public void run() {
				try {
					String string = context.getPackageName();
					if (!TextUtils.isEmpty((CharSequence) string)) {
						ArrayList arrayList = new ArrayList((Collection) a);
						if (!c) {
							arrayList.remove((Object) string);
						}
						ij ij = new ij((List) arrayList);
						iF.b(context, ij, ih);
					}
					return;
				} catch (Exception var3_4) {
					ig.a("Alliance", "Error happens.", (Throwable) var3_4);
					return;
				} finally {
					b = null;
				}
			}
		};
		b.start();
	}

	public static void a(boolean bl) {
		c = bl;
		ig.a = bl;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private static boolean a(Context context, String string) {
		PackageInfo packageInfo;
		try {
			PackageInfo packageInfo2;
			packageInfo = packageInfo2 = context.getPackageManager()
					.getPackageInfo(string, 0);
		} catch (PackageManager.NameNotFoundException var2_4) {
			packageInfo = null;
		}
		if (packageInfo == null) {
			ig.a("Alliance", "app " + string + " uninstall!");
			return false;
		}
		ig.a("Alliance", "app " + string + " install!");
		return true;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private static boolean a(Set set, String string) {
		try {
			if (set.contains((Object) string)) {
				ig.a("Alliance", "app " + string + " running!");
				return true;
			}
			ig.a("Alliance", "app " + string + " not running!");
			return false;
		} catch (Exception var2_2) {
			ig.a("Alliance", "Error happens.", (Throwable) var2_2);
			return false;
		}
	}

	/*
	 * Exception decompiling
	 */
	private static void b(Context context, ij ij1, ih ih1) {
		String s;
		int i = 0;
		Iterator iterator;
		HashSet hashset;
		Object obj;
		ii ii1;
		ii1 = new ii();

		if (context != null && ij1 != null) {

			android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
			try {
				context = context.getApplicationContext();
				obj = ik.a(context);
				hashset = new HashSet();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				ig.a("Alliance", "Error happens.");
				return;
			}
			if (obj == null) {
				// break MISSING_BLOCK_LABEL_100;
			}
			obj = ((List) (obj)).iterator();
			do {
				if (!((Iterator) (obj)).hasNext()) {
					break;
				}
				runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo) ((Iterator) (obj))
						.next();
				if (runningappprocessinfo.pkgList != null) {
					hashset.addAll(Arrays.asList(runningappprocessinfo.pkgList));
				}
			} while (true);

			if (ij1.a == null || ij1.a.size() <= 0) {
				// continue; /* Loop/switch isn't completed */
			}
			iterator = ij1.a.iterator();

		} else {
			return;
		}

		if (!iterator.hasNext()) {
			// continue; /* Loop/switch isn't completed */
		}
		s = (String) iterator.next();
		if (TextUtils.isEmpty(s) || !a(context, s)) {

			if (ij1.b <= 0 || i < ij1.b) {

			} else {
				if (ih1 == null) {

					return;
				} else {

					ig.a("Alliance", "Failed to start service.");

					if (ih1 == null) {
						return;
					} else {

						ih1.a(ii1);
						return;

					}
				}

			}

		} else {
			boolean flag = a(hashset, s);
			if (flag) {
				if (ij1.b <= 0 || i < ij1.b) {
					String s1;
					Intent intent;
					AppInfo appinfo;
					s1 = (new StringBuilder()).append(s)
							.append(".action.AllianceService").toString();
					intent = new Intent(s1);
					intent.setPackage(s);
					appinfo = a(context);
					if (appinfo == null) {
						// break MISSING_BLOCK_LABEL_256;
					}
					intent.putExtra("source_info", appinfo);
					ig.a("Alliance",
							(new StringBuilder()).append("start Service: ")
									.append(s1).toString());
					context.startService(intent);
					ii1.a.add(s);
					i++;

				} else {

					return;
				}

			}
		}

	}
}
