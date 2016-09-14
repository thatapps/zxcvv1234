package com.main;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public class jq {

	public long a;
	public CharSequence b;
	public WeakReference c;
	public long d;
	public long e;
	public int f;
	public boolean g;
	public ComponentName h;
	public String i;
	public int j;

	public jq() {
		a = -1L;
		d = -1L;
		e = -1L;
		f = 0;
	}

	public jq(PackageManager packagemanager, ResolveInfo resolveinfo) {
		this(packagemanager, resolveinfo, true);
	}

	public jq(PackageManager packagemanager, ResolveInfo resolveinfo,
			boolean flag) {
		a = -1L;
		d = -1L;
		e = -1L;
		f = 0;
		h = vk.a(resolveinfo);
		i = vk.b(resolveinfo);
		a(packagemanager, resolveinfo, flag);
	}

	public jq(Cursor cursor, kj kj1) {
		a = -1L;
		d = -1L;
		e = -1L;
		f = 0;
		a(cursor, kj1);
	}

	private void a(ActivityInfo activityinfo, PackageManager packagemanager) {
		if (!oy.a()) {
			c = new WeakReference(activityinfo.loadIcon(packagemanager));
			return;
		}
		try {
			c = new WeakReference(oy.a(activityinfo.loadIcon(packagemanager)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b("Swipe.AppInfo",
					(new StringBuilder()).append("Failed to load icon: ")
							.append(exception.getMessage()).toString());
		}
		return;
	}

	public static void a(Iterable iterable, String s) {
		Iterator iterator = iterable.iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			if (((jq) iterator.next()).h.getPackageName().equals(s)) {
				iterator.remove();
			}
		} while (true);
	}

	public Drawable a(PackageManager packagemanager) {
		ComponentName componentname;
		if (i != null) {
			componentname = new ComponentName(h.getPackageName(), i);
		} else {
			componentname = h;
		}
		try {
			a(packagemanager.getActivityInfo(componentname, 0), packagemanager);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Drawable) c.get();
	}

	public void a(ContentValues contentvalues) {
		contentvalues.put("intent", h.flattenToString());
		contentvalues.put("last_called_time", Long.valueOf(e));
		contentvalues.put("called_num", Integer.valueOf(f));
		contentvalues.put("alias", i);
		contentvalues.put("package", h.getPackageName());
		contentvalues.put("on_sdcard", Integer.valueOf(j));
		contentvalues.put("label", b.toString());
		int k;
		if (g) {
			k = 1;
		} else {
			k = 0;
		}
		contentvalues.put("is_system", Integer.valueOf(k));
		contentvalues.put("updated", Long.valueOf(d));
	}

	public void a(Context context, boolean flag) {
		a(context.getPackageManager(), flag);
	}

	public void a(PackageManager packagemanager, ActivityInfo activityinfo) {
		b = activityinfo.loadLabel(packagemanager);
		if (!(b instanceof String)) {
			vj.b("Swipe.AppInfo",
					(new StringBuilder()).append("Non-String label: ")
							.append(b).append(", ")
							.append(b.getClass().getSimpleName()).toString());
			b = b.toString();
		}
	}

	public void a(PackageManager packagemanager, ActivityInfo activityinfo,
			boolean flag) {
		int k = 1;
		a(packagemanager, activityinfo);
		if (flag) {
			a(activityinfo, packagemanager);
		}
		ApplicationInfo info = activityinfo.applicationInfo;
		d = (new File(((ApplicationInfo) (info)).sourceDir)).lastModified();
		if ((((ApplicationInfo) (info)).flags & 1) != 0) {
			flag = true;
		} else {
			flag = false;
		}
		g = flag;
		if ((((ApplicationInfo) (info)).flags & 0x40000) == 0) {
			k = 0;
		}
		j = k;
	}

	public void a(PackageManager packagemanager, ResolveInfo resolveinfo) {
		a(packagemanager, resolveinfo, true);
	}

	public void a(PackageManager packagemanager, ResolveInfo resolveinfo,
			boolean flag) {
		a(packagemanager, resolveinfo.activityInfo, flag);
	}

	public void a(PackageManager packagemanager, boolean flag) {
		try {
			a(packagemanager, packagemanager.getActivityInfo(h, 0), flag);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	public void a(Cursor cursor, kj kj1) {
		boolean flag = true;
		a = cursor.getInt(kj1.a);
		h = ComponentName.unflattenFromString(cursor.getString(kj1.b));
		e = cursor.getLong(kj1.c);
		f = cursor.getInt(kj1.d);
		j = cursor.getInt(kj1.f);
		b = cursor.getString(kj1.i);
		if (cursor.getInt(kj1.j) != 1) {
			flag = false;
		}
		g = flag;
		d = cursor.getLong(kj1.k);
	}

	public boolean a() {
		return f >= 0x7fffff9b;
	}

	public String toString() {
		return (new StringBuilder()).append("AppInfo[id:").append(a)
				.append(", label:").append(b).append(", system: ").append(g)
				.append(", called: ").append(f).append(", component: ")
				.append(h).append(", alias: ").append(i)
				.append(", installed on sdcard? ").append(j).append("]")
				.toString();
	}
}
