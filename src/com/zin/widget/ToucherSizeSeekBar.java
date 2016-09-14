//zevienin

package com.lazyswipe.widget;

import android.content.Context;
import android.util.AttributeSet;

import com.main.vk;
import com.main.vz;
import com.main.xj;

public class ToucherSizeSeekBar extends vz {

	public ToucherSizeSeekBar(Context context) {
		this(context, null);
	}

	public ToucherSizeSeekBar(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public ToucherSizeSeekBar(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
	}

	public ToucherSizeSeekBar(Context context, AttributeSet attributeset,
			int i, int j) {
		super(context, attributeset, i, j);
	}

	private void b() {
		xj xj1 = new xj(getContext(), getFragmentCount(),
				getFragmentCount() / 2, 0xff9a9a9a, 0xff414141);
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(
				-1, vk.a(getContext(), 10F));
		layoutparams.addRule(15, 1);
		xj1.setLayoutParams(layoutparams);
		a(xj1);
	}

	public void a() {
		super.a();
		c = 96;
	}

	public int getFragmentCount() {
		return 7;
	}

	public void onFinishInflate() {
		super.onFinishInflate();
		b();
	}
}
