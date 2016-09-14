package com.lazyswipe.widget;

import java.util.Iterator;
import java.util.LinkedList;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import com.main.in;
import com.main.vj;
import com.main.vk;
import com.main.wm;
import com.main.wn;
import com.main.wo;
import com.main.wp;
import com.main.wq;
import com.main.wr;

public class GridGallery extends AdapterView {

	private boolean A;
	private boolean B;
	private int C;
	private int D;
	private int E;
	private int F;
	private int G;
	private int H;
	private VelocityTracker I;
	private int J;
	private boolean K;
	private int a;
	private int b;
	private int c;
	private int d[] = { 1, 1, 1 };
	private BaseAdapter e;
	private wn f;
	private int g;
	private LinkedList h;
	private LinkedList i;
	private boolean j[];
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private boolean s;
	private wr t;
	private wo u;
	private wp v;
	private wq w;
	private int x;
	private boolean y;
	private int z;

	public GridGallery(Context var1) {
		this(var1, (AttributeSet) null);
	}

	public GridGallery(Context var1, AttributeSet var2) {
		this(var1, var2, 0);
	}

	public GridGallery(Context var1, AttributeSet var2, int var3) {

		super(var1, var2, var3);
		this.a = 0;
		boolean var5 = true;
		this.b = 0;
		this.c = 0;
		this.d = new int[] { 1, 1, 1 };
		this.h = new LinkedList();
		this.i = new LinkedList();
		this.j = new boolean[1];
		this.m = 1;
		this.n = 0;
		this.o = 0;
		this.p = -1;
		this.q = 0;
		this.r = 0;
		this.s = false;
		this.t = new wr(this);
		this.x = 0;
		this.y = false;
		this.A = true;
		this.B = true;
		this.C = 0;
		this.K = false;
		this.setFocusableInTouchMode(true);
		this.setWillNotDraw(false);
		this.setAlwaysDrawnWithCacheEnabled(false);
		this.setHorizontalScrollBarEnabled(true);
		TypedArray var6 = var1.obtainStyledAttributes(var2, in.GridGallery,
				var3, 0);
		this.m = var6.getInt(3, this.m);
		var3 = var6.getInt(0, 1);
		int var4 = var6.getInt(1, 1);
		this.a = var6.getDimensionPixelSize(2, this.a);
		if (var6.getInt(4, 0) != 0) {
			var5 = false;
		}

		this.A = var5;
		var6.recycle();
		this.a(var4, var3);
		this.b = this.a;
		this.a((Context) var1);
		this.setClipToPadding(false);
		this.z = vk.a(var1, 20.0F);
	}

	
	public static int a(GridGallery var0, int var1) {
		var0.g = var1;
		return var1;
	}

	private View a(int var1, boolean[] var2) {
		var2[0] = false;
		View var3 = (View) this.i.poll();
		if (var3 != null) {
			View var4 = this.e.getView(var1, var3, this);
			if (var4 != var3) {
				this.i.add(var3);
			} else {
				var2[0] = true;
			}

			return var4;
		} else {
			return this.e.getView(var1, (View) null, this);
		}
	}


	public static LinkedList a(GridGallery var0) {
		return var0.h;
	}

	private void a(int var1) {
		if (var1 != 0) {
			int var3;
			int var4;
			if (var1 > 0) {
				var3 = var1;
				if (this.c > 0) {
					var3 = var1;
					if (this.o == 0) {
						var3 = var1 / 2;
					}
				}
			} else {
				int var5 = -this.c;
				int var6 = this.o;
				if (this.A) {
					var4 = this.getWidth();
				} else {
					var4 = this.getHeight();
				}

				var3 = var1;
				if (var5 > var4 * var6) {
					var3 = var1;
					if (this.o == this.n - 1) {
						var3 = var1 / 2;
					}
				}
			}

			var4 = this.getChildCount();
			if (!this.awakenScrollBars()) {
				this.invalidate();
			}

			for (var1 = 0; var1 < var4; ++var1) {
				if (this.A) {
					this.getChildAt(var1).offsetLeftAndRight(var3);
				} else {
					this.getChildAt(var1).offsetTopAndBottom(var3);
				}
			}

			this.c += var3;
			if (this.v != null) {
				float var2;
				if (this.A) {
					var2 = (float) this.getWidth();
				} else {
					var2 = (float) this.getHeight();
				}

				var2 = -(((float) this.c + (float) this.o * var2) / var2);
				this.v.a(this.getCurrentScreen(), var2);
				if (this.r == this.e.getCount() - 1 && var2 > 0.0F) {
					this.v.b(true);
					return;
				}

				if (this.r == 0 && var2 < 0.0F) {
					this.v.b(false);
					return;
				}
			}
		}

	}

