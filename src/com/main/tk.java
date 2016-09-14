package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import com.lazyswipe.SwipeApplication;

public class tk extends xh {

	static final int a[] = { 0x7f0a0001, 0x7f0a0002, 0x7f0a0003, 0x7f0a0004,
			0x7f0a0005, 0x7f0a0006, 0x7f0a0007 };
	private int b;

	public tk(String s, int i, int j) {
		String s1 = s.substring(0, 1).toUpperCase();
		int k = Math.abs(s.hashCode());
		int l = a.length;
		b = SwipeApplication.c().getColor(a[k % l]);
		a(s1, a(b), i, j);
	}

	private ShapeDrawable a(final int i) {
		int j = SwipeApplication.e().getResources()
				.getDimensionPixelSize(0x7f0b0055);
		ShapeDrawable shapedrawable = new ShapeDrawable() {

			final int a;
			final tk b;

			public int getIntrinsicHeight() {
				return a;
			}

			public int getIntrinsicWidth() {
				return a;
			}

			{
				b = tk.this;
				a = i;
				// super(shape);
			}
		};
		shapedrawable.getPaint().setColor(i);
		shapedrawable.setBounds(0, 0, j, j);
		return shapedrawable;
	}

	public int a() {
		return b;
	}

}
