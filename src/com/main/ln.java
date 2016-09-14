package com.main;

import android.view.DragEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.DeleteZone;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.FanLayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ln implements lm {

	private int a;
	private int b;
	private FanItem c;
	private mt d;
	private FanLayer e;
	private int f;
	private int g;
	private int h;
	private int i;
	private boolean j;
	private boolean k;
	private WeakReference l;

	public ln(FanLayer fanlayer) {
		a = -1;
		b = -1;
		e = fanlayer;
	}

	private TranslateAnimation a(mg mg1, mg mg2, mg mg3) {
		int i1 = mg1.a;
		int j1 = mg3.a;
		int k1 = mg2.a;
		int l1 = mg3.a;
		int i2 = -(mg1.b - mg3.b);
		int j2 = -(mg2.b - mg3.b);
		TranslateAnimation animation = new TranslateAnimation(i1 - j1, k1 - l1,
				i2, j2);
		animation.setFillAfter(true);
		animation.setDuration(300L);
		return animation;
	}

	static FanLayer a(ln ln1) {
		return ln1.e;
	}

	private void a(int i1) {
		if (i1 > b) {
			for (int j1 = b + 1; j1 <= i1; j1++) {
				b(j1, j1 - 1);
			}

		} else if (i1 < b) {
			for (int k1 = b - 1; k1 >= i1; k1--) {
				b(k1, k1 + 1);
			}

		}
	}

	private View b(int i1) {
		if (i1 < 0 || i1 >= g().size()) {
			return null;
		} else {
			return (View) g().get(i1);
		}
	}

	private void b(int i1, int j1) {
		int k1;
		if (i1 < Math.min(b, a) || i1 > Math.max(b, a)) {
			k1 = i1;

		} else {
			if (b <= a) {

				if (b < a) {
					k1 = i1 - 1;
					// continue; /* Loop/switch isn't completed */
				}

			} else {
				k1 = i1 + 1;

			}

		}

	}

	private void c(final int i1, final int j1) {
		TranslateAnimation translateanimation = a(mf.a(b, g().size(), j),
				mf.a(j1, g().size(), j), mf.a(a, g().size(), j));
		translateanimation.setDuration(10L);
		translateanimation.setAnimationListener(new sx() {

			final int a;
			final int b;
			final ln c;

			public void onAnimationEnd(Animation animation) {
				ln.a(c).post(new Runnable() {

					public void run() {
						c.a(a, b);
						c.c();
						c.b();
					}

				});
			}

			{
				c = ln.this;
				a = i1;
				b = j1;
				// super();
			}
		});
		c.startAnimation(translateanimation);
	}

	private void c(DragEvent dragevent) {
		if (dragevent == null) {
			return;
		}
		k = true;
		c.clearAnimation();
		c.setVisibility(8);
		if (l != null && l.get() != null) {
			((FanItem) l.get()).a();
		}
		int i1 = h(dragevent);
		a = i1;
		b = i1;
		e.f = DeleteZone.a(e.getFan());
	}

	private void d(DragEvent dragevent) {
		boolean flag1 = true;
		if (dragevent != null) {
			int i1 = h(dragevent);
			boolean flag;
			if (e.f != null) {
				if (i(dragevent)) {
					e.f.a();
				} else {
					e.f.b();
				}
			}
			View view = b(i1);
			if (view != null && (view.getTag() instanceof mt)
					&& ((mt) view.getTag()).f()) {
				flag = true;
			} else {
				flag = false;
			}
			if (e.l() && d.f() && flag) {
				flag = flag1;
			} else {
				flag = false;
			}
			if (b != -1 && i1 != -1 && b != i1 && flag) {
				a(i1);
			}
			if (i1 != -1 && flag) {
				b = i1;
				return;
			}
		}
	}

	private List e() {
		if (vk.a(g())) {
			return null;
		}
		ArrayList arraylist = new ArrayList();
		Iterator iterator = g().iterator();
		do {
			if (iterator.hasNext()) {
				FanItem fanitem = (FanItem) iterator.next();
				if (fanitem != null && (fanitem.getTag() instanceof mt)
						&& !(fanitem.getTag() instanceof mn)) {
					arraylist.add((mt) fanitem.getTag());
				} else {

					return arraylist;
				}
			}

		} while (true);

	}

	private void e(DragEvent dragevent) {
		while (dragevent == null || dragevent.getResult()) {
			return;
		}
		b();
		f();
	}

	private void f() {
		for (Iterator iterator = g().iterator(); iterator.hasNext(); ((FanItem) iterator
				.next()).clearAnimation()) {
		}
		c();
	}

	private boolean f(DragEvent dragevent) {
		if (dragevent == null) {
			return false;
		}
		if (!(c instanceof FanItem)) {
			return false;
		}
		int i1 = a;
		int j1 = h(dragevent);
		if (i(dragevent)) {
			g(dragevent);
			return true;
		}
		View view = b(j1);
		if (!(view instanceof View) || !(view.getTag() instanceof mt)
				|| !((mt) view.getTag()).f()) {
			return false;
		}
		if (!d.f()) {
			return false;
		}
		if (e.l()) {
			c(i1, j1);
			return true;
		} else {
			return false;
		}
	}

	private List g() {
		return e.getItems();
	}

	private void g(DragEvent dragevent) {
		if (e.f != null) {
			e.f.a(dragevent, this);
		}
	}

	private int h(DragEvent dragevent) {
		int i1 = -1;
		if (dragevent != null) {
			int j1;
			j1 = mf.a((int) dragevent.getX(), (int) dragevent.getY(), g()
					.size(), h, i, f, g, j);
			if (j1 > 0) {
				i1 = j1;/* Loop/switch isn't completed */
			}

			if (j1 < g().size()) {

				return i1;

			} else {

				return -1;
			}

		}
		return i1;

	}

	private boolean i(DragEvent dragevent) {
		while (dragevent == null || dragevent.getY() > (float) g) {
			return false;
		}
		float f1;
		float f2;
		float f3;
		boolean flag;
		if (j) {
			f1 = dragevent.getX();
		} else {
			f1 = (float) f - dragevent.getX();
		}
		f2 = g;
		f3 = dragevent.getY();
		if ((float) Math.hypot(f1, f2 - f3) < (float) e.getFan()
				.getTabSectorOuterSize() - (float) (h / 4)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public void a() {
		if (!(c instanceof FanItem) || !(c.getTag() instanceof mt)) {
			return;
		} else {
			final FanItem fanitem = c;
			final int i1 = a;
			e.post(new Runnable() {

				final FanItem a;
				final int b;
				final ln c;

				public void run() {
					try {
						ln.a(c).a(a, (mt) a.getTag(), b);
						return;
					} catch (Exception exception) {
						vk.b(exception);
					}
				}

				{
					c = ln.this;
					a = fanitem;
					b = i1;
					// super();
				}
			});
			a = -1;
			b = -1;
			c = null;
			return;
		}
	}

	// void a(int i1, int j1) {
	// int k1 = -1;
	// while (i1 == -1 || j1 == -1 || i1 == j1) {
	// return;
	// }
	// Object obj;
	// FanItem fanitem;
	// obj = new ArrayList(g());
	// fanitem = (FanItem) ((ArrayList) (obj)).get(i1);
	// if (i1 >= j1) {
	//
	// k1 = i1;
	//
	// } else {
	//
	// k1 = i1;
	//
	// }
	//
	// while (k1 < j1) {
	// ((ArrayList) (obj)).set(k1, ((ArrayList) (obj)).get(k1+1));
	//
	// k1++;
	// }
	//
	// if (k1 <= j1) {
	//
	// try {
	// ((ArrayList) (obj)).set(j1, fanitem);
	// e.setItems(((ArrayList) (obj)));
	// e.k();
	// obj = e();
	// e.getTab().a(((List) (obj)), i1, j1, new lo() {
	//
	// final ln a;
	//
	// public void a(List list) {
	// ln.a(a).a(ln.a(a).getTab(), list, null, false,
	// ln.a(a).d);
	// }
	//
	// {
	// a = ln.this;
	//
	// }
	// });
	// return;
	// } catch (Exception exception) {
	// vj.b("Swipe.DADHandler",
	// (new StringBuilder())
	// .append("shiftPosition failed, srcIndex = ")
	// .append(i1).append(", targetIndex = ")
	// .append(j1).toString(), exception);
	// }
	// return;
	//
	// } else {
	// ((ArrayList) (obj)).set(k1, ((ArrayList) (obj)).get(k1 - 1));
	// k1--;
	// }
	//
	// }
	void a(int i1, int j1) {
		while (i1 == -1 || j1 == -1 || i1 == j1) {
			return;
		}
		Object obj;
		int k1;
		FanItem fanitem;
		obj = new ArrayList(g());
		fanitem = (FanItem) ((ArrayList) (obj)).get(i1);
		if (i1 >= j1) {

			k1 = i1;

		} else {

			k1 = i1;

		}

		// _L4:
		while (k1 < j1) {
			((ArrayList) (obj)).set(k1, ((ArrayList) (obj)).get(k1 + 1));
			k1++;
		}

		// if (true) goto _L4; else goto _L3
		// _L7:
		if (k1 <= j1) {
			try {
				((ArrayList) (obj)).set(j1, fanitem);
				e.setItems(((ArrayList) (obj)));
				e.k();
				obj = e();
				e.getTab().a(((List) (obj)), i1, j1, new lo() {

					final ln a;

					public void a(List list) {
						ln.a(a).a(ln.a(a).getTab(), list, null, false,
								ln.a(a).d);
					}

					{
						a = ln.this;
						// super();
					}
				});
				return;
			} catch (Exception exception) {
				vj.b("Swipe.DADHandler",
						(new StringBuilder())
								.append("shiftPosition failed, srcIndex = ")
								.append(i1).append(", targetIndex = ")
								.append(j1).toString(), exception);
			}
			return;

		} else {
			((ArrayList) (obj)).set(k1, ((ArrayList) (obj)).get(k1 - 1));
			k1--;
		}

	}

	public void a(View view) {
		if (e.j() && (view instanceof FanItem)) {
			Object obj = view.getTag();
			if ((obj instanceof mt) && ((mt) obj).s()) {
				c = (FanItem) view;
				d = (mt) obj;
				f = e.getWidth();
				g = e.getHeight();
				j = e.c;
				h = c.getWidth();
				i = c.getHeight();
				lp lp = new lp(SwipeApplication.e());
				l = new WeakReference(view);
				lp.a(c);
				return;
			}
		}
	}

	public boolean a(DragEvent dragevent) {
		while (!e.j() || c == null || dragevent == null
				|| c != dragevent.getLocalState()) {
			return false;
		}
		return true;
	}

	void b() {
		k = false;
		a = -1;
		b = -1;
		if (l != null && l.get() != null) {
			((FanItem) l.get()).b();
			l.clear();
			l = null;
		}
		if (c != null) {
			c.clearAnimation();
			c.setVisibility(0);
			c = null;
		}
		if (e.f != null) {
			e.f.b(e.getFan());
		}
	}

	public boolean b(DragEvent dragevent) {
		dragevent.getAction();
		// JVM INSTR tableswitch 1 6: default 44
		// 1 46
		// 2 53
		// 3 61
		// 4 67
		// 5 44
		// 6 44;
		// goto _L1 _L2 _L3 _L4 _L5 _L1 _L1

		switch (dragevent.getAction()) {
		default:
			return false;
		case 1:

			c(dragevent);
			return true;
		case 2:
			d(dragevent);
			break;
		case 3:
			return f(dragevent);
		case 4:
			e(dragevent);
			break;
		case 5:
		case 6:
			return false;

		}
		return false;

	}

	protected void c() {
		try {
			e.g();
			return;
		} catch (Exception exception) {
			vk.b(exception);
		}
	}

	public boolean d() {
		return k;
	}
}
