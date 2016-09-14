package com.lazyswipe.ui;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.lazyswipe.SwipeApplication;
import com.main.to;

// Referenced classes of package com.lazyswipe.ui:
//            StartupActivity

public class TutorialService extends IntentService {

	private static volatile boolean a;

	public TutorialService() {
		super("TutorialService");
	}

	public static PendingIntent a(Context context, int i) {
		return PendingIntent
				.getService(
						context,
						i,
						(new Intent(context,
								com.lazyswipe.ui.TutorialService.class))
								.setAction(
										"action.HANDLE_NOTIFICATION_APPS_CHOOSER_RESULT")
								.putExtra("extra.APPS_CHOOSER_RESULT_CODE", i),
						0x40000000);
	}

	private void a(int i) {
		if (!SwipeApplication.c) {
			return;
		} else {
			StartupActivity.a(this);
			return;
		}
	}

	public static void a(Context context) {
		a = true;
		context.startService((new Intent(context,
				com.lazyswipe.ui.TutorialService.class))
				.setAction("action.CHECK_FLOAT_WINDOW_PERMISSION"));
	}

	private void a(String var1) {
		int var2 = 0;

		while (!a && var2 < 150) {
			byte var3 = -1;
			switch (var1.hashCode()) {
			case -281794004:
				if (var1.equals("action.CHECK_FLOAT_WINDOW_PERMISSION")) {
					var3 = 0;
				}

				switch (var3) {
				case 0:
					if (to.a((Context) this)) {
						StartupActivity.a(this);
						return;
					}

					try {
						Thread.sleep(1200L);
					} catch (InterruptedException var5) {
						Thread.currentThread().interrupt();
					}

					++var2;
					break;
				default:
					throw new IllegalArgumentException("Unknown action: "
							+ var1);
				}
			}
		}

	}

	public static void b(Context context, int i) {
		a = true;
		context.startService((new Intent(context,
				com.lazyswipe.ui.TutorialService.class)).setAction(
				"action.HANDLE_NOTIFICATION_APPS_CHOOSER_RESULT").putExtra(
				"extra.APPS_CHOOSER_RESULT_CODE", i));
	}

	protected void onHandleIntent(Intent intent) {
		byte byte0;
		byte0 = 0;
		a = false;
		if (intent != null) {
			String s = intent.getAction();
			s.hashCode();

			switch (s.hashCode()) {
			default:
				byte0 = -1;
				break;
			case -281794004:
				if (s.equals("action.CHECK_FLOAT_WINDOW_PERMISSION")) {

					byte0 = 1;

				}
				break;
			case 1531260761:
				if (!s.equals("action.HANDLE_NOTIFICATION_APPS_CHOOSER_RESULT")) {
					byte0 = -1;
				} else {

					byte0 = 1;
				}
				break;
			}

			switch (byte0) {
			default:
				return;
			case 0:
				a(s);
				return;
			case 1:
				a(intent.getIntExtra("extra.APPS_CHOOSER_RESULT_CODE", -1));
				return;
			}
		}

	}

}
