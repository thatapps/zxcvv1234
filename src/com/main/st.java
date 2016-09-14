package com.main;

import com.lazyswipe.SwipeApplication;
import java.util.Iterator;
import java.util.List;

class st implements ih {

	st() {
	}

	st(ss _pcls1) {
		this();
	}

	public void a(ii ii1) {
		if (ii1 != null && ii1.a != null) {
			Iterator iterator = ii1.a.iterator();
			while (iterator.hasNext()) {
				String s = (String) iterator.next();
				jc.a(SwipeApplication.e(), "D0", s);
			}
		}
	}
}
