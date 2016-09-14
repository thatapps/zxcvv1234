package com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.notification.AppNotification;
import com.lazyswipe.zev.R;

public class my extends mp {
	protected String a;

	private int a(Context var1_1, List var2_2) {
		HashMap var3_3 = pq.d();
		int var4_4 = 0;
		HashSet var5_5 = new HashSet(0);
		HashSet var6_6 = new HashSet();
		Iterator var20_27 = null;
		boolean var21_28 = false;
		Iterator var19_8 = null;
		Iterator var13_35;
		Map var7_7 = null;
		if (SwipeService.g() && var3_3 != null && var3_3.size() > 0) {

			var19_8 = var3_3.values().iterator();
			do {
				if (!var19_8.hasNext()) {

					if (var5_5.size() <= 0 && var7_7 == null
							&& (var7_7 = SwipeService.n()) != null
							&& var7_7.size() > 0) {
						Iterator var27_25 = var7_7.entrySet().iterator();
						while (var27_25.hasNext()) {
							pv var28_26 = (pv) ((Map.Entry) var27_25.next())
									.getKey();
							if (var28_26.equals(pv.a)
									|| var5_5.contains((Object) var28_26))
								continue;
							this.c.add((Object) new ms(new mr(var1_1, var28_26)));
							var5_5.add((Object) var28_26);
							++var4_4;
							if (this.c.size() < my.f())
								continue;
							return my.f();
						}
					}
					var20_27 = var3_3.values().iterator();
					var21_28 = false;
					break;

				}
			} while (true);

		}
		// lbl7: // 1 sources:
		int var8_24 = 0;
		Map var9_32 = null;
		boolean var10_33 = false;
		// ** GOTO lbl88
		if (var9_32 == null) {
			Map var12_34 = SwipeService.n();
			if (var12_34 == null || var12_34.size() <= 0) {
				var9_32 = var12_34;
			} else {
				var13_35 = var12_34.entrySet().iterator();
				int var14_36 = var8_24;
				while (var13_35.hasNext()) {
					pv var15_37 = (pv) ((Map.Entry) var13_35.next()).getKey();
					if (var15_37.equals(pv.a)
							|| var5_5.contains((Object) var15_37))
						continue;
					this.c.add((Object) new ms(new mr(var1_1, var15_37)));
					var5_5.add((Object) var15_37);
					int var18_38 = var14_36 + 1;
					if (this.c.size() >= my.f()) {
						return my.f();
					}
					var14_36 = var18_38;
				}
				var8_24 = var14_36;
				var9_32 = var12_34;
			}
			if (var10_33 != false)
				return var8_24;
		}
		if (var9_32 == null)
			return var8_24;
		if (var9_32.get((Object) pv.a) == null)
			return var8_24;
		this.c.add((Object) new mw(var1_1, null, null));
		++var8_24;
		if (this.c.size() < my.f())
			return var8_24;
		// return my.f();

		// lbl14: // 1 sources:
		AppNotification var31_23 = (AppNotification) var19_8.next();
		if (!this.a.equals((Object) var31_23.c) || !ir.C((Context) var1_1)) {

			for (Object var34_9 : var2_2) {
				mr mr1 = (mr) var34_9;
				pv var35_10 = mr1.j();
				pu var36_14 = (pu) var35_10.g.get((Object) mr1.c);
				if (var36_14 == null)
					continue;
				Iterator var37_15 = var31_23.d.keySet().iterator();
				boolean var38_13 = false;
				while (var37_15.hasNext()) {
					pg var41_17 = (pg) var37_15.next();
					if (!var36_14.a().contains((Object) var41_17.d))
						continue;
					var38_13 = true;
					Pair var42_16 = new Pair((Object) var31_23.c,
							(Object) var41_17.d);
					var6_6.add((Object) var42_16);
				}
			}
			// ** GOTO lbl49
			Map var33_12 = var7_7;
			// ** GOTO lbl67
			var7_7 = var33_12;
			// } while (true);
			while (var20_27.hasNext()) {
				AppNotification var22_30 = (AppNotification) var20_27.next();
				if (this.a.equals((Object) var22_30.c)) {
					if (var7_7.get((Object) pv.a) == null)
						continue;
					var21_28 = true;
					this.c.add((Object) new mw(var1_1, var22_30.c, null));
					++var4_4;
					if (this.c.size() < my.f())
						continue;
					return my.f();
				}
				for (Object var24_31 : var22_30.d.keySet()) {
					pg pg = (pg) var24_31;
					if (!TextUtils.isEmpty((CharSequence) pg.d)
							&& var6_6.contains((Object) new Pair(
									(Object) var22_30.c, (Object) pg.d)))
						continue;
					this.c.add((Object) new mw(var1_1, var22_30.c, pg));
					++var4_4;
					if (this.c.size() < my.f())
						continue;
					return my.f();
				}
			}
			var9_32 = var7_7;
			var10_33 = var21_28;
			var8_24 = var4_4;

		}
		// lbl16: // 1 sources:
		Map var44_20 = SwipeService.n();
		if (var44_20 == null || var44_20.size() <= 0) {

			Map var33_12 = var44_20;
			// ** GOTO lbl67

			var7_7 = var33_12;
		} // while (true);
		while (var20_27.hasNext()) {
			AppNotification var22_30 = (AppNotification) var20_27.next();
			if (this.a.equals((Object) var22_30.c)) {
				if (var7_7.get((Object) pv.a) == null)
					continue;
				var21_28 = true;
				this.c.add((Object) new mw(var1_1, var22_30.c, null));
				++var4_4;
				if (this.c.size() < my.f())
					continue;
				return my.f();
			}
			for (Object var24_31 : var22_30.d.keySet()) {
				pg pg = (com.main.pg) var24_31;
				if (!TextUtils.isEmpty((CharSequence) pg.d)
						&& var6_6.contains((Object) new Pair(
								(Object) var22_30.c, (Object) pg.d)))
					continue;
				this.c.add((Object) new mw(var1_1, var22_30.c, pg));
				++var4_4;
				if (this.c.size() < my.f())
					continue;
				return my.f();
			}
		}
		var9_32 = var7_7;
		var10_33 = var21_28;
		var8_24 = var4_4;

		// lbl18: // 1 sources:
		Iterator var45_21 = var44_20.entrySet().iterator();
		int var46_18 = var4_4;
		int var48_22 = -1;
		// ** GOTO lbl53
		while (var45_21.hasNext()) {
			pv var47_19 = (pv) ((Map.Entry) var45_21.next()).getKey();
			if (var47_19.equals(pv.a))
				continue;
			if (!var5_5.contains((Object) var47_19)) {
				this.c.add((Object) new ms(new mr(var1_1, var47_19)));
				var5_5.add((Object) var47_19);
				var48_22 = var46_18 + 1;
				if (this.c.size() >= my.f()) {
					return my.f();
				}
			} else {
				var48_22 = var46_18;
			}
			var46_18 = var48_22;
		}
		Map var33_12 = var44_20;
		var4_4 = var46_18;

		// lbl88: // 2 sources:
		if (var9_32 == null) {
			Map var12_34 = SwipeService.n();
			if (var12_34 == null || var12_34.size() <= 0) {
				var9_32 = var12_34;
			} else {
				var13_35 = var12_34.entrySet().iterator();
				int var14_36 = var8_24;
				while (var13_35.hasNext()) {
					pv var15_37 = (pv) ((Map.Entry) var13_35.next()).getKey();
					if (var15_37.equals(pv.a)
							|| var5_5.contains((Object) var15_37))
						continue;
					this.c.add((Object) new ms(new mr(var1_1, var15_37)));
					var5_5.add((Object) var15_37);
					int var18_38 = var14_36 + 1;
					if (this.c.size() >= my.f()) {
						return my.f();
					}
					var14_36 = var18_38;
				}
				var8_24 = var14_36;
				var9_32 = var12_34;
			}
			if (var10_33 != false)
				return var8_24;
		}
		// if (var9_32 == null)
		// return var8_24;
		// if (var9_32.get((Object) pv.a) == null)
		// return var8_24;
		// this.c.add((Object) new mw(var1_1, null, null));
		// ++var8_24;
		// if (this.c.size() < my.f())
		// return var8_24;
		return my.f();
	}

