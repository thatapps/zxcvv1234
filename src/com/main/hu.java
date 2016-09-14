package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class hu extends BroadcastReceiver {
	final/* synthetic */hs a;

	hu(hs hs) {
		this.a = hs;
	}

	public void onReceive(Context paramContext, Intent paramIntent) {
		String str = paramIntent.getAction();
		if ("android.intent.action.SCREEN_OFF".equals(str)) {

			hs.a(this.a);
		}

		if (("android.intent.action.SCREEN_ON".equals(str))
				&& (hs.b(this.a) == 0)) {
			this.a.a(paramIntent.getAction());
		}

	}
}
