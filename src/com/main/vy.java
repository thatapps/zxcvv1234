package com.main;

import java.io.File;

public class vy {
	public static Long a(File file) {
		return tq.f(file);
	}

	public static boolean a(File file, String string) {
		Long l;
		if (string == null
				|| (l = vy.a(file)) != null
				&& (string.equals((Object) l.toString()) || Long.toHexString(
						(long) l).equalsIgnoreCase(string))) {
			return true;
		}
		return false;
	}
}
