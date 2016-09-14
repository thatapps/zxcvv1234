/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
package com.lazyswipe.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.main.wu;

/*
 * Failed to analyse overrides
 */
public class LoadingView extends ImageView {
	public LoadingView(Context context) {
		this(context, null);
	}

	public LoadingView(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public LoadingView(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
		this.setImageDrawable((Drawable) new wu(context));
	}

	protected void onVisibilityChanged(View view, int n) {
		super.onVisibilityChanged(view, n);
		wu wu = (wu) this.getDrawable();
		if (wu != null) {
			if (n == 0) {
				wu.start();
			}
		} else {
			return;
		}
		wu.stop();
	}
}
