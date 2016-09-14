package com.main;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

class bc {

	static Notification a(Context context, Notification notification,
			CharSequence charsequence, CharSequence charsequence1,
			CharSequence charsequence2, RemoteViews remoteviews, int i,
			PendingIntent pendingintent, PendingIntent pendingintent1,
			Bitmap bitmap, int j, int k, boolean flag) {
		Builder builder = (new android.app.Notification.Builder(context))
				.setWhen(notification.when)
				.setSmallIcon(notification.icon, notification.iconLevel)
				.setContent(notification.contentView)
				.setTicker(notification.tickerText, remoteviews)
				.setSound(notification.sound, notification.audioStreamType)
				.setVibrate(notification.vibrate)
				.setLights(notification.ledARGB, notification.ledOnMS,
						notification.ledOffMS);
		boolean flag1;
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
				.setContentInfo(charsequence2).setContentIntent(pendingintent)
				.setDeleteIntent(notification.deleteIntent);
		if ((notification.flags & 0x80) != 0) {
			flag1 = true;
		} else {
			flag1 = false;
		}
		return builder.setFullScreenIntent(pendingintent1, flag1)
				.setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag)
				.getNotification();
	}
}
