package com.main;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.lazyswipe.features.guide.NewGuide;

public final class ls {

	private static int a = 3;

	public static int a() {
		return !NewGuide.j() ? 60 : 170;
	}

	private static Animation a(float f, float f1, int i, int j, boolean flag) {
		float f2;
		ScaleAnimation scaleanimation;
		if (flag) {
			f2 = 0.0F;
		} else {
			f2 = 1.0F;
		}
		scaleanimation = new ScaleAnimation(f, f1, f, f1, 1, f2, 1, 1.0F);
		scaleanimation.setDuration(i);
		scaleanimation.setFillAfter(true);
		scaleanimation.setStartOffset(j);
		return scaleanimation;
	}

	private static Animation a(float f, int i, int j, boolean flag) {
		return a(f, 1.0F, i, j, flag);
	}

	private static Animation a(int i, int j, boolean flag) {
		return a(1.0F, 0.0F, j, a() * 2 + i, flag);
	}

	public static Animation a(int i, mg mg1, mg mg2) {
		AnimationSet animationset = new AnimationSet(false);
		animationset.setFillAfter(true);
		AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
		alphaanimation.setDuration(a());
		alphaanimation.setStartOffset(a() * 2);
		animationset.addAnimation(alphaanimation);
		int j = mg2.a;
		int k = mg1.a;
		int l = mg2.b;
		int i1 = mg1.b;
		TranslateAnimation animation = new TranslateAnimation(0.0F, j - k,
				0.0F, -(l - i1));
		animation.setDuration(a() * 3);
		animation.setInterpolator(new lt(true));
		animationset.addAnimation(animation);
		animationset.setStartOffset(b() * i);
		return animationset;
	}

	public static Animation a(int i, mg mg1, mg mg2, boolean flag) {
		long l1 = 0L;
		AnimationSet animationset = new AnimationSet(false);
		animationset.setFillAfter(true);
		animationset.addAnimation(a(b(), false));
		float f = mg2.a - mg1.a;
		float f1 = mg2.b - mg1.b;
		TranslateAnimation animation = new TranslateAnimation(-f, 0.0F, f1,
				0.0F);
		long l;
		if (flag) {
			l = 0L;
		} else {
			l = a() * 4;
		}
		animation.setDuration(l);
		animation.setInterpolator(new lt());
		animationset.addAnimation(animation);
		if (flag) {
			l = l1;
		} else {
			l = a() * 2 + b() * i;
		}
		animationset.setStartOffset(l);
		return animationset;
	}

	public static Animation a(int i, boolean flag) {
		AlphaAnimation alphaanimation;
		if (flag) {
			alphaanimation = new AlphaAnimation(1.0F, 0.0F);
		} else {
			alphaanimation = new AlphaAnimation(0.0F, 1.0F);
		}
		alphaanimation.setDuration(i);
		return alphaanimation;
	}

	public static Animation a(boolean flag) {
		return a(0.0F, a() * 4, 0, flag);
	}

	public static void a(int i) {
		int j = i;
		if (i <= 0) {
			j = 1;
		}
		a = j;
	}

	public static int b() {
		return a() / 10;
	}

	private static Animation b(int i, boolean flag) {
		return a(i, a(), flag);
	}

	public static Animation b(boolean flag) {
		return a(0.0F, a() * 2, 0, flag);
	}

	public static Animation c() {
		Animation animation = e(false);
		animation.setFillAfter(true);
		return animation;
	}

	public static Animation c(boolean flag) {
		return a(0, a() * 2, flag);
	}

	public static Animation d() {
		Animation animation = e(true);
		animation.setStartOffset(a() * 4);
		animation.setFillAfter(true);
		return animation;
	}

	public static Animation d(boolean flag) {
		return b(a(), flag);
	}

	public static Animation e(boolean flag) {
		return a(a(), flag);
	}

}
