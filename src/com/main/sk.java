package com.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;

public class sk extends wz {

	private Intent o;

	public sk(Context context) {
		super(context);
	}

	protected sj a() {
		return new sj(a, o);
	}

	public sk a(Intent intent) {
		o = intent;
		boolean flag = o.getBooleanExtra("EXTRA_CHOOSE_APP", true);
		a(((android.view.View) ((sl) LayoutInflater.from(a).inflate(sl.a(flag),
				null))));
		return this;
	}

	protected wy b() {
		return a();
	}

	protected wb c() {
		return a();
	}
}
