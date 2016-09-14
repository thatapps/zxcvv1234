package com.main;

import android.content.Context;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class nb extends mp {

	private boolean a;

	public nb() {
	}

	private void j() {
		if (!a && c != null) {
			a = true;
			Iterator iterator = c.iterator();
			while (iterator.hasNext()) {
				mt mt1 = (mt) iterator.next();
				if (mt1 instanceof ne) {
					((ne) mt1).m();
				}
			}
		}
	}

	private void k() {
		if (a) {
			a = false;
			if (c != null) {
				Iterator iterator = c.iterator();
				while (iterator.hasNext()) {
					mt mt1 = (mt) iterator.next();
					if (mt1 instanceof ne) {
						((ne) mt1).t();
					}
				}
			}
		}
	}

	public String a(Context context) {
		return context.getString(0x7f0f0088);
	}

	public void a(SwipeApplication swipeapplication) {
		if (c == null) {
			List list = rc.k(swipeapplication);
			int l = Math.min(list.size(), f());
			c = new ArrayList(l);
			for (int i = 0; i < l; i++) {
				rc rc1 = rc.b(swipeapplication, (String) list.get(i));
				if (rc1 != null) {
					c.add(new ne(swipeapplication, rc1));
				}
			}

		}
	}

	public void a(List list, int i, int l, lo lo1) {
		super.a(list, i, l, lo1);
		if (!vk.a(list)) {
			ArrayList arraylist = new ArrayList();
			Iterator iterator = list.iterator();
			do {
				if (!iterator.hasNext()) {
					break;
				}
				mt mt1 = (mt) iterator.next();
				if (mt1 instanceof ne) {
					arraylist.add(((ne) mt1).l());
				}
			} while (true);
			rc.c(SwipeApplication.e(), rc.a(arraylist));
			if (lo1 != null) {
				lo1.a(c);
				return;
			}
		}
	}

	protected void a(mt mt1) {
		((ne) mt1).t();
	}

	public boolean a(Context context, Fan fan) {
		super.a(context, fan);
		j();
		return true;
	}

	public String b() {
		return "switcher";
	}

	public int c() {
		return 3;
	}

	public boolean d() {
		return false;
	}

	public void e() {
		k();
		super.e();
	}
}
