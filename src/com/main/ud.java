package com.main;

import java.lang.ref.WeakReference;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

public class ud extends BitmapDrawable {

	private final WeakReference a;

	public ud(Resources resources, Bitmap bitmap, uf uf1) {
		super(resources, bitmap);
		a = new WeakReference(uf1);
	}

	public uf a() {
		return (uf) a.get();
	}

	public void draw(Canvas canvas) {
		Bitmap bitmap = getBitmap();
		if (bitmap == null || bitmap.isRecycled()) {
			return;
		} else {
			super.draw(canvas);
			return;
		}
	}
}
