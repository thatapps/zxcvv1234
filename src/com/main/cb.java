package com.main;

import android.os.Parcel;

class cb implements android.os.Parcelable.Creator {

	final cc a;

	public cb(cc cc1) {
		a = cc1;
	}

	public Object createFromParcel(Parcel parcel) {
		return a.a(parcel, null);
	}

	public Object[] newArray(int i) {
		return a.a(i);
	}
}