	// private void a(SwipeApplication paramSwipeApplication, List paramList) {
	// this.c = new ArrayList(f());
	// this.a = vh.g(paramSwipeApplication);
	// int i = a(((Context) (paramSwipeApplication)), paramList);
	// if (i > 0) {
	// ja.a().a("\u6536\u5230\u6d88\u606f", "count", i);
	// }
	// int j = this.c.size();
	// if ((j >= f()) || (!uj.d(paramSwipeApplication))) {
	// }
	// do {
	//
	// if (!ir.d(paramSwipeApplication)) {
	// break;
	// }
	// if (j > 0) {
	// for (na.b = 1 + na.b;; na.b = 0) {
	// int k = na.a(paramSwipeApplication);
	// if (k != -1) {
	// this.c.add(new na(paramSwipeApplication, k));
	// }
	//
	// break;
	//
	// }
	// }
	// } while ((na.b < 0) || (!ol.t.d(2, na.b)));
	//
	// }
	private void a(SwipeApplication swipeApplication, List list) {
		int n;
		int n2;
		this.c = new ArrayList(my.f());
		this.a = vh.g((Context) swipeApplication);
		int n3 = this.a((Context) swipeApplication, list);
		if (n3 == 0) {
			n3 = 2;
		}
		if (n3 > 0) {
			ja.a().a(/*"\u6536\u5230\u6d88\u606f"*/"Receive messages", "count", n3);
		}
		if ((n = this.c.size()) >= my.f())
			return;
		if (!uj.d((Context) swipeApplication)) {
			return;
		}
		if (!ir.d((Context) swipeApplication))
			return;
		if (n <= 0) {
			if (na.b < 0)
				return;
			if (!ol.t.d(2, na.b))
				return;
			na.b = 1 + na.b;
		} else {
			na.b = 0;
		}
		if ((n2 = na.a(swipeApplication)) == -1)
			return;
		this.c.add((Object) new na((Context) swipeApplication, n2));
	}

