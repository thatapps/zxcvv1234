package com.main;

public abstract class ar {

	ag d;
	CharSequence e;
	CharSequence f;
	boolean g;

	public ar() {
		g = false;
	}

	public void a(ag ag1) {
		if (d != ag1) {
			d = ag1;
			if (d != null) {
				d.a(this);
			}
		}
	}
}
