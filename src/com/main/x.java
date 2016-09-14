package com.main;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class x implements bw {

	int a;
	Bundle b;
	v c;
	bv d;
	boolean e;
	boolean f;
	Object g;
	boolean h;
	boolean i;
	boolean j;
	boolean k;
	boolean l;
	boolean m;
	x n;
	w o;

	void a() {
		if (i && j) {
			h = true;
		} else if (!h) {
			h = true;
			if (w.a) {
				Log.v("LoaderManager",
						(new StringBuilder()).append("  Starting: ")
								.append(this).toString());
			}
			if (d == null && c != null) {
				d = c.a(a, b);
			}
			if (d != null) {
				if (d.getClass().isMemberClass()
						&& !Modifier.isStatic(d.getClass().getModifiers())) {
					throw new IllegalArgumentException(
							(new StringBuilder())
									.append("Object returned from onCreateLoader must not be a non-static inner member class: ")
									.append(d).toString());
				}
				if (!m) {
					d.a(a, this);
					m = true;
				}
				d.a();
				return;
			}
		}
	}

	void a(bv bv1, Object obj) {
		if (c != null) {

			String s;
			if (o.e != null) {
				s = o.e.b.u;
				o.e.b.u = "onLoadFinished";
			} else {
				s = null;
			}
			if (w.a) {
				Log.v("LoaderManager",
						(new StringBuilder()).append("  onLoadFinished in ")
								.append(bv1).append(": ").append(bv1.a(obj))
								.toString());
			}
			c.a(bv1, obj);
			if (o.e != null) {
				o.e.b.u = s;
			}
			f = true;

			if (o.e != null) {
				o.e.b.u = s;
			}
		}
		return;
	}

	public void a(String s, FileDescriptor filedescriptor,
			PrintWriter printwriter, String as[]) {
		printwriter.print(s);
		printwriter.print("mId=");
		printwriter.print(a);
		printwriter.print(" mArgs=");
		printwriter.println(b);
		printwriter.print(s);
		printwriter.print("mCallbacks=");
		printwriter.println(c);
		printwriter.print(s);
		printwriter.print("mLoader=");
		printwriter.println(d);
		if (d != null) {
			d.a((new StringBuilder()).append(s).append("  ").toString(),
					filedescriptor, printwriter, as);
		}
		if (e || f) {
			printwriter.print(s);
			printwriter.print("mHaveData=");
			printwriter.print(e);
			printwriter.print("  mDeliveredData=");
			printwriter.println(f);
			printwriter.print(s);
			printwriter.print("mData=");
			printwriter.println(g);
		}
		printwriter.print(s);
		printwriter.print("mStarted=");
		printwriter.print(h);
		printwriter.print(" mReportNextStart=");
		printwriter.print(k);
		printwriter.print(" mDestroyed=");
		printwriter.println(l);
		printwriter.print(s);
		printwriter.print("mRetaining=");
		printwriter.print(i);
		printwriter.print(" mRetainingStarted=");
		printwriter.print(j);
		printwriter.print(" mListenerRegistered=");
		printwriter.println(m);
		if (n != null) {
			printwriter.print(s);
			printwriter.println("Pending Loader ");
			printwriter.print(n);
			printwriter.println(":");
			n.a((new StringBuilder()).append(s).append("  ").toString(),
					filedescriptor, printwriter, as);
		}
	}

	void b() {
		if (w.a) {
			Log.v("LoaderManager", (new StringBuilder())
					.append("  Retaining: ").append(this).toString());
		}
		i = true;
		j = h;
		h = false;
		c = null;
	}

	void c() {
		if (i) {
			if (w.a) {
				Log.v("LoaderManager",
						(new StringBuilder()).append("  Finished Retaining: ")
								.append(this).toString());
			}
			i = false;
			if (h != j && !h) {
				e();
			}
		}
		if (h && e && !k) {
			a(d, g);
		}
	}

	void d() {
		if (h && k) {
			k = false;
			if (e) {
				a(d, g);
			}
		}
	}

	void e() {
		if (w.a) {
			Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ")
					.append(this).toString());
		}
		h = false;
		if (!i && d != null && m) {
			m = false;
			d.a(this);
			d.c();
		}
	}

	void f() {
		if (w.a) {
			Log.v("LoaderManager",
					(new StringBuilder()).append("  Destroying: ").append(this)
							.toString());
		}
		l = true;
		boolean flag = f;
		f = false;
		if (c != null || d != null || e || flag) {

			if (w.a) {
				Log.v("LoaderManager",
						(new StringBuilder()).append("  Reseting: ")
								.append(this).toString());
			}
			String s;

			if (o.e != null) {
				s = o.e.b.u;
				o.e.b.u = "onLoaderReset";
			} else {
				s = null;
			}
			c.a(d);
			if (o.e != null) {
				o.e.b.u = s;
			}
			c = null;
			g = null;
			e = false;
			if (d != null) {
				if (m) {
					m = false;
					d.a(this);
				}
				d.e();
			}
			if (n != null) {
				n.f();
			}

			if (o.e != null) {
				o.e.b.u = s;
			}
		}
		return;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder(64);
		stringbuilder.append("LoaderInfo{");
		stringbuilder
				.append(Integer.toHexString(System.identityHashCode(this)));
		stringbuilder.append(" #");
		stringbuilder.append(a);
		stringbuilder.append(" : ");
		ch.a(d, stringbuilder);
		stringbuilder.append("}}");
		return stringbuilder.toString();
	}
}
