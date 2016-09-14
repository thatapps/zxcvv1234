package com.main;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.lazyswipe.notification.SwipeAccessibilityService;
import java.util.Map;

public final class po extends ContentObserver {

	final SwipeAccessibilityService a;

	public po(SwipeAccessibilityService swipeaccessibilityservice,
			Handler handler) {
		super(handler);
		a = swipeaccessibilityservice;

		dispatchChange(true);
	}

	public void a() {
		try {
			a.getContentResolver().registerContentObserver(kr.a, true, this);
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	public void b() {
		a.b.clear();
		try {
			a.getContentResolver().unregisterContentObserver(this);
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	public void onChange(boolean flag) {
		onChange(flag, null);
	}

	public void onChange(boolean flag, Uri uri) {
		ui.a(new pn(a));
	}
}
