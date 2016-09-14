/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.lazyswipe.features.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.lazyswipe.zev.R;
import com.main.no;
import com.main.tf;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class GuideBackground extends RelativeLayout {
	private static final String c = "Swipe."
			+ GuideBackground.class.getSimpleName();
	protected int a;
	protected int b;
	private View d;
	private ImageView e;
	private ImageView f;
	private Bitmap g;
	private Bitmap h;
	private int[] i;
	private float[] j;
	private float[][] k;
	private int l;
	private Paint m;
	private Paint n;
	private float[] o;
	private float[] p;
	private Path q;

	public GuideBackground(Context context) {
		super(context);
		float[][] arrarrf = new float[5][];
		float[] arrf = new float[] { this.a(185), this.a(601), this.a(7) };
		arrarrf[0] = arrf;
		float[] arrf2 = new float[] { this.a(177), this.a(1505), this.a(7) };
		arrarrf[1] = arrf2;
		float[] arrf3 = new float[] { this.a(401), this.a(1509), this.a(4) };
		arrarrf[2] = arrf3;
		float[] arrf4 = new float[] { this.a(837), this.a(1501), this.a(7) };
		arrarrf[3] = arrf4;
		float[] arrf5 = new float[] { this.a(713), this.a(1559), this.a(4) };
		arrarrf[4] = arrf5;
		this.k = arrarrf;
		this.m = new Paint();
		this.m.setColor(-1);
		this.m.setFlags(7);
		this.m.setStyle(Paint.Style.FILL);
		this.n = new Paint();
		float[] arrf6 = new float[] { this.a(345), this.a(1480) };
		this.o = arrf6;
		float[] arrf7 = new float[] { this.a(609), this.a(1340) };
		this.p = arrf7;
		this.n.setColor(-1);
		this.n.setFlags(7);
		this.n.setStyle(Paint.Style.FILL);
		LinearGradient linearGradient = new LinearGradient(this.o[0],
				this.o[1], this.p[0], this.p[1], -1140850689, 872415231,
				Shader.TileMode.CLAMP);
		this.n.setShader((Shader) linearGradient);
		this.q = new Path();
		int n = vk.a(this.getContext(), 4.0f);
		this.q.moveTo(this.o[0] + (float) n, this.o[1] + (float) n);
		this.q.arcTo(new RectF(this.o[0] - (float) n, this.o[1] - (float) n,
				this.o[0] + (float) n, this.o[1] + (float) n), 45.0f, 180.0f,
				true);
		this.q.lineTo(this.p[0], this.p[1]);
		this.q.close();
	}

	public GuideBackground(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		float[][] arrarrf = new float[5][];
		float[] arrf = new float[] { this.a(185), this.a(601), this.a(7) };
		arrarrf[0] = arrf;
		float[] arrf2 = new float[] { this.a(177), this.a(1505), this.a(7) };
		arrarrf[1] = arrf2;
		float[] arrf3 = new float[] { this.a(401), this.a(1509), this.a(4) };
		arrarrf[2] = arrf3;
		float[] arrf4 = new float[] { this.a(837), this.a(1501), this.a(7) };
		arrarrf[3] = arrf4;
		float[] arrf5 = new float[] { this.a(713), this.a(1559), this.a(4) };
		arrarrf[4] = arrf5;
		this.k = arrarrf;
		this.m = new Paint();
		this.m.setColor(-1);
		this.m.setFlags(7);
		this.m.setStyle(Paint.Style.FILL);
		this.n = new Paint();
		float[] arrf6 = new float[] { this.a(345), this.a(1480) };
		this.o = arrf6;
		float[] arrf7 = new float[] { this.a(609), this.a(1340) };
		this.p = arrf7;
		this.n.setColor(-1);
		this.n.setFlags(7);
		this.n.setStyle(Paint.Style.FILL);
		LinearGradient linearGradient = new LinearGradient(this.o[0],
				this.o[1], this.p[0], this.p[1], -1140850689, 872415231,
				Shader.TileMode.CLAMP);
		this.n.setShader((Shader) linearGradient);
		this.q = new Path();
		int n = vk.a(this.getContext(), 4.0f);
		this.q.moveTo(this.o[0] + (float) n, this.o[1] + (float) n);
		this.q.arcTo(new RectF(this.o[0] - (float) n, this.o[1] - (float) n,
				this.o[0] + (float) n, this.o[1] + (float) n), 45.0f, 180.0f,
				true);
		this.q.lineTo(this.p[0], this.p[1]);
		this.q.close();
	}

	private float a(int n) {
		return vk.a(this.getContext(), (float) (n / 3));
	}

	private void c() {
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) new int[] {
				190, 0 });
		valueAnimator.setDuration(500);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						GuideBackground.this.l = (Integer) valueAnimator
								.getAnimatedValue();
						GuideBackground.this.m.setAlpha(GuideBackground.this.l);
						GuideBackground.this.n.setAlpha(GuideBackground.this.l);
						GuideBackground.this.invalidate();
					}
				});
		valueAnimator.start();
	}

	public void a() {
		int n = (int) (0.8f * (float) ((this.a - this.g.getWidth()) / 2));
		int n2 = (this.a - this.h.getWidth()) / 2;
		this.e.animate().alpha(0.0f).translationX((float) n).setDuration(750);
		this.f.animate().alpha(0.0f).translationX((float) n2).setDuration(750);
		this.c();
	}

	public void a(boolean bl, Animator.AnimatorListener animatorListener) {
		if (bl) {
			this.e.animate().alpha(1.0f).setDuration(500).setListener(null);
			this.f.animate().alpha(1.0f).setDuration(500).setListener(null);
			this.b();
		}
		this.d.animate().alpha(1.0f).setDuration(500)
				.setListener(animatorListener);
	}

	public void a(int[] arrn, float[] arrf) {
		this.i = arrn;
		this.j = arrf;
		this.d.setBackgroundDrawable((Drawable) new no(this.i, this.j));
	}

	public void b() {
		ValueAnimator valueAnimator = ValueAnimator.ofInt((int[]) new int[] {
				0, 190 });
		valueAnimator.setDuration(700);
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						GuideBackground.this.l = (Integer) valueAnimator
								.getAnimatedValue();
						GuideBackground.this.m.setAlpha(GuideBackground.this.l);
						GuideBackground.this.n.setAlpha(GuideBackground.this.l);
						GuideBackground.this.invalidate();
					}
				});
		valueAnimator.start();
	}

	protected void dispatchDraw(Canvas canvas) {
		super.dispatchDraw(canvas);
		if (this.l > 0) {
			canvas.drawCircle(this.k[0][0], this.k[0][1], this.k[0][2], this.m);
			canvas.drawCircle(this.k[1][0], this.k[1][1], this.k[1][2], this.m);
			canvas.drawCircle(this.k[2][0], this.k[2][1], this.k[2][2], this.m);
			canvas.drawCircle(this.k[3][0], this.k[3][1], this.k[3][2], this.m);
			canvas.drawCircle(this.k[4][0], this.k[4][1], this.k[4][2], this.m);
			int n = vk.a(this.getContext(), 3.0f);
			canvas.drawCircle(this.o[0], this.o[1], (float) n, this.m);
			canvas.drawPath(this.q, this.n);
		}
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		tf.a(this.g);
		tf.a(this.h);
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
		int n = vk.a(this.getContext(), 25.0f);
		this.a = displayMetrics.widthPixels;
		this.b = displayMetrics.heightPixels - n;
		this.d = this.findViewById(R.id.guide_bg);
		this.e = (ImageView) this.findViewById(R.id.guide_hill_0);
		this.f = (ImageView) this.findViewById(R.id.guide_hill_1);
		this.g = tf.a(this.getResources(), R.drawable.user_guide_hill_0);
		this.h = tf.a(this.getResources(), R.drawable.user_guide_hill_1);
		this.e.setImageBitmap(this.g);
		this.f.setImageBitmap(this.h);
	}

	protected void onLayout(boolean bl, int n, int n2, int n3, int n4) {
		super.onLayout(bl, n, n2, n3, n4);
		if (this.g != null) {
			this.e.layout((this.getWidth() - this.g.getWidth()) / 2,
					this.getHeight() - this.g.getHeight(),
					(this.getWidth() + this.g.getWidth()) / 2, this.getHeight());
		}
		if (this.h != null) {
			this.f.layout((this.getWidth() - this.h.getWidth()) / 2,
					this.getHeight() - this.h.getHeight(),
					(this.getWidth() + this.h.getWidth()) / 2, this.getHeight());
		}
	}

	protected void onMeasure(int n, int n2) {
		super.onMeasure(n, n2);
		if (this.g != null) {
			this.e.measure(this.g.getWidth(), this.g.getHeight());
		}
		if (this.h != null) {
			this.f.measure(this.h.getWidth(), this.h.getHeight());
		}
	}

}
