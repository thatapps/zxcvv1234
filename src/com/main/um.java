package com.main;

import java.io.File;
import java.lang.reflect.Method;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

public class um {
	private static String a;

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static File a() {
		if (Build.VERSION.SDK_INT >= 19) {
			return new File(Environment.getExternalStorageDirectory().getPath()
					+ "/Android/data/" + um.e() + "/files");
		}
		try {
			Method method = Environment.class.getMethod(
					"getExternalStorageAppFilesDirectory",
					new Class[] { String.class });
			Object[] arrobject = new Object[] { um.e() };
			File file = (File) method.invoke((Object) Environment.class,
					arrobject);
			if (file.exists())
				return file;
			file.mkdirs();
			return file;
		} catch (Exception var1_3) {
			return new File(Environment.getExternalStorageDirectory().getPath()
					+ "/Android/data/" + um.e() + "/files");
		}
	}

	public static String a(String string) {
		return um.b() + string;
	}

	public static String b() {
		return um.a().getAbsolutePath() + "/";
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static File c() {
		if (Build.VERSION.SDK_INT >= 19) {
			try {
				Method method = Environment.class.getMethod(
						"buildExternalStorageAppDataDirs",
						new Class[] { String.class });
				Object[] arrobject = new Object[] { um.e() };
				File file = new File(((File[]) method.invoke(
						(Object) Environment.class, arrobject))[0], "cache");
				return file;
			} catch (Exception var5_4) {
				return new File(Environment.getExternalStorageDirectory()
						.getPath() + "/Android/data/" + um.e() + "/cache");
			}
		}
		try {
			Method method = Environment.class.getMethod(
					"getExternalStorageAppCacheDirectory",
					new Class[] { String.class });
			Object[] arrobject = new Object[] { um.e() };
			File file = (File) method.invoke((Object) Environment.class,
					arrobject);
			if (file.exists())
				return file;
			file.mkdirs();
			return file;
		} catch (Exception var0_7) {
			return new File(Environment.getExternalStorageDirectory().getPath()
					+ "/Android/data/" + um.e() + "/cache");
		}
	}

	public static File d() {
		return new File((Object) Environment.getDataDirectory() + "/data/"
				+ um.e());
	}

	private static String e() {
		if (TextUtils.isEmpty((CharSequence) a)) {
			a = SwipeApplication.e().getPackageName();
		}
		return a;
	}
}
