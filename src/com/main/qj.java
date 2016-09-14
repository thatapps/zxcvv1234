package com.main;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.tile.BrightnessTileActivity;
import com.lazyswipe.zev.R;

public class qj extends ql implements wh {
	public static final int a;
	public static final int b;
	static final int c;

	static {
		int n = qj.b("BRIGHTNESS_DIM");
		int n2 = n + 10;
		int n3 = qj.b("BRIGHTNESS_ON");
		int n4 = 1 + (n + (n3 - n) / 2);
		if (n3 <= n2 || n3 <= n4 || n4 <= n2) {
			n3 = 255;
			n4 = 127;
			n2 = 63;
		}
		a = Math.max((int) n2, (int) 10);
		b = n3;
		c = n4;
	}

	public qj(Context context) {
		this(context, null);
	}

	public qj(Context context, rd rd) {
		super(context, rd);
	}

	// private void a(int n, float f) {
	// Fan fan;
	// if (f < (float) a && Build.VERSION.SDK_INT < 17) {
	// f = a;
	// }
	// if (!(to.O() || to.P())) {
	// Intent intent = new Intent()
	// .setClass(this.d, (Class) BrightnessTileActivity.class)
	// .addFlags(268500992).putExtra("mode", n)
	// .putExtra("value", (int) f);
	// this.d.startActivity(intent);
	// return;
	// }
	// ContentResolver contentResolver = this.d.getContentResolver();
	// Settings.System.putInt((ContentResolver) contentResolver,
	// (String) "screen_brightness_mode", (int) n);
	// if (n == 0) {
	// Settings.System.putInt((ContentResolver) contentResolver,
	// (String) "screen_brightness", (int) ((int) f));
	// }
	// if ((fan = Fan.getInstance()) != null) {
	// WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)
	// fan
	// .getLayoutParams();
	// if (n == 1) {
	// f = -1.0f;
	// }
	// layoutParams.screenBrightness = f;
	// ((WindowManager) this.d.getSystemService("window"))
	// .updateViewLayout((View) fan,
	// (ViewGroup.LayoutParams) layoutParams);
	// }
	// this.o();
	// }
	private void a(int var1, float var2) {
		float var3 = var2;
		if (var2 < (float) a) {
			var3 = var2;
			if (VERSION.SDK_INT < 17) {
				var3 = (float) a;
			}
		}

		if (!to.O() && !to.P()) {
			Intent var7 = (new Intent())
					.setClass(this.d, BrightnessTileActivity.class)
					.addFlags(268500992).putExtra("mode", var1)
					.putExtra("value", (int) var3);
			this.d.startActivity(var7);
		} else {
			ContentResolver var4 = this.d.getContentResolver();
			Settings.System.putInt(var4, "screen_brightness_mode", var1);
			if (var1 == 0) {
				Settings.System.putInt(var4, "screen_brightness", (int) var3);
			}

			Fan var6 = Fan.getInstance();
			if (var6 != null) {
				LayoutParams var5 = (LayoutParams) var6.getLayoutParams();
				if (var1 == 1) {
					var3 = -1.0F;
				}

				var5.screenBrightness = var3;
				((WindowManager) this.d.getSystemService("window"))
						.updateViewLayout(var6, var5);
			}

			this.q();
		}
	}

