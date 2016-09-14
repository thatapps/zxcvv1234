package com.main;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Context;

public class hv {
	private final int a;
	private final int b;
	private final int c;
	private final List d;
	private final gk e;

	private hv(int paramInt1, int paramInt2, int paramInt3, List paramList,
			gk paramgk) {
		this.a = paramInt1;
		this.b = paramInt2;
		this.c = paramInt3;
		this.d = paramList;
		this.e = paramgk;
	}

	public static hv a(Context paramContext, JSONObject paramJSONObject) {
		int i = 0;
		int j = 1000 * paramJSONObject.optInt("refresh", 0);
		int k = 1000 * paramJSONObject.optInt("refresh_threshold", 20);
		int m = paramJSONObject.optInt("min_viewability_percentage", 10);
		JSONObject localJSONObject1 = paramJSONObject.optJSONObject("reason");
		Object localObject = null;
		if (localJSONObject1 != null) {
		}
		for (gk localgk1 = new gk(localJSONObject1.optInt("code", 2000),
				localJSONObject1.optString("message", gk.d.b()));; localgk1 = null) {
			int n = paramJSONObject.optInt("ad_type");
			ArrayList localArrayList = new ArrayList();
			JSONArray localJSONArray = paramJSONObject.optJSONArray("ads");
			JSONObject localJSONObject2 = null;
			if ((localJSONArray != null) && (localJSONArray.length() > 0)) {
				if (i < localJSONArray.length()) {
					localJSONObject2 = localJSONArray.optJSONObject(i);
					if (localJSONObject2 != null) {
					}
				}
			}
			
				i++;
				/*//break;
				
				if (n == hy.a.a()) {
					localObject = ie.a(localJSONObject2.optJSONObject("data"));
				}*/
				
					if ((localObject == null)
							|| (ho.a(paramContext, (hk) localObject))) {
						if (n == hy.a.a()) {
							localObject = ie.a(localJSONObject2
									.optJSONObject("data"));
						}
					}
					localArrayList.add(localObject);
				//	break;
					if (n == hy.b.a()) {
						localObject = gz.a(localJSONObject2
								.optJSONObject("metadata"));
						
						if (localArrayList.isEmpty()) {
						}
						for (gk localgk2 = gk.b;; localgk2 = localgk1) {
							return new hv(j, k, m, localArrayList, localgk2);
						}
					} else {
						localObject = null;
					}
				
			}
		
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public hk d() {
		if ((this.d == null) || (this.d.isEmpty())) {
		}
		for (hk localhk = null;; localhk = (hk) this.d.get(0)) {
			return localhk;
		}
	}

	public gk e() {
		return this.e;
	}
}
