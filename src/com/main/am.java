package com.main;

import android.app.Notification;

class am extends al {

	am() {
	}

	public Notification a(ag ag1) {
		Notification notification = ag1.B;
		notification.setLatestEventInfo(ag1.a, ag1.b, ag1.c, ag1.d);
		notification = ba.a(notification, ag1.a, ag1.b, ag1.c, ag1.d, ag1.e);
		if (ag1.j > 0) {
			notification.flags = notification.flags | 0x80;
		}
		return notification;
	}
}
