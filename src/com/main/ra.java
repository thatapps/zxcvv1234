package com.main;

import android.content.Context;
import android.content.Intent;
import com.lazyswipe.ui.MainActivity;

public class ra extends rc {

	public ra(Context context) {
		this(context, null);
	}

	public ra(Context context, rd rd) {
		super(context, rd);
	}

	public int a(Context context) {
		return 1;
	}

	public int a(boolean flag) {
		return 0x7f0200a2;
	}

	public boolean a(int i) {
		return true;
	}

	protected Intent b(Context context) {
		return new Intent(context, com.lazyswipe.ui.MainActivity.class);
	}

	public String b() {
		return "Swipe settings";
	}

	public int c() {
		return 0x7f0f00c2;
	}

	public boolean e() {
		MainActivity.a(d);
		return true;
	}
}
