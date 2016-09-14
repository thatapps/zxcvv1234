package com.main;

import org.json.JSONException;

public class je extends jf {
	je(String paramString) throws JSONException {
		super(paramString);
	}

	public boolean a() {
		if (e() == 200) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public String b() {
		try {
			String string = this.getString("userId");
			return string;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return null;
		}
	}

	public long c() {
		try {
			long l = this.getLong("createTime");
			return l;
		} catch (JSONException var1_2) {
			this.a(this.getClass().getSimpleName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName(), var1_2);
			return -1;
		}
	}

	public String toString() {
		return super.toString() + ";" + "userId" + "=" + b() + ";"
				+ "createTime" + "=" + c();
	}
}
