package com.main;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class qr extends rc {

	private static boolean a = false;
	private final qp b;

	public qr(Context context) {
		this(context, null);
	}

	public qr(Context context, rd rd) {
		super(context, rd);
		b = new qp(context);
	}

	private static int b(String s) {
		int i = 1;
		byte byte0 = -1;
		if (s == null) {

			i = 0;
		} else {

			s = s.toUpperCase();
			byte0 = -1;
			s.hashCode();

			switch (s.hashCode()) {
			default:
				break;
			case -2087582999:
				if (s.equals("CONNECTED")) {
					byte0 = 0;
				}
				break;
			case -290559304:
				if (s.equals("CONNECTING")) {
					byte0 = 2;
				}
				break;
			case 935892539:
				if (s.equals("DISCONNECTED")) {
					byte0 = 1;
				}
				break;
			case 1124965819:

				if (s.equals("SUSPENDED")) {
					byte0 = 3;
				}

			}

		}

		switch (byte0) {
		default:
			i = 0;
			break;
		case 0:
			return i;
		case 1:
			return 0;
		case 2:
			return 2;

		case 3:
			return 2;

		}
		return byte0;

	}

	private static int c(int i) {
		switch (i) {
		default:
			return 4;

		case 0: // '\0'
			return 0;

		case 2: // '\002'
			return 1;

		case 1: // '\001'
		case 3: // '\003'
			return 2;
		}
	}

	public int a(Context context) {
		int i = 0;
		if (b.a()) {
			return 0;
		}
		boolean flag = b.b();
		if (flag) {
			return 1;
		}

		i = c(b.c());
		return i;
	}

	public int a(boolean flag) {
		return 0x7f020092;
	}

	public String a() {
		return "android.intent.action.ANY_DATA_STATE";
	}

	public void a(Context context, Intent intent) {
		if (!"android.intent.action.ANY_DATA_STATE".equals(intent.getAction())) {
			return;
		} else {
			a(context, b(intent.getStringExtra("state")));
			return;
		}
	}

	public boolean a(Context context, boolean flag) {
		if (!b.a(flag)) {
			try {
				context.startActivity((new Intent())
						.setClassName("com.android.settings",
								"com.android.settings.Settings$DataUsageSummaryActivity")
						.addFlags(0x10000000).addFlags(32768));
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
			}
			return true;
		} else {
			return super.a(context, flag);
		}
	}

	public void a_(boolean flag) {
		a = flag;
	}

	public int b(int i) {
		switch (i) {
		case 15: // '\017'
		case 16: // '\020'
		default:
			return 0;

		case 1: // '\001'
		case 2: // '\002'
		case 4: // '\004'
		case 7: // '\007'
		case 11: // '\013'
			return 2;

		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 12: // '\f'
		case 14: // '\016'
		case 17: // '\021'
		case 18: // '\022'
			return 3;

		case 13: // '\r'
			return 4;
		}
	}

	public Intent b(Context context) {
		Intent intent = a("com.android.phone",
				"com.android.phone.MobileNetworkSettings");
		if (!vk.a(context, intent)) {
			intent.setClassName("com.android.settings",
					"com.android.settings.Settings$MobileNetworkSettingsActivity");
		}
		if (!vk.a(context, intent)) {
			if (tn.b(context).equalsIgnoreCase("HTC")) {
				intent.setClassName("com.android.settings",
						"com.android.settings.WirelessSettings");
				if (!vk.a(context, intent)) {
					intent.setClassName("com.android.phone",
							"com.android.phone.Settings");
				}
			} else {
				intent.setClassName("com.android.phone",
						"com.android.phone.Settings");
			}
		}
		if (!vk.a(context, intent)) {
			intent.setClassName("com.android.settings",
					"com.android.settings.Settings");
		}
		return intent;
	}

	public String b() {
		return "Mobile data";
	}

	public String b_() {
		int j = ir.a(d, "pref_mobile_state_level", 0);
		int l = -1;
		NetworkInfo network = null;
		State networkInfo = ((ConnectivityManager) d.getSystemService("connectivity"))
				.getNetworkInfo(0).getState();
		if (networkInfo != null) {
			if (android.net.NetworkInfo.State.CONNECTED == networkInfo) {
				network = ((ConnectivityManager) d.getSystemService("connectivity"))
						.getActiveNetworkInfo();
			}
		}

		if (network != null) {
			if (((NetworkInfo) (network)).isAvailable()) {
				l = b(((NetworkInfo) (network)).getSubtype());

			}
		}

		int i;
		i = l;
		if (j < l) {
			ir.b(d, "pref_mobile_state_level", l);
			i = l;
		}
		ir.b(d, "pref_mobile_state_level", l);
		i = l;

		switch (i) {
		case 1: // '\001'
		default:
			return d.getString(c());

		case 0: // '\0'
		case 2: // '\002'
			return d.getString(c());

		case 3: // '\003'
			return "3G";

		case 4: // '\004'
			return "4G";
		}

		// vj.a("Swipe.Tile", "getLabel failed.", throwable);
		// i = j;

	}

	public int c() {
		return 0x7f0f00ba;
	}

	public boolean c(Context context) {
		if ((to.t() || to.K() || to.L()) && !f(context)) {
			vi.a(context, 0x7f0f004d);
			return false;
		} else {
			return super.c(context);
		}
	}

	protected String c_() {
		return "com.lazyswipe.tile.data.action.REFRESH";
	}

	public boolean d() {
		return android.os.Build.VERSION.SDK_INT < 21 || ir.y(d);
	}

	public boolean d(Context context) {
		if (!f(context)) {
			vi.a(context, 0x7f0f004d);
			return false;
		} else {
			return super.d(context);
		}
	}

	public boolean f(Context context) {
		return !b.a();
	}

	public boolean k() {
		return a;
	}

}
