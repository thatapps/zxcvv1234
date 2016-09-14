// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.bluetooth;

import java.util.List;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;

// Referenced classes of package android.bluetooth:
//            BluetoothProfile, BluetoothDevice

public class BluetoothPan implements BluetoothProfile {

	public BluetoothPan() {
	}

	public boolean connect(BluetoothDevice bluetoothdevice) {
		return false;
	}

	public List getConnectedDevices() {
		return null;
	}

	public int getConnectionState(BluetoothDevice bluetoothdevice) {
		return 0;
	}

	public List getDevicesMatchingConnectionStates(int ai[]) {
		return null;
	}

	public boolean isTetheringOn() {
		return false;
	}

	public void setBluetoothTethering(boolean flag) {
	}
}
