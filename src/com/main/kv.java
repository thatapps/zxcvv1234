package com.main;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

public class kv {
	private Context a;
	private PopupWindow b;
	private ListAdapter c;
	private kw d;
	private int e = -2;
	private int f = -2;
	private int g;
	private int h;
	private boolean i;
	private DataSetObserver j;
	private View k;
	private AdapterView.OnItemClickListener l;
	private Rect m = new Rect();

	public kv(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
		this.a = paramContext;
		this.b = new PopupWindow(paramContext, paramAttributeSet, paramInt);
		this.b.setInputMethodMode(2);
		this.b.setFocusable(true);
	}

	/*
	 * private int e() { if (this.d == null) { this.d = new kw(this.a);
	 * this.d.setAdapter(this.c); this.d.setOnItemClickListener(this.l);
	 * this.d.setFocusable(true); this.d.setFocusableInTouchMode(true); kw kw =
	 * this.d; this.b.setContentView((View) kw); } else {
	 * this.b.getContentView(); } Drawable drawable = this.b.getBackground();
	 * int n = 0; if (drawable != null) { drawable.getPadding(this.m); n =
	 * this.m.top + this.m.bottom; if (!this.i) { this.h = -this.m.top; } }
	 * return n + this.b.getMaxAvailableHeight(this.k, this.h); }
	 */

	private int e() {
		Object obj = null;
		
		Drawable drawable = null;
		int i1;
		if (d == null) {
			d = new kw(a);
			d.setAdapter(c);
			d.setOnItemClickListener(l);
			d.setFocusable(true);
			d.setFocusableInTouchMode(true);
			kw kw1 = d;
			b.setContentView(kw1);
		} else {
			obj = b.getContentView();
		}
		i1 = 0;
		drawable = b.getBackground();
		if (drawable != null) {
			((Drawable) (drawable)).getPadding(m);
			int j1 = m.top + m.bottom;
			i1 = j1;
			if (!i) {
				h = -m.top;
				i1 = j1;
			}
		}
		return i1 + b.getMaxAvailableHeight(k, h);
	}

	public void a() {
		int j1 = -1;
		int k1 = e();
		if (b.isShowing()) {
			int i1;
			if (f == -1) {
				i1 = -1;
			} else if (f == -2) {
				i1 = k.getWidth();
			} else {
				i1 = f;
			}
			if (e == -1) {
				PopupWindow popupwindow = b;
				if (f != -1) {
					j1 = 0;
				}
				popupwindow.setWindowLayoutMode(j1, 0);
				j1 = k1;
			} else if (e == -2) {
				j1 = -2;
			} else {
				j1 = e;
			}
			b.setOutsideTouchable(true);
			b.update(k, g, h, i1, j1);
			return;
		}
		byte byte0;
		if (f == -1) {
			byte0 = -1;
		} else if (f == -2) {
			b.setWidth(k.getWidth());
			byte0 = 0;
		} else {
			b.setWidth(f);
			byte0 = 0;
		}
		if (e != -1) {
			if (e == -2) {
				j1 = -2;
			} else {
				b.setHeight(e);
				j1 = 0;
			}
		}
		b.setWindowLayoutMode(byte0, j1);
		b.setOutsideTouchable(true);
		b.showAsDropDown(k, g, h);
	}

	public void a(int paramInt) {
		Drawable localDrawable = this.b.getBackground();
		if (localDrawable != null) {
			localDrawable.getPadding(this.m);
		}
		for (this.f = (paramInt + (this.m.left + this.m.right));; this.f = paramInt) {
			return;
		}
	}

	public void a(View paramView) {
		this.k = paramView;
	}

	public void a(AdapterView.OnItemClickListener paramOnItemClickListener) {
		this.l = paramOnItemClickListener;
	}

	public void a(ListAdapter paramListAdapter) {
		if (this.j == null) {
			this.j = new kx(this);
		}

		this.c = paramListAdapter;
		if (this.c != null) {
			paramListAdapter.registerDataSetObserver(this.j);
		}
		if (this.d != null) {
			this.d.setAdapter(this.c);
		}

		if (this.c != null) {
			this.c.unregisterDataSetObserver(this.j);
		}
		return;

	}

	public void a(PopupWindow.OnDismissListener paramOnDismissListener) {
		this.b.setOnDismissListener(paramOnDismissListener);
	}

	public void b() {
		this.b.dismiss();
	}

	public boolean c() {
		return this.b.isShowing();
	}

	public ListView d() {
		return this.d;
	}
}
