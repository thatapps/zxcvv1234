/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewPropertyAnimator
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.lazyswipe.features.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeService;
import com.lazyswipe.zev.R;
import com.main.to;

/*
 * Failed to analyse overrides
 */
public class UpgradeGuide extends RelativeLayout implements
		View.OnClickListener {
	private static final String a = "Swipe."
			+ UpgradeGuide.class.getSimpleName();
	private GuideBackground b;
	private ImageView c;
	private ImageView d;
	private ImageView e;
	private ImageView f;
	private ImageView g;
	private TextView h;
	private TextView i;
	private TextView j;

	public UpgradeGuide(Context context) {
		super(context);
	}

	public UpgradeGuide(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
	}

	private void b() {
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				UpgradeGuide.this.b
						.a(true,
								(Animator.AnimatorListener) new AnimatorListenerAdapter() {

									public void onAnimationEnd(Animator animator) {
										UpgradeGuide.this.c();
									}
								});
			}

		}, 100);
	}

	private void c() {
		this.c.animate()
				.alpha(1.0f)
				.setDuration(800)
				.setStartDelay(300)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuide.this.d();
							}
						});
	}

	private void d() {
		this.c.animate()
				.alpha(0.0f)
				.setDuration(1800)
				.setStartDelay(1800)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuide.this.e();
							}
						});
	}

	private void e() {
		this.d.animate()
				.alpha(1.0f)
				.setDuration(1800)
				.setStartDelay(700)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuide.this.postDelayed(
										(Runnable) new Runnable() {

											public void run() {
												UpgradeGuide.this.f();
											}
										}, 700);
							}

						});
	}

	private void f() {
		this.d.animate().setListener(null);
		this.e.animate().setListener(null);
		this.d.setVisibility(8);
		this.e.setAlpha(1.0f);
		this.g();
	}

	private void g() {
		int[] arrn = new int[2];
		int[] arrn2 = new int[2];
		this.e.getLocationOnScreen(arrn);
		this.f.getLocationOnScreen(arrn2);
		int n = this.e.getWidth();
		int n2 = this.e.getHeight();
		int n3 = this.f.getWidth();
		int n4 = this.f.getHeight();
		int n5 = arrn2[0] - arrn[0];
		int n6 = arrn2[1] - arrn[1];
		float f = (float) n3 / (float) n;
		float f2 = (float) n4 / (float) n2;
		this.e.setPivotX(0.0f);
		this.e.setPivotY(0.0f);
		this.e.animate()
				.scaleX(f)
				.scaleY(f2)
				.translationX((float) n5)
				.translationY((float) n6)
				.setDuration(300)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuide.this.f.setAlpha(1.0f);
								UpgradeGuide.this.e.setVisibility(8);
								UpgradeGuide.this.h();
							}
						});
	}

	private void h() {
		this.g.animate()
				.alpha(1.0f)
				.setDuration(500)
				.setStartDelay(200)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuide.this.i();
							}
						});
	}

	private void i() {
		int n = to.p(this.getContext());
		this.h.setTranslationX((float) (n / 2));
		this.j.setTranslationX((float) (n / 2));
		this.h.animate().alpha(1.0f).translationX(0.0f).setDuration(650)
				.setStartDelay(500).setListener(null);
		this.j.animate().alpha(1.0f).translationX(0.0f).setDuration(650)
				.setStartDelay(1000).setListener(null);
	}

	public void a() {
		this.animate()
				.alpha(0.0f)
				.setDuration(200)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								UpgradeGuideActivity.a();
								SwipeService.a(
										UpgradeGuide.this.getContext(),
										SwipeService.a(
												UpgradeGuide.this.getContext(),
												true).getExtras());
							}
						});
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		this.b();
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default: {
			return;
		}
		case 2131492907:
		case 2131492908:
		}
		this.a();
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		this.setOnClickListener((View.OnClickListener) this);
		this.b = (GuideBackground) this.findViewById(R.id.guide_background);
		this.b.a(new int[] { -9711107, -9711107, -9278753, -12237959 },
				new float[] { 0.0f, 0.07f, 0.5f, 1.0f });
		this.h = (TextView) this.findViewById(R.id.label_main);
		this.j = (TextView) this.findViewById(R.id.btn_go);
		this.i = (TextView) this.findViewById(R.id.btn_skip);
		this.i.setOnClickListener((View.OnClickListener) this);
		this.j.setOnClickListener((View.OnClickListener) this);
		this.c = (ImageView) this.findViewById(R.id.icon_lazy);
		this.d = (ImageView) this.findViewById(R.id.icon_omni);
		this.e = (ImageView) this.findViewById(R.id.icon_omni_solid);
		this.f = (ImageView) this.findViewById(R.id.logo_icon);
		this.g = (ImageView) this.findViewById(R.id.logo_label);
		this.f.setAlpha(0.0f);
		this.g.setAlpha(0.0f);
	}

}
