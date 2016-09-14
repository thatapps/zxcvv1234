/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.LinearLayout
 *  java.lang.System
 */
package com.lazyswipe.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.lazyswipe.zev.R;
import com.main.to;

/*
 * Failed to analyse overrides
 */
public class FloatWindowHintView extends LinearLayout implements
		View.OnClickListener {
	private int a;

	public FloatWindowHintView(Context context) {
		this(context, null);
	}

	public FloatWindowHintView(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public FloatWindowHintView(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
	}

	@TargetApi(value = 21)
	public FloatWindowHintView(Context context, AttributeSet attributeSet,
			int n, int n2) {
		super(context, attributeSet, n, n2);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void onClick(View view) {
		int n;
		switch (this.a) {
		default: {
			n = R.string.msg_enable_xiaomi_float_window;
			to.h(this.getContext());
			break;
		}
		case 2: {
			n = R.string.msg_enable_huawei_float_window;
			to.f(this.getContext());
			break;
		}
		case 3: {
			n = R.string.msg_enable_color_os_float_window;
			to.b(this.getContext());
		}
		}
		TutorialService.a(this.getContext());
		FullscreenTipActivity.a(this.getContext(), n);
		((ViewGroup) this.getParent()).removeView((View) this);
		System.exit((int) 0);
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		this.findViewById(R.id.action).setOnClickListener(
				(View.OnClickListener) this);
		if (to.k()) {
			this.a = 1;
			return;
		}
		if (to.D() && to.i(this.getContext())) {
			this.a = 2;
			return;
		}
		if (to.z()) {
			this.a = 3;
			return;
		}
		this.a = 4;
	}
}
