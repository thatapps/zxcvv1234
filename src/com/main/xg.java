package com.main;

import android.view.View;

class xg implements Comparable {
	public int a;
	public View b;

	public xg(xe paramxe, int paramInt, View paramView) {
		this.a = paramInt;
		this.b = paramView;
	}

	public int a(xg paramxg) {
		return paramxg.a - this.a;
	}

	public int compareTo(Object object) {
		return this.a((xg) object);
	}
}
