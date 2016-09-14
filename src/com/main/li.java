package com.main;

import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.lazyswipe.fan.Fan;

public class li extends WebView implements Handler.Callback,
		View.OnClickListener, View.OnTouchListener {
	Fan a;
	boolean b;
	long c;
	String d;
	private Handler e;

	public li(Context paramContext) {
		this(paramContext, null);
	}

	public li(Context paramContext, AttributeSet paramAttributeSet) {
		this(paramContext, paramAttributeSet, 0);
	}

	public li(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
		super(paramContext, paramAttributeSet, paramInt);
		a();
	}

	@SuppressLint({ "SetJavaScriptEnabled" })
	public static li a(Context paramContext, Fan paramFan,
			JSONObject paramJSONObject) {
		Object localObject = null;
		if (!uj.d(paramContext)) {
		}

		try {
			String str1 = paramJSONObject.getString("link");
			String str2 = paramJSONObject.getString("code");
			li localli = new li(paramContext);
			localli.setOwner(paramFan);
			localli.d = str2;
			localli.loadUrl(str1);
			localObject = localli;
		} catch (Throwable localThrowable) {
			vj.b("Swipe.BannerView", "Failed to get banner url: "
					+ localThrowable.getMessage());
		}
		return (li) localObject;
	}

	@SuppressLint({ "SetJavaScriptEnabled" })
	private void a() {
		this.e = new Handler(this);
		WebSettings localWebSettings = getSettings();
		try {
			localWebSettings.setJavaScriptEnabled(true);
			setBackgroundColor(Color.argb(1, 0, 0, 0));
			try {
				setLayerType(1, null);
				setVerticalScrollBarEnabled(false);
				setHorizontalScrollBarEnabled(false);
				setWebViewClient(new lj(this));
				setOnClickListener(this);
				if (Build.VERSION.SDK_INT >= 19) {
					setOnTouchListener(this);
				}
				ji.h(getContext());
				return;
			} catch (Throwable localThrowable2) {
				Log.w("Swipe.BannerView",
						"Failed to set layer type of web view", localThrowable2);

			}
		} catch (Throwable localThrowable1) {

		}
	}

	public static void a(final View view) {
		view.post((Runnable) new Runnable() {

			public void run() {
				((ViewGroup) view.getParent()).removeView(view);
			}
		});
	}static Handler a(li li1)
    {
        return li1.e;
    }

	public static void a(final View view, boolean bl) {
		ViewPropertyAnimator viewPropertyAnimator = view.animate().alpha(0.0f)
				.setDuration((long) (ls.a() / 2));
		if (bl) {
			vk.a(viewPropertyAnimator, (Runnable) new Runnable() {

				public void run() {
					li.a(view);
				}
			});
		}
		viewPropertyAnimator.start();
	}

	public static void b(View paramView) {
		a(paramView, false);
	}

	private void setOwner(Fan paramFan) {
		this.a = paramFan;
	}

	public long getBannerShowedTime() {
		if (this.b) {
		}
		for (long l = System.currentTimeMillis() - this.c;; l = -1L) {
			return l;
		}
	}

	public boolean handleMessage(Message paramMessage) {
		int i = 1;
		if (i == paramMessage.what) {
			this.e.removeMessages(2);
			this.a.a(i);
		}

		if (2 == paramMessage.what) {
			onClick(this);
		} else {
			int j = 0;
		}
		return true;
	}

	public void onClick(View paramView) {
	}

	public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
		if (((paramView instanceof li)) && (paramMotionEvent.getAction() == 0)) {
			this.e.sendEmptyMessageDelayed(2, 400L);
		}
		return false;
	}
}
