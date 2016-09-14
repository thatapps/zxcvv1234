package com.main;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class be implements aa, z {

	private android.app.Notification.Builder a;
	private final Bundle b = new Bundle();
	private List c;

	public be(Context context, Notification notification,
			CharSequence charsequence, CharSequence charsequence1,
			CharSequence charsequence2, RemoteViews remoteviews, int i,
			PendingIntent pendingintent, PendingIntent pendingintent1,
			Bitmap bitmap, int j, int k, boolean flag, boolean flag1, int l,
			CharSequence charsequence3, boolean flag2, Bundle bundle, String s,
			boolean flag3, String s1) {
		c = new ArrayList();
		Builder builder = (new android.app.Notification.Builder(context))
				.setWhen(notification.when)
				.setSmallIcon(notification.icon, notification.iconLevel)
				.setContent(notification.contentView)
				.setTicker(notification.tickerText, remoteviews)
				.setSound(notification.sound, notification.audioStreamType)
				.setVibrate(notification.vibrate)
				.setLights(notification.ledARGB, notification.ledOnMS,
						notification.ledOffMS);
		boolean flag4;
		if ((notification.flags & 2) != 0) {
			flag4 = true;
		} else {
			flag4 = false;
		}
		builder = builder.setOngoing(flag4);
		if ((notification.flags & 8) != 0) {
			flag4 = true;
		} else {
			flag4 = false;
		}
		builder = builder.setOnlyAlertOnce(flag4);
		if ((notification.flags & 0x10) != 0) {
			flag4 = true;
		} else {
			flag4 = false;
		}
		builder = builder.setAutoCancel(flag4)
				.setDefaults(notification.defaults)
				.setContentTitle(charsequence).setContentText(charsequence1)
				.setSubText(charsequence3).setContentInfo(charsequence2)
				.setContentIntent(pendingintent)
				.setDeleteIntent(notification.deleteIntent);
		if ((notification.flags & 0x80) != 0) {
			flag4 = true;
		} else {
			flag4 = false;
		}
		a = builder.setFullScreenIntent(pendingintent1, flag4)
				.setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1)
				.setPriority(l).setProgress(j, k, flag);
		if (bundle != null) {
			b.putAll(bundle);
		}
		if (flag2) {
			b.putBoolean("android.support.localOnly", true);
		}
		if (s != null) {
			b.putString("android.support.groupKey", s);
			if (flag3) {
				b.putBoolean("android.support.isGroupSummary", true);
			} else {
				b.putBoolean("android.support.useSideChannel", true);
			}
		}
		if (s1 != null) {
			b.putString("android.support.sortKey", s1);
		}
	}

	public android.app.Notification.Builder a() {
		return a;
	}

	public void a(ay ay) {
		c.add(bd.a(a, ay));
	}

	public Notification b() {
		Notification notification = a.build();
		Object obj = bd.a(notification);
		Bundle bundle = new Bundle(b);
		Iterator iterator = b.keySet().iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			String s = (String) iterator.next();
			if (((Bundle) (obj)).containsKey(s)) {
				bundle.remove(s);
			}
		} while (true);
		((Bundle) (obj)).putAll(bundle);
		obj = bd.a(c);
		if (obj != null) {
			bd.a(notification).putSparseParcelableArray(
					"android.support.actionExtras",
					((android.util.SparseArray) (obj)));
		}
		return notification;
	}
}
