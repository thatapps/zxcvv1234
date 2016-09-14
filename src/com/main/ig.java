package com.main;

import android.util.Log;

class ig {
	public static boolean a = false;

	public static void a(String paramString1, String paramString2) {
		if (a) {
			Log.i(paramString1, paramString2);
		}
	}

	public static void a(String paramString1, String paramString2,
			Throwable paramThrowable) {
		if (a) {
			Log.e(paramString1, paramString2, paramThrowable);
		}
	}
}
