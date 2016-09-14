package com.main;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

final class fu implements IInterface {
	private IBinder a;

	public fu(IBinder paramIBinder) {
		this.a = paramIBinder;
	}

	public String a() {
		Parcel localParcel1 = Parcel.obtain();
		Parcel localParcel2 = Parcel.obtain();
		try {
			localParcel1
					.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
			try {
				this.a.transact(1, localParcel1, localParcel2, 0);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			localParcel2.readException();
			String str = localParcel2.readString();
			return str;
		} finally {
			localParcel2.recycle();
			localParcel1.recycle();
		}
	}

	
	public boolean a(boolean bl) {
		boolean bl2 = true;
		Parcel parcel = Parcel.obtain();
		Parcel parcel2 = Parcel.obtain();
		try {
			parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
			boolean bl3 = bl ? bl2 : false;
			parcel.writeInt((boolean) bl3 ? 1 : 0);
			try {
				this.a.transact(2, parcel, parcel2, 0);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			parcel2.readException();
			int n = parcel2.readInt();
			if (n == 0) {
				bl2 = false;
			}
			return bl2;
		} finally {
			parcel2.recycle();
			parcel.recycle();
		}
	}

	public IBinder asBinder() {
		return this.a;
	}
}
