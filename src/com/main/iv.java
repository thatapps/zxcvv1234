package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;

public final class iv extends BroadcastReceiver {
	final /* synthetic */ SwipeService a;

    public iv(SwipeService swipeService) {
        this.a = swipeService;
    }


	private void a(Intent intent) {
		String string = intent.getStringExtra("state");
		vj.a("Swipe.Service", "Phone state changed: " + string);
		if (TelephonyManager.EXTRA_STATE_RINGING.equals((Object) string)) {
			SwipeService.a((Context) this.a, true);
			Fan.c(true);
			if (this.a.h.l())
				return;
			{
				this.a.h.e();
				return;
			}
		} else {
			if (!TelephonyManager.EXTRA_STATE_IDLE.equals((Object) string))
				return;
			{
				SwipeService.a((Context) this.a, false);
				if (this.a.h.l())
					return;
				{
					SwipeService.a((Context) this.a);
					return;
				}
			}
		}
	}

	private void b(Intent intent) {
		String string = intent.getStringExtra("reason");
		vj.a("Swipe.Service", "Closing system dialogs, reason: " + string);
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		int n = -1;
		switch (string.hashCode()) {
		default: {
			break;
		}
		case 1092716832: {
			if (!string.equals((Object) "homekey"))
				break;
			n = 0;
		}
		}
		switch (n) {
		default: {
			return;
		}
		case 0:
		
		Fan.c(true);
		SwipeService.i();
		}
	}

	public void a() {
		IntentFilter localIntentFilter = new IntentFilter(
				"android.intent.action.CLOSE_SYSTEM_DIALOGS");
		localIntentFilter.addAction("android.intent.action.PHONE_STATE");
		((Context) this.a).registerReceiver(this, localIntentFilter);
	}

	public void b() {
		((Context) this.a).unregisterReceiver(this);
	}

	public void onReceive(Context paramContext, Intent paramIntent) {
		String str = paramIntent.getAction();
		if (TextUtils.isEmpty(str)) {
		}

		int i = -1;
		switch (str.hashCode()) {
		}

		switch (i) {
		default:
			break;
		case 0:
			a(paramIntent);
			// break;
			if (str.equals("android.intent.action.PHONE_STATE")) {
				i = 0;
				// continue;
				if (str.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
					i = 1;
				}
			}
			break;
		}

		b(paramIntent);

	}
}
