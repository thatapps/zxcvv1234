package com.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;

public class ox {
	private static final Theme a = SwipeApplication.e().getTheme();
	private static final String b = (new StringBuilder()).append("Swipe.")
			.append(ox.class.getSimpleName()).toString();
	private static ox c;
	private static final int d[] = { 0, 10, 9, 8, 1, 2, 5, 6, 7 };
	public static final SparseIntArray f = new SparseIntArray();
	private String e;
	public int g;
	public int h;
	public int i;
	public boolean j;

	// ox(int k, int l, int i1, String s) {
	// Object obj2;
	// Object obj = null;
	//
	// g = k;
	// h = l;
	// i = i1;
	// e = s;
	// obj2 = SwipeApplication.e();
	// s = (String) obj;
	// obj2 = ((Context) (obj2)).obtainStyledAttributes(null, in.Fan, 0, i1);
	// Object obj1;
	// // s = ((String) (obj2));
	// obj1 = obj2;
	// j = ((TypedArray) (obj2)).getBoolean(17, false);
	// if (obj2 != null) {
	// ((TypedArray) (obj2)).recycle();
	// }
	//
	// obj1 = s;
	// j = false;
	// if (s == null) {
	// return;
	// } else {
	//
	// ((TypedArray) obj1).recycle();
	// return;
	// }
	//
	// }
	// ox(int k, int l, int i1, String s) {
	// super();
	// Object obj2;
	// Object obj = null;
	//
	// g = k;
	// h = l;
	// i = i1;
	// e = s;
	// obj2 = SwipeApplication.e();
	// s = (String) obj;
	// obj2 = ((Context) (obj2)).obtainStyledAttributes(null, in.Fan, 0, i1);
	// Object obj1;
	// //s = ((String) (obj2));
	// obj1 = obj2;
	// j = ((TypedArray) (obj2)).getBoolean(17, false);
	// if (obj2 != null) {
	// ((TypedArray) (obj2)).recycle();
	// }
	// // _L2:
	// // return;
	// // obj1;
	// // obj1 = s;
	// // j = false;
	// // if (s == null) goto _L2; else goto _L1
	// // _L1:
	// // s.recycle();
	// return;
	// // s;
	// // obj1 = null;
	// // _L4:
	// // if (obj1 != null)
	// // {
	// // ((TypedArray) (obj1)).recycle();
	// // }
	// // throw s;
	// // s;
	// // if (true) goto _L4; else goto _L3
	// // _L3:
	// }
	ox(int paramInt1, int paramInt2, int paramInt3, String paramString) {
		this.g = paramInt1;
		this.h = paramInt2;
		this.i = paramInt3;
		this.e = paramString;
		Object localObject1 = null, localObject2 = null, localObject3, localObject4, localObject5 = null;
		SwipeApplication localSwipeApplication = SwipeApplication.e();
		try {
			TypedArray localTypedArray = localSwipeApplication
					.obtainStyledAttributes(null, in.Fan, 0, paramInt3);
			localObject1 = localTypedArray;

		} catch (Exception localException) {

			try {
				this.j = ((TypedArray) localObject1).getBoolean(17, false);
				if (localObject1 != null) {
					((TypedArray) localObject1).recycle();
				}

			} finally {
				localObject3 = localObject1;
				localObject4 = localObject5;

			}

			// this.j = false;
			if (localObject1 != null) {
				((TypedArray) localObject1).recycle();
			}

		} finally {

			localObject3 = null;
			localObject4 = localObject2;
		}
		((TypedArray) localObject1).recycle();

	}

	public static int a(int k) {
		int l = f.get(k, 0);
		if (l > 0) {
			return l;
		}
		TypedValue typedvalue = new TypedValue();
		if (a.resolveAttribute(k, typedvalue, true) && typedvalue.type >= 28
				&& typedvalue.type <= 31) {
			f.put(k, typedvalue.data);
			return typedvalue.data;
		} else {
			return 0;
		}
	}

	// public static String b(Context var0) {
	// int var1;
	// if (c == null) {
	// var1 = R.string.theme_name_default;
	// } else {
	// var1 = c.h;
	// }
	//
	// return var0.getString(var1);
	// }

