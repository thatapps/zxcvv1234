package com.main;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.android.support.v4.app1.Fragment;

/*
 * Failed to analyse overrides
 */
public final class d extends q implements Runnable {
	static final boolean a;
	final n b;
	public e c;
	public e d;
	public int e;
	int f;
	int g;
	int h;
	int i;
	public int j;
	public int k;
	public boolean l;
	boolean m = true;
	public String n;
	boolean o;
	public int p = -1;
	public int q;
	public static CharSequence r;
	public int s;
	public CharSequence t;
	public ArrayList u;
	public ArrayList v;

	/*
	 * Enabled aggressive block sorting
	 */
	static {
		boolean bl = Build.VERSION.SDK_INT >= 21;
		a = bl;
	}

	public d(n n) {
		this.b = n;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private cf a(f f, Fragment fragment, boolean bl) {
		cf cf = new cf();
		if (this.u != null) {
			fragment.a(fragment.u, fragment.h);
			if (bl) {
				cf.a((Collection) this.v);
			} else {
				// cf = d.a(this.u, this.v, cf);
			}
		}
		if (bl) {
			if (fragment.Y != null) {
				fragment.Y.a((List) this.v, (Map) cf);
			}
			this.a(f, cf, false);
			return cf;
		}
		if (fragment.Z != null) {
			fragment.Z.a((List) this.v, (Map) cf);
		}
		this.b(f, cf, false);
		return cf;
	}

	private cf a(f f, boolean bl, Fragment fragment) {
		cf cf = this.b(f, fragment, bl);
		if (bl) {
			if (fragment.Z != null) {
				fragment.Z.a((List) this.v, (Map) cf);
			}
			this.a(f, cf, true);
			return cf;
		}
		if (fragment.Y != null) {
			fragment.Y.a((List) this.v, (Map) cf);
		}
		this.b(f, cf, true);
		return cf;
	}

	private static cf a(ArrayList arrayList, ArrayList arrayList2, cf cf) {
		if (cf.isEmpty()) {
			return cf;
		}
		cf cf2 = new cf();
		int n = arrayList.size();
		for (int i = 0; i < n; ++i) {
			View view = (View) cf.get(arrayList.get(i));
			if (view == null)
				continue;
			cf2.put(arrayList2.get(i), (Object) view);
		}
		return cf2;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private f a(SparseArray sparseArray, SparseArray sparseArray2, boolean bl) {
		f f = new f(this);
		f.d = new View((Context) this.b.o);
		int n = 0;
		boolean bl2 = false;
		do {
			int n2 = sparseArray.size();
			if (n >= n2)
				break;
			boolean bl3 = this.a(sparseArray.keyAt(n), f, bl, sparseArray,
					sparseArray2) ? true : bl2;
			++n;
			bl2 = bl3;
		} while (true);
		for (int i = 0; i < sparseArray2.size(); ++i) {
			int n3 = sparseArray2.keyAt(i);
			if (sparseArray.get(n3) != null
					|| !this.a(n3, f, bl, sparseArray, sparseArray2))
				continue;
			bl2 = true;
		}
		if (bl2)
			return f;
		return null;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static Object a(Fragment fragment, Fragment fragment2, boolean bl) {
		Object object;
		if (fragment == null || fragment2 == null) {
			return null;
		}
		if (bl) {
			object = ((Fragment) fragment2).w();
			do {
				fragment.a((Activity) object);
				break;
			} while (true);
		}
		object = ((Fragment) fragment).v;
		return object;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static Object a(Fragment fragment, boolean bl) {
		Object object;
		if (fragment == null) {
			return null;
		}
		if (bl) {
			object = fragment.u();
			do {
				fragment.a((Activity) object);
				break;
			} while (true);
		}
		object = fragment.r();
		return object;
	}

	public static Object a(Object object, Fragment fragment,
			ArrayList arrayList, cf cf, View view) {
		if (object != null) {
			// object = fragment.a(object, fragment.h(), arrayList, (Map) cf,
			// view);
		}
		return object;
	}

	private void a(int n, Fragment fragment, String string, int n2) {
		fragment.t = this.b;
		if (string != null) {
			if (!(fragment.z == null || string.equals((Object) fragment.z))) {
				throw new IllegalStateException("Can't change tag of fragment "
						+ (Object) fragment + ": was " + fragment.z + " now "
						+ string);
			}
			fragment.z = string;
		}
		if (n != 0) {
			if (fragment.x != 0 && fragment.x != n) {
				throw new IllegalStateException(
						"Can't change container ID of fragment "
								+ (Object) fragment + ": was " + fragment.x
								+ " now " + n);
			}
			fragment.x = n;
			fragment.y = n;
		}
		e e = new e();
		e.c = n2;
		e.d = fragment;
		this.a(e);
	}

	private static void a(SparseArray sparseArray, Fragment fragment) {
		int n;
		if (fragment != null && (n = fragment.y) != 0 && !fragment.g()
				&& fragment.e() && fragment.h() != null
				&& sparseArray.get(n) == null) {
			sparseArray.put(n, (Object) fragment);
		}
	}

	private void a(final View view, final f f, final int n, final Object object) {
		view.getViewTreeObserver()
				.addOnPreDrawListener(
						(ViewTreeObserver.OnPreDrawListener) new ViewTreeObserver.OnPreDrawListener() {

							public boolean onPreDraw() {
								view.getViewTreeObserver()
										.removeOnPreDrawListener(
												(ViewTreeObserver.OnPreDrawListener) this);
								d.this.a(f, n, object);
								return true;
							}
						});
	}

	private void a(cf cf, f f) {
		View view;
		if (!(this.v == null || cf.isEmpty() || (view = (View) cf.get(this.v
				.get(0))) == null)) {
			f.c.a = view;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static void a(cf cf, String string, String string2) {
		if (string == null || string2 == null
				|| string.equals((Object) string2))
			return;
		for (int i = 0; i < cf.size(); ++i) {
			if (!string.equals(cf.c(i)))
				continue;
			cf.a(i, (Object) string2);
			return;
		}
		cf.put((Object) string, (Object) string2);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(f f, int n, Object object) {
		if (this.b.g == null) {
			return;
		}
		for (int i = 0; i < this.b.g.size(); ++i) {
			Fragment fragment = (Fragment) this.b.g.get(i);
			if (fragment.J == null || fragment.I == null || fragment.y != n)
				continue;
			if (fragment.A) {
				if (f.b.contains((Object) fragment.J))
					continue;
				// fragment.a(/*object,*/ fragment.J, true);
				f.b.add((Object) fragment.J);
				continue;
			}
			// fragment.a(/*object,*/ fragment.J, false);
			f.b.remove((Object) fragment.J);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(f f, Fragment fragment, Fragment fragment2, boolean bl, cf cf) {
		bs bs = bl ? fragment2.Y : fragment.Y;
		if (bs != null) {
			bs.b((List) new ArrayList((Collection) cf.keySet()),
					(List) new ArrayList(cf.values()), null);
		}
	}

	private void a(final f f, final View view, final Object object,
			final Fragment fragment, final Fragment fragment2,
			final boolean bl, final ArrayList arrayList) {
		view.getViewTreeObserver()
				.addOnPreDrawListener(
						(ViewTreeObserver.OnPreDrawListener) new ViewTreeObserver.OnPreDrawListener() {

							public boolean onPreDraw() {
								view.getViewTreeObserver()
										.removeOnPreDrawListener(
												(ViewTreeObserver.OnPreDrawListener) this);
								if (object != null) {
									// fragment.a(object, arrayList);
									arrayList.clear();
									cf cf = d.this.a(f, bl, fragment);
									arrayList.add((Object) f.d);
									arrayList.addAll(cf.values());
									// fragment.b(object, arrayList);
									d.this.a(cf, f);
									d.this.a(f, fragment, fragment2, bl, cf);
								}
								return true;
							}
						});
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(f f, cf cf, boolean bl) {
		int n = this.v == null ? 0 : this.v.size();
		for (int i = 0; i < n; ++i) {
			String string = (String) this.u.get(i);
			View view = (View) cf.get((Object) ((String) this.v.get(i)));
			if (view == null)
				continue;
			// String string2 = r.a(view);
			if (bl) {
				// d.a(f.a, string, string2);
				continue;
			}
			// d.a(f.a, string2, string);
		}
	}

	private static void a(f f, ArrayList arrayList, ArrayList arrayList2) {
		if (arrayList != null) {
			for (int i = 0; i < arrayList.size(); ++i) {
				String string = (String) arrayList.get(i);
				String string2 = (String) arrayList2.get(i);
				// d.a(f.a, string, string2);
			}
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean a(int n, f f, boolean bl, SparseArray sparseArray,
			SparseArray sparseArray2) {
		View view;
		ViewGroup viewGroup = (ViewGroup) this.b.p.a(n);
		if (viewGroup == null) {
			return false;
		}
		final Fragment fragment = (Fragment) sparseArray2.get(n);
		Fragment fragment2 = (Fragment) sparseArray.get(n);
		Object object = /* fragment.a(fragment, bl) */null;
		Object object2 = /* d.a(fragment, fragment2, bl) */null;
		Object object3 = /* d.b(fragment2, bl) */null;
		if (object == null && object2 == null && object3 == null) {
			return false;
		}
		ArrayList arrayList = new ArrayList();
		cf cf = null;
		if (object2 != null) {
			cf = this.a(f, fragment2, bl);
			arrayList.add((Object) f.d);
			arrayList.addAll(cf.values());
			bs bs = bl ? fragment2.Y : fragment.Y;
			if (bs != null) {
				bs.a((List) new ArrayList((Collection) cf.keySet()),
						(List) new ArrayList(cf.values()), null);
			}
		}
		ArrayList arrayList2 = new ArrayList();
		Object object4 = /* d.a(object3, fragment2, arrayList2, cf, f.d) */null;
		if (this.v != null && cf != null
				&& (view = (View) cf.get(this.v.get(0))) != null) {
			if (object4 != null) {
				// r.a(object4, view);
			}
			if (object2 != null) {
				// r.a(object2, view);
			}
		}
		t t = new t() {

			@Override
			public View a() {
				return fragment.h();
			}
		};
		if (object2 != null) {
			this.a(f, (View) viewGroup, object2, fragment, fragment2, bl,
					arrayList);
		}
		ArrayList arrayList3 = new ArrayList();
		cf cf2 = new cf();
		boolean bl2 = bl ? fragment.y() : fragment.x();
		Object object5 = /* r.a(object, object4, object2, bl2) */null;
		if (object5 != null) {
			// r.a(object, object2, (View) viewGroup, t, f.d, f.c, (Map) f.a,
			// arrayList3, (Map) cf2, arrayList);
			this.a((View) viewGroup, f, n, object5);
			// r.a(object5, f.d, true);
			this.a(f, n, object5);
			// r.a(viewGroup, object5);
			// r.a((View) viewGroup, f.d, object, arrayList3, object4,
			// arrayList2,
			// object2, arrayList, object5, f.b, (Map) cf2);
		}
		if (object5 != null) {
			return true;
		}
		return false;
	}

	private cf b(f f, Fragment fragment, boolean bl) {
		cf cf = new cf();
		View view = fragment.h();
		if (view != null && this.u != null) {
			// r.a((Map) cf, view);
			if (bl) {
				// cf = d.a(this.u, this.v, cf);
			}
		} else {
			return cf;
		}
		cf.a((Collection) this.v);
		return cf;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static Object b(Fragment fragment, boolean bl) {
		Object object;
		if (fragment == null) {
			return null;
		}
		if (bl) {
			object = fragment.s();
			do {
				// return r.a(object);
				break;
			} while (true);
		}
		object = fragment.t();
		return object;// r.a(object);
	}

	private void b(SparseArray sparseArray, Fragment fragment) {
		int n;
		if (fragment != null && (n = fragment.y) != 0) {
			sparseArray.put(n, (Object) fragment);
		}
	}

	/*
	 * Unable to fully structure code Enabled force condition propagation Lifted
	 * jumps to return sites
	 */
	private void b(SparseArray var1, SparseArray var2) {
		if (this.b.p.a()) {
			for (e var5 = this.c; var5 != null; var5 = var5.a) {
				switch (var5.c) {
				case 1:
					this.b(var2, (Fragment) var5.d);
					break;
				case 2:
					Fragment var4 = var5.d;
					Fragment var6;
					if (this.b.g != null) {
						int var3 = 0;

						while (true) {
							var6 = var4;
							if (var3 >= this.b.g.size()) {
								break;
							}

							// label35: {
							Fragment var7 = (Fragment) this.b.g.get(var3);
							if (var4 != null) {
								var6 = var4;
								if (var7.y != var4.y) {
									// break label35;
								}
							}

							if (var7 == var4) {
								var6 = null;
							} else {
								a((SparseArray) var1, (Fragment) var7);
								var6 = var4;
							}

							++var3;
							var4 = var6;
						}
					} else {
						var6 = var4;
					}

					this.b(var2, (Fragment) var6);
					break;
				case 3:
					a((SparseArray) var1, (Fragment) var5.d);
					break;
				case 4:
					a((SparseArray) var1, (Fragment) var5.d);
					break;
				case 5:
					this.b(var2, (Fragment) var5.d);
					break;
				case 6:
					a((SparseArray) var1, (Fragment) var5.d);
					break;
				case 7:
					this.b(var2, (Fragment) var5.d);
				}
			}
		}

	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void b(f var1, cf var2, boolean var3) {
		int var5 = var2.size();

		for (int var4 = 0; var4 < var5; ++var4) {
			String var6 = (String) var2.b(var4);
			String var7 = /* r.a((View)((View)var2.c(var4))) */"";
			if (var3) {
				a((cf) var1.a, (String) var6, (String) var7);
			} else {
				a((cf) var1.a, (String) var7, (String) var6);
			}
		}

	}

	public int a() {
		return this.a(false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	int a(boolean bl) {
		if (this.o) {
			throw new IllegalStateException("commit already called");
		}
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("Commit: " + (Object) this));
			this.a("  ", null, new PrintWriter((Writer) new ci(
					"FragmentManager")), null);
		}
		this.o = true;
		this.p = this.l ? this.b.a(this) : -1;
		this.b.a((Runnable) this, bl);
		return this.p;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public f a(boolean var1, f var2, SparseArray var3, SparseArray var4) {
		if (a) {
			Log.v("FragmentManager", "popFromBackStack: " + this);
			this.a("  ", (FileDescriptor) null, new PrintWriter(new ci(
					"FragmentManager")), (String[]) null);
		}

		f var9 = var2;
		if (a) {
			if (var2 == null) {
				// label82: {
				if (var3.size() == 0) {
					var9 = var2;
					if (var4.size() == 0) {
						// break label82;
					}
				}

				var9 = this.a((SparseArray) var3, (SparseArray) var4, true);
				// }
			} else {
				var9 = var2;
				if (!var1) {
					a((f) var2, (ArrayList) this.v, (ArrayList) this.u);
					var9 = var2;
				}
			}
		}

		this.a(-1);
		int var5;
		if (var9 != null) {
			var5 = 0;
		} else {
			var5 = this.k;
		}

		int var6;
		if (var9 != null) {
			var6 = 0;
		} else {
			var6 = this.j;
		}

		for (e var10 = this.d; var10 != null; var10 = var10.b) {
			int var7;
			if (var9 != null) {
				var7 = 0;
			} else {
				var7 = var10.g;
			}

			int var8;
			if (var9 != null) {
				var8 = 0;
			} else {
				var8 = var10.h;
			}

			Fragment var11;
			switch (var10.c) {
			case 1:
				var11 = var10.d;
				var11.H = var8;
				this.b.a(var11, var6, var5);
				break;
			case 2:
				var11 = var10.d;
				if (var11 != null) {
					var11.H = var8;
					this.b.a(var11, var6, var5);
				}

				if (var10.i != null) {
					for (var8 = 0; var8 < var10.i.size(); ++var8) {
						var11 = (Fragment) var10.i.get(var8);
						var11.H = var7;
						this.b.a((Fragment) var11, false);
					}
				}
				break;
			case 3:
				var11 = var10.d;
				var11.H = var7;
				this.b.a((Fragment) var11, false);
				break;
			case 4:
				var11 = var10.d;
				var11.H = var7;
				this.b.c(var11, /* n.c(var6) */var7, var5);
				break;
			case 5:
				var11 = var10.d;
				var11.H = var8;
				this.b.b(var11, /* n.c(var6) */var8, var5);
				break;
			case 6:
				var11 = var10.d;
				var11.H = var7;
				this.b.e(var11,/* n.c(var6) */var7, var5);
				break;
			case 7:
				var11 = var10.d;
				var11.H = var7;
				this.b.d(var11, /* n.c(var6) */var7, var5);
				break;
			default:
				throw new IllegalArgumentException("Unknown cmd: " + var10.c);
			}
		}

		if (var1) {
			this.b.a(this.b.n, /* n.c(var6) */var6, var5, true);
			var9 = null;
		}

		if (this.p >= 0) {
			this.b.b(this.p);
			this.p = -1;
		}

		return var9;
	}

	public q a(int n, Fragment fragment, String string) {
		this.a(n, fragment, string, 1);
		return this;
	}

	public q a(Fragment fragment) {
		e e = new e();
		e.c = 6;
		e.d = fragment;
		this.a(e);
		return this;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(int n) {
		if (this.l) {
			if (a) {
				Log.v((String) "FragmentManager", (String) ("Bump nesting in "
						+ (Object) this + " by " + n));
			}
			e e = this.c;
			while (e != null) {
				if (e.d != null) {
					Fragment fragment = e.d;
					fragment.s = n + fragment.s;
					if (a) {
						Log.v((String) "FragmentManager",
								(String) ("Bump nesting of " + (Object) e.d
										+ " to " + e.d.s));
					}
				}
				if (e.i != null) {
					for (int i = -1 + e.i.size(); i >= 0; --i) {
						Fragment fragment = (Fragment) e.i.get(i);
						fragment.s = n + fragment.s;
						if (!a)
							continue;
						Log.v((String) "FragmentManager",
								(String) ("Bump nesting of "
										+ (Object) fragment + " to " + fragment.s));
					}
				}
				e = e.a;
			}
		}
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	public void a(SparseArray var1, SparseArray var2) {
		if (this.b.p.a()) {
			for (e var4 = this.c; var4 != null; var4 = var4.a) {
				switch (var4.c) {
				case 1:
					a((SparseArray) var1, (Fragment) var4.d);
					break;
				case 2:
					if (var4.i != null) {
						for (int var3 = var4.i.size() - 1; var3 >= 0; --var3) {
							this.b(var2,
									(Fragment) ((Fragment) var4.i.get(var3)));
						}
					}

					a((SparseArray) var1, (Fragment) var4.d);
					break;
				case 3:
					this.b(var2, (Fragment) var4.d);
					break;
				case 4:
					this.b(var2, (Fragment) var4.d);
					break;
				case 5:
					a((SparseArray) var1, (Fragment) var4.d);
					break;
				case 6:
					this.b(var2, (Fragment) var4.d);
					break;
				case 7:
					a((SparseArray) var1, (Fragment) var4.d);
				}
			}
		}

	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(e e) {
		if (this.c == null) {
			this.d = e;
			this.c = e;
		} else {
			e.b = this.d;
			this.d.a = e;
			this.d = e;
		}
		e.e = this.f;
		e.f = this.g;
		e.g = this.h;
		e.h = this.i;
		this.e = 1 + this.e;
	}

	public void a(String string, FileDescriptor fileDescriptor,
			PrintWriter printWriter, String[] arrstring) {
		this.a(string, printWriter, true);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(String string, PrintWriter printWriter, boolean bl) {
		if (bl) {
			printWriter.print(string);
			printWriter.print("mName=");
			printWriter.print(this.n);
			printWriter.print(" mIndex=");
			printWriter.print(this.p);
			printWriter.print(" mCommitted=");
			printWriter.println(this.o);
			if (this.j != 0) {
				printWriter.print(string);
				printWriter.print("mTransition=#");
				printWriter.print(Integer.toHexString((int) this.j));
				printWriter.print(" mTransitionStyle=#");
				printWriter.println(Integer.toHexString((int) this.k));
			}
			if (this.f != 0 || this.g != 0) {
				printWriter.print(string);
				printWriter.print("mEnterAnim=#");
				printWriter.print(Integer.toHexString((int) this.f));
				printWriter.print(" mExitAnim=#");
				printWriter.println(Integer.toHexString((int) this.g));
			}
			if (this.h != 0 || this.i != 0) {
				printWriter.print(string);
				printWriter.print("mPopEnterAnim=#");
				printWriter.print(Integer.toHexString((int) this.h));
				printWriter.print(" mPopExitAnim=#");
				printWriter.println(Integer.toHexString((int) this.i));
			}
			if (this.q != 0 || this.r != null) {
				printWriter.print(string);
				printWriter.print("mBreadCrumbTitleRes=#");
				printWriter.print(Integer.toHexString((int) this.q));
				printWriter.print(" mBreadCrumbTitleText=");
				printWriter.println((Object) this.r);
			}
			if (this.s != 0 || this.t != null) {
				printWriter.print(string);
				printWriter.print("mBreadCrumbShortTitleRes=#");
				printWriter.print(Integer.toHexString((int) this.s));
				printWriter.print(" mBreadCrumbShortTitleText=");
				printWriter.println((Object) this.t);
			}
		}
		if (this.c != null) {
			printWriter.print(string);
			printWriter.println("Operations:");
			String string2 = string + "    ";
			e e = this.c;
			int n = 0;
			e e2 = e;
			while (e2 != null) {
				String string3;
				switch (e2.c) {
				default: {
					string3 = "cmd=" + e2.c;
					break;
				}
				case 0: {
					string3 = "NULL";
					break;
				}
				case 1: {
					string3 = "ADD";
					break;
				}
				case 2: {
					string3 = "REPLACE";
					break;
				}
				case 3: {
					string3 = "REMOVE";
					break;
				}
				case 4: {
					string3 = "HIDE";
					break;
				}
				case 5: {
					string3 = "SHOW";
					break;
				}
				case 6: {
					string3 = "DETACH";
					break;
				}
				case 7: {
					string3 = "ATTACH";
				}
				}
				printWriter.print(string);
				printWriter.print("  Op #");
				printWriter.print(n);
				printWriter.print(": ");
				printWriter.print(string3);
				printWriter.print(" ");
				printWriter.println((Object) e2.d);
				if (bl) {
					if (e2.e != 0 || e2.f != 0) {
						printWriter.print(string);
						printWriter.print("enterAnim=#");
						printWriter.print(Integer.toHexString((int) e2.e));
						printWriter.print(" exitAnim=#");
						printWriter.println(Integer.toHexString((int) e2.f));
					}
					if (e2.g != 0 || e2.h != 0) {
						printWriter.print(string);
						printWriter.print("popEnterAnim=#");
						printWriter.print(Integer.toHexString((int) e2.g));
						printWriter.print(" popExitAnim=#");
						printWriter.println(Integer.toHexString((int) e2.h));
					}
				}
				if (e2.i != null && e2.i.size() > 0) {
					for (int i = 0; i < e2.i.size(); ++i) {
						printWriter.print(string2);
						if (e2.i.size() == 1) {
							printWriter.print("Removed: ");
						} else {
							if (i == 0) {
								printWriter.println("Removed:");
							}
							printWriter.print(string2);
							printWriter.print("  #");
							printWriter.print(i);
							printWriter.print(": ");
						}
						printWriter.println(e2.i.get(i));
					}
				}
				e2 = e2.a;
				++n;
			}
		}
	}

	public String b() {
		return this.n;
	}

	public q b(Fragment fragment) {
		e e = new e();
		e.c = 7;
		e.d = fragment;
		this.a(e);
		return this;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	public void run() {
		if (a) {
			Log.v("FragmentManager", "Run: " + this);
		}

		if (this.l && this.p < 0) {
			throw new IllegalStateException(
					"addToBackStack() called after commit()");
		} else {
			this.a(1);
			f var12;
			if (a) {
				SparseArray var6 = new SparseArray();
				SparseArray var7 = new SparseArray();
				this.b(var6, (SparseArray) var7);
				var12 = this.a((SparseArray) var6, (SparseArray) var7, false);
			} else {
				var12 = null;
			}

			int var1;
			if (var12 != null) {
				var1 = 0;
			} else {
				var1 = this.k;
			}

			int var2;
			if (var12 != null) {
				var2 = 0;
			} else {
				var2 = this.j;
			}

			for (e var8 = this.c; var8 != null; var8 = var8.a) {
				int var3;
				if (var12 != null) {
					var3 = 0;
				} else {
					var3 = var8.e;
				}

				int var4;
				if (var12 != null) {
					var4 = 0;
				} else {
					var4 = var8.f;
				}

				Fragment var11;
				switch (var8.c) {
				case 1:
					var11 = var8.d;
					var11.H = var3;
					this.b.a((Fragment) var11, false);
					break;
				case 2:
					var11 = var8.d;
					Fragment var9;
					if (this.b.g != null) {
						int var5 = 0;

						while (true) {
							var9 = var11;
							if (var5 >= this.b.g.size()) {
								break;
							}

							Fragment var10 = (Fragment) this.b.g.get(var5);
							if (a) {
								Log.v("FragmentManager", "OP_REPLACE: adding="
										+ var11 + " old=" + var10);
							}

							// label90: {
							if (var11 != null) {
								var9 = var11;
								if (var10.y != var11.y) {
									// break label90;
								}
							}

							if (var10 == var11) {
								var8.d = null;
								var9 = null;
							} else {
								if (var8.i == null) {
									var8.i = new ArrayList();
								}

								var8.i.add(var10);
								var10.H = var4;
								if (this.l) {
									++var10.s;
									if (a) {
										Log.v("FragmentManager",
												"Bump nesting of " + var10
														+ " to " + var10.s);
									}
								}

								this.b.a(var10, var2, var1);
								var9 = var11;
							}

							++var5;
							var11 = var9;
						}
					} else {
						var9 = var11;
					}

					if (var9 != null) {
						var9.H = var3;
						this.b.a((Fragment) var9, false);
					}
					break;
				case 3:
					var11 = var8.d;
					var11.H = var4;
					this.b.a(var11, var2, var1);
					break;
				case 4:
					var11 = var8.d;
					var11.H = var4;
					this.b.b(var11, var2, var1);
					break;
				case 5:
					var11 = var8.d;
					var11.H = var3;
					this.b.c(var11, var2, var1);
					break;
				case 6:
					var11 = var8.d;
					var11.H = var4;
					this.b.d(var11, var2, var1);
					break;
				case 7:
					var11 = var8.d;
					var11.H = var3;
					this.b.e(var11, var2, var1);
					break;
				default:
					throw new IllegalArgumentException("Unknown cmd: " + var8.c);
				}
			}

			this.b.a(this.b.n, var2, var1, true);
			if (this.l) {
				this.b.b((d) this);
			}

		}
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(128);
		stringBuilder.append("BackStackEntry{");
		stringBuilder.append(Integer.toHexString((int) System
				.identityHashCode((Object) this)));
		if (this.p >= 0) {
			stringBuilder.append(" #");
			stringBuilder.append(this.p);
		}
		if (this.n != null) {
			stringBuilder.append(" ");
			stringBuilder.append(this.n);
		}
		stringBuilder.append("}");
		return stringBuilder.toString();
	}

}
