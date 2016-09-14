package com.main;

import android.view.VelocityTracker;

public class dr {

	static final du a;

	public static float a(VelocityTracker velocitytracker, int i) {
		return a.a(velocitytracker, i);
	}

	static {
		if (android.os.Build.VERSION.SDK_INT >= 11) {
			a = new dt();
		} else {
			a = new ds();
		}
	}
}
