package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;

public class gw extends gu {
	private static final String a = gw.class.getSimpleName();
	private final Context b;
	private final Uri c;

	public gw(Context paramContext, Uri paramUri) {
		this.b = paramContext;
		this.c = paramUri;
	}

	private Intent a(id paramid) {
		Intent localIntent = new Intent("android.intent.action.VIEW");
		localIntent.addFlags(268435456);
		if ((!hh.a(paramid.a())) && (!hh.a(paramid.b()))) {
			localIntent
					.setComponent(new ComponentName(paramid.a(), paramid.b()));
		}
		if (!hh.a(paramid.c())) {
			localIntent.setData(Uri.parse(paramid.c()));
		}
		return localIntent;
	}

	private Intent b(id paramid) {
		Object localObject;
		if (hh.a(paramid.a())) {
			localObject = null;
		}

		if (!ho.a(this.b, paramid.a())) {
			localObject = null;
		} else {
			String str = paramid.c();
			if ((!hh.a(str))
					&& ((str.startsWith("tel:")) || (str
							.startsWith("telprompt:")))) {
				localObject = new Intent("android.intent.action.CALL",
						Uri.parse(str));
			} else {
				PackageManager localPackageManager = this.b.getPackageManager();
				if ((hh.a(paramid.b())) && (hh.a(str))) {
					localObject = localPackageManager
							.getLaunchIntentForPackage(paramid.a());
				} else {
					Intent localIntent = a(paramid);
					List localList = localPackageManager.queryIntentActivities(
							localIntent, 65536);
					if (localIntent.getComponent() == null) {
						Iterator localIterator = localList.iterator();
						while (localIterator.hasNext()) {
							ResolveInfo localResolveInfo = (ResolveInfo) localIterator
									.next();
							if (localResolveInfo.activityInfo.packageName
									.equals(paramid.a())) {
								localIntent
										.setComponent(new ComponentName(
												localResolveInfo.activityInfo.packageName,
												localResolveInfo.activityInfo.name));
							}
						}
					}
					if ((localList.isEmpty())
							|| (localIntent.getComponent() == null)) {
						localObject = null;
					} else {
						localObject = localIntent;
					}
				}
			}
		}
		return (Intent) localObject;
	}

	private List d() {
		String str = this.c.getQueryParameter("appsite_data");
		Object localObject;
		if ((hh.a(str)) || ("[]".equals(str))) {
			localObject = null;
		}

		localObject = new ArrayList();
		try {
			JSONArray localJSONArray = new JSONObject(str)
					.optJSONArray("android");
			if (localJSONArray == null) {
				// continue;
			} else {
				for (int i = 0; i < localJSONArray.length(); i++) {
					id localid = id.a(localJSONArray.optJSONObject(i));
					if (localid != null) {
						((List) localObject).add(localid);
					}
				}
			}
		} catch (JSONException localJSONException) {
			Log.w(a, "Error parsing appsite_data", localJSONException);
		}
		return (List) localObject;
	}

	protected Uri a() {
		Uri localUri = null;
		String str1 = this.c.getQueryParameter("store_url");
		if (!hh.a(str1)) {
		}
		Object[] arrayOfObject;
		for (localUri = Uri.parse(str1);; localUri = Uri.parse(String.format(
				"market://details?id=%s", arrayOfObject))) {

			String str2 = this.c.getQueryParameter("store_id");
			arrayOfObject = new Object[1];
			arrayOfObject[0] = str2;

		}
		//return localUri;
	}

	public void a(Map paramMap) {
		a(this.b, this.c);
		List localList = b();
		Intent localIntent = null;
		if (localList != null) {
			Iterator localIterator = localList.iterator();
			if (localIterator.hasNext()) {
				localIntent = (Intent) localIterator.next();
			}
		}
	
			try {
				this.b.startActivity(localIntent);
				return;
			} catch (Exception localException) {
				Log.d(a, "Failed to open app intent, falling back",
						localException);
			}
			//break;
			c();
		
	}

	protected List b() {
		List localList = d();
		ArrayList localArrayList = new ArrayList();
		if (localList != null) {
			Iterator localIterator = localList.iterator();
			while (localIterator.hasNext()) {
				Intent localIntent = b((id) localIterator.next());
				if (localIntent != null) {
					localArrayList.add(localIntent);
				}
			}
		}
		return localArrayList;
	}

	public void c() {
		Intent localIntent1 = new Intent("android.intent.action.VIEW", a());
		localIntent1.addFlags(268435456);
		try {
			this.b.startActivity(localIntent1);
			return;
		} catch (Exception localException1) {
			for (;;) {
				Log.d(a, "Failed to open market url: " + this.c.toString(),
						localException1);
				String str = this.c.getQueryParameter("store_url_web_fallback");
				if ((str != null) && (str.length() > 0)) {
					Intent localIntent2 = new Intent(
							"android.intent.action.VIEW", Uri.parse(str));
					localIntent2.addFlags(268435456);
					try {
						this.b.startActivity(localIntent2);
					} catch (Exception localException2) {
						Log.d(a, "Failed to open fallback url: " + str,
								localException2);
					}
				}
			}
		}
	}
}
