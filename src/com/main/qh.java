package com.main;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.lazyswipe.zev.R;

public class qh extends rc {
	private final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();

	public qh(Context context) {
		this(context, null);
	}

	public qh(Context context, rd rd) {
		super(context, rd);
	}

	private static int b(int n) {
		switch (n) {
		default: {
			return 4;
		}
		case 10: {
			return 0;
		}
		case 12: {
			return 1;
		}
		case 11: {
			return 2;
		}
		case 13:
		}
		return 3;
	}

	public int a(Context context) {
		if (this.a != null) {
			return qh.b(this.a.getState());
		}
		return 4;
	}

	public int a(boolean bl) {
		return R.drawable.tile_bluetooth;
	}

	public String a() {
		return "android.bluetooth.adapter.action.STATE_CHANGED";
	}

	public void a(Context context, Intent intent) {
		if (!"android.bluetooth.adapter.action.STATE_CHANGED"
				.equals((Object) intent.getAction())) {
			return;
		}
		this.a(context, qh.b(intent.getIntExtra(
				"android.bluetooth.adapter.extra.STATE", -1)));
	}

	public boolean a(Context context, final boolean bl) {
		if (this.a == null) {
			// empty if block
		}
		new AsyncTask() {

			/*
			 * Enabled force condition propagation Lifted jumps to return sites
			 */
			protected Boolean a(Void... arrvoid) {
				try {
					boolean bl3;
					boolean bl2;
					if (bl) {
						bl3 = qh.this.a.enable();
						do {
							return bl3;
							
						} while (true);
					}
					bl3 = bl2 = qh.this.a.disable();
					return bl3;
				} catch (Throwable var2_4) {
					return false;
				}
			}

			protected Object doInBackground(Object[] arrobject) {
				return this.a((Void[]) arrobject);
			}
		}.execute((Object[]) new Void[0]);
		return super.a(context, bl);
	}

	public Intent b(Context context) {
		Intent intent = this.a("com.android.settings",
				"com.android.settings.Settings$BluetoothSettingsActivity");
		if (vk.a(context, intent)) {
			return intent;
		}
		intent.setClassName("com.android.settings",
				"com.android.settings.WirelessSettings");
		return intent;
	}

	public String b() {
		return "Bluetooth";
	}

	public int c() {
		return R.string.title_tile_bluetooth;
	}

}
