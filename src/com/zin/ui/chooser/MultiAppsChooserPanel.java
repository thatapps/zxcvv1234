//zevienin

package com.lazyswipe.ui.chooser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.util.Log;

import com.flurry.sdk.iz;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.ui.RateView;
import com.main.bx;
import com.main.ir;
import com.main.jq;
import com.main.js;
import com.main.ki;
import com.main.oe;
import com.main.oy;
import com.main.sh;
import com.main.si;
import com.main.sl;
import com.main.ui;
import com.main.vj;
import com.main.vk;

public class MultiAppsChooserPanel extends sl {

	private List l;
	private boolean m;
	private int n;
	private List o;
	private List p;
	private Map q;
	private final Comparator r = new Comparator() {

		final MultiAppsChooserPanel a;

		public int a(jq jq1, jq jq2) {
			boolean flag = MultiAppsChooserPanel.a(a).contains(jq1.h);
			if (flag == MultiAppsChooserPanel.a(a).contains(jq2.h)) {
				return vk.a.compare(jq1.b, jq2.b);
			}
			return !flag ? 1 : -1;
		}

		public int compare(Object obj, Object obj1) {
			return a((jq) obj, (jq) obj1);
		}

		{
			a = MultiAppsChooserPanel.this;
			// super();
		}
	};

	public MultiAppsChooserPanel(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		o = Collections.emptyList();
		p = new ArrayList();
	}

	static List a(MultiAppsChooserPanel multiappschooserpanel) {
		return multiappschooserpanel.o;
	}

