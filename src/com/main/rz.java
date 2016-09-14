package com.main;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.Scroller;

@TargetApi(11)
public final class rz {
	static {
		if (Build.VERSION.SDK_INT < 11) {
			throw new RuntimeException(
					"Should not get to HoneycombPlus class unless sdk is >= 11!");
		}
	}

	public static void a(Scroller paramScroller, float paramFloat) {
		if (paramScroller != null) {
			paramScroller.setFriction(paramFloat);
		}
	}
}
