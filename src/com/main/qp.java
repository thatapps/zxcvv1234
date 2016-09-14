package com.main;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.lazyswipe.fan.Fan;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class qp {

	final Context a;
	Method b;
	Method c;
	private final TelephonyManager d;
	private final ConnectivityManager e;
	private Method f;
	private Object g;
	private Method h;

	qp(Context context) {
		a = context;
		d = (TelephonyManager) context.getSystemService("phone");
		e = (ConnectivityManager) context.getSystemService("connectivity");
		try {
			f = android.net.ConnectivityManager.class.getDeclaredMethod(
					"getMobileDataEnabled", new Class[0]);
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		f.setAccessible(true);
		if (android.os.Build.VERSION.SDK_INT >= 21 && ir.y(context)) {
			ui.a(new qq(this));
			return;
		}
		try {
			Field field = android.net.ConnectivityManager.class
					.getDeclaredField("mService");
			field.setAccessible(true);
			g = field.get(e);
			b = g.getClass().getDeclaredMethod("setMobileDataEnabled",
					new Class[] { Boolean.TYPE });
			b.setAccessible(true);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
		}
		if (b == null && android.os.Build.VERSION.SDK_INT < 21) {
			try {
				c = android.net.ConnectivityManager.class.getDeclaredMethod(
						"setMobileDataEnabled", new Class[] { Boolean.TYPE });
				c.setAccessible(true);
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
		}
		return;
	}

	static Method a(qp qp1) {
		return qp1.h;
	}

	static Method a(qp qp1, Method method) {
		qp1.h = method;
		return method;
	}

	boolean a() {
		return d.getSimState() == 1;
	}

	boolean a(boolean flag) {
		StringBuilder stringbuilder = null;
		Object obj = null;
		if (to.J() || to.u()) {

			if (flag) {

				try {
					Intent intent = new Intent(
							"android.intent.action.DATA_DEFAULT_SIM");
					intent.putExtra("simid", 1L);
					a.sendBroadcast(intent);
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					return false;
				}
				return true;
			}
			obj = new Intent("android.intent.action.DATA_DEFAULT_SIM");
			((Intent) (obj)).putExtra("simid", -1L);
			a.sendBroadcast(((Intent) (obj)));

			if (h != null) {
				uo.a(d, h, new Object[] { Boolean.valueOf(flag) });
			}

			if (android.os.Build.VERSION.SDK_INT < 21) {
				if (!ir.y(a)) {
					Fan.k();
					stringbuilder = (new StringBuilder())
							.append("settings put global mobile_data ");
				}
			}

			if (flag) {
				obj = "1";
			} else {
				obj = "0";
			}

			if (b == null) {

			}
			uo.a(g, b, new Object[] { Boolean.valueOf(flag) });

			if (c == null) {
				uo.a(e, c, new Object[] { Boolean.valueOf(flag) });

			}

		}
		return vb.a(stringbuilder.append(((String) (obj))).toString(), true,
				false).d;
	}

	boolean b() {
		boolean flag = false;
		if (f != null) {
			flag = ((Boolean) uo.a(e, f)).booleanValue();
		}
		return flag;
	}

	int c() {
		if (d == null) {
			return 0;
		} else {
			return d.getDataState();
		}
	}
}
