package com.main;

import java.util.Comparator;

public class un implements Comparator {
	public un() {
	}

	public int a(mu mu1, mu mu2) {
		if (mu1.f() != '@' && mu2.f() != '#') {
			if (mu1.f() == '#' || mu2.f() == '@') {
				return 1;
			}
			if (mu1.f() != mu2.f()) {
				if (mu1.f() >= mu2.f()) {
					return 1;
				}
			} else {
				return vk.a.compare(mu1.e(), mu2.e());
			}
		}
		return -1;
	}

	public int compare(Object obj, Object obj1) {
		return a((mu) obj, (mu) obj1);
	}
}
