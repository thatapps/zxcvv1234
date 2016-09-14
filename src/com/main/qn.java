package com.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.tile.FlashlightActivity;
import com.lazyswipe.zev.R;

public class qn extends rc implements Handler.Callback {
	private static rn a;
	private static Boolean b;
	private static FrameLayout c;
	private static long i;
	private static PowerManager.WakeLock j;
	private static Thread k;
	private Handler l;
	private static FlashMode flashMode;
	static Camera mcamera = Camera.open();
	static SharedPreferences preferences;
	static {
		b = null;
	}

	public static final class FlashMode {

		private static final FlashMode $VALUES[];

		public static final FlashMode FlashModeOff;

		public static final FlashMode FlashModeTorch;

		public static FlashMode[] values() {
			return (FlashMode[]) $VALUES.clone();
		}

		static {

			FlashModeTorch = new FlashMode("FlashModeTorch", 1);

			FlashModeOff = new FlashMode("FlashModeOff", 0);

			FlashMode aflashmode[] = new FlashMode[2];

			aflashmode[1] = FlashModeTorch;

			aflashmode[0] = FlashModeOff;

			$VALUES = aflashmode;
		}

		private FlashMode(String s, int i) {
			super();
		}
	}

	public qn(Context context) {
		this(context, null);

		this.flashMode = FlashMode.FlashModeOff;
		preferences = PreferenceManager.getDefaultSharedPreferences(context);
	}

	public qn(Context context, rd rd) {
		super(context, rd);
		this.l = new Handler((Handler.Callback) this);
	}

	private static void a(Context paramContext, int paramInt, qn paramqn) {
		if ((k == null) || (!k.isAlive())) {
			b(paramContext, paramInt, paramqn);
		}
	}

	// public static void a(Context context, qn qn) {
	// if (!(a != null || b != null && b.booleanValue())) {
	// qn.a(context, 1, qn);
	// return;
	// }
	// try {
	// if (a == null) {
	// qn.a(context, false, true);
	// return;
	// }
	// qn.n(context);
	// return;
	// } catch (Exception var2_2) {
	// vj.b("Swipe.Tile", "toggleState ledlight error ",
	// (Throwable) var2_2);
	// qn.b(context, qn);
	// if (a != null) {
	// a.c();
	// }
	// a = null;
	// return;
	// }
	// }
	public static void a(Context var0, qn var1) {
		if (a == null && (b == null || !b.booleanValue())) {
			boolean isTorch = var0.getPackageManager().hasSystemFeature(
					PackageManager.FEATURE_CAMERA_FLASH);

			if (isTorch) {

				if (FlashMode.FlashModeOff == flashMode) {
					flashMode = FlashMode.FlashModeTorch;
				} else if (FlashMode.FlashModeTorch == flashMode) {
					flashMode = FlashMode.FlashModeOff;
				}

				setupFlashMode();

			}

			else {
				a(var0, 1, var1);
			}
		} else {
			try {
				if (a == null) {
					a(var0, false, true);
				} else {
					n(var0);
				}
			} catch (Exception var3) {
				vj.b("Swipe.Tile", "toggleState ledlight error ", var3);
				b(var0, var1);
				if (a != null) {
					a.c();
				}

				a = null;
			}
		}
	}

	private static void setupFlashMode() {
		if (mcamera != null) {
			Parameters var1 = mcamera.getParameters();
			List var2 = var1.getSupportedFlashModes();
			if (var2 != null) {
				// switchFlashMode.setVisibility(0);
				if (var2.contains("off") && FlashMode.FlashModeOff == flashMode) {
					var1.setFlashMode("off");

				} else if (var2.contains("torch")
						&& FlashMode.FlashModeTorch == flashMode) {
					var1.setFlashMode("torch");

				}

				mcamera.setParameters(var1);
				return;
			}

			// this.switchFlashMode.setVisibility(8);
		}

	}

	// private static void a(Context context, boolean bl, boolean bl2) {
	// long l = System.currentTimeMillis();
	// if (!(i <= 0 || l - i >= 5000 || bl)) {
	// if (bl2) {
	// vi.a(context, R.string.msg_open_flashlight_too_frequently);
	// }
	// return;
	// }
	// i = l;
	// if (a == null) {
	// a = qn.o(context);
	// }
	// a.d();
	// if (a.b()) {
	// qn.q(context);
	// return;
	// }
	// throw new RuntimeException();
	// }
	private static void a(Context var0, boolean var1, boolean var2) {
		long var3 = System.currentTimeMillis();
		if (i > 0L && var3 - i < 5000L && !var1) {
			if (var2) {
				vi.a(var0, R.string.msg_open_flashlight_too_frequently);
			}

		} else {
			i = var3;
			if (a == null) {
				a = o(var0);
			}

			a.d();
			if (a.b()) {
				q(var0);
			} else {
				throw new RuntimeException();
			}
		}
	}

