/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 */
package com.lazyswipe.fan;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

import com.lazyswipe.ui.RateView;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.is;
import com.main.it;
import com.main.lk;
import com.main.ll;
import com.main.mf;
import com.main.mh;
import com.main.nc;
import com.main.tn;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class SectorArea extends ll implements Animator.AnimatorListener,
		Runnable {
	private static final String s = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.fan.SectorArea.class.getSimpleName())
			.toString();
	private static final Interpolator t = new DecelerateInterpolator();
	private boolean A;
	private boolean B;
	public ItemSector f;
	final GestureDetector g;
	double h;
	double i;
	double j;
	float k;
	float l;
	public boolean m;
	boolean n;
	int o;
	public boolean p;
	public boolean q;
	public boolean r;
	private TabSector u;
	private TabSectorBg v;
	private ItemSectorBg w;
	private final int x;
	private boolean y;
	private boolean z;

	public SectorArea(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		x = ViewConfiguration.get(context).getScaledTouchSlop();
		g = new GestureDetector(context, new mh(this), new Handler());
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public static View a(ViewGroup viewGroup, MotionEvent motionEvent) {
	// int n = (int) motionEvent.getX();
	// int n2 = (int) motionEvent.getY();
	// Rect rect = new Rect();
	// int n3 = viewGroup.getChildCount();
	// for (int i = 0; i < n3; ++i) {
	// View view = viewGroup.getChildAt(i);
	// if (view.getVisibility() != 0)
	// continue;
	// view.getHitRect(rect);
	// if (!rect.contains(n, n2))
	// continue;
	// return view;
	// }
	// return null;
	// }
	public static View a(ViewGroup var0, MotionEvent var1) {
		int var3 = (int) var1.getX();
		int var4 = (int) var1.getY();
		Rect var7 = new Rect();
		int var5 = var0.getChildCount();

		for (int var2 = 0; var2 < var5; ++var2) {
			View var6 = var0.getChildAt(var2);
			if (var6.getVisibility() == 0) {
				var6.getHitRect(var7);
				if (var7.contains(var3, var4)) {
					return var6;
				}
			}
		}

		return null;
	}

	// public static View a(ViewGroup var0, MotionEvent var1) {
	// int var3 = (int) var1.getX();
	// int var4 = (int) var1.getY();
	// Rect var7 = new Rect();
	// int var5 = var0.getChildCount();
	//
	// for (int var2 = 0; var2 < var5; ++var2) {
	// View var6 = var0.getChildAt(var2);
	// if (var6.getVisibility() == 0) {
	// var6.getHitRect(var7);
	// if (var7.contains(var3, var4)) {
	// return var6;
	// }
	// }
	// }
	//
	// return null;
	// }
	// public static View a(ViewGroup viewgroup, MotionEvent motionevent) {
	// int i1;
	// int j1;
	// int k1;
	// int l1;
	// j1 = (int) motionevent.getX();
	// k1 = (int) motionevent.getY();
	// Rect rect = new Rect();
	// l1 = viewgroup.getChildCount();
	// i1 = 0;
	// // _L2:
	// View view;
	// while (l1>i1) {
	// view = viewgroup.getChildAt(i1);
	// if (view.getVisibility() != 0) {
	//
	//
	//
	// i1++;
	// // if (true) goto _L2; else goto _L1
	// view.getHitRect(rect);
	// if (!rect.contains(j1, k1)) {
	// //i1++;
	// } else {
	// return view;
	// }
	// }
	// }
	//
	//
	// return null;
	// }

	static TabSector a(SectorArea sectorarea) {
		return sectorarea.u;
	}

	public static boolean a(SectorArea sectorarea, boolean flag) {
		sectorarea.y = flag;
		return flag;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private float getCurrentLayerEndAngle() {
		byte byte0;
		int i1;
		if (n) {
			byte0 = -90;
		} else {
			byte0 = 90;
		}
		if (c) {
			i1 = 1;
		} else {
			i1 = -1;
		}
		return (float) (byte0 * i1);
	}

	private float getCurrentLayerStartAngle() {
		return 0.0f;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private float getTabIndicatorEndAngle() {
		int j1 = d.f;
		int k1 = o;
		int i1;
		if (c) {
			i1 = -90;
		} else {
			i1 = 90;
		}
		i1 = (i1 / d.f) * (j1 - 1 - k1);
		if (A) {
			if (c) {
				if (o == 0) {
					i1 += 360;
				} else {
					i1 = -360;
				}
			} else if (o == 0) {
				i1 -= 360;
			} else {
				i1 = 360;
			}
			return (float) i1;
		} else {
			return (float) i1;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private float getTabIndicatorStartAngle() {
		int i1 = d.f;
		int j1 = a;
		byte byte0;
		if (c) {
			byte0 = -90;
		} else {
			byte0 = 90;
		}
		return (float) ((byte0 / d.f) * (i1 - 1 - j1));
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private float getTargetLayerEndAngle() {
		int i1 = 360;
		boolean flag = false;
		if (c) {
			if (n) {
				i1 = ((flag) ? 1 : 0);
			} else {
				i1 = 360;
			}
			return (float) i1;
		}
		if (!n) {
			i1 = 0;
		}
		return (float) i1;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private float getTargetLayerStartAngle() {
		int i1 = 270;
		byte byte0 = 90;
		if (c) {
			if (n) {
				i1 = byte0;
			} else {
				i1 = 270;
			}
			return (float) i1;
		}
		if (!n) {
			i1 = 90;
		}
		return (float) i1;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void h() {
		boolean flag;
		if (!p) {
			flag = true;
		} else {
			flag = false;
		}
		p = flag;
		if (p) {
			RateView.d();
			f.getCurrentFanLayer().setLayerType(tn.b, null);
			f.getNextFanLayer().setLayerType(tn.b, null);
			return;
		}
		if (z) {
			a = o;
			f.c();
			u.setTab(o);
			d.setBrightnessPanelVisibility(o);
			d.h();
		}
		is.a = false;
	}

	private boolean i() {
		return Math.abs(h) % 90D >= 10D || y;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void j() {
		int i1;
		if (n) {
			i1 = a + 1;
		} else {
			i1 = a - 1;
		}
		o = i1;
		if (o < 0) {
			o = d.f - 1;
			A = true;
			return;
		}
		if (o >= d.f) {
			o = 0;
			A = true;
			return;
		} else {
			A = false;
			return;
		}
	}

	public void a() {
		this.f.a();
		this.u.b();
	}

	public void a(int n) {
		super.a(n);
		this.u.a();
	}

	public void a(int n, int n2) {
		this.a(n, n2, false, true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int i1, int j1, boolean flag, boolean flag1) {
		FanLayer fanlayer;
		FanLayer fanlayer1;
		d.h();
		int k1 = (d.f + j1) % d.f;
		nc nc1 = d.d[k1];
		if (flag1) {

			if (j1 - i1 > 0) {
				flag1 = true;
			} else {
				flag1 = false;
			}
			n = flag1;
		}
		o = k1;
		i = getTargetLayerStartAngle();
		h = getCurrentLayerStartAngle();
		fanlayer = f.getCurrentFanLayer();
		fanlayer1 = f.getNextFanLayer();
		if (fanlayer1.getVisibility() != 0) {
			fanlayer1.setVisibility(0);
		}
		if (!nc1.equals(fanlayer1.getTab())) {
			j1 = f.getHeight();
			if (c) {
				i1 = 0;
			} else {
				i1 = f.getWidth();
			}
			fanlayer.setPivotX(i1);
			fanlayer1.setPivotX(i1);
			fanlayer.setPivotY(j1);
			fanlayer1.setPivotY(j1);
			fanlayer1.a(nc1, d.a(nc1), d.getStartPosition(), false, true);
		}
		fanlayer.setRotation((float) h);
		fanlayer1.setRotation((float) i);
		a(true, flag);
	}

	public void a(int i1, boolean flag, boolean flag1) {
		super.a(i1, flag, flag1);
		nc nc1 = getCurrentTab();
		f.a(nc1, d.a(nc1), true, nc1.g(), flag);
	}

	public void a(MotionEvent motionevent) {
		FanLayer fanlayer = f.getCurrentFanLayer();
		View view = a(((ViewGroup) (fanlayer)), motionevent);
		if (motionevent != null) {
			fanlayer.onLongClick(view);
		}
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	// public boolean a(float var1, float var2, float var3, float var4,
	// float var5, float var6) {
	// if (!this.p && this.q) {
	// float var9 = (float) this.getMeasuredHeight() - 0.1F;
	// float var10 = var2;
	// if (var2 > var9) {
	// var10 = var9;
	// }
	//
	// var2 = var4;
	// if (var4 > var9) {
	// var2 = var9;
	// }
	//
	// boolean var13;
	// if (this.c) {
	// if (var5 < 0.0F && var6 < 0.0F) {
	// var13 = false;
	// } else {
	// if (var5 <= 0.0F || var6 <= 0.0F) {
	// if (!this.m && var5 > (float) this.x
	// && var6 < (float) (-this.x)) {
	// this.d.a(true);
	// return true;
	// }
	//
	// return true;
	// }
	//
	// var13 = true;
	// }
	// } else if (var5 > 0.0F && var6 < 0.0F) {
	// var13 = false;
	// } else {
	// if (var5 >= 0.0F || var6 <= 0.0F) {
	// if (!this.m && var5 < (float) (-this.x)
	// && var6 < (float) (-this.x)) {
	// this.d.a(true);
	// return true;
	// }
	//
	// return true;
	// }
	//
	// var13 = true;
	// }
	//
	// if (this.d.f <= 1) {
	// return true;
	// } else {
	// int var12 = this.f.getHeight();
	// int var11;
	// if (this.c) {
	// var11 = 0;
	// } else {
	// var11 = this.f.getWidth();
	// }
	//
	// FanLayer var15 = this.f.getCurrentFanLayer();
	// FanLayer var16 = this.f.getNextFanLayer();
	// var15.setVisibility(0);
	// var16.setVisibility(0);
	// boolean var14 = var13;
	// if (this.B) {
	// // label155: {
	// if (!this.c || (!this.n || this.h < 0.0D)
	// && (this.n || this.h > 0.0D)) {
	// var14 = var13;
	// if (this.c) {
	// // break label155;
	// }
	//
	// if (!this.n || this.h > 0.0D) {
	// var14 = var13;
	// if (this.n) {
	// // break label155;
	// }
	//
	// var14 = var13;
	// if (this.h < 0.0D) {
	// // break label155;
	// }
	// }
	// }
	//
	// this.m = false;
	// is.a = false;
	// if (!this.n) {
	// var14 = true;
	// } else {
	// var14 = false;
	// }
	//
	// }
	//
	// double var7;
	// if (!this.m) {
	// this.B = false;
	// this.m = true;
	// is.a = true;
	// this.n = var14;
	// this.h = (double) this.getCurrentLayerStartAngle();
	// this.i = (double) this.getTargetLayerStartAngle();
	// this.j();
	// this.j = (double) this.getTabIndicatorStartAngle();
	// var16.setVisibility(0);
	// nc var17 = this.d.d[this.o];
	// if (!var17.equals(var16.getTab())) {
	// var16.a(var17, this.d.a((nc) var17),
	// this.d.getStartPosition(), false, true);
	// }
	//
	// if (this.getCurrentTab().i() <= 4 && var17.i() > 4) {
	// this.f.a(true, 0);
	// }
	//
	// var15.setPivotX((float) var11);
	// var16.setPivotX((float) var11);
	// var15.setPivotY((float) var12);
	// var16.setPivotY((float) var12);
	// var7 = vk.a((double) var12, (double) var11, (double) var10,
	// (double) var1);
	// } else {
	// var7 = vk.a((double) var12, (double) var11,
	// (double) this.l, (double) this.k);
	// if (var14 != this.n) {
	// if (!this.B) {
	// var13 = true;
	// } else {
	// var13 = false;
	// }
	//
	// this.B = var13;
	// }
	// }
	//
	// var7 = vk.a((double) var12, (double) var11, (double) var2,
	// (double) var3) - var7;
	// this.h += var7;
	// this.k = var3;
	// this.l = var2;
	// var15.setRotation((float) this.h);
	// this.i += var7;
	// var16.setRotation((float) this.i);
	// this.j -= var7 / (double) this.d.f;
	// this.u.setIndicatorDegree((float) this.j);
	// return true;
	// }
	// } else {
	// return true;
	// }
	// }
	public boolean a(float var1, float var2, float var3, float var4,
			float var5, float var6) {
		if (!this.p && this.q) {
			float var9 = (float) this.getMeasuredHeight() - 0.1F;
			float var10 = var2;
			if (var2 > var9) {
				var10 = var9;
			}

			var2 = var4;
			if (var4 > var9) {
				var2 = var9;
			}

			boolean var13;
			if (this.c) {
				if (var5 < 0.0F && var6 < 0.0F) {
					var13 = false;
				} else {
					if (var5 <= 0.0F || var6 <= 0.0F) {
						if (!this.m && var5 > (float) this.x
								&& var6 < (float) (-this.x)) {
							this.d.a(true);
							return true;
						}

						return true;
					}

					var13 = true;
				}
			} else if (var5 > 0.0F && var6 < 0.0F) {
				var13 = false;
			} else {
				if (var5 >= 0.0F || var6 <= 0.0F) {
					if (!this.m && var5 < (float) (-this.x)
							&& var6 < (float) (-this.x)) {
						this.d.a(true);
						return true;
					}

					return true;
				}

				var13 = true;
			}

			if (this.d.f <= 1) {
				return true;
			} else {
				int var12 = this.f.getHeight();
				int var11;
				if (this.c) {
					var11 = 0;
				} else {
					var11 = this.f.getWidth();
				}

				FanLayer var15 = this.f.getCurrentFanLayer();
				FanLayer var16 = this.f.getNextFanLayer();
				var15.setVisibility(0);
				var16.setVisibility(0);
				boolean var14 = var13;
				if (this.B) {

					if (!this.c || (!this.n || this.h < 0.0D)
							&& (this.n || this.h > 0.0D)) {
						var14 = var13;
						if (!this.c) {

							if (!this.n || this.h > 0.0D) {
								var14 = var13;
								if (!this.n) {
									var14 = var13;
								}

								if (this.h < 0.0D) {
									// break label155;
								}
							}
						}
					}

					this.m = false;
					is.a = false;
					if (!this.n) {
						var14 = true;
					} else {
						var14 = false;
					}

				}

				double var7;
				if (!this.m) {
					this.B = false;
					this.m = true;
					is.a = true;
					this.n = var14;
					this.h = (double) this.getCurrentLayerStartAngle();
					this.i = (double) this.getTargetLayerStartAngle();
					this.j();
					this.j = (double) this.getTabIndicatorStartAngle();
					var16.setVisibility(0);
					nc var17 = this.d.d[this.o];
					if (!var17.equals(var16.getTab())) {
						var16.a(var17, this.d.a((nc) var17),
								this.d.getStartPosition(), false, true);
					}

					if (this.getCurrentTab().i() <= 4 && var17.i() > 4) {
						this.f.a(true, 0);
					}

					var15.setPivotX((float) var11);
					var16.setPivotX((float) var11);
					var15.setPivotY((float) var12);
					var16.setPivotY((float) var12);
					var7 = vk.a((double) var12, (double) var11, (double) var10,
							(double) var1);
				} else {
					var7 = vk.a((double) var12, (double) var11,
							(double) this.l, (double) this.k);
					if (var14 != this.n) {
						if (!this.B) {
							var13 = true;
						} else {
							var13 = false;
						}

						this.B = var13;
					}
				}

				var7 = vk.a((double) var12, (double) var11, (double) var2,
						(double) var3) - var7;
				this.h += var7;
				this.k = var3;
				this.l = var2;
				var15.setRotation((float) this.h);
				this.i += var7;
				var16.setRotation((float) this.i);
				this.j -= var7 / (double) this.d.f;
				this.u.setIndicatorDegree((float) this.j);
				return true;
			}
		} else {
			return true;
		}
	}

	boolean a(boolean bl) {
		return this.a(bl, false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// boolean a(boolean bl, boolean bl2) {
	// this.q = false;
	// if (this.p || !this.m && !bl)
	// return false;
	// {
	// Fan.b = true;
	// this.m = false;
	// this.p = false;
	// this.f.getNextFanLayer().h();
	// this.f.getCurrentFanLayer().h();
	// int n = this.getCurrentTab().i();
	// int n2 = this.d.d[this.o].i();
	// boolean bl3 = Math.max((int) n, (int) n2) > 4
	// && Math.min((int) n, (int) n2) <= 4;
	// if (bl || this.o != this.a && this.i()) {
	// this.z = true;
	// this.d.d[this.o].a(this.getContext(), this.d);
	// if (bl) {
	// // empty if block
	// }
	// if (!bl || bl2) {
	// float[] arrf = new float[] { this.u.getIndicatorDegree(),
	// this.getTabIndicatorEndAngle() };
	// ValueAnimator valueAnimator = ValueAnimator
	// .ofFloat((float[]) arrf);
	// valueAnimator.setDuration((long) 240);
	// valueAnimator.setInterpolator((TimeInterpolator) t);
	// valueAnimator
	// .addUpdateListener((ValueAnimator.AnimatorUpdateListener) new
	// ValueAnimator.AnimatorUpdateListener() {
	//
	// public void onAnimationUpdate(
	// ValueAnimator valueAnimator) {
	// SectorArea.this.u
	// .setIndicatorDegree(((Float) valueAnimator
	// .getAnimatedValue())
	// .floatValue());
	// }
	// });
	// valueAnimator.start();
	// }
	// this.f.getCurrentFanLayer().animate()
	// .rotation(this.getCurrentLayerEndAngle())
	// .setDuration((long) 240).setListener(null)
	// .setInterpolator((TimeInterpolator) t);
	// this.f.getNextFanLayer().animate()
	// .rotation(this.getTargetLayerEndAngle())
	// .setDuration((long) 240)
	// .setInterpolator((TimeInterpolator) t)
	// .setListener((Animator.AnimatorListener) this);
	// if (!bl3)
	// return true;
	// {
	// this.f.a(false, n2);
	// return true;
	// }
	// } else {
	// this.z = false;
	// float[] arrf = new float[] { this.u.getIndicatorDegree(),
	// this.getTabIndicatorStartAngle() };
	// ValueAnimator valueAnimator = ValueAnimator
	// .ofFloat((float[]) arrf);
	// valueAnimator.setDuration((long) 240);
	// valueAnimator.setInterpolator((TimeInterpolator) t);
	// valueAnimator
	// .addUpdateListener((ValueAnimator.AnimatorUpdateListener) new
	// ValueAnimator.AnimatorUpdateListener() {
	//
	// public void onAnimationUpdate(
	// ValueAnimator valueAnimator) {
	// SectorArea.this.u
	// .setIndicatorDegree(((Float) valueAnimator
	// .getAnimatedValue())
	// .floatValue());
	// }
	// });
	// valueAnimator.start();
	// this.f.getCurrentFanLayer().animate()
	// .rotation(this.getCurrentLayerStartAngle())
	// .setDuration((long) 240).setListener(null)
	// .setInterpolator((TimeInterpolator) t);
	// this.f.getNextFanLayer().animate()
	// .rotation(this.getTargetLayerStartAngle())
	// .setDuration((long) 240)
	// .setInterpolator((TimeInterpolator) t)
	// .setListener((Animator.AnimatorListener) this);
	// if (!bl3)
	// return true;
	// {
	// this.f.a(false, n);
	// return true;
	// }
	// }
	// }
	// }
	boolean a(boolean var1, boolean var2) {
		this.q = false;
		if (!this.p && (this.m || var1)) {
			Fan var6 = this.d;
			Fan.b = true;
			this.m = false;
			this.p = false;
			this.f.getNextFanLayer().h();
			this.f.getCurrentFanLayer().h();
			int var4 = this.getCurrentTab().i();
			int var5 = this.d.d[this.o].i();
			boolean var3;
			if (Math.max(var4, var5) > 4 && Math.min(var4, var5) <= 4) {
				var3 = true;
			} else {
				var3 = false;
			}

			ValueAnimator var7;
			if (!var1 && (this.o == this.a || !this.i())) {
				this.z = false;
				var7 = ValueAnimator.ofFloat(new float[] {
						this.u.getIndicatorDegree(),
						this.getTabIndicatorStartAngle() });
				var7.setDuration((long) 240);
				var7.setInterpolator(t);
				var7.addUpdateListener(new AnimatorUpdateListener() {
					public void onAnimationUpdate(ValueAnimator var1) {
						SectorArea.this.u.setIndicatorDegree(((Float) var1
								.getAnimatedValue()).floatValue());
					}
				});
				var7.start();
				this.f.getCurrentFanLayer().animate()
						.rotation(this.getCurrentLayerStartAngle())
						.setDuration((long) 240)
						.setListener((AnimatorListener) null)
						.setInterpolator(t);
				this.f.getNextFanLayer().animate()
						.rotation(this.getTargetLayerStartAngle())
						.setDuration((long) 240).setListener(this)
						.setInterpolator(t);
				if (var3) {
					this.f.a(false, var4);
					return true;
				}
			} else {
				this.z = true;
				this.d.d[this.o].a(this.getContext(), this.d);
				if (var1) {
					;
				}

				if (!var1 || var2) {
					var7 = ValueAnimator.ofFloat(new float[] {
							this.u.getIndicatorDegree(),
							this.getTabIndicatorEndAngle() });
					var7.setDuration((long) 240);
					var7.setInterpolator(t);
					var7.addUpdateListener(new AnimatorUpdateListener() {
						public void onAnimationUpdate(ValueAnimator var1) {
							SectorArea.this.u.setIndicatorDegree(((Float) var1
									.getAnimatedValue()).floatValue());
						}
					});
					var7.start();
				}

				this.f.getCurrentFanLayer().animate()
						.rotation(this.getCurrentLayerEndAngle())
						.setDuration((long) 240)
						.setListener((AnimatorListener) null)
						.setInterpolator(t);
				this.f.getNextFanLayer().animate()
						.rotation(this.getTargetLayerEndAngle())
						.setDuration((long) 240).setListener(this)
						.setInterpolator(t);
				if (var3) {
					this.f.a(false, var5);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void b() {
		this.f.b();
		this.u.c();
	}

	public boolean c() {
		if (this.f.getCurrentFanLayer().e()) {
			this.f.getCurrentFanLayer().a(true, true, true);
			return true;
		}
		return false;
	}

	public void d() {
		super.d();
		this.f.d();
		this.w.f();
		this.u.d();
		this.v.e();
	}

	public void e() {
		super.e();
		this.f.e();
		this.w.g();
		this.u.e();
		this.v.f();
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	boolean g() {
		if (this.d.f <= 1)
			return true;
		boolean bl = this.a(false);
		boolean bl2 = false;
		if (!bl)
			return bl2;
		return true;
	}

	public float getHandTrackDismissThreshold() {
		if (ItemSectorBg.a) {
			return 0.35f;
		}
		return 0.42f;
	}

	public lk getItemLayer() {
		return this.f.getCurrentFanLayer();
	}

	public ItemSector getItemSector() {
		return this.f;
	}

	public ItemSectorBg getItemSectorBg() {
		return this.w;
	}

	public int getOuterSize() {
		return mf.a(this.d);
	}

	public TabSector getTabSector() {
		return this.u;
	}

	public TabSectorBg getTabSectorBg() {
		return this.v;
	}

	public void onAnimationCancel(Animator animator) {
	}

	public void onAnimationEnd(Animator animator) {
		this.h();
	}

	public void onAnimationRepeat(Animator animator) {
	}

	public void onAnimationStart(Animator animator) {
		this.h();
	}

	public void onFinishInflate() {
		this.f = (ItemSector) this.findViewById(R.id.tile_sector);
		this.u = (TabSector) this.findViewById(R.id.tab_sector);
		this.v = (TabSectorBg) this.findViewById(R.id.tab_sector_bg);
		this.w = (ItemSectorBg) this.findViewById(R.id.item_sector_bg);
	}

	public void run() {
		this.h();
	}

	public void setDirection(boolean flag) {
		super.setDirection(flag);
		Fan.a(this, flag);
		Fan.a(u, flag);
		Fan.a(f, flag);
		f.setDirection(flag);
		u.setDirection(flag);
		v.setDirection(flag);
		w.setDirection(flag);
	}

	public void setFan(Fan fan) {
		super.setFan(fan);
		f.a(fan, this);
		u.a(fan, this);
		v.setFan(fan);
		w.setFan(fan);
	}

	public void setTab(int i1) {
		super.setTab(i1);
		u.setTab(i1);
	}

}
