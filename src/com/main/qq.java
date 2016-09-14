package com.main;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

class qq implements Runnable {

	private final WeakReference a;

	qq(qp qp1) {
		a = new WeakReference(qp1);
	}

	public void run() {
		if (a.get() != null) {
			PackageManager packagemanager = ((qp) a.get()).a
					.getPackageManager();
			boolean flag;
			if (packagemanager.checkPermission(
					"android.permission.MODIFY_PHONE_STATE", "com.lazyswipe") != 0) {
				vb.a("pm grant com.lazyswipe android.permission.MODIFY_PHONE_STATE",
						true, false);
				Throwable throwable;
				if (packagemanager.checkPermission(
						"android.permission.MODIFY_PHONE_STATE",
						"com.lazyswipe") != 0) {
					vj.b("Swipe.MobileDataManager",
							"Unfortunately we have NO permission to enable mobile data!");
					flag = false;
				} else {
					flag = true;
				}
			} else {
				flag = true;
			}
			if (flag) {
				try {
					qp.a((qp) a.get(), android.telephony.TelephonyManager.class
							.getDeclaredMethod("setDataEnabled",
									new Class[] { Boolean.TYPE }));
					qp.a((qp) a.get()).setAccessible(true);
					return;
				}
				// Misplaced declaration of an exception variable
				catch (Throwable throwable) {
					return;
				}
			}
		}
	}
}
