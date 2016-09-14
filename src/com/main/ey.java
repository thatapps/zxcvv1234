package com.main;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class ey {

	public static Object a(Context context) {
		return new EdgeEffect(context);
	}

	public static void a(Object obj, int i, int j) {
		((EdgeEffect) obj).setSize(i, j);
	}

	public static boolean a(Object obj) {
		return ((EdgeEffect) obj).isFinished();
	}

	public static boolean a(Object obj, float f) {
		((EdgeEffect) obj).onPull(f);
		return true;
	}

	public static boolean a(Object obj, int i) {
		((EdgeEffect) obj).onAbsorb(i);
		return true;
	}

	public static boolean a(Object obj, Canvas canvas) {
		return ((EdgeEffect) obj).draw(canvas);
	}

	public static void b(Object obj) {
		((EdgeEffect) obj).finish();
	}

	public static boolean c(Object obj) {
		obj = (EdgeEffect) obj;
		((EdgeEffect) (obj)).onRelease();
		return ((EdgeEffect) (obj)).isFinished();
	}
}
