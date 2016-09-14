package com.main;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class al implements ai {

	al() {
	}

	public Notification a(ag ag1) {
		Notification notification = ag1.B;
		notification.setLatestEventInfo(ag1.a, ag1.b, ag1.c, ag1.d);
		if (ag1.j > 0) {
			notification.flags = notification.flags | 0x80;
		}
		return notification;
	}

	public Bundle a(Notification notification) {
		return null;
	}

	public ac[] a(ArrayList arraylist) {
		return null;
	}
}
