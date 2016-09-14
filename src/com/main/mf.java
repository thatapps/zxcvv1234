package com.main;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.ItemSectorBg;

public final class mf {

	private static int a = -1;
	private static int b = -1;
	private static int c = -1;

	private static double a(int i) {
		if (i == 1) {
			return a(i, 4) + 0.034906585039886591D;
		} else {
			return a(i, 4);
		}
	}

	public static double a(int i, int j) {
		return (1.5707963267948966D / (double) (j * 2))
				* (double) ((j - i) * 2 - 1);
	}

	public static int a(int i, int j, int k, int l, int i1, int j1, int k1,
			boolean flag) {
		i1 = -1;
		double d;
		double d1;
		if (!flag) {
			i = j1 - i;
		}
		j = k1 - j;
		d = Math.toDegrees(Math.atan2(j, i));
		d1 = Math.hypot(i, j);
		if (d1 < (double) (b - l / 2)) {
			j = i1;
		} else {
			j = i1;
			if (d1 <= (double) (a + l / 2)) {
				if (d1 > (double) (b - l / 2) && d1 < (double) (b + l / 2)) {
					i = 1;
				} else {
					i = 0;
				}
				if (i != 0) {
					if (k >= 4) {
						k = 4;
					}
				} else {
					k -= 4;
				}
				k = k - (int) (d / (double) (90F / (float) k)) - 1;
				j = k;
				if (i == 0) {
					return k + 4;
				}
			}
		}
		return j;
	}

	public static int a(Fan fan) {
		if (ItemSectorBg.a) {
			return fan.getTileSectorOuterSize();
		} else {
			return fan.getTileSectorInnerSize();
		}
	}

	private static mg a(int i, double d, boolean flag) {
		int k = (int) ((double) i * Math.cos(d));
		int j;
		if (flag) {
			j = 1;
		} else {
			j = -1;
		}
		return new mg(j * k, (int) ((double) i * Math.sin(d) - (double) c
				* Math.sin(d)));
	}

	public static mg a(int i, int j, int k, boolean flag) {
		return a(k, a(i, j), flag);
	}

	public static mg a(int i, int j, boolean flag) {
		if (i < 4) {
			if (j < 4) {
				return a(i, j, b, flag);
			} else {
				return b(i, flag);
			}
		} else {
			return a(i - 4, j - 4, a, flag);
		}
	}

	public static mg a(int i, boolean flag) {
		int j = (int) ((Math.sqrt(2D) - 1.0D) * (double) i);
		if (flag) {
			i = j;
		} else {
			i = -j;
		}
		return new mg(i, j);
	}

	public static void a(int i, int j, int k) {
		b = i;
		a = j;
		c = k;
	}

	private static mg b(int i, boolean flag) {
		double d = a(i);
		return a(b, d, flag);
	}

}
