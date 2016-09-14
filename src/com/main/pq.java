package com.main;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import android.app.Activity;
import android.app.Notification;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.widget.Toast;

import com.lazyswipe.SwipeService;
import com.lazyswipe.notification.AppNotification;
import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.notification.SwipeNotificationListenerService;

public final class pq {

	public static final boolean a = false;
	public static final Object b = new Object();
	public static HashSet c = new HashSet(0);
	public static HashMap d = new HashMap(0);
	static HashMap e = new HashMap(0);
	static String f;
	public static boolean g;
	static WeakReference h;
	private static android.content.SharedPreferences.OnSharedPreferenceChangeListener i;

	public static Map a(pv pv1) {
		HashMap hashmap = new HashMap();
		Iterator iterator3 = null;
		for (iterator3 = pv1.g.values().iterator(); iterator3.hasNext();) {
			pu pu1 = (pu) iterator3.next();
			AppNotification appnotification = (AppNotification) d.get(pu1.a);
			if (appnotification != null) {
				Iterator iterator1 = appnotification.d.keySet().iterator();
				while (iterator1.hasNext()) {
					pg pg2 = (pg) iterator1.next();
					if (pu1.a().contains(pg2.d)) {
						hashmap.put(pg2, appnotification.d.get(pg2));
					}
				}
			}
		}

		int j = hashmap.size();
		// if (j > 0) {
		// Object obj = new HashMap(j);
		// java.util.Map.Entry entry;
		// for (Iterator iterator = hashmap.entrySet().iterator(); iterator
		// .hasNext(); ((HashMap) (obj)).put(entry.getKey(),
		// Long.valueOf(((pi) (pv1)).a))) {
		// entry = (java.util.Map.Entry) iterator.next();
		// Iterator iterator2 = ((ts) entry.getValue()).iterator();
		// for (pv1 = null; iterator2.hasNext(); pv1 = (pv) iterator2
		// .next()) {
		// }
		// }
		if (j > 0) {
			Object obj = new HashMap(j);
			for (Object entry : hashmap.entrySet()) {
				Iterator iterator = ((ts) ((Entry) entry).getValue())
						.iterator();
				pi pi = null;
				while (iterator.hasNext()) {
					pi = (pi) iterator.next();
				}
				((HashMap) obj).put(((Entry) entry).getKey(), (Object) pi.a);
			}
			obj = vk.a(((Map) (obj)), new Comparator() {

				public int a(java.util.Map.Entry entry1,
						java.util.Map.Entry entry2) {
					return (int) (((Long) entry2.getValue()).longValue() - ((Long) entry1
							.getValue()).longValue());
				}

				public int compare(Object obj1, Object obj2) {
					return a((java.util.Map.Entry) obj1,
							(java.util.Map.Entry) obj2);
				}

			});
			LinkedHashMap map = new LinkedHashMap(j);
			pg pg1;
			for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj))
					.hasNext(); map.put(pg1, hashmap.get(pg1))) {
				pg1 = (pg) ((java.util.Map.Entry) ((Iterator) (obj)).next())
						.getKey();
			}

			return map;
		} else {
			return new LinkedHashMap(0);
		}
	}

	public static ts a(String s, pg pg1) {
		AppNotification notification = e(s);
		if (s != null) {
			return (ts) ((AppNotification) (notification)).d.get(pg1);
		} else {
			return null;
		}
	}

	public static void a(Context context) {
		SharedPreferences sharedpreferences = ir.a(context);
		f = sharedpreferences.getString("key_notification_apps_selected",
				context.getString(0x7f0f0007));
		a(((String) (null)));
		AppNotification.b();
		i = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {

			public void onSharedPreferenceChanged(
					SharedPreferences sharedpreferences1, String s) {
				if ("key_notification_apps_selected".equals(s)) {
					pq.a(sharedpreferences1);
				}
			}

		};
		sharedpreferences.registerOnSharedPreferenceChangeListener(i);
		if (h != null && h.get() != null) {
			((pr) h.get()).c(true);
		}
	}

	public static void a(Context context, String s, Notification notification) {
		try {
			a(context, s, notification, null, 0, null);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.Notification",
					"Exception occurred when adding a notification", exception);
		}
	}

	//public static void a(Context context, String s, Notification notification,