	public static int b(int n) {
		return (int) ((float) (n * 100) / 255.0f);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private static int b(String string) {
		try {
			Object object = uo.a((Object) null,
					uo.b(Class.forName((String) "android.os.Power"), string));
			if (object != null) {
				return (Integer) object;
			}
		} catch (Throwable var1_3) {
			// empty catch block
		}
		try {
			Object object = uo.a((Object) null, uo.b(
					Class.forName((String) "android.os.PowerManager"), string));
			if (object == null)
				return 0;
			return (Integer) object;
		} catch (Throwable var2_6) {
			// empty catch block
		}
		return 0;
	}

	private float c(int n) {
		return 255.0f * (float) n / 100.0f;
	}

	public int a(Context context) {
		return 0;
	}

	public int a(boolean bl) {
		return 0;
	}

	public String a() {
		return "com.lazyswipe.action.BRIGHTNESS_CHANGED";
	}

	public void a(Context context, Intent intent) {
	}

	public void a(wg wg) {
		try {
			wg.getParent().requestDisallowInterceptTouchEvent(true);
			return;
		} catch (Throwable var2_2) {
			return;
		}
	}

	public void a(wg wg, int n, boolean bl) {
		if (bl) {
			this.a(0, this.c(n));
		}
	}

	public boolean a(int n) {
		if (this.e(this.d) != R.drawable.tile_brightness_min) {
			return true;
		}
		return false;
	}

	public String b() {
		return "Brightness";
	}

	public void b(wg wg) {
		try {
			wg.getParent().requestDisallowInterceptTouchEvent(false);
			return;
		} catch (Throwable var2_2) {
			return;
		}
	}

	public int c() {
		return R.string.title_tile_brightness;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public boolean d(Context context) {
	// int n;
	// int n2 = vk.n(context);
	// int n3 = vk.m(context);
	// if (to.o(context)) {
	// if (n3 == 1) {
	// int n4 = a;
	// Fan.a(true, (wh) this, qj.b(n4));
	// n = n4;
	// n3 = 0;
	// } else if (n2 <= a) {
	// int n5 = c;
	// Fan.a(true, (wh) this, qj.b(n5));
	// n = n5;
	// } else if (n2 <= c) {
	// int n6 = b;
	// Fan.a(true, (wh) this, qj.b(n6));
	// n = n6;
	// } else {
	// int n7 = a;
	// Fan.a(false, null, 0);
	// n = n7;
	// n3 = 1;
	// }
	// } else {
	// int n8 = n2 <= a ? c : (n2 <= c ? b : a);
	// Fan.a(true, (wh) this, qj.b(n8));
	// n = n8;
	// n3 = 0;
	// }
	// this.a(n3, n);
	// return false;
	// }
	public boolean d(Context var1) {
		int var2 = vk.n(var1);
		int var3 = vk.m(var1);
		if (to.o(var1)) {
			if (var3 == 1) {
				var2 = a;
				Fan.a(true, this, b(var2));
				var3 = 0;
			} else if (var2 <= a) {
				var2 = c;
				Fan.a(true, this, b(var2));
			} else if (var2 <= c) {
				var2 = b;
				Fan.a(true, this, b(var2));
			} else {
				var2 = a;
				Fan.a(false, (wh) null, 0);
				var3 = 1;
			}
		} else {
			if (var2 <= a) {
				var2 = c;
			} else if (var2 <= c) {
				var2 = b;
			} else {
				var2 = a;
			}

			Fan.a(true, this, b(var2));
			var3 = 0;
		}

		this.a(var3, (float) var2);
		return false;
	}

	// public int e(Context context) {
	// if (vk.m(context) == 1) {
	// return R.drawable.tile_brightness_auto;
	// }
	// int n = Settings.System.getInt(
	// (ContentResolver) context.getContentResolver(),
	// (String) "screen_brightness", (int) 0);
	// if (n <= a) {
	// return R.drawable.tile_brightness_min;
	// }
	//
	// return n > c ? R.drawable.tile_brightness_max
	// : R.drawable.tile_brightness_mid;
	//
	// }

	public int e(Context var1) {
		if (vk.m(var1) == 1) {
			return R.drawable.tile_brightness_auto;

		} else {
			int var2 = Settings.System.getInt(var1.getContentResolver(),
					"screen_brightness", 0);
			return var2 <= a ? R.drawable.tile_brightness_min
					: (var2 <= c ? R.drawable.tile_brightness_max
							: R.drawable.tile_brightness_mid);
		}
	}
}
