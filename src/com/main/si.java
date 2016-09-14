package com.main;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class si implements Comparator {
	private List a;
	private Map b;

	public si(List list, Map map) {
		this.a = list;
		this.b = map;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public int a(String string, String string2) {
		int n = 1;
		int n2 = this.a != null && this.a.contains((Object) string) ? n : 0;
		List list = this.a;
		int n3 = 0;
		if (list != null) {
			boolean bl = this.a.contains((Object) string2);
			n3 = 0;
			if (bl) {
				n3 = n;
			}
		}
		if (n2 == n3) {
			try {
				CharSequence charSequence = (CharSequence) this.b
						.get((Object) string);
				CharSequence charSequence2 = (CharSequence) this.b
						.get((Object) string2);
				if (charSequence != null && charSequence2 != null) {
					int n4 = vk.a.compare((Object) charSequence,
							(Object) charSequence2);
					return n4;
				}
				if (charSequence != null || charSequence2 != null) {
					if (charSequence != null)
						return n;
					return -1;
				}
			} catch (Throwable var7_11) {
			}
		}
		if (n2 == 0)
			return n;
		return -1;
	}

	public int compare(Object object, Object object2) {
		return this.a((String) object, (String) object2);
	}
}
