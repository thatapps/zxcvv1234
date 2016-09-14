package com.main;

import java.util.List;

public class fq extends fp {
	private List a;
	private long b;
	private int c;
	private boolean d;

	public void a(long paramLong) {
		this.b = paramLong;
	}

	public void a(List paramList) {
		this.a = paramList;
	}

	public List b() {
		return this.a;
	}

	public void b(int paramInt) {
		this.c = paramInt;
	}

	public void b(boolean paramBoolean) {
		this.d = paramBoolean;
	}

	public long c() {
		return this.b;
	}

	public int d() {
		return this.c;
	}

	public boolean e() {
		return this.d;
	}
}
