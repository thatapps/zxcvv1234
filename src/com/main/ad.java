package com.main;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class ad {

	private final int a;
	private final CharSequence b;
	private final PendingIntent c;
	private final Bundle d;
	private ArrayList e;

	public ad(int i, CharSequence charsequence, PendingIntent pendingintent) {
		this(i, charsequence, pendingintent, new Bundle());
	}

	private ad(int i, CharSequence charsequence, PendingIntent pendingintent,
			Bundle bundle) {
		a = i;
		b = ag.e(charsequence);
		c = pendingintent;
		d = bundle;
	}

	public ac a() {
		bh abh[];
		if (e != null) {
			abh = (bh[]) e.toArray(new bh[e.size()]);
		} else {
			abh = null;
		}
		return new ac(a, b, c, d, abh, null);
	}

	public ad a(Bundle bundle) {
		if (bundle != null) {
			d.putAll(bundle);
		}
		return this;
	}

	public ad a(bh bh1) {
		if (e == null) {
			e = new ArrayList();
		}
		e.add(bh1);
		return this;
	}
}
