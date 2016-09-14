package com.main;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

public class js extends BroadcastReceiver {
	private static final Object e = new Object();
	public final jp a;
	public boolean b = false;
	public boolean c = false;
	private final Context d;
	private final ArrayList f = new ArrayList();
	private final ArrayList g = new ArrayList();
	private final HashMap h = new HashMap();
	public jq jqq;

	public js(Context context) {
		this.d = context;
		this.a = new jp(context);
	}

	static ArrayList b(js js1) {
		return js1.f;
	}

	static Context a(js js1) {
		return js1.d;
	}

	private void a(String s, SharedPreferences sharedpreferences, String s1,
			int i, String s2) {
		int j = s1.indexOf(',', s.length() + i);
		if (i == 0 && j < 0) {
			s = null;
		} else if (i == 0) {
			s = s1.substring(j + 1);
		} else if (j < 0) {
			s = s1.substring(0, i);
		} else {
			s = (new StringBuilder()).append(s1.substring(0, i))
					.append(s1.substring(j + 1)).toString();
		}
		sharedpreferences.edit().putString(s2, s).apply();
	}

	// private void b(String string) {
	// this.a.b(string);
	// ol ol = null;
	// ol = ol.a(this.d);
	// if (ol != null) {
	// ol.a(ki.a);
	// }
	// PackageManager packageManager = this.d.getPackageManager();
	// List list = packageManager.queryIntentActivities(vk.a(string), 0);
	// ArrayList arrayList = new ArrayList(list.size());
	// Iterator iterator = list.iterator();
	// while (iterator.hasNext()) {
	// final jq jq = new jq(packageManager, (ResolveInfo) iterator.next());
	// jq.f = -1;
	// arrayList.add((Object) jq);
	// this.a(jq);
	// ui.a((Runnable) new Runnable() {
	//
	// public void run() {
	// jt.a(js.this.d, jq);
	// }
	// });
	// }
	// // list.clear();
	// SharedPreferences sharedPreferences = ir.a(this.d);
	// String string2 = sharedPreferences.getString(
	// "key_notification_apps_selected", "");
	// if (this.d.getString(2131689479).contains((CharSequence) string)) {
	// if (TextUtils.isEmpty((CharSequence) string2)
	// || !string2.contains((CharSequence) string)) {
	// sharedPreferences
	// .edit()
	// .putString("key_notification_apps_selected",
	// string + "," + string2).apply();
	// }
	// if (ir.A(this.d)) {
	// ir.f(this.d, 104);
	// SwipeApplication.d = true;
	// ir.c(this.d, string);
	// }
	// }
	// ui.a((Runnable) new Runnable() {
	// /* synthetic */List a;
	//
	// public void run() {
	// oe.c();
	// if (!this.a.isEmpty()) {
	// ArrayList arrayList = new ArrayList(1);
	// arrayList.add(this.a.get(0));
	// oe.a(false, (List) new ArrayList((Collection) arrayList));
	// }
	// }
	// });
	// }
	private void b(String s) {
		a.b(s);
		final Object obj = ol.a(d);
		if (obj != null) {
			((ol) (obj)).a(ki.a);
		}
		Object obj1 = d.getPackageManager();
		Object obj2 = ((PackageManager) (obj1)).queryIntentActivities(vk.a(s),
				0);
		ArrayList list = new ArrayList(((List) (obj2)).size());
		final jq jq1;
		for (Iterator iterator = ((List) (list)).iterator(); iterator.hasNext(); ui
				.a(new Runnable() {

					final jq a;
					final js b;

					public void run() {
						jt.a(js.a(b), a);
					}

					{
						b = js.this;
						a = jqq;
						// super();
					}
				})) {
			jqq = new jq(((PackageManager) (obj1)),
					(ResolveInfo) iterator.next());
			jqq.f = -1;
			((List) (list)).add(jqq);
			a(jqq);
		}

		((List) (obj2)).clear();
		obj1 = ir.a(d);
		obj2 = ((SharedPreferences) (obj1)).getString(
				"key_notification_apps_selected", "");
		if (d.getString(0x7f0f0007).contains(s)) {
			if (TextUtils.isEmpty(((CharSequence) (obj2)))
					|| !((String) (obj2)).contains(s)) {
				((SharedPreferences) (obj1))
						.edit()
						.putString(
								"key_notification_apps_selected",
								(new StringBuilder()).append(s).append(",")
										.append(((String) (obj2))).toString())
						.apply();
			}
			if (ir.A(d)) {
				ir.f(d, 104);
				SwipeApplication.d = true;
				ir.c(d, s);
			}
		}
		ui.a(new Runnable() {

			final List a;
			final js b;

			public void run() {
				oe.c();
				if (!a.isEmpty()) {
					ArrayList arraylist = new ArrayList(1);
					arraylist.add(a.get(0));
					oe.a(false, new ArrayList(arraylist));
				}
			}

			{
				b = js.this;
				a = (List) obj;
				// super();
			}
		});
	}

