package com.main;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class mo extends mt {

	final jq a;

	public mo(jq jq1) {
		a = jq1;
	}

	public CharSequence a() {
		return a.b;
	}

	public boolean a(Context context) {
		boolean flag;
		if (a.j == -1) {
			vi.a(context, 0x7f0f0036);
			flag = false;
		} else {
			Intent intent = vk.c();
			boolean flag1;
			if (a.i != null) {
				intent.setClassName(a.h.getPackageName(), a.i);
			} else {
				intent.setComponent(a.h);
			}
			intent.setFlags(0x10200000);
			flag1 = vk.c(context, intent);
			flag = flag1;
			if (!flag1) {
				String sttr = (new StringBuilder())
						.append("Failed to launch app: ")
						.append(intent.getComponent().toString()).toString();
				vj.b(d, sttr);
				tq.a(vj.a("launch_failure_", 1, true), sttr);
				return flag1;
			}
		}
		return flag;
	}

	public Drawable b() {
		Drawable drawable;
		if (a.c == null) {
			drawable = null;
		} else {
			drawable = (Drawable) a.c.get();
		}
		if (drawable != null)
			;
		return drawable;
	}

	public boolean b(Context context) {
		return vk.a(context, a.h.getPackageName());
	}

	public String e() {
		return a.h.flattenToString();
	}

	public jq h() {
		return a;
	}

	public String i() {
		return a.h.getPackageName();
	}
}
