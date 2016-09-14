package com.main;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.notification.AppNotification;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mw extends mt implements pj, pk {

	private final Context a;
	private String b;
	private pg c;

	public mw(Context context, String s, pg pg) {
		a = context;
		b = s;
		c = pg;
		if (c == null && TextUtils.isEmpty(b)) {
			b = vh.g(context);
		}
	}

	public CharSequence a() {
		String s = null;
		if (c == null) {
			try {
				s = vk.a(a, b, null);
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			pi pi1 = pq.c(b, c);
			if (pi1 != null) {
				if (pi1.d == null) {
					return pi1.f;
				} else {
					return pi1.d;
				}
			}
		}
		return s;
	}

	public void a(Context context, java.util.Map.Entry entry) {
		String str = null;
		if (c == null) {
			ja.a().a("\u8FDB\u5165\u6D88\u606F\u5E94\u7528", "app", "SMS");
		}

		int j = ((ts) SwipeService.n().get(pv.a)).size();
		if (j > 1) {
			str = null;
		} else {
			try {
				str = (String) SwipeService.m().get(pv.a);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				str = null;
			}
		}
		try {
			SwipeService.n().remove(pv.a);
		} catch (Throwable throwable) {
		}
		if (str != null) {
			vh.a(context, str);
			return;
		} else {
			vh.h(context);
			// return;
		}
		ja.a().a("\u8FDB\u5165\u6D88\u606F\u5E94\u7528", "app", b);
		pi pi = pq.c(b, c);
		if (entry == null) {
			vk.c(context, vk.a(b));
		} else {
			try {
				((pi) (pi)).c.send();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				vj.a(d, "Failed to send the notification content intent",
						exception);
				vk.c(context, vk.a(b));
			}
		}
		k();
		return;
	}

	public void a(pg pg) {
	}

	public boolean a(Context context) {
		ja.a().a("\u70B9\u51FB\u6D88\u606F", "app", b);
		if ("com.snapchat.android".equals(b)) {
			Object obj = pq.e(b);
			if (obj != null && ((AppNotification) (obj)).d != null) {
				Iterator iterator = ((AppNotification) (obj)).d.entrySet()
						.iterator();
				for (obj = null; iterator.hasNext(); obj = (java.util.Map.Entry) iterator
						.next()) {
				}
				a(context, ((java.util.Map.Entry) (obj)));
			} else {
				vk.c(context, vk.a(b));
			}
		} else {
			Fan.a(e, this);
		}
		return false;
	}

	public Drawable b() {
		if (c != null) {
			Object obj = pq.c(b, c);
			if (obj != null && ((pi) (obj)).h != null) {
				obj = ((pi) (obj)).h;
				if (tf.b(((android.graphics.Bitmap) (obj)))) {
					return FanItem.a(((android.graphics.Bitmap) (obj)));
				}
			}
		}
		return FanItem.a(vk.e(a, b));
	}

	public boolean b(Context context) {
		return false;
	}

	public String e() {
		return b;
	}

	public boolean f() {
		return false;
	}

	public String i() {
		return b;
	}

	public void k() {
		pq.a(b, c, true);
		if (c == null) {
			SwipeService.n().remove(pv.a);
		}
		
		return;

	}

	public pg l() {
		return c;
	}

	public int m() {
		int i1 = 0;
		int j = 0;
		if (c != null) {
			Object obj = pq.a(b, c);
			if (obj != null) {
				obj = ((ts) (obj)).iterator();
				do {
					i1 = j;
					if (!((Iterator) (obj)).hasNext()) {
						break;
					}
					j = ((pi) ((Iterator) (obj)).next()).a() + j;
				} while (true);
			}
		} else {
			Object obj1 = SwipeService.n();
			if (obj1 != null) {
				if ((obj1 = (ts) ((Map) (obj1)).get(pv.a)) != null) {
					return ((ts) (obj1)).size();
				}
			}
		}
		return i1;
	}
}
