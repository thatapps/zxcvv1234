/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityService
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.annotation.TargetApi
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.Parcelable
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.provider.Settings$SettingNotFoundException
 *  android.text.TextUtils
 *  android.text.TextUtils$SimpleStringSplitter
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.ViewConfiguration
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeInfo
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.lazyswipe.notification;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.ui.FullscreenTipActivity;
import com.main.ir;
import com.main.po;
import com.main.pp;
import com.main.pq;
import com.main.sp;
import com.main.tn;
import com.main.vj;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
@TargetApi(value = 16)
public class SwipeAccessibilityService extends AccessibilityService implements
		Handler.Callback {
	public static final boolean a;
	private static final String c = (new StringBuilder())
			.append("com.lazyswipe.zev/")
			.append(com.lazyswipe.notification.SwipeAccessibilityService.class
					.getName()).toString();
	private static final String d = (new StringBuilder())
			.append("com.lazyswipe.zev/")
			.append(com.lazyswipe.notification.SwipeAccessibilityServicePreJellyBean.class
					.getName()).toString();
	private static final boolean e;
	private static final HashSet f;
	private static HashMap g;
	private static LinkedHashMap h;
	private static HashMap i;
	private static LinkedHashMap j;
	private static Rect k[];
	private static SwipeAccessibilityService o;
	private static int p;
	public Map b;
	private long l;
	private Handler m;
	private po n;
	static {
		boolean flag1 = true;
		boolean flag;
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			flag = true;
		} else {
			flag = false;
		}
		a = flag;
		if (android.os.Build.VERSION.SDK_INT < 18) {
			flag = flag1;
		} else {
			flag = false;
		}
		e = flag;
		f = new HashSet();
		f.add("com.tencent.mm");
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// static {
	// boolean bl = true;
	// c = "com.lazyswipe/" + SwipeAccessibilityService.class.getName();
	// d = "com.lazyswipe/"
	// + SwipeAccessibilityServicePreJellyBean.class.getName();
	// boolean bl2 = Build.VERSION.SDK_INT >= 16 ? bl : false;
	// a = bl2;
	// if (Build.VERSION.SDK_INT >= 18) {
	// bl = false;
	// }
	// e = bl;
	// f = new HashSet();
	// f.add((Object) "com.tencent.mm");
	// }

	public SwipeAccessibilityService() {
		l = 0L;
		b = new HashMap(0);
	}

	// public static int a(String s, int i1, int j1) {
	// if (o == null || o.b == null) {
	// return -1;
	// }
	// SparseArray sparseArray = (SparseArray) o.b.get(s);
	// if (sparseArray == null) {
	// return -1;
	// }
	// SparseIntArray sparseArray1 = (SparseIntArray) sparseArray.get(i1);
	// if (sparseArray1 == null) {
	// return -1;
	// } else {
	// return sparseArray1.get(j1, -1);
	// }
	// }
	public static int a(String var0, int var1, int var2) {
		if (o != null && o.b != null) {
			SparseArray var3 = (SparseArray) o.b.get(var0);
			if (var3 == null) {
				return -1;
			} else {
				SparseIntArray var4 = (SparseIntArray) var3.get(var1);
				return var4 == null ? -1 : var4.get(var2, -1);
			}
		} else {
			return -1;
		}
	}

	public static SwipeAccessibilityService a() {
		return o;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// public static void a(int i1, int j1) {
	// Object obj = SwipeApplication.e();
	// if (b(((Context) (obj)))) {
	//
	// if (b(i1, j1)) {
	//
	// return;
	// } else {
	// int k1 = (ViewConfiguration.get(((Context) (obj)))
	// .getScaledTouchSlop() >> 3) * 3;
	// obj = new Rect(i1 - k1, j1 - k1, i1 + k1, k1 + j1);
	// Log.i("Swipe.Accessibility",
	// (new StringBuilder())
	// .append("No clickable found at point (")
	// .append(i1).append(",").append(j1)
	// .append("); try again using ")
	// .append(((Rect) (obj)).toString()).toString());
	// a(((Rect) (obj)));
	// return;
	//
	// }
	//
	// } else
	// return;
	//
	// }
	public static void a(int var0, int var1) {
		SwipeApplication var3 = SwipeApplication.e();
		if (b((Context) var3)) {
			try {
				if (!b(var0, var1)) {
					int var2 = (ViewConfiguration.get(var3)
							.getScaledTouchSlop() >> 3) * 3;
					Rect var5 = new Rect(var0 - var2, var1 - var2, var0 + var2,
							var2 + var1);
					Log.i("Swipe.Accessibility",
							"No clickable found at point (" + var0 + "," + var1
									+ "); try again using " + var5.toString());
					a((Rect) var5);
					return;
				}
			} catch (Throwable var4) {
				return;
			}
		}

	}

	/*
	 * Exception decompiling
	 */
	public static void a(int i1, int j1, boolean flag, boolean flag1) {
		Iterator iterator = null;
		if (b(SwipeApplication.e())) {

			iterator = j.entrySet().iterator();

		} else {
			return;
		}

		if (!iterator.hasNext()) {

			return;
		} else {

			java.util.Map.Entry entry;
			AccessibilityNodeInfo accessibilitynodeinfo;
			entry = (java.util.Map.Entry) iterator.next();
			accessibilitynodeinfo = (AccessibilityNodeInfo) entry.getKey();
			if (!((Rect) entry.getValue()).contains(i1, j1)) {

			} else {

				if (!flag) {
					// continue; /* Loop/switch isn't completed */
				}
				try {
					if (sp.a(accessibilitynodeinfo)) {
						// break; /* Loop/switch isn't completed */
					}
				} catch (Throwable throwable) {
					return;
				}
				if (flag) {

				} else {

					if (!sp.b(accessibilitynodeinfo)) {
					} else {

						while (!flag1) {
							i1 = 8192;
							// continue; /* Loop/switch isn't completed */
						}
						accessibilitynodeinfo.performAction(i1);
						i1 = 4096;
						
						return;

					}

				}
			}

		}

	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// private void a(AccessibilityEvent accessibilityevent, int i1,
	// CharSequence charsequence) {
	// p = 0;
	// AccessibilityNodeInfo nodeInfo = accessibilityevent.getSource();
	// if (nodeInfo == null) {
	// return;
	// }
	// if (4096 != i1) {
	// // break MISSING_BLOCK_LABEL_27;
	// }
	// if (nodeInfo.isVisibleToUser()) {
	//
	// b();
	// a(getRootInActiveWindow());
	// a(((Map) (g)), ((Map) (h)));
	// a(((Map) (i)), ((Map) (j)));
	// return;
	// }
	// if (nodeInfo != null) {
	// try {
	// sp.c(nodeInfo);
	// return;
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// vj.a("Swipe.Accessibility", "Failed to process the view event");
	// }
	// }
	// return;
	// }
	private void a(AccessibilityEvent accessibilityEvent, int n,
			CharSequence charSequence) {
		p = 0;
		try {
			AccessibilityNodeInfo accessibilityNodeInfo = accessibilityEvent
					.getSource();
			if (accessibilityNodeInfo != null
					&& (4096 != n || accessibilityNodeInfo.isVisibleToUser())) {
				this.b();
				this.a(this.getRootInActiveWindow());
				this.a((Map) g, (Map) h);
				this.a((Map) i, (Map) j);
				return;
			}
			if (accessibilityNodeInfo == null)
				return;
			{
				sp.c(accessibilityNodeInfo);
				return;
			}
		} catch (Throwable var4_5) {
			vj.a("Swipe.Accessibility", "Failed to process the view event",
					var4_5);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// private void a(AccessibilityEvent accessibilityevent,
	// CharSequence charsequence) {
	// CharSequence charsequence1;
	// if (!"com.lazyswipe.zev".equals(charsequence)
	// && pq.a(this, charsequence)) {
	// if ((charsequence1 = accessibilityevent.getClassName()) != null
	// && charsequence1.toString().indexOf("Toast$TN") <= 0) {
	// Notification notification = (Notification) accessibilityevent
	// .getParcelableData();
	// pq.a(this, charsequence.toString(), notification);
	// return;
	// }
	// }
	// }
	private void a(AccessibilityEvent var1, CharSequence var2) {
		if (!"com.lazyswipe.zev".equals(var2) && pq.a(this, (CharSequence) var2)) {
			CharSequence var3 = var1.getClassName();
			if (var3 != null && var3.toString().indexOf("Toast$TN") <= 0) {
				Notification var4 = (Notification) var1.getParcelableData();
				pq.a(this, var2.toString(), var4);
				return;
			}
		}

	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	// private void a(AccessibilityNodeInfo accessibilitynodeinfo) {
	// int i1;
	// int k1;
	// int l1;
	// int i2;
	// boolean flag1;
	// boolean flag = false;
	// Rect arect[];
	// Rect rect;
	// DisplayMetrics displaymetrics;
	// if (accessibilitynodeinfo == null) {
	//
	// return;
	//
	// } else {
	//
	// i1 = p + 1;
	// p = i1;
	// if (i1 < 20) {
	//
	// rect = new Rect();
	// accessibilitynodeinfo.getBoundsInScreen(rect);
	// displaymetrics = getResources().getDisplayMetrics();
	// if (!accessibilitynodeinfo.isVisibleToUser()
	// || rect.bottom <= 0 || rect.right <= 0
	// || rect.left >= displaymetrics.widthPixels
	// || rect.top >= displaymetrics.heightPixels) {
	// return;
	// } else {
	//
	// l1 = accessibilitynodeinfo.getChildCount();
	// flag1 = accessibilitynodeinfo.isClickable();
	// if (l1 <= 0 && !flag1) {
	// // break MISSING_BLOCK_LABEL_257;
	// }
	// arect = k;
	// i2 = arect.length;
	// k1 = 0;
	// i1 = 0;
	//
	// }
	//
	// } else {
	//
	// return;
	// }
	// }
	//
	// if (k1 >= i2) {
	//
	// if (flag) {
	// if (accessibilitynodeinfo.isScrollable()) {
	// i.put(accessibilitynodeinfo, rect);
	// }
	// for (int j1 = 0; j1 < l1; j1++) {
	// a(accessibilitynodeinfo.getChild(j1));
	// }
	//
	// }
	//
	// } else {
	//
	// if (!Rect.intersects(rect, arect[k1])) {
	// k1++;
	//
	// if (!rect.isEmpty()
	// && (g.containsKey(accessibilitynodeinfo) || i
	// .containsKey(accessibilitynodeinfo))) {
	//
	// return;
	// } else {
	// flag = false;
	// sp.c(accessibilitynodeinfo);
	// return;
	//
	// }
	//
	// } else {
	// i1 = 1;
	// flag = true;
	// if (!flag1) {
	//
	// k1++;
	//
	// if (!rect.isEmpty()
	// && (g.containsKey(accessibilitynodeinfo) || i
	// .containsKey(accessibilitynodeinfo))) {
	//
	// return;
	//
	// } else {
	//
	// sp.c(accessibilitynodeinfo);
	// return;
	//
	// }
	//
	// } else {
	//
	// g.put(accessibilitynodeinfo, rect);
	//
	// }
	//
	// }
	// }
	// }
	private void a(AccessibilityNodeInfo var1) {
		if (var1 != null) {
			int var2 = p + 1;
			p = var2;
			if (var2 < 20) {
				Rect var8 = new Rect();
				var1.getBoundsInScreen(var8);
				DisplayMetrics var9 = this.getResources().getDisplayMetrics();
				if (var1.isVisibleToUser() && var8.bottom > 0 && var8.right > 0
						&& var8.left < var9.widthPixels
						&& var8.top < var9.heightPixels) {
					int var5 = var1.getChildCount();
					boolean var7 = var1.isClickable();
					boolean var3;
					if (var5 <= 0 && !var7) {
						var3 = false;
					} else {
						Rect[] var11 = k;
						int var6 = var11.length;
						int var4 = 0;
						boolean var10 = false;

						while (true) {
							var3 = var10;
							if (var4 >= var6) {
								break;
							}

							if (Rect.intersects(var8, var11[var4])) {
								var10 = true;
								var3 = true;
								if (var7) {
									g.put(var1, var8);
									break;
								}
							}

							++var4;
						}
					}

					if (var3) {
						if (var1.isScrollable()) {
							i.put(var1, var8);
						}

						for (var2 = 0; var2 < var5; ++var2) {
							this.a((AccessibilityNodeInfo) var1.getChild(var2));
						}
					}

					if (var8.isEmpty() || !g.containsKey(var1)
							&& !i.containsKey(var1)) {
						sp.c(var1);
						return;
					}
				}
			}
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	// private void a(Map map, Map map1) {
	// Object obj = new LinkedList(map.entrySet());
	// Collections.sort(((List) (obj)), new Comparator() {
	//
	// final SwipeAccessibilityService a;
	//
	// public int a(java.util.Map.Entry entry1, java.util.Map.Entry entry2) {
	// Rect rect1 = (Rect) entry1.getValue();
	// Rect rect2 = (Rect) entry2.getValue();
	// int i1 = rect1.width();
	// int j1 = rect1.height();
	// int k1 = rect2.width();
	// return j1 * i1 - rect2.height() * k1;
	// }
	//
	// public int compare(Object obj1, Object obj2) {
	// return a((java.util.Map.Entry) obj1, (java.util.Map.Entry) obj2);
	// }
	//
	// {
	// a = SwipeAccessibilityService.this;
	// // super();
	// }
	// });
	// java.util.Map.Entry entry;
	// for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); map1
	// .put(entry.getKey(), entry.getValue())) {
	// entry = (java.util.Map.Entry) ((Iterator) (obj)).next();
	// }
	//
	// map.clear();
	// }
	private void a(Map var1, Map var2) {
		LinkedList var3 = new LinkedList(var1.entrySet());
		Collections.sort(var3, new Comparator() {
			public int a(Entry var1, Entry var2) {
				Rect var6 = (Rect) ((java.util.Map.Entry) var1).getValue();
				Rect var7 = (Rect) ((java.util.Map.Entry) var2).getValue();
				int var3 = var6.width();
				int var4 = var6.height();
				int var5 = var7.width();
				return var4 * var3 - var7.height() * var5;
			}

			
			public int compare(Object var1, Object var2) {
				return this.a((Entry) var1, (Entry) var2);
			}
		});
		Iterator var5 = var3.iterator();

		while (var5.hasNext()) {
			Entry var4 = (Entry) var5.next();
			var2.put(((java.util.Map.Entry) var4).getKey(),
					((java.util.Map.Entry) var4).getValue());
		}

		var1.clear();
	}

	public static void a(Rect[] arrrect) {
		k = arrrect;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */

	// public static boolean a(Context context) {
	// String str = "";
	//
	// if (android.os.Build.VERSION.SDK_INT < 14) {
	// ContentResolver resolver = context.getContentResolver();
	// android.text.TextUtils.SimpleStringSplitter simplestringsplitter;
	// int i1;
	// try {
	// i1 = android.provider.Settings.Secure.getInt(resolver,
	// "accessibility_enabled");
	// } catch (android.provider.Settings.SettingNotFoundException
	// settingnotfoundexception) {
	// vj.b("Swipe.Accessibility",
	// "Settings.Secure.ACCESSIBILITY_ENABLED not found?!");
	// i1 = 0;
	// }
	// if (i1 != 1) {
	// return (Boolean) null;
	// }
	// str = android.provider.Settings.Secure.getString(resolver,
	// "enabled_accessibility_services");
	// if (TextUtils.isEmpty(str)) {
	// return (Boolean) null;
	// }
	// simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter(
	// ':');
	// simplestringsplitter.setString(str);
	// do {
	// if (!simplestringsplitter.hasNext()) {
	// break;
	// }
	// } while (!simplestringsplitter.next().equalsIgnoreCase(d));
	// return true;
	// }
	// Object obj = ((AccessibilityManager) context
	// .getSystemService("accessibility"))
	// .getEnabledAccessibilityServiceList(-1);
	// if (android.os.Build.VERSION.SDK_INT < 16) {
	// str = d;
	// } else {
	// str = c;
	// }
	// ComponentName componentName = ComponentName.unflattenFromString(str);
	// obj = ((List) (obj)).iterator();
	// do {
	// if (!((Iterator) (obj)).hasNext()) {
	// break;
	// }
	// } while (!componentName
	// .equals(ComponentName
	// .unflattenFromString(((AccessibilityServiceInfo) ((Iterator) (obj))
	// .next()).getId())));
	// return true;
	//
	// }
	public static boolean a(Context var0) {
		String var5;
		if (VERSION.SDK_INT < 14) {
			ContentResolver var4 = var0.getContentResolver();

			int var1;
			try {
				var1 = Secure.getInt(var4, "accessibility_enabled");
			} catch (SettingNotFoundException var3) {
				vj.b("Swipe.Accessibility",
						"Settings.Secure.ACCESSIBILITY_ENABLED not found?!");
				var1 = 0;
			}

			if (var1 == 1) {
				var5 = Secure.getString(var4, "enabled_accessibility_services");
				if (!TextUtils.isEmpty(var5)) {
					SimpleStringSplitter var2 = new SimpleStringSplitter(':');
					var2.setString(var5);

					while (var2.hasNext()) {
						if (var2.next().equalsIgnoreCase(d)) {
							return true;
						}
					}
				}
			}
		} else {
			List var7 = ((AccessibilityManager) var0
					.getSystemService("accessibility"))
					.getEnabledAccessibilityServiceList(-1);
			if (VERSION.SDK_INT < 16) {
				var5 = d;
			} else {
				var5 = c;
			}

			ComponentName var6 = ComponentName.unflattenFromString(var5);
			Iterator var8 = var7.iterator();

			while (var8.hasNext()) {
				if (var6.equals(ComponentName
						.unflattenFromString(((AccessibilityServiceInfo) var8
								.next()).getId()))) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean a(Context var0, boolean var1) {
		boolean var2 = vk.h(var0, "android.settings.ACCESSIBILITY_SETTINGS");
		if (var1) {
			FullscreenTipActivity.f(var0);
		}

		return var2;
	}

	// private static boolean a(Rect rect) {
	// for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext();) {
	// java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
	// AccessibilityNodeInfo accessibilitynodeinfo = (AccessibilityNodeInfo)
	// entry
	// .getKey();
	// if (Rect.intersects((Rect) entry.getValue(), rect)) {
	// accessibilitynodeinfo.performAction(16);
	// return true;
	// }
	// }
	//
	// return false;
	// }
	private static boolean a(Rect var0) {
		Iterator var1 = h.entrySet().iterator();

		Entry var2;
		AccessibilityNodeInfo var3;
		do {
			if (!var1.hasNext()) {
				return false;
			}

			var2 = (Entry) var1.next();
			var3 = (AccessibilityNodeInfo) ((java.util.Map.Entry) var2)
					.getKey();
		} while (!Rect.intersects(
				(Rect) ((java.util.Map.Entry) var2).getValue(), var0));

		var3.performAction(16);
		return true;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	// private boolean a(AccessibilityEvent accessibilityevent) {
	// AccessibilityServiceInfo accessibilityserviceinfo;
	// if (accessibilityevent != null) {
	// if ((accessibilityserviceinfo = getServiceInfo()) != null
	// && ((accessibilityserviceinfo.flags & 4) == 0
	// || (accessibilityevent.getEventType() & 0x100c) == 0
	// || accessibilityevent.getEventTime() - l >= 100L ||
	// b(accessibilityevent))) {
	// return false;
	// }
	// }
	// return true;
	// }
	private boolean a(AccessibilityEvent var1) {
		if (var1 != null) {
			AccessibilityServiceInfo var2 = this.getServiceInfo();
			if (var2 != null
					&& ((var2.flags & 4) == 0
							|| (var1.getEventType() & 4108) == 0
							|| var1.getEventTime() - this.l >= 100L || this
								.b((AccessibilityEvent) var1))) {
				return false;
			}
		}

		return true;
	}

	// private void b() {
	// try {
	// i.clear();
	// g.clear();
	// HashMap hashmap = new HashMap(h);
	// hashmap.putAll(j);
	// sp.a(hashmap.keySet(), false);
	// hashmap.clear();
	// j.clear();
	// h.clear();
	// return;
	// } catch (Throwable throwable) {
	// return;
	// }
	// }
	private void b() {
		try {
			i.clear();
			g.clear();
			HashMap var1 = new HashMap(h);
			var1.putAll(j);
			sp.a(var1.keySet(), false);
			var1.clear();
			j.clear();
			h.clear();
		} catch (Throwable var2) {
			;
		}
	}

	// private static boolean b(int i1, int j1) {
	// for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext();) {
	// java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
	// AccessibilityNodeInfo accessibilitynodeinfo = (AccessibilityNodeInfo)
	// entry
	// .getKey();
	// if (((Rect) entry.getValue()).contains(i1, j1)) {
	// accessibilitynodeinfo.performAction(16);
	// return true;
	// }
	// }
	//
	// return false;
	// }
	private static boolean b(int var0, int var1) {
		Iterator var2 = h.entrySet().iterator();

		Entry var3;
		AccessibilityNodeInfo var4;
		do {
			if (!var2.hasNext()) {
				return false;
			}

			var3 = (Entry) var2.next();
			var4 = (AccessibilityNodeInfo) ((java.util.Map.Entry) var3)
					.getKey();
		} while (!((Rect) ((java.util.Map.Entry) var3).getValue()).contains(
				var0, var1));

		var4.performAction(16);
		return true;
	}

	private static boolean b(Context context) {
		return h != null;
	}

	/*
	 * Exception decompiling
	 */
	private boolean b(AccessibilityEvent accessibilityevent) {
		AccessibilityEvent accessibilityevent1;
		if (accessibilityevent.getEventType() != 8) {
			return (Boolean) null;
		}
		accessibilityevent1 = null;
		AccessibilityNodeInfo nodeInfo = accessibilityevent.getSource();
		accessibilityevent1 = accessibilityevent;
		boolean flag = sp.a(this, nodeInfo, android.widget.EditText.class);
		if (flag) {
			if (nodeInfo != null) {
				sp.a(new AccessibilityNodeInfo[] { nodeInfo });
			}
			return true;
		}
		if (nodeInfo != null) {
			sp.a(new AccessibilityNodeInfo[] { nodeInfo });
			return false;
		}

		if (accessibilityevent1 != null) {
			sp.a(new AccessibilityNodeInfo[] { nodeInfo });
		}
		return false;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	// public boolean handleMessage(Message message) {
	// pp pp = null;
	// switch (message.what) {
	// default:
	// return false;
	//
	// case 1: // '\001'
	// pp = (pp) message.obj;
	// break;
	// }
	// a(((pp) (pp)).a, ((pp) (pp)).b, ((pp) (pp)).c);
	// try {
	// ((pp) (pp)).a.recycle();
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// }
	// return true;
	// }
	public boolean handleMessage(Message var1) {
		switch (var1.what) {
		case 1:
			pp var3 = (pp) var1.obj;
			this.a(var3.a, var3.b, var3.c);

			try {
				var3.a.recycle();
			} catch (Throwable var2) {
				;
			}

			return true;
		default:
			return false;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * Lifted jumps to return sites
	 */
	public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
		CharSequence charSequence;
		try {
			if (!SwipeService.d()) {
				return;
			}
			int n = accessibilityEvent.getEventType();
			charSequence = accessibilityEvent.getPackageName();
			if (a) {
				if (this.a(accessibilityEvent))
					return;
			}
			if (n == 32) {
				this.l = System.currentTimeMillis();
			}
			if (a && ir.b((Context) this) == 0) {
				if (32 == n) {
					this.m.removeMessages(1);
					this.a(accessibilityEvent, n, charSequence);
				} else if (4096 == n) {
					this.m.removeMessages(1);
					this.m.sendMessageDelayed(this.m
							.obtainMessage(1, (Object) new pp(
									accessibilityEvent, n, charSequence)), 300);
				}
			}
			if (!e)
				return;
			if (n != 64)
				return;
		} catch (Exception var2_4) {
			vk.b((Throwable) var2_4, 5, "Swipe.Accessibility",
					"onAccessibilityEvent");
			return;
		}
		this.a(accessibilityEvent, charSequence);
	}

	public void onCreate() {
		super.onCreate();
		o = this;
		if (e) {
			SwipeService.a(this);
		}
		if (a) {
			g = new HashMap();
			h = new LinkedHashMap();
			i = new HashMap();
			j = new LinkedHashMap();
			m = new Handler(this);
			n = new po(this, m);
			n.a();
		}
	}

	public void onDestroy() {
		super.onDestroy();
		if (e) {
			pq.b(this);
		}
		if (a) {
			b();
			g = null;
			h = null;
			i = null;
			j = null;
			n.b();
		}
		o = null;
	}

	public void onInterrupt() {
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onServiceConnected() {
		super.onServiceConnected();
		if (e) {
			pq.a((Context) this);
		} else if (SwipeApplication.c) {
			SwipeService.a((Context) this, (Bundle) SwipeService.d(this)
					.getExtras());
		}

		if (a) {
			this.b();
		}

	}
}
