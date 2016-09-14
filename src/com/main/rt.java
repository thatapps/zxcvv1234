package com.main;

import android.content.Context;
import android.os.Vibrator;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class rt extends rn {

	private Context a;
	private Object b;
	private boolean c;
	private Method d;

	rt(Context context) {
		c = false;
		a = context;
	}

	private void a(boolean flag) {
		c = flag;
		try {
			d.invoke(b, new Object[] { Boolean.valueOf(flag) });
			return;
		} catch (Exception exception) {
			return;
		}
	}

	public boolean a() {
		try {
			Object obj = (Vibrator) a.getSystemService("vibrator");
			Field field = Class.forName(obj.getClass().getName())
					.getDeclaredField("mService");
			field.setAccessible(true);
			b = field.get(obj);
			d = b.getClass().getMethod("setFlashlightEnabled",
					new Class[] { Boolean.TYPE });
			obj = b;
			d.invoke(obj, new Object[] { Boolean.valueOf(true) });
			d.invoke(obj, new Object[] { Boolean.valueOf(false) });
			d();
		} catch (Exception exception) {
			return false;
		}
		return true;
	}

	public boolean b() {
		return c;
	}

	public void c() {
		if (c) {
			e();
		}
	}

	public void d() {
		if (!c) {
			a(true);
		}
	}

	public void e() {
		if (c) {
			a(false);
		}
	}
}
