/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.DragEvent
 *  android.view.GestureDetector
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewConfiguration
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.widget.FrameLayout
 *  java.lang.Math
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package com.lazyswipe.fan;

import java.util.List;

import android.content.Context;
import android.drm.DrmErrorEvent;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.widget.FrameLayout;

import com.lazyswipe.zev.R;
import com.main.ll;
import com.main.ls;
import com.main.mf;
import com.main.nc;
import com.main.sx;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public class ItemSector extends FrameLayout {
	private static final String b = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.fan.ItemSector.class.getSimpleName())
			.toString();
	boolean a;
	private FanLayer c;
	private FanLayer d;
	private Fan e;
	private SectorArea f;
	private boolean g;
	private boolean h;
	private boolean i;
	private float j;
	private float k;
	private final int l;
	private int m;

	public ItemSector(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		g = false;
		h = false;
		i = false;
		m = 0;
		l = ViewConfiguration.get(context).getScaledTouchSlop();
	}

	static Fan a(ItemSector itemsector) {
		return itemsector.e;
	}

	/*
	 * Enabled aggressive block sorting
	 */

	private void a(boolean flag) {
		final ItemSectorBg itemsectorbg = (ItemSectorBg) e.getItemSectorBg();
		itemsectorbg.clearAnimation();
		itemsectorbg.setVisibility(0);
		if (flag) {
			itemsectorbg.a();
			h = false;
		} else {
			itemsectorbg.a(0);
			h = true;
		}
		if (Fan.n()) {
			d();
			return;
		} else {
			Animation animation = ls.a(i);
			animation.setAnimationListener(new sx() {

				final ItemSectorBg a;
				final ItemSector b;

				public void onAnimationEnd(Animation animation1) {
					a.b();
					((TabSectorBg) ItemSector.a(b).getTabSectorBg()).c();
				}

				{
					b = ItemSector.this;
					a = itemsectorbg;
					// super();
				}
			});
			e.getItemSectorBg().startAnimation(animation);
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void f() {
		if (h && g) {
			((ItemSectorBg) e.getItemSectorBg()).b(240);
			h = false;
		} else if (!h && !g) {
			((ItemSectorBg) e.getItemSectorBg()).a(240);
			h = true;
			return;
		}
	}

	void a() {
		c.a(e.getStartPosition());
		Animation animation = ls.c(i);
		animation.setAnimationListener(new sx() {

			final ItemSector a;

			public void onAnimationEnd(Animation animation1) {
				((ItemSectorBg) ItemSector.a(a).getItemSectorBg()).c();
				((TabSectorBg) ItemSector.a(a).getTabSectorBg()).d();
			}

			{
				a = ItemSector.this;
				// super();
			}
		});
		e.getItemSectorBg().startAnimation(animation);
	}

	void a(Fan fan, SectorArea sectorarea) {
		e = fan;
		f = sectorarea;
		int tabount = e.getTabCount();
		if (e.getTabCount() <= 1) {
			d.setVisibility(8);
		}
		int i1 = e.getTextOffset();
		mf.a((e.getTileSectorInnerSize() + e.getTabSectorOuterSize() + i1) / 2,
				(e.getTileSectorInnerSize() + e.getTileSectorOuterSize()) / 2,
				i1 / 2);
		c.a(e, f);
		d.a(e, f);
		setOnClickListener(e);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	void a(nc nc, List list, boolean flag, boolean flag1, boolean flag2) {
		int i1 = 0;
		FanLayer fanlayer;
		if (!flag1 && list.size() <= 4) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		g = flag1;
		if (flag) {
			if (!flag2) {
				a(g);
			} else if (!(g ^ h)) {
				f();
			}
		}
		if (flag) {
			fanlayer = c;
		} else {
			fanlayer = d;
		}
		if (!flag) {
			i1 = 4;
		}
		fanlayer.setVisibility(i1);
		fanlayer.a(nc, list, e.getStartPosition(), flag, flag2);
		f.setPopupPrepared(true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(boolean flag, int i1) {
		if (!flag && i1 <= 4) {
			flag = true;
		} else {
			flag = false;
		}
		if (g != flag) {
			g = flag;
			f();
		}
	}

	void b() {
		clearAnimation();
		e.getItemSectorBg().clearAnimation();
		c.b(true);
		d.b(true);
	}

	public void c() {
		FanLayer fanlayer = c;
		c = d;
		d = fanlayer;
	}

	public void d() {
		c.m();
	}

	public boolean dispatchDragEvent(DragEvent dragevent) {
		boolean flag;
		try {
			flag = super.dispatchDragEvent(dragevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception errorEvent) {
			return false;
		}
		return flag;
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent) {
		boolean flag;
		try {
			flag = super.dispatchTouchEvent(motionevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception fg) {
			return false;
		}
		return flag;
	}

	public void e() {
		c.n();
	}

	public FanLayer getCurrentFanLayer() {
		return c;
	}

	public FanLayer getNextFanLayer() {
		return d;
	}

	protected void onFinishInflate() {
		c = (FanLayer) findViewById(0x7f0c0053);
		d = (FanLayer) findViewById(0x7f0c0054);
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent) {
		int i1 = motionevent.getActionMasked();
		if (!c.e()) {
			switch (i1) {
			case 1: // '\001'
			default:
				m = 0;
				return false;

			case 0: // '\0'
				j = motionevent.getX();
				k = motionevent.getY();
				f.q = true;
				return false;

			case 2: // '\002'
				break;
			}
			if (1 != m) {
				float f1 = Math.abs(motionevent.getX() - j);
				float f2 = Math.abs(motionevent.getY() - k);
				if (f1 > (float) l || f2 > (float) l) {
					m = 1;
					motionevent = MotionEvent.obtain(motionevent);
					motionevent.setAction(0);
					f.g.onTouchEvent(motionevent);
					return true;
				}
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean onTouchEvent(MotionEvent motionevent) {
		if (motionevent != null && !e.f()) {
			if (m == 0);
				
			int i1 = motionevent.getAction();
			try {
				f.g.onTouchEvent(motionevent);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				vj.b(b,
						(new StringBuilder())
								.append("Exception in GestureDetector.onTouchEvent: ")
								.append(exception.getMessage()).toString());
			}
			if (3 == i1 || 1 == i1) {
				m = 0;
				a = false;
				f.g();
				return true;
			}
		}
		return true;
	}

	void setDirection(boolean flag) {
		i = flag;
		Fan.a(d, flag);
		Fan.a(c, flag);
		c.setDirection(flag);
		d.setDirection(flag);
	}

}
