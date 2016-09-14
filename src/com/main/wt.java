package com.main;

import android.widget.GridLayout;

import com.lazyswipe.fan.FanItem;

public class wt {

	private FanItem a[];
	private int b;
	private GridLayout c;

	public wt(ws ws1, GridLayout gridlayout, int i) {
		c = gridlayout;
		b = i;
		a = new FanItem[b];
		for (i = 0; i < b; i++) {
			a[i] = (FanItem) c.getChildAt(i);
			ws1.a(a[i]);
		}

		c.setTag(this);
	}

	static GridLayout a(wt wt1) {
		return wt1.c;
	}

	static FanItem[] b(wt wt1) {
		return wt1.a;
	}
}
