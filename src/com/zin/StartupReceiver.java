package com.lazyswipe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.ui.MainActivity;
import com.main.ir;
import com.main.jh;
import com.main.ji;
import com.main.ol;
import com.main.on;
import com.main.pb;
import com.main.ph;
import com.main.pj;
import com.main.tq;
import com.main.uj;
import com.main.vj;

public class StartupReceiver extends BroadcastReceiver {

	private static long a;

	// private void a(final Context context) {
	// SwipeService.k();
	// if (uj.d(context)) {
	// ji.a(context.getApplicationContext());
	// }
	// vj.b();
	// AsyncTask.execute((Runnable) new Runnable() {
	//
	// /*
	// * Enabled force condition propagation Lifted jumps to return sites
	// */
	// public void run() {
	// File file = context.getExternalCacheDir();
	// if (file == null)
	// return;
	// try {
	// tq.a(file, 1209600000);
	// return;
	// } catch (Throwable var2_2) {
	// return;
	// }
	// }
	// });
	// }

	private void a(final Context context) {
		SwipeService.k();
		if (uj.d(context)) {
			ji.a(context.getApplicationContext());
		}
		vj.b();
		AsyncTask.execute(new Runnable() {

			final Context a;
			final StartupReceiver b;

			public void run() {
				java.io.File file;
				file = a.getExternalCacheDir();
				if (file != null) {

					tq.a(file, 0x48190800L);
					return;
				}

			}

			{
				b = StartupReceiver.this;
				a = context;
				// super();
			}
		});
	}

	/*
	 * public void onReceive(Context var1, Intent var2) { byte var3; boolean
	 * var4; String var5;
	 * 
	 * var4 = ir.L(var1); var5 = var2.getAction(); switch (var5.hashCode()) {
	 * case -1172645946: if
	 * (var5.equals("android.net.conn.CONNECTIVITY_CHANGE")) { var3 = 6; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case -1042022227: if (var5.equals("com.lazyswipe.action.OPEN"))
	 * { var3 = 1; switch (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case 798292259: if
	 * (var5.equals("android.intent.action.BOOT_COMPLETED")) { var3 = 5; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case 823795052: if
	 * (var5.equals("android.intent.action.USER_PRESENT")) { var3 = 6; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case 1041332296: if
	 * (var5.equals("android.intent.action.DATE_CHANGED")) { var3 = 3; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case 1162734567: if
	 * (var5.equals("com.lazyswipe.action.OPEN_FROM_WIDGET")) { var3 = 2; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } break; case 1947666138: if
	 * (var5.equals("android.intent.action.ACTION_SHUTDOWN")) { var3 = 0; switch
	 * (var3) { case 0: ir.a(var1).edit()
	 * .putBoolean("key_boot_completed_received", false) .apply(); return; case
	 * 1: case 2: if (!var4) { if (!this.isOrderedBroadcast()) {
	 * MainActivity.a(var1); return; }
	 * 
	 * this.setResultCode(-1); return; }
	 * 
	 * if (this.isOrderedBroadcast()) { this.setResultCode(0); if (ir.b(var1) ==
	 * 1) { break; } }
	 * 
	 * if (Fan.j() != false) return; if
	 * (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) { var4 =
	 * var2.getBooleanExtra( "com.lazyswipe.extra.IS_LEFT", false); } else {
	 * var4 = ir.E(var1); }
	 * 
	 * SwipeService.a((Context) var1, (Bundle) SwipeService.a((Context) var1,
	 * var4) .getExtras()); return;
	 * 
	 * case 3: this.a(var1); return; case 4: ir.a((Context) var1).edit()
	 * .putBoolean("key_boot_completed_received", true) .apply(); case 5: if
	 * (!var4) { Process.killProcess(Process.myPid()); return; }
	 * 
	 * if (!SwipeService.d()) { Bundle var7 = new Bundle(1);
	 * var7.putInt("operation", 1); SwipeService.a((Context) var1, (Bundle)
	 * var7); }
	 * 
	 * pb.a().c(); ji.a(); SwipeService.f(); if (var5.equals((Object)
	 * "android.intent.action.USER_PRESENT") == false) return; if (uj.d(var1) ==
	 * false) return; if (ol.u == false) return; on.a(ol.t); return;
	 * 
	 * case 6: NetworkInfo var6 = uj.b((Context) var1); if (var6 != null &&
	 * var6.isConnected() && System.currentTimeMillis() - a >= 10000L) { a =
	 * System.currentTimeMillis(); ji.a(var1.getApplicationContext()); return; }
	 * }
	 * 
	 * } }
	 * 
	 * var3 = -1;
	 * 
	 * }
	 */

