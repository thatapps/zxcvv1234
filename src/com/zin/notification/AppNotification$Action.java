package com.lazyswipe.notification;

import com.main.bh;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.Notification.Action;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class AppNotification$Action implements Parcelable {

	public static final Creator CREATOR = new Creator() {
		public AppNotification$Action a(Parcel var1) {
			return new AppNotification$Action(var1);
		}

		public AppNotification$Action[] a(int var1) {
			return new AppNotification$Action[var1];
		}

		public Object createFromParcel(Parcel var1) {
			return this.a(var1);
		}

		public Object[] newArray(int var1) {
			return this.a(var1);
		}
	};
	public int a;
	public CharSequence b;
	public PendingIntent c;
	public bh[] d = null;

	public AppNotification$Action() {
	}

	@TargetApi(19)
	public AppNotification$Action(Action var1) {
		this.b = var1.title;
		this.a = var1.icon;
		this.c = var1.actionIntent;
	}

	public AppNotification$Action(Parcel var1) {
		this.a = var1.readInt();
		if (var1.readInt() != 0) {
			this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR
					.createFromParcel(var1);
		}

		if (var1.readInt() != 0) {
			this.c = PendingIntent.readPendingIntentOrNullFromParcel(var1);
		}

	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel var1, int var2) {
		var1.writeInt(this.a);
		if (this.b != null) {
			var1.writeInt(1);
			TextUtils.writeToParcel(this.b, var1, var2);
		} else {
			var1.writeInt(0);
		}

		if (this.c != null) {
			var1.writeInt(1);
			PendingIntent.writePendingIntentOrNullToParcel(this.c, var1);
		} else {
			var1.writeInt(0);
		}
	}
}
