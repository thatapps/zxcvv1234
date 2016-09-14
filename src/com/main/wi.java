package com.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public abstract class wi extends ImageView {
	public wi(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public abstract float getRatio();

	protected void onMeasure(int paramInt1, int paramInt2) {
		int i = View.MeasureSpec.getSize(paramInt2);
		setMeasuredDimension(100,150);
	}
}
