package com.main;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.SectorArea;

public class mh implements android.view.GestureDetector.OnGestureListener {

	final SectorArea a;

	public mh(SectorArea sectorarea) {
		super();
		a = sectorarea;
		
	}

	public boolean onDown(MotionEvent motionevent) {
		SectorArea.a(a, false);
		a.q = true;
		a.r = a.m;
		a.f.getCurrentFanLayer().setLayerType(tn.b, null);
		a.f.getNextFanLayer().setLayerType(tn.b, null);
		a.f.getNextFanLayer().animate().cancel();
		a.f.getCurrentFanLayer().animate().cancel();
		a.f.getCurrentFanLayer().setRotation(0.0F);
		a.f.getNextFanLayer().setVisibility(4);
		a.p = false;
		return true;
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1,
			float f, float f1) {
		SectorArea.a(a, true);
		return false;
	}

	public void onLongPress(MotionEvent motionevent) {
		a.a(motionevent);
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1,
			float f, float f1) {
		if (motionevent == null || motionevent1 == null) {
			return true;
		} else {
			float f2 = motionevent.getX();
			float f3 = motionevent.getY();
			float f4 = motionevent1.getX();
			float f5 = motionevent1.getY();
			return a.a(f2, f3, f4, f5, f, f1);
		}
	}

	public void onShowPress(MotionEvent motionevent) {
	}

	public boolean onSingleTapUp(MotionEvent motionevent) {
		View v = SectorArea.a(a.f.getCurrentFanLayer(), motionevent);
		if (motionevent != null && (v instanceof FanItem)) {
			a.f.getCurrentFanLayer().onClick(v);
		} else {
			a.d.onClick(a.d);
		}
		return true;
	}
}
