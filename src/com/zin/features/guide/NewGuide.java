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
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.AccelerateInterpolator
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.lazyswipe.features.guide;

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
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.lk;
import com.main.np;
import com.main.nq;
import com.main.oy;
import com.main.tf;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class NewGuide extends nq implements View.OnClickListener {
	private float A;
	private float B;
	private float C;
	private float D;
	private boolean E;
	private Path F = new Path();
	private Paint G = new Paint();
	private Paint H = new Paint();
	private boolean I;
	private int J;
	private int K;
	private int L;
	private int M;
	private int N;
	private boolean g;
	private GuideBackground h;
	private View i;
	private TextView j;
	private ImageView k;
	private View l;
	private TextView m;
	private TextView n;
	private ImageView o;
	private ImageView p;
	private ImageView q;
	private TextView r;
	private ImageView s;
	private View t;
	private float u;
	private float v;
	private float w;
	private float x;
	private float y;
	private float z;

	public NewGuide(Context context) {
		super(context);
		this.G.setFlags(7);
		this.G.setColor(Integer.MAX_VALUE);
		this.L = vk.a((Context) SwipeApplication.e(), 6.0f);
		this.M = vk.a((Context) SwipeApplication.e(), 6.0f);
		this.H.setFlags(7);
		this.H.setColor(Integer.MAX_VALUE);
		this.H.setStyle(Paint.Style.FILL);
	}

	public NewGuide(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		this.G.setFlags(7);
		this.G.setColor(Integer.MAX_VALUE);
		this.L = vk.a((Context) SwipeApplication.e(), 6.0f);
		this.M = vk.a((Context) SwipeApplication.e(), 6.0f);
		this.H.setFlags(7);
		this.H.setColor(Integer.MAX_VALUE);
		this.H.setStyle(Paint.Style.FILL);
	}

	private void A() {
		this.i.setTranslationX((float) (this.c / 2));
		this.i.setAlpha(0.0f);
		this.i.setVisibility(0);
		this.i.animate().translationX(0.0f).alpha(1.0f).setDuration(750);
		this.j.setTranslationX((float) (this.c / 2));
		this.j.animate()
				.translationX(0.0f)
				.setStartDelay(450)
				.alpha(1.0f)
				.setDuration(750)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.B();
							}
						});
	}

	private void B() {
		np np = new np(false);
		this.k.setImageDrawable((Drawable) np);
		this.k.setPivotX((float) (np.getIntrinsicWidth() / 2));
		this.k.setPivotY((float) (np.getIntrinsicHeight() / 2));
		this.k.setScaleX(0.0f);
		this.k.setScaleY(0.0f);
		this.k.animate()
				.scaleX(1.0f)
				.scaleY(1.0f)
				.alpha(1.0f)
				.setDuration(550)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.k
										.setOnClickListener((View.OnClickListener) NewGuide.this);
							}
						});
		this.r.animate().alpha(1.0f).setDuration(100);
	}

	private ValueAnimator a(int n, int n2, int n3) {
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) new int[] {
				n, n2 });
		valueAnimator.setDuration((long) n3);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						int n = Color.argb((int) ((Integer) valueAnimator
								.getAnimatedValue()), (int) 0, (int) 0, (int) 0);
						NewGuide.this.setBackgroundColor(n);
					}
				});
		return valueAnimator;
	}

	private void b(int n) {
		if (this.getFan() == null || this.getFan().getBaseSectorArea() == null) {
			return;
		}
		this.getFan().getBaseSectorArea().animate().alpha(1.0f)
				.setDuration((long) n).setListener(null);
	}

	private void c(int n) {
		if (this.getFan() == null || this.getFan().getBaseSectorArea() == null) {
			return;
		}
		this.getFan().getBaseSectorArea().animate().alpha(0.0f)
				.setDuration((long) n).setListener(null);
	}

	private void l() {
		this.i.setTranslationX((float) (this.c / 2));
		this.i.setAlpha(0.0f);
		this.i.setVisibility(0);
		this.i.animate().translationX(0.0f).alpha(1.0f).setDuration(750)
				.setListener(null);
		this.m.setText(R.string.user_guide_end_main);
		this.n.setText((CharSequence) this.getContext().getString(
				R.string.user_guide_end_sub));
		this.m.setVisibility(0);
		this.n.setVisibility(0);
		this.l.setAlpha(0.0f);
		this.l.setTranslationX((float) (this.c / 2));
		this.l.setVisibility(0);
		this.l.animate().alpha(1.0f).translationX(0.0f).setDuration(750)
				.setStartDelay(500).setListener(null);
		float f = this.l.getY() + (float) this.l.getHeight()
				+ (float) vk.a(this.getContext(), 50.0f);
		this.s.setY(f);
		this.s.setTranslationX((float) (this.c / 2));
		this.s.setAlpha(0.0f);
		this.s.animate()
				.alpha(1.0f)
				.translationX(0.0f)
				.setDuration(750)
				.setStartDelay(800)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.s
										.setOnClickListener((View.OnClickListener) NewGuide.this);
							}
						});
		ColorDrawable colorDrawable = new ColorDrawable(872415231);
		ColorDrawable colorDrawable2 = new ColorDrawable(1627389951);
		StateListDrawable stateListDrawable = new StateListDrawable();
		stateListDrawable.addState(new int[] { 16842919 },
				(Drawable) colorDrawable2);
		stateListDrawable.addState(new int[0], (Drawable) colorDrawable);
		this.t.setBackgroundDrawable((Drawable) stateListDrawable);
		this.t.animate()
				.alpha(1.0f)
				.setDuration(600)
				.setStartDelay(800)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.t
										.setOnClickListener((View.OnClickListener) NewGuide.this);
							}
						});
	}

	static ImageView o(NewGuide newguide) {
		return newguide.q;
	}

	static int p(NewGuide newguide) {
		return newguide.N;
	}

	private void m() {
		this.q.animate().alpha(0.0f).setDuration(600).setListener(null);
		lk lk = this.getFanLayer();
		if (lk == null) {
			this.g();
			return;
		}
		lk.h();
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.h.animate().alpha(1.0f).setDuration(600)
						.setListener(null);
				NewGuide.this.c(300);
				ValueAnimator valueAnimator = NewGuide.this.a(0, 178, 600);
				valueAnimator
						.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.postDelayed(
										(Runnable) new Runnable() {

											public void run() {
												NewGuide.this.h.b();
												NewGuide.this
														.postDelayed(
																(Runnable) new Runnable() {

																	public void run() {
																		NewGuide.this
																				.l();
																	}
																}, 100);
											}

										}, 650);
							}

						});
				valueAnimator.start();
			}

		}, 300);
	}

	private void n() {
		final lk lk = this.getFanLayer();
		FanItem fanItem = this.getMockItem();
		if (!(fanItem instanceof FanItem)) {
			this.g();
			return;
		}
		final FanItem fanItem2 = fanItem;
		int[] arrn = new int[2];
		fanItem2.getLocationOnScreen(arrn);
		final int n = arrn[0] + vk.a(this.getContext(), 4.0f);
		final int n2 = arrn[1] + vk.a(this.getContext(), 4.0f);
		this.q.animate()
				.x((float) n)
				.y((float) n2)
				.setDuration(500)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.I = true;
								NewGuide.this.J = n;
								NewGuide.this.K = n2;
								int[] arrn = new int[] {
										0,
										vk.a((Context) SwipeApplication.e(),
												12.0f) };
								ValueAnimator valueAnimator = ValueAnimator
										.ofInt((int[]) arrn);
								valueAnimator.setDuration(150);
								valueAnimator
										.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

											public void onAnimationUpdate(
													ValueAnimator valueAnimator) {
												NewGuide.this.N = (Integer) valueAnimator
														.getAnimatedValue();
												NewGuide.this.invalidate();
											}
										});
								valueAnimator
										.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

											public void onAnimationEnd(
													Animator animator) {
												lk.b(fanItem2);
												NewGuide.this.m();
												int[] arrn = new int[] {
														vk.a((Context) SwipeApplication
																.e(), 12.0f), 0 };
												ValueAnimator valueAnimator = ValueAnimator
														.ofInt((int[]) arrn);
												valueAnimator.setDuration(150);
												valueAnimator
														.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

															public void onAnimationUpdate(
																	ValueAnimator valueAnimator) {
																NewGuide.this.N = (Integer) valueAnimator
																		.getAnimatedValue();
																NewGuide.this
																		.invalidate();
															}
														});
												valueAnimator
														.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

															public void onAnimationEnd(
																	Animator animator) {
																NewGuide.this.I = false;
															}
														});
												valueAnimator.start();
											}

										});
								valueAnimator.start();
							}

						});
	}

	static float q(NewGuide newguide) {
		return newguide.u;
	}

	static float r(NewGuide newguide) {
		return newguide.w;
	}

	static float s(NewGuide newguide) {
		return newguide.A;
	}

	static int t(NewGuide newguide) {
		return newguide.K;
	}

	static float u(NewGuide newguide) {
		return newguide.v;
	}

	static float v(NewGuide newguide) {
		return newguide.x;
	}

	static float w(NewGuide newguide) {
		return newguide.B;
	}

	static ImageView x(NewGuide newguide) {
		return newguide.o;
	}

	static ImageView y(NewGuide newguide) {
		return newguide.p;
	}

	static void z(NewGuide newguide) {
		newguide.r();
	}

	private void o() {
		this.I = false;
		if (this.getFan() == null) {
			this.g();
			return;
		}
		if (this.getFanLayer() == null) {
			this.g();
			return;
		}
		FanItem fanItem = this.a(1);
		if (!(fanItem instanceof FanItem)) {
			this.g();
			return;
		}
		this.getFanLayer().onLongClick((View) fanItem);
		this.getFanLayer().g();
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.I = false;
				NewGuide.this.invalidate();
			}
		}, 300);
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.n();
			}
		}, 1000);
	}

	private void p() {
		FanItem fanItem = this.a(1);
		if (!(fanItem instanceof FanItem)) {
			this.g();
			return;
		}
		FanItem fanItem2 = fanItem;
		int[] arrn = new int[2];
		fanItem2.getLocationOnScreen(arrn);
		final int n = arrn[0] + fanItem2.getWidth() / 2;
		final int n2 = arrn[1] + 2 * fanItem2.getHeight() / 3;
		int n3 = (int) (0.65f * (float) this.c);
		int n4 = this.d - n3;
		this.q.setX((float) n3);
		this.q.setY((float) n4);
		this.q.setVisibility(0);
		this.q.setAlpha(1.0f);
		this.q.animate()
				.x((float) n)
				.y((float) n2)
				.setDuration(500)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.I = true;
								NewGuide.this.J = n;
								NewGuide.this.K = n2;
								int[] arrn = new int[] {
										0,
										vk.a((Context) SwipeApplication.e(),
												12.0f) };
								ValueAnimator valueAnimator = ValueAnimator
										.ofInt((int[]) arrn);
								valueAnimator.setDuration(150);
								valueAnimator
										.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

											public void onAnimationUpdate(
													ValueAnimator valueAnimator) {
												NewGuide.this.N = (Integer) valueAnimator
														.getAnimatedValue();
												NewGuide.this.invalidate();
											}
										});
								valueAnimator
										.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

											public void onAnimationEnd(
													Animator animator) {
												NewGuide.this
														.postDelayed(
																(Runnable) new Runnable() {

																	public void run() {
																		NewGuide.this
																				.o();
																	}
																}, 300);
											}

										});
								valueAnimator.start();
							}

						});
	}

	private void q() {
		this.l.animate()
				.alpha(0.0f)
				.translationX((float) ((-this.c) / 2))
				.setDuration(750)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.l.setVisibility(8);
								ValueAnimator valueAnimator = NewGuide.this.a(
										178, 0, 400);
								NewGuide.this.b(400);
								valueAnimator
										.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

											public void onAnimationEnd(
													Animator animator) {
												NewGuide.this
														.postDelayed(
																(Runnable) new Runnable() {

																	public void run() {
																		NewGuide.this
																				.p();
																	}
																}, 600);
											}

										});
								valueAnimator.start();
								NewGuide.this.h.animate().alpha(0.0f)
										.setDuration(400).setListener(null);
							}

						});
	}

	private void r() {
		this.c(300);
		this.h.animate().alpha(1.0f).setDuration(300).setListener(null);
		ValueAnimator valueAnimator = this.a(0, 178, 300);
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						NewGuide.this.m.setText(2131689705);
						NewGuide.this.m.setVisibility(0);
						NewGuide.this.n.setVisibility(8);
						NewGuide.this.l.setAlpha(0.0f);
						NewGuide.this.l.setVisibility(0);
						NewGuide.this.l
								.setTranslationX((float) (NewGuide.this.c / 2));
						NewGuide.this.l
								.animate()
								.alpha(1.0f)
								.translationX(0.0f)
								.setDuration(750)
								.setListener(
										(Animator.AnimatorListener) new AnimatorListenerAdapter() {

											public void onAnimationEnd(
													Animator animator) {
												NewGuide.this
														.postDelayed(
																(Runnable) new Runnable() {

																	public void run() {
																		NewGuide.this
																				.q();
																	}
																}, 1350);
											}

										});
					}

				});
		valueAnimator.start();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void s() {
		this.a(178, 0, 300).start();
		final int n = oy.a() ? (int) (0.6f * (float) this.c) : this.c / 2;
		final int n2 = this.d - n;
		this.u = this.J;
		this.v = this.K;
		int[] arrn = new int[] { this.J, n };
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) arrn);
		valueAnimator
				.setInterpolator((TimeInterpolator) new AccelerateInterpolator(
						2.8f));
		valueAnimator.setDuration(1000);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						NewGuide.this.J = (Integer) valueAnimator
								.getAnimatedValue();
						NewGuide.this.q.setX((float) NewGuide.this.J);
						float f = (float) NewGuide.this.N
								* (((float) NewGuide.this.J - NewGuide.this.u) / ((float) n - NewGuide.this.u));
						NewGuide.this.w = (float) NewGuide.this.J - f * 0.707f;
						NewGuide.this.A = (float) NewGuide.this.J + f * 0.707f;
						NewGuide.this.y = NewGuide.this.u + 0.59f
								* (NewGuide.this.w - NewGuide.this.u);
						NewGuide.this.C = NewGuide.this.u + 0.56f
								* (NewGuide.this.A - NewGuide.this.u);
						NewGuide.this.invalidate();
					}
				});
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						NewGuide.this.E = false;
						NewGuide.this.invalidate();
					}

					public void onAnimationStart(Animator animator) {
						NewGuide.this.E = true;
						NewGuide.this.invalidate();
					}
				});
		valueAnimator.start();
		int[] arrn2 = new int[] { this.K, n2 };
		ValueAnimator valueAnimator2 = ValueAnimator.ofInt((int[]) arrn2);
		valueAnimator2
				.setInterpolator((TimeInterpolator) new AccelerateInterpolator(
						2.8f));
		valueAnimator2.setDuration(1000);
		valueAnimator2
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						NewGuide.this.K = (Integer) valueAnimator
								.getAnimatedValue();
						NewGuide.this.q.setY((float) NewGuide.this.K);
						float f = (float) NewGuide.this.N
								* (((float) NewGuide.this.K - NewGuide.this.v) / ((float) n2 - NewGuide.this.v));
						NewGuide.this.x = (float) NewGuide.this.K - f * 0.707f;
						NewGuide.this.B = (float) NewGuide.this.K + f * 0.707f;
						NewGuide.this.z = NewGuide.this.v + 0.69f
								* (NewGuide.this.x - NewGuide.this.v);
						NewGuide.this.D = NewGuide.this.v + 0.66f
								* (NewGuide.this.B - NewGuide.this.v);
					}
				});
		valueAnimator2.start();
		ValueAnimator valueAnimator3 = ValueAnimator
				.ofFloat((float[]) new float[] { 1.0f, 0.0f });
		valueAnimator3.setDuration(50);
		valueAnimator3.setStartDelay(950);
		valueAnimator3
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						float f = ((Float) valueAnimator.getAnimatedValue())
								.floatValue();
						NewGuide.this.q.setAlpha(f);
						if (f < 0.15f) {
							NewGuide.this.I = false;
						}
					}
				});
		valueAnimator3.start();
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.o.setVisibility(8);
				NewGuide.this.p.setVisibility(8);
			}
		}, 300);
		if (this.getFan() != null) {
			this.postDelayed((Runnable) new Runnable() {

				public void run() {
					ir.f((Context) SwipeApplication.e(), 3);
					if (NewGuide.this.getFan() != null) {
						NewGuide.this.getFan().a("mostUsed");
					}
				}
			}, 310);
		}
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.r();
			}
		}, 3200);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void t() {
		GuideBackground guideBackground = this.h;
		boolean bl = !e;
		guideBackground.a(bl, null);
		ValueAnimator valueAnimator = this.a(0, 178, 500);
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						if (nq.e) {
							NewGuide.this.x();
							return;
						}
						NewGuide.this.A();
					}
				});
		valueAnimator.start();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void u() {
		final SwipeApplication swipeApplication = SwipeApplication.e();
		int n = vk.a((Context) swipeApplication, 35.0f);
		int n2 = vk.a((Context) swipeApplication, 8.0f);
		final int n3 = vk.a((Context) swipeApplication, 10.0f);
		final int n4 = this.d - vk.a((Context) swipeApplication, 45.0f);
		this.q.setX((float) (n + n3));
		this.q.setY((float) (n2 + n4));
		this.q.setAlpha(1.0f);
		ViewPropertyAnimator viewPropertyAnimator = this.q.animate()
				.x((float) n3).y((float) n4);
		long l = oy.a() ? 320 : 250;
		viewPropertyAnimator.setDuration(l).setListener(
				(Animator.AnimatorListener) new AnimatorListenerAdapter() {
					Context c =swipeApplication;

					public void onAnimationEnd(Animator animator) {
						NewGuide.this.I = true;
						NewGuide.this.J = n3;
						NewGuide.this.K = n4;
						int[] arrn = new int[] { 0, vk.a(this.c, 12.0f) };
						ValueAnimator valueAnimator = ValueAnimator
								.ofInt((int[]) arrn);
						valueAnimator.setDuration(150);
						valueAnimator
								.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

									public void onAnimationUpdate(
											ValueAnimator valueAnimator) {
										NewGuide.this.N = (Integer) valueAnimator
												.getAnimatedValue();
										NewGuide.this.invalidate();
									}
								});
						valueAnimator
								.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

									public void onAnimationEnd(Animator animator) {
										NewGuide.this.postDelayed(
												(Runnable) new Runnable() {

													public void run() {
														NewGuide.this.s();
													}
												}, 150);
									}

								});
						valueAnimator.start();
					}

				});
	}

	private void v() {
		this.l.animate().alpha(0.0f).translationX((float) ((-this.c) / 2))
				.setListener(null).setDuration(750);
		this.h.animate().alpha(0.0f).setDuration(600).setListener(null);
		ValueAnimator valueAnimator = this.a(178, 255, 600);
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						NewGuide.this.w();
					}
				});
		valueAnimator.start();
	}

	private void w() {
		this.l.setVisibility(8);
		ValueAnimator valueAnimator = ValueAnimator.ofFloat(
				(float[]) new float[] { 0.0f, 1.0f }).setDuration(600);
		valueAnimator
				.setInterpolator((TimeInterpolator) new TimeInterpolator() {

					public float getInterpolation(float f) {
						if ((double) f < 0.2) {
							return 5.0f * f;
						}
						return (float) (1.0 - 0.5 * ((double) f - 0.2));
					}
				});
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						float f = ((Float) valueAnimator.getAnimatedValue())
								.floatValue();
						NewGuide.this.o.setAlpha(f);
						NewGuide.this.p.setAlpha(f);
					}
				});
		valueAnimator.start();
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.u();
			}
		}, 600);
	}

	private void x() {
		this.r.setAlpha(1.0f);
		this.m.setVisibility(0);
		this.n.setVisibility(8);
		this.m.setText(R.string.user_guide_pop);
		this.l.setY(0.5f * (float) this.d - (float) (this.l.getHeight() / 2));
		this.l.setTranslationX((float) (this.c / 2));
		this.l.animate()
				.alpha(1.0f)
				.translationX(0.0f)
				.setDuration(750)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.postDelayed(
										(Runnable) new Runnable() {

											public void run() {
												NewGuide.this.v();
											}
										}, 1350);
							}

						});
	}

	private void y() {
		ValueAnimator valueAnimator = ValueAnimator
				.ofFloat((float[]) new float[] { 0.0f, 1.0f });
		valueAnimator
				.setInterpolator((TimeInterpolator) new TimeInterpolator() {

					public float getInterpolation(float f) {
						if ((double) f < 0.25) {
							return 1.0f - f;
						}
						return 0.75f + 6.0f * (f - 0.25f) * (f - 0.25f);
					}
				});
		valueAnimator.setDuration(600);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						float f = ((Float) valueAnimator.getAnimatedValue())
								.floatValue();
						NewGuide.this.k.setScaleX(f);
						NewGuide.this.k.setScaleY(f);
					}
				});
		ValueAnimator valueAnimator2 = ValueAnimator
				.ofFloat((float[]) new float[] { 0.0f, 1.0f });
		valueAnimator2
				.setInterpolator((TimeInterpolator) new TimeInterpolator() {

					public float getInterpolation(float f) {
						if ((double) f < 0.3) {
							return 1.0f - f;
						}
						if ((double) f < 0.7) {
							return 0.7f;
						}
						return 2.33f + -2.33f * f;
					}
				});
		valueAnimator2.setDuration(600);
		valueAnimator2
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						float f = ((Float) valueAnimator.getAnimatedValue())
								.floatValue();
						NewGuide.this.k.setAlpha(f);
					}
				});
		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						NewGuide.this.k.setVisibility(8);
						NewGuide.this.k.setOnClickListener(null);
						NewGuide.this.z();
					}
				});
		animatorSet
				.playTogether(new Animator[] { valueAnimator2, valueAnimator });
		animatorSet.start();
	}

	private void z() {
		this.i.animate()
				.alpha(0.0f)
				.translationX((float) ((-this.c) / 2))
				.setDuration(750)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.i.setVisibility(8);
							}
						});
		this.j.animate()
				.alpha(0.0f)
				.translationX((float) ((-this.c) / 2))
				.setStartDelay(350)
				.setDuration(750)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {

							public void onAnimationEnd(Animator animator) {
								NewGuide.this.j.setVisibility(8);
							}
						});
		this.h.a();
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.x();
			}
		}, 600);
	}

	public void a() {
		this.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.this.t();
			}
		}, 200);
	}

	public boolean b() {
		return this.g;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void onClick(View view) {
		if (view == this.k) {
			if (this.g)
				return;
			{
				this.g = true;
				this.y();
				return;
			}
		} else {
			if (view == this.t || view == this.r) {
				if (NewGuide.d()) {
					this.f();
					return;
				}
				this.g();
				return;
			}
			if (view != this.s)
				return;
			{
				this.i();
				return;
			}
		}
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		if (this.I) {
			canvas.drawCircle((float) (this.J + this.L),
					(float) (this.K + this.M), (float) this.N, this.G);
		}
		if (this.E) {
			this.F.reset();
			this.F.moveTo(this.u, this.v);
			this.F.quadTo(this.y, this.z, this.w, this.x);
			this.F.lineTo(this.A, this.B);
			this.F.quadTo(this.C, this.D, this.u, this.v);
			this.F.close();
			canvas.drawPath(this.F, this.H);
		}
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		this.setOnClickListener((View.OnClickListener) this);
		this.h = (GuideBackground) this.findViewById(R.id.guide_background);
		this.i = this.findViewById(R.id.slogan_icon);
		this.j = (TextView) this.findViewById(R.id.slogan_label);
		this.k = (ImageView) this.findViewById(R.id.start_btn);
		this.l = this.findViewById(R.id.label_container);
		this.m = (TextView) this.findViewById(R.id.slogan_label);
		this.n = (TextView) this.findViewById(R.id.label_sub);
		this.o = (ImageView) this.findViewById(R.id.toucher_left);
		this.p = (ImageView) this.findViewById(R.id.toucher_right);
		Bitmap bitmap = tf.c(((BitmapDrawable) this.o.getDrawable())
				.getBitmap());
		this.p.setImageBitmap(bitmap);
		this.q = (ImageView) this.findViewById(R.id.finger);
		this.t = this.findViewById(R.id.btn_go);
		this.s = (ImageView) this.findViewById(R.id.btn_replay);
		this.r = (TextView) this.findViewById(R.id.btn_skip);
		this.r.setOnClickListener((View.OnClickListener) this);
		this.h.a(new int[] { -1302601475, -1671700227, 1299214300, 4539257,
				4539257 }, new float[] { 0.0f, 0.06f, 0.28f, 0.5f, 1.0f });
	}

}
