/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.lazyswipe.fan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.zev.R;
import com.main.ls;
import com.main.mi;
import com.main.mk;
import com.main.ox;

/*
 * Failed to analyse overrides
 */
public class TabSectorBg extends ImageView implements Handler.Callback {
	private boolean a;
	private Fan b;
	private mk c;
	private Handler d;
	private float e;

	public TabSectorBg(Context context) {
		super(context);
	}

	public TabSectorBg(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public TabSectorBg(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
	}

	void a() {
		this.setVisibility(0);
		if (Fan.n()) {
			this.e();
			return;
		}
		this.startAnimation(ls.b(this.a));
	}

	public void a(float f, int n) {
		Fan fan = Fan.getInstance();
		if (!(fan != null && this.getBackground() instanceof mi)) {
			return;
		}
		this.setTripleFanDrawableVisible(false);
		this.e = f;
		final mi mi = (mi) this.getBackground();
		int n2 = fan.getTabSectorOuterSize();
		int[] arrn = new int[] { n2, (int) (f * (float) n2) };
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) arrn);
		valueAnimator.setDuration((long) n);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {
					FrameLayout.LayoutParams b = (FrameLayout.LayoutParams) TabSectorBg.this
							.getLayoutParams();

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						int n;
						mi.b = n = ((Integer) valueAnimator.getAnimatedValue())
								.intValue();
						this.b.width = n;
						this.b.height = n;
						TabSectorBg.this
								.setLayoutParams((ViewGroup.LayoutParams) this.b);
					}
				});
		valueAnimator.start();
	}

	public void a(int n) {
		Fan fan = Fan.getInstance();
		if (!(fan != null && this.getBackground() instanceof mi)) {
			return;
		}
		final mi mi = (mi) this.getBackground();
		int n2 = fan.getTabSectorOuterSize();
		int[] arrn = new int[] { (int) ((float) n2 * this.e), n2 };
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) arrn);
		valueAnimator.setDuration((long) n);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {
					FrameLayout.LayoutParams b = (FrameLayout.LayoutParams) TabSectorBg.this
							.getLayoutParams();

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						int n;
						mi.b = n = ((Integer) valueAnimator.getAnimatedValue())
								.intValue();
						this.b.width = n;
						this.b.height = n;
						TabSectorBg.this
								.setLayoutParams((ViewGroup.LayoutParams) this.b);
					}
				});
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						TabSectorBg.this.setTripleFanDrawableVisible(true);
					}
				});
		valueAnimator.start();
	}

	void b() {
		this.startAnimation(ls.d(this.a));
	}

	void c() {
		this.d.removeMessages(1);
		this.d.sendEmptyMessageDelayed(0, 200);
	}

	void d() {
		this.d.removeMessages(0);
		this.d.sendEmptyMessageDelayed(1, 200);
	}

	public void e() {
		float f = this.b.getHandTrackRatio();
		this.setScaleX(f);
		this.setScaleY(f);
	}

	public void f() {
		this.c();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public boolean handleMessage(Message message) {
		switch (message.what) {
		default: {
			return false;
		}
		case 0: {
			// if (this.getLayerType() == 1)
			// {
			// return true;
			// }
			// this.setLayerType(1, null);
			// return true;
			if (getLayerType() != 1) {
				setLayerType(1, null);
			}
			return true;
		}
		case 1:

			// if (this.getLayerType() == 0)
			// return true;
			// this.setLayerType(0, null);
			if (getLayerType() != 0) {
				setLayerType(0, null);
			}
			return true;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onMeasure(int n, int n2) {
		super.onMeasure(n, n2);
		float f = this.a ? 0.0f : (float) this.getMeasuredWidth();
		this.setPivotX(f);
		this.setPivotY((float) this.getMeasuredHeight());
	}

	/*
	 * Enabled aggressive block sorting
	 */
	@SuppressWarnings("deprecation")
	void setDirection(boolean bl) {
		if (!(this.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
			this.setLayoutParams((ViewGroup.LayoutParams) new FrameLayout.LayoutParams(
					-2, -2));
		}
		FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this
				.getLayoutParams();
		int n = bl ? 83 : 85;
		layoutParams.gravity = n;
		this.a = bl;
		this.c = new mk(this.getContext());
		boolean bl2 = ox.a(R.attr.fanSettingBtnShadowColor) != 0;
		int n2 = bl2 ? 0 : this.b.getTabSectorInnerSize();
		this.setBackgroundDrawable((Drawable) new mi(n2, this.b
				.getTabSectorOuterSize(), ox

		.a(R.attr.fanTabSectorBackgroundColor), bl, (Drawable) this.c));
		boolean bl3 = NewGuide.k();
		int n3 = 0;
		if (bl3) {
			n3 = 4;
		}
		this.setVisibility(n3);
	}

	void setFan(Fan fan) {
		this.b = fan;
		this.d = new Handler((Handler.Callback) this);
	}

	public void setTripleFanDrawableVisible(boolean bl) {
		this.c.a(bl);
		this.invalidate();
	}

}
