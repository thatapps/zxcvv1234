package com.main;

import android.graphics.Bitmap;

public abstract class tc {
	private String a = null;
	private Bitmap b;
	private String c;
	boolean d = true;

	private String c() {
		if ((this.a == null) || (this.a.equals(""))) {
			this.a = uh.a(a());
		}
		return this.a;
	}

	public String a() {
		return this.c;
	}

	static Bitmap a(tc tc1, Bitmap bitmap) {
		tc1.b = bitmap;
		return bitmap;
	}

	static String a(tc tc1) {
		return tc1.c();
	}

	static Bitmap b(tc tc1) {
		return tc1.b;
	}

	public Bitmap b() {
		return this.b;
	}

	public String toString() {
		return "Attachment[url = " + this.c + ", -- " + hashCode();
	}
}
