package com.main;

import java.util.Locale;

public enum hn {
	a, b, c;

	static {
		hn[] d = null;
		hn[] arrayOfhn = new hn[3];
		arrayOfhn[0] = a;
		arrayOfhn[1] = b;
		arrayOfhn[2] = c;
		d = arrayOfhn;
	}

	public static hn a(String paramString) {
		Object localObject;
		if (hh.a(paramString)) {
			localObject = a;
		}

		try {
			hn localhn = valueOf(paramString.toUpperCase(Locale.US));
			localObject = localhn;
		} catch (IllegalArgumentException localIllegalArgumentException) {
			localObject = a;
		}
		return (hn) localObject;
	}

}
