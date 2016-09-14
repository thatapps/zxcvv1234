package com.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;

public class oe {
	private static final String a = "Swipe." + oe.class.getSimpleName();
	private static final Object b = new Object();
	private static Set c;
	private static Set d;
	private static Set e;
	private static Set f;

	public static Set a() {
		b();
		return new HashSet(c);
	}

	public static void a(String paramString) {

		synchronized (b) {
			if (f != null) {
				f.add(paramString);
			}
			if (e != null) {
				e.remove(paramString);
			}
			if (c != null) {
				c.remove(paramString);
				if ("com.samsung.everglades.video".equals(paramString)) {
					c.remove("com.sec.android.app.videoplayer");
				}
			}
			jc.d(paramString);
			b("POP_TIME_USER_WHITE_LIST", f);
			b("POP_TIME_USER_BLACK_LIST", e);
			jw.d();
			return;
		}
	}

	@SuppressWarnings("rawtypes")
	public static void a(Collection paramCollection) {
		if (paramCollection == null) {
			return;
		}
		b();
		HashSet localHashSet1;
		HashSet localHashSet2;
		HashSet localHashSet3;
		Iterator localIterator2;
		synchronized (b) {
			c.remove("com.sec.android.app.videoplayer");
			localHashSet1 = new HashSet(c);
			localHashSet1.removeAll(new HashSet(paramCollection));
			Iterator localIterator1 = localHashSet1.iterator();
			if (localIterator1.hasNext()) {
				jc.d((String) localIterator1.next());
			}
		}
	}

	private static void a(boolean paramBoolean) {
		boolean bool = false;
		if ((e == null) || (paramBoolean)) {
			bool = n();
		}
		if ((f == null) || (paramBoolean)) {
			bool = m();
		}
		if ((d == null) || (paramBoolean)) {
			bool = l();
		}
		if ((bool) || (c == null) || (paramBoolean)) {
			k();
		}
		jw.d();
		e(a);
	}

	static String a(Set set) {
		return c(set);
	}

	static void a(String s, Set set) {
		b(s, set);
	}

	static Set b(Set set) {
		d = set;
		return set;
	}

