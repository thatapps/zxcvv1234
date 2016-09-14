package com.main;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class hi {
	private String a;
	private Map b;
	private int c;

	public hi(String paramString, Map paramMap, int paramInt) {
		this.a = paramString;
		this.b = paramMap;
		this.c = paramInt;
	}

	public static hi a(Exception paramException) {
		HashMap localHashMap = new HashMap();
		localHashMap.put("ex", paramException.getClass().getSimpleName());
		localHashMap.put("ex_msg", paramException.getMessage());
		return new hi("error", localHashMap,
				(int) (System.currentTimeMillis() / 1000L));
	}

	public JSONObject a() {
		JSONObject localJSONObject = new JSONObject();
		try {
			localJSONObject.put("name", this.a);
			localJSONObject.put("data", new JSONObject(this.b));
			localJSONObject.put("time", this.c);
			return localJSONObject;
		} catch (JSONException localJSONException) {
		
				localJSONException.printStackTrace();
			
		}
		return localJSONObject;
	}
}
