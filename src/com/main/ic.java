package com.main;

import java.lang.reflect.Method;

import android.content.Context;
import android.os.Looper;

public class ic {
	private final String a;
	private final boolean b;

	private ic(String paramString, boolean paramBoolean) {
		this.a = paramString;
		this.b = paramBoolean;
	}

	public static ic a(Context paramContext, ia paramia) {
		if (Looper.myLooper() == Looper.getMainLooper()) {
			throw new IllegalStateException(
					"Cannot get advertising info on main thread.");
		}
		ic localic;
		if ((paramia != null) && (!hh.a(paramia.b))) {
			localic = new ic(paramia.b, paramia.c);
		}

		Class[] arrayOfClass1 = new Class[1];
		arrayOfClass1[0] = Context.class;
		Method localMethod1 = hz.a(
				"com.google.android.gms.common.GooglePlayServicesUtil",
				"isGooglePlayServicesAvailable", arrayOfClass1);
		if (localMethod1 == null) {
			localic = null;
		} else {
			Object[] arrayOfObject1 = new Object[1];
			arrayOfObject1[0] = paramContext;
			Object localObject1 = hz.a(null, localMethod1, arrayOfObject1);
			if ((localObject1 == null)
					|| (((Integer) localObject1).intValue() != 0)) {
				localic = null;
			} else {
				Class[] arrayOfClass2 = new Class[1];
				arrayOfClass2[0] = Context.class;
				Method localMethod2 = hz
						.a("com.google.android.gms.ads.identifier.AdvertisingIdClient",
								"getAdvertisingIdInfo", arrayOfClass2);
				if (localMethod2 == null) {
					localic = null;
				} else {
					Object[] arrayOfObject2 = new Object[1];
					arrayOfObject2[0] = paramContext;
					Object localObject2 = hz.a(null, localMethod2,
							arrayOfObject2);
					if (localObject2 == null) {
						localic = null;
					} else {
						Method localMethod3 = hz.a(localObject2.getClass(),
								"getId", new Class[0]);
						Method localMethod4 = hz.a(localObject2.getClass(),
								"isLimitAdTrackingEnabled", new Class[0]);
						if ((localMethod3 == null) || (localMethod4 == null)) {
							localic = null;
						} else {
							localic = new ic((String) hz.a(localObject2,
									localMethod3, new Object[0]),
									((Boolean) hz.a(localObject2, localMethod4,
											new Object[0])).booleanValue());
						}

					}
				}
			}
		}
		return localic;

	}

	public String a() {
		return this.a;
	}

	public boolean b() {
		return this.b;
	}
}
