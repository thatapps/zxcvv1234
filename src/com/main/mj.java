package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class mj extends Drawable {
	private static final String a = "Swipe." + mj.class.getSimpleName();
	private boolean A;
	private static boolean B;
	private boolean C;
	private Paint b = new Paint(7);
	private Paint c = new Paint(7);
	private Paint d = new Paint(7);
	private Paint e = new Paint();
	private Paint f = new Paint(7);
	private Paint g = new Paint(7);
	private Paint h = new Paint(7);
	private Paint i = new Paint();
	private static int j;
	private static int k;
	private int[] l;
	private float[] m;
	private int[] n;
	private float[] o;
	private static int[] p;
	private static float[] q;
	private static int r;
	private int s;
	private boolean t;
	private int u;
	private PorterDuffXfermode v;
	private String w;
	private int x;
	private boolean y;
	private boolean z;

	public mj(int paramInt1, int paramInt2, boolean paramBoolean1,
			String paramString, int paramInt3, int[] paramArrayOfInt,
			float[] paramArrayOfFloat, int paramInt4, int paramInt5,
			int paramInt6, boolean paramBoolean2) {
		this.j = paramInt1;
		this.k = paramInt2;
		this.w = paramString;
		this.x = paramInt3;
		Resources localResources = SwipeApplication.e().getResources();
		this.r = localResources.getDimensionPixelSize(R.dimen.fan_items_sector_outer_shadow_size);
		this.s = localResources.getDimensionPixelSize(R.dimen.fan_items_sector_inner_shadow_size);
		this.u = (paramInt2 + this.r);
		this.t = paramBoolean1;
		this.y = paramBoolean2;
		a(paramArrayOfInt, paramArrayOfFloat);
		a(paramInt4, paramInt5);
		a(paramInt6);
		try {
			this.v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
			return;
		} catch (Throwable localThrowable) {
			
		}
	}

	private void a() {
		if (!ow.b(this.t, this.w, this.x)) {
			return;
		}
		Bitmap bitmap = Bitmap.createBitmap((int) this.u, (int) this.u,
				(Bitmap.Config) Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		int n = this.t ? 0 : this.u;
		int n2 = this.u;
		if (this.z) {
			SweepGradient sweepGradient = new SweepGradient((float) n,
					(float) n2, this.l, this.m);
			this.f.setShader((Shader) sweepGradient);
		}
		if (this.A) {
			int n3 = (Integer) (this.t ? vk.a((Context) SwipeApplication.e(),
					-3.0f) : 0);
			RadialGradient radialGradient = new RadialGradient(
					(float) (n3 + n), (float) n2, (float) this.u, this.n,
					this.o, Shader.TileMode.CLAMP);
			this.g.setStyle(Paint.Style.FILL);
			this.g.setShader((Shader) radialGradient);
		}
		if (this.B) {
			RadialGradient radialGradient = new RadialGradient((float) n,
					(float) n2, (float) this.j, this.p, this.q,
					Shader.TileMode.CLAMP);
			this.h.setStyle(Paint.Style.FILL);
			this.h.setShader((Shader) radialGradient);
		}
		Paint paint = this.f;
		Paint paint2 = this.g;
		Paint paint3 = this.h;
		Paint paint4 = this.i;
		this.a(canvas, n, n2, 1.0f, paint, paint2, paint3, paint4);
		ow.a(bitmap, this.t, this.w, this.x);
	}

	static void a(int n) {
		if (n == 0) {
			B = false;
			return;
		}
		B = true;
		p = new int[] { 0, 0, n };
		float[] arrf = new float[] { 0.0f,
				(float) (j - r) / (float) j, 1.0f };
		q = arrf;
	}

	private void a(int n, int n2) {
		if (n == 0 && n2 == 0) {
			this.A = false;
			return;
		}
		this.A = true;
		int[] arrn = new int[] {
				0,
				0,
				n,
				n2,
				Color.argb((int) 29, (int) Color.red((int) n2),
						(int) Color.green((int) n2), (int) Color.blue((int) n2)),
				0, 0 };
		this.n = arrn;
		float[] arrf = new float[] {
				0.0f,
				(float) (this.k - this.s) / (float) this.u,
				(float) (-1 + this.k) / (float) this.u,
				(float) this.k / (float) this.u,
				(float) (0.99 + (double) ((float) this.k / (float) this.u)) / 2.0f,
				0.99f, 1.0f };
		this.o = arrf;
	}

	private void a(Canvas paramCanvas, int paramInt1, int paramInt2,
			float paramFloat, Paint paramPaint1, Paint paramPaint2,
			Paint paramPaint3, Paint paramPaint4) {
		DrawFilter localDrawFilter = paramCanvas.getDrawFilter();
		paramCanvas.setDrawFilter(tf.a);
		if (this.z) {
			paramCanvas.drawCircle(paramInt1, paramInt2, paramFloat * this.k,
					paramPaint1);
		}
		if (this.A) {
			paramCanvas.drawCircle(paramInt1, paramInt2, paramFloat * this.u,
					paramPaint2);
		}
		paramPaint4.setXfermode(this.v);
		paramCanvas.drawCircle(paramInt1, paramInt2, paramFloat * this.j,
				paramPaint4);
		paramPaint4.setXfermode(null);
		if (this.B) {
			paramCanvas.drawCircle(paramInt1, paramInt2, paramFloat * this.j,
					paramPaint3);
		}
		paramCanvas.setDrawFilter(localDrawFilter);
	}

	private void a(int[] arrn, float[] arrf) {
		if (arrn == null || arrf == null) {
			this.z = false;
			return;
		}
		if (arrn.length != arrf.length) {
			this.z = false;
			throw new IllegalArgumentException(
					"SectorGradientDrawable init failed");
		}
		this.z = true;
		int n = arrf.length;
		if (this.t) {
			this.m = new float[n + 3];
			this.l = new int[n + 3];
			this.m[0] = 0.0f;
			this.l[0] = arrn[n - 1];
			this.m[1] = 0.7499f;
			this.l[1] = arrn[0];
			for (int i = 0; i < n; ++i) {
				this.m[i + 2] = 0.75f + 0.2475f * arrf[i];
				this.l[i + 2] = arrn[i];
			}
			this.m[-1 + this.m.length] = 1.0f;
			this.l[-1 + this.m.length] = arrn[n - 1];
			return;
		}
		this.m = new float[n + 4];
		this.l = new int[n + 4];
		this.m[0] = 0.0f;
		this.l[0] = arrn[n - 1];
		this.m[1] = 0.499f;
		this.l[1] = arrn[n - 1];
		for (int i = 0; i < n; ++i) {
			this.m[2 + (-1 + (n - i))] = 0.75f - 0.2475f * arrf[i];
			this.l[2 + (-1 + (n - i))] = arrn[i];
		}
		this.m[n + 2] = 0.75f;
		this.l[n + 2] = arrn[0];
		this.m[n + 3] = 1.0f;
		this.l[n + 3] = arrn[0];
	}

	public void draw(Canvas canvas) {
		if (this.k <= 0) {
			return;
		}
		Rect rect = this.getBounds();
		float f = 1.0f
				* (float) Math.min((int) rect.width(), (int) rect.height())
				/ (float) this.u;
		int n = this.t ? rect.left : rect.right;
		int n2 = rect.bottom;
		canvas.saveLayer((float) rect.left, (float) rect.top,
				(float) rect.right, (float) rect.bottom, null, 31);
		Paint paint = this.b;
		Paint paint2 = this.c;
		Paint paint3 = this.d;
		Paint paint4 = this.e;
		this.a(canvas, n, n2, f, paint, paint2, paint3, paint4);
		canvas.restore();
		if (this.C)
			return;
		this.C = true;
		ui.a((Runnable) new Runnable() {

			public void run() {
				mj.this.a();
			}
		});
	}

	public int getIntrinsicHeight() {
		return this.u;
	}

	public int getIntrinsicWidth() {
		return this.u;
	}

	public int getOpacity() {
		return -3;
	}

	protected void onBoundsChange(Rect rect) {
		float f = (float) Math.min((int) rect.width(), (int) rect.height())
				/ (float) this.u;
		int n = this.t ? rect.left : rect.right;
		int n2 = rect.bottom;
		if (this.z) {
			SweepGradient sweepGradient = new SweepGradient((float) n,
					(float) n2, this.l, this.m);
			this.b.setShader((Shader) sweepGradient);
		}
		if (this.A) {
			int n3 = this.y && this.t ? vk.a((Context) SwipeApplication.e(),
					-3.0f) : 0;
			RadialGradient radialGradient = new RadialGradient(
					(float) (n3 + n), (float) n2, f * (float) this.u, this.n,
					this.o, Shader.TileMode.CLAMP);
			this.c.setStyle(Paint.Style.FILL);
			this.c.setShader((Shader) radialGradient);
		}
		if (this.B) {
			RadialGradient radialGradient = new RadialGradient((float) n,
					(float) n2, f * (float) this.j, this.p, this.q,
					Shader.TileMode.CLAMP);
			this.d.setStyle(Paint.Style.FILL);
			this.d.setShader((Shader) radialGradient);
		}
	}

	public void setAlpha(int paramInt) {
		this.b.setAlpha(paramInt);
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
		this.b.setColorFilter(paramColorFilter);
	}
}
