//zevienin

package com.lazyswipe.widget;

import java.lang.ref.WeakReference;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.main.vm;

public class FixedTip extends RelativeLayout {

	protected static final String a = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.widget.FixedTip.class.getSimpleName())
			.toString();
	private static WeakReference f;
	private TextView b;
	private TextView c;
	private TextView d;
	private android.view.WindowManager.LayoutParams e;

	public FixedTip(Context context) {
		super(context);
	}

	public FixedTip(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public static TextView a(FixedTip fixedtip) {
		return fixedtip.b;
	}

	public static TextView b(FixedTip fixedtip) {
		return fixedtip.c;
	}

	public static TextView c(FixedTip fixedtip) {
		return fixedtip.d;
	}

	public static void c() {
		if (f != null && f.get() != null) {
			((FixedTip) f.get()).b();
		}
	}

	public void a() {
		if (f == null || f.get() == null) {
			vm.a(getContext(), this, e);
		}
	}

	public void b() {
		vm.a(getContext(), this);
	}

	public void d() {
		DisplayMetrics displaymetrics = getContext().getResources()
				.getDisplayMetrics();
		e = new android.view.WindowManager.LayoutParams();
		int i = displaymetrics.widthPixels;
		i = displaymetrics.heightPixels;
		int j = getResources().getDimensionPixelOffset(0x7f0b0040);
		e.width = -1;
		e.height = j;
		e.x = 0;
		e.y = i - j;
		e.format = 1;
		e.flags = 0x10128;
		e.type = 2003;
		e.gravity = SwipeApplication.a | 0x30;
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		f = new WeakReference(this);
	}

	protected void onConfigurationChanged(Configuration configuration) {
		super.onConfigurationChanged(configuration);
		b();
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (f != null) {
			f.clear();
		}
		f = null;
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		b = (TextView) findViewById(0x7f0c0063);
		c = (TextView) findViewById(0x7f0c0065);
		d = (TextView) findViewById(0x7f0c0064);
	}

}
