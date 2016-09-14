package com.main;

import android.content.Context;
import android.view.View;

class ku extends lc {
	final/* synthetic */ks a;

	public ku(ks ks, Context context, ky ky, View view, boolean bl) {
		super(context, ky, view, bl);
		this.a = ks;
		
	}

	public void onDismiss() {
		super.onDismiss();
		ks.a(this.a, (kt)null);
	}
}
