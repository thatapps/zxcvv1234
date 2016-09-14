package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public final class tm {
	WeakReference a;
	String b;
	String c;
	int d;
	boolean e;
	String f;

	public tm(Context context, String string, String string2, int n, boolean bl) {
		this(context, string, string2, n, bl, "0");
	}

	public tm(Context context, String string, String string2, int n,
			boolean bl, String string3) {
		this.a = new WeakReference((Object) context);
		this.b = string;
		this.c = string2;
		this.d = n;
		this.e = bl;
		this.f = string3;
	}

	public static void a(Context context) {
		if (Build.VERSION.SDK_INT < 12) {
			return;
		}
		tm.b(context);
		File file = new File(context.getFilesDir(), "pid");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] arrby = new byte[16];
			Process.killProcess((int) Integer.parseInt((String) tg.a(arrby, 0,
					fileInputStream.read(arrby, 0, 16))));
			return;
		} catch (Exception var3_4) {
			vj.a("Swipe.Daemon", "Failed to stop daemon", (Throwable) var3_4);
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void b() {
		if (a.get() == null) {
			return;
		}
		StringBuilder stringbuilder = new StringBuilder(
				((Context) a.get()).getApplicationInfo().nativeLibraryDir);
		stringbuilder.append('/').append("libdaemon.so").append(' ').append(b)
				.append(' ').append(c).append(' ').append(d);
		StringBuilder stringbuilder1;
		int i;
		if (android.os.Build.VERSION.SDK_INT >= 17) {
			long l = ((UserManager) ((Context) a.get())
					.getSystemService("user")).getSerialNumberForUser(Process
					.myUserHandle());
			stringbuilder.append(' ').append(l);
		} else {
			stringbuilder.append(" -10000");
		}
		stringbuilder1 = stringbuilder.append(' ');
		if (e) {
			i = 1;
		} else {
			i = 0;
		}
		stringbuilder1.append(i).append(' ').append(f);
		vb.a(stringbuilder.toString(), false, false);
	}

	private static void b(Context context) {
		vb.a(context.getApplicationInfo().nativeLibraryDir + '/'
				+ "libdaemon.so" + " kill", false, false);
	}

	public void a() {
		this.a(0);
	}

	public void a(final long l) {
		if (Build.VERSION.SDK_INT >= 12) {
			AsyncTask.execute((Runnable) new Runnable() {

				public void run() {
					try {
						if (l > 0) {
							Thread.sleep((long) l);
						}
						tm.this.b();
						return;
					} catch (Throwable var1_1) {
						return;
					}
				}
			});
		}
	}

}
