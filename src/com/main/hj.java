package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;

public class hj {
	private static List a = new ArrayList();

	public static String a() {
		JSONArray localJSONArray = null;
		String str = null;
		synchronized (a) {
			if (a.isEmpty()) {
				str = "";
				return str;
			}
			ArrayList localArrayList = new ArrayList(a);
			a.clear();
			localJSONArray = new JSONArray();
			localJSONArray.toString();
			Iterator localIterator = localArrayList.iterator();
			if (localIterator.hasNext()) {
				localJSONArray.put(((hi) localIterator.next()).a());
			}
		}
		return str;
	}

	public static void a(hi paramhi) {
		synchronized (a) {
			a.add(paramhi);
			return;
		}
	}
}
