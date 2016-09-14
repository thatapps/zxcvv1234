package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;

public class xj extends View {

	private Paint a;
	private int b;
	private int c;
	private int d;
	private float e;
	private float f;
	private int g;
	private int h;

	public xj(Context context, int i, int j, int k, int l) {
		super(context);
		a = new Paint();
		float f1 = context.getResources().getDisplayMetrics().density;
		e = 0.889F * f1;
		f = 1.334F * f1;
		b = i;
		c = j;
		d = (int) (f1 * 16F);
		g = k;
		h = l;
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		float f4 = ((float) getMeasuredWidth() - (float) (d * 2))
				/ (float) (b - 1);
		float f5 = f;
		int i = 0;
		while (i < b) {
			float f1;
			float f2;
			float f3;
			Paint paint;
			int j;
			if (i == c) {
				f1 = f;
			} else {
				f1 = e;
			}
			f3 = (float) d + (float) i * f4;
			if (f3 - f1 < 0.0F) {
				f2 = f1;
			} else {
				f2 = f3;
				if (f3 + f1 > (float) getMeasuredWidth()) {
					f2 = (float) getMeasuredWidth() - f1;
				}
			}
			paint = a;
			if (i == c) {
				j = h;
			} else {
				j = g;
			}
			paint.setColor(j);
			canvas.drawCircle(f2, f5 + 1.0F, f1, a);
			i++;
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l) {
		super.onLayout(flag, i, j, k, l);
	}

	protected void onMeasure(int i, int j) {
		super.onMeasure(i, j);
	}
}
