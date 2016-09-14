package com.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.lazyswipe.fan.FanItem;

public abstract class mt {

	protected static final String d = (new StringBuilder()).append("Swipe.")
			.append(mt.class.getSimpleName()).toString();
	protected FanItem e;

	public mt() {
	}

	public abstract CharSequence a();

	public void a(Canvas canvas) {
	}

	public void a(FanItem fanitem) {
		p();
		e = fanitem;
		if (r()) {
			fanitem.setLayerType(1, null);
		}
		o();
	}

	public abstract boolean a(Context context);

	public boolean a(Context context, int j) {
		return a(context);
	}

	public abstract Drawable b();

	public abstract boolean b(Context context);

	public boolean c() {
		return false;
	}

	public int d() {
		return ox.a(0x7f01001d);
	}

	public abstract String e();

	public boolean f() {
		return true;
	}

	public boolean g() {
		return true;
	}

	public jq h() {
		return null;
	}

	public String i() {
		return null;
	}

	public Drawable n() {
		return null;
	}

	public void o() {
		if (e != null) {
			Object obj;
			jq jq;
			ImageView imageview;
			if (c()) {
				e.setPadding(0, 0, 0, 0);
			} else {
				int j = vk.a(e.getContext(), 5F);
				e.setPadding(j, 0, j, 0);
			}
			jq = h();
			obj = n();
			e.a.setBackgroundDrawable(((Drawable) (obj)));
			imageview = e.a;
			if (obj != null) {
				obj = android.widget.ImageView.ScaleType.CENTER_INSIDE;
			} else {
				obj = android.widget.ImageView.ScaleType.FIT_CENTER;
			}
			imageview
					.setScaleType(((android.widget.ImageView.ScaleType) (obj)));
			if (jq != null) {
				e.setIcon(jq);
			} else {
				Drawable drawable = b();
				if (oy.a() && q()) {
					e.setIcon(oy.a(drawable));
				} else {
					e.setIcon(drawable);
				}
			}
			e.setText(a());
			e.setTextColor(d());
			e.setTag(this);
		}
	}

	public void p() {
		if (e != null) {
			e.setTag(null);
		}
		e = null;
	}

	public boolean q() {
		return false;
	}

	public boolean r() {
		return false;
	}

	public boolean s() {
		return g() || f();
	}

}
