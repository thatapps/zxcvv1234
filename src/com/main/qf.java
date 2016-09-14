package com.main;

import android.content.Context;
import android.os.Handler;
import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.ui.DialogActivity;

public class qf extends rc {

	public qf(Context context) {
		this(context, null);
	}

	public qf(Context context, rd rd) {
		super(context, rd);
	}

	public int a(Context context) {
		return !ir.y(context) && !SwipeAccessibilityService.a(context) ? 0 : 1;
	}

	public int a(boolean flag) {
		return 0x7f020086;
	}

	public String b() {
		return "Back";
	}

	public int c() {
		return 0x7f0f00b1;
	}

	public boolean c(Context context) {
		vi.a(context, 0x7f0f0046);
		return false;
	}

	public boolean e() {
		final SwipeAccessibilityService swipeaccessibilityservice = SwipeAccessibilityService
				.a();
		if (swipeaccessibilityservice == null) {
			if (ir.y(d)) {
				g.postDelayed(new Runnable() {

					final qf a;

					public void run() {
						vb.d();
					}

					{
						a = qf.this;
						// super();
					}
				}, 120L);
			} else if (android.os.Build.VERSION.SDK_INT >= 16) {
				DialogActivity.b(d);
			}

		} else {

			g.postDelayed(new Runnable() {

				final SwipeAccessibilityService a;
				final qf b;

				public void run() {
					a.performGlobalAction(1);
				}

				{
					b = qf.this;
					a = swipeaccessibilityservice;
					//super();
				}
			}, 120L);
		}

		return true;

	}
}
