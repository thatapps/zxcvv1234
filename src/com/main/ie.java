package com.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ie implements hk {
	private final String a;
	private final String b;
	private final String c;
	private final String d;
	private final String e;
	private final hn f;
	private final Collection g;
	private final Map h;

	private ie(String paramString1, String paramString2, String paramString3,
			String paramString4, String paramString5, hn paramhn,
			Collection paramCollection, Map paramMap) {
		this.a = paramString1;
		this.b = paramString2;
		this.c = paramString3;
		this.d = paramString4;
		this.e = paramString5;
		this.f = paramhn;
		this.g = paramCollection;
		this.h = paramMap;
	}

	public static ie a(JSONObject paramJSONObject) {
		ie localie = null;
		if (paramJSONObject == null) {
		}
		JSONArray localJSONArray = null;
		Collection localCollection = null;
		HashMap localHashMap = null;

		
		String str1 = paramJSONObject.optString("markup");
		String str2 = paramJSONObject.optString("secondary_markup");
		String str3 = paramJSONObject.optString("activation_command");
		String str4 = paramJSONObject.optString("secondary_activation_command");
		String str5 = paramJSONObject.optString("native_impression_report_url");
		hn localhn = hn.a(paramJSONObject.optString("invalidation_behavior"));
		try {
			localJSONArray = new JSONArray(
					paramJSONObject.optString("detection_strings"));
			localCollection = ho.a(localJSONArray);
			JSONObject localJSONObject = paramJSONObject
					.optJSONObject("metadata");
			localHashMap = new HashMap();
			if (localJSONObject != null) {
				Iterator localIterator = localJSONObject.keys();
				while (localIterator.hasNext()) {
					String str6 = (String) localIterator.next();
					localHashMap.put(str6, localJSONObject.optString(str6));
				}
			}
		} catch (JSONException localJSONException) {

			localJSONException.printStackTrace();

			localie = new ie(str1, str2, str3, str4, str5, localhn,
					localCollection, localHashMap);
		}
		return localie;
	}

	public hn a() {
		return this.f;
	}

	public Collection b() {
		return this.g;
	}
}
