package com.main;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

import com.lazyswipe.SwipeApplication;

public class np extends Drawable {
	private Paint a;
	private Paint b;
	private Path c;
	private int d;
	private int e = 2;
	private boolean f;

	public np(boolean paramBoolean) {
		this.f = paramBoolean;
		this.d = vk.a(SwipeApplication.e(), 47.0F);
		this.b = new Paint();
		this.b.setColor(-1);
		this.b.setStyle(Paint.Style.FILL_AND_STROKE);
		this.b.setStrokeCap(Paint.Cap.ROUND);
		this.b.setFlags(7);
		this.a = new Paint();
		this.a.setFlags(7);
		if (paramBoolean) {
			this.a.setColor(872415231);
			this.a.setStyle(Paint.Style.FILL);
		}

		this.c = new Path();
		int i = (int) (0.3D * this.d);
		int j = (int) (0.5D * i * Math.sqrt(3.0D));
		this.c.moveTo((int) (this.d / 2 - 0.3D * j), this.d / 2 - i / 2);
		this.c.lineTo((int) (this.d / 2 - 0.3D * j), this.d / 2 + i / 2);
		this.c.lineTo((int) (this.d / 2 + 0.6D * j), this.d / 2);
		this.c.close();

		this.a.setColor(-1);
		this.a.setStyle(Paint.Style.STROKE);
		this.a.setStrokeWidth(this.e);

		return;
	}

	public void draw(Canvas paramCanvas) {
		if (this.f) {
			paramCanvas.drawCircle(this.d / 2, this.d / 2,
					(this.d - this.e) / 2, this.a);
		}
		
			paramCanvas.drawPath(this.c, this.b);
			
			paramCanvas.drawCircle(this.d / 2, this.d / 2,
					(this.d - this.e) / 2, this.a);
		
	}

	public int getIntrinsicHeight() {
		return this.d;
	}

	public int getIntrinsicWidth() {
		return this.d;
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int paramInt) {
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
	}
}
