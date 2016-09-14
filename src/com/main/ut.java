package com.main;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class ut {

	@SuppressWarnings("unchecked")
	private static Comparator<uw> b = new Comparator() {

		private final Collator a = Collator.getInstance();

		public final int a(uw uw1, uw uw2) {
			if (uw1.e != uw2.e) {
				return uw1.e - uw2.e;
			} else {
				return a.compare(uw1.c, uw2.c);
			}
		}

		

		@Override
		public int compare(Object arg0, Object arg1) {
			
			return a((uw)arg0,  (uw)arg1);
		}

//		public int compare(Object obj, Object obj1) {
//			
//			return a(obj,  obj1);
//		}

	};
	private final ArrayList a = new ArrayList();

	public ut(Context context, String s, String s1, String s2, ux aux[]) {
		if (aux != null) {
			int k = aux.length;
			int i = 0;
			while (i < k) {
				final ux ux1 = aux[i];
				if (ux1 != null) {
					uv uv1 = new uv() {

						final ux a;
						final ut b;

						public void a() {
							a.d();
						}

						{
							b = ut.this;
							a = ux1;
							// super();
						}
					};
					uv1.c = ux1.a();
					uv1.d = ux1.b();
					uv1.e = ux1.c();
					a.add(uv1);
				}
				i++;
			}
		}
		Intent intent = new Intent(s1);
		intent.addCategory("android.intent.category.DEFAULT");
		intent.setType(s2);
		if (!TextUtils.isEmpty(s)) {
			intent.setPackage(s);
		}
		PackageManager packageManager = context.getPackageManager();
		Iterator iterator = packageManager.queryIntentActivities(intent, 1)
				.iterator();

		while (iterator.hasNext()) {
			ResolveInfo resolveInfo = (ResolveInfo) iterator.next();
			uu uu = new uu();
			uu.c = resolveInfo.loadLabel(packageManager);
			if (((uu) (uu)).c == null) {
				uu.c = ((ResolveInfo) (resolveInfo)).activityInfo.name;
			}
			int j;
			int l;
			String str = null;
			if (((uu) (uu)).c == null) {
				context = null;
			} else {
				str = ((uu) (uu)).c.toString();
			}
			uu.c = ve.a(str);
			uu.d = resolveInfo.loadIcon(packageManager);
			l = us.b()
					.indexOf(
							(new StringBuilder())
									.append(((ResolveInfo) (resolveInfo)).activityInfo.packageName)
									.append("/")
									.append(((ResolveInfo) (resolveInfo)).activityInfo.name)
									.toString());
			j = l;
			if (l == -1) {
				j = us.b().indexOf(
						((ResolveInfo) (resolveInfo)).activityInfo.packageName);
			}
			l = j;
			if (j < 0) {
				l = 0x7fffffff;
			}
			uu.e = l;
			uu.a = new ComponentName(
					((ResolveInfo) (resolveInfo)).activityInfo.applicationInfo.packageName,
					((ResolveInfo) (resolveInfo)).activityInfo.name);
			a.add(aux);
		}
		Collections.sort(a, b);
	}

	public List a() {
		return a;
	}

}
