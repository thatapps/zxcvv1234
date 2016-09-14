package com.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Log
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */

/*
 * Failed to analyse overrides
 */
public class vl extends WebView implements tw {
	static final String a = "Swipe." + vl.class.getSimpleName();
	List b = new ArrayList();
	Handler c = new Handler(Looper.getMainLooper());
	tv d;
	long e;
	long f;
	boolean g = false;
	Runnable h;

	public vl(Context context) {
		super(context);
		this.h = new Runnable() {

			public void run() {
				vl.this.stopLoading();
				vl.this.a(1, null);
			}
		};
		this.getSettings().setJavaScriptEnabled(true);
		this.a();
	}

	private void a() {
		this.setWebViewClient((WebViewClient) new WebViewClient() {

			public void onPageFinished(WebView webView, String string) {
				if (!vl.this.g || tu.a(string)) {
					return;
				}
				super.onPageFinished(webView, string);
				vl.this.c.removeCallbacks(vl.this.h);
				vl.this.c.postDelayed(vl.this.h, 5000);
			}

			public void onReceivedError(WebView webView, int n, String string,
					String string2) {
				super.onReceivedError(webView, n, string, string2);
				if (!vl.this.g) {
					return;
				}
				Log.w((String) vl.a,
						(String) ("Error resolving GP market url: " + n + "/" + string));
				vl.this.a(n, null);
			}

			public boolean shouldOverrideUrlLoading(WebView webView,
					String string) {
				if (!vl.this.g) {
					return true;
				}
				return vl.this.a(string);
			}
		});
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int n) {
		if (vk.o()) {
			this.stopLoading();
		} else {
			this.c.post((Runnable) new Runnable() {

				public void run() {
					vl.this.stopLoading();
				}
			});
		}
		this.c.removeCallbacks(this.h);
		this.d.a(2, null);
	}

	void a(final int n, final String string) {
		this.g = false;
		this.c.removeCallbacks(this.h);
		if (this.d != null) {
			if (System.currentTimeMillis() - this.f < this.e) {
				this.c.postDelayed((Runnable) new Runnable() {

					public void run() {
						vl.this.d.a(n, string);
					}
				}, System.currentTimeMillis() - this.f);
			}
		} else {
			return;
		}
		this.d.a(n, string);
	}

	public void a(Context context, String string, tv tv) {
		this.a(context, string, tv, 0);
	}

	public void a(Context context, final String string, tv tv, int n) {
		if (this.g) {
			this.a(2);
		}
		this.e = n;
		this.f = System.currentTimeMillis();
		this.d = tv;
		this.c.removeCallbacks(this.h);
		if (!this.a(string)) {
			this.g = true;
			this.c.post((Runnable) new Runnable() {

				public void run() {
					vl.this.loadUrl(string);
				}
			});
		}
	}

	boolean a(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			this.a(3, string);
			return true;
		}
		if (tu.a(string)) {
			this.a(0, string);
			return true;
		}
		this.b.add((Object) string);
		return false;
	}

	public void destroy() {
		this.stopLoading();
		super.destroy();
		this.removeAllViews();
	}

	public void stopLoading() {
		this.g = false;
		super.stopLoading();
	}

}
