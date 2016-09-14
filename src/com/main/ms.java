package com.main;

import android.content.Context;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.notification.AppNotification;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ms extends mr implements pj, pk {

	public ms(mr mr1) {
		super(mr1.b, mr1.a);
	}

	private void a(pg pg1, boolean flag) {
		Iterator iterator;
		pu pu1 = null;

		{
			if (AppNotification.a == pg1) {
				try {
					SwipeService.n().remove(a);
				}

				catch (Exception exception) {
				}
			}

		}
		if (flag) {
			e.invalidate();
		}

		iterator = a.g.values().iterator();
		do {
			if (iterator.hasNext()) {
				pu1 = (pu) iterator.next();

			}

		} while (!pu1.a().contains(pg1.d));
		pq.a(pu1.a, pg1, true);

	}

	public void a(Context context, java.util.Map.Entry entry) {
		Iterator iterator = null;
		pg pg1 = (pg) entry.getKey();
		String string = null;
		pu pu = null;
		if (AppNotification.a != pg1) {

			iterator = a.g.values().iterator();
			do {
				if (iterator.hasNext()) {
					pu = (pu) iterator.next();
				}

			} while (!pu.a().contains(pg1.d));

		} else {
			ja.a().a("\u8FDB\u5165\u6D88\u606F\u5E94\u7528", "app",
					"Contact-SMS");
			int i = ((ts) entry.getValue()).size();
			if (i > 1) {
				string = null;
			} else {
				try {
					string = (String) SwipeService.m().get(a);
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					string = null;
				}
			}
			try {
				SwipeService.n().remove(a);
			} catch (Throwable throwable) {
			}
			if (string == null) {

				vh.h(context);
				return;
			} else {

				vh.a(context, string);

			}
		}
		ja.a().a(
				"\u8FDB\u5165\u6D88\u606F\u5E94\u7528",
				"app",
				(new StringBuilder()).append("Contact-")
						.append(((pu) (entry)).a).toString());
		pq.a(((pu) (entry)).a, pg1, true);
		ng.c(((pu) (entry)).a).b(pg1.d);
		return;
	}

	public void a(pg pg1) {
		a(pg1, true);
	}

	public boolean a(Context context) {
		ja.a().a("\u70B9\u51FB\u6D88\u606F", "app", "Contact");
		Fan.a(e, this);
		return false;
	}

	public boolean f() {
		return false;
	}

	public void k() {
		try {
			SwipeService.n().remove(a);
		} catch (Throwable throwable1) {
		}
		try {
			for (Iterator iterator = pq.a(a).keySet().iterator(); iterator
					.hasNext(); a((pg) iterator.next(), false)) {
			}
		} catch (Throwable throwable) {
		}
	}

	public pg l() {
		return null;
	}

	public int m() {
		int i1;
		Iterator iterator = null;
		Object obj = pq.a(a);
		if (obj != null) {
			obj = ((Map) (obj)).values().iterator();
			int i = 0;
			do {
				i1 = i;
				if (((Iterator) (obj)).hasNext()) {
					iterator = ((ts) ((Iterator) (obj)).next()).iterator();
				}

				i1 = i;
				do {
					i = i1;
					if (!iterator.hasNext()) {
						break;
					}
					i1 += ((pi) iterator.next()).a();
				} while (true);
			} while (true);
		}
		i1 = 0;

		Object obj1 = SwipeService.n();
		int j = i1;
		if (obj1 != null) {
			obj1 = (ts) ((Map) (obj1)).get(a);
			j = i1;
			if (obj1 != null) {
				j = i1 + ((ts) (obj1)).size();
			}
		}
		return j;
	}
}
