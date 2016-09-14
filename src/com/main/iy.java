package com.main;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowManager;

import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.notification.SwipeAccessibilityService;

@SuppressLint({ "ViewConstructor" })
public class iy extends View implements Handler.Callback {
	private final android.view.WindowManager.LayoutParams a;
	private boolean b;
	private VelocityTracker c;
	private float d;
	private float e;
	private boolean f;
	private final boolean g;
	private final boolean h;
	private int i;
	private int j;
	private final Handler k;
	private final Rect l;
	private final iz m;
	private pl n;
	private boolean o;

	public iy(SwipeService swipeservice, boolean flag, boolean flag1, int i1,
			iz iz1) {
		super(swipeservice);
		f = false;
		m = iz1;
		l = new Rect();
		g = flag;
		h = flag1;
		i = i1;
		k = new Handler(this);
		a = m.b();
		a();
	}

	public iy(SwipeService swipeservice, boolean flag, boolean flag1, iz iz1) {
		this(swipeservice, flag, flag1, 0, iz1);
	}

	private void a(float f1, float f2) {
		boolean flag;
		flag = true;
		boolean flag1;
		if (Math.abs(f2) > Math.abs(f1)) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		if (!flag1) {

			if (f1 <= 0.0F) {
				flag = false;
			}
			// if (true) goto _L4; else goto _L3
			SwipeAccessibilityService.a(l.left + (int) d, l.top + (int) e,
					flag1, flag);
			return;

		} else {

			if (f2 >= 0.0F) {
				flag = false;
			}

		}

	}

	private void a(MotionEvent motionevent) {
		if (c != null) {
			c.computeCurrentVelocity(1000);
			a(motionevent, Math.abs(c.getXVelocity()),
					Math.abs(c.getYVelocity()));
			return;
		} else {
			a(motionevent, 0.0F, 0.0F);
			return;
		}
	}

	private void a(MotionEvent motionevent, float f1, float f2) {
		if (b) {
			int i1 = getToucherId();
			float f3 = motionevent.getX() - d;
			float f4 = motionevent.getY() - e;
			int j1 = b(f3, f4);
			int k1 = k();
			int l1 = SwipeAccessibilityService.a(vk.a(getContext()), i1, k1);
			f1 = Math.min(f1, f2);
			if (h
					&& SwipeAccessibilityService.a
					&& SwipeAccessibilityService.a() != null
					&& ((5 == i || k1 > 2)
							&& (j1 > 75 && j1 < 105 || j1 > 255 && j1 < 285) || i != 3
							&& i != 2
							&& (l1 == 0 && f1 < (float) m.j || l1 == 21
									&& f1 < (float) m.k))) {
				a(f3, f4);
				return;
			}
			if (!o) {
				o = true;
				Fan.a.a(g, i1, j1, m.c, m.d, k1);
				lr lr = Fan.a;
				boolean flag;
				if (f1 < (float) m.l) {
					flag = true;
				} else {
					flag = false;
				}
				lr.j = flag;
				m.a(Fan.a);
				return;
			}
		}
	}

	private int b(float f1, float f2) {
		return (((int) (vk.a(f1, f2) - 90D) + 360) % 360 >> 1) << 1;
	}

	static boolean b(iy iy1) {
		return iy1.g;
	}

	private void j() {
		int n = this.j;
		if (this.h) {
			this.a.width = (int) ((float) this.m.q * this.m.o);
		}
		if (this.i == 1) {
			n = 4 * this.m.b;
		} else if (this.i == 5) {
			n -= 4 * this.m.b;
			WindowManager.LayoutParams layoutParams = this.a;
			layoutParams.width = (int) (0.7f * (float) layoutParams.width);
		} else if (this.i == 3) {
			n += this.j;
		}
		this.a.height = n;
		this.a.y = this.m.t;
		if (this.i == 2) {
			WindowManager.LayoutParams layoutParams = this.a;
			layoutParams.y = n + layoutParams.y;
			return;
		} else {
			if (this.i != 5)
				return;
			{
				this.a.y = 4 * this.m.b;
				return;
			}
		}
	}

	private int k() {
		if (h) {
			return (int) Math.ceil(((float) a.height - e) / (float) m.b);
		}
		float f1;
		if (!g) {
			f1 = (float) a.width - d;
		} else {
			f1 = d;
		}
		return (int) Math.ceil(f1 / (float) m.a);
	}

