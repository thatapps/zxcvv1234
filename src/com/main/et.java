package com.main;

import android.content.Context;
import android.graphics.Canvas;

public class et {

	private static final ew b;
	private Object a;

	public et(Context context) {
		a = b.a(context);
	}

	public void a(int i, int j) {
		b.a(a, i, j);
	}

	public boolean a() {
		return b.a(a);
	}

	public boolean a(float f) {
		return b.a(a, f);
	}

	public boolean a(int i) {
		return b.a(a, i);
	}

	public boolean a(Canvas canvas) {
		return b.a(a, canvas);
	}

	public void b() {
		b.b(a);
	}

	public boolean c() {
		return b.c(a);
	}

	static {
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			b = new ex();
		} else if (android.os.Build.VERSION.SDK_INT >= 14) {
			b = new ev();
		} else {
			b = new eu();
		}
	}
}
