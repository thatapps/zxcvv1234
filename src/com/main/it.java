package com.main;

import android.net.Uri;
import android.util.Log;

import com.lazyswipe.SwipeService;

public final class it implements Runnable {

	public static SwipeService a;
	private final Uri b;
	private final boolean c;

	it(SwipeService swipeservice, Uri uri) {
		this(swipeservice, uri, false);
	}

	it(SwipeService swipeservice, Uri uri, boolean flag) {
		super();
		a = swipeservice;

		b = uri;
		c = flag;
	}

	public void run() {
		if (!c && (a.b == null || !ir.C(a))) {
			return;
		}
		try {
			SwipeService.a(a, a.f, a.g);
			a.d = false;
			a.u();
			return;
		} catch (Throwable throwable) {
			Log.w("Swipe.Service", "Could not get unread SMS messages",
					throwable);
		}
	}
}
