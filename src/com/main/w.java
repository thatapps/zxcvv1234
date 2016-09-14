package com.main;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.util.Log;

public class w extends u {
	static boolean a = false;
    final cq b = new cq();
    final cq c = new cq();
    final String d;
    i e;
    boolean f;
    boolean g;

	w(String string, i i, boolean bl) {
		this.d = string;
		this.e = i;
		this.f = bl;
	}

	void a(i i) {
		this.e = i;
	}

	public void a(String string, FileDescriptor fileDescriptor,
			PrintWriter printWriter, String[] arrstring) {
		int n = 0;
		if (this.b.b() > 0) {
			printWriter.print(string);
			printWriter.println("Active Loaders:");
			String string2 = string + "    ";
			for (int i = 0; i < this.b.b(); ++i) {
				x x = (x) this.b.b(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(this.b.a(i));
				printWriter.print(": ");
				printWriter.println(x.toString());
				x.a(string2, fileDescriptor, printWriter, arrstring);
			}
		}
		if (this.c.b() > 0) {
			printWriter.print(string);
			printWriter.println("Inactive Loaders:");
			String string3 = string + "    ";
			for (; n < this.c.b(); ++n) {
				x x = (x) this.c.b(n);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(this.c.a(n));
				printWriter.print(": ");
				printWriter.println(x.toString());
				x.a(string3, fileDescriptor, printWriter, arrstring);
			}
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	@Override
	public boolean a() {
		int n = this.b.b();
		int n2 = 0;
		boolean bl = false;
		while (n2 < n) {
			x x = (x) this.b.b(n2);
			boolean bl2 = x.h && !x.f;
			bl |= bl2;
			++n2;
		}
		return bl;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void b() {
		if (a) {
			Log.v((String) "LoaderManager", (String) ("Starting in " + this));
		}
		if (this.f) {
			RuntimeException runtimeException = new RuntimeException("here");
			runtimeException.fillInStackTrace();
			Log.w((String) "LoaderManager",
					(String) ("Called doStart when already started: " + this),
					(Throwable) runtimeException);
			return;
		} else {
			this.f = true;
			for (int i = -1 + this.b.b(); i >= 0; --i) {
				((x) this.b.b(i)).a();
			}
		}
	}

	public void c() {
		if (a) {
			Log.v((String) "LoaderManager", (String) ("Stopping in " + this));
		}
		if (!this.f) {
			RuntimeException runtimeException = new RuntimeException("here");
			runtimeException.fillInStackTrace();
			Log.w((String) "LoaderManager",
					(String) ("Called doStop when not started: " + this),
					(Throwable) runtimeException);
			return;
		}
		for (int i = -1 + this.b.b(); i >= 0; --i) {
			((x) this.b.b(i)).e();
		}
		this.f = false;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void d() {
		if (a) {
			Log.v((String) "LoaderManager", (String) ("Retaining in " + this));
		}
		if (!this.f) {
			RuntimeException runtimeException = new RuntimeException("here");
			runtimeException.fillInStackTrace();
			Log.w((String) "LoaderManager",
					(String) ("Called doRetain when not started: " + this),
					(Throwable) runtimeException);
			return;
		} else {
			this.g = true;
			this.f = false;
			for (int i = -1 + this.b.b(); i >= 0; --i) {
				((x) this.b.b(i)).b();
			}
		}
	}

	void e() {
		if (this.g) {
			if (a) {
				Log.v((String) "LoaderManager",
						(String) ("Finished Retaining in " + this));
			}
			this.g = false;
			for (int i = -1 + this.b.b(); i >= 0; --i) {
				((x) this.b.b(i)).c();
			}
		}
	}

	public void f() {
		for (int i = -1 + this.b.b(); i >= 0; --i) {
			((x) this.b.b((int) i)).k = true;
		}
	}

	public void g() {
		for (int i = -1 + this.b.b(); i >= 0; --i) {
			((x) this.b.b(i)).d();
		}
	}

	public void h() {
		if (!this.g) {
			if (a) {
				Log.v((String) "LoaderManager",
						(String) ("Destroying Active in " + this));
			}
			for (int i = -1 + this.b.b(); i >= 0; --i) {
				((x) this.b.b(i)).f();
			}
			this.b.c();
		}
		if (a) {
			Log.v((String) "LoaderManager",
					(String) ("Destroying Inactive in " + this));
		}
		for (int i = -1 + this.c.b(); i >= 0; --i) {
			((x) this.c.b(i)).f();
		}
		this.c.c();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(128);
		stringBuilder.append("LoaderManager{");
		stringBuilder.append(Integer.toHexString((int) System
				.identityHashCode((Object) this)));
		stringBuilder.append(" in ");
		ch.a((Object) this.e, stringBuilder);
		stringBuilder.append("}}");
		return stringBuilder.toString();
	}
}
