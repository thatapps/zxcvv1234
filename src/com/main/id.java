package com.main;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class id {
	private final String a;
	private final String b;
	private final String c;
	private final List d;
	private final String e;
	private final String f;

	private id(String paramString1, String paramString2, String paramString3,
			List paramList, String paramString4, String paramString5) {
		this.a = paramString1;
		this.b = paramString2;
		this.c = paramString3;
		this.d = paramList;
		this.e = paramString4;
		this.f = paramString5;
	}

	public static id a(JSONObject paramJSONObject) {
		if (paramJSONObject == null) {
		}
		String str1;
		String str2;
		String str3;
		id localid;
		ArrayList localArrayList;
		for (localid = null;; localid = new id(str1, str2, str3,
				localArrayList, paramJSONObject.optString("market_uri"),
				paramJSONObject.optString("fallback_url"))) {

			str1 = paramJSONObject.optString("package");
			str2 = paramJSONObject.optString("appsite");
			str3 = paramJSONObject.optString("appsite_url");
			JSONArray localJSONArray = paramJSONObject
					.optJSONArray("key_hashes");
			localArrayList = new ArrayList();
			if (localJSONArray != null) {
				for (int i = 0; i < localJSONArray.length(); i++) {
					localArrayList.add(localJSONArray.optString(i));
				}
			}
			return localid;
		}

	}

	public String a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public String c() {
		return this.c;
	}
}
