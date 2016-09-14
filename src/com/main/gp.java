package com.main;

import android.content.Context;

public class gp extends hb {
	private volatile boolean a;

	public gp(Context context, String string) {
		super(context, string, gn.b, hx.i, false);
	}

	@Override
	public void a() {
		if (this.a) {
			IllegalStateException illegalStateException = new IllegalStateException(
					"Ad already loaded");
			hj.a(hi.a((Exception) illegalStateException));
			throw illegalStateException;
		}
		this.a = true;
		super.a();
	}
}