	private void a(int var1, float var2) {
		var1 = Math.max(0, Math.min(var1, this.n - 1));
		this.p = var1;
		int var3 = this.c;
		int var4 = -var1;
		if (this.A) {
			var1 = this.getWidth();
		} else {
			var1 = this.getHeight();
		}

		int var5 = this.c;
		this.t.a(var3, var1 * var4 - var5, var2);
		this.e();
	}

	private void a(int var1, boolean var2) {
		int var3 = var1;
		if (var1 == -1) {
			var3 = this.getChildCount() - 1;
		}

		View var12 = this.getChildAt(var3);
		if (var12 != null) {
			int var5 = var12.getMeasuredWidth();
			int var6 = var12.getMeasuredHeight();
			var1 = var3 / this.d[2];
			int var4;
			if (this.A) {
				var4 = this.c + this.getPaddingLeft() + this.k / 2 + var3
						% this.d[1] * (this.a + this.k) + var1
						* this.getWidth();
				if (this.d[0] == 1) {
					var1 = (this.getMeasuredHeight() - this.l
							- this.getPaddingTop() - this.getPaddingBottom())
							/ 2 + this.getPaddingTop() + var6 / 2;
					var3 = var4;
				} else {
					var1 = this.getPaddingTop() + this.l / 2 + var3 % this.d[2]
							/ this.d[1] * (this.l + this.b);
					var3 = var4;
				}
			} else {
				var4 = this.c;
				int var7 = this.getPaddingTop();
				int var8 = this.l / 2;
				int var9 = this.d[1];
				int var10 = this.b;
				int var11 = this.l;
				var1 = var1 * this.getHeight() + var4 + var7 + var8 + var3
						% var9 * (var10 + var11);
				if (this.d[1] == 1) {
					var3 = (this.getMeasuredWidth() - this.k
							- this.getPaddingLeft() - this.getPaddingRight())
							/ 2 + this.getPaddingLeft() + var5 / 2;
				} else {
					var3 = this.getPaddingLeft() + this.k / 2 + var3
							% this.d[2] / this.d[0] * (this.k + this.a);
				}
			}

			if (var2 && var12.isLayoutRequested()) {
				var12.measure(MeasureSpec.makeMeasureSpec(var5, 1073741824),
						MeasureSpec.makeMeasureSpec(var6, 1073741824));
			}

			var12.layout(var3 - var5 / 2, var1 - var6 / 2, var3 + var5 / 2,
					var1 + var6 / 2);
		}
	}

	private void a(Context var1) {
		ViewConfiguration var2 = ViewConfiguration.get(var1);
		this.D = var2.getScaledTouchSlop();
		this.F = var2.getScaledMinimumFlingVelocity();
		this.E = var2.getScaledMaximumFlingVelocity();
	}

	private void a(MotionEvent var1) {
		this.a(false);
		this.c((MotionEvent) var1);
		this.G = (int) var1.getX();
		this.H = (int) var1.getY();
		if (this.t.b()) {
			this.C = 0;
		} else {
			this.t.a();
			this.C = 1;
		}
	}

	private void a(View var1) {
		wm var2 = (wm) var1.getLayoutParams();
		if (var2 != null) {
			var2.a = true;
		}

	}

	private void a(View var1, int var2, boolean var3) {
		wm var5 = (wm) var1.getLayoutParams();
		wm var4 = var5;
		if (var5 == null) {
			var4 = this.a();
		}

		if (var4.a) {
			this.attachViewToParent(var1, var2, var4);
		} else {
			this.addViewInLayout(var1, var2, var4);
		}

		if (!var3 || var1.isLayoutRequested()) {
			var1.measure(
					getChildMeasureSpec(
							MeasureSpec.makeMeasureSpec(this.k, 1073741824), 0,
							var4.width),
					getChildMeasureSpec(
							MeasureSpec.makeMeasureSpec(this.l, 1073741824), 0,
							var4.height));
		}

		this.a(var2, false);
	}

	
	public static boolean a(GridGallery var0, boolean var1) {
		var0.s = var1;
		return var1;
	}

	private View b(int var1, int var2) {
		View var3 = this.a(var1, this.j);
		this.a(var3, var2, this.j[0]);
		return var3;
	}

