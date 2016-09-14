package com.main;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.System
 */

/*
 * Failed to analyse overrides
 */
public abstract class wv implements View.OnTouchListener {
	private final long a;
	long b;
	int c;
	private final Handler d;

	public wv() {
		this(ViewConfiguration.getDoubleTapTimeout());
	}

	public wv(long l) {
		this(null, l);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public wv(Handler handler, long l) {
		this.a = l;
		this.b = 0;
		this.c = 0;
		if (handler == null) {
			handler = new Handler();
		}
		this.d = handler;
	}

	public abstract boolean a(View var1, MotionEvent var2, int var3);

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public boolean onTouch(final View view, final MotionEvent motionEvent) {
		if (motionEvent.getAction() == 0) {
			final long l;
			this.b = l = System.currentTimeMillis();
			wv wv = this;
			synchronized (wv) {
				this.c = 1 + this.c;
			}
			this.d.removeCallbacksAndMessages((Object) null);
			this.d.postDelayed((Runnable) new Runnable() {

				/*
				 * Enabled aggressive block sorting Enabled unnecessary
				 * exception pruning
				 */
				public void run() {
					if (l == wv.this.b) {
						wv wv;
						wv wv2 = wv = wv.this;
						synchronized (wv2) {
							wv.this.a(view, motionEvent, wv.this.c);
							wv.this.c = 0;
							return;
						}
					}
				}
			}, this.a);
		}
		return true;
	}

}
