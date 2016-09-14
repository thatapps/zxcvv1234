package com.android.support.v4.app1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.main.n;

public final class FragmentState implements Parcelable {
	public static final Parcelable.Creator CREATOR = null;
	String a;
	int b;
	boolean c;
	int d;
	int e;
	String f;
	boolean g;
	boolean h;
	Bundle i;
	public Bundle j;
	public Fragment k;

	public FragmentState(Parcel paramParcel) {
		this.a = paramParcel.readString();
		this.b = paramParcel.readInt();
		boolean bool2;
		boolean bool3 = false;
		boolean bool1 = false;
		if (paramParcel.readInt() != 0) {
			bool2 = bool1;
			this.c = bool2;
			this.d = paramParcel.readInt();
			this.e = paramParcel.readInt();
			this.f = paramParcel.readString();
			if (paramParcel.readInt() == 0) {
				bool3 = false;
			}
			bool3 = bool1;

		}

		this.h = bool1;
		this.i = paramParcel.readBundle();
		this.j = paramParcel.readBundle();

		bool2 = false;

		this.g = bool3;
		if (paramParcel.readInt() == 0) {
			bool1 = false;
		}

	}

	public FragmentState(Fragment paramFragment) {
		this.a = paramFragment.getClass().getName();
		this.b = paramFragment.g;
		this.c = paramFragment.p;
		this.d = paramFragment.x;
		this.e = paramFragment.y;
		this.f = paramFragment.z;
		this.g = paramFragment.C;
		this.h = paramFragment.B;
		this.i = paramFragment.i;
	}

	public Fragment a(Bundle parami, Fragment paramFragment) {
		if (this.k != null) {
		}
		for (Fragment localFragment = this.k;; localFragment = this.k) {

			if (this.i != null) {
				this.i.setClassLoader(((Bundle) parami).getClassLoader());
			}
			this.k = paramFragment.a(paramFragment.u, this.a, this.i);
			if (this.j != null) {
				this.j.setClassLoader(parami.getClassLoader());
				this.k.e = this.j;
			}
			this.k.a(this.b, paramFragment);
			this.k.p = this.c;
			this.k.r = true;
			this.k.x = this.d;
			this.k.y = this.e;
			this.k.z = this.f;
			this.k.C = this.g;
			this.k.B = this.h;
			// k.t = parami.b;
			if (n.a) {
				Log.v("FragmentManager", "Instantiated fragment " + this.k);
			}
			return localFragment;
		}
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel paramParcel, int paramInt) {
		int m = 1;
		paramParcel.writeString(this.a);
		paramParcel.writeInt(this.b);
		int n = 0;
		int i1;
		if (this.c) {
			n = m;
			paramParcel.writeInt(n);
			paramParcel.writeInt(this.d);
			paramParcel.writeInt(this.e);
			paramParcel.writeString(this.f);
			if (!this.g) {
				i1 = 0;
			}
			i1 = m;
			label68: paramParcel.writeInt(i1);
			if (!this.h) {
				m = 0;
			}
		}

		paramParcel.writeInt(m);
		paramParcel.writeBundle(this.i);
		paramParcel.writeBundle(this.j);
		return;

	}
}
