package com.main;

import java.util.Map;

import android.content.Context;
import android.location.Criteria;

public final class jb extends ja {
	public static volatile long b;

	public static void d(Context paramContext) {
		if (a != null) {
			a.b(paramContext);
			b = System.currentTimeMillis();
		}
	}

	public void a(long paramLong) {
		// FlurryAgent.setContinueSessionMillis(paramLong);
	}

	public void a(Context paramContext) {
		// FlurryAgent.onStartSession(paramContext, "MMKWN2F57QCKGDDCWDHG");
	}

	public void a(Criteria paramCriteria) {
		// FlurryAgent.setLocationCriteria(paramCriteria);
	}

	public void a(String paramString) {
		super.a(paramString);
		// FlurryAgent.logEvent(paramString);
	}

	public void a(String paramString1, String paramString2,
			Throwable paramThrowable) {
		// FlurryAgent.onError(paramString1, paramString2, paramThrowable);
	}

	public void a(String paramString, Map paramMap) {
		// FlurryAgent.logEvent(paramString, paramMap);
	}

	public void b(Context paramContext) {
		// FlurryAgent.onEndSession(paramContext);
	}

	public void c(Context paramContext) {
		Criteria localCriteria = new Criteria();
		localCriteria.setAccuracy(2);
		localCriteria.setAltitudeRequired(false);
		localCriteria.setBearingRequired(false);
		localCriteria.setPowerRequirement(1);
		a(localCriteria);
	}
}
