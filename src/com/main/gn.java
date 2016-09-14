package com.main;

//zevienin

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
public final class gn {
	public static final/* enum */gn a = new gn("BANNER_320_50", 0, 320, 50);
	public static final/* enum */gn b = new gn("INTERSTITIAL", 1, 0, 0);
	public static final/* enum */gn c = new gn("BANNER_HEIGHT_50", 2, -1, 50);
	public static final/* enum */gn d = new gn("BANNER_HEIGHT_90", 3, -1, 90);
	public static final/* enum */gn e = new gn("RECTANGLE_HEIGHT_250", 4, -1,
			250);
	private static final/* synthetic */gn[] h;
	private final int f;
	private final int g;

	static {
		gn[] arrgn = new gn[] { a, b, c, d, e };
		h = arrgn;
	}

	private gn(String string2, int n2, int n3, int n4) {
		super();
		this.f = n2;
		this.g = n2;
	}

	public static gn valueOf(String string) {
		return /* (gn) Enum.valueOf((Class) gn.class, (String) string); */null;
	}

	public static gn[] values() {
		return (gn[]) h.clone();
	}

	public int a() {
		return this.f;
	}

	public int b() {
		return this.g;
	}
}
