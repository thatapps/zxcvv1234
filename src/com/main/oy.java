package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.lazyswipe.SwipeApplication;
import java.lang.ref.WeakReference;

public class oy extends ox {

	public static boolean a = true;
	private static WeakReference b;

	oy(int i, int i1, int j1, String s) {
		super(i, i1, j1, s);
	}

	public static float a(float f) {
		return a(f, 360);
	}

	private static float a(float f, int i) {
		if (a) {
			f = 10800F + f;
			int i1 = (int) f;
			return (float) ((double) f - Math.ceil(f)) + (float) (i1 % i);
		} else {
			return (float) (((int) f + 10800) % i);
		}
	}

	public static float a(boolean flag, float f) {
		if (flag) {
			return f;
		}
		f = a(f);
		if (f >= 0.0F && f < 180F) {
			f = 180F - f;
		} else {
			f = 540F - f;
		}
		return f;
	}

	public static Bitmap a(Bitmap bitmap) {
		int i = bitmap.getWidth();
		Bitmap bitmap1 = Bitmap.createBitmap(i, i,
				android.graphics.Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap1);
		Paint paint = new Paint();
		paint.setFlags(7);
		canvas.setDrawFilter(tf.a);
		paint.setColor(nh.a(SwipeApplication.e(), bitmap));
		canvas.drawCircle(i / 2, i / 2, i / 2, paint);
		int i1 = (i - (int) ((double) i / 1.4139999999999999D)) / 2;
		canvas.drawBitmap(bitmap, new Rect(0, 0, i, i), new Rect(i1, i1,
				i - i1, i - i1), new Paint());
		return bitmap1;
	}

	public static Drawable a(Drawable drawable) {
		Drawable drawable1;
		if (drawable == null) {
			drawable1 = null;
		} else {
			int i1 = drawable.getIntrinsicWidth();
			drawable1 = drawable;
			if (i1 > 0) {
				Bitmap bitmap = Bitmap.createBitmap(i1, i1,
						android.graphics.Bitmap.Config.ARGB_8888);
				Canvas canvas = new Canvas(bitmap);
				Paint paint = new Paint();
				paint.setFlags(7);
				canvas.setDrawFilter(tf.a);
				int i = 0x66ffffff;
				if (drawable instanceof BitmapDrawable) {
					Bitmap bitmap1 = ((BitmapDrawable) drawable).getBitmap();
					i = nh.a(SwipeApplication.e(), bitmap1);
				}
				paint.setColor(i);
				canvas.drawCircle(i1 / 2, i1 / 2, i1 / 2, paint);
				i = (i1 - (int) ((double) i1 / 1.4139999999999999D)) / 2;
				drawable.setBounds(i, i, i1 - i, i1 - i);
				drawable.draw(canvas);
				return new BitmapDrawable(SwipeApplication.c(), bitmap);
			}
		}
		return drawable1;
	}

	public static boolean a() {
		return c() == 9;
	}

	public static float b(float f) {
		return a(f, 270);
	}

	public static float c(float f) {
		return a(f, 1080);
	}

	public static float d(float f) {
		return a(f, 10800);
	}

	public static BitmapDrawable k() {
		if (b != null && b.get() != null
				&& tf.b(((BitmapDrawable) b.get()).getBitmap())) {
			return (BitmapDrawable) b.get();
		} else {
			SwipeApplication swipeapplication = SwipeApplication.e();
			int i = swipeapplication.getResources().getDimensionPixelSize(
					0x7f0b0025);
			Bitmap bitmap = Bitmap.createBitmap(i, i,
					android.graphics.Bitmap.Config.ARGB_8888);
			Canvas canvas = new Canvas(bitmap);
			Paint paint = new Paint();
			paint.setFlags(7);
			canvas.setDrawFilter(tf.a);
			paint.setColor(0x66ffffff);
			canvas.drawCircle(i / 2, i / 2, i / 2, paint);
			b = new WeakReference(new BitmapDrawable(
					swipeapplication.getResources(), bitmap));
			return (BitmapDrawable) b.get();
		}
	}

	public static void l() {
		if (b != null && b.get() != null) {
			tf.a(((BitmapDrawable) b.get()).getBitmap());
		}
	}

	public Bitmap j() {
		Object obj = SwipeApplication.e();
		Bitmap bitmap = ((BitmapDrawable) ((Context) (obj)).getResources()
				.getDrawable(0x7f030000)).getBitmap();
		try {
			int i = ((Context) (obj)).getResources().getDimensionPixelSize(
					0x7f0b0025);
			obj = Bitmap.createBitmap(i, i,
					android.graphics.Bitmap.Config.ARGB_8888);
			Canvas canvas = new Canvas(((Bitmap) (obj)));
			Paint paint = new Paint();
			paint.setFlags(7);
			canvas.setDrawFilter(tf.a);
			canvas.drawCircle(i / 2, i / 2, i / 2, paint);
			paint.setXfermode(new PorterDuffXfermode(
					android.graphics.PorterDuff.Mode.SRC_IN));
			ColorMatrix colormatrix = new ColorMatrix();
			colormatrix.setSaturation(0.0F);
			paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
			paint.setAlpha(75);
			canvas.drawBitmap(bitmap, null, new Rect(0, 0, i, i), paint);
		} catch (Exception exception) {
			return bitmap;
		}
		return ((Bitmap) (obj));
	}

}