	public void onReceive(Context var1, Intent var2) {
		byte var3;
		boolean var4;
		String var5;
		var3 = -1;

		var4 = ir.L(var1);
		var5 = var2.getAction();
		switch (var5.hashCode()) {
		case -1172645946:
			if (var5.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
				var3 = 6;
				break /* label84 */;
			}
			break;
		case -1042022227:
			if (var5.equals("com.lazyswipe.action.OPEN")) {
				var3 = 1;
				break /* label84 */;
			}
			break;
		case 798292259:
			if (var5.equals("android.intent.action.BOOT_COMPLETED")) {
				var3 = 4;
				break /* label84 */;
			}
			break;
		case 823795052:
			if (var5.equals("android.intent.action.USER_PRESENT")) {
				var3 = 5;
				break /* label84 */;
			}
			break;
		case 1041332296:
			if (var5.equals("android.intent.action.DATE_CHANGED")) {
				var3 = 3;
				break /* label84 */;
			}
			break;
		case 1162734567:
			if (var5.equals("com.lazyswipe.action.OPEN_FROM_WIDGET")) {
				var3 = 2;
				break /* label84 */;
			}
			break;
		case 1947666138:
			if (var5.equals("android.intent.action.ACTION_SHUTDOWN")) {
				var3 = 0;
				break /* label84 */;
			}
		}

		switch (var3) {
		case 0:
			ir.a((Context) var1).edit()
					.putBoolean("key_boot_completed_received", false).apply();
			return;
		case 1:
		case 2:
			if (!var4) {
				if (!this.isOrderedBroadcast()) {
					MainActivity.a(var1);
					return;
				}

				this.setResultCode(-1);
				return;
			}

			if (this.isOrderedBroadcast()) {
				this.setResultCode(0);
				if (ir.b((Context) var1) == 1) {
					break;
				}
			}

			if (!Fan.j()) {
				if (var2.hasExtra("com.lazyswipe.extra.IS_LEFT")) {
					var4 = var2.getBooleanExtra("com.lazyswipe.extra.IS_LEFT",
							false);
				} else {
					var4 = ir.E(var1);
				}

				SwipeService.a((Context) var1,
						(Bundle) SwipeService.a((Context) var1, var4)
								.getExtras());
				return;
			}
			break;
		case 3:
			this.a(var1);
			return;
		case 4:
			ir.a((Context) var1).edit()
					.putBoolean("key_boot_completed_received", true).apply();
		case 5:
			if (!var4) {
				Process.killProcess(Process.myPid());
				return;
			}

			if (!SwipeService.d()) {
				Bundle var7 = new Bundle(1);
				var7.putInt("operation", 1);
				SwipeService.a((Context) var1, (Bundle) var7);
			}

			pb.a().c();
			ji.a();
			SwipeService.d();
			if (var5.equals("android.intent.action.USER_PRESENT")
					&& uj.d((Context) var1) && ol.u) {
				on.a(ol.t);
				return;

			}
			break;
		case 6:
			NetworkInfo var6 = uj.b((Context) var1);
			if (var6 != null && var6.isConnected()
					&& System.currentTimeMillis() - a >= 10000L) {
				a = System.currentTimeMillis();
				ji.a(var1.getApplicationContext());
				return;
			}
		}

	}
}
