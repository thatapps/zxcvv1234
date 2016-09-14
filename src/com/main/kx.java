package com.main;

import android.database.DataSetObserver;

class kx extends DataSetObserver {

	final kv a;

	kx(kv kv1) {
		super();
		a = kv1;

	}

	kx(kv kv1, kv _pcls1) {
		this(kv1);
	}

	public void onChanged() {
		if (this.a.c()) {
			this.a.a();
		}
	}

	public void onInvalidated() {
		this.a.b();
	}
}
