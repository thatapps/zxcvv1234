package com.main;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

public class jr implements Runnable {
	private static final String[] e;
	private final Context a;
	private final js b;
	private boolean c;
	private boolean d;

	static {
		String[] arrayOfString = new String[9];
		arrayOfString[0] = "com.android.contacts";
		arrayOfString[1] = "com.android.mms";
		arrayOfString[2] = "com.android.gallery3d";
		arrayOfString[3] = "com.android.gallery";
		arrayOfString[4] = "com.android.music";
		arrayOfString[5] = "com.google.android.music";
		arrayOfString[6] = "com.android.deskclock";
		arrayOfString[7] = "com.google.android.deskclock";
		arrayOfString[8] = "com.android.calculator2";
		e = arrayOfString;
	}

	public jr(Context paramContext, js paramjs) {
		this(paramContext, paramjs, false);
	}

	public jr(Context paramContext, js paramjs, boolean paramBoolean) {
		this.a = paramContext;
		this.b = paramjs;
		this.c = paramBoolean;
	}

	private String a(int i, Set set) {
		Cursor cursor = null;
		Object obj;
		String str = "";
		String s = "";
		str = kh.a(Locale.getDefault(), i);
		cursor = a.getContentResolver().query(kb.a, new String[] { "package" },
				str, null, "_ID ASC LIMIT 1");

		if (cursor == null && cursor.getCount() == 0) {
			ub.a(cursor);
			return null;
		}
		obj = cursor;
		i = cursor.getColumnIndex("package");

		try {
			s = cursor.getString(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		boolean flag = set.contains(s);
		if (flag) {
			set.add(s);
		} else {
			set = null;
		}

		ub.a(cursor);
		return s;

	}

	private Map a() {
		// var1_1 = null;
		HashMap var2_2 = new HashMap();
		ContentResolver var6_3 = this.a.getContentResolver();
		Uri var7_4 = ki.a;
		String[] var8_5 = new String[] { vd.b };
		Cursor var4_7 = var6_3.query(var7_4, null, "uninstalled=?", var8_5,
				null);
		Cursor var9_6 = var4_7;
		try {
			kj var10_8 = new kj(var4_7);
			while (var4_7.moveToNext()) {
				jq var13_9 = new jq(var4_7, var10_8);
				var2_2.put((Object) var13_9.h, (Object) var13_9);
				if (Build.VERSION.SDK_INT < 21 || this.d || var13_9.f <= 0)
					this.d = true;
			}
		} catch (Exception var12_10) 
		{
			do {
				ub.a(var4_7);
				return var2_2;
				// break;
			} while (true);
		}
		ub.a(var4_7);
		return var2_2;

	}

	private void a(String paramString, Set paramSet) {
		if (paramString != null) {
			paramSet.add(paramString);
		}
	}

	private void a(List list, Set set, int n) {
		if (list == null)
			return;
		if (set == null) {
			return;
		}
		Iterator iterator = list.iterator();
		int n2 = 0;
		while (iterator.hasNext()) {
			int n3;
			String string = (String) iterator.next();
			if (!set.contains((Object) string)) {
				set.add((Object) string);
				n3 = n2 + 1;
				if (n3 >= n)
					return;
			} else {
				n3 = n2;
			}
			n2 = n3;
		}
	}

	private void a(Set paramSet) {
		System.currentTimeMillis();
		String str1 = a(0, paramSet);
		String str2 = a(1, paramSet);
		String str3 = a(2, paramSet);
		String str4 = a(3, paramSet);
		String str5 = a(4, paramSet);
		List localList1 = b(0, paramSet);
		List localList2 = b(1, paramSet);
		List localList3 = b(2, paramSet);
		List localList4 = b(3, paramSet);
		List localList5 = b(4, paramSet);
		HashSet localHashSet = new HashSet(8);
		a(str1, localHashSet);
		a(str2, localHashSet);
		a(str3, localHashSet);
		a(str4, localHashSet);
		a(str5, localHashSet);
		a(localList1, localHashSet, 4);
		a(localList2, localHashSet, 1);
		a(localList3, localHashSet, 1);
		a(localList4, localHashSet, 1);
		a(localList5, localHashSet, 1);
		try {
			StringBuilder localStringBuilder = new StringBuilder();
			Iterator localIterator = localHashSet.iterator();
			while (localIterator.hasNext()) {
				String str6 = (String) localIterator.next();
				if (localStringBuilder.length() > 0) {
					localStringBuilder.append(",");
				}
				localStringBuilder.append("'").append(str6).append("'");
				jq localjq = this.b.a(str6);
				if (localjq != null) {
					localjq.f = 20;
				}
			}
			ContentValues localContentValues = new ContentValues(1);
			localContentValues.put("called_num", Integer.valueOf(20));
			this.a.getContentResolver()
					.update(ki.a,
							localContentValues,
							"package IN  (" + localStringBuilder.toString()
									+ ")", null);
		} catch (Throwable localThrowable) {
		}
	}

	private List b(int i, Set set) {
		Object obj;
		Object obj1;
		String s;
		Cursor cursor = null;
		obj1 = null;
		s = null;
		obj = obj1;
		String s1 = kh.a(Locale.getDefault(), i);
		obj = obj1;
		cursor = a.getContentResolver().query(kh.a, new String[] { "package" },
				s1, null, null);
		if (cursor == null) {
			ub.a(((Cursor) (cursor)));
			return null;
		}

		vj.b("Swipe.AppLoader", "fail in loadFavoriteApps()."
				);

		//ub.a((InputStream) set);

		ArrayList list = new ArrayList(((Cursor) (cursor)).getCount());
		i = cursor.getColumnIndex("package");
		do {
			if (!((Cursor) (cursor)).moveToNext()) {
				break;
			}
			s = ((Cursor) (cursor)).getString(i);
			if (set.contains(s)) {
				(list).add(s);
			}
		} while (true);
		ub.a(((Cursor) (cursor)));
		return list;

	}

	public void run() {
		Bundle bundle;
		int i;
		boolean flag;
		flag = false;
		b.c = true;
		Map map = a();
		List list;
		HashSet hashset;
		ArrayList arraylist;
		ArrayList arraylist1;
		PackageManager packagemanager;
		boolean flag1;
		if (map.size() <= 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		packagemanager = a.getPackageManager();
		list = packagemanager.queryIntentActivities(vk.c(), 0);
		hashset = new HashSet(list.size());
		arraylist = new ArrayList(list.size());
		arraylist1 = new ArrayList(list.size());
		jq jq1;
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext(); b
				.a(jq1)) {
			ResolveInfo resolveinfo = (ResolveInfo) iterator2.next();
			ComponentName componentname = vk.a(resolveinfo);
			hashset.add(componentname.getPackageName());
			jq jq2 = (jq) map.remove(componentname);
			jq1 = jq2;
			if (jq2 == null) {
				jq1 = new jq();
				arraylist.add(jq1);
				jq1.h = componentname;
			}
			jq1.i = vk.b(resolveinfo);
			jq1.a(packagemanager, resolveinfo, c);
		}

		b.b = true;
		b.c = false;
		oe.c();
		oe.a(flag1, new ArrayList(arraylist));
		arraylist1.addAll(map.values());
		jq jq3;
		for (Iterator iterator = arraylist1.iterator(); iterator.hasNext(); jt
				.b(a, jq3)) {
			jq3 = (jq) iterator.next();
		}

		jq jq4;
		for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); jt
				.a(a, jq4)) {
			jq4 = (jq) iterator1.next();
		}

		map.clear();
		list.clear();
		arraylist.clear();
		arraylist1.clear();
		if (!flag1) {
			// break MISSING_BLOCK_LABEL_541;
		}
		a(hashset);
		bundle = new Bundle(2);
		Set set = vk.b(a);
		int j = set.size();
		i = ((flag) ? 1 : 0);
		if (j <= 0) {
			// break MISSING_BLOCK_LABEL_461;
		}
		bundle.putStringArray("extra_param_1",
				(String[]) set.toArray(new String[j]));
		bundle.putInt("extra_param_2", 1);
		a.getContentResolver().call(ki.a, "initFavorites", null, bundle);
		i = ((flag) ? 1 : 0);
		// _L1:
		while (i < e.length) {
			jq jq5 = b.a(e[i]);
			if (jq5 != null && (jq5).f <= 0) {
				jq5.f = 10 - i;
				b.c((jq5));
			}
			i++;
		}
		// break MISSING_BLOCK_LABEL_541;

		vj.b("Swipe.AppLoader",
				"Exception in method call of Provider" + this.getClass());
		i = ((flag) ? 1 : 0);
		// goto _L1
	}

}