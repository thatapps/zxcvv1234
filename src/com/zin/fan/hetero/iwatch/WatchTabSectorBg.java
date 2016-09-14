/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.DrawFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PaintFlagsDrawFilter
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 */
package com.lazyswipe.fan.hetero.iwatch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.zev.R;
import com.main.ls;
import com.main.lt;
import com.main.tf;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class WatchTabSectorBg extends View {

	private Paint a;
	private boolean b;
	private Fan c;
	private int d;

	public WatchTabSectorBg(Context context) {
		super(context);
	}

	public WatchTabSectorBg(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		a = new Paint();
		a.setStyle(android.graphics.Paint.Style.STROKE);
		a.setColor(0x99ffffff);
		a.setStrokeWidth(vk.a(getContext(), 2.0F));
		a.setFlags(7);
		d = getResources().getDimensionPixelSize(0x7f0b003e);
	}

	void a() {
		float f = 0.0F;
		if (Fan.n()) {
			c();
			return;
		}
		AnimationSet animationset = new AnimationSet(true);
		Object obj = new AlphaAnimation(0.0F, 1.0F);
		((Animation) (obj)).setDuration(WatchItemSector.getDuration());
		((Animation) (obj)).setFillAfter(true);
		animationset.addAnimation(((Animation) (obj)));
		if (!b) {
			f = 1.0F;
		}
		obj = new ScaleAnimation(0.35F, 1.0F, 0.35F, 1.0F, 1, f, 1, 1.0F);
		((ScaleAnimation) (obj)).setDuration((int) ((double) WatchItemSector
				.getDuration() * 0.57999999999999996D));
		((ScaleAnimation) (obj)).setInterpolator(new lt());
		((ScaleAnimation) (obj)).setFillAfter(true);
		animationset.addAnimation(((Animation) (obj)));
		animationset.setFillAfter(true);
		startAnimation(animationset);
	}

	public void a(float f, int i) {
		animate().scaleX(f).scaleY(f).setDuration(i).setListener(null);
	}

	public void a(int i) {
		animate().scaleX(1.0F).scaleY(1.0F).setDuration(i).setListener(null);
	}

	void b() {
		AnimationSet animationset = new AnimationSet(true);
		Animation animation = ls.d(b);
		AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
		animation.setDuration(240L);
		alphaanimation.setDuration(180L);
		animationset.addAnimation(animation);
		animationset.addAnimation(alphaanimation);
		animationset.setFillAfter(true);
		startAnimation(animationset);
	}

	public void c() {
		float f = c.getHandTrackRatio();
		setScaleX(f);
		setScaleY(f);
		setAlpha(vk.a(f));
	}

	public void d() {
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		android.graphics.DrawFilter drawfilter = canvas.getDrawFilter();
		canvas.setDrawFilter(tf.a);
		if (b) {
			canvas.drawCircle(0.0F, d, d - vk.a(getContext(), 3F), a);
		} else {
			canvas.drawCircle(d, d, d - vk.a(getContext(), 3F), a);
		}
		canvas.setDrawFilter(drawfilter);
	}

	protected void onMeasure(int i, int j) {
		super.onMeasure(i, j);
		setMeasuredDimension(d, d);
		float f;
		if (b) {
			f = 0.0F;
		} else {
			f = getMeasuredWidth();
		}
		setPivotX(f);
		setPivotY(getMeasuredHeight());
	}

	void setDirection(boolean flag) {
		b = flag;
		WatchSectorArea.a(this, flag);
		byte byte0;
		if (NewGuide.k()) {
			byte0 = 4;
		} else {
			byte0 = 0;
		}
		setVisibility(byte0);
	}

	void setFan(Fan fan) {
		c = fan;
	}
}
