package com.main;

import java.net.URLDecoder;

import android.animation.Animator;
import android.graphics.Color;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class lj extends WebViewClient {
	final li a;
	private boolean b;

	lj(li li1) {
		super();
		a = li1;
		
	}

	void a(WebView paramWebView) {
		try {
			jc.e(((li) paramWebView).d);
			return;
		} catch (Throwable localThrowable) {

		}
	}

	void b(WebView paramWebView) {
		try {
			jc.f(((li) paramWebView).d);
			return;
		} catch (Throwable localThrowable) {

		}
	}

	public void onPageFinished(WebView webview, String s) {
		if (b) {
			return;
		}
		webview.setBackgroundColor(Color.argb(1, 0, 0, 0));
		try {
			webview.setLayerType(1, null);
		}
		// Misplaced declaration of an exception variable
		catch (Exception sd) {
		}
		webview.setAlpha(0.0F);
		webview.setVisibility(0);
		ViewPropertyAnimator animator = webview.animate().alpha(1.0F)
				.setStartDelay(400L);
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			animator.withEndAction(new Runnable() {

				WebView a;
				lj b;

				public void run() {
					b.a.b = true;
					b.a.c = System.currentTimeMillis();
					b.a(a);
				}

			}).withStartAction(new Runnable() {

				final lj a;

				public void run() {
					a.a.a.h.sendEmptyMessage(2);
				}

				{
					a = lj.this;

				}
			});
		} else {
			animator.setListener(new sy() {

				WebView a;
				lj b;

				public void onAnimationEnd(Animator animator) {
					b.a.b = true;
					b.a.c = System.currentTimeMillis();
					b.a(a);
				}

				public void onAnimationStart(Animator animator) {
					b.a.a.h.sendEmptyMessage(2);
				}

			});
		}
		animator.start();
	}

	public void onReceivedError(WebView paramWebView, int paramInt,
			String paramString1, String paramString2) {
		vj.b("Swipe.BannerView", "Error loading page " + paramString2 + ": "
				+ paramInt + "/" + paramString1);
		this.b = true;
		li.a(paramWebView);
	}

	public boolean shouldOverrideUrlLoading(WebView paramWebView,
			String paramString) {
		int i = 1;
		 li.a(this.a).sendEmptyMessage(i);
		b(paramWebView);
		boolean bool = false;
		if (paramString
				.startsWith("https://play.google.com/store/apps/details?id=")) {
			String str = URLDecoder.decode(paramString).substring(
					"https://play.google.com/store/apps/details?id=".length());
			bool = vk.a(((View) this.a).getContext(), str, true, true);
		}

		try {
			((View) this.a).getContext().startActivity(vk.c(paramString));
		} catch (Throwable localThrowable) {
			bool = false;
		}
		return bool;
	}
}
