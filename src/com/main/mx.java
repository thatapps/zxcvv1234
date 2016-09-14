package com.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import java.lang.ref.WeakReference;
import java.util.List;

public class mx extends mt implements pj {

	private final Context a;
	private jq b;

	public mx(Context context) {
		a = context;
		String s = ir.a(context).getString("key_notification_apps_selected",
				null);
		try {
			String as[] = s.split(",");
			b = ((SwipeApplication) context.getApplicationContext()).b().a(
					as[2]);
			if (b.c == null || b.c.get() == null) {
				b.a(context.getPackageManager());
			}
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			b = null;
		}
	}

	public CharSequence a() {
		return a.getText(0x7f0f00e4);
	}

	public boolean a(Context context) {
		k();
		try {
			lk lk1 = (lk) e.getParent();
			lk1.a((FanItem) lk1.getItems().get(0), this, 0, false);
		} catch (Throwable throwable) {
		}
		SwipeApplication.c = true;
		ir.a(context, System.currentTimeMillis());
		ir.f(context, 98);
		if (Fan.getInstance() != null) {
			Fan.getInstance().b();
		}
		return false;
	}

	public Drawable b() {
		Drawable drawable;
		Drawable drawable1;
		if (b.c == null) {
			drawable = null;
		} else {
			drawable = (Drawable) b.c.get();
		}
		drawable1 = drawable;
		if (drawable == null) {
			try {
				drawable1 = b.a(a.getPackageManager());
			} catch (Exception exception) {
				return drawable;
			}
		}
		return drawable1;
	}

	public boolean b(Context context) {
		return true;
	}

	public String e() {
		return (new StringBuilder()).append("Notification service hint item: ")
				.append(b.b).toString();
	}

	public boolean f() {
		return false;
	}

	public String i() {
		return null;
	}

	public boolean j() {
		return b != null;
	}

	public void k() {
		ir.a(a).edit().putBoolean("key_recent_notification_service_hint", true)
				.apply();
	}

	public boolean q() {
		return false;
	}
}