	void a() {
		a(false);
	}

	public void a(boolean flag) {
		float f1;
		int i1;
		int j1;
		if (h) {
			i1 = m.q;
		} else {
			i1 = m.s;
		}
		if (h) {
			j1 = m.p;
		} else {
			j1 = m.r;
		}
		j = j1;
		j1 = m.q;
		f1 = m.o;
		if (f1 != 1.0F) {
			i1 = (int) ((float) i1 * f1);
			j = (int) ((float) j * f1);
			j1 = (int) ((float) j1 * f1);
		}
		a.width = i1;
		j();
		if (!g) {
			if (h) {
				a.x = 0;
				l.left = m.m - a.width;
			} else {
				a.x = j1;
				l.left = m.m - a.width - j1;
			}
		} else if (h) {
			a.x = m.m - a.width;
			l.left = 0;
		} else {
			a.x = m.m - a.width - j1;
			l.left = j1;
		}
		l.right = l.left + a.width;
		l.bottom = m.n - a.y;
		l.top = l.bottom - a.height;
		if (n != null) {
			n.a(a.width, a.height);
		}
		if (flag && f()) {
			m.b(this, a);
		}
	}

	public void b() {
		if (n != null) {
			n.b();
		}
	}

	public void b(boolean paramBoolean) {
		if (this.n != null) {
			this.n.a(paramBoolean);
		}
	}

	public void c() {
		k.post(new Runnable() {

			final iy a;

			public void run() {
				if (iy.a(a) == null) {
					iy.a(a, new pl(a, iy.b(a)));
				}
				iy.a(a).a(iy.c(a).width, iy.c(a).height);
				iy.a(a).a();
			}

			{
				a = iy.this;
				// super();
			}
		});
	}

	static WindowManager.LayoutParams c(iy iy) {
		return iy.a;
	}

	public void d() {
		setBackgroundResource(0x7f0a0027);
	}

	public void e() {
		setBackgroundResource(0x106000d);
	}

	public boolean f() {
		return b;
	}

	public void g() {
		if (b) {
			return;
		}
		if (!vk.o()) {
			k.sendEmptyMessage(1);
			return;
		}
		if (n != null) {
			n.d();
		}
		b = m.a(this, a);
	}

	public Rect getBoundsInScreen() {
		return this.l;
	}

	int getToucherId() {
		int i1;
		int j1;
		if (!h) {
			i1 = 4;
		} else {
			i1 = i;
		}
		j1 = i1;
		if (!g) {
			j1 = -i1;
		}
		return j1;
	}

	public int getType() {
		return this.i;
	}

	public void h() {
		boolean flag = false;
		if (!b) {
			return;
		}
		if (!vk.o()) {
			k.sendEmptyMessage(4);
			return;
		}
		b(false);
		if (!m.a(this)) {
			flag = true;
		}
		b = flag;
	}

	public boolean handleMessage(Message message) {
		switch (message.what) {
		case 1: {
			if (!pq.a()) {
				if (SwipeService.h())
					return true;
			}
			this.g();
		}
		default: {
			return true;
		}
		case 4:

			this.h();
		}
		return true;
	}

	public void i() {
		this.m.b(this, this.a);
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (n != null) {
			n.d();
			n = null;
		}
	}

	protected void onDraw(Canvas paramCanvas) {
		super.onDraw(paramCanvas);
		if (this.n != null) {
			this.n.a(paramCanvas);
		}
	}

