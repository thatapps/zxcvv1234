package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.String
 */

class vp {
	int a = 0;
	int b = 0;
	String c;
	String d;
	int e = -1;
	File f;
	long g;
	String h;
	FileOutputStream i;
	long j = 0;
	final vq k = new vq();
	vx l;

	vp() {
	}

	String a() {
		return this.c;
	}

	void a(vx vx) {
		this.b = 1 + this.b;
		this.e = 2;
		this.l = vx;
	}

	void a(byte[] arrby, int n, int n2) {
		if (this.i == null) {
			if (!this.f.exists()) {
				try {
					this.f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				this.i = new FileOutputStream(this.f, true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			this.i.write(arrby, 0, n2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.i.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void b(vx vx) {
		this.a = 1 + this.a;
		this.e = 1;
		this.l = vx;
	}

	boolean b() {
		if (this.a > 3) {
			return true;
		}
		return false;
	}

	boolean c() {
		if (this.b > 5) {
			return true;
		}
		return false;
	}

	void d() {
		this.e = 0;
	}

	boolean e() {
		if (this.e == 0) {
			return true;
		}
		return false;
	}

	void f() {
		try {
			this.i.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.i.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
