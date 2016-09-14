package com.lazyswipe.notification;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Queue;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.lazyswipe.SwipeApplication;
import com.main.kf;
import com.main.kg;
import com.main.pg;
import com.main.pi;
import com.main.tf;
import com.main.tj;
import com.main.ts;
import com.main.ub;
import com.main.uk;
import com.main.vk;

public final class AppNotification {
	public static final pg a = new pg(-1, "INVALID_TAG", "INVALID_KEY",
			"INVALID_IDENTITY");
	private static final Object f = new Object();
	private static AppNotification g;
	private static int h = 0;
	public CharSequence b;
	public String c;
	@SuppressWarnings("rawtypes")
	public LinkedHashMap d = new LinkedHashMap(1);
	public boolean e = true;
	private AppNotification i;

	// public static AppNotification a() {
	// AppNotification localAppNotification;
	// synchronized (f) {
	// if (g != null) {
	// localAppNotification = g;
	// g = localAppNotification.i;
	// localAppNotification.i = null;
	// localAppNotification.e = true;
	// h = -1 + h;
	// } else {
	// localAppNotification = new AppNotification();
	// }
	// }
	// return localAppNotification;
	// }
	// public static AppNotification a() {
	// Object obj = f;
	//
	// AppNotification appnotification;
	// if (g != null) {
	// appnotification = g;
	// g = appnotification.i;
	// appnotification.i = null;
	// appnotification.e = true;
	// h--;
	// return appnotification;
	// }
	//
	// return new AppNotification();
	//
	// }
	// public static AppNotification a() {
	// Object obj = f;
	//
	// AppNotification appnotification = new AppNotification();;
	// if (g != null) {
	// appnotification = g;
	//
	// return appnotification;
	// } else {
	// g = appnotification.i;
	// appnotification.i = null;
	// appnotification.e = true;
	// return new AppNotification();
	// }
	//
	// //h--;
	//
	// }
	public static AppNotification a() {
		Object object;
		Object object2 = object = f;
		synchronized (object2) {
			if (g != null) {
				AppNotification appNotification = g;
				g = appNotification.i;
				appNotification.i = null;
				appNotification.e = true;
				h = -1 + h;
				return appNotification;
			}
			return new AppNotification();
		}
	}

	// public static void b() {
	// synchronized (f) {
	// if (g != null) {
	// AppNotification localAppNotification = g;
	// g = localAppNotification.i;
	// localAppNotification.i = null;
	// localAppNotification.a(false);
	// }
	// }
	// }
	public static void b() {
		Object obj = f;

		while (g != null) {
			AppNotification appnotification = g;
			g = appnotification.i;
			appnotification.i = null;
			appnotification.a(false);
		}

	}

	// private void d() {
	// Iterator localIterator = this.d.values().iterator();
	// if (localIterator.hasNext()) {
	// ts localts = (ts) localIterator.next();
	//
	// pi localpi = (pi) localts.poll();
	// if (localpi != null) {
	// localpi.c();
	// }
	//
	//
	// }
	// this.d.clear();
	// }
	private void d() {
		ts ts1 = null;
		Iterator iterator = d.values().iterator();
		do {

			if (iterator.hasNext()) {
				ts1 = (ts) iterator.next();

			} else {
				d.clear();
			}

			do {
				pi pi1 = (pi) ts1.poll();
				if (pi1 != null) {
					pi1.c();
				}

			} while (true);

		} while (true);

	}

	public pi a(pg pg1) {
		if (d == null) {
			return null;
		} else {
			return (pi) ((ts) d.get(pg1)).peek();
		}
	}

	public void a(boolean flag) {
		b = null;
		c = null;
		e = false;
		d();
		if (flag) {
			synchronized (f) {
				while (h < 8) {
					i = g;
					g = this;
					h++;
				}
			}
			return;
		} else {
			return;
		}

	}

