package com.main;

import android.graphics.Paint;
import android.view.View;

public class dw {

	static final eg a;

	public static int a(View view) {
		return a.a(view);
	}

	public static void a(View view, int i, Paint paint) {
		a.a(view, i, paint);
	}

	public static void a(View view, Runnable runnable) {
		a.a(view, runnable);
	}

	public static void a(View view, boolean flag) {
		a.a(view, flag);
	}

	public static boolean a(View view, int i) {
		return a.a(view, i);
	}

	public static void b(View view) {
		a.b(view);
	}

	static {
		int i = android.os.Build.VERSION.SDK_INT;
		if (i >= 21) {
			a = new ef();
		} else if (i >= 19) {
			a = new ee();
		} else if (i >= 17) {
			a = new ed();
		} else if (i >= 16) {
			a = new ec();
		} else if (i >= 14) {
			a = new eb();
		} else if (i >= 11) {
			a = new ea();
		} else if (i >= 9) {
			a = new dz();
		} else if (i >= 7) {
			a = new dy();
		} else {
			a = new dx();
		}
	}
}