	public static String b(Context context) {
		int k;
		if (c == null) {
			k = R.string.theme_name_default;
		} else {
			k = c.h;
		}
		return context.getString(k);
	}

	public static List b() {
		ArrayList arraylist = new ArrayList(8);
		int l = c();
		arraylist.add(c(l));
		int ai[] = d;
		int i1 = ai.length;
		for (int k = 0; k < i1; k++) {
			int j1 = ai[k];
			if (j1 != l) {
				arraylist.add(c(j1));
			}
		}

		return arraylist;
	}

	// public static void b(int paramInt) {
	//
	// ox localox = d();
	// ow.a();
	// f.clear();
	// ne.u();
	// a.applyStyle(R.style.fanOmniDefault, true);
	// c = c(paramInt);
	// if (paramInt != 0) {
	// a.applyStyle(c.i, true);
	// }
	// boolean bool = localox instanceof oy;
	// if ((bool ^ c instanceof oy)) {
	// Log.v(b,
	// "apply Theme, isWatchThemeBefore ^ isWatchThemeNow, reload apps");
	// uc.b();
	// SwipeApplication.e().b().a(true);
	// if (bool) {
	// oy.l();
	// }
	// }
	// }
	// public static void b(int var0) {
	// ox var2 = d();
	// ow.a();
	// f.clear();
	// ne.u();
	// a.applyStyle(2131755030, true);
	// c = c(var0);
	// if (var0 != 0) {
	// a.applyStyle(c.i, true);
	// }
	//
	// boolean var1 = var2 instanceof ox;
	// if ((var1 ^ c instanceof oy)) {
	// Log.v(b,
	// "apply Theme, isWatchThemeBefore ^ isWatchThemeNow, reload apps");
	// uc.b();
	// SwipeApplication.e().b().a(true);
	// if (var1) {
	// oy.l();
	// }
	// }
	//
	// }

	public static void b(int k) {
		ox ox1 = d();
		ow.a();
		f.clear();
		ne.u();
		a.applyStyle(0x7f100016, true);
		c = c(k);
		if (k != 0) {
			a.applyStyle(c.i, true);
		}
		boolean flag = ox1 instanceof oy;
		if ((c instanceof oy) ^ flag) {
			Log.v(b,
					"apply Theme, isWatchThemeBefore ^ isWatchThemeNow, reload apps");
			uc.b();
			SwipeApplication.e().b().a(true);
			if (flag) {
				oy.l();
			}
		}
	}

	public static int c() {
		return ir.U(SwipeApplication.e());
	}

	private static ox c(int n) {
		switch (n) {
		case 3:
		case 4:
		default:
			return new ov(0, R.string.theme_name_default,
					R.style.fanOmniDefault, "purple.png");

		case 8: {
			return new ow(8, R.string.theme_name_blue_gradient,
					R.style.fanBlueGradient, "technical.png");
		}
		case 1: {
			return new ov(1, R.string.theme_name_white, R.style.fanWhite,
					"white.png");
		}
		case 2: {
			return new ov(2, R.string.theme_name_orange, R.style.fanYellow,
					"yellow.png");
		}
		case 5: {
			return new ov(5, R.string.theme_name_red, R.style.fanRed, "red.png");
		}
		case 6: {
			return new ov(6, R.string.theme_name_blue, R.style.fanBlue,
					"blue.png");
		}
		case 7: {
			return new ov(7, R.string.theme_name_green, R.style.fanGreen,
					"green.png");
		}
		case 9: {
			return new oy(9, R.string.theme_name_iwatch, R.style.fanIWatch,
					"iwatch.png");
		}
		case 10:

			return new ov(10, R.string.theme_name_classic, R.style.fanClassic,
					"black.png");
		}
	}

	public static ox d() {
		if (c != null) {
			return c;
		} else {

			return c(0);
		}
	}

	public static void e() {
		b(c());
	}

	public static boolean f() {
		return c != null && c.j;
	}

	public static void g() {
	}

