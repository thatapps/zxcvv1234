package com.main;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.lazyswipe.SwipeApplication;
import java.util.Calendar;

public class pb {

	static final String a = (new StringBuilder()).append("Swipe.")
			.append(pb.class.getSimpleName()).toString();
	public static boolean b = false;
	private static pb c;
	private static boolean d = false;
	private Context e;
	private Handler f;

	private pb() {
		f = new Handler() {

			final pb a;

			public void handleMessage(Message message) {
				switch (message.what) {
				default:
					return;

				case 6: // '\006'
					a.c();
					break;
				}
			}

			{
				a = pb.this;
				// super();
			}
		};
		e = SwipeApplication.e();
		b = false;
	}

	static Handler a(pb pb1) {
		return pb1.f;
	}

	public static pb a() {
		if (c == null) {
			c = new pb();
		}
		return c;
	}

	static boolean a(boolean flag) {
		d = flag;
		return flag;
	}

	static Context b(pb pb1) {
		return pb1.e;
	}

	private boolean e() {
		if (uj.e(e)) {
			long l = System.currentTimeMillis();
			long l1 = pe.b(e);
			boolean flag;
			if (l - l1 < 0L || l - l1 > 0x5265c00L) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				long l2 = ir.b();
				if (l2 <= 0L || Math.abs(l2 - l) >= 0x2932e00L) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean f() {
		long l;
		l = ir.a(e, "key_last_fan_open", 0L);

		if (l > 0L && System.currentTimeMillis() - l >= 0x5265c00L) {
			int i = Calendar.getInstance().get(11);
			if (i >= 8 && i < 23
					&& !ir.a(e, "UPGRADE_NOTI_DATE", "").equals(vk.m())) {
				return true;
			}
		}
		return false;
	}

	public void b() {
		while (!e() || d) {
			return;
		}
		d = true;
		ui.a(ji.a, new jj(e) {

			final pb b;

			protected void a() {
				Exception exception1;
				pd pd1;
				try {
					pb.a(b).removeMessages(6);
					pd1 = pe.a(pb.b(b), "auto");
				} catch (Exception exception) {
					pe.a(pb.b(b), System.currentTimeMillis());
					pb.a(false);
					return;
				} finally {
					pe.a(pb.b(b), System.currentTimeMillis());
				}
				if (pd1 != null) {
					if (pd1.o()) {
						pd1.r();
						pb.a(b).sendEmptyMessage(6);
						pe.a(pb.b(b), System.currentTimeMillis());
						pb.a(false);
					}
				}

				return;

			}

			{
				b = pb.this;
				// super(context);
			}
		});
	}

	public void c() {
		Object obj;
		if (f()) {
			if ((obj = pd.s()) != null && ((pd) (obj)).o()) {
				obj = ((pd) (obj)).m();
				PendingIntent pendingintent = PendingIntent.getBroadcast(e
						.getApplicationContext(), 1, new Intent(
						"com.lazyswipe.action.OPEN_FROM_WIDGET"), 0);
				obj = (new android.app.Notification.Builder(e))
						.setSmallIcon(0x7f030000)
						.setContentTitle(((CharSequence) (obj)))
						.setTicker(((CharSequence) (obj)))
						.setContentIntent(pendingintent).setAutoCancel(true)
						.getNotification();
				((NotificationManager) e.getSystemService("notification"))
						.notify(1002, ((android.app.Notification) (obj)));
				ir.b(e, "UPGRADE_NOTI_DATE", vk.m());
				b = true;
				return;
			}
		}
	}

	public void d() {
		try {
			((NotificationManager) e.getSystemService("notification"))
					.cancel(1002);
			b = false;
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

}
