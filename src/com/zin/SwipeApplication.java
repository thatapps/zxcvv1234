package com.lazyswipe;

import java.io.File;
import java.net.URLEncoder;
import java.util.Iterator;

import org.json.JSONObject;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;

import com.baidu.android.procmo.ProcessMonitor;
//import com.google.android.gms.internal.ex;
import com.lazyswipe.ui.MainActivity;
import com.main.fa;
import com.main.il;
import com.main.ir;
import com.main.ja;
import com.main.jc;
import com.main.ji;
import com.main.js;
import com.main.ox;
import com.main.tm;
import com.main.tq;
import com.main.tz;
import com.main.uh;
import com.main.ui;
import com.main.uj;
import com.main.vj;
import com.main.vk;
//zevienin

//Referenced classes of package com.lazyswipe:
//          SwipeServicePhantom, SwipeService

public class SwipeApplication extends Application implements
		android.app.Application.ActivityLifecycleCallbacks {

	public static final int a;
	public static final int b;
	public static boolean c;
	public static boolean d;
	public static JSONObject e;
	private static final Object f = new Object();
	public static SwipeApplication g;
	private js h;
	public static Context mContext;
	private boolean i;

	public SwipeApplication() {
	}

	public static Resources c() {
		return g.getResources();
	}

	public static Context getAppInstance() {
		return mContext;
	}

	public static SwipeApplication e() {

		return g;
	}

	public js a(boolean bl) {
		Object object;
		Object object2 = object = f;
		synchronized (object2) {
			if (this.h == null && bl) {
				this.h = new js((Context) this);
				this.h.a((Context) this);
			}
			return this.h;
		}
	}

	public boolean a() {
		return i;
	}

	public js b() {
		return a(true);
	}

	public void d() {
		Object obj;
		StringBuilder stringbuilder;
		// label0: {
		Object obj1 = getPackageManager();
		String s = "";
		android.content.Intent intent = vk.c("http://www.google.com/m");
		ResolveInfo resolveinfo = ((PackageManager) (obj1)).resolveActivity(
				intent, 0);
		obj = s;
		if (resolveinfo == null) {
			// break label0;
		}
		obj = s;
		if (resolveinfo.activityInfo == null) {
			// break label0;
		}
		obj = s;
		if (!resolveinfo.activityInfo.packageName.equals("android")) {
			// break label0;
		}
		obj = s;
		if (!resolveinfo.activityInfo.name
				.equals("com.android.internal.app.ResolverActivity")) {
			// break label0;
		}
		obj1 = ((PackageManager) (obj1)).queryIntentActivities(intent, 0x10000)
				.iterator();
		do {
			obj = s;
			if (!((Iterator) (obj1)).hasNext()) {
				// break label0;
			}
			obj = (ResolveInfo) ((Iterator) (obj1)).next();
		} while ((((ResolveInfo) (obj)).activityInfo.applicationInfo.flags & 1) == 0);
		obj = (new StringBuilder())
				.append(((ResolveInfo) (obj)).activityInfo.packageName)
				.append("/").append(((ResolveInfo) (obj)).activityInfo.name)
				.toString();
		// }
		stringbuilder = new StringBuilder(
				"http://www.lazyswipe.com/uninstall_en.html");
		StringBuilder stringbuilder1 = stringbuilder.append("?lang=")
				.append(URLEncoder.encode(vk.j())).append("&pid=")
				.append("400105").append("&cid=").append("32400")
				.append("&vn=").append("2.0").append("&vc=").append(2001)
				.append("&b=").append(URLEncoder.encode(Build.BRAND))
				.append("&m=").append(URLEncoder.encode(Build.MODEL))
				.append("&d=").append(URLEncoder.encode(Build.DISPLAY))
				.append("&r=").append(android.os.Build.VERSION.SDK_INT)
				.append("&network=");
		String s1;
		if (uj.c(this)) {
			s1 = "wifi";
		} else {
			s1 = "apn";
		}
		try {
			stringbuilder1.append(s1).append("&uid=")
					.append(URLEncoder.encode(ir.x(this)))
					.append("&promoteChannel=")
					.append(URLEncoder.encode(jc.f()));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		try {
			(new ProcessMonitor(this, uh.a("com.lazyswipe"),
					stringbuilder.toString(), ((String) (obj)), 0)).a(10000L);
		} catch (Throwable throwable) {
			vj.a("Swipe.Application", "Could not start process monitor",
					throwable);
		}
		(new tm(this, "com.lazyswipe",
				com.lazyswipe.SwipeServicePhantom.class.getName(), 3, false))
				.a();
		return;
	}

	public void onActivityCreated(Activity activity, Bundle bundle) {
		if (activity instanceof MainActivity) {
			i = true;
		}
	}

	public void onActivityDestroyed(Activity activity) {
		if (activity instanceof MainActivity) {
			i = false;
		}
	}

	public void onActivityPaused(Activity activity) {
	}

	public void onActivityResumed(Activity activity) {
		SwipeService.j();
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
	}

	public void onActivityStarted(Activity activity) {
	}

	public void onActivityStopped(Activity activity) {
	}

	public void onCreate() {
		super.onCreate();
		g = this;
		mContext = getApplicationContext();
		tz.a(this);
		try {
			File file = getExternalFilesDir("log");
			file.mkdirs();
			vj.a(file.getAbsolutePath(), false);
		} catch (Throwable throwable) {
		}
		new il(this, vj.a);
		ox.e();
		fa.c("krdjtD9yK9ayjGzXx9VR3h");
		fa.b("LazySwipe");
		fa.a(this);
		ir.a();
		if (uj.d(this)) {
			ji.a(this);
		}
		d();
		ui.a(new Runnable() {

			final SwipeApplication a;

			public void run() {
				File file1 = a.getExternalCacheDir();
				if (file1 != null) {
					file1 = new File(file1, "app_promotion.png");
					if (file1.exists()) {
						ir.b = true;
						tq.g(file1);
					}
				}
			}

			{
				a = SwipeApplication.this;
				// super();
			}
		});
		registerActivityLifecycleCallbacks(this);
	}

	public void onTerminate() {
		super.onTerminate();
		unregisterActivityLifecycleCallbacks(this);
		if (h != null) {
			h.b(this);
		}
	}

	public void onTrimMemory(int j) {
		super.onTrimMemory(j);
		if (1 == ir.d(this, 5)) {
			ja.a().a("onTrimMemory", "level", String.valueOf(j));
		}
	}

	static {
		int j;
		if (android.os.Build.VERSION.SDK_INT < 17) {
			j = 3;
		} else {
			j = 0x800003;
		}
		a = j;
		if (android.os.Build.VERSION.SDK_INT < 17) {
			j = 5;
		} else {
			j = 0x800005;
		}
		b = j;
	}
}
