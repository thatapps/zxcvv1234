package com.main;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.notification.AppNotification;
import com.lazyswipe.notification.AppNotification$Action;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class pi {
	private static Field j;
	public long a;
	public boolean b;
	public PendingIntent c;
	public CharSequence d;
	public CharSequence e;
	public CharSequence f;
	public List g;
	public Bitmap h;
	public com.lazyswipe.notification.AppNotification$Action i[];

	public pi() {
	}

	public static pi a(Cursor cursor, pv pv1, String s) {
		return b(cursor, pv1, s);
	}

	public static pi a(AppNotification appnotification, pg pg1,
			Notification notification) {
		if (TextUtils.isEmpty(notification.tickerText)
				&& pq.b(appnotification.c)) {
			return null;
		} else {
			return b(appnotification, pg1, notification);
		}
	}

	private void a(Notification notification) {
		Bundle bundle = null;
		if (android.os.Build.VERSION.SDK_INT >= 18) {
			if (android.os.Build.VERSION.SDK_INT >= 19) {
				bundle = notification.extras;
			} else {
				try {
					if (j == null) {
						j = notification.getClass().getDeclaredField("extras");
						j.setAccessible(true);
					}
					bundle = (Bundle) j.get(notification);
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return;
				}
			}
			d = bundle.getCharSequence("android.title");
			e = bundle.getCharSequence("android.text");
		}
	}

	private static pi b(Cursor cursor, pv pv1, String s) {
		pi pi1 = new pi();
		pi1.b = true;
		pi1.c = null;
		String s1 = cursor.getString(2);
		pi1.e = s1;
		pi1.f = s1;
		String str = null;
		if (TextUtils.isEmpty(pv1.d)) {
			str = s;
			if (TextUtils.isEmpty(s)) {
				str = tj.c(SwipeApplication.e(), cursor.getString(0));
			}
		} else {
			str = pv1.d;
		}
		pi1.d = str;
		pi1.a = cursor.getLong(1);
		return pi1;
	}

	private static pi b(AppNotification appnotification, pg pg1,
			Notification notification) {
		AppNotification appnotification1;
		Object obj1;
		Object obj2;
		Object obj3 = null;
		pi pi1;
		AppNotification$Action[] actions = null;
		pi1 = new pi();
		pi1.f = notification.tickerText;
		obj2 = null;
		pi pi2 = null;
		Iterator iterator = null;
		CharSequence charsequence;
		obj1 = null;
		appnotification1 = (AppNotification) obj1;
		pi1.g = null;
		appnotification = null;
		boolean flag = false;

		// appnotification1 = appnotification;
		// appnotification = pg1;

		// obj = appnotification1;

		if (uk.b(appnotification.c) && pg1.a != null) {
			return null;
		}
		if (uk.c(appnotification.c)) {
			if (pg1.a != null) {
				return null;
			}
			if (notification.tickerText == null) {
				return null;
			}
		}
		appnotification1 = (AppNotification) obj1;
		uk.a(SwipeApplication.e(), notification, pi1);
		Object obj;
		appnotification1 = (AppNotification) obj1;
		obj = obj2;
		if (TextUtils.isEmpty(pi1.d)) {
			flag = true;
			appnotification = ((AppNotification) (obj));

			if (flag) {
				pi1.g = null;
				pi1.a(notification);
			}
			pi1.b = uk.c(notification);
			pi1.a = notification.when;
			pi1.c = notification.contentIntent;
			if (notification.largeIcon != null) {
				pi1.h = notification.largeIcon;
			}

			if (appnotification != null) {
				 pi1.i = actions;
			} else if (android.os.Build.VERSION.SDK_INT >= 16) {
				pi1.i = uk.b(notification);
			}
			return pi1;

		} else {
			appnotification1 = (AppNotification) obj1;
			obj = obj2;
			if (TextUtils.isEmpty(pi1.e)) {

				flag = true;
				appnotification = ((AppNotification) (obj));

				if (flag) {
					pi1.g = null;
					pi1.a(notification);
				}
				pi1.b = uk.c(notification);
				pi1.a = notification.when;
				pi1.c = notification.contentIntent;
				if (notification.largeIcon != null) {
					pi1.h = notification.largeIcon;
				}

				if (appnotification != null) {
					pi1.i = actions;
				} else if (android.os.Build.VERSION.SDK_INT >= 16) {
					pi1.i = uk.b(notification);
				}
				return pi1;

			} else {
				appnotification1 = (AppNotification) obj1;
				if (uk.b(appnotification.c)) {

					appnotification1 = (AppNotification) obj1;
					obj = (ts) appnotification.d.get(pg1);
					appnotification1 = (AppNotification) obj1;
					if (pg1.d == null) {

						appnotification1 = (AppNotification) obj1;
						if (pi1.g == null) {

							appnotification = null;

						} else {

							appnotification1 = (AppNotification) obj1;
							iterator = appnotification.d.entrySet().iterator();

						}

					} else {

						if (obj == null) {

							appnotification = null;

						} else {

							appnotification1 = (AppNotification) obj1;
							if (((ts) (obj)).size() <= 0) {

								appnotification = null;

							} else {
								appnotification1 = (AppNotification) obj1;
								actions = ((pi) ((ts) (obj)).a()).i;
								appnotification1 = appnotification;
								pi1.d = ((pi) ((ts) (obj)).a()).d;

							}

						}

					}

				} else {

					appnotification1 = (AppNotification) obj1;
					if (!uk.c(appnotification.c)) {

					} else {
						appnotification1 = (AppNotification) obj1;
						obj = (ts) appnotification.d.get(pg1);

						if (pg1.d == null) {

							if (pi1.g == null) {

								appnotification = null;

							} else {
								appnotification1 = (AppNotification) obj1;
								iterator = appnotification.d.entrySet()
										.iterator();

							}

						} else {

							if (obj == null) {
								appnotification = null;

							} else {

								appnotification1 = (AppNotification) obj1;
								if (((ts) (obj)).size() <= 0) {
									appnotification = null;

								} else {
									appnotification1 = (AppNotification) obj1;
									actions = ((pi) ((ts) (obj)).a()).i;
									appnotification1 = appnotification;
									pi1.d = ((pi) ((ts) (obj)).a()).d;

								}
							}
						}

					}

				}

			}

		}

		if (!iterator.hasNext()) {

			appnotification1 = (AppNotification) obj1;
			pi1.e = "";

			iterator = pi1.g.iterator();

		} else {
			appnotification1 = (AppNotification) obj1;
			obj3 = (java.util.Map.Entry) iterator.next();
			appnotification1 = (AppNotification) obj1;
			if (pg1.equals(((java.util.Map.Entry) (obj3)).getKey())) {

				if (!iterator.hasNext()) {

					pi1.e = "";

					iterator = pi1.g.iterator();

				} else {

					appnotification1 = (AppNotification) obj1;
					obj3 = ((ts) ((java.util.Map.Entry) (obj3)).getValue())
							.iterator();
				}
			}

		}

		appnotification1 = (AppNotification) obj1;
		if (!((Iterator) (obj3)).hasNext()) {
		} else {
			appnotification1 = (AppNotification) obj1;
			pi2 = (pi) ((Iterator) (obj3)).next();

			if (pi2.g == null) {

			} else {
				appnotification1 = (AppNotification) obj1;
				iterator = pi2.g.iterator();
			}

		}

		if (!iterator.hasNext()) {

			if (!((Iterator) (obj3)).hasNext()) {
			} else {

				pi2 = (pi) ((Iterator) (obj3)).next();
				appnotification1 = (AppNotification) obj1;
				if (pi2.g == null) {

				} else {
					appnotification1 = (AppNotification) obj1;
					iterator = pi2.g.iterator();
				}

			}

		} else {

			charsequence = (CharSequence) iterator.next();
			appnotification1 = (AppNotification) obj1;
			pi1.g.remove(TextUtils.concat(new CharSequence[] { pi2.d, ": ",
					charsequence }));

		}

		appnotification1 = (AppNotification) obj1;
		if (!iterator.hasNext()) {
			// break; /* Loop/switch isn't completed */
		}
		appnotification1 = (AppNotification) obj1;
		pg1 = (pg) iterator.next();
		appnotification1 = (AppNotification) obj1;
		pi1.e = TextUtils.concat(new CharSequence[] { pi1.e, "\n",
				(CharSequence) pg1 });
		return pi2;

	}

	public int a() {
		if (g != null) {
			return g.size();
		} else {
			return 1;
		}
	}

	public CharSequence b() {
		if (!TextUtils.isEmpty(e)) {
			return e;
		}
		if (!TextUtils.isEmpty(f)) {
			return f;
		} else {
			return null;
		}
	}

	public void c() {
		i = null;
		a = 0L;
		c = null;
		f = null;
		e = null;
		d = null;
		h = null;
		b = true;
	}

	public com.lazyswipe.notification.AppNotification$Action d() {
		if (i != null) {
			for (int k = 0; k < i.length; k++) {
				if (i[k].d != null) {
					return i[k];
				}
			}

		}
		return null;
	}

	public boolean equals(Object obj) {
		if (obj instanceof pi) {
			if (vk.a(((pi) (obj = (pi) obj)).f, f) && vk.a(((pi) (obj)).d, d)
					&& vk.a(((pi) (obj)).e, e)) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		int i1 = 0;
		int k;
		int l;
		if (f != null) {
			k = f.hashCode();
		} else {
			k = 0;
		}
		if (e != null) {
			l = e.hashCode();
		} else {
			l = 0;
		}
		if (d != null) {
			i1 = d.hashCode();
		}
		return (l + (k + 527) * 31) * 31 + i1;
	}

	public String toString() {
		return (new StringBuilder()).append("ticker=").append(f)
				.append(",title=").append(d).append(",text=").append(e)
				.append(",timestamp=").append(a).toString();
	}
}
