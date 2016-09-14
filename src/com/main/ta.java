package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public class ta {

	private static ta a = null;
	private Map b;
	private SoftReference c;
	private SoftReference d;
	private SoftReference e;
	private SoftReference f;

	private ta() {
		b = new HashMap();
	}

	public static ta a() {
		if (a == null) {
			a = new ta();
		}
		return a;
	}

	public Bitmap a(Context context) {
		Bitmap bitmap;
		Bitmap bitmap1;
		if (c == null) {
			bitmap = null;
		} else {
			bitmap = (Bitmap) c.get();
		}
		bitmap1 = bitmap;
		if (!tf.b(bitmap)) {
			bitmap1 = tf.a(context.getResources(), 0x7f020053);
			c = new SoftReference(bitmap1);
		}
		return bitmap1;
	}

	public Bitmap b(Context context) {
		Bitmap bitmap;
		Bitmap bitmap1;
		if (d == null) {
			bitmap = null;
		} else {
			bitmap = (Bitmap) d.get();
		}
		bitmap1 = bitmap;
		if (!tf.b(bitmap)) {
			bitmap1 = tf.a(context.getResources(), 0x7f020051);
			d = new SoftReference(bitmap1);
		}
		return bitmap1;
	}

	public Bitmap c(Context context) {
		Bitmap bitmap;
		Bitmap bitmap1;
		if (e == null) {
			bitmap = null;
		} else {
			bitmap = (Bitmap) e.get();
		}
		bitmap1 = bitmap;
		if (!tf.b(bitmap)) {
			bitmap1 = tf.a(context.getResources().getDrawable(0x7f020052),
					context.getResources().getDrawable(0x7f020061));
			e = new SoftReference(bitmap1);
		}
		return bitmap1;
	}

	public Bitmap d(Context context) {
		Bitmap bitmap;
		Bitmap bitmap1;
		if (f == null) {
			bitmap = null;
		} else {
			bitmap = (Bitmap) f.get();
		}
		bitmap1 = bitmap;
		if (!tf.b(bitmap)) {
			bitmap1 = tf.a(context.getResources(), 0x7f020020);
			f = new SoftReference(bitmap1);
		}
		return bitmap1;
	}

}
