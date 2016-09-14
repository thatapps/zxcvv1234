package com.main;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Vibrator;
import android.util.Log;

public class qu extends qz {

	private AudioManager a;
	private Vibrator b;
	private boolean c;

	public qu(Context context) {
		this(context, null);
	}

	public qu(Context context, rd rd) {
		super(context, rd);
		f(context);
	}

	private void f(Context context) {
		a = (AudioManager) context.getSystemService("audio");
		b = vk.p(context);
		boolean flag;
		if (b != null) {
			flag = true;
		} else {
			flag = false;
		}
		c = flag;
		Log.i("Swipe.Tile", (new StringBuilder()).append("Has vibrator? ")
				.append(c).toString());
	}

	private boolean l() {
		return !to.I() || to.n(d);
	}

	public int a(Context context) {
		byte byte0 = 1;
		if (a == null) {
			byte0 = 4;
		} else {
			boolean flag;
			if (a.getRingerMode() == 2) {
				flag = true;
			} else {
				flag = false;
			}
			if (!flag) {
				return 0;
			}
		}
		return byte0;
	}

	public int a(boolean flag) {
		return 0;
	}

	public String a() {
		return "android.media.RINGER_MODE_CHANGED";
	}

	public void a(Context context, Intent intent) {
		int i = 1;
		if (!"android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
			return;
		}
		if (f && isInitialStickyBroadcast()) {
			f = false;
			return;
		}
		if (intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 1) != 2) {
			i = 0;
		}
		a(context, i);
	}

	public boolean a(int i) {
		return e(d) != 0x7f020099;
	}

	public boolean a(Context context, boolean flag) {
		byte byte0 = 1;
		if (a == null) {
			return super.a(context, flag);
		} else {
			// JVM INSTR tableswitch 0 2: default 44
			// 0 98
			// 1 123
			// 2 61;
			// goto _L3 _L4 _L5 _L6

			switch (a.getRingerMode()) {
			default:
				byte0 = 2;
			case 0:
				if (c) {
					b.vibrate(250L);
				} else {
					byte0 = 2;
				}
				break;
			case 1:
				byte0 = 2;
				break;
			case 2:
				if (l()) {
					byte0 = 0;
				} else if (c) {
					b.vibrate(250L);
				} else {
					byte0 = 2;
				}
			}

		}
		a.setRingerMode(byte0);
		return super.a(context, flag);
	}

	public String b() {
		return "Sound";
	}

	public int c() {
		return 0x7f0f00bd;
	}

	public boolean d() {
		return false;
	}

	public int e(Context context) {
		int i;
		try {
			i = a.getRingerMode();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e("Swipe.Tile", "Failed to get the ringer mode.", exception);
			return 0x7f020098;
		}
		switch (i) {
		case 2: // '\002'
		default:
			return 0x7f020098;

		case 0: // '\0'
			return 0x7f020099;

		case 1: // '\001'
			return 0x7f02009a;
		}
	}
}
