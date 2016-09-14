package com.main;

import java.lang.ref.WeakReference;
import java.util.Iterator;

import android.content.Context;
import android.util.Log;

class fc implements Runnable {
	private WeakReference a = null;

	public fc(Context paramContext) {
		this.a = new WeakReference(paramContext);
	}

	public void run() {
		if (fa.c()) {
		}

		fa.a(System.currentTimeMillis());
		if (this.a == null) {
			// continue;
			return;
		}
		fa.a(true);
		try {
			String str = fa.a("AppsFlyerKey");
			synchronized (this.a) {
				Iterator localIterator = fm.a().b((Context) this.a.get())
						.iterator();

				if (localIterator.hasNext()) {
					fn localfn = (fn) localIterator.next();
					if (fa.f((Context) this.a.get())) {
						Log.i("AppsFlyer_1.13",
								"resending request: " + localfn.c());
					}
					try {
						fa.a(localfn.c() + "&isCachedRequest=true",
								localfn.b(), str, this.a, localfn.d(),
								"AppsFlyer_1.13", false);
					} catch (Exception localException2) {
					}
				}

			}
		} catch (Exception localException1) {
			Log.e("AppsFlyer_1.13", "failed to check cache.");
			fa.a(false);
			for (;;) {
				fa.d().shutdown();
				// fa.a(null);

				fa.a(false);
				break;
			}
		} finally {
			fa.a(false);
		}
		return;

	}
}
