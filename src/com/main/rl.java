package com.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;

public class rl extends View {

	private static final String b = (new StringBuilder()).append("Swipe.")
			.append(rl.class.getSimpleName()).toString();
	protected Fan a;
	private boolean c;
	private int d;
	private int e;

	public rl(Context context) {
		super(context);
	}

	static int a(rl rl1) {
		return rl1.d;
	}

	private void a() {
		float f1 = (float) ((double) a.getTabSectorOuterSize() * 1.1000000000000001D)
				/ (float) d;
		float f;
		ObjectAnimator objectanimator;
		ObjectAnimator objectanimator1;
		ObjectAnimator objectanimator2;
		AnimatorSet animatorset;
		if (c) {
			f = 0.0F;
		} else {
			f = d;
		}
		setPivotX(f);
		setPivotY(d);
		setScaleX(f1);
		setScaleY(f1);
		setAlpha(0.8F);
		objectanimator = ObjectAnimator.ofFloat(this, View.ALPHA,
				new float[] { 0.0F });
		objectanimator.setInterpolator(new TimeInterpolator() {

			final rl a;

			public float getInterpolation(float f2) {
				if ((double) f2 < 0.84999999999999998D) {
					return 0.0F;
				} else {
					return (float) (6.6699999999999999D * (double) f2 - 5.6699999999999999D);
				}
			}

			{
				a = rl.this;
				// super();
			}
		});
		objectanimator.setDuration(180L);
		objectanimator1 = ObjectAnimator.ofFloat(this, View.SCALE_X,
				new float[] { 1.0F });
		objectanimator1.setDuration(180L);
		objectanimator2 = ObjectAnimator.ofFloat(this, View.SCALE_Y,
				new float[] { 1.0F });
		objectanimator2.setDuration(180L);
		animatorset = new AnimatorSet();
		animatorset.playTogether(new Animator[] { objectanimator,
				objectanimator1, objectanimator2 });
		animatorset.addListener(new AnimatorListenerAdapter() {

			rl a;

			public void onAnimationEnd(Animator animator) {
				a.post(new Runnable() {

					// final _cls3 a;

					public void run() {
						rl.e(a);
						a.a.setLayerType(0, null);
						a.a.removeView(a.a);
						rj.a(a.a);
					}

					{
						a = rl.this;
						// super();
					}
				});
			}

			{
				a = rl.this;
				// super();
			}
		});
		animatorset.start();
	}

	public static void a(Context context, Fan fan, int i) {
		(new rl(context)).a(fan, i);
	}

	private void a(Fan fan, int i) {
		a = fan;
		c = fan.i();
		Object obj = SwipeApplication.e().getResources().getDisplayMetrics();
		d = Math.min(((DisplayMetrics) (obj)).widthPixels,
				((DisplayMetrics) (obj)).heightPixels);
		e = vk.a(SwipeApplication.e(), 7F);
		final LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(
				d, d);
		byte byte0;
		if (c) {
			byte0 = 3;
		} else {
			byte0 = 5;
		}
		layoutparams.gravity = byte0 | 0x50;
		layoutparams.bottomMargin = 0;
		if (c) {
			layoutparams.leftMargin = 0;
		} else {
			layoutparams.rightMargin = 0;
		}
		try {
			setLayerType(rj.d(), null);
			fan.postDelayed(new Runnable() {

				final android.widget.FrameLayout.LayoutParams a;
				final rl b;

				public void run() {
					b.setBackgroundDrawable(new rm(rl.a(b), rl.b(b), rl.c(b)));
					b.a.addView(b, a);
					rl.d(b);
					rj.a();
				}

				{
					b = rl.this;
					a = layoutparams;
					// super();
				}
			}, i * 168 + 2100);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	static int b(rl rl1) {
		return rl1.e;
	}

	private void b() {
		setBackgroundDrawable(null);
	}

	static boolean c(rl rl1) {
		return rl1.c;
	}

	static void d(rl rl1) {
		rl1.a();
	}

	static void e(rl rl1) {
		rl1.b();
	}

	protected void dispatchDraw(Canvas canvas) {
		try {
			super.dispatchDraw(canvas);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	protected void onMeasure(int i, int j) {
		super.onMeasure(i, j);
		setMeasuredDimension(d, d);
	}

}
