package com.main;

//zevienin

import android.view.MotionEvent;

public class di {

	static final dn a;

	public static int a(MotionEvent motionevent) {
		return (motionevent.getAction() & 0xff00) >> 8;
	}

	public static int a(MotionEvent motionevent, int i) {
		return a.a(motionevent, i);
	}

	public static int b(MotionEvent motionevent, int i) {
		return a.b(motionevent, i);
	}

	public static float c(MotionEvent motionevent, int i) {
		return a.c(motionevent, i);
	}

	public static float d(MotionEvent motionevent, int i) {
		return a.d(motionevent, i);
	}

	static {
		if (android.os.Build.VERSION.SDK_INT >= 12) {
			a = new dm();
		} else if (android.os.Build.VERSION.SDK_INT >= 9) {
			a = new dl();
		} else if (android.os.Build.VERSION.SDK_INT >= 5) {
			a = new dk();
		} else {
			a = new dj();
		}
	}
}
