package com.main;

import java.util.Random;

public class nu {
	private final int a;
	private Random b;
	private int[] c;
	private int d = 0;

	public nu(int paramInt) {
		int i = -1;
		this.a = paramInt;
		this.c = new int[paramInt];
		while (i < paramInt) {
			this.c[i] = i;
			i++;
		}
		this.b = new Random();
	}

	public int a() {
		int i = this.b.nextInt(this.a - this.d);
		int j = this.c[i];
		this.c[i] = this.c[(-1 + (this.a - this.d))];
		this.d = (1 + this.d);
		return j;
	}
}
