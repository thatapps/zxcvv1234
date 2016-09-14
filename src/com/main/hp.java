package com.main;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.util.DisplayMetrics;

public class hp {
	private static final String a = hp.class.getSimpleName();
	private final Context b;
	private final String c;
	private final gn d;
	private final hx e;
	private final String f;
	private final int g;
	private final hr h;
	private final hy i;
	private final boolean j;

	public hp(Context paramContext, String paramString, gn paramgn, hx paramhx,
			hy paramhy, int paramInt, boolean paramBoolean, hr paramhr) {
		if ((paramString == null) || (paramString.length() < 1)) {
			throw new IllegalArgumentException("placementId");
		}
		if (paramgn == null) {
			throw new IllegalArgumentException("adSize");
		}
		if (paramhr == null) {
			throw new IllegalArgumentException("callback");
		}
		this.b = paramContext;
		this.c = paramString;
		this.d = paramgn;
		this.e = paramhx;
		this.f = ib.a(paramContext, paramhy);
		this.i = paramhy;
		this.g = paramInt;
		this.j = paramBoolean;
		this.h = paramhr;
	}

	static hq a(InputStream paramInputStream) {
		hq localhq1 = new hq();
		hq localhq2 = localhq1;
		try {
			Object localObject = new JSONTokener(hz.a(paramInputStream))
					.nextValue();
			JSONObject localJSONObject = null;
			if ((localObject instanceof JSONObject)) {
				localJSONObject = (JSONObject) localObject;
				if (!localJSONObject.has("error")) {
					localhq1.a = localJSONObject;
				}
			}
			for (localhq1.b = new gk(2000, ((JSONObject) hz.a(localJSONObject,
					"error")).optString("message", gk.d.b())); (localhq1.a == null)
					&& (localhq1.b == null); localhq1.b = null) {
				localhq2 = null;

				// label105:
			}
		} catch (Exception localException) {

			localhq1.b = new gk(2000, localException.getMessage());
			// continue;}

		}
		return localhq2;
	}

	private void a(Map paramMap) {
		paramMap.put("os", "Android");
		paramMap.put("os_version", Build.VERSION.RELEASE);
		DisplayMetrics localDisplayMetrics = this.b.getResources()
				.getDisplayMetrics();
		int k = (int) (localDisplayMetrics.widthPixels / localDisplayMetrics.density);
		int m = (int) (localDisplayMetrics.heightPixels / localDisplayMetrics.density);
		paramMap.put("screen_width", Integer.valueOf(k));
		paramMap.put("screen_height", Integer.valueOf(m));
		try {
			PackageInfo localPackageInfo = this.b.getPackageManager()
					.getPackageInfo(this.b.getPackageName(), 0);
			paramMap.put("app_build",
					Integer.valueOf(localPackageInfo.versionCode));
			paramMap.put("app_version", localPackageInfo.versionName);
			Locale localLocale = this.b.getResources().getConfiguration().locale;
			if (localLocale == null) {
				localLocale = Locale.getDefault();
			}
			paramMap.put("locale", localLocale.toString());
			return;
		} catch (PackageManager.NameNotFoundException localNameNotFoundException) {

			paramMap.put("app_version", Integer.valueOf(0));

		}
	}

	private void a(Map paramMap, ia paramia) {
		boolean bool = true;
		ic localic = ic.a(this.b, paramia);
		if (localic == null) {
			paramMap.put("tracking_enabled", Boolean.valueOf(bool));
			return;
		}
		if (!localic.b()) {
		}

		paramMap.put("tracking_enabled", Boolean.valueOf(bool));
		paramMap.put("device_id", localic.a());
		// break;
		bool = false;

	}

	private void b(Map paramMap) {
		paramMap.put("package_name", this.b.getPackageName());
	}

	private String c() {
		/*
		 * switch (hp.2.a[this.i.ordinal()]) { }
		 */
		for (String str = "network_ads";; str = "network_ads_native") {
			return str;
		}
	}

