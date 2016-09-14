package com.main;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

import com.lazyswipe.SwipeService;

public final class iu extends ContentObserver {

	final SwipeService a;

	public iu(SwipeService swipeservice, Handler handler) {

		super(handler);
		a = swipeservice;
		dispatchChange(true);
	}

	public void a() {
		try {
			a.getContentResolver().registerContentObserver(qb.a, true, this);
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	public void b() {
		try {
			a.getContentResolver().unregisterContentObserver(this);
		} catch (Throwable throwable) {
		}
		//a.b = null;
	}

	public void onChange(boolean flag) {
		onChange(flag, null);
	}

	public void onChange(boolean flag, Uri uri)
    {
        ui.a(new it(a, uri));
    }
}
