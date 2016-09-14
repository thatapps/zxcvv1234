/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.util.AttributeSet
 *  android.widget.TextView
 *  java.lang.Math
 */
package com.lazyswipe.fan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import com.lazyswipe.zev.R;
import com.main.ox;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class TabIndicatorLabel extends TextView {
	private float a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private float j;
	private boolean k;
	private int l;
	private int m;

	public TabIndicatorLabel(Context context) {
		super(context);
	}

	public TabIndicatorLabel(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void d() {
		this.b = ox.a(R.attr.fanTabIndicatorTextColor);
		this.c = ox.a(R.attr.fanTabIndicatorTextColorFocused);
		this.d = Color.red((int) this.b);
		this.e = Color.red((int) this.c);
		this.f = Color.green((int) this.b);
		this.g = Color.green((int) this.c);
		this.h = Color.blue((int) this.b);
		this.i = Color.blue((int) this.c);
		this.setTextColor(this.b);
		this.l = Math.min((int) vk.a(this.getContext(), 11.0f), (int) 25);
		this.m = ox.a(R.attr.fanTabIndicatorTextShadowColor);
		boolean flag;
		if (m != 0) {
			flag = true;
		} else {
			flag = false;
		}
		k = flag;
	}

	private void setTextAlpha(float f1) {
		if (f1 <= 0.0F) {
			j = 0.0F;
			setTextColor(b);
			return;
		}
		if (f1 >= 1.0F) {
			j = 1.0F;
			setTextColor(c);
			return;
		} else {
			j = f1;
			float f2 = (1.0F - f1) * (1.0F - f1);
			float f3 = 1.0F - (1.0F - f1) * f1;
			int i1 = (int) (((float) d * f2 + (float) e * f1) / f3);
			int j1 = (int) (((float) f * f2 + (float) g * f1) / f3);
			int k1 = (int) ((f2 * (float) h + (float) i * f1) / f3);
			setTextColor(Color.argb((int) (f3 * 255F), i1, j1, k1));
			return;
		}
	}

	public void a() {
		setHighLightRatio(1.0F);
	}

	public void b() {
		setHighLightRatio(0.0F);
	}

	public boolean c() {
		return b != c || k;
	}

	protected void onDraw(Canvas canvas) {
		canvas.save();
		canvas.rotate(a, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
		super.onDraw(canvas);
		canvas.restore();
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		d();
	}

	public void setDegree(float f1) {
		a = f1;
	}

	public void setHighLightRatio(float f1) {
		if (c() && j != f1) {
			if (k && getLayerType() == 2) {
				if (f1 == 1.0F && j != 1.0F) {
					setShadowLayer(l, 0.0F, 0.0F, m);
					j = 1.0F;
					setTextColor(c);
					return;
				}
				if (f1 != 1.0F && j == 1.0F) {
					setShadowLayer(0.0F, 0.0F, 0.0F, 0);
					j = 0.0F;
					setTextColor(b);
					return;
				}
			} else {
				setTextAlpha(f1);
				return;
			}
		}
	}
}