//			String s1, int j, String s2) {
//		Object obj1 = b;
//
//		Object obj = (AppNotification) d.get(s);
//		AppNotification appnotification;
//		appnotification = ((AppNotification) (obj));
//		if (obj == null) {
//			appnotification = AppNotification.a();
//		}
//
//		CharSequence charsequence = (CharSequence) e.get(s);
//		obj = charsequence;
//		if (charsequence == null) {
//			try {
//				obj = vk.a(context, s, null);
//			} catch (NameNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
//
//		e.put(s, obj);
//		if (appnotification.a(((CharSequence) (obj)), s, notification, s1, j,
//				s2)) {
//			d.put(s, appnotification);
//			f(appnotification.c);
//		}
//
//		return;
//
//	}
			public static void a(Context context, String string, Notification notification, String string2, int n, String string3) {
        Object object;
        Object object2 = object = b;
        synchronized (object2) {
            Object object3;
            AppNotification appNotification = (AppNotification)d.get((Object)string);
            if (appNotification == null) {
                appNotification = AppNotification.a();
            }
            if ((object3 = (CharSequence)e.get((Object)string)) == null) {
                try {
					object3 = vk.a(context, string, null);
				} catch (NameNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                e.put((Object)string, object3);
            }
            if (appNotification.a((CharSequence)object3, string, notification, string2, n, string3)) {
                d.put((Object)string, (Object)appNotification);
                pq.f(appNotification.c);
            }
            return;
        }
    }
	static void a(SharedPreferences sharedpreferences) {
		String s = f;
		f = sharedpreferences.getString("key_notification_apps_selected", "");
		if (vk.a(s, f) != null) {
			return;
		} else {
			a(s);
			return;
		}
	}

	static void a(String s) {
		Object obj = b;

		c.clear();
		if (!TextUtils.isEmpty(f)) {
			String as[] = f.split(",");
			c.addAll(Arrays.asList(as));
		}
		Iterator iterator = d.entrySet().iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			String s1 = (String) ((java.util.Map.Entry) iterator.next())
					.getKey();
			if (!c.contains(s1)) {
				iterator.remove();
				g(s1);
			}
		} while (true);

		Iterator iterator1 = e.entrySet().iterator();
		do {
			if (!iterator1.hasNext()) {
				break;
			}
			if (!c.contains(((java.util.Map.Entry) iterator1.next()).getKey())) {
				iterator1.remove();
			}
		} while (true);
		if (android.os.Build.VERSION.SDK_INT >= 18 && !TextUtils.isEmpty(s)
				&& SwipeNotificationListenerService.a != null) {
			String[] strings = s.split(",");
			HashSet hashset = new HashSet(strings.length);
			hashset.addAll(Arrays.asList(strings));
			SwipeNotificationListenerService.a.a(hashset);
		}

	}

	public static void a(String s, pg pg1, boolean flag) {
		boolean flag2 = false;
		boolean flag1 = false;
		AppNotification notification = null;
		Iterator iterator = null;

		synchronized (b) {
			if (d.size() <= 0) {
				return;
			}
		}

		if (android.os.Build.VERSION.SDK_INT < 18) {
			if (!TextUtils.isEmpty(s)) {

				notification = (AppNotification) d.remove(s);
				if (notification == null) {

					e();
					return;

				} else {

					notification.c();
					e();

					flag1 = flag2 & flag1;

					if (!((Iterator) pg1).hasNext()) {

						if (notification.d.size() <= 0) {
							notification.c();
							d.remove(s);
						}

					} else {

						Object obj1;
						obj1 = (java.util.Map.Entry) ((Iterator) pg1).next();
						pg pg2 = (pg) ((java.util.Map.Entry) (obj1)).getKey();
						obj1 = (pi) ((ts) ((java.util.Map.Entry) (obj1))
								.getValue()).peek();
						SwipeNotificationListenerService.a(s, pg2.a, pg2.b,
								pg2.c);
						flag2 = ((pi) (obj1)).b;
						if (!flag) {
							if (!((pi) (obj1)).b) {
								((Iterator) pg1).remove();
							}
						}

					}

				}

			} else {

				f();
			}

		} else {

			if (TextUtils.isEmpty(s)) {

				return;

			} else {

				AppNotification appnotification = (AppNotification) d.get(s);
				if (appnotification == null) {
					return;
				} else {

					if (pg1 == null) {

						iterator = appnotification.d.entrySet().iterator();
						flag1 = true;

					} else {

						flag2 = b(s, pg1).b;
						SwipeNotificationListenerService.a(s, pg1.a, pg1.b,
								pg1.c);
						if (flag && false & !flag2) {
							appnotification.d.remove(pg1);
						}

					}

				}

			}

		}

	}

	public static boolean a() {
		return a && g;
	}

	public static boolean a(Context context, CharSequence charsequence) {
		return charsequence != null
				&& (c != null && c.contains(charsequence) || ir.C(context)
						&& vh.g(context).equals(charsequence));
	}

	public static boolean a(Context context, pr pr1) {
		if (pr1 == null) {
			h = null;
			return false;
		} else {
			h = new WeakReference(pr1);
			return c(context);
		}
	}

	public static pi b(String s, pg pg1) {
		AppNotification appNotification = e(s);
		if (appNotification != null) {
			return appNotification.a(pg1);
		} else {
			return null;
		}
	}

	public static void b() {
		if (e != null) {
			e.clear();
		}
	}

	public static void b(Context context) {
		ir.a(context).unregisterOnSharedPreferenceChangeListener(i);
		i = null;
		synchronized (b) {
			if (d != null) {
				f();
				AppNotification.b();
				e.clear();
			}
		}
		if (c != null) {
			c.clear();
		}
		if (h != null && h.get() != null) {
			((pr) h.get()).c(false);
		}
		return;

	}

	public static boolean b(String s) {
		return "com.tencent.mobileqq".equals(s);
	}

	public static pi c(String s, pg pg1) {
		AppNotification appNotification = e(s);
		if (appNotification != null) {
			return appNotification.b(pg1);
		} else {
			return null;
		}
	}

	public static void c(String s) {
	}

	public static boolean c() {
		Object obj = b;

		boolean flag;
		if (d != null && d.size() > 0) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;

	}

	public static boolean c(Context context) {
		boolean flag;
		try {
			if (android.os.Build.VERSION.SDK_INT >= 18) {
				return SwipeNotificationListenerService.a(context);
			}
			flag = SwipeAccessibilityService.a(context);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.Notification",
					"Failed to determine if notification listener service is running",
					exception);
			return false;
		}
		return flag;
	}

	public static CharSequence d(String s) {
		if (e != null) {
			return (CharSequence) e.get(s);
		} else {
			return null;
		}
	}

	public static HashMap d() {
		Object obj1 = b;

		Object obj = null;

		if (d != null) {
			obj = new HashMap(d);
		}

		return ((HashMap) (obj));

	}

	public static void d(Context context) {
		Object obj;
		if (android.os.Build.VERSION.SDK_INT < 18) {
			obj = "android.settings.ACCESSIBILITY_SETTINGS";
		} else {
			obj = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
		}
		obj = new Intent(((String) (obj)));
		if (!(context instanceof Activity)) {
			((Intent) (obj)).addFlags(0x10000000);
		}
		try {
			context.startActivity(((Intent) (obj)));
			return;
		} catch (Exception exception) {
			StringBuilder stringbuilder = (new StringBuilder())
					.append("Couldn't start the ");
			String s;
			if (android.os.Build.VERSION.SDK_INT < 18) {
				s = "Accessibility settings";
			} else {
				s = "Notification access settings";
			}
			Toast.makeText(
					context,
					stringbuilder
							.append(s)
							.append(". Please contact your device manufacture!")
							.toString(), 0).show();
			vj.a("Swipe.Notification", "Failed to start the setting activity",
					exception);
			return;
		}
	}

	public static AppNotification e(String s) {
		Object obj = b;
		AppNotification appNotification = null;

		if (d != null) {
			appNotification = (AppNotification) d.get(s);
		}

		return appNotification;

	}

	public static void e() {
		SwipeService.e();
	}

	private static void f() {
		for (Iterator iterator = d.values().iterator(); iterator.hasNext(); ((AppNotification) iterator
				.next()).c()) {
		}
		d.clear();
	}

	public static void f(String s) {
		SwipeService.a(s);
	}

	private static void g(String s) {
		AppNotification appNotification = (AppNotification) d.remove(s);
		if (appNotification != null) {
			appNotification.c();
		}
	}

}
