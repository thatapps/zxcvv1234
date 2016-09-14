package com.main;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.FloatMath;

class nv {
	Paint a = new Paint(1);
	PointF b = new PointF();
	PointF c = new PointF();
	PointF d = new PointF();
	float e;
	int f = 0;
	int g = 10;
	boolean h = false;
	boolean i = true;
	final nt j;

	nv(nt nt) {
		this.j = nt;
		this.a = new Paint(1);
		this.b = new PointF();
		this.c = new PointF();
		this.d = new PointF();
		this.f = 0;
		this.g = 10;
		this.h = false;
		this.i = true;
	}

	void a() {
		if (nt.c(this.j)) {
			if (nt.d(this.j) > 0) {
				nt.e(this.j);
				this.j.b[0] = 175.0f + (float) (3 * this.j.a.nextInt(10));
			} else {
				this.j.b[0] = 12.0f * (float) this.j.a.nextInt(10) - 60.0f;
				if (this.j.b[0] < 0.0f) {
					float[] arrf = this.j.b;
					arrf[0] = 360.0f + arrf[0];
				}
			}
		} else if (nt.d(this.j) > 0) {
			nt.e(this.j);
			this.j.b[0] = 280.0f + 2.5f * (float) this.j.a.nextInt(10);
		} else {
			this.j.b[0] = 120.0f + 12.0f * (float) this.j.a.nextInt(10);
		}
		this.j.b[1] = 1.0f;
		this.j.b[2] = 1.0f;
		Paint paint = this.a;
		int n = this.f % 3 == 0 ? 255 : 128;
		paint.setColor(Color.HSVToColor((int) n, (float[]) this.j.b));
	}
	void a(float f1, float f2)
    {
        float f4 = f2 - nt.b(j);
        f2 = (float)Math.hypot(f1, f4);
        float f3 = (d.x * f4 + d.y * -f1) / f2;
        f4 = (f4 * (2.0F * f3)) / f2;
        f1 = (f3 * 2.0F * -f1) / f2;
        d.x = f4 - d.x;
        d.y = f1 - d.y;
    }
	void a(int n) {
		this.f = n;
		if (!this.h) {
			int n2 = nt.a(this.j).getResources()
					.getDimensionPixelSize(2131427361);
			float f = 2.5f * (1.5f * ((float) n2 / 2.0f));
			float f2 = n > 8 ? 3.5f : 2.5f;
			float f3 = f / f2;
			float f4 = 2.5f * (1.5f * ((float) n2 / 2.0f));
			float f5 = n > 8 ? 8.0f : 4.5f;
			float f6 = f4 / f5;
			this.e = f6 + this.j.a.nextFloat() * (f3 - f6);
		}
		if (n < 3) {
			this.g = 20;
			float f = nt.b(this.j) - 0.8f * (this.j.a.nextFloat() * this.e);
			float f7 = (float) Math.toRadians((double) (30.0 * Math.pow(
					(double) -1.0, (double) n) * (double) FloatMath
					.ceil((float) ((float) n / 2.0f))));
			this.c.set(f * FloatMath.sin((float) f7), nt.b(this.j) - f
					* FloatMath.cos((float) f7));
		} else if (n < 8) {
			this.g = 13;
			float f = nt.b(this.j) - nt.b(this.j) / 2.0f - 0.5f
					* ((this.j.a.nextFloat() - 0.5f) * this.e);
			float f8 = FloatMath.ceil((float) (((float) n - 3.0f) / 2.0f));
			float f9 = 30.0f * f8;
			float f10 = f8 > 0.0f ? 5.0f * (f8 - 1.0f) : 0.0f;
			float f11 = (float) Math
					.toRadians((double) ((double) (f9 - f10) * Math.pow(
							(double) -1.0, (double) (n - 3))));
			this.c.set(
					f * FloatMath.sin((float) f11) / FloatMath.cos((float) f11),
					nt.b(this.j) - f);
		} else if (n < 14) {
			this.g = 6;
			float f = nt.b(this.j) - nt.b(this.j) / 1.4f - 0.6f
					* ((this.j.a.nextFloat() - 0.25f) * this.e);
			float f12 = FloatMath.ceil((float) (((float) n - 7.0f) / 2.0f));
			float f13 = (float) Math
					.toRadians((double) ((double) (32.0f * f12 - 15.0f * (f12 - 1.0f)) * Math
							.pow((double) -1.0, (double) (n - 7))));
			this.c.set(
					f * FloatMath.sin((float) f13) / FloatMath.cos((float) f13),
					nt.b(this.j) - f);
		} else {
			this.g = 0;
			float f = nt.b(this.j) - nt.b(this.j) / 1.1f;
			float f14 = FloatMath.ceil((float) ((float) (n - 14) / 2.0f));
			float f15 = 75.0f * f14;
			float f16 = f14 > 0.0f ? 67.0f * (f14 - 1.0f) : 0.0f;
			float f17 = (float) Math
					.toRadians((double) ((double) (f15 - f16) * Math.pow(
							(double) -1.0, (double) (n - 14))));
			this.c.set(
					f * FloatMath.sin((float) f17) / FloatMath.cos((float) f17)
							+ (this.j.a.nextFloat() - 0.5f) * this.e,
					nt.b(this.j) - f + 0.5f
							* ((this.j.a.nextFloat() - 0.1f) * this.e));
		}
		if (!this.h) {
			this.b.x = this.c.x;
			this.b.y = -this.e;
			this.a();
			this.d.set(0.0f, 0.0f);
		}
		this.h = true;
		this.i = true;
	}

