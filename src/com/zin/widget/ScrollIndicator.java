/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.lazyswipe.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lazyswipe.zev.R;

/*
 * Failed to analyse overrides
 */
public final class ScrollIndicator extends LinearLayout {
	private int a = -1;
	private ImageView[] b;
	private boolean c = false;

	public ScrollIndicator(Context context) {
		this(context, null);
	}

	public ScrollIndicator(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
	}

	public ScrollIndicator(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public void a(int n) {
	// if (n == this.getChildCount()) {
	// return;
	// }
	// this.removeAllViews();
	// LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
	// -2, -2);
	// this.b = new ImageView[n];
	// int n2 = (int) (0.5f + 2.0f * this.getContext().getResources()
	// .getDisplayMetrics().density);
	// for (int i = 0; i < n; ++i) {
	// ImageView imageView;
	// this.b[i] = imageView = new ImageView(this.getContext());
	// int n3 = this.c ? R.drawable.ic_dot_selected : R.drawable.ic_dot;
	// imageView.setImageResource(n3);
	// imageView.setPadding(n2, 0, n2, 0);
	// this.addView((View) imageView,
	// (ViewGroup.LayoutParams) layoutParams);
	// }
	// }
	// public void a(int i) {
	// if (i != getChildCount()) {
	// removeAllViews();
	// android.widget.LinearLayout.LayoutParams layoutparams = new
	// android.widget.LinearLayout.LayoutParams(
	// -2, -2);
	// b = new ImageView[i];
	// int l = (int) (getContext().getResources().getDisplayMetrics().density *
	// 2.0F + 0.5F);
	// int j = 0;
	// while (j < i) {
	// ImageView imageview = new ImageView(getContext());
	// b[j] = imageview;
	// int k;
	// if (c) {
	// k = 0x7f020038;
	// } else {
	// k = 0x7f020037;
	// }
	// imageview.setImageResource(k);
	// imageview.setPadding(l, 0, l, 0);
	// addView(imageview, layoutparams);
	// j++;
	// }
	// }
	// }
	public void a(int var1) {
		if (var1 != this.getChildCount()) {
			this.removeAllViews();
			LayoutParams var5 = new LayoutParams(-2, -2);
			this.b = new ImageView[var1];
			int var4 = (int) (this.getContext().getResources()
					.getDisplayMetrics().density * 2.0F + 0.5F);

			for (int var2 = 0; var2 < var1; ++var2) {
				ImageView var6 = new ImageView(this.getContext());
				this.b[var2] = var6;
				int var3;
				if (this.c) {
					var3 = 0x7f020038;
				} else {
					var3 = 0x7f020037;
				}

				var6.setImageResource(var3);
				var6.setPadding(var4, 0, var4, 0);
				this.addView(var6, var5);
			}

			this.a = -1;
		}
	}

	public void setReverse(boolean bl) {
		this.c = bl;
	}

	/*
	 * Exception decompiling
	 */
	public void setSelected(int i) {
		int k;
		k = R.drawable.ic_dot;
		if (i == a || i < 0 || b == null || i >= b.length) {
			return;
		}
		a = i;
		if (a != -1) {
			

			ImageView imageview = b[1];
			int j;
			if (c) {
				j = R.drawable.ic_dot_selected;
			} else {
				j = R.drawable.ic_dot;
			}
		
			try {
				imageview.setImageResource(j);
			} catch (Throwable throwable1) {
			}
			imageview = b[i];
			if (c) {
				j = k;
			} else {
				j = R.drawable.ic_dot_selected;
			}
			try {
				imageview.setImageResource(j);
			}
			// Misplaced
			catch (Exception exception) {
			}
		}

		return;
	}
}
