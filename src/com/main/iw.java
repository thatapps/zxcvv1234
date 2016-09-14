package com.main;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;

@SuppressLint("NewApi") public final class iw extends wa implements Handler.Callback {
	private Handler A;
	private iz B;
	private ValueAnimator C;
	private int D;
	private boolean u;
	private Interpolator v = new DecelerateInterpolator();
	private Interpolator w = new AccelerateDecelerateInterpolator();
	private int x;
	private int y;
	private ix z;

	public iw(Context paramContext, iz paramiz) {
		super(paramContext);
		this.B = paramiz;
		this.A = new Handler(this);
		this.u = false;
	}

	private void b(int n, int n2) {
		if (this.C == null) {
			this.C = ValueAnimator.ofInt((int[]) new int[] { n, n2 });
			this.C.setDuration(400);
			this.C.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueAnimator) {
					int n = (Integer) valueAnimator.getAnimatedValue();
					iw.this.z.setAlpha(n);
				}
			});
		} else {
			if (this.C.isRunning()) {
				this.C.end();
			}
			this.C.setIntValues(new int[] { n, n2 });
		}
		if (n != n2) {
			this.C.start();
			return;
		}
		this.z.setAlpha(n);
	}

	private void m() {
		super.c();
		this.A.removeMessages(3);
		this.A.sendMessageDelayed(Message.obtain(this.A, 3, 204, 102), 4000L);
		b(0, 204);
	}

	private void n() {
		super.d();
		this.A.removeMessages(3);
		a(false);
	}

	private void o() {
		int i = ir.b(getContext(), this.D);
		WindowManager.LayoutParams localLayoutParams = this.e;
		if (i > 0) {
		}
		for (int j = 0;; j = this.h - this.g) {
			localLayoutParams.x = j;
			this.e.y = ((int) (1.0F * this.i * Math.abs(i) / 100.0F));
			return;
		}
	}

	public void a() {
		super.a();
		this.A.removeCallbacksAndMessages(null);
	}

	void a(Message message) {
		if (!(this.q || this.s)) {
			return;
		}
		long l = System.currentTimeMillis();
		long l2 = 1 == message.what ? this.p : this.r;
		float f = (float) (l - l2) / 400.0f;
		if (f > 1.0f) {
			if (1 == message.what) {
				this.q = false;
				if (1 == this.c) {
					this.a(this.f, this.g);
				} else {
					this.a(0, 0);
				}
			} else {
				this.s = false;
				this.e.x = this.x;
				this.d.updateViewLayout((View) this,
						(ViewGroup.LayoutParams) this.e);
			}
			this.f();
			return;
		}
		float f2 = 1 == message.what ? this.v.getInterpolation(f) : this.w
				.getInterpolation(f);
		if (1 == message.what) {
			if (1 == this.c) {
				this.e.width = (int) (f2 * (float) this.g);
				this.e.height = (int) (f2 * (float) this.f);
				this.e.alpha = f2;
			} else {
				this.e.width = this.g - (int) (f2 * (float) this.g);
				this.e.height = this.f - (int) (f2 * (float) this.f);
				this.e.alpha = 1.0f - f2;
			}
			this.d.updateViewLayout((View) this,
					(ViewGroup.LayoutParams) this.e);
			this.A.sendEmptyMessageDelayed(1, 16);
			return;
		}
		if (2 != message.what)
			return;
		this.e.x = this.x < this.y ? this.y - (int) (f2 * (float) this.y)
				: this.y + (int) (f2 * (float) (this.x - this.y));
		this.d.updateViewLayout((View) this, (ViewGroup.LayoutParams) this.e);
		this.A.sendEmptyMessageDelayed(2, 16);
	}

	public void a(final boolean bl) {
        if (vk.o()) {
            this.z.a(false, bl);
            return;
        }
        this.a.post((Runnable)new Runnable(){

            public void run() {
                iw.this.z.a(false, bl);
            }
        });
    }

	protected boolean a(MotionEvent motionEvent) {
        this.A.removeMessages(3);
        int n = this.z.getAlpha();
        if (n < 204) {
            this.b(n, 204);
        }
        return super.a(motionEvent);
    }

	protected boolean a(MotionEvent paramMotionEvent1,
			MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2) {
		l();
		this.o = true;
		float f1 = paramMotionEvent2.getRawX() - this.m;
		float f2 = paramMotionEvent2.getRawY() - this.n;
		this.m = paramMotionEvent2.getRawX();
		this.n = paramMotionEvent2.getRawY();
		WindowManager.LayoutParams localLayoutParams1 = this.e;
		localLayoutParams1.x += (int) f1;
		WindowManager.LayoutParams localLayoutParams2 = this.e;
		localLayoutParams2.y += (int) f2;
		this.d.updateViewLayout(this, this.e);
		return true;
	}

	protected void b() {
		this.D = getResources().getConfiguration().orientation;
		this.e.height = this.z.getIntrinsicHeight();
		this.e.width = this.z.getIntrinsicWidth();
		o();
	}

	protected void b(MotionEvent paramMotionEvent) {
		super.b(paramMotionEvent);
	}

	 public void c() {
	        if (1 == this.b) {
	            return;
	        }
	        if (vk.o()) {
	            this.m();
	            return;
	        }
	        this.A.sendEmptyMessage(5);
	    }

	protected boolean c(MotionEvent paramMotionEvent) {
		this.B.j();
		return true;
	}

	 public void d() {
	        if (1 != this.b) {
	            return;
	        }
	        if (vk.o()) {
	            this.n();
	            return;
	        }
	        this.A.sendEmptyMessage(6);
	    }

	protected boolean d(MotionEvent paramMotionEvent) {
		vk.f(getContext());
		return true;
	}

	protected void e() {
		this.z = ix.a(getContext());
		ImageView localImageView = new ImageView(getContext());
		localImageView.setImageDrawable(this.z);
		this.a = localImageView;
	}

	protected void e(MotionEvent paramMotionEvent) {
		super.e(paramMotionEvent);
		this.A.sendMessageDelayed(Message.obtain(this.A, 3, 204, 102), 4000L);
	}

	protected void f() {
        if (2 == this.c) {
            ((ImageView)this.a).setImageDrawable(null);
            this.e.height = this.f;
            this.e.width = this.g;
            this.invalidate();
            return;
        } else {
            if (1 != this.c || ((ImageView)this.a).getDrawable() != null) return;
            {
                ((ImageView)this.a).setImageDrawable((Drawable)this.z);
                return;
            }
        }
    }

	 protected void f(MotionEvent motionEvent) {
	        this.A.sendMessageDelayed(Message.obtain((Handler)this.A, (int)3, (int)204, (int)102), 4000);
	        if (this.u) {
	            return;
	        }
	        this.y = this.e.x;
	        int n = this.y - this.j > 0 ? this.h - this.g : 0;
	        this.x = n;
	        int n2 = (int)(100.0f * (float)this.e.y / (float)this.i);
	        if (n2 <= 0) {
	            n2 = 1;
	        }
	        Context context = this.getContext();
	        if (this.x > 0) {
	            n2 = - n2;
	        }
	        ir.a(context, n2, this.D);
	        if (Math.abs((int)(this.x - this.y)) <= this.g) {
	            this.e.x = this.x;
	            this.d.updateViewLayout((View)this, (ViewGroup.LayoutParams)this.e);
	            this.f();
	            return;
	        }
	        this.s = true;
	        this.r = System.currentTimeMillis();
	        this.A.removeMessages(2);
	        this.A.sendEmptyMessageDelayed(2, 16);
	    }
	 public boolean g()
	    {
	        return e.x <= j;
	    }

	public int getPosY() {
		return this.e.y;
	}

	public int getPosYReversed() {
		return this.i - this.e.y;
	}

	public void h() {
		this.A.removeMessages(3);
		this.z.a(true);
		int i = this.z.getAlpha();
		this.A.obtainMessage(3, i, 204).sendToTarget();
		this.A.sendMessageDelayed(Message.obtain(this.A, 3, 204, 102), 4000L);
	}

	public boolean handleMessage(Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 1: 
            case 2: {
                this.a(message);
                do {
                    return true;
                   // break;
                } while (true);
            }
            case 3: {
                this.b(message.arg1, message.arg2);
                return true;
            }
            case 5: {
                this.m();
                return true;
            }
            case 6: 
        }
        this.n();
        return true;
    }

	public void i() {
	}

	protected void onConfigurationChanged(Configuration paramConfiguration) {
		super.onConfigurationChanged(paramConfiguration);
		if (paramConfiguration.orientation != this.D) {
			this.D = paramConfiguration.orientation;
			DisplayMetrics localDisplayMetrics = getResources()
					.getDisplayMetrics();
			this.i = localDisplayMetrics.heightPixels;
			this.j = (this.i >> 1);
			this.h = localDisplayMetrics.widthPixels;
			this.j = (this.h >> 1);
			o();
			if (isShown()) {
				this.d.updateViewLayout(this, this.e);
			}
		}
	}
}
