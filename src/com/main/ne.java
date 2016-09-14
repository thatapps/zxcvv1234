package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.FanItem;

public class ne extends mt implements rd {

	private static ShapeDrawable c;
	private static ShapeDrawable f;
	private static ShapeDrawable g;
	private final Context a;
	private final rc b;

	public ne(Context context, rc rc1) {
		a = context;
		b = rc1;
		b.a(this);
		if (c == null) {
			d(context);
		}
	}

	public static ShapeDrawable b(Context context, int i) {
		int i1 = context.getResources().getDimensionPixelSize(0x7f0b005c);
		ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
		shapeDrawable.getPaint().setColor(i);
		shapeDrawable.setBounds(0, 0, i1, i1);
		return shapeDrawable;
	}

	public static Drawable c(Context context) {
		if (g == null) {
			d(SwipeApplication.e());
		}
		return g;
	}

	private static void d(Context context) {
		c = b(context, ox.a(0x7f01001b));
		f = b(context, ox.a(0x7f01001c));
		g = b(context, SwipeApplication.e().getResources().getColor(0x7f0a0016));
	}

	public static void u() {
		c = null;
		f = null;
	}

	public CharSequence a() {
		return j();
	}

	public boolean a(Context context) {
		return b.e();
	}

	public Drawable b() {
		return a.getResources().getDrawable(b.e(a));
	}

	public boolean b(Context context) {
		if (b.c(context)) {
			if (!(b instanceof qi)) {
				vi.a(context, b.c());
			}
			b.i(context);
			return true;
		} else {
			return false;
		}
	}

	public int d() {
		int i = super.d();
		if (b.a(0)) {
			return i;
		} else {
			return Color.argb(127, Color.red(i), Color.green(i), Color.blue(i));
		}
	}

	public String e() {
		return null;
	}

	public String j() {
		return b.b_();
	}

	public void k() {
		o();
	}

	public String l() {
		return b.b();
	}

	public void m() {
		b.g();
	}

	public Drawable n() {
		if (b.a(0)) {
			return f;
		} else {
			return c;
		}
	}

	public void o() {
		super.o();
		if (e != null && b.b().equals("Wi-Fi")) {
			FanItem fanitem = e;
			String s = j();
			boolean flag;
			if (!a.getString(b.c()).equals(b.b_())) {
				flag = true;
			} else {
				flag = false;
			}
			fanitem.a(s, -1, flag);
		}
	}

	public void t() {
		b.h();
	}
}
