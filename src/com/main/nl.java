package com.main;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.SectorArea;
import com.lazyswipe.fan.hetero.iwatch.WatchItemSector;

public class nl implements android.view.GestureDetector.OnGestureListener {

	final/* synthetic */WatchItemSector a;

	public nl(WatchItemSector paramWatchItemSector) {
		this.a = paramWatchItemSector;
	}

	public boolean onDown(MotionEvent paramMotionEvent) {
		WatchItemSector.a(this.a, false);
		this.a.n = true;
		this.a.o = this.a.k;
		if (WatchItemSector.f(this.a) != null) {
			WatchItemSector.f(this.a).cancel();
		}
		WatchItemSector.a(this.a, WatchItemSector.a(this.a, paramMotionEvent));
		WatchItemSector.b(this.a, WatchItemSector.g(this.a));
		this.a.m = false;
		return true;
	}

	public boolean onFling(MotionEvent paramMotionEvent1,
			MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2) {
		WatchItemSector.a(this.a, true);
		return false;
	}

	public void onLongPress(MotionEvent paramMotionEvent) {
	}

	public boolean onScroll(MotionEvent paramMotionEvent1,
			MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2) {
		boolean bool;
		if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null)) {
		}
		float f1;
		float f2;
		float f3;
		float f4;
		for (bool = true;; bool = this.a.a(f1, f2, f3, f4, paramFloat1,
				paramFloat2)) {

			f1 = paramMotionEvent1.getX();
			f2 = paramMotionEvent1.getY();
			f3 = paramMotionEvent2.getX();
			f4 = paramMotionEvent2.getY();
			return bool;
		}

	}

	public void onShowPress(MotionEvent paramMotionEvent) {
	}

	public boolean onSingleTapUp(MotionEvent motionEvent) {
		float f;
		View view = SectorArea.a((ViewGroup) this.a, motionEvent);
		if (view != null && view instanceof FanItem) {
			this.a.onClick(view);
			return true;
		} else {
			int n = WatchItemSector.h(this.a).getTabSectorOuterSize();
			int n2 = WatchItemSector.i(this.a).getTabSectorInnerSize();
			int n3 = (int) motionEvent.getX();
			int n4 = (int) motionEvent.getY();
			int n5 = this.a.c ? 0 : this.a.getWidth();
			int n6 = this.a.getHeight();
			int n7 = (n3 - n5) * (n3 - n5) + (n4 - n6) * (n4 - n6);
			if (n7 > n * n || n7 < n2 * n2) {
				WatchItemSector.k(this.a).onClick(
						(View) WatchItemSector.j(this.a));
				return true;
			}
			int n8 = this.a.c ? (int) Math.abs((double) vk.a(
					this.a.getHeight(), 0.0, n4, n3)) : 180 - (int) Math
					.abs((double) vk.a(this.a.getHeight(),
							(double) this.a.getWidth(), n4, n3));
			if (n8 >= 25 && n8 <= 65 || this.a.k || this.a.m)
				return true;
			{
				boolean bl = false;
				if (n8 > 65) {
					bl = false;
					if (n8 <= 90) {
						bl = true;
					}
				}
				this.a.h();
				WatchItemSector.c(this.a, oy.d(WatchItemSector.l(this.a)));
				f = bl ? (float) (90 * (-1 + (int) WatchItemSector.l(this.a) / 90))
						: (float) (90 * (1 + (int) WatchItemSector.l(this.a) / 90));
			}
		}
		WatchItemSector.a(this.a, true, f);
		return true;
	}
}
