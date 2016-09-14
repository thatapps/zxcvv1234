/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.lazyswipe.ui;

import java.io.Serializable;
import java.util.ArrayList;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.ui.chooser.MultiChooserActivity;
import com.main.jq;
import com.main.js;
import com.main.uk;
import com.main.vh;

/*
 * Failed to analyse overrides
 */
public class NotificationSettingsActivity extends FragmentContainer {
	 public NotificationSettingsActivity()
	    {
	    }

	    public static void a(Context context, String as[])
	    {
	        a(context, as, null, null);
	    }
	/*
	 * Enabled aggressive block sorting //
	 */
	// public static void a(Context context, String[] arrstring,
	// PendingIntent pendingIntent, PendingIntent pendingIntent2) {
	// js js = ((SwipeApplication) context.getApplicationContext()).b();
	// ArrayList arrayList = new ArrayList(2);
	// jq jq = js.a(vh.g(context));
	// if (jq != null) {
	// arrayList.add((Object) jq.h.getPackageName());
	// }
	// arrayList.add((Object) "com.google.android.dialer");
	// arrayList.add((Object) context.getPackageName());
	// ArrayList arrayList2 = new ArrayList(3);
	// if (uk.a(uk.a)) {
	// arrayList2.add((Object) uk.a);
	// }
	// if (uk.a(uk.b)) {
	// arrayList2.add((Object) uk.b);
	// }
	// if (uk.a("com.google.android.gm")) {
	// arrayList2.add((Object) "com.google.android.gm");
	// }
	// Intent intent = MultiChooserActivity.a(true);
	// intent.putExtra("extra.request_type", 2);
	// intent.putExtra("extra.request_existing_list", arrstring);
	// intent.putExtra("extra.request_exclude_existings", false);
	// intent.putExtra("extra.request_exclude_list", (Serializable) arrayList);
	// intent.putExtra("extra.request_invisible_list",
	// (Serializable) arrayList2);
	// if (pendingIntent2 != null) {
	// intent.putExtra("extra.ok_action", (Parcelable) pendingIntent2);
	// }
	// if (pendingIntent != null) {
	// intent.putExtra("extra.cancel_action", (Parcelable) pendingIntent2);
	// }
	// if (context instanceof Activity) {
	// ((Activity) context).startActivityForResult(intent, 2);
	// } else {
	// intent.addFlags(268468224);
	// context.startActivity(intent);
	// }
	// arrayList.clear();
	// }
	public static void a(Context context, String as[],
			PendingIntent pendingintent, PendingIntent pendingintent1) {
		Object obj = ((SwipeApplication) context.getApplicationContext()).b();
		ArrayList arraylist = new ArrayList(2);
		obj = ((js) (obj)).a(vh.g(context));
		if (obj != null) {
			arraylist.add(((jq) (obj)).h.getPackageName());
		}
		arraylist.add("com.google.android.dialer");
		arraylist.add(context.getPackageName());
		obj = new ArrayList(3);
		if (uk.a(uk.a)) {
			((ArrayList) (obj)).add(uk.a);
		}
		if (uk.a(uk.b)) {
			((ArrayList) (obj)).add(uk.b);
		}
		if (uk.a("com.google.android.gm")) {
			((ArrayList) (obj)).add("com.google.android.gm");
		}
		Intent intent = MultiChooserActivity.a(true);
		intent.putExtra("extra.request_type", 2);
		intent.putExtra("extra.request_existing_list", as);
		intent.putExtra("extra.request_exclude_existings", false);
		intent.putExtra("extra.request_exclude_list", arraylist);
		intent.putExtra("extra.request_invisible_list",
				((java.io.Serializable) (obj)));
		if (pendingintent1 != null) {
			intent.putExtra("extra.ok_action", pendingintent1);
		}
		if (pendingintent != null) {
			intent.putExtra("extra.cancel_action", pendingintent1);
		}
		if (context instanceof Activity) {
			((Activity) context).startActivityForResult(intent, 2);
		} else {
			intent.addFlags(0x10008000);
			context.startActivity(intent);
		}
		arraylist.clear();
	}
}
