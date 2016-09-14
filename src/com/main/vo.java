package com.main;

import org.apache.http.client.methods.HttpGet;

import android.content.Context;

public class vo extends vn {
	public HttpGet a(Context paramContext, vp paramvp) {
		paramvp.j = paramvp.f.length();
		return super.a(paramContext, paramvp);
	}

	public HttpGet a(Context paramContext, vp paramvp, String paramString) {
		HttpGet localHttpGet = super.a(paramContext, paramvp, paramString);
		if (paramvp.j > 0L) {
			localHttpGet
					.addHeader("Range", "bytes=" + paramvp.f.length() + "-");
			if (paramvp.k.a != null) {
				localHttpGet.addHeader("If-Match", paramvp.k.a);
			}
		}
		return localHttpGet;
	}
}
