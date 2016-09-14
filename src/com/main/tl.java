package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

import org.apache.http.client.methods.HttpGet;

import android.net.http.AndroidHttpClient;

public class tl {
	static final HashMap a = new HashMap();
	static final String[] b = new String[] { "220.181.141.113",
			"220.181.141.114", "119.188.2.235", "119.188.2.236" };
	static int c = -1;

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * Converted monitor instructions to comments Lifted jumps to return sites
	 */
	public static String a(String string, AndroidHttpClient androidHttpClient) {
		ArrayList arrayList = (ArrayList) a.get((Object) string);
		if (arrayList == null) {
			HashMap hashMap;
			String string2 = tl.a(b[(1 + c) % b.length], string,
					androidHttpClient);
			Object[] arrobject = string2.substring(1 + string2.indexOf(":"))
					.split(",");
			arrayList = new ArrayList();
			Collections.addAll((Collection) arrayList, (Object[]) arrobject);
			HashMap hashMap2 = hashMap = a;
			// MONITORENTER : hashMap2
			a.put((Object) string, (Object) arrayList);
			// MONITOREXIT : hashMap2
		}
		try {
			return (String) arrayList
					.get(new Random().nextInt(arrayList.size()));
		} catch (Exception var3_8) {
			c = 1 + c;
			return null;
		}
	}

	private static String a(String s, String s1,
			AndroidHttpClient androidhttpclient) {
		Object obj = null;
		HttpGet httpget = new HttpGet((new StringBuilder()).append("http://")
				.append(s).append("/index.html").toString());
		httpget.addHeader("Host", s);
		httpget.addHeader("DPUName", s1);
		httpget.addHeader("Cache-Control", "no-cache");
		httpget.addHeader("User-Agent",
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
		httpget.addHeader("Connection", "Close");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(androidhttpclient
					.execute(httpget).getEntity().getContent()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder builder = new StringBuilder();
		// _L3:
		// androidhttpclient = reader.readLine();
		if (androidhttpclient == null) {
			// androidhttpclient = s1.toString();
			// s1 = androidhttpclient;
			if (s == null) {

				return s1;

			} else {

				tq.a(reader);
				return androidhttpclient.toString();
			}
		}

		else {

			builder.append(androidhttpclient);
			// androidhttpclient = s;
		}
		return null;
	}
}
