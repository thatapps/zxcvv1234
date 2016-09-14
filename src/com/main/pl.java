package com.main;

import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.lazyswipe.SwipeApplication;

public class pl {

	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(pl.class.getSimpleName()).toString();
	private long A;
	private int B[];
	private int C[];
	private int D;
	private PointF E;
	private PointF F;
	private PointF G;
	private PointF H;
	private PointF I;
	private Path J;
	private Paint K;
	private Paint L;
	private Paint M;
	private RectF N;
	private int b;
	private ValueAnimator c;
	private ValueAnimator d;
	private ValueAnimator e;
	private ValueAnimator f;
	private ValueAnimator g;
	private ValueAnimator h;
	private int i;
	private WeakReference j;
	private Handler k;
	private boolean l;
	private boolean m;
	private int n;
	private int o;
	private PointF p;
	private int q;
	private int r;
	private int s;
	private int t;
	private PointF u;
	private PointF v;
	private int w;
	private int x;
	private int y;
	private int z;

	public pl(View view, boolean flag) {
		B = new int[3];
		C = new int[3];
		m = flag;
		j = new WeakReference(view);
		k = new pm(this);
		K = new Paint();
		K.setColor(0xffff0000);
		K.setStyle(android.graphics.Paint.Style.FILL);
		K.setFlags(7);
		L = new Paint();
		L.setColor(-1);
		L.setStyle(android.graphics.Paint.Style.FILL);
		L.setFlags(7);
		M = new Paint();
		M.setColor(0xff000000);
		p = new PointF();
		u = new PointF();
		v = new PointF();
		E = new PointF();
		I = new PointF();
		F = new PointF();
		G = new PointF();
		H = new PointF();
		J = new Path();
		N = new RectF();
	}

	static int a(pl pl1) {
		return pl1.i;
	}

	static int a(pl pl1, int i1) {
		pl1.w = i1;
		return i1;
	}

	private void a(PointF pointf, float f1, float f2, PointF pointf1) {
		pointf1.x = pointf.x + (float) ((double) f1 * Math.cos(f2));
		pointf1.y = pointf.y - (float) ((double) f1 * Math.sin(f2));
	}

	static void a(pl pl1, boolean flag) {
		pl1.b(flag);
	}

	private boolean a(Canvas canvas, int i1) {
		long l1 = System.currentTimeMillis() - A;
		if (l1 < (long) i1 * 312L) {
			return true;
		}
		if (l1 >= (long) (i1 + 1) * 312L || b > 3) {
			canvas.drawCircle(u.x + (float) B[i1], u.y, D, L);
			return false;
		} else {
			int j1 = (int) (l1 - (long) i1 * 312L);
			float f1 = (float) j1 / 312F;
			double d1 = C[i1];
			double d2 = Math.cos(0.02513274F * (float) j1);
			j1 = (int) ((double) (1.0F - f1 * f1) * (d1 * d2));
			canvas.drawCircle(u.x + (float) B[i1], u.y - (float) j1, D, L);
			return true;
		}
	}

	static int b(pl pl1, int i1) {
		pl1.x = i1;
		return i1;
	}

	static PointF b(pl pl1) {
		return pl1.u;
	}

	private void b(Canvas canvas) {
		switch (b) {
		default:
			return;

		case 1: // '\001'
			c(canvas);
			return;

		case 2: // '\002'
			e(canvas);
			return;

		case 3: // '\003'
			d(canvas);
			return;

		case 4: // '\004'
			f(canvas);
			return;

		case 5: // '\005'
			g(canvas);
			return;

		case 6: // '\006'
			h(canvas);
			break;
		}
	}

	private void b(boolean flag) {
		d();
		if (flag) {
			i();
		}
	}

	static int c(pl pl1, int i1) {
		pl1.z = i1;
		return i1;
	}

	private void c(Canvas canvas) {
		canvas.drawCircle(u.x, u.y, w, K);
		canvas.drawCircle(v.x, v.y, x, K);
		g();
		canvas.drawPath(J, K);
		i();
	}

	static boolean c(pl pl1) {
		return pl1.m;
	}

	static int d(pl pl1) {
		return pl1.n;
	}

	static int d(pl pl1, int i1) {
		pl1.b = i1;
		return i1;
	}

