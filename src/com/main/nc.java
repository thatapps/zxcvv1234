package com.main;

import java.util.Iterator;
import java.util.List;

import android.content.Context;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;

public abstract class nc {
	protected static final String b = "Swipe." + nc.class.getSimpleName();
	public List c;

	public nc() {
	}

	public static final int f() {
		return !oy.a() ? 9 : 13;
	}

	public abstract String a(Context paramContext);

	public abstract void a(SwipeApplication paramSwipeApplication);

	public void a(List list, int j, int k, lo lo) {
		if (list == null) {
			return;
		} else {
			c.clear();
			c.addAll(list);
			return;
		}
	}

	protected void a(mt parammt) {
	}

	public boolean a(Context context, Fan fan) {
		String s = fan.getCurrentTab().b();
		return !b().equals(s);
	}

	public int b(mt mt1) {
		if (c != null) {
			return c.indexOf(mt1);
		} else {
			return -1;
		}
	}

	public abstract String b();

	public List b(Context paramContext) {
		SwipeApplication localSwipeApplication = (SwipeApplication) paramContext
				.getApplicationContext();
		if (this.c == null) {
			a(localSwipeApplication);
		}
		return this.c;
	}

	public int c() {
		return 0;
	}

	public int c(mt mt1) {
		int j = b(mt1);
		if (j < 0) {
			return j;
		} else {
			a(mt1);
			c.remove(j);
			return j;
		}
	}

	public boolean d() {
		return c == null;
	}

	public void e() {
		if (this.c != null) {
			this.c.clear();
			this.c = null;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof nc)) {
			return false;
		} else {
			obj = (nc) obj;
			return b().equals(((nc) (obj)).b());
		}
	}

	public boolean g() {
		return false;
	}

	public boolean h() {
		if (c == null || c.size() == 0) {
			return true;
		}
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			if ((mt) iterator.next() != null) {
				return false;
			}
		}

		return true;
	}

	public int hashCode() {
		return b().hashCode();
	}

	public int i() {
		if (c == null) {
			return 0;
		} else {
			return c.size();
		}
	}

	public String toString() {
		return b();
	}
}