	private void b() {
		VelocityTracker var2 = this.I;
		this.I = null;
		this.f();
		var2.computeCurrentVelocity(1000, (float) this.E);
		float var1;
		if (this.A) {
			var1 = var2.getXVelocity();
		} else {
			var1 = var2.getYVelocity();
		}

		var2.recycle();
		if (!this.g()) {
			if (var1 > (float) this.F) {
				this.a(this.o - 1, var1);
			} else if (var1 < (float) (-this.F)) {
				this.a(this.o + 1, var1);
			} else {
				this.c();
			}
		} else {
			this.c();
		}
	}

	private void b(MotionEvent var1) {
		int var2 = (int) var1.getX();
		int var3 = (int) var1.getY();
		this.d((MotionEvent) var1);
		if (this.C == 1) {
			if (!this.g()) {
				if (this.A) {
					this.a(var2 - this.G);
				} else {
					this.a(var3 - this.H);
				}
			}

			this.G = var2;
			this.H = var3;
		} else {
			if (this.A && Math.abs(var2 - this.G) > this.D || !this.A
					&& Math.abs(var3 - this.H) > this.D) {
				this.C = 1;
				this.G = var2;
				this.H = var3;
			}

		}
	}

	
	public static void b(GridGallery var0) {
		var0.detachAllViewsFromParent();
	}

	
	public static void b(GridGallery var0, int var1) {
		var0.a(var1);
	}

	private void b(boolean var1) {
		this.p = -1;
		if (var1 && this.u != null) {
			this.u.a(this.r);
		}

		this.a(true);
	}

	
	public static BaseAdapter c(GridGallery var0) {
		return var0.e;
	}

	private void c() {
		int var1;
		if (this.A) {
			var1 = this.getWidth();
		} else {
			var1 = this.getHeight();
		}

		this.a((-this.c + var1 / 2) / var1, 0.0F);
	}

	private void c(MotionEvent var1) {
		if (this.K) {
			this.J = -1;
		}
	}

	private void d() {
		byte var4 = 0;
		int var2;
		if (this.p == -1) {
			var2 = 0;
		} else {
			var2 = this.p - this.o;
		}

		if (var2 == 0) {
			this.b(false);
		} else {
			int var1 = this.d[2];
			int var3;
			if (this.A) {
				var3 = this.getWidth();
			} else {
				var3 = this.getHeight();
			}

			int var6 = this.getChildCount();
			int var5;
			Iterator var7;
			View var9;
			if (var2 < 0) {
				--this.o;
				--this.r;
				if (this.n - 1 - this.o > this.m) {
					var5 = (this.o + this.m + 1) * var1;
					var6 = Math.min(var1, var6 - var5);

					for (var2 = var6 - 1; var2 >= 0; --var2) {
						this.a((View) ((View) this.h.removeLast()), false);
					}

					this.detachViewsFromParent(var5, var6);
					--this.n;
				}

				var5 = this.r - this.o;
				if (var5 == 0) {
					var7 = this.i.iterator();

					while (true) {
						var3 = var1;
						if (!var7.hasNext()) {
							break;
						}

						this.removeDetachedView((View) var7.next(), false);
					}
				} else {
					this.c -= var3;

					for (var2 = var4; var2 < var1; ++var2) {
						var9 = this.b((var5 - 1) * var1 + var2, var2);
						this.h.addFirst(var9);
					}

					++this.o;
					var3 = var1;
				}
			} else {
				++this.o;
				++this.r;
				var2 = var1;
				if (this.o > this.m) {
					for (var2 = 0; var2 < var1 && this.h.size() > 0; ++var2) {
						this.a((View) ((View) this.h.removeFirst()), false);
					}

					if (var2 > 0) {
						this.detachViewsFromParent(0, var2);
						var1 = var2;
					}

					--this.o;
					--this.n;
					this.c += var3;
					var2 = var1;
				}

				if (this.q - this.r - (this.n - this.o) <= 0) {
					var7 = this.i.iterator();

					while (true) {
						var3 = var2;
						if (!var7.hasNext()) {
							break;
						}

						this.removeDetachedView((View) var7.next(), false);
					}
				} else {
					var1 = (this.r + this.m) * var2;
					var5 = Math.min(this.e.getCount() - var1, var2);
					int var8 = 0;

					while (true) {
						var3 = var2;
						if (var8 >= var5) {
							break;
						}

						var9 = this.b(var1, -1);
						this.h.addLast(var9);
						++var8;
						++var1;
					}
				}
			}

			this.n = (this.getChildCount() - 1) / var3 + 1;
			Log.d("Swipe.GridGallery", "bufferIndex " + this.o
					+ ", currentScreen " + this.r + ", bufferSize " + this.n);
			this.invalidate();
			this.b(true);
		}
	}

