package com.main;

import java.io.File;
import java.util.Locale;

import android.content.Context;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

final class om implements Runnable {
	private on a;

	om(on paramon) {
		this.a = paramon;
	}

	private String a(Context context, File file, boolean bl) {
		int n = 1;
		if (!(bl && System.currentTimeMillis() - file.lastModified() <= 86400000)) {
			vj.a(ol.a, "Getting app configuration data...");
			Locale locale = Locale.US;
			Object[] arrobject = new Object[6];
			arrobject[0] = "400105";
			arrobject[n] = 2001;
			arrobject[2] = "32400";
			int n2 = vk.b(context, "com.android.vending") ? n : 0;
			arrobject[3] = n2;
			int n3 = vk.b(context, "com.google.android.gms") ? n : 0;
			arrobject[4] = n3;
			if (!vk.b(context, "com.facebook.katana")) {
				n = 0;
			}
			arrobject[5] = n;
			up up = tz
					.a(context,
							String.format(
									(Locale) locale,
									(String) "http://i.haloapps.com/adscfg?a=%1$s&v=%2$d&s=%3$s&gp=%4$d&gs=%5$d&fb=%6$d",
									(Object[]) arrobject), 300000, 300000);
			if (uq.a == up.a) {
				String string = up.c;
				tq.a(file, string);
				return string;
			}
		}
		return null;
	}

	public void run() {
		Object obj;
		File file;
		boolean flag1;
		SwipeApplication swipeapplication;
		boolean flag;
		if (!ol.u) {
			flag = true;
		} else {
			flag = false;
		}
		ol.u = false;
		swipeapplication = SwipeApplication.e();
		file = new File(swipeapplication.getFilesDir(), ".hola_ap_config");
		flag1 = file.exists();
		obj = a(swipeapplication, file, flag1);
		if (!flag) {
			on.a(a, ((String) (obj)));
			ol.u = true;
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				ol.u = true;

			} else {

				on.a(a, ((String) (obj)));
				ol.u = true;

				on.a(a, null);
				ol.u = true;
				if (ol.a(SwipeApplication.e()) == null) {
					ol.a(SwipeApplication.e(), true);
				}
				ol.b(swipeapplication);
				return;

			}

		} else {

			if (TextUtils.isEmpty(((CharSequence) (obj)))) {

				if (!flag1) {
					// break MISSING_BLOCK_LABEL_152;
				}
				obj = tq.e(file);
				on.a(a, ((String) (obj)));

			} else {
				on.a(a, ((String) (obj)));
			}
		}
	}
}
