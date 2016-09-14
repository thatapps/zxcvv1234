package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.AbsListView;
import android.widget.ListView;

public class xe implements View.OnTouchListener {
	private int a;
	private int b;
	private int c;
	private long d;
	private ListView e;
	private xf f;
	private int g = 1;
	private List<xg> h = new ArrayList();
	private int i = 0;
	private float j;
	private float k;
	private boolean l;
	private VelocityTracker m;
	private int n;
	private View o;
	private boolean p;
	private int q = 0;
	private boolean r;
	private int s;

	public xe(ListView listView, xf xf) {
		ViewConfiguration viewConfiguration = ViewConfiguration
				.get((Context) listView.getContext());
		this.a = viewConfiguration.getScaledTouchSlop();
		this.b = 16 * viewConfiguration.getScaledMinimumFlingVelocity();
		this.c = viewConfiguration.getScaledMaximumFlingVelocity();
		this.d = listView.getContext().getResources().getInteger(17694720);
		this.e = listView;
		this.f = xf;
		this.s = ViewConfiguration.get((Context) listView.getContext())
				.getScaledTouchSlop();
	}

	static/* synthetic */int a(xe xe) {
		int n;
		xe.i = n = -1 + xe.i;
		return n;
	}

	
	 static void a(xe xe1, View view, int i1)
	    {
	        xe1.a(view, i1);
	    }

	    static int b(xe xe1)
	    {
	        return xe1.i;
	    }

	    static List c(xe xe1)
	    {
	        return xe1.h;
	    }

	    static ListView d(xe xe1)
	    {
	        return xe1.e;
	    }

