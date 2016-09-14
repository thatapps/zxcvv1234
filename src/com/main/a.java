package com.main;
import android.app.Activity;
import android.os.Build;
/*
	 * Decompiled with CFR 0_92.
	 * 
	 * Could not load the following classes:
	 *  android.app.Activity
	 *  android.os.Build
	 *  android.os.Build$VERSION
	 */
/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build
 *  android.os.Build$VERSION
 */

	public class a
	extends bu {
	    public static void a(Activity activity) {
	        if (Build.VERSION.SDK_INT >= 21) {
	            b.a(activity);
	            return;
	        }
	        activity.finish();
	    }
	}

