package com.main;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

import com.lazyswipe.zev.R;

public class rm extends Drawable {

	private Paint a;
	private int b;
	private int c;
	private boolean d;

	public rm(int i, int j, boolean flag) {
		b = i;
		c = j;
		d = flag;
		a = new Paint();
		a.setColor(ox.a(0x7f010021));
		a.setStyle(android.graphics.Paint.Style.STROKE);
		a.setAntiAlias(true);
		a.setStrokeWidth(c);
	}

	public void draw(Canvas canvas) {
		float f;
		if (d) {
			f = 0.0F;
		} else {
			f = b;
		}
		canvas.drawCircle(f, b, b - c, a);
	}

	public int getIntrinsicHeight() {
		return b;
	}

	public int getIntrinsicWidth() {
		return b;
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int i) {
	}

	public void setColorFilter(ColorFilter colorfilter) {
	}
}
