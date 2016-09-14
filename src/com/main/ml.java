package com.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class ml extends Drawable {
	private int a;
	private int b;
	private float c;
	private float d;
	private Path e;
	private Path f;
	private final Paint g = new Paint();
	private Paint h;
	private boolean i = false;
	private float j;
	private float k = 3.0F;
	private int l;

	public ml(Context paramContext, boolean paramBoolean) {
		this.g.setStyle(Paint.Style.FILL);
		this.g.setStrokeWidth(paramContext.getResources().getDimension(
				R.dimen.fan_tab_indicator_drawable_stroke_width));
		this.g.setColor(ox.a(R.attr.fanTabIndicatorColor));
		this.g.setAntiAlias(true);
		this.i = paramBoolean;
		this.l = SwipeApplication.e().getResources()
				.getDimensionPixelSize(R.dimen.fan_tab_indicator_drawable_padding);
	}

	private void a() {
		float f;
		RectF rectF;
		float f2;
		float f3;
		float f4;
		float f5;
		RectF rectF2;
		float f6;
		float f7;
		float f8;
		if (this.e == null) {
			this.e = new Path();
		} else {
			this.e.reset();
		}
		int n = this.getIntrinsicHeight();
		int n2 = this.getIntrinsicWidth();
		float f9 = this.j - 2.0f * this.k;
		if (this.i) {
			f2 = (float) ((double) this.a * Math.cos((double) Math
					.toRadians((double) (f9 + this.k))));
			f3 = (float) ((double) n - (double) this.a
					* Math.sin((double) Math.toRadians((double) (f9 + this.k))));
			rectF = new RectF((float) (-this.a), (float) (n - this.a),
					(float) this.a, (float) (n + this.a));
			f4 = -this.j + this.k;
			f8 = this.b;
			f = (float) ((double) n - (double) this.b
					* Math.sin((double) Math.toRadians((double) this.k)));
			rectF2 = new RectF((float) (-this.b), (float) (n - this.b),
					(float) this.b, (float) (n + this.b));
			float f10 = 0.0f - this.k;
			f5 = -f9;
			f7 = f9;
			f6 = f10;
		} else {
			f2 = (float) ((double) n2 - (double) this.b
					* Math.cos((double) Math.toRadians((double) (f9 + this.k))));
			f3 = (float) ((double) n - (double) this.b
					* Math.sin((double) Math.toRadians((double) (f9 + this.k))));
			rectF = new RectF((float) (n2 - this.b), (float) (n - this.b),
					(float) (n2 + this.b), (float) (n + this.b));
			f4 = 180.0f + this.j - this.k;
			f7 = -f9;
			f8 = n2 - this.a;
			f = (float) ((double) n - (double) this.a
					* Math.sin((double) Math.toRadians((double) this.k)));
			rectF2 = new RectF((float) (n2 - this.a), (float) (n - this.a),
					(float) (n2 + this.a), (float) (n + this.a));
			f6 = 180.0f + this.k;
			f5 = f9;
		}
		this.e.moveTo(f2, f3);
		this.e.arcTo(rectF, f4, f7);
		this.e.lineTo(f8, f);
		this.e.arcTo(rectF2, f6, f5);
		this.e.lineTo(f2, f3);
		this.e.close();
		if (0.0f >= this.c && 0.0f >= this.d) {
			return;
		}
		if (this.c > 0.0f && this.d > 0.0f) {
			this.h = new Paint(this.g);
			this.h.setStyle(Paint.Style.STROKE);
			this.h.setDither(true);
			this.h.setStrokeJoin(Paint.Join.ROUND);
			this.h.setStrokeCap(Paint.Cap.ROUND);
			this.h.setPathEffect((PathEffect) new CornerPathEffect(this.c));
			if (this.f == null) {
				this.f = new Path();
			} else {
				this.f.reset();
			}
			float f11 = this.g.getStrokeWidth() / 2.0f / 2.0f;
			rectF.offset(f11, f11);
			rectF2.offset(-f11, -f11);
			this.f.moveTo(f2 + f11, f3 + f11);
			this.f.arcTo(rectF, f4, f7);
			this.f.lineTo(f8 - f11, f - f11);
			this.f.arcTo(rectF2, f6, f5);
			this.f.lineTo(f2 + f11, f3 + f11);
			this.f.close();
			return;
		}
		throw new RuntimeException(
				"Unimplemented, please contact the developer!");
	}

	public void a(float paramFloat1, float paramFloat2) {
		a(paramFloat1, paramFloat2, false);
	}

	public void a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
		this.c = paramFloat1;
		this.d = paramFloat2;
		if (paramBoolean) {
			a();
		}
	}

	public void a(int paramInt1, int paramInt2) {
		a(paramInt1, paramInt2, true);
	}

	public void a(int paramInt1, int paramInt2, boolean paramBoolean) {
		if ((paramInt1 != this.a) || (paramInt2 != this.b)) {
			this.a = (paramInt1 + this.l);
			this.b = (paramInt2 - this.l);
			if (paramBoolean) {
				a();
			}
		}
	}

	public void a(int paramInt, boolean paramBoolean) {
		float f1 = 90.0F / paramInt;
		if (Math.abs(f1 - this.j) >= 0.01D) {
			this.j = f1;
			if (paramBoolean) {
				a();
			}
		}
	}

	public void draw(Canvas canvas) {
		if (this.e == null) {
			return;
		}
		if (this.h == null) {
			canvas.drawPath(this.e, this.g);
			return;
		}
		canvas.drawPath(this.f, this.g);
		canvas.drawPath(this.e, this.h);
	}

	public int getIntrinsicHeight() {
		return (int) ((this.b + this.l) * Math
				.sin(3.141592653589793D * this.j / 180.0D));
	}

	public int getIntrinsicWidth() {
		return this.b + this.l;
	}

	public int getOpacity() {
		return -3;
	}

	public void setAlpha(int paramInt) {
		this.g.setAlpha(paramInt * this.g.getAlpha() / 255);
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
	}
}
