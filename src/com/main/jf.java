package com.main;

import org.json.JSONException;
import org.json.JSONObject;

/*
 * Failed to analyse overrides
 */
public class jf extends JSONObject {
	jf(String string) throws JSONException {
		super(string);
	}

	public void a(String string, String string2, JSONException jSONException) {
		vj.b("Swipe.ApiResult", "Execution of " + string + "." + string2
				+ "() failed: " + jSONException.getMessage());
	}

	public boolean d() {
		try {
			boolean bl = this.getBoolean("success");
			return bl;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return false;
		}
	}

	public int e() {
		try {
			int n = this.getInt("statusCode");
			return n;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return -1;
		}
	}

	public String f() {
		try {
			String string = this.getString("message");
			return string;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return null;
		}
	}

	public String toString() {
		return "success=" + this.d() + ";" + "statusCode" + "=" + this.e()
				+ ";" + "message" + "=" + this.f();
	}
}
