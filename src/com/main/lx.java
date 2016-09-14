package com.main;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;

public class lx extends AsyncTask {

	private Context a;
	private WeakReference b;
	private String c;
	private int d;
	private int e;

	lx(Context context, mb mb1) {
		a = context;
		b = new WeakReference(mb1);
	}

	protected Boolean a(Void avoid[]) {
		if (b.get() == null) {
			return Boolean.valueOf(false);
		}
		c = null;
		boolean flag;
		try {
			gq gq = ((mb) b.get()).a.d();
			String s = gq.a();
			int i = s.hashCode();
			c = ol.a(a, i, 2, 0);
			if (!(new File(c)).exists()) {
				tz.a(a, s, c);
			}
			e = gq.c();
			d = gq.b();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.NotificationView",
					"Could not download AD cover and icon", exception);
		}
		if (!TextUtils.isEmpty(c) && (new File(c)).exists()) {
			flag = true;
		} else {
			flag = false;
		}
		return Boolean.valueOf(flag);
	}

	protected void a(Boolean boolean1) {
		if (b.get() == null) {
			return;
		}
		if (boolean1.booleanValue()) {
			((mb) b.get()).a();
			return;
		} else {
			((mb) b.get()).a(null, null);
			return;
		}
	}

	protected Object doInBackground(Object aobj[]) {
		return a((Void[]) aobj);
	}

	protected void onPostExecute(Object obj) {
		a((Boolean) obj);
	}
}
