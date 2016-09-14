package com.main;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/*
 * Failed to analyse overrides
 */
public class jg extends jf {
	jg(String string) throws JSONException {
		super(string);
	}

	public static boolean a(Context context, String string, int n) {
		PackageInfo packageInfo = vk.c(context, string);
		if (packageInfo != null && (n <= 0 || packageInfo.versionCode >= n)) {
			return false;
		}
		return true;
	}

	public int a() {
		try {
			int n = this.getInt("totalPages");
			return n;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return 0;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public int a(Context context) {
		try {
			JSONArray jSONArray = this.getJSONArray("banners");
			int n = jSONArray.length();
			if (n <= 0) {
				return n;
			}
			ContentValues[] arrcontentValues = new ContentValues[n];
			for (int i = 0; i < n; ++i) {
				JSONObject jSONObject = jSONArray.getJSONObject(i);
				ContentValues contentValues = new ContentValues(
						jSONObject.length());
				contentValues.put("code", jSONObject.optString("code"));
				contentValues.put("content", jSONObject.optString("content"));
				contentValues.put("useTimeZone", Integer
						.valueOf((int) jSONObject.optInt("useTimeZone", 1)));
				contentValues.put("link", jSONObject.optString("link"));
				contentValues.put("beginTime",
						jSONObject.optString("beginTime"));
				contentValues.put("endTime", jSONObject.optString("endTime"));
				contentValues.put("retrospect", Integer
						.valueOf((int) jSONObject.optInt("retrospect", 0)));
				contentValues.put("duration", Long
						.valueOf((long) (1000 * (long) jSONObject.optInt(
								"duration", 0))));
				String string = jSONObject.optString("pkg", "");
				contentValues.put("pkg", string);
				if (!TextUtils.isEmpty((CharSequence) string)) {
					int n2 = ve.a(jSONObject.optString("appVer", ""), 0);
					contentValues.put("appVer", Integer.valueOf((int) n2));
					if (!jg.a(context, string, n2)) {
						contentValues.put("seen", Integer.valueOf((int) -1));
					}
				}
				arrcontentValues[i] = contentValues;
			}
			return context.getContentResolver().bulkInsert(ka.a,
					arrcontentValues);
		} catch (JSONException var4_11) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var4_11);
			return -1;
		} catch (Throwable var3_12) {
			vj.b("Swipe.ApiResult", "Exception occurred when saving banners: "
					+ var3_12.getMessage());
			return -1;
		}
	}

	public String toString() {
		return super.toString() + ";" + "totalPages" + "=" + this.a();
	}
}
