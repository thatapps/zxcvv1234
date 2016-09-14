package com.main;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import android.os.AsyncTask;
import android.util.Log;

public class hf extends AsyncTask {
	private static final String a = hf.class.getSimpleName();
	private Map b;

	public hf() {
		this.b = null;
	}

	public hf(Map paramMap) {
		this.b = paramMap;
	}

	private String a(String paramString1, String paramString2,
			String paramString3) {
		if ((hh.a(paramString1)) || (hh.a(paramString2))
				|| (hh.a(paramString3))) {
			return paramString1;
		}
		if (paramString1.contains("?")) {
		}
		for (String str = "&";; str = "?") {
			paramString1 = paramString1 + str + paramString2 + "="
					+ URLEncoder.encode(paramString3);
			// break;
		}
	}

	private boolean a(String paramString) {
		boolean bool = false;
		HttpClient localHttpClient = hz.b();
		HttpGet localHttpGet = new HttpGet(paramString);
		try {
			int i = localHttpClient.execute(localHttpGet).getStatusLine()
					.getStatusCode();
			if (i == 200) {
				bool = true;
			}
		} catch (Exception localException) {
			for (;;) {
				Log.e(a, "Error opening url: " + paramString, localException);
				hj.a(hi.a(localException));
			}
		}
		return bool;
	}

	private String b(String paramString) {
		try {
			String str = a(paramString, "analog", hz.a(gs.a()));
			paramString = str;
		} catch (Exception localException) {
		
				hj.a(hi.a(localException));
			
		}
		return paramString;
	}

	protected Void a(String... paramVarArgs) {
		String str1 = paramVarArgs[0];
		if ((hh.a(str1)) || (str1.equals("#"))) {
			return null;
		}
		String str2 = b(str1);
		String str3 = str2;
		if (this.b != null) {
			Iterator localIterator = this.b.keySet().iterator();
			String str4;
			for (str3 = str2; localIterator.hasNext(); str3 = a(str3, str4,
					(String) this.b.get(str4))) {
				str4 = (String) localIterator.next();
			}
		}

		int j;
		for (int i = 1;; i = j) {
			j = i + 1;
			if ((i > 2) || (a(str3))) {
				break;
			}
		}
		return null;
	}

	@Override
	protected Object doInBackground(Object... params) {
		// TODO Auto-generated method stub
		return null;
	}
}
