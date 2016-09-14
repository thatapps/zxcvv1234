package com.main;

import java.util.Comparator;
import java.util.List;

public final class sh implements Comparator {
	private List a;

	public sh(List list) {
		this.a = list;
	}

	public int a(jq jq, jq jq2) {
		boolean bl = this.a.contains((Object) jq.h.getPackageName());
		if (bl == this.a.contains((Object) jq2.h.getPackageName())) {
			return vk.a.compare((Object) jq.b, (Object) jq2.b);
		}
		if (bl) {
			return -1;
		}
		return 1;
	}

	public  int compare(Object object, Object object2) {
		return this.a((jq) object, (jq) object2);
	}
}
