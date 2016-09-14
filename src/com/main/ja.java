package com.main;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.location.Criteria;

public abstract class ja {
	protected static ja a;
	private static final Object b = new Object();

	public static ja a() {
		synchronized (b) {
			if (a == null) {
				a = new jb();
			}
			return a;
		}
	}

	public void a(long paramLong) {
	}

	public void a(Context paramContext) {
	}

	public void a(Criteria paramCriteria) {
	}

	public void a(String paramString) {
	}

	 public void a(String string, String string2) {
	        this.a(string, string2, (String)null);
	    }

	    public void a(String string, String string2, int n) {
	        this.a(string, string2, String.valueOf((int)n));
	    }

	public void a(String paramString1, String paramString2, String paramString3) {
		HashMap localHashMap = new HashMap(1);
		localHashMap.put(paramString2, paramString3);
		a(paramString1, localHashMap);
	}

	public abstract void a(String paramString1, String paramString2,
			Throwable paramThrowable);

	public void a(String paramString, Map paramMap) {
	}

	public void b(Context paramContext) {
	}

	public void b(String paramString) {
	}

	public void c(Context paramContext) {
	}
}
