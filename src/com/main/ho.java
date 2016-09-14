package com.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.json.JSONArray;

import android.content.Context;
import android.content.pm.PackageManager;

public class ho {
	public static Collection a(JSONArray paramJSONArray) {
		if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
		}
		HashSet localHashSet;
		for (Object localObject = null;; localObject = localHashSet) {

			localHashSet = new HashSet();
			for (int i = 0; i < paramJSONArray.length(); i++) {
				localHashSet.add(paramJSONArray.optString(i));
			}
			return (Collection) localObject;
		}
	}

	public static boolean a(Context paramContext, hk paramhk) {
		boolean bool1 = true;
		boolean bool2 = false;
		hn localhn = paramhk.a();
		if ((localhn == null) || (localhn == hn.a)) {
		}
		Collection localCollection;
		do {

			localCollection = paramhk.b();
		} while ((localCollection == null) || (localCollection.isEmpty()));
		Iterator localIterator = localCollection.iterator();
		do {
			if (!localIterator.hasNext()) {
				break;
			}
		} while (!a(paramContext, (String) localIterator.next()));
		for (boolean bool3 = bool1;; bool3 = false) {
			if (localhn == hn.b) {
				bool2 = bool3;
				break;
			}
			if (localhn != hn.c) {
				break;
			}
			if (!bool3) {
			}

			bool2 = bool1;
			// break;
			bool1 = false;

		}
		return bool2;
	}

	public static boolean a(Context paramContext, String paramString) {
		boolean bool = false;
		if (hh.a(paramString)) {
		}

		PackageManager localPackageManager = paramContext.getPackageManager();
		try {
			localPackageManager.getPackageInfo(paramString, 0);
			bool = true;
		} catch (PackageManager.NameNotFoundException localNameNotFoundException) {
		} catch (RuntimeException localRuntimeException) {
		}
		return bool;
	}
}
