package com.main;

import java.util.Map;

import android.content.Context;
import android.net.Uri;

public abstract class gu {
	protected void a(Context paramContext, Uri paramUri) {
		String str = paramUri.getQueryParameter("native_click_report_url");
		if (hh.a(str)) {
		}

		hf localhf = new hf();
		String[] arrayOfString = new String[1];
		arrayOfString[0] = str;
		localhf.execute(arrayOfString);
		hz.a(paramContext, "Click logged");
		return;
	}

	public abstract void a(Map paramMap);
}
