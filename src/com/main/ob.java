package com.main;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

public class ob {
	private static Camera k = new Camera();
	private static Matrix l = new Matrix();
	PointF a;
	PointF b;
	PointF c = new PointF();
	Paint d = new Paint(3);
	float e;
	float f;
	float g;
	Bitmap h;
	Bitmap i;
	boolean j;

	ob() {
		this.d.setStyle(Paint.Style.STROKE);
		this.d.setColor(-10079488);
		this.d.setStrokeWidth(5.0F);
	}

	void a() {
		float f1 = this.a.x - this.b.x;
		float f2 = this.a.y - this.b.y;
		float f3 = (float) Math.hypot(f1, f2);
		if (f3 == 0.0F) {
			this.c.set(this.a.x, this.a.y);
		}

		this.c.set(this.a.x + f1 * this.e / f3, this.a.y + f2 * this.e / f3);
		return;
	}

	void a(float paramFloat) {
		this.f = paramFloat;
	}

	void a(float paramFloat1, float paramFloat2, PointF paramPointF) {
		this.c.set(paramFloat1, paramFloat2);
		float f1;
		float f2;
		float f3;
		if (paramPointF != null) {
			f1 = this.b.x - paramFloat1;
			f2 = this.b.y - paramFloat2;
			f3 = (float) Math.hypot(f1, f2);
			if (f3 != 0.0F) {
				paramPointF.set(this.c.x + f1 * this.e / f3, this.c.y + f2
						* this.e / f3);
			}
			paramPointF.set(this.c.x, this.c.y + this.e);
		}

	}

	void a(float paramFloat, Bitmap paramBitmap) {
		this.e = paramFloat;
		this.h = paramBitmap;
	}

	void a(Bitmap paramBitmap) {
		this.i = paramBitmap;
	}

	void a(Canvas paramCanvas) {
		float f1 = (float) Math.toDegrees(Math.atan2(this.b.x - this.c.x,
				this.b.y - this.c.y));
		paramCanvas.save();
		paramCanvas.rotate(180.0F - f1, this.a.x, this.a.y);
		if (this.f != 1.0F) {
			paramCanvas.scale(this.f, this.f, this.a.x, this.a.y);
		}
		if (this.g != 0.0F) {
			l.reset();
			k.save();
			k.rotateY(this.g);
			k.getMatrix(l);
			k.restore();
			l.preTranslate(-this.a.x, -this.a.y);
			l.postTranslate(this.a.x, this.a.y);
			paramCanvas.concat(l);
		}
		if (this.i != null) {
			if ((this.g > 90.0F) && (this.g <= 270.0F)) {
				paramCanvas.drawBitmap(this.i, this.a.x - this.i.getWidth()
						/ 2.0F, this.a.y, this.d);
			}
		}

		paramCanvas.restore();

		paramCanvas.drawBitmap(this.h, this.a.x - this.h.getWidth() / 2.0F,
				this.a.y, this.d);
		// continue;
		// paramCanvas.drawBitmap(this.h, this.a.x - this.h.getWidth() / 2.0F,
		// this.a.y, this.d);

	}

	void a(oc paramoc) {
		this.a = paramoc.c;
		this.b = paramoc.b;
		a();
	}

	boolean a(float paramFloat1, float paramFloat2) {
		boolean bool = false;
		if (this.e <= 0.0F) {
		}

		if (Math.hypot(paramFloat1 - this.c.x, paramFloat2 - this.c.y) < 1.4F
				* this.e * Math.max(1.0F, this.f)) {
			bool = true;
		}
		return bool;
	}

	void b(float paramFloat) {
		if (this.j) {
		}
		for (int m = 180;; m = 0) {
			this.g = (paramFloat + m);
			return;
		}
	}
}
