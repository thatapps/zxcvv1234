package com.main;

import android.content.Context;
import android.util.Log;

public abstract class jj implements Runnable {
	protected final Context a;

	public jj(Context paramContext) {
		this.a = paramContext;
	}

	protected abstract void a();

	public void run() {
		try {
			a();
			return;
		} catch (Throwable localThrowable) {

			Log.w("Swipe.API", "Execution failed: "
					+ getClass().getSimpleName(), localThrowable);
		}

	}
}