	public static void a(final boolean flag, final List list) {
		final SwipeApplication swipeapplication = SwipeApplication.e();
		final Set set = o();
		final Set set1 = b(flag, list);
		final HashSet hashset = new HashSet(0);
		hashset.addAll(set);

		hashset.addAll(list);
		if (hashset == null || hashset.isEmpty()) {
			return;
		}
		if (!uj.d(swipeapplication)) {
			b("POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST", hashset);
			return;
		} else {
			ui.a(ji.a, new Runnable() {

				final Set a;
				final Context b;
				final Set c;
				final boolean d;

				public void run() {
					Object obj;
					if (!a.isEmpty()) {
						oi.b(SwipeApplication.e(),
								"POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST_REFETCH_TIME",
								System.currentTimeMillis());
					}
					oi.a(b, "POP_TIME_HAS_EVER_FETCHED_BLACK_LIST", true);
					obj = oe.a(c);
					JSONObject jsonObject = null;
					try {
						jsonObject = new JSONObject((new ty(b)).a(
								((String) (obj)), null));
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (((JSONObject) (jsonObject)).optInt("ret") != 200) {
						oe.a("POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST", c);
						return;
					}
					Object obj1;
					JSONArray jsonarr = ((JSONObject) (obj))
							.optJSONArray("data");
					obj = new HashSet(((JSONArray) (jsonarr)).length());
					int i1 = 0;
					// _L2:
					if (i1 >= ((JSONArray) (jsonarr)).length()) {
						// break; /* Loop/switch isn't completed */
					}
					((Set) (obj)).add(((JSONArray) (jsonarr)).optString(i1));
					i1++;
					obj1 = oe.g();

					if (!d) {
						// break MISSING_BLOCK_LABEL_214;
					}

					// _L3:
					oe.i();
					jw.d();
					try {
						oe.a("POP_TIME_CLOUD_BLACK_LIST", oe.h());
						oi.b(b, "POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST", "");
						oi.b(b,
								"POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST_REFETCH_TIME",
								-1L);
						return;
					}
					// Misplaced declaration of an exception variable
					catch (Exception exception) {
						Log.e(oe.j(), "failed in fetchCloudBlackList.",
								((Throwable) (obj)));
					}
					oe.a("POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST", c);

					if (oe.h() == null) {
						oe.b(new HashSet());
					}
					oe.h().addAll(((Collection) (obj)));

				}

				{
					a = set;
					b = swipeapplication.getBaseContext();
					c = set1;
					d = flag;
					// super();
				}
			});
			return;
		}
	}

	public static boolean d() {
		b();
		return c.isEmpty();
	}

	private static void e(String s) {
	}

	public static boolean e() {
		if (c == null) {
			return true;
		} else {
			return c.isEmpty();
		}
	}

	static Object g() {
		return b;
	}

	static Set h() {
		return d;
	}

	static void i() {
		k();
	}

	static String j() {
		return a;
	}

	private static Set b(boolean paramBoolean, List paramList) {
		SwipeApplication localSwipeApplication = SwipeApplication.e();
		if (!oi.b(localSwipeApplication,
				"POP_TIME_HAS_EVER_FETCHED_BLACK_LIST", false)) {
			paramList.addAll(localSwipeApplication.b().a());
		}
		HashSet localHashSet = new HashSet(0);
		if (paramList != null) {
			Iterator localIterator = paramList.iterator();
			while (localIterator.hasNext()) {
				jq localjq = (jq) localIterator.next();
				if ((localjq != null) && (localjq.h != null)) {
					localHashSet.add(localjq.h.getPackageName());
				}
			}
		}
		return localHashSet;
	}

	public static void b() {
		a(false);
	}

	// private static void b(String s, Set set) {
	// StringBuilder stringBuilder = null;
	// Object obj;
	// if (set == null) {
	// return;
	// }
	// HashSet hashSet = new HashSet(set);
	// stringBuilder = new StringBuilder();
	// String s1;
	// for (obj = (hashSet).iterator(); ((Iterator) (obj)).hasNext();
	// stringBuilder
	// .append(s1)) {
	// s1 = (String) ((Iterator) (obj)).next();
	// if (stringBuilder.length() != 0) {
	// stringBuilder.append(",");
	// }
	// }
	//
	// oi.b(SwipeApplication.e(), s, set.toString());
	// }
	private static void b(String string, Set set) {
		if (set == null) {
			return;
		}
		HashSet hashSet = new HashSet((Collection) set);
		StringBuilder stringBuilder = new StringBuilder();
		for (Object hass : hashSet) {
			if (stringBuilder.length() != 0) {
				stringBuilder.append(",");
			}
			stringBuilder.append(hass);
		}
		oi.b((Context) SwipeApplication.e(), string, stringBuilder.toString());
	}

	public static boolean b(String paramString) {
		b();
		return c.contains(paramString);
	}

	private static String c(Set paramSet) {
		SwipeApplication localSwipeApplication = SwipeApplication.e();
		StringBuilder localStringBuilder1 = new StringBuilder(
				"http://api.lazyswipe.com/");
		localStringBuilder1.append("pkg/blacklist").append("?uid=")
				.append(ir.x(localSwipeApplication)).append("&pid=")
				.append("400105").append("&pkgs=");
		StringBuilder localStringBuilder2 = new StringBuilder();
		Iterator localIterator = paramSet.iterator();
		while (localIterator.hasNext()) {
			String str = (String) localIterator.next();
			if (localStringBuilder2.length() != 0) {
				localStringBuilder2.append(",");
			}
			localStringBuilder2.append(str);
		}
		localStringBuilder1.append(localStringBuilder2.toString());
		return localStringBuilder1.toString();
	}

	public static void c() {
		a(true);
	}

	public static boolean c(String paramString) {
		b();
		return d.contains(paramString);
	}

	private static Set d(String paramString) {
		HashSet localHashSet = new HashSet();
		String str = oi.a(SwipeApplication.e(), paramString, "");
		String[] arrayOfString = null;
		if (!TextUtils.isEmpty(str)) {
			arrayOfString = str.split(",");
			if (arrayOfString == null) {
			}
		}
		try {
			localHashSet.addAll(Arrays.asList(arrayOfString));

		} catch (Throwable localThrowable) {
		}
		return localHashSet;
	}

	public static int f() {
		b();
		return c.size();
	}

	private static void k() {
		synchronized (b) {
			c = new HashSet();
			if (d != null) {
				c.addAll(d);
			}
			if (e != null) {
				c.addAll(e);
			}
			if (f != null) {
				c.removeAll(f);
			}
			if (c.contains("com.samsung.everglades.video")) {
				c.add("com.sec.android.app.videoplayer");
			}
			return;
		}
	}

	private static boolean l() {
		Set localSet = d("POP_TIME_CLOUD_BLACK_LIST");
		synchronized (b) {
			d = localSet;
			return true;
		}
	}

	private static boolean m() {
		Set localSet = d("POP_TIME_USER_WHITE_LIST");
		synchronized (b) {
			f = localSet;
			if (f != null) {
				f.add(SwipeApplication.e().getPackageName());
			}
			return true;
		}
	}

	private static boolean n() {
		Set localSet = d("POP_TIME_USER_BLACK_LIST");
		synchronized (b) {
			e = localSet;
			return true;
		}
	}

	private static Set o() {
		if (Math.abs((long) (oi.a((Context) SwipeApplication.e(),
				"POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST_REFETCH_TIME", -1) - System
				.currentTimeMillis())) <= 86400000)
			return new HashSet(0);
		return oe.d("POP_TIME_CLOUD_BLACK_LAST_FAIL_LIST");
	}
}
