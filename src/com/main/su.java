package com.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;

public class su {
	public static InputStream a(HttpResponse httpResponse) {
		if (httpResponse == null) {
			return null;
		}
		InputStream inputStream = null;
		try {
			inputStream = httpResponse.getEntity().getContent();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Header header = httpResponse.getFirstHeader("Content-Encoding");
		if (header != null && header.getValue().equalsIgnoreCase("gzip")) {
			try {
				return new GZIPInputStream(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return inputStream;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static Object a(Context context, String string, boolean bl,
			boolean bl2) {
		int n = 1;
		int n2 = -1;
		NetworkInfo networkInfo = uj.b(context);
		int n3 = 0;
		String string2 = null;
		if (networkInfo != null) {
			int n4 = networkInfo.getType();
			n3 = 0;
			string2 = null;
			if (n4 != n) {
				string2 = Proxy.getHost((Context) context);
				n2 = Proxy.getPort((Context) context);
				if (string2 == null || n2 <= 0) {
					n = 0;
				}
				n3 = n;
			}
		}
		HttpGet httpGet = (HttpGet) (bl ? new HttpGet(string) : new HttpPost(
				string));
		if (n3 != 0) {
			HttpHost httpHost = new HttpHost(string2, n2);
			ConnRouteParams.setDefaultProxy((HttpParams) httpGet.getParams(),
					(HttpHost) httpHost);
		}
		if (bl2) {
			httpGet.addHeader("Accept-Encoding", "gzip");
		}
		return httpGet;
	}

	public static HttpClient a() {
		BasicHttpParams basicHttpParams = new BasicHttpParams();
		HttpClientParams.setRedirecting((HttpParams) basicHttpParams,
				(boolean) true);
		HttpConnectionParams.setConnectionTimeout((HttpParams) basicHttpParams,
				(int) 20000);
		HttpConnectionParams.setSoTimeout((HttpParams) basicHttpParams,
				(int) 20000);
		HttpConnectionParams.setSocketBufferSize((HttpParams) basicHttpParams,
				(int) 8192);
		HttpProtocolParams.setUserAgent((HttpParams) basicHttpParams,
				(String) "lazy");
		return new DefaultHttpClient((HttpParams) basicHttpParams);
	}
}
