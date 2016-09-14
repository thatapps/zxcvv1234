package com.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public class en extends android.view.ViewGroup.LayoutParams {

	public boolean a;
	public int b;
	public float c;
	public boolean d;
	public int e;
	public int f;

	public en() {
		super(-1, -1);
		c = 0.0F;
	}

	public en(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		c = 0.0F;
		TypedArray array = context.obtainStyledAttributes(attributeset,
				/*ViewPager.e()*/null);
		b = array.getInteger(0, 48);
		array.recycle();
	}
}
