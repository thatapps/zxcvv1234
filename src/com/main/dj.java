package com.main;

import android.view.MotionEvent;

class dj implements dn {

	dj() {
	}

	public int a(MotionEvent motionevent, int i) {
		return i != 0 ? -1 : 0;
	}

	public int b(MotionEvent motionevent, int i) {
		if (i == 0) {
			return 0;
		} else {
			throw new IndexOutOfBoundsException(
					"Pre-Eclair does not support multiple pointers");
		}
	}

	public float c(MotionEvent motionevent, int i) {
		if (i == 0) {
			return motionevent.getX();
		} else {
			throw new IndexOutOfBoundsException(
					"Pre-Eclair does not support multiple pointers");
		}
	}

	public float d(MotionEvent motionevent, int i) {
		if (i == 0) {
			return motionevent.getY();
		} else {
			throw new IndexOutOfBoundsException(
					"Pre-Eclair does not support multiple pointers");
		}
	}
}
