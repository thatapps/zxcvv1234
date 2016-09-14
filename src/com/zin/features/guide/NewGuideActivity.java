/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.lazyswipe.features.guide;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

/*
 * Failed to analyse overrides
 */
public class NewGuideActivity extends Activity implements View.OnClickListener {
	private Handler a = new Handler();
	private boolean b;
	private boolean c;
	private BroadcastReceiver d;

	public NewGuideActivity() {
		this.d = new BroadcastReceiver() {

			/*
			 * Enabled aggressive block sorting Lifted jumps to return sites
			 */
			public void onReceive(Context context, Intent intent) {
				boolean bl = true;
				if (intent == null) {
					return;
				}
				String string = intent.getAction();
				if (!"android.intent.action.SCREEN_ON".equals((Object) string)) {
					if (!"android.intent.action.SCREEN_OFF"
							.equals((Object) string))
						return;
					NewGuideActivity.this.c = bl;
					return;
				}
				if (NewGuide.getShowCount() >= 2) {
					bl = false;
				}
				if (NewGuideActivity.this.c && bl) {
					NewGuideActivity.this.c();
				} else {
					NewGuideActivity.this.d();
					NewGuideActivity.this.finish();
				}
				NewGuideActivity.this.c = false;
			}
		};
	}

	public static void a() {
		SwipeApplication swipeApplication = SwipeApplication.e();
		Intent intent = new Intent(swipeApplication, NewGuideActivity.class);
		intent.addFlags(268435456);
		swipeApplication.startActivity(intent);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(Intent intent) {
		if (!(intent != null && intent.getBooleanExtra("finish_me", false))) {
			return;
		}
		this.finish();
	}

	public static void b() {
		SwipeApplication swipeApplication = SwipeApplication.e();
		Intent intent = new Intent((Context) swipeApplication,
				NewGuideActivity.class);
		intent.putExtra("finish_me", true);
		intent.addFlags(268435456);
		swipeApplication.startActivity(intent);
	}

	private void c() {
		this.a.postDelayed((Runnable) new Runnable() {

			public void run() {
				NewGuide.a((boolean) false);
			}
		}, 200);
	}

	private void d() {
		NewGuide.h();
	}

	private void e() {
		if (this.b) {
			return;
		}
		try {
			this.b = true;
			IntentFilter intentFilter = new IntentFilter();
			intentFilter.addAction("android.intent.action.SCREEN_OFF");
			intentFilter.addAction("android.intent.action.SCREEN_ON");

			this.registerReceiver(this.d, intentFilter);
			return;
		} catch (Exception var1_2) {
			return;
		}
	}

	private void f() {
		if (!this.b) {
			return;
		}
		try {
			this.b = false;
			this.unregisterReceiver(this.d);
			return;
		} catch (Exception var1_1) {
			return;
		}

	}

	public void onClick(View view) {
		switch (view.getId()) {
		default: {
			return;
		}
		case 2131492880:
		}
		this.finish();
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		this.a(this.getIntent());
		this.setContentView(R.layout.activity_new_guide);
		this.findViewById(R.id.root).setOnClickListener(
				(View.OnClickListener) this);
		this.e();
		this.c();
	}

	protected void onDestroy() {
		super.onDestroy();

		this.f();
		this.finish();
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		this.a(intent);
	}

}
