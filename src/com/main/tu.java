package com.main;

import android.content.Context;

public abstract class tu {
	private static tw a;
	private static final Object b = new Object();

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public static tw a(Context context) {
		synchronized (b) {
			if (a == null) {
				a = new vl(context);
			}
		}
		return a;

	}

	public static boolean a(String string) {
		if (string.startsWith("market://details")
				|| string
						.startsWith("http://play.google.com/store/apps/details")
				|| string
						.startsWith("https://play.google.com/store/apps/details")) {
			return true;
		}
		return false;
	}

	public static String b(String string) {
		if (string.startsWith("https://play.google.com/store/apps/details")) {
			return string
					.substring("https://play.google.com/store/apps/details"
							.length());
		}
		if (string.startsWith("market://details")) {
			return string.substring("market://details".length());
		}
		if (string.startsWith("http://play.google.com/store/apps/details")) {
			return string.substring("http://play.google.com/store/apps/details"
					.length());
		}
		return null;
	}
}