	private String c(Map map) {
		StringBuilder stringbuilder = new StringBuilder(512);
		Iterator iterator = map.entrySet().iterator();
		boolean flag = true;
		while (iterator.hasNext()) {
			java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
			if (flag) {
				flag = false;
			} else {
				stringbuilder.append("&");
			}
			try {
				stringbuilder
						.append(URLEncoder.encode((String) entry.getKey(), "utf-8"))
						.append("=")
						.append(URLEncoder.encode(String.valueOf(entry.getValue()),
								"utf-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return stringbuilder.toString();
	}

	@SuppressWarnings("unchecked")
	private Map d() {
		HashMap hashmap = new HashMap();
		ia ia1 = hz.a(b.getContentResolver());
		hashmap.put("ad_type", Integer.valueOf(i.a()));
		hashmap.put("sdk_capabilities", hw.b());
		hashmap.put("sdk_version", "4.0.0");
		hashmap.put("placement_id", c);
		hashmap.put("attribution_id", ia1.a);
		hashmap.put("width", Integer.valueOf(d.a()));
		hashmap.put("height", Integer.valueOf(d.b()));
		try {
			hashmap.put("template_id", Integer.valueOf(e.a()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hashmap.put("test_mode", Boolean.valueOf(j));
		hashmap.put("child_directed", Boolean.valueOf(gm.b()));
		hashmap.put("events", hj.a());
		hashmap.put("num_ads_requested", Integer.valueOf(g));
		a(hashmap);
		b(hashmap);
		a(hashmap, ia1);
		return hashmap;
	}

	private URL e() {
		String str1 = gm.a();
		if (hh.a(str1)) {
		}
		Object[] arrayOfObject1;
		arrayOfObject1 = new Object[1];
		arrayOfObject1[0] = str1;
		for (String str2 = "https://graph.facebook.com";; str2 = String.format(
				"http://graph.%s.facebook.com", arrayOfObject1)) {
			Object[] arrayOfObject2 = new Object[2];
			arrayOfObject2[0] = str2;
			arrayOfObject2[1] = c();
			try {
				return new URL(String.format("%s/%s", arrayOfObject2));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	private HttpURLConnection f() {
		HttpURLConnection localHttpURLConnection = null;
		try {
			localHttpURLConnection = (HttpURLConnection) e().openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		localHttpURLConnection.setRequestProperty("User-Agent", this.f);
		localHttpURLConnection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		try {
			localHttpURLConnection.setRequestMethod("POST");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		localHttpURLConnection.setDoOutput(true);
		localHttpURLConnection.setConnectTimeout(30000);
		localHttpURLConnection.setReadTimeout(30000);
		String str = c(d());
		BufferedOutputStream localBufferedOutputStream = null;
		try {
			localBufferedOutputStream = new BufferedOutputStream(
					localHttpURLConnection.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter localBufferedWriter = null;
		try {
			localBufferedWriter = new BufferedWriter(new OutputStreamWriter(
					localBufferedOutputStream, "utf-8"));
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			localBufferedWriter.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			localBufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			localBufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			localBufferedOutputStream.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			localHttpURLConnection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return localHttpURLConnection;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AsyncTask a() {
		gs.a(this.b);
		return new AsyncTask() {

			protected/* varargs */hq a(Void... arrvoid) {
				return hp.this.b();
			}

			protected void a(hq hq) {
				if (hq == null) {
					hp.this.h.a(gk.e);
					return;
				}
				if (hq.b != null) {
					hp.this.h.a(hq.b);
					return;
				}
				hv hv1 = hv.a(hp.this.b, hq.a);
				hp.this.h.a(hv1);
			}

			protected/* synthetic */Object doInBackground(Object[] arrobject) {
				return this.a((Void[]) arrobject);
			}

			protected/* synthetic */void onPostExecute(Object object) {
				this.a((hq) object);
			}
		}.execute((Object[]) new Void[0]);
	}

	/* Error */
	public hq b() {
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		obj2 = null;
		obj3 = null;
		obj1 = null;
		obj4 = null;
		obj = null;
		Object obj5 = f();
		obj = obj5;
		obj3 = obj4;
		try {
			if (((HttpURLConnection) (obj)).getResponseCode() < 400) {

				obj3 = obj4;
				obj1 = ((HttpURLConnection) (obj)).getInputStream();
				obj2 = obj;
				obj4 = obj1;
				obj3 = obj1;
				obj5 = a(((InputStream) (obj1)));
				obj2 = obj5;
				hz.a(((java.io.Closeable) (obj1)));
				obj1 = obj2;

				if (obj != null) {
					((HttpURLConnection) (obj)).disconnect();
					obj1 = obj2;
				}

			} else {
				obj3 = obj4;
				obj1 = ((HttpURLConnection) (obj)).getErrorStream();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		obj3 = obj;
		obj2 = obj1;
		obj5 = new hq();
		obj3 = obj;
		obj2 = obj1;

		//hz.a(((java.io.Closeable) (obj1)));
		obj1 = obj5;
		if (obj == null) {
			return ((hq) (obj1));
		} else {
			obj = obj2;
			((HttpURLConnection) (obj)).disconnect();
			return ((hq) (obj5));
		}
	}

}
