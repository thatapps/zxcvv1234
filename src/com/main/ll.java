package com.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lazyswipe.fan.Fan;

public class ll extends FrameLayout {

	private static final String f = (new StringBuilder()).append("Swipe.")
			.append(ll.class.getSimpleName()).toString();
	public int a;
	protected int b;
	public boolean c;
	public Fan d;
	public boolean e;
	private boolean g;

	public ll(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public void a() {
	}

	public void a(int i) {
		a = i;
	}

	public void a(int i, int j) {
		a(i, j, false, true);
	}

	public void a(int i, int j, boolean flag, boolean flag1) {
		i = d.f;
		int k = d.f;
		d.d[(i + j) % k].a(getContext(), d);
	}

	public void a(int i, boolean flag) {
		a(i, false, flag);
	}

	public void a(int i, boolean flag, boolean flag1) {
		a = i;
	}

	public void b() {
	}

	public boolean c() {
		return false;
	}

	public void d() {
	}

	public void e() {
	}

	public boolean f() {
		return g;
	}

	public nc getCurrentTab() {
		return d.d[a % d.f];
	}

	public float getHandTrackDismissThreshold() {
		return 0.35F;
	}

	public lk getItemLayer() {
		return null;
	}

	public ViewGroup getItemSector() {
		return null;
	}

	public View getItemSectorBg() {
		return null;
	}

	public nc getNextTab() {
		return d.d[(a + d.f + 1) % d.f];
	}

	public int getOuterSize() {
		return d.getTileSectorOuterSize();
	}

	public nc getPreviousTab() {
		return d.d[((a + d.f) - 1) % d.f];
	}

	public ViewGroup getTabSector() {
		return null;
	}

	public View getTabSectorBg() {
		return null;
	}

	public void setDirection(boolean flag) {
		c = flag;
	}

	public void setFan(Fan fan) {
		d = fan;
	}

	public void setPopupPrepared(boolean flag) {
		boolean flag1 = g;
		g = flag;
		if (!flag1 && flag) {
			d.m();
		}
	}

	public void setTab(int i) {
		b = i;
	}

}
