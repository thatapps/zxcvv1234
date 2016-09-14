package com.main;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.util.Log;

public class rv {

	public static int a = 10000;
	public static final List b = new ArrayList();
	public static final Object c = new Object();
	public static Thread d = null;
	private static rv f = null;
	public boolean e;

	private rv() {
		e = true;
	}

	public static rv a() {
		synchronized (c) {
			if (f == null) {
				f = new rv();
			}
		}
		return f;

	}

	private void d() {
		synchronized (c) {
			if (d == null) {
				d = new Thread() {

					final rv a;

					public void run() {
						try {
							Thread.sleep(rv.a);
							a.b();
							a.c();
							return;
						} catch (InterruptedException interruptedexception) {
							Log.d("ActivityDataManager", "timer interrupted");
						}
					}

					{
						a = rv.this;
						// super();
					}
				};
				d.start();
			}
		}
		return;

	}

	private void e() {
		synchronized (c) {
			if (d != null) {
				d.interrupt();
				d = null;
			}
		}
		return;
	}

	protected void a(Activity activity) {
		if (activity == null) {
			throw new NullPointerException();
		}
		synchronized (c) {
			b.add(activity);
			e();
		}
		return;

	}

	protected void b() {
		synchronized (c) {
			f = null;
		}
		return;

	}

	protected void b(Activity activity) {
		synchronized (c) {
			b.remove(activity);
			if (b.size() == 0 && e) {
				d();
			}
		}
		return;

	}

	public void c() {
		System.exit(0);
	}
}