	void a(boolean paramBoolean) {
		if (!this.h) {
			return;
		}
		float f1 = this.b.x + this.d.x;
		float f2 = this.b.y + this.d.y;
		float f3 = (float) Math.hypot(f1, f2 - nt.b(this.j));
		float f4 = nt.b(this.j);
		if (f3 > f4) {
			if (paramBoolean) {
				this.h = false;
				this.d.set(0.0F, 0.0F);
			}
			f1 = f1 * f4 / f3;
			f2 = f4 * (f2 - nt.b(this.j)) / f3 + nt.b(this.j);
			a(f1, f2);
		}

		this.b.set(f1, f2);
		// break;
		// label129:

	}

	boolean a(Canvas paramCanvas) {
		boolean bool1 = false;
		boolean bool2 = true;
		if (!this.h) {
			return bool1;
		}
		if (!nt.f(this.j)) {
			if (!b()) {
				a(bool2);
			}
		}

		paramCanvas.drawCircle(this.b.x + nt.g(this.j).x,
				nt.g(this.j).y - nt.b(this.j) + this.b.y, this.e, this.a);
		bool1 = bool2;
		
		if (this.i) {
			int k = this.g;
			this.g = (k - 1);
			if (k <= 0) {
				if ((float) Math
						.hypot(this.b.x - this.c.x, this.b.y - this.c.y) > this.e / 16.0F) {
					PointF localPointF1 = this.b;
					localPointF1.x += (this.c.x - this.b.x) / 8.0F;
					PointF localPointF2 = this.b;
					localPointF2.y += (this.c.y - this.b.y) / 8.0F;
				} else {
					this.i = false;
				}
			}
		} else {
			bool2 = false;
		}
		return bool2;

	}

	void b(boolean bl) {
		float f = bl ? (float) (6.283185307179586 * (double) this.j.a
				.nextFloat())
				: (float) (3.141592653589793 * (double) (0.375f + 0.25f * this.j.a
						.nextFloat()));
		float f2 = (0.5f + 0.5f * this.j.a.nextFloat()) * this.j.c;
		this.d.set(f2 * FloatMath.cos((float) f), f2 * FloatMath.sin((float) f));
	}

	boolean b() {
		if (this.d.x * this.d.y == 0.0f) {
			return true;
		}
		return false;
	}
}
