//zevienin

package com.lazyswipe.fan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

import com.main.lk;
import com.main.ln;
import com.main.ls;
import com.main.mf;
import com.main.mg;
import com.main.mn;
import com.main.mt;
import com.main.nc;

// Referenced classes of package com.lazyswipe.fan:
//            FanItem, ItemSector, Fan, DeleteZone

public class FanLayer extends lk implements android.view.View.OnClickListener,
		android.view.View.OnLongClickListener {

	private static final String g = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.fan.FanLayer.class.getSimpleName())
			.toString();
	boolean e;
	public DeleteZone f;
	private nc h;
	private boolean i;
	private boolean j;
	private boolean k;
	private ln l;
	private ArrayList m;
	private mn n;
	private Runnable o;

	public FanLayer(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		m = new ArrayList();
		o = new Runnable() {

			final FanLayer a;

			public void run() {
				while (Fan.getInstance() == null || !a.d || FanLayer.a(a).d()
						|| a.e) {
					return;
				}
				a.g();
			}

			{
				a = FanLayer.this;
				// super();
			}
		};
		n = new mn("", getResources().getDrawable(0x7f020030));
		l = new ln(this);
	}

	private FanItem a(mt mt1, boolean flag, boolean flag1) {
		FanItem fanitem = (FanItem) LayoutInflater.from(getContext()).inflate(
				0x7f040019, this, false);
		b(fanitem, mt1, flag1);
		if (flag && mt1 != null && mt1 != n) {
			fanitem.b();
		}
		return fanitem;
	}

	static ln a(FanLayer fanlayer) {
		return fanlayer.l;
	}

	public void a(int i1) {
		b(false);
		int k1 = Math.min(i1, m.size());
		for (int j1 = 0; j1 < k1; j1++) {
			FanItem fanitem = (FanItem) m.get(j1);
			attachViewToParent(fanitem, j1,
					fanitem.a(j1, mf.a(j1, i1, c), false));
		}

		requestLayout();
		((ItemSector) getParent()).a(h.g(), i1);
	}

	public void a(View view) {
		l.a(view);
	}

	public void a(FanItem fanitem) {
		fanitem.e();
		m.remove(fanitem);
		detachViewFromParent(fanitem);
		g();
		k();
	}

	void a(mg mg) {
		if (android.os.Build.VERSION.SDK_INT >= 11) {
			setLayerType(0, null);
		}
		int j1 = m.size();
		Iterator iterator = m.iterator();
		for (int i1 = 0; iterator.hasNext(); i1++) {
			((View) iterator.next()).startAnimation(ls.a(i1, mf.a(i1, j1, c),
					mg));
		}

	}

	public void a(nc nc1, List list, mg mg, boolean flag, boolean flag1) {
		a(nc1, list, mg, flag, flag1, d);
	}

	// void a(nc nc1, List list, mg mg, boolean flag, boolean flag1, boolean
	// flag2)
	// {
	// int i1;
	// d = flag2;
	// h = nc1;
	// String str = h.b();
	// i1 = -1;
	// str.hashCode();
	//
	// //JVM INSTR lookupswitch 3: default 60
	// // -176414240: 358
	// // -85276959: 374
	// // 2095953157: 342;
	// // goto _L1 _L2 _L3 _L4
	//
	//
	// switch(str.hashCode()){
	// default:
	// break;
	//
	//
	// case -176414240:
	// if (nc1.equals("mostUsed"))
	// {
	// i1 = 1;
	// }break;
	//
	//
	// case -85276959:
	// if (nc1.equals("switcher"))
	// {
	// i1 = 2;
	// }
	// break;
	// if (nc1.equals("recentlyUsed"))
	// {
	// i1 = 0;
	// }
	//
	// }
	// i1;
	// JVM INSTR tableswitch 0 2: default 88
	// // 0 390
	// // 1 408
	// // 2 426;
	// goto _L5 _L6 _L7 _L8
	// switch(){
	//
	// default :
	// nc1 = new ArrayList(list);
	// int j1;
	// int k1;
	// if (nc1.isEmpty() && d())
	// {
	// nc1.add(n);
	// e = true;
	// } else
	// {
	// e = false;
	// }
	// j1 = nc1.size();
	// b(flag1);
	// k1 = m.size();
	// list = nc1.iterator();
	// i1 = 0;
	// do
	// {
	// if (!list.hasNext())
	// {
	// break;
	// }
	// Object obj = (mt)list.next();
	// android.widget.FrameLayout.LayoutParams layoutparams;
	// if (i1 >= k1)
	// {
	// flag2 = true;
	// } else
	// {
	// flag2 = false;
	// }
	// if (flag2)
	// {
	// nc1 = a(((mt) (obj)), d, i);
	// } else
	// {
	// nc1 = (FanItem)m.get(i1);
	// b(nc1, ((mt) (obj)), i);
	// }
	// obj = mf.a(i1, j1, c);
	// layoutparams = nc1.a(i1, ((mg) (obj)), flag2);
	// if (flag2)
	// {
	// addViewInLayout(nc1, i1, layoutparams);
	// m.add(nc1);
	// } else
	// {
	// attachViewToParent(nc1, i1, layoutparams);
	// }
	// nc1.e = mg;
	// nc1.f = ((mg) (obj));
	// if (flag && !flag1 && mg != null && !Fan.n())
	// {
	// if (!flag)
	// {
	// flag2 = true;
	// } else
	// {
	// flag2 = false;
	//
	// }
	// nc1.startAnimation(ls.a(i1, mg, ((mg) (obj)), flag2));
	// }
	// i1++;
	// } while (i1 < j1);
	// if (Fan.n())
	// {
	//
	//
	// m();
	// }
	// requestLayout();
	// return;
	// case 0:
	// j = true;
	// i = false;
	// k = false;
	//
	// }
	// _L1:
	// i1;
	// JVM INSTR tableswitch 0 2: default 88
	// // 0 390
	// // 1 408
	// // 2 426;
	// goto _L5 _L6 _L7 _L8
	// _L5:
	// nc1 = new ArrayList(list);
	// int j1;
	// int k1;
	// if (nc1.isEmpty() && d())
	// {
	// nc1.add(n);
	// e = true;
	// } else
	// {
	// e = false;
	// }
	// j1 = nc1.size();
	// b(flag1);
	// k1 = m.size();
	// list = nc1.iterator();
	// i1 = 0;
	// do
	// {
	// if (!list.hasNext())
	// {
	// break;
	// }
	// Object obj = (mt)list.next();
	// android.widget.FrameLayout.LayoutParams layoutparams;
	// if (i1 >= k1)
	// {
	// flag2 = true;
	// } else
	// {
	// flag2 = false;
	// }
	// if (flag2)
	// {
	// nc1 = a(((mt) (obj)), d, i);
	// } else
	// {
	// nc1 = (FanItem)m.get(i1);
	// b(nc1, ((mt) (obj)), i);
	// }
	// obj = mf.a(i1, j1, c);
	// layoutparams = nc1.a(i1, ((mg) (obj)), flag2);
	// if (flag2)
	// {
	// addViewInLayout(nc1, i1, layoutparams);
	// m.add(nc1);
	// } else
	// {
	// attachViewToParent(nc1, i1, layoutparams);
	// }
	// nc1.e = mg;
	// nc1.f = ((mg) (obj));
	// if (flag && !flag1 && mg != null && !Fan.n())
	// {
	// if (!flag)
	// {
	// flag2 = true;
	// } else
	// {
	// flag2 = false;
	//
	// }
	// nc1.startAnimation(ls.a(i1, mg, ((mg) (obj)), flag2));
	// }
	// i1++;
	// } while (i1 < j1);
	// if (Fan.n())
	// {
	//
	//
	// m();
	// }
	// requestLayout();
	// return;
	// _L4:
	// if (nc1.equals("recentlyUsed"))
	// {
	// i1 = 0;
	// }
	// goto _L1
	// _L2:
	// if (nc1.equals("mostUsed"))
	// {
	// i1 = 1;
	// }
	// goto _L1
	// _L3:
	// if (nc1.equals("switcher"))
	// {
	// i1 = 2;
	// }
	// goto _L1
	// _L6:
	// j = true;
	// i = false;
	// k = false;
	// goto _L5
	// _L7:
	// k = true;
	// i = false;
	// j = false;
	// goto _L5
	// _L8:
	// i = true;
	// k = false;
	// j = false;
	// goto _L5
	// }
	void a(nc nc, List list, mg mg, boolean bl, boolean bl2, boolean bl3) {
		this.d = bl3;
		this.h = nc;
		String string = this.h.b();
		int n = -1;
		switch (string.hashCode()) {
		case 2095953157: {
			if (!string.equals((Object) "recentlyUsed"))
				break;
			n = 0;
			break;
		}
		case -176414240: {
			if (!string.equals((Object) "mostUsed"))
				break;
			n = 1;
			break;
		}
		case -85276959: {
			if (!string.equals((Object) "switcher"))
				break;
			n = 2;
			break;
		}
		}
		switch (n) {
		case 0: {
			this.j = true;
			this.i = false;
			this.k = false;
			break;
		}
		case 1: {
			this.k = true;
			this.i = false;
			this.j = false;
			break;
		}
		case 2: {
			this.i = true;
			this.k = false;
			this.j = false;
		}
		}
		ArrayList arrayList = new ArrayList((Collection) list);
		if (arrayList.isEmpty() && this.d()) {
			arrayList.add((Object) this.n);
			this.e = true;
		} else {
			this.e = false;
		}
		int n2 = arrayList.size();
		this.b(bl2);
		int n3 = this.m.size();
		Iterator iterator = arrayList.iterator();
		int n4 = 0;
		while (iterator.hasNext()) {
			FanItem fanItem;
			int n5;
			mt mt = (mt) iterator.next();
			boolean bl4 = n4 >= n3;
			if (bl4) {
				fanItem = this.a(mt, this.d, this.i);
			} else {
				fanItem = (FanItem) this.m.get(n4);
				this.b(fanItem, mt, this.i);
			}
			mg mg2 = mf.a(n4, n2, this.c);
			FrameLayout.LayoutParams layoutParams = fanItem.a(n4, mg2, bl4);
			if (bl4) {
				this.addViewInLayout((View) fanItem, n4,
						(ViewGroup.LayoutParams) layoutParams);
				this.m.add((Object) fanItem);
			} else {
				this.attachViewToParent((View) fanItem, n4,
						(ViewGroup.LayoutParams) layoutParams);
			}
			fanItem.e = mg;
			fanItem.f = mg2;
			if (!(!bl || bl2 || mg == null || Fan.n())) {
				boolean bl5 = !bl;
				fanItem.startAnimation(ls.a(n4, mg, mg2, bl5));
			}
			if ((n5 = n4 + 1) >= n2)
				break;
			n4 = n5;
		}
		if (Fan.n()) {
			this.m();
		}
		this.requestLayout();
	}

	public void a(boolean flag) {
		((ItemSector) getParent()).a(getTab(), a.a(getTab()), true, getTab()
				.g(), true);
	}

	public boolean a() {
		return i;
	}

	public boolean a(Object obj) {
		return obj == n;
	}

	public void b(int i1) {
		animate().alpha(0.0F).setDuration(i1).setListener(null);
	}

	void b(boolean flag) {
		clearAnimation();
		for (int i1 = getChildCount() - 1; i1 >= 0; i1--) {
			getChildAt(0).clearAnimation();
		}

		if (flag) {
			removeAllViews();
			Iterator iterator = m.iterator();
			do {
				if (!iterator.hasNext()) {
					break;
				}
				FanItem fanitem = (FanItem) iterator.next();
				if (fanitem.getTag() instanceof mt) {
					((mt) fanitem.getTag()).p();
				}
			} while (true);
			m.clear();
			return;
		} else {
			detachAllViewsFromParent();
			return;
		}
	}

	public boolean b() {
		return j;
	}

	public void c(int i1) {
		animate().alpha(1.0F).setDuration(i1)
				.setInterpolator(new AccelerateInterpolator())
				.setListener(null);
	}

	public boolean c() {
		return k;
	}

	public boolean d() {
		return true;
	}

	public void f() {
		removeCallbacks(o);
		postDelayed(o, 150L);
	}

	public void g() {
		int i1;
		if (!e && d() && getTab() != null) {
			if ((i1 = getTab().i()) < nc.f()) {
				if (i1 < getItems().size()) {
					FanItem fanitem = (FanItem) getItems().get(i1);
					b(fanitem, n, false);
					fanitem.e();
					a(i1 + 1);
					e = true;
					return;
				} else {
					FanItem fanitem1 = a(n, false, false);
					addView(fanitem1);
					m.add(fanitem1);
					a(i1 + 1);
					e = true;
					return;
				}
			}
		}
	}

	public List getItems() {
		return m;
	}

	public nc getTab() {
		return h;
	}

	public void h() {
		super.h();
		removeCallbacks(o);
	}

	public void k() {
		int j1 = m.size();
		for (int i1 = 0; i1 < j1; i1++) {
			FanItem fanitem = (FanItem) m.get(i1);
			fanitem.clearAnimation();
			fanitem.a(i1, mf.a(i1, j1, c), false);
		}

		requestLayout();
	}

	public boolean l() {
		return j();
	}

	public void m() {
		for (Iterator iterator = getItems().iterator(); iterator.hasNext(); ((FanItem) iterator
				.next()).h()) {
		}
		requestLayout();
	}

	public void n() {
	}

	public boolean onDragEvent(DragEvent dragevent) {
		if (!l.a(dragevent)) {
			return super.onDragEvent(dragevent);
		} else {
			return l.b(dragevent);
		}
	}

	public void setHasAddIcon(boolean flag) {
		e = flag;
	}

	public void setItems(ArrayList arraylist) {
		m = arraylist;
	}

}
