package com.main;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class ap extends al {

	ap() {
	}

	public Notification a(ag ag1) {
		be be1 = new be(ag1.a, ag1.B, ag1.b, ag1.c, ag1.h, ag1.f, ag1.i, ag1.d,
				ag1.e, ag1.g, ag1.o, ag1.p, ag1.q, ag1.l, ag1.j, ag1.n, ag1.v,
				ag1.x, ag1.r, ag1.s, ag1.t);
		ab.a(be1, ag1.u);
		ab.a(be1, ag1.m);
		return be1.b();
	}

	public Bundle a(Notification notification) {
		return bd.a(notification);
	}

	public ac[] a(ArrayList arraylist) {
		return (ac[]) (ac[]) bd.a(arraylist, ac.d, bh.a);
	}
}
