package com.main;

import android.view.accessibility.AccessibilityEvent;

public final class pp {

	public AccessibilityEvent a;
	public int b;
	public CharSequence c;

	public pp(AccessibilityEvent accessibilityevent, int i,
			CharSequence charsequence) {
		a(accessibilityevent, i, charsequence);
	}

	void a(AccessibilityEvent accessibilityevent, int i,
			CharSequence charsequence) {
		a = AccessibilityEvent.obtain(accessibilityevent);
		b = i;
		c = charsequence;
	}
}
