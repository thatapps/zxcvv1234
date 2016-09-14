/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.provider.Settings
 *  android.provider.Settings$System
 *  android.util.Log
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.lazyswipe.tile;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.lazyswipe.SwipeService;

/*
 * Failed to analyse overrides
 */
public class BrightnessTileActivity extends Activity implements
		Handler.Callback {
	private static final String a = "Swipe."
			+ BrightnessTileActivity.class.getSimpleName();
	private Handler b;

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int n) {
		Window window = this.getWindow();
		WindowManager.LayoutParams layoutParams = window.getAttributes();
		float f = n < 0 ? -1.0f : (float) n / 255.0f;
		layoutParams.screenBrightness = f;
		window.setAttributes(layoutParams);
	}

	public boolean handleMessage(Message message) {
		this.finish();
		return true;
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		this.b = new Handler((Handler.Callback) this);
		try {
			if (SwipeService.o().p()) {
				Log.i((String) a, (String) "Start with a fullscreen theme");
				this.setTheme(16973841);
			}
			return;
		} catch (Throwable var2_2) {
			return;
		}
	}

	protected void onDestroy() {
		super.onDestroy();
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		this.setIntent(intent);
		this.b.removeMessages(0);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onResume() {
		super.onResume();
		this.b.sendEmptyMessageDelayed(0, 400);
		Bundle bundle = this.getIntent().getExtras();
		int n = bundle.getInt("mode");
		int n2 = bundle.getInt("value");
		Settings.System.putInt((ContentResolver) this.getContentResolver(),
				(String) "screen_brightness_mode", (int) n);
		if (n != 1) {
			Settings.System.putInt((ContentResolver) this.getContentResolver(),
					(String) "screen_brightness", (int) n2);
			this.a(n2);
		} else {
			this.a(-1);
		}
		this.sendBroadcast(new Intent("com.lazyswipe.action.BRIGHTNESS_CHANGED"));
	}
}