	@SuppressWarnings("rawtypes")
	private List c(Context context) {
		ArrayList arraylist = new ArrayList();
		for (Iterator iterator = pv.a(context).iterator(); iterator.hasNext(); arraylist
				.add(new mr(context, (pv) iterator.next()))) {
		}
		return arraylist;
	}

	private void d(Context context) {
		mx mx = new mx(context);
		if (mx.j()) {
			if (i() >= f()) {
				c.remove(f() - 1);
			}
			c.add(0, mx);
		}
	}

	public String a(Context paramContext) {
		return paramContext.getString(R.string.tab_name_discovery);
	}

	// public void a(SwipeApplication paramSwipeApplication) {
	// if (this.c != null) {
	// return;
	// }
	//
	// List localList = c(paramSwipeApplication);
	// a(paramSwipeApplication, localList);
	// if (!SwipeApplication.c) {
	// SharedPreferences localSharedPreferences = ir
	// .a(paramSwipeApplication);
	// if ((!localSharedPreferences.getBoolean(
	// "key_recent_notification_service_hint", false))
	// && (localSharedPreferences.getInt("key_tutorial_step", 0) <= 100)
	// && (!TextUtils.isEmpty(localSharedPreferences.getString(
	// "key_notification_apps_selected", null)))
	// && (!pq.c(paramSwipeApplication))) {
	// d(paramSwipeApplication);
	// }
	// }
	// int i = f();
	// if (i() < i) {
	// Iterator localIterator = localList.iterator();
	// if (localIterator.hasNext()) {
	// mr localmr = (mr) localIterator.next();
	// this.c.add(localmr);
	// if (this.c.size() < f()) {
	//
	// }
	// }
	// }
	//
	// }
	// public void a(SwipeApplication swipeapplication) {
	// if (c == null) {
	// List list = c(swipeapplication);
	// a(swipeapplication, list);
	// if (!SwipeApplication.c) {
	// SharedPreferences sharedpreferences = ir.a(swipeapplication);
	// if (!sharedpreferences.getBoolean(
	// "key_recent_notification_service_hint", false)
	// && sharedpreferences.getInt("key_tutorial_step", 0) <= 100
	// && !TextUtils.isEmpty(sharedpreferences.getString(
	// "key_notification_apps_selected", null))
	// && !pq.c(swipeapplication)) {
	// d(swipeapplication);
	// }
	// }
	// int i = f();
	// if (i() >= i) {
	// // continue;
	// }
	// Iterator iterator = list.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// continue;
	// }
	// mr mr1 = (mr) iterator.next();
	// c.add(mr1);
	// } while (c.size() < f());
	// }
	//
	// while (true) {
	// return;
	// }
	// }
	public void a(SwipeApplication swipeapplication) {
		if (c == null) {
			List list = c(swipeapplication);
			// d(swipeapplication);
			a(swipeapplication, list);
			if (!SwipeApplication.c) {
				SharedPreferences sharedpreferences = ir.a(swipeapplication);
				if (!sharedpreferences.getBoolean(
						"key_recent_notification_service_hint", false)
						&& sharedpreferences.getInt("key_tutorial_step", 0) <= 100
						&& !TextUtils.isEmpty(sharedpreferences.getString(
								"key_notification_apps_selected", null))
						&& !pq.c(swipeapplication)) {
					d(swipeapplication);
				}
			}
			Iterator iterator = null;
			int i = f();
			if (i > i()) {
				iterator = list.iterator();
			}
			// Iterator iterator = list.iterator();
			do {
				if (!iterator.hasNext()) {
					return;
				}
				mr mr1 = (mr) iterator.next();
				c.add(mr1);
			} while (c.size() < f());
		}

		while (true) {
			return;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	// public void a(List list, int n, int n2, lo lo) {
	// super.a(list, n, n2, lo);
	// if (vk.a((Collection) list)) {
	// return;
	// }
	// final ContentResolver contentResolver = SwipeApplication.e()
	// .getContentResolver();
	// final ArrayList arrayList = new ArrayList(list.size());
	// Iterator iterator = list.iterator();
	// int n3 = 0;
	// do {
	// if (!iterator.hasNext()) {
	// ui.a((Runnable) new Runnable() {
	//
	// /*
	// * Enabled aggressive block sorting Enabled unnecessary
	// * exception pruning
	// */
	// public void run() {
	// try {
	// contentResolver.applyBatch("com.lazyswipe",
	// arrayList);
	// } catch (Throwable var1_1) {
	// Log.w((String) "Swipe.RecentsTab",
	// (String) "Failed to update contact orders",
	// (Throwable) var1_1);
	// }
	// pv.a((Context) SwipeApplication.e(), true);
	// }
	// });
	// if (lo == null)
	// return;
	// lo.a(this.c);
	// return;
	// }
	// mt mt = (mt) iterator.next();
	// if (!(mt instanceof mr))
	// continue;
	// mr mr = (mr) mt;
	// ContentValues contentValues = new ContentValues(1);
	// String string = String.valueOf((int) mr.j().b);
	// int n4 = n3 + 1;
	// contentValues.put("_order", Integer.valueOf((int) n3));
	// arrayList.add((Object) ContentProviderOperation
	// .newUpdate((Uri) kf.a)
	// .withSelection("_id=?", new String[] { string })
	// .withValues(contentValues).withYieldAllowed(true).build());
	// n3 = n4;
	// } while (true);
	// }
	// public void a(List list, int i, int j, lo lo1)
	// {
	// super.a(list, i, j, lo1);
	// if (!vk.a(list))
	// {
	// final ContentResolver contentresolver =
	// SwipeApplication.e().getContentResolver();
	// final ArrayList arraylist = new ArrayList(list.size());
	// Iterator iterator = list.iterator();
	// i = 0;
	// do
	// {
	// if (!iterator.hasNext())
	// {
	// break;
	// }
	// Object obj = (mt)iterator.next();
	// if (obj instanceof mr)
	// {
	// obj = (mr)obj;
	// ContentValues contentvalues = new ContentValues(1);
	// j = ((mr) (obj)).j().b;
	// contentvalues.put("_order", Integer.valueOf(i));
	// arraylist.add(ContentProviderOperation.newUpdate(kf.a).withSelection("_id=?",
	// new String[] {
	// String.valueOf(j)
	// }).withValues(contentvalues).withYieldAllowed(true).build());
	// i++;
	// }
	// } while (true);
	// ui.a(new Runnable() {
	//
	// final ContentResolver a;
	// final ArrayList b;
	// final my c;
	//
	// public void run()
	// {
	// try
	// {
	// a.applyBatch("com.lazyswipe", b);
	// }
	// catch (Throwable throwable)
	// {
	// Log.w("Swipe.RecentsTab", "Failed to update contact orders", throwable);
	// }
	// pv.a(SwipeApplication.e(), true);
	// }
	//
	//
	// {
	// c = my.this;
	// a = contentresolver;
	// b = arraylist;
	// // super();
	// }
	// });
	// if (lo1 != null)
	// {
	// lo1.a(c);
	// return;
	// }
	// }
	// }
	public void a(List var1, int var2, int var3, lo var4) {
		if (!vk.a(var1)) {
			super.a(var1, var2, var3, var4);
			if (!vk.a((Collection) var1)) {
				final ContentResolver var7 = SwipeApplication.e()
						.getContentResolver();
				final ArrayList var8 = new ArrayList(var1.size());
				Iterator var11 = var1.iterator();
				var2 = 0;

				while (var11.hasNext()) {
					mr var9 = (mr) var11.next();
					if (var9 instanceof mr) {
						mr var12 = (mr) var9;
						ContentValues var10 = new ContentValues(1);
						long var5 = var12.j().b;
						var10.put("_order", Integer.valueOf(var2));
						var8.add(ContentProviderOperation
								.newUpdate(kf.a)
								.withSelection("_id=?",
										new String[] { String.valueOf(var5) })
								.withValues(var10).withYieldAllowed(true)
								.build());
						++var2;
					}
				}

				ui.a(new Runnable() {
					public void run() {
						try {
							var7.applyBatch("com.lazyswipe", var8);
						} catch (Throwable var2) {
							Log.w("Swipe.RecentsTab",
									"Failed to update contact orders", var2);
						}

						pv.a(SwipeApplication.e(), true);
					}
				});
				if (var4 != null) {
					var4.a(this.c);
					return;
				}
			}
		}

	}

	@Override
	public String b() {
		return "recentlyUsed";
	}

	@Override
	public int c() {
		return 1;
	}

}