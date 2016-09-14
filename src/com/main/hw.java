package com.main;

import org.json.JSONArray;

final class hw {
	public static final/* enum */hw a = new hw("APP_AD", 0, 0);
	public static final/* enum */hw b = new hw("LINK_AD", 1, 1);
	public static final/* enum */hw c = new hw("APP_AD_V2", 2, 2);
	public static final/* enum */hw d = new hw("LINK_AD_V2", 3, 3);
	public static final/* enum */hw e = new hw("APP_ENGAGEMENT_AD", 4, 4);
	public static final/* enum */hw f = new hw("AD_CHOICES", 5, 5);
	public static final/* enum */hw g = new hw("JS_TRIGGER", 6, 6);
	public static final/* enum */hw h = new hw(
			"JS_TRIGGER_NO_AUTO_IMP_LOGGING", 7, 7);
	public static final/* enum */hw i = new hw("VIDEO_AD", 8, 8);
	public static final/* enum */hw j = new hw("INLINE_VIDEO_AD", 9, 9);
	public static final/* enum */hw k = new hw("BANNER_TO_INTERSTITIAL", 10,
			10);
	public static/* enum */hw l = new hw("NATIVE_CLOSE_BUTTON", 11, 11);
	private static final hw[] n;
	private static final String o;
	private static final/* synthetic */hw[] p;
	private int m;

	static {
		hw[] arrhw = new hw[] { a, b, c, d, e, f, g, h, i, j, k, l };
		p = arrhw;
		hw[] arrhw2 = new hw[] { d, e, f, h, l };
		n = arrhw2;
		JSONArray jSONArray = new JSONArray();
		hw[] arrhw3 = n;
		int n = arrhw3.length;
		for (int i = 0; i < n; ++i) {
			jSONArray.put(arrhw3[i].a());
		}
		o = jSONArray.toString();
	}

	private hw(String string2, int n2, int n3) {
		super();

		// this.m = string2;
	}

	public static String b() {
		return o;
	}

	public static hw valueOf(String string) {
		// return (hw)Enum.valueOf((Class)hw.class, (String)string);
		return null;
	}

	public static hw[] values() {
		return (hw[]) p.clone();
	}

	int a() {
		return this.m;
	}
}