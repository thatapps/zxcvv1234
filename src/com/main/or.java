package com.main;

import java.lang.ref.WeakReference;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;

class or implements Runnable, tv {
	static int a;
	private final boolean b;
	private final Context c;
	private final int d;
	private final int e;
	private final String f;
	private final String g;
	private final WeakReference h;
	private final int i;
	private final boolean j;

	or(Context context, int n, int n2, String string, String string2, int n3,
			boolean bl, op op, boolean bl2) {
		this.j = bl2;
		this.b = bl;
		this.c = context.getApplicationContext();
		this.d = n;
		this.i = n2;
		this.e = n3;
		this.f = string;
		this.g = string2;
		WeakReference weakReference = op != null ? new WeakReference(
				(Object) op) : null;
		this.h = weakReference;
	}

	public void a(int n, String string) {
		String string2 = string != null ? tu.b(string) : null;
		ContentValues contentValues = new ContentValues(2);
		if (this.j) {
			contentValues.put("key_suppress_notify", Integer.valueOf((int) 0));
		}
		if (string2 != null) {
			contentValues.put("market_url", string2);
			if (this.b) {
				vk.f(this.c, string2);
			}
			if (this.h != null && this.h.get() != null) {
				((op) this.h.get()).a(this.d, this.e, string2);
			}
		} else {
			contentValues.put("resolve_failed", Integer.valueOf((int) 1));
			if (this.b) {
				jc.f(this.d, this.e);
				vk.f(this.c, this.g);
			} else {
				jc.c(this.d, this.e);
			}
			if (this.h != null && this.h.get() != null) {
				((op) this.h.get()).a(this.d, this.e);
			}
		}
		ContentResolver contentResolver = this.c.getContentResolver();
		Uri uri = kl.a;
		String[] arrstring = new String[] { String.valueOf((int) this.e),
				String.valueOf((int) this.d), String.valueOf((int) this.i) };
		contentResolver.update(uri, contentValues,
				"placement=? AND offer_id=? AND vendor=?", arrstring);
		a = -1;
	}

	public void run() {
		boolean bl;
		boolean bl2 = false;
		if (this.d == a) {
			return;
		}
		a = this.d;
		if (this.b) {
			jc.e(this.d, this.e);
		} else {
			jc.b(this.d, this.e);
		}
		if (bl = tu.a(this.f)) {
			this.a(0, this.f);
			return;
		}
		tw tw = ol.a((Context) this.c).C;
		if (tw != null) {
			tw.a(this.c, this.f, (tv) this);
		} else {
			bl2 = true;
		}
		if (!bl2)
			return;
		String string = bl ? this.f : tz.a(this.f);
		this.a(4, string);
	}
}
