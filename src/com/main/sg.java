package com.main;

import java.io.File;

import android.content.Context;

public final class sg implements Runnable {
	private final Context a;

	public sg(Context context) {
		this.a = context;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public void run() {
		File file = this.a.getExternalCacheDir();
		if (file == null)
			return;
		File file2 = new File(file, "app_promotion.png");
		if (!file2.exists()) {
			if (!uj.d(this.a))
				return;
			int n = to.u(this.a);
			if (!tz.a(this.a, "http://gift.lazyswipe.com/img20150319hola/" + n
					+ ".png", file2.getAbsolutePath(), 30000, 30000))
				return;
			ir.b = true;
			return;
		}
		ir.b = true;
	}
}
