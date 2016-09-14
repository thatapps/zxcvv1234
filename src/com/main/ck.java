package com.main;

import java.util.Iterator;

final class ck implements Iterator {

	final int a;
	int b;
	int c;
	boolean d;
	final cj e;

	ck(cj cj1, int i) {
		super();
		e = cj1;

		d = false;
		a = i;
		b = cj1.a();
	}

	public boolean hasNext() {
		return c < b;
	}

	public Object next() {
		Object obj = e.a(c, a);
		c = c + 1;
		d = true;
		return obj;
	}

	public void remove() {
		if (!d) {
			throw new IllegalStateException();
		} else {
			c = c - 1;
			b = b - 1;
			d = false;
			e.a(c);
			return;
		}
	}
}
