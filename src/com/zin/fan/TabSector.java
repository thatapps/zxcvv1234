//zevienin

package com.lazyswipe.fan;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.SwipeApplication;
import com.main.ir;
import com.main.ls;
import com.main.mf;
import com.main.mg;
import com.main.ml;
import com.main.nc;
import com.main.ox;
import com.main.rk;
import com.main.vb;
import com.main.vk;
import com.main.wv;

// Referenced classes of package com.lazyswipe.fan:
//            TabIndicatorLabel, Fan, TabSectorBg, SectorArea

public class TabSector extends FrameLayout implements
		android.view.View.OnClickListener,
		android.view.animation.Animation.AnimationListener, rk {

	private View a;
	private ImageView b;
	private TabIndicatorLabel c[];
	private float d[];
	private Fan e;
	float fff;
	private SectorArea f;
	private int g;
	private final int h;
	private boolean i;
	private int j;
	private int k;
	private int l;
	private int m;
	private boolean n;
	private Rect o;
	private int p;
	private int q;
	private final Runnable r = new Runnable() {

		final TabSector a;

		public void run() {
			if (TabSector.e(a) != -1 && TabSector.e(a) < TabSector.f(a)
					&& TabSector.e(a) != TabSector.c(a)) {
				int i1 = TabSector.c(a);
				TabSector.g(a).a(i1, TabSector.e(a));
				a.a(TabSector.e(a), true);
			}
		}

		{
			a = TabSector.this;
			// super();
		}
	};

	public TabSector(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		c = new TabIndicatorLabel[3];
		i = false;
		l = 1;
		m = -1;
		n = false;
		o = new Rect();
		h = context.getResources().getDimensionPixelSize(0x7f0b003a);
		setOnClickListener(this);
	}

	static Fan a(TabSector tabsector) {
		return tabsector.e;
	}

	static void a(TabSector tabsector, int i1) {
		tabsector.setTabTextVisibility(i1);
	}

	static void b(TabSector tabsector) {
		tabsector.h();
	}

	static int c(TabSector tabsector) {
		return tabsector.l;
	}

	static TabIndicatorLabel[] d(TabSector tabsector) {
		return tabsector.c;
	}

	static int e(TabSector tabsector) {
		return tabsector.m;
	}

	static int f(TabSector tabsector) {
		return tabsector.p;
	}

	private void f() {
		android.widget.FrameLayout.LayoutParams layoutparams = null;
		mg mg1 = null;

		layoutparams = (android.widget.FrameLayout.LayoutParams) a
				.getLayoutParams();
		if (layoutparams != null) {
			mg1 = e.getStartPosition();
			layoutparams.bottomMargin = mg1.b - a.getMeasuredHeight() / 2 - 3;
			if (n) {
				layoutparams.leftMargin = mg1.a - a.getMeasuredWidth() / 2 - 3;
			}
			return;
		}

		layoutparams.rightMargin = -mg1.a - a.getMeasuredWidth() / 2 - 3;
	}

	static SectorArea g(TabSector tabsector) {
		return tabsector.f;
	}

	private void g() {
		TabIndicatorLabel atabindicatorlabel[] = c;
		int k2 = atabindicatorlabel.length;
		int l1 = 0;
		int k1 = 0;
		int i1;
		do {
			if (l1 < k2) {
				TabIndicatorLabel tabindicatorlabel = atabindicatorlabel[l1];

				if (tabindicatorlabel.getVisibility() == 8) {
					i1 = k1;
				} else {
					android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams) tabindicatorlabel
							.getLayoutParams();
					int l2 = e.getTabCount();
					if (layoutparams != null) {
						mg mg1 = mf.a(k1, l2, g, n);
						layoutparams.bottomMargin = mg1.b
								- tabindicatorlabel.getMeasuredHeight() / 2;
						if (n) {
							layoutparams.leftMargin = mg1.a
									- tabindicatorlabel.getMeasuredWidth() / 2;
							if (l2 == 3) {
								int i2 = k1 * 29 - 75;
								i1 = i2;
								if (k1 == 3) {
									i1 = i2 + 2;
								}
							} else if (l2 == 2) {
								i1 = 23 - (2 - k1) * 45;
							} else {
								i1 = -45;
							}
							tabindicatorlabel.setDegree(i1);
						} else {
							layoutparams.rightMargin = -mg1.a
									- tabindicatorlabel.getMeasuredWidth() / 2;
							int j1;
							if (l2 == 3) {
								int j2 = 75 - k1 * 29;
								j1 = j2;
								if (k1 == l2) {
									j1 = j2 - (l2 - 1);
								}
							} else if (l2 == 2) {
								j1 = (2 - k1) * 45 - 23;
							} else {
								j1 = 45;
							}
							tabindicatorlabel.setDegree(j1);
						}
					}
					i1 = k1 + 1;
				}
			} else {
				return;
			}
			l1++;
			k1 = i1;
		} while (true);
	}

	// private int getClickedTabIndex() {
	// float f1;
	// mg mg1;
	// mg1 = new mg(j, k, this, n);
	// f1 = mg1.a();
	// int j1 = p;
	// if (f1 >= (float) e.getTabSectorInnerSize()) {
	//
	// if (f1 > (float) e.getTabSectorOuterSize()) {
	// return -1;
	// }
	// f1 = ((float) mg1.b + 0.1F) / (float) Math.abs(mg1.a);
	// int i1 = 0;
	//
	// do {
	//
	// if (i1 < d.length) {
	// j1 = i1;
	// }
	//
	// if (f1 < d[i1]) {
	// i1++;
	//
	// }
	//
	// } while (true);
	//
	// } else {
	//
	// a.getHitRect(o);
	// if (k <= o.top || (!n || j >= o.right) && (n || j <= o.left)) {
	//
	// return p + 1;
	//
	// }
	//
	// }
	//
	// return d.length;
	// }
	private int getClickedTabIndex() {
		mg mg = new mg(this.j, this.k, (View) this, this.n);
		float f = mg.a();
		if (f < (float) this.e.getTabSectorInnerSize()) {
			this.a.getHitRect(this.o);
			if (this.k <= this.o.top)
				return 1 + this.p;
			if (this.n) {
				if (this.j < this.o.right)
					return this.p;
			}
			if (this.n)
				return 1 + this.p;
			if (this.j <= this.o.left)
				return 1 + this.p;
			return this.p;
		}
		if (f > (float) this.e.getTabSectorOuterSize()) {
			return -1;
		}
		float f2 = (0.1f + (float) mg.b) / (float) Math.abs((int) mg.a);
		for (int i = 0; i < this.d.length; ++i) {
			if (f2 > this.d[i])
				return i;
		}
		return this.d.length;
	}

	private void h() {
		e.a(true);
	}

	private void i() {
		if (m != -1 && m != l) {
			postDelayed(r, ViewConfiguration.getTapTimeout());
		}
	}

	private void j() {
		removeCallbacks(r);
	}

	private void setTabTextVisibility(int i1) {
		TabIndicatorLabel atabindicatorlabel[] = c;
		int k1 = atabindicatorlabel.length;
		int j1 = 0;
		while (j1 < k1) {
			TabIndicatorLabel tabindicatorlabel = atabindicatorlabel[j1];
			if (tabindicatorlabel.isEnabled()) {
				tabindicatorlabel.setVisibility(i1);
			}
			j1++;
		}
	}

	void a() {
		a(-1);
	}

	void a(int i1) {
		if (i1 >= 0) {
			a(i1, true);
		}
		i = true;
		if (Fan.n()) {
			setTabTextVisibility(0);
			a(l, false);
			d();
		} else {
			Animation animation = ls.b(n);
			animation.setAnimationListener(this);
			startAnimation(animation);
		}
		((TabSectorBg) e.getTabSectorBg()).a();
	}

	void a(int i1, boolean flag) {
		a(i1, flag, false);
	}

	void a(int i1, boolean flag, boolean flag1) {
		// float f1;
		int j1;
		int k1;
		fff = 0.0F;
		k1 = e.getTabCount();
		j1 = 90 / k1;
		k1--;
		if (!flag) {

			if (b.getVisibility() == 0) {

				if (n) {
					fff = -j1;
				} else {
					fff =
							j1;
				}
				setIndicatorDegree(fff * (float) (k1 - l));
				if (c[0].getVisibility() == 0) {
					c[0].invalidate();
				}
				if (c[1].getVisibility() == 0) {
					c[1].invalidate();
				}
				if (c[2].getVisibility() == 0) {
					c[2].invalidate();
				}

			} else {

				Drawable drawable1 = b.getDrawable();
				if (drawable1 != null) {
					ImageView imageview1 = b;
					if (!n) {
						fff = drawable1.getIntrinsicWidth();
					}
					imageview1.setPivotX(fff);
					b.setPivotY(drawable1.getIntrinsicHeight());
					b.setVisibility(0);
				}

			}

		} else {
			float f2;
			if (n) {
				fff = -j1;
			} else {
				fff = j1;
			}
			f2 = (float) (k1 - i1) * fff;
			if (b.getVisibility() != 0) {
				Drawable drawable = b.getDrawable();
				if (drawable != null) {
					ImageView imageview = b;
					if (n) {
						fff = 0.0F;
					} else {
						fff = drawable.getIntrinsicWidth();
					}
					imageview.setPivotX(fff);
					b.setPivotY(drawable.getIntrinsicHeight());
					b.setVisibility(0);
				}
				setIndicatorDegree(f2);
				if (c[0].getVisibility() == 0) {
					c[0].invalidate();
				}
				if (c[1].getVisibility() == 0) {
					c[1].invalidate();
				}
				if (c[2].getVisibility() == 0) {
					c[2].invalidate();
				}
			} else {
				setIndicatorDegree(fff * (float) (k1 - l));
				ViewPropertyAnimator viewpropertyanimator = b.animate()
						.rotation(f2);
				if (flag1) {
					vk.a(viewpropertyanimator, new Runnable() {

						final float a;
						final TabSector b;

						public void run() {
							b.setIndicatorDegree(a);
							if (TabSector.d(b)[0].getVisibility() == 0) {
								TabSector.d(b)[0].invalidate();
							}
							if (TabSector.d(b)[1].getVisibility() == 0) {
								TabSector.d(b)[1].invalidate();
							}
							if (TabSector.d(b)[2].getVisibility() == 0) {
								TabSector.d(b)[2].invalidate();
							}
						}

						{
							b = TabSector.this;
							a = fff;
							// super();
						}
					});
				}
				viewpropertyanimator.start();
			}
		}

		if (n) {
			fff = -j1;
		} else {
			fff = j1;
		}
		fff *= k1 - i1;
		if (Math.abs(fff - b.getRotation()) > 0.5F) {
			setIndicatorDegree(fff);
		}
		l = i1;
		return;

	}

	void a(android.animation.Animator.AnimatorListener animatorlistener) {
		a.animate().scaleX(1.0F).scaleY(1.0F).setDuration(75L)
				.setListener(animatorlistener).start();
	}

	void a(View view) {
		if (!SwipeApplication.c && !f.p) {
			if (m == p) {
				h();
				return;
			}
			if (m <= p && m != l) {
				int i1 = l;
				f.a(i1, m);
				a(m, true, true);
				return;
			}
		}
	}

	void a(Fan fan, SectorArea sectorarea) {
		e = fan;
		f = sectorarea;
		q = e.getTabSectorOuterSize();
		g = (e.getTabSectorInnerSize() + e.getTabSectorOuterSize()) / 2;
		a.setOnTouchListener(new wv() {

			final TabSector a;

			public boolean a(View view, MotionEvent motionevent, int i1) {
				if (TabSector.a(a).f()) {
					return true;
				}
				switch (i1) {
				default:
					return true;

				case 1: // '\001'
					TabSector.b(a);
					return true;

				case 2: // '\002'
					if (ir.y(a.getContext())) {
						TabSector.a(a).a(false);
						vb.d();
						return true;
					}
					// fall through

				case 3: // '\003'
					vk.f(a.getContext());
					TabSector.a(a).a(false);
					return true;
				}
			}

			{
				a = TabSector.this;
				// super();
			}
		});
	}

	public boolean a(Canvas canvas) {
		try {
			draw(canvas);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return true;
	}

	void b() {
		i = false;
		b.animate().cancel();
		Animation animation = ls.d(n);
		Animation animation1 = ls.d();
		a.startAnimation(animation1);
		animation.setAnimationListener(this);
		startAnimation(animation);
		((TabSectorBg) e.getTabSectorBg()).b();
	}

	void b(android.animation.Animator.AnimatorListener animatorlistener) {
		a.animate().scaleX(0.0F).scaleY(0.0F).setDuration(75L)
				.setListener(animatorlistener).start();
	}

	void c() {
		setTabTextVisibility(4);
		b.animate().cancel();
	}

	public void d() {
		float f1 = e.getHandTrackRatio();
		setScaleX(f1);
		setScaleY(f1);
		f1 = vk.a(f1);
		setAlpha(f1);
		a.setAlpha(f1);
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent) {
		boolean flag;
		try {
			flag = super.dispatchTouchEvent(motionevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return flag;
	}

	public void e() {
		e.a();
	}

	int getCurrentTabIndex() {
		return l;
	}

	public float getIndicatorDegree() {
		return b.getRotation();
	}

	public void onAnimationEnd(Animation animation) {
		if (i) {
			post(new Runnable() {

				final TabSector a;

				public void run() {
					TabSector.a(a, 0);
					a.a(TabSector.c(a), true);
					TabSector.a(a).a();
				}

				{
					a = TabSector.this;
					// super();
				}
			});
			return;
		}
		try {
			e.setVisibility(4);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
		}
		post(new Runnable() {

			final TabSector a;

			public void run() {
				TabSector.a(a).a(false);
			}

			{
				a = TabSector.this;
				// super();
			}
		});
	}

	public void onAnimationRepeat(Animation animation) {
	}

	public void onAnimationStart(Animation animation) {
		if (i) {
			a.startAnimation(ls.c());
		}
	}

	public void onClick(View view) {
		a(view);
	}

	protected void onFinishInflate() {
		b = (ImageView) findViewById(0x7f0c0056);
		a = findViewById(0x7f0c005a);
		c[0] = (TabIndicatorLabel) findViewById(0x7f0c0057);
		c[1] = (TabIndicatorLabel) findViewById(0x7f0c0058);
		c[2] = (TabIndicatorLabel) findViewById(0x7f0c0059);
	}

	protected void onMeasure(int i1, int j1) {
		super.onMeasure(i1, j1);
		setMeasuredDimension(q, q);
		if (e != null) {
			setMeasuredDimension(getMeasuredWidth(), e.getTabSectorOuterSize());
			f();
			g();
		}
		float f1;
		if (n) {
			f1 = 0.0F;
		} else {
			f1 = getMeasuredWidth();
		}
		setPivotX(f1);
		setPivotY(getMeasuredHeight());
	}

	public boolean onTouchEvent(MotionEvent motionevent) {
		// motionevent.getAction() & 0xff;
		// JVM INSTR tableswitch 0 3: default 40
		// 0 58
		// 1 98
		// 2 40
		// 3 91;
		// goto _L1 _L2 _L3 _L1 _L4

		switch (motionevent.getAction() & 0xff) {
		default:
			if (!super.onTouchEvent(motionevent) || m == -1) {

				return false;

			} else {
				return true;
			}
		case 0:
			j = (int) motionevent.getX();
			k = (int) motionevent.getY();
			m = getClickedTabIndex();
			i();
			break;
		case 1:
			j();
			j = (int) motionevent.getX();
			k = (int) motionevent.getY();
			m = getClickedTabIndex();
			if (m == -1 || !super.onTouchEvent(motionevent)) {
				return false;
			}
		case 2:
			if (!super.onTouchEvent(motionevent) || m == -1) {

				return false;

			} else {
				return true;
			}
		case 3:
			j();

		}
		return true;

	}

	void setDirection(boolean flag) {
		n = flag;
		nc anc[] = e.getTabs();
		p = anc.length;
		int i1 = 0;
		while (i1 < c.length) {
			if (i1 < anc.length) {
				c[i1].setText(anc[i1].a(getContext()));
			} else {
				c[i1].setVisibility(8);
				c[i1].setEnabled(false);
			}
			i1++;
		}
		d = new float[anc.length - 1];
		for (int j1 = 0; j1 < d.length; j1++) {
			d[j1] = (float) Math
					.tan((1.5707963267948966D * (double) (anc.length - j1 - 1))
							/ (double) anc.length);
		}

		Fan.a(a, flag);
		Fan.a(c[0], flag);
		Fan.a(c[1], flag);
		Fan.a(c[2], flag);
		Fan.a(b, flag);
		Object obj = getContext().getResources();
		float f1 = ((Resources) (obj)).getDimension(0x7f0b0034);
		float f2 = ((Resources) (obj)).getDimension(0x7f0b0035);
		obj = new ml(getContext(), flag);
		((ml) (obj)).a(e.getTabCount(), false);
		((ml) (obj)).a(f1, f2);
		((ml) (obj)).a(e.getTabSectorInnerSize(), e.getTabSectorOuterSize());
		if (flag) {
			setPadding(0, h, h, 0);
			b.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
		} else {
			setPadding(h, h, 0, 0);
		}
		if (e.getTabCount() > 1) {
			b.setImageDrawable(((Drawable) (obj)));
			return;
		} else {
			b.setVisibility(8);
			return;
		}
	}

	public void setIndicatorDegree(float f1) {
		boolean flag;
		int k1;
		flag = false;
		if (b.getDrawable() != null) {
			b.setRotation(f1);
		}
		if (c[0].c()) {

			if ((k1 = e.getTabCount()) == 0) {
				// continue; /* Loop/switch isn't completed */
			}
			if (k1 == 1) {
				if (ox.a(0x7f010018) != 0) {
					c[0].a();
					return;
				} else {
					c[0].b();
					return;
				}
			}
			int l1 = 90 / k1;
			float f2 = (float) l1 / 2.0F;
			int i2 = (int) f1;
			float f3;
			int i1;
			if (n) {
				i1 = -3600;
			} else {
				i1 = 3600;
			}
			f3 = (float) Math.abs((i1 + i2) % 360) + f2;
			if (f3 < 0.0F || f3 >= 90F) {
				// break; /* Loop/switch isn't completed */
			}
			i1 = ((flag) ? 1 : 0);
			while (i1 < k1) {
				f1 = Math.abs(90F - f2 - (float) (l1 * i1) - f3);
				if (f1 > (float) l1 && k1 > 2) {
					f1 = 0.0F;
				} else {
					f1 = 1.0F - f1 / (float) l1;
				}
				c[i1].setHighLightRatio(f1);
				i1++;
			}

		} else {
			return;
		}

		int j1 = 0;
		while (j1 < k1) {
			c[j1].b();
			j1++;
		}

	}

	void setTab(int i1) {
		a(i1, false);
	}
}
