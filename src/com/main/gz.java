package com.main;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

public class gz implements hk {
	private static final String a = gz.class.getSimpleName();
	private final Uri b;
	private final String c;
	private final String d;
	private final String e;
	private final String f;
	private final gq g;
	private final gq h;
	private final gr i;
	private final String j;
	private final String k;
	private final hn l;
	private final Collection m;
	private final boolean n;
	private final gq o;
	private final String p;
	private boolean q;
	private boolean r;

	private gz(Uri paramUri, String paramString1, String paramString2,
			String paramString3, String paramString4, gq paramgq1, gq paramgq2,
			gr paramgr, String paramString5, String paramString6, hn paramhn,
			Collection paramCollection, boolean paramBoolean, gq paramgq3,
			String paramString7) {
		this.b = paramUri;
		this.c = paramString1;
		this.d = paramString2;
		this.e = paramString3;
		this.f = paramString4;
		this.g = paramgq1;
		this.h = paramgq2;
		this.i = paramgr;
		this.j = paramString5;
		this.k = paramString6;
		this.l = paramhn;
		this.m = paramCollection;
		this.n = paramBoolean;
		this.o = paramgq3;
		this.p = paramString7;
	}

	public static gz a(JSONObject paramJSONObject) {
		gz localgz = null;
		JSONArray localJSONArray = null;
		if (paramJSONObject == null) {
			localgz = null;
		}

		Uri localUri = Uri.parse(paramJSONObject.optString("fbad_command"));
		String str1 = paramJSONObject.optString("title");
		String str2 = paramJSONObject.optString("body");
		String str3 = paramJSONObject.optString("call_to_action");
		String str4 = paramJSONObject.optString("social_context");
		gq localgq1 = gq.a(paramJSONObject.optJSONObject("icon"));
		gq localgq2 = gq.a(paramJSONObject.optJSONObject("image"));
		gr localgr = gr.a(paramJSONObject.optJSONObject("star_rating"));
		String str5 = paramJSONObject.optString("impression_report_url");
		String str6 = paramJSONObject.optString("click_report_url");
		boolean bool = paramJSONObject.optBoolean("manual_imp");
		gq localgq3 = null;
		JSONObject localJSONObject = paramJSONObject
				.optJSONObject("ad_choices_icon");
		if (localJSONObject != null) {
			localgq3 = gq.a(localJSONObject);
		}
		String str7 = paramJSONObject.optString("ad_choices_link_url");
		hn localhn = hn.a(paramJSONObject.optString("invalidation_behavior"));
		try {
			localJSONArray = new JSONArray(
					paramJSONObject.optString("detection_strings"));
			localgz = new gz(localUri, str1, str2, str3, str4, localgq1,
					localgq2, localgr, str5, str6, localhn,
					ho.a(localJSONArray), bool, localgq3, str7);
			if (localgz.j()) {
				// continue;
			}
			localgz = null;
		} catch (JSONException localJSONException) {
			
				localJSONException.printStackTrace();

			
		}
		return localgz;
	}

	private Map i() {
		return Collections.singletonMap("mil", String.valueOf(true));
	}

	private boolean j() {
		if ((this.c != null) && (this.c.length() > 0) && (this.e != null)
				&& (this.e.length() > 0) && (this.g != null)
				&& (this.h != null)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public hn a() {
		return this.l;
	}

	public void a(Context paramContext, Map paramMap, boolean paramBoolean) {
		if (!this.r) {
			HashMap localHashMap = new HashMap();
			if (paramMap != null) {
				localHashMap.put("touch", hz.a(paramMap));
			}
			if (paramBoolean) {
				localHashMap.putAll(i());
			}
			hf localhf = new hf(localHashMap);
			String[] arrayOfString = new String[1];
			arrayOfString[0] = this.k;
			localhf.execute(arrayOfString);
			this.r = true;
			hz.a(paramContext, "Click logged");
		}
		gu localgu = gv.a(paramContext, this.b);
		if (localgu != null) {
		}
		try {
			localgu.a(null);
			return;
		} catch (Exception localException) {
			
				Log.e(a, "Error executing action", localException);
			
		}
	}

	public void a(boolean paramBoolean) {
		if (!this.q) {
			if (!paramBoolean) {
				for (Map localMap = i();; localMap = null) {
					hf localhf = new hf(localMap);
					String[] arrayOfString = new String[1];
					arrayOfString[0] = this.j;
					localhf.execute(arrayOfString);
					this.q = true;
					return;
				}
			}
		}

	}

	public Collection b() {
		return this.m;
	}

	public gq c() {
		return this.g;
	}

	public gq d() {
		return this.h;
	}

	public String e() {
		return this.c;
	}

	public String f() {
		return this.d;
	}

	public String g() {
		return this.e;
	}

	public boolean h() {
		return this.n;
	}
}