	public boolean a(CharSequence charsequence, String s,
			Notification notification, String s1, int j, String s2) {
		b = charsequence;
		c = s;
		Object obj;
		Object obj1;
		Object obj2 = null;
		ContentResolver contentresolver = null;
		Exception exception;
		ContentValues contentvalues = null;
		String s3;
		pg pg = null;
		android.graphics.Bitmap bitmap;
		android.graphics.Bitmap bitmap1;
		byte abyte0[];
		boolean flag;
		pi pi = null;
		ts ts = null;
		if (uk.b(s)) {
			charsequence = uk.a(notification);
			obj = uk.a;
		} else {
			obj = null;
			charsequence = null;
		}
		if (charsequence == null) {

			if (charsequence == null) {
				pg = new pg(j, s1, s2, null);
			} else {
				pg = new pg(j, s1, s2, s);
			}
			pi = pi.a(this, pg, notification);
			if (s2 == null) {
				return false;
			}
			obj = d.get(j);
			// notification = s1;
			if (s1 == null) {
				ts = new ts(15);
				d.put(charsequence, ts);
			}
			if (s.equals("com.tencent.qqlite") && vk.a(s2, pi.b())) {
				return false;
			} else {
				((Queue) notification).offer(s2);

			}
			// s = ((String) (obj1));
			// ub.a();
			ub.a(((Cursor) (obj)));

			// ub.a(((Cursor) (obj2)));
			// throw obj1;

		} else {

			obj2 = SwipeApplication.e();
			contentresolver = ((Context) (obj2)).getContentResolver();
			obj1 = null;
			obj = contentresolver.query(kg.a, new String[] { "contact_id" },
					"app=? and key=?", new String[] { (String) obj,
							(String) charsequence }, null);
			contentvalues = new ContentValues();

		}

		// _L6:
		flag = ((Cursor) (obj)).moveToNext();
		if (!flag) {
			ub.a(((Cursor) (obj)));

		} else {

			s3 = ((Cursor) (obj)).getString(0);
			obj1 = contentresolver.query(kf.a, new String[] { "image" },
					"_id=? ", new String[] { s3 }, null);
			do {
				if (!((Cursor) (obj1)).moveToNext()) {
					break;
				}
				if (((Cursor) (obj1)).isNull(0)) {
					bitmap = notification.largeIcon;
					if (tf.b(bitmap)) {
						bitmap1 = tf.a(bitmap, ((Context) (obj2)));
						bitmap = tj.a(bitmap1);
						tf.a(bitmap1);
						abyte0 = tf.d(bitmap);
						tf.a(bitmap);
						contentvalues.clear();
						contentvalues.put("image", abyte0);
						contentresolver.update(kf.a, contentvalues, "_id=? ",
								new String[] { s3 });
					}
				}
			} while (true);
			ub.a(((Cursor) (obj1)));

		}
		return flag;

	}

	// public pi b(pg parampg) {
	// Object localObject = null;
	// if (this.d == null) {
	// }
	//
	// ts localts = (ts) this.d.get(parampg);
	// if (localts != null) {
	// Iterator localIterator = localts.iterator();
	// for (pi localpi = null; localIterator.hasNext(); localpi = (pi)
	// localIterator
	// .next()) {
	// localObject = localpi;
	// }
	// }
	// return (pi) localObject;
	// }
	
	public pi b(pg pg1) {
		Iterator iterator = null;
		ts ts = null;
		pi pi = null;
		if (d != null) {
			if ((ts = (ts) d.get(pg1)) != null) {
				iterator = ts.iterator();
				for (pi = null; iterator.hasNext(); pi = (pi) iterator.next()) {
				}
				return pi;
			}
		}
		return null;
	}

	public void c() {
		a(true);
	}

	public String toString() {
		return (new StringBuilder()).append("Notification:{name=").append(b)
				.append(",package=").append(c).append(",count=")
				.append(d.size()).append('}').toString();
	}

}
