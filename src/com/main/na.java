package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;

public class na extends mt implements pj {

	public static ok a;
	public static int b = -1;
	protected final Context c;
	protected final int f;

	public na(Context context, int l) {
		c = context;
		f = l;
	}

	public static int a(SwipeApplication swipeapplication) {

		ol ol1 = ol.a(swipeapplication);
		ok ok = null;
		boolean flag;
		if (ol1 != null && ol1.a(swipeapplication.getContentResolver(), 2, 2)) {
			flag = true;
		} else {
			flag = false;
		}
		if (!flag && a == null) {
			ok = ol.a(swipeapplication, 2);
			a = ok;
			if (swipeapplication == null) {

			}
		}
		return !flag ? 0 : 2;

	}

	public CharSequence a() {
		return c.getText(0x7f0f00a4);
	}

	public boolean a(Context context) {
		Fan.a(e, this);
		return false;
	}

	public Drawable b() {
		return c.getResources().getDrawable(0x7f030000);
	}

	public boolean b(Context context) {
		return false;
	}

	public String e() {
		return a().toString();
	}

	public boolean f() {
		return false;
	}

	public String i() {
		return "Spotlight";
	}

	public int j() {
		return f;
	}

	public void k() {
		Fan.k();
		ir.e(c);
	}

}
