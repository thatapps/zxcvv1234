package com.main;

import com.lazyswipe.SwipeApplication;

public class ss {

	public static final String a = (new StringBuilder()).append("Swipe.")
			.append(ss.class.getSimpleName()).toString();

	public ss() {
	}

	public static void a() {
		SwipeApplication swipeapplication = SwipeApplication.e();
		long l = ir.a(swipeapplication, "ALLIANCE_LAST_TIME", 0L);
		long l1 = System.currentTimeMillis();
		if (l < l1 && l1 - l < 0x5265c00L) {
			return;
		} else {
			ir.b(swipeapplication, "ALLIANCE_LAST_TIME",
					System.currentTimeMillis());
			iF.a(false);
			iF.a(swipeapplication, new st());
			return;
		}
	}
}
