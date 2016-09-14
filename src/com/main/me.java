package com.main;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;

public class me {

	private final Context a;
	private int b;
	private int c;
	private int d;
	private int e;
	private Path f;
	private Paint g;

	public me(Context context) {
		a = context;
	}

	public md a() {
		md md1 = new md();
		md1.c = c;
		md1.d = d;
		Paint paint;
		if (g == null) {
			paint = b();
		} else {
			paint = g;
		}
		md1.b = paint;
		md1.a = f;
		return md1;
	}

	public me a(int i) {
		b = a.getResources().getColor(i);
		return this;
	}

	public me a(int i, int j) {
		c = i;
		d = j;
		return this;
	}

	public me a(Path path) {
		f = path;
		return this;
	}

	protected Paint b() {
		Paint paint = new Paint(1);
		paint.setStyle(android.graphics.Paint.Style.FILL);
		paint.setStrokeWidth(e);
		paint.setColor(b);
		return paint;
	}

	public me b(int i) {
		e = a.getResources().getDimensionPixelSize(i);
		return this;
	}
}
