package com.main;

import java.io.File;
import java.lang.ref.WeakReference;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

public class uf implements Runnable {

	final WeakReference a;
	final WeakReference b;
	final jq c;
	final Handler d;
	int e;
	int f;
	Drawable g;
	Bitmap h;
	final String i;
	final String j;
	final String k;

	public uf(Handler handler, View view, String s, String s1, int l, int i1,
			ue ue) {
		super();
		Object obj = null;

		b = new WeakReference(view);
		d = handler;
		c = null;
		i = null;
		j = s1;
		k = s;
		WeakReference weakReference = null;
		if (ue != null) {
			weakReference = new WeakReference(ue);
		}
		a = weakReference;
		e = l;
		f = i1;
	}

	public uf(Handler handler, View view, String s, ue ue) {
		super();
		Object obj = null;

		d = handler;
		b = new WeakReference(view);
		c = null;
		i = s;
		k = null;
		j = null;
		WeakReference weakReference = null;
		if (ue != null) {
			weakReference = new WeakReference((Object) ue);
		}
		this.a = weakReference;

	}

	public uf(Handler handler, View view, jq jq1, ue ue) {
		super();
		Object obj = null;

		d = handler;
		b = new WeakReference(view);
		c = jq1;
		i = null;
		k = null;
		j = null;
		WeakReference weakReference = null;
		if (ue != null) {
			weakReference = new WeakReference((Object) ue);
		}
		this.a = weakReference;
	}

	public void run() {

		PackageManager manager = null;
		Drawable drawable = null;
		try {
			if (b.get() == null) {
				return;
			}
		} catch (Throwable throwable) {
			Log.w("Swipe.IconLoader", "Failed to load icon", throwable);
			return;
		}
		if (TextUtils.isEmpty(j)) {

			manager = ((View) b.get()).getContext().getPackageManager();
			if (c != null) {
				drawable = c.a(((android.content.pm.PackageManager) (manager)));
			}

		} else {

			if (!(new File(k)).exists()
					&& !tz.a(((View) b.get()).getContext(), j, k, 10000, 10000)) {
				d.obtainMessage(1, this).sendToTarget();
				return;
			}
			if (e > 0 && f > 0) {

				Bitmap bitmap = tf.a(k, e, f, false);
				g = new BitmapDrawable(((View) b.get()).getContext()
						.getResources(), ((Bitmap) (bitmap)));

			} else {

				manager = ((View) b.get()).getContext().getPackageManager();
				if (c != null) {
					drawable = c
							.a(((android.content.pm.PackageManager) (manager)));
				}

			}

		}

		g = ((Drawable) (drawable));

		drawable = vk.a(((android.content.pm.PackageManager) (manager)), i);
		d.obtainMessage(1, this).sendToTarget();
		return;
	}
}
