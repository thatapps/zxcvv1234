package com.main;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.Scroller;

@TargetApi(14)
public final class sa {
	static {
		if (Build.VERSION.SDK_INT < 14) {
			throw new RuntimeException(
					"Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
		}
	}

	public static float a(Scroller paramScroller) {
		return paramScroller.getCurrVelocity();
	}
}
