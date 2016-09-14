package com.main;

enum ht {
	a, b, c;
	static {
		ht[] d = null;
		ht[] arrayOfht = new ht[3];
		arrayOfht[0] = a;
		arrayOfht[1] = b;
		arrayOfht[2] = c;
		d = arrayOfht;
	}
}
