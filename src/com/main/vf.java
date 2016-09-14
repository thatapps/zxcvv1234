package com.main;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.lazyswipe.SwipeApplication;
import java.util.List;
import java.util.Set;

public class vf {

	private static boolean a = false;
	private static boolean b = false;
	private static Set c;
	private static Thread d;
	private static Object e = new Object();

	public static void a() {
		synchronized (e) {
			if (!a) {
				b = false;
				d = new Thread(new vg());
				d.start();
			}
		}
		return;

	}

	public static void a(Context context, ActivityManager activitymanager,
			PackageInfo packageinfo, List list, String s, boolean flag) {
		if (flag && a(context, s) || packageinfo.applicationInfo.flags < 10000
				|| list != null && list.contains(s)) {
			return;
		} else {
			activitymanager.killBackgroundProcesses(s);
			return;
		}
	}

	public static boolean a(Context context, String s) {
		if (c == null) {
			c = ir.S(context);
		}
		return c.contains(s);
	}

	static boolean a(boolean flag) {
		a = flag;
		return flag;
	}

	public static void b() {
		synchronized (e) {
			b = true;
			a = false;
			d = null;
		}
		return;

	}

	public static boolean c() {
		return a;
	}

	static Object d() {
		return e;
	}

	static boolean e() {
		return b;
	}

	static void f() {
		g();
	}

	private static void g() {
		synchronized (e) {
			d = null;
			b = false;
			a = false;
		}
		SwipeApplication obj = SwipeApplication.e();
		Intent intent = new Intent("ACTION_BOOST_LOGIC_FINISH");
		bx.a(((Context) (obj))).a(intent);
		return;

	}

}
