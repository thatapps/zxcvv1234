package com.main;

public class vx extends Exception {
	private final int a;
	private final Throwable b;

	public vx(int n, Throwable throwable) {
		this.a = n;
		this.b = throwable;
	}

	public int a() {
		return this.a;
	}

	public Throwable b() {
		return this.b;
	}

	public boolean c() {
		if (this.a == 1 || this.a == 5 || this.a == 6 || this.a == 7) {
			return true;
		}
		return false;
	}
}