	private void d(MotionEvent var1) {
		byte var3 = 1;
		byte var2 = 1;
		if (this.K) {
			if (this.J < 0) {
				int var4 = (int) Math.abs(var1.getY() - (float) this.H);
				int var5 = (int) Math.abs(var1.getX() - (float) this.G);
				if (var5 > this.D || var4 > this.D) {
					if (!this.A && var5 > this.D && var5 > var4) {
						if ((float) this.G <= var1.getX()) {
							var2 = 2;
						}

						this.J = var2;
						return;
					}

					if (this.A && var4 > this.D && var4 > var5) {
						if ((float) this.H > var1.getY()) {
							var2 = var3;
						} else {
							var2 = 2;
						}

						this.J = var2;
						return;
					}

					this.J = 0;
					return;
				}
			} else if (this.J > 0) {
				if (this.J == 1
						&& (!this.A && var1.getX() > (float) this.G || this.A
								&& var1.getY() > (float) this.H)) {
					this.J = 0;
					return;
				}

				if (this.J == 2
						&& (!this.A && var1.getX() < (float) this.G || this.A
								&& var1.getY() < (float) this.H)) {
					this.J = 0;
					return;
				}
			}
		}

	}

	
	public static void d(GridGallery var0) {
		var0.d();
	}

	private void e() {
		int var1;
		if (this.p == -1) {
			var1 = 0;
		} else {
			var1 = this.p - this.o;
		}

		if (var1 != 0 && this.u != null) {
			this.u.b(var1 + this.r);
		}

	}

	
	public static boolean e(GridGallery var0) {
		return var0.A;
	}

	private void f() {
		if (!this.K) {
			;
		}

	}

	private boolean g() {
		return this.K && this.J > 0;
	}

	protected wm a() {
		return new wm(this, -1, -1);
	}

	public wm a(AttributeSet var1) {
		return new wm(this, this.getContext(), var1);
	}

	protected wm a(LayoutParams var1) {
		return new wm(this, var1);
	}

	public void a(int var1, int var2) {
		if (var1 >= 1 && var2 >= 1) {
			boolean var4;
			if (this.d[0] != var1) {
				this.d[0] = var1;
				var4 = true;
			} else {
				var4 = false;
			}

			if (this.d[1] != var2) {
				this.d[1] = var2;
				var4 = true;
			}

			if (var4) {
				this.d[2] = this.d[0] * this.d[1];

				while (true) {
					View var3 = (View) this.h.poll();
					if (var3 == null) {
						this.detachAllViewsFromParent();
						this.s = true;
						this.requestLayout();
						return;
					}

					this.a((View) var3, true);
				}
			}
		}

	}

	public void a(View var1, boolean var2) {
		this.a((View) var1);
		if (var2) {
			var1.forceLayout();
		}

		this.i.add(var1);
		if (this.w != null) {
			this.w.a(var1);
		}

	}

	protected void a(boolean var1) {
		if (this.B != var1) {
			this.B = var1;
			if (this.v != null) {
				this.v.a(var1);
			}
		}

	}

	protected boolean canAnimate() {
		return this.getLayoutAnimation() != null && this.g > 0;
	}

	protected boolean checkLayoutParams(LayoutParams var1) {
		return var1 instanceof wm;
	}

	protected int computeHorizontalScrollExtent() {
		return this.getWidth();
	}

	protected int computeHorizontalScrollOffset() {
		if (this.q != 1) {
			int var1 = this.r * this.getWidth() - this.o * this.getWidth()
					- this.c;
			if (var1 >= 0) {
				return var1;
			}
		}

		return 0;
	}

	protected int computeHorizontalScrollRange() {
		int var1 = this.q * this.getWidth();
		if (this.q != 1) {
			if (this.r == 0 && this.c > 0) {
				return var1 + (this.c - this.o * this.getWidth());
			}

			if (this.r == this.q - 1 && this.c < -this.o * this.getWidth()) {
				return var1 + (-this.c - this.o * this.getWidth());
			}
		}

		return var1;
	}

	
	protected LayoutParams generateDefaultLayoutParams() {
		return this.a();
	}

	
	public LayoutParams generateLayoutParams(AttributeSet var1) {
		return this.a((AttributeSet) var1);
	}


