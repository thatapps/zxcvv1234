package com.main;

import android.content.Context;

public class od {
	public static float a(Context paramContext) {
		return ir.a(paramContext).getFloat("pref_lucky_lamp_cord_left", -0.01F);
	}

	public static void a(Context paramContext, float paramFloat) {
		ir.a(paramContext).edit()
				.putFloat("pref_lucky_lamp_cord_left", paramFloat).commit();
	}
}
