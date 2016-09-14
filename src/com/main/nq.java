package com.main;

import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.features.guide.NewGuideActivity;
import com.lazyswipe.ui.MainActivity;
import com.lazyswipe.zev.R;

public abstract class nq extends RelativeLayout {
	protected static final String a = "Swipe." + nq.class.getSimpleName();
	public static boolean e;
	protected static boolean f;
	protected Handler b = new Handler();
	public int c;
	public int d;
	private WeakReference g;

	public nq(Context paramContext) {
		super(paramContext);
	}

	public nq(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	public static nq a(Fan paramFan) {
		nq localnq = null;
		if (f) {
		}

		localnq = (nq) LayoutInflater.from(SwipeApplication.e()).inflate(
				R.layout.new_guide, null);
		localnq.b(paramFan);
		return localnq;
	}

	public static void a(boolean paramBoolean) {
		if (!Fan.j()) {
			SwipeApplication localSwipeApplication = SwipeApplication.e();
			SwipeApplication.c = true;
			e = paramBoolean;
			ir.f(SwipeApplication.e(), 2);
			SwipeService.a(localSwipeApplication,
					SwipeService.a(localSwipeApplication, true).getExtras());
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void b(Fan paramFan) {
		this.g = new WeakReference(paramFan);
		paramFan.addView(this, new FrameLayout.LayoutParams(-1, -1));
		DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
		int i = vk.a(getContext(), 25.0F);
		this.c = localDisplayMetrics.widthPixels;
		this.d = (localDisplayMetrics.heightPixels - i);
	}

	public static boolean d() {
		if (((Build.VERSION.SDK_INT >= 19) || ((to.k()) && (to.A())))
				&& (!to.a(SwipeApplication.e()))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static int getGuideEndStep() {
		return 4;
	}

	public static int getShowCount() {

		return ir.a(SwipeApplication.g, "user_guide_show_count", 0);
	}

	public static void h() {
		SwipeApplication localSwipeApplication = (SwipeApplication) SwipeApplication
				.e();
		SwipeApplication.c = false;
		int i = ir.J(localSwipeApplication);
		int j = getGuideEndStep();
		ir.K(localSwipeApplication);
		if (i < j) {
			ir.f(localSwipeApplication, j);
		}
	}

	public static boolean j() {
		if ((SwipeApplication.c) && (ir.J(SwipeApplication.e()) < 4)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean k() {
		return SwipeApplication.c && ir.J(SwipeApplication.e()) < 3;
	}

	private static void l() {
		int i = 1 + getShowCount();
		ir.b(SwipeApplication.e(), "user_guide_show_count", i);
	}

	public FanItem a(int paramInt) {
		Object localObject = null;
		if (getFanLayer() == null) {
		}
		lk locallk;
		int i = 0;
		do {

			locallk = getFanLayer();
			if ((locallk != null) && (locallk.getChildCount() != 0)) {
				if (paramInt > -1 + locallk.getChildCount()) {
					paramInt = -1 + locallk.getChildCount();
				}
				View localView1 = locallk.getChildAt(paramInt);
				if ((!(localView1 instanceof FanItem))
						|| ((localView1.getTag() instanceof mn))) {
					break;
				}
				localObject = (FanItem) localView1;
			}

			i = paramInt - 1;
		} while (i < 0);
		View localView2 = locallk.getChildAt(i);
		if ((localView2 instanceof FanItem)) {
		}
		for (FanItem localFanItem = (FanItem) localView2;; localFanItem = null) {
			localObject = localFanItem;
			break;
		}
		return (FanItem) localObject;
	}

	public abstract void a();

	public abstract boolean b();

	public void c() {
		try {

			if ((this.g != null) && (this.g.get() != null)) {
				((Fan) this.g.get()).removeView(this);
			}
			return;
		} catch (Exception localException) {
			for (;;) {
			}
		}
	}

	protected void e() {
		h();
		SwipeApplication.c = false;
		NewGuideActivity.b();
	}

	public void f() {
		e();
		c();
		getFan().a(false);
		getContext().startActivity(
				new Intent(getContext(), MainActivity.class)
						.addFlags(268435456));
	}

	public void g() {
		nq.h();
		if (this.getFan() != null && this.getFan().getBaseSectorArea() != null) {
			this.getFan().getBaseSectorArea().setVisibility(4);
		}
		this.animate()
				.alpha(0.0f)
				.setDuration(800)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								nq.this.post((Runnable) new Runnable() {

									public void run() {
										nq.this.c();
										Fan.c(false);
										nq.this.post((Runnable) new Runnable() {

											public void run() {
												SwipeService.a(
														nq.this.getContext(),
														SwipeService
																.a(nq.this
																		.getContext(),
																		true)
																.getExtras());
											}
										});
									}

								});
							}

						});
		NewGuideActivity.b();
	}

	public Fan getFan() {
		if (g != null) {
			return (Fan) g.get();
		} else {
			return null;
		}
	}

	public lk getFanLayer() {
		Fan fan;
		for (fan = getFan(); fan == null || !(fan.getItemLayer() instanceof lk);) {
			return null;
		}

		return fan.getItemLayer();
	}

	public FanItem getMockItem() {
		FanItem localFanItem = null;
		if (getFanLayer() == null) {
		}

		lk locallk = getFanLayer();
		if (locallk.getChildCount() != 0) {
			for (int i = 0;; i++) {
				if (i >= locallk.getChildCount()) {
					localFanItem = a(9);
				}
				View localView = locallk.getChildAt(i);
				if (((localView instanceof FanItem))
						&& ((localView.getTag() instanceof nr))) {
					localFanItem = (FanItem) localView;
					break;
				}
			}

		}
		return localFanItem;
	}

	public void i() {
		this.getFan().getBaseSectorArea().setVisibility(4);
		this.animate()
				.alpha(0.0f)
				.setDuration(800)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								nq.this.post((Runnable) new Runnable() {

									public void run() {
										nq.this.c();
										Fan.c(false);
										nq.this.post((Runnable) new Runnable() {

											public void run() {
												NewGuide.a((boolean) true);
											}
										});
									}

								});
							}

						});
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		l();
		f = true;
		a();
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if ((b()) || (getShowCount() > 1)) {
			h();
		}
		this.b.removeCallbacksAndMessages(null);
		f = false;
	}
}