	// public int a(int n, int n2) throws Throwable {
	// TypedArray typedArray = null;
	// SwipeApplication swipeApplication = SwipeApplication.e();
	// int n3 = swipeApplication.getResources().getColor(n2);
	// try {
	// int n4;
	// typedArray = swipeApplication.obtainStyledAttributes(null, in.Fan,
	// 0, this.i);
	// n3 = n4 = typedArray.getColor(n, n3);
	// if (typedArray == null)
	// return n3;
	// } catch (Exception var7_7) {
	// if (typedArray == null)
	// return n3;
	// typedArray.recycle();
	// return n3;
	// } catch (Throwable var6_8) {
	// if (typedArray == null)
	// throw var6_8;
	// {
	// typedArray.recycle();
	// }
	// throw var6_8;
	// }
	// {
	// typedArray.recycle();
	// return n3;
	// }
	// }
	public int a(int k, int l) {
		TypedArray typedarray;
		Object obj;
		Object obj1;
		obj = null;
		typedarray = null;
		obj1 = SwipeApplication.e();
		l = ((Context) (obj1)).getResources().getColor(l);
		obj1 = ((Context) (obj1)).obtainStyledAttributes(null, in.Fan, 0, i);
		typedarray = ((TypedArray) (obj1));
		obj = obj1;
		k = ((TypedArray) (obj1)).getColor(k, l);
		l = k;
		k = l;
		if (obj1 != null) {
			((TypedArray) (obj1)).recycle();
			k = l;
		}
		// _L2:

		k = l;
		if (typedarray == null) {
			return k;
		} else {
			// _L1:
			typedarray.recycle();

			if (obj != null) {
				((TypedArray) (obj)).recycle();
			}
			return l;
		}

	}

	public Drawable a(Context context, Fan fan) {
		return new mi(context.getResources().getDimensionPixelSize(0x7f0b002d),
				fan.getTileSectorOuterSize(), 0, fan.i(), null);
	}

	public Drawable b(Context context, Fan fan) {
		return new mi(context.getResources().getDimensionPixelSize(0x7f0b002d),
				fan.getTileSectorInnerSize(), 0, fan.i(), null);
	}

	public String h() {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("http://res.lazyswipe.com/").append("themes/");
		stringbuilder.append(to.u(SwipeApplication.e())).append('/').append(e);
		return stringbuilder.toString();
	}

	public boolean i() {
		return ir.U(SwipeApplication.e()) == g;
	}

	// public Bitmap j() {
	// Object obj = SwipeApplication.e();
	// Bitmap bitmap = ((BitmapDrawable) ((Context) (obj)).getResources()
	// .getDrawable(0x7f030000)).getBitmap();
	// try {
	// int k = ((Context) (obj)).getResources().getDimensionPixelSize(
	// 0x7f0b0025);
	// obj = Bitmap.createBitmap(k, k,
	// android.graphics.Bitmap.Config.ARGB_8888);
	// Canvas canvas = new Canvas(((Bitmap) (obj)));
	// Paint paint = new Paint();
	// paint.setFlags(7);
	// canvas.setDrawFilter(tf.a);
	// ColorMatrix colormatrix = new ColorMatrix();
	// colormatrix.setSaturation(0.0F);
	// paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
	// paint.setAlpha(75);
	// canvas.drawBitmap(bitmap, null, new Rect(0, 0, k, k), paint);
	// } catch (Exception exception) {
	// return bitmap;
	// }
	// return ((Bitmap) (obj));
	// }

	public Bitmap j() {
		Object obj = SwipeApplication.e();
		Bitmap bitmap = ((BitmapDrawable) ((Context) (obj)).getResources()
				.getDrawable(0x7f030000)).getBitmap();
		try {
			int k = ((Context) (obj)).getResources().getDimensionPixelSize(
					0x7f0b0025);
			obj = Bitmap.createBitmap(k, k,
					android.graphics.Bitmap.Config.ARGB_8888);
			Canvas canvas = new Canvas(((Bitmap) (obj)));
			Paint paint = new Paint();
			paint.setFlags(7);
			canvas.setDrawFilter(tf.a);
			ColorMatrix colormatrix = new ColorMatrix();
			colormatrix.setSaturation(0.0F);
			paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
			paint.setAlpha(75);
			canvas.drawBitmap(bitmap, null, new Rect(0, 0, k, k), paint);
		} catch (Exception exception) {
			return bitmap;
		}
		return ((Bitmap) (obj));
	}

}