	    static xf e(xe xe1)
	    {
	        return xe1.f;
	    }
	
	
	private void a(final View view, int n) {
		final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
		final int n2 = view.getHeight();
		ValueAnimator valueAnimator = ValueAnimator.ofInt(
				(int[]) new int[] { n2, 1 }).setDuration(this.d);
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						xe.a(xe.this);
						if (xe.this.i == 0) {
							Collections.sort((List) xe.this.h);
							int[] arrn = new int[xe.this.h.size()];
							for (int i = -1 + xe.c((xe) xe.this).size(); i >= 0; --i) {
								arrn[i] = ((xg) xe.c((xe) xe.this).get((int) i)).a;
							}
							xe.this.f.a(xe.this.e, arrn);
							for (xg xg : xe.this.h) {
								xg.b.setAlpha(1.0f);
								xg.b.setTranslationX(0.0f);
								ViewGroup.LayoutParams layoutParams = xg.b
										.getLayoutParams();
								layoutParams.height = n2;
								xg.b.setLayoutParams(layoutParams);
							}
							xe.this.h.clear();
						}
					}
				});
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						layoutParams.height = (Integer) valueAnimator
								.getAnimatedValue();
						view.setLayoutParams(layoutParams);
					}
				});
		this.h.add((xg) new xg(this, n, view));
		valueAnimator.start();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(final View view, final int n, boolean bl) {
		this.i = 1 + this.i;
		if (view == null) {
			this.f.a(this.e, new int[] { n });
			return;
		}
		ViewPropertyAnimator viewPropertyAnimator = view.animate();
		float f = bl ? (float) this.g : (float) (-this.g);
		viewPropertyAnimator
				.translationX(f)
				.alpha(0.0f)
				.setDuration(this.d)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								xe.this.a(view, n);
							}
						});
	}

	public AbsListView.OnScrollListener a() {
		return new AbsListView.OnScrollListener() {

			public void onScroll(AbsListView absListView, int n, int n2, int n3) {
			}

			/*
			 * Enabled aggressive block sorting
			 */
			public void onScrollStateChanged(AbsListView absListView, int n) {
				int n2 = 1;
				xe xe = xe.this;
				if (n == n2) {
					n2 = 0;
				}
				xe.a(xe);
			}
		};
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(boolean bl) {
		boolean bl2 = !bl;
		this.p = bl2;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	public boolean onTouch(View var1_1, MotionEvent var2_2) {
		boolean var3_3 = true;
		int var4_4 = 0;
		boolean var17_15 = (Boolean) null;
		if (this.g < 2) {
			this.g = this.e.getWidth();
		}
		switch (var2_2.getActionMasked()) {
		default: {
			return false;
		}
		case 0: {
			this.j = var2_2.getX();
			this.k = var2_2.getY();
			this.q = 0;
			this.r = false;
			if (this.p != false)
				return false;
			Rect var23_5 = new Rect();
			int var24_6 = this.e.getChildCount();
			int[] var25_7 = new int[2];
			this.e.getLocationOnScreen(var25_7);
			int var26_8 = (int) var2_2.getRawX() - var25_7[0];
			int var27_9 = (int) var2_2.getRawY() - var25_7[var4_4];
			do {
				if (var4_4 < var24_6) {
					View var29_10 = this.e.getChildAt(var4_4);
					var29_10.getHitRect(var23_5);
					if (var23_5.contains(var26_8, var27_9)) {
						this.o = var29_10;
					}
				} else {
					if (this.o != null) {
						this.n = this.e.getPositionForView(this.o);
						if (this.f.a(this.n)) {
							this.m = VelocityTracker.obtain();
							this.m.addMovement(var2_2);
						} else {
							this.o = null;
						}
					}
					var1_1.onTouchEvent(var2_2);
					return var3_3;
				}
				++var4_4;
			} while (true);
		}
		case 1: {
			this.q = 0;
			if (!(this.o != null || this.r || this.f == null)) {
				if (this.f.a(this.e) != false)
					return false;
			}
			if (this.m == null)
				return false;
			float var13_11 = var2_2.getRawX() - this.j;
			this.m.addMovement(var2_2);
			this.m.computeCurrentVelocity(1000);
			float var14_12 = this.m.getXVelocity();
			float var15_13 = Math.abs((float) var14_12);
			float var16_14 = Math.abs((float) this.m.getYVelocity());
			if (Math.abs((float) var13_11) > (float) (this.g / 2)) {
				var17_15 = var13_11 > 0.0f ? var3_3 : false;
			} else {
				if ((float) this.b > var15_13 || var15_13 > (float) this.c
						|| var16_14 >= var15_13)
					break;
				boolean var19_16 = var14_12 < 0.0f ? var3_3 : false;
				boolean var20_17 = var13_11 < 0.0f ? var3_3 : false;
				boolean var21_18 = var19_16 == var20_17 ? var3_3 : false;
				if (this.m.getXVelocity() <= 0.0f) {
					var3_3 = false;
				}
				boolean var22_19 = var3_3;
				var3_3 = var21_18;
				var17_15 = var22_19;
			}
			if (var3_3) {
				this.a(this.o, this.n, var17_15);
			} else if (this.o != null) {
				this.o.animate().translationX(0.0f).alpha(1.0f)
						.setDuration(this.d).setListener(null);
			}
			this.m.recycle();
			this.m = null;
			this.j = 0.0f;
			this.o = null;
			this.n = -1;
			this.l = false;
			return false;
		}
		case 3: {
			this.q = 0;
			if (this.m == null)
				return false;
			if (this.o != null) {
				this.o.animate().translationX(0.0f).alpha(1.0f)
						.setDuration(this.d).setListener(null);
			}
			this.m.recycle();
			this.m = null;
			this.j = 0.0f;
			this.o = null;
			this.n = -1;
			this.l = false;
			return false;
		}
		case 2: {
			if (this.q == 0) {
				float var8_20 = Math.abs((float) (var2_2.getX() - this.j));
				float var9_21 = Math.abs((float) (var2_2.getY() - this.k));
				boolean var10_22 = var8_20 > (float) this.s ? var3_3 : false;
				boolean var11_23 = var9_21 > (float) this.s ? var3_3 : false;
				if (var10_22 || var11_23) {
					if (var8_20 > var9_21) {
						this.q = Integer.valueOf(String.valueOf(var3_3));
					} else {
						if (!var10_22) {
							this.q = var2_2.getY() - this.k > 0.0f ? 3 : 2;
						}
						if (this.q == 0 && var10_22) {
							this.q = Integer.valueOf(String.valueOf(var3_3));
						}
					}
				}
				if (this.q != 0) {
					this.r = var3_3;
				}
			}
			if (this.m == null)
				return false;
			if (this.p != false)
				return false;
			this.m.addMovement(var2_2);
			float var5_24 = var2_2.getRawX() - this.j;
			if (Math.abs((float) var5_24) > (float) this.a) {
				this.l = var3_3;
				this.e.requestDisallowInterceptTouchEvent(var3_3);
				MotionEvent var6_25 = MotionEvent.obtain((MotionEvent) var2_2);
				var6_25.setAction(3 | var2_2.getActionIndex() << 8);
				this.e.onTouchEvent(var6_25);
				var6_25.recycle();
			}
			if (this.l == false)
				return false;
			this.o.setTranslationX(var5_24);
			this.o.setAlpha(Math.max(
					(float) 0.15f,
					(float) Math.min((float) 1.0f,
							(float) (1.0f - 2.0f * Math.abs((float) var5_24)
									/ (float) this.g))));
			return var3_3;
		}
		}
		var17_15 = false;
		var3_3 = false;
		//lbl106: // 3 sources:
//		if (var3_3) {
//			this.a(this.o, this.n, var17_15);
//		} else if (this.o != null) {
//			this.o.animate().translationX(0.0f).alpha(1.0f).setDuration(this.d)
//					.setListener(null);
//		}
		this.m.recycle();
		this.m = null;
		this.j = 0.0f;
		this.o = null;
		this.n = -1;
		this.l = false;
		return false;
	}
}
