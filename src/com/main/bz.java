package com.main;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

class bz {

	final IntentFilter a;
	final BroadcastReceiver b;
	boolean c;

	bz(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver) {
		a = intentfilter;
		b = broadcastreceiver;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder(128);
		stringbuilder.append("Receiver{");
		stringbuilder.append(b);
		stringbuilder.append(" filter=");
		stringbuilder.append(a);
		stringbuilder.append("}");
		return stringbuilder.toString();
	}
}
