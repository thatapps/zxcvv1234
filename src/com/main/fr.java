package com.main;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;

public class fr {
	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static fs a(Context context) {
		fs fs =null;
		if (Looper.myLooper() == Looper.getMainLooper()) {
			throw new IllegalStateException(
					"Cannot be called from the main thread");
		}
		try {
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ft ft = new ft();
		Intent intent = new Intent(
				"com.google.android.gms.ads.identifier.service.START");
		intent.setPackage("com.google.android.gms");
		if (!context.bindService(intent, (ServiceConnection) ft, 1))
			//throw new IOException("Google Play connection failed");
		try {
			fu fu = new fu(ft.a());
			 fs = new fs(fu.a(), fu.a(true));
			
		} catch (Exception var9_6) {
			//throw var9_6;
		} finally {
			context.unbindService((ServiceConnection) ft);
		}
		return fs;
	}

}
