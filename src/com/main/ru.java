package com.main;

import java.lang.reflect.Method;

import android.util.Log;

public class ru extends rn {
	private Object a;
	private Method b;
	private Method c;
	private boolean d = false;

	@Override
	public boolean a() {
		try {
			this.a = vk.e("hardware");
			Class class_ = this.a.getClass();
			Class[] arrclass = new Class[] { Boolean.TYPE };
			this.b = class_.getDeclaredMethod("setFlashlightEnabled", arrclass);
			this.c = this.a.getClass().getDeclaredMethod(
					"getFlashlightEnabled", new Class[0]);
			this.b.setAccessible(true);
			this.c.setAccessible(true);
			return true;
		} catch (Exception var1_3) {
			return false;
		}
	}

	@Override
	public boolean b() {
		return this.d;
	}

	@Override
	public void c() {
		if (this.d) {
			this.e();
		}
	}

	@Override
	public void d() {
		try {
			Method method = this.b;
			Object object = this.a;
			Object[] arrobject = new Object[] { true };
			method.invoke(object, arrobject);
			this.d = true;
			return;
		} catch (Throwable var1_4) {
			Log.w((String) "Swipe.Light",
					(String) "LedLightServiceManager start exception",
					(Throwable) var1_4);
			return;
		}
	}

	public void e() {
		try {
			Method method = this.b;
			Object object = this.a;
			Object[] arrobject = new Object[] { false };
			method.invoke(object, arrobject);
			this.d = false;
			return;
		} catch (Throwable var1_4) {
			Log.w((String) "Swipe.Light",
					(String) "LedLightServiceManager stop exception",
					(Throwable) var1_4);
			return;
		}
	}
}
