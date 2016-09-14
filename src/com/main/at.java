package com.main;

import android.annotation.SuppressLint;
import java.util.ArrayList;

class at {

	@SuppressLint("NewApi") private static ay a(android.app.Notification.Action action, az az1, bq bq) {
		bp[] bps = bn.a(action.getRemoteInputs(), bq);
		return az1.b(action.icon, action.title, action.actionIntent,
				action.getExtras(), bps);
	}

	@SuppressLint("NewApi") public static void a(android.app.Notification.Builder builder, ay ay1) {
		android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(
				ay1.a(), ay1.b(), ay1.c());
		if (ay1.f() != null) {
			android.app.RemoteInput aremoteinput[] = bn.a(ay1.f());
			int j = aremoteinput.length;
			for (int i = 0; i < j; i++) {
				builder1.addRemoteInput(aremoteinput[i]);
			}

		}
		if (ay1.d() != null) {
			builder1.addExtras(ay1.d());
		}
		builder.addAction(builder1.build());
	}

	public static ay[] a(ArrayList arraylist, az az1, bq bq) {
		if (arraylist == null) {
			return null;
		}
		ay aay[] = az1.b(arraylist.size());
		for (int i = 0; i < aay.length; i++) {
			aay[i] = a((android.app.Notification.Action) arraylist.get(i), az1,
					bq);
		}

		return aay;
	}
}