	private void d(Canvas canvas) {
		u.x = p.x;
		u.y = p.y;
		z = y;
		w = y;
		canvas.drawCircle(u.x, u.y, w, K);
		z = y;
		f();
		canvas.drawRoundRect(N, 4F, 4F, K);
		int i1 = 0;
		boolean flag = false;
		for (; i1 < 3; i1++) {
			if (a(canvas, i1)) {
				flag = true;
			}
		}

		if (flag) {
			i();
			return;
		} else {
			k.removeMessages(3);
			b = 4;
			i();
			Message message = k.obtainMessage(3, 5, 0);
			k.sendMessageDelayed(message, 4000L);
			return;
		}
	}

	static int e(pl pl1) {
		return pl1.o;
	}

	private void e() {
		h();
		if (!vk.p()) {
			b = 6;
			i();
			return;
		} else {
			j();
			return;
		}
	}

	private void e(Canvas canvas) {
		canvas.drawCircle(u.x, u.y, w, K);
		f();
		canvas.drawRoundRect(N, 4F, 4F, K);
		i();
	}

	static PointF f(pl pl1) {
		return pl1.v;
	}

	private void f() {
		if (m) {
			N.set(u.x - (float) z, u.y, u.x, u.y + (float) z);
			return;
		} else {
			N.set(u.x, u.y, u.x + (float) z, u.y + (float) z);
			return;
		}
	}

	private void f(Canvas canvas) {
		u.x = p.x;
		u.y = p.y;
		w = y;
		z = y;
		w = y;
		canvas.drawCircle(u.x, u.y, w, K);
		z = y;
		f();
		canvas.drawRoundRect(N, 4F, 4F, K);
		for (int i1 = 0; i1 < 3; i1++) {
			a(canvas, i1);
		}

	}

	static int g(pl pl1) {
		return pl1.q;
	}

	private void g() {
		if (w == 0 || x == 0) {
			return;
		}
		J.reset();
		J.addCircle(u.x, u.y, w, android.graphics.Path.Direction.CW);
		J.addCircle(v.x, v.y, x, android.graphics.Path.Direction.CW);
		float f3 = (float) Math.hypot(u.x - v.x, u.y - v.y)
				* ((float) w / (float) (w + x));
		float f4 = (float) Math.acos(Math.abs((float) w / f3));
		float f1;
		float f2;
		PointF pointf;
		int i1;
		if (m) {
			f1 = 3.926991F;
		} else {
			f1 = 5.497787F;
		}
		if (m) {
			f2 = 0.7853982F;
		} else {
			f2 = 2.356194F;
		}
		a(u, w, f1 - f4, E);
		a(u, w, f1 + f4, G);
		a(v, x, f2 + f4, F);
		a(v, x, f2 - f4, H);
		pointf = I;
		f1 = u.x;
		if (m) {
			i1 = -1;
		} else {
			i1 = 1;
		}
		pointf.x = (float) i1 * (f3 * 0.707F) + f1;
		I.y = u.y + f3 * 0.707F;
		J.moveTo(F.x, F.y);
		J.quadTo(I.x, I.y, E.x, E.y);
		J.lineTo(G.x, G.y);
		J.quadTo(I.x, I.y, H.x, H.y);
		J.close();
	}

	private void g(Canvas canvas) {
		canvas.drawCircle(u.x, u.y, w, K);
		i();
	}

	static int h(pl pl1) {
		return pl1.r;
	}

	private void h() {
		b = 0;
		A = 0L;
		k.removeCallbacksAndMessages(null);
		if (c != null) {
			c.cancel();
		}
		if (d != null) {
			d.cancel();
		}
		if (e != null) {
			e.cancel();
		}
		if (f != null) {
			f.cancel();
		}
		if (g != null) {
			g.cancel();
		}
		if (h != null) {
			h.cancel();
		}
	}

	private void h(Canvas canvas) {
		float f1 = p.x;
		int i1;
		if (m) {
			i1 = -s;
		} else {
			i1 = s;
		}
		canvas.drawCircle((float) i1 + f1, p.y + (float) s, t, K);
	}

	static Handler i(pl pl1) {
		return pl1.k;
	}

	private void i() {
		k.sendEmptyMessage(0);
	}

	static int j(pl pl1) {
		return pl1.y;
	}

