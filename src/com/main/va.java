package com.main;

import android.content.Context;
import android.text.TextUtils;

public abstract class va {
	public abstract String a(Context paramContext, String paramString);

	public String a(Context paramContext, String paramString1,
			String paramString2, boolean paramBoolean) {
		return a(a(paramContext, paramString1, paramBoolean), paramString2);
	}

	public abstract String a(Context paramContext, String paramString,
			boolean paramBoolean);

	protected String a(String paramString1, String paramString2) {
		if ((!TextUtils.isEmpty(paramString1))
				&& (!TextUtils.isEmpty(paramString2))) {
			Object[] arrayOfObject = new Object[1];
			arrayOfObject[0] = paramString2;
			paramString1 = String.format(paramString1, arrayOfObject);
		}
		return paramString1;
	}
}
