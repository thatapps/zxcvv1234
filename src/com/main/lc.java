package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

public class lc implements android.view.View.OnKeyListener,
		android.view.ViewTreeObserver.OnGlobalLayoutListener,
		android.widget.AdapterView.OnItemClickListener,
		android.widget.PopupWindow.OnDismissListener, le {

	private Context a;
	private LayoutInflater b;
	private kv c;
	private ky d;
	private int e;
	private View f;
	private boolean g;
	private ViewTreeObserver h;
	private ld i;
	private lf j;
	private ViewGroup k;
	private Handler l;

	public lc(Context context, ky ky1, View view, boolean flag) {
		l = new Handler();
		a = context;
		b = LayoutInflater.from(context);
		d = ky1;
		g = flag;
		e = (context.getResources().getDisplayMetrics().widthPixels * 2) / 3;
		f = view;
		ky1.a(this);
	}

	private int a(ListAdapter listadapter) {
		int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		int j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		int k2 = listadapter.getCount();
		int j1 = 0;
		int i1 = 0;
		View view = null;
		int k1 = 0;
		for (; j1 < k2; j1++) {
			int l1 = listadapter.getItemViewType(j1);
			if (l1 != i1) {
				view = null;
				i1 = l1;
			}
			if (k == null) {
				k = new FrameLayout(a);
			}
			view = listadapter.getView(j1, view, k);
			view.measure(i2, j2);
			k1 = Math.max(k1, view.getMeasuredWidth());
		}

		return k1;
	}

	static boolean a(lc lc1) {
		return lc1.g;
	}

	static LayoutInflater b(lc lc1) {
		return lc1.b;
	}

	public void a(Context context, ky ky1) {
	}

	public void a(ky ky1, boolean flag) {
		if (ky1 == d) {
			b();
			if (j != null) {
				j.a(ky1, flag);
				return;
			}
		}
	}

	public void a(boolean flag) {
		if (i != null) {
			i.notifyDataSetChanged();
		}
	}

	public boolean a() {
		boolean flag = false;
		c = new kv(a, null, 0x1010300);
		c.a((AdapterView.OnItemClickListener) this);
		c.a((AdapterView.OnItemClickListener) this);
		i = new ld(this, d);
		c.a(i);
		View view = f;
		if (view != null) {
			if (h == null) {
				flag = true;
			}
			h = view.getViewTreeObserver();
			if (flag) {
				h.addOnGlobalLayoutListener(this);
			}
			c.a(view);
			c.a(Math.min(a(((ListAdapter) (i))), e));
			c.a();
			c.d().setOnKeyListener(this);
			return true;
		} else {
			return false;
		}
	}

	public void b() {
		if (c()) {
			c.b();
		}
	}

	public boolean c() {
		return c != null && c.c();
	}

	public boolean d() {
		return false;
	}

	public void onDismiss() {
		c = null;
		d.d();
		if (h != null) {
			if (!h.isAlive()) {
				h = f.getViewTreeObserver();
			}
			h.removeGlobalOnLayoutListener(this);
			h = null;
		}
	}

	public void onGlobalLayout() {
		if (c()) {
			View view = f;
			if (view == null || !view.isShown()) {
				b();
			} else if (c()) {
				c.a();
				return;
			}
		}
	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1) {
		ld ld = i;
		ld.a(ld).a(ld.a(i1), 0);
		l.post(new Runnable() {

			final lc a;

			public void run() {
				a.b();
			}

			{
				a = lc.this;
				// super();
			}
		});
	}

	public boolean onKey(View view, int i1, KeyEvent keyevent) {
		if (keyevent.getAction() == 1 && i1 == 82) {
			b();
			return true;
		} else {
			return false;
		}
	}
}
