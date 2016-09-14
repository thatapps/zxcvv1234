package com.main;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class wg extends View implements Animator.AnimatorListener,
		Handler.Callback {
	private static final String a = "Swipe." + wg.class.getSimpleName();
	private Drawable b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private boolean i;
	private boolean j;
	private float k = 0.0f;
	private final RectF l = new RectF();
	private final RectF m = new RectF();
	private Paint n;
	private int o;
	private int p;
	private float q;
	private float r;
	private boolean s;
	private boolean t;
	private boolean u;
	private long v;
	private Handler w;
	private int x;
	private final boolean y = true;
	private wh z;

	public wg(Context context) {
		this(context, null);
	}

	public wg(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public wg(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
		this.a(context, attributeSet, n);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private int a(double d) {
		int n = -1;
		int n2 = (int) Math.round((double) (d * (double) this.e()));
		if (n2 < 0) {
			n2 = this.d > 0 ? 0 : n;
		}
		if (n2 <= this.c) {
			return n2;
		}
		if (this.d >= this.c)
			return n;
		return this.c;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private int a(int n, boolean bl) {
		int n2 = View.MeasureSpec.getMode((int) n);
		int n3 = View.MeasureSpec.getSize((int) n);
		if (1073741824 == n2) {
			return n3;
		}
		int n4 = bl ? this.getPaddingLeft() + this.getPaddingRight() : this
				.getPaddingTop() + this.getPaddingBottom();
		int n5 = Math.max((int) (n4 + (int) this.r),
				(int) this.getSuggestedMinimumWidth());
		if (Integer.MIN_VALUE != n2)
			return n5;
		return Math.min((int) n5, (int) n3);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private void a(Context context, AttributeSet attributeSet, int n) {
		this.w = new Handler((Handler.Callback) this);
		TypedArray typedArray = context.getTheme().obtainStyledAttributes(
				attributeSet, in.CustomSeekBarStyle, n, R.style.fan_seek_bar);
		if (typedArray != null) {
			this.e = typedArray.getDimensionPixelSize(4, 0);
			this.b = typedArray.getDrawable(2);
			int n2 = this.b.getIntrinsicHeight() >> 1 + this.x;
			int n3 = this.b.getIntrinsicWidth() >> 1 + this.x;
			this.b.setBounds(-n3, -n2, n3, n2);
			this.c = typedArray.getInteger(0, 100);
			this.d = typedArray.getInteger(1, 0);
			int n4 = typedArray.getColor(5, 0);
			this.f = typedArray.getInt(6, 0);
			this.g = typedArray.getInt(7, 360);
			this.i = typedArray.getBoolean(8, false);
			this.j = true;
			this.r = typedArray.getDimension(3, 0.0f);
			int n5 = this.d > this.c ? this.c : this.d;
			this.d = n5;
			int n6 = this.d < 0 ? 0 : this.d;
			this.d = n6;
			int n7 = this.g > 360 ? 360 : this.g;
			this.g = n7;
			int n8 = this.g < 0 ? 0 : this.g;
			this.g = n8;
			int n9 = this.f > 360 ? 0 : this.f;
			int n10 = this.f = n9;
			int n11 = 0;
			if (n10 >= 0) {
				n11 = this.f;
			}
			this.f = n11;
			this.k = (float) this.d / (float) this.c * (float) this.g;
			this.n = new Paint();
			this.n.setColor(n4);
			this.n.setAntiAlias(true);
			this.n.setStyle(Paint.Style.STROKE);
			this.n.setStrokeWidth((float) this.e);
			if (this.i) {
				this.n.setStrokeCap(Paint.Cap.ROUND);
			}
			this.x = vk.a(context, 2.0f);
		}
		return;

	}

	private void a(MotionEvent motionEvent) {
		float f;
		float f2 = motionEvent.getX();
		if (this.a(f2, f = motionEvent.getY())) {
			return;
		}
		this.setPressed(true);
		this.b(this.a(this.b(f2, f)), true);
	}

	private boolean a(float f, float f2) {
		float f3 = f2 - this.r;
		float f4 = (float) Math.sqrt((double) (f * f + f3 * f3)) /* FCMPG this.q */;
		boolean bl = false;
		if (f4 < 0) {
			bl = true;
		}
		return bl;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private double b(float f, float f2) {
		float f3;
		double d;
		if (this.s) {
			f3 = f2 - this.r;
		} else {
			f -= this.r;
			f3 = this.r - f2;
		}
		if ((d = Math.toDegrees((double) (1.5707963267948966 + Math.atan2(
				(double) f3, (double) f) - Math.toRadians((double) this.h)))) < 0.0) {
			d += 360.0;
		}
		if (!this.s) {
			d -= 180.0;
		}
		return d - (double) this.f;
	}

	private void b(int n, boolean bl) {
		this.c(n, bl);
	}

	private void c() {
		if (this.z != null) {
			this.z.a(this);
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	private void c(int n, boolean bl) {
		if (n == -1) {
			return;
		}
		int n2 = n > this.c ? this.c : (n < 0 ? 0 : n);
		if (!bl) {
			n2 = this.c - n2;
		}
		if (this.d == n2)
			return;
		if (this.z != null) {
			int n3 = bl ? this.c - n2 : n2;
			this.z.a(this, n3, bl);
		}
		this.d = n2;
		this.k = (float) n2 / (float) this.c * (float) this.g;
		this.f();
		this.invalidate();
	}

	private void d() {
		if (this.z != null) {
			this.z.b(this);
		}
	}

	private float e() {
		return (float) this.c / (float) this.g;
	}

	private void f() {
		int n = (int) (-90.0f + ((float) this.f + this.k + (float) this.h));
		this.o = (int) (0.5 + (double) this.r
				* Math.cos((double) Math.toRadians((double) n)));
		this.p = (int) (0.5 + (double) this.r
				* Math.sin((double) Math.toRadians((double) n)));
	}

	public void a() {
		if (this.t) {
			if (!this.u) {
				return;
			}
			this.animate().cancel();
		}
		this.u = false;
		this.setVisibility(0);
		this.animate().alpha(1.0f)
				.setListener((Animator.AnimatorListener) this);
	}

	public void b() {
		if (this.t) {
			if (this.u) {
				return;
			}
			this.animate().cancel();
		}
		this.u = true;
		this.setAutoDismiss(0);
		this.animate().alpha(0.0f)
				.setListener((Animator.AnimatorListener) this);
	}

	protected void drawableStateChanged() {
		super.drawableStateChanged();
		if (this.b != null && this.b.isStateful()) {
			int[] arrn = this.getDrawableState();
			this.b.setState(arrn);
		}
		this.invalidate();
	}

	public int getArcRotation() {
		return this.h;
	}

	public int getArcWidth() {
		return this.e;
	}

	public float getRadius() {
		return this.r;
	}

	public int getStartAngle() {
		return this.f;
	}

	public int getSweepAngle() {
		return this.g;
	}

	public boolean handleMessage(Message message) {
		if (1 == message.what) {
			this.animate().alpha(0.0f)
					.setListener((Animator.AnimatorListener) this);
			return true;
		}
		return false;
	}

	public void onAnimationCancel(Animator animator) {
		this.t = false;
	}

	public void onAnimationEnd(Animator animator) {
		this.t = false;
		if (this.getAlpha() < 0.1f) {
			this.setVisibility(4);
		}
	}

	public void onAnimationRepeat(Animator animator) {
		this.t = true;
	}

	public void onAnimationStart(Animator animator) {
		this.t = true;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this
				.getLayoutParams();
		boolean bl = (layoutParams.gravity & SwipeApplication.a) == SwipeApplication.a;
		this.s = bl;
		layoutParams.setMargins(0,
				this.getResources().getDimensionPixelSize(2131427379), 0, 0);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onDraw(Canvas canvas) {
		float f;
		float f2;
		int n = -90 + this.h;
		int n2 = this.s ? this.f : -this.f;
		int n3 = n2 + n;
		RectF rectF = this.m;
		float f3 = n3;
		float f4 = this.s ? (float) this.g : (float) (-this.g);
		canvas.drawArc(rectF, f3, f4, false, this.n);
		if (this.s) {
			f = this.o;
			f2 = this.r + (float) this.p - (float) this.x;
		} else {
			f = this.r - (float) this.o;
			f2 = this.r + (float) this.p - (float) this.x;
		}
		canvas.translate(f, f2);
		this.b.draw(canvas);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onMeasure(int n, int n2) {
		int n3 = this.a(n, true);
		int n4 = this.a(n2, false);
		int n5 = Math.min((int) n3, (int) n4) - this.getPaddingLeft()
				- this.getPaddingRight();
		int n6 = n4 / 2 - n5 / 2;
		int n7 = n3 / 2 - n5 / 2;
		this.l.set((float) n7, (float) n6, (float) (n7 + n5), (float) (n6 + n5));
		if (this.s) {
			this.m.set((float) n7 - this.r, (float) n6, (float) (n7 + n5),
					(float) (n5 + n6) + this.r);
		} else {
			this.m.set((float) n7, (float) n6, (float) (n7 + n5) + this.r,
					(float) (n5 + n6) + this.r);
		}
		this.f();
		this.setTouchInSide(this.j);
		this.setMeasuredDimension(n3, n4);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public boolean onTouchEvent(MotionEvent motionEvent) {
		switch (motionEvent.getAction()) {
		default: {
			return true;
		}
		case 0: {
			this.w.removeMessages(1);
			this.c();
			this.a(motionEvent);
			return true;
		}
		case 2: {
			this.a(motionEvent);
			return true;
		}
		case 1:
		case 3: {
			this.d();
			this.setPressed(false);
			if (this.v <= 0)
				return true;
			this.w.sendEmptyMessageDelayed(1, this.v);
			return true;
		}
		}
	}

	public void setArcRotation(int n) {
		this.h = n;
		this.f();
	}

	public void setArcWidth(int n) {
		this.e = n;
		this.n.setStrokeWidth((float) n);
	}

	public void setAutoDismiss(long l) {
		this.v = l;
		if (this.v > 0) {
			this.w.sendEmptyMessageDelayed(1, this.v);
			return;
		}
		this.w.removeMessages(1);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void setGravity(boolean bl) {
		ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
		if (layoutParams == null)
			return;
		{
			int n = bl ? SwipeApplication.a : SwipeApplication.b;
			int n2 = n | 80;
			if (layoutParams instanceof LinearLayout.LayoutParams) {
				((LinearLayout.LayoutParams) layoutParams).gravity = n2;
				return;
			} else {
				if (!(layoutParams instanceof FrameLayout.LayoutParams))
					return;
				{
					((FrameLayout.LayoutParams) layoutParams).gravity = n2;
					return;
				}
			}
		}
	}

	public void setOnFanSeekBarChangeListener(wh wh) {
		this.z = wh;
	}

	public void setProgress(int n) {
		this.w.removeMessages(1);
		this.c(n, false);
	}

	public void setRadius(float f) {
		if (this.r != f) {
			this.r = f;
		}
	}

	public void setRadius(int n) {
		this.setRadius(this.getResources().getDimension(n));
	}

	public void setRoundedEdges(boolean bl) {
		this.i = bl;
		if (this.i) {
			this.n.setStrokeCap(Paint.Cap.ROUND);
			return;
		}
		this.n.setStrokeCap(Paint.Cap.SQUARE);
	}

	public void setStartAngle(int n) {
		this.f = n;
		this.f();
	}

	public void setSweepAngle(int n) {
		this.g = n;
		this.f();
	}

	public void setTouchInSide(boolean bl) {
		int n = this.b.getIntrinsicHeight() >> 1;
		int n2 = this.b.getIntrinsicWidth() >> 1;
		this.j = bl;
		if (this.j) {
			this.q = this.r / 4.0f;
			return;
		}
		this.q = this.r - (float) Math.min((int) n2, (int) n);
	}
}
