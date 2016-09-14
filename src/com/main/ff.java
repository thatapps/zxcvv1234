package com.main;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class ff {

	private static ff a = new ff();
	private Map b;
	private boolean c;
	private boolean d;
	private String e;
	private boolean f;

	private ff() {
		b = new HashMap();
	}

	public static ff a() {
		return a;
	}

	public String a(Context context) {
		if (e != null) {
			return e;
		} else {
			return context.getSharedPreferences("appsflyer-data", 0).getString(
					"referrer", null);
		}
	}

	public void a(String s, String s1) {
		b.put(s, s1);
	}

	public void a(String s, boolean flag) {
		b.put(s, Boolean.toString(flag));
	}

	public String[] a(String s) {
		return (String[]) (String[]) b.get(s);
	}

	public String b(String s) {
		return (String) b.get(s);
	}

	protected void b() {
		c = true;
	}

	public boolean b(String s, boolean flag) {
		s = b(s);
		if (s == null) {
			return flag;
		} else {
			return Boolean.valueOf(s).booleanValue();
		}
	}

	protected void c(String s) {
		e = s;
	}

	protected boolean c() {
		return d;
	}

	protected void d() {
		d = true;
	}

	public boolean e() {
		return f;
	}

}
