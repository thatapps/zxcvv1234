package com.main;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

final class ft implements ServiceConnection {

	boolean a;
	private final LinkedBlockingQueue b;

	ft() {
		a = false;
		b = new LinkedBlockingQueue(1);
	}

	ft(fr _pcls1) {
		this();
	}

	public IBinder a() {
		if (a) {
			throw new IllegalStateException();
		} else {
			a = true;
			try {
				return (IBinder) b.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder) {
		try {
			b.put(ibinder);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	public void onServiceDisconnected(ComponentName componentname) {
	}
}
