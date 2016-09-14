package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

public abstract class sz extends BroadcastReceiver {
	private final IntentFilter a = new IntentFilter();

	public sz() {
		this.a.addAction("android.intent.action.PACKAGE_ADDED");
		this.a.addAction("android.intent.action.PACKAGE_REMOVED");
		this.a.addAction("android.intent.action.PACKAGE_CHANGED");
		this.a.addDataScheme("package");
	}

	private static String a(Intent paramIntent) {
		Uri localUri = paramIntent.getData();
		if (localUri == null) {
		}
		for (String str = null;; str = localUri.getSchemeSpecificPart()) {
			return str;
		}
	}

	protected abstract void a(String paramString);

	protected abstract void b(String paramString);

	protected abstract void c(String paramString);

	public void onReceive(Context var1_1, Intent var2_2) {
		String var3_3 = sz.a(var2_2);
		String var4_4 = var2_2.getAction();
		int var5_5 = -1;
		switch (var4_4.hashCode()) {
		case 1544582882: {
			if (var4_4.equals((Object) "android.intent.action.PACKAGE_ADDED")) {
				var5_5 = 0;
				break;
			} else {

				switch (var5_5) {
				default: {
					return;
				}
				case 0: {
					this.a(var3_3);
					return;
				}
				case 1: {
					this.b(var3_3);
					return;
				}
				case 2:

				case 172491798:

				case 525384130: {
					if (var4_4
							.equals((Object) "android.intent.action.PACKAGE_REMOVED")) {
						var5_5 = 1;
					}
				}

					if (var4_4
							.equals((Object) "android.intent.action.PACKAGE_CHANGED")) {
						var5_5 = 2;
					}
				}
			}
			this.c(var3_3);
		}
		}
		
	}
}