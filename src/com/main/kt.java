package com.main;

class kt implements Runnable {
	final/* synthetic */ks a;
	private ku b;

	public kt(ks ks, ku ku) {
		this.a = ks;
		this.b = ku;
	}

	public void run() {
		if (this.b.a()) {
			ks.a(this.a, this.b);
			ks.a(this.a, this);
		}
	}
}
