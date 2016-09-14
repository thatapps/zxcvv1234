package com.main;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class bd {

	private static final Object a = new Object();
	private static Field b;
	private static boolean c;
	private static final Object d = new Object();

	public static Bundle a(android.app.Notification.Builder builder, ay ay1) {
		builder.addAction(ay1.a(), ay1.b(), ay1.c());
		Bundle bundle = new Bundle(ay1.d());
		if (ay1.f() != null) {
			bundle.putParcelableArray("android.support.remoteInputs",
					br.a(ay1.f()));
		}
		return bundle;
	}

	public static Bundle a(Notification notification) {

		synchronized (a) {
			if (!c) {

			}
		}

		Object obj = null;

		if (b == null) {
			try {
				obj = android.app.Notification.class.getDeclaredField("extras");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (!android.os.Bundle.class
				.isAssignableFrom(((Field) (obj)).getType())) {
			Log.e("NotificationCompat",
					"Notification.extras field is not of type Bundle");
			c = true;

			return null;
		}

		((Field) (obj)).setAccessible(true);
		b = ((Field) (obj));
		Bundle bundle = null;
		try {
			bundle = (Bundle) b.get(notification);
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// obj = bundle;
		if (bundle == null) {
			obj = new Bundle();
			try {
				b.set(notification, obj);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return ((Bundle) (obj));
		}

		return null;

	}

	public static SparseArray a(List list) {
		SparseArray sparsearray = null;
		int j = list.size();
		for (int i = 0; i < j;) {
			Bundle bundle = (Bundle) list.get(i);
			SparseArray sparsearray1 = sparsearray;
			if (bundle != null) {
				sparsearray1 = sparsearray;
				if (sparsearray == null) {
					sparsearray1 = new SparseArray();
				}
				sparsearray1.put(i, bundle);
			}
			i++;
			sparsearray = sparsearray1;
		}

		return sparsearray;
	}

	private static ay a(Bundle bundle, az az1, bq bq) {
		return az1.b(bundle.getInt("icon"), bundle.getCharSequence("title"),
				(PendingIntent) bundle.getParcelable("actionIntent"),
				bundle.getBundle("extras"),
				br.a(g.a(bundle, "remoteInputs"), bq));
	}

	public static void a(aa aa1, CharSequence charsequence, boolean flag,
			CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1,
			boolean flag1) {
		BigPictureStyle bigPictureStyle = (new android.app.Notification.BigPictureStyle(
				aa1.a())).setBigContentTitle(charsequence).bigPicture(bitmap);
		if (flag1) {
			bigPictureStyle.bigLargeIcon(bitmap1);
		}
		if (flag) {
			bigPictureStyle.setSummaryText(charsequence1);
		}
	}

	public static void a(aa aa1, CharSequence charsequence, boolean flag,
			CharSequence charsequence1, CharSequence charsequence2) {
		BigTextStyle bigTextStyle = (new android.app.Notification.BigTextStyle(
				aa1.a())).setBigContentTitle(charsequence).bigText(
				charsequence2);
		if (flag) {
			bigTextStyle.setSummaryText(charsequence1);
		}
	}

	public static void a(aa aa1, CharSequence charsequence, boolean flag,
			CharSequence charsequence1, ArrayList arraylist) {
		Iterator iterator = null;
		InboxStyle inboxStyle = (new android.app.Notification.InboxStyle(
				aa1.a())).setBigContentTitle(charsequence);
		if (flag) {
			inboxStyle.setSummaryText(charsequence1);
		}
		for (iterator = arraylist.iterator(); iterator.hasNext(); inboxStyle
				.addLine((CharSequence) iterator.next())) {
		}
	}

	public static ay[] a(ArrayList arraylist, az az1, bq bq) {
		if (arraylist == null) {
			return null;
		}
		ay aay[] = az1.b(arraylist.size());
		for (int i = 0; i < aay.length; i++) {
			aay[i] = a((Bundle) arraylist.get(i), az1, bq);
		}

		return aay;
	}

}