	// private void c(String paramString) {
	// this.a.b(paramString);
	// PackageManager localPackageManager = this.d.getPackageManager();
	// List localList = localPackageManager.queryIntentActivities(
	// vk.a(paramString), 0);
	// if (localList.size() > 0) {
	// }
	// ResolveInfo localResolveInfo;
	// jq localjq2;
	// synchronized (e) {
	// Iterator localIterator = localList.iterator();
	// if (localIterator.hasNext()) {
	// localResolveInfo = (ResolveInfo) localIterator.next();
	// ComponentName localComponentName = vk.a(localResolveInfo);
	// jq localjq1 = (jq) this.h.get(localComponentName);
	// if (localjq1 != null) {
	// localjq1.a(localPackageManager, localResolveInfo);
	// localjq1.i = vk.b(localResolveInfo);
	// }
	// }
	// }
	// }
	private void c(String s) {
		Object obj;
		List list;
		a.b(s);
		obj = d.getPackageManager();
		Iterator iterator = null;
		list = ((PackageManager) (obj)).queryIntentActivities(vk.a(s), 0);
		if (list.size() > 0) {
			s = ((String) (e));

			iterator = list.iterator();

		}

		Object obj1 = null;
		Object obj2 = null;
		jq qqq = null;
		if (iterator.hasNext()) {
			obj1 = (ResolveInfo) iterator.next();
			obj2 = vk.a(((ResolveInfo) (obj1)));
			qqq = (jq) h.get(obj2);
		}

		if (obj2 != null) {
			((jq) (qqq)).a(((PackageManager) (obj)), ((ResolveInfo) (obj1)));
			qqq.i = vk.b(((ResolveInfo) (obj1)));
		}

		final jq jq1 = new jq(((PackageManager) (obj)), ((ResolveInfo) (obj1)));
		a(((jq) (jq1)));
		ui.a(new Runnable() {

			final jq a;
			final js b;

			public void run() {
				jt.a(js.a(b), a);
			}

			{
				b = js.this;
				a = jq1;
				// super();
			}
		});
		// goto _L1

		list.clear();

		d(s);
		return;
	}

	// private void d(String string) {
	// Object object;
	// this.a.a(string);
	// ol ol = null;
	// ol = ol.a(this.d);
	// if (ol != null) {
	// ol.a(ki.a);
	// }
	// Object object2 = object = e;
	// synchronized (object2) {
	// int n = -1 + this.f.size();
	// do {
	// if (n >= 0) {
	// final jq jq = (jq) this.f.get(n);
	// if (jq.h.getPackageName().equals((Object) string)) {
	// this.f.remove(n);
	// this.h.remove((Object) jq.h);
	// this.g.remove((Object) jq);
	// if (jq.j != 0) {
	// jq.j = 0;
	// }
	// ui.a((Runnable) new Runnable() {
	//
	// public void run() {
	// jt.b(js.this.d, jq);
	// }
	// });
	// }
	// } else {
	// int n2;
	// int n3;
	// String string2;
	//
	// SharedPreferences sharedPreferences = ir.a(this.d);
	// String string3 = sharedPreferences.getString(
	// "key_notification_apps_selected", null);
	// if (!(TextUtils.isEmpty((CharSequence) string3) || (n3 = string3
	// .indexOf(string)) < 0)) {
	// this.a(string, sharedPreferences, string3, n3,
	// "key_notification_apps_selected");
	// }
	// if (!(TextUtils
	// .isEmpty((CharSequence) (string2 = sharedPreferences
	// .getString("key_white_list", null))) || (n2 = string2
	// .indexOf(string)) < 0)) {
	// this.a(string, sharedPreferences, string2, n2,
	// "key_white_list");
	// }
	// if (SwipeApplication.d && ir.J(this.d) == 104
	// && string.equals((Object) ir.z(this.d))) {
	// SwipeApplication.d = false;
	// }
	// ui.a((Runnable) new Runnable() {
	//
	// public void run() {
	// oe.c();
	// }
	// });
	// return;
	// }
	// --n;
	// } while (true);
	// }
	// }

