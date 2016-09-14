package com.main;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

class bb {

	static Notification a(Context context, Notification notification,
			CharSequence charsequence, CharSequence charsequence1,
			CharSequence charsequence2, RemoteViews remoteviews, int i,
			PendingIntent pendingintent, PendingIntent pendingintent1,
			Bitmap bitmap) {
		boolean flag1 = true;
		Builder builder = (new android.app.Notification.Builder(context))
				.setWhen(notification.when)
				.setSmallIcon(notification.icon, notification.iconLevel)
				.setContent(notification.contentView)
				.setTicker(notification.tickerText, remoteviews)
				.setSound(notification.sound, notification.audioStreamType)
				.setVibrate(notification.vibrate)
				.setLights(notification.ledARGB, notification.ledOnMS,
						notification.ledOffMS);
		boolean flag;
		if ((notification.flags & 2) != 0) {
			flag = true;
		} else {
			flag = false;
		}
		builder = builder.setOngoing(flag);
		if ((notification.flags & 8) != 0) {
			flag = true;
		} else {
			flag = false;
		}
		builder = builder.setOnlyAlertOnce(flag);
		if ((notification.flags & 0x10) != 0) {
			flag = true;
		} else {
			flag = false;
		}
		builder = builder.setAutoCancel(flag)
				.setDefaults(notification.defaults)
				.setContentTitle(charsequence).setContentText(charsequence1)
				.setContentInfo(charsequence2).setContentIntent(pendingintent)
				.setDeleteIntent(notification.deleteIntent);
		if ((notification.flags & 0x80) != 0) {
			flag = flag1;
		} else {
			flag = false;
		}
		return builder.setFullScreenIntent(pendingintent1, flag)
				.setLargeIcon(bitmap).setNumber(i).getNotification();
	}
}