	private void j() {
		b = 1;
		AnimatorSet animatorset = new AnimatorSet();
		c = ValueAnimator
				.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder
						.ofKeyframe(
								"",
								new Keyframe[] { Keyframe.ofFloat(0.0F, -0.5F),
										Keyframe.ofFloat(0.1F, -0.35F),
										Keyframe.ofFloat(0.2F, -0.25F),
										Keyframe.ofFloat(0.3F, -0.08F),
										Keyframe.ofFloat(0.4F, 0.3F),
										Keyframe.ofFloat(0.5F, 0.6F),
										Keyframe.ofFloat(0.6F, 1.0F),
										Keyframe.ofFloat(1.0F, 1.0F) }) });
		c.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				float f2 = (float) pl.a(a) * f1;
				PointF pointF = pl.b(a);
				if (pl.c(a)) {
					f1 = f2;
				} else {
					f1 = (float) pl.d(a) - f2;
				}
				pointF.x = f1;
				pl.b(a).y = (float) pl.e(a) - f2;
			}

			{
				a = pl.this;
				//super();
			}
		});
		d = ValueAnimator
				.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder
						.ofKeyframe(
								"",
								new Keyframe[] { Keyframe.ofFloat(0.0F, -0.5F),
										Keyframe.ofFloat(0.5F, -0.5F),
										Keyframe.ofFloat(0.6F, 0.0F),
										Keyframe.ofFloat(0.7F, 0.1F),
										Keyframe.ofFloat(0.75F, 0.11F),
										Keyframe.ofFloat(0.8F, 0.13F),
										Keyframe.ofFloat(0.85F, 0.3F),
										Keyframe.ofFloat(0.9F, 0.58F),
										Keyframe.ofFloat(0.95F, 0.95F),
										Keyframe.ofFloat(0.98F, 0.99F),
										Keyframe.ofFloat(1.0F, 1.0F) }) });
		d.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				float f2 = (float) pl.a(a) * f1;
				PointF pointF = pl.f(a);
				if (pl.c(a)) {
					f1 = f2;
				} else {
					f1 = (float) pl.d(a) - f2;
				}
				pointF.x = f1;
				pl.f(a).y = (float) pl.e(a) - f2;
			}

			{
				a = pl.this;
				//super();
			}
		});
		e = ValueAnimator
				.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder
						.ofKeyframe(
								"",
								new Keyframe[] { Keyframe.ofFloat(0.0F, 0.1F),
										Keyframe.ofFloat(0.1F, 0.78F),
										Keyframe.ofFloat(0.6F, 0.78F),
										Keyframe.ofFloat(1.0F, 1.0F) }) });
		e.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				pl.a(a, (int) (f1 * (float) pl.g(a)));
			}

			{
				a = pl.this;
			//	super();
			}
		});
		f = ValueAnimator
				.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder
						.ofKeyframe(
								"",
								new Keyframe[] { Keyframe.ofFloat(0.0F, 0.1F),
										Keyframe.ofFloat(0.2F, 0.8F),
										Keyframe.ofFloat(1.0F, 1.0F) }) });
		f.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				pl.b(a, (int) (f1 * (float) pl.h(a)));
			}

			{
				a = pl.this;
				//super();
			}
		});
		animatorset.setDuration(850L);
		animatorset.playTogether(new Animator[] { c, d, e, f });
		animatorset.addListener(new AnimatorListenerAdapter() {

			final pl a;

			public void onAnimationEnd(Animator animator) {
				pl.i(a).obtainMessage(3, 2, 0).sendToTarget();
			}

			{
				a = pl.this;
				//super();
			}
		});
		animatorset.start();
		i();
	}

	static PointF k(pl pl1) {
		return pl1.p;
	}

	private void k() {
		b = 2;
		AnimatorSet animatorset = new AnimatorSet();
		g = ValueAnimator.ofFloat(new float[] { 1.0F, 0.87F });
		g.setDuration(135L);
		g.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				pl.a(a, (int) (f1 * (float) pl.g(a)));
			}

			{
				a = pl.this;
			//	super();
			}
		});
		h = ValueAnimator.ofFloat(new float[] { 0.9F, 1.0F });
		h.setDuration(135L);
		h.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f1 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				pl.c(a, (int) (f1 * (float) pl.j(a)));
			}

			{
				a = pl.this;
				//super();
			}
		});
		animatorset.setDuration(135L);
		animatorset.playTogether(new Animator[] { g, h });
		animatorset.addListener(new AnimatorListenerAdapter() {

			final pl a;

			public void onAnimationEnd(Animator animator) {
				pl.i(a).obtainMessage(3, 3, 0).sendToTarget();
			}

			{
				a = pl.this;
			//	super();
			}
		});
		animatorset.start();
		i();
	}

	static WeakReference l(pl pl1) {
		return pl1.j;
	}

	private void l() {
		A = System.currentTimeMillis();
		i();
		k.removeMessages(3);
	}

	private void m() {
		b = 5;
		c = ValueAnimator.ofFloat(new float[] { 0.0F, (float) s });
		c.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				float f2 = ((Float) valueanimator.getAnimatedValue())
						.floatValue();
				PointF pointF = pl.b(a);
				float f3 = pl.k(a).x;
				float f1;
				if (pl.c(a)) {
					f1 = -f2;
				} else {
					f1 = f2;
				}
				pointF.x = f1 + f3;
				pl.b(a).y = f2 + pl.k(a).y;
			}

			{
				a = pl.this;
			//	super();
			}
		});
		e = ValueAnimator.ofInt(new int[] { y, t });
		e.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			final pl a;

			public void onAnimationUpdate(ValueAnimator valueanimator) {
				pl.a(a, ((Integer) valueanimator.getAnimatedValue()).intValue());
			}

			{
				a = pl.this;
				//super();
			}
		});
		AnimatorSet animatorset = new AnimatorSet();
		animatorset.setDuration(550L);
		animatorset.playTogether(new Animator[] { c, e });
		animatorset.addListener(new AnimatorListenerAdapter() {

			final pl a;

			public void onAnimationEnd(Animator animator) {
				pl.i(a).obtainMessage(3, 6, 0).sendToTarget();
			}

			{
				a = pl.this;
				//super();
			}
		});
		animatorset.start();
		i();
	}

	static void m(pl pl1) {
		pl1.e();
	}

	static int n(pl pl1) {
		return pl1.b;
	}

	static void o(pl pl1) {
		pl1.k();
	}

	static void p(pl pl1) {
		pl1.l();
	}

	static void q(pl pl1) {
		pl1.m();
	}

	public void a() {
		if (!l) {
			l = true;
			k.sendEmptyMessage(1);
		}
	}

	public void a(int i1, int j1) {
		SwipeApplication swipeapplication = SwipeApplication.e();
		n = i1;
		o = j1;
		j1 = Math.min(n, vk.a(swipeapplication, 30F));
		q = (int) ((float) j1 * 0.32F);
		int k1 = q;
		float f1;
		PointF pointf;
		if (j.get() instanceof iw) {
			i1 = n - j1 >> 2;
		} else {
			i1 = 0;
		}
		i = i1 + (j1 - k1);
		pointf = p;
		if (m) {
			f1 = i;
		} else {
			f1 = n - i;
		}
		pointf.x = f1;
		p.y = o - i;
		r = (int) ((double) q * 0.69999999999999996D);
		y = (int) ((float) q * 0.87F);
		t = (int) ((float) q * 0.5F);
		s = q - t;
		B[0] = -(int) ((double) q * 0.42499999999999999D);
		B[1] = 0;
		B[2] = (int) ((double) q * 0.42499999999999999D);
		C[0] = (int) ((double) q * 0.55000000000000004D);
		C[1] = (int) ((double) q * 0.28000000000000003D);
		C[2] = (int) ((double) q * 0.12D);
		D = vk.a(swipeapplication, 1.0F);
	}

	public void a(Canvas canvas) {
		if (!l) {
			return;
		} else {
			android.graphics.DrawFilter drawfilter = canvas.getDrawFilter();
			canvas.setDrawFilter(tf.a);
			b(canvas);
			canvas.setDrawFilter(drawfilter);
			return;
		}
	}

	public void a(boolean flag) {
		if (l) {
			l = false;
			k.obtainMessage(2, Boolean.valueOf(flag)).sendToTarget();
		}
	}

	public void b() {
		if (!l) {
			return;
		} else {
			k.removeCallbacksAndMessages(null);
			k.sendEmptyMessageDelayed(1, 500L);
			return;
		}
	}

	public boolean c() {
		return l;
	}

	public void d() {
		h();
		l = false;
	}

}
