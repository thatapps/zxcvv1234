package com.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.DisplayMetrics;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.util.Native$CryptoUtils;

public class ji {
	public static final Handler a;
	private static final HandlerThread b;
	private static long c;

	static {
		b = new HandlerThread("Swipe.API");
		b.setPriority(10);
		b.start();
		a = new Handler(b.getLooper());
	}

	public static void a() {
		if (SwipeApplication.e != null) {
		}
		try {
			a(SwipeApplication.e(), SwipeApplication.e);
			return;
		} catch (Throwable localThrowable) {
		}
	}

	public static void a(Context context) {
		if (TextUtils.isEmpty(ir.x(context))) {
			b(context);
		} else {
			d(context);
			jc.c();
			pb.a().b();
			if (!ir.q(context) && ir.I(context) > 0) {
				jc.d(context);
			}
			if (ol.a()) {
				if (!ol.u) {
					ol.a(context);
				} else {
					on.a(ol.t);
				}
			}
			if (SwipeAccessibilityService.a) {
				i(context);
				return;
			}
		}
	}

	static void a(Context context, int n, Map map) {
		int n2;
		if (1 == n) {
			kk.a(context, 1);
		}
		vj.a("Swipe.API",
				"Getting banners #" + n + ", since:"
						+ (String) map.get((Object) "sinceId") + " ...");
		map.put((Object) "page", (Object) String.valueOf((int) n));
		up up = tz.a(context, "http://a.lazyswipe.com/banners", map, 10000,
				10000);
		if (uq.a != up.a) {
			return;
		}
		try {
			jg jg = new jg(up.c);
			jg.a(context);
			if (1 != n)
				return;
			n2 = jg.a();
		} catch (JSONException var6_7) {
			vj.b("Swipe.API", "Could not parse the json string: " + up.c);
			return;
		}
		for (int i = 2; i <= n2; ++i) {
			ji.a(context, i, map);
		}
	}

	public static void a(final Context context, final long l) {
		try {
			final String string = SwipeApplication.e.getString("code");
			ui.a(a, (Runnable) new Runnable() {

				public void run() {
					Bundle var1_1 = new Bundle(2);
					var1_1.putString("extra_param_1", string);
					var1_1.putLong("extra_param_2", l);
					try {
						context.getContentResolver().call(ka.a,
								"updateBannerShowedTime", null, var1_1);
					} catch (Throwable var2_2) {
						// ** continue;
					}
					// bl8: // 2 sources:
					do {
						SwipeApplication.e = ji.g(context);
						return;
						// break;
					} while (true);
				}
			});
			return;
		} catch (Throwable var3_3) {
			return;
		}
	}

	public static void a(final Context context, final String string) {
		try {
			ui.a(a, (Runnable) new Runnable() {

				public void run() {
					ContentValues contentValues = new ContentValues(1);
					contentValues.put("seen", Integer.valueOf((int) -1));
					context.getContentResolver().update(
							ka.a.buildUpon().appendPath(string).build(),
							contentValues, null, null);
				}
			});
			return;
		} catch (Throwable var2_2) {
			return;
		}
	}

