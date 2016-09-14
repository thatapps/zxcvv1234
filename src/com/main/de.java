package com.main;

import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

class de {

	private static Field a;
	private static boolean b;

	static void a(LayoutInflater layoutinflater,
			android.view.LayoutInflater.Factory2 factory2) {
		if (!b) {
			try {
				a = android.view.LayoutInflater.class
						.getDeclaredField("mFactory2");
				a.setAccessible(true);
			} catch (NoSuchFieldException nosuchfieldexception) {
				Log.e("LayoutInflaterCompatHC",
						(new StringBuilder())
								.append("forceSetFactory2 Could not find field 'mFactory2' on class ")
								.append(android.view.LayoutInflater.class
										.getName())
								.append("; inflation may have unexpected results.")
								.toString(), nosuchfieldexception);
			}
			b = true;
		}
		if (a != null) {
			try {
				a.set(layoutinflater, factory2);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Log.e("LayoutInflaterCompatHC",
						(new StringBuilder())
								.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ")
								.append(layoutinflater)
								.append("; inflation may have unexpected results.")
								.toString(), e);
			}
			return;
		}

		return;
	}

	static void a(LayoutInflater layoutinflater, dh dh) {
		android.view.LayoutInflater.Factory factory;
		df df = null;
		if (dh != null) {
			df = new df(dh);
		} else {
			df = null;
		}
		layoutinflater.setFactory2(df);
		factory = layoutinflater.getFactory();
		if (factory instanceof android.view.LayoutInflater.Factory2) {
			a(layoutinflater, (android.view.LayoutInflater.Factory2) factory);
			return;
		} else {
			a(layoutinflater, ((android.view.LayoutInflater.Factory2) (dh)));
			return;
		}
	}
}
