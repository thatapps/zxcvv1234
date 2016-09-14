package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.zev.R;

public class rg extends rc {
	private String a;
	private final BroadcastReceiver b;

	public rg(Context paramContext) {
		this(paramContext, null);
	}

	public rg(Context context, rd rd) {
		super(context, rd);
		b = new BroadcastReceiver() {

			final rg a;

			public void onReceive(Context context1, Intent intent) {
				// rg.a(context1);

				NetworkInfo info = (NetworkInfo) intent
						.getParcelableExtra("networkInfo");
				if (info == null) {
					// break MISSING_BLOCK_LABEL_56;
				}
				if (!info.isConnected()) {
					// break MISSING_BLOCK_LABEL_56;
				}
				WifiInfo wifiInfo = (WifiInfo) intent
						.getParcelableExtra("wifiInfo");
				if (wifiInfo != null) {
					try {
						rg.a(a, wifiInfo.getSSID().toString());
					}
					// Misplaced declaration of an exception variable
					catch (Exception exception) {
					}
				}
				a.g.sendEmptyMessage(101);
				return;
			}

			{
				a = rg.this;
				// super();
			}
		};
	}

	static String a(rg rg1, String s) {
		rg1.a = s;
		return s;
	}

	private static int b(int n) {
		switch (n) {
		default: {
			return 4;
		}
		case 1: {
			return 0;
		}
		case 3: {
			return 1;
		}
		case 0: {
			return 3;
		}
		case 2:
		}
		return 2;
	}

	private String b(String string) {
		int n = string.length();
		char c = string.charAt(0);
		int n2 = 0;
		if (c == '\"') {
			n2 = 1;
		}
		int n3 = string.charAt(n - 1) == '\"' ? n - 1 : n;
		if (n2 != 0)
			return string.substring(n2, n3);
		if (n3 == n)
			return string;
		return string.substring(n2, n3);
	}

	public int a(Context context) {
		int n;
		WifiManager wifiManager = (WifiManager) context
				.getSystemService("wifi");
		if (wifiManager == null)
			return 4;
		try {
			n = rg.b(wifiManager.getWifiState());
			if (1 != n)
				return n;
		} catch (Exception var3_4) {
			return 4;
		}
		ui.a((Runnable) new rh(this));
		return n;
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_wifi;
	}

	public String a() {
		return "android.net.wifi.WIFI_STATE_CHANGED";
	}

	public void a(Context context, Intent intent) {
		if (!this.a().equals((Object) intent.getAction())) {
			return;
		}
		this.a(context, rg.b(intent.getIntExtra("wifi_state", -1)));
	}

	@SuppressWarnings("unchecked")
	public boolean a(Context context, final boolean bl) {
		final WifiManager wifiManager = (WifiManager) context
				.getSystemService("wifi");
		if (wifiManager != null) {
			new AsyncTask() {

				/*
				 * Enabled force condition propagation Lifted jumps to return
				 * sites
				 */
				protected Void a(Void... arrvoid) {
					try {
						wifiManager.setWifiEnabled(bl);
						do {
							return null;
							// break;
						} while (true);
					} catch (Throwable var2_2) {
						return null;
					}
				}

				protected Object doInBackground(Object[] arrobject) {
					return this.a((Void[]) arrobject);
				}
			}.execute((Object[]) new Void[0]);
			do {
				return super.a(context, bl);
				// break;
			} while (true);
		}
		Log.e((String) "Swipe.Tile", (String) "No wifi manager found");
		return super.a(context, bl);
	}

	public Intent b(Context context) {
		if (to.h() && to.v()) {
			return null;
		}
		Intent intent = new Intent("android.settings.WIFI_SETTINGS");
		if (vk.a(context, intent))
			return intent;
		return intent.setAction("android.settings.WIRELESS_SETTINGS");
	}

	public String b() {
		return "Wi-Fi";
	}

	public String b_() {
		if (!TextUtils.isEmpty((CharSequence) this.a)) {
			return this.b(this.a);
		}
		return super.b_();
	}

	public int c() {
		return R.string.title_tile_wifi;
	}

	public void g() {
		super.g();
		try {
			this.d.registerReceiver(this.b, new IntentFilter(
					"android.net.wifi.STATE_CHANGE"));
			return;
		} catch (Throwable var1_1) {
			return;
		}
	}

	public void h() {
		super.h();
		try {
			this.d.unregisterReceiver(this.b);
			return;
		} catch (Throwable var1_1) {
			return;
		}
	}
}
