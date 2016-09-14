package com.main;

import java.util.WeakHashMap;

import android.graphics.Paint;
import android.view.View;

class dx implements eg {
	WeakHashMap a = null;

	private boolean a(dq paramdq, int paramInt) {
		boolean bool = true;
		int i = paramdq.b();
		int j = paramdq.a() - paramdq.c();
		if (j == 0) {
			bool = false;
		}

		if (paramInt < 0) {
			if (i <= 0) {
				bool = false;
			}
		} else if (i >= j - 1) {
			bool = false;
		}
		return bool;

	}

	public int a(View paramView) {
		return 2;
	}

	long a() {
		return 10L;
	}

	public void a(View paramView, int paramInt, Paint paramPaint) {
	}

	public void a(View paramView, Runnable paramRunnable) {
		paramView.postDelayed(paramRunnable, a());
	}

	public void a(View paramView, boolean paramBoolean) {
	}

	public boolean a(View view, int i) {
		return (view instanceof dq) && a((dq) view, i);
	}

	public void b(View paramView) {
		paramView.invalidate();
	}
}
