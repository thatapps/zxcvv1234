package com.main;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.notification.SwipeAccessibilityService;
import java.util.ArrayList;
import java.util.List;

public class iz implements
		android.content.SharedPreferences.OnSharedPreferenceChangeListener {

	private final Vibrator A;
	private final SwipeService B;
	private final WindowManager C;
	private int D;
	private iw E;
	private boolean F;
	int a;
	int b;
	int c;
	int d;
	int e;
	final int f;
	final int g;
	int h;
	final int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	float o;
	final int p;
	final int q;
	final int r;
	final int s;
	final int t;
	private iy u;
	private iy v;
	private iy w;
	private iy x;
	private iy y;
	private iy z;

	public iz(SwipeService swipeservice) {
		B = swipeservice;
		A = vk.p(swipeservice);
		C = (WindowManager) swipeservice.getSystemService("window");
		Resources resources = B.getResources();
		DisplayMetrics displaymetrics = resources.getDisplayMetrics();
		m = displaymetrics.widthPixels;
		n = displaymetrics.heightPixels;
		SwipeApplication swipeapplication = SwipeApplication.e();
		try {
			ViewConfiguration viewconfiguration = ViewConfiguration.get(B);
			e = viewconfiguration.getScaledTouchSlop();
			h = viewconfiguration.getScaledMinimumFlingVelocity();
		} catch (Exception exception) {
			e = vk.a(swipeapplication, 8F);
			h = vk.a(swipeapplication, 50F);
		}
		f = vk.a(swipeapplication, 35F);
		g = f * f;
		i = h * h;
		j = h << 5;
		k = h << 4;
		l = (int) ((float) h * 5.5F);
		q = resources.getDimensionPixelSize(0x7f0b0060);
		p = resources.getDimensionPixelSize(0x7f0b005f);
		s = resources.getDimensionPixelSize(0x7f0b005e);
		r = resources.getDimensionPixelSize(0x7f0b005d);
		t = resources.getDimensionPixelSize(0x7f0b0061);
		o = n();
		a(displaymetrics);
		D = ir.b(swipeapplication);
		ir.a(swipeapplication).registerOnSharedPreferenceChangeListener(this);
	}

	private void a(DisplayMetrics displaymetrics) {
		a = (int) (o * (float) q);
		b = (int) (o * (float) r);
		c = (int) ((float) a / displaymetrics.density);
		d = (int) ((float) b / displaymetrics.density);
	}

	private iy m() {
		if (ir.E(B)) {
			if (u != null && u.f()) {
				return u;
			}
		} else if (v != null && v.f()) {
			return v;
		}
		return null;
	}

	private float n() {
		int i1 = ir.t(B);
		if (48 != i1) {
			return (float) ((i1 << 2) + 96) / 96F / 3F;
		} else {
			return 1.0F;
		}
	}

	public void a() {
		ir.a(B).unregisterOnSharedPreferenceChangeListener(this);
		if (E != null) {
			E.a();
		}
	}

	public void a(int i1, boolean flag) {
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		int j1;
		if (1 == (i1 & 1)) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		if (4 == (i1 & 4)) {
			flag2 = true;
		} else {
			flag2 = false;
		}
		if (2 == (i1 & 2)) {
			flag3 = true;
		} else {
			flag3 = false;
		}
		if (8 == (i1 & 8)) {
			flag4 = true;
		} else {
			flag4 = false;
		}
		j1 = i1 & 1 | (i1 & 4) >> 1;
		i1 = (i1 & 2) >> 1 | (i1 & 8) >> 2;
		if (u != null) {
			if (!flag1 && !flag2) {
				u.h();
				u = null;
				if (w != null) {
					w.h();
					w = null;
				}
				if (y != null) {
					y.h();
					y = null;
				}
			} else {
				if (!flag1) {
					if (w != null) {
						w.h();
						w = null;
					}
					if (y != null) {
						y.h();
						y = null;
					}
				} else {
					if (w == null) {
						w = new iy(B, true, false, this);
						w.g();
						if (flag) {
							w.d();
						}
					}
					if (!flag2) {
						if (y == null) {
							y = new iy(B, true, true, 5, this);
							y.g();
							if (flag) {
								y.d();
							}
						}
					} else if (y != null) {
						y.h();
						y = null;
					}
				}
				u.setType(j1);
			}
		} else if (flag1 || flag2) {
			if (flag1) {
				w = new iy(B, true, false, this);
				w.g();
				if (flag) {
					w.d();
				}
				if (!flag2) {
					y = new iy(B, true, true, 5, this);
					y.g();
					if (flag) {
						y.d();
					}
				}
			}
			u = new iy(B, true, true, j1, this);
			u.g();
			if (flag) {
				u.d();
			}
		}
		if (v != null) {
			if (!flag3 && !flag4) {
				v.h();
				v = null;
				if (x != null) {
					x.h();
					x = null;
				}
				if (z != null) {
					z.h();
					z = null;
				}
			} else {
				if (!flag3) {
					if (x != null) {
						x.h();
						x = null;
					}
					if (z != null) {
						z.h();
						z = null;
					}
				} else {
					if (x == null) {
						x = new iy(B, false, false, this);
						x.g();
						if (flag) {
							x.d();
						}
					}
					if (!flag4) {
						if (z == null) {
							z = new iy(B, false, true, 5, this);
							z.g();
							if (flag) {
								z.d();
							}
						}
					} else if (z != null) {
						z.h();
						z = null;
					}
				}
				v.setType(i1);
			}
		} else if (flag3 || flag4) {
			if (flag3) {
				x = new iy(B, false, false, this);
				x.g();
				if (flag) {
					x.d();
				}
				if (!flag4) {
					z = new iy(B, false, true, 5, this);
					z.g();
					if (flag) {
						z.d();
					}
				}
			}
			v = new iy(B, false, true, i1, this);
			v.g();
			if (flag) {
				v.d();
			}
		}
		if (SwipeAccessibilityService.a) {
			ArrayList arraylist = new ArrayList();
			if (u != null) {
				arraylist.add(u.getBoundsInScreen());
				if (w != null) {
					arraylist.add(w.getBoundsInScreen());
				}
				if (y != null) {
					arraylist.add(y.getBoundsInScreen());
				}
			}
			if (v != null) {
				arraylist.add(v.getBoundsInScreen());
				if (x != null) {
					arraylist.add(x.getBoundsInScreen());
				}
				if (z != null) {
					arraylist.add(z.getBoundsInScreen());
				}
			}
			SwipeAccessibilityService.a((Rect[]) arraylist
					.toArray(new Rect[arraylist.size()]));
		}
	}

	public void a(Configuration configuration) {
		if (D == 0) {
			DisplayMetrics metrics = B.getResources().getDisplayMetrics();
			int i1 = ((DisplayMetrics) (metrics)).widthPixels;
			if (i1 != m) {
				m = i1;
				n = ((DisplayMetrics) (metrics)).heightPixels;
				if (u != null) {
					u.a();
					u.i();
					if (w != null) {
						w.a();
						w.i();
					}
					if (y != null) {
						y.a();
						y.i();
					}
				}
				if (v != null) {
					v.a();
					v.i();
					if (x != null) {
						x.a();
						x.i();
					}
					if (z != null) {
						z.a();
						z.i();
					}
				}
			}
		}
	}

	public void a(lr lr1) {
		B.a(lr1);
	}

	public void a(boolean flag) {
		if (flag) {
			if (u != null) {
				u.d();
				if (w != null) {
					w.d();
				}
				if (y != null) {
					y.d();
				}
			}
			if (v != null) {
				v.d();
				if (x != null) {
					x.d();
				}
				if (z != null) {
					z.d();
				}
			}
		} else {
			if (u != null) {
				u.e();
				if (w != null) {
					w.e();
				}
				if (y != null) {
					y.e();
				}
			}
			if (v != null) {
				v.e();
				if (x != null) {
					x.e();
				}
				if (z != null) {
					z.e();
					return;
				}
			}
		}
	}

	public boolean a(iy iy1) {
		try {
			C.removeView(iy1);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b("Swipe.ToucherManager", "Could not remove view from window",
					exception);
			return false;
		}
		return true;
	}

	public boolean a(iy iy1,
			android.view.WindowManager.LayoutParams layoutparams) {
		try {
			C.addView(iy1, layoutparams);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b("Swipe.ToucherManager", "Could not add view to window",
					exception);
			return false;
		}
		return true;
	}

	public android.view.WindowManager.LayoutParams b() {
		android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(
				0, 0, ir.r(B), 0x40028, -3);
		layoutparams.gravity = SwipeApplication.b | 0x50;
		return layoutparams;
	}

	public void b(iy iy1, android.view.WindowManager.LayoutParams layoutparams) {
		try {
			if (iy1.f()) {
				C.updateViewLayout(iy1, layoutparams);
			}
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b("Swipe.ToucherManager", "Could not update view layout",
					exception);
		}
	}

	public void c() {
		if (vk.o()) {
			d();
			return;
		} else {
			B.c.post(new Runnable() {

				final iz a;

				public void run() {
					a.d();
				}

				{
					a = iz.this;
					// super();
				}
			});
			return;
		}
	}

	public void d() {
		F = true;
		if (1 != D) {

			if (u == null && v == null) {
				a(ir.D(B), false);
				((SwipeApplication) B.getApplicationContext()).b().e();
			}
			if (u != null) {
				u.g();
				if (w != null) {
					w.g();
				}
				if (y != null) {
					y.g();
				}
			}
			if (v != null) {
				v.g();
				if (x != null) {
					x.g();
				}
				if (z != null) {
					z.g();
				}
			}

		} else {
			if (E == null) {
				E = new iw(B, this);
			}
			E.c();
		}

		B.u();
		return;

	}

	public void e() {
		F = false;
		if (1 == D) {
			if (E != null) {
				E.d();
			}
		} else {
			if (u != null) {
				u.h();
				if (w != null) {
					w.h();
				}
				if (y != null) {
					y.h();
				}
			}
			if (v != null) {
				v.h();
				if (x != null) {
					x.h();
				}
				if (z != null) {
					z.h();
					return;
				}
			}
		}
	}

	public void f() {
		o = n();
		a(B.getResources().getDisplayMetrics());
		if (u != null) {
			u.a(true);
			if (w != null) {
				w.a(true);
			}
			if (y != null) {
				y.a(true);
			}
		}
		if (v != null) {
			v.a(true);
			if (x != null) {
				x.a(true);
			}
			if (z != null) {
				z.a(true);
			}
		}
	}

	public void g() {
		if (D == 0) {
			iy iy1 = m();
			if (iy1 != null) {
				iy1.c();
			}
			return;
		} else {
			E.h();
			return;
		}
	}

	public void h() {
		if (D == 0) {
			iy iy1 = m();
			if (iy1 != null) {
				iy1.b(true);
			}
			return;
		} else {
			E.a(true);
			return;
		}
	}

	public void i() {
		if (D == 0) {
			iy iy1 = m();
			if (iy1 != null) {
				iy1.b();
			}
		} else if (E != null) {
			E.i();
			return;
		}
	}

	public void j() {
		Fan.a.a(E.g(), 100, 0, 0, vk.a(B, E.getPosYReversed()), 0);
		Fan.a.j = false;
		a(Fan.a);
	}

	public void k() {
		B.r();
	}

	public boolean l() {
		return D == 1;
	}

	public void onSharedPreferenceChanged(SharedPreferences sharedpreferences,
			String s1) {
		if ("key_toucher_type".equals(s1)) {
			boolean flag;
			if (F) {
				e();
				flag = true;
			} else {
				flag = false;
			}
			z = null;
			y = null;
			v = null;
			x = null;
			w = null;
			u = null;
			if (E != null) {
				E.a();
				E = null;
			}
			D = sharedpreferences.getInt(s1, 0);
			jc.a(B, D);
			if (D == 1) {
				B.c.sendEmptyMessage(5);
			} else {
				B.c.sendEmptyMessage(6);
			}
			if (flag) {
				c();
			}
		}
	}
}
