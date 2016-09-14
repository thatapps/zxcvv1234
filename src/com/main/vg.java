package com.main;

import java.util.List;

import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;

import com.lazyswipe.SwipeApplication;

class vg implements Runnable {

	vg() {

	}

	vg(vf _pcls1) {
		this();
	}

	// public void run() {
	// SwipeApplication swipeapplication;
	// Object obj;
	// Object obj1;
	// synchronized (vf.d()) {
	// vf.a(true);
	// }
	// Process.setThreadPriority(10);
	// swipeapplication = SwipeApplication.e();
	// PackageManager packagemanager = swipeapplication.getPackageManager();
	// obj1 = (ActivityManager) swipeapplication.getSystemService("activity");
	// obj = packagemanager.getInstalledPackages(0);
	// int j = ((List) (obj)).size();
	// int i = 0;
	//
	// if (i >= j) {
	// vf.f();
	// if (obj != null) {
	// ((List) (obj)).clear();
	// }
	// if (false) {
	// throw new NullPointerException();
	// }
	//
	// } else {
	// boolean flag = vf.e();
	// if (!flag) {
	//
	// PackageInfo packageinfo = (PackageInfo) ((List) (obj)).get(i);
	// vf.a(swipeapplication, ((ActivityManager) (obj1)), packageinfo,
	// null, packageinfo.packageName, true);
	//
	// } else {
	//
	// vf.f();
	// if (obj != null) {
	// ((List) (obj)).clear();
	// }
	// if (false) {
	// throw new NullPointerException();
	// }
	//
	// }
	//
	// }
	// // _L1:
	// boolean flag = vf.e();
	// if (!flag) {
	//
	// PackageInfo packageinfo = (PackageInfo) ((List) (obj)).get(i);
	// vf.a(swipeapplication, ((ActivityManager) (obj1)), packageinfo,
	// null, packageinfo.packageName, true);
	//
	// } else {
	// vf.f();
	// if (obj != null) {
	// ((List) (obj)).clear();
	// }
	// if (false) {
	// throw new NullPointerException();
	// }
	// }
	//
	// vf.f();
	// if (obj != null) {
	// ((List) (obj)).clear();
	// }
	//
	// vf.f();
	// if (obj != null) {
	// ((List) (obj)).clear();
	// }
	// if (false) {
	// throw new NullPointerException();
	// }
	//
	// }

	public void run() {
		SwipeApplication swipeapplication;
		synchronized (vf.d()) {
			vf.a(true);
		}
		Process.setThreadPriority(10);
		swipeapplication = SwipeApplication.e();
		PackageManager packagemanager = swipeapplication.getPackageManager();
		ActivityManager manager = (ActivityManager) swipeapplication
				.getSystemService("activity");
		List list = packagemanager.getInstalledPackages(0);
		int j = ((List) (list)).size();
		int i = 0;

		while (i < j) {

			{

				boolean flag = vf.e();
				if (!flag) {

					PackageInfo packageinfo = (PackageInfo) ((List) (list))
							.get(i);
					vf.a(swipeapplication, ((ActivityManager) (manager)),
							packageinfo, null, packageinfo.packageName, true);

				} else {

					vf.f();
					if (list != null) {
						((List) (list)).clear();
					}

				}

			}

			i++;
		}

		// _L10:
		// vk.a(((Throwable) (obj2)));
		// vf.f();
		// if (obj != null)
		// {
		// ((List) (obj)).clear();
		// }
		// if (true) goto _L7; else goto _L6

		vf.f();
		if (list != null) {
			((List) (list)).clear();
		}

		// if (true) goto _L9; else goto _L8

	}

}
