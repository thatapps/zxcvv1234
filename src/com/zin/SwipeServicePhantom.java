package com.lazyswipe;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.main.ir;
import com.main.to;

public final class SwipeServicePhantom extends Service {

	public SwipeServicePhantom() {
	}

	public IBinder onBind(Intent intent) {
		return null;
	}

	public int onStartCommand(Intent intent, int i, int j) {
		i = 1;
		if (intent == null || !intent.getBooleanExtra("isDaemon", false)) {
			i = 0;
		}
		if (i != 0) {
			if (ir.L(this) && SwipeService.o() == null
					&& (!to.k() || to.a(this))) {
				SwipeService.c(this);
			}
		} else {
			try {
				startForeground(1, SwipeService.f(this));
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
			try {
				stopForeground(true);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}
		stopSelf();
		return 2;
	}
}
