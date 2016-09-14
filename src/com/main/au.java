package com.main;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class au implements aa, z {

	private android.app.Notification.Builder a;
	private Bundle b;

	@SuppressLint("NewApi")
	public au(Context context, Notification notification,
			CharSequence charsequence, CharSequence charsequence1,
			CharSequence charsequence2, RemoteViews remoteviews, int i,
			PendingIntent pendingintent, PendingIntent pendingintent1,
			Bitmap bitmap, int j, int k, boolean flag, boolean flag1,
			boolean flag2, int l, CharSequence charsequence3, boolean flag3,
			ArrayList arraylist, Bundle bundle, String s, boolean flag4,
			String s1) {
		android.app.Notification.Builder builder = (new android.app.Notification.Builder(
				context))
				.setWhen(notification.when)
				.setShowWhen(flag1)
				.setSmallIcon(notification.icon, notification.iconLevel)
				.setContent(notification.contentView)
				.setTicker(notification.tickerText, remoteviews)
				.setSound(notification.sound, notification.audioStreamType)
				.setVibrate(notification.vibrate)
				.setLights(notification.ledARGB, notification.ledOnMS,
						notification.ledOffMS);
		if ((notification.flags & 2) != 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		builder = builder.setOngoing(flag1);
		if ((notification.flags & 8) != 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		builder = builder.setOnlyAlertOnce(flag1);
		if ((notification.flags & 0x10) != 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		builder = builder.setAutoCancel(flag1)
				.setDefaults(notification.defaults)
				.setContentTitle(charsequence).setContentText(charsequence1)
				.setSubText(charsequence3).setContentInfo(charsequence2)
				.setContentIntent(pendingintent)
				.setDeleteIntent(notification.deleteIntent);
		if ((notification.flags & 0x80) != 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		a = builder.setFullScreenIntent(pendingintent1, flag1)
				.setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2)
				.setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3)
				.setGroup(s).setGroupSummary(flag4).setSortKey(s1);
		b = new Bundle();
		if (bundle != null) {
			b.putAll(bundle);
		}
		if (arraylist != null && !arraylist.isEmpty()) {
			b.putStringArray("android.people",
					(String[]) arraylist.toArray(new String[arraylist.size()]));
		}
	}

	public android.app.Notification.Builder a() {
		return a;
	}

	public void a(ay ay) {
		at.a(a, ay);
	}

	@SuppressLint("NewApi")
	public Notification b() {
		a.setExtras(b);
		return a.build();
	}
}
