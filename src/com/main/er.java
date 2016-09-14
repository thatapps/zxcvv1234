package com.main;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public class er extends DataSetObserver {

	final ViewPager a;

	private er(ViewPager viewpager) {
		super();
		a = viewpager;
		
	}

	public er(ViewPager viewpager,
			android.support.v4.view.ViewPager _pcls1) {
		this(viewpager);
	}

	public void onChanged() {
		//a.a();
	}

	public void onInvalidated() {
		//a.a();
	}
}
