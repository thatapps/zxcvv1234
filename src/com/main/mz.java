package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import android.content.Context;

import com.lazyswipe.SwipeApplication;

public class mz extends mp {
	private static final Comparator a = new Comparator() {

		public int a(jq jq, jq jq2) {
			if (jq.d == jq2.d) {
				return vk.a.compare((Object) jq.b, (Object) jq2.b);
			}
			if (jq.d > jq2.d) {
				return -1;
			}
			return 1;
		}

		public int compare(Object object, Object object2) {
			return this.a((jq) object, (jq) object2);
		}
	};

	public String a(Context paramContext) {
		return paramContext.getString(0x7f0f0086);
	}

	// public void a(SwipeApplication paramSwipeApplication) {
	// ArrayList localArrayList = null;
	// Iterator localIterator = null;
	// if (this.c == null) {
	// localArrayList = paramSwipeApplication.b().a();
	// Collections.sort(localArrayList, a);
	// this.c = new ArrayList(f());
	// localIterator = localArrayList.iterator();
	// }
	//
	// jq localjq;
	// if (localIterator.hasNext()) {
	// localjq = (jq) localIterator.next();
	// if (this.c.size() < f()) {
	// }
	// } else {
	// localArrayList.clear();
	// return;
	// }
	// if ((!localjq.g) && (localjq.d > 0L)) {
	// this.c.add(new mo(localjq));
	//
	// }
	// }

	public void a(SwipeApplication swipeapplication) {
		Iterator iterator;
		ArrayList arrayList = null;
		if (c != null) {

			return;

		} else {

			arrayList = swipeapplication.b().a();
			Collections.sort(arrayList, a);
			c = new ArrayList(f());
			iterator = arrayList.iterator();

		}

		if (!iterator.hasNext()) {

			arrayList.clear();

		} else {

			jq jq1 = (jq) iterator.next();
			if (c.size() < f()) {

				if (!jq1.g && jq1.d > 0L) {
					c.add(new mo(jq1));
				}
			

			} else {

				arrayList.clear();

			}
		}

	}

	public String b() {
		return "recentlyInstalled";
	}
}
