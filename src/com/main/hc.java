package com.main;

import java.util.HashMap;
import java.util.Map;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class hc implements View.OnClickListener, View.OnTouchListener {
	final/* synthetic */hb a;
	private int b;
	private int c;
	private int d;
	private int e;
	private float f;
	private float g;
	private int h;
	private int i;
	private boolean j;

	hc(hb hb) {
		this.a = hb;
	}

	@SuppressWarnings("unchecked")
	public Map a() {
		HashMap hashMap = new HashMap();
		hashMap.put((Object) "clickX", (Object) this.b);
		hashMap.put((Object) "clickY", (Object) this.c);
		hashMap.put((Object) "width", (Object) this.d);
		hashMap.put((Object) "height", (Object) this.e);
		hashMap.put((Object) "adPositionX",
				(Object) Float.valueOf((float) this.f));
		hashMap.put((Object) "adPositionY",
				(Object) Float.valueOf((float) this.g));
		hashMap.put((Object) "visibleWidth", (Object) this.i);
		hashMap.put((Object) "visibleHeight", (Object) this.h);
		return hashMap;
	}

	public void onClick(View view) {
		if (hb.a(this.a) != null) {
			hb.a(this.a).b(this.a);
		}
		if (!this.j) {
			Log.e((String) "FBAudienceNetworkLog",
					(String) "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
		}
		hb.e(this.a).a(hb.d(this.a), this.a(), false);
	}


	public boolean onTouch(View view, MotionEvent motionEvent) {
		if (motionEvent.getAction() == 0 && hb.f(this.a) != null) {
			this.d = hb.f(this.a).getWidth();
			this.e = hb.f(this.a).getHeight();
			int[] arrn = new int[2];
			hb.f(this.a).getLocationInWindow(arrn);
			this.f = arrn[0];
			this.g = arrn[1];
			Rect rect = new Rect();
			hb.f(this.a).getGlobalVisibleRect(rect);
			this.i = rect.width();
			this.h = rect.height();
			int[] arrn2 = new int[2];
			view.getLocationInWindow(arrn2);
			this.b = (int) motionEvent.getX() + arrn2[0] - arrn[0];
			this.c = (int) motionEvent.getY() + arrn2[1] - arrn[1];
			this.j = true;
		}
		View.OnTouchListener onTouchListener = (OnTouchListener) hb.g(this.a);
		boolean bl = false;
		if (onTouchListener != null) {
			bl = ((OnTouchListener) hb.g(this.a)).onTouch(view, motionEvent);
		}
		return bl;
	}
}
