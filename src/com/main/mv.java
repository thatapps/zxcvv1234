package com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import android.content.Context;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.zev.R;

public class mv extends mp {
	@SuppressWarnings("rawtypes")
	private void a(js js, List list) {
		jq jq;
		nr nr;
		ArrayList arrayList = js.a();
		if (vk.a((Collection) arrayList)) {
			return;
		}
		Iterator iterator = arrayList.iterator();
		do {
			boolean bl = iterator.hasNext();
			nr = null;
			if (!bl)
				return;
			jq = (jq) iterator.next();
		} while (!js.a.a(jq.h) || list.contains((Object) jq));
		nr = new nr(jq);
		if (nr == null)
			return;
		int n = oy.a() ? 3 : mv.f();
		if (this.c.size() < n) {
			this.c.add((Object) nr);
			return;
		}
		List list2 = this.c;
		int n2 = oy.a() ? 2 : -1 + this.c.size();
		list2.set(n2, (Object) nr);
	}

	public String a(Context paramContext) {
		return paramContext.getString(R.string.tab_name_mostly_used);
	}

	public void a(SwipeApplication swipeApplication) {
		if (this.c != null) {
			return;
		}
		js js = swipeApplication.b();
		int n = mv.f();
		List list = js.a(n * 3);
		this.c = new ArrayList(n);
		if (!vk.a((Collection) list)) {
			boolean bl = true;
			int n2 = list.size();
			int n3 = 0;
			for (int i = 0; n3 < n && i < n2; ++i) {
				int n4;
				jq jq = (jq) list.get(i);
				if (!jq.a()) {
					if (n3 <= 0) {
						bl = false;
					}
					if (bl)
						break;
				}
				if (!js.a.a(jq.h)) {
					n4 = n3;
				} else {
					this.c.add((Object) new mo(jq));
					n4 = n3 + 1;
				}
				n3 = n4;
			}
		}
		if (NewGuide.j()) {
			this.a(js, list);
		}
		list.clear();
	}

	// public void a(SwipeApplication swipeapplication) {
	// List list;
	// int k;
	// int i;
	// boolean flag;
	// int j;
	// int l;
	// if (c != null) {
	// return;
	// }
	// js js = swipeapplication.b();
	// k = f();
	// list = js.a(k * 3);
	// c = new ArrayList(k);
	// if (vk.a(list)) {
	//
	// if (NewGuide.j()) {
	// a(((js) (js)), list);
	// }
	// list.clear();
	// return;
	//
	// } else {
	//
	// flag = true;
	// l = list.size();
	// j = 0;
	// i = 0;
	//
	// }
	//
	// // _L7:
	// if (i >= k || j >= l) {
	// if (NewGuide.j()) {
	// a(((js) (js)), list);
	// }
	// list.clear();
	// return;
	//
	// } else {
	// jq jq1;
	// boolean flag1;
	// jq1 = (jq) list.get(j);
	// flag1 = flag;
	// if (jq1.a()) {
	//
	// if (((js) (js)).a.a(jq1.h)) {
	// c.add(new mo(jq1));
	// i++;
	// }
	// j++;
	// flag = flag1;
	// // if (true) goto _L7; else goto _L6
	//
	// } else {
	// if (i <= 0) {
	// flag = false;
	// }
	// flag1 = flag;
	// if (!flag) {
	//
	// if (((js) (js)).a.a(jq1.h)) {
	// c.add(new mo(jq1));
	// i++;
	// }
	// j++;
	// flag = flag1;
	// // if (true) goto _L7; else goto _L6
	//
	// } else {
	//
	// if (NewGuide.j()) {
	// a(((js) (js)), list);
	// }
	// list.clear();
	// return;
	//
	// }
	// }
	//
	// }
	// }


	public void a(List list, int n, int n2, lo lo) {
		super.a(list, n, n2, lo);
		if (vk.a((Collection) list)) {
			return;
		}
		int n3 = Math.min((int) Math.max((int) n, (int) n2), (int) list.size());
		int n4 = 0;
		do {
			jq jq;
			if (n4 >= list.size()) {
				if (lo == null)
					return;
				lo.a(this.c);
				return;
			}
			mt mt = (mt) list.get(n4);
			if (mt != null && (jq = mt.h()) != null) {
				boolean bl;
				if (n4 <= n3) {
					jq.f = 2147483547 + (nc.f() - n4);
					bl = true;
				} else if (jq.f == Integer.MAX_VALUE) {
					jq.f = 2147483547;
					bl = true;
				} else {
					bl = false;
				}
				if (bl) {
					SwipeApplication.e().b().c(jq);
				}
			}
			++n4;
		} while (true);
	}

	public String b() {
		return "mostUsed";
	}

	public int c() {
		return 4;
	}
}
