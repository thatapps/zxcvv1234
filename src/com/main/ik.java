package com.main;

import java.util.List;

import android.app.ActivityManager;
import android.content.Context;

class ik {
	static List localList1 = null;
	public static List a(Context paramContext) {
		try {
			List localList2 = ((ActivityManager) paramContext
					.getSystemService("activity")).getRunningAppProcesses();
			localList1 = localList2;
		} catch (Exception localException) {
			
		}
		return localList1;
	}
}
