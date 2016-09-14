package com.main;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class ag {

	Notification A;
	Notification B;
	public ArrayList C;
	Context a;
	CharSequence b;
	CharSequence c;
	PendingIntent d;
	PendingIntent e;
	RemoteViews f;
	Bitmap g;
	CharSequence h;
	int i;
	int j;
	boolean k;
	boolean l;
	ar m;
	CharSequence n;
	int o;
	int p;
	boolean q;
	String r;
	boolean s;
	String t;
	ArrayList u;
	boolean v;
	String w;
	Bundle x;
	int y;
	int z;

	public ag(Context context) {
		k = true;
		u = new ArrayList();
		v = false;
		y = 0;
		z = 0;
		B = new Notification();
		a = context;
		B.when = System.currentTimeMillis();
		B.audioStreamType = -1;
		j = 0;
		C = new ArrayList();
	}

	protected static CharSequence e(CharSequence charsequence) {
		while (charsequence == null || charsequence.length() <= 5120) {
			return charsequence;
		}
		return charsequence.subSequence(0, 5120);
	}

	public ag a(int i1) {
		B.icon = i1;
		return this;
	}

	public ag a(ar ar1) {
		if (m != ar1) {
			m = ar1;
			if (m != null) {
				m.a(this);
			}
		}
		return this;
	}

	public ag a(CharSequence charsequence) {
		b = e(charsequence);
		return this;
	}

	public Notification a() {
		return ab.a().a(this);
	}

	public ag b(CharSequence charsequence) {
		c = e(charsequence);
		return this;
	}

	public ag c(CharSequence charsequence) {
		n = e(charsequence);
		return this;
	}

	public ag d(CharSequence charsequence) {
		h = e(charsequence);
		return this;
	}
}