	private void d(String s) {
		a.a(s);
		ol ol1 = ol.a(d);
		if (ol1 != null) {
			ol1.a(ki.a);
		}
		Object obj = e;

		jqq = null;
		int i = f.size() - 1;
		// _L2:
		if (i > 0) {
			jqq = (jq) f.get(i);

		}

		if (jqq.h.getPackageName().equals(s)) {
			f.remove(i);
			h.remove(jqq.h);
			g.remove(jqq);
			if (jqq.j != 0) {
				jqq.j = 0;
			}
			ui.a(new Runnable() {

				final jq a;
				final js b;

				public void run() {
					jt.b(js.a(b), a);
				}

				{
					b = js.this;
					a = jqq;
					// super();
				}
			});
		}

		obj = ir.a(d);
		String s1 = ((SharedPreferences) (obj)).getString(
				"key_notification_apps_selected", null);
		if (!TextUtils.isEmpty(s1)) {
			i = s1.indexOf(s);
			if (i >= 0) {
				a(s, ((SharedPreferences) (obj)), s1, i,
						"key_notification_apps_selected");
			}
		}
		s1 = ((SharedPreferences) (obj)).getString("key_white_list", null);
		if (!TextUtils.isEmpty(s1)) {
			i = s1.indexOf(s);
			if (i >= 0) {
				a(s, ((SharedPreferences) (obj)), s1, i, "key_white_list");
			}
		}
		if (SwipeApplication.d && ir.J(d) == 104 && s.equals(ir.z(d))) {
			SwipeApplication.d = false;
		}
		ui.a(new Runnable() {

			final js a;

			public void run() {
				oe.c();
			}

			{
				a = js.this;

			}
		});
		return;

	}

	public ArrayList a() {
		synchronized (e) {
			ArrayList localArrayList = new ArrayList(this.f);
			return localArrayList;
		}
	}

	static Object f() {
		return e;
	}

	public List a(int var1_1) {
		ArrayList var14_11 = null;
		StringBuilder var2_2 = new StringBuilder()
				.append("called_num DESC, label");
		String var3_3 = var1_1 > 0 ? " LIMIT " + var1_1 : "";
		String var4_4 = var2_2.append(var3_3).toString();
		ContentResolver var9_5 = this.d.getContentResolver();
		Uri var10_6 = ki.a;
		String[] var11_7 = new String[] { vd.b, vd.b };
		Cursor var8_9 = var9_5.query(var10_6, null,
				"uninstalled=? AND called_num>?", var11_7, var4_4);
		Cursor var12_8 = var8_9;
		try {
			kj var13_10 = new kj(var8_9);
			var14_11 = new ArrayList(var8_9.getCount());
			while (var8_9.moveToNext()) {
				ComponentName var15_12 = ComponentName
						.unflattenFromString((String) var8_9
								.getString(var13_10.b));
				jq var16_13 = (jq) this.h.get((Object) var15_12);
				if (var16_13 == null) {
					var16_13 = new jq(var8_9, var13_10);
				}
				var14_11.add((Object) var16_13);
			}

			if (var8_9 == null)
				return var14_11;
			var8_9.close();
		} catch (Throwable var7_20) {
			var8_9 = null;

		}

		return var14_11;
	}

