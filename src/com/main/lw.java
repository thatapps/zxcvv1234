package com.main;

import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.ViewConfiguration;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.hetero.iwatch.WatchItemSector;

public class lw {
	private static final String a = "Swipe." + lw.class.getSimpleName();
	private WeakReference b;
	private WeakReference c;
	private boolean d;
	private float e;
	private boolean f;
	private float g;
	private float h;
	private float i;
	private float j;
	private float k;
	private float l;
	private float m;
	private float n;
	private int o;
	private int p;
	private boolean q = false;
	private HandlerThread r;
	private boolean s;
	private TimeInterpolator t;
	private Handler u;

	public lw(Fan fan) {
		this.u = new Handler() {

			/*
			 * Enabled aggressive block sorting
			 */
			public void handleMessage(Message message) {
				switch (message.what) {
				default: {
					return;
				}
				case 0: {
					lw.this.e = ((Float) message.obj).floatValue();
					lw.this.h().o();
					return;
				}
				case 1: {
					lw.this.h().p();
					this.sendEmptyMessageDelayed(2, 100);
					return;
				}
				case 2: {
					if (lw.this.r == null)
						return;
					lw.this.r.quit();
					return;
				}
				}
			}
		};
		this.b = new WeakReference((Object) fan);
		this.c = new WeakReference((Object) fan.getBaseSectorArea());
		this.d = fan.i();
	}

	private TimeInterpolator a(float f1, float f2, float f3) {
		f2 = (int) (0.63F * f3);
		double d1 = f1;
		double d2 = (1.0F - f1) * 0.31F + f1;
		double ad[] = tt.a(new double[][] { new double[] { 0.0D, d1 },
				new double[] { 0.62999999523162842D, 1.0D },
				new double[] { 0.31499999761581421D, d2 } });
		f2 = (float) ad[0];
		f3 = (float) ad[1];
		float f4 = (float) ad[2];
		ad = tt.b(new double[][] { new double[] { 0.62999999523162842D, 1.0D },
				new double[] { 1.0D, 1.0D },
				new double[] { (double) 0.8779F, (double) 1.013F },
				new double[] { (double) 0.9704F, (double) 0.987F } });
		return new TimeInterpolator() {

			float a;
			float b;
			float c;
			float d;
			float e;
			float f;
			float g;
			float h;
			lw i;

			public float getInterpolation(float f5) {
				if (a == 1.0F) {
					return f5;
				}
				f5 = (f5 - a) / (1.0F - a);
				if (f5 < 0.63F) {
					return b * f5 * f5 + f5 * c + d;
				}
				if (f5 < 1.0F) {
					return e * f5 * f5 * f5 + f * f5 * f5 + f5 * g + h;
				} else {
					return 1.0F;
				}
			}

		};
	}

