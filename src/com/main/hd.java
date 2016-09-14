package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class hd extends BroadcastReceiver {
	private Object a;

	hd(hb paramhb) {
	}

	public void a() {
		IntentFilter localIntentFilter = new IntentFilter();
		localIntentFilter.addAction("com.facebook.ads.native.impression:"
				+ hb.i((hb) this.a));
		localIntentFilter.addAction("com.facebook.ads.native.click:"
				+ hb.i((hb) this.a));
		bx.a(hb.d((hb) this.a)).a(this, localIntentFilter);
	}

	public void onReceive(Context paramContext, Intent paramIntent) {
		String str = paramIntent.getAction().split(":")[0];
		if ("com.facebook.ads.native.impression".equals(str)) {
			hb.h((hb) this.a).d();
		}
		
		
			if ("com.facebook.ads.native.click".equals(str)) {
				hb.e((hb) this.a).a(paramContext, null, true);
			}
		
	}
}
