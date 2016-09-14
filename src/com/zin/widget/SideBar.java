/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.String
 */
package com.lazyswipe.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.lazyswipe.zev.R;
import com.main.vk;
import com.main.xc;

/*
 * Failed to analyse overrides
 */
public class SideBar extends View {
	public static String a[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z", "#" };
	private xc b;
	private int c;
	private Paint d;
	private int e;
	private int f;
	private TextView g;

	public SideBar(Context context) {
		super(context);
		c = -1;
		d = new Paint();
		e = -1;
		f = -1;
	}

	public SideBar(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		c = -1;
		d = new Paint();
		e = -1;
		f = -1;
	}

	public SideBar(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
		c = -1;
		d = new Paint();
		e = -1;
		f = -1;
	}

	public boolean dispatchTouchEvent(MotionEvent motionEvent) {
		int n = motionEvent.getAction();
		float f = motionEvent.getY();
		int n2 = this.c;
		xc xc = this.b;
		int n3 = (int) (f / (float) this.getHeight() * (float) a.length);
		switch (n) {
		default: {
			this.setBackgroundResource(R.drawable.sidebar_background);
			if (n2 == n3)
				return true;
			if (n3 < 0)
				return true;
			if (n3 >= a.length)
				return true;
			if (xc != null) {
				xc.a(a[n3]);
			}
			if (this.g != null) {
				this.g.setText((CharSequence) a[n3]);
				this.g.setVisibility(0);
			}
			this.c = n3;
			this.e = n3 - 1;
			this.f = n3 + 1;
			this.invalidate();
			return true;
		}
		case 1:

			this.setBackgroundDrawable((Drawable) new ColorDrawable(0));
			this.c = -1;
			this.e = -1;
			this.f = -1;
			this.invalidate();
			if (this.g == null)

				this.g.setVisibility(4);
		}
		return true;
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		int i = getHeight();
		int k = getWidth();
		int l = i / a.length;
		for (int j = 0; j < a.length; j++) {
			d.setTypeface(Typeface.DEFAULT_BOLD);
			d.setAntiAlias(true);
			d.setTextSize(vk.a(getContext(), 10F));
			d.setColor(Color.parseColor("#64000000"));
			if (j == c || j == e || j == f) {
				d.setColor(Color.parseColor("#ff000000"));
				d.setFakeBoldText(true);
			}
			float f1 = k / 2;
			float f2 = d.measureText(a[j]) / 2.0F;
			float f3 = l * j + l;
			canvas.drawText(a[j], f1 - f2, f3, d);
			d.reset();
		}

	}

	public void setOnTouchingLetterChangedListener(xc xc1) {
		b = xc1;
	}

	public void setTextView(TextView textview) {
		g = textview;
	}

}
