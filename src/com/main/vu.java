package com.main;

import com.lazyswipe.zev.R;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.widget.RemoteViews
 *  java.lang.Object
 *  java.lang.Runnable
 */

/*
 * Failed to analyse overrides
 */
class vu implements Runnable {
	final vr a;

	vu(vr vr) {
		this.a = vr;
	}

	public void run() {
		if (!vr.c(this.a)) {
			vr.e((vr) this.a).contentView.setProgressBar(R.id.file_downloading_progress, 100,
					vr.d(this.a).a(), false);
			uk.a(vr.f(this.a), vr.g(this.a), vr.e(this.a));
		}
		vr.h(this.a).sendEmptyMessageDelayed(2, 1000);
	}
}
