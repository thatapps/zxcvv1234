package com.main;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;

public class qe extends rc {
	public qe(Context paramContext) {
		this(paramContext, null);
	}

	public qe(Context paramContext, rd paramrd) {
		super(paramContext, paramrd);
	}

	public int a(Context paramContext) {
		if (vh.a(paramContext)) {
		}
		for (int i = 1;; i = 0) {
			return i;
		}
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_airplane_mode;
	}

	public String a() {
		return "android.intent.action.AIRPLANE_MODE";
	}

	public void a(Context paramContext, Intent paramIntent) {
		a(paramContext, a(paramContext));
	}

	public boolean a(Context paramContext, boolean paramBoolean) {
		return b(paramBoolean);
	}

	boolean a(boolean flag, boolean flag1) {
		boolean flag4 = true;
		boolean flag3;
		Object obj;
		if (a(d) == 1) {
			flag3 = true;
		} else {
			flag3 = false;
		}
		if (flag == flag3) {
			return false;
		}
		boolean flag2;
		if (android.os.Build.VERSION.SDK_INT >= 17) {
			flag2 = true;
		} else {
			flag2 = false;
		}
		if (ir.y(d) && flag1 && flag2) {
			ui.a(new Runnable() {

				boolean a;
				final qe b;

				public void run() {
					Fan.c(true);
					StringBuilder stringbuilder = (new StringBuilder())
							.append("settings put global airplane_mode_on");
					Object obj1;
					boolean flag5;
					if (a) {
						obj1 = " 1";
					} else {
						obj1 = " 0";
					}
					obj1 = stringbuilder
							.append(((String) (obj1)))
							.append("; am broadcast -a android.intent.action.AIRPLANE_MODE ")
							.append("--ez state ");
					if (!a) {
						flag5 = true;
					} else {
						flag5 = false;
					}
					if (!vb.a(
							((StringBuilder) (obj1)).append(flag5).toString(),
							true, false).d) {
						b.a(a, false);
					}
				}

				{
					b = qe.this;
					// a = flag;
					// super();
				}
			});
			return false;
		}
		if (!flag2) {
			obj = d.getContentResolver();
			int i;
			if (flag) {
				i = 1;
			} else {
				i = 0;
			}
			android.provider.Settings.System.putInt(
					((android.content.ContentResolver) (obj)),
					"airplane_mode_on", i);
		}
		try {
			obj = new Intent("android.intent.action.AIRPLANE_MODE");
			((Intent) (obj)).putExtra("state", flag);
			d.sendBroadcast(((Intent) (obj)));
		} catch (Exception exception) {
			Log.e("Swipe.Tile", "setAirplaneMode error", exception);
		}
		if (a(d) == 1) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		if (flag1 != flag && i(d)) {
			flag = flag4;
		} else {
			flag = false;
		}
		return flag;
	}

	public Intent b(Context paramContext) {
		Intent localIntent;
		if ((to.F()) || (to.G())) {
			localIntent = a("com.android.settings",
					"com.android.settings.HWSettings");
		}

		if ((to.j()) || ((to.i()) && (to.u()))) {
			localIntent = a("com.android.settings",
					"com.android.settings.MiuiSettings");
		} else if (to.t()) {
			localIntent = a("com.android.settings",
					"com.android.settings.Settings");
		} else if (("SM-G730V".equals(Build.MODEL))
				|| ("SM-G3608".equals(Build.MODEL))) {
			localIntent = vk.i();
		} else {
			localIntent = vk.f("android.settings.AIRPLANE_MODE_SETTINGS");
			if (!vk.a(paramContext, localIntent)) {
				localIntent = vk.f("android.settings.WIRELESS_SETTINGS");
			}
		}
		return localIntent;
	}

	public String b() {
		return "Airplane mode";
	}

	boolean b(boolean paramBoolean) {
		return a(paramBoolean, true);
	}

	public int c() {
		return R.string.title_tile_airplane_mode;
	}

	public boolean d() {
		if ((!to.H()) || (ir.y(this.d))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}
}
