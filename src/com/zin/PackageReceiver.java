package com.lazyswipe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.main.js;
import com.main.vj;

public class PackageReceiver extends BroadcastReceiver {
	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.PackageReceiver.class.getSimpleName())
			.toString();

	public PackageReceiver() {
	}

	public void onReceive(Context context, Intent intent) {
		boolean flag = false;
		SwipeApplication swipeapplication = (SwipeApplication) context
				.getApplicationContext();
		js js1 = swipeapplication.a(false);
		String s = a;
		StringBuilder stringbuilder = (new StringBuilder())
				.append("Action received: ").append(intent.getAction())
				.append("; model is running? ");
		if (js1 != null) {
			flag = true;
		}
		vj.a(s, stringbuilder.append(flag).toString());
		if (js1 != null) {
			return;
		} else {
			swipeapplication.b().onReceive(context, intent);
			return;
		}
	}
}
