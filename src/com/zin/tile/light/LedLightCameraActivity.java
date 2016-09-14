/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.lazyswipe.tile.light;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.main.ro;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public class LedLightCameraActivity extends Activity implements
		SurfaceHolder.Callback {
	public static SurfaceView a;
	private static LedLightCameraActivity b;
	private static boolean c;
	private boolean d = false;
	private boolean e = false;
	private Handler f;

	static {
		b = null;
		c = false;
	}

	public LedLightCameraActivity() {
		this.f = new Handler() {

			public void handleMessage(Message message) {
				switch (message.what) {
				default: {
					return;
				}
				case 1:
				}
				LedLightCameraActivity.this.e();
			}
		};
	}

	public static boolean a() {
		if (b != null) {
			LedLightCameraActivity.b.d = true;
			b.d();
			return true;
		}
		return false;
	}

	public static void b() {
		c = true;
		if (b != null) {
			b.d();
		}
	}

	public static void c() {
		c = false;
	}

	private void d() {
		if (c) {
			this.finish();
		}
		if (this.e && this.d) {
			this.f.sendEmptyMessage(1);
		}
	}

	private void e() {
		if (a != null) {
			a.getHolder().removeCallback((SurfaceHolder.Callback) this);
			a = null;
		}
		this.moveTaskToBack(true);
		this.finish();
		b = null;
		a = null;
		ro.a = true;
		c = false;
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		b = this;
		LinearLayout linearLayout = new LinearLayout((Context) this);
		linearLayout
				.setLayoutParams((ViewGroup.LayoutParams) new LinearLayout.LayoutParams(
						-1, -1));
		this.setContentView((View) linearLayout);
		FrameLayout frameLayout = new FrameLayout((Context) this);
		frameLayout
				.setLayoutParams((ViewGroup.LayoutParams) new LinearLayout.LayoutParams(
						1, 1));
		linearLayout.addView((View) frameLayout);
		if (a == null) {
			vj.c("Swipe.Light",
					"LedLightCameraActivity onCreate find mSurfaceView null");
			this.finish();
			return;
		}
		SurfaceHolder surfaceHolder = a.getHolder();
		if (surfaceHolder == null) {
			vj.c("Swipe.Light",
					"LedLightCameraActivity onCreate find holder null");
			this.finish();
			return;
		}
		surfaceHolder.addCallback((SurfaceHolder.Callback) this);
		frameLayout.addView((View) a, 0);
		if (c) {
			b = null;
			this.finish();
			return;
		}
		c = false;
	}

	protected void onDestroy() {
		super.onDestroy();
		b = null;
		a = null;
		ro.a = true;
		c = false;
	}

	public void surfaceChanged(SurfaceHolder surfaceHolder, int n, int n2,
			int n3) {
	}

	public void surfaceCreated(SurfaceHolder surfaceHolder) {
		this.e = true;
		this.d();
	}

	public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
	}

}
