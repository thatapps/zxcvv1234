/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package com.lazyswipe.fan.hetero.iwatch;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.ui.RateView;
import com.main.lk;
import com.main.ll;
import com.main.to;

/*
 * Failed to analyse overrides
 */
public class WatchSectorArea extends ll {
	private static final String i = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.fan.hetero.iwatch
					.WatchSectorArea.class.getSimpleName()).toString();
	public WatchItemSector f;
	public WatchTabSector g;
	public WatchTabSectorBg h;

	public WatchSectorArea(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static void a(View view, boolean flag) {
		android.view.ViewGroup.LayoutParams params = view.getLayoutParams();
		if (params instanceof android.widget.FrameLayout.LayoutParams) {
			int j;
			if (flag) {
				j = 83;
			} else {
				j = 85;
			}
			((android.widget.FrameLayout.LayoutParams) params).gravity = j;
		}
	}

	public void a() {
		super.a();
		f.k();
		g.b();
		h.b();
	}

	public void a(int j) {
		super.a(j);
		g.a(true);
		h.a();
	}

	public void a(int n, int n2) {
		super.a(n, n2);
	}

	public void a(int n, int n2, boolean bl, boolean bl2) {
		super.a(n, n2, bl, bl2);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int j, boolean flag, boolean flag1) {
		boolean flag2 = false;
		super.a(j, flag, flag1);
		System.currentTimeMillis();
		java.util.List list = d.a(getCurrentTab());
		Object obj;
		Object obj1;
		WatchItemSector watchitemsector;
		if (flag1) {
			obj = new ArrayList(0);
		} else {
			obj = d.a(getPreviousTab());
		}
		if (flag1) {
			obj1 = new ArrayList(0);
		} else {
			obj1 = d.a(getNextTab());
		}
		watchitemsector = f;
		j = a;
		if (!flag) {
			flag2 = true;
		}
		watchitemsector.a(list, ((java.util.List) (obj)),
				((java.util.List) (obj1)), j, flag2, flag1);
	}

	public void a(boolean bl) {
		this.a(this.a, true, bl);
	}

	public void b() {
		super.b();
		this.f.b(true);
	}

	public boolean c() {
		if (this.f.e()) {
			this.f.h();
			return true;
		}
		return false;
	}

	public void d() {
		super.d();
		this.f.m();
		this.g.d();
		this.h.c();
	}

	public void e() {
		super.e();
		this.f.n();
		this.g.e();
		this.h.d();
	}

	public void g() {
		this.a(this.a, true, false);
	}

	public float getHandTrackDismissThreshold() {
		return 0.35f;
	}

	public lk getItemLayer() {
		return this.f;
	}

	public ViewGroup getItemSector() {
		return this.f;
	}

	public View getItemSectorBg() {
		return null;
	}

	public int getOuterSize() {
		if (f.getMeasuredWidth() <= 0) {
			return to.p(getContext());
		} else {
			return f.getMeasuredWidth();
		}
	}

	public ViewGroup getTabSector() {
		return this.g;
	}

	public View getTabSectorBg() {
		return this.h;
	}

	public WatchItemSector getWatchItemSector() {
		return this.f;
	}

	public WatchTabSector getWatchTabSector() {
		return this.g;
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		f = (WatchItemSector) findViewById(0x7f0c005d);
		g = (WatchTabSector) findViewById(0x7f0c0055);
		h = (WatchTabSectorBg) findViewById(0x7f0c0050);
	}

	public void setCurrentTab(int j) {
		RateView.d();
		j = (d.f + j) % d.f;
		d.d[j].a(getContext(), d);
		a = j;
	}

	public void setDirection(boolean flag) {
		super.setDirection(flag);
		f.setDirection(flag);
		g.setDirection(flag);
		h.setDirection(flag);
	}

	public void setFan(Fan fan) {
		super.setFan(fan);
		f.a(fan, this);
		g.a(fan, this);
		h.setFan(fan);
	}

	public void setTab(int j) {
		super.setTab(j);
	}

}
