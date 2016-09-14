package com.main;

import java.util.Iterator;
import java.util.Map;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
//import com.facebook.ads.VideoAdActivity;

public class gy extends gw {
	private static final String a = gy.class.getSimpleName();
	private final Context b;
	private final Uri c;

	public gy(Context paramContext, Uri paramUri) {
		super(paramContext, paramUri);
		this.b = paramContext;
		this.c = paramUri;
	}

	private static void a(Map paramMap, Intent paramIntent) {
		Iterator localIterator = paramMap.entrySet().iterator();
		while (localIterator.hasNext()) {
			Map.Entry localEntry = (Map.Entry) localIterator.next();
			paramIntent.putExtra((String) localEntry.getKey(),
					(String) localEntry.getValue());
		}
	}

	public void a(Map paramMap) {
		a(this.b, this.c);
		String str = this.c.getQueryParameter("video_url");
		Intent localIntent = new Intent(this.b, /* VideoAdActivity.class */null);
		localIntent.putExtra("adUri", this.c.toString());
		localIntent.putExtra("adVideoPath", str);
		localIntent.putExtra("adMarketUri", a().toString());
		a(paramMap, localIntent);
		localIntent.addFlags(268435456);
		try {
			this.b.startActivity(localIntent);
			return;
		} catch (Exception localException) {
			
				Log.d(a, "Failed to start video", localException);
			
		}
	}
}
