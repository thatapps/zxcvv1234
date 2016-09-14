package com.main;

import java.util.ArrayList;
import java.util.Collection;

import android.content.Context;
import android.hardware.Camera;

final class rp implements Camera.AutoFocusCallback {
	private static final Collection a = new ArrayList(2);
	private boolean b;
	private final boolean c;
	private final Camera d;

	static {
		a.add("auto");
		a.add("macro");
	}

	rp(Context context, Camera camera) {
		this.d = camera;
		String string = camera.getParameters().getFocusMode();
		this.c = a.contains((Object) string);
		this.a();
	}

	/* Error */
	/**
	 * @deprecated
	 */
	void a() {
		rp rp = this;
		synchronized (rp) {
			if (this.c) {
				this.b = true;
				try {
					this.d.autoFocus((Camera.AutoFocusCallback) this);
				} catch (RuntimeException var2_2) {
					vj.a("Swipe.Light", "Unexpected exception while focusing",
							(Throwable) var2_2);
				}
			}
			return;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	void b() {
		rp rp = this;
		synchronized (rp) {
			if (this.c) {
				this.b = false;
				try {
					this.d.cancelAutoFocus();
				} catch (RuntimeException var2_2) {
					vj.a("Swipe.Light",
							"Unexpected exception while cancelling focusing",
							(Throwable) var2_2);
				}
			}
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void onAutoFocus(boolean bl, Camera camera) {
		rp rp = this;
		// MONITORENTER : rp
		// MONITOREXIT : rp
	}
}
