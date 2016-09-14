package com.main;

import android.content.Context;

public class xa extends wd {
	private static boolean a;

	public xa(Context paramContext) {
		super(paramContext);
	}

	public static boolean b() {
		return a;
	}

	public void dismiss() {
		super.dismiss();
		a = false;
	}

	public void show() {
		super.show();
		a = true;
	}
}
