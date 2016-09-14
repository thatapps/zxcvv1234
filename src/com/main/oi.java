package com.main;

import android.content.Context;
import android.content.SharedPreferences;

public final class oi {
	public static long a(Context paramContext, String paramString,
			long paramLong) {
		return a(paramContext).getLong(paramString, paramLong);
	}

	public static SharedPreferences a(Context paramContext) {
		return paramContext.getSharedPreferences("pop_time_preference", 0);
	}

	public static String a(Context paramContext, String paramString1,
			String paramString2) {
		return a(paramContext).getString(paramString1, paramString2);
	}

	public static void a(Context paramContext, String paramString,
			boolean paramBoolean) {
		a(paramContext).edit().putBoolean(paramString, paramBoolean).apply();
	}

	public static void b(Context paramContext, String paramString,
			long paramLong) {
		a(paramContext).edit().putLong(paramString, paramLong).apply();
	}

	public static void b(Context paramContext, String paramString1,
			String paramString2) {
		a(paramContext).edit().putString(paramString1, paramString2).apply();
	}

	public static boolean b(Context paramContext, String paramString,
			boolean paramBoolean) {
		return a(paramContext).getBoolean(paramString, paramBoolean);
	}
}
