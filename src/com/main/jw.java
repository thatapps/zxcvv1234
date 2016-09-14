package com.main;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;

import com.lazyswipe.fan.Fan;

public class jw extends BroadcastReceiver implements Runnable {
	private static final String a = "Swipe." + jw.class.getSimpleName();
	private static ExecutorService b;
	private static jw c;
	private static int d;
	private static boolean e;
	private static boolean f = true;
	private static String l;
	private static boolean q = false;
	private ActivityManager g;
	private Context h;
	private IntentFilter i;
	private jx j;
	private ComponentName k;
	private Future m;
	private volatile boolean n;
	private ComponentName o;
	private int p = 0;

	private jw(Context paramContext, jx paramjx) {
		if (paramjx == null) {
			throw new IllegalArgumentException("Null callback");
		}
		this.j = paramjx;
		this.h = paramContext;
		this.g = ((ActivityManager) paramContext.getSystemService("activity"));
		e = ir.N(paramContext);
		vj.a(a, "Running in turbo mode? " + e);
		d = i();
		this.i = new IntentFilter();
		this.i.addAction("android.intent.action.SCREEN_ON");
		this.i.addAction("android.intent.action.SCREEN_OFF");
	}

	public static String a(String paramString) {
		if (l == null) {
		}

		paramString = l;
		return paramString;
	}

	public static void a() {
		if (b == null) {
		}

		vj.a(a, "cleanup");
		c.k();
		b.shutdown();
		try {
			if (!b.awaitTermination(60L, TimeUnit.SECONDS)) {
				b.shutdownNow();
				if (!b.awaitTermination(60L, TimeUnit.SECONDS)) {
					vj.b(a, "Thread pool did not terminate");
				}
			}
			b = null;
			c = null;
		} catch (InterruptedException localInterruptedException) {

			b.shutdownNow();
			Thread.currentThread().interrupt();

		}
		return;
	}

	public static void a(Context context, jx jx) {
		if (b != null) {
			return;
		}
		vj.a(a, "init");
		b = Executors
				.newSingleThreadExecutor((ThreadFactory) new ThreadFactory() {

					public Thread newThread(Runnable runnable) {
						return new Thread(runnable, a);
					}
				});
		c = new jw(context, jx);
		c.j();
	}

	public static void a(boolean paramBoolean) {
		q = paramBoolean;
	}

	public static jw b() {
		return c;
	}

	public static void b(boolean paramBoolean) {
		if (e != paramBoolean) {
			e = paramBoolean;
			d = i();
		}
	}

	 private boolean b(ComponentName componentname)
	    {
	        if (!vk.a(componentname, k))
	        {
	            a(componentname);
	            j.a(componentname);
	            return true;
	        } else
	        {
	            return false;
	        }
	    }

	public static boolean c() {
		return e;
	}

	public static void d() {
		d = i();
	}

	public static String f() {
		return a((String) null);
	}

	 private static int i()
	    {
	        return !e && oe.e() ? 5000 : 2000;
	    }


	private void j() {
		l();
		n();
		f = false;
	}

	private void k() {
		o();
		m();
		f = true;
	}

	private void l() {
		if (this.m == null) {
			this.n = false;
			this.m = b.submit(this);
		}
	}

	private void m() {
		if (this.m != null) {
			this.n = true;
			this.m.cancel(true);
			this.m = null;
		}
	}

	private void n() {
		this.h.registerReceiver(this, this.i);
	}

	private void o() {
		this.h.unregisterReceiver(this);
	}

	private void p() {
		if (Build.VERSION.SDK_INT >= 21) {
			this.b(vk.c(this.h));
			return;
		}
		List list = this.g.getRecentTasks(1, 2);
		ActivityManager.RecentTaskInfo recentTaskInfo = list == null
				|| list.size() <= 0 ? null
				: (ActivityManager.RecentTaskInfo) list.get(0);
		if (recentTaskInfo != null) {
			list.clear();
			if (!this.b(vk.a(this.h, recentTaskInfo)))
				return;
			{
				// empty if block
			}
		} else {
			List list2 = this.g.getRunningTasks(1);
			if (list2 == null)
				return;
			if (list2.size() <= 0) {
				return;
			}
			ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) list2
					.get(0);
			if (runningTaskInfo == null)
				return;
			{
				list2.clear();
				ComponentName componentName = vk.b(this.h,
						runningTaskInfo.baseActivity);
				if (componentName == null
						|| this.k != null
						&& componentName.getPackageName().equals(
								(Object) this.k.getPackageName()))
					return;
				{
					this.b(componentName);
					return;
				}
			}
		}
	}

	private void q() {
		ComponentName componentName;
		if (Build.VERSION.SDK_INT < 21) {
			List list = this.g.getRunningTasks(1);
			if (list == null) {
				return;
			}
			ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) list
					.get(0);
			if (runningTaskInfo == null) {
				return;
			}
			componentName = runningTaskInfo.topActivity;
		} else {
			componentName = vk.c(this.h);
		}
		if (!(componentName == null || vk.a((Object) this.o,
				(Object) componentName))) {
			this.p = 0;
			this.o = componentName;
			this.j.b(componentName);
		}
	}

	public void a(ComponentName paramComponentName) {
		this.k = paramComponentName;
		if (paramComponentName == null) {
		}
		for (String str = null;; str = paramComponentName.getPackageName()) {
			l = str;
			return;
		}
	}

	public ComponentName c(boolean paramBoolean) {
		if (paramBoolean) {
			p();
		}
		return this.k;
	}

	public void e() {
		a((String) null);
	}

	public void g() {
		ComponentName componentName;
		if (Build.VERSION.SDK_INT < 21) {
			List list = this.g.getRunningTasks(1);
			ActivityManager.RunningTaskInfo runningTaskInfo = list == null ? null
					: (ActivityManager.RunningTaskInfo) list.get(0);
			componentName = runningTaskInfo != null ? runningTaskInfo.topActivity
					: null;
		} else {
			componentName = vk.c(this.h);
		}
		if (componentName != null) {
			this.o = componentName;
			if (componentName.getPackageName().equals((Object) "com.whatsapp")
					&& componentName.getClassName().equals(
							(Object) "com.whatsapp.ContactPicker")) {
				componentName = new ComponentName("FORCE", "FORCE_DISMISS");
			}
			this.j.b(componentName);
		}
		if (!q) {
			this.p = 3;
			return;
		}
		this.p = 0;
	}

	public void onReceive(Context context, Intent intent) {
		String string = intent.getAction();
		if ("android.intent.action.SCREEN_ON".equals((Object) string)) {
			this.l();
			return;
		} else {
			if (!"android.intent.action.SCREEN_OFF".equals((Object) string))
				return;
			{
				this.m();
				Fan.k();
				return;
			}
		}
	}

	public void run() {
		vj.a(a, "Thread starts to run");
		Process.setThreadPriority(10);
		if (!this.n) {
			long l1 = 0;
			if (!q) {
				int i1 = this.p;
				this.p = (i1 - 1);
				if (i1 <= 0) {
				}
			} else {
				q();
				l1 = 1000L;
			}

			try {
				Thread.sleep(l1);
			} catch (InterruptedException localInterruptedException) {
				vj.a(a, "Thread interrupted");
			}

			l1 = d;
			p();

		}
		vj.a(a, "Thread ended");
	}
}
