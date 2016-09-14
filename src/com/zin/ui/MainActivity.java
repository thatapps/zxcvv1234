/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Class
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.lazyswipe.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.SwipeService;
import com.lazyswipe.SwipeServicePhantom;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.jc;
import com.main.ji;
import com.main.ol;
import com.main.os;
import com.main.pa;
import com.main.se;
import com.main.sg;
import com.main.tm;
import com.main.to;
import com.main.ui;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class MainActivity extends FragmentContainer implements se {
	private RateView b;
	private jc c;
	private pa d;

	public static void a(Context context) {
		Intent intent = new Intent(context,  MainActivity.class);
		if (!(context instanceof Activity)) {
			intent.addFlags(268435456);
		}
		vk.c(context, intent);
	}

	public static void a(Context context, boolean bl) {
		ir.h(context, true);
		Bundle bundle = new Bundle(2);
		bundle.putInt("operation", 1);
		bundle.putBoolean("param_1", bl);
		SwipeService.a(context, bundle);
	}

	public static void b(Context context) {
		MainActivity.a(context, false);
	}

	private void d() {
		if (!ir.L((Context) this)) {
			this.stopService(new Intent((Context) this,
					(Class) SwipeService.class));
		}
	}

	public void a(String string, int n, boolean bl) {
		if (this.b == null) {
			this.b = (RateView) LayoutInflater.from((Context) this).inflate(
					R.layout.rate, null, false);
			this.b.a(bl, false);
			this.addContentView((View) this.b, new ViewGroup.LayoutParams(-1,
					-1));
		}
		this.b.setImageAndText(n);
		this.b.a(string);
	}

	public void onBackPressed() {
		if (RateView.b()) {
			return;
		}
		super.onBackPressed();
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		tm.a((Context) this);
		new tm((Context) this, "com.lazyswipe.zev",
				SwipeServicePhantom.class.getName(), 3, false).a(2000);
		this.d = new pa((Activity) this);
		this.c = new jc();
		this.c.a((Context) this);
		jc.e();
		if (!ir.q((Context) this)) {
			jc.d((Context) this);
		}
		os.a((Activity) this);
		to.w();
	}

	protected void onDestroy() {
		if (this.d != null) {
			this.d.b();
		}
		super.onDestroy();
		RateView.b();
		this.c.b((Context) this);
		this.d();
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		this.setIntent(intent);
	}

	protected void onPostCreate(Bundle bundle) {
		super.onPostCreate(bundle);
		/*if (!(!ol.a() || vk.b((Context) this, "com.hola.launcher")
				|| ir.m((Context) this) || ir.b)) {
			sg sg = new sg(this.getApplicationContext());
			ui.a(ji.a, (Runnable) sg);
		}*/
	}

	protected void onResume() {
		super.onResume();
		Intent intent = this.getIntent();
		if (intent.hasExtra("finish")) {
			this.finish();
			return;
		}
		this.d.a(intent);
	}

	public void showFloatWindowView(View view) {
		this.addContentView(view, new ViewGroup.LayoutParams(-1, -1));
	}
}
