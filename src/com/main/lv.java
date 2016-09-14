package com.main;

import android.view.View;

import com.lazyswipe.fan.FanItem;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 */

/*
 * Failed to analyse overrides
 */
public class lv implements Runnable {

	final FanItem a;

	public lv(FanItem fanitem) {
		super();
		a = fanitem;

	}

	public lv(FanItem fanitem, com.lazyswipe.fan.FanItem _pcls1) {
		this(fanitem);
	}

	public void run() {
		if (FanItem.a(a) != null) {
			FanItem.a(a, true);
			FanItem.a(a).onLongClick(a);
		}
	}
}
