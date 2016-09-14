package com.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ib {
	private static String a = null;

	@TargetApi(17)
	private static String a(Context paramContext) {
		return WebSettings.getDefaultUserAgent(paramContext);
	}

	public static String a(Context paramContext, hy paramhy) {
		String str;
		str = a;
		if (hy.b == paramhy) {
			str = System.getProperty("http.agent");
			return str;
		}
		if (a == null) {
			if (Build.VERSION.SDK_INT < 17) {
				{

					a = a(paramContext, "android.webkit.WebSettings",
							"android.webkit.WebView");
				}

				{
					try {
						a = a(paramContext,
								"android.webkit.WebSettingsClassic",
								"android.webkit.WebViewClassic");
					} catch (Exception localException2) {
						WebView localWebView = new WebView(
								paramContext.getApplicationContext());
						a = localWebView.getSettings().getUserAgentString();
						localWebView.destroy();
					}
				}
				a = a(paramContext);
			}
		}
return str;
	}

	private static String a(Context paramContext, String paramString1,
			String paramString2) {
		Class localClass = null;
		try {
			localClass = Class.forName(paramString1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class[] arrayOfClass = new Class[2];
		arrayOfClass[0] = Context.class;
		try {
			arrayOfClass[1] = Class.forName(paramString2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor localConstructor = null;
		try {
			localConstructor = localClass
					.getDeclaredConstructor(arrayOfClass);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		localConstructor.setAccessible(true);
		Method localMethod = null;
		try {
			localMethod = localClass.getMethod("getUserAgentString",
					new Class[0]);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object[] arrayOfObject = new Object[2];
			arrayOfObject[0] = paramContext;
			arrayOfObject[1] = null;
			String str = null;
			try {
				str = (String) localMethod.invoke(
						localConstructor.newInstance(arrayOfObject), new Object[0]);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return str;
		} finally {
			localConstructor.setAccessible(false);
		}
	}
}
