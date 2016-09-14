package com.main;

import android.os.Handler;
import android.os.HandlerThread;

public class ui {

	private static final HandlerThread a;
	private static final Handler b;

	public static void a(Handler handler, Runnable runnable) {
		a(handler, runnable, 0L);
	}

	public static void a(Handler handler, Runnable runnable, long l) {
		a(handler, runnable, false, l);
	}

	public static void a(Handler handler, Runnable runnable, boolean flag,
			long l) {
		Handler handler1 = handler;
		if (handler == null) {
			handler1 = b;
		}
		if (flag) {
			handler1.removeCallbacks(runnable);
		}
		handler1.postDelayed(runnable, l);
	}

	public static void a(Runnable runnable) {
		a(runnable, 0L);
	}

	public static void a(Runnable runnable, long l) {
		a(null, runnable, l);
	}

	static {
		a = new HandlerThread("Swipe.Daemon");
		a.setPriority(10);
		a.start();
		b = new Handler(a.getLooper());
	}
}