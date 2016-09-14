package com.main;

import android.content.ContentResolver;
import android.content.Context;

public class oq implements Runnable {

	private final boolean a;
	private final int b;
	private final Context c;

	public oq(Context context) {
		this(context, false, -1);
	}

	public oq(Context context, boolean flag, int i) {
		c = context;
		a = flag;
		b = i;
	}

	public static void a(Context context) {
		a(context, -1, false);
	}

	public static void a(Context context, int i, boolean flag) {
		boolean flag2;
		if (i < 0) {
			i = 0;
			boolean flag1 = false;
			do {
				flag2 = flag1;
				if (i >= 3) {
					break;
				}
				if (b(context, i, flag) || flag1) {
					flag1 = true;
				} else {
					flag1 = false;
				}
				i++;
			} while (true);
		} else {
			flag2 = b(context, i, flag);
		}
		if (!flag2) {
			ol ol1 = ol.a(context);
			if (ol1 != null && (ol1.y == null || ol1.y.c <= 0)
					&& (ol1.A == null || ol1.A.c <= 0)) {
				context.getContentResolver().notifyChange(kl.a, null);
			}
			return;
		} else {
			context.getContentResolver().notifyChange(kl.a, null);
			return;
		}
	}

	private static boolean b(Context context, int i, boolean flag) {
		int j = ir.w(context);
		if (ol.t.c(i, j)) {
			long l = 3L + (long) i;
			boolean flag1 = kk.a(context, l, ol.t.g[i]);
			if (flag || flag1) {
				kk.a(context, l);
				int k = ol.a(context, ol.t.a[i], i);
				jc.a(i, k, k, "af");
				return true;
			}
		}
		return false;
	}

	public void run() {
		a(c, b, a);
	}
}
