package com.main;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.ClipData
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.DrawFilter
 *  android.graphics.PaintFlagsDrawFilter
 *  android.graphics.Point
 *  android.view.View
 *  android.view.View$DragShadowBuilder
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewPropertyAnimator
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;

/*
 * Failed to analyse overrides
 */
public class lp extends ImageView {
	private static final String a = "Swipe." + lp.class.getSimpleName();
	private WeakReference b;

	public lp(Context context) {
		super(context);
	}

	public void a() {
		if (this.b != null && this.b.get() != null) {
			((FanItem) this.b.get()).setScaleX(1.0f);
			((FanItem) this.b.get()).setScaleY(1.0f);
		}
	}

	public void a(final FanItem fanItem) {
		this.b = new WeakReference((Object) fanItem);
		final int n = fanItem.getWidth();
		int n2 = fanItem.getHeight();
		final int n3 = (int) (1.2f * (float) n);
		final int n4 = (int) (1.2f * (float) n2);
		ImageView imageView = fanItem.getIconView();
		final int n5 = imageView.getLeft() + imageView.getWidth() / 2;
		final int n6 = imageView.getTop() + imageView.getHeight() / 2;
		final int n7 = (int) (0.20000005f * (float) n5);
		final int n8 = (int) (0.20000005f * (float) n6);
		fanItem.setPivotX((float) n5);
		fanItem.setPivotY((float) n6);
		fanItem.animate()
				.scaleX(1.2f)
				.scaleY(1.2f)
				.setDuration(80)
				.setListener(
						(Animator.AnimatorListener) new AnimatorListenerAdapter() {
							final View i= lp.this;

							private void a() {
								Bitmap bitmap = this.b();
								if (!tf.b(bitmap)) {
									lp.this.a();
									lq lq = new lq((View) fanItem, 1.2f);
									fanItem.startDrag(null,
											(View.DragShadowBuilder) lq,
											(Object) fanItem, 0);
									return;
								}
								lp.this.setImageBitmap(bitmap);
								FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
										-2, -2);
								layoutParams.gravity = 83;
								layoutParams.leftMargin = (int) (1.2f * (float) (-n));
								Fan.getInstance().addView( lp.this,
										(ViewGroup.LayoutParams) layoutParams);
								lp.this.post((Runnable) new Runnable() {

									public void run() {
										if (fanItem == null) {
											return;
										}
										Point point = fanItem
												.getTouchDownPoint();
										Point point2 = new Point(point.x + n7,
												point.y + n8);
										lq lq = new lq((View) lp.this, 1.0f,
												point2);
										fanItem.startDrag(null,
												(View.DragShadowBuilder) lq,
												(Object) fanItem, 0);
										lp.this.postDelayed(
												(Runnable) new Runnable() {

													public void run() {
														lp.this.a();
													}
												}, 100);
									}

								});
							}

							private Bitmap b() {
								Bitmap bitmap = Bitmap
										.createBitmap(
												(int) n3,
												(int) n4,
												(Bitmap.Config) Bitmap.Config.ARGB_8888);
								Canvas canvas = new Canvas(bitmap);
								canvas.setDrawFilter((DrawFilter) tf.a);
								canvas.translate((float) n7, (float) n8);
								canvas.scale(1.2f, 1.2f, (float) n5, (float) n6);
								fanItem.invalidate();
								fanItem.b.invalidate();
								i.invalidate();
								if (fanItem.a(canvas)) {
									return bitmap;
								}
								tf.a(bitmap);
								return null;
							}

							public void onAnimationEnd(Animator animator) {
								try {
									this.a();
									return;
								} catch (Exception var2_2) {
									lp.this.a();
									lq lq = new lq((View) fanItem, 1.2f);
									fanItem.startDrag(null,
											(View.DragShadowBuilder) lq,
											(Object) fanItem, 0);
									return;
								}
								
							}

						});
	}

	public void b() {
		this.setImageBitmap(null);
		this.a();
		this.post((Runnable) new Runnable() {

			public void run() {
				try {
					if (Fan.getInstance() != null) {
						Fan.getInstance().removeView((View) lp.this);
					}
					if (lp.this.b != null) {
						lp.this.b.clear();
						lp.this.b = null;
					}
					return;
				} catch (Exception var1_1) {
					return;
				}
			}
		});
	}

}
