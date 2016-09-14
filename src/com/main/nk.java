package com.main;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.hetero.iwatch.WatchTabSector;
import com.lazyswipe.zev.R;

public class nk extends ImageView {
	private static final String d = "Swipe." + nk.class.getSimpleName();
	public float a;
	public int b;
	public int c;
	private final int e = getResources().getDimensionPixelSize(
			R.dimen.fan_watch_tab_indicator_size);
	private final int f = this.e / 2;
	private int g;
	private String h;
	private float i;
	private boolean j;

	public nk(Context paramContext) {
		super(paramContext);
		setScaleType(ImageView.ScaleType.FIT_START);
		this.g = ((int) (0.68D * WatchTabSector.a));
	}

	public static nk a(String paramString, int paramInt1, int paramInt2,
			WatchTabSector paramWatchTabSector) {
		nk localnk = new nk(SwipeApplication.e());
		localnk.b(paramString, paramInt1, paramInt2, paramWatchTabSector);
		return localnk;
	}

	private void b() {
		double d1 = Math.toRadians(oy.a(this.j, this.a));
		this.b = ((int) (this.g * Math.cos(d1)));
		this.c = ((int) (this.g * Math.sin(d1)));
		a(false);
	}

	private void c() {
		float f1 = getBaseScale();
		setScaleX(f1);
		setScaleY(f1);
	}

	private float getBaseScale() {
		if ((this.a > 0.0F) && (this.a < 90.0F)) {
		}
		for (float f1 = 0.33F + 0.67F * (1.0F - Math.abs(this.a - 45.0F) / 45.0F);; f1 = 0.3F) {
			return f1;
		}
	}

	private int getTabImage() {
		if ("mostUsed".equals(h)) {
			return R.drawable.iwatch_tab_favorite;
		}
		return !"switcher".equals(h) ? R.drawable.iwatch_tab_recent
				: R.drawable.iwatch_tab_switcher;
	}

	public FrameLayout.LayoutParams a(boolean paramBoolean) {
		FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams) getLayoutParams();
		if ((paramBoolean) || (localLayoutParams == null)) {
			localLayoutParams = new FrameLayout.LayoutParams(this.e, this.e);
		}
		localLayoutParams.width = this.e;
		localLayoutParams.height = this.e;
		int k;
		if (this.j) {
			k = 3;
			localLayoutParams.gravity = (k | 0x50);
			localLayoutParams.topMargin = 0;
			localLayoutParams.bottomMargin = (this.c - this.f);
			if (!this.j) {
				localLayoutParams.leftMargin = 0;
			}
			localLayoutParams.leftMargin = (this.b - this.f);
		}
		for (localLayoutParams.rightMargin = 0;; localLayoutParams.rightMargin = (-this.b - this.f)) {
			k = 5;
			return localLayoutParams;

		}
	}

	public void a() {
		if (Fan.getInstance() == null) {
			return;
		}
		float f1 = Fan.getInstance().getHandTrackRatio();
		FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams) getLayoutParams();
		localLayoutParams.bottomMargin = ((int) (f1 * this.c - this.f));
		if (this.j) {
			localLayoutParams.leftMargin = ((int) (f1 * this.b - this.f));
		}
		for (localLayoutParams.rightMargin = 0;; localLayoutParams.rightMargin = ((int) (f1
				* -this.b - this.f))) {
			setAlpha(FanItem.b(f1));
			float f2 = FanItem.a(f1) * getBaseScale();
			setScaleX(f2);
			setScaleY(f2);
			// break;
			localLayoutParams.leftMargin = 0;
		}
	}

	public boolean a(float paramFloat) {
		int k = (int) oy.c(paramFloat) / 3;
		this.a = oy.a(this.i + k);
		b();
		c();
		return true;
	}

	public void b(String paramString, int paramInt1, int paramInt2,
			WatchTabSector paramWatchTabSector) {
		this.h = paramString;
		setImageResource(getTabImage());
		this.j = paramWatchTabSector.c();
		this.a = oy.a(paramInt1 + paramInt2);
		this.i = this.a;
		b();
		c();
	}

	public String getTab() {
		return this.h;
	}

	protected void onMeasure(int paramInt1, int paramInt2) {
		super.onMeasure(paramInt1, paramInt2);
		setMeasuredDimension(this.e, this.e);
		setPivotX(getMeasuredWidth() / 2);
		setPivotY(getMeasuredHeight() / 2);
	}
}
