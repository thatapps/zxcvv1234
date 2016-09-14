package com.main;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

public class aw implements aa, z {

	private android.app.Notification.Builder a;

	@SuppressLint("NewApi") public aw(Context context, Notification notification,
			CharSequence charsequence, CharSequence charsequence1,
			CharSequence charsequence2, RemoteViews remoteviews, int i,
			PendingIntent pendingintent, PendingIntent pendingintent1,
			Bitmap bitmap, int j, int k, boolean flag, boolean flag1,
			boolean flag2, int l, CharSequence charsequence3, boolean flag3,
			String s, ArrayList arraylist, Bundle bundle, int i1, int j1,
			Notification notification1, String s1, boolean flag4, String s2) {
		Builder builder = (new android.app.Notification.Builder(context))
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
				.setExtras(bundle).setGroup(s1).setGroupSummary(flag4)
				.setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1)
				.setPublicVersion(notification1);
		Iterator iterator = null;
		String string = "";
		for (iterator = arraylist.iterator(); iterator.hasNext(); a
				.addPerson(string)) {
			string = (String) iterator.next();
		}

	}

	public android.app.Notification.Builder a() {
		return a;
	}

	public void a(ay ay) {
		at.a(a, ay);
	}

	public Notification b() {
		return a.build();
	}
}
