package com.main;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class y extends FrameLayout {

	public y(Context context) {
		super(context);
	}

	static ViewGroup a(View view) {
		y y1 = new y(view.getContext());
		android.view.ViewGroup.LayoutParams layoutparams = view
				.getLayoutParams();
		if (layoutparams != null) {
			y1.setLayoutParams(layoutparams);
		}
		view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
		y1.addView(view);
		return y1;
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray) {
		dispatchThawSelfOnly(sparsearray);
	}

	protected void dispatchSaveInstanceState(SparseArray sparsearray) {
		dispatchFreezeSelfOnly(sparsearray);
	}
}
