package com.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

import com.lazyswipe.zev.R;

public class md extends Drawable {

	Path a;
	Paint b;
	int c;
	int d;

	md() {
	}

	public static md a(Context context, int i) {
		int j = context.getResources().getDimensionPixelSize(0x7f0b0063);
		int k = context.getResources().getDimensionPixelSize(0x7f0b0062);
		Path path = new Path();
		path.moveTo(j, j - k);
		path.lineTo(j, (j >> 1) - k);
		path.lineTo(j >> 1, j - k);
		path.close();
		return (new me(context)).a(j, j).b(0x7f0b0064).a(i).a(path).a();
	}

	public void draw(Canvas canvas) {
		if (a == null) {
			return;
		} else {
			canvas.drawPath(a, b);
			return;
		}
	}

	public int getIntrinsicHeight() {
		return d;
	}

	public int getIntrinsicWidth() {
		return c;
	}

	public int getOpacity() {
		return -3;
	}

	public void setAlpha(int i) {
		b.setAlpha(i / 255);
	}

	public void setColorFilter(ColorFilter colorfilter) {
	}
}
