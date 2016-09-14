/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.String
 */
package com.lazyswipe.features.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class UpgradeGuideActivity extends Activity {
	public static boolean a = false;

	public static void a() {
		SwipeApplication swipeApplication = SwipeApplication.e();
		Intent intent = new Intent((Context) swipeApplication,
				(Class) UpgradeGuideActivity.class);
		intent.putExtra("finish_me", true);
		intent.addFlags(268435456);
		swipeApplication.startActivity(intent);
	}

	public static void a(Context context) {
		vk.c(context, new Intent(context, (Class) UpgradeGuideActivity.class));
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

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		this.a(this.getIntent());
		this.setContentView(R.layout.activity_upgrade_guide);
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		this.a(intent);
	}
}
