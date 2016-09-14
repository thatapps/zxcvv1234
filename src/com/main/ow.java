package com.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.ItemSectorBg;
import java.io.File;

public class ow extends ox {

	public static int a[] = { 0xcc4aceff, 0xcc4aceff, 0xcc233044 };
	public static int b[] = { 0xb24aceff, 0xb24aceff, 0xb2233044 };
	public static float c[] = { 0.0F, 0.12F, 1.0F };
	public static int d = 0x11ffffff;
	public static int e = 0x80188dfb;
	private static final String k = (new StringBuilder()).append("Swipe.")
			.append(ow.class.getSimpleName()).toString();

	ow(int i, int j, int l, String s) {
		super(i, j, l, s);
	}

	public static Bitmap a(Context context, Fan fan, String s) {
		int i = ox.c();
		Bitmap bitmap = null;
		File file = a(context, fan.i(), s, i);
		if (file.exists()) {
			if (tf.b(bitmap = tf.a(file.getAbsolutePath(), false))) {
				return bitmap;
			}
		}
		return null;
	}

	private static Drawable a(Context context, Fan fan, String s, int i, int j,
			int l, boolean flag, int ai[], float af[], int i1, int j1, int k1) {
		if (k()) {
			Bitmap bitmap = a(context, fan, s);
			if (fan != null) {
				return new BitmapDrawable(context.getResources(), bitmap);
			}
		}
		return new mj(j, l, flag, s, i, ai, af, i1, j1, k1, ItemSectorBg.d());
	}

	static File a(Context context) {
		return c(context);
	}

	public static File a(Context context, boolean flag, String s, int i) {
		s = (new StringBuilder()).append(a(flag, s, i)).append(".png")
				.toString();
		return new File(c(context), s);
	}

	public static String a(boolean flag, String s, int i) {
		StringBuilder stringbuilder = (new StringBuilder()).append(s).append(
				"_");
		if (flag) {
			s = "left";
		} else {
			s = "right";
		}
		return stringbuilder.append(s).append("_").append(i).toString();
	}

	public static void a() {
		ui.a(new Runnable() {

			public void run() {
				Object obj = SwipeApplication.e();
				tq.b(ow.a(((Context) (obj))));
				int ai[] = new int[1];
				ai[0] = 8;
				obj = ir.a(((Context) (obj))).edit();
				for (int i = 0; i < ai.length; i++) {
					((android.content.SharedPreferences.Editor) (obj))
							.putBoolean(ow.c(true, "BIG_SECTOR_OUTER", ai[i]),
									false)
							.putBoolean(ow.c(true, "BIG_SECTOR_INNER", ai[i]),
									false)
							.putBoolean(ow.c(true, "SMALL_SECTOR", ai[i]),
									false)
							.putBoolean(ow.c(false, "BIG_SECTOR_OUTER", ai[i]),
									false)
							.putBoolean(ow.c(false, "BIG_SECTOR_INNER", ai[i]),
									false)
							.putBoolean(ow.c(false, "SMALL_SECTOR", ai[i]),
									false);
				}

				((android.content.SharedPreferences.Editor) (obj)).apply();
			}

		});
	}

	public static void a(Bitmap bitmap, boolean flag, String s, int i) {
		SwipeApplication swipeapplication = SwipeApplication.e();
		tf.a(bitmap, a(((Context) (swipeapplication)), flag, s, i));
		tf.a(bitmap);
		ir.c(swipeapplication, d(flag, s, i), true);
	}

	public static boolean b(boolean flag, String s, int i) {
		for (SwipeApplication swipeapplication = SwipeApplication.e(); ir.d(
				swipeapplication, d(flag, s, i), false)
				|| a(swipeapplication, flag, s, i).exists();) {
			return false;
		}

		return true;
	}

	private static File c(Context context) {
		return new File(context.getFilesDir(), "gradient");
	}

	static String c(boolean flag, String s, int i) {
		return d(flag, s, i);
	}

	private static String d(boolean flag, String s, int i) {
		return (new StringBuilder()).append("gradient_theme_cache_")
				.append(a(flag, s, i)).toString();
	}

	private static boolean k() {
		return ItemSectorBg.d();
	}

	public Drawable a(Context context, Fan fan) {
		int i = ox.c();
		boolean flag = fan.i();
		int j = context.getResources().getDimensionPixelSize(0x7f0b002d);
		int l = ox.a(0x7f010014);
		Drawable drawable = a(context, fan, "BIG_SECTOR_INNER", i, j,
				(fan.getTileSectorOuterSize() + j) / 2, flag, b, c, d, l, e);
		Drawable drawable2 = a(context, fan, "BIG_SECTOR_OUTER", i, j,
				fan.getTileSectorOuterSize(), flag, a, c, d, l, 0);
		LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] {
				drawable2, drawable });
		if (flag) {
			layerDrawable.setLayerInset(
					1,
					0,
					drawable2.getIntrinsicHeight()
							- drawable.getIntrinsicHeight(),
					drawable2.getIntrinsicWidth()
							- drawable.getIntrinsicWidth(), 0);
			return layerDrawable;
		} else {
			layerDrawable.setLayerInset(
					1,
					drawable2.getIntrinsicWidth()
							- drawable.getIntrinsicWidth(),
					drawable2.getIntrinsicHeight()
							- drawable.getIntrinsicHeight(), 0, 0);
			return layerDrawable;
		}
	}

	public Drawable b(Context context, Fan fan) {
		int i = ox.c();
		int j = context.getResources().getDimensionPixelSize(0x7f0b002d);
		int l = ox.a(0x7f010014);
		return a(context, fan, "SMALL_SECTOR", i, j,
				fan.getTileSectorInnerSize(), fan.i(), a, c, d, l, e);
	}

}
