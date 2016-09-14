package com.main;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.DragEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.notification.sms.ContactAddPanel;
import com.lazyswipe.ui.RateView;
import com.lazyswipe.ui.chooser.MultiChooserActivity;

/*
 * Failed to analyse overrides
 */
public abstract class lk extends FrameLayout implements View.OnClickListener,
		View.OnLongClickListener, rk {
	private static final String e = "Swipe." + lk.class.getSimpleName();
	public Fan a;
	public ll b;
	public boolean c;
	public boolean d;
	private int f = 0;

	public lk(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		f = 0;
	}

	static int a(lk lk) {
		int n = lk.f;
		lk.f = n + 1;
		return n;
	}

	private void a(Context context) {
		try {
			String currentTab = getTab().b();
			ir.b(context, getTab().b(), Fan.a.a);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	// private void a(FanItem fanItem, mt mt, js js) {
	// jq jq = mt.h();
	// if (jq == null) {
	// return;
	// }
	// js.b(jq);
	// this.a(fanItem);
	// }
	private void a(FanItem fanitem, mt mt1, js js1) {
		jq jq = mt1.h();
		if (mt1 != null) {

			js1.b(jq);
			a(fanitem);
			return;
		}
	}

	static int b(lk lk) {
		int n = lk.f;
		lk.f = n - 1;
		return n;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void b(FanItem fanItem, mt mt, int n) {
		Context context = this.getContext();
		String string = ((ne) mt).l();
		List list = rc.k(this.getContext());
		list.remove((Object) string);
		rc.c(context, rc.a(list));
		int n2 = nc.f();
		if (list.size() >= n2) {
			rc rc = null;
			rc = rc.b(context, (String) list.get(n2 - 1));
			if (rc == null) {
				return;
			}
			ne ne = new ne(context, rc);
			List list2 = this.getTab().b(context);
			list2.add((Object) ne);
			for (; n < n2; ++n) {
				this.a((FanItem) this.getItems().get(n), (mt) list2.get(n));
			}
			this.a(n2);
		} else {
			this.a(fanItem);
		}
		rc.r();
	}

	private void c(FanItem fanItem) {
		if (this.getTab().h()) {
			this.h();
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// private Object f(View view) {
	// mt mt;
	// Object object = view.getTag();
	// if (object != null || this.d || view instanceof FanItem
	// || (mt = (mt) ((FanItem) view.getParent()).getTag()) == null)
	// return object;
	// {
	// if (view instanceof ImageView) {
	// if (!mt.a(this.getContext()))
	// return object;
	// {
	// this.a.a(false);
	// return object;
	// }
	// } else {
	// if (!(view instanceof TextView) || !mt.b(this.getContext()))
	// return object;
	// {
	// this.a.a(false);
	// return object;
	// }
	// }
	// }
	// }
	private Object f(View view) {
		Object obj = view.getTag();
		if (obj == null && !d && !(view instanceof FanItem)) {
			mt mt1 = (mt) ((FanItem) view.getParent()).getTag();
			if (mt1 != null) {
				if (view instanceof ImageView) {
					if (mt1.a(getContext())) {
						a.a(false);
					}
				} else if ((view instanceof TextView) && mt1.b(getContext())) {
					a.a(false);
					return obj;
				}
			}
		}
		return obj;
	}

	private void k() {
		Intent intent = MultiChooserActivity.a(false);
		intent.addFlags(268468224);
		sl.a(this.getContext(), intent);
	}

	// private void l() {
	// ArrayList arrayList = new ArrayList(this.getItems().size());
	// Iterator iterator = this.getItems().iterator();
	//
	// while (iterator.hasNext()) {
	// jq jq = null;
	// Object object = ((FanItem) iterator.next()).getTag();
	// if (object == null || this.a(object) || !(object instanceof mt)
	// || (jq = ((mt) object).h()) == null)
	// {
	// arrayList.add((Object) jq.h);}
	// }
	// Intent intent = MultiChooserActivity.a(true);
	// intent.addFlags(268468224);
	// intent.putExtra("extra.request_type", 1);
	// intent.putExtra("extra.request_max_count", nc.f());
	// intent.putParcelableArrayListExtra("extra.request_existing_list",
	// arrayList);
	// sl.a(this.getContext(), intent);
	// }

	private void l() {
		ArrayList arraylist = new ArrayList(getItems().size());
		Object obj = getItems().iterator();
		do {
			if (!((Iterator) (obj)).hasNext()) {
				break;
			}
			Object obj1 = ((FanItem) ((Iterator) (obj)).next()).getTag();
			if (obj1 != null && !a(obj1) && (obj1 instanceof mt)) {
				obj1 = ((mt) obj1).h();
				if (obj1 != null) {
					arraylist.add(((jq) (obj1)).h);
				}
			}
		} while (true);
		obj = MultiChooserActivity.a(true);
		((Intent) (obj)).addFlags(0x10008000);
		((Intent) (obj)).putExtra("extra.request_type", 1);
		((Intent) (obj)).putExtra("extra.request_max_count", nc.f());
		((Intent) (obj)).putParcelableArrayListExtra(
				"extra.request_existing_list", arraylist);
		sl.a(getContext(), ((Intent) (obj)));
	}

	public abstract void a(int var1);

	public abstract void a(View var1);

	public void a(Fan fan, ll ll) {
		this.a = fan;
		this.b = ll;
	}

	public abstract void a(FanItem var1);

	protected void a(FanItem fanItem, mt mt) {
		this.b(fanItem, mt, false);
	}

	public void a(FanItem fanItem, mt mt, int n) {
		this.a(fanItem, mt, n, true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void a(FanItem fanItem, mt mt, int n, js js, boolean bl) {
		if (mt instanceof pj) {
			((pj) mt).k();
		} else if (mt instanceof mr) {
			SwipeService.a(((mr) mt).j());
		}
		fanItem.clearAnimation();
		fanItem.setVisibility(0);
		this.getTab().e();
		this.getTab().a(
				(SwipeApplication) this.getContext().getApplicationContext());
		this.a(true);
		if (bl) {
			this.g();
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(FanItem fanItem, mt mt, int n, boolean bl) {
		this.getTab().c(mt);
		if (this.getTab() instanceof nf) {
			this.c(fanItem);
			return;
		} else {
			if (this.c()) {
				this.a(fanItem, mt, ((SwipeApplication) this.getContext()).b());
				return;
			}
			if (this.b()) {
				this.a(fanItem, mt, n,
						((SwipeApplication) this.getContext()).b(), bl);
				return;
			}
			if (!this.a())
				return;
			{
				this.b(fanItem, mt, n);
				return;
			}
		}
	}

	public void a(FanItem fanItem, mt mt, boolean bl) {
		this.a(fanItem, mt, this.getItems().indexOf((Object) fanItem), bl);
	}

	public abstract void a(boolean var1);

	public void a(boolean flag, lu lu) {
		for (Iterator iterator = getItems().iterator(); iterator.hasNext();) {
			FanItem fanitem = (FanItem) iterator.next();
			if (flag) {
				fanitem.a(true, lu);
			} else {
				fanitem.e();
			}
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void a(boolean bl, boolean bl2, boolean bl3) {
		if (!this.d) {
			return;
		}
		this.d = false;
		if (bl) {
			this.f = 0;
			lu lu = bl2 ? new lu() {

				@Override
				public void a() {
					lk.a(lk.this);
				}

				@Override
				public void b() {
					lk.b(lk.this);
					if (lk.this.f == 0) {
						lk.this.a(false);
					}
				}
			} : null;
			this.a(bl2, lu);
		}
		if (!(!bl3 || bl && bl2)) {
			this.a(false);
		}
		if (!this.a())
			return;
		Fan.l();
	}

	public abstract boolean a();

	public boolean a(Canvas canvas) {
		try {
			this.draw(canvas);
			return true;
		} catch (Exception var2_2) {
			return false;
		}
	}

	public abstract boolean a(Object var1);

	public void b(int n) {
	}

	/*
	 * Enabled aggressive block sorting
	 */
	void b(View view) {
		View view2;
		Fan.b = true;
		if (view == null || this.a.f() && !NewGuide.j() || this.b.e)
			return;
		Object object = this.f(view);
		if (object == null) {
			if (!this.d
					&& (view.getParent() == null || !this.a(((View) view
							.getParent()).getTag())))
				return;
			view2 = (View) view.getParent();
			object = view2.getTag();
		} else {
			view2 = view;
		}
		if (!(object instanceof mt))
			return;
		FanItem fanItem = (FanItem) view2;
		int n = this.getItems().indexOf((Object) fanItem);
		if (this.a(object)) {
			this.i();
			return;
		}
		mt mt = (mt) object;
		if (this.d) {
			if (!fanItem.f())
				return;
			{
				this.a(fanItem, mt, n);
				return;
			}
		}
		if (!mt.a(this.getContext(), n)) {
			return;
		}
		this.a.a(false);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void b(FanItem fanItem) {
		int n = this.getItems().indexOf((Object) fanItem);
		if (n < 0) {
			return;
		}
		if (!(fanItem.getTag() instanceof mt))
			return;
		mt mt = (mt) fanItem.getTag();
		if (!this.d)
			return;
		this.a(fanItem, mt, n);
	}

	public void b(FanItem fanItem, mt mt, boolean bl) {
		if (mt == null) {
			fanItem.a.setBackgroundDrawable(null);
			fanItem.setIcon((Drawable) null);
			fanItem.setText(null);
			fanItem.setOnClickListener(null);
			fanItem.setTag(null);
			return;
		}
		mt.a(fanItem);
		fanItem.a((View.OnClickListener) this, bl);
		fanItem.a((View.OnLongClickListener) this, bl);
	}

	public abstract boolean b();

	public void c(int n) {
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	void c(View view) {
		Fan.b = true;
		Object object = null;
		try {
			object = view.getTag();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		if (!(object == null || object instanceof mt)) {
			return;
		}
		jc.a(this.getContext(), "C4", String.valueOf((int) this.getTab().c()));
		view.performHapticFeedback(0);
		this.d(view);
		if (!this.j())
			return;
		this.a(view);
	}

	public abstract boolean c();

	// public void d(View view) {
	// if (view == null) {
	// // empty if block
	// }
	// if (this.d) {
	// return;
	// }
	// if (this.a()) {
	// Fan.a(false, null, 0);
	// }
	// this.d = true;
	// this.setHasAddIcon(false);
	// this.e(view);
	// if (this.d() && !this.j()) {
	// this.g();
	// }
	// this.f();
	// }
	public void d(View view) {
		if (view != null)
			;
		if (d) {
			return;
		}
		if (a()) {
			Fan.a(false, null, 0);
		}
		d = true;
		setHasAddIcon(false);
		e(view);
		if (d() && !j()) {
			g();
		}
		f();
	}

	public abstract boolean d();

	public boolean dispatchDragEvent(DragEvent dragEvent) {
		try {
			boolean bl = super.dispatchDragEvent(dragEvent);
			return bl;
		} catch (Throwable var2_3) {
			Log.e("Error Throwable", "Kind Of THrowable error" + var2_3);
			return false;
		}
	}

	public boolean dispatchTouchEvent(MotionEvent motionEvent) {
		try {
			boolean bl = super.dispatchTouchEvent(motionEvent);
			return bl;
		} catch (Throwable var2_3) {
			return false;
		}
	}

	/*
	 * Loose catch block Enabled aggressive block sorting Enabled unnecessary
	 * exception pruning Lifted jumps to return sites
	 */
	// public void e(View view) {
	// RateView.d();
	// int n = this.getTab().i();
	// for (int i = 0; i < n; ++i) {
	// FanItem fanItem = (FanItem) this.getItems().get(i);
	// boolean bl = view != fanItem;
	// fanItem.a(bl);
	// continue;
	// }
	// return;
	//
	// }

	public void e(View view) {
		int i1;
		int j1;
		RateView.d();
		j1 = getTab().i();
		i1 = 0;
		// _L2:
		while (j1 > i1) {
			FanItem fanitem = null;
			boolean flag;
			try {
				fanitem = (FanItem) getItems().get(i1);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				exception.printStackTrace(); /* Loop/switch isn't completed */
			}
			if (view != fanitem) {
				flag = true;
			} else {
				flag = false;
			}
			fanitem.a(flag);
			i1++; /* Loop/switch isn't completed */
		}

	}

	public boolean e() {
		return this.d;
	}

	public void f() {
	}

	public void g() {
	}

	public Fan getFan() {
		return this.a;
	}

	public abstract List getItems();

	public abstract nc getTab();

	public void h() {
		this.a(true, false, true);
	}

	protected void i() {
		if (this.a()) {
			this.k();
			return;
		}
		if (this.b()) {
			ContactAddPanel.a(this.getContext());
			return;
		}
		this.l();
	}

	public boolean j() {
		return this.a.e();
	}

	public void onClick(View view) {
		this.a(this.getContext());
		try {
			this.b(view);
			return;
		} catch (Exception var2_2) {
			return;
		}
	}

	public boolean onLongClick(View view) {
		this.a(this.getContext());
		RateView.d();
		this.c(view);
		return true;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onVisibilityChanged(View view, int n) {
		super.onVisibilityChanged(view, n);
		if (!(this.getTab() != null && n != 0 && this.d)) {
			return;
		}
		this.a(true, false, false);
	}

	public void setDirection(boolean bl) {
		this.c = bl;
	}

	public abstract void setHasAddIcon(boolean var1);

}
