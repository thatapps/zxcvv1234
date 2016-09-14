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
 *  android.graphics.Rect
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.DragEvent
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 *  android.view.animation.TranslateAnimation
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package com.lazyswipe.fan.hetero.iwatch;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.features.guide.NewGuide;
import com.main.is;
import com.main.lk;
import com.main.ll;
import com.main.lo;
import com.main.lp;
import com.main.ls;
import com.main.lt;
import com.main.lu;
import com.main.mt;
import com.main.my;
import com.main.nc;
import com.main.ne;
import com.main.ng;
import com.main.nl;
import com.main.nm;
import com.main.nn;
import com.main.oy;
import com.main.sx;
import com.main.to;
import com.main.tt;
import com.main.vj;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class WatchItemSector extends lk {
	private static int[] R;
	private static int[] S;
	private static final String q;
	private float A = 0.0f;
	private float B;
	private float C;
	private float D;
	private float E;
	private float F;
	private boolean G;
	private boolean H;
	private float I;
	private float J;
	private final int K;
	private final int L;
	private int M = 0;
	private boolean N;
	private boolean O;
	private int P;
	private int[] Q = new int[39];
	private ValueAnimator T;
	private Runnable U;
	private int V;
	private int W;
	private int aa;
	private int ab;
	private float ac;
	private WatchFanItem ad;
	private int[] ae;
	private WeakReference af;
	List<WatchFanItem> e;
	List f;
	int g;
	boolean h;
	float i;
	float j;
	public boolean k;
	boolean l;
	public boolean m;
	public boolean n;
	public boolean o;
	final GestureDetector p;
	private List<WatchFanItem> r = new ArrayList(13);
	private List<WatchFanItem> s = new ArrayList(13);
	private List<WatchFanItem> t = new ArrayList(13);
	private List<mt> u = new ArrayList(13);
	private List<mt> v = new ArrayList(13);
	private List<mt> w = new ArrayList(13);
	private WatchFanItem x;
	private mt y;
	private int z;

	static {
		q = "Swipe." + WatchFanItem.class.getSimpleName();
		R = new int[] { 11, 12, 9, 4, 3, 5, 10, 1, 0, 2, 7, 6, 8 };
		S = tt.a(R);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public WatchItemSector(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		r = new ArrayList(13);
		s = new ArrayList(13);
		t = new ArrayList(13);
		u = new ArrayList(13);
		v = new ArrayList(13);
		w = new ArrayList(13);
		A = 0.0F;
		M = 0;
		Q = new int[39];
		U = new Runnable() {

			final WatchItemSector a;

			public void run() {
				a.a(true);
			}

			{
				a = WatchItemSector.this;
				// super();
			}
		};
		K = ViewConfiguration.get(context).getScaledTouchSlop();
		L = K * 3;
		p = new GestureDetector(context, new nl(this), new Handler());
	}

	public static/* synthetic */float a(WatchItemSector watchItemSector, float f) {
		watchItemSector.C = f;
		return f;
	}

	public static/* synthetic */int a(WatchItemSector watchItemSector,
			MotionEvent motionEvent) {
		return watchItemSector.b(motionEvent);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private WatchFanItem a(int n, int n2, mt mt) {
		WatchFanItem watchFanItem;
		System.currentTimeMillis();
		List list = n == 1 ? this.r : (n == 0 ? this.t : this.s);
		if (list.size() <= n2) {
			WatchFanItem watchFanItem2 = WatchFanItem
					.a(mt, n, n2, this.c, this);
			list.add((Object) watchFanItem2);
			watchFanItem = watchFanItem2;
		} else if (list.get(n2) == null) {
			WatchFanItem watchFanItem3 = WatchFanItem
					.a(mt, n, n2, this.c, this);
			list.set(n2, (Object) watchFanItem3);
			watchFanItem = watchFanItem3;
		} else {
			watchFanItem = (WatchFanItem) list.get(n2);
			watchFanItem.a(mt);
		}
		watchFanItem.c(this.A);
		watchFanItem.a((View.OnClickListener) this,
				watchFanItem.getInfo() instanceof ne);
		watchFanItem.a((View.OnLongClickListener) this,
				watchFanItem.getInfo() instanceof ne);
		return watchFanItem;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private WatchFanItem a(List list, int i1) {
		WatchFanItem watchfanitem = (WatchFanItem) list.get(i1);
		if (watchfanitem == null) {
			list = null;
		} else {
			watchfanitem.clearAnimation();
			watchfanitem.e();
			// list = watchfanitem;
			if (watchfanitem.getParent() == null) {
				addViewInLayout(watchfanitem, -1, watchfanitem.b(false));
				return watchfanitem;
			}
		}
		return watchfanitem;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(int n, int n2) {
		List list = n == 1 ? this.r : (n == 0 ? this.t : this.s);
		List list2 = n == 1 ? this.u : (n == 0 ? this.w : this.v);
		WatchFanItem watchFanItem = (WatchFanItem) list.get(n2);
		mt mt = (mt) list2.get(n2);
		if (watchFanItem != null) {
			watchFanItem.setTag((Object) mt);
			watchFanItem.a((View.OnClickListener) this, mt instanceof ne);
			watchFanItem.a((View.OnLongClickListener) this, mt instanceof ne);
		}
	}

	static ll a(WatchItemSector watchitemsector) {
		return watchitemsector.b;
	}

	// private void a(DragEvent dragEvent) {
	// int n;
	// if (dragEvent == null) {
	// return;
	// }
	// this.H = true;
	// this.x.clearAnimation();
	// this.x.setVisibility(8);
	// if (this.af != null && this.af.get() != null) {
	// ((lp) this.af.get()).a();
	// }
	// this.V = n = this.b(this.x);
	// this.W = n;
	// WatchFanItem watchFanItem = (WatchFanItem) this.e.get(this.V);
	// this.aa = watchFanItem.h.j;
	// this.ab = watchFanItem.h.k;
	// this.ac = watchFanItem.c(true);
	// this.t();
	// }
	private void a(DragEvent dragevent) {
		if (dragevent == null) {
			return;
		}
		H = true;
		x.clearAnimation();
		x.setVisibility(8);
		if (af != null && af.get() != null) {
			((lp) af.get()).a();
		}
		int i1 = b(x);
		V = i1;
		W = i1;
		WatchFanItem watchFanItem = (WatchFanItem) e.get(V);
		aa = ((WatchFanItem) (watchFanItem)).h.j;
		ab = ((WatchFanItem) (watchFanItem)).h.k;
		ac = watchFanItem.c(true);
		t();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// private void a(final WatchFanItem watchFanItem) {
	// if (watchFanItem == null || watchFanItem.h.a() > 90.0f) {
	// return;
	// }
	// this.P = 0;
	// AnimationSet animationSet = new AnimationSet(false);
	// animationSet.setFillAfter(true);
	// AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
	// alphaAnimation.setDuration(120);
	// alphaAnimation.setStartOffset(120);
	// animationSet.addAnimation((Animation) alphaAnimation);
	// float f = watchFanItem.h.j;
	// float f2 = watchFanItem.h.k;
	// TranslateAnimation translateAnimation = new TranslateAnimation(0.0f,
	// -f, 0.0f, f2);
	// translateAnimation.setDuration(240);
	// translateAnimation.setInterpolator((Interpolator) new lt(true));
	// animationSet.addAnimation((Animation) translateAnimation);
	// animationSet.setStartOffset((long) (watchFanItem.h.i * ls.b()));
	// animationSet
	// .setAnimationListener((Animation.AnimationListener) new sx() {
	//
	// public void onAnimationEnd(Animation animation) {
	// watchFanItem.i();
	// WatchItemSector.c(WatchItemSector.this);
	// if (WatchItemSector.this.P == 0) {
	// WatchItemSector.this.setVisibility(4);
	// WatchItemSector.this.b.setVisibility(4);
	// }
	// }
	//
	// public void onAnimationStart(Animation animation) {
	// WatchItemSector.b(WatchItemSector.this);
	// }
	// });
	// watchFanItem.startAnimation((Animation) animationSet);
	// }
	//
	// private void a(WatchFanItem watchFanItem, boolean bl) {
	// if (watchFanItem.h.a() > 90.0f) {
	// return;
	// }
	// AnimationSet animationSet = new AnimationSet(false);
	// animationSet.setFillAfter(true);
	// AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
	// alphaAnimation
	// .setDuration((long) (3 * WatchItemSector.getDuration() / 4));
	// animationSet.addAnimation((Animation) alphaAnimation);
	// float f = watchFanItem.h.j;
	// float f2 = watchFanItem.h.k;
	// TranslateAnimation translateAnimation = new TranslateAnimation(-f,
	// 0.0f, f2, 0.0f);
	// translateAnimation.setDuration((long) WatchItemSector.getDuration());
	// translateAnimation.setInterpolator((Interpolator) new lt());
	// if (bl) {
	// translateAnimation
	// .setAnimationListener((Animation.AnimationListener) new sx() {
	//
	// public void onAnimationEnd(Animation animation) {
	// WatchItemSector.this
	// .post((Runnable) new Runnable() {
	//
	// public void run() {
	// ((WatchSectorArea) WatchItemSector.this.b)
	// .a(false);
	// }
	// });
	// }
	//
	// });
	// }
	// animationSet.addAnimation((Animation) translateAnimation);
	// watchFanItem.setAnimation((Animation) animationSet);
	// }
	//
	// public static/* synthetic */void a(WatchItemSector watchItemSector,
	// boolean bl, float f) {
	// watchItemSector.a(bl, f);
	// }
	//
	// private void a(final boolean flag, float f1) {
	// T = ValueAnimator.ofFloat(new float[] { A, f1 });
	// T.setDuration(240L);
	// B = A;
	// T.addUpdateListener(new
	// android.animation.ValueAnimator.AnimatorUpdateListener() {
	//
	// final WatchItemSector a;
	//
	// public void onAnimationUpdate(ValueAnimator valueanimator) {
	// float f2 = ((Float) valueanimator.getAnimatedValue())
	// .floatValue();
	// WatchItemSector.c(a, f2);
	// WatchItemSector.d(a,
	// WatchItemSector.l(a) - WatchItemSector.m(a));
	// WatchItemSector.e(a, WatchItemSector.l(a));
	// WatchItemSector.c(a, oy.d(WatchItemSector.l(a)));
	// WatchItemSector.n(a);
	// }
	//
	// {
	// a = WatchItemSector.this;
	// // super();
	// }
	// });
	// T.addListener(new AnimatorListenerAdapter() {
	//
	// final boolean a;
	// final WatchItemSector b;
	//
	// public void onAnimationCancel(Animator animator) {
	// b.m = false;
	// b.removeCallbacks(WatchItemSector.q(b));
	// }
	//
	// public void onAnimationEnd(Animator animator) {
	// oy.a = true;
	// is.a = false;
	// if (!a) {
	// b.m = false;
	// return;
	// } else {
	// WatchItemSector.o(b).h();
	// WatchItemSector.p(b);
	// b.m = false;
	// return;
	// }
	// }
	//
	// public void onAnimationStart(Animator animator) {
	// oy.a = false;
	// b.m = true;
	// }
	//
	// {
	// b = WatchItemSector.this;
	// a = flag;
	// // super();
	// }
	// });
	// T.start();
	// }
	//
	private void a(final WatchFanItem watchfanitem) {
		while (watchfanitem == null || watchfanitem.h.a() > 90F) {
			return;
		}
		P = 0;
		AnimationSet animationset = new AnimationSet(false);
		animationset.setFillAfter(true);
		Object obj = new AlphaAnimation(1.0F, 0.0F);
		((AlphaAnimation) (obj)).setDuration(120L);
		((AlphaAnimation) (obj)).setStartOffset(120L);
		animationset.addAnimation(((Animation) (obj)));
		float f1 = watchfanitem.h.j;
		float f2 = watchfanitem.h.k;
		obj = new TranslateAnimation(0.0F, -f1, 0.0F, f2);
		((TranslateAnimation) (obj)).setDuration(240L);
		((TranslateAnimation) (obj)).setInterpolator(new lt(true));
		animationset.addAnimation(((Animation) (obj)));
		animationset.setStartOffset(watchfanitem.h.i * ls.b());
		animationset.setAnimationListener(new sx() {

			final WatchFanItem a;
			final WatchItemSector b;

			public void onAnimationEnd(Animation animation) {
				a.i();
				WatchItemSector.c(b);
				if (WatchItemSector.d(b) == 0) {
					b.setVisibility(4);
					WatchItemSector.e(b).setVisibility(4);
				}
			}

			public void onAnimationStart(Animation animation) {
				WatchItemSector.b(b);
			}

			{
				b = WatchItemSector.this;
				a = watchfanitem;
				// super();
			}
		});
		watchfanitem.startAnimation(animationset);
	}

	private void a(WatchFanItem watchfanitem, boolean flag) {
		if (watchfanitem.h.a() > 90F) {
			return;
		}
		AnimationSet animationset = new AnimationSet(false);
		animationset.setFillAfter(true);
		Object obj = new AlphaAnimation(0.0F, 1.0F);
		((AlphaAnimation) (obj)).setDuration((getDuration() * 3) / 4);
		animationset.addAnimation(((Animation) (obj)));
		float f1 = watchfanitem.h.j;
		float f2 = watchfanitem.h.k;
		obj = new TranslateAnimation(-f1, 0.0F, f2, 0.0F);
		((TranslateAnimation) (obj)).setDuration(getDuration());
		((TranslateAnimation) (obj)).setInterpolator(new lt());
		if (flag) {
			((TranslateAnimation) (obj)).setAnimationListener(new sx() {

				final WatchItemSector a;

				public void onAnimationEnd(Animation animation) {
					a.post(new Runnable() {

						public void run() {
							((WatchSectorArea) WatchItemSector.a(a)).a(false);
						}

					});
				}

				{
					a = WatchItemSector.this;
					// super();
				}
			});
		}
		animationset.addAnimation(((Animation) (obj)));
		watchfanitem.setAnimation(animationset);
	}

	public static void a(WatchItemSector watchitemsector, boolean flag, float f1) {
		watchitemsector.a(flag, f1);
	}

	private void a(final boolean flag, float f1) {
		T = ValueAnimator.ofFloat(new float[] { A, f1 });
		T.setDuration(240L);
		B = A;
		T.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final WatchItemSector a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f2 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				WatchItemSector.c(a, f2);
				WatchItemSector.d(a,
						WatchItemSector.l(a) - WatchItemSector.m(a));
				WatchItemSector.e(a, WatchItemSector.l(a));
				WatchItemSector.c(a, oy.d(WatchItemSector.l(a)));
				WatchItemSector.n(a);
			}

			{
				a = WatchItemSector.this;
				// super();
			}
		});
		T.addListener(new AnimatorListenerAdapter() {

			final boolean a;
			final WatchItemSector b;

			public void onAnimationCancel(Animator animator) {
				b.m = false;
				b.removeCallbacks(WatchItemSector.q(b));
			}

			public void onAnimationEnd(Animator animator) {
				oy.a = true;
				is.a = false;
				if (!a) {
					b.m = false;
					return;
				} else {
					WatchItemSector.o(b).h();
					WatchItemSector.p(b);
					b.m = false;
					return;
				}
			}

			public void onAnimationStart(Animator animator) {
				oy.a = false;
				b.m = true;
			}

			{
				b = WatchItemSector.this;
				a = flag;
				// super();
			}
		});
		T.start();
	}

	public static boolean a(WatchItemSector watchItemSector, boolean bl) {
		watchItemSector.G = bl;
		return bl;
	}

	public static float b(WatchItemSector watchItemSector, float f) {
		watchItemSector.E = f;
		return f;
	}

	// private int b(DragEvent dragevent) {
	// int i1 = (int) dragevent.getX();
	// int j1 = (int) dragevent.getY();
	// for (dragevent = (DragEvent) e.iterator(); ((Iterator<WatchFanItem>)
	// dragevent)
	// .hasNext();) {
	// WatchFanItem watchfanitem = (WatchFanItem) ((Iterator<WatchFanItem>)
	// dragevent)
	// .next();
	// if (watchfanitem != null && watchfanitem.getRect().contains(i1, j1)) {
	// return e.indexOf(watchfanitem);
	// }
	// }
	//
	// return -1;
	// }
	private int b(DragEvent dragevent) {
		Iterator iterator = null;
		int i1 = (int) dragevent.getX();
		int j1 = (int) dragevent.getY();
		for (iterator = e.iterator(); iterator.hasNext();) {
			WatchFanItem watchfanitem = (WatchFanItem) iterator.next();
			if (watchfanitem != null && watchfanitem.getRect().contains(i1, j1)) {
				return e.indexOf(watchfanitem);
			}
		}

		return -1;
	}

	private int b(MotionEvent motionEvent) {
		return (int) (-vk.a(to.q(this.getContext()), 0.0, motionEvent.getY(),
				motionEvent.getX()));
	}

	private int b(WatchFanItem watchfanitem) {
		for (Iterator iterator = e.iterator(); iterator.hasNext();) {
			WatchFanItem watchfanitem1 = (WatchFanItem) iterator.next();
			if (watchfanitem1 == watchfanitem) {
				return e.indexOf(watchfanitem1);
			}
		}

		return -1;
	}

	static int b(WatchItemSector watchItemSector) {
		int n = watchItemSector.P;
		watchItemSector.P = n + 1;
		return n;
	}

	static int c(WatchItemSector watchItemSector) {
		int n = watchItemSector.P;
		watchItemSector.P = n - 1;
		return n;
	}

	public static float c(WatchItemSector watchitemsector, float f1) {
		watchitemsector.A = f1;
		return f1;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// private void c(DragEvent dragEvent) {
	// int n = this.b(dragEvent);
	// if (n == -1) {
	// if (n == this.W || this.ad == null)
	// return;
	// {
	// this.ad.clearAnimation();
	// this.ad = null;
	// this.W = -1;
	// }
	// return;
	// }
	// WatchFanItem watchFanItem = (WatchFanItem) this.e.get(n);
	// if (!this.c(watchFanItem)) {
	// if (n == this.W || this.ad == null)
	// return;
	// {
	// this.ad.clearAnimation();
	// this.ad = null;
	// this.W = -1;
	// return;
	// }
	// }
	// if (n == this.V) {
	// if (n == this.W || this.ad == null)
	// return;
	// {
	// this.ad.clearAnimation();
	// this.ad = null;
	// this.W = -1;
	// return;
	// }
	// }
	// if (n == this.W)
	// return;
	// if (this.ad != null) {
	// this.ad.clearAnimation();
	// this.ad = null;
	// this.W = -1;
	// }
	// try {
	// this.d(watchFanItem);
	// } catch (Exception var4_10) {
	// this.t();
	// }
	// int n2 = watchFanItem.h.j;
	// int n3 = watchFanItem.h.k;
	// AnimationSet animationSet = new AnimationSet(true);
	// animationSet.setFillAfter(true);
	// animationSet.setDuration(380);
	// TranslateAnimation translateAnimation = new TranslateAnimation(0.0f,
	// (float) (this.aa - n2), 0.0f, (float) (n3 + (-this.ab)));
	// float f = watchFanItem.c(true);
	// float f2 = this.ac / f;
	// animationSet.addAnimation((Animation) new ScaleAnimation(1.0f, f2,
	// 1.0f, f2, 1, 0.5f, 1, 0.5f));
	// animationSet.addAnimation((Animation) translateAnimation);
	// watchFanItem.startAnimation((Animation) animationSet);
	// this.ad = watchFanItem;
	// this.W = n;
	// }
	// private void c(DragEvent dragevent) {
	// int i1 = b(dragevent);
	// WatchFanItem fanItem = (WatchFanItem) e.get(i1);
	// if (i1 != -1) {
	//
	// if (c(((WatchFanItem) (fanItem)))) {
	// // break; /* Loop/switch isn't completed */
	// }
	// if (i1 != W && ad != null) {
	// ad.clearAnimation();
	// ad = null;
	// W = -1;
	// return;
	// }
	// } else {
	// if (i1 != W && ad != null) {
	// ad.clearAnimation();
	// ad = null;
	// W = -1;
	// }
	// }
	//
	// if (i1 != V) {
	// // continue; /* Loop/switch isn't completed */
	// }
	// if (i1 == W || ad == null) {
	// return;
	// } else {
	//
	// ad.clearAnimation();
	// ad = null;
	// W = -1;
	// // return;
	// if (i1 == W) {
	// return;
	// } else {
	// if (ad != null) {
	// ad.clearAnimation();
	// ad = null;
	// W = -1;
	// }
	// float f1;
	// AnimationSet animationset;
	// TranslateAnimation translateanimation;
	// int j1;
	// int k1;
	// try {
	// d(dragevent);
	// } catch (Exception exception) {
	// t();
	// }
	// j1 = ((WatchFanItem) (fanItem)).h.j;
	// k1 = ((WatchFanItem) (fanItem)).h.k;
	// animationset = new AnimationSet(true);
	// animationset.setFillAfter(true);
	// animationset.setDuration(380L);
	// translateanimation = new TranslateAnimation(0.0F, aa - j1,
	// 0.0F, k1 + -ab);
	// f1 = fanItem.c(true);
	// f1 = ac / f1;
	// animationset.addAnimation(new ScaleAnimation(1.0F, f1, 1.0F,
	// f1, 1, 0.5F, 1, 0.5F));
	// animationset.addAnimation(translateanimation);
	// fanItem.startAnimation(animationset);
	// ad = fanItem;
	// W = i1;
	// return;
	//
	// }
	//
	// }
	//
	// }
	private void c(DragEvent var1) {
		int var3 = this.b((DragEvent) var1);
		if (var3 == -1) {
			if (var3 != this.W && this.ad != null) {
				this.ad.clearAnimation();
				this.ad = null;
				this.W = -1;
			}
		} else {
			WatchFanItem var9 = (WatchFanItem) this.e.get(var3);
			if (!this.c((WatchFanItem) var9)) {
				if (var3 != this.W && this.ad != null) {
					this.ad.clearAnimation();
					this.ad = null;
					this.W = -1;
					return;
				}
			} else if (var3 == this.V) {
				if (var3 != this.W && this.ad != null) {
					this.ad.clearAnimation();
					this.ad = null;
					this.W = -1;
					return;
				}
			} else if (var3 != this.W) {
				if (this.ad != null) {
					this.ad.clearAnimation();
					this.ad = null;
					this.W = -1;
				}

				try {
					this.d((WatchFanItem) var9);
				} catch (Exception var8) {
					this.u();
				}

				int var4 = var9.h.j;
				int var5 = var9.h.k;
				AnimationSet var6 = new AnimationSet(true);
				var6.setFillAfter(true);
				var6.setDuration(380L);
				TranslateAnimation var7 = new TranslateAnimation(0.0F,
						(float) (this.aa - var4), 0.0F,
						(float) (var5 + -this.ab));
				float var2 = var9.c(true);
				var2 = this.ac / var2;
				var6.addAnimation(new ScaleAnimation(1.0F, var2, 1.0F, var2, 1,
						0.5F, 1, 0.5F));
				var6.addAnimation(var7);
				var9.startAnimation(var6);
				this.ad = var9;
				this.W = var3;
				return;
			}
		}

	}

	private boolean c(WatchFanItem watchFanItem) {
		if (watchFanItem == null) {
			return false;
		}
		mt mt = watchFanItem.getInfo();
		if (!(mt instanceof mt)) {
			return false;
		}
		return mt.f();
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	private void d(WatchFanItem var1_1) {

		int var5_5 = -1;
		int var7_7;
		if (this.Q == null || this.Q.length != 39) {
			this.t();
			return;
		}
		int var2_2 = this.e(var1_1);
		if (var2_2 < 0) {
			this.t();
			return;
		}
		this.t();
		int[] var3_3 = Arrays.copyOf((int[]) this.Q, (int) 39);
		int var4_4 = var2_2 / 13;
		int var6_6 = -1 + 13 * (var4_4 + 1);
		for (var5_5 = var4_4 * 13; var5_5 < var6_6; ++var5_5) {
			if (this.Q[var5_5] != var2_2) {
				continue;
			} else {
				if (var5_5 == -1) {
					this.t();
					return;
				}
				for (var7_7 = var5_5; var7_7 < var6_6; ++var7_7) {
					var3_3[var7_7] = this.Q[var7_7 + 1];
				}
				var3_3[var6_6] = this.Q[var5_5];
				if (!tt.b(var3_3)) {
					this.t();
					return;
				}
			}
		}

		this.ae = var3_3;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// private boolean d(DragEvent dragEvent) {
	// int n;
	// if (this.x != null) {
	// this.x.setVisibility(0);
	// this.x.clearAnimation();
	// }
	// if (this.ad != null) {
	// this.ad.clearAnimation();
	// }
	// if (!((n = this.b(dragEvent)) != -1
	// && this.c((WatchFanItem) this.e.get(n)) && n != this.V)) {
	// return false;
	// }
	// Collections.swap((List) this.f, (int) n, (int) this.V);
	// int n2 = 0;
	// do {
	// if (n2 >= this.e.size()) {
	// this.q();
	// this.getTab().a(this.f, this.V, n, new lo() {
	//
	// @Override
	// public void a(List list) {
	// WatchItemSector.this.a(true);
	// WatchItemSector.this.post((Runnable) new Runnable() {
	//
	// public void run() {
	// WatchItemSector.this.l();
	// }
	// });
	// }
	//
	// });
	// return true;
	// }
	// WatchFanItem watchFanItem = (WatchFanItem) this.e.get(n2);
	// if (watchFanItem != null) {
	// watchFanItem.a((mt) this.f.get(n2));
	// watchFanItem.clearAnimation();
	// }
	// ++n2;
	// } while (true);
	// }

	private int e(WatchFanItem watchFanItem) {
		int n = this.getChildCount();
		for (int i = 0; i < n; ++i) {
			if (this.getChildAt(i) != watchFanItem)
				continue;
			return i;
		}
		return -1;
	}

	static float e(WatchItemSector watchitemsector, float f1) {
		watchitemsector.B = f1;
		return f1;
	}

	static float d(WatchItemSector watchitemsector, float f1) {
		watchitemsector.F = f1;
		return f1;
	}

	static int d(WatchItemSector watchitemsector) {
		return watchitemsector.P;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void e(DragEvent dragEvent) {
		if (dragEvent == null || dragEvent.getResult()) {
			return;
		}
		this.l();
		this.u();
	}

	public static ValueAnimator f(WatchItemSector watchItemSector) {
		return watchItemSector.T;
	}

	static ll e(WatchItemSector watchitemsector) {
		return watchitemsector.b;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean f(WatchFanItem watchFanItem) {
		if (watchFanItem == null)
			return false;
		int n = watchFanItem.h.f;
		if (n == 1) {
			return true;
		}
		int n2 = watchFanItem.h.g;
		if (n == 0) {
			if (n2 != 2 && n2 != 12)
				return false;
			return true;
		}
		if (n == 2 && (n2 == 1 || n2 == 11))
			return true;
		return false;
	}

	public static float l(WatchItemSector watchitemsector) {
		return watchitemsector.A;
	}

	static float m(WatchItemSector watchitemsector) {
		return watchitemsector.B;
	}

	static void n(WatchItemSector watchitemsector) {
		watchitemsector.q();
	}

	static Fan o(WatchItemSector watchitemsector) {
		return watchitemsector.a;
	}

	public static float g(WatchItemSector watchItemSector) {
		return watchItemSector.C;
	}

	public static int getDuration() {
		if (NewGuide.j()) {
			return 900;
		}
		return 400;
	}

	public static Fan h(WatchItemSector watchItemSector) {
		return watchItemSector.a;
	}

	public static Fan i(WatchItemSector watchItemSector) {
		return watchItemSector.a;
	}

	public static Fan j(WatchItemSector watchItemSector) {
		return watchItemSector.a;
	}

	public static Fan k(WatchItemSector watchItemSector) {
		return watchItemSector.a;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private void o() {
		if (this.getChildCount() != 39) {
			this.Q = null;
			this.setChildrenDrawingOrderEnabled(false);
			return;
		}
		int[] arrn = new int[39];
		int n = 0;
		while (n < 39) {
			WatchFanItem watchFanItem = (WatchFanItem) this.getChildAt(n);
			int n2 = watchFanItem.h.f;
			int n3 = watchFanItem.h.g;
			int n4 = S[n3];
			int n5 = n2 == 1 ? 0 : (n2 == 2 ? 13 : 26);
			int n6 = n5 + n4;
			if (n6 >= 39) {
				this.Q = null;
				this.setChildrenDrawingOrderEnabled(false);
				return;
			}
			arrn[n6] = n++;
			continue;
		}
		try {
			if (!tt.b(arrn)) {
				this.Q = null;
				this.setChildrenDrawingOrderEnabled(false);
				return;
			}
		} catch (Exception var1_9) {
			this.Q = null;
			this.setChildrenDrawingOrderEnabled(false);
			return;
		}
		this.Q = arrn;
		this.setChildrenDrawingOrderEnabled(true);
	}

	static void p(WatchItemSector watchitemsector) {
		watchitemsector.s();
	}

	static Runnable q(WatchItemSector watchitemsector) {
		return watchitemsector.U;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void p() {
		int i1 = 0;
		while (i1 < 13) {
			if (i1 == 2 || i1 == 12) {
				nm nm1 = new nm(i1, true);
				WatchFanItem watchfanitem = WatchFanItem.a(nm1, 0, i1, c, this);
				w.add(nm1);
				watchfanitem.c(A);
				t.add(watchfanitem);
			} else {
				w.add(new nm(i1, false));
				t.add(null);
			}
			i1++;
		}
		i1 = 0;
		while (i1 < 13) {
			if (i1 == 1 || i1 == 11) {
				nm nm2 = new nm(i1, true);
				WatchFanItem watchfanitem1 = WatchFanItem
						.a(nm2, 2, i1, c, this);
				v.add(nm2);
				watchfanitem1.c(A);
				s.add(watchfanitem1);
			} else {
				v.add(new nm(i1, false));
				s.add(null);
			}
			i1++;
		}
	}

	private void q() {
		Iterator iterator = r.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			WatchFanItem watchfanitem = (WatchFanItem) iterator.next();
			if (watchfanitem != null) {
				watchfanitem.c(A);
			}
		} while (true);
		iterator = s.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			WatchFanItem watchfanitem1 = (WatchFanItem) iterator.next();
			if (watchfanitem1 != null) {
				watchfanitem1.c(A);
			}
		} while (true);
		iterator = t.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			WatchFanItem watchfanitem2 = (WatchFanItem) iterator.next();
			if (watchfanitem2 != null) {
				watchfanitem2.c(A);
			}
		} while (true);
		((WatchSectorArea) b).g.setDegree((int) A);
		requestLayout();
	}

	private boolean r() {
		if (Math.abs((float) (this.D - this.E)) % 90.0f >= 10.0f || this.G) {
			return true;
		}
		return false;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	private void s() {

		switch ((int) oy.b(this.A)) {
		case 0:
			((WatchSectorArea) this.b).setCurrentTab(this.z);
			this.g = 1;
			this.f = this.u;
			this.e = this.r;
			break;
		case 90:
			((WatchSectorArea) this.b).setCurrentTab(this.z + 1);
			this.g = 2;
			this.f = this.v;
			this.e = this.s;
			break;
		case 180:
			((WatchSectorArea) this.b).setCurrentTab(this.z - 1);
			this.g = 0;
			this.f = this.w;
			this.e = this.t;
		}

		// if(getTab() instanceof my) {
		// this.postDelayed(this.U, 500L);
		// }
		if (getTab() instanceof my) {
			postDelayed(U, 500L);

		}
		/*
		 * switch ((int) oy.b(this.A)) { case 0: { ((WatchSectorArea)
		 * this.b).setCurrentTab(this.z); this.g = 1; this.f = this.u; this.e =
		 * this.r; break; } case 90: { ((WatchSectorArea)
		 * this.b).setCurrentTab(1 + this.z); this.g = 2; this.f = this.v;
		 * this.e = this.s; break; } // lbl13: // 3 sources: default: if
		 * (getTab() instanceof my) { postDelayed(U, 500L);
		 * 
		 * } return;
		 * 
		 * case 180: ((WatchSectorArea) this.b).setCurrentTab(-1 + this.z);
		 * this.g = 0; this.f = this.w;
		 * 
		 * this.e = this.t; break; }
		 * 
		 * // lbl20: // 2 sources:
		 * 
		 * // this.postDelayed(this.U, 500);
		 */}

	private void t() {
		this.ae = null;
	}

	private void u() {
		Iterator iterator = getItems().iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			FanItem fanitem = (FanItem) iterator.next();
			if (fanitem != null) {
				fanitem.clearAnimation();
			}
		} while (true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int i1) {
		if (!"recentlyUsed".equals(getTab().b())) {
			return;
		}
		clearAnimation();
		Iterator iterator = e.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			WatchFanItem watchfanitem1 = (WatchFanItem) iterator.next();
			if (watchfanitem1 != null) {
				watchfanitem1.clearAnimation();
			}
		} while (true);
		int j1 = 0;
		int k1;
		do {
			k1 = i1;
			if (j1 >= i1) {
				break;
			}
			WatchFanItem watchfanitem = (WatchFanItem) e.get(j1);
			if (watchfanitem != null) {
				mt mt1 = (mt) f.get(j1);
				watchfanitem.a(mt1);
				if (e() && mt1.g()) {
					watchfanitem.b();
				} else {
					watchfanitem.e();
				}
			}
			j1++;
		} while (true);
		while (k1 < 13) {
			nn nn1 = new nn(k1);
			f.set(k1, nn1);
			if (e.get(k1) != null) {
				((WatchFanItem) e.get(k1)).a(nn1);
				((WatchFanItem) e.get(k1)).e();
			}
			k1++;
		}
		requestLayout();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(View view) {
		Object obj;
		if (view instanceof WatchFanItem) {
			if (((obj = view.getTag()) instanceof mt) && ((mt) obj).f() && !H) {
				x = (WatchFanItem) view;
				y = (mt) obj;
				view = new lp(SwipeApplication.e());
				af = new WeakReference(view);
				((Fan) view).a(x);
				return;
			}
		}
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */

	public void a(FanItem fanitem) {
		boolean flag = false;
		f.clear();
		Iterator iterator = b.getCurrentTab().b(SwipeApplication.e())
				.iterator();
		int i1 = 0;
		int k1 = 0;
		nn nn = null;
		mt mt1 = null;
		int j1 = -1;
		// do {

		if (iterator.hasNext()) {
			mt1 = (mt) iterator.next();
			if (i1 > 13) {
				j1 = i1;
				do {
					k1 = ((flag) ? 1 : 0);
					if (i1 >= 13) {
						break;
					}
					nn = new nn(j1);
					f.add(nn);
					j1++;
					i1++;
				} while (true);
			}
			f.add(mt1);
		}

		// i1++;
		// } while (true);
		do {
			if (k1 < this.e.size()) {
				this.requestLayout();
				return;
			}
			mt1 = (mt) f.get(k1);
			WatchFanItem watchfanitem = (WatchFanItem) e.get(k1);
			if (watchfanitem != null) {
				watchfanitem.a(fanitem);
				if (fanitem.g()) {
					watchfanitem.b();
				} else {
					watchfanitem.e();
				}
				watchfanitem.a((View.OnClickListener) this, mt1 instanceof ne);
				watchfanitem.a((View.OnClickListener) this, mt1 instanceof ne);
			}
			k1++;

		} while (true);

	}

	// public void a(List list, List list2, List list3, int n, boolean bl,
	// boolean bl2) {
	// int n2;
	// this.A = 10800.0f;
	// this.B = 10800.0f;
	// for (mt mt : this.u) {
	// if (mt == null)
	// continue;
	// mt.p();
	// }
	// for (mt mt2 : this.w) {
	// if (mt2 == null)
	// continue;
	// mt2.p();
	// }
	// for (mt mt3 : this.v) {
	// if (mt3 == null)
	// continue;
	// mt3.p();
	// }
	// this.z = n;
	// this.u.clear();
	// this.v.clear();
	// this.w.clear();
	// this.u.addAll((Collection) list);
	// while ((n2 = this.u.size()) > 13) {
	// this.u.remove(n2 - 1);
	// }
	// Iterator iterator = this.u.iterator();
	// int n3 = 0;
	// while (iterator.hasNext()) {
	// mt mt4 = (mt) iterator.next();
	// int n4 = n3 + 1;
	// this.a(1, n3, mt4);
	// n3 = n4;
	// }
	// if (!SwipeApplication.e().b().c || this.a()) {
	// int n5 = n3;
	// for (; n3 < 13; ++n3) {
	// nn nn = new nn(n5);
	// this.u.add(nn);
	// int n6 = n5 + 1;
	// this.a(1, n5, nn);
	// n5 = n6;
	// }
	// if (!bl2) {
	// int n7;
	// int n8;
	// this.v.addAll((Collection) list3);
	// while ((n8 = this.v.size()) > 13) {
	// this.v.remove(n8 - 1);
	// }
	// Iterator iterator2 = this.v.iterator();
	// int n9 = 0;
	// while (iterator2.hasNext()) {
	// mt mt5 = (mt) iterator2.next();
	// int n10 = n9 + 1;
	// this.a(2, n9, mt5);
	// n9 = n10;
	// }
	// int n11 = n9;
	// for (; n9 < 13; ++n9) {
	// nn nn = new nn(n11);
	// this.v.add(nn);
	// int n12 = n11 + 1;
	// this.a(2, n11, nn);
	// n11 = n12;
	// }
	// this.w.addAll((Collection) list2);
	// while ((n7 = this.w.size()) > 13) {
	// this.w.remove(n7 - 1);
	// }
	// Iterator iterator3 = this.w.iterator();
	// int n13 = 0;
	// while (iterator3.hasNext()) {
	// mt mt6 = (mt) iterator3.next();
	// int n14 = n13 + 1;
	// this.a(0, n13, mt6);
	// n13 = n14;
	// }
	// int n15 = n13;
	// for (; n13 < 13; ++n13) {
	// nn nn = new nn(n15);
	// this.w.add(nn);
	// int n16 = n15 + 1;
	// this.a(0, n15, nn);
	// n15 = n16;
	// }
	// } else {
	// this.p();
	// }
	// }
	// for (int i = 0; i < this.r.size(); ++i) {
	// WatchFanItem watchFanItem = this.a(this.r, i);
	// if (this.e() && ((mt) this.u.get(i)).g()) {
	// watchFanItem.b();
	// continue;
	// }
	// watchFanItem.e();
	// }
	// for (int j = 0; j < this.s.size(); ++j) {
	// this.a(this.s, j);
	// }
	// for (int k = 0; k < this.t.size(); ++k) {
	// this.a(this.t, k);
	// }
	// if (bl) {
	// for (int i2 = 0; i2 < this.r.size(); ++i2) {
	// WatchFanItem watchFanItem = (WatchFanItem) this.r.get(i2);
	// if (watchFanItem == null || Fan.n())
	// continue;
	// boolean bl3 = bl2 && i2 == 0;
	// this.a(watchFanItem, bl3);
	// }
	// for (int i3 = 0; i3 < this.t.size(); ++i3) {
	// WatchFanItem watchFanItem = (WatchFanItem) this.t.get(i3);
	// if (watchFanItem == null || Fan.n())
	// // continue;
	// this.a(watchFanItem, false);
	// }
	// for (int i4 = 0; i4 < this.s.size(); ++i4) {
	// WatchFanItem watchFanItem = (WatchFanItem) this.s.get(i4);
	// if (watchFanItem == null || Fan.n())
	// // continue;
	// this.a(watchFanItem, false);
	// }
	// }
	// if (Fan.n()) {
	// this.m();
	// }
	// for (int i5 = 0; i5 < this.u.size(); ++i5) {
	// this.a(1, i5);
	// }
	// if (!bl2) {
	// int n17 = 0;
	// do {
	// int n18 = this.w.size();
	// if (n17 >= n18)
	// break;
	// this.a(0, n17);
	// ++n17;
	// } while (true);
	// for (int i6 = 0; i6 < this.v.size(); ++i6) {
	// this.a(2, i6);
	// }
	// }
	// this.g = 1;
	// this.f = this.u;
	// this.e = this.r;
	// ((WatchSectorArea) this.b).g.a();
	// ((WatchSectorArea) this.b).g.setDegree((int) this.A);
	// this.requestLayout();
	// this.b.setPopupPrepared(true);
	// this.o();
	// }

	// public void a(List list, List list1, List list2, int i1, boolean flag,
	// boolean flag1) {
	// boolean flag2 = false;
	// A = 10800F;
	// B = 10800F;
	// Iterator iterator = u.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// mt mt1 = (mt) iterator.next();
	// if (mt1 != null) {
	// mt1.p();
	// }
	// } while (true);
	// iterator = w.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// mt mt2 = (mt) iterator.next();
	// if (mt2 != null) {
	// mt2.p();
	// }
	// } while (true);
	// iterator = v.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// mt mt3 = (mt) iterator.next();
	// if (mt3 != null) {
	// mt3.p();
	// }
	// } while (true);
	// z = i1;
	// u.clear();
	// v.clear();
	// w.clear();
	// u.addAll(list);
	// do {
	// i1 = u.size();
	// if (i1 <= 13) {
	// break;
	// }
	// u.remove(i1 - 1);
	// } while (true);
	// Iterator iterator2 = u.iterator();
	// for (i1 = 0; iterator2.hasNext(); i1++) {
	// a(1, i1, (mt) iterator2.next());
	// }
	//
	// if (!SwipeApplication.e().b().c || a()) {
	// for (int j1 = i1; i1 < 13; j1++) {
	// nn nn = new nn(j1);
	// u.add(nn);
	// a(1, j1, ((mt) (list)));
	// i1++;
	// }
	//
	// if (!flag1) {
	// v.addAll(list2);
	// do {
	// i1 = v.size();
	// if (i1 <= 13) {
	// break;
	// }
	// v.remove(i1 - 1);
	// } while (true);
	// Iterator iterator3 = v.iterator();
	// for (i1 = 0; iterator3.hasNext(); i1++) {
	// a(2, i1, (mt) iterator3.next());
	// }
	//
	// for (int k1 = i1; i1 < 13; k1++) {
	// nn nn = new nn(k1);
	// v.add(nn);
	// a(2, k1, ((mt) (list)));
	// i1++;
	// }
	//
	// w.addAll(list1);
	// do {
	// i1 = w.size();
	// if (i1 <= 13) {
	// break;
	// }
	// w.remove(i1 - 1);
	// } while (true);
	// Iterator iterator4 = w.iterator();
	// for (i1 = 0; iterator4.hasNext(); i1++) {
	// a(0, i1, (mt) iterator4.next());
	// }
	//
	// for (int l1 = i1; i1 < 13; l1++) {
	// nn nn = new nn(l1);
	// w.add(nn);
	// a(0, l1, ((mt) (list)));
	// i1++;
	// }
	//
	// } else {
	// p();
	// }
	// }
	// i1 = 0;
	// while (i1 < r.size()) {
	// WatchFanItem fanItem = a(r, i1);
	// if (e() && ((mt) u.get(i1)).g()) {
	// fanItem.b();
	// } else {
	// fanItem.e();
	// }
	// i1++;
	// }
	// for (i1 = 0; i1 < s.size(); i1++) {
	// a(s, i1);
	// }
	//
	// for (i1 = 0; i1 < t.size(); i1++) {
	// a(t, i1);
	// }
	//
	// if (flag) {
	// i1 = 0;
	// while (i1 < r.size()) {
	// WatchFanItem watchFanItem = (WatchFanItem) r.get(i1);
	// if (watchFanItem != null && !Fan.n()) {
	// if (flag1 && i1 == 0) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// a(((WatchFanItem) (watchFanItem)), flag);
	// }
	// i1++;
	// }
	// for (i1 = 0; i1 < t.size(); i1++) {
	// WatchFanItem watchFanItem = (WatchFanItem) t.get(i1);
	// if (list != null && !Fan.n()) {
	// a(((WatchFanItem) (watchFanItem)), false);
	// }
	// }
	//
	// for (i1 = 0; i1 < s.size(); i1++) {
	// WatchFanItem watchFanItem = (WatchFanItem) s.get(i1);
	// if (list != null && !Fan.n()) {
	// a(((WatchFanItem) (watchFanItem)), false);
	// }
	// }
	//
	// }
	// if (Fan.n()) {
	// m();
	// }
	// for (i1 = 0; i1 < u.size(); i1++) {
	// a(1, i1);
	// }
	//
	// if (!flag1) {
	// i1 = 0;
	// int i2;
	// do {
	// i2 = ((flag2) ? 1 : 0);
	// if (i1 >= w.size()) {
	// break;
	// }
	// a(0, i1);
	// i1++;
	// } while (true);
	// for (; i2 < v.size(); i2++) {
	// a(2, i2);
	// }
	//
	// }
	// g = 1;
	// f = u;
	// e = r;
	// ((WatchSectorArea) b).g.a();
	// ((WatchSectorArea) b).g.setDegree((int) A);
	// requestLayout();
	// b.setPopupPrepared(true);
	// o();
	// }
	public void a(List var1, List var2, List var3, int var4, boolean var5,
			boolean var6) {
		byte var8 = 0;
		this.A = 10800.0F;
		this.B = 10800.0F;
		Iterator var9 = this.u.iterator();

		mt var10;
		while (var9.hasNext()) {
			var10 = (mt) var9.next();
			if (var10 != null) {
				var10.o();
			}
		}

		var9 = this.w.iterator();

		while (var9.hasNext()) {
			var10 = (mt) var9.next();
			if (var10 != null) {
				var10.o();
			}
		}

		var9 = this.v.iterator();

		while (var9.hasNext()) {
			var10 = (mt) var9.next();
			if (var10 != null) {
				var10.o();
			}
		}

		this.z = var4;
		this.u.clear();
		this.v.clear();
		this.w.clear();
		this.u.addAll(var1);

		while (true) {
			var4 = this.u.size();
			if (var4 <= 13) {
				Iterator var11 = this.u.iterator();

				for (var4 = 0; var11.hasNext(); ++var4) {
					this.a(1, var4, (mt) var11.next());
				}

				int var7;
				if (!SwipeApplication.e().b().c || this.a()) {
					nn var12;
					for (var7 = var4; var4 < 13; ++var7) {
						var12 = new nn(var7);
						this.u.add(var12);
						this.a(1, var7, var12);
						++var4;
					}

					if (!var6) {
						this.v.addAll(var3);

						 while (true) {
							var4 = this.v.size();
							if (var4 <= 13) {
								var11 = this.v.iterator();

								for (var4 = 0; var11.hasNext(); ++var4) {
									this.a(2, var4, (mt) var11.next());
								}

								for (var7 = var4; var4 < 13; ++var7) {
									var12 = new nn(var7);
									this.v.add(var12);
									this.a(2, var7, var12);
									++var4;
								}

								this.w.addAll(var2);

								while (true) {
									var4 = this.w.size();
									if (var4 <= 13) {
										var11 = this.w.iterator();

										for (var4 = 0; var11.hasNext(); ++var4) {
											this.a(0, var4, (mt) var11.next());
										}

										for (var7 = var4; var4 < 13; ++var7) {
											var12 = new nn(var7);
											this.w.add(var12);
											this.a(0, var7, var12);
											++var4;
										}
										
									}

									this.w.remove(var4 - 1);
								}
							}

							this.v.remove(var4 - 1);
						}
					} else {
						this.q();
					}
				}

				WatchFanItem var13;
				for (var4 = 0; var4 < this.r.size(); ++var4) {
					var13 = this.a(this.r, var4);
					if (this.e() && ((mt) this.u.get(var4)).g()) {
						var13.e();
					} else {
						var13.b();
					}
				}

				for (var4 = 0; var4 < this.s.size(); ++var4) {
					this.a(this.s, var4);
				}

				for (var4 = 0; var4 < this.t.size(); ++var4) {
					this.a(this.t, var4);
				}

				if (var5) {
					for (var4 = 0; var4 < this.r.size(); ++var4) {
						var13 = (WatchFanItem) this.r.get(var4);
						if (var13 != null && !Fan.n()) {
							if (var6 && var4 == 0) {
								var5 = true;
							} else {
								var5 = false;
							}

							this.a((WatchFanItem) var13, var5);
						}
					}

					for (var4 = 0; var4 < this.t.size(); ++var4) {
						var13 = (WatchFanItem) this.t.get(var4);
						if (var13 != null && !Fan.n()) {
							this.a((WatchFanItem) var13, false);
						}
					}

					for (var4 = 0; var4 < this.s.size(); ++var4) {
						var13 = (WatchFanItem) this.s.get(var4);
						if (var13 != null && !Fan.n()) {
							this.a((WatchFanItem) var13, false);
						}
					}
				}

				if (Fan.n()) {
					this.n();
				}

				for (var4 = 0; var4 < this.u.size(); ++var4) {
					this.a(1, var4);
				}

				if (!var6) {
					var4 = 0;

					while (true) {
						var7 = var8;
						if (var4 >= this.w.size()) {
							while (var7 < this.v.size()) {
								this.a(2, var7);
								++var7;
							}
							break;
						}

						this.a(0, var4);
						++var4;
					}
				}

				this.g = 1;
				this.f = this.u;
				this.e = this.r;
				((WatchSectorArea) this.b).g.a();
				((WatchSectorArea) this.b).g.setDegree((int) this.A);
				this.requestLayout();
				this.b.setPopupPrepared(true);
				this.p();
				return;
			}

			this.u.remove(var4 - 1);
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void a(boolean flag) {
		if (flag) {
			((WatchSectorArea) getParent()).g();
		} else {
			Iterator iterator = r.iterator();
			while (iterator.hasNext()) {
				WatchFanItem watchfanitem = (WatchFanItem) iterator.next();
				if (watchfanitem != null) {
					if (e()) {
						watchfanitem.b();
					} else {
						watchfanitem.e();
					}
				}
			}
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a(boolean bl, lu lu) {
		for (int i = 0; i < this.e.size(); ++i) {
			try {
				WatchFanItem watchFanItem = (WatchFanItem) this.e.get(i);
				mt mt1 = (mt) f.get(i);
				if (bl) {
					watchFanItem.a(true, lu);
					// continue;
				}
				watchFanItem.e();
				// continue;
			} catch (Throwable var4_5) {
				// empty catch block
				break;
			}
		}
		this.H = false;
	}

	public boolean a() {
		return this.b.getCurrentTab().b().equals((Object) "switcher");
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	// public boolean a(float f1, float f2, float f3, float f4, float f5, float
	// f6) {
	// float f8;
	// boolean flag4;
	// boolean flag1;
	// boolean flag3;
	// int j1 = getHeight();
	// int i1;
	// if (m || !n || H) {
	// return true;
	// }
	// float f7 = (float) getMeasuredHeight() - 0.1F;
	// f8 = f2;
	// if (f2 > f7) {
	// f8 = f7;
	// }
	// f2 = f4;
	// if (f4 > f7) {
	// f2 = f7;
	// }
	// if (!c) {
	//
	// if (f5 > 0.0F && f6 < 0.0F) {
	// flag4 = false;
	// // continue; /* Loop/switch isn't completed */
	// }
	// if (f5 >= 0.0F || f6 <= 0.0F) {
	// // break; /* Loop/switch isn't completed */
	// }
	// flag4 = true;
	// if (a.f <= 1) {
	// return true;
	// }
	//
	// } else {
	// // _L1:
	//
	// if (f5 < 0.0F && f6 < 0.0F) {
	// flag4 = false;
	// } else if (f5 > 0.0F && f6 > 0.0F) {
	// flag4 = true;
	// } else {
	// boolean flag;
	// boolean flag2;
	// if (f5 > (float) K && f6 < (float) (-K)) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// if (f1 - f3 > (float) L && f8 - f2 < (float) (-L) && !e()) {
	// flag2 = true;
	// } else {
	// flag2 = false;
	// }
	// if (!k && (flag || flag2)) {
	// a.a(true);
	// return true;
	// } else {
	// return true;
	// }
	// }
	// }
	//
	// if (f5 < (float) (-K) && f6 < (float) (-K)) {
	// flag1 = true;
	// } else {
	// flag1 = false;
	// }
	// if (f1 - f3 < (float) (-L) && f8 - f2 < (float) (-L) && !e()) {
	// flag3 = true;
	// } else {
	// flag3 = false;
	// }
	//
	// if (c) {
	// i1 = 0;
	// } else {
	// i1 = getWidth();
	// }
	// if (k) {
	//
	// if (flag4 != l) {
	// boolean flag5;
	// if (!O) {
	// flag5 = true;
	// } else {
	// flag5 = false;
	// }
	// O = flag5;
	// }
	// D = (float) (-vk.a(j1, i1, f2, f3));
	// F = D - C;
	// if (!c) {
	// F = -F;
	// }
	// C = D;
	// B = A;
	// A = A + F;
	// q();
	// i = f3;
	// j = f2;
	// return true;
	//
	// } else {
	//
	// removeCallbacks(U);
	// O = false;
	// k = true;
	// is.a = true;
	// l = flag4;
	// C = (float) (-vk.a(j1, i1, f8, f1));
	// E = C;
	// oy.a = true;
	// }
	// if (!k && (flag1 || flag3)) {
	// a.a(true);
	// return true;
	// } else {
	// return true;
	// }
	//
	// }
	public boolean a(float var1, float var2, float var3, float var4,
			float var5, float var6) {
		if (!this.m && this.n && !this.H) {
			float var7 = (float) this.getMeasuredHeight() - 0.1F;
			float var8 = var2;
			if (var2 > var7) {
				var8 = var7;
			}

			var2 = var4;
			if (var4 > var7) {
				var2 = var7;
			}

			boolean var9;
			boolean var10;
			boolean var11;
			if (this.c) {
				if (var5 < 0.0F && var6 < 0.0F) {
					var11 = false;
				} else {
					if (var5 <= 0.0F || var6 <= 0.0F) {
						if (var5 > (float) this.K && var6 < (float) (-this.K)) {
							var9 = true;
						} else {
							var9 = false;
						}

						if (var1 - var3 > (float) this.L
								&& var8 - var2 < (float) (-this.L) && !this.e()) {
							var10 = true;
						} else {
							var10 = false;
						}

						if (!this.k && (var9 || var10)) {
							this.a.a(true);
							return true;
						}

						return true;
					}

					var11 = true;
				}
			} else if (var5 > 0.0F && var6 < 0.0F) {
				var11 = false;
			} else {
				if (var5 >= 0.0F || var6 <= 0.0F) {
					if (var5 < (float) (-this.K) && var6 < (float) (-this.K)) {
						var9 = true;
					} else {
						var9 = false;
					}

					if (var1 - var3 < (float) (-this.L)
							&& var8 - var2 < (float) (-this.L) && !this.e()) {
						var10 = true;
					} else {
						var10 = false;
					}

					if (!this.k && (var9 || var10)) {
						this.a.a(true);
						return true;
					}

					return true;
				}

				var11 = true;
			}

			if (this.a.f <= 1) {
				return true;
			} else {
				int var13 = this.getHeight();
				int var12;
				if (this.c) {
					var12 = 0;
				} else {
					var12 = this.getWidth();
				}

				if (!this.k) {
					this.removeCallbacks(this.U);
					this.O = false;
					this.k = true;
					is.a = true;
					this.l = var11;
					this.C = (float) (-vk.a((double) var13, (double) var12,
							(double) var8, (double) var1));
					this.E = this.C;
					oy.a = true;
				} else if (var11 != this.l) {
					if (!this.O) {
						var11 = true;
					} else {
						var11 = false;
					}

					this.O = var11;
				}

				this.D = (float) (-vk.a((double) var13, (double) var12,
						(double) var2, (double) var3));
				this.F = this.D - this.C;
				if (!this.c) {
					this.F = -this.F;
				}

				this.C = this.D;
				this.B = this.A;
				this.A += this.F;
				this.r();
				this.i = var3;
				this.j = var2;
				return true;
			}
		} else {
			return true;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	boolean a(MotionEvent motionEvent) {
		if (this.a.f <= 1)
			return true;
		boolean bl = this.a(motionEvent, false);
		boolean bl2 = false;
		if (!bl)
			return bl2;
		return true;
	}

	boolean a(MotionEvent motionEvent, boolean bl) {
		return this.a(motionEvent, bl, false);
	}

	/*
	 * Exception decompiling
	 */
	boolean a(MotionEvent motionevent, boolean flag, boolean flag1) {
		// label0:
		{
			// label1:
			{
				flag1 = false;
				n = false;
				if (m || !k && !flag) {
					// break label0;
				}
				// motionevent = a;
				Fan.b = true;
				k = false;
				m = false;
				h();
				A = oy.d(A);
				if (!flag) {
					flag = flag1;
					if (!r()) {
						// break label1;
					}
				}
				flag = true;
			}
			N = flag;
			float f1 = A;
			if (c) {
				if (D > E) {
					if (N) {
						f1 = ((int) A / 90 + 1) * 90;
					} else {
						f1 = ((int) A / 90) * 90;
					}
				} else if (N) {
					f1 = ((int) A / 90) * 90;
				} else {
					f1 = ((int) A / 90 + 1) * 90;
				}
			} else if (D > E) {
				if (N) {
					f1 = ((int) A / 90) * 90;
				} else {
					f1 = ((int) A / 90 + 1) * 90;
				}
			} else if (N) {
				f1 = ((int) A / 90 + 1) * 90;
			} else {
				f1 = ((int) A / 90) * 90;
				a(N, f1);
				return true;
			}

			return false;
		}
	}

	public boolean a(Object object) {
		return object instanceof nn;
	}

	public void b(int i1) {
		for (int j1 = 0; j1 < getChildCount(); j1++) {
			final View view = getChildAt(j1);
			ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.0F,
					1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
			AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
			AnimationSet animationset = new AnimationSet(true);
			animationset.addAnimation(scaleanimation);
			animationset.addAnimation(alphaanimation);
			animationset.setDuration(i1);
			animationset.setInterpolator(new AccelerateInterpolator());
			animationset.setAnimationListener(new sx() {

				final View a;
				final WatchItemSector b;

				public void onAnimationEnd(Animation animation) {
					a.setVisibility(4);
				}

				{
					b = WatchItemSector.this;
					a = view;
					// super();
				}
			});
			view.startAnimation(animationset);
		}

	}

	// void b(boolean flag) {
	// clearAnimation();
	// for (int i1 = getChildCount() - 1; i1 >= 0; i1--) {
	// getChildAt(0).clearAnimation();
	// }
	//
	// if (flag) {
	// removeAllViews();
	// Iterator iterator = r.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// FanItem fanitem = (FanItem) iterator.next();
	// if (fanitem != null && (fanitem.getTag() instanceof mt)) {
	// ((mt) fanitem.getTag()).p();
	// }
	// } while (true);
	// r.clear();
	// iterator = t.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// FanItem fanitem1 = (FanItem) iterator.next();
	// if (fanitem1 != null && (fanitem1.getTag() instanceof mt)) {
	// ((mt) fanitem1.getTag()).p();
	// }
	// } while (true);
	// t.clear();
	// iterator = s.iterator();
	// do {
	// if (!iterator.hasNext()) {
	// break;
	// }
	// FanItem fanitem2 = (FanItem) iterator.next();
	// if (fanitem2 != null && (fanitem2.getTag() instanceof mt)) {
	// ((mt) fanitem2.getTag()).p();
	// }
	// } while (true);
	// s.clear();
	// return;
	// } else {
	// detachAllViewsFromParent();
	// return;
	// }
	// }
	void b(boolean var1) {
		this.clearAnimation();

		for (int var2 = this.getChildCount() - 1; var2 >= 0; --var2) {
			this.getChildAt(0).clearAnimation();
		}

		if (var1) {
			this.removeAllViews();
			Iterator var3 = this.r.iterator();

			FanItem var4;
			while (var3.hasNext()) {
				var4 = (FanItem) var3.next();
				if (var4 != null && var4.getTag() instanceof mt) {
					((mt) var4.getTag()).o();
				}
			}

			this.r.clear();
			var3 = this.t.iterator();

			while (var3.hasNext()) {
				var4 = (FanItem) var3.next();
				if (var4 != null && var4.getTag() instanceof mt) {
					((mt) var4.getTag()).o();
				}
			}

			this.t.clear();
			var3 = this.s.iterator();

			while (var3.hasNext()) {
				var4 = (FanItem) var3.next();
				if (var4 != null && var4.getTag() instanceof mt) {
					((mt) var4.getTag()).o();
				}
			}

			this.s.clear();
		} else {
			this.detachAllViewsFromParent();
		}
	}

	public boolean b() {
		return this.b.getCurrentTab().b().equals((Object) "recentlyUsed");
	}

	public void c(int i1) {
		for (int j1 = 0; j1 < getChildCount(); j1++) {
			final View view = getChildAt(j1);
			ScaleAnimation scaleanimation = new ScaleAnimation(0.0F, 1.0F,
					0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
			AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
			AnimationSet animationset = new AnimationSet(true);
			animationset.addAnimation(scaleanimation);
			animationset.addAnimation(alphaanimation);
			animationset.setDuration(i1);
			animationset.setInterpolator(new AccelerateInterpolator());
			animationset.setAnimationListener(new sx() {

				final View a;
				final WatchItemSector b;

				public void onAnimationStart(Animation animation) {
					a.setVisibility(0);
				}

				{
					b = WatchItemSector.this;
					a = view;
					// super();
				}
			});
			view.startAnimation(animationset);
		}

	}

	public boolean c() {
		return this.b.getCurrentTab().b().equals((Object) "mostUsed");
	}

	public boolean d() {
		return false;
	}

	/*
	 * Loose catch block Enabled aggressive block sorting Enabled unnecessary
	 * exception pruning Lifted jumps to return sites
	 */
	public void e(View view) {
		for (int i = 0; i < this.e.size(); ++i) {
			WatchFanItem watchFanItem = (WatchFanItem) this.e.get(i);
			mt mt = (mt) this.f.get(i);
			if (watchFanItem == null || !mt.g())
				continue;
			boolean bl = view != watchFanItem;
			watchFanItem.a(bl);
		}
		return;

	}

	protected int getChildDrawingOrder(int i1, int j1) {
		if (i1 != 39) {
			return super.getChildDrawingOrder(i1, j1);
		}
		if (H && ae != null) {
			return ae[j1];
		}
		if (Q != null) {
			return Q[j1];
		} else {
			return super.getChildDrawingOrder(i1, j1);
		}
	}

	public List getItems() {
		return this.e;
	}

	public nc getTab() {
		return this.b.getCurrentTab();
	}

	void k() {
		Iterator iterator = this.r.iterator();
		while (iterator.hasNext()) {
			this.a((WatchFanItem) iterator.next());
		}
		Iterator iterator2 = this.t.iterator();
		while (iterator2.hasNext()) {
			this.a((WatchFanItem) iterator2.next());
		}
		Iterator iterator3 = this.s.iterator();
		while (iterator3.hasNext()) {
			this.a((WatchFanItem) iterator3.next());
		}
	}

	void l() {
		V = -1;
		W = -1;
		if (af != null && af.get() != null) {
			((lp) af.get()).b();
			af.clear();
			af = null;
		}
		if (x != null) {
			x.clearAnimation();
			x.setVisibility(0);
			x = null;
		}
		if (ad != null) {
			ad.clearAnimation();
			ad.setVisibility(0);
			ad = null;
		}
		H = false;
		t();
	}

	private boolean d(DragEvent var1) {
		if (this.x != null) {
			this.x.setVisibility(0);
			this.x.clearAnimation();
		}

		if (this.ad != null) {
			this.ad.clearAnimation();
		}

		int var3 = this.b((DragEvent) var1);
		if (var3 != -1
				&& this.c((WatchFanItem) ((WatchFanItem) this.e.get(var3)))
				&& var3 != this.V) {
			Collections.swap(this.f, var3, this.V);

			for (int var2 = 0; var2 < this.e.size(); ++var2) {
				WatchFanItem var4 = (WatchFanItem) this.e.get(var2);
				if (var4 != null) {
					var4.a((mt) ((mt) this.f.get(var2)));
					var4.clearAnimation();
				}
			}

			this.r();
			this.getTab().a(this.f, this.V, var3, new lo() {
				public void a(List var1) {
					WatchItemSector.this.a(true);
					WatchItemSector.this.post(new Runnable() {
						public void run() {
							WatchItemSector.this.m();
						}
					});
				}
			});
			return true;
		} else {
			return false;
		}
	}

	// public void m() {
	// boolean flag = false;
	// for (int i1 = 0; i1 < r.size(); i1++) {
	// WatchFanItem watchfanitem = (WatchFanItem) r.get(i1);
	// if (f(watchfanitem)) {
	// watchfanitem.h();
	// }
	// }
	//
	// int j1 = 0;
	// int k1;
	// do {
	// k1 = ((flag) ? 1 : 0);
	// if (j1 >= t.size()) {
	// break;
	// }
	// WatchFanItem watchfanitem1 = (WatchFanItem) t.get(j1);
	// if (f(watchfanitem1)) {
	// watchfanitem1.h();
	// }
	// j1++;
	// } while (true);
	// for (; k1 < s.size(); k1++) {
	// WatchFanItem watchfanitem2 = (WatchFanItem) s.get(k1);
	// if (f(watchfanitem2)) {
	// watchfanitem2.h();
	// }
	// }
	//
	// requestLayout();
	// }
	public void m() {
		byte var3 = 0;

		int var1;
		WatchFanItem var4;
		for (var1 = 0; var1 < this.r.size(); ++var1) {
			var4 = (WatchFanItem) this.r.get(var1);
			if (this.f((WatchFanItem) var4)) {
				var4.i();
			}
		}

		var1 = 0;

		while (true) {
			int var2 = var3;
			if (var1 >= this.t.size()) {
				for (; var2 < this.s.size(); ++var2) {
					var4 = (WatchFanItem) this.s.get(var2);
					if (this.f((WatchFanItem) var4)) {
						var4.i();
					}
				}

				this.requestLayout();
				return;
			}

			var4 = (WatchFanItem) this.t.get(var1);
			if (this.f((WatchFanItem) var4)) {
				var4.i();
			}

			++var1;
		}
	}

	public void n() {
		((WatchSectorArea) this.b).a(false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public boolean onDragEvent(DragEvent dragEvent) {
	// switch (dragEvent.getAction()) {
	// case 1: {
	// this.a(dragEvent);
	// return true;
	// }
	// case 2: {
	// this.c(dragEvent);
	// }
	// default: {
	// return false;
	// }
	// case 3: {
	// return this.d(dragEvent);
	// }
	// case 4:
	//
	// this.e(dragEvent);
	// }
	// return false;
	// }
	public boolean onDragEvent(DragEvent var1) {
		switch (var1.getAction()) {
		case 1:
			this.a((DragEvent) var1);
			return true;
		case 2:
			this.c((DragEvent) var1);
			break;
		case 3:
			return this.d((DragEvent) var1);
		case 4:
			this.e((DragEvent) var1);
		case 5:
		case 6:
		}

		return false;
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public boolean onInterceptTouchEvent(MotionEvent motionevent) {
		int i1 = motionevent.getActionMasked();
		if (!isInEditMode()) {
			switch (i1) {
			case 1: // '\001'
			default:
				M = 0;
				return false;

			case 0: // '\0'
				I = motionevent.getX();
				J = motionevent.getY();
				return false;

			case 2: // '\002'
				break;
			}
			if (1 != M) {
				float f1 = Math.abs(motionevent.getX() - I);
				float f2 = Math.abs(motionevent.getY() - J);
				if (f1 > (float) K || f2 > (float) K) {
					M = 1;
					motionevent = MotionEvent.obtain(motionevent);
					motionevent.setAction(0);
					p.onTouchEvent(motionevent);
					return true;
				}
			} else {
				return true;
			}
		}
		return false;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * Lifted jumps to return sites
	 */
	public boolean onTouchEvent(MotionEvent motionevent) {
		if (motionevent != null && !a.f()) {
			if (M == 0)
				;
			int i1 = motionevent.getAction();
			try {
				p.onTouchEvent(motionevent);
			} catch (Throwable throwable) {
				vj.b(q,
						(new StringBuilder())
								.append("Exception in GestureDetector.onTouchEvent: ")
								.append(throwable.getMessage()).toString());
			}
			if (3 == i1 || 1 == i1) {
				M = 0;
				h = false;
				a(motionevent);
				return true;
			}
		}
		return true;
	}

	public void setDirection(boolean flag) {
		super.setDirection(flag);
		WatchSectorArea.a(this, flag);
	}

	public void setHasAddIcon(boolean flag) {
	}

}
