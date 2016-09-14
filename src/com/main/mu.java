package com.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.lazyswipe.zev.R;

public class mu {
	private String a;
	private String b;
	private char c;
	private boolean d;
	private boolean e = true;
	private Uri f;
	private Uri g;
	private Bitmap h;
	private Drawable i;

	public Drawable a(Context paramContext) {
		if (this.i == null) {
			this.i = new tk(e(), paramContext.getResources().getColor(
					R.color.text_drawable_default_text_color), paramContext
					.getResources().getDimensionPixelSize(
							R.dimen.text_drawable_default_text_size));
		}
		return this.i;
	}

	public Uri a() {
		return this.g;
	}

	public void a(char paramChar) {
		this.c = paramChar;
	}

	public void a(Bitmap paramBitmap) {
		this.h = paramBitmap;
	}

	public void a(Uri paramUri) {
		this.g = paramUri;
	}

	public void a(String paramString) {
		this.a = paramString;
	}

	public void a(boolean paramBoolean) {
		this.d = paramBoolean;
	}

	public Bitmap b() {
		return this.h;
	}

	public void b(Uri paramUri) {
		this.f = paramUri;
	}

	public void b(String paramString) {
		this.b = paramString;
	}

	public void b(boolean paramBoolean) {
		this.e = paramBoolean;
	}

	public Uri c() {
		return this.f;
	}

	public String d() {
		return this.a;
	}

	public String e() {
		return this.b;
	}

	public char f() {
		return this.c;
	}

	public boolean g() {
		return this.d;
	}

	public boolean h() {
		return this.e;
	}

	public pv i() {
		return new pv(c(), e(), a(), b());
	}
}
