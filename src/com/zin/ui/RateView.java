package com.lazyswipe.ui;

import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.ja;
import com.main.jc;
import com.main.vk;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.TranslateAnimation
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */

/*
 * Failed to analyse overrides
 */
public class RateView extends FrameLayout implements Animator.AnimatorListener,
		View.OnClickListener, Runnable {
	static String a;
	private static final String b;
	private static boolean d;
	private static WeakReference e;
	private boolean c;
	private LinearLayout f;
	private LinearLayout g;
	private ImageView[] h;
	private ImageView[] i;
	private View j;
	private int k;
	private Runnable l;

	static {
		b = "Swipe." + RateView.class.getSimpleName();
	}

	public RateView(Context context) {
		this(context, null);
	}

	public RateView(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public RateView(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
		this.l = new Runnable() {

			/*
			 * Enabled aggressive block sorting
			 */
			public void run() {
				if (!(d && RateView.this.i.length != 0)) {
					return;
				}
				if (RateView.this.k < RateView.this.i.length) {
					RateView.this.i[RateView.this.k].setVisibility(0);
					AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f,
							1.0f);
					alphaAnimation.setDuration(300);
					RateView.this.i[RateView.this.k]
							.startAnimation((Animation) alphaAnimation);
					RateView.e(RateView.this);
					RateView.this.postDelayed(RateView.this.l, 200);
					return;
				}
				RateView.this.k = 0;
				RateView.this.a(2000);
			}
		};
	}

	public static RateView a(ViewGroup viewGroup) {
		RateView rateView = (RateView) LayoutInflater.from(
				(Context) viewGroup.getContext()).inflate(R.layout.rate, null,
				false);
		rateView.setAttachedToActivity(false);
		rateView.setVisibility(0);
		viewGroup.addView((View) rateView);
		rateView.a("\u7f16\u8f91");
		return rateView;
	}

	private void a(long l) {
		if (l > 0) {
			this.postDelayed((Runnable) new Runnable() {

				public void run() {
					for (int i = 0; i < RateView.this.i.length; ++i) {
						RateView.this.i[i].setVisibility(4);
						AlphaAnimation alphaAnimation = new AlphaAnimation(
								1.0f, 0.0f);
						alphaAnimation.setDuration(300);
						RateView.this.i[i]
								.startAnimation((Animation) alphaAnimation);
					}
					RateView.this.b(300);
				}
			}, l);
			return;
		}
		this.b(0);
	}

	private void b(long l) {
		if (!d) {
			return;
		}
		AnimationSet animationSet = new AnimationSet(true);
		animationSet.addAnimation((Animation) new TranslateAnimation(1, 0.213f,
				1, 0.0f, 1, 0.596f, 1, 0.0f));
		animationSet.addAnimation((Animation) new AlphaAnimation(0.0f, 1.0f));
		animationSet.setStartOffset(l);
		animationSet.setDuration(800);
		animationSet
				.setInterpolator((Interpolator) new AccelerateInterpolator());
		animationSet.setFillAfter(true);
		animationSet
				.setAnimationListener((Animation.AnimationListener) new Animation.AnimationListener() {

					public void onAnimationEnd(Animation animation) {
						AnimationSet animationSet = new AnimationSet(true);
						animationSet
								.addAnimation((Animation) new TranslateAnimation(
										1, 0.0f, 1, 0.213f, 1, 0.0f, 1, 0.596f));
						animationSet
								.addAnimation((Animation) new AlphaAnimation(
										1.0f, 0.0f));
						animationSet.setDuration(800);
						animationSet
								.setInterpolator((Interpolator) new DecelerateInterpolator());
						animationSet.setFillAfter(true);
						animationSet.setStartOffset(500);
						RateView.this.j
								.startAnimation((Animation) animationSet);
					}

					public void onAnimationRepeat(Animation animation) {
					}

					public void onAnimationStart(Animation animation) {
					}
				});
		this.j.startAnimation((Animation) animationSet);
		this.postDelayed(this.l, 500 + (l + 800));
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static boolean b() {
		if (!d) {
			return false;
		}
		if (e != null && e.get() != null) {
			((RateView) e.get()).a(false);
		} else {
			d = false;
		}
		ja.a().a("\u8bc4\u661f-Back\u8fd4\u56de", "Source", a);
		return true;
	}

	public static boolean c() {
		return d;
	}

	public static void d() {
		Handler handler;
		if (Fan.getInstance() != null && Fan.getInstance().h != null
				&& (handler = Fan.getInstance().h).hasMessages(4)) {
			handler.removeMessages(4);
			handler.sendEmptyMessageDelayed(4, 1000);
		}
	}

	static int e(RateView rateView) {
		int n = rateView.k;
		rateView.k = n + 1;
		return n;
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public static void e() {
		if (!ir.d((Context) SwipeApplication.e(), false)) {
			return;
		}
		ir.f((Context) SwipeApplication.e(), 200);
		SwipeApplication.d = true;
		if (Fan.getInstance() == null)
			return;
		if (Fan.getInstance().h == null)
			return;
		Handler handler = Fan.getInstance().h;
		handler.removeMessages(4);
		handler.sendEmptyMessageDelayed(4, 1250);
	}

	public void a() {
		this.a(true);
	}

	public void a(String string) {
		if (d) {
			return;
		}
		SwipeApplication.d = false;
		a = string;
		d = true;
		this.setVisibility(0);
		this.animate().alpha(1.0f).setListener(null);
		e = new WeakReference((Object) this);
		ja.a().a("\u8bc4\u661f-Show", "Source", a);
		this.post((Runnable) new Runnable() {

			public void run() {
				int[] arrn = new int[2];
				RateView.this.h[-1 + RateView.this.h.length]
						.getLocationOnScreen(arrn);
				int[] arrn2 = new int[2];
				((View) RateView.this.j.getParent()).getLocationOnScreen(arrn2);
				FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) RateView.this.j
						.getLayoutParams();
				layoutParams.leftMargin = arrn[0] - arrn2[0]
						+ vk.a(RateView.this.getContext(), 9.5f);
				layoutParams.topMargin = arrn[1] - arrn2[1]
						+ vk.a(RateView.this.getContext(), 15.0f);
				RateView.this.j
						.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
				RateView.this.j.setVisibility(0);
				RateView.this.a(0);
			}
		});
	}

	public void a(boolean bl) {
		if (!d) {
			return;
		}
		a = null;
		if (e != null) {
			e.clear();
			e = null;
		}
		this.j.clearAnimation();
		this.removeCallbacks(this.l);
		d = false;
		if (bl) {
			ViewPropertyAnimator viewPropertyAnimator = this.animate().alpha(
					0.0f);
			if (Build.VERSION.SDK_INT >= 16) {
				viewPropertyAnimator.withEndAction((Runnable) this);
				return;
			}
			viewPropertyAnimator.setListener((Animator.AnimatorListener) this);
			return;
		}
		this.run();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(boolean bl, boolean bl2) {
		this.c = bl;
		if (bl2) {
			int n = bl ? 2131689547 : 2131689546;
			this.setImageAndText(n);
		}
	}

	public void onAnimationCancel(Animator animator) {
		this.setVisibility(8);
	}

	public void onAnimationEnd(Animator animator) {
		this.setVisibility(8);
	}

	public void onAnimationRepeat(Animator animator) {
	}

	public void onAnimationStart(Animator animator) {
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default: {
			return;
		}
		case 2131493041:
		case R.id.rate_cancel: {
			Fan.b = true;
			ja.a().a("\u8bc4\u661f-Cancel", "Source", a);
			this.a();
			ir.e(this.getContext(), true);
			jc.a(2);
			return;
		}
		case R.id.rate_not_like: {
			Fan.b = true;
			ja.a().a("\u8bc4\u661f-Dislike", "Source", a);
			this.a(false);
			if (!this.c) {
				Fan.k();
				ir.e(this.getContext(), false);
			}
			vk.c(this.getContext(), new Intent(this.getContext(),
					(Class) FragmentContainer$FeedbackActivity.class));
			jc.a(1);
			return;
		}
		case R.id.rate_ok:

			Fan.b = true;
			ja.a().a("\u8bc4\u661f-Rate", "Source", a);
			this.a(false);
			if (!this.c) {
				Fan.k();
				ir.e(this.getContext(), false);
			}

			vk.f(this.getContext(), "com.lazyswipe");
			jc.a(0);
		}
	}

	static ImageView[] c(RateView rateview) {
		return rateview.i;
	}

	static int d(RateView rateview) {
		return rateview.k;
	}

	static Runnable f(RateView rateview) {
		return rateview.l;
	}

	static boolean f() {
		return d;
	}

	protected void onFinishInflate() {
		int n = 0;
		super.onFinishInflate();
		this.setOnClickListener((View.OnClickListener) this);
		this.findViewById(R.id.rate_content).setOnClickListener(
				(View.OnClickListener) this);
		this.findViewById(R.id.rate_cancel).setOnClickListener(
				(View.OnClickListener) this);
		this.findViewById(R.id.rate_ok).setOnClickListener(
				(View.OnClickListener) this);
		this.findViewById(R.id.rate_not_like).setOnClickListener(
				(View.OnClickListener) this);
		this.f = (LinearLayout) this.findViewById(R.id.icon_stars_bg);
		this.g = (LinearLayout) this.findViewById(R.id.icon_stars_fg);
		this.j = this.findViewById(R.id.hand);
		this.h = new ImageView[this.f.getChildCount()];
		for (int i = 0; i < this.h.length; ++i) {
			this.h[i] = (ImageView) this.f.getChildAt(i);
			this.h[i].setColorFilter(-1579033, PorterDuff.Mode.SRC_IN);
		}
		this.i = new ImageView[this.g.getChildCount()];
		for (; n < this.i.length; ++n) {
			this.i[n] = (ImageView) this.g.getChildAt(n);
			this.i[n].setVisibility(4);
		}
	}

	public void run() {
		this.setVisibility(8);
	}

	public void setAttachedToActivity(boolean bl) {
		this.a(bl, true);
	}

	public void setImageAndText(int n) {
		((TextView) this.findViewById(R.id.desc)).setText(n);
	}

}