	static void a(Context paramContext, JSONObject paramJSONObject) {
		if (ir.u(paramContext)) {
			int i = Calendar.getInstance().get(11);
			try {
				if ((i >= 8)
						&& (i < 23)
						&& (System.currentTimeMillis()
								- paramJSONObject.getLong("endTime") <= 0L)) {
					String str = null;
					try {
						str = paramJSONObject.getString("content");
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Notification localNotification = new Notification.Builder(
							paramContext)
							.setSmallIcon(2130903040)
							.setContentTitle(str)
							.setTicker(str)
							.setContentText(
									paramContext.getResources().getText(
											2131689552)
											+ " "
											+ paramContext.getResources()
													.getText(2131689475))
							.setContentIntent(SwipeService.e(paramContext))
							.setAutoCancel(true).getNotification();
					((NotificationManager) paramContext
							.getSystemService("notification")).notify(1001,
							localNotification);
					jd.a();
				}
			} catch (NotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void a(Context paramContext, boolean paramBoolean) {
		ui.a(a, new jm(paramContext, paramBoolean));
	}

	public static void a(Context paramContext, Uri[] paramArrayOfUri,
			String paramString1, String paramString2) {
		ui.a(a, new jn(paramContext, paramArrayOfUri, paramString1,
				paramString2));
	}

	public static boolean a(Context context, String string, boolean bl) {
		long l;
		String string2 = ir.b(context, null);
		if (TextUtils.isEmpty((CharSequence) string2)) {
			string2 = "000040010566fccad33cde50beee0000";
		}
		String string3 = String.valueOf((Object) "400105");
		String string4 = string2.substring(3, 15) + string3.substring(3, 6)
				+ "2";
		if (!(bl || string4.equals((Object) ir.c(context)))) {
			ir.a(context, string4);
			context.getContentResolver().delete(kr.a, null, null);
		}
		HashMap hashMap = new HashMap(7);
		hashMap.put((Object) "uid", (Object) string2);
		hashMap.put((Object) "pid", (Object) string3);
		hashMap.put((Object) "aver", (Object) "2");
		long l2 = System.currentTimeMillis();
		if (c == 0 || c >= 86400000) {
			c = l2;
			l = 0;
		} else {
			l = l2 + c;
		}
		hashMap.put((Object) "pkgs", (Object) string);
		hashMap.put((Object) "sign", (Object) Native$CryptoUtils.a(context,
				String.valueOf((long) l), string4, true));
		DisplayMetrics displayMetrics = context.getResources()
				.getDisplayMetrics();
		hashMap.put((Object) "w",
				(Object) String.valueOf((int) displayMetrics.widthPixels));
		hashMap.put((Object) "h",
				(Object) String.valueOf((int) displayMetrics.heightPixels));
		HashMap hashMap2 = new HashMap(3);
		hashMap2.put((Object) "Accept-Encoding", (Object) "identity");
		hashMap2.put((Object) "Connection", (Object) "close");
		hashMap2.put((Object) "ChunkedStreamingMode", (Object) "0");
		up up = tz.a(context, "http://api.lazyswipe.com/scheme", (Map) hashMap,
				10000, 10000, (Map) hashMap2);
		if (uq.a != up.a) {
			return false;
		}
		try {
			JSONObject jSONObject = new JSONObject(up.c);
			if (jSONObject.optInt("ret") == 500) {
				if (!"time is error".equals((Object) jSONObject
						.optString("errmsg")))
					return false;
				c = jSONObject.optLong("ts") - c;
				if (bl)
					return false;
				return ji.a(context, string, true);
			}
			String string5 = jSONObject.optString("data");
			if (TextUtils.isEmpty((CharSequence) string5)) {
				return true;
			}
			JSONObject jSONObject2 = new JSONObject(Native$CryptoUtils.b(
					context, string5, string4));
			Iterator iterator = jSONObject2.keys();
			ArrayList arrayList = new ArrayList();
			boolean bl2 = true;
			while (iterator.hasNext()) {
				String string6 = (String) iterator.next();
				int n = bl2 ? 3 : 2;
				ContentValues contentValues = new ContentValues(n);
				if (bl2) {
					contentValues.put("key_replace_if_exists",
							Boolean.valueOf((boolean) true));
					bl2 = false;
				}
				contentValues.put("package",
						Native$CryptoUtils.a(context, string6, string4));
				contentValues.put(
						"data",
						Native$CryptoUtils.a(context,
								jSONObject2.getString(string6), string4));
				arrayList.add((Object) contentValues);
			}
			context.getContentResolver().bulkInsert(
					kr.a,
					(ContentValues[]) arrayList
							.toArray((Object[]) new ContentValues[arrayList
									.size()]));
			return true;
		} catch (Throwable var25_21) {
			vj.a("Swipe.API", "Could not save touch fixes: " + up.c, var25_21);
			return false;
		}
	}

	public static void b(Context paramContext) {
		ui.a(a, new jo(paramContext));
	}

	public static void b(Context context, boolean bl) {
		if (!(bl || ji.e(context))) {
			return;
		}
		HashMap hashMap = new HashMap(5);
		hashMap.put((Object) "locale", (Object) vk.j());
		hashMap.put((Object) "sinceId",
				(Object) String.valueOf((long) ji.f(context)));
		hashMap.put((Object) "pageSize", (Object) "10");
		hashMap.put((Object) "needAppVer", (Object) "1");
		ji.a(context, 1, (Map) hashMap);
		if (SwipeApplication.e == null) {
			SwipeApplication.e = ji.g(context);
		}
		ji.a();
	}

	public static boolean b(Context paramContext, String paramString) {
		return a(paramContext, paramString, false);
	}

	public static boolean b(Context context, Uri[] arruri, String string,
			String string2) {
		String string3 = ir.x(context);
		if (TextUtils.isEmpty((CharSequence) string3)) {
			ji.c(context);
			string3 = ir.x(context);
			if (TextUtils.isEmpty((CharSequence) string3)) {
				vj.b("Swipe.API",
						"Feedback not sent because of missing user id");
				return false;
			}
		}
		vj.a("Swipe.API", "Sending feedback...");
		HashMap hashMap = new HashMap();
		hashMap.put((Object) "userId", (Object) string3);
		hashMap.put((Object) "title", (Object) "Feedback");
		hashMap.put((Object) "content", (Object) string);
		hashMap.put((Object) "channel", (Object) "32400");
		hashMap.put((Object) "pid", (Object) "400105");
		hashMap.put((Object) "verNum", (Object) String.valueOf((int) 2001));
		hashMap.put((Object) "contact", (Object) string2);
		hashMap.put((Object) "phoneModel", (Object) Build.MODEL);
		hashMap.put((Object) "osVersion",
				(Object) String.valueOf((int) Build.VERSION.SDK_INT));
		hashMap.put((Object) "promoteChannel", (Object) jc.f());
		up up = tz.a(context, "http://a.lazyswipe.com/feedbacks/send",
				(Map) hashMap, 30000, 30000);
		if (uq.a != up.a) {
			return false;
		}
		try {
			boolean bl = new jf(up.c).d();
			return bl;
		} catch (JSONException var17_8) {
			vj.b("Swipe.API", "Could not parse the json string: " + up.c);
			return false;
		}
	}

	public static void c(Context context) {
		if (!TextUtils.isEmpty((CharSequence) ir.x(context))) {
			return;
		}
		vj.a("Swipe.API", "Registering user...");
		HashMap hashMap = new HashMap(6);
		hashMap.put((Object) "deviceId", (Object) to.k(context));
		hashMap.put((Object) "m0", (Object) vh.c(context));
		hashMap.put((Object) "pinfo", (Object) "2400105XX32400^^^^00,00");
		hashMap.put((Object) "clientVer", (Object) String.valueOf((int) 2001));
		hashMap.put((Object) "m1", (Object) to.l(context));
		hashMap.put((Object) "m2", (Object) to.m(context));
		up up = tz.a(context, "http://a.lazyswipe.com/users/activate",
				(Map) hashMap, 10000, 10000);
		if (uq.a != up.a)
			return;
		try {
			je je = new je(up.c);
			vj.a("Swipe.API", "Activation result: " + (Object) je);
			String string = je.b();
			if (TextUtils.isEmpty((CharSequence) string))
				return;
			ir.a(context, string, je.a());
			if (ir.I(context) > 0) {
				jc.d(context);
			}
			jc.d();
			SharedPreferences sharedPreferences = ir.a(context);
			jc.a(context, "C2", String.valueOf((int) sharedPreferences.getInt(
					"key_default_theme", -1)));
			sharedPreferences.edit().remove("key_default_theme").apply();
			jc.a(context, 0);
			SwipeApplication.e().d();
			return;
		} catch (JSONException var10_6) {
			vj.b("Swipe.API", "Could not parse the json string: " + up.c);
			return;
		}
	}

	public static void c(Context paramContext, boolean paramBoolean) {
		ui.a(a, new jl(paramContext, paramBoolean));
	}

	public static void d(Context paramContext) {
		a(paramContext, false);
	}

	static boolean e(Context paramContext) {
		if ((System.currentTimeMillis() - ir.b() >= 86400000L)
				&& (kk.a(paramContext, 1L, 86400000L))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	static long f(Context context) {
		Cursor cursor = null;
		cursor = context.getContentResolver().query(ka.a,
				new String[] { " MAX(code)" }, null, null, null);
		long l;
		if (!cursor.moveToFirst() || cursor.isNull(0)) {

		}
		l = cursor.getLong(0);
		if (cursor != null) {
			cursor.close();
		}

		if (cursor != null) {
			cursor.close();
		}
		return l;

	}

	public static JSONObject g(Context context) {
		Object obj;
		Object obj1;
		Object obj3;
		Object obj2 = null;
		int k = 0;
		int l;
		long l1;
		l1 = System.currentTimeMillis();
		obj = String.valueOf(l1);
		obj1 = Calendar.getInstance(Locale.getDefault());
		int j = ((Calendar) (obj1)).get(15);
		obj3 = String.valueOf(-(((Calendar) (obj1)).get(16) + j) / 60000);
		obj1 = (new StringBuilder())
				.append(" ( CASE  WHEN useTimeZone=1 THEN beginTime+")
				.append(((String) (obj3))).append(" ELSE ").append("beginTime")
				.append(" END ").append(")").append(" AS ").append("beginTime")
				.toString();
		obj3 = (new StringBuilder())
				.append(" ( CASE  WHEN useTimeZone=1 THEN endTime+")
				.append(((String) (obj3))).append(" ELSE ").append("endTime")
				.append(" END ").append(")").append(" AS ").append("endTime")
				.toString();
		obj = context
				.getContentResolver()
				.query(ka.a,
						new String[] { "pkg", (String) obj1, (String) obj3,
								"code", "content", "link", "retrospect",
								"appVer" },
						"beginTime<=? AND endTime>? AND (((pkg IS NULL  OR  LENGTH(pkg)<=0) AND seen=0) OR (pkg IS NOT NULL  AND  LENGTH(pkg)>0 AND seen>=0 AND time_showed<duration))",
						new String[] { (String) obj, (String) obj }, "code ASC");
		// _L7:
		if (!((Cursor) (obj)).moveToNext()) {
			if (obj != null) {
				((Cursor) (obj)).close();
			}
		} else {
			obj3 = ((Cursor) (obj)).getString(0);
			if (TextUtils.isEmpty(((CharSequence) (obj3)))) {

				l = ((Cursor) (obj)).getColumnCount();
				obj2 = new JSONObject();

			} else {

				String s = ((Cursor) (obj)).getString(((Cursor) (obj))
						.getColumnIndex("code"));
				if (jg.a(context, ((String) (obj3)), ((Cursor) (obj))
						.getInt(((Cursor) (obj)).getColumnIndex("appVer")))) {

					k = ((Cursor) (obj)).getInt(((Cursor) (obj))
							.getColumnIndex("retrospect"));
					obj2 = null;
					ContentResolver contentresolver;
					Uri uri;
					contentresolver = context.getContentResolver();
					uri = ka.a;
					long l2 = k;
					obj3 = contentresolver.query(
							uri,
							new String[] { " COUNT(*) " },
							"pkg=? AND seen>? AND code<>?",
							new String[] { (String) obj3,
									String.valueOf(l1 - l2 * 0x5265c00L), s },
							null);
					obj2 = obj3;
					if (!((Cursor) (obj2)).moveToFirst()) {
						if (obj2 == null) {
							l = ((Cursor) (obj)).getColumnCount();
							obj2 = new JSONObject();

						} else {
							((Cursor) (obj2)).close();
						}
					} else {
						k = ((Cursor) (obj2)).getInt(0);
						if (k <= 0) {
							if (obj2 == null) {
								l = ((Cursor) (obj)).getColumnCount();
								obj2 = new JSONObject();
							} else {
								((Cursor) (obj2)).close();
							}

						} else {
							if (obj2 == null) {

								l = ((Cursor) (obj)).getColumnCount();
								obj2 = new JSONObject();

							} else {
								((Cursor) (obj2)).close();

							}
						}
					}

				} else {
					a(context, s);

					context = ((Context) (obj));
					obj = obj2;
				}
			}
		}

		// _L21:
		/*vj.b("Swipe.API",
				(new StringBuilder())
						.append("Failed to get a banner to display: ")
						.append(( (obj)).getMessage()).toString());*/
		if (context != null) {
			//((Cursor) context).close();
		}

		return (JSONObject) obj2;
	}

	public static void h(Context paramContext) {
		try {
			((NotificationManager) paramContext
					.getSystemService("notification")).cancel(1001);
			return;
		} catch (Throwable localThrowable) {
			for (;;) {
			}
		}
	}

	public static void i(Context paramContext) {
		c(paramContext, false);
	}
}
