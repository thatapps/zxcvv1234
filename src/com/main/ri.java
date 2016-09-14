package com.main;

import android.animation.TimeInterpolator;

import com.lazyswipe.tile.booster.ui.BoostingCircular;

public class ri implements TimeInterpolator {

	float a;
	float b;
	float c;
	float d;
	float e;
	float f;
	float g;
	float h;
	boolean i;

	public ri() {
		a = 0.96F;
		b = 0.975F;
		c = -0.18F;
		d = 0.0F;
		e = 0.0F;
		f = 0.0F;
		g = 0.0F;
		h = 0.0F;
		double d1;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		float f8;
		d = 1.0F / (a * a);
		f1 = a - 1.0F;
		f2 = a * a - b * b;
		f3 = a;
		f4 = a;
		f5 = a;
		f6 = b;
		f7 = b;
		f8 = b;
		d1 = 1.0F - c;
		double d2 = f2;
		double d3 = f1;
		double d4 = f3 * f4 * f5 - f6 * f7 * f8;
		double d5 = f2;
		try {
			e = (float) (((d1 + d2 * 0.5D) - d3 * 0.5D) / ((double) f1 * 0.5D + (d4 - d5 * 1.5D)));
			f = (float) (-0.5D - (double) e * 1.5D);
			g = (float) ((double) e * 0.5D + 0.5D);
			h = 1.0F - e * a * a * a - f * a * a - g * a;
			i = true;
			return;
		} catch (Exception exception) {
			i = false;
		}
		return;
	}

	public ri(com.lazyswipe.tile.booster.ui.BoostingCircular _pcls1) {
		this();
	}

	public float getInterpolation(float f1) {
		if (!i) {
			return (float) (1.0D - 4D * ((double) f1 - 0.5D)
					* ((double) f1 - 0.5D));
		}
		if (f1 < a) {
			return 1.0F - (f1 - a) * (f1 - a) * d;
		} else {
			float f2 = f1 * f1;
			float f3 = e;
			return f2 * f + f2 * f1 * f3 + g * f1 + h;
		}
	}
}
