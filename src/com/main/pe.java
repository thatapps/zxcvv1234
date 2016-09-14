package com.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;

public class pe {
	private static final String a = "Swipe." + pe.class.getSimpleName();
	private static Map b = new HashMap();
	private static Map c = new HashMap();

	static {
		b.put((Object) "com.lazyswipe", (Object) 1);
	}

	private pe() {
	}

	public static int a(Context paramContext) {
		return ir.a(paramContext, "pref_upgrade_ignore_version_code", 0);
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public static int a(String string) {
		// reference var5_1 = pe.class;
		synchronized (pe.class) {
			if (b.containsKey((Object) string)) {
				int n = (Integer) b.get((Object) string);
				return n;
			}
			int n = (int) (2.147483647E9 * Math.random());
			while (b.containsValue((Object) n)) {
				n = (int) (2.147483647E9 * Math.random());
			}
			b.put((Object) string, (Object) n);
			// ** MonitorExit[var5_1] (shouldn't be in output)
			return n;
		}
	}

	public static Intent a(Context paramContext, Class paramClass) {
		Intent localIntent = new Intent(paramContext, paramClass);
		localIntent.addFlags(67108864);
		localIntent.addFlags(536870912);
		localIntent.addFlags(268435456);
		return localIntent;
	}

	private static String a(String paramString1, int paramInt,
			String paramString2, String paramString3) {
		SwipeApplication localSwipeApplication = SwipeApplication.e();
		Object[] arrayOfObject = new Object[3];
		arrayOfObject[0] = paramString3;
		arrayOfObject[1] = paramString1;
		arrayOfObject[2] = Integer.valueOf(paramInt);
		StringBuilder localStringBuilder = new StringBuilder(
				String.format(
						"http://a.lazyswipe.com//clients/upgrade?userId=%s&pkg=%s&ver=%s",
						arrayOfObject));
		localStringBuilder.append("&pid=").append("400105");
		localStringBuilder.append("&cid=").append("32400");
		localStringBuilder.append("&vid=").append("00");
		localStringBuilder.append("&lang=").append(URLEncoder.encode(vk.j()));
		localStringBuilder.append("&osVer=").append(tn.b());
		localStringBuilder.append("&w=").append(to.r(localSwipeApplication));
		localStringBuilder.append("&h=").append(to.s(localSwipeApplication));
		localStringBuilder.append("&dpi=").append(tn.d(localSwipeApplication));
		if (!TextUtils.isEmpty(paramString2)) {
			localStringBuilder.append("&entry=").append(paramString2);
		}
		return localStringBuilder.toString();
	}

	public static pd a(Context paramContext, String paramString) {
		PackageInfo localPackageInfo = null;
		try {
			localPackageInfo = paramContext.getPackageManager().getPackageInfo(
					paramContext.getPackageName(), 0);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a(paramContext, localPackageInfo.packageName,
				localPackageInfo.versionCode, paramString);
	}

	private static pd a(Context context, String string, int n, String string2) {
		HttpResponse httpResponse = null;
		pd pd = null;
		try {
			httpResponse = su.a()
					.execute(
							(HttpUriRequest) ((HttpGet) su.a(context,
									pe.a(string, n, string2, ir.x(context)),
									true, true)));
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int n2 = httpResponse.getStatusLine().getStatusCode();
		if (200 == n2) {
			InputStream inputStream = su.a(httpResponse);
			pd = pd.e(ub.a(inputStream));
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pd;
		}
		if (304 == n2) {
			return null;
		}
		try {
			throw new IOException("Error response status code:" + n2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pd;
	}

	public static vs a(pd pd, Context context, Intent intent) {
		return pe.a(pd, context, intent, null);
	}

	public static vs a(pd pd, Context context, Intent intent, vs vs) {
		return pe.a(pd, context, intent, null, null);
	}

	public static vs a(pd pd, final Context context, Intent intent,
			final vs vs, final Integer n) {
		final pd a = pd;
		vs b = vs;
		Integer c = n;
		Context d = context;

		return new vs() {

			@Override
			public void a() {
				pe.b(context);
				if (vs != null) {
					vs.a();
				}
			}

			/*
			 * Enabled aggressive block sorting
			 */
			@Override
			public void a(int n3) {
				int n2;
				pe.c(a.g());
				switch (n3) {
				default: {
					Log.e((String) "Swipe..DownloadManager",
							(String) ("Error no is :" + n3));
					n2 = R.string.download_error;
					break;
				}
				case 2:
				case 3: {
					n2 = R.string.download_error_connection;
					break;
				}
				case 1:
				case 5: {
					n2 = R.string.download_error_savefile;
					break;
				}
				case 7: {
					n2 = R.string.download_error_validatefile;
				}
				}
				vi.a(context, n2);
				if (vs != null) {
					vs.a(n3);
				}
			}

			/*
			 * Enabled aggressive block sorting
			 */
			@Override
			public void b() {
				pe.c(a.g());
				if (a.i()) {
					if (!(n != null && context instanceof Activity)) {
						vk.a(context, a.l());
					} else {
						vk.a((Activity) context, a.l(), n);
					}
				}
				uk.a(context, pe.a(context));
				if (vs != null) {
					vs.b();
				}
			}
		};
	}

	public static void a(Context paramContext, int paramInt) {
		ir.b(paramContext, "pref_upgrade_ignore_version_code", paramInt);
	}

	public static void a(Context paramContext, long paramLong) {
		ir.b(paramContext, "pref_upgrade_last_upgrade_time", paramLong);
	}

	public static void a(String s, boolean flag) {
		Map map = c;
		int i;
		if (flag) {
			i = 1;
		} else {
			i = 0;
		}
		map.put(s, Integer.valueOf(i));
	}

	public static boolean a() {
		pd pd1 = pd.s();
		return pd1 != null && pd1.o();
	}

	public static boolean a(Context context, pd pd1, Intent intent, vs vs,
			pf pf1) {
		if (!ur.c()) {
			tp.a(context, context.getString(0x7f0f001e),
					context.getString(0x7f0f0021));
			if (pf1 != null) {
				pf1.a(-1);
			}
			return false;
		}
		if (pd.q()) {
			if (Fan.getInstance() != null) {
				Fan.getInstance().a(false);
			}
			vk.f(context, "com.lazyswipe");
			return false;
		} else {
			vr vr = new vr(context, pd1.k(), pd1.l(), pd1.d(), pd1.h(),
					new vo(), vs);
			vr.a(intent);
			vr.a();
			return true;
		}
	}

	public static boolean a(Context context, pd pd1, Intent intent, vs vs,
			pf pf1, pd pd2) {
		if (d(pd1.g())) {
			vi.a(context, 0x7f0f0024);
			return false;
		} else {
			return a(context, pd2, intent, vs, pf1);
		}
	}

	public static long b(Context paramContext) {
		return ir.a(paramContext, "pref_upgrade_last_upgrade_time", 0L);
	}

	public static void b(String paramString) {
		a(paramString, false);
	}

	public static boolean b(String s, boolean flag) {
		if (!c.containsKey(s)) {
			return false;
		}
		int i = ((Integer) c.get(s)).intValue();
		if (flag || i == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void c(String paramString) {
		c.remove(paramString);
	}

	public static boolean d(String paramString) {
		return b(paramString, false);
	}
}
