/*
o * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.text.Collator
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.lazyswipe.ui.chooser;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.ui.RateView;
import com.lazyswipe.zev.R;
import com.main.nc;
import com.main.ne;
import com.main.rc;
import com.main.re;
import com.main.sl;
import com.main.so;

/*
 * Failed to analyse overrides
 */
public class MultiSwitchersChooserPanel extends sl {
	List l;
	Collator m;
	Comparator n;
	private List o;

	public MultiSwitchersChooserPanel(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
	}

	static List a(MultiSwitchersChooserPanel multiswitcherschooserpanel) {
		return multiswitcherschooserpanel.o;
	}

	// public void a() {
	// super.a();
	// this.m = Collator.getInstance();
	// this.m.setDecomposition(1);
	// this.m.setStrength(0);
	// this.n = new Comparator() {
	//
	// public int a(so so, so so2) {
	// boolean bl = MultiSwitchersChooserPanel.this.o
	// .contains((Object) so.a.a());
	// if (bl == MultiSwitchersChooserPanel.this.o
	// .contains((Object) so2.a.a())) {
	// return MultiSwitchersChooserPanel.this.m.compare(so.b,
	// so2.b);
	// }
	// if (bl) {
	// return -1;
	// }
	// return 1;
	// }
	//
	// public/* synthetic */int compare(Object object, Object object2) {
	// return this.a((so) object, (so) object2);
	// }
	// };
	// Map<re, re> map = rc.j(this.getContext());
	// this.l = new ArrayList(map.size());
	// for (re re : map.values()) {
	// this.l.add((Object) new so(re, this.getContext().getString(re.b())));
	// }
	// this.a = this.l.size();
	// this.o = rc.b(this.getContext(), false);
	// this.d = nc.f();
	// this.e = Math.min((int) this.d, (int) this.o.size());
	// Collections.sort((List) this.l, (Comparator) this.n);
	// }
	public void a() {
		super.a();
		m = Collator.getInstance();
		m.setDecomposition(1);
		m.setStrength(0);
		n = new Comparator() {

			final MultiSwitchersChooserPanel a;

			public int a(so so1, so so2) {
				boolean flag = MultiSwitchersChooserPanel.a(a).contains(
						so1.a.a());
				if (flag == MultiSwitchersChooserPanel.a(a).contains(so2.a.a())) {
					return a.m.compare(so1.b, so2.b);
				}
				return !flag ? 1 : -1;
			}

			public int compare(Object obj1, Object obj2) {
				return a((so) obj1, (so) obj2);
			}

			{
				a = MultiSwitchersChooserPanel.this;
				// super();
			}
		};
		Object obj = rc.j(getContext());
		l = new ArrayList(((Map) (obj)).size());
		re re1;
		for (obj = ((Map) (obj)).values().iterator(); ((Iterator) (obj))
				.hasNext(); l.add(new so(re1, getContext().getString(re1.b())))) {
			re1 = (re) ((Iterator) (obj)).next();
		}

		a = l.size();
		o = rc.b(getContext(), false);
		d = nc.f();
		e = Math.min(d, o.size());
		Collections.sort(l, n);
	}

	public void a(FanItem fanItem) {
		super.a(fanItem);
		fanItem.a.setBackgroundDrawable(ne.c(SwipeApplication.e()));
	}

	public void a(FanItem fanitem, int i) {
		so so1 = (so) l.get(i);
		fanitem.a(so1.a.c(), so1.b);
		super.a(fanitem, i);
	}

	public void c() {
		super.c();
		for (int i = 0; i < e; i++) {
			b[i] = true;
			c[i] = true;
		}

	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	@SuppressWarnings("rawtypes")
	// public void e() {
	// ArrayList var2_2 = new ArrayList();
	// ArrayList var3_3 = new ArrayList();
	// List var1_1 = null;
	// if (this.e > 0) {
	// var1_1 = rc.b(this.getContext(), false);
	//
	// } else {
	// rc.c(this.getContext(), "");
	// // lbl7: // 2 sources:
	// do {
	// super.e();
	// RateView.e();
	// rc.r();
	// SwipeService.q();
	// return;
	// // break;
	// } while (true);
	// }
	// for (int var4_4 = 0; var4_4 < this.a; ++var4_4) {
	// so var9_5 = (so) this.l.get(var4_4);
	// if (!this.b[var4_4] && this.c[var4_4]) {
	// var3_3.add((Object) var9_5.a.a());
	// continue;
	// }
	// if (!this.b[var4_4] || this.c[var4_4])
	// continue;
	// var2_2.add((Object) var9_5.a.a());
	// }
	// Iterator var5_6 = var1_1.iterator();
	// while (var5_6.hasNext()) {
	// if (!var3_3.contains((Object) ((String) var5_6.next())))
	// continue;
	// var5_6.remove();
	// }
	// Iterator var6_7 = var2_2.iterator();
	// while (var6_7.hasNext()) {
	// var1_1.add((Object) ((String) var6_7.next()));
	// }
	// String var7_8 = rc.a(var1_1);
	// rc.c(this.getContext(), var7_8);
	// while (true)
	// ;
	// }
	public void e() {
		if (e > 0) {

			Object obj = rc.b(getContext(), false);
			Object obj1 = new ArrayList();
			ArrayList arraylist = new ArrayList();
			int i = 0;
			while (i < a) {
				so so1 = (so) l.get(i);
				if (!b[i] && c[i]) {
					arraylist.add(so1.a.a());
				} else if (b[i] && !c[i]) {
					((List) (obj1)).add(so1.a.a());
				}
				i++;
			}
			Iterator iterator = ((List) (obj)).iterator();
			do {
				if (!iterator.hasNext()) {
					break;
				}
				if (arraylist.contains((String) iterator.next())) {
					iterator.remove();
				}
			} while (true);
			for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1))
					.hasNext(); ((List) (obj)).add((String) ((Iterator) (obj1))
					.next())) {
			}
			obj = rc.a(((List) (obj)));
			rc.c(getContext(), ((String) (obj)));
			// if (true) goto _L4; else goto _L3

		} else {
			rc.c(getContext(), "");
		}

		// _L4:
		super.e();
		RateView.e();
		rc.r();
		SwipeService.q();
		return;

	}

	// public void l() {
	// TextView textView = this.f;
	// Context context = this.getContext();
	// Object[] arrobject = new Object[] { this.e, this.d };
	// textView.setText((CharSequence) context.getString(
	// R.string.title_select_switchers_with_count, arrobject));
	// }
	public void l() {
		f.setText(getContext().getString(0x7f0f00af,
				new Object[] { Integer.valueOf(e), Integer.valueOf(d) }));
	}
}
