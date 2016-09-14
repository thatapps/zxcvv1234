/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  java.lang.Object
 *  java.lang.String
 */
package com.lazyswipe.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import com.hola.alliance.AppInfo;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.Fan;
import com.main.iF;
import com.main.ir;

/*
 * Failed to analyse overrides
 */
public class PagerService extends Service {

	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.service.PagerService.class.getSimpleName())
			.toString();

	public PagerService() {
	}

	private void a(Intent intent) {
		AppInfo appInfo = iF.a(intent);
		if (intent != null) {
			SwipeService.a(this);
			if (!"com.hola.launcher".equals(((AppInfo) (appInfo)).a))
				;
		}
		stopSelf();
	}

	private void b(Intent intent) {
		if (!ir.L(this)) {
			stopSelf();
			return;
		}
		if (Fan.j()) {
			stopSelf();
			return;
		}
		boolean flag;
		if (intent.hasExtra("com.lazyswipe.extra.IS_LEFT")) {
			flag = intent.getBooleanExtra("com.lazyswipe.extra.IS_LEFT", false);
		} else {
			flag = ir.E(this);
		}
		SwipeService.a(this, SwipeService.a(this, flag).getExtras());
		stopSelf();
	}

	public IBinder onBind(Intent intent) {
		return null;
	}

	public void onCreate() {
		super.onCreate();
	}

	public void onDestroy() {
		super.onDestroy();
	}

	public int onStartCommand(Intent intent, int i, int j) {
		if (intent != null) {
			String s = intent.getAction();
			if ("com.lazyswipe.action.AllianceService".equals(s)) {
				a(intent);
				return 2;
			}
			if ("com.lazyswipe.action.openFan".equals(s)) {
				b(intent);
				return 2;
			}
		}
		return 2;
	}

}
