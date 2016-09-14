package com.main;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

import com.lazyswipe.SwipeApplication;

public class no extends Drawable {
	private int a;
	private int b;
	private Paint c;

	public no(int[] paramArrayOfInt, float[] paramArrayOfFloat) {
		SwipeApplication localSwipeApplication = SwipeApplication.e();
		this.a = to.p(localSwipeApplication);
		this.b = to.q(localSwipeApplication);
		LinearGradient localLinearGradient = new LinearGradient(0.0F, this.b,
				0.0F, 0.0F, paramArrayOfInt, paramArrayOfFloat,
				Shader.TileMode.CLAMP);
		this.c = new Paint();
		this.c.setShader(localLinearGradient);
		this.c.setDither(true);
	}

	public void draw(Canvas paramCanvas) {
		paramCanvas.drawRect(0.0F, 0.0F, this.a, this.b, this.c);
	}

	public int getIntrinsicHeight() {
		return this.b;
	}

	public int getIntrinsicWidth() {
		return this.a;
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int paramInt) {
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
	}
}
