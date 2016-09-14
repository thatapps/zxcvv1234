package com.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;

public final class tz {
	private static String a = "UA-QiiGame";

	public static String a(String paramString) {
		return a(paramString, a);
	}

	public static String a(String s, String s1) {
		Object obj1;
		Object obj2;
		obj2 = null;
		obj1 = null;
		Object obj = null;
		try {
			obj = (HttpURLConnection) (new URL(s)).openConnection();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
		}
		int i = 0;
		if (!TextUtils.isEmpty(s1)) {
			((HttpURLConnection) (obj)).setRequestProperty("User-Agent", s1);
		}
		((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
		((HttpURLConnection) (obj)).setUseCaches(false);
		((HttpURLConnection) (obj)).setConnectTimeout(5000);
		((HttpURLConnection) (obj)).setReadTimeout(5000);
		try {
			((HttpURLConnection) (obj)).connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			i = ((HttpURLConnection) (obj)).getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i / 100 != 3) {

			if (i == 200) {
				if (obj != null) {
					((HttpURLConnection) (obj)).disconnect();
					return s;
				}
			} else if (i >= 400) {
				if (obj != null) {
					((HttpURLConnection) (obj)).disconnect();
					return s;
				}
			} else if (obj != null) {
				((HttpURLConnection) (obj)).disconnect();
				return s;
			}

		} else {
			String s2 = ((HttpURLConnection) (obj)).getHeaderField("Location");
			if (TextUtils.isEmpty(s2)) {

				if (obj == null) {
					// break MISSING_BLOCK_LABEL_269;
				}
				((HttpURLConnection) (obj)).disconnect();
				obj = s;

			} else {

				boolean flag = s.equals(s2);
				if (!flag) {

					((HttpURLConnection) (obj)).disconnect();
					if (false) {
						throw new NullPointerException();
					}
					s = s2;

					s1 = (String) obj1;

				} else {
					if (obj == null) {
						((HttpURLConnection) (obj)).disconnect();
						obj = s;

					}

				}

			}

		}

		// _L12:if (s != null)
		{
			((HttpURLConnection) obj).disconnect();
		}

		if (s1 != null) {
			((HttpURLConnection) obj).disconnect();
		}
		obj = s;
		if (s1 == null) {

			return ((String) (obj));
		} else {
			((HttpURLConnection) obj).disconnect();
			return s;

		}

	}

	private static String a(String paramString, Map paramMap) {
		if (TextUtils.isEmpty(paramString)) {
			paramString = "";
		}
		StringBuilder localStringBuilder = new StringBuilder(paramString);
		String str = a(paramMap);
		if (!TextUtils.isEmpty(str)) {
			localStringBuilder.append("?").append(str);
		}
		return localStringBuilder.toString();
	}

	private static String a(Map map) {
		if (map == null || map.size() == 0) {
			return null;
		}
		StringBuilder stringBuilder = new StringBuilder();
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			stringBuilder
					.append(URLEncoder.encode((String) ((String) entry.getKey())))
					.append("=")
					.append(URLEncoder.encode((String) ((String) entry
							.getValue())));
			if (!iterator.hasNext())
				continue;
			stringBuilder.append("&");
		}
		return stringBuilder.toString();
	}

	public static URLConnection a(Context context, URL uRL, int n, int n2,
			Map map) {
		boolean bl = uj.a(uj.b(context));
		URLConnection uRLConnection = null;
		if (bl) {
			String string = Proxy.getDefaultHost();
			int n3 = Proxy.getDefaultPort();
			uRLConnection = null;
			if (-1 != n3) {
				boolean bl2 = TextUtils.isEmpty((CharSequence) string);
				uRLConnection = null;
				if (!bl2) {
					try {
						uRLConnection = uRL.openConnection(new java.net.Proxy(
								java.net.Proxy.Type.valueOf((String) uRL
										.getProtocol().toUpperCase()),
								(SocketAddress) new InetSocketAddress(string,
										n3)));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		if (uRLConnection == null) {
			try {
				uRLConnection = uRL.openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tz.a(uRLConnection, n, n2, map);
		return uRLConnection;
	}

	public static up a(Context paramContext, String paramString) {
		return a(paramContext, paramString, 0, 0, Collections.EMPTY_MAP);
	}

	public static up a(Context paramContext, String paramString, int paramInt1,
			int paramInt2) {
		return a(paramContext, paramString, paramInt1, paramInt2,
				Collections.EMPTY_MAP);
	}

	public static up a(Context context, String s, int i, int j, Map map) {
		Object obj;
		Object obj1;
		Object obj2;
		boolean flag;
		boolean flag1;
		boolean flag2;
		obj = null;
		obj1 = null;
		obj2 = null;
		flag1 = false;
		flag2 = false;
		flag = false;
		HttpURLConnection urlConnection = (HttpURLConnection) b(context, s, i,
				j, map);
		j = ((flag2) ? 1 : 0);
		try {
			i = urlConnection.getResponseCode();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		//map = (Map) obj2;
		if (i < 400) {

		}
		j = i;
		obj = urlConnection.getErrorStream();
		//s = ((String) (obj));
		//map = ((Map) (obj));
		Log.w("Swipe.HttpUtils", (new StringBuilder()).append("Error stream: ")
				.append(tq.b(((java.io.InputStream) (obj)))).toString());
		s = ((String) (obj));
		///map = ((Map) (obj));
		tq.a(((java.io.Closeable) (obj)));
		//map = ((Map) (obj));

		try {
			obj = urlConnection.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//s = ((String) (obj));
		//map = ((Map) (obj));
		obj1 = tq.a(((java.io.InputStream) (obj)));
		//s = ((String) (obj));
		//map = ((Map) (obj));
		obj1 = new up(uq.a, ((String) (obj1)), i);
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
		}
		if (context != null) {
			urlConnection.disconnect();
		}
		//s = ((String) (obj1));

		try {
			obj = new up(uq.b, (new StringBuilder())
					.append(/*((Throwable) map).getMessage()*/"")
					.append("; message: ")
					.append(urlConnection.getResponseMessage()).toString(), i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		if (s != null) {
			tq.a((InputStream) obj);
		}
		//s = ((String) (obj));
		if (context != null) {
			urlConnection.disconnect();
			return ((up) (obj));
		}

		map = (Map) new up(uq.b, ((Throwable) map).getMessage());
		if (s != null) {
			tq.a((InputStream) obj);
		}
		// s = map;
		if (urlConnection == null) {

		} else {

			context = ((Context) (obj1));
			urlConnection.disconnect();
			return (up) map;

		}
		return ((up) (obj));

	}

	public static up a(Context paramContext, String paramString, Map paramMap,
			int paramInt1, int paramInt2) {
		return b(paramContext, paramString, paramMap, paramInt1, paramInt2,
				Collections.EMPTY_MAP);
	}

	public static up a(Context paramContext, String paramString, Map paramMap1,
			int paramInt1, int paramInt2, Map paramMap2) {
		return a(paramContext, a(paramString, paramMap1), paramInt1, paramInt2,
				paramMap2);
	}

	/* Error */
	// public static void a(Context context) {
	// if (android.os.Build.VERSION.SDK_INT < 17) {
	// // break MISSING_BLOCK_LABEL_72;
	// }
	// a = WebSettings.getDefaultUserAgent(context);
	// boolean flag = true;
	//
	// if (!flag) {
	// try {
	// a = System.getProperty("http.agent", a);
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// Log.w("Swipe.HttpUtils",
	// "Failed to get the default user agent from system properties");
	// }
	// }
	// vj.a("Swipe.HttpUtils",
	// (new StringBuilder()).append("Default user agent: ").append(a)
	// .toString());
	//
	// Log.w("Swipe.HttpUtils",
	// "Failed to get the default user agent from WebSettings");
	//
	// }
	@SuppressLint("NewApi")
	public static void a(Context var0) {
		boolean var1;

		if (VERSION.SDK_INT >= 17) {

			try {
				a = WebSettings.getDefaultUserAgent(var0);
			} catch (Throwable var3) {
				Log.w("Swipe.HttpUtils",
						"Failed to get the default user agent from WebSettings",
						var3);

			}

			var1 = true;

		}

		var1 = false;

		if (!var1) {
			try {
				a = System.getProperty("http.agent", a);
			} catch (Throwable var2) {
				Log.w("Swipe.HttpUtils",
						"Failed to get the default user agent from system properties",
						var2);
			}
		}

		vk.a("Swipe.HttpUtils", "Default user agent: " + a);
	}

	public static void a(URLConnection uRLConnection, int n, int n2, Map map) {
		if (n > 0) {
			uRLConnection.setConnectTimeout(n);
		}
		if (n2 > 0) {
			uRLConnection.setReadTimeout(n2);
		}
		if (!map.containsKey((Object) "User-Agent")) {
			uRLConnection.setRequestProperty("User-Agent", a);
		}
		if (!map.isEmpty()) {
			String string;
			String string2;
			String string3 = (String) map
					.remove((Object) "ChunkedStreamingMode");
			if (string3 != null) {
				((HttpURLConnection) uRLConnection)
						.setChunkedStreamingMode(Integer
								.parseInt((String) string3));
			}
			if ((string = (String) map.remove((Object) "UseCaches")) != null) {
				uRLConnection.setUseCaches(Boolean
						.parseBoolean((String) string));
			}
			if ((string2 = (String) map
					.remove((Object) "InstanceFollowRedirects")) != null) {
				((HttpURLConnection) uRLConnection)
						.setInstanceFollowRedirects(Boolean
								.parseBoolean((String) string2));
			}
			if (!map.isEmpty()) {
				Iterator iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					java.util.Map.Entry entry = (java.util.Map.Entry) iterator
							.next();
					uRLConnection.setRequestProperty((String) entry.getKey(),
							(String) entry.getValue());
				}
			}
		}
	}

	public static boolean a(Context paramContext, String paramString1,
			String paramString2) {
		return a(paramContext, paramString1, paramString2, 0, 0);
	}

	public static boolean a(Context paramContext, String paramString1,
			String paramString2, int paramInt1, int paramInt2) {
		return a(paramContext, paramString1, paramString2, paramInt1,
				paramInt2, null);
	}

	public static boolean a(Context context, String s, String s1, int i, int j,
			ua ua1) {
		Object obj2 = null;
		Object obj1 = null;
		Object obj;
		File file;
		HttpURLConnection urlConnection = null;
		String s2;
		boolean flag = false;
		try {
			(new File(s1.substring(0, s1.lastIndexOf('/')))).mkdirs();
		} catch (Exception exception) {
		}
		try {
			urlConnection = (HttpURLConnection) b(context, s, i, j);
		}
		// Misplaced declaration of an exception variable
		catch (Exception _L2) {
			context = null;
			s1 = null;
			obj = obj1;
			/* Loop/switch isn't completed */
		} finally {
			s1 = null;
			s = null;
			obj = obj2;
		}
		try {
			// _L5:
			obj = new BufferedInputStream(urlConnection.getInputStream(), 8192);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			// s1 = context;
			context = null;
			obj = obj1;
			// continue; /* Loop/switch isn't completed */
		} finally {

			/* Loop/switch isn't completed */
		}
		file = new File(s1);
		s2 = (new StringBuilder()).append(s1).append(".te").toString();
		BufferedOutputStream outputStream = null;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream(s2),
					8192);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1 = new byte[8192];
		// _L4:
		try {
			i = ((BufferedInputStream) (obj)).read(((byte[]) (obj1)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i <= 0) {

			flag = (new File(s2)).renameTo(file);
			if (context != null) {
				urlConnection.disconnect();
			}
			if (s1 != null) {
				tq.a(outputStream);
			}
			if (obj != null) {
				tq.a(((java.io.Closeable) (obj)));
			}
			return flag;

		} else {

			try {
				outputStream.write(((byte[]) (obj1)), 0, i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (ua1 == null) {

			} else {

				if (!ua1.a()) {
					// break MISSING_BLOCK_LABEL_210;
				}
				Log.i("Swipe.HttpUtils",
						(new StringBuilder()).append("Downloading of [")
								.append(s).append("] cancelled").toString());
				if (context != null) {
					urlConnection.disconnect();
				}
				if (s1 != null) {
					tq.a(outputStream);
				}
				if (obj != null) {
					tq.a(((java.io.Closeable) (obj)));
				}
				return false;

			}
		}

		Log.e("Swipe.HttpUtils",
				(new StringBuilder()).append("Error in downloadFile [")
						.append(s).append("]").toString());
		if (outputStream != null) {
			urlConnection.disconnect();
		}
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
		}
		if (context != null) {
			tq.a(outputStream);
		}

		if (s != null) {
			urlConnection.disconnect();
		}
		if (obj != null) {
			tq.a(((java.io.Closeable) (obj)));
		}
		if (s1 != null) {
			tq.a(outputStream);
		}
		return flag;

	}

	public static URLConnection b(Context paramContext, String paramString,
			int paramInt1, int paramInt2) {
		return b(paramContext, paramString, paramInt1, paramInt2,
				Collections.EMPTY_MAP);
	}

	public static URLConnection b(Context paramContext, String paramString,
			int paramInt1, int paramInt2, Map paramMap) {
		try {
			return a(paramContext, new URL(paramString), paramInt1, paramInt2,
					paramMap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static up b(Context context, String s, Map map, int i, int j,
			Map map1) {
		Object obj;
		Object obj1;
		Object obj2;
		obj = null;
		obj1 = null;
		obj2 = null;
		up up;
		InputStream stream = null;
		HttpURLConnection urlConnection = null;
		if (!TextUtils.isEmpty(s) && map != null && map.size() >= 1) {
			urlConnection = (HttpURLConnection) b(context, s, i, j, map1);
			try {
				((HttpURLConnection) urlConnection).setRequestMethod("POST");
			} catch (ProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			urlConnection.setDoOutput(true);
			try {
				urlConnection.getOutputStream().write(a(map).getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				i = urlConnection.getResponseCode();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				i = 0;
			}

			if (i < 400) {
				// break MISSING_BLOCK_LABEL_156;
			}
			stream = urlConnection.getErrorStream();

			Log.w("Swipe.HttpUtils",
					(new StringBuilder()).append("Error stream: ")
							.append(tq.b(stream)).toString());

			tq.a(stream);
			map = map1;

			try {
				stream = urlConnection.getInputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			map = map1;
			obj = tq.a(stream);

			map = map1;
			obj = new up(uq.a, ((String) (obj)), i);
			if (map1 != null) {
				tq.a(stream);
			}
			if (context != null) {
				urlConnection.disconnect();
			}
			return ((up) (obj));

		} else {

			up = new up(uq.b, "Illegal arguments");
		}

		// _L7:
		try {
			up = new up(uq.b, (new StringBuilder())
					.append(((Throwable) map).getMessage())
					.append("; message: ")
					.append(urlConnection.getResponseMessage()).toString(),
					urlConnection.getResponseCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (s != null) {
			tq.a(stream);
		}

		if (context != null) {
			urlConnection.disconnect();
			return (com.main.up) map1;
		}

		up = new up(uq.b, ((Throwable) map).getMessage());
		if (s != null) {
			tq.a(stream);
		}

		if (s != null) {
			tq.a(stream);
		}

		return up;
	}
}
