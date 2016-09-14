package com.main;

import android.R.attr;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;

public class ov extends ox {

	ov(int i, int j, int k, String s) {
		super(i, j, k, s);
	}

	public Drawable a(Context context, Fan fan) {
		int i = ox.a(R.attr.fanItemSectorBackgroundColor);
		return new mi(context.getResources().getDimensionPixelSize(0x7f0b002d),
				fan.getTileSectorOuterSize(), i, fan.i(), null);
	}

	public Drawable b(Context context, Fan fan) {
		int i = ox.a(0x7f010013);
		return new mi(context.getResources().getDimensionPixelSize(0x7f0b002d),
				fan.getTileSectorInnerSize(), i, fan.i(), null);
	}

}
