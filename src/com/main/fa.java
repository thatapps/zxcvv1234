package com.main;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Log;

//import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/*
 * Failed to analyse overrides
 */
public class fa extends BroadcastReceiver {
	public static final Uri a = Uri
			.parse((String) "content://com.facebook.katana.provider.AttributionIdProvider");
	private static final List b = Arrays
			.asList((Object[]) new String[] { "is_cache" });
	private static ez c = null;
	private static boolean d = false;
	private static long e;
	private static ScheduledExecutorService f;

	static {
		f = null;
	}

	static/* synthetic */int a(Context context, boolean bl) {
		return fa.b(context, bl);
	}

	static/* synthetic */long a(long l) {
		e = l;
		return l;
	}

	public static String a() {
		return fa.a("AppUserId");
	}

	/*
	 * Exception decompiling
	 */
	public static String a(ContentResolver contentresolver) {
		ContentResolver contentresolver1;
		Cursor cursor;
		String string;
		contentresolver1 = null;
		cursor = contentresolver.query(a, new String[] { "aid" }, null, null,
				null);
		if (cursor == null) {
			// break MISSING_BLOCK_LABEL_37;
		}
		boolean flag = cursor.moveToFirst();
		if (flag) {
			// break MISSING_BLOCK_LABEL_53;
		}
		contentresolver = contentresolver1;
		if (cursor != null) {
			try {
				cursor.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			contentresolver = contentresolver1;
		}

		string = cursor.getString(cursor.getColumnIndex("aid"));
		contentresolver1 = contentresolver;
		contentresolver = contentresolver1;
		if (cursor != null) {
			try {
				cursor.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return string;
			}
			return string;
		}

		Log.w("AppsFlyer_1.13", "Could not collect cursor attribution");
		contentresolver = contentresolver1;
		if (cursor != null) {
			try {
				cursor.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception xdds) {
				return null;
			}
			return null;
		} else {

		}

		if (cursor != null) {
			try {
				cursor.close();
			} catch (Exception exception) {
			}
		}
		return string;
	}

	public static String a(String string) {
		return ff.a().b(string);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private static String a(SimpleDateFormat simpleDateFormat, Context context) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				"appsflyer-data", 0);
		String string = sharedPreferences.getString("appsFlyerFirstInstall",
				null);
		if (string == null) {
			if (fa.h(context)) {
				if (fa.g(context)) {
					Log.d((String) "AppsFlyer_1.13",
							(String) "AppsFlyer: first launch detected");
				}
				string = simpleDateFormat.format(new Date());
			} else {
				string = "";
			}
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("appsFlyerFirstInstall", string);
			editor.commit();
		}
		if (fa.g(context)) {
			Log.i((String) "AppsFlyer_1.13",
					(String) ("AppsFlyer: first launch date: " + string));
		}
		return string;
	}

	static/* synthetic */String a(Map map) {
		return fa.c(map);
	}

	static ScheduledExecutorService a(
			ScheduledExecutorService scheduledExecutorService) {
		f = scheduledExecutorService;
		return scheduledExecutorService;
	}

	public static void a(Context context) {
		fa.a(context, (String) null);
		if (fa.g(context)) {
			Log.i((String) "AppsFlyer_1.13",
					(String) ("Start tracking package: " + context
							.getPackageName()));
		}
	}

	@Deprecated
	public static void a(Context context, String string) {
		fa.a(context, string, null, null);
	}

	public static void a(Context context, String string, String string2,
			String string3) {
		String string4;
		if (string2 != null && string3 != null
				&& string3.matches("-?\\d+(\\.\\d+)?")) {
			Log.i((String) "AppsFlyer_1.13",
					(String) ("AppsFLyer: numeric value '" + string3
							+ "' for event '" + string2 + "' will be categorized as a revenue event."));
		}
		if ((string4 = ff.a().a(context)) == null) {
			string4 = "";
		}
		fa.b(context, string, string2, string3, string4);
	}

	static void a(Context context, String s, String s1, String s2, String s3) {
		c(context, null, s1, s2, s3);
	}

