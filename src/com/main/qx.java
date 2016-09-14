package com.main;

import android.content.Context;

public class qx extends ql {

	private static final int a[] = { 0x7f02009d, 0x7f02009f, 0x7f02009e,
			0x7f0200a0 };
	private static final int b[] = { 15000, 30000, 60000, 0x493e0 };
	private int c;

	public qx(Context context) {
		this(context, null);
	}

	public qx(Context context, rd rd) {
		super(context, rd);
	}

	public int a(Context context) {
		return 0;
	}

	public int a(boolean flag) {
		return 0;
	}

	public boolean a(int i) {
		return e(d) != 0x7f02009d;
	}

	public String b() {
		return "Screen timeout";
	}

	public int c() {
		return 0x7f0f00c0;
	}

	public boolean d(Context context) {
		int i = c + 1;
		c = i;
		if (i >= a.length) {
			c = 0;
		}
		android.provider.Settings.System.putInt(d.getContentResolver(),
				"screen_off_timeout", b[c]);
		return false;
	}

	public int e(Context context) {
		int i = android.provider.Settings.System.getInt(d.getContentResolver(),
				"screen_off_timeout", 0);
		if (i > b[0]) {

			if (i > b[b.length - 1]) {
				c = b.length - 1;
			}

		} else {
			c = 0;

		}

		c = b.length - 2;
		while (c > 0 && i < b[c]) {
			c = c - 1;
		}

		return a[c];
	}
}
