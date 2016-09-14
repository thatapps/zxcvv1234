package com.main;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

class ba {

	public static Notification a(Notification notification, Context context,
			CharSequence charsequence, CharSequence charsequence1,
			PendingIntent pendingintent, PendingIntent pendingintent1) {
		notification.setLatestEventInfo(context, charsequence, charsequence1,
				pendingintent);
		notification.fullScreenIntent = pendingintent1;
		return notification;
	}
}
