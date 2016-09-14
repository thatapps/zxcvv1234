/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Message
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.service.notification.NotificationListenerService
 *  android.service.notification.StatusBarNotification
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.lazyswipe.notification;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings.Secure;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeService;
import com.main.iq;
import com.main.pg;
import com.main.ph;
import com.main.pq;
import com.main.uk;
import com.main.vj;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
@SuppressLint("NewApi")
@TargetApi(value = 18)
public final class SwipeNotificationListenerService extends
		NotificationListenerService implements Handler.Callback {
	public static SwipeNotificationListenerService a;
	private static Field b;
	private Handler c;

	/*
	 * Enabled aggressive block sorting
	 */
	@TargetApi(value = 20)
	private void a(StatusBarNotification statusbarnotification) {
		String s = statusbarnotification.getPackageName();
		Notification notification = statusbarnotification.getNotification();
		String s1 = statusbarnotification.getTag();
		int i = statusbarnotification.getId();
		String string = "";
		if (android.os.Build.VERSION.SDK_INT >= 20) {
			string = statusbarnotification.getKey();
		} else {
			string = null;
		}
		pq.a(this, s, notification, s1, i, string);
	}

	public static void a(String s, String s1, int i, String s2) {
		if (a == null) {
			return;
		}
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			a.cancelNotification(s2);
			return;
		} else {
			a.cancelNotification(s, s1, i);
			return;
		}
	}

	private static boolean a(Notification notification) {
		boolean flag1 = false;
		String[] strings = b(notification);
		boolean flag = flag1;
		if (notification != null) {
			flag = flag1;
			if ("android.system.imeswitcher".equals(strings[0])) {
				flag = true;
			}
		}
		return flag;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	// public static boolean a(Context context) {
	// String string = Settings.Secure.getString(
	// (ContentResolver) context.getContentResolver(),
	// (String) "enabled_notification_listeners");
	// if (TextUtils.isEmpty((CharSequence) string)) {
	// return false;
	// }
	// String[] arrstring = string.split(":");
	// int n = arrstring.length;
	// for (int i = 0; i < n; ++i) {
	// ComponentName componentName = ComponentName
	// .unflattenFromString((String) arrstring[i]);
	// if (componentName == null
	// || !componentName.getPackageName().equals(
	// (Object) "com.lazyswipe.zev"))
	// // continue;
	// return true;
	// }
	// return false;
	// }

	// public static boolean a(Context var0) {
	// String var4 = Secure.getString(var0.getContentResolver(),
	// "enabled_notification_listeners");
	// if (!TextUtils.isEmpty(var4)) {
	// String[] var5 = var4.split(":");
	// int var2 = var5.length;
	//
	// for (int var1 = 0; var1 < var2; ++var1) {
	// ComponentName var3 = ComponentName
	// .unflattenFromString(var5[var1]);
	// if (var3 != null
	// && var3.getPackageName().equals("com.lazyswipe.zev")) {
	// return true;
	// }
	// }
	// }
	//
	// return false;
	// }
	public static boolean a(Context context) {
		String string = Secure.getString(context.getContentResolver(),
				"enabled_notification_listeners");
		if (!TextUtils.isEmpty(string)) {
			String[] str = string.split(":");
			int j = str.length;
			int i = 0;
			while (i < j) {
				ComponentName componentname = ComponentName
						.unflattenFromString(str[i]);
				if (componentname != null
						&& componentname.getPackageName().equals(
								"com.lazyswipe.zev")) {
					return true;
				}
				i++;
			}
		}
		return false;
	}

	// private static String[] b(Notification notification) {
	// try {
	// if (b == null) {
	// b = notification.getClass().getDeclaredField("kind");
	// b.setAccessible(true);
	// }
	// String[] arrstring = (String[]) b.get((Object) notification);
	// return arrstring;
	// } catch (Exception var1_2) {
	// return null;
	// }
	// }
	private static String[] b(Notification notification) {
		String[] strings = null;
		try {
			if (b == null) {
				b = notification.getClass().getDeclaredField("kind");
				b.setAccessible(true);
			}
			strings = (String[]) b.get(notification);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return strings;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// public void a(Set set) {
	// StatusBarNotification[] arrstatusBarNotification;
	// int n;
	// int n2;
	// int n3 = 0;
	// if (pq.c.size() <= 0)
	// return;
	// try {
	// arrstatusBarNotification = this.getActiveNotifications();
	// if (arrstatusBarNotification == null
	// || arrstatusBarNotification.length <= 0)
	// return;
	// n = arrstatusBarNotification.length;
	// n2 = 0;
	// } catch (Exception var3_8) {
	// vj.a("Swipe.Notification", "Failed to getActiveNotifications",
	// (Throwable) var3_8);
	// return;
	// }
	// do {
	// if (n2 < n) {
	// StatusBarNotification statusBarNotification =
	// arrstatusBarNotification[n2];
	// String string = statusBarNotification.getPackageName();
	// if (!(set.contains((Object) string)
	// || "com.lazyswipe".equals((Object) string)
	// && 1 == statusBarNotification.getId() || !pq.c
	// .contains((Object) string))) {
	// this.a(statusBarNotification);
	// ++n3;
	// }
	// } else {
	// if (n3 <= 0)
	// return;
	// return;
	// }
	// ++n2;
	// } while (true);
	// }
	// public void a(Set set) {
	// int j = 0;
	// StatusBarNotification astatusbarnotification[];
	// StatusBarNotification statusbarnotification;
	// String s;
	// int i;
	// int k;
	// int l;
	// if (pq.c.size() <= 0) {
	// return;
	// } else {
	//
	// try {
	// astatusbarnotification = getActiveNotifications();
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// vj.a("Swipe.Notification", "Failed to getActiveNotifications",
	// exception);
	// return;
	// }
	// if (astatusbarnotification == null) {
	// return;
	// } else {
	//
	// if (astatusbarnotification.length <= 0) {
	// return;
	// } else {
	//
	// l = astatusbarnotification.length;
	// i = 0;
	//
	// }
	//
	// }
	// }
	//
	// if (i >= l) {
	//
	// if (j <= 0)
	// ;
	//
	// } else {
	//
	// statusbarnotification = astatusbarnotification[i];
	// s = statusbarnotification.getPackageName();
	// k = j;
	// if (set.contains(s)) {
	//
	// i++;
	// j = k;
	//
	// } else {
	//
	// if (!"com.lazyswipe.zev".equals(s)
	// || 1 != statusbarnotification.getId()) {
	//
	// k = j;
	// if (!pq.c.contains(s)) {
	//
	// i++;
	// j = k;
	//
	// } else {
	//
	// a(statusbarnotification);
	// k = j + 1;
	// i++;
	// j = k;
	//
	// }
	//
	// } else {
	//
	// k = j;
	// i++;
	// j = k;
	//
	// }
	//
	// }
	// }
	//
	// }
	public void a(Set set) {
		StatusBarNotification[] arrstatusBarNotification;
		int n;
		int n2;
		int n3 = 0;
		if (pq.c.size() <= 0)
			return;
		try {
			arrstatusBarNotification = this.getActiveNotifications();
			if (arrstatusBarNotification == null
					|| arrstatusBarNotification.length <= 0)
				return;
			n = arrstatusBarNotification.length;
			n2 = 0;
		} catch (Exception var3_8) {
			vj.a("Swipe.Notification", "Failed to getActiveNotifications",
					(Throwable) var3_8);
			return;
		}
		do {
			if (n2 < n) {
				StatusBarNotification statusBarNotification = arrstatusBarNotification[n2];
				String string = statusBarNotification.getPackageName();
				if (!(set.contains((Object) string)
						|| "com.lazyswipe.zev".equals((Object) string)
						&& 1 == statusBarNotification.getId() || !pq.c
							.contains((Object) string))) {
					this.a(statusBarNotification);
					++n3;
				}
			} else {
				if (n3 <= 0)
					return;
				return;
			}
			++n2;
		} while (true);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// public boolean handleMessage(Message message) {
	// Object object;
	// if (!(message.obj instanceof ph)) {
	// return false;
	// }
	// ph ph = (ph) message.obj;
	// Object object2 = object = pq.b;
	// synchronized (object2) {
	// AppNotification appNotification = (AppNotification) pq.d
	// .get((Object) ph.e);
	// if (appNotification == null || appNotification.d == null) {
	// return true;
	// }
	// Iterator iterator = appNotification.d.entrySet().iterator();
	// boolean bl = false;
	// while (iterator.hasNext()) {
	// boolean bl2;
	// pg pg = (pg) ((Map.Entry) iterator.next()).getKey();
	// if (pg.b == ph.b && vk.a((Object) pg.a, (Object) ph.a)
	// && vk.a((Object) pg.c, (Object) ph.c)) {
	// iterator.remove();
	// bl2 = true;
	// } else {
	// bl2 = bl;
	// }
	// bl = bl2;
	// }
	// return true;
	// }
	// }
	// public boolean handleMessage(Message message) {
	// boolean flag = false;
	// boolean flag1;
	// ph ph1 = null;
	// AppNotification appnotification = null;
	// Iterator iterator = null;
	// if (!(message.obj instanceof ph)) {
	// return false;
	// } else {
	// ph1 = (ph) message.obj;
	// message = ((Message) (pq.b));
	//
	// appnotification = (AppNotification) pq.d.get(ph1.e);
	// if (appnotification == null) {
	//
	// flag1 = false;
	//
	// } else {
	//
	// if (appnotification.d == null) {
	// flag1 = false;
	// } else {
	//
	// iterator = appnotification.d.entrySet().iterator();
	// flag = false;
	//
	// }
	//
	// }
	//
	// }
	//
	// pg pg1 = null;
	// if (iterator.hasNext()) {
	// pg1 = (pg) ((java.util.Map.Entry) iterator.next()).getKey();
	// }
	//
	// if (pg1.b == ph1.b && vk.a((Object) pg1.a, (Object) ph1.a)
	// && vk.a((Object) pg1.c, (Object) ph1.c)) {
	// iterator.remove();
	// flag = true;
	// }
	//
	// flag1 = flag;
	// if (flag) {
	// flag1 = flag;
	// }
	//
	// // if (appnotification.d.size() < 0) {
	// //
	// // }
	// appnotification.c();
	// pq.d.remove(ph1.e);
	// flag1 = flag;
	//
	// if (flag1) {
	// pq.e();
	// }
	// return true;
	//
	// }
	public boolean handleMessage(Message message) {
		Object object;
		if (!(message.obj instanceof ph)) {
			return false;
		}
		ph ph = (ph) message.obj;
		Object object2 = object = pq.b;
		synchronized (object2) {
			AppNotification appNotification = (AppNotification) pq.d
					.get((Object) ph.e);
			if (appNotification == null || appNotification.d == null) {
				return true;
			}
			Iterator iterator = appNotification.d.entrySet().iterator();
			boolean bl = false;
			while (iterator.hasNext()) {
				boolean bl2;
				pg pg = (pg) ((Map.Entry) iterator.next()).getKey();
				if (pg.b == ph.b && vk.a((Object) pg.a, (Object) ph.a)
						&& vk.a((Object) pg.c, (Object) ph.c)) {
					iterator.remove();
					bl2 = true;
				} else {
					bl2 = bl;
				}
				bl = bl2;
			}
			return true;
		}
	}

	public IBinder onBind(Intent intent) {
		a = this;
		pq.a(this);
		if (android.os.Build.VERSION.SDK_INT < 21) {
			(new Handler()).post(new Runnable() {

				final SwipeNotificationListenerService a;

				public void run() {
					a.a(Collections.emptySet());
				}

				{
					a = SwipeNotificationListenerService.this;
					// super();
				}
			});
		}
		return super.onBind(intent);
	}

	public void onCreate() {
		super.onCreate();
		SwipeService.a((Context) this);
		uk.a((Context) this);
		this.c = new Handler((Handler.Callback) this);
	}

	public void onListenerConnected() {
		this.a(Collections.emptySet());
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */

	// public void onNotificationPosted(StatusBarNotification
	// statusBarNotification) {
	// if (!SwipeService.d())
	// return;
	// String string = statusBarNotification.getPackageName();
	// if (pq.a
	// && "android".equals((Object) string)
	// && SwipeNotificationListenerService.a(statusBarNotification
	// .getNotification())) {
	// boolean bl = vk.o();
	// Handler handler = bl ? null : SwipeService.a();
	// if (!pq.g) {
	// pq.g = true;
	// final SwipeService swipeService = SwipeService.o();
	// if (swipeService != null) {
	// if (bl) {
	// swipeService.e(false);
	// } else if (handler != null) {
	// handler.post((Runnable) new Runnable() {
	//
	// public void run() {
	// swipeService.e(false);
	// }
	// });
	// }
	// }
	// }
	// Log.i((String) "Swipe.Notification", (String) "IME showed up");
	// SwipeService swipeService = SwipeService.o();
	// if (swipeService != null) {
	// if (bl) {
	// swipeService.b(true);
	// } else if (handler != null) {
	// handler.post((Runnable) new Runnable() {
	// /* synthetic */iq a;
	//
	// public void run() {
	// this.a.b(true);
	// }
	// });
	// }
	// }
	// }
	// if ("com.lazyswipe".equals((Object) string)) {
	// if (statusBarNotification.getId() != 1)
	// return;
	// {
	// try {
	// SwipeService.a().sendEmptyMessageDelayed(9, 1500);
	// return;
	// } catch (Throwable var8_7) {
	// return;
	// }
	// }
	// }
	// if (!pq.a((Context) this, (CharSequence) string)) {
	// return;
	// }
	// int n = statusBarNotification.getId();
	// String string2 = statusBarNotification.getTag();
	// int n2 = Build.VERSION.SDK_INT;
	// String string3 = null;
	// if (n2 >= 20) {
	// string3 = statusBarNotification.getKey();
	// }
	// ph ph = new ph(n, string2, string3, string);
	// this.c.removeMessages(ph.hashCode());
	// this.a(statusBarNotification);
	// }
//	public void onNotificationPosted(StatusBarNotification statusbarnotification) {
//		Object obj1 = null;
//		String s;
//		if (SwipeService.d()) {
//
//			s = statusbarnotification.getPackageName();
//			if (pq.a) {
//				if ("android".equals(s)
//						&& a(statusbarnotification.getNotification())) {
//					boolean flag = vk.o();
//					Handler handler;
//
//					if (flag) {
//						handler = null;
//					} else {
//						handler = SwipeService.a();
//					}
//					if (!pq.g) {
//						pq.g = true;
//						final SwipeService swipeservice = SwipeService.o();
//						if (swipeservice != null) {
//							if (flag) {
//								swipeservice.e(false);
//							} else if (handler != null) {
//								handler.post(new Runnable() {
//
//									final SwipeService a;
//									final SwipeNotificationListenerService b;
//
//									public void run() {
//										a.e(false);
//									}
//
//									{
//										b = SwipeNotificationListenerService.this;
//										a = swipeservice;
//										// super();
//									}
//								});
//							}
//						}
//					}
//					Log.i("Swipe.Notification", "IME showed up");
//					final SwipeService swipeservice = SwipeService.o();
//					if (swipeservice != null) {
//						if (flag) {
//							swipeservice.b(true);
//						} else if (handler != null) {
//							handler.post(new Runnable() {
//
//								final iq a;
//								final SwipeNotificationListenerService b;
//
//								public void run() {
//									a.b(true);
//								}
//
//								{
//									b = SwipeNotificationListenerService.this;
//									// a = iq1;
//
//								}
//							});
//						}
//					}
//				}
//			}
//			if (!"com.lazyswipe".equals(s)) {
//
//			}
//			if (statusbarnotification.getId() != 1) {
//
//				return;
//			} else {
//
//				try {
//					SwipeService.a().sendEmptyMessageDelayed(9, 1500L);
//					// return;
//				}
//				// Misplaced declaration of an exception variable
//				catch (Exception exception) {
//					return;
//				}
//				if (!pq.a(this, s)) {
//					return;
//				} else {
//
//					int i = statusbarnotification.getId();
//					String s1 = statusbarnotification.getTag();
//					Object obj = obj1;
//					if (android.os.Build.VERSION.SDK_INT >= 20) {
//						obj = statusbarnotification.getKey();
//					}
//					obj = new ph(i, s1, ((String) (obj)), s);
//					c.removeMessages(((ph) (obj)).hashCode());
//					a(statusbarnotification);
//					return;
//
//				}
//
//			}
//
//		} else {
//			return;
//		}
//
//	}
	public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (!SwipeService.d()) return;
        String string = statusBarNotification.getPackageName();
        if (pq.a) {
			if ("android".equals((Object)string) && SwipeNotificationListenerService.a(statusBarNotification.getNotification())) {
			    boolean bl = vk.o();
			    Handler handler = bl ? null : SwipeService.a();
			    if (!pq.g) {
			        pq.g = true;
			        final SwipeService swipeService = SwipeService.o();
			        if (swipeService != null) {
			            if (bl) {
			                swipeService.e(false);
			            } else if (handler != null) {
			                handler.post((Runnable)new Runnable(){

			                    public void run() {
			                        swipeService.e(false);
			                    }
			                });
			            }
			        }
			    }
			    Log.i((String)"Swipe.Notification", (String)"IME showed up");
			    SwipeService swipeService = SwipeService.o();
			    if (swipeService != null) {
			        if (bl) {
			            swipeService.b(true);
			        } else if (handler != null) {
			            handler.post((Runnable)new Runnable(){
			                final   iq a;

			                public void run() {
			                    this.a.b(true);
			                }
			            });
			        }
			    }
			}
		}
        if ("com.lazyswipe".equals((Object)string)) {
            if (statusBarNotification.getId() != 1) return;
            {
                try {
                    SwipeService.a().sendEmptyMessageDelayed(9, 1500);
                    return;
                }
                catch (Throwable var8_7) {
                    return;
                }
            }
        }
        if (!pq.a((Context)this, (CharSequence)string)) {
            return;
        }
        int n = statusBarNotification.getId();
        String string2 = statusBarNotification.getTag();
        int n2 = Build.VERSION.SDK_INT;
        String string3 = null;
        if (n2 >= 20) {
            string3 = statusBarNotification.getKey();
        }
        ph ph = new ph(n, string2, string3, string);
        this.c.removeMessages(ph.hashCode());
        this.a(statusBarNotification);
    }
	/*
	 * Loose catch block Enabled aggressive block sorting Enabled unnecessary
	 * exception pruning Lifted jumps to return sites
	 */

	public void onNotificationRemoved(
			StatusBarNotification statusBarNotification) {
		String string = statusBarNotification.getPackageName();
		if ("com.lazyswipe".equals((Object) string)) {
			if (statusBarNotification.getId() != 1)
				return;
			SwipeService.a().removeMessages(9);
			return;
		}
		if (pq.a) {
			if ("android".equals((Object) string)
					&& SwipeNotificationListenerService.a(statusBarNotification
							.getNotification())) {
				Log.i((String) "Swipe.Notification", (String) "IME dismissed");
				SwipeService swipeService = SwipeService.o();
				if (swipeService == null)
					return;
				if (vk.o()) {
					swipeService.b(false);
					return;
				}
				Handler handler = SwipeService.a();
				if (handler == null)
					return;
				handler.post((Runnable) new Runnable() {
					final iq a;

					public void run() {
						this.a.b(false);
					}
				});
				return;
			}
		}
		int n = statusBarNotification.getId();
		String string2 = statusBarNotification.getTag();
		String string3 = Build.VERSION.SDK_INT >= 20 ? statusBarNotification
				.getKey() : null;
		ph ph = new ph(n, string2, string3, string);
		this.c.sendMessageDelayed(Message.obtain((Handler) this.c,
				(int) ph.hashCode(), (Object) ph), 100);
		return;

	}

	public boolean onUnbind(Intent intent) {
		a = null;
		pq.b((Context) this);
		return super.onUnbind(intent);
	}

}
