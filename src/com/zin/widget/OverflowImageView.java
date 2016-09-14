/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  java.lang.String
 */
package com.lazyswipe.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.main.qd;

/*
 * Failed to analyse overrides
 */
public class OverflowImageView extends ImageView {
	private Drawable a;

	public OverflowImageView(Context context) {
		super(context);
	}

	public OverflowImageView(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
	}

	public OverflowImageView(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
	}

	@TargetApi(value = 21)
	public OverflowImageView(Context context, AttributeSet attributeSet, int n,
			int n2) {
		super(context, attributeSet, n, n2);
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		if (a != null) {
			int i = a.getIntrinsicWidth();
			int j = a.getIntrinsicHeight();
			int k = getMeasuredWidth();
			float f = getContext().getResources().getDisplayMetrics().density;
			k = (int) ((float) (k >> 1) + 8F * f);
			int l = (int) ((float) getPaddingTop() - f * 2.0F);
			a.setBounds(k, l, i + k, j + l);
			a.draw(canvas);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void setUnread(boolean flag) {
		if (flag) {
			if (a == null) {
				a = qd.a((int) (4.666667F * getContext().getResources()
						.getDisplayMetrics().density), Color
						.parseColor("#ff5c26"));
				invalidate();
			}
		} else if (a != null) {
			a = null;
			invalidate();
			return;
		}
	}
}
