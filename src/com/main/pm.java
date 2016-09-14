package com.main;

import java.lang.ref.WeakReference;

import android.os.Handler;
import android.os.Message;
import android.view.View;

class pm extends Handler {
	private WeakReference a;

	pm(pl pl) {
		this.a = new WeakReference((Object) pl);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void handleMessage(Message message) {
		if (this.a == null)
			return;
		if (this.a.get() == null) {
			return;
		}
		pl pl = (pl) this.a.get();
		switch (message.what) {
		default: {
			return;
		}
		case 0: {
			if (pl.l(pl).get() == null)
				return;
			((View) pl.l(pl).get()).invalidate();
			return;
		}
		case 1: {
			pl.m(pl);
			return;
		}
		case 2: {
			boolean bl = message.obj instanceof Boolean ? (Boolean) message.obj
					: true;
			pl.a(pl, bl);
			return;
		}
		case 3:
		
		pl.d(pl, message.arg1);
		}
		switch (pl.n(pl)) {
		default: {
			return;
		}
		case 2: {
			pl.o(pl);
			return;
		}
		case 3: {
			pl.p(pl);
			return;
		}
		case 5:
		
		pl.q(pl);
		}
	}
}
