package com.main;

import java.lang.reflect.Method;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;

import com.lazyswipe.zev.R;

public class rf extends rc {
	private Method a;
	private Method b;

	public rf(Context paramContext) {
		this(paramContext, null);
	}

	public rf(Context paramContext, rd paramrd) {
		super(paramContext, paramrd);
		try {
			Class[] arrayOfClass = new Class[2];
			arrayOfClass[0] = WifiConfiguration.class;
			arrayOfClass[1] = Boolean.TYPE;
			this.a = WifiManager.class.getDeclaredMethod("setWifiApEnabled",
					arrayOfClass);
			this.a.setAccessible(true);
			this.b = WifiManager.class.getDeclaredMethod("getWifiApState",
					new Class[0]);
			this.b.setAccessible(true);
			return;
		} catch (NoSuchMethodException localNoSuchMethodException) {
			
		}
	}

	private int b(int n) {
		switch (n) {
		default: {
			return 4;
		}
		case 11: {
			return 0;
		}
		case 13: {
			return 1;
		}
		case 10: {
			return 3;
		}
		case 12:
		}
		return 2;
	}

	public int a(Context context) {
		if (this.b != null) {
			try {
				int n = this.b((Integer) this.b.invoke(
						context.getSystemService("wifi"), new Object[0]));
				return n;
			} catch (Exception var2_3) {
				// empty catch block
			}
		}
		return 0;
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_wifi_ap;
	}

	public String a() {
		return "android.net.wifi.WIFI_AP_STATE_CHANGED";
	}

	public void a(Context context, Intent intent) {
		if (!"android.net.wifi.WIFI_AP_STATE_CHANGED".equals((Object) intent
				.getAction())) {
			return;
		}
		this.a(context, this.b(intent.getIntExtra("wifi_state", -1)));
	}

	@SuppressWarnings("unchecked")
	public boolean a(Context var1_1, boolean var2_2) {

		final WifiManager var4_3 = (WifiManager) var1_1
				.getSystemService("wifi");

		if (this.a == null) {
			try {
				if (var4_3.isWifiEnabled()) {
					new AsyncTask() {

						protected Void a(Void... arrvoid) {
							try {
								var4_3.setWifiEnabled(false);
								Method method = rf.this.a;
								WifiManager wifiManager = var4_3;
								Object[] arrobject = new Object[] { null, true };
								method.invoke((Object) wifiManager, arrobject);
							} finally {
								return null;
							}
						}

						protected Object doInBackground(
								Object[] arrobject) {
							return this.a((Void[]) arrobject);
						}
					}.execute((Object[]) new Void[0]);
					return super.a(var1_1, var2_2);
				}

				 

				if (!var2_2) {

					Method var6_4 = this.a;
					Object[] var7_5 = new Object[] { null, var2_2 };
					var6_4.invoke((Object) var4_3, var7_5);
					return super.a(var1_1, var2_2);
				}
			} catch (Exception var5_6) {
				vj.a("Swipe.Tile", "Could not toggle wifi ap",
						(Throwable) var5_6);
			}

			this.i(var1_1);
		}
		return true;

	}

	public Intent b(Context paramContext) {
		return a("com.android.settings", "com.android.settings.TetherSettings");
	}

	public String b() {
		return "Wi-Fi AP";
	}

	public int c() {
		return R.string.title_tile_wifi_ap;
	}
}
