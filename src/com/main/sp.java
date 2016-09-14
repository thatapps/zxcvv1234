package com.main;

import java.util.Collection;
import java.util.Iterator;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;

@TargetApi(16)
public class sp {
	public static final sr a;
	public static final sr b;
	private static final sr c;
	private static final sq d;
	private static final sq e;

	static {
		c = new sr() {
		};
		a = new sr() {
		};
		b = new sr() {
		};
		d = new sq(4096);
		e = new sq(8192);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public static void a(Collection collection, boolean bl) {
		if (collection == null) {
			return;
		}
		Iterator iterator = collection.iterator();
		do {
			if (!iterator.hasNext()) {
				if (!bl)
					return;
				collection.clear();
				return;
			}
			AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) iterator
					.next();
			if (accessibilityNodeInfo == null)
				continue;
			accessibilityNodeInfo.recycle();
		} while (true);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static void a(AccessibilityNodeInfo... arraccessibilityNodeInfo) {
		if (arraccessibilityNodeInfo == null) {
			return;
		}
		for (AccessibilityNodeInfo accessibilityNodeInfo : arraccessibilityNodeInfo) {
			if (accessibilityNodeInfo == null)
				continue;
			accessibilityNodeInfo.recycle();
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static boolean a(Context context,
			AccessibilityNodeInfo accessibilityNodeInfo, Class class_) {
		Class class_2;
		if (!(accessibilityNodeInfo != null
				&& class_ != null
				&& (class_2 = ti.a().a(context,
						accessibilityNodeInfo.getClassName(),
						accessibilityNodeInfo.getPackageName())) != null && class_
					.isAssignableFrom(class_2))) {
			return false;
		}
		return true;
	}

	public static boolean a(AccessibilityNodeInfo accessibilityNodeInfo) {
		String string = accessibilityNodeInfo.getClassName().toString();
		if (string.equals((Object) ListView.class.getName())
				|| string.equals((Object) GridView.class.getName())
				|| string.equals((Object) WebView.class.getName())
				|| string.equals((Object) ScrollView.class.getName())) {
			return true;
		}
		return false;
	}

	public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
		String string = accessibilityNodeInfo.getClassName().toString();
		if (string.equals((Object) ViewPager.class.getName())
				|| string.equals((Object) WebView.class.getName())
				|| string.equals((Object) Gallery.class.getName())) {
			return true;
		}
		return false;
	}

	public static void c(AccessibilityNodeInfo accessibilityNodeInfo) {
		try {
			accessibilityNodeInfo.recycle();
			return;
		} catch (Exception var1_1) {
			vk.b((Throwable) var1_1);
			return;
		}
	}

}
