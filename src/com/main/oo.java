package com.main;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class oo extends ContentObserver {
	final/* synthetic */ol a;

	public oo(ol paramol, Handler paramHandler) {

		super(paramHandler);
		this.a = paramol;
	}

	public void a() {
		try {
			this.a.v.getContentResolver().registerContentObserver(kl.a, true,
					this);
			this.a.v.getContentResolver().registerContentObserver(km.a, true,
					this);
			return;
		} catch (Throwable localThrowable) {
		}
	}

	public void onChange(boolean paramBoolean) {
		onChange(paramBoolean, null);
	}

	public void onChange(boolean paramBoolean, Uri paramUri) {
		((ol) this.a).a(paramUri);
	}
}
