package com.main;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.lazyswipe.ui.FullscreenTipActivity;

public class rx extends Drawable {

	final FullscreenTipActivity a;
	private final int b;
	private final int c;
	private final int d;
	private final DisplayMetrics e;
	private final Path f;
	private final Paint g;
	private final Bitmap h;
	private final Bitmap i;
	private final Rect j;
	private final Rect k;

	public rx(FullscreenTipActivity fullscreentipactivity, Resources resources,
			int l) {
		super();
		a = fullscreentipactivity;

		e = resources.getDisplayMetrics();
		b = l;
		d = e.widthPixels - b - b;
		int i1 = resources.getDimensionPixelSize(0x7f0b0021);
		c = b + i1;
		f = fullscreentipactivity.a(0, 0, d, c);
		g = fullscreentipactivity.a(e);
		h = tf.a(resources, 0x7f030000);
		i = tf.a(resources, 0x7f02005d);
		l >>= 1;
		j = new Rect(b, l, b + i1, i1 + l);
		if (i != null) {
			l = d - b - i.getWidth();
			int j1 = c - i.getHeight() >> 1;
			k = new Rect(l, j1, i.getWidth() + l, i.getHeight() + j1);
			return;
		} else {
			k = null;
			return;
		}
	}

	public void draw(Canvas canvas) {
		canvas.drawPath(f, g);
		if (h != null) {
			canvas.drawBitmap(h, null, j, g);
		}
		if (i != null) {
			canvas.drawBitmap(i, null, k, g);
		}
	}

	public int getIntrinsicHeight() {
		return c;
	}

	public int getIntrinsicWidth() {
		return d;
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int l) {
	}

	public void setColorFilter(ColorFilter colorfilter) {
	}
}
