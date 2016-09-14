package com.main;

import com.android.support.v4.app1.Fragment;

import android.os.Bundle;


public final class p {
	private String a;
	private Class b;
	private Bundle c;
	private Fragment d;

	public static Fragment a(p p) {
		return p.d;
	}

	public static Fragment a(p p, Fragment fragment) {
		p.d = fragment;
		return fragment;
	}

	public static String b(p p) {
		return p.a;
	}

	public static Class c(p p) {
		return p.b;
	}

	public static Bundle d(p p) {
		return p.c;
	}
}
