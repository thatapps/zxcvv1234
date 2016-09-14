package com.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

import com.lazyswipe.notification.SwipeAccessibilityService;

public class jd {
	public static void a() {
		ja.a().a("24�?时未划通知");
	}

	@SuppressWarnings("rawtypes")
	public static void a(int paramInt) {
		HashMap localHashMap = new HashMap(1);
		localHashMap.put("值", String.valueOf(paramInt));
		ja.a().a("HolaLauncher点击", localHashMap);
	}

	@SuppressWarnings("unchecked")
	public static void a(Context context) {
		String string;
		String string2 = ir.P(context);
		if (TextUtils.isEmpty((CharSequence) string2)) {
			string = "0";
		} else {
			List list = Arrays.asList((Object[]) string2.split(","));
			string = "" + list.size() + ":" + string2;
		}
		HashMap hashMap = new HashMap(1);
		hashMap.put((Object) "\u503c", (Object) string);
		ja.a().a("\u767d\u540d\u5355\u65e5\u8ba1", (Map) hashMap);
		HashMap hashMap2 = new HashMap(1);
		hashMap2.put((Object) "\u503c", (Object) ir.M(context));
		ja.a().a("\u89e6\u53d1\u9009\u9879\u65e5\u8ba1", (Map) hashMap2);
		HashMap hashMap3 = new HashMap(1);
		hashMap3.put((Object) "\u503c",
				(Object) String.valueOf((int) ir.D(context)));
		ja.a().a("Toucher\u4f4d\u7f6e\u65e5\u8ba1", (Map) hashMap3);
		HashMap hashMap4 = new HashMap(1);
		String string3 = pq.c(context) ? "ON" : "OFF";
		hashMap4.put((Object) "\u503c", (Object) string3);
		ja.a().a("\u6d88\u606f\u529f\u80fd\u65e5\u8ba1", (Map) hashMap4);
		HashMap hashMap5 = new HashMap(1);
		String string4 = ir.C(context) ? "ON" : "OFF";
		hashMap5.put((Object) "\u503c", (Object) string4);
		ja.a().a("\u77ed\u4fe1\u63d0\u9192\u65e5\u8ba1", (Map) hashMap5);
		if (Build.VERSION.SDK_INT >= 18) {
			HashMap hashMap6 = new HashMap(1);
			String string5 = SwipeAccessibilityService.a(context) ? "ON"
					: "OFF";
			hashMap6.put((Object) "\u503c", (Object) string5);
			ja.a().a("\u64cd\u4f5c\u6821\u6b63\u65e5\u8ba1", (Map) hashMap6);
		}
		HashMap hashMap7 = new HashMap(1);
		hashMap7.put((Object) "\u503c",
				(Object) String.valueOf((int) ir.U(context)));
		ja.a().a("\u4e3b\u9898\u65e5\u8ba1", (Map) hashMap7);
		HashMap hashMap8 = new HashMap(1);
		int n = vk.b(context, "com.hola.launcher") ? 1 : 0;
		hashMap8.put((Object) "\u503c", (Object) String.valueOf((int) n));
		ja.a().a("Hola\u5b89\u88c5\u65e5\u8ba1", (Map) hashMap8);
	}
}