	private void a(List list) {
		List list1 = l;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); list1
				.remove((String) iterator.next())) {
		}
		list1 = o;
		if (!o.isEmpty()) {
			Iterator iterator1 = list.iterator();
			do {
				if (!iterator1.hasNext()) {
					break;
				}
				String s = (String) iterator1.next();
				if (list1.remove(s)) {
					p.add(s);
				}
			} while (true);
		}
		list.clear();
	}

	private void a(js js1) {
		// n;
		// JVM INSTR tableswitch 1 3: default 32
		// 1 41
		// 2 50
		// 3 50;
		// goto _L1 _L2 _L3 _L3

		switch (n) {
		default:

			l = js1.a();
			break;
		case 1:

			l = js1.c();
			return;
		case 2:

			l = js1.b();
			PackageManager packageManager = getContext().getPackageManager();
			q = new HashMap(l.size());
			Iterator iterator = l.iterator();
			while (iterator.hasNext()) {
				String s = (String) iterator.next();
				try {
					ApplicationInfo applicationinfo = packageManager
							.getApplicationInfo(s, 0);
					q.put(s, applicationinfo.loadLabel(packageManager));
				} catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) {
				}
			}
			return;
		case 3:

			l = js1.b();
			PackageManager packageManager1 = getContext().getPackageManager();
			q = new HashMap(l.size());
			Iterator iterator1 = l.iterator();
			while (iterator1.hasNext()) {
				String s = (String) iterator1.next();
				try {
					ApplicationInfo applicationinfo = packageManager1
							.getApplicationInfo(s, 0);
					q.put(s, applicationinfo.loadLabel(packageManager1));
				} catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) {
				}
			}
			return;

		}

	}

	private void a(js js1, List list) {
		Iterator iterator = list.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			jq jq1 = js1.a((ComponentName) iterator.next());
			if (jq1 != null) {
				l.remove(jq1);
			}
		} while (true);
		list.clear();
	}

	private void b(List list) {
		List list1 = l;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); list1
				.remove((String) iterator.next())) {
		}
		list.clear();
	}

	private void b(js js1) {
		Object obj = getIntent();
		j = (PendingIntent) ((Intent) (obj))
				.getParcelableExtra("extra.ok_action");
		k = (PendingIntent) ((Intent) (obj))
				.getParcelableExtra("extra.cancel_action");
		List list = l;
		if (n == 0) {
			d = -1;
			List list2 = ir.c();
			if (list2 != null && list2.size() > 0) {
				for (obj = list2.iterator(); ((Iterator) (obj)).hasNext(); jq
						.a(list, (String) ((Iterator) (obj)).next())) {
				}
				list2.clear();
			}
			List list3 = ir.d();
			if (list3 != null && list3.size() > 0) {
				for (obj = list3.iterator(); ((Iterator) (obj)).hasNext(); jq
						.a(list, (String) ((Iterator) (obj)).next())) {
				}
				list3.clear();
			}
		} else if (3 == n) {
			d = -1;
			List list2 = vk.e(getContext());
			list2.add("com.lazyswipe");
			if (js1 != null) {
				l.removeAll(list2);
				return;
			}
		} else {
			d = ((Intent) (obj)).getIntExtra("extra.request_max_count", -1);
			m = ((Intent) (obj)).getBooleanExtra(
					"extra.request_exclude_existings", false);
			if (2 == n) {
				String as[] = ((Intent) (obj))
						.getStringArrayExtra("extra.request_existing_list");
				if (as != null && as.length > 0) {
					o = new ArrayList(Arrays.asList(as));
				}
			} else {
				o = ((Intent) (obj))
						.getParcelableArrayListExtra("extra.request_existing_list");
			}
			if (o != null) {
				if (m) {
					d = d - o.size();
					a(js1, o);
				}
			} else {
				o = Collections.emptyList();
			}
			if (2 == n) {
				ArrayList arrayList = ((Intent) (obj))
						.getStringArrayListExtra("extra.request_exclude_list");
				if (arrayList != null) {
					b(((List) (arrayList)));
				}
				ArrayList arrayList2 = ((Intent) (obj))
						.getStringArrayListExtra("extra.request_invisible_list");
				if (arrayList2 != null) {
					a(arrayList2);
				}
			}
			e = o.size();
			return;
		}
	}

	private void m() {
		if (h != null) {
			h.d();
		}
	}

	public void a() {
		super.a();
		js js1 = SwipeApplication.e().b();
		if (!js1.b) {
			m();
		} else {
			n = getIntent().getIntExtra("extra.request_type", -1);
			a(js1);
			if (l == null || l.size() <= 0) {
				m();
				return;
			}
			b(js1);
			a = l.size();
			if (a <= 0) {
				m();
				return;
			}
		}
	}

	public void a(FanItem fanitem, int i) {
		if (2 != n && 3 != n) {
			jq jq1 = (jq) l.get(i);
			if (oy.a()) {
				fanitem.setIcon(jq1.h.getPackageName());
			} else {
				fanitem.setIcon(jq1);
			}
			fanitem.setText(jq1.b);
		} else {
			String s = (String) l.get(i);
			fanitem.setIcon(s);
			fanitem.setText((CharSequence) q.get(s));
		}
		super.a(fanitem, i);
	}

	public void b() {
		try {
			super.b();
		} catch (Throwable throwable) {
			Log.w("Swipe.MultiChooserPanel",
					(new StringBuilder()).append("onDestroy failed: ")
							.append(throwable.getMessage()).toString());
		}
		if (l != null) {
			l.clear();
		}
		if (q != null) {
			q.clear();
		}
	}

	// public void c() {
	// List list;
	// super.c();
	// int i;
	// Object obj = ir.R(getContext());
	// e = 0;
	// list = l;
	// if (n != 0) {
	// if (3 != n) {
	// return;
	// // break MISSING_BLOCK_LABEL_258;
	// }
	// obj = new ArrayList(oe.a());
	// Collections.sort(l, new si(((List) (obj)), q));
	// if (obj == null || ((List) (obj)).size() <= 0) {
	//
	// if (e > 0) {
	// Arrays.fill(b, 0, e, true);
	// Arrays.fill(c, 0, e, true);
	// }
	// return;
	//
	// } else {
	//
	// i = Math.min(((List) (obj)).size(), list.size()) - 1;
	//
	// }
	//
	// } else {
	//
	// if (obj == null || ((List) (obj)).size() <= 0) {
	//
	// if (e > 0) {
	// Arrays.fill(b, 0, e, true);
	// Arrays.fill(c, 0, e, true);
	// }
	// return;
	//
	// } else {
	//
	// Collections.sort(list, new sh(((List) (obj))));
	// i = Math.min(((List) (obj)).size(), list.size()) - 1;
	//
	// }
	//
	// }
	//
	// // _L8:
	// if (i < 0) {
	// if (e > 0) {
	// Arrays.fill(b, 0, e, true);
	// Arrays.fill(c, 0, e, true);
	// }
	// return;
	//
	// } else {
	// if (!((List) (obj)).contains(((jq) list.get(i)).h.getPackageName())) {
	// i--;
	// // goto _L8
	//
	// } else {
	//
	// e = i + 1;
	//
	// }
	//
	// }
	//
	// // _L10:
	// if (i >= 0) {
	//
	// if (!((List) (obj)).contains(l.get(i))) {
	// // break label0;
	// }
	// e = i + 1;
	//
	// }
	// // goto _L4
	// i--;
	// // goto _L10
	// if (2 == n) {
	// Collections.sort(l, new si(o, q));
	// } else {
	// Collections.sort(list, r);
	// }
	// if (m || o == null) {
	//
	// if (e > 0) {
	// Arrays.fill(b, 0, e, true);
	// Arrays.fill(c, 0, e, true);
	// }
	// return;
	//
	// } else {
	// if (n == 2) {
	// // break MISSING_BLOCK_LABEL_397;
	// }
	// i = Math.min(o.size(), list.size()) - 1;
	//
	// }
	//
	// // _L12:
	//
	// while (i >= 0) {
	// if (o.contains(((jq) list.get(i)).h)) {
	// // break label1;
	// e = i + 1;
	// }
	// i--;
	//
	// }
	// o.clear();
	//
	// // goto _L4
	//
	// // goto _L12
	// i = Math.min(o.size(), list.size()) - 1;
	// // _L13:
	//
	// while (i >= 0) {
	// if (o.contains(l.get(i))) {
	// // break label2;
	// e = i + 1;
	// }
	// i--;
	// }
	// o = null;
	//
	// // goto _L4
	//
	// // goto _L13
	// }
	public void c() {
		super.c();
		this.e = 0;
		List var2 = this.l;
		int var1;
		if (this.n == 0) {
			List var3 = ir.R(this.getContext());
			if (var3 != null && var3.size() > 0) {
				Collections.sort(var2, new sh(var3));

				for (var1 = Math.min(var3.size(), var2.size()) - 1; var1 >= 0; --var1) {
					if (var3.contains(((jq) var2.get(var1)).h.getPackageName())) {
						this.e = var1 + 1;
						break;
					}
				}
			}
		} else if (3 == this.n) {
			ArrayList var4 = new ArrayList(oe.a());
			Collections.sort(this.l, new si(var4, this.q));
			if (var4 != null && var4.size() > 0) {
				for (var1 = Math.min(var4.size(), var2.size()) - 1; var1 >= 0; --var1) {
					if (var4.contains(this.l.get(var1))) {
						this.e = var1 + 1;
						break;
					}
				}
			}
		} else {
			if (2 == this.n) {
				Collections.sort(this.l, new si(this.o, this.q));
			} else {
				Collections.sort(var2, this.r);
			}

			if (!this.m && this.o != null) {
				if (this.n != 2) {
					for (var1 = Math.min(this.o.size(), var2.size()) - 1; var1 >= 0; --var1) {
						if (this.o.contains(((jq) var2.get(var1)).h)) {
							this.e = var1 + 1;
							break;
						}
					}

					this.o.clear();
				} else {
					for (var1 = Math.min(this.o.size(), var2.size()) - 1; var1 >= 0; --var1) {
						if (this.o.contains(this.l.get(var1))) {
							this.e = var1 + 1;
							break;
						}
					}

					this.o = null;
				}
			}
		}

		if (this.e > 0) {
			Arrays.fill(this.b, 0, this.e, true);
			Arrays.fill(this.c, 0, this.e, true);
		}

	}

	public void d() {
		super.d();
		if (2 != n) {

			if (3 == n) {
				a(0x7f0f0059);
			}
			// if (true) goto _L4; else goto _L3
			if (d > 0) {
				l();
			}
			return;

		} else {
			a(0x7f0f00ad);
		}

	}

	// public void e() {
	// Object obj;
	// int i;
	// int j;
	// final StringBuilder stringBuilder = new StringBuilder();
	// Iterator iterator = p.iterator();
	// ArrayList arraylist = new ArrayList();
	// ArrayList arraylist1 = new ArrayList();
	// final StringBuilder stringbuilder1 = new StringBuilder();
	// final StringBuilder stringbuilder2 = new StringBuilder();
	// i = 0;
	// Object obj1 = null;
	// j = 0;
	// obj = l;
	// if (n != 0) {
	//
	// if (1 == n) {
	// RateView.e();
	//
	// i = 0;
	// while (i < a) {
	// jq jq1 = (jq) ((List) (obj)).get(i);
	// if (!b[i] && c[i]) {
	// jq1.f = 0;
	// arraylist1.add(jq1);
	// if (stringbuilder2.length() > 0) {
	// stringbuilder2.append(",");
	// }
	// stringbuilder2.append(jq1.a);
	// } else if (b[i] && !jq1.a()) {
	// jq1.f = 0x7fffff9b;
	// arraylist.add(jq1);
	// if (stringbuilder1.length() > 0) {
	// stringbuilder1.append(",");
	// }
	// stringbuilder1.append(jq1.a);
	// }
	// i++;
	// }
	// if (arraylist.size() > 0) {
	// stringbuilder1.insert(0, "(");
	// stringbuilder1.append(")");
	// }
	// if (arraylist1.size() > 0) {
	// stringbuilder2.insert(0, "(");
	// stringbuilder2.append(")");
	// }
	// if (arraylist.size() > 0 || arraylist1.size() > 0) {
	// ui.a(new Runnable() {
	//
	// final StringBuilder a;
	// final StringBuilder b;
	// final MultiAppsChooserPanel c;
	//
	// public void run() {
	// if (a.length() > 0) {
	// ContentValues contentvalues = new ContentValues(
	// 1);
	// contentvalues.put("called_num",
	// Integer.valueOf(0x7fffff9b));
	// String str = a.toString();
	// try {
	// c.getContext()
	// .getContentResolver()
	// .update(ki.a,
	// contentvalues,
	// (new StringBuilder())
	// .append("_id IN ")
	// .append(((String) (str)))
	// .toString(), null);
	// } catch (Throwable throwable1) {
	// vj.a("Swipe.MultiChooserPanel",
	// (new StringBuilder())
	// .append("Failed to update called count for apps ")
	// .append(((String) (str)))
	// .toString(), throwable1);
	// }
	// }
	// if (b.length() > 0) {
	// ContentValues values = new ContentValues(1);
	// ((ContentValues) (values)).put("called_num",
	// Integer.valueOf(0));
	// try {
	// c.getContext()
	// .getContentResolver()
	// .update(ki.a,
	// ((ContentValues) (values)),
	// (new StringBuilder())
	// .append("_id IN ")
	// .append(b
	// .toString())
	// .toString(), null);
	// } catch (Throwable throwable) {
	// }
	// }
	// c.getContext().startService(
	// SwipeService.d(c.getContext()));
	// }
	//
	// {
	// c = MultiAppsChooserPanel.this;
	// a = stringBuilder;
	// b = stringbuilder1;
	// // super();
	// }
	// });
	// return;
	// } else {
	// SwipeService.q();
	// return;
	// }
	// }
	// if (2 != n) {
	// // continue; /* Loop/switch isn't completed */
	// }
	// if (e <= 0) {
	// return;
	// }
	//
	// for (i = 0; iterator.hasNext(); i++) {
	// ((StringBuilder) (obj)).append((String) iterator.next())
	// .append(',');
	// }
	//
	// boolean flag = false;
	// int k = i;
	// for (i = ((flag) ? 1 : 0); i < a;) {
	// int j1 = k;
	// if (b[i]) {
	// ((StringBuilder) (obj)).append(l.get(i)).append(',');
	// j1 = k + 1;
	// }
	// i++;
	// k = j1;
	// }
	//
	// i = ((StringBuilder) (obj)).length();
	// if (i <= 0) {
	// // break MISSING_BLOCK_LABEL_691;
	// return;
	// }
	// obj = ((StringBuilder) (obj)).substring(0, i - 1);
	//
	// } else {
	//
	// StringBuilder stringbuilder = new StringBuilder();
	// i = 0;
	// for (; j < a; j++) {
	// if (b[j]) {
	// i++;
	// stringbuilder.append(
	// ((jq) ((List) (obj)).get(j)).h.getPackageName())
	// .append(',');
	// }
	// }
	//
	// obj = stringbuilder.toString();
	// ir.f(getContext(), ((String) (obj)));
	//
	// }
	//
	// ir.d(getContext(), ((String) (obj)));
	//
	// if (3 != n) {
	//
	// return;
	// } else {
	// obj = new ArrayList();
	// int k1;
	// for (int i1 = 0; i < a; i1 = k1) {
	// k1 = i1;
	// if (b[i]) {
	// ((List) (obj)).add((String) l.get(i));
	// k1 = i1 + 1;
	// }
	// i++;
	// }
	//
	// oe.a(((java.util.Collection) (obj)));
	// bx.a(getContext()).a(
	// new Intent("BROADCAST_ACTION_CHOOSE_POP_BLACK_LIST"));
	// return;
	//
	// }
	// }

	public void e() {
		int var1 = 0;
		int var2 = 0;
		List var4 = this.l;
		String var11 = null;
		if (this.n == 0) {
			StringBuilder var5 = new StringBuilder();

			for (var1 = 0; var2 < this.a; ++var2) {
				if (this.b[var2]) {
					++var1;
					var5.append(((jq) var4.get(var2)).h.getPackageName())
							.append(',');
				}
			}

			var11 = var5.toString();
			ir.f(this.getContext(), var11);
		} else {
			if (1 == this.n) {
				RateView.e();
				final ArrayList var15 = new ArrayList();
				ArrayList var6 = new ArrayList();
				final StringBuilder var7 = new StringBuilder();
				final StringBuilder var8 = new StringBuilder();

				for (var1 = 0; var1 < this.a; ++var1) {
					jq var9 = (jq) var4.get(var1);
					if (!this.b[var1] && this.c[var1]) {
						var9.f = 0;
						var6.add(var9);
						if (var8.length() > 0) {
							var8.append(",");
						}

						var8.append(var9.a);
					} else if (this.b[var1] && !var9.a()) {
						var9.f = 2147483547;
						var15.add(var9);
						if (var7.length() > 0) {
							var7.append(",");
						}

						var7.append(var9.a);
					}
				}

				if (var15.size() > 0) {
					var7.insert(0, "(");
					var7.append(")");
				}

				if (var6.size() > 0) {
					var8.insert(0, "(");
					var8.append(")");
				}

				if (var15.size() <= 0 && var6.size() <= 0) {
					SwipeService.l();
					return;
				}

				ui.a(new Runnable() {
					public void run() {
						if (var7.length() > 0) {
							ContentValues var2 = new ContentValues(1);
							var2.put("called_num", Integer.valueOf(2147483547));
							String var1 = var7.toString();

							try {
								MultiAppsChooserPanel.this
										.getContext()
										.getContentResolver()
										.update(ki.a, var2, "_id IN " + var1,
												(String[]) null);
							} catch (Throwable var4) {
								vj.a("Swipe.MultiChooserPanel",
										"Failed to update called count for apps "
												+ var1, var4);
							}

							Iterator var5 = var15.iterator();

							while (var5.hasNext()) {
								jq var7x = (jq) var5.next();
								/*if (AllAppsActivity.class.getName().equals(
										var7x.h.getClassName())) {
									iz.a().a((String) "AllApps added");
									break;
								}*/
							}
						}

						if (var8.length() > 0) {
							ContentValues var6 = new ContentValues(1);
							var6.put("called_num", Integer.valueOf(0));

							try {
								MultiAppsChooserPanel.this
										.getContext()
										.getContentResolver()
										.update(ki.a, var6,
												"_id IN " + var8.toString(),
												(String[]) null);
							} catch (Throwable var3) {
								
							}
						}

						MultiAppsChooserPanel.this.getContext().startService(
								SwipeService.d(MultiAppsChooserPanel.this
										.getContext()));
					}
				});
				return;
			}

			int var3;
			if (2 == this.n) {

				if (this.e > 0) {
					StringBuilder var13 = new StringBuilder();
					Iterator var14 = this.p.iterator();

					for (var1 = 0; var14.hasNext(); ++var1) {
						var13.append((String) var14.next()).append(',');
					}

					byte var10 = 0;
					var2 = var1;

					for (var1 = var10; var1 < this.a; var2 = var3) {
						var3 = var2;
						if (this.b[var1]) {
							var13.append(this.l.get(var1)).append(',');
							var3 = var2 + 1;
						}

						++var1;
					}

					var1 = var13.length();
					if (var1 > 0) {
						var11 = var13.substring(0, var1 - 1);

					}
				}

				//var11 = "";

				ir.d(this.getContext(), var11);
				return;
			}

			if (3 == this.n) {
				ArrayList var12 = new ArrayList();

				for (var2 = 0; var1 < this.a; var2 = var3) {
					var3 = var2;
					if (this.b[var1]) {
						var12.add((String) this.l.get(var1));
						var3 = var2 + 1;
					}

					++var1;
				}

				oe.a((Collection) var12);
				bx.a((Context) this.getContext()).a(
						(Intent) (new Intent(
								"BROADCAST_ACTION_CHOOSE_POP_BLACK_LIST")));
				return;
			}
		}

	}
}
