package com.android.support.v4.app1;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            FragmentState, BackStackState

public final class FragmentManagerState implements Parcelable {

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FragmentManagerState a(Parcel parcel) {
			return new FragmentManagerState(parcel);
		}

		public FragmentManagerState[] a(int i) {
			return new FragmentManagerState[i];
		}

		public Object createFromParcel(Parcel parcel) {
			return a(parcel);
		}

		public Object[] newArray(int i) {
			return a(i);
		}

	};
	public FragmentState a[];
	public int b[];
	public BackStackState c[];

	public FragmentManagerState() {
	}

	public FragmentManagerState(Parcel parcel) {
		a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
		b = parcel.createIntArray();
		c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeTypedArray(a, i);
		parcel.writeIntArray(b);
		parcel.writeTypedArray(c, i);
	}

}
