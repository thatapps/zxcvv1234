package com.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lazyswipe.zev.R;

@SuppressLint("NewApi")
public class qd {
	private final Preference a;
	private ViewGroup b;
	private ImageView c;
	private View d;
	private ImageView e;
	private int f;
	private boolean g;
	private Drawable h;
	private boolean i = true;
	private Drawable j;

	public qd(Preference preference, Context context,
			AttributeSet attributeset, int k) {
		i = true;
		a = preference;
		preference = null;
		TypedArray ta = context.obtainStyledAttributes(attributeset,
				in.MyPreference, k, 0);

		f = ta.getInt(1, 3);

		g = ta.getBoolean(2, true);

		h = ta.getDrawable(0);

		boolean flag = g;
		if (!flag)

			if (ta != null) {
				ta.recycle();
			}

		if (preference == null) {
			f = 3;
			return;
		} else {
			f = 3;
			ta.recycle();
			return;
		}

	}

	public static Drawable a(int k, int l) {
		ShapeDrawable shapedrawable = new ShapeDrawable(new OvalShape());
		shapedrawable.getPaint().setColor(l);
		shapedrawable.setIntrinsicWidth(k);
		shapedrawable.setIntrinsicHeight(k);
		return shapedrawable;
	}

	public static Drawable a(Context context) {
		return a(
				(int) (8.333333F * context.getResources().getDisplayMetrics().density),
				Color.parseColor("#ff5a10"));
	}

	// private void b() {
	// if (e != null) {
	// int k = e.getVisibility();
	// if (i) {
	// if (8 != k) {
	// e.setVisibility(8);
	// return;
	// }
	// } else {
	// if (k != 0) {
	// e.setVisibility(0);
	// }
	// ImageView imageview = e;
	// Drawable drawable;
	// if (j == null) {
	// drawable = a(a.getContext());
	// } else {
	// drawable = j;
	// }
	// imageview.setImageDrawable(drawable);
	// return;
	// }
	// }
	// }
	private void b() {
		if (e != null) {
			int k = e.getVisibility();
			if (i) {
				if (8 != k) {
					e.setVisibility(8);
					return;
				}
			} else {
				if (k != 0) {
					e.setVisibility(0);
				}
				ImageView imageview = e;
				Drawable drawable;
				if (j == null) {
					drawable = a(a.getContext());
				} else {
					drawable = j;
				}
				imageview.setImageDrawable(drawable);
				return;
			}
		}
	}

	private void c() {
		int k = c.getVisibility();
		if (h != null) {
			if (k != 0) {
				c.setVisibility(0);
			}
			c.setImageDrawable(h);
		} else if (8 != k) {
			c.setVisibility(8);
			return;
		}
	}

	private void d() {
		int k = f;
		d.setBackgroundResource(0x7f02005a);
	}

	public void a(View view) {
		b = (ViewGroup) view.findViewById(0x1020018);
		c = (ImageView) view.findViewById(0x7f0c00ab);
		d = view.findViewById(0x7f0c00aa);
		e = (ImageView) view.findViewById(0x7f0c00ad);
	}

	public void a(boolean flag, boolean flag1) {
		if (i != flag) {
			i = flag;
			if (flag1) {
				b();
				return;
			}
		}
	}

	public boolean a() {
		return i;
	}

	public void b(View view) {
		view.setBackgroundDrawable(null);
		a(view);
		c();
		d();
		b();
	}
}
