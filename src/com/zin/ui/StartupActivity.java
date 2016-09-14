/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.String
 */
package com.lazyswipe.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.flurry.android.FlurryAgent;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.features.guide.NewGuide;
import com.lazyswipe.features.guide.NewGuideActivity;
import com.lazyswipe.features.guide.UpgradeGuideActivity;
import com.main.ir;
import com.main.is;
import com.main.to;
import com.main.um;

/*
 * Failed to analyse overrides
 */
public class StartupActivity extends Activity {
	public static void a(Context context) {
		context.startActivity(new Intent(context, StartupActivity.class)
				.addFlags(268435456));
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	protected void onCreate(Bundle var1_1) {
		super.onCreate(var1_1);
		int var1 = ir.I(this);
		boolean var2;
		if (var1 <= 0) {
			var2 = true;
		} else {
			var2 = false;
		}
		// configure Flurry
		FlurryAgent.setLogEnabled(false);

		// init Flurry
		FlurryAgent.init(this, "HMM82NM49FQQXVMF2BGW");
		SwipeApplication.c = var2;
		SharedPreferences var3 = ir.a((Context) this);
		if (!var3.contains("key_boot_completed_received")) {
			var3.edit().putBoolean("key_boot_completed_received", true).apply();
		}

		if (!SwipeApplication.c
				&& !var3.getBoolean("key_hint_auto_start", false)
				&& !var3.getBoolean("key_boot_completed_received", false)
				&& var1 <= 2 && !SwipeService.d()) {
			SwipeApplication.d = true;
			var3.edit().putBoolean("key_hint_auto_start", true)
					.putInt("key_tutorial_step", 107).apply();
		}

		if (to.C() && !to.a((Context) this)) {
			this.startActivity(new Intent(this, MainActivity.class));
		} else {
			switch (var1) {
			case 0:
			case 1:
				if (var3.getInt("key_tutorial_step", 1) < NewGuide
						.getGuideEndStep()) {
					if (NewGuide.getShowCount() > 1) {
						NewGuide.h();
						MainActivity.a(this);
					} else {
						MainActivity.a(this, false);
						NewGuideActivity.a();
					}
				} else {
					MainActivity.a(this);
				}
				break;
			case 2:
			case 3:
				if (!UpgradeGuideActivity.a) {
					if (var1 == 2) {
						MainActivity.a(this, false);
					}

					MainActivity.a(this);
				} else {
					UpgradeGuideActivity.a = false;
					UpgradeGuideActivity.a((Context) this);
				}
			}

			this.finish();
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		FlurryAgent.onStartSession(this, "HMM82NM49FQQXVMF2BGW");
	}

	@Override
	protected void onStop() {
		super.onStop();
		FlurryAgent.onEndSession(this);
	}
}
