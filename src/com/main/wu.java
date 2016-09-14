package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public class wu extends Drawable implements Animatable, Runnable {

	private final Drawable a;
	private boolean b;
	private final int c;

	public wu(Context context) {
		b = false;
		Resources resources = context.getResources();
		c = resources.getDimensionPixelSize(0x7f0b002e);
		a = resources.getDrawable(0x7f020028);
		a.setBounds(0, 0, c, c);
	}

	public void draw(Canvas canvas) {
		a.draw(canvas);
	}

	public int getIntrinsicHeight() {
		return c;
	}

	public int getIntrinsicWidth() {
		return c;
	}

	public int getOpacity() {
		return 0;
	}

	public boolean isRunning() {
		return b;
	}

	public void run() {
		int j = a.getLevel() + 500;
		int i = j;
		if (j >= 10000) {
			i = 0;
		}
		a.setLevel(i);
		invalidateSelf();
		scheduleSelf(this, SystemClock.uptimeMillis() + 50L);
	}

	public void setAlpha(int i) {
	}

	public void setColorFilter(ColorFilter colorfilter) {
	}

	public void start() {
		if (!b) {
			b = true;
			run();
		}
	}

	public void stop() {
		if (b) {
			b = false;
			unscheduleSelf(this);
		}
	}
}
