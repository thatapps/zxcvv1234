package com.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.Arrays;

public class nh {

	public static boolean a = false;
	public static final Rect b = new Rect();
	private static int c = -1;
	private static final float[] d = new float[3];
	private static final int[] e = new int[256];
	private static final int[] f = new int[256];
	private static final int[] g = new int[256];
	private static final float[] h = new float[3];
	private static final float[] i = new float[3];
	private static int[] j = new int[16];
	private static int k = 2;
	private static int l = 10;
	private static float m = 1.0F;

	private static final int a(int var0) {
		return Math.round(((float) var0 + 0.01F) / 51.0F) * 51;
	}

	public static int a(Context var0, Bitmap var1) {
		if (c == -1) {
			a(var0);
		}

		int var3;
		if (var1 != null && !var1.isRecycled()) {
			int var14 = var1.getWidth();
			int var2 = var1.getHeight();
			int[] var21 = new int[var14 * var2];
			var1.getPixels(var21, 0, var14, 0, 0, var14, var2);
			b.set(j[0], j[6], var14 - j[3], var2 - j[9]);
			int var15 = (int) ((float) var14 * 0.16F);
			int var16 = (int) ((float) var2 * 0.16F);
			int var17 = (int) ((float) var14 * 0.84000003F);
			int var18 = (int) ((float) var2 * 0.84000003F);
			int var6 = 0;
			Arrays.fill(e, 0);
			Arrays.fill(f, 0);
			Arrays.fill(g, 0);
			int var19 = var21.length;
			var3 = 0;
			int var4 = 0;
			int var10 = 0;
			int var7 = 0;
			int var5 = 0;
			var2 = 0;

			int var13;
			for (int var8 = 0; var10 < var19; var8 = var13) {
				int var20 = var21[var10];
				int var9 = var8 % var14;
				int var11 = var8 / var14;
				boolean var12;
				if (var11 >= var16 && var11 <= var18 && var9 >= var15
						&& var9 <= var17) {
					var12 = false;
				} else {
					var12 = true;
				}

				var13 = var8 + 1;
				if (var12) {
					var11 = var6 + 1;
					var9 = var7;
					var8 = var11;
					if (var6 % 2 != 0) {
						var6 = var5;
						var5 = var2;
						var2 = var6;
						var6 = var11;

					}
				} else {
					var9 = var7 + 1;
					if (var7 % 32 != 0) {
						var7 = var9;
						var8 = var2;
						var2 = var5;
						var5 = var8;

					}

					var8 = var6;
				}

				if (var20 >>> 24 > 0) {
					var7 = Color.red(var20);
					var6 = Color.green(var20);
					var11 = Color.blue(var20);
					++e[var7];
					++f[var6];
					++g[var11];
					if (!a(var7, var6, var11) || var12) {
						var5 += var11;
						var4 += var7;
						var11 = var2 + 1;
						var3 += var6;
						var7 = var9;
						var6 = var8;
						var2 = var5;
						var5 = var11;

					}
				}

				var11 = var2;
				var7 = var9;
				var6 = var8;
				var2 = var5;
				var5 = var11;

				++var10;
				var8 = var5;
				var5 = var2;
				var2 = var8;
			}

			if (var2 == 0) {
				var4 = 0;
			} else {
				var4 /= var2;
			}

			if (var2 == 0) {
				var3 = 0;
			} else {
				var3 /= var2;
			}

			if (var2 == 0) {
				var5 = 0;
			} else {
				var5 /= var2;
			}

			var4 = Color.rgb(var4, var3, var5);
			var5 = (int) ((float) var2 * 0.35F);
			var2 = a(e, var5);
			var3 = a(f, var5);
			var5 = a(g, var5);
			if (var2 == -1 || var3 == -1 || var5 == -1) {
				return var4;
			}

			var3 = Color.rgb(var2, var3, var5);
			Color.colorToHSV(var3, h);
			var2 = (int) h[0];
			Color.colorToHSV(var4, i);
			boolean var22;
			if (Math.abs(var2 - (int) i[0]) < 5) {
				var22 = true;
			} else {
				var22 = false;
			}

			if (!var22) {
				return var4;
			}
		} else {
			var3 = -1;
		}

		return var3;
	}

	private static int a(int[] var0, int var1) {
		boolean var6 = false;
		int var2 = 0;
		int var4 = -1;

		int var3;
		int var5;
		for (var3 = -1; var2 < var0.length; var4 = var5) {
			var5 = var4;
			if (var0[var2] > var4) {
				var5 = var0[var2];
				var3 = var2;
			}

			++var2;
		}

		boolean var7 = var6;
		if (var3 != -1) {
			var7 = var6;
			if (var4 >= var1) {
				var7 = true;
			}
		}

		if (var7) {
			return var3;
		} else {
			return -1;
		}
	}

	private static void a(Context var0) {
		var0.getResources();
		var0.getPackageName();
		k = (int) (2.0F * var0.getResources().getDisplayMetrics().density / 1.5F + 0.5F);
		l = (int) ((double) (15.0F * var0.getResources().getDisplayMetrics().density)
				* (1.0D - Math.sqrt(2.0D) / 2.0D) + 0.5D);
		m = var0.getResources().getDisplayMetrics().density * 1.25F;
		c = -11423475;
	}

	private static final boolean a(int var0, int var1, int var2) {
		var0 = a(var0);
		var1 = a(var1);
		var2 = a(var2);
		return var0 == var1 && var0 == var2;
	}
}
