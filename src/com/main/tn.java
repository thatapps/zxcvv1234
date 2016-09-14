package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.util.PhoneMemoryUtil;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class tn {
	public static final boolean a;
	public static final int b;
	private static final byte[] c;
	private static long d;

	/*
	 * Enabled aggressive block sorting
	 */
	static {
		boolean bl = (!Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || !Build.MODEL
				.equals((Object) "A0001")
				&& !Build.DEVICE.equals((Object) "A0001"))
				&& (Build.VERSION.SDK_INT < 19
						|| !Build.MANUFACTURER.equalsIgnoreCase("samsung") || !Build.MODEL
						.equals((Object) "m0")
						&& !Build.DEVICE.equals((Object) "m0"));
		a = bl;
		b = 2;
		c = new byte[1024];
		d = -1;
	}

	public static long a() {
		if (d < 0) {
			d = tn.a("/proc/meminfo", new String[] { "MemTotal" });
		}
		return d;
	}

	private static long a(String s, String as[]) {
		long al[];
		boolean flag;
		flag = false;
		al = new long[as.length];
		// FileInputStream fileinputstream = null;
		// try {
		// fileinputstream = new FileInputStream(s);
		// } catch (FileNotFoundException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// //s = fileinputstream;
		// int k1 = 0;
		// try {
		// k1 = fileinputstream.read(c);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// int k = 0;
		// int i1 = 0;
		// int i;
		// int l;
		// i = 0;
		// l = 0;
		// int j1 = 0;
		// i = k + 1;
		// l = i1;
		// if (i >= k1){
		// if (fileinputstream != null)
		// {
		// tq.a(fileinputstream);
		// }
		// }
		// //_L6:
		//
		// k = i;
		// i1 = l;
		// // s = fileinputstream;
		// if (j1 < as.length)
		// {
		// // s = fileinputstream;
		// }
		//
		// if (a(c, k1, i, as[j1]))
		// {
		// // s = fileinputstream;
		// k = i + as[j1].length();
		// // s = fileinputstream;
		// al[j1] = a(c, k1, k);
		// i1 = l + 1;
		// }
		//
		// //_L4:
		// if (k < k1)
		// {
		// //s = fileinputstream;
		// i = c[k];
		// if (i != 10)
		// {
		// k++;
		// }
		//
		// }
		//
		// if (s != null)
		// {
		// // tq.a(s);
		// tq.a(fileinputstream);
		// }
		//
		// j1++;
		//
		//
		// Log.e("Swipe.DeviceInfoUtils", "getStatisticsFromFile error!");
		// if (fileinputstream != null)
		// {
		// tq.a(fileinputstream);
		// }
		// long l1 = 0L;
		// for (int j = ((flag) ? 1 : 0); j < as.length; j++)
		// {
		// l1 += al[j];
		// }
		long beforeMemory = PhoneMemoryUtil
				.getAvailMemory(SwipeApplication.e());
		PhoneMemoryUtil.releaseMemory(SwipeApplication.e());
		// 清理之后内存
		long afterMemory = PhoneMemoryUtil.getAvailMemory(SwipeApplication.e());
		long relaseMemory = afterMemory - beforeMemory;
		if (relaseMemory < 0) {
			relaseMemory = 0;
		}
		return relaseMemory;
	}

	// return l1;

	/* Error */
	// private static long a(String s, String as[]) {
	// long al[];
	// boolean flag;
	// flag = false;
	// al = new long[as.length];
	// FileInputStream fileinputstream = null;
	// try {
	// fileinputstream = new FileInputStream(s);
	// } catch (FileNotFoundException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// // s = fileinputstream;
	// int k1 = 0;
	// try {
	// k1 = fileinputstream.read(c);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// int i;
	// int l;
	// i = 0;
	// l = 0;
	// // _L7:
	// if (i >= k1) {
	//
	// if (fileinputstream != null) {
	// tq.a(fileinputstream);
	// }
	//
	// } else {
	// if (l == as.length) {
	// // break; /* Loop/switch isn't completed */
	// }
	// int j1 = 0;
	// }
	//
	// // s = fileinputstream;
	// if (l == as.length) {
	// // break; /* Loop/switch isn't completed */
	// }
	// int j1 = 0;
	// // _L6:
	// int k;
	// int i1;
	// // k = i;
	// i1 = l;
	// // s = fileinputstream;
	// if (j1 >= as.length) {
	// // break MISSING_BLOCK_LABEL_127;
	// }
	// // s = fileinputstream;
	// if (!a(c, k1, i, as[j1])) {
	// // break MISSING_BLOCK_LABEL_160;
	// }
	// // s = fileinputstream;
	// k = i + as[j1].length();
	// // s = fileinputstream;
	// al[j1] = a(c, k1, k);
	// i1 = l + 1;
	// // _L4:
	// if (k >= k1) {
	// // break; /* Loop/switch isn't completed */
	// }
	// // s = fileinputstream;
	// i = c[k];
	// if (i == 10) {
	// // break; /* Loop/switch isn't completed */
	// }
	// k++;
	//
	// j1++;
	//
	// i = k + 1;
	// l = i1;
	// long l1 = 0L;
	// Log.e("Swipe.DeviceInfoUtils", "getStatisticsFromFile error!");
	// if (fileinputstream != null) {
	// tq.a(fileinputstream);
	// for (int j = ((flag) ? 1 : 0); j < as.length; j++) {
	// l1 += al[j];
	// }
	//
	// return l1;
	// }
	//
	// if (s != null) {
	// tq.a(fileinputstream);
	//
	// for (int j = ((flag) ? 1 : 0); j < as.length; j++) {
	// l1 += al[j];
	// }
	// }
	// return l1;
	// }

	private static long a(byte abyte0[], int i, int j) {
		for (; j < i && abyte0[j] != 10; j++) {
			if (abyte0[j] >= 48 && abyte0[j] <= 57) {
				int k;
				for (k = j + 1; k < i && abyte0[k] >= 48 && abyte0[k] <= 57; k++) {
				}
				return Long.parseLong(new String(abyte0, 0, j, k - j)) * 1024L;
			}
		}

		return 0L;
	}

	public static String a(Context var0) {
		try {
			String var2 = Build.MODEL;
			return var2;
		} catch (Exception var1) {
			Log.e("Swipe.DeviceInfoUtils", "Failed to get the hw info.", var1);
			return "";
		}
	}

	private static boolean a(byte[] var0, int var1, int var2, String var3) {
		int var4 = var3.length();
		if (var2 + var4 < var1) {
			var1 = 0;

			while (true) {
				if (var1 >= var4) {
					return true;
				}

				if (var0[var2 + var1] != var3.charAt(var1)) {
					break;
				}

				++var1;
			}
		}

		return false;
	}

	public static int b() {
		try {
			int n = Build.VERSION.SDK_INT;
			return n;
		} catch (Exception var0_1) {
			return -1;
		}
	}

	public static String b(Context var0) {
		try {
			String var2 = Build.MANUFACTURER;
			return var2;
		} catch (Exception var1) {
			Log.e("Swipe.DeviceInfoUtils", "Failed to get the hw info.", var1);
			return "";
		}
	}

	public static long c(Context var0) {
		return a("/proc/meminfo",
				new String[] { "MemFree", "Cached", "Buffers" });
	}

	public static String d(Context var0) {
		try {
			Display var3 = ((WindowManager) var0.getSystemService("window"))
					.getDefaultDisplay();
			DisplayMetrics var1 = new DisplayMetrics();
			var3.getMetrics(var1);
			String var4 = Integer.toString(var1.densityDpi);
			return var4;
		} catch (Exception var2) {
			return "";
		}
	}
	// private static long a(String s, String as[])
	// {
	// long al[];
	// boolean flag;
	// flag = false;
	// al = new long[as.length];
	// FileInputStream fileinputstream = new FileInputStream(s);
	//
	// int k1 = fileinputstream.read(c);
	// int i;
	// int l;
	// i = 0; int k;
	// int i1;
	// l = 0; int j1 = 0;
	// //_L7:
	// if (i >= k1) {
	//
	// i = k + 1;
	// l = i1;
	//
	//
	//
	// } else {
	//
	//
	// if (l == as.length)
	// {
	// break; /* Loop/switch isn't completed */
	// }
	//
	// }
	// _L1:
	// s = fileinputstream;
	// if (l == as.length)
	// {
	// break; /* Loop/switch isn't completed */
	// }
	// int j1 = 0;
	// _L6:
	//
	// k = i;
	// i1 = l;
	// s = fileinputstream;
	// if (j1 >= as.length)
	// {
	// break MISSING_BLOCK_LABEL_127;
	// }
	// s = fileinputstream;
	// if (!a(c, k1, i, as[j1]))
	// {
	// break MISSING_BLOCK_LABEL_160;
	// }
	// s = fileinputstream;
	// k = i + as[j1].length();
	// s = fileinputstream;
	// al[j1] = a(c, k1, k);
	// i1 = l + 1;
	// _L4:
	// if (k >= k1)
	// {
	// break; /* Loop/switch isn't completed */
	// }
	// s = fileinputstream;
	// i = c[k];
	// if (i == 10)
	// {
	// break; /* Loop/switch isn't completed */
	// }
	// k++;
	// if (true) goto _L4; else goto _L3
	// _L3:
	// break; /* Loop/switch isn't completed */
	// j1++;
	// if (true) goto _L6; else goto _L5
	// _L5:
	// i = k + 1;
	// l = i1;
	// goto _L7
	// _L2:
	// if (fileinputstream != null)
	// {
	// tq.a(fileinputstream);
	// }
	// break MISSING_BLOCK_LABEL_190;
	// Exception exception;
	// exception;
	// fileinputstream = null;
	// _L11:
	// s = fileinputstream;
	// Log.e("Swipe.DeviceInfoUtils", "getStatisticsFromFile error!",
	// exception);
	// if (fileinputstream != null)
	// {
	// tq.a(fileinputstream);
	// }
	// goto _L8
	// as;
	// s = null;
	// _L10:
	// if (s != null)
	// {
	// tq.a(s);
	// }
	// throw as;
	// _L8:
	// long l1 = 0L;
	// for (int j = ((flag) ? 1 : 0); j < as.length; j++)
	// {
	// l1 += al[j];
	// }
	//
	// return l1;
	// as;
	// if (true) goto _L10; else goto _L9
	// _L9:
	// exception;
	// goto _L11
	// }
}
