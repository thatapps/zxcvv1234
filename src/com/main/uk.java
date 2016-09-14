package com.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;

import com.lazyswipe.notification.AppNotification$Action;

public class uk {

	public static final String a;
	public static final String b;
	public static final String c;
	public static final String d;
	public static final String e;
	private static boolean f = false;
	private static ul g;

	public static String a(Notification notification) {
		Intent intent = null;
		Bundle bundle = null;
		if (notification.contentIntent != null) {
			if ((intent = vk.a(notification.contentIntent)) != null
					&& (bundle = intent.getExtras()) != null) {
				return bundle.getString("jid");
			}
		}
		return null;
	}

	private static HashMap a(RemoteViews remoteviews) {
		Object obj;
		HashMap hashmap;
		hashmap = new HashMap();
		Iterator iterator = null;
		obj = null;
		Object obj1 = null;
		try {
			obj1 = android.widget.RemoteViews.class
					.getDeclaredField("mActions");
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (obj1 != null) {
			((Field) (obj1)).setAccessible(true);

		}

		try {
			obj = (ArrayList) ((Field) (obj1)).get(remoteviews);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (obj == null) {

		}
		iterator = ((ArrayList) (obj)).iterator();

		int i;
		do {
			do {
				if (iterator.hasNext()) {
					obj1 = (Parcelable) iterator.next();
					obj = Parcel.obtain();
					((Parcelable) (obj1)).writeToParcel(((Parcel) (obj)), 0);
					((Parcel) (obj)).setDataPosition(0);
				}

			} while (((Parcel) (obj)).readInt() != 2);
			i = ((Parcel) (obj)).readInt();
			obj1 = ((Parcel) (obj)).readString();
		} while (obj1 == null);
		if (((String) (obj1)).equals("setText")) {
			((Parcel) (obj)).readInt();
			hashmap.put(Integer.valueOf(i),
					(CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR
							.createFromParcel(((Parcel) (obj))));
		}
		((Parcel) (obj)).recycle();

		// Log.e("Swipe.NotificationUtils",
		// "Failed to load the notification settings.", remoteviews);
		return hashmap;
	}

	public static void a(Context context) {
		if (g == null) {
			g = new ul(context);
		}
	}

	public static void a(Context context, int i) {
		NotificationManager notificationManager = b(context);
		if (notificationManager != null) {
			notificationManager.cancel(i);
		}
	}

	public static void a(Context context, int i, Notification notification) {
		if (notification != null) {
			NotificationManager notificationManager = b(context);
			if (notificationManager != null && !f) {
				notificationManager.notify(i, notification);
			}
		}
	}

	public static void a(Context context, Notification notification, pi pi1) {
		a(context, notification.contentView, pi1);
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			a(context, e(notification), pi1);
		}
	}

	// private static void a(Context var0, RemoteViews var1, pi var2) {
	// ul var7 = g;
	// if (var7 != null) {
	// CharSequence var4 = null;
	// var0 = null;
	// CharSequence var3 = null;
	// ArrayList var6 = new ArrayList();
	// HashMap var8 = a((RemoteViews) var1);
	// CharSequence var11 = null;
	// Object var13;
	// if (var8.size() > 0) {
	// CharSequence var10;
	// if (var8.containsKey(Integer.valueOf(var7.i))) {
	// var10 = (CharSequence) var8.get(Integer.valueOf(var7.i));
	// } else if (var8.containsKey(Integer.valueOf(var7.c))) {
	// var10 = (CharSequence) var8.get(Integer.valueOf(var7.c));
	// } else if (var8.containsKey(Integer.valueOf(0x7f09002b))) {
	// var10 = (CharSequence) var8
	// .get(Integer.valueOf(0x7f09002b));
	// } else if (var8.containsKey(Integer.valueOf(0x7f06008f))) {
	// var10 = (CharSequence) var8
	// .get(Integer.valueOf(0x7f06008f));
	// } else {
	// var10 = null;
	// }
	//
	// var11 = var3;
	// if (var8.containsKey(Integer.valueOf(0x7f0d0017))) {
	// var11 = (CharSequence) var8
	// .get(Integer.valueOf(0x7f0d0017));
	// }
	//
	// if (var8.containsKey(Integer.valueOf(0x7f0d0019))) {
	// var10 = (CharSequence) var8
	// .get(Integer.valueOf(0x7f0d0019));
	// }
	//
	// if (var8.containsKey(Integer.valueOf(0x7f0d0005))) {
	// var11 = (CharSequence) var8
	// .get(Integer.valueOf(0x7f0d0005));
	// }
	//
	// var3 = var10;
	// if (var8.containsKey(Integer.valueOf(0x7f0d0101))) {
	// var3 = (CharSequence) var8.get(Integer.valueOf(0x7f0d0101));
	// }
	//
	// if (var8.containsKey(Integer.valueOf(var7.b))) {
	// var10 = (CharSequence) var8.get(Integer.valueOf(var7.b));
	// } else if (var8.containsKey(Integer.valueOf(var7.g))) {
	// var10 = (CharSequence) var8.get(Integer.valueOf(var7.g));
	// } else {
	// var10 = var11;
	// if (var8.containsKey(Integer.valueOf(var7.j))) {
	// var10 = (CharSequence) var8
	// .get(Integer.valueOf(var7.j));
	// }
	// }
	//
	// ArrayList var9 = new ArrayList();
	// var11 = var4;
	// CharSequence var5;
	// if (var8.containsKey(Integer.valueOf(var7.k))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.k));
	// var11 = var4;
	// if (!TextUtils.isEmpty(var5)) {
	// var9.add(var5);
	// var11 = var5;
	// }
	// }
	//
	// var4 = var11;
	// if (var8.containsKey(Integer.valueOf(var7.l))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.l));
	// var4 = var11;
	// if (!TextUtils.isEmpty(var5)) {
	// var4 = TextUtils.concat(new CharSequence[] { var11,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var11 = var4;
	// if (var8.containsKey(Integer.valueOf(var7.m))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.m));
	// var11 = var4;
	// if (!TextUtils.isEmpty(var5)) {
	// var11 = TextUtils.concat(new CharSequence[] { var4,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var4 = var11;
	// if (var8.containsKey(Integer.valueOf(var7.n))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.n));
	// var4 = var11;
	// if (!TextUtils.isEmpty(var5)) {
	// var4 = TextUtils.concat(new CharSequence[] { var11,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var11 = var4;
	// if (var8.containsKey(Integer.valueOf(var7.o))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.o));
	// var11 = var4;
	// if (!TextUtils.isEmpty(var5)) {
	// var11 = TextUtils.concat(new CharSequence[] { var4,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var4 = var11;
	// if (var8.containsKey(Integer.valueOf(var7.p))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.p));
	// var4 = var11;
	// if (!TextUtils.isEmpty(var5)) {
	// var4 = TextUtils.concat(new CharSequence[] { var11,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var11 = var4;
	// if (var8.containsKey(Integer.valueOf(var7.q))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.q));
	// var11 = var4;
	// if (!TextUtils.isEmpty(var5)) {
	// var11 = TextUtils.concat(new CharSequence[] { var4,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var4 = var11;
	// if (var8.containsKey(Integer.valueOf(var7.r))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.r));
	// var4 = var11;
	// if (!TextUtils.isEmpty(var5)) {
	// var4 = TextUtils.concat(new CharSequence[] { var11,
	// "\n", var5 });
	// var9.add(var5);
	// }
	// }
	//
	// var5 = var4;
	// if (var8.containsKey(Integer.valueOf(var7.s))) {
	// var11 = (CharSequence) var8.get(Integer.valueOf(var7.s));
	// var5 = var4;
	// if (!TextUtils.isEmpty(var11)) {
	// var5 = TextUtils.concat(new CharSequence[] { var4,
	// "\n", var11 });
	// var9.add(var11);
	// }
	// }
	//
	// var11 = var5;
	// if (var8.containsKey(Integer.valueOf(var7.t))) {
	// var4 = (CharSequence) var8.get(Integer.valueOf(var7.t));
	// var11 = var5;
	// if (!TextUtils.isEmpty(var4)) {
	// var11 = TextUtils.concat(new CharSequence[] { var5,
	// "\n", var4 });
	// var9.add(var4);
	// }
	// }
	//
	// if (TextUtils.isEmpty(var3)) {
	// var6.addAll(var9);
	// var4 = null;
	// var3 = var11;
	// } else {
	// var6.add(var3);
	// var4 = var11;
	// }
	//
	// Object var15 = var4;
	// if (var8.containsKey(Integer.valueOf(var7.e))) {
	// var5 = (CharSequence) var8.get(Integer.valueOf(var7.e));
	// var15 = var4;
	// if (!TextUtils.isEmpty(var5)) {
	// if (var4 == null) {
	// var15 = var5;
	// } else {
	// var15 = var4 + "\n" + var5;
	// }
	// }
	// }
	//
	// Object var14 = var15;
	// Object var16 = var3;
	// if (TextUtils.isEmpty(var3)) {
	// var14 = var15;
	// var16 = var3;
	// if (!TextUtils.isEmpty((CharSequence) var15)) {
	// var6.add(var15);
	// var14 = null;
	// var16 = var15;
	// }
	// }
	//
	// var11 = var10;
	// var13 = var16;
	// if (!TextUtils.isEmpty((CharSequence) var16)) {
	// var11 = var10;
	// var13 = var16;
	// if (!TextUtils.isEmpty((CharSequence) var14)) {
	// var11 = var10;
	// var13 = var16;
	// if (var16.equals(var14)) {
	// ;
	// }
	// }
	// }
	// } else {
	// var13 = null;
	// // var11 = var0;
	// }
	//
	// if (var11 != null) {
	// var2.d = var11.toString();
	// }
	//
	// if (var13 != null) {
	// var2.e = ((CharSequence) var13).toString();
	// }
	//
	// if (var6.size() > 0) {
	// ArrayList var12 = new ArrayList(var6.size());
	// Iterator var17 = var6.iterator();
	//
	// while (var17.hasNext()) {
	// var12.add(((CharSequence) var17.next()).toString());
	// }
	//
	// var2.g = var12;
	// return;
	// }
	// }
	//
	// }
	private static void a(Context context, RemoteViews remoteViews, pi pi) {
		CharSequence charSequence;
		CharSequence charSequence2;
		CharSequence charSequence3;
		CharSequence charSequence4;
		CharSequence charSequence5;
		CharSequence charSequence6;
		CharSequence charSequence7;
		CharSequence charSequence8;
		CharSequence charSequence9;
		Object object;
		CharSequence charSequence10;
		CharSequence charSequence11;
		ul ul = g;
		if (ul == null) {
			return;
		}
		ArrayList arrayList = new ArrayList();
		HashMap hashMap = uk.a(remoteViews);
		if (hashMap.size() <= 0) {
			return;
		}
		CharSequence charSequence12 = hashMap.containsKey((Object) ul.i) ? (CharSequence) hashMap
				.get((Object) ul.i)
				: (hashMap.containsKey((Object) ul.c) ? (CharSequence) hashMap
						.get((Object) ul.c)
						: (hashMap.containsKey((Object) 2131296299) ? (CharSequence) hashMap
								.get((Object) 2131296299)
								: (hashMap.containsKey((Object) 2131099791) ? (CharSequence) hashMap
										.get((Object) 2131099791) : null)));
		boolean bl = hashMap.containsKey((Object) 2131558423);
		CharSequence charSequence13 = null;
		if (bl) {
			charSequence13 = (CharSequence) hashMap.get((Object) 2131558423);
		}
		if (hashMap.containsKey((Object) 2131558425)) {
			charSequence12 = (CharSequence) hashMap.get((Object) 2131558425);
		}
		if (hashMap.containsKey((Object) 2131558405)) {
			charSequence13 = (CharSequence) hashMap.get((Object) 2131558405);
		}
		if (hashMap.containsKey((Object) 2131558657)) {
			charSequence12 = (CharSequence) hashMap.get((Object) 2131558657);
		}
		if (hashMap.containsKey((Object) ul.b)) {
			charSequence13 = (CharSequence) hashMap.get((Object) ul.b);
		} else if (hashMap.containsKey((Object) ul.g)) {
			charSequence13 = (CharSequence) hashMap.get((Object) ul.g);
		} else if (hashMap.containsKey((Object) ul.j)) {
			charSequence13 = (CharSequence) hashMap.get((Object) ul.j);
		}
		ArrayList arrayList2 = new ArrayList();
		boolean bl2 = hashMap.containsKey((Object) ul.k);
		CharSequence charSequence14 = null;
		if (bl2) {
			CharSequence charSequence15 = (CharSequence) hashMap
					.get((Object) ul.k);
			charSequence14 = null;
			if (charSequence15 != null) {
				boolean bl3 = charSequence15.equals((Object) "");
				charSequence14 = null;
				if (!bl3) {
					arrayList2.add((Object) charSequence15);
					charSequence14 = charSequence15;
				}
			}
		}
		if (hashMap.containsKey((Object) ul.l)
				&& (charSequence9 = (CharSequence) hashMap.get((Object) ul.l)) != null
				&& !charSequence9.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence9 });
			arrayList2.add((Object) charSequence9);
		}
		if (hashMap.containsKey((Object) ul.m)
				&& (charSequence11 = (CharSequence) hashMap.get((Object) ul.m)) != null
				&& !charSequence11.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence11 });
			arrayList2.add((Object) charSequence11);
		}
		if (hashMap.containsKey((Object) ul.n)
				&& (charSequence = (CharSequence) hashMap.get((Object) ul.n)) != null
				&& !charSequence.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence });
			arrayList2.add((Object) charSequence);
		}
		if (hashMap.containsKey((Object) ul.o)
				&& (charSequence4 = (CharSequence) hashMap.get((Object) ul.o)) != null
				&& !charSequence4.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence4 });
			arrayList2.add((Object) charSequence4);
		}
		if (hashMap.containsKey((Object) ul.p)
				&& (charSequence7 = (CharSequence) hashMap.get((Object) ul.p)) != null
				&& !charSequence7.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence7 });
			arrayList2.add((Object) charSequence7);
		}
		if (hashMap.containsKey((Object) ul.q)
				&& (charSequence2 = (CharSequence) hashMap.get((Object) ul.q)) != null
				&& !charSequence2.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence2 });
			arrayList2.add((Object) charSequence2);
		}
		if (hashMap.containsKey((Object) ul.r)
				&& (charSequence8 = (CharSequence) hashMap.get((Object) ul.r)) != null
				&& !charSequence8.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence8 });
			arrayList2.add((Object) charSequence8);
		}
		if (hashMap.containsKey((Object) ul.s)
				&& (charSequence3 = (CharSequence) hashMap.get((Object) ul.s)) != null
				&& !charSequence3.equals((Object) "")) {
			charSequence14 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence3 });
			arrayList2.add((Object) charSequence3);
		}
		if (hashMap.containsKey((Object) ul.t)
				&& (charSequence10 = (CharSequence) hashMap.get((Object) ul.t)) != null
				&& !charSequence10.equals((Object) "")) {
			CharSequence charSequence16 = TextUtils
					.concat((CharSequence[]) new CharSequence[] {
							charSequence14, "\n", charSequence10 });
			arrayList2.add((Object) charSequence10);
			charSequence5 = charSequence16;
		} else {
			charSequence5 = charSequence14;
		}
		if (charSequence12 == null || charSequence12.equals((Object) "")) {
			arrayList.addAll((Collection) arrayList2);
			object = null;
			charSequence12 = charSequence5;
		} else {
			arrayList.add((Object) charSequence12);
			object = charSequence5;
		}
		if (hashMap.containsKey((Object) ul.e)
				&& (charSequence6 = (CharSequence) hashMap.get((Object) ul.e)) != null
				&& !charSequence6.equals((Object) "")) {
			object = object == null ? charSequence6 : object + "\n"
					+ (Object) charSequence6;
		}
		if (TextUtils.isEmpty((CharSequence) charSequence12)
				&& !TextUtils.isEmpty((CharSequence) object)) {
			arrayList.add(object);
			charSequence12 = (CharSequence) object;
			object = null;
		}
		if (TextUtils.isEmpty((CharSequence) charSequence12)
				|| TextUtils.isEmpty((CharSequence) object)
				|| charSequence12.equals(object)) {
			// empty if block
		}
		if (charSequence13 != null) {
			pi.d = charSequence13;
		}
		if (charSequence12 == null)
			return;
		pi.e = charSequence12;
		pi.g = arrayList;
	}

	// private static void a(Context context, RemoteViews remoteviews, pi pi1) {
	// ul ul1 = g;
	// if (ul1 != null) {
	// Object obj1 = null;
	// context = null;
	// CharSequence charSequence = null;
	// Object obj = null;
	// ArrayList arraylist = new ArrayList();
	// HashMap hashmap = a(remoteviews);
	// if (hashmap.size() > 0) {
	// ArrayList arraylist1;
	// if (hashmap.containsKey(Integer.valueOf(ul1.i))) {
	// charSequence = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.i));
	// } else if (hashmap.containsKey(Integer.valueOf(ul1.c))) {
	// charSequence = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.c));
	// } else if (hashmap.containsKey(Integer.valueOf(0x7f09002b))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f09002b));
	// } else if (hashmap.containsKey(Integer.valueOf(0x7f06008f))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f06008f));
	// } else {
	// charSequence = null;
	// }
	// remoteviews = ((RemoteViews) (obj));
	// if (hashmap.containsKey(Integer.valueOf(0x7f0d0017))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f0d0017));
	// }
	// if (hashmap.containsKey(Integer.valueOf(0x7f0d0019))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f0d0019));
	// }
	// if (hashmap.containsKey(Integer.valueOf(0x7f0d0005))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f0d0005));
	// }
	// //obj = context;
	// if (hashmap.containsKey(Integer.valueOf(0x7f0d0101))) {
	// obj = (CharSequence) hashmap.get(Integer
	// .valueOf(0x7f0d0101));
	// }
	// if (hashmap.containsKey(Integer.valueOf(ul1.b))) {
	// charSequence = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.b));
	// } else if (hashmap.containsKey(Integer.valueOf(ul1.g))) {
	// charSequence = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.g));
	// } else {
	// //charSequence = remoteviews;
	// if (hashmap.containsKey(Integer.valueOf(ul1.j))) {
	// charSequence = (CharSequence) hashmap.get(Integer
	// .valueOf(ul1.j));
	// }
	// }
	// arraylist1 = new ArrayList();
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.k))) {
	// CharSequence charsequence = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.k));
	// remoteviews = ((RemoteViews) (obj1));
	// if (charsequence != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!charsequence.equals("")) {
	// arraylist1.add(charsequence);
	// charSequence = charsequence;
	// }
	// }
	// }
	// obj1 = remoteviews;
	// if (hashmap.containsKey(Integer.valueOf(ul1.l))) {
	// CharSequence charsequence1 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.l));
	// obj1 = remoteviews;
	// if (charsequence1 != null) {
	// obj1 = remoteviews;
	// if (!charsequence1.equals("")) {
	// obj1 = TextUtils.concat(new CharSequence[] {
	// remoteviews, "\n", charsequence1 });
	// arraylist1.add(charsequence1);
	// }
	// }
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.m))) {
	// CharSequence charsequence2 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.m));
	// remoteviews = ((RemoteViews) (obj1));
	// if (charsequence2 != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!charsequence2.equals("")) {
	// remoteviews = TextUtils.concat(new CharSequence[] {
	// obj1, "\n", charsequence2 });
	// arraylist1.add(charsequence2);
	// }
	// }
	// }
	// obj1 = remoteviews;
	// if (hashmap.containsKey(Integer.valueOf(ul1.n))) {
	// CharSequence charsequence3 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.n));
	// obj1 = remoteviews;
	// if (charsequence3 != null) {
	// obj1 = remoteviews;
	// if (!charsequence3.equals("")) {
	// obj1 = TextUtils.concat(new CharSequence[] {
	// remoteviews, "\n", charsequence3 });
	// arraylist1.add(charsequence3);
	// }
	// }
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.o))) {
	// CharSequence charsequence4 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.o));
	// remoteviews = ((RemoteViews) (obj1));
	// if (charsequence4 != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!charsequence4.equals("")) {
	// remoteviews = TextUtils.concat(new CharSequence[] {
	// obj1, "\n", charsequence4 });
	// arraylist1.add(charsequence4);
	// }
	// }
	// }
	// obj1 = remoteviews;
	// if (hashmap.containsKey(Integer.valueOf(ul1.p))) {
	// CharSequence charsequence5 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.p));
	// obj1 = remoteviews;
	// if (charsequence5 != null) {
	// obj1 = remoteviews;
	// if (!charsequence5.equals("")) {
	// obj1 = TextUtils.concat(new CharSequence[] {
	// remoteviews, "\n", charsequence5 });
	// arraylist1.add(charsequence5);
	// }
	// }
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.q))) {
	// CharSequence charsequence6 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.q));
	// remoteviews = ((RemoteViews) (obj1));
	// if (charsequence6 != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!charsequence6.equals("")) {
	// remoteviews = TextUtils.concat(new CharSequence[] {
	// obj1, "\n", charsequence6 });
	// arraylist1.add(charsequence6);
	// }
	// }
	// }
	// obj1 = remoteviews;
	// if (hashmap.containsKey(Integer.valueOf(ul1.r))) {
	// CharSequence charsequence7 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.r));
	// obj1 = remoteviews;
	// if (charsequence7 != null) {
	// obj1 = remoteviews;
	// if (!charsequence7.equals("")) {
	// obj1 = TextUtils.concat(new CharSequence[] {
	// remoteviews, "\n", charsequence7 });
	// arraylist1.add(charsequence7);
	// }
	// }
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.s))) {
	// CharSequence charsequence8 = (CharSequence) hashmap
	// .get(Integer.valueOf(ul1.s));
	// remoteviews = ((RemoteViews) (obj1));
	// if (charsequence8 != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!charsequence8.equals("")) {
	// remoteviews = TextUtils.concat(new CharSequence[] {
	// obj1, "\n", charsequence8 });
	// arraylist1.add(charsequence8);
	// }
	// }
	// }
	// if (hashmap.containsKey(Integer.valueOf(ul1.t))) {
	// obj1 = (CharSequence) hashmap.get(Integer.valueOf(ul1.t));
	// if (obj1 != null && !obj1.equals("")) {
	// remoteviews = TextUtils.concat(new CharSequence[] {
	// remoteviews, "\n", obj1 });
	// arraylist1.add(obj1);
	// }
	// }
	// if (obj == null || obj.equals("")) {
	// arraylist.addAll(arraylist1);
	// obj1 = null;
	// obj = remoteviews;
	// } else {
	// arraylist.add(obj);
	// obj1 = remoteviews;
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// if (hashmap.containsKey(Integer.valueOf(ul1.e))) {
	// Object obj2 = (CharSequence) hashmap.get(Integer
	// .valueOf(ul1.e));
	// remoteviews = ((RemoteViews) (obj1));
	// if (obj2 != null) {
	// remoteviews = ((RemoteViews) (obj1));
	// if (!obj2.equals("")) {
	// if (obj1 == null) {
	// remoteviews = ((RemoteViews) (obj2));
	// } else {
	// remoteviews = (new StringBuilder())
	// .append(obj1).append("\n").append(obj2)
	// .toString();
	// }
	// }
	// }
	// }
	// obj1 = obj;
	// obj2 = remoteviews;
	// if (TextUtils.isEmpty(((CharSequence) (obj)))) {
	// obj1 = obj;
	// obj2 = remoteviews;
	// if (!TextUtils.isEmpty(remoteviews)) {
	// arraylist.add(remoteviews);
	// obj2 = null;
	// obj1 = remoteviews;
	// }
	// }
	// remoteviews = ((RemoteViews) (obj1));
	// obj = context;
	// if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
	// remoteviews = ((RemoteViews) (obj1));
	// obj = context;
	// if (!TextUtils.isEmpty(((CharSequence) (obj2)))) {
	// remoteviews = ((RemoteViews) (obj1));
	// obj = context;
	// if (!obj1.equals(obj2))
	// ;
	// }
	// }
	// } else {
	// remoteviews = null;
	// obj = context;
	// }
	// if (obj != null) {
	// pi1.d = ((CharSequence) (obj));
	// }
	// if (remoteviews != null) {
	// pi1.e = remoteviews;
	// pi1.g = arraylist;
	// return;
	// }
	// }
	// }

	public static boolean a(String s) {
		return a.equals(s) || b.equals(s) || "com.google.android.gm".equals(s);
	}

	private static NotificationManager b(Context context) {
		return (NotificationManager) context.getSystemService("notification");
	}

	public static boolean b(String s) {
		return a.equals(s);
	}

	@SuppressLint("NewApi")
	public static com.lazyswipe.notification.AppNotification$Action[] b(
			Notification notification) {
		ArrayList arraylist;
		int i;
		int j;
		j = 0;
		Iterator iterator = null;
		i = 0;
		Field field = null;
		Object obj = null;
		Object[] str = null;
		AppNotification$Action[] appAction = null;
		arraylist = new ArrayList();
		if (android.os.Build.VERSION.SDK_INT < 19) {

			try {
				field = notification.getClass().getDeclaredField("actions");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (field == null) {

				field = null;

			} else {

				((Field) (field)).setAccessible(true);
				try {
					str = (((Object[]) (Object[]) ((Field) (obj))
							.get(notification)));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (str == null) {

					com.lazyswipe.notification.AppNotification$Action action1;
					for (iterator = ug.a(notification).c().iterator(); iterator
							.hasNext(); arraylist.add(action1)) {
						obj = (ac) iterator.next();
						action1 = new com.lazyswipe.notification.AppNotification$Action();
						action1.a = ((ac) (obj)).a;
						action1.c = ((ac) (obj)).c;
						action1.b = ((ac) (obj)).b;
						action1.d = ((ac) (obj)).e();
					}

					appAction = new com.lazyswipe.notification.AppNotification$Action[arraylist
							.size()];
					arraylist.toArray(appAction);
					return appAction;

				} else {
					i = j;
				}

			}

		} else {

			if (notification.actions != null && notification.actions.length > 0) {
				android.app.Notification.Action aaction[] = notification.actions;
				for (j = aaction.length; i < j; i++) {
					arraylist
							.add(new com.lazyswipe.notification.AppNotification$Action(
									aaction[i]));
				}

			}
			com.lazyswipe.notification.AppNotification$Action action1;
			for (iterator = ug.a(notification).c().iterator(); iterator
					.hasNext(); arraylist.add(action1)) {
				obj = (ac) iterator.next();
				action1 = new com.lazyswipe.notification.AppNotification$Action();
				action1.a = ((ac) (obj)).a;
				action1.c = ((ac) (obj)).c;
				action1.b = ((ac) (obj)).b;
				action1.d = ((ac) (obj)).e();
			}

			appAction = new com.lazyswipe.notification.AppNotification$Action[arraylist
					.size()];
			arraylist.toArray(appAction);
			return appAction;

		}

		if (i >= str.length) {

			com.lazyswipe.notification.AppNotification$Action action1;
			for (iterator = ug.a(notification).c().iterator(); iterator
					.hasNext(); arraylist.add(action1)) {
				obj = (ac) iterator.next();
				action1 = new com.lazyswipe.notification.AppNotification$Action();
				action1.a = ((ac) (obj)).a;
				action1.c = ((ac) (obj)).c;
				action1.b = ((ac) (obj)).b;
				action1.d = ((ac) (obj)).e();
			}

			appAction = new com.lazyswipe.notification.AppNotification$Action[arraylist
					.size()];
			arraylist.toArray(appAction);
			return appAction;

		} else {

			com.lazyswipe.notification.AppNotification$Action action = new com.lazyswipe.notification.AppNotification$Action();
			Class class1 = null;
			try {
				class1 = Class.forName("android.app.Notification$Action");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				action.a = class1.getDeclaredField("icon").getInt(str[i]);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				action.b = (CharSequence) class1.getDeclaredField("title").get(
						str[i]);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				action.c = (PendingIntent) class1.getDeclaredField(
						"actionIntent").get(str[i]);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			arraylist.add(action);
			i++;
		}
		return appAction;

	}

	public static boolean c(Notification notification) {
		return (notification.flags & 0x20) == 0 && !d(notification);
	}

	public static boolean c(String s) {
		return "org.telegram.messenger".equals(s);
	}

	public static boolean d(Notification notification) {
		return (notification.flags & 2) != 0;
	}

	private static RemoteViews e(Notification notification) {
		if (notification.bigContentView == null) {
			return notification.contentView;
		} else {
			return notification.bigContentView;
		}
	}

	static {
		a = ng.d.a();
		b = ng.e.a();
		c = ng.c.a();
		d = ng.a.a();
		e = ng.b.a();
	}
}
