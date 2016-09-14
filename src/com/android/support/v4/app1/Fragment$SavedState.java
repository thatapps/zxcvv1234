package com.android.support.v4.app1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Fragment$SavedState implements Parcelable {
	public static final Parcelable.Creator CREATOR = null;
	final Bundle a;

	Fragment$SavedState(Parcel paramParcel, ClassLoader paramClassLoader) {
		this.a = paramParcel.readBundle();
		if ((paramClassLoader != null) && (this.a != null)) {
			this.a.setClassLoader(paramClassLoader);
		}
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel paramParcel, int paramInt) {
		paramParcel.writeBundle(this.a);
	}
}
