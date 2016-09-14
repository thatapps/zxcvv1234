package com.main;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES10;
import android.util.Log;
import android.view.View;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class tf {
	public static final PaintFlagsDrawFilter a;
	public static final Paint b;
	static final int[] c;
	static int d;
	static final int e;
	private static int f;
	private static int g;
	private static int h;
	private static int i;
	private static final Paint j;
	private static final Paint k;
	private static final Paint l;
	private static final Paint m;
	private static Rect n;
	private static final Canvas o;

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	static {
		int n = 1;
		int n2 = -1;
		a = new PaintFlagsDrawFilter(0, 7);
		b = new Paint(7);
		f = n2;
		g = n2;
		h = n2;
		i = n2;
		j = new Paint();
		k = new Paint();
		l = new Paint();
		m = new Paint();
		tf.n = new Rect();
		o = new Canvas();
		o.setDrawFilter((DrawFilter) new PaintFlagsDrawFilter(4, 2));
		c = new int[] { -65536, -16711936, -16776961 };
		d = 0;
		int[] arrn = new int[n];
		try {
			GLES10.glGetIntegerv((int) 3379, (int[]) arrn, (int) 0);
		} catch (Throwable var3_3) {
			n = 0;
		}
		if (n != 0) {
			n2 = arrn[0];
		}
		e = n2;
		vj.a("Swipe.BitmapUtils", "Max texture size: " + e);
	}

	public static int a(BitmapFactory.Options options, int n, int n2) {
		return tf.a(options, n, n2, true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static int a(BitmapFactory.Options options, int n, int n2, boolean bl) {
		int n3 = options.outHeight;
		int n4 = options.outWidth;
		int n5 = 1;
		if (n2 > 0 || n > 0) {
			int n6;
			if (n2 <= 0) {
				n2 = (int) (1.0f * (float) n / (float) n4 * (float) n3);
			} else if (n <= 0) {
				n = (int) (1.0f * (float) n2 / (float) n3 * (float) n4);
			}
			if (!bl) {
				n5 = tf.b(options, Math.min((int) n, (int) n2), n2 * n);
			} else if (n3 > n2 || n4 > n) {
				int n7 = n3 / 2;
				int n8 = n4 / 2;
				while (n7 / n5 > n2 && n8 / n5 > n) {
					n5 *= 2;
				}
				long l = 2 * (n * n2);
				for (long i = (long) (n4 * n3 / n5); i > l; i /= 2) {
					int n9 = n5 * 2;
					n5 = n9;
				}
			}
			if (e > 0 && (n6 = Math.max((int) n3, (int) n4)) > e) {
				while (n6 / n5 > e) {
					n5 *= 2;
				}
			}
		}
		return n5;
	}

	public static Bitmap a(Context context, int n) {
		return tf.a(context, n, 0);
	}

	private static Bitmap a(Context context, int i1, int j1) {
		Object obj1 = null;
		Object obj = null;
		Bitmap bitmap = null;
		if (j1 <= 2) {

			bitmap = BitmapFactory.decodeResource(context.getResources(), i1);
			obj = bitmap;
			Bitmap bitmap1 = c(bitmap);
			obj = bitmap1;
			//context = ((Context) (obj));
			if (bitmap != null) {
				//context = ((Context) (obj));
				if (!bitmap.isRecycled()) {
					bitmap.recycle();
					return ((Bitmap) (obj));
				}
			}
			// return context;
			// if (true) goto _L4; else goto _L3
		} else {
			context = (Context) obj1;
		}

		/*
		 * bitmap = BitmapFactory .decodeResource(context.getResources(), i1);
		 * Object obj = bitmap; Bitmap bitmap1 = c(bitmap); obj = bitmap1;
		 * context = ((Context) (obj)); if (bitmap != null) { context =
		 * ((Context) (obj)); if (!bitmap.isRecycled()) { bitmap.recycle();
		 * return ((Bitmap) (obj)); } }
		 */

		// _L10:
		obj = bitmap;
		Log.e("Swipe.BitmapUtils", "create reverse bitmap failed");
		context = (Context) obj1;
		if (bitmap != null) {
//			context = (Context) obj1;
			if (!bitmap.isRecycled()) {
				bitmap.recycle();
				return null;
			}
		}
		if (obj != null && !((Bitmap) (obj)).isRecycled()) {
			((Bitmap) (obj)).recycle();
		}
		obj = bitmap;
		vk.a();
		obj = bitmap;

		obj = bitmap;
		// context = a(context, i1, j1 + 1);
		obj = context;
		//context = ((Context) (obj));
		if (bitmap == null) {
			return null;
		} else {

			//context = ((Context) (obj));
			if (bitmap.isRecycled()) {
				return null;
			} else {

				bitmap.recycle();
				return ((Bitmap) (obj));
			}

		}

	}

	public static Bitmap a(Context paramContext, Bitmap paramBitmap) {
		return a(paramContext, paramBitmap, true);
	}

	public static Bitmap a(Context paramContext, Bitmap paramBitmap,
			boolean paramBoolean) {
		return paramBitmap;
	}

	public static Bitmap a(Context paramContext, InputStream paramInputStream) {
		return a(paramContext, paramInputStream, 0, 0);
	}

	public static Bitmap a(Context paramContext, InputStream paramInputStream,
			int paramInt1, int paramInt2) {
		Object localObject = null;
		if (paramInt1 > 0) {
		}
		for (BitmapFactory.Options localOptions = new BitmapFactory.Options();; localOptions = null) {
			if (localOptions != null) {
			}
			try {
				localOptions.inJustDecodeBounds = true;
				BitmapFactory
						.decodeStream(paramInputStream, null, localOptions);
				localOptions.inSampleSize = a(localOptions, paramInt1,
						paramInt2);
				localOptions.inJustDecodeBounds = false;
				Bitmap localBitmap = BitmapFactory.decodeStream(
						paramInputStream, null, localOptions);
				localObject = localBitmap;
			} catch (Exception localException) {
				
					Log.w("Swipe.BitmapUtils",
							"Failed to load bitmap from stream: "
									+ localException.getMessage());
				
			} catch (OutOfMemoryError localOutOfMemoryError) {
			
					Log.w("Swipe.BitmapUtils",
							"System is low on memory. Please consider running garbage collection");
				
			}
			return (Bitmap) localObject;
		}
	}

	public static Bitmap a(Resources paramResources, int paramInt) {
		return a(paramResources, paramInt, 0, 0);
	}

	public static Bitmap a(Resources paramResources, int paramInt1,
			int paramInt2, int paramInt3) {
		return a(paramResources, paramInt1, paramInt2, paramInt3, true);
	}

	public static Bitmap a(Resources paramResources, int paramInt1,
			int paramInt2, int paramInt3, boolean paramBoolean) {
		Object localObject = null;
		if (paramInt2 > 0) {
		}
		for (BitmapFactory.Options localOptions = new BitmapFactory.Options();; localOptions = null) {
			if (localOptions != null) {
			}
			try {
				localOptions.inJustDecodeBounds = true;
				BitmapFactory.decodeResource(paramResources, paramInt1,
						localOptions);
				localOptions.inSampleSize = a(localOptions, paramInt2,
						paramInt3, paramBoolean);
				localOptions.inJustDecodeBounds = false;
				Bitmap localBitmap = BitmapFactory.decodeResource(
						paramResources, paramInt1, localOptions);
				localObject = localBitmap;
			} catch (OutOfMemoryError localOutOfMemoryError) {
				for (;;) {
					Log.w("Swipe.BitmapUtils",
							"System is low on memory. Please consider running garbage collection");
				}
			} catch (Exception localException) {
				
					Log.w("Swipe.BitmapUtils",
							"Failed to load bitmap from resource [" + paramInt1
									+ "]: " + localException.getMessage());
				
			}
			return (Bitmap) localObject;
		}
	}

	public static Bitmap a(Bitmap bitmap, int n, int n2) {
		int n3;
		int n4;
		int n5;
		int n6;
		int n7;
		int n8;
		int n9 = bitmap.getWidth();
		if (n9 > (n5 = bitmap.getHeight())) {
			n3 = n5 >> 1;
			int n10 = n9 - n5 >> 1;
			int n11 = n9 - n10;
			n7 = n5;
			n6 = n11;
			n8 = n10;
			n4 = n5;
			do {
				return tf.a(bitmap, new Rect(n8, 0, n6, n4), new Rect(0, 0, n7,
						n5), n3, n, n2);
				// break;
			} while (true);
		}
		n3 = n9 >> 1;
		n5 = n9;
		n7 = n9;
		n4 = n9;
		n6 = n9;
		n8 = 0;
		return tf.a(bitmap, new Rect(n8, 0, n6, n4), new Rect(0, 0, n7, n5),
				n3, n, n2);
	}

	public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2,
			int paramInt3, int paramInt4, Matrix paramMatrix,
			boolean paramBoolean) {
		Bitmap localBitmap1 = null;
		try {
			Bitmap localBitmap2 = Bitmap.createBitmap(paramBitmap, paramInt1,
					paramInt2, paramInt3, paramInt4, paramMatrix, paramBoolean);
			localBitmap1 = localBitmap2;
		} catch (OutOfMemoryError localOutOfMemoryError) {
			vk.a();
			localBitmap1 = Bitmap.createBitmap(paramBitmap, paramInt1,
					paramInt2, paramInt3, paramInt4, paramMatrix, paramBoolean);

		} catch (Throwable localThrowable) {

		}
		return localBitmap1;
	}

	public static Bitmap a(Bitmap bitmap, int n, boolean bl) {
		if (n < 1 || bitmap == null) {
			return null;
		}
		Bitmap bitmap2 = bl ? bitmap : bitmap.copy(bitmap.getConfig(), true);
		int n2 = bitmap2.getWidth();
		int n3 = bitmap2.getHeight();
		int[] arrn = new int[n2 * n3];
		bitmap2.getPixels(arrn, 0, n2, 0, 0, n2, n3);
		tf.a(arrn, n, n2, n3);
		bitmap2.setPixels(arrn, 0, n2, 0, 0, n2, n3);
		return bitmap2;
	}

	public static Bitmap a(Bitmap paramBitmap, Context paramContext) {
		int i1 = paramBitmap.getWidth();
		int i2 = paramBitmap.getHeight();
		int i3 = paramContext.getResources().getDimensionPixelSize(R.dimen.sms_contact_background_size);
		int i4 = paramContext.getResources().getDimensionPixelSize(R.dimen.sms_contact_background_size);
		float f1 = i3 / i1;
		float f2 = i4 / i2;
		Matrix localMatrix = new Matrix();
		localMatrix.postScale(f1, f2);
		return Bitmap
				.createBitmap(paramBitmap, 0, 0, i1, i2, localMatrix, true);
	}

	public static Bitmap a(Bitmap bitmap, Rect rect) {
		if (rect != null)
			return Bitmap.createBitmap((Bitmap) bitmap, (int) rect.left,
					(int) rect.top, (int) rect.width(), (int) rect.height(),
					(Matrix) null, (boolean) true);
		try {
			return Bitmap.createBitmap((Bitmap) bitmap);
		} catch (OutOfMemoryError var2_3) {
			return null;
		}
	}

	private static Bitmap a(Bitmap paramBitmap, Rect paramRect1,
			Rect paramRect2, int paramInt1, int paramInt2, int paramInt3) {
		RectF localRectF = new RectF(paramRect2);
		Bitmap localBitmap = Bitmap.createBitmap(paramRect2.width(),
				paramRect2.height(), Bitmap.Config.ARGB_8888);
		Canvas localCanvas = new Canvas(localBitmap);
		Paint localPaint1 = new Paint();
		localPaint1.setAntiAlias(true);
		localCanvas.drawARGB(0, 0, 0, 0);
		localPaint1.setColor(-12434878);
		localCanvas
				.drawRoundRect(localRectF, paramInt1, paramInt1, localPaint1);
		localPaint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
		localCanvas
				.drawBitmap(paramBitmap, paramRect1, paramRect2, localPaint1);
		if (paramInt2 >= 0) {
			Paint localPaint2 = new Paint(7);
			localPaint2.setStyle(Paint.Style.STROKE);
			localPaint2.setColor(paramInt3);
			localPaint2.setStrokeWidth(paramInt2);
			localCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(),
					(localRectF.height() - paramInt2) / 2.0F, localPaint2);
		}
		return localBitmap;
	}

	public static Bitmap a(Drawable paramDrawable1, Drawable paramDrawable2) {
		int i1 = Math.max(paramDrawable1.getIntrinsicWidth(),
				paramDrawable2.getIntrinsicWidth());
		int i2 = Math.max(paramDrawable1.getIntrinsicHeight(),
				paramDrawable2.getIntrinsicHeight());
		Bitmap localBitmap = Bitmap.createBitmap(i1, i2,
				Bitmap.Config.ARGB_8888);
		Canvas localCanvas = new Canvas(localBitmap);
		Rect localRect1 = paramDrawable1.getBounds();
		int i3 = (i1 - paramDrawable1.getIntrinsicWidth()) / 2;
		int i4 = (i2 - paramDrawable1.getIntrinsicHeight()) / 2;
		paramDrawable1.setBounds(i3, i4,
				i3 + paramDrawable1.getIntrinsicWidth(),
				i4 + paramDrawable1.getIntrinsicHeight());
		paramDrawable1.draw(localCanvas);
		paramDrawable1.setBounds(localRect1);
		Rect localRect2 = paramDrawable2.getBounds();
		int i5 = (i1 - paramDrawable2.getIntrinsicWidth()) / 2;
		int i6 = (i2 - paramDrawable2.getIntrinsicHeight()) / 2;
		paramDrawable2.setBounds(i5, i6,
				i5 + paramDrawable2.getIntrinsicWidth(),
				i6 + paramDrawable2.getIntrinsicHeight());
		paramDrawable2.draw(localCanvas);
		paramDrawable2.setBounds(localRect2);
		return localBitmap;
	}

	public static Bitmap a(View paramView) {
		return a(paramView, 1);
	}

	private static Bitmap a(View view, int n) {
		boolean bl = view.willNotCacheDrawing();
		view.setWillNotCacheDrawing(false);
		int n2 = view.getDrawingCacheBackgroundColor();
		view.setDrawingCacheBackgroundColor(0);
		if (n2 != 0) {
			view.destroyDrawingCache();
		}
		view.buildDrawingCache();
		Bitmap bitmap = view.getDrawingCache();
		if (bitmap == null) {
			Bitmap bitmap2 = null;
			if (n <= 1) {
				vk.a();
				bitmap2 = tf.a(view, n + 1);
			}
			return bitmap2;
		}
		boolean bl2 = view
				.getClass()
				.getName()
				.equals((Object) "com.android.internal.policy.impl.PhoneWindow$DecorView");
		Rect rect = null;
		if (bl2) {
			rect = new Rect();
			view.getWindowVisibleDisplayFrame(rect);
		}
		Bitmap bitmap3 = tf.a(bitmap, rect);
		view.destroyDrawingCache();
		view.setWillNotCacheDrawing(bl);
		view.setDrawingCacheBackgroundColor(n2);
		return bitmap3;
	}

	public static Bitmap a(String paramString, int paramInt1, int paramInt2) {
		return a(paramString, paramInt1, paramInt2, true);
	}

	public static Bitmap a(String paramString, int paramInt1, int paramInt2,
			boolean paramBoolean) {
		Object localObject = null;
		if (paramInt1 > 0) {
		}
		for (BitmapFactory.Options localOptions = new BitmapFactory.Options();; localOptions = null) {
			if (localOptions != null) {
			}
			try {
				localOptions.inJustDecodeBounds = true;
				BitmapFactory.decodeFile(paramString, localOptions);
				localOptions.inSampleSize = a(localOptions, paramInt1,
						paramInt2, paramBoolean);
				localOptions.inJustDecodeBounds = false;
				Bitmap localBitmap = BitmapFactory.decodeFile(paramString,
						localOptions);
				localObject = localBitmap;
			} catch (Throwable localThrowable) {
				for (;;) {
					Log.w("Swipe.BitmapUtils",
							"Failed to load bitmap from File [" + paramString
									+ "]: " + localThrowable.getMessage());
				}
			}
			return (Bitmap) localObject;
		}
	}

	public static Bitmap a(String string, boolean bl) {
		if (!(string != null && new File(string).exists())) {
			return null;
		}
		BitmapFactory.Options options = new BitmapFactory.Options();
		if (bl) {
			options = tf.a(options);
		}
		return BitmapFactory.decodeFile((String) string,
				(BitmapFactory.Options) options);
	}

	public static BitmapFactory.Options a(BitmapFactory.Options paramOptions) {
		if (paramOptions == null) {
			paramOptions = new BitmapFactory.Options();
		}
		paramOptions.inPurgeable = true;
		paramOptions.inPreferredConfig = Bitmap.Config.RGB_565;
		paramOptions.inDither = false;
		paramOptions.inInputShareable = true;
		return paramOptions;
	}

	public static void a(Bitmap bitmap) {
		if (bitmap == null || bitmap.isRecycled()) {
			return;
		}
		try {
			bitmap.recycle();
			return;
		} catch (Exception var1_1) {
			return;
		}
	}

	public static void a(Drawable paramDrawable) {
		if ((paramDrawable instanceof BitmapDrawable)) {
			a(((BitmapDrawable) paramDrawable).getBitmap());
		}
	}

	public static void a(int[] arrn, int n, int n2, int n3) {
		int n4 = n2 - 1;
		int n5 = n3 - 1;
		int n6 = n2 * n3;
		int n7 = 1 + (n + n);
		int[] arrn2 = new int[n6];
		int[] arrn3 = new int[n6];
		int[] arrn4 = new int[n6];
		int[] arrn5 = new int[Math.max((int) n2, (int) n3)];
		int n8 = n7 + 1 >> 1;
		int n9 = n8 * n8;
		int[] arrn6 = new int[n9 * 256];
		for (int i = 0; i < n9 * 256; ++i) {
			arrn6[i] = i / n9;
		}
		int[] arrn7 = new int[] { n7, 3 };
		int[][] arrn8 = (int[][]) Array.newInstance((Class) Integer.TYPE,
				(int[]) arrn7);
		int n10 = n + 1;
		int n11 = 0;
		int n12 = 0;
		int n13 = 0;
		do {
			if (n13 >= n3)
				break;
			int n14 = 0;
			int n15 = -n;
			int n16 = 0;
			int n17 = 0;
			int n18 = 0;
			int n19 = 0;
			int n20 = 0;
			int n21 = 0;
			int n22 = 0;
			int n23 = 0;
			for (int j = n15; j <= n; ++j) {
				int n24 = arrn[n12
						+ Math.min((int) n4, (int) Math.max((int) j, (int) 0))];
				int[] arrn9 = arrn8[j + n];
				arrn9[0] = (16711680 & n24) >> 16;
				arrn9[1] = (65280 & n24) >> 8;
				arrn9[2] = n24 & 255;
				int n25 = n10 - Math.abs((int) j);
				n22 += n25 * arrn9[0];
				n21 += n25 * arrn9[1];
				n20 += n25 * arrn9[2];
				if (j > 0) {
					n16 += arrn9[0];
					n23 += arrn9[1];
					n14 += arrn9[2];
					continue;
				}
				n19 += arrn9[0];
				n18 += arrn9[1];
				n17 += arrn9[2];
			}
			int n26 = n22;
			int n27 = n21;
			int n28 = n20;
			int n29 = n12;
			int n30 = n;
			for (int k = 0; k < n2; ++n29, ++k) {
				arrn2[n29] = arrn6[n26];
				arrn3[n29] = arrn6[n27];
				arrn4[n29] = arrn6[n28];
				int n31 = n26 - n19;
				int n32 = n27 - n18;
				int n33 = n28 - n17;
				int[] arrn10 = arrn8[(n7 + (n30 - n)) % n7];
				int n34 = n19 - arrn10[0];
				int n35 = n18 - arrn10[1];
				int n36 = n17 - arrn10[2];
				if (n13 == 0) {
					arrn5[k] = Math.min((int) (1 + (k + n)), (int) n4);
				}
				int n37 = arrn[n11 + arrn5[k]];
				arrn10[0] = (16711680 & n37) >> 16;
				arrn10[1] = (65280 & n37) >> 8;
				arrn10[2] = n37 & 255;
				int n38 = n16 + arrn10[0];
				int n39 = n23 + arrn10[1];
				int n40 = n14 + arrn10[2];
				n26 = n31 + n38;
				n27 = n32 + n39;
				n28 = n33 + n40;
				n30 = (n30 + 1) % n7;
				int[] arrn11 = arrn8[n30 % n7];
				n19 = n34 + arrn11[0];
				n18 = n35 + arrn11[1];
				n17 = n36 + arrn11[2];
				n16 = n38 - arrn11[0];
				n23 = n39 - arrn11[1];
				n14 = n40 - arrn11[2];
			}
			int n41 = n11 + n2;
			int n42 = n13 + 1;
			n11 = n41;
			n12 = n29;
			n13 = n42;
		} while (true);
		for (int j = 0; j < n2; ++j) {
			int n43 = 0;
			int n44 = n2 * (-n);
			int n45 = -n;
			int n46 = 0;
			int n47 = 0;
			int n48 = 0;
			int n49 = 0;
			int n50 = 0;
			int n51 = 0;
			int n52 = 0;
			int n53 = 0;
			for (int k = n45; k <= n; ++k) {
				int n54 = j + Math.max((int) 0, (int) n44);
				int[] arrn12 = arrn8[k + n];
				arrn12[0] = arrn2[n54];
				arrn12[1] = arrn3[n54];
				arrn12[2] = arrn4[n54];
				int n55 = n10 - Math.abs((int) k);
				int n56 = n52 + n55 * arrn2[n54];
				int n57 = n51 + n55 * arrn3[n54];
				int n58 = n50 + n55 * arrn4[n54];
				if (k > 0) {
					n46 += arrn12[0];
					n53 += arrn12[1];
					n43 += arrn12[2];
				} else {
					n49 += arrn12[0];
					n48 += arrn12[1];
					n47 += arrn12[2];
				}
				if (k < n5) {
					n44 += n2;
				}
				n50 = n58;
				n51 = n57;
				n52 = n56;
			}
			int n59 = n51;
			int n60 = n52;
			int n61 = n50;
			int n62 = j;
			int n63 = n43;
			int n64 = n53;
			int n65 = n46;
			int n66 = n47;
			int n67 = n48;
			int n68 = n49;
			int n69 = n;
			for (int i2 = 0; i2 < n3; n62 += n2, ++i2) {
				arrn[n62] = -16777216 & arrn[n62] | arrn6[n60] << 16
						| arrn6[n59] << 8 | arrn6[n61];
				int n70 = n60 - n68;
				int n71 = n59 - n67;
				int n72 = n61 - n66;
				int[] arrn13 = arrn8[(n7 + (n69 - n)) % n7];
				int n73 = n68 - arrn13[0];
				int n74 = n67 - arrn13[1];
				int n75 = n66 - arrn13[2];
				if (j == 0) {
					arrn5[i2] = n2 * Math.min((int) (i2 + n10), (int) n5);
				}
				int n76 = j + arrn5[i2];
				arrn13[0] = arrn2[n76];
				arrn13[1] = arrn3[n76];
				arrn13[2] = arrn4[n76];
				int n77 = n65 + arrn13[0];
				int n78 = n64 + arrn13[1];
				int n79 = n63 + arrn13[2];
				n60 = n70 + n77;
				n59 = n71 + n78;
				n61 = n72 + n79;
				n69 = (n69 + 1) % n7;
				int[] arrn14 = arrn8[n69];
				n68 = n73 + arrn14[0];
				n67 = n74 + arrn14[1];
				n66 = n75 + arrn14[2];
				n65 = n77 - arrn14[0];
				n64 = n78 - arrn14[1];
				n63 = n79 - arrn14[2];
			}
		}
	}

	public static boolean a(Bitmap var0, File var1_1) {
		if (var0 == null || var1_1 == null) {
			return false;
		}
		boolean var7_3 ;
		if (!var1_1.getParentFile().exists()) {
			var1_1.getParentFile().mkdirs();
		}
		tq.b(var1_1);
		FileOutputStream var3_2 = null;
		try {
			var3_2 = new FileOutputStream(var1_1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			var7_3 = var0.compress(Bitmap.CompressFormat.PNG, 100,
					(OutputStream) var3_2);
			var3_2.flush();
		} catch (Throwable var4_6) {
			var3_2 = null;

			Throwable var4_5 = null;
			Log.w((String) "Swipe.BitmapUtils", (String) "fail to save pic",
					(Throwable) var4_5);
			ub.a((Closeable) var3_2);
			return false;
		}
		ub.a((Closeable) var3_2);
		return var7_3;

	}

	public static boolean a(Bitmap bitmap, String string,
			Bitmap.CompressFormat compressFormat) throws Throwable {
		boolean bl;
		if (bitmap == null)
			return false;
		if (string == null) {
			return false;
		}
		FileOutputStream fileOutputStream = null;
		fileOutputStream = SwipeApplication.e().openFileOutput(string, 1);
		if (fileOutputStream == null)
			return false;
		try {
			bl = bitmap.compress(compressFormat, 90,
					(OutputStream) fileOutputStream);
			fileOutputStream.flush();
		} catch (Throwable var5_5) {
			Log.e((String) "Swipe.BitmapUtils", (String) "fail to save pic",
					(Throwable) var5_5);
			return false;
		} finally {
			ub.a((Closeable) fileOutputStream);
		}
		return bl;
	}

	public static int b(BitmapFactory.Options options, int n, int n2) {
		int n3;
		int n4 = tf.c(options, n, n2);
		if (n4 <= 8) {
			for (n3 = 1; n3 < n4; --n3) {
			}
		} else {
			n3 = 8 * ((n4 + 7) / 8);
		}
		return n3;
	}

	public static boolean b(Bitmap bitmap)
    {
        return bitmap != null && !bitmap.isRecycled();
    }
	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private static int c(BitmapFactory.Options options, int n, int n2) {
		double d = options.outWidth;
		double d2 = options.outHeight;
		int n3 = n2 == -1 ? 1 : (int) Math.ceil((double) Math.sqrt((double) (d
				* d2 / (double) n2)));
		int n4 = n == -1 ? 128 : (int) Math.min(
				(double) Math.floor((double) (d / (double) n)),
				(double) Math.floor((double) (d2 / (double) n)));
		if (n4 < n3) {
			return n3;
		}
		if (n2 == -1 && n == -1) {
			return 1;
		}
		if (n == -1)
			return n3;
		return n4;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static Bitmap c(Bitmap bitmap) {
		if (!to.a()) {
			Matrix matrix = new Matrix();
			matrix.preScale(-1.0f, 1.0f);
			return tf.a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(),
					matrix, true);
		}
		BitmapShader bitmapShader = new BitmapShader(bitmap,
				Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
		Paint paint = new Paint();
		paint.setShader((Shader) bitmapShader);
		int n = bitmap.getWidth();
		int n2 = bitmap.getHeight();
		int n3 = bitmap.getWidth();
		int n4 = bitmap.getHeight();
		Bitmap.Config config = bitmap.hasAlpha() ? Bitmap.Config.ARGB_8888
				: Bitmap.Config.RGB_565;
		Bitmap bitmap2 = Bitmap.createBitmap((int) n3, (int) n4,
				(Bitmap.Config) config);
		Canvas canvas = new Canvas(bitmap2);
		canvas.translate((float) n, 0.0f);
		canvas.scale(-1.0f, 1.0f);
		canvas.drawRect(0.0f, 0.0f, (float) n, (float) n2, paint);
		return bitmap2;
	}

	public static byte[] d(Bitmap bitmap) {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.PNG, 100,
				(OutputStream) byteArrayOutputStream);
		return byteArrayOutputStream.toByteArray();
	}
}
