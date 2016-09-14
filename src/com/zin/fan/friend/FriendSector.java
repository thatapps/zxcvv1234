/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewPropertyAnimator
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
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.lazyswipe.fan.friend;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.TabSectorBg;
import com.lazyswipe.fan.hetero.iwatch.WatchTabSectorBg;
import com.lazyswipe.zev.R;
import com.main.ja;
import com.main.jc;
import com.main.lk;
import com.main.lt;
import com.main.mg;
import com.main.mi;
import com.main.mr;
import com.main.ng;
import com.main.ox;
import com.main.oy;
import com.main.sx;
import com.main.ta;
import com.main.tk;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class FriendSector extends FrameLayout implements View.OnClickListener {
	private static final String a = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.fan.friend.FriendSector.class.getSimpleName())
			.toString();
	private static WeakReference b;
	private WeakReference c;
	private mr d;
	private boolean e;
	private int f;
	private int g;
	private Paint h;
	private int i;
	private int j;
	private int k;
	private int l[];
	private int m[];
	private List n;
	private ImageView o;
	private ImageView p;
	private int q;
	private int r;
	private boolean s;

	public FriendSector(Context context) {
		super(context);
		l = new int[2];
		m = new int[2];
		n = new ArrayList();
	}

	public FriendSector(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		l = new int[2];
		m = new int[2];
		n = new ArrayList();
	}

	private static double a(int i1, int j1) {
		return (1.5707963267948966D / (double) (j1 * 2))
				* (double) ((j1 - i1) * 2 - 1);
	}

	static int a(FriendSector friendsector, int i1) {
		friendsector.g = i1;
		return i1;
	}

	/*
	 * public static FriendSector a(FanItem fanItem) { if (FriendSector.a()) {
	 * return null; } if (!(fanItem != null && fanItem.getTag() instanceof mr &&
	 * ((mr) fanItem .getTag()).j() != null)) { return null; } FriendSector
	 * friendSector = (FriendSector) LayoutInflater.from( (Context)
	 * SwipeApplication.e()).inflate(R.layout.friend_sector, null);
	 * friendSector.b(fanItem); return friendSector; }
	 */

	public static FriendSector a(FanItem fanitem) {
		if (a()) {
			return null;
		}
		if (fanitem == null || !(fanitem.getTag() instanceof mr)
				|| ((mr) fanitem.getTag()).j() == null) {
			return null;
		} else {
			FriendSector friendsector = (FriendSector) LayoutInflater.from(
					SwipeApplication.e()).inflate(R.layout.friend_sector, null);
			friendsector.b(fanitem);
			return friendsector;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static mg a(int i1, double d1, boolean flag) {
		int k1 = (int) ((double) i1 * Math.cos(d1));
		int j1;
		if (flag) {
			j1 = 1;
		} else {
			j1 = -1;
		}
		return new mg(j1 * k1, (int) ((double) i1 * Math.sin(d1)));
	}

	private static mg a(int i1, int j1, int k1, boolean flag) {
		return a(k1, a(i1, j1), flag);
	}

	static void a(FriendSector friendsector) {
		friendsector.e();
	}

	public static boolean a() {
		return b != null && b.get() != null;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void b(FanItem fanitem) {
		Fan fan = Fan.getInstance();
		c = new WeakReference(fanitem);
		d = (mr) fanitem.getTag();
		s = false;
		if (d.b() instanceof tk) {
			h.setColor(((tk) d.b()).a());
		}
		LayoutParams params = new android.widget.FrameLayout.LayoutParams(-1,
				-1);
		byte byte0;
		if (e) {
			byte0 = 3;
		} else {
			byte0 = 5;
		}
		params.gravity = byte0 | 0x50;
		fan.addView(this, params);
	}

	static void b(FriendSector friendsector) {
		friendsector.g();
	}

	public static boolean b() {
		if (a()) {
			((FriendSector) b.get()).q();
			return true;
		} else {
			return false;
		}
	}

	static void c(FriendSector friendsector) {
		friendsector.n();
	}

	static void d(FriendSector friendsector) {
		friendsector.p();
	}

	private void e() {
		FanItem fanitem = (FanItem) c.get();
		Drawable drawable = f();
		o.setImageDrawable(drawable);
		int ai[] = new int[2];
		ImageView imageview = fanitem.a;
		imageview.getLocationInWindow(ai);
		q = ai[0]
				- getLeft()
				- (int) (((float) imageview.getWidth() * (1.0F - fanitem
						.getScaleX())) / 2.0F);
		r = ai[1]
				- getTop()
				- (int) (((float) imageview.getHeight() * (1.0F - fanitem
						.getScaleY())) / 2.0F);
		o.setX(q);
		o.setY(r);
		o.setPivotX(drawable.getIntrinsicWidth() / 2);
		o.setPivotY(drawable.getIntrinsicHeight() / 2);
		o.setScaleX(fanitem.getScaleX());
		o.setScaleY(fanitem.getScaleY());
		post(new Runnable() {

			final FriendSector a;

			public void run() {
				FriendSector.b(a);
			}

			{
				a = FriendSector.this;
				// super();
			}
		});
	}

	static void e(FriendSector friendsector) {
		friendsector.o();
	}

	private Drawable f() {
		Object obj = (FanItem) c.get();
		if (obj == null) {
			return null;
		}
		obj = ((FanItem) (obj)).a;
		if (obj == null) {
			return null;
		}
		Object obj1;
		try {
			obj1 = Bitmap.createBitmap(((ImageView) (obj)).getWidth(),
					((ImageView) (obj)).getHeight(),
					android.graphics.Bitmap.Config.ARGB_8888);
			((ImageView) (obj)).draw(new Canvas(((Bitmap) (obj1))));
			obj1 = new BitmapDrawable(getResources(), ((Bitmap) (obj1)));
		} catch (Throwable throwable) {
			return ((ImageView) (obj)).getDrawable();
		}
		return ((Drawable) (obj1));
	}

	static void f(FriendSector friendsector) {
		friendsector.s();
	}

	static void g(FriendSector friendsector) {
		friendsector.t();
	}

	private void g() {
		if (Fan.getInstance() != null) {
			this.h();
			this.m();
			this.k();
			this.j();
			this.i();
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private void h() {
		Object obj = Fan.getInstance();
		if (obj != null) {
			Object obj1 = ((Fan) (obj)).getItemLayer();
			if (obj1 != null) {
				((lk) (obj1)).b(150);
			}
			obj1 = ((Fan) (obj)).getItemSectorBg();
			if (obj1 != null) {
				((View) (obj1)).animate().alpha(0.0F).setDuration(100L)
						.setListener(null);
			}
			obj = ((Fan) (obj)).getTabSector();
			if (obj != null) {
				((View) (obj)).animate().alpha(0.0F).setDuration(100L)
						.setListener(null);
				return;
			}
		}
	}

	static void h(FriendSector friendsector) {
		friendsector.u();
	}

	private void i() {
		int i1 = l[0];
		int j1 = o.getWidth() / 2;
		int k1 = l[1];
		int l1 = o.getHeight() / 2;
		float f1 = (float) j / (float) o.getWidth();
		o.animate().x(i1 - j1).y(k1 - l1).scaleX(f1).scaleY(f1)
				.setDuration(250L).setStartDelay(50L)
				.setListener(new AnimatorListenerAdapter() {

					final FriendSector a;

					public void onAnimationEnd(Animator animator) {
						FriendSector.c(a);
					}

					{
						a = FriendSector.this;
						// super();
					}
				});
	}

	static void i(FriendSector friendsector) {
		friendsector.w();
	}

	static Paint j(FriendSector friendsector) {
		return friendsector.h;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void j() {
		if (!oy.a()) {
			p.setScaleX(0.0F);
			p.setScaleY(0.0F);
			p.animate().scaleX(1.0F).scaleY(1.0F).setDuration(500L);
			return;
		}
		int i1 = vk.a(getContext(), 25F);
		int j1 = vk.a(getContext(), 8F);
		Object obj = p;
		float f1;
		if (e) {
			f1 = -i1;
		} else {
			f1 = getWidth();
		}
		((ImageView) (obj)).setX(f1);
		p.setY(getHeight());
		obj = p.animate();
		if (e) {
			f1 = j1;
		} else {
			f1 = getWidth() - j1 - i1;
		}
		((ViewPropertyAnimator) (obj)).x(f1).y(getHeight() - j1 - i1)
				.alpha(1.0F).setDuration(500L);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void k() {
		android.widget.FrameLayout.LayoutParams obj = (android.widget.FrameLayout.LayoutParams) p
				.getLayoutParams();
		float f1;
		byte byte0;
		if (e) {
			byte0 = 3;
		} else {
			byte0 = 5;
		}
		obj.gravity = byte0 | 0x50;
		p.setBackgroundDrawable(l());

		if (e) {
			f1 = 0.0F;
		} else {
			f1 = i;
		}
		(p).setPivotX(f1);
		p.setPivotY(i);
	}

	private Drawable l() {
		if (!oy.a()) {
			Object obj = getResources().getDrawable(R.drawable.close);
			mi mi = new mi(0, i, ox.a(R.attr.friendSectorRingColor), e,
					((Drawable) (obj)));
			mi.c = vk.a(getContext(), 7F);
			return ((Drawable) (obj));
		} else {
			int i1 = vk.a(getContext(), 25F);
			Bitmap bitmap = Bitmap.createBitmap(i1, i1,
					android.graphics.Bitmap.Config.ARGB_8888);
			Canvas canvas = new Canvas(bitmap);
			Object obj1 = new Paint(7);
			((Paint) (obj1)).setStyle(android.graphics.Paint.Style.STROKE);
			((Paint) (obj1)).setStrokeWidth(2.0F);
			((Paint) (obj1)).setColor(-1);
			int j1 = (i1 - 2) / 2;
			canvas.drawCircle(i1 / 2, i1 / 2, j1, ((Paint) (obj1)));
			obj1 = ta.a().d(SwipeApplication.e());
			j1 = (i1 - ((Bitmap) (obj1)).getWidth()) / 2;
			canvas.drawBitmap(((Bitmap) (obj1)), null, new Rect(j1, j1,
					i1 - j1, i1 - j1), null);
			return new BitmapDrawable(getResources(), bitmap);
		}
	}

	// private Drawable l() {
	// if (!oy.a()) {
	// Drawable drawable = this.getResources().getDrawable(
	// R.drawable.close);
	// mi mi = new mi(0, this.i, ox.a(R.attr.friendSectorRingColor),
	// this.e, drawable);
	// mi.c = vk.a(this.getContext(), 7.0f);
	// return mi;
	// }
	// int n = vk.a(this.getContext(), 25.0f);
	// Bitmap bitmap = Bitmap.createBitmap((int) n, (int) n,
	// (Bitmap.Config) Bitmap.Config.ARGB_8888);
	// Canvas canvas = new Canvas(bitmap);
	// Paint paint = new Paint(7);
	// paint.setStyle(Paint.Style.STROKE);
	// paint.setStrokeWidth(2.0f);
	// paint.setColor(-1);
	// int n2 = (n - 2) / 2;
	// canvas.drawCircle((float) (n / 2), (float) (n / 2), (float) n2, paint);
	// Bitmap bitmap2 = ta.a().d((Context) SwipeApplication.e());
	// int n3 = (n - bitmap2.getWidth()) / 2;
	// canvas.drawBitmap(bitmap2, null, new Rect(n3, n3, n - n3, n - n3), null);
	// return new BitmapDrawable(this.getResources(), bitmap);
	// }

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private void m() {
		Fan fan = Fan.getInstance();
		if (fan != null) {
			View view = fan.getTabSectorBg();
			if (view instanceof TabSectorBg) {
				int i1 = fan.getTabSectorOuterSize();
				float f1 = vk.a(getContext(), 276.7F);
				((TabSectorBg) view).a(f1 / (float) i1, 500);
				return;
			}
			if (view instanceof WatchTabSectorBg) {
				((WatchTabSectorBg) view).a(0.5F, 500);
				return;
			}
		}
	}

	private void n() {
		ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
				(int) ((double) o.getWidth() * 0.48999999999999999D),
				vk.a(getContext(), 35.5F) });
		valueanimator.setInterpolator(new lt());
		valueanimator.setDuration(250L);
		valueanimator
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final FriendSector a;

					public void onAnimationUpdate(ValueAnimator valueanimator1) {
						FriendSector.a(a, ((Integer) valueanimator1
								.getAnimatedValue()).intValue());
						a.invalidate();
					}

					{
						a = FriendSector.this;
						// super();
					}
				});
		valueanimator.start();
		postDelayed(new Runnable() {

			final FriendSector a;

			public void run() {
				FriendSector.d(a);
				FriendSector.e(a);
			}

			{
				a = FriendSector.this;
				// super();
			}
		}, 200L);
	}

	private void o() {
		this.o.bringToFront();
		int n = this.n.size();
		for (int i = 0; i < n; ++i) {
			final TextView textView = (TextView) this.n.get(i);
			FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView
					.getLayoutParams();
			AnimationSet animationSet = new AnimationSet(false);
			int n2 = this.l[0] - this.k / 2 - layoutParams.leftMargin;
			int n3 = this.l[1] - this.k / 2 - layoutParams.topMargin;
			TranslateAnimation translateAnimation = new TranslateAnimation(
					(float) n2, 0.0f, (float) n3, 0.0f);
			translateAnimation.setDuration(300);
			translateAnimation.setInterpolator((Interpolator) new lt());
			animationSet.addAnimation((Animation) translateAnimation);
			AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
			alphaAnimation.setDuration(200);
			animationSet.addAnimation((Animation) alphaAnimation);
			animationSet.setStartOffset((long) (i * 10));
			animationSet
					.setAnimationListener((Animation.AnimationListener) new sx() {

						public void onAnimationEnd(Animation animation) {
							ValueAnimator valueAnimator = ValueAnimator
									.ofInt((int[]) new int[] { 0, 255 });
							valueAnimator
									.setDuration(125)
									.addUpdateListener(
											(ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

												public void onAnimationUpdate(
														ValueAnimator valueAnimator) {
													int n = Color
															.argb((int) ((Integer) valueAnimator
																	.getAnimatedValue()),
																	(int) 255,
																	(int) 255,
																	(int) 255);
													textView.setTextColor(n);
												}
											});
							valueAnimator
									.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

										public void onAnimationEnd(
												Animator animator) {
											textView.requestLayout();
										}
									});
							valueAnimator.start();
						}

					});
			textView.startAnimation((Animation) animationSet);
		}
	}

	private void p() {
		TextView textview1;
		for (Iterator iterator = d.j().b().iterator(); iterator.hasNext(); n
				.add(textview1)) {
			textview1 = ((ng) iterator.next()).e();
			textview1.setOnClickListener(this);
		}

		int j1 = n.size();
		for (int i1 = 0; i1 < j1; i1++) {
			TextView textview = (TextView) n.get(i1);
			mg mg1 = a(i1, j1, f, e);
			android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(
					-2, -2);
			layoutparams.gravity = 51;
			layoutparams.leftMargin = (m[0] + mg1.a) - k / 2;
			layoutparams.topMargin = m[1] - mg1.b - k / 2;
			addView(textview, layoutparams);
			textview.setTextColor(0);
		}

	}

	private void q() {
		if (s) {
			return;
		} else {
			s = true;
			v();
			r();
			postDelayed(new Runnable() {

				final FriendSector a;

				public void run() {
					FriendSector.f(a);
					FriendSector.g(a);
					FriendSector.h(a);
					FriendSector.i(a);
				}

				{
					a = FriendSector.this;
					// super();
				}
			}, 100L);
			return;
		}
	}

	// private void r() {
	// int n = this.n.size();
	// for (int i = 0; i < n; ++i) {
	// final TextView textView = (TextView) this.n.get(i);
	// FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)
	// textView
	// .getLayoutParams();
	// AnimationSet animationSet = new AnimationSet(false);
	// int n2 = this.l[0] - this.k / 2 - layoutParams.leftMargin;
	// int n3 = this.l[1] - this.k / 2 - layoutParams.topMargin;
	// TranslateAnimation translateAnimation = new TranslateAnimation(
	// 0.0f, (float) n2, 0.0f, (float) n3);
	// translateAnimation.setDuration(145);
	// translateAnimation.setInterpolator((Interpolator) new lt());
	// animationSet.addAnimation((Animation) translateAnimation);
	// ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.6f,
	// 1.0f, 0.6f, 1, 0.5f, 1, 0.5f);
	// translateAnimation.setDuration(145);
	// animationSet.addAnimation((Animation) scaleAnimation);
	// AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
	// alphaAnimation.setDuration(145);
	// animationSet.addAnimation((Animation) alphaAnimation);
	// animationSet.setStartOffset((long) (i * 6));
	// animationSet
	// .setAnimationListener((Animation.AnimationListener) new sx() {
	//
	// public void onAnimationEnd(Animation animation) {
	// textView.setVisibility(8);
	// }
	// });
	// textView.startAnimation((Animation) animationSet);
	// }
	// }

	private void r() {
		int j1 = n.size();
		for (int i1 = 0; i1 < j1; i1++) {
			final TextView textview = (TextView) n.get(i1);
			Object obj = (android.widget.FrameLayout.LayoutParams) textview
					.getLayoutParams();
			AnimationSet animationset = new AnimationSet(false);
			int k1 = l[0];
			int l1 = k / 2;
			int i2 = ((android.widget.FrameLayout.LayoutParams) (obj)).leftMargin;
			int j2 = l[1];
			int k2 = k / 2;
			int l2 = ((android.widget.FrameLayout.LayoutParams) (obj)).topMargin;
			obj = new TranslateAnimation(0.0F, k1 - l1 - i2, 0.0F, j2 - k2 - l2);
			((TranslateAnimation) (obj)).setDuration(145L);
			((TranslateAnimation) (obj)).setInterpolator(new lt());
			animationset.addAnimation(((Animation) (obj)));
			ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.6F,
					1.0F, 0.6F, 1, 0.5F, 1, 0.5F);
			((TranslateAnimation) (obj)).setDuration(145L);
			animationset.addAnimation(scaleanimation);
			obj = new AlphaAnimation(1.0F, 0.0F);
			((AlphaAnimation) (obj)).setDuration(145L);
			animationset.addAnimation(((Animation) (obj)));
			animationset.setStartOffset(i1 * 6);
			animationset.setAnimationListener(new sx() {

				final TextView a;
				final FriendSector b;

				public void onAnimationEnd(Animation animation) {
					a.setVisibility(8);
				}

				{
					b = FriendSector.this;
					a = textview;
					// super();
				}
			});
			textview.startAnimation(animationset);
		}

	}

	private void s() {
		float f = ((FanItem) this.c.get()).getScaleX();
		this.o.animate().translationX((float) this.q)
				.translationY((float) this.r).alpha(0.75f).scaleX(f).scaleY(f)
				.setDuration(300).setStartDelay(50).setListener(null);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void t() {
		if (!oy.a()) {
			p.animate().scaleX(0.0F).scaleY(0.0F).setDuration(300L)
					.setListener(null);
			return;
		}
		ViewPropertyAnimator viewpropertyanimator = p.animate();
		float f1;
		if (e) {
			f1 = -p.getMeasuredWidth();
		} else {
			f1 = getWidth();
		}
		viewpropertyanimator.x(f1).y(getHeight()).alpha(0.0F).setDuration(300L)
				.setListener(null);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private void u() {
		Object obj = Fan.getInstance();
		if (obj != null) {
			obj = ((Fan) (obj)).getTabSectorBg();
			if (obj instanceof TabSectorBg) {
				((TabSectorBg) obj).a(300);
				return;
			}
			if (obj instanceof WatchTabSectorBg) {
				((WatchTabSectorBg) obj).a(300);
				return;
			}
		}
	}

	private void v() {
		ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] { g,
				(int) ((float) g * 2.0F) });
		valueanimator
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final FriendSector a;

					public void onAnimationUpdate(ValueAnimator valueanimator2) {
						FriendSector.a(a, ((Integer) valueanimator2
								.getAnimatedValue()).intValue());
						a.invalidate();
					}

					{
						a = FriendSector.this;
						// super();
					}
				});
		valueanimator.setInterpolator(new AccelerateInterpolator());
		ValueAnimator valueanimator1 = ValueAnimator
				.ofInt(new int[] { 255, 1 });
		valueanimator1
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final FriendSector a;

					public void onAnimationUpdate(ValueAnimator valueanimator2) {
						FriendSector.j(a).setAlpha(
								((Integer) valueanimator2.getAnimatedValue())
										.intValue());
					}

					{
						a = FriendSector.this;
						// super();
					}
				});
		AnimatorSet animatorset = new AnimatorSet();
		animatorset.setDuration(200L);
		animatorset.addListener(new AnimatorListenerAdapter() {

			final FriendSector a;

			public void onAnimationEnd(Animator animator) {
				FriendSector.a(a, 0);
			}

			{
				a = FriendSector.this;
				// super();
			}
		});
		animatorset
				.playTogether(new Animator[] { valueanimator1, valueanimator });
		animatorset.start();
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	// private void w() {
	// ViewGroup viewGroup;
	// View view;
	// Fan fan = Fan.getInstance();
	// if (fan == null) {
	// return;
	// }
	// lk lk = fan.getItemLayer();
	// if (lk != null) {
	// lk.c(300);
	// }
	// if ((view = fan.getItemSectorBg()) != null) {
	// view.animate().alpha(1.0f).setDuration(300).setListener(null);
	// }
	// if ((viewGroup = fan.getTabSector()) == null)
	// return;
	// viewGroup
	// .animate()
	// .alpha(1.0f)
	// .setDuration(300)
	// .setListener(
	// (Animator.AnimatorListener) new AnimatorListenerAdapter() {
	//
	// public void onAnimationEnd(Animator animator) {
	// FriendSector.this
	// .post((Runnable) new Runnable() {
	//
	// public void run() {
	// FriendSector.this.d();
	// }
	// });
	// }
	//
	// });
	// }
	private void w() {
		Object obj = Fan.getInstance();
		if (obj != null) {
			Object obj1 = ((Fan) (obj)).getItemLayer();
			if (obj1 != null) {
				((lk) (obj1)).c(300);
			}
			obj1 = ((Fan) (obj)).getItemSectorBg();
			if (obj1 != null) {
				((View) (obj1)).animate().alpha(1.0F).setDuration(300L)
						.setListener(null);
			}
			obj = ((Fan) (obj)).getTabSector();
			if (obj != null) {
				((View) (obj)).animate().alpha(1.0F).setDuration(300L)
						.setListener(new AnimatorListenerAdapter() {

							final FriendSector a;

							public void onAnimationEnd(Animator animator) {
								a.post(new Runnable() {

									public void run() {
										a.d();
									}

								});
							}

							{
								a = FriendSector.this;
								// super();
							}
						});
				return;
			}
		}
	}

	public void c() {
		for (Iterator iterator = n.iterator(); iterator.hasNext(); removeView((View) iterator
				.next())) {
		}
		n.clear();
		post(new Runnable() {

			final FriendSector a;

			public void run() {
				FriendSector.d(a);
				FriendSector.e(a);
			}

			{
				a = FriendSector.this;
				// super();
			}
		});
	}

	public void d() {
		Fan fan = Fan.getInstance();
		if (fan != null) {
			fan.removeView((View) this);
		}
	}

	 protected void dispatchDraw(Canvas canvas)
	    {
	        if (g > 0)
	        {
	            canvas.drawCircle(l[0], l[1], g, h);
	        }
	        super.dispatchDraw(canvas);
	    }

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		b = new WeakReference(this);
		post(new Runnable() {

			final FriendSector a;

			public void run() {
				FriendSector.a(a);
			}

			{
				a = FriendSector.this;
				// super();
			}
		});
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public void onClick(View view) {
	// ng ng = null;
	// if (view == this) {
	// q();
	// } else if (view.getTag() instanceof ng) {
	// ng = (ng) view.getTag();
	// if (ng.a().equals(ng.f.a())) {
	// ja.a().a("\u70B9\u51FB\u6DFB\u52A0\u8054\u7CFB\u65B9\u5F0F");
	// } else {
	// jc.a(getContext(), "C5", String.valueOf(((ng) (ng)).g));
	// ja.a().a("\u70B9\u51FB\u8054\u7CFB\u65B9\u5F0F", "connection",
	// ((ng) (ng)).g);
	// }
	// if (ng.a(d.j(), new WeakReference(this))) {
	// Fan.k();
	// return;
	// }
	// }
	// }
	public void onClick(View view) {
		if (view == this) {
			q();
		} else if (view.getTag() instanceof ng) {
			ng ng = (ng) view.getTag();
			if (ng.a().equals(ng.f.a())) {
				ja.a().a("\u70B9\u51FB\u6DFB\u52A0\u8054\u7CFB\u65B9\u5F0F");
			} else {
				jc.a(getContext(), "C5", String.valueOf(((ng) (ng)).g));
				ja.a().a("\u70B9\u51FB\u8054\u7CFB\u65B9\u5F0F", "connection",
						((ng) (ng)).g);
			}
			if (ng.a(d.j(), new WeakReference(this))) {
				Fan.k();
				return;
			}
		}
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (b != null) {
			b.clear();
			b = null;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// protected void onFinishInflate() {
	// super.onFinishInflate();
	// this.o = (ImageView) this.findViewById(R.id.friends_avatar);
	// this.p = (ImageView) this.findViewById(R.id.friends_close_btn);
	// this.setOnClickListener((View.OnClickListener) this);
	// Fan fan = Fan.getInstance();
	// this.e = fan.i();
	// this.f = vk.a(this.getContext(), 213.3f);
	// int n = vk.a(this.getContext(), 90.0f);
	// int[] arrn = this.l;
	// int n2 = this.e ? n : fan.getWidth() - n;
	// arrn[0] = n2;
	// this.l[1] = fan.getHeight() - n;
	// int n3 = vk.a(this.getContext(), 16.7f);
	// int[] arrn2 = this.m;
	// int n4 = this.e ? n3 : fan.getWidth() - n3;
	// arrn2[0] = n4;
	// this.m[1] = fan.getHeight() - n3;
	// this.h = new Paint();
	// this.h.setFlags(7);
	// this.h.setColor(ox.a(R.attr.friendSectorRingColor));
	// this.h.setStyle(Paint.Style.STROKE);
	// this.h.setStrokeWidth(3.0f);
	// this.k = vk.a((Context) SwipeApplication.e(), 40.0f);
	// this.i = Fan.getInstance().getTabSectorInnerSize()
	// - vk.a(this.getContext(), 3.3f);
	// this.j = vk.a((Context) SwipeApplication.e(), 50.0f);
	// }
	protected void onFinishInflate() {
		super.onFinishInflate();
		o = (ImageView) findViewById(R.id.friends_avatar);
		p = (ImageView) findViewById(R.id.friends_close_btn);
		setOnClickListener(this);
		Fan fan = Fan.getInstance();
		e = fan.i();
		f = vk.a(getContext(), 213.3F);
		int j1 = vk.a(getContext(), 90F);
		int ai[] = l;
		int i1;
		if (e) {
			i1 = j1;
		} else {
			i1 = fan.getWidth() - j1;
		}
		ai[0] = i1;
		l[1] = fan.getHeight() - j1;
		j1 = vk.a(getContext(), 16.7F);
		ai = m;
		if (e) {
			i1 = j1;
		} else {
			i1 = fan.getWidth() - j1;
		}
		ai[0] = i1;
		m[1] = fan.getHeight() - j1;
		h = new Paint();
		h.setFlags(7);
		h.setColor(ox.a(0x7f010024));
		h.setStyle(android.graphics.Paint.Style.STROKE);
		h.setStrokeWidth(3F);
		k = vk.a(SwipeApplication.e(), 40F);
		i = Fan.getInstance().getTabSectorInnerSize()
				- vk.a(getContext(), 3.3F);
		j = vk.a(SwipeApplication.e(), 50F);
	}

	protected void onMeasure(int n, int n2) {
		super.onMeasure(n, n2);
		this.p.measure(this.i, this.i);
	}

}