	@SuppressLint({ "NewApi" })
	// public boolean onTouchEvent(MotionEvent var1_1) {
	// float var6_2, var7_3, var8_4, var9_5, var2_6, var3_7, var4_8;
	//
	// if (this.c == null) {
	// this.c = VelocityTracker.obtain();
	// }
	// this.c.addMovement(var1_1);
	// int action = var1_1.getAction();
	// switch (action) {
	// case 0: {
	// this.d = var1_1.getX();
	// this.e = var1_1.getY();
	// this.f = false;
	// this.o = false;
	// break;
	// }
	// case 1: {
	// if (this.f) {
	// this.c.computeCurrentVelocity(1000);
	// var6_2 = this.c.getXVelocity();
	// var7_3 = this.c.getYVelocity();
	// var8_4 = Math.abs((float) var6_2);
	// var9_5 = Math.abs((float) var7_3);
	// if (Math.max((float) var8_4, (float) var9_5) > (float) this.m.h
	// || var8_4 * var8_4 + var9_5 * var9_5 > (float) this.m.i) {
	// this.a(var1_1, var8_4, var9_5);
	// }
	// if (Fan.j()) {
	// Fan.getInstance().a(var6_2, var7_3);
	// }
	// } else if (this.n != null && this.n.c()) {
	// this.b(true);
	// this.m.k();
	// } else {
	// this.h();
	// this.k.sendEmptyMessageDelayed(1, 2000);
	// if (SwipeAccessibilityService.a) {
	// SwipeAccessibilityService.a(this.l.left + (int) this.d,
	// this.l.top + (int) this.e);
	// }
	// }
	// if (this.c == null)
	//
	// this.c.recycle();
	// this.c = null;
	// return super.onTouchEvent(var1_1);
	// }
	//
	// case 2:
	//
	// var2_6 = Math.abs((float) (var1_1.getX() - this.d));
	// var3_7 = Math.abs((float) (var1_1.getY() - this.e));
	// if (!(this.f || var2_6 <= (float) this.m.e
	// && var3_7 <= (float) this.m.e)) {
	// this.f = true;
	// }
	// if (this.f
	// && (Math.max((float) var2_6, (float) var3_7) > (float) this.m.f || var2_6
	// * var2_6 + var3_7 * var3_7 > (float) this.m.g)) {
	// this.a(var1_1);
	// }
	// if (Fan.j() == false)
	// return super.onTouchEvent(var1_1);
	// int i1 = (int) Math.hypot(var1_1.getX(), var1_1.getY()
	// - (float) getHeight());
	// Fan.getInstance().a(i1);
	// return super.onTouchEvent(var1_1);
	//
	// default: {
	// return super.onTouchEvent(var1_1);
	// }
	// }
	// return super.onTouchEvent(var1_1);
	// }
	public boolean onTouchEvent(MotionEvent var1) {

		if (this.c == null) {
			this.c = VelocityTracker.obtain();
		}

		this.c.addMovement(var1);
		float var2;
		float var3;
		switch (var1.getAction()) {
		case 0:
			this.d = var1.getX();
			this.e = var1.getY();
			this.f = false;
			this.o = false;
			break;
		case 1:
			if (this.f) {
				this.c.computeCurrentVelocity(1000);
				var2 = this.c.getXVelocity();
				var3 = this.c.getYVelocity();
				float var4 = Math.abs(var2);
				float var5 = Math.abs(var3);
				if (Math.max(var4, var5) > (float) this.m.h
						|| var4 * var4 + var5 * var5 > (float) this.m.i) {
					this.a(var1, var4, var5);
				}

				if (Fan.j()) {
					Fan.getInstance().a(var2, var3);
				}
			} else if (this.n != null && this.n.c()) {
				this.b(true);
				this.m.k();
			} else {
				this.h();
				this.k.sendEmptyMessageDelayed(1, 2000L);
				if (SwipeAccessibilityService.a) {
					SwipeAccessibilityService.a(this.l.left + (int) this.d,
							this.l.top + (int) this.e);
				}
			}

			if (this.c != null) {
				this.c.recycle();
				this.c = null;
			}
			break;
		case 2:
			var2 = Math.abs(var1.getX() - this.d);
			var3 = Math.abs(var1.getY() - this.e);
			if (!this.f && (var2 > (float) this.m.e || var3 > (float) this.m.e)) {
				this.f = true;
			}

			if (this.f
					&& (Math.max(var2, var3) > (float) this.m.f || var2 * var2
							+ var3 * var3 > (float) this.m.g)) {
				this.a((MotionEvent) var1);
			}

			if (Fan.j()) {
				int var6 = (int) Math.hypot((double) var1.getX(),
						(double) (var1.getY() - (float) this.getHeight()));
				Fan.getInstance().a(var6);
			}
		
		}

		return super.onTouchEvent(var1);
	}

	static pl a(iy iy1) {
		return iy1.n;
	}

	static pl a(iy iy1, pl pl1) {
		iy1.n = pl1;
		return pl1;
	}

	public void setType(int i1) {
		if (i != i1) {
			i = i1;
			j();
			if (n != null) {
				n.a(a.width, a.height);
			}
			if (f()) {
				m.b(this, a);
			}
		}
	}
}
