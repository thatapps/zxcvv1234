package com.main;

import android.content.Context;
import android.content.res.Resources;
import com.lazyswipe.SwipeApplication;

public class nj {

	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public boolean e;
	public int f;
	public int g;
	public int h;
	public int i;
	public int j;
	public int k;
	public ni l[];
	private float m;

	public nj(int i1, int j1, boolean flag) {
		f = i1;
		g = j1;
		e = flag;
		b();
	}

	public static float a(nj nj1) {
		return nj1.m;
	}

	public static float a(nj nj1, float f1) {
		nj1.m = f1;
		return f1;
	}

	private void a(int i1) {
		switch (i1) {
		default:
			return;

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			i = 0;
			h = a;
			return;

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			i = 1;
			h = b;
			return;

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 9: // '\t'
		case 10: // '\n'
			i = 2;
			h = c;
			return;

		case 11: // '\013'
		case 12: // '\f'
			i = 3;
			break;
		}
		h = d;
	}

	private void b() {
		a(g);
		l = ni.a(f, g);
		if (l != null && l.length > 1) {
			m = oy.a(l[0].b);
			m = oy.a(e, m);
			double d1 = Math.toRadians(m);
			j = (int) ((double) h * Math.cos(d1));
			double d2 = h;
			k = (int) (Math.sin(d1) * d2);
		}
	}

	public float a() {
		return oy.a(e, m);
	}

	static {
		SwipeApplication swipeapplication = SwipeApplication.e();
		Resources resources = swipeapplication.getResources();
		int i1 = resources.getDimensionPixelSize(0x7f0b0025)
				+ resources.getDimensionPixelSize(0x7f0b003b);
		a = (resources.getDimensionPixelSize(0x7f0b003e) + i1 / 2)
				- vk.a(swipeapplication, 1.0F);
		b = a + (int) ((double) i1 * 0.96999999999999997D);
		c = b + (int) ((double) i1 * 0.96999999999999997D);
		d = c + (int) ((double) i1 * 0.66000000000000003D);
	}
}
