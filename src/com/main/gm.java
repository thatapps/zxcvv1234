package com.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

public class gm {
	public static final String a = gm.class.getSimpleName();
	static volatile boolean b = false;
	private static final Collection c;
	private static final Collection d;
	private static String e = null;
	private static boolean f = false;
	private static String g = null;

	static {
		c = new HashSet();
		d = new HashSet();
		d.add("sdk");
		d.add("google_sdk");
		d.add("vbox86p");
		d.add("vbox86tp");
	}

	public static String a() {
		return e;
	}

	private static void a(String paramString) {
		if (b) {
		}

		b = true;
		Log.d(a, "Test mode device hash: " + paramString);
		Log.d(a,
				"When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\""
						+ paramString + "\");");

	}

	public static boolean a(Context paramContext) {
		boolean bool = true;
		if (d.contains(Build.PRODUCT)) {
		}

		if (g == null) {
			SharedPreferences localSharedPreferences = paramContext
					.getSharedPreferences("FBAdPrefs", 0);
			g = localSharedPreferences.getString("deviceIdHash", null);
			if (hh.a(g)) {
				g = hh.b(UUID.randomUUID().toString());
				localSharedPreferences.edit().putString("deviceIdHash", g)
						.apply();
			}
		}
		if (!c.contains(g)) {
			a(g);
			bool = false;
		}
		return bool;
	}

	public static boolean b() {
		return f;
	}
}
