package com.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import com.lazyswipe.widget.GridGallery;

public class wm extends android.view.ViewGroup.LayoutParams {

	public boolean a;
	final GridGallery b;

	public wm(GridGallery gridgallery, int i, int j) {
		super(i, j);
		b = gridgallery;

		a = false;
	}

	public wm(GridGallery gridgallery, Context context,
			AttributeSet attributeset) {
		super(context, attributeset);
		b = gridgallery;

		a = false;
	}

	public wm(GridGallery gridgallery,
			android.view.ViewGroup.LayoutParams layoutparams) {
		super(layoutparams);
		b = gridgallery;

		a = false;
	}
}
