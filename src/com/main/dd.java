package com.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class dd implements android.view.LayoutInflater.Factory {

	final dh a;

	dd(dh dh1) {
		a = dh1;
	}

	public View onCreateView(String s, Context context,
			AttributeSet attributeset) {
		return a.a(null, s, context, attributeset);
	}

	public String toString() {
		return (new StringBuilder()).append(getClass().getName()).append("{")
				.append(a).append("}").toString();
	}
}
