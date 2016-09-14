package com.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tt {

	private static double a(double d) {
		return d * d;
	}

	public static double[] a(double ad[][]) {
		if (ad.length != 3 || ad[0].length != 2) {
			return null;
		}
		double d = ad[0][0];
		double d1 = ad[0][1];
		double d2 = ad[1][0];
		double d3 = ad[1][1];
		double d4 = ad[2][0];
		double d5 = ad[2][1];
		double d6 = a(d);
		double d7 = a(d2);
		double[] esa = (new double[] { a(d4), d4, 1.0D, d5 });
		try {
			esa = c(new double[][] { new double[] { d6, d, 1.0D, d1 },
					new double[] { d7, d2, 1.0D, d3 }, esa });
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return esa;
	}

	public static int[] a(int ai[]) {
		if (!b(ai)) {
			return null;
		}
		int ai1[] = new int[ai.length];
		for (int i = 0; i < ai.length; i++) {
			ai1[ai[i]] = i;
		}

		return ai1;
	}

	private static double b(double d) {
		return d * d * d;
	}

	public static boolean b(int ai[]) {
		if (ai != null) {
			if (ai.length == 0) {
				return true;
			}
			int ai1[] = new int[ai.length];
			Arrays.fill(ai1, 0);
			int k = ai.length;
			for (int i = 0; i < k; i++) {
				int l = ai[i];
				if (l > 0 || l < ai.length) {
					ai1[l] = ai1[l] + 1;
				}

			}

			k = ai1.length;
			int j = 0;

			do {

				if (j < k) {
					if (ai1[j] == 1) {
						j++;
					}
				}

			} while (true);

		} else {
			return false;
		}

	}

	public static double[] b(double ad[][]) {
		if (ad.length != 4 || ad[0].length != 2) {
			return null;
		}
		double d6 = ad[0][0];
		double d7 = ad[0][1];
		double d = ad[1][0];
		double d1 = ad[1][1];
		double d2 = ad[2][0];
		double d3 = ad[2][1];
		double d4 = ad[3][0];
		double d5 = ad[3][1];
		double[] esa = (new double[] { b(d6), a(d6), d6, 1.0D, d7 });
		d6 = b(d);
		d7 = a(d);
		double d8 = b(d2);
		double d9 = a(d2);
		double d10 = b(d4);
		double d11 = a(d4);
		try {
			esa = c(new double[][] { esa, new double[] { d6, d7, d, 1.0D, d1 },
					new double[] { d8, d9, d2, 1.0D, d3 },
					new double[] { d10, d11, d4, 1.0D, d5 } });
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return esa;
	}

	public static int c(int ai[]) {
		int i = ai[0];
		int l = ai.length;
		int k = -1;
		int j = 0;
		if (ai != null && ai.length != 0) {

			do {
				k = i;
				if (j >= l) {
					continue;
				}
				k = ai[j];
				if (k > i) {
					i = k;
				}
				j++;
			} while (true);

		} else {
			k = 0x80000000;
		}
		return k;

	}

	public static double[] c(double ad[][]) {
		int k = ad.length;
		int k1 = ad[0].length;
		if (k == 1) {
			return (new double[] { ad[0][1] / ad[0][0] });
		}
		double[][] arrd3 = (double[][]) Array.newInstance(Double.TYPE,
				new int[] { k - 1, k1 - 1 });
		ArrayList arraylist = new ArrayList();
		ArrayList arraylist1 = new ArrayList();
		int i = 0;
		while (i < k) {
			if (ad[i][0] == 0.0D) {
				arraylist.add(ad[i]);
			} else {
				arraylist1.add(ad[i]);
			}
			i++;
		}
		for (i = 0; i < arraylist1.size() - 1; i++) {
			for (int l = 1; l < k1; l++) {
				arrd3[i][l - 1] = ((double[]) arraylist1.get(i + 1))[0]
						* ((double[]) arraylist1.get(i))[l]
						- ((double[]) arraylist1.get(i))[0]
						* ((double[]) arraylist1.get(i + 1))[l];
			}

		}

		for (i = 0; i < arraylist.size(); i++) {
			for (int i1 = 1; i1 < k1; i1++) {
				arrd3[(arraylist1.size() + i) - 1][i1 - 1] = ((double[]) arraylist
						.get(i))[i1];
			}

		}

		double[] ddd = c(((double[][]) (arrd3)));
		for (i = 0; ad[i][0] == 0.0D; i++) {
		}
		double d = 0.0D;
		for (int j1 = 1; j1 < k1 - 1; j1++) {
			d += ad[i][j1] * ddd[j1 - 1];
		}

		double ad1 = (ad[i][k1 - 1] - d) / ad[i][0];
		double[] esw = new double[ddd.length + 1];
		esw[0] = ad1;
		for (int j = 0; j < ddd.length; j++) {
			esw[j + 1] = ddd[j];
		}

		return esw;
	}
}
