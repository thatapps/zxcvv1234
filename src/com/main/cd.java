package com.main;

import android.os.Parcel;

class cd implements android.os.Parcelable.ClassLoaderCreator {

	private final cc a;

	public cd(cc cc1) {
		a = cc1;
	}

	public Object createFromParcel(Parcel parcel) {
		return a.a(parcel, null);
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader) {
		return a.a(parcel, classloader);
	}

	public Object[] newArray(int i) {
		return a.a(i);
	}
}
