package com.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Handler;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.zev.R;

public class mm {

	final Handler a;
	volatile boolean b;
	private final Context c;
	private final ArrayList d = new ArrayList(1);
	private mt e;

	public mm(Context context, Handler handler) {
		b = false;
		c = context;
		a = handler;
	}

	private void c() {
		if (b) {
			return;
		} else {
			b = true;
			(new Thread() {

				final mm a;

				public void run() {
					do {
						int i;
						for (i = 0; i >= 60 || a.a() || !Fan.j();) {
							if (a.a != null) {
								a.a.sendEmptyMessage(0);
							}
							a.b = false;
							return;
						}

						a.b();
						try {
							Thread.sleep(500L);
						} catch (InterruptedException interruptedexception) {
						}
						i++;
					} while (true);
				}

				{
					a = mm.this;
					// super();
				}
			}).start();
			return;
		}
	}

	private mt d() {
		if (e == null) {
			e = new mn(c.getString(0x7f0f0031), new wu(c));
		}
		return e;
	}

	// public List a(nc nc1) {
	// List list = null;
	// if (!nc1.d() || a()) {
	//
	// list = nc1.b(c);
	// if (list == null) {
	// // break; /* Loop/switch isn't completed */
	// }
	// nc1 = (nc) list;
	// if (list.size() != 0) {
	// return (List) nc1;
	//
	// } else {
	// d.clear();
	// return d;
	//
	// }
	//
	// } else {
	// d.clear();
	// d.add(d());
	// c();
	// //nc1 = (nc) d;
	//
	// }
	// return list;
	//
	// }
	public List a(nc nc) {
		if (nc.d() && !this.a()) {
			this.d.clear();
			this.d.add((Object) this.d());
			this.c();
			return this.d;
		}
		List list = nc.b(this.c);
		if (list != null) {
			if (list.size() != 0)
				return list;
		} else {
			this.d.clear();
			return this.d;
		}
		return list;
	}

	// public List a(nc nc1) {
	// List list = null;
	// if (!nc1.d() || a()) {
	//
	// list = nc1.b(c);
	// if (list != null) {
	// nc1 = (nc) list;
	// }
	//
	// if (list.size() != 0) {
	// return (List) nc1;
	// } else {
	// d.clear();
	// return d;
	// }
	//
	// } else {
	// d.clear();
	// d.add(d());
	// c();
	// //nc1 = d;
	// }
	// return null;
	//
	// }

	boolean a() {
		return ((SwipeApplication) c.getApplicationContext()).b().b;
	}

	void b() {
		SwipeApplication swipeapplication = (SwipeApplication) c
				.getApplicationContext();
		if (!swipeapplication.b().c) {
			swipeapplication.b().e();
		}
	}
}
