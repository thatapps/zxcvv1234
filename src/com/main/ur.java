package com.main;

import java.util.HashSet;
import java.util.Set;

import android.os.Environment;

public class ur {
	private static final Set a = new HashSet();
	private static final Set b = new HashSet();

	static {
		a.add((Object) "mounted");
		a.add((Object) "mounted_ro");
		b.add((Object) "mounted");
	}

	public static String a() {
		try {
			String string = Environment.getExternalStorageState();
			return string;
		} catch (Exception var0_1) {
			return "";
		}
	}

	public static boolean a(String string) {
		return string.startsWith(Environment.getExternalStorageDirectory()
				.getPath());
	}

	public static boolean b() {
		return "mounted".equals((Object) ur.a());
	}

	public static boolean c() {
		return b.contains((Object) ur.a());
	}
}
