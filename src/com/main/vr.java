package com.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.RemoteViews;

import com.lazyswipe.zev.R;



public class vr {
	private static int c = 0;
	private static int d = 100;
	private static List e = new ArrayList();
	private static Object f = new Object();
	private Context a;
	private String b;
	private vw g = null;
	private Notification h;
	private int i;
	private boolean j = false;
	private vs k;
	private vu l;
	private Handler m;

	// public vr(Context context, String string, File file, String string2,
	// String string3, vv vv, vs vs) {
	// this.l = new vu(this);
	// this.m = new Handler() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void handleMessage(Message message) {
	// switch (message.what) {
	// case 1: {
	// if (!vr.this.j) {
	// vr.e((vr) vr.this).contentView.setProgressBar(
	// R.id.file_downloading_progress, 100, vr.this.g.a(), false);
	// uk.a(vr.this.a, vr.this.i, vr.this.h);
	// vi.a(vr.this.a, R.string.download_download_start);
	// }
	// if (vr.this.m.hasMessages(2)) {
	// vr.this.m.removeMessages(2);
	// }
	// vr.this.m.sendEmptyMessageDelayed(2, 1000);
	// return;
	// }
	// case 2: {
	// vr.this.m.post((Runnable) vr.this.l);
	// if (vr.this.k == null || !(vr.this.k instanceof vt)
	// || vr.this.b())
	// return;
	// {
	// ((vt) vr.this.k).b(vr.this.g.a());
	// return;
	// }
	// }
	// case 3: {
	// vr.this.c();
	// vr.this.b(vr.this);
	// if (!vr.this.j) {
	// vi.a(vr.this.a, R.string.download_download_finish);
	// }
	// if (vr.this.k == null)
	// return;
	// {
	// vr.this.k.b();
	// return;
	// }
	// }
	// case 4: {
	// vr.this.c();
	// vr.this.b(vr.this);
	// int n = message.getData().getInt("errorNo");
	// if (vr.this.k == null)
	// return;
	// {
	// vr.this.k.a(n);
	// return;
	// }
	// }
	// default: {
	// return;
	// }
	// case 5: {
	// vr.this.c();
	// return;
	// }
	// case 6:
	// }
	// vr.this.b(vr.this);
	// vr.this.c();
	// if (vr.this.k == null || !(vr.this.k instanceof vt))
	// return;
	// {
	// ((vt) vr.this.k).c();
	// return;
	// }
	// }
	// };
	// this.a = context;
	// this.k = vs;
	// this.b = string;
	// this.g = new vw(context, file, string2, string3, this.m, vv);
	// this.i = (int) (2.147483647E9 * Math.random());
	// this.h = new Notification(17301633, (CharSequence) string,
	// System.currentTimeMillis());
	// this.h.contentView = new RemoteViews(context.getPackageName(),
	// R.layout.file_downloading);
	// this.h.contentView.setCharSequence(R.id.file_downloading_message,
	// "setText",
	// (CharSequence) string);
	// this.h.flags = 2 | this.h.flags;
	// }
	public vr(Context context, String s, File file, String s1, String s2,
			vv vv, vs vs1) {
		g = null;
		j = false;
		l = new vu(this);
		m = new Handler() {

			final vr a;

			public void handleMessage(Message message) {
				// message.what;
				// JVM INSTR tableswitch 1 6: default 44
				// 1 45
				// 2 160
				// 3 237
				// 4 300
				// 5 352
				// 6 360;
				// goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
				switch (message.what) {
				default:
					return;
				case 1:

					if (!vr.c(a)) {
						vr.e(a).contentView.setProgressBar(0x7f0c0060, 100, vr
								.d(a).a(), false);
						uk.a(vr.f(a), vr.g(a), vr.e(a));
						vi.a(vr.f(a), 0x7f0f001d);
					}
					if (vr.h(a).hasMessages(2)) {
						vr.h(a).removeMessages(2);
					}
					vr.h(a).sendEmptyMessageDelayed(2, 1000L);
					return;
				case 2:

					vr.h(a).post(vr.i(a));
					if (vr.j(a) != null && (vr.j(a) instanceof vt) && !a.b()) {
						((vt) vr.j(a)).b(vr.d(a).a());
						return;
					}
					return;
				case 3:
					vr.k(a);
					a.b(a);
					if (!vr.c(a)) {
						vi.a(vr.f(a), 0x7f0f001c);
					}
					if (vr.j(a) != null) {
						vr.j(a).b();
						return;
					}
					return;
				case 4:
					vr.k(a);
					a.b(a);
					int i1 = message.getData().getInt("errorNo");
					if (vr.j(a) != null) {
						vr.j(a).a(i1);
						return;
					}
					return;
				case 5:
					vr.k(a);
					return;
				case 6:
					a.b(a);
					vr.k(a);
					if (vr.j(a) != null && (vr.j(a) instanceof vt)) {
						((vt) vr.j(a)).c();
						return;
					}
					return;

				}

			}

			{
				a = vr.this;
				// super();
			}
		};
		a = context;
		k = vs1;
		b = s;
		g = new vw(context, file, s1, s2, m, vv);
		i = (int) (Math.random() * 2147483647D);
		h = new Notification(0x1080081, s, System.currentTimeMillis());
		h.contentView = new RemoteViews(context.getPackageName(), 0x7f04001c);
		h.contentView.setCharSequence(0x7f0c005f, "setText", s);
		h.flags = h.flags | 2;
	}

	private void c() {
		m.removeCallbacks(l);
		m.removeMessages(2);
		if (!j) {
			uk.a(a, i);
		}
	}

	static boolean c(vr vr1) {
		return vr1.j;
	}

	static vw d(vr vr1) {
		return vr1.g;
	}

	static Notification e(vr vr1) {
		return vr1.h;
	}

	static Context f(vr vr1) {
		return vr1.a;
	}

	static int g(vr vr1) {
		return vr1.i;
	}

	static Handler h(vr vr1) {
		return vr1.m;
	}

	static vu i(vr vr1) {
		return vr1.l;
	}

	static vs j(vr vr1) {
		return vr1.k;
	}

	static void k(vr vr1) {
		vr1.c();
	}

	public void a() {
		g.start();
		a(this);
		if (k != null) {
			k.a();
		}
	}

	public void a(Intent intent) {
		if (j) {
			return;
		}
		c++;
		if (c >= d) {
			c = 0;
		}
		h.contentIntent = PendingIntent.getActivity(a, c, intent, 0x8000000);
	}

	protected void a(vr vr1) {
		synchronized (f) {
			e.add(vr1);
		}
		return;

	}

	protected void b(vr vr1) {
		synchronized (f) {
			e.remove(vr1);
			if (e.size() != 0)
				;
		}
		return;

	}

	public boolean b() {
		return g.b();
	}

}
