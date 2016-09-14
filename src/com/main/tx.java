package com.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.PopupWindow;

public class tx {

	private static boolean a = false;
	private static boolean b = false;
	private static int c;
	private static boolean d = false;
	private static Field e = null;
	private static boolean f = false;
	private static Class g = null;
	private static boolean h = false;
	private static Method i = null;
	private static boolean j = false;
	private static Method k = null;

	private static boolean a() {
		if (!a) {
			a = true;
			try {
				c = android.view.WindowManager.LayoutParams.class.getField(
						"FLAG_HARDWARE_ACCELERATED").getInt(null);
				b = true;
			} catch (Exception exception) {
				Log.e("Swipe.HardwareAccelerationUtils", "exception", exception);
			}
		}
		return b;
	}

	public static boolean a(PopupWindow var0) {
		if (var0 == null) {
			return false;
		} else if (!a()) {
			return false;
		} else {
			if (!d) {
				d = true;
				e = uo.c(PopupWindow.class, "mPopupView");
			}

			if (e == null) {
				return false;
			} else {
				Object var3 = uo.a((Object) var0, (Field) e);
				if (var3 != null && var3 instanceof View) {
					View var2 = (View) var3;
					ViewParent var4 = var2.getParent();

					while (var4 != null && var4.getParent() != null) {
						;
					}

					if (!f) {
						f = true;
						g = uo.a((Object) null,
								(String) "android.view.ViewRootImpl");
					}

					if (g == null) {
						return false;
					} else if (!g.equals(var4.getClass())) {
						return false;
					} else {
						Context var1 = var2.getContext();
						if (var1 == null) {
							return false;
						} else {
							android.view.ViewGroup.LayoutParams var5 = var2
									.getLayoutParams();
							if (var5 != null && var5 instanceof LayoutParams) {
								LayoutParams var6 = (LayoutParams) var5;
								if ((var6.flags & c) != 0) {
									return true;
								} else {
									var6.flags |= c;
									if (!h) {
										h = true;
										i = uo.a(
												(Class) g,
												(String) "enableHardwareAcceleration",
												(Class[]) (new Class[] { LayoutParams.class }));
									}

									if (i != null) {
										uo.a((Object) var4,
												(Method) i,
												(Object[]) (new Object[] { var6 }));
										return true;
									} else {
										if (!j) {
											j = true;
											k = uo.a(
													(Class) g,
													(String) "enableHardwareAcceleration",
													(Class[]) (new Class[] {
															Context.class,
															LayoutParams.class }));
										}

										if (k != null) {
											uo.a((Object) var4, (Method) k,
													(Object[]) (new Object[] {
															var1, var6 }));
											return true;
										} else {
											return false;
										}
									}
								}
							} else {
								return false;
							}
						}
					}
				} else {
					return false;
				}
			}
		}
	}
}
