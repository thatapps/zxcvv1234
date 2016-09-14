package com.main;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

public class hz {
	private static final Uri a = Uri
			.parse("content://com.facebook.katana.provider.AttributionIdProvider");

	/* Error */
	public static ia a(ContentResolver contentresolver) {
		Cursor cursor = contentresolver.query(a, new String[] { "aid",
				"androidid", "limit_tracking" }, null, null, null);
		ia ia1 = new ia(null, null, false);
		if (cursor == null) {
			contentresolver = (ContentResolver) cursor;
		
			//contentresolver = ia1;
			if (cursor != null) {
				cursor.close();
				//contentresolver = ia1;
			}

		} else {
			//contentresolver = (ContentResolver) cursor;
			if (cursor.moveToFirst()) {
				//contentresolver = cursor;
				ia1 = new ia(cursor.getString(cursor.getColumnIndex("aid")),
						cursor.getString(cursor.getColumnIndex("androidid")),
						Boolean.valueOf(
								cursor.getString(cursor
										.getColumnIndex("limit_tracking")))
								.booleanValue());
			//	contentresolver = ia1;
				if (cursor == null) {
					return ia1;
				} else {
					cursor.close();
					return ia1;
				}
			} else {
				//contentresolver = cursor;
				//contentresolver = ia1;
				if (cursor != null) {
					cursor.close();
					//contentresolver = ia1;
				}
			}
		}

		if (cursor == null) {

			contentresolver = (ContentResolver) cursor;
			
			//contentresolver = ia1;
			if (cursor != null) {
				cursor.close();
				//contentresolver = ia1;
			}
		} else {
			cursor.close();
			return ia1;
		}

		if (contentresolver != null) {
			//contentresolver.close();
		}
		return ia1;

	}

	public static Object a(Object paramObject, Method paramMethod,
			Object... paramVarArgs) {
		Object localObject1 = null;
		try {
			Object localObject2 = paramMethod.invoke(paramObject, paramVarArgs);
			localObject1 = localObject2;
		} catch (Exception localException) {

		}
		return localObject1;
	}

	public static Object a(JSONObject jSONObject, String string) {
		Object object = jSONObject.opt(string);
		if (object != null && object instanceof String) {
			try {
				object = new JSONTokener((String) object).nextValue();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!(object == null || object instanceof JSONObject || object instanceof JSONArray)) {
			throw new IllegalArgumentException(string);
		}
		return object;
	}

	public static String a(InputStream inputstream) {
		Object obj = null;
		inputstream = new BufferedInputStream(inputstream);
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		char ac[];
		obj = new StringBuilder();
		ac = new char[2048];
		// _L3:
		int i = -1;
		try {
			i = inputstreamreader.read(ac);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (i == -1) {
			obj = ((StringBuilder) (obj)).toString();
			a(((Closeable) (inputstream)));
			a(((Closeable) (inputstreamreader)));
			return ((String) (obj));
			// inputstream;
			// inputstreamreader = null;
			// continue; /* Loop/switch isn't completed */
			// exception;
			// inputstreamreader = null;
			// obj = inputstream;
			// inputstream = exception;

		} else {
			((StringBuilder) (obj)).append(ac, 0, i);
			try {
				i = inputstreamreader.read(ac);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (String) obj;

	}

	public static String a(Map paramMap) {
		JSONObject localJSONObject = new JSONObject();
		Iterator localIterator = paramMap.entrySet().iterator();
		while (localIterator.hasNext()) {
			Map.Entry localEntry = (Map.Entry) localIterator.next();
			try {
				localJSONObject.put((String) localEntry.getKey(),
						localEntry.getValue());
			} catch (JSONException localJSONException) {
				localJSONException.printStackTrace();
			}
		}
		return localJSONObject.toString();
	}

	public static Method a(Class paramClass, String paramString,
			Class... paramVarArgs) {
		Method localMethod1 = null;
		try {
			Method localMethod2 = paramClass.getMethod(paramString,
					paramVarArgs);
			localMethod1 = localMethod2;
		} catch (NoSuchMethodException localNoSuchMethodException) {

		}
		return localMethod1;
	}

	public static Method a(String paramString1, String paramString2,
			Class... paramVarArgs) {
		Method localMethod1 = null;
		try {
			Method localMethod2 = a(Class.forName(paramString1), paramString2,
					paramVarArgs);
			localMethod1 = localMethod2;
		} catch (ClassNotFoundException localClassNotFoundException) {
		}
		return localMethod1;
	}

	public static void a(Context paramContext, String paramString) {
		if (gm.a(paramContext)) {
			Log.d("FBAudienceNetworkLog", paramString
					+ " (displayed for test ads only)");
		}
	}

	public static void a(Closeable paramCloseable) {
		if (paramCloseable == null) {
		}

		try {
			paramCloseable.close();
		} catch (IOException localIOException) {

		}
	}

	public static boolean a() {
		String str = gm.a();
		if ((!hh.a(str)) && (str.endsWith(".sb"))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean a(Context paramContext, View paramView,
			int paramInt1, int paramInt2, int paramInt3) {
		boolean bool;
		if (!((PowerManager) paramContext.getSystemService("power"))
				.isScreenOn()) {
			bool = false;
		}

		if ((paramView == null) || (paramView.getParent() == null)
				|| (paramView.getVisibility() != 0)) {
			bool = false;
		} else if ((Build.VERSION.SDK_INT >= 11)
				&& (paramView.getAlpha() < 0.9F)) {
			bool = false;
		} else {
			int[] arrayOfInt = new int[2];
			paramView.getLocationOnScreen(arrayOfInt);
			DisplayMetrics localDisplayMetrics = paramContext.getResources()
					.getDisplayMetrics();
			if ((arrayOfInt[0] < 0)
					|| (localDisplayMetrics.widthPixels - arrayOfInt[0] < paramInt1)) {
				bool = false;
			} else {
				int i = (int) (paramInt2 * (100.0D - paramInt3) / 100.0D);
				if ((arrayOfInt[1] < 0) && (Math.abs(arrayOfInt[1]) > i)) {
					bool = false;
				} else if (paramInt2 + arrayOfInt[1]
						- localDisplayMetrics.heightPixels > i) {
					bool = false;
				} else {
					bool = true;
				}
			}

		}
		return bool;
	}

	public static HttpClient b() {
		if (a()) {
		}
		DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
		try {
			KeyStore localKeyStore = KeyStore.getInstance(KeyStore
					.getDefaultType());
			localKeyStore.load(null, null);
			hg localhg = new hg(localKeyStore);
			localhg.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			BasicHttpParams localBasicHttpParams = new BasicHttpParams();
			HttpProtocolParams.setVersion(localBasicHttpParams,
					HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
			SchemeRegistry localSchemeRegistry = new SchemeRegistry();
			localSchemeRegistry.register(new Scheme("http", PlainSocketFactory
					.getSocketFactory(), 80));
			localSchemeRegistry.register(new Scheme("https", localhg, 443));
			localDefaultHttpClient = new DefaultHttpClient(
					new ThreadSafeClientConnManager(localBasicHttpParams,
							localSchemeRegistry), localBasicHttpParams);

		} catch (Exception localException) {
		}
		return localDefaultHttpClient;
	}

}
