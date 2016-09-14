package com.main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

import com.android.bluetooth.BluetoothPan;
import com.lazyswipe.zev.R;

public class qg extends rc {
	private static final List b = new ArrayList(2);
	AtomicReference a = new AtomicReference();
	private ConnectivityManager c;
	private String[] i;
	private boolean j;
	private BluetoothProfile.ServiceListener k;

	static {
		b.add((Object) "android.net.conn.TETHER_STATE_CHANGED");
		b.add((Object) "android.bluetooth.adapter.action.STATE_CHANGED");
	}

	public qg(Context context) {
		this(context, null);
	}

	public qg(Context context, rd rd) {
		super(context, rd);
		this.k = new BluetoothProfile.ServiceListener() {

			public void onServiceConnected(int n,
					BluetoothProfile bluetoothProfile) {
				qg.this.a.set((Object) (bluetoothProfile));
			}

			public void onServiceDisconnected(int n) {
				qg.this.a.set((Object) null);
			}
		};
		this.c = (ConnectivityManager) context.getSystemService("connectivity");
		this.i = vk.a(this.c);
		BluetoothAdapter bluetoothAdapter = BluetoothAdapter
				.getDefaultAdapter();
		if (bluetoothAdapter != null) {
			bluetoothAdapter.getProfileProxy(this.d.getApplicationContext(),
					this.k, 5);
		}
	}

	private static String a(String[] arrstring, String[] arrstring2) {
		if (arrstring == null)
			return null;
		if (arrstring2 == null) {
			return null;
		}
		for (String string : arrstring) {
			int n = arrstring2.length;
			for (int i = 0; i < n; ++i) {
				if (string.matches(arrstring2[i]))
					return string;
			}
		}
		return null;
	}

	private void a(String[] arrstring, String[] arrstring2, String[] arrstring3) {
		int n;
		BluetoothAdapter bluetoothAdapter = BluetoothAdapter
				.getDefaultAdapter();
		if (bluetoothAdapter == null) {
			return;
		}
		int n2 = bluetoothAdapter.getState();
		if (n2 == 13) {
			n = 3;
		} else if (n2 == 11) {
			n = 2;
		} else {
			BluetoothPan bluetoothPan = (BluetoothPan) this.a.get();
			n = n2 == 12 && bluetoothPan != null
					&& bluetoothPan.isTetheringOn() ? 1 : 0;
		}
		this.a(this.d, n);
	}

	private void l() {
		a((String[]) uo.a(this.c,
				uo.a(this.c.getClass(), "getTetherableIfaces")),
				(String[]) uo.a(this.c,
						uo.a(this.c.getClass(), "getTetheredIfaces")),
				(String[]) uo.a(this.c,
						uo.a(this.c.getClass(), "getTetheringErroredIfaces")));
	}

	public int a(Context paramContext) {
		int m = 0;
		try {
			BluetoothPan localBluetoothPan = (BluetoothPan) this.a.get();
			if (localBluetoothPan == null) {
				;
			}
			boolean bool = localBluetoothPan.isTetheringOn();
			if (!bool) {
				
			}
			m = 1;
		} catch (Exception localException) {
			
			
		}
		return m;
	

	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_wifi_ap;
	}

	public void a(Context paramContext, Intent paramIntent) {
		String str = paramIntent.getAction();
		int m = -1;
		switch (str.hashCode()) {
		default:
			switch (m) {
			}
			break;
		}

		if (!str.equals("android.net.conn.TETHER_STATE_CHANGED")) {
			//break;
		}
		m = 0;
		//break;
		if (!str.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
			//break;
		}
		m = 1;
		//break;
		ArrayList localArrayList1 = paramIntent
				.getStringArrayListExtra("availableArray");
		ArrayList localArrayList2 = paramIntent
				.getStringArrayListExtra("activeArray");
		ArrayList localArrayList3 = paramIntent
				.getStringArrayListExtra("erroredArray");
		a((String[]) localArrayList1
				.toArray(new String[localArrayList1.size()]),
				(String[]) localArrayList2.toArray(new String[localArrayList2
						.size()]), (String[]) localArrayList3
						.toArray(new String[localArrayList3.size()]));

		if (this.j) {
			switch (paramIntent.getIntExtra(
					"android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
			}
		}

		l();

		BluetoothPan localBluetoothPan = (BluetoothPan) this.a.get();
		if (localBluetoothPan != null) {
			localBluetoothPan.setBluetoothTethering(true);
			this.j = false;
			//continue;
			this.j = false;
		}

	}

	public boolean a(Context paramContext, boolean paramBoolean) {
		if (paramBoolean) {
			BluetoothAdapter localBluetoothAdapter = BluetoothAdapter
					.getDefaultAdapter();
			if (localBluetoothAdapter.getState() == 10) {
				this.j = true;
				localBluetoothAdapter.enable();
			}
		}

		BluetoothPan localBluetoothPan2 = (BluetoothPan) this.a.get();
		if (localBluetoothPan2 != null) {
			localBluetoothPan2.setBluetoothTethering(true);
			
			String str = a(
					(String[]) uo.a(this.c,
							uo.a(this.c.getClass(), "getTetheredIfaces")),
					this.i);
			if (str != null) {
				ConnectivityManager localConnectivityManager = this.c;
				Class localClass = this.c.getClass();
				Class[] arrayOfClass = new Class[1];
				arrayOfClass[0] = String.class;
				Method localMethod = uo.a(localClass, "untether", arrayOfClass);
				Object[] arrayOfObject = new Object[1];
				arrayOfObject[0] = str;
				uo.a(localConnectivityManager, localMethod, arrayOfObject);
			}
			BluetoothPan localBluetoothPan1 = (BluetoothPan) this.a.get();
			if (localBluetoothPan1 != null) {
				localBluetoothPan1.setBluetoothTethering(false);
			}
		}
		return false;
	}

	public Intent b(Context paramContext) {
		return a("com.android.settings", "com.android.settings.TetherSettings");
	}

	public String b() {
		return "Bluetooth tethering";
	}

	public int c() {
		return R.string.title_tile_bluetooth_tethering;
	}

	public List f() {
		return b;
	}
}