	/*
	 * Exception decompiling
	 */
	private static void a(Context context, Map map) {
		String s;
		String s1 = null;
		SharedPreferences sharedpreferences;
		boolean flag;
		Object obj;
		String setting;

		if (!ff.a().b("deviceTrackingDisabled", false)) {

			sharedpreferences = context.getSharedPreferences("appsflyer-data",
					0);
			flag = ff.a().b("collectIMEI", true);
			s = sharedpreferences.getString("imeiCached", null);
			if (!flag) {

				flag = ff.a().b("collectAndroidId", true);
				obj = sharedpreferences.getString("androidIdCached", null);
				if (!flag) {

					return;

				} else {

					try {
						setting = android.provider.Settings.Secure.getString(
								context.getContentResolver(), "android_id");
					}
					// Misplaced declaration of an exception variable
					catch (Exception dfd) {
						return;
					}
					if (context != null) {

						obj = sharedpreferences.edit();
						((android.content.SharedPreferences.Editor) (obj))
								.putString("androidIdCached", setting);
						if (android.os.Build.VERSION.SDK_INT < 9) {
							((android.content.SharedPreferences.Editor) (obj))
									.apply();
							((android.content.SharedPreferences.Editor) (obj))
									.commit();
							map.put("android_id", setting);
							return;
						}

						else {

							context = ((Context) (obj));

						}
					}

				}
			} else {

				TelephonyManager telephonymanager = (TelephonyManager) context
						.getSystemService("phone");
				try {
					s1 = (String) telephonymanager.getClass()
							.getMethod("getDeviceId", new Class[0])
							.invoke(telephonymanager, new Object[0]);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (s1 != null) {

					obj = s1;
					if (s != null) {

						if (obj != null) {
							try {
								map.put("imei", obj);
							}
							// Misplaced declaration of an exception variable
							catch (Exception exception) {
								Log.i("AppsFlyer_1.13",
										"WARNING:READ_PHONE_STATE is missing");
							}
						}

					} else {

						obj = sharedpreferences.edit();
						((android.content.SharedPreferences.Editor) (obj))
								.putString("imeiCached", s1);
						if (android.os.Build.VERSION.SDK_INT < 9) {
							// break MISSING_BLOCK_LABEL_241;
						}
						((android.content.SharedPreferences.Editor) (obj))
								.apply();
						obj = s1;

						((android.content.SharedPreferences.Editor) (obj))
								.commit();
						obj = s1;
						try {
							map.put("imei", obj);
						}
						// Misplaced declaration of an exception variable
						catch (Exception ex) {
							Log.i("AppsFlyer_1.13",
									"WARNING:READ_PHONE_STATE is missing");
						}

					}

				} else {

					obj = s;

				}

			}
		} else {
			map.put("deviceTrackingDisabled", "true");
		}

	}

	/*
	 * Exception decompiling
	 */
	private void a(String s, Context context) {
		Object obj;
		HttpURLConnection httpurlconnection;
		Object obj2;
		httpurlconnection = null;
		obj2 = null;
		obj = httpurlconnection;
		Object obj1 = (new StringBuilder())
				.append("https://track.appsflyer.com/api/v2.3/uninsall?buildnumber=1.13")
				.toString();
		obj = httpurlconnection;
		if (!g(context)) {
			// break MISSING_BLOCK_LABEL_67;
		}
		obj = httpurlconnection;
		Log.i("AppsFlyer_1.13",
				(new StringBuilder())
						.append("Calling server for uninstall url: ")
						.append(((String) (obj1))).toString());
		obj = httpurlconnection;
		Object obj3 = new HashMap();
		obj = httpurlconnection;
		((Map) (obj3)).put("packageName", s);
		obj = httpurlconnection;
		b(context, ((Map) (obj3)));
		obj = httpurlconnection;
		a(context, ((Map) (obj3)));
		obj = httpurlconnection;
		obj3 = d(((Map) (obj3)));
		obj = httpurlconnection;
		try {
			httpurlconnection = (HttpURLConnection) (new URL(((String) (obj1))))
					.openConnection();
		} catch (MalformedURLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		} catch (IOException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		try {
			httpurlconnection.setRequestMethod("POST");
		} catch (ProtocolException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		int i1 = ((String) (obj3)).getBytes().length;
		httpurlconnection.setRequestProperty("Content-Length",
				(new StringBuilder()).append(i1).append("").toString());
		httpurlconnection.setRequestProperty("Connection", "close");
		httpurlconnection.setConnectTimeout(10000);
		httpurlconnection.setDoOutput(true);
		try {
			obj1 = new OutputStreamWriter(httpurlconnection.getOutputStream());
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			((OutputStreamWriter) (obj1)).write(((String) (obj3)));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if (obj1 == null) {
			// break MISSING_BLOCK_LABEL_242;
		}
		try {
			((OutputStreamWriter) (obj1)).close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (httpurlconnection.getResponseCode() != 200) {

				if (!g(context)) {

					if (httpurlconnection != null) {
						httpurlconnection.disconnect();
					}

				} else {

					Log.i("AppsFlyer_1.13",
							(new StringBuilder())
									.append("Failed to send uninstall: ")
									.append(s).toString());
					if (httpurlconnection != null) {
						httpurlconnection.disconnect();
					}

					obj = httpurlconnection;

				}

			} else {
				if (g(context)) {
					Log.i("AppsFlyer_1.13",
							(new StringBuilder())
									.append("Uninstall sent successfully: ")
									.append(s).toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		obj = httpurlconnection;
		if (!g(context)) {
			// continue; /* Loop/switch isn't completed */
		}
		obj = httpurlconnection;
		// Log.i("AppsFlyer_1.13",
		// (new StringBuilder()).append("Failed to send uninstall: ")
		// .append(s).append(" :")
		// .append(Throwable.getLocalizedMessage()).toString());
		if (httpurlconnection == null) {

			return;

		} else {

			httpurlconnection.disconnect();
			return;

		}

	}

	protected static void a(String string, String string2) {
		ff.a().a(string, string2);
	}

	private static void a(String string, String string2, Context context) {
		if (context != null
				&& "com.appsflyer".equals((Object) context.getPackageName())) {
			fi.a().a(string + string2);
		}
	}

	static/* synthetic */void a(String string, String string2, String string3,
			WeakReference weakReference, String string4, String string5,
			boolean bl) {
		try {
			fa.b(string, string2, string3, weakReference, string4, string5, bl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Exception decompiling
	 */

	private static void a(URL url, String s, String s1,
			WeakReference weakreference, String s2, String s3, boolean flag) {
		Context context = (Context) weakreference.get();
		SharedPreferences preferences = null;
		;
		HttpURLConnection httpurlconnection = null;
		try {
			httpurlconnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			httpurlconnection.setRequestMethod("POST");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i1 = s.getBytes().length;
		httpurlconnection.setRequestProperty("Content-Length",
				(new StringBuilder()).append(i1).append("").toString());
		httpurlconnection.setRequestProperty("Connection", "close");
		httpurlconnection.setConnectTimeout(10000);
		httpurlconnection.setDoOutput(true);
		OutputStreamWriter outputstreamwriter = null;
		try {
			outputstreamwriter = new OutputStreamWriter(
					httpurlconnection.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			outputstreamwriter.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (outputstreamwriter == null) {
			// break MISSING_BLOCK_LABEL_116;
		}
		try {
			outputstreamwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int j1 = 0;
		try {
			j1 = httpurlconnection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (g(context)) {
			Log.i(s3, (new StringBuilder()).append("response code: ")
					.append(j1).toString());
		}
		b(context, s3, "SERVER_RESPONSE_CODE", Integer.toString(j1));
		a("response from server. status=", Integer.toString(j1), context);
		preferences = context.getSharedPreferences("appsflyer-data", 0);
		if (j1 != 200) {
			// break MISSING_BLOCK_LABEL_261;
		}
		if (s2 == null) {
			// break MISSING_BLOCK_LABEL_218;
		}
		fm.a().a(s2, context);
		if (weakreference.get() == null || s2 != null) {
			// break MISSING_BLOCK_LABEL_261;
		}
		Editor eid = preferences.edit();
		eid.putString("sentSuccessfully", "true");
		eid.commit();
		l(context);
		if (preferences.getString("attributionId", null) != null || s1 == null
				|| !flag) {

			if (s1 != null) {
				if (!flag) {

					if (httpurlconnection != null) {
						httpurlconnection.disconnect();
					}

					// url;
					s = null;
					return;

				} else {

					if (c == null
							|| preferences.getString("attributionId", null) == null) {

						if (httpurlconnection != null) {
							httpurlconnection.disconnect();
						}
						return;

					} else {

						int k1 = b(context, false);
						if (k1 <= 1) {

							if (httpurlconnection != null) {
								httpurlconnection.disconnect();
							}
							return;

						} else {

							OutputStreamWriter writer = outputstreamwriter;
							Map map = b(context);
							if (url != null) {
								try {
									c.a(map);
								}
								// Misplaced declaration of an exception
								// variable
								catch (Exception ur) {
								} finally {
									// s = httpurlconnection;
								}
							}
							// goto _L5
							// url;
							// goto _L9
							// url;
							// s = outputstreamwriter;
							// goto _L10

						}
					}

				}

			} else {

				Log.w(s3, "AppsFlyer dev key is missing.");

			}

		} else {

			ScheduledExecutorService service = Executors
					.newSingleThreadScheduledExecutor();
			service.schedule(new fb(context.getApplicationContext(), s1,
					service), 10L, TimeUnit.MILLISECONDS);

		}

	}

	static/* synthetic */boolean a(boolean bl) {
		d = bl;
		return bl;
	}

	private static int b(Context context, boolean bl) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				"appsflyer-data", 0);
		int n = sharedPreferences.getInt("appsFlyerCount", 0);
		if (bl) {
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putInt("appsFlyerCount", ++n);
			editor.commit();
		}
		return n;
	}

	static/* synthetic */ez b() {
		return c;
	}

	static/* synthetic */String b(Context context, String string) {
		return fa.c(context, string);
	}

	static/* synthetic */String b(Map map) {
		return fa.d(map);
	}

	public static Map b(Context context) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				"appsflyer-data", 0);
		String string = ff.a().a(context);
		if (string != null && string.length() > 0
				&& string.contains((CharSequence) "af_tranid")) {
			return fa.b(string, context);
		}
		String string2 = sharedPreferences.getString("attributionId", null);
		if (string2 != null && string2.length() > 0) {
			return fa.f(string2);
		}
		return null;

	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private static Map b(String string, Context context) {
		HashMap hashMap = new HashMap();
		int n = string.indexOf(38);
		if (n >= 0 && string.length() > n + 1) {
			String[] arrstring = string.split("\\&");
			int n2 = arrstring.length;
			for (int i = 0; i < n2; ++i) {
				String[] arrstring2 = arrstring[i].split("=");
				String string2 = fa.e(arrstring2[0]);
				String string3 = arrstring2.length > 1 ? arrstring2[1] : "";
				hashMap.put((Object) string2, (Object) string3);
			}
			try {
				if (!hashMap.containsKey((Object) "install_time")) {
					long l = context.getPackageManager().getPackageInfo(
							(String) context.getPackageName(), (int) 0).firstInstallTime;
					hashMap.put(
							(Object) "install_time",
							(Object) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
									.format(new Date(l)));
				}
			} catch (Exception var7_11) {
				Log.w((String) "AppsFlyer_1.13",
						(String) "Could not fetch install time");
			}
			if (!hashMap.containsKey((Object) "af_status")) {
				hashMap.put((Object) "af_status", (Object) "Non-organic");
			}
		}
		return hashMap;
	}

	private static void b(Context context, String string, String string2,
			String string3) {
		if (ff.a().b("shouldMonitor", false)) {
			Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
			intent.setPackage("com.appsflyer.nightvision");
			intent.putExtra("message", string2);
			intent.putExtra("value", string3);
			intent.putExtra("packageName", "true");
			intent.putExtra("pid", (Serializable) new Integer(Process.myPid()));
			intent.putExtra("eventIdentifier", string);
			intent.putExtra("sdk", "2.3.1.13");
			context.sendBroadcast(intent);
		}
	}

	private static void b(Context context, String string, String string2,
			String string3, String string4) {
		ScheduledExecutorService scheduledExecutorService = Executors
				.newSingleThreadScheduledExecutor();
		scheduledExecutorService.schedule((Runnable) new fd(context, string,
				string2, string3, string4,
				(ExecutorService) scheduledExecutorService), 5,
				TimeUnit.MILLISECONDS);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private static void b(Context context, Map map) {
		try {
			Class.forName((String) "com.google.android.gms.ads.identifier.AdvertisingIdClient");
			/*AdvertisingIdClient.Info info = AdvertisingIdClient
					.getAdvertisingIdInfo((Context) context);*/
		//	String string = info.getId();
		//	map.put((Object) "advertiserId", (Object) string);
		//	boolean bl = !info.isLimitAdTrackingEnabled();
		//	String string2 = Boolean.toString((boolean) bl);
		//	map.put((Object) "advertiserIdEnabled", (Object) string2);
		//	ff.a().a("advertiserId", string);
		//	ff.a().a("advertiserIdEnabled", string2);
			return;
		} catch (ClassNotFoundException var9_6) {
			if (!fa.g(context))
				return;
			Log.i((String) "AppsFlyer_1.13",
					(String) "WARNING:Google Play services SDK jar is missing.");
			return;
		} catch (Exception var2_7) {
			String string;
			String string3 = ff.a().b("advertiserId");
			if (string3 != null) {
				map.put((Object) "advertiserId", (Object) string3);
			}
			if ((string = ff.a().b("advertiserIdEnabled")) != null) {
				map.put((Object) "advertiserIdEnabled", (Object) string);
			}
			if (var2_7.getLocalizedMessage() != null) {
				Log.i((String) "AppsFlyer_1.13",
						(String) var2_7.getLocalizedMessage());
			} else {
				Log.i((String) "AppsFlyer_1.13", (String) var2_7.toString());
			}
			fa.a("Could not fetch advertiser id: ",
					var2_7.getLocalizedMessage(), context);
			return;
		}
	}

	public static void b(String string) {
		fa.a("AppUserId", string);
	}

	private static void b(String string, String string2, String string3,
			WeakReference weakReference, String string4, String string5,
			boolean bl) throws IOException {
		URL uRL = null;
		try {
			uRL = new URL(string);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (fa.g((Context) weakReference.get())) {
			Log.i((String) string5, (String) ("url: " + uRL.toString()));
		}
		fa.a("call server.", "\n" + uRL.toString() + "\nPOST:" + string2,
				(Context) weakReference.get());
		if (fa.g((Context) weakReference.get())) {
			Log.i((String) string5, (String) ("data: " + string2));
		}
		fa.b((Context) weakReference.get(), string5, "EVENT_DATA", string2);
		if (bl) {
			ff.a().d();
		}
		fa.a(uRL, string2, string3, weakReference, string4, string5, bl);
		return;
	}

	private static String c(Context context, String string) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				"appsflyer-data", 0);
		if (sharedPreferences.contains("CACHED_CHANNEL")) {
			return sharedPreferences.getString("CACHED_CHANNEL", null);
		}
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("CACHED_CHANNEL", string);
		editor.commit();
		return string;
	}

	private static String c(Map map) {
		String string = (String) map.get((Object) "af_timestamp");
		if (string == null || string.length() < 5) {
			return "AppsFlyer_1.13";
		}
		return "AppsFlyer_1.13-" + string.substring(4);
	}

	/*
	 * Exception decompiling
	 */
	private static void c(Context context, String[] s, String s1, String s2,
			String s3) {
		Object obj;
		String s4;
		HashMap hashmap;
		StringBuilder stringbuilder;
		String s5;
		int i1 = 0;
		int j1 = 0;
		Intent intent;
		SharedPreferences pre;
		long l1;
		long l2;
		boolean flag;
		if (s1 == null) {
			flag = true;
		} else {
			flag = false;
		}
		hashmap = new HashMap();
		hashmap.put("af_timestamp", Long.toString((new Date()).getTime()));
		s4 = c(((Map) (hashmap)));
		if (!g(context)) {
			if (flag) {
				obj = "Launch";
			} else {
				obj = s1;
			}
			b(context, s4, "EVENT_CREATED_WITH_NAME", ((String) (obj)));
			fm.a().a(context);
			try {
				obj = Arrays.asList(context.getPackageManager().getPackageInfo(
						context.getPackageName(), 4096).requestedPermissions);
				if (!((List) (obj)).contains("android.permission.INTERNET")) {
					Log.w("AppsFlyer_1.13",
							"Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
					b(context, null, "PERMISSION_INTERNET_MISSING", null);
				}
				if (!((List) (obj))
						.contains("android.permission.ACCESS_NETWORK_STATE")) {
					Log.w("AppsFlyer_1.13",
							"Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
				}
				if (!((List) (obj))
						.contains("android.permission.ACCESS_WIFI_STATE")) {
					Log.w("AppsFlyer_1.13",
							"Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
				}
			}
			// Misplaced declaration of an exception variable
			catch (Exception sd) {
			}
			stringbuilder = new StringBuilder();
			stringbuilder
					.append("https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.13&app_id=")
					.append(context.getPackageName());
			hashmap.put("brand", Build.BRAND);
			hashmap.put("device", Build.DEVICE);
			hashmap.put("product", Build.PRODUCT);
			hashmap.put("sdk",
					Integer.toString(android.os.Build.VERSION.SDK_INT));
			hashmap.put("model", Build.MODEL);
			hashmap.put("deviceType", Build.TYPE);
			obj = ff.a().b("sdkExtension");
			if (obj == null) {
				// /break MISSING_BLOCK_LABEL_390;
			}
			if (((String) (obj)).length() > 0) {
				hashmap.put("sdkExtension", obj);
			}
			obj = m(context);
			s5 = c(context, ((String) (obj)));
			if (s5 == null) {
				// break MISSING_BLOCK_LABEL_422;
			}
			hashmap.put("channel", s5);
			if (s5 == null) {
				if (s5 != null || obj == null) {

					obj = i(context);
					if (obj == null) {
						// break MISSING_BLOCK_LABEL_480;
					}
					hashmap.put("af_installstore",
							((String) (obj)).toLowerCase());
					obj = k(context);
					if (obj == null) {
						// break MISSING_BLOCK_LABEL_507;
					}
					hashmap.put("af_preinstall_name",
							((String) (obj)).toLowerCase());
					obj = j(context);
					if (obj == null) {
						// break MISSING_BLOCK_LABEL_534;
					}
					hashmap.put("af_currentstore",
							((String) (obj)).toLowerCase());
					if (s == null) {
						// break MISSING_BLOCK_LABEL_548;
					}
					obj = s;
					if (s.length != 0) {
						// break MISSING_BLOCK_LABEL_556;
					}
					obj = a("AppsFlyerKey");
					if (obj == null) {
						try {
							Log.e(s4,
									"AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.setAppsFlyerKey(...) to set it. ");
							b(context, s4, "DEV_KEY_MISSING", null);
							Log.e(s4, "AppsFlyer will not track this event.");
							return;
						}
						// Misplaced declaration of an exception variable
						catch (Exception es) {

						}
						return;

					} else {

						if (((String) (obj)).length() <= 0) {

							try {
								Log.e(s4,
										"AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.setAppsFlyerKey(...) to set it. ");
								b(context, s4, "DEV_KEY_MISSING", null);
								Log.e(s4,
										"AppsFlyer will not track this event.");
								return;
							}
							// Misplaced declaration of an exception variable
							catch (Exception df) {
								// Log.e(s4, context.getLocalizedMessage(),
								// context);
							}
							return;

						} else {

							hashmap.put("appsflyerKey", obj);
							if (((String) (obj)).length() > 8) {
								hashmap.put("dkh",
										((String) (obj)).substring(0, 8));
							}
							String sq = a();
							if (s == null) {
								// break MISSING_BLOCK_LABEL_631;
							}
							hashmap.put("appUserId", sq);
							s = ff.a().a("userEmails");
							if (sq == null) {

								sq = a("userEmail");
								if (s == null) {

									if (s1 == null) {
										// break MISSING_BLOCK_LABEL_788;
									}
									hashmap.put("eventName", s1);
									if (s2 == null) {
										// break MISSING_BLOCK_LABEL_788;
									}
									hashmap.put("eventValue", s2);
									if (a("appid") != null) {
										hashmap.put("appid", a("appid"));
									}
									sq = a("currencyCode");
									if (s == null) {
										// break MISSING_BLOCK_LABEL_877;
									}
									if (s.length != 3) {
										Log.w("AppsFlyer_1.13",
												(new StringBuilder())
														.append("WARNING:currency code should be 3 characters!!! '")
														.append(s)
														.append("' is not a legal value.")
														.toString());
									}
									hashmap.put("currency", s);
									sq = a("IS_UPDATE");
									if (s == null) {
										// break MISSING_BLOCK_LABEL_900;
									}
									hashmap.put("isUpdate", s);
									hashmap.put("af_preinstalled",
											Boolean.toString(c(context)));
									sq = a(context.getContentResolver());
									if (s == null) {
										// break MISSING_BLOCK_LABEL_942;
									}
									hashmap.put("fb", s);
									a(context, hashmap);
									sq = fl.a(context);
									if (s == null) {
										// break MISSING_BLOCK_LABEL_969;
									}
									hashmap.put("uid", s);

								} else {

									hashmap.put("sha1_el", fk.a(sq));
									// goto _L17
									// s;
									// Log.i("AppsFlyer_1.13", (new
									// StringBuilder()).append("ERROR:").append("ERROR:").append("could not get uid ").append(s.getMessage()).toString());
									// goto _L18
									// s;
									// Log.i("AppsFlyer_1.13", (new
									// StringBuilder()).append("checking network error ").append(s.getMessage()).toString());
									// goto _L19

								}
							} else {

								obj = new StringBuilder();
								j1 = s.length;
								i1 = 0;

							}

						}

					}

				} else {

					hashmap.put("af_latestchannel", obj);

				}

			} else {

				if (!s5.equals(obj)) {

					hashmap.put("af_latestchannel", obj);

				} else {
					// if (s5 != null || obj == null) //goto _L24; else goto _L5
				}
			}

		} else {

			a("collect data for server", "", context);
			stringbuilder = (new StringBuilder())
					.append("******* sendTrackingWithEvent: ");
			if (flag) {
				obj = "Launch";
			} else {
				obj = s1;
			}
			Log.i(s4, stringbuilder.append(((String) (obj))).toString());
			if (flag) {
				obj = "Launch";
			} else {
				obj = s1;
			}
			a("********* sendTrackingWithEvent: ", ((String) (obj)), context);

		}

		// _L12:
		if (i1 >= j1) {
			// break; /* Loop/switch isn't completed */
		}
		s5 = s[i1];
		if (((StringBuilder) (obj)).length() > 1) {
			((StringBuilder) (obj)).append(',');
		}
		((StringBuilder) (obj)).append(fk.a(s5));
		i1++;
		// if (true) goto _L12; else goto _L11
		// _L11:
		hashmap.put("sha1_el_arr", ((StringBuilder) (obj)).toString());

		// _L18:
		try {
			hashmap.put("lang", Locale.getDefault().getDisplayLanguage());
		}
		// Misplaced declaration of an exception variable
		catch (Exception android) {
		}
		try {
			TelephonyManager sq = (TelephonyManager) context
					.getSystemService("phone");
			hashmap.put("operator", sq.getSimOperatorName());
			hashmap.put("carrier", sq.getNetworkOperatorName());
		}
		// Misplaced declaration of an exception variable
		catch (Exception saas) {
		}
		hashmap.put("network", n(context));

		b(context, hashmap);
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd_hhmmZ");
		i1 = android.os.Build.VERSION.SDK_INT;
		if (i1 < 9) {
			// break MISSING_BLOCK_LABEL_1107;
		}
		try {
			hashmap.put("installDate", date.format(new Date(context
					.getPackageManager().getPackageInfo(
							context.getPackageName(), 0).firstInstallTime)));
		}
		// Misplaced declaration of an exception variable
		catch (Exception x) {
		}
		try {
			PackageInfo info = context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0);
			hashmap.put("app_version_code",
					Integer.toString(((PackageInfo) (info)).versionCode));
			hashmap.put("app_version_name", ((PackageInfo) (info)).versionName);
			l1 = ((PackageInfo) (info)).firstInstallTime;
			l2 = ((PackageInfo) (info)).lastUpdateTime;
			hashmap.put("date1", date.format(new Date(l1)));
			hashmap.put("date2", date.format(new Date(l2)));
			hashmap.put("firstLaunchDate", a(context, true));
		}
		// Misplaced declaration of an exception variable

		// Misplaced declaration of an exception variable
		catch (Exception ex) {
		}
		if (s3.length() > 0) {
			hashmap.put("referrer", s3);
		}

		pre = context.getSharedPreferences("appsflyer-data", 0);
		s1 = pre.getString("attributionId", null);
		if (s1 == null) {
			// break MISSING_BLOCK_LABEL_1292;
		}
		if (s1.length() > 0) {
			hashmap.put("installAttribution", s1);
		}

		intent = ((Activity) context).getIntent();
		if (intent.getAction() == "android.intent.action.VIEW") {
			Uri uri = intent.getData();
			if (uri.getQueryParameter("af_deeplink") != null) {
				hashmap.put("af_deeplink_launch", "true");
				Map map = b(uri.getQuery().toString(), context);
				try {
					s2 = (new JSONObject(s1)).toString();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				hashmap.put("af_deeplink_attr", s2);
				Editor edit = pre.edit();
				((Editor) edit).putString("deeplinkAttribution", s2);
				edit.commit();
				if (c != null) {
					c.b(map);
				}
			}
			System.out.println("AppsFlyerLib.sendTrackingWithEvent");
		}

		(new fe(stringbuilder.toString(), hashmap,
				context.getApplicationContext(), flag)).run();
		return;

	}

	public static void c(String string) {
		fa.a("AppsFlyerKey", string);
	}

	static/* synthetic */boolean c() {
		return d;
	}

	public static boolean c(Context context) {
		int n;
		try {
			n = context.getPackageManager().getApplicationInfo(
					(String) context.getPackageName(), (int) 0).flags;
		} catch (PackageManager.NameNotFoundException var1_4) {
			Log.e((String) "AppsFlyer_1.13",
					(String) "Could not check if app is pre installed",
					(Throwable) var1_4);
			return false;
		}
		int n2 = n & 1;
		boolean bl = false;
		if (n2 != 0) {
			bl = true;
		}
		return bl;
	}

	public static String d(Context context) {
		return fl.a(context);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private static String d(Map map) {
		StringBuilder stringBuilder = new StringBuilder();
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			String string2 = (String) map.get((Object) string);
			String string3 = null;
			try {
				string3 = string2 == null ? "" : URLEncoder.encode(
						(String) string2, (String) "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (stringBuilder.length() > 0) {
				stringBuilder.append('&');
			}
			stringBuilder.append(string).append('=').append(string3);
		}
		return stringBuilder.toString();
	}

	static/* synthetic */Map d(String string) {
		return fa.f(string);
	}

	static/* synthetic */ScheduledExecutorService d() {
		return f;
	}

	static/* synthetic */String e(Context context) {
		return fa.m(context);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static String e(String string) {
		if (string.equals((Object) "c")) {
			return "campaign";
		}
		if (!string.equals((Object) "pid"))
			return string;
		return "media_source";
	}

	private static Map f(String string) {
		HashMap hashMap = new HashMap();
		try {
			JSONObject jSONObject = new JSONObject(string);
			Iterator iterator = jSONObject.keys();
			while (iterator.hasNext()) {
				String string2 = (String) iterator.next();
				if (b.contains((Object) string2))
					continue;
				hashMap.put((Object) string2,
						(Object) jSONObject.getString(string2));
			}
		} catch (JSONException var3_5) {
			Log.w((String) "AppsFlyer_1.13", (Throwable) var3_5);
			return null;
		}
		return hashMap;
	}

	static/* synthetic */boolean f(Context context) {
		return fa.g(context);
	}

	private static boolean g(Context context) {
		if (!ff.a().e()) {
			return true;
		}
		return false;
	}

	private static boolean h(Context context) {
		boolean bl = context.getSharedPreferences("appsflyer-data", 0)
				.contains("appsFlyerCount");
		boolean bl2 = false;
		if (!bl) {
			bl2 = true;
		}
		return bl2;
	}

	private static String i(Context context) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				"appsflyer-data", 0);
		if (sharedPreferences.contains("INSTALL_STORE")) {
			return sharedPreferences.getString("INSTALL_STORE", null);
		}
		boolean bl = fa.h(context);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		String string = null;
		if (bl) {
			string = fa.j(context);
		}
		editor.putString("INSTALL_STORE", string);
		editor.commit();
		return string;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static String j(Context context) {
		Bundle bundle = null;
		try {
			bundle = context.getPackageManager().getApplicationInfo(
					(String) context.getPackageName(), (int) 128).metaData;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (bundle == null)
			return null;
		Object object = bundle.get("AF_STORE");
		if (object == null)
			return null;
		try {
			if (!(object instanceof String))
				return object.toString();
			return (String) object;
		} catch (Exception var1_4) {
			if (!fa.g(context))
				return null;
			Log.i((String) "AppsFlyer_1.13",
					(String) "Could not find AF_STORE value in the manifest",
					(Throwable) var1_4);
		}
		return null;
	}

	/*
	 * Exception decompiling
	 */
	private static String k(Context context) {
		Object obj;
		Object obj1;
		android.content.SharedPreferences.Editor editor;
		boolean flag;
		obj1 = null;
		obj = context.getSharedPreferences("appsflyer-data", 0);
		if (((SharedPreferences) (obj)).contains("preInstallName")) {
			return ((SharedPreferences) (obj))
					.getString("preInstallName", null);
		}
		flag = h(context);
		editor = ((SharedPreferences) (obj)).edit();
		obj = obj1;
		if (!flag) {

			editor.putString("preInstallName", ((String) (obj)));
			editor.commit();
			return ((String) (obj));

		} else {

			try {
				obj = context.getPackageManager().getApplicationInfo(
						context.getPackageName(), 128).metaData;
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (obj == null) {
				obj = context;
				context = null;

			} else {
				obj = ((Bundle) (obj)).get("AF_PRE_INSTALL_NAME");
				if (obj == null) {
					obj = context;
					context = null;

				} else {

					if (!(obj instanceof String)) {
						obj = obj.toString();
						context = ((Context) (obj));
						// continue; /* Loop/switch isn't completed */
						// Exception exception;
						// exception;
						obj = obj1;
						if (g(context)) {
							Log.i("AppsFlyer_1.13",
									"Could not find AF_PRE_INSTALL_NAME value in the manifest");
							obj = obj1;
						}
						editor.putString("preInstallName", ((String) (obj)));
						editor.commit();
						return ((String) (obj));

					} else {

						obj = (String) obj;
						context = ((Context) (obj));
					}
				}

			}
		}
		return (String) obj;

	}

	/*
	 * Enabled aggressive block sorting
	 */
	private static void l(Context context) {
		if (d || System.currentTimeMillis() - e < 15000 || f != null) {
			return;
		}
		f = Executors.newSingleThreadScheduledExecutor();
		f.schedule((Runnable) new fc(context), 1, TimeUnit.SECONDS);
	}

	/*
	 * Exception decompiling
	 */
	private static String m(Context context) {
		String s;
		Object obj;
		s = ff.a().b("channel");
		obj = s;
		Bundle bundle = null;
		if (s != null) {

		}
		try {
			bundle = context.getPackageManager().getApplicationInfo(
					context.getPackageName(), 128).metaData;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e("AppsFlyer_1.13", "Could not load CHANNEL value");
			return s;
		}
		if (context == null) {

		}
		context = ((Context) (bundle.get("CHANNEL")));
		if (context == null) {

		}

		obj = context;
		return ((String) (obj));
	}

	private static String n(Context context) {
		ConnectivityManager connectivityManager = (ConnectivityManager) context
				.getSystemService("connectivity");
		if (connectivityManager.getNetworkInfo(1).isConnectedOrConnecting()) {
			return "WIFI";
		}
		if (connectivityManager.getNetworkInfo(0).isConnectedOrConnecting()) {
			return "MOBILE";
		}
		return "unkown";
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void onReceive(Context context, Intent intent) {
		if ("android.intent.action.PACKAGE_REMOVED".equals((Object) intent
				.getAction())) {
			this.a(intent.getDataString(), context);
			return;
		} else {
			String string = intent.getStringExtra("shouldMonitor");
			if (string != null) {
				Log.i((String) "AppsFlyer_1.13",
						(String) "Turning on monitoring.");
				ff.a().a("shouldMonitor", string.equals((Object) "true"));
				fa.b(context, null, "START_TRACKING", context.getPackageName());
				return;
			}
			Log.i((String) "AppsFlyer_1.13",
					(String) "****** onReceive called *******");
			fa.a("******* onReceive: ", "", context);
			ff.a().b();
			String string2 = intent.getStringExtra("referrer");
			if (fa.g(context)) {
				Log.i((String) "AppsFlyer_1.13",
						(String) ("Play store referrer: " + string2));
			}
			if (string2 == null)
				return;
			{
				fa.a("BroadcastReceiver got referrer: ", string2, context);
				fa.a("onRecieve called. refferer=", string2, context);
				SharedPreferences.Editor editor = context.getSharedPreferences(
						"appsflyer-data", 0).edit();
				editor.putString("referrer", string2);
				editor.commit();
				ff.a().c(string2);
				if (!ff.a().c())
					return;
				{
					Log.i((String) "AppsFlyer_1.13",
							(String) "onReceive: isLaunchCalled");
					fa.b(context, null, null, null, string2);
					return;
				}
			}
		}
	}

}
