package com.main;

public class ca {

	public static android.os.Parcelable.Creator a(cc cc) {
		if (android.os.Build.VERSION.SDK_INT >= 13) {
			return ce.a(cc);
		} else {
			return new cb(cc);
		}
	}
}
