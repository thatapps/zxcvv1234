package com.main;

import java.lang.reflect.Method;

import android.hardware.Camera;
import android.util.Log;

public class rs extends rn {
	private Camera a;

	public rs() {
		try {
			this.a = Camera.open();
			return;
		} catch (Throwable localThrowable) {

			Log.w("Swipe.Light",
					"Open camera failed: " + localThrowable.getMessage());

		}
	}

	public boolean a() {
		boolean bool = true;
		try {
			Camera.Parameters localParameters = this.a.getParameters();
			Class[] arrayOfClass1 = new Class[1];
			arrayOfClass1[0] = String.class;
			Method localMethod1 = Camera.Parameters.class.getDeclaredMethod(
					"setFlashLightMode", arrayOfClass1);
			Object[] arrayOfObject1 = new Object[1];
			arrayOfObject1[0] = "on";
			localMethod1.invoke(localParameters, arrayOfObject1);
			Class[] arrayOfClass2 = new Class[1];
			arrayOfClass2[0] = String.class;
			Method localMethod2 = Camera.Parameters.class.getDeclaredMethod(
					"setCameraMode", arrayOfClass2);
			Object[] arrayOfObject2 = new Object[1];
			arrayOfObject2[0] = "camera-status-record";
			localMethod2.invoke(localParameters, arrayOfObject2);
			Camera.Parameters.class.getDeclaredMethod("getFlashLightMode",
					new Class[0]).invoke(localParameters, new Object[0]);

		} catch (Exception localException) {

			Log.e("Swipe.Light", "LedLightMeizuMx is not available ",
					localException);
			bool = false;

		}
		return bool;
	}

	public boolean b() {
		boolean bool1 = false;
		try {
			Camera.Parameters localParameters = this.a.getParameters();
			Object localObject = Camera.Parameters.class.getDeclaredMethod(
					"getFlashLightMode", new Class[0]).invoke(localParameters,
					new Object[0]);
			if ((localObject instanceof String)) {
				boolean bool2 = "on".equals(localObject);
				bool1 = bool2;
			}
		} catch (Exception localException) {

			Log.e("Swipe.Light", "LedLightMeizuMx isOn error ", localException);

		}
		return bool1;
	}

	public void c() {
		e();
		this.a.release();
		this.a = null;
	}

	public void d() {
		try {
			Camera.Parameters localParameters = this.a.getParameters();
			Class[] arrayOfClass1 = new Class[1];
			arrayOfClass1[0] = String.class;
			Method localMethod1 = Camera.Parameters.class.getDeclaredMethod(
					"setFlashLightMode", arrayOfClass1);
			Object[] arrayOfObject1 = new Object[1];
			arrayOfObject1[0] = "on";
			localMethod1.invoke(localParameters, arrayOfObject1);
			Class[] arrayOfClass2 = new Class[1];
			arrayOfClass2[0] = String.class;
			Method localMethod2 = Camera.Parameters.class.getDeclaredMethod(
					"setCameraMode", arrayOfClass2);
			Object[] arrayOfObject2 = new Object[1];
			arrayOfObject2[0] = "camera-status-record";
			localMethod2.invoke(localParameters, arrayOfObject2);
			this.a.setParameters(localParameters);
			return;
		} catch (Exception localException) {

			Log.e("Swipe.Light", "LedLightMeizuMx start error ", localException);

		}
	}

	public void e() {
		try {
			Camera.Parameters localParameters = this.a.getParameters();
			Class[] arrayOfClass = new Class[1];
			arrayOfClass[0] = String.class;
			Method localMethod = Camera.Parameters.class.getDeclaredMethod(
					"setFlashLightMode", arrayOfClass);
			Object[] arrayOfObject = new Object[1];
			arrayOfObject[0] = "off";
			localMethod.invoke(localParameters, arrayOfObject);
			this.a.setParameters(localParameters);
			return;
		} catch (Exception localException) {
			for (;;) {
				Log.e("Swipe.Light", "LedLightMeizuMx stop error ",
						localException);
			}
		}
	}
}
