package com.main;

import android.content.Intent;
import android.os.Bundle;

public class bh extends bp {

	public static final bq a = new bq() {

		public bh a(String s, CharSequence charsequence,
				CharSequence acharsequence[], boolean flag, Bundle bundle) {
			return new bh(s, charsequence, acharsequence, flag, bundle);
		}

		public bh[] a(int i) {
			return new bh[i];
		}

		public bp b(String s, CharSequence charsequence,
				CharSequence acharsequence[], boolean flag, Bundle bundle) {
			return a(s, charsequence, acharsequence, flag, bundle);
		}

		public bp[] b(int i) {
			return a(i);
		}

	};
	private static final bj g;
	private final String b;
	private final CharSequence c;
	private final CharSequence d[];
	private final boolean e;
	private final Bundle f;

	bh(String s, CharSequence charsequence, CharSequence acharsequence[],
			boolean flag, Bundle bundle) {
		b = s;
		c = charsequence;
		d = acharsequence;
		e = flag;
		f = bundle;
	}

	public static void a(bh abh[], Intent intent, Bundle bundle) {
		g.a(abh, intent, bundle);
	}

	public String a() {
		return b;
	}

	public CharSequence b() {
		return c;
	}

	public CharSequence[] c() {
		return d;
	}

	public boolean d() {
		return e;
	}

	public Bundle e() {
		return f;
	}

	static {
		if (android.os.Build.VERSION.SDK_INT >= 20) {
			g = new bk();
		} else if (android.os.Build.VERSION.SDK_INT >= 16) {
			g = new bm();
		} else {
			g = new bl();
		}
	}
}
