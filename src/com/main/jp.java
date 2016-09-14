package com.main;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.lazyswipe.ui.MainActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class jp {

	private final HashSet a = new HashSet();
	private final HashSet b = new HashSet();
	private final HashSet c = new HashSet();
	private final HashSet d = new HashSet();
	private final Context e;

	public jp(Context context) {
		e = context.getApplicationContext();
		a(context);
		b(context);
		c(context);
	}

	private void a(Context context) {
		a(context, null);
	}

	private void a(Context context, String s) {
		PackageManager packageManager = context.getPackageManager();
		Iterator iterator = null;
		List list = packageManager.queryIntentActivities(vk.b(s), 0x10000);
		if (list != null) {
			for (iterator = list.iterator(); iterator.hasNext();) {
				Object obj = (ResolveInfo) iterator.next();
				if (((ResolveInfo) (obj)).activityInfo != null) {
					c.add(vk.a(((ResolveInfo) (obj))));
					obj = packageManager
							.queryIntentActivities(
									vk.a(((ResolveInfo) (obj)).activityInfo.packageName),
									0).iterator();
					while (((Iterator) (obj)).hasNext()) {
						ResolveInfo resolveinfo = (ResolveInfo) ((Iterator) (obj))
								.next();
						if (resolveinfo != null) {
							c.add(vk.a(resolveinfo));
						}
					}
				}
			}

			list.clear();
			iterator = c.iterator();
			while (iterator.hasNext()) {
				ComponentName name = (ComponentName) iterator.next();
				d.add(name.getPackageName());
			}

		} else {
			return;
		}

	}

	private void b(Context context) {
	}

	private void c(Context context) {
		b.add(new ComponentName(context, com.lazyswipe.ui.MainActivity.class));
	}

	public List a() {
		return new ArrayList(d);
	}

	public void a(String s) {
		vk.a(c, s);
		vk.a(a, s);
		vk.a(b, s);
		d.remove(s);
	}

	public boolean a(ComponentName componentname) {
		String s;
		if (componentname != null) {
			if (!"com.lazyswipe".equals(s = componentname.getPackageName())) {
				if (s.equals("com.qiigame.flocker.global")) {
					return true;
				}
				if (!componentname
						.equals(ComponentName
								.unflattenFromString("com.sec.android.app.camera/.Camera"))
						&& !componentname
								.equals(ComponentName
										.unflattenFromString("com.android.camera/.CameraEntry"))
						&& !s.equals("com.google.android.GoogleCamera")
						&& !s.equals("com.lazyswipe.lock")) {
					if (a.contains(componentname)) {
						return true;
					}
					if (!b.contains(componentname)
							&& !c.contains(componentname)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public void b(String s) {
		vk.a(c, s);
		a(e, s);
	}

	public boolean b(ComponentName componentname) {
		return c.contains(componentname)
				|| android.os.Build.VERSION.SDK_INT >= 21
				&& d.contains(componentname.getPackageName());
	}
}
