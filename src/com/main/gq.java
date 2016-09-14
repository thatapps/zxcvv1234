package com.main;

import org.json.JSONObject;

public class gq {
	private final String a;
	private final int b;
	private final int c;

	private gq(String paramString, int paramInt1, int paramInt2) {
		this.a = paramString;
		this.b = paramInt1;
		this.c = paramInt2;
	}

	public static gq a(JSONObject paramJSONObject) {
		gq localgq = null;
		if (paramJSONObject != null) {
			String str = paramJSONObject.optString("url");
			if (str != null) {
				localgq = new gq(str, paramJSONObject.optInt("width", 0),
						paramJSONObject.optInt("height", 0));
			}
		}

		return localgq;
	}

	public String a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}
}
