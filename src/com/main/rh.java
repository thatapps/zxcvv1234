package com.main;

import java.lang.ref.WeakReference;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

class rh implements Runnable {
	private final WeakReference a;

	rh(rg paramrg) {
		this.a = new WeakReference(paramrg);
	}

	public void run() {
		try {
			if ((this.a != null) && (this.a.get() != null)) {
				NetworkInfo localNetworkInfo = ((ConnectivityManager) ((rg) this.a
						.get()).d.getSystemService("connectivity"))
						.getActiveNetworkInfo();
				if ((localNetworkInfo != null)
						&& (localNetworkInfo.isConnected())
						&& (1 == localNetworkInfo.getType())) {
					WifiInfo localWifiInfo = ((WifiManager) ((rg) this.a.get()).d
							.getSystemService("wifi")).getConnectionInfo();
					if ((localWifiInfo != null) && (this.a != null)
							&& (this.a.get() != null)) {
						rg.a((rg) this.a.get(), localWifiInfo.getSSID());
					}
				}
			}
		} catch (Throwable localThrowable) {
		}
	}
}
