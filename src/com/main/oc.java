package com.main;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;

public class oc {
	PointF a = new PointF();
	PointF b = new PointF();
	PointF c = new PointF();
	PointF d = new PointF();
	PointF e = new PointF();
	PointF f = new PointF();
	PointF g = new PointF();
	PointF h = new PointF();
	PointF i = new PointF();
	PointF j = new PointF();
	float k = 500.0F;
	float l = 1.0F;
	float m = 9.8F;
	float n = 0.9F;
	float o = 1.25F * this.k;
	boolean p = false;
	float q = 1.0F;
	Path r = new Path();
	Paint s = new Paint(1);

	oc() {
		this.s.setColor(-921103);
		this.s.setStyle(Paint.Style.STROKE);
		this.s.setStrokeWidth(5.0F);
	}

	private void e() {
		this.b.set((this.a.x + this.c.x) / 2.0F, (this.a.y + this.c.y) / 2.0F
				+ g());
		c();
	}

	private void f() {
		float f1 = (this.a.x + this.c.x) / 2.0F;
		float f2 = (this.a.y + this.c.y) / 2.0F + g();
		this.b.set(f1, f2);
		c();
	}

	private float g() {
		float f1 = (float) Math.hypot(this.a.x - this.c.x, this.a.y - this.c.y);
		if (f1 >= this.k) {
		}
		for (float f2 = 0.0F;; f2 = 1.0F * (this.k - f1)) {
			return f2;
		}
	}

	private void h() {
		float f1 = this.k / 2.0F;
		float f2 = (float) Math.hypot(this.a.x - this.b.x, this.a.y - this.b.y);
		float f4;
		if (f2 < f1) {
			this.h.set(0.0F, 0.0F);
			f4 = (float) Math.hypot(this.b.x - this.c.x, this.b.y - this.c.y);
			if (f4 >= f1) {
				float f5 = (f4 - f1) * this.l;
				this.i.set(f5 * ((this.b.x - this.c.x) / f4), f5
						* ((this.b.y - this.c.y) / f4));
			}
			this.i.set(0.0F, 0.0F);
		}

		float f3 = (f2 - f1) * this.l;
		this.h.set(f3 * ((this.a.x - this.b.x) / f2), f3
				* ((this.a.y - this.b.y) / f2));
		// break;
		// label171:

	}

	void a() {
		this.p = false;
		this.i.set(0.0F, 0.0F);
		this.f.set(0.0F, 0.0F);
		this.h.set(0.0F, 0.0F);
		this.e.set(0.0F, 0.0F);
	}

	void a(float paramFloat) {
		this.m = (Math.min(1.0F, paramFloat / 3.0F) * this.m);
	}

	void a(float paramFloat1, float paramFloat2) {
		this.a.set(paramFloat1, paramFloat2);
		e();
	}

	void a(Bitmap paramBitmap, float paramFloat) {
		this.s.setStrokeWidth(paramFloat);
		if (paramBitmap == null) {
			this.s.setShader(null);

			this.s.setShader(new BitmapShader(paramBitmap,
					Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));

		}

	}

	void a(Canvas paramCanvas) {
		paramCanvas.drawPath(this.r, this.s);
	}

	void b(float paramFloat) {
		this.k = (paramFloat - 2.0F * this.m / this.l);
		this.c.set(this.a.x, paramFloat + this.a.y);
		e();
	}

	void b(float paramFloat1, float paramFloat2) {
		this.j.set(paramFloat1, paramFloat2);
		this.c.set(paramFloat1, paramFloat2);
		f();
	}

	boolean b() {
		boolean bool = false;
		if (!this.p) {
		}

		h();
		this.e.offset(this.h.x, this.h.y);
		this.e.offset(-this.i.x, -this.i.y);
		PointF localPointF1 = this.e;
		localPointF1.x *= this.n;
		PointF localPointF2 = this.e;
		localPointF2.y *= this.n;
		this.b.offset(this.e.x, this.e.y);
		this.f.offset(0.0F, this.m);
		this.f.offset(this.i.x / 2.0F, this.i.y / 2.0F);
		PointF localPointF3 = this.f;
		localPointF3.x *= this.n;
		PointF localPointF4 = this.f;
		localPointF4.y *= this.n;
		this.c.offset(this.f.x, this.f.y);
		c();
		if ((this.e.length() > 1.0F)
				|| (this.f.length() > 1.0F)
				|| (Math.abs(this.a.x - this.c.x) > 1.0F)
				|| (Math.abs(this.a.x - this.b.x) > 1.0F)
				|| (Math.abs(Math.abs(this.c.y - this.a.y) - this.k) > 4.0F * this.m)) {
			bool = true;
		}
		return bool;
	}

	void c() {
		this.r.reset();
		this.r.moveTo(this.a.x, this.a.y);
		this.r.quadTo(this.b.x, this.b.y, this.c.x, this.c.y);
	}

	void c(float paramFloat) {
		float f1 = paramFloat - this.a.x;
		this.a.offset(f1, 0.0F);
		this.b.offset(f1, 0.0F);
		this.c.offset(f1, 0.0F);
		c();
	}

	void c(float paramFloat1, float paramFloat2) {
		this.f.set(paramFloat1 / 72.0F, paramFloat2 / 72.0F);
		this.p = true;
	}

	float d() {
		float f1 = 0.0F;
		float f2 = (float) Math.hypot(this.j.x - this.a.x, this.j.y - this.a.y);
		if (f2 == 0.0F) {
		}

		f1 = (f2 - this.k) * this.l * (this.j.y - this.a.y) / f2;
		return f1;
	}

}