	// private static void b(final Context context, int n, final qn qn) {
	// HashMap hashMap = new HashMap();
	// hashMap.put((Object) "resolver", (Object) qn);
	// k = new Thread((Runnable) new Runnable() {
	// /* synthetic */Map b;
	// /* synthetic */qn c;
	// /* synthetic */int d;
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void run() {
	// boolean bl = false;
	// if (a == null) {
	// if ((to.m() || to.l() || to.n() || to.s() || to.e())
	// && Looper.myLooper() == null) {
	// Looper.prepare();
	// }
	// a = qn.o(context);
	// if (a != null) {
	// // b = true;
	// } else {
	// // b = false;
	// bl = false;
	// }
	// } else {
	// // b = true;
	// bl = true;
	// }
	// this.b.put((Object) "isTurningOn", (Object) bl);
	// Message.obtain((Handler) this.c.i(), (int) this.d,
	// (Object) this.b).sendToTarget();
	// if (Looper.myLooper() != null) {
	// Looper.myLooper().quit();
	// }
	// }
	// });
	// k.start();
	// }

	@SuppressWarnings("rawtypes")
	private static void b(final Context var0, final int var1, final qn var2) {
		final HashMap var3 = new HashMap();
		var3.put("resolver", var2);
		k = new Thread(new Runnable() {
			public void run() {
				boolean var1x = false;
				if (qn.a == null) {
					if ((to.m() || to.l() || to.n() || to.s() || to.e())
							&& Looper.myLooper() == null) {
						Looper.prepare();
					}

					qn.a = qn.o(var0);
					if (qn.a != null) {
						qn.b = Boolean.valueOf(true);
					} else {
						qn.b = Boolean.valueOf(false);
					}
				} else {
					qn.b = Boolean.valueOf(true);
					var1x = true;
				}

				var3.put("isTurningOn", Boolean.valueOf(var1x));
				Message.obtain(var2.i(), var1, var3).sendToTarget();
				if (Looper.myLooper() != null) {
					Looper.myLooper().quit();
				}

			}
		});
		k.start();
	}

	private static void b(Context paramContext, qn paramqn) {
		Intent localIntent = new Intent(paramContext, FlashlightActivity.class);
		localIntent.setFlags(268435456);
		paramContext.startActivity(localIntent);
		if (paramqn != null) {
			paramqn.a(paramContext, 0);
		}
		Fan.k();
	}

	private static void l() {
		if ((j != null) && (j.isHeld())) {
			j.release();
			j = null;
		}
	}

	private static void n(Context paramContext) {
		if (a != null) {
			p(paramContext);
			a.c();
			a = null;
			l();
		}
	}

	private static rn o(Context paramContext) {

		rn localrn = null;
		if (a == null) {
			a = rn.a(paramContext.getApplicationContext());
		}
		b = Boolean.valueOf(false);
		WindowManager.LayoutParams localLayoutParams = null;
		if (a != null) {
			localLayoutParams = new WindowManager.LayoutParams();
			localLayoutParams.type = 2002;
			localLayoutParams.format = 1;
			localLayoutParams.flags = 40;
			localLayoutParams.width = 0;
			localLayoutParams.height = 0;
			localLayoutParams.gravity = (0x30 | SwipeApplication.a);
			if (c == null) {
				c = new FrameLayout(paramContext.getApplicationContext());
				c.setBackgroundColor(0);
				if (c.getParent() == null) {
				}
			}
		}

		try {
			((WindowManager) paramContext.getSystemService("window")).addView(
					c, localLayoutParams);
			a.a(c);
			b = Boolean.valueOf(true);
			localrn = a;
		} catch (Throwable localThrowable) {
			vj.a("Swipe.Tile", "Failed to setup flashlight surface view",
					localThrowable);
			localrn = null;

		}
		return localrn;

	}

	private static void p(Context paramContext) {
		if ((c != null) && (c.getParent() != null)) {
			((WindowManager) paramContext.getSystemService("window"))
					.removeView(c);
			c = null;
		}
	}

	private static void q(Context paramContext) {
		if (j == null) {
			j = ((PowerManager) paramContext.getSystemService("power"))
					.newWakeLock(6, qn.class.getCanonicalName());
			j.acquire();
		}
	}

	public int a(Context context) {
		return a == null ? 0 : 1;
	}

	public int a(boolean flag) {
		return 0x7f02008f;
	}

	public String b() {
		return "Flashlight";
	}

	public int c() {
		return R.string.title_tile_flashlight;
	}

	public boolean c(Context paramContext) {
		vi.a(paramContext, R.string.msg_no_setting_available);
		return false;
	}

	public boolean d() {
		return false;
	}

	public boolean d(Context paramContext) {
		a(this.d, this);
		return false;
	}

	public boolean handleMessage(Message var1_1) {
		Map var2_2 = (Map) var1_1.obj;
		SwipeApplication var3_3 = SwipeApplication.e();
		switch (var1_1.what) {
		default:
			return super.handleMessage(var1_1);

		case 1:

			qn var4_4 = (qn) var2_2.get((Object) "resolver");
			boolean var5_5 = (Boolean) var2_2.get((Object) "isTurningOn");
			if (qn.b == null || !qn.b.booleanValue()) {
				qn.b((Context) var3_3, var4_4);
				return super.handleMessage(var1_1);

			}

			if (var5_5) {
				qn.n((Context) var3_3);
			}

			try {
				qn.a((Context) var3_3, false, true);
				if (var4_4 == null)
					return super.handleMessage(var1_1);
				var4_4.o();
				return super.handleMessage(var1_1);
			} catch (Exception var6_6) {
				vj.b("Swipe.Tile", "toggleState ledlight error ",
						(Throwable) var6_6);
				qn.b((Context) var3_3, var4_4);
				if (qn.a != null) {
					qn.a.c();
				}
				qn.a = null;
				return super.handleMessage(var1_1);

			}
		}
	}

	Handler i() {
		return this.l;
	}
}
