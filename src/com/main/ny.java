package com.main;

import java.io.File;
import java.lang.ref.WeakReference;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;

class ny extends AsyncTask {
	private Context a;
	private WeakReference b;
	private String c;
	private String d;
	private int e;
	private int f;

	ny(Context paramContext, nx paramnx) {
		this.a = paramContext;
		this.b = new WeakReference(paramnx);
	}

	protected Boolean a(Void... paramVarArgs) {
		Boolean localBoolean = null;
		boolean bool = false;
		if (this.b.get() == null) {
			localBoolean = Boolean.valueOf(false);
		}

		this.d = null;
		try {
			gp localgp = nx.d((nx) this.b.get());
			gq localgq = localgp.d();
			String str1 = localgq.a();
			int i = str1.hashCode();
			nx.a((nx) this.b.get(), i);
			this.d = ol.a(this.a, i, 2, 0);
			if (!new File(this.d).exists()) {
				tz.a(this.a, str1, this.d);
			}
			this.f = localgq.c();
			this.e = localgq.b();
			String str2 = localgp.c().a();
			this.c = ol.a(this.a, i, 2);
			if (!new File(this.c).exists()) {
				tz.a(this.a, str2, this.c);
			}
			if ((!TextUtils.isEmpty(this.d)) && (new File(this.d).exists())) {
				bool = true;
				localBoolean = Boolean.valueOf(bool);
			}
		} catch (Throwable localThrowable) {

			vj.a("Swipe.AdRunner", "Could not download AD cover and icon",
					localThrowable);

		}
		return localBoolean;
	}

	protected void a(Boolean paramBoolean) {
		if (this.b.get() == null) {
		}

		if (paramBoolean.booleanValue()) {
			nx.b((nx) this.b.get(), this.d, this.c, this.e, this.f);
		} else {
			((nx) this.b.get()).a(null, null);
		}

	}

	@Override
	protected Object doInBackground(Object... params) {
		// TODO Auto-generated method stub
		return null;
	}
}
