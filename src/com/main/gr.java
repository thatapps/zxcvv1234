package com.main;

import org.json.JSONObject;

public class gr {
	private final double a;
	private final double b;

	private gr(double paramDouble1, double paramDouble2) {
		this.a = paramDouble1;
		this.b = paramDouble2;
	}

	public static gr a(JSONObject paramJSONObject) {
		gr localgr = null;
		if (paramJSONObject != null) {
			double d1 = paramJSONObject.optDouble("value", 0.0D);
			double d2 = paramJSONObject.optDouble("scale", 0.0D);
			if ((d1 != 0.0D) && (d2 != 0.0D)) {
				localgr = new gr(d1, d2);
			}
		}

		return localgr;
	}
}
