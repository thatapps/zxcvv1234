package com.main;

import android.content.Context;
import android.content.Intent;
import com.lazyswipe.ui.DialogActivity;

public class qy extends rc {

	public qy(Context context) {
		this(context, null);
	}

	public qy(Context context, rd rd) {
		super(context, rd);
	}

	public int a(Context context) {
		return !ir.y(context)
				&& !vk.i(context)
				&& !vk.c(d, "com.hola.screenlock",
						"com.hola.screenlock.DeviceAdminReceiver") ? 0 : 1;
	}

	public int a(boolean flag) {
		return 0x7f0200a1;
	}

	public Intent b(Context context) {
		Intent intent = a("com.android.settings",
				"com.android.settings.Settings$DeviceAdminSettingsActivity");
		if (!vk.a(context, intent)) {
			Intent intent1 = new Intent("android.settings.SECURITY_SETTINGS");
			intent = intent1;
			if (!vk.a(context, intent1)) {
				return null;
			}
		}
		return intent;
	}

	public String b() {
		return "Sleep";
	}

	public int c() {
		return 0x7f0f00c1;
	}

	public boolean d() {
		return false;
	}

	public boolean e() {
		if (ir.y(d)) {
			ui.a(new Runnable() {

				final qy a;

				public void run() {
					vb.b();
				}

				{
					a = qy.this;
					//super();
				}
			});
		} else {
			boolean flag = vk.h(d);
			boolean flag1 = vk.b(d, "com.hola.screenlock");
			if (!flag1 && !flag) {
				DialogActivity.c(d);
			} else if (flag
					&& !vk.i(d)
					|| flag1
					&& !vk.c(d, "com.hola.screenlock",
							"com.hola.screenlock.DeviceAdminReceiver")) {
				DialogActivity.d(d);
			} else if (flag) {
				vk.g(d);
			} else {
				vk.c(d, (new Intent("com.hola.screenlock.action.main"))
						.setPackage("com.hola.screenlock").addFlags(32));
			}
		}
		return true;
	}
}
