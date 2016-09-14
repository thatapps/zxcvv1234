package com.main;

import android.app.PendingIntent;
import android.os.Bundle;

public class ac extends ay {

	public static final az d = new az() {

		public ac a(int i, CharSequence charsequence,
				PendingIntent pendingintent, Bundle bundle, bp abp[]) {
			return new ac(i, charsequence, pendingintent, bundle,
					(bh[]) (bh[]) abp);
		}

		public ac[] a(int i) {
			return new ac[i];
		}

		public ay b(int i, CharSequence charsequence,
				PendingIntent pendingintent, Bundle bundle, bp abp[]) {
			return a(i, charsequence, pendingintent, bundle, abp);
		}

		public ay[] b(int i) {
			return a(i);
		}

	};
	public int a;
	public CharSequence b;
	public PendingIntent c;
	private final Bundle e;
	private final bh f[];

	private ac(int i, CharSequence charsequence, PendingIntent pendingintent,
			Bundle bundle, bh abh[]) {
		a = i;
		b = ag.e(charsequence);
		c = pendingintent;
		if (bundle == null) {
			bundle = new Bundle();
		}
		e = bundle;
		f = abh;
	}

	ac(int i, CharSequence charsequence, PendingIntent pendingintent,
			Bundle bundle, bh abh[], ab _pcls1) {
		this(i, charsequence, pendingintent, bundle, abh);
	}

	protected int a() {
		return a;
	}

	protected CharSequence b() {
		return b;
	}

	protected PendingIntent c() {
		return c;
	}

	public Bundle d() {
		return e;
	}

	public bh[] e() {
		return f;
	}

	public bp[] f() {
		return e();
	}

}