	protected LayoutParams generateLayoutParams(LayoutParams var1) {
		return this.a((LayoutParams) var1);
	}

	public BaseAdapter getAdapter() {
		return this.e;
	}

	public int getCount() {
		return this.e == null ? 0 : this.e.getCount();
	}

	public int getCurrentScreen() {
		return this.r;
	}

	public int getScreenCount() {
		return this.q;
	}

	public View getSelectedView() {
		return null;
	}

	public boolean onInterceptTouchEvent(MotionEvent var1) {
		boolean var2 = false;
		switch (var1.getAction() & 255) {
		case 0:
			this.a((MotionEvent) var1);
			break;
		case 1:
		case 3:
			this.C = 0;
			break;
		case 2:
			this.b((MotionEvent) var1);
		}

		if (this.C != 0) {
			var2 = true;
		}

		return var2;
	}

	protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
		byte var6 = 0;
		super.onLayout(var1, var2, var3, var4, var5);
		if (!this.s) {
			var1 = true;
		} else {
			var1 = false;
		}

		if (this.s) {
			this.s = false;
			var5 = this.g;
			this.q = (var5 - 1) / this.d[2] + 1;
			var4 = this.r;
			this.r = Math.max(0, Math.min(this.r, this.q - 1));
			if (this.r > this.m) {
				var2 = this.m;
			} else {
				var2 = this.r;
			}

			int var8 = -var2;
			if (this.A) {
				var3 = this.getWidth();
			} else {
				var3 = this.getHeight();
			}

			this.c = var3 * var8;
			var3 = (this.r - var2) * this.d[2];
			this.n = Math.min(this.q - 1 - this.r, this.m) + var2 + 1;
			this.o = var2;
			var5 = Math.min(this.d[2] * this.n, var5 - var3);

			for (var2 = 0; var2 < var5; ++var2) {
				View var7 = this.b(var3 + var2, -1);
				this.h.add(var7);
			}

			Iterator var9 = this.i.iterator();

			while (var9.hasNext()) {
				this.removeDetachedView((View) var9.next(), false);
			}

			for (var2 = (this.m * 2 + 1) * this.d[2]
					- (this.i.size() - this.h.size()); var2 > 0; --var2) {
				this.i.poll();
			}

			if (var4 != this.r) {
				this.b(true);
			}

			this.invalidate();
		} else {
			var3 = this.getChildCount();
			if (var3 != 0) {
				for (var2 = var6; var2 < var3; ++var2) {
					this.a(var2, var1);
				}
			}
		}

	}

	protected void onMeasure(int var1, int var2) {
		int var8 = this.g;
		int var7 = MeasureSpec.getMode(var1);
		int var3 = MeasureSpec.getSize(var1);
		int var6 = MeasureSpec.getMode(var2);
		int var5 = MeasureSpec.getSize(var2);
		if (this.x == 1) {
			if (var7 != 1073741824 || var6 != 1073741824) {
				vj.b("Swipe.GridGallery",
						"Invalid measure mode for COMPUTE_SPACING: " + var7
								+ ", " + var6);
			}

			if (this.d[1] != 1) {
				this.a = (var3 - this.getPaddingLeft() - this.getPaddingRight() - this.d[1]
						* this.k)
						/ (this.d[1] - 1);
			} else {
				this.a = 0;
			}

			if (this.d[0] != 1) {
				this.b = (var5 - this.getPaddingTop() - this.getPaddingBottom() - this.d[0]
						* this.l)
						/ (this.d[0] - 1);
				var2 = var3;
				var1 = var5;
			} else {
				this.b = 0;
				var1 = var5;
				var2 = var3;
			}
		} else if (this.x == 0) {
			
				int var4;
				
					if (var7 == 1073741824) {
						var4 = var3;
						if (var6 == 1073741824) {
						
						}
					}

					if (var8 == 0) {
						super.onMeasure(var1, var2);
						if (var7 != 1073741824) {
							var3 = this.getMeasuredWidth();
						}

						var4 = var3;
						if (var6 != 1073741824) {
							var1 = this.getMeasuredHeight();
							var2 = var3;
							
						}
					} else {
						View var11 = this.a(0, this.j);
						wm var10 = (wm) var11.getLayoutParams();
						wm var9 = var10;
						if (var10 == null) {
							var9 = this.a();
							var11.setLayoutParams(var9);
						}

						var8 = getChildMeasureSpec(
								MeasureSpec.makeMeasureSpec(this.k, 1073741824),
								0, var9.width);
						if (var9.height > 0) {
							var4 = MeasureSpec.makeMeasureSpec(var9.height,
									1073741824);
						} else {
							var4 = MeasureSpec.makeMeasureSpec(0, 0);
						}

						var11.measure(var8, var4);
						if (var7 != 1073741824) {
							var3 = resolveSize(
									var11.getMeasuredWidth() * this.d[1]
											+ (this.d[1] - 1) * this.a
											+ this.getPaddingLeft()
											+ this.getPaddingRight(), var1);
						}

						var4 = var3;
						if (var6 != 1073741824) {
							var1 = resolveSize(
									var11.getMeasuredHeight() * this.d[0]
											+ (this.d[0] - 1) * this.b
											+ this.getPaddingTop()
											+ this.getPaddingBottom(), var2);
							var2 = var3;
							
						}
					}
				

				var1 = var5;
				var2 = var4;
			
			this.k = (int) (((float) (var2 - this.getPaddingLeft() - this
					.getPaddingRight()) - ((float) this.d[1] - 1.0F)
					* (float) this.a) / (float) this.d[1]);
			this.l = (int) (((float) (var1 - this.getPaddingTop() - this
					.getPaddingBottom()) - ((float) this.d[0] - 1.0F)
					* (float) this.b) / (float) this.d[0]);
		} else {
			var1 = var5;
			var2 = var3;
			if (this.x == 2) {
				if (var7 != 1073741824 || var6 != 1073741824) {
					vj.b("Swipe.GridGallery",
							"Invalid measure mode for COMPUTE_PADDING: " + var7
									+ ", " + var6);
				}

				var1 = (var3 - this.d[1] * this.k - (this.d[1] - 1) * this.a) / 2;
				var2 = (var5 - this.d[0] * this.l - (this.d[0] - 1) * this.b) / 2;
				this.setPadding(var1, var2, var1, var2);
				var1 = var5;
				var2 = var3;
			}
		}

		this.setMeasuredDimension(var2, var1);
	}

	public boolean onTouchEvent(MotionEvent var1) {
		if (this.I == null) {
			this.I = VelocityTracker.obtain();
		}

		this.I.addMovement(var1);
		switch (var1.getAction() & 255) {
		case 0:
			this.a((MotionEvent) var1);
			break;
		case 1:
		case 3:
			this.b();
			break;
		case 2:
			this.b((MotionEvent) var1);
		}

		return true;
	}

	protected void removeDetachedView(View var1, boolean var2) {
		super.removeDetachedView(var1, var2);
		wm var3 = (wm) var1.getLayoutParams();
		if (var3 != null) {
			var3.a = false;
		}

	}

	public void setAdapter(BaseAdapter var1) {
		if (this.e != null) {
			this.e.unregisterDataSetObserver(this.f);
		}

		this.e = var1;
		if (var1 != null) {
			if (this.f == null) {
				this.f = new wn(this, null);
			}

			var1.registerDataSetObserver(this.f);
		}

		this.removeAllViewsInLayout();

		while (true) {
			View var3 = (View) this.h.poll();
			if (var3 == null) {
				this.i.clear();
				this.c = 0;
				this.r = 0;
				this.o = 0;
				this.n = 0;
				int var2;
				if (var1 == null) {
					var2 = 0;
				} else {
					var2 = var1.getCount();
				}

				this.q = (var2 - 1) / this.d[2] + 1;
				this.g = var2;
				this.s = true;
				this.requestLayout();
				return;
			}

			this.i.addLast(var3);
		}
	}

	public void setOnScreenSwitchedListener(wo var1) {
		this.u = var1;
	}

	public void setOnScrollListener(wp var1) {
		this.v = var1;
	}

	public void setOnViewRecycleListener(wq var1) {
		this.w = var1;
	}

	public void setOrientation(boolean var1) {
		this.A = false;
	}

	public void setSelection(int var1) {
	}

	public void setSideBufferCount(int var1) {
		this.m = var1;
	}

	public void setVerticalPadding(int var1) {
		this.setPadding(this.getPaddingLeft(), var1, this.getPaddingRight(),
				var1);
	}

	@Override
	public void setAdapter(Adapter adapter) {
		setAdapter((BaseAdapter) adapter);

	}

}