	public jq a(ComponentName componentname) {
		jq jq = null;
		if (componentname == null) {
			return null;
		}
		synchronized (e) {
			jq = (jq) h.get(componentname);
		}
		return jq;

	}

	// public jq a(String s) {
	// jq jq1 = null;
	// Object obj = e;
	//
	// Iterator iterator = h.entrySet().iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
	// if (((ComponentName) entry.getKey()).getPackageName().equals(s)) {
	// jq1 = (jq) entry.getValue();
	// break;
	// }
	// } while (true);
	// return jq1;
	//
	// }
//	public jq a(String s) {
//		jq jq1 = null;
//		Object obj = e;
//
//		Iterator iterator = h.entrySet().iterator();
//		do {
//			if (iterator.hasNext()) {
//				java.util.Map.Entry entry = (java.util.Map.Entry) iterator
//						.next();
//				if (((ComponentName) entry.getKey()).getPackageName().equals(s)) {
//					jq1 = (jq) entry.getValue();
//				} else {
//					return jq1;
//				}
//			}
//
//		} while (true);
//
//	}
	public jq a(String s)
    {
        jq jq1 = null;
        Object obj = e;
       
        Iterator iterator = h.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((ComponentName)entry.getKey()).getPackageName().equals(s))
            {
                jq1 = (jq)entry.getValue();
            }
        } while (true);
        
        return jq1;
       
    }
	public void a(Context context) {
		IntentFilter intentfilter = new IntentFilter(
				"android.intent.action.PACKAGE_ADDED");
		intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
		intentfilter.addDataScheme("package");
		context.registerReceiver(this, intentfilter);
		context.registerReceiver(this, new IntentFilter(
				"android.intent.action.LOCALE_CHANGED"));
		intentfilter = new IntentFilter();
		intentfilter
				.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
		intentfilter
				.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
		context.registerReceiver(this, intentfilter);
	}

	protected void a(Intent var1_1, String var2_2) {
		int var3_3 = 1;
		int var6_6 = -1;
		;
		String var4_4 = var1_1.getData().getSchemeSpecificPart();
		boolean var5_5 = var1_1.getBooleanExtra(
				"android.intent.extra.REPLACING", false);
		switch (var2_2.hashCode()) {
		case 1544582882: {
			if (!var2_2.equals((Object) "android.intent.action.PACKAGE_ADDED"))
				break;

		}
		case 525384130: {
			if (!var2_2
					.equals((Object) "android.intent.action.PACKAGE_REMOVED"))

				var6_6 = var3_3;
			break;

		}
		case -810471698: {
			if (!var2_2
					.equals((Object) "android.intent.action.PACKAGE_REPLACED"))

				var6_6 = 2;
			break;
		}
		}

		switch (var6_6) {
		default: {
			return;
		}
		case 0: {
			if (!var5_5) {
				var3_3 = 0;
				break;
			} else {

			}
		}
		case 1: {
			if (var5_5 != false)
				return;
			var3_3 = 2;
		}

		case 2:

			if (var3_3 == -1) {
				return;
			}
		}
		switch (var3_3) {
		default: {
			return;
		}
		case 0: {
			this.b(var4_4);
			return;
		}
		case 1: {
			this.c(var4_4);
			return;
		}
		case 2:

			this.d(var4_4);
		}
	}

	public void a(jq paramjq) {
		a(paramjq, false);
	}

	// public void a(jq paramjq, boolean paramBoolean) {
	// synchronized (e) {
	// jq localjq = (jq) this.h.get(paramjq.h);
	// if ((localjq == null) || (paramBoolean)) {
	// if (localjq != null) {
	// this.f.remove(localjq);
	// }
	// this.f.add(paramjq);
	// this.h.put(paramjq.h, paramjq);
	// if (this.a.a(paramjq.h)) {
	// if (localjq != null) {
	// this.g.remove(localjq);
	// }
	// this.g.add(paramjq);
	// }
	// }
	// }
	// }
	public void a(jq jq1, boolean flag) {
		Object obj = e;

		jq jq2 = (jq) h.get(jq1.h);
		if (jq2 == null || flag) {

		}

		if (jq2 != null) {
			f.remove(jq2);
		}

		f.add(jq1);
		h.put(jq1.h, jq1);
		if (a.a(jq1.h)) {
			if (jq2 != null) {
				g.remove(jq2);
			}
		}

		g.add(jq1);

		return;

	}

	public void a(boolean paramBoolean) {
		this.b = false;
		new Thread(new jr(this.d, this, paramBoolean)).start();
	}

	public List b() {
		String var1_1 = null;
		ArrayList var2_2 = new ArrayList();
		ContentResolver var6_3 = SwipeApplication.e().getContentResolver();
		Uri var7_4 = ki.a;
		String[] var8_5 = new String[] { "DISTINCT package" };
		String[] var9_6 = new String[] { vd.b };
		Cursor var4_8 = var6_3.query(var7_4, var8_5, "uninstalled=?", var9_6,
				null);
		Cursor var10_7 = var4_8;
		try {
			while (var4_8.moveToNext()) {
				var2_2.add((Object) var4_8.getString(0));
			}
		} catch (Exception var12_9) {
			if (var4_8 == null)
				return var2_2;
			var4_8.close();
			return var2_2;
		}
		if (var4_8 == null)
			return var2_2;
		var4_8.close();
		return var2_2;

	}

	public List b(int var1_1) {
		String var2_2 = null;
		ContentResolver var7_3 = this.d.getContentResolver();
		Uri var8_4 = ki.a;
		String[] var9_5 = new String[] { "DISTINCT package" };
		String[] var10_6 = new String[] { vd.b, "com.lazyswipe.zev" };
		StringBuilder var11_7 = new StringBuilder()
				.append("last_called_time DESC");
		String var12_8 = var1_1 > 0 ? " LIMIT " + var1_1 : "";
		Cursor var13_9 = var7_3.query(var8_4, var9_5,
				"uninstalled=? AND package<>?", var10_6, var11_7
						.append(var12_8).toString());
		try {
			ArrayList var5_10 = new ArrayList(var13_9.getCount());
			while (var13_9.moveToNext()) {
				var5_10.add((Object) var13_9.getString(0));
			}
			if (var13_9 == null)
				return var5_10;
			var13_9.close();
			return var5_10;
		} catch (Throwable var14_11) {
			Cursor var4_12 = var13_9;
			if (var4_12 == null)
				return Collections.EMPTY_LIST;
			var4_12.close();
			return Collections.EMPTY_LIST;
		}

	}

	public void b(ComponentName componentName) {
		if (!this.a.a(componentName)) {
			return;
		}
		jq jq = this.a(componentName);
		if (jq == null) {
			vj.b("Swipe.AppModel",
					"App info NOT found! Try looking up according to package name only: "
							+ (Object) componentName);
			jq = this.a(componentName.getPackageName());
			if (jq == null) {
				vj.b("Swipe.AppModel", "App info NOT found: "
						+ (Object) componentName);
				return;
			}
		}
		if (!jq.a()) {
			jq.f = 1 + jq.f;
		}
		jq.e = System.currentTimeMillis();
		this.c(jq);
	}

	public void b(Context paramContext) {
		paramContext.unregisterReceiver(this);
	}

	protected void b(Intent intent, String s) {
		String[] string = intent
				.getStringArrayExtra("android.intent.extra.changed_package_list");
		int i;
		int j;
		ContentValues values;
		if (s.equals("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE")) {
			i = 1;
		} else {
			i = -1;
		}
		values = new ContentValues(1);
		values.put("on_sdcard", Integer.valueOf(i));
		j = string.length;
		for (i = 0; i < j; i++) {
			ui.a(new Runnable() {

				String a;
				ContentValues b;
				js c;

				public void run() {
					Cursor cursor = null;
					String as[] = new String[1];
					as[0] = a;
					Throwable throwable;
					Object obj;
					Exception exception;
					kj kj1;
					try {
						js.a(c).getContentResolver()
								.update(ki.a, b, "package=?", as);
					} catch (Throwable throwable1) {
					}
					obj = js.a(c).getContentResolver()
							.query(ki.a, null, "package=?", as, null);
					cursor = ((Cursor) (obj));
					kj1 = new kj(cursor);
					if (!cursor.moveToNext()) {

						cursor.close();
						return;

					} else {

						obj = c.a(ComponentName.unflattenFromString(cursor
								.getString(kj1.b)));
						if (obj == null) {
							obj = new jq(cursor, kj1);
							((jq) (obj)).a(js.a(c), false);
							c.a(((jq) (obj)), true);

						} else {

							obj = cursor.getInt(kj1.f);

						}
					}

				}
			});
		}

	}

	public void b(jq paramjq) {
		paramjq.f = -1;
		c(paramjq);
	}

	public ArrayList c() {
		synchronized (e) {
			ArrayList localArrayList = new ArrayList(this.g);
			return localArrayList;
		}
	}

	protected void c(final Context context) {
		vj.a("Swipe.AppModel", "System locale changed");
		vk.a = Collator.getInstance();
		ui.a((Runnable) new Runnable() {
			Context a;

			/*
			 * Loose catch block Enabled aggressive block sorting Enabled
			 * unnecessary exception pruning Converted monitor instructions to
			 * comments Lifted jumps to return sites
			 */
			public void run() {
				Object object;
				vj.a("Swipe.AppModel", "Refreshing app labels...");
				pq.b();
				PackageManager packageManager = context.getPackageManager();
				Object object2 = object = e;
				// MONITORENTER : object2
				Iterator iterator = js.this.f.iterator();
				int n = 0;
				do {
					if (iterator.hasNext()) {
						jq jq = (jq) iterator.next();
						try {
							jq.a(packageManager,
									packageManager.getActivityInfo(jq.h, 0));
						} catch (NameNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						jt.c(js.this.d, jq);
					} else {
						// MONITOREXIT : object2
						if (n != 0)
							return;
						vj.a("Swipe.AppModel",
								"Locale changed but we don't have any applications loaded!");
						Iterator iterator2 = packageManager
								.queryIntentActivities(vk.c(), 0).iterator();
						while (iterator2.hasNext()) {
							ResolveInfo resolveInfo = (ResolveInfo) iterator2
									.next();
							ComponentName componentName = vk.a(resolveInfo);
							jt.a(js.this.d, resolveInfo, componentName);
						}
						return;

					}
					++n;
				} while (true);
			}
		});
	}

	// public void c(final jq jq) {
	// ui.a((Runnable) new Runnable() {
	//
	// public void run() {
	// jt.d(js.this.d, jq);
	// }
	// });
	// }
	public void c(final jq jq1) {
		ui.a(new Runnable() {

			final jq a;
			final js b;

			public void run() {
				jt.d(js.a(b), a);
			}

			{
				b = js.this;
				a = jq1;
				// super();
			}
		});
	}

	public List d() {
		return b(0);
	}

	public void e() {
		new Thread(new jr(this.d, this)).start();
	}

	public void onReceive(Context paramContext, Intent paramIntent) {
		String str = paramIntent.getAction();
		int i = -1;
		switch (str.hashCode()) {
		default:
			switch (i) {
			}
			break;
		}
		i = 5;

		if (!str.equals("android.intent.action.LOCALE_CHANGED")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
		}
		i = 0;
		// break;
		if (!str.equals("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
			return;
			// break;
		}
		i = 1;
		// ;
		if (!str.equals("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
		}
		i = 2;
		// break;
		if (!str.equals("android.intent.action.PACKAGE_ADDED")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
		}
		i = 3;
		// break;
		if (!str.equals("android.intent.action.PACKAGE_REMOVED")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
		}
		i = 4;
		// break;
		if (!str.equals("android.intent.action.PACKAGE_REPLACED")) {
			switch (i) {
			default:
				return;

			case 0: // '\0'
				c(paramContext);
				return;

			case 1: // '\001'
			case 2: // '\002'
				b(paramIntent, str);
				return;

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				a(paramIntent, str);
				break;
			}
		}

		// break;
		// c(paramContext);
		// continue;
		// b(paramIntent, str);
		// continue;
		// a(paramIntent, str);
	}

}
