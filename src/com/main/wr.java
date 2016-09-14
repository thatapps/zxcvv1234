package com.main;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Scroller;

import com.lazyswipe.widget.GridGallery;

public class wr implements Runnable {

	final GridGallery a;
	private Scroller b;
	private int c;

	public wr(final GridGallery gridgallery) {
		super();
		a = gridgallery;

		b = new Scroller(gridgallery.getContext(), new Interpolator() {

			final GridGallery a;
			final wr b;

			public float getInterpolation(float f) {
				f--;
				return f * (f * f * f * f) + 1.0F;
			}

			{
				b = wr.this;
				a = gridgallery;
				// super();
			}
		});
	}

	private void c() {
		vk.a(a, this);
	}

	public void a() {
		b.abortAnimation();
		GridGallery.d(a);
		a.removeCallbacks(this);
	}

	public void a(int i, int j, float f) {
		b.abortAnimation();
		a.removeCallbacks(this);
		if (j == 0) {
			GridGallery.d(a);
			return;
		}
		c = i;
		int k;
		if (f == 0.0F) {
			k = 500;
		} else {
			k = (int) ((float) (a.getWidth() * 2000) / Math.abs(f));
		}
		k = Math.min(500, k);
		if (GridGallery.e(a)) {
			b.startScroll(i, 0, j, 0, k);
		} else {
			b.startScroll(0, i, 0, j, k);
		}
		c();
	}

	public boolean b() {
		return b.isFinished();
	}

	public void run() {
		if (b.computeScrollOffset()) {
			int i;
			int j;
			if (GridGallery.e(a)) {
				i = b.getCurrX();
			} else {
				i = b.getCurrY();
			}
			j = c;
			c = i;
			GridGallery.b(a, i - j);
			c();
			return;
		} else {
			GridGallery.d(a);
			return;
		}
	}
}