package com.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.util.Log;

public class uo {
	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static Class a(Object object, String string) {
		if (object != null) {
			return object.getClass();
		}
		Class class_ = null;
		if (string == null)
			return class_;
		int n = string.length();
		class_ = null;
		if (n <= 0)
			return class_;
		try {
			return Class.forName((String) string);
		} catch (Throwable var4_5) {
			Log.w((String) "Swipe.ReflectionUtils",
					(String) ("exception when getting class " + string + ": " + var4_5
							.getMessage()));
			return null;
		}
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Enabled
	 * unnecessary exception pruning Lifted jumps to return sites
	 */
	public static Object a(Object var0, Field var1_1) {
		Object var3_4 = null;
		try {
			boolean var6_2 = var1_1.isAccessible();
			if (!var6_2) {
				var1_1.setAccessible(true);
			}
			var3_4 = var1_1.get(var0);
			Object var7_3 = var3_4;
			if (var6_2 != false)
				return var3_4;
		} catch (Throwable var2_5) {
			var3_4 = null;
			Throwable var4_6 = var2_5;
			Log.w((String) "Swipe.ReflectionUtils", (String) "exception",
					(Throwable) var4_6);
			return var3_4;

		}
		var1_1.setAccessible(false);

		return var3_4;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Enabled
	 * unnecessary exception pruning Lifted jumps to return sites
	 */
	public static Object a(Object var0, Method var1_1) {
		Object var3_4 = null;
		try {
			boolean var6_2 = var1_1.isAccessible();
			if (!var6_2) {
				var1_1.setAccessible(true);
			}
			var3_4 = var1_1.invoke(var0, new Object[0]);

			Object var7_3 = var3_4;
			if (var6_2 != false)
				return var3_4;
		} catch (Throwable var2_5) {
			var3_4 = null;
			Throwable var4_6 = var2_5;
			Log.w((String) "Swipe.ReflectionUtils", (String) "exception",
					(Throwable) var4_6);
			return var3_4;

		}
		var1_1.setAccessible(false);
		return var3_4;

	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Enabled
	 * unnecessary exception pruning Lifted jumps to return sites
	 */
	public static Object a(Object var0, Method var1_1,
			Object... var2_2) {
		Object var4_5 = null;
		try {
			boolean var7_3 = var1_1.isAccessible();
			if (!var7_3) {
				var1_1.setAccessible(true);
			}
			var4_5 = var1_1.invoke(var0, var2_2);
			Object var8_4 = var4_5;
			if (var7_3 != false)
				return var4_5;
		} catch (Throwable var3_6) {
			var4_5 = null;
			Throwable var5_7 = var3_6;
			Log.w((String) "Swipe.ReflectionUtils", (String) "exception",
					(Throwable) var5_7);
			return var4_5;

		}
		var1_1.setAccessible(false);
		return var4_5;

	}

	public static Method a(Class class_, String string) {
		return uo.a(class_, string, null);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static Method a(Class class_, String string, Class[] arrclass) {
		Method[] method = null;
		method =class_.getDeclaredMethods();
		
		if (string == null)
			return null;
		if (string.length() <= 0)
			return null;
		if (arrclass == null)
			try {
				
				return class_.getDeclaredMethod(string, new Class[0]);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			//method =class_.getDeclaredMethod(string, new Class[0]);
			//return class_.getDeclaredMethod(string, arrclass);
		} catch (Throwable var3_4) {
			Log.w((String) "Swipe.ReflectionUtils",
					(String) ("exception when getting method " + string + ": " + var3_4
							.getMessage()));
		}
		return method[0];
	}

	public static Field b(Class class_, String string) {
		try {
			Field field = class_.getField(string);
			return field;
		} catch (Throwable var2_3) {
			Log.w((String) "Swipe.ReflectionUtils",
					(String) ("exception when getting field " + string + ": " + var2_3
							.getMessage()));
			return null;
		}
	}

	public static Field c(Class class_, String string) {
		try {
			Field field = class_.getDeclaredField(string);
			return field;
		} catch (NoSuchFieldException var4_3) {
			Log.w((String) "Swipe.ReflectionUtils", (String) "exception",
					(Throwable) var4_3);
			return null;
		} catch (Throwable var2_4) {
			Log.w((String) "Swipe.ReflectionUtils", (String) "exception",
					(Throwable) var2_4);
			return null;
		}
	}
}
