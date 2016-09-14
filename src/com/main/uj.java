package com.main;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public final class uj {

	public static String a(Context context) {
		WifiInfo wifiInfo = null;
		String string = null;
		try {
			wifiInfo = ((WifiManager) context.getSystemService("wifi"))
					.getConnectionInfo();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		if (wifiInfo != null) {
			string = wifiInfo.getMacAddress();
		}

		return string;

	}

	public static boolean a(NetworkInfo networkinfo) {
		return c(networkinfo) && networkinfo.getType() == 0;
	}

	public static NetworkInfo b(Context context) {
		return ((ConnectivityManager) context.getSystemService("connectivity"))
				.getActiveNetworkInfo();
	}

	public static boolean b(NetworkInfo networkinfo) {
		return c(networkinfo) && 1 == networkinfo.getType();
	}

	public static boolean c(Context context) {
		return b(b(context));
	}

	public static boolean c(NetworkInfo networkinfo) {
		return networkinfo != null && networkinfo.isConnected();
	}

	public static boolean d(Context context) {
		return c(b(context));
	}

	public static boolean d(NetworkInfo networkinfo) {
		return networkinfo != null && networkinfo.isConnectedOrConnecting();
	}

	public static boolean e(Context context) {
		return d(b(context));
	}
}
