package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

class wf extends Drawable {

	private int a;
	private long b;
	private long c;
	private float d;
	private float e;
	private Paint f;
	private RectF g;
	private int h;
	private int i;
	private Point j;
	private int k;
	private Interpolator l;
	private Interpolator m;

	public wf(Context context) {
		this(
				context,
				(int) (context.getResources().getDisplayMetrics().density * 40F));
	}

	public wf(Context context, int i1) {
		b = -1L;
		g = new RectF();
		j = new Point();
		k = 0;
		a = i1;
		f = new Paint(1);
		f.setStyle(android.graphics.Paint.Style.STROKE);
		f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
		f.setColor(context.getResources().getColor(0x7f0a001a));
		d = (i1 * 2) / 5;
		e = d / 10F;
		f.setStrokeWidth(e);
		k = 1;
		l = new AccelerateInterpolator(1.25F);
		m = new DecelerateInterpolator(1.25F);
		h = 0xffefefef;
		i = context.getResources().getColor(0x7f0a001a);
	}

	private float a(float f1) {
		if (f1 <= 0.5F) {
			return l.getInterpolation(f1 * 2.0F) / 2.0F;
		} else {
			return m.getInterpolation(f1 * 2.0F - 1.0F) / 2.0F + 0.5F;
		}
	}

	private void a() {
		float f1 = (float) (c - b) % 1250F;
		j.x = (int) (a(Math.min(f1 / 1000F, 1.0F)) * 360F) + k;
		j.y = (int) (a(Math.max((f1 - 250F) / 1000F, 0.0F)) * 360F) - k;
	}

	private int b() {
		return (int) ((((float) (c - b) % 2500F) / 2500F) * 360F);
	}

	public void draw(Canvas canvas) {
		c = System.currentTimeMillis();
		if (b < 0L) {
			b = c;
		}
		Rect rect = getBounds();
		float f1 = rect.exactCenterX();
		float f2 = rect.exactCenterY();
		g.set(f1 - d, f2 - d, d + f1, d + f2);
		f.setColor(h);
		canvas.drawCircle(f1, f2, d, f);
		canvas.save();
		canvas.rotate(b(), g.centerX(), g.centerY());
		f.setColor(i);
		a();
		canvas.drawArc(g, j.x - 90, j.y - j.x, false, f);
		canvas.restore();
	}

	public int getIntrinsicHeight() {
		return a;
	}

	public int getIntrinsicWidth() {
		return a;
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int i1) {
	}

	public void setColorFilter(ColorFilter colorfilter) {
	}
}
