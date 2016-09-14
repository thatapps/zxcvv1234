package com.main;

import android.view.KeyEvent;

class cw {

	public static int a(int i) {
		return KeyEvent.normalizeMetaState(i);
	}

	public static boolean a(int i, int j) {
		return KeyEvent.metaStateHasModifiers(i, j);
	}

	public static boolean b(int i) {
		return KeyEvent.metaStateHasNoModifiers(i);
	}
}
