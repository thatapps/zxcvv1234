package com.main;

import android.os.Bundle;

public final class bi {

	private final String a;
	private CharSequence b;
	private CharSequence c[];
	private boolean d;
	private Bundle e;

	public bi(String s) {
		d = true;
		e = new Bundle();
		if (s == null) {
			throw new IllegalArgumentException("Result key can't be null");
		} else {
			a = s;
			return;
		}
	}

	public bh a() {
		return new bh(a, b, c, d, e);
	}

	public bi a(CharSequence charsequence) {
		b = charsequence;
		return this;
	}

	public bi a(boolean flag) {
		d = flag;
		return this;
	}

	public bi a(CharSequence acharsequence[]) {
		c = acharsequence;
		return this;
	}
}
