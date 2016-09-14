package com.main;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class as {

	private ArrayList a;
	private int b;
	private PendingIntent c;
	private ArrayList d;
	private Bitmap e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;

	public as() {
		a = new ArrayList();
		b = 1;
		d = new ArrayList();
		g = 0x800005;
		h = -1;
		i = 0;
		k = 80;
	}

	public as(Notification notification) {
		a = new ArrayList();
		b = 1;
		d = new ArrayList();
		g = 0x800005;
		h = -1;
		i = 0;
		k = 80;
		Bundle bundle = ab.a(notification);
		if (bundle != null) {
			bundle = bundle.getBundle("android.wearable.EXTENSIONS");
		} else {
			bundle = null;
		}
		if (bundle != null) {
			Object aobj[] = ab.a().a(bundle.getParcelableArrayList("actions"));
			if (aobj != null) {
				Collections.addAll(a, aobj);
			}
			b = bundle.getInt("flags", 1);
			c = (PendingIntent) bundle.getParcelable("displayIntent");
			aobj = ab.a(bundle, "pages");
			if (aobj != null) {
				Collections.addAll(d, aobj);
			}
			e = (Bitmap) bundle.getParcelable("background");
			f = bundle.getInt("contentIcon");
			g = bundle.getInt("contentIconGravity", 0x800005);
			h = bundle.getInt("contentActionIndex", -1);
			i = bundle.getInt("customSizePreset", 0);
			j = bundle.getInt("customContentHeight");
			k = bundle.getInt("gravity", 80);
			l = bundle.getInt("hintScreenTimeout");
		}
	}

	public as a() {
		as as1 = new as();
		as1.a = new ArrayList(a);
		as1.b = b;
		as1.c = c;
		as1.d = new ArrayList(d);
		as1.e = e;
		as1.f = f;
		as1.g = g;
		as1.h = h;
		as1.i = i;
		as1.j = j;
		as1.k = k;
		as1.l = l;
		return as1;
	}

	public as a(ac ac) {
		a.add(ac);
		return this;
	}

	public as b() {
		a.clear();
		return this;
	}

	public List c() {
		return a;
	}

	public Object clone() {
		return a();
	}
}
