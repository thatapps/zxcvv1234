package com.main;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.util.Log;

public class vn implements vv {
	protected String a = null;

	private boolean a(Throwable throwable) {
		String string;
		if (throwable != null
				&& !TextUtils.isEmpty((CharSequence) throwable.getMessage())
				&& ((string = throwable.getMessage())
						.contains((CharSequence) "Timeout")
						|| string.contains((CharSequence) "No route")
						|| string.contains((CharSequence) "timed out") || string
							.contains((CharSequence) "UnknownHostException"))) {
			return true;
		}
		return false;
	}

	@Override
	public String a() {
		return this.a;
	}

	@Override
	public HttpGet a(Context context, vp vp) {
		if (vp.e()) {
			return null;
		}
		this.a = vp.a();
		return this.a(context, vp, this.a);
	}

	/*
	 * Unable to fully structure code Enabled force condition propagation Lifted
	 * jumps to return sites
	 */
	public HttpGet a(Context context, vp vp1, String s) {
		Object obj1 = null;
		if (vp1.e != 1 && vp1.e != 1 || vp1.l == null || !a(vp1.l.b())) {

			return (HttpGet) su.a(context, s, true, false);

		} else {

			URI uri = null;
			try {
				uri = new URI(s);
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Object obj = uri.getHost();

			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				// break; /* Loop/switch isn't completed */
			}
			obj = tl.a(uri.getHost(),
					AndroidHttpClient.newInstance("User-Agent"));
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				// break; /* Loop/switch isn't completed */
			}
			try {
				obj = (HttpGet) su.a(context,
						(new URI(uri.getScheme(), uri.getUserInfo(),
								((String) (obj)), uri.getPort(), uri.getPath(),
								uri.getQuery(), uri.getFragment())).toString(),
						true, false);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((HttpGet) (obj)).addHeader("Host", uri.getHost());
			HttpClientParams.setRedirecting(((HttpGet) (obj)).getParams(),
					false);

			Log.e("Swipe..DownloadManager", "Failed to generate the temp uri.");

			Log.e("Swipe..DownloadManager", "Failed to use the http dns.");
			return ((HttpGet) (obj));
		}
	}
}
