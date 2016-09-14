package com.main;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;

public class jh extends JSONObject {
	private final int a;

	public jh(String paramString, int paramInt) throws JSONException {
		super(paramString);
		this.a = paramInt;
	}

	public int a() {
		return optInt("totalPage", 1);
	}

	public int a(Context paramContext, int paramInt) {
		int i = 0;
		ContentResolver localContentResolver = paramContext
				.getContentResolver();
		if (paramInt == 1) {
		}

		int j = -1;
		try {
			Uri localUri = kl.a;
			String[] arrayOfString = new String[1];
			arrayOfString[0] = String.valueOf(this.a);
			localContentResolver.delete(localUri,
					"placement=?key_suppress_notify", arrayOfString);
			try {
				JSONArray localJSONArray = getJSONArray("data");
				j = localJSONArray.length();
				if (j > 0) {
					ContentValues[] arrayOfContentValues = new ContentValues[j];
					ok localok = new ok();
					if (i < j) {
						arrayOfContentValues[i] = localok.a(
								localJSONArray.getJSONObject(i), this.a).a(
								arrayOfContentValues[i]);
						if (i != 0) {
							i++;
						}
						arrayOfContentValues[i].put("key_suppress_notify",
								Integer.valueOf(0));
						i++;
					}
					int k = localContentResolver.bulkInsert(kl.a,
							arrayOfContentValues);
					j = k;
				}
			} catch (Throwable localThrowable1) {
				vj.b("Swipe.GetPromoAppResult",
						"Exception occurred when saving promotion apps: "
								+ localThrowable1.getMessage());
				j = -1;
			}
		} catch (Throwable localThrowable2) {
			// continue;
		}
		return j;
		// label202:

	}

	public String toString() {
		return super.toString() + ";";
	}
}
