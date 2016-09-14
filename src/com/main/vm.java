package com.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class vm {
	public static boolean a(Context context, View view) {
		try {
			((WindowManager) context.getSystemService("window"))
					.removeView(view);
			return true;
		} catch (Exception var2_2) {
			vj.b("Swipe.WindowManagerUtils",
					"failded to detach from window, mostly because it is already detached",
					(Throwable) var2_2);
			return false;
		}
	}

	public static boolean a(Context context, View view,
			WindowManager.LayoutParams layoutParams) {
		try {
			((WindowManager) context.getSystemService("window")).addView(view,
					(ViewGroup.LayoutParams) layoutParams);
			return true;
		} catch (Exception var3_3) {
			vj.b("Swipe.WindowManagerUtils",
					"failded to attach to window, mostly because it is already attached",
					(Throwable) var3_3);
			return false;
		}
	}
}