	private float b(float f) {
		this.j = this.i().getOuterSize();
		if (f <= this.j) {
			return f / this.j;
		}
		if (this.f) {
			return f * (f * this.g) + f * this.h + this.i;
		}
		try {
			this.l = to.t(this.j());
			this.n = this.d();
			this.k = this.j * this.j;
			this.m = this.l * this.l;
			this.g = (this.n - 1.0f)
					/ (this.m - this.k - 2.0f * this.l * (this.l - this.j));
			this.h = -2.0f * this.l * this.g;
			this.i = 1.0f - this.g * this.k - this.h * this.j;
			return this.i;
		} catch (Exception var3_2) {
			this.g = 0.0f;
			this.h = 0.0f;
			this.i = 1.0f;
			return this.i;
		} finally {
			this.f = true;
			return f * (f * this.g) + f * this.h + this.i;
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private boolean b(float f, float f2) {
		if (this.e >= 1.0f) {
			return true;
		}
		if (this.d) {
			if (f > (float) this.o) {
				if (f2 < (float) (-this.o))
					return true;
			}
			if (f < (float) (-this.p) && f2 > (float) this.p) {
				return false;
			}
		} else {
			if (f < (float) (-this.o)) {
				if (f2 < (float) (-this.o))
					return true;
			}
			if (f > (float) this.p && f2 > (float) this.p) {
				return false;
			}
		}
		if (this.e <= this.i().getHandTrackDismissThreshold())
			return false;
		boolean bl = true;
		if (!bl) {
			return false;
		}
		if (this.d) {
			if (f >= 0.0f)
				return true;
			if (f2 <= 0.0f)
				return true;
			return false;
		}
		if (f <= 0.0f)
			return true;
		if (f2 <= 0.0f)
			return true;
		return false;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private float d() {
		float f;
		int n = to.p(this.j());
		if (oy.a()) {
			f = 1.18f;
			do {
				return Math.min((float) (f * (float) n / this.j), (float) 1.3f);

			} while (true);
		}
		f = 1.08f;
		return Math.min((float) (f * (float) n / this.j), (float) 1.3f);
	}

	private void e() {
		if (!this.i().f()) {
			this.q = true;
			return;
		}
		this.q = false;
		final ValueAnimator valueAnimator = this.g();
		valueAnimator
				.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueAnimator) {
						lw.this.u.obtainMessage(0,
								valueAnimator.getAnimatedValue())
								.sendToTarget();
					}
				});
		valueAnimator
				.addListener((Animator.AnimatorListener) new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator) {
						lw.this.u.sendEmptyMessage(1);
					}
				});
		this.r = new HandlerThread("") {

			public void onLooperPrepared() {
				valueAnimator.start();
			}
		};
		this.r.start();
	}

	private void f() {
		Fan.b = true;
		this.h().a(true);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private ValueAnimator g() {
		float f = this.e;
		float f2 = 0.95f + 0.05f * Math.abs((float) (f - 1.0f));
		if (f > 1.0f) {
			ValueAnimator valueAnimator = ValueAnimator
					.ofFloat((float[]) new float[] { f, 1.0f });
			valueAnimator.setInterpolator((TimeInterpolator) new lt(false));
			valueAnimator
					.setDuration((long) ((int) (f2 * (float) (4 * ls.a()))));
			return valueAnimator;
		}
		float f3 = oy.a() ? f2 * (float) WatchItemSector.getDuration() : f2
				* (float) (6 * ls.a());
		try {
			this.t = this.a(f, f2, f3);
		} catch (Throwable var4_6) {
			this.t = new lt(false);
		}
		ValueAnimator valueAnimator = ValueAnimator
				.ofFloat((float[]) new float[] { f, 1.0f });
		valueAnimator.setDuration((long) ((int) f3));
		return valueAnimator;
	}

	private Fan h() {
		return (Fan) this.b.get();
	}

	private ll i() {
		return (ll) this.c.get();
	}

	private Context j() {
		return SwipeApplication.e();
	}

	public float a(float f) {
		if (this.t == null) {
			return f;
		}
		return this.t.getInterpolation(f);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a() {
		this.h();
		if (!(Fan.n() && this.q)) {
			return;
		}
		this.e();
	}

	public void a(float f, float f2) {
		this.h();
		if (!Fan.n()) {
			return;
		}
		this.s = true;
		if (this.b(f, f2)) {
			this.e();
			return;
		}
		this.q = false;
		this.f();
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a(int n) {
		int n2;
		this.h();
		if (!Fan.n()) {
			return;
		}
		this.e = this.b(n);
		this.h().o();
		try {
			int n3;
			n2 = n3 = ViewConfiguration.get((Context) this.j())
					.getScaledMinimumFlingVelocity();
		} catch (Exception var3_4) {
			n2 = vk.a(this.j(), 50.0f);
		}
		this.o = n2 * 3;
		this.p = n2 * 2;
	}

	public float b() {
		return this.e;
	}

	public boolean c() {
		return this.s;
	}

}
