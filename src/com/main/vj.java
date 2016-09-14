package com.main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import android.os.AsyncTask;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

public final class vj {
	public static String a;
	public static String b;
	private static Vector c;
	private static final Date d;
	private static final DateFormat e;
	private static String f;
	private static int g;
	private static int h;
	private static boolean i;

	static {
		c = new Vector();
		d = new Date();
		e = new SimpleDateFormat("MM-dd HH:mm:ss:SSS", Locale.US);
		g = -1;
	}

	public static String a(String string, int n) {
		return vj.a(string, n, false);
	}

	public static String a(String string, int n, boolean bl) {
		long l = System.currentTimeMillis();
		Object[] arrobject = new Object[] { string, l, l, l, l, l, n };
		String string2 = String.format((String) "%s%tm%td_%tH%tM%tS_%03d.txt",
				(Object[]) arrobject);
		if (bl) {
			string2 = a + "/" + string2;
		}
		return string2;
	}

	public static void a() {
		if (i) {
			return;
		}
		i = true;
		long l = System.currentTimeMillis();
		Log.i((String) "Swipe.Trace",
				(String) ("Start removing aged logs in " + a));
		try {
			tq.a(new File(a), 432000000);
			return;
		} catch (Throwable var5_1) {
			return;
		} finally {
			i = false;
			Log.i((String) "Swipe.Trace", (String) ("Removed aged logs in "
					+ (System.currentTimeMillis() - l) + " milliseconds"));
		}
	}

	private static void a(int n, String string, String string2) {
		vj.a(n, string, string2, null);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private static void a(int n, String string, String string2,
			Throwable throwable) {
		if (f != null) {
			if (!f.equals((Object) string))
				return;
		}
		if (-1 != g && g != n) {
			return;
		}
		d.setTime(System.currentTimeMillis());
		StringBuilder stringBuilder = new StringBuilder(e.format(d));
		stringBuilder.append(' ');
		switch (n) {
		default: {
			stringBuilder.append('O');
			break;
		}
		case 2: {
			stringBuilder.append('V');
			break;
		}
		case 5: {
			stringBuilder.append('W');
			break;
		}
		case 6: {
			stringBuilder.append('E');
			break;
		}
		case 3: {
			stringBuilder.append('D');
			break;
		}
		case 4: {
			stringBuilder.append('I');
		}
		}
		stringBuilder.append('/').append(string).append('(')
				.append(Process.myPid()).append("): ");
		if (!TextUtils.isEmpty((CharSequence) string2)) {
			stringBuilder.append(string2);
		}
		if (throwable != null) {
			stringBuilder
					.append(Log.getStackTraceString((Throwable) throwable));
		}
		stringBuilder.append("\r\n");
		c.add((Object) stringBuilder.toString());
		if (c.size() < 50)
			return;
		vj.c();
	}

	public static void a(String string, String string2) {
		Log.i((String) string, (String) string2);
		if (a != null) {
			vj.a(4, string, string2);
		}
	}

	public static void a(String string, String string2, Throwable throwable) {
		Log.w((String) string, (String) string2, (Throwable) throwable);
		if (a != null) {
			vj.a(5, string, string2, throwable);
		}
	}

	// public static void a(String string, boolean bl) {
	// a = string;
	// if (bl) {
	// int n = vk.n().hashCode();
	// if (n > 0) {
	// b = String.valueOf((int) n) + "_";
	// return;
	// }
	// b = String.valueOf((int) Math.abs((int) n)) + "__";
	// return;
	// }
	// b = "";
	// }
	public static void a(String s, boolean flag) {
		a = s;
		if (flag) {
			int j = vk.n().hashCode();
			if (j > 0) {
				b = (new StringBuilder()).append(String.valueOf(j)).append("_")
						.toString();
				return;
			} else {
				b = (new StringBuilder()).append(String.valueOf(Math.abs(j)))
						.append("__").toString();
				return;
			}
		} else {
			b = "";
			return;
		}
	}

	@SuppressWarnings("rawtypes")
	static void a(Vector vector) {
		Object obj;
		Object obj1;
		Throwable throwable;
		Object obj2;
		obj1 = null;
		throwable = null;
		obj2 = null;
		obj = throwable;
		if (!ur.a(a)) {

			obj = throwable;
			obj1 = new File(a);
			obj = throwable;
			if (!((File) (obj1)).exists()) {
				obj = throwable;
				try {
					((File) (obj1)).mkdirs();
					/* Loop/switch isn't completed */
				}
				// Misplaced declaration of an exception variable
				catch (Throwable ext) {
					obj1 = obj2;
				} finally {
				}

			} else {

				obj = throwable;
				if (((File) (obj1)).isDirectory()) {
					// MISSING_BLOCK_LABEL_71;
				}
				obj = throwable;
				((File) (obj1)).delete();
				obj = throwable;
				((File) (obj1)).mkdirs();

			}

		} else {

			obj = throwable;
			if (!ur.b()) {
				if (obj1 != null) {
					tq.a(((java.io.Closeable) (obj1)));
				}
				vector.clear();
				return;

			} else {
				obj = throwable;
				obj1 = new File(a);
				obj = throwable;
				if (!((File) (obj1)).exists()) {

					obj = throwable;
					try {
						((File) (obj1)).mkdirs();
						// continue; /* Loop/switch isn't completed */
					}
					// Misplaced declaration of an exception variable
					catch (Throwable ect) {
						obj1 = obj2;
					}

				} else {

					obj = throwable;
					if (((File) (obj1)).isDirectory()) {
						// / break MISSING_BLOCK_LABEL_71;
					}
					obj = throwable;
					((File) (obj1)).delete();
					obj = throwable;
					((File) (obj1)).mkdirs();

				}

			}
		}

		obj = throwable;
		int j = h + 1;
		obj = throwable;
		h = j;
		if (j < 1000) {
			// break MISSING_BLOCK_LABEL_101;
		}
		obj = throwable;
		h = 1;
		obj = throwable;
		obj1 = new File(((File) (obj1)), a(b, h));
		obj = throwable;
		if (((File) (obj1)).exists()) {
			// break MISSING_BLOCK_LABEL_137;
		}
		obj = throwable;
		try {
			((File) (obj1)).createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = throwable;
		try {
			obj1 = new BufferedOutputStream(new FileOutputStream(
					((File) (obj1))));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			for (obj = vector.iterator(); ((Iterator) (obj)).hasNext(); ((OutputStream) (obj1))
					.write(((String) ((Iterator) (obj)).next()).getBytes())) {
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		obj = obj1;
		Log.w("Swipe.Trace", "Failed to save cached logs", throwable);
		if (obj1 != null) {
			tq.a(((java.io.Closeable) (obj1)));
		}
	}

	public static void b() {
		AsyncTask.execute((Runnable) new Runnable() {

			public void run() {
				vj.a();
			}
		});
	}

	public static void b(String string, String string2) {
		vj.a(string, string2, null);
	}

	public static void b(String string, String string2, Throwable throwable) {
		Log.e((String) string, (String) string2, (Throwable) throwable);
		if (a != null) {
			vj.a(6, string, string2, throwable);
		}
	}

	public static void c() {
		if (c.size() <= 0) {
			return;
		}
		final Vector vector = (Vector) c.clone();
		c.clear();
		AsyncTask.execute((Runnable) new Runnable() {

			public void run() {
				vj.a(vector);
			}
		});
	}

	public static void c(String string, String string2) {
		vj.b(string, string2, null);
	}

	public static void d() {
		vj.a(c);
	}
}
