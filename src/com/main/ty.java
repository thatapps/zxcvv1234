package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.security.KeyStore.Entry;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.http.AndroidHttpClient;
import android.util.Log;

public class ty {
	private static final Header a = new BasicHeader("Accept-Encoding", "gzip");
	private final Context b;

	public ty(Context paramContext) {
		this.b = paramContext;
	}

	private static String a(InputStream inputstream) {
		BufferedReader bufferedreader = new BufferedReader(
				new InputStreamReader(inputstream));
		StringBuilder builder = new StringBuilder();

		String s = null;
		try {
			s = bufferedreader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (s == null) {
			// builder = inputstream;
			if (bufferedreader != null) {
				try {
					bufferedreader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return inputstream.toString();

		} else {
			if (builder.length() != 0) {
				builder.append('\r');
			}
			builder.append(s);

		}

		if (bufferedreader != null) {
			try {
				bufferedreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// inputstream = inputstream.toString();
		if (bufferedreader != null) {
			try {
				bufferedreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return inputstream.toString();

	}

	public static String a(Map<Entry, Entry> map) {
		StringBuilder stringBuilder = new StringBuilder();
		if (map == null)
			return stringBuilder.toString();
		{
			try {
				for (Map.Entry entry : map.entrySet()) {
					String string = (String) entry.getKey();
					if (string == null || string.equals((Object) ""))
						continue;
					if (string.toLowerCase().equals((Object) "q")
							|| string.toLowerCase().equals((Object) "t")) {
						stringBuilder.append(";").append(string).append("=")
								.append((String) entry.getValue());
						continue;
					}
					stringBuilder
							.append(";")
							.append((String) entry.getKey())
							.append("=")
							.append(URLEncoder.encode(
									(String) ((String) entry.getValue()),
									(String) "UTF-8"));
				}
				return stringBuilder.toString();
			} catch (Exception var2_5) {
				Log.e((String) "Swipe.Global", (String) var2_5.getMessage(),
						(Throwable) var2_5);
			}
		}
		return stringBuilder.toString();
	}

	public static String a(HttpResponse paramHttpResponse) {
		return a(b(paramHttpResponse));
	}

	private static void a(HttpResponse httpResponse, File file) {
		InputStream inputStream = null;
		try {
			inputStream = ty.b(httpResponse);
			File file2 = file.getParentFile();
			if (!(file2 == null || file2.exists())) {
				file2.mkdirs();
			}
			if (!tq.a(inputStream, file) && file != null && file.exists()) {
				file.delete();
			}
			return;
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void a(HttpUriRequest httpUriRequest) {
		int n;
		String string;
		ConnectivityManager connectivityManager = (ConnectivityManager) this.b
				.getSystemService("connectivity");
		if (connectivityManager == null) {
			return;
		}
		NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
		if (networkInfo == null || networkInfo.getType() == 1
				|| (string = Proxy.getHost((Context) this.b)) == null
				|| (n = Proxy.getPort((Context) this.b)) < 0) {
			return;
		}
		HttpHost httpHost = new HttpHost(string, n);
		ConnRouteParams.setDefaultProxy(
				(HttpParams) httpUriRequest.getParams(), httpHost);
	}

	private static boolean a(Header header, String string) {
		if (header == null || string == null) {
			return false;
		}
		HeaderElement[] arrheaderElement = header.getElements();
		int n = arrheaderElement.length;
		for (int i = 0; i < n; ++i) {
			if (!string.equals((Object) arrheaderElement[i].getName()))
				continue;
			return true;
		}
		return false;
	}

	private static InputStream b(HttpResponse httpResponse) {
		HttpEntity httpEntity = httpResponse.getEntity();
		if (ty.a(httpEntity.getContentEncoding(), "gzip")) {
			try {
				return AndroidHttpClient
						.getUngzippedContent((HttpEntity) httpEntity);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			return httpEntity.getContent();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Bitmap a(String s, Map map, boolean flag) {
		Object obj;
		Object obj1;
		obj1 = null;
		obj = null;
		Bitmap bitmap = null;
		HttpResponse response = null;
		AndroidHttpClient androidhttpclient = AndroidHttpClient
				.newInstance("lazy");
		AndroidHttpClient androidhttpclient1 = androidhttpclient;
		HttpClientParams.setRedirecting(androidhttpclient.getParams(), true);
		androidhttpclient1 = androidhttpclient;
		HttpGet get /* s */= new HttpGet(s);
		androidhttpclient1 = androidhttpclient;
		a(((HttpUriRequest) (get)));
		androidhttpclient1 = androidhttpclient;
		get.addHeader(a);
		if (map == null) {

		}
		androidhttpclient1 = androidhttpclient;
		get.addHeader("Cookie", a(map));
		androidhttpclient1 = androidhttpclient;
		try {
			response = androidhttpclient.execute(get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		androidhttpclient1 = androidhttpclient;
		StatusLine sf = response.getStatusLine();
		// label0:
		{
			{
				if (map != null) {
					// break label0;
				}
				map = (Map) obj;
				if (androidhttpclient != null) {
					int i;
					try {
						androidhttpclient.close();
					}
					// Misplaced declaration of an exception variable
					catch (Exception exception) {
						return null;
					}
					// map = obj;
				}
			}
			// return map;
		}
		androidhttpclient1 = androidhttpclient;
		int i = sf.getStatusCode();
		if (i == 200) {
			// break; /* Loop/switch isn't completed */
		}
		// map = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		}
		// if (true) goto _L2; else goto _L1
		// _L2:
		// break MISSING_BLOCK_LABEL_125;
		// _L1:
		androidhttpclient1 = androidhttpclient;
		InputStream stream = b(response);
		if (!flag) {
			// break MISSING_BLOCK_LABEL_426;
		}
		androidhttpclient1 = androidhttpclient;
		Options options = new android.graphics.BitmapFactory.Options();
		androidhttpclient1 = androidhttpclient;
		options.inPurgeable = true;
		androidhttpclient1 = androidhttpclient;
		options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
		androidhttpclient1 = androidhttpclient;
		options.inDither = false;
		androidhttpclient1 = androidhttpclient;
		options.inInputShareable = true;
		// _L16:
		if (s != null) {
			androidhttpclient = null;
			androidhttpclient1 = androidhttpclient;
			bitmap = BitmapFactory.decodeStream(stream, null, options);
			// continue; /* Loop/switch isn't completed */
			// s;

		} else {

			androidhttpclient1 = androidhttpclient;
			bitmap = BitmapFactory.decodeStream(stream);

		}

		// _L14:
		// map = s;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return bitmap;
			}
			return bitmap;
		}
		// break MISSING_BLOCK_LABEL_125;

		// _L12:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "HTTP protocol error.");
		// map = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {
			// break MISSING_BLOCK_LABEL_125;
		}

		androidhttpclient = null;
		// _L10:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "Perform GET request failed.");
		// map = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {
			// break MISSING_BLOCK_LABEL_125;
		}

		androidhttpclient = null;
		// _L8:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "Unexpected exception has thrown.");
		// map = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {
			// break MISSING_BLOCK_LABEL_125;
		}

		androidhttpclient1 = null;
		// _L6:
		if (androidhttpclient1 != null) {
			try {
				androidhttpclient1.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}
		return bitmap;

	}

	public String a(String s, Map map) {
		Object obj = null;
		AndroidHttpClient androidhttpclient = AndroidHttpClient
				.newInstance("lazy");
		AndroidHttpClient androidhttpclient1 = androidhttpclient;
		HttpClientParams.setRedirecting(androidhttpclient.getParams(), true);
		androidhttpclient1 = androidhttpclient;
		HttpGet get/* s */= new HttpGet(s);
		androidhttpclient1 = androidhttpclient;
		a(((HttpUriRequest) (get)));
		androidhttpclient1 = androidhttpclient;
		get.addHeader(a);
		if (map == null) {
			// break MISSING_BLOCK_LABEL_73;
		}
		androidhttpclient1 = androidhttpclient;
		get.addHeader("Cookie", a(map));
		androidhttpclient1 = androidhttpclient;
		HttpResponse response = null;
		try {
			response = androidhttpclient.execute(get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		androidhttpclient1 = androidhttpclient;
		StatusLine line = response.getStatusLine();
		if (map != null) {
			// break MISSING_BLOCK_LABEL_124;
		}
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "No status from response");
		// s = obj;
		if (androidhttpclient != null) {
			int i;
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			// s = obj;
		}

		androidhttpclient1 = androidhttpclient;
		int i = line.getStatusCode();
		if (i == 200) {
			// /* Loop/switch isn't completed */
		}
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global",
				(new StringBuilder()).append("Status Code is invalid: ")
						.append(i).toString());

		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		}

		// _L1:
		androidhttpclient1 = androidhttpclient;
		String str = a((response));
		s = str;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return str;
			}
			return str;
		} else {
			//
		}
		// s;
		androidhttpclient = null;
		// _L10:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "HTTP protocol error.");
		// s = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {

		}

		androidhttpclient = null;
		// _L8:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "Perform GET request failed.");
		// s = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {

		}

		androidhttpclient = null;
		// _L6:
		androidhttpclient1 = androidhttpclient;
		Log.e("Swipe.Global", "Unexpected exception has thrown.");
		// s = obj;
		if (androidhttpclient != null) {
			try {
				androidhttpclient.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
			return null;
		} else {
			// reak MISSING_BLOCK_LABEL_122;
		}

		androidhttpclient1 = null;
		// _L4:
		if (androidhttpclient1 != null) {
			try {
				androidhttpclient1.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}

		return s;

	}

	public boolean a(String s, Map map, File file) {
		AndroidHttpClient androidhttpclient;
		AndroidHttpClient androidhttpclient2;
		AndroidHttpClient androidhttpclient3;
		AndroidHttpClient androidhttpclient4;
		androidhttpclient3 = null;
		androidhttpclient4 = null;
		androidhttpclient = null;
		androidhttpclient2 = null;
		AndroidHttpClient androidhttpclient1 = AndroidHttpClient
				.newInstance("lazy");
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		HttpClientParams.setRedirecting(androidhttpclient1.getParams(), true);
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		HttpGet get = new HttpGet(s);
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		a(get);
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		get.addHeader(a);
		if (map == null) {
			// break MISSING_BLOCK_LABEL_149;
		}
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		get.addHeader("Cookie", a(map));
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		HttpResponse response = null;
		try {
			response = androidhttpclient1.execute(get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		StatusLine line = response.getStatusLine();

		{
			if (map != null) {
				// break label0;
			}
			int i;
			if (androidhttpclient1 != null) {
				try {
					androidhttpclient1.close();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return false;
				}
			}
		}

		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		int i = line.getStatusCode();
		if (i == 200) {
			// break; /* Loop/switch isn't completed */
		}
		if (androidhttpclient1 != null) {
			try {
				androidhttpclient1.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return false;
			}
			return false;
		}

		androidhttpclient2 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		a(get);
		if (androidhttpclient1 != null) {
			try {
				androidhttpclient1.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}

		if (file == null) {
			// continue; /* Loop/switch isn't completed */
		}
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		if (!file.exists()) {
			// continue; /* Loop/switch isn't completed */
		}
		androidhttpclient2 = androidhttpclient1;
		androidhttpclient3 = androidhttpclient1;
		androidhttpclient4 = androidhttpclient1;
		androidhttpclient = androidhttpclient1;
		file.delete();
		if (androidhttpclient1 == null) {

			// break MISSING_BLOCK_LABEL_209;
			try {
				androidhttpclient1.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return false;
			}

			androidhttpclient = androidhttpclient2;
			Log.e("Swipe.Global", "HTTP protocol error.");
			if (androidhttpclient2 != null) {
				try {
					androidhttpclient2.close();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return false;
				}
				return false;
			}

			androidhttpclient = androidhttpclient3;
			Log.e("Swipe.Global", "Perform GET request failed.");
			if (androidhttpclient3 != null) {
				try {
					androidhttpclient3.close();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return false;
				}
				return false;
			}

			androidhttpclient = androidhttpclient4;
			Log.e("Swipe.Global", "Unexpected exception has thrown.");
			if (androidhttpclient4 != null) {
				try {
					androidhttpclient4.close();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return false;
				}
				return false;
			} else {
				// break MISSING_BLOCK_LABEL_209;
			}

			if (androidhttpclient != null) {
				try {
					androidhttpclient.close();
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
				}
			}
		}
		return true;
	}
}
