package com.main;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */

/*
 * Failed to analyse overrides
 */
public abstract class wa extends FrameLayout implements View.OnTouchListener {
	protected View a;
	protected int b;
	protected int c;
	protected final WindowManager d;
	protected final WindowManager.LayoutParams e;
	protected int f;
	protected int g;
	protected int h;
	protected int i;
	protected int j;
	protected final int k;
	protected final int l;
	protected float m;
	protected float n;
	protected boolean o;
	protected long p;
	protected boolean q;
	protected long r;
	protected boolean s;
	protected boolean t = true;
	private GestureDetector u;

	public wa(Context context) {
		super(context);
		ViewConfiguration viewConfiguration = ViewConfiguration
				.get((Context) context);
		this.k = viewConfiguration.getScaledTouchSlop();
		this.l = viewConfiguration.getScaledMinimumFlingVelocity();
		this.d = (WindowManager) context.getSystemService("window");
		DisplayMetrics displayMetrics = context.getResources()
				.getDisplayMetrics();
		this.i = displayMetrics.heightPixels;
		this.h = displayMetrics.widthPixels;
		this.j = this.h >> 1;
		this.e = new WindowManager.LayoutParams();
		this.e.type = 2003;
		this.e.format = 1;
		this.e.flags = 40;
		this.e.width = -2;
		this.e.height = -2;
		this.e.gravity = 51;
		this.e();
		this.b();
		if (this.a == null) {
			throw new RuntimeException(
					"You must set up Content view in setContentView()");
		}
		if (!this.a.equals((Object) this)) {
			this.addView(this.a, -1, -1);
		}
		this.u = new GestureDetector(context,
				new android.view.GestureDetector.SimpleOnGestureListener() {

					final wa a;

					public boolean onDoubleTap(MotionEvent motionevent) {
						return a.d(motionevent);
					}

					public boolean onDoubleTapEvent(MotionEvent motionevent) {
						if (1 == motionevent.getAction() && a.t) {
							a.setBackgroundResource(0x106000d);
						}
						return super.onDoubleTapEvent(motionevent);
					}

					public boolean onDown(MotionEvent motionevent) {
						if (!a.t)
							;
						return a.a(motionevent);
					}

					public boolean onFling(MotionEvent motionevent,
							MotionEvent motionevent1, float f1, float f2) {
						if (a.t) {
							a.setBackgroundResource(0x106000d);
						}
						return a.b(motionevent, motionevent1, f1, f2);
					}

					public void onLongPress(MotionEvent motionevent) {
						if (a.t) {
							a.setBackgroundResource(0x106000d);
						}
						a.b(motionevent);
					}

					public boolean onScroll(MotionEvent motionevent,
							MotionEvent motionevent1, float f1, float f2) {
						if (!a.t)
							;
						return a.a(motionevent, motionevent1, f1, f2);
					}

					public void onShowPress(MotionEvent motionevent) {
						if (!a.t)
							;
						a.g(motionevent);
					}

					public boolean onSingleTapConfirmed(MotionEvent motionevent) {
						if (a.t) {
							a.setBackgroundResource(0x106000d);
						}
						return a.c(motionevent);
					}

					public boolean onSingleTapUp(MotionEvent motionevent) {
						return super.onSingleTapUp(motionevent);
					}

					{
						a = wa.this;
						// super();
					}
				});
		setOnTouchListener(this);

	}

	public void a() {
		if (this.b == 0) {
			return;
		}
		this.b = 0;
		this.c = 0;
		this.d.removeView((View) this);
	}

	protected void a(int n, int n2) {
		this.e.height = n;
		this.e.width = n2;
		this.e.alpha = 1.0f;
		this.d.updateViewLayout((View) this, (ViewGroup.LayoutParams) this.e);
	}

	protected boolean a(MotionEvent motionEvent) {
		this.m = motionEvent.getRawX();
		this.n = motionEvent.getRawY();
		return true;
	}

	protected boolean a(MotionEvent motionEvent, MotionEvent motionEvent2,
			float f, float f2) {
		return false;
	}

	protected abstract void b();

	protected void b(MotionEvent motionEvent) {
	}

	boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f,
			float f2) {
		return false;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void c() {
		if (1 == this.b) {
			return;
		}
		this.c = 1;
		if (this.b == 0) {
			this.l();
			this.d.addView((View) this, (ViewGroup.LayoutParams) this.e);
			this.f();
		} else {
			this.j();
		}
		this.b = this.c;
	}

	protected boolean c(MotionEvent motionEvent) {
		return false;
	}

	public void d() {
		if (1 == this.b) {
			this.c = 2;
			this.k();
			this.b = this.c;
		}
	}

	protected boolean d(MotionEvent motionEvent) {
		return false;
	}

	protected abstract void e();

	protected void e(MotionEvent motionEvent) {
	}

	protected void f() {
	}

	protected void f(MotionEvent motionEvent) {
	}

	protected void g(MotionEvent motionEvent) {
	}

	protected void j() {
		this.l();
		this.e.height = this.f;
		this.d.updateViewLayout((View) this, (ViewGroup.LayoutParams) this.e);
		this.f();
	}

	protected void k() {
		this.l();
		this.e.height = 0;
		this.d.updateViewLayout((View) this, (ViewGroup.LayoutParams) this.e);
		this.f();
	}

	protected void l() {
	}

	protected void onLayout(boolean bl, int n, int n2, int n3, int n4) {
		super.onLayout(bl, n, n2, n3, n4);
		if (this.g == 0 && this.f == 0) {
			this.g = n3 - n2;
			this.f = n4 - n2;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public boolean onTouch(View view, MotionEvent motionEvent) {
		if (this.u.onTouchEvent(motionEvent)) {
			return true;
		}
		int n = motionEvent.getAction();
		if (1 == n || 3 == n) {
			if (this.t) {
				this.setBackgroundResource(17170445);
			}
			if (this.o) {
				this.o = false;
				this.f(motionEvent);
			}
		} else {
			do {
				return false;

			} while (true);
		}
		this.e(motionEvent);
		return false;
	}

}
