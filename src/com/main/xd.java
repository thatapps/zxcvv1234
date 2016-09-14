package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import com.lazyswipe.SwipeApplication;
import java.util.Arrays;

public class xd extends ShapeDrawable {

	private Paint a;

	public xd(Shape shape, float f, int i) {
		super(shape);
		a(f, i);
	}

	public static xd a(int i, float f) {
		Object obj = SwipeApplication.e();
		float af[] = new float[8];
		Arrays.fill(af, f);
		int j = ((Context) (obj)).getResources().getDimensionPixelSize(
				0x7f0b0054);
		new RectF(j, j, j, j);
		obj = new xd(new RoundRectShape(af, null, null), j, i);
		Paint paint = ((xd) (obj)).getPaint();
		paint.setColor(i);
		paint.setStyle(android.graphics.Paint.Style.FILL);
		return ((xd) (obj));
	}

	private void a(float f, int i) {
		a = new Paint(getPaint());
		a.setStyle(android.graphics.Paint.Style.STROKE);
		a.setColor(i);
		a.setStrokeWidth(f);
	}

	public static xd b(int i, float f) {
		Object obj = SwipeApplication.e();
		float af[] = new float[8];
		Arrays.fill(af, f);
		int j = ((Context) (obj)).getResources().getDimensionPixelSize(
				0x7f0b0054);
		obj = new xd(new RoundRectShape(af, new RectF(j, j, j, j), null), j, i);
		Paint paint = ((xd) (obj)).getPaint();
		paint.setColor(i);
		paint.setStyle(android.graphics.Paint.Style.STROKE);
		return ((xd) (obj));
	}

	protected void onDraw(Shape shape, Canvas canvas, Paint paint) {
		super.onDraw(shape, canvas, paint);
		shape.draw(canvas, a);
	}
}
