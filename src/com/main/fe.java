package com.main;

import java.lang.ref.WeakReference;
import java.util.Map;

import android.content.Context;
import android.util.Log;

class fe implements Runnable {
	Map a;
	boolean b;
	private String c;
	private WeakReference d = null;

	public fe(String paramString, Map paramMap, Context paramContext,
			boolean paramBoolean) {
		this.c = paramString;
		this.a = paramMap;
		this.d = new WeakReference(paramContext);
		this.b = paramBoolean;
	}

	public void run() {
		String str1 = fa.a(this.a);
		String str2 = null;
		boolean bool1, bool2, bool3, bool4;

		try {
			Context localContext = (Context) this.d.get();
			if (localContext != null) {
				String str6 = ff.a().a(localContext);
				if ((str6 != null) && (str6.length() > 0)
						&& (this.a.get("referrer") == null)) {
					this.a.put("referrer", str6);
				}
				bool3 = "true".equals(localContext.getSharedPreferences(
						"appsflyer-data", 0).getString("sentSuccessfully", ""));
				String str7 = (String) this.a.get("eventName");
				Map localMap2 = this.a;
				if (str7 != null) {
					bool4 = false;
				}
				bool4 = true;
				localMap2.put("counter",
						Integer.toString(fa.a(localContext, bool4)));
				bool1 = bool3;
				Map localMap1 = this.a;
				if (bool1) {
					bool2 = false;
				}
				bool2 = true;
				localMap1.put("isFirstCall", Boolean.toString(bool2));
				String str3 = (String) this.a.get("appsflyerKey");
				if ((str3 == null) || (str3.length() == 0)) {
					Log.d(str1, "Not sending data yet, waiting for dev key");
				} else {
					String str4 = new fk().a(this.a);
					this.a.put("af_v", str4);
					String str5 = fa.b(this.a);
					str2 = str5;
					fa.a(this.c, str2, str3, this.d, null, str1, this.b);
				}
			}
		} catch (Throwable localThrowable) {
			Log.e(str1, localThrowable.getMessage(), localThrowable);
		}
		return;
		// label384:
		// boolean bool4 = false;
		// continue;
		// label390:
		// boolean bool2 = false;

	}
}
