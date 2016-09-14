package com.main;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class lb implements kz {

	private final int a;
	private CharSequence b;
	private CharSequence c;
	private Intent d;
	private Drawable e;
	private Drawable f;
	private int g;
	private ky h;
	private Runnable i;
	private la j;
	private int k;
	private int l;
	private int m;

	lb(ky ky1, int i1, CharSequence charsequence, int j1) {
		g = 0;
		k = 16;
		l = 0;
		m = 0;
		h = ky1;
		a = i1;
		b = charsequence;
		l = j1;
	}

	public int a() {
		return a;
	}

	public CharSequence a(lh lh1) {
		if (lh1 != null && lh1.a()) {
			return f();
		} else {
			return e();
		}
	}

	public kz a(la la1) {
		j = la1;
		return this;
	}

	public void a(Drawable drawable) {
		e = drawable;
	}

	public void b() {
		e = null;
	}

	public boolean c() {
		if (j != null && j.a(this)) {
			return true;
		}
		if (i != null) {
			i.run();
			return true;
		}
		if (d != null) {
			h.c().startActivity(d);
		}

		return true;

	}

	public boolean d() {
		return (k & 0x10) != 0;
	}

	public CharSequence e() {
		return b;
	}

	public CharSequence f() {
		if (c != null) {
			return c;
		} else {
			return b;
		}
	}

	public Drawable g() {
		return e;
	}

	public Drawable h() {
		if (f != null) {
			return f;
		}
		if (g != 0) {
			return h.c().getResources().getDrawable(g);
		} else {
			return null;
		}
	}

	public boolean i() {
		return (k & 8) == 0;
	}

	public boolean j() {
		return (k & 0x20) == 32;
	}

	public int k() {
		return m;
	}

	public String toString() {
		return b.toString();
	}
}
