package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

import android.content.Context;
import android.util.Log;

class fb implements Runnable {

	private static AtomicInteger d = new AtomicInteger(0);
	private WeakReference a;
	private String b;
	private ScheduledExecutorService c;

	public fb(Context context, String s,
			ScheduledExecutorService scheduledexecutorservice) {
		a = null;
		a = new WeakReference(context);
		b = s;
		c = scheduledexecutorservice;
	}

	public void run() {

		Context context = (Context) a.get();
		Object obj3 = null;
		Object obj6 = null;
		Object obj4 = null;
		Object obj2 = fa.b(context, fa.e(context));
		Object obj;
		Object obj5;
		int i = -1;
		StringBuilder stringBuilder = null;
		if (b != null && b.length() != 0) {

			d.incrementAndGet();

			if (context != null) {
				// break MISSING_BLOCK_LABEL_64;
			}
			d.decrementAndGet();
			// if (true) goto _L1; else goto _L3

		} else {
			return;

		}

		obj = "";
		if (obj2 == null) {

		}
		obj = (new StringBuilder()).append("-").append(((String) (obj2)));

		obj2 = (new StringBuilder())
				.append("https://api.appsflyer.com/install_data/v3/")
				.append(context.getPackageName()).append(((String) (obj)))
				.append("?devkey=").append(b).append("&device_id=")
				.append(fa.d(context));
		if (fa.f(context)) {
			Log.i("AppsFlyer_1.13",
					(new StringBuilder())
							.append("Calling server for attribution url: ")
							.append(((StringBuilder) (obj2)).toString())
							.toString());
		}
		try {
			obj3 = (HttpURLConnection) (new URL(
					((StringBuilder) (obj2)).toString())).openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = obj3;
		try {
			((HttpURLConnection) (obj3)).setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = obj3;
		((HttpURLConnection) (obj3)).setConnectTimeout(10000);
		obj = obj3;
		((HttpURLConnection) (obj3)).setRequestProperty("Connection", "close");
		obj = obj3;
		try {
			((HttpURLConnection) (obj3)).connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = obj3;
		try {
			if (((HttpURLConnection) (obj3)).getResponseCode() != 200) {
				obj = obj3;
				if (fa.b() == null) {
					// break MISSING_BLOCK_LABEL_725;
				}
				obj = obj3;
				fa.b().a(
						(new StringBuilder())
								.append("Error connection to server: ")
								.append(((HttpURLConnection) (obj3))
										.getResponseCode()).toString());
				obj = obj3;
				if (!fa.f(context)) {

					d.decrementAndGet();
					if (obj3 != null) {
						((HttpURLConnection) (obj3)).disconnect();
					}
					obj = obj3;
					fa.b().a(((Map) (obj2)));
					c.shutdown();
					return;

				} else {

					obj = obj3;
					Log.i("AppsFlyer_1.13",
							(new StringBuilder())
									.append("AttributionIdFetcher response code: ")
									.append(((HttpURLConnection) (obj3))
											.getResponseCode())
									.append("  url: ").append(obj2).toString());

					Object obj1 = obj3;

					d.decrementAndGet();
					if (obj3 != null) {
						((HttpURLConnection) (obj3)).disconnect();
					}
					obj = obj3;
					fa.b().a(((Map) (obj2)));
					c.shutdown();
					return;

				}

			} else {
				obj = obj3;
				stringBuilder = new StringBuilder();
				obj6 = new InputStreamReader(
						((HttpURLConnection) (obj3)).getInputStream());
				obj2 = new BufferedReader(((java.io.Reader) (obj6)));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// _L8:
		try {
			obj = ((BufferedReader) (obj2)).readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (obj == null) {

			if (obj2 == null) {
				// break MISSING_BLOCK_LABEL_418;
			}
			obj = obj3;
			try {
				((BufferedReader) (obj2)).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (obj6 == null) {
				// break MISSING_BLOCK_LABEL_430;
			}
			obj = obj3;
			try {
				((InputStreamReader) (obj6)).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj = obj3;
			if (!fa.f(context)) {
				// break MISSING_BLOCK_LABEL_471;
			}
			obj = obj3;
			Log.i("AppsFlyer_1.13",
					(new StringBuilder()).append("Attribution data: ")
							.append(stringBuilder.toString()).toString());
			obj = obj3;
			if (stringBuilder.length() <= 0 || context == null) {
				d.decrementAndGet();
				if (obj3 != null) {
					((HttpURLConnection) (obj3)).disconnect();
				}

			} else {

				obj = obj3;
				obj2 = fa.d(stringBuilder.toString());
				obj = obj3;
				obj5 = (String) ((Map) (obj2)).get("iscache");
				if (obj5 == null) {
					// break MISSING_BLOCK_LABEL_529;
				}
				obj = obj3;
				if (!"true".equals(obj5)) {
					// break MISSING_BLOCK_LABEL_616;
				}
				obj = obj3;
				obj6 = context.getSharedPreferences("appsflyer-data", 0).edit();
				obj = obj3;
				((android.content.SharedPreferences.Editor) (obj6)).putString(
						"attributionId", stringBuilder.toString());
				obj = obj3;
				((android.content.SharedPreferences.Editor) (obj6)).commit();
				obj = obj3;
				if (!fa.f(context)) {
					// break MISSING_BLOCK_LABEL_616;
				}
				obj = obj3;
				Log.d("AppsFlyer_1.13",
						(new StringBuilder()).append("iscache=")
								.append(((String) (obj5)))
								.append(" caching conversion data").toString());
				obj = obj3;
				if (fa.b() == null) {

					d.decrementAndGet();
					if (obj3 != null) {
						((HttpURLConnection) (obj3)).disconnect();
					}
					obj = obj3;
					fa.b().a(((Map) (obj2)));
					c.shutdown();
					return;

				} else {

					obj = obj3;
					i = d.intValue();
					if (i > 1) {

						d.decrementAndGet();
						if (obj3 != null) {
							((HttpURLConnection) (obj3)).disconnect();
						}
						obj = obj3;
						fa.b().a(((Map) (obj2)));
						c.shutdown();
						return;
					} else {

						obj = obj3;
						obj5 = fa.b(context);
						obj2 = obj5;

					}

				}

			}

		} else {

			stringBuilder.append(((String) (obj))).append('\n');
			// goto _L8
			// obj;
			obj4 = obj2;
			obj2 = obj;

		}

		if (obj4 == null) {
			// break MISSING_BLOCK_LABEL_327;
		}
		obj = obj3;
		try {
			((BufferedReader) (obj4)).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (obj6 == null) {
			// break MISSING_BLOCK_LABEL_339;
		}
		obj = obj3;
		try {
			((InputStreamReader) (obj6)).close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj = obj3;

		obj3 = obj;

		obj = obj2;
		if (fa.b() == null) {
			// break MISSING_BLOCK_LABEL_370;
		}
		obj = obj2;
		fa.b().a(((Throwable) (obj3)).getMessage());
		obj = obj2;
		Log.e("AppsFlyer_1.13", ((Throwable) (obj3)).getMessage(),
				((Throwable) (obj3)));
		d.decrementAndGet();
		if (obj2 != null) {
			((HttpURLConnection) (obj2)).disconnect();
		}

		obj = obj3;
		fa.b().a(((Map) (obj2)));

		d.decrementAndGet();
		if (obj2 != null) {
			((HttpURLConnection) (obj2)).disconnect();
		}

		obj2 = null;

	}
}
