package com.main;

import java.util.Map;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class gx extends gu {
	private static final String a = gx.class.getSimpleName();
	private final Context b;
	private final Uri c;

	public gx(Context paramContext, Uri paramUri) {
		this.b = paramContext;
		this.c = paramUri;
	}

	public void a(Map paramMap) {
		a(this.b, this.c);
		Intent localIntent = new Intent("android.intent.action.VIEW",
				Uri.parse(this.c.getQueryParameter("link")));
		localIntent.addFlags(268435456);
		try {
			this.b.startActivity(localIntent);
			return;
		} catch (Exception localException) {
			for (;;) {
				Log.d(a, "Failed to open market url: " + this.c.toString(),
						localException);
			}
		}
	}
}
