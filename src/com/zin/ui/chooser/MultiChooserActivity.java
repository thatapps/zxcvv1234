/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Class
 *  java.lang.String
 */
package com.lazyswipe.ui.chooser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.ui.TutorialService;
import com.lazyswipe.zev.R;
import com.main.sl;
import com.main.sn;

/*
 * Failed to analyse overrides
 */
public class MultiChooserActivity extends Activity implements sn {

	protected sl a;
	protected PendingIntent b;
	protected PendingIntent c;
	protected boolean d;

	public MultiChooserActivity() {
	}

	public static Intent a(boolean flag) {
		Intent intent = new Intent(SwipeApplication.e(),
				com.lazyswipe.ui.chooser.MultiChooserActivity.class);
		intent.putExtra("EXTRA_CHOOSE_APP", flag);
		return intent;
	}

	protected int a() {
		return sl.a(d);
	}

	public void b() {
		if (d) {
			Intent intent = new Intent();
			intent.putExtra("extra.result_chosen_count", a.getChosenCount());
			setResult(-1, intent);
			if (b != null) {
				TutorialService.b(this, -1);
			}
			finish();
			return;
		} else {
			setResult(-1);
			finish();
			return;
		}
	}

	public void c() {
		if (d) {
			setResult(0);
			finish();
			if (c != null) {
				TutorialService.b(this, 0);
			}
			return;
		} else {
			setResult(0);
			finish();
			return;
		}
	}

	public void d() {
		finish();
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		d = getIntent().getBooleanExtra("EXTRA_CHOOSE_APP", true);
		setContentView(a());
		a = (sl) findViewById(0x7f0c000f);
		a.setMultiChooserCallBack(this);
		a.setIntent(getIntent());
		a.a();
	}

	protected void onDestroy() {
		super.onDestroy();
		a.b();
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		a.setIntent(intent);
	}

	protected void onPause() {
		super.onPause();
		a.i();
	}

	protected void onPostCreate(Bundle bundle) {
		super.onPostCreate(bundle);
		a.f();
	}

	protected void onResume() {
		super.onResume();
		a.h();
	}

	protected void onStart() {
		super.onStart();
		a.g();
	}

	protected void onStop() {
		super.onStop();
		a.j();
	}
}
