package com.main;

import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

public class ok implements Cloneable {
	public String a;
	public String b;
	public int c;
	public String d;
	public String e;
	public String f;
	public int g;
	public String h;
	public String i;
	public String j;
	public String k;
	public boolean l;
	public int m;
	public String n;
	public String o;
	public int p;
	public int q;
	public String r;

	public static String a(int paramInt, String paramString) {
		StringBuilder localStringBuilder = new StringBuilder();
		if (paramInt <= 0) {
		}
		for (String str = "";; str = tq.a(paramInt, "") + "    ") {
			return str + paramString;
		}
	}

	private String a(Context context, String string, int n) {
		if (string.indexOf("[random_uuid]") > 0) {
			string = string.replace((CharSequence) "[random_uuid]",
					(CharSequence) UUID.randomUUID().toString());
		}
		if (string.indexOf("[androidid_md5]") > 0) {
			String string2 = to.j(context);
			String string3 = TextUtils.isEmpty((CharSequence) string2) ? ""
					: uh.a(string2);
			string = string.replace((CharSequence) "[androidid_md5]",
					(CharSequence) string3);
		}
		if (string.indexOf("[androidid]") > 0) {
			String string4 = to.j(context);
			if (TextUtils.isEmpty((CharSequence) string4)) {
				string4 = "";
			}
			string = string.replace((CharSequence) "[androidid]",
					(CharSequence) string4);
		}
		if (string.indexOf("[gaid_md5]") > 0) {
			String string5 = ge.c().u();
			String string6 = TextUtils.isEmpty((CharSequence) string5) ? ""
					: uh.a(string5);
			string = string.replace((CharSequence) "[gaid_md5]",
					(CharSequence) string6);
		}
		if (string.indexOf("[gaid]") > 0) {
			String string7 = ge.c().u();
			if (TextUtils.isEmpty((CharSequence) string7)) {
				string7 = "";
			}
			string = string.replace((CharSequence) "[gaid]",
					(CharSequence) string7);
		}
		if (string.indexOf("[imei_md5]") > 0) {
			String string8 = vh.b(context);
			String string9 = TextUtils.isEmpty((CharSequence) string8) ? ""
					: uh.a(string8);
			string = string.replace((CharSequence) "[imei_md5]",
					(CharSequence) string9);
		}
		if (string.indexOf("[imei]") > 0) {
			String string10 = vh.b(context);
			if (TextUtils.isEmpty((CharSequence) string10)) {
				string10 = "";
			}
			string = string.replace((CharSequence) "[imei]",
					(CharSequence) string10);
		}
		if (string.indexOf("[app]") > 0) {
			string = string.replace((CharSequence) "[app]",
					(CharSequence) "400105");
		}
		if (string.indexOf("[placement]") <= 0)
			return string;
		return string.replace((CharSequence) "[placement]",
				(CharSequence) ol.c[n]);
	}

	private void c() {
		this.q = 0;
		this.c = -1;
		this.p = -1;
		this.g = 0;
		this.l = false;
		this.k = null;
		this.j = null;
		this.i = null;
		this.h = null;
		this.f = null;
		this.e = null;
		this.r = null;
		this.o = null;
		this.n = null;
		this.d = null;
		this.b = null;
		this.a = null;
	}

	public ContentValues a(ContentValues paramContentValues) {
		if (paramContentValues == null) {
			paramContentValues = new ContentValues(12);
		}
		paramContentValues.put("offer_id", Integer.valueOf(this.c));
		paramContentValues.put("clickLogUrl", this.d);
		paramContentValues.put("packageName", this.a);
		paramContentValues.put("adUrl", this.b);
		paramContentValues.put("title", this.e);
		paramContentValues.put("icon", this.f);
		paramContentValues.put("size", Integer.valueOf(this.g));
		paramContentValues.put("ratingScore", this.h);
		paramContentValues.put("downloadCount", this.i);
		paramContentValues.put("impressionLogUrl", this.j);
		paramContentValues.put("placement", Integer.valueOf(this.m));
		paramContentValues.put("shortDesc", this.n);
		paramContentValues.put("category", this.o);
		return paramContentValues;
	}

	public String a() {
		return a(this.g, this.o);
	}

	public ok a(Cursor cursor) {
		int n = 1;
		this.c();
		this.c = cursor.getInt(ol.g);
		this.d = cursor.getString(ol.i);
		this.a = cursor.getString(ol.e);
		this.b = cursor.getString(ol.f);
		this.f = cursor.getString(ol.k);
		this.k = cursor.getString(ol.h);
		if (cursor.getInt(ol.j) != n) {
			n = 0;
		}
		this.l = Boolean.getBoolean(String.valueOf(n));
		this.p = cursor.getInt(ol.l);
		this.e = cursor.getString(ol.m);
		this.g = cursor.getInt(ol.p);
		this.n = cursor.getString(ol.n);
		this.o = cursor.getString(ol.o);
		this.q = cursor.getInt(ol.q);
		this.r = cursor.getString(ol.r);
		return this;
	}

	public ok a(JSONObject jSONObject, int n) {
		this.c();
		this.c = jSONObject.optInt("id");
		this.d = jSONObject.optString("clickLogUrl");
		this.a = jSONObject.optString("packageName");
		this.e = jSONObject.optString("title");
		this.f = jSONObject.optString("icon");
		this.g = jSONObject.optInt("size");
		this.h = jSONObject.optString("ratingScore");
		this.i = jSONObject.optString("downloadCount");
		this.j = jSONObject.optString("impressionLogUrl");
		this.n = jSONObject.optString("shortDesc");
		this.o = jSONObject.optString("category");
		this.q = 0;
		this.m = n;
		try {
			this.b = this.a((Context) SwipeApplication.e(),
					jSONObject.getString("adUrl"), n);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (!TextUtils.isEmpty((CharSequence) this.f)) {
			this.f = this.f + "=w" + ol.s;
		}
		return this;
	}

	public ok b() {
		try {
			return (ok) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String toString() {
		String string;
		StringBuilder stringBuilder = new StringBuilder()
				.append("PromotionApp{id=").append(this.p).append(", offer=")
				.append(this.c).append(",title=").append(this.e)
				.append(",package=").append(this.a).append(",size=")
				.append(this.g).append(",downCount=").append(this.i)
				.append(",score=").append(this.h).append(",type=")
				.append(this.o).append(",desc=").append(this.n).append(",ad=")
				.append(this.b).append(",icon=");
		String string2 = TextUtils.isEmpty((CharSequence) this.f) ? "N" : "Y";
		StringBuilder stringBuilder2 = stringBuilder.append(string2).append(
				",click=");
		String string3 = TextUtils.isEmpty((CharSequence) this.d) ? "N" : "Y";
		StringBuilder stringBuilder3 = stringBuilder2.append(string3).append(
				",show=");
		if (TextUtils.isEmpty((CharSequence) this.j)) {
			string = "N";
			return stringBuilder3.append(string).append("}").toString();
		}
		string = "Y";
		return stringBuilder3.append(string).append("}").toString();
	}
}
