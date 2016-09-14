package com.main;

import android.content.Context;
import android.os.Environment;
import com.lazyswipe.tile.ScreenCaptureActivity;
import com.lazyswipe.ui.DialogActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class qv extends rc {

	public qv(Context context) {
		this(context, null);
	}

	public qv(Context context, rd rd) {
		super(context, rd);
	}

	public static void a(Context context, String s) {
		vi.a(context, (new StringBuilder()).append("Screenshot saved as ")
				.append(s).toString(), 1);
	}

	public static void f(Context context) {
		vi.a(context, "Failed to take a screenshot");
	}

	public static String l() {
		Object obj = new File(
				Environment
						.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
				"Screenshots");
		((File) (obj)).mkdirs();
		String s = ((File) (obj)).getAbsolutePath();
		obj = s;
		if (s.charAt(s.length() - 1) != File.separatorChar) {
			obj = (new StringBuilder()).append(s).append(File.separator)
					.toString();
		}
		return ((String) (obj));
	}

	public static String m() {
		return (new StringBuilder())
				.append((new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US))
						.format(Long.valueOf(System.currentTimeMillis())))
				.append(".png").toString();
	}

	public static String n() {
		return (new StringBuilder()).append(l()).append(m()).toString();
	}

	public int a(Context context) {
		while (android.os.Build.VERSION.SDK_INT >= 21 || ir.y(context)) {
			return 1;
		}
		return 0;
	}

	public int a(boolean flag) {
		return 0x7f02009b;
	}

	public String b() {
		return "Screen capture";
	}

	public int c() {
		return 0x7f0f00be;
	}

	public boolean c(Context context) {
		vi.a(context, 0x7f0f0046);
		return false;
	}

	public boolean e() {
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			ScreenCaptureActivity.a(d);
		} else if (ir.y(d)) {
			ui.a(new Runnable() {

				final qv a;

				public void run() {
					String s = qv.n();
					vb.a(new String[] { (new StringBuilder())
							.append("/system/bin/screencap -p ").append(s)
							.toString() }, true, false);
					if ((new File(s)).exists()) {
						qv.a(a.d, s);
						return;
					} else {
						qv.f(a.d);
						return;
					}
				}

				{
					a = qv.this;
					// super();
				}
			});
		} else {
			DialogActivity.a(d);
		}
		return true;
	}
}
