/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.lazyswipe.tile;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class FlashlightActivity extends Activity {

	private android.os.PowerManager.WakeLock a;
	private final Handler b = new Handler() {

		final FlashlightActivity a;

		public void handleMessage(Message message) {
			if (a.isFinishing()) {
				return;
			}
			switch (message.what) {
			default:
				return;

			case 1: // '\001'
				break;
			}
			if (!vk.a(a.getApplicationContext(),
					com.lazyswipe.tile.FlashlightActivity.class)) {
				FlashlightActivity.a(a).sendEmptyMessageDelayed(1, 200L);
				return;
			} else {
				Window window = a.getWindow();
				android.view.WindowManager.LayoutParams layoutparams = window
						.getAttributes();
				layoutparams.screenBrightness = 1.0F;
				window.setAttributes(layoutparams);
				return;
			}
		}

		{
			a = FlashlightActivity.this;
			// super();
		}
	};

	public FlashlightActivity() {
	}

	static Handler a(FlashlightActivity flashlightactivity) {
		return flashlightactivity.b;
	}

	private void b() {
		if (a == null) {
			a = ((PowerManager) getSystemService("power")).newWakeLock(6,
					getClass().getCanonicalName());
			a.acquire();
		}
	}

	private void c() {
		if (a != null && a.isHeld()) {
			a.release();
			a = null;
		}
	}

	public void a() {
		Object obj = getWindow();
		((Window) (obj)).setFlags(1024, 1024);
		((Window) (obj)).setFlags(128, 128);
		obj = new FrameLayout(this);
		((FrameLayout) (obj)).setBackgroundColor(-1);
		((FrameLayout) (obj))
				.setLayoutParams(new android.widget.LinearLayout.LayoutParams(
						-1, -1));
		setContentView(((android.view.View) (obj)));
	}

	public void onBackPressed() {
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		a();
	}

	protected void onDestroy() {
		super.onDestroy();
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
    {
       
     //   JVM INSTR tableswitch 4 4: default 20
    //                   4 27;
          // goto _L1 _L2
        
        
        switch(i){
        	default :
        		 return super.onKeyDown(i, keyevent);
        	case 4:
        		 finish();
        	
        }
		return false;

    }

	protected void onPause() {
		super.onPause();
		c();
	}

	protected void onResume() {
		super.onResume();
		b();
		b.sendEmptyMessageDelayed(1, 200L);
	}

	protected void onStart() {
		super.onStart();
	}

	protected void onStop() {
		super.onStop();
	}
}
