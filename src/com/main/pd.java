package com.main;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.lazyswipe.SwipeApplication;
import java.io.File;

import org.json.JSONException;
import org.json.JSONObject;

public class pd {

	private String a;
	private Integer b;
	private String c;
	private String d;
	private long e;
	private String f;
	private String g;
	private String h;
	private boolean i;
	private boolean j;

	public pd(String s1, String s2) {
		i = false;
		j = true;
		a = s1;
		g = s2;
	}

	public static pd a(Intent intent) {
		if (intent != null && intent.getBooleanExtra("upgradeApkInfo", false)) {
			pd pd1 = new pd(intent.getStringExtra("appName"),
					intent.getStringExtra("packageName"));
			pd1.d(intent.getStringExtra("checksum"));
			pd1.c(intent.getStringExtra("instruction"));
			pd1.b(intent.getStringExtra("downUrl"));
			pd1.a(Integer.valueOf(intent.getIntExtra("versionNumber", 0)));
			pd1.a(intent.getStringExtra("versionName"));
			pd1.a(intent.getLongExtra("fileSize", 0L));
			return pd1;
		} else {
			return null;
		}
	}

	public static pd e(String s1) {
		JSONObject jsonObject = null;
		if (s1 != null && s1.length() != 0) {
			try {
				if ((jsonObject = new JSONObject(s1)) != null
						&& jsonObject.length() > 0
						&& jsonObject.optBoolean("needUpdate", false)) {
					pd pd1 = new pd(SwipeApplication.e().getString(0x7f0f0003),
							"com.lazyswipe");
					pd1.a(Integer.valueOf(jsonObject.optInt("versionNumber", 0)));
					pd1.a(jsonObject.optString("versionName"));
					pd1.b(jsonObject.optString("downUrl"));
					pd1.d(jsonObject.optString("checksum"));
					pd1.c(jsonObject.optString("instruction"));
					pd1.a(jsonObject.optLong("fileSize"));
					pd1.a(jsonObject.optBoolean("forceUpdate", false));
					return pd1;
				}
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return null;
	}

	public static boolean q() {
		return true;
	}

	public static pd s() {
		pd pd1;
		try {
			pd1 = e(ir.a(SwipeApplication.e(), "PREF_LAST_UPGRADE_INFO", ""));
		} catch (Exception exception) {
			return null;
		}
		return pd1;
	}

	public static void t() {
		ir.b(SwipeApplication.e(), "PREF_LAST_UPGRADE_INFO", "");
	}

	private void u() {
		SwipeApplication swipeapplication = SwipeApplication.e();
		if (ir.a(swipeapplication, "PREF_SHOW_UPGRADE_TIP_VERSION", 0) != b
				.intValue()) {
			ir.b(swipeapplication, "PREF_SHOW_UPGRADE_VERSION_DATE", vk.m());
			ir.b(swipeapplication, "PREF_SHOW_UPGRADE_TIP_VERSION",
					b.intValue());
		}
	}

	public String a() {
		return a;
	}

	public void a(long l1) {
		e = l1;
	}

	public void a(Integer integer) {
		b = integer;
	}

	public void a(String s1) {
		c = s1;
	}

	public void a(boolean flag) {
		i = flag;
	}

	public Integer b() {
		return b;
	}

	public void b(String s1) {
		d = s1;
	}

	public String c() {
		return c;
	}

	public void c(String s1) {
		f = s1;
	}

	public String d() {
		return d;
	}

	public void d(String s1) {
		h = s1;
	}

	public long e() {
		return e;
	}

	public String f() {
		return f;
	}

	public String g() {
		return g;
	}

	public String h() {
		return h;
	}

	public boolean i() {
		return j;
	}

	public boolean j() {
		return i;
	}

	public String k() {
		return (new StringBuilder()).append(a()).append(c()).append(".apk")
				.toString();
	}

	public File l() {
		return new File(um.a("upgrade/"), k());
	}

	public String m() {
		return (new StringBuilder())
				.append(SwipeApplication.e().getString(0x7f0f00e8)).append(" ")
				.append(c()).toString();
	}

	public String n() {
		SwipeApplication swipeapplication = SwipeApplication.e();
		StringBuilder stringbuilder = new StringBuilder();
		if (!TextUtils.isEmpty(f)) {
			stringbuilder.append(f.replace("\r\n", "\n"));
		} else {
			stringbuilder.append(swipeapplication.getString(0x7f0f001b));
		}
		return stringbuilder.toString();
	}

	public boolean o() {
		return b.intValue() > 2001
				&& b.intValue() != pe.a(SwipeApplication.e());
	}

	public boolean p() {
		if (!i) {
			Object obj = SwipeApplication.e();
			int i1 = ir
					.a(((Context) (obj)), "PREF_SHOW_UPGRADE_TIP_VERSION", 0);
			obj = ir.a(((Context) (obj)), "PREF_SHOW_UPGRADE_VERSION_DATE", "");
			if (i1 == b().intValue() && !vk.m().equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public void r() {
		try {
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("needUpdate", true);
			jsonobject.put("versionNumber", b());
			jsonobject.put("versionName", c());
			jsonobject.put("downUrl", d());
			jsonobject.put("checksum", h());
			jsonobject.put("instruction", f());
			jsonobject.put("fileSize", e());
			jsonobject.put("forceUpdate", j());
			ir.b(SwipeApplication.e(), "PREF_LAST_UPGRADE_INFO",
					jsonobject.toString());
			u();
			return;
		} catch (Exception exception) {
			return;
		}
	}
}
