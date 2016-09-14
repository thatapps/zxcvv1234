package com.main;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;

import com.android.support.v4.app1.Fragment;
import com.android.support.v4.app1.FragmentManagerState;
import com.android.support.v4.app1.FragmentState;

public final class n extends l implements dh {
	static final Interpolator A;
	static final Interpolator B;
	static final Interpolator C;
	public static boolean a;
	static final boolean b;
	static final Interpolator z;
	ArrayList c;
	public Runnable[] d;
	boolean e;
	public ArrayList f;
	public ArrayList g;
	ArrayList h;
	ArrayList i;
	ArrayList j;
	ArrayList k;
	ArrayList l;
	ArrayList m;
	int n = 0;
	i o;
	k p;
	Fragment q;
	boolean r;
	boolean s;
	boolean t;
	String u;
	boolean v;
	Bundle w = null;
	SparseArray x = null;
	Runnable y;

	static {
		a = false;
		int n = Build.VERSION.SDK_INT;
		boolean bl = false;
		if (n >= 11) {
			bl = true;
		}
		b = bl;
		z = new DecelerateInterpolator(2.5f);
		A = new DecelerateInterpolator(1.5f);
		B = new AccelerateInterpolator(2.5f);
		C = new AccelerateInterpolator(1.5f);
	}

	public n() {
		this.y = new Runnable() {

			public void run() {
				n.this.e();
			}
		};
	}

	static Animation a(Context context, float f, float f2) {
		AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
		alphaAnimation.setInterpolator(A);
		alphaAnimation.setDuration(220);
		return alphaAnimation;
	}

	static Animation a(Context context, float f, float f2, float f3, float f4) {
		AnimationSet animationSet = new AnimationSet(false);
		ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1,
				0.5f, 1, 0.5f);
		scaleAnimation.setInterpolator(z);
		scaleAnimation.setDuration(220);
		animationSet.addAnimation((Animation) scaleAnimation);
		AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
		alphaAnimation.setInterpolator(A);
		alphaAnimation.setDuration(220);
		animationSet.addAnimation((Animation) alphaAnimation);
		return animationSet;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private void a(RuntimeException runtimeException) {
		Log.e((String) "FragmentManager",
				(String) runtimeException.getMessage());
		Log.e((String) "FragmentManager", (String) "Activity state:");
		PrintWriter printWriter = new PrintWriter((Writer) new ci(
				"FragmentManager"));
		if (this.o != null) {
			try {
				this.o.dump("  ", null, printWriter, new String[0]);
			} catch (Exception var7_3) {
				Log.e((String) "FragmentManager",
						(String) "Failed dumping state", (Throwable) var7_3);
				throw runtimeException;
			}
			do {
				throw runtimeException;
				// break;
			} while (true);
		}
		try {
			this.a("  ", null, printWriter, new String[0]);
			throw runtimeException;
		} catch (Exception var5_4) {
			Log.e((String) "FragmentManager", (String) "Failed dumping state",
					(Throwable) var5_4);
			throw runtimeException;
		}
	}

	public static int b(int n, boolean bl) {
		switch (n) {
		default: {
			return -1;
		}
		case 4097: {
			if (bl) {
				return 1;
			}
			return 2;
		}
		case 8194: {
			if (bl) {
				return 3;
			}
			return 4;
		}
		case 4099:
		}
		if (bl) {
			return 5;
		}
		return 6;
	}

	public static int c(int n) {
		switch (n) {
		default: {
			return 0;
		}
		case 4097: {
			return 8194;
		}
		case 8194: {
			return 4097;
		}
		case 4099:
		}
		return 4099;
	}

	private void u() {
		if (this.s) {
			throw new IllegalStateException(
					"Can not perform this action after onSaveInstanceState");
		}
		if (this.u != null) {
			throw new IllegalStateException(
					"Can not perform this action inside of " + this.u);
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public int a(d d) {
		n n = this;
		synchronized (n) {
			if (this.l == null || this.l.size() <= 0) {
				if (this.k == null) {
					this.k = new ArrayList();
				}
				int n2 = this.k.size();
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("Setting back stack index " + n2 + " to " + (Object) d));
				}
				this.k.add((Object) d);
				return n2;
			}
			int n3 = (Integer) this.l.remove(-1 + this.l.size());
			if (a) {
				Log.v((String) "FragmentManager",
						(String) ("Adding back stack index " + n3 + " with " + (Object) d));
			}
			this.k.set(n3, (Object) d);
			return n3;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public Fragment a(int n) {
		Fragment fragment = null;
		if (this.g != null) {
			for (int i = -1 + this.g.size(); i >= 0; --i) {
				fragment = (Fragment) this.g.get(i);
				if (fragment != null && x.keyAt(i) == n)
					return fragment;
				{
					continue;
				}
			}
		} else {
			if (this.f == null)
				return null;
			{
				for (int i = -1 + this.f.size(); i >= 0; --i) {
					fragment = (Fragment) this.f.get(i);
					if (fragment != null && x.keyAt(i) == n)
						return fragment;
					{
						continue;
					}
				}
			}
			return null;
		}
		return fragment;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public Fragment a(Bundle bundle, String string) {
		Fragment fragment;
		int n = bundle.getInt(string, -1);
		if (n == -1) {
			return null;
		}
		if (n >= this.f.size()) {
			this.a((RuntimeException) new IllegalStateException(
					"Fragment no longer exists for key " + string + ": index "
							+ n));
		}
		if ((fragment = (Fragment) this.f.get(n)) != null)
			return fragment;
		this.a((RuntimeException) new IllegalStateException(
				"Fragment no longer exists for key " + string + ": index " + n));
		return fragment;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	@Override
	public Fragment a(String string) {
		Fragment fragment = null;
		if (this.g != null && string != null) {
			for (int i = -1 + this.g.size(); i >= 0; --i) {
				fragment = (Fragment) this.g.get(i);
				if (fragment != null && string.equals(x.get(x.keyAt(i))))
					return fragment;
				{
					continue;
				}
			}
		} else {
			if (this.f == null || string == null)
				return null;
			{
				for (int i = -1 + this.f.size(); i >= 0; --i) {
					fragment = (Fragment) this.f.get(i);
					if (fragment != null && string.equals(x.get(x.keyAt(i))))
						return fragment;
					{
						continue;
					}
				}
			}
			return null;
		}
		return fragment;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	public View a(View var1, String var2, Context var3, AttributeSet var4) {
		if (!"fragment".equals(var2)) {
			return null;
		} else {
			String var8 = var4.getAttributeValue((String) null, "class");
			TypedArray var11 = var3.obtainStyledAttributes(var4, null);
			if (var8 == null) {
				var8 = var11.getString(0);
			}

			int var7 = var11.getResourceId(1, -1);
			String var9 = var11.getString(2);
			var11.recycle();
			if (!Fragment.b((Context) this.o, (String) var8)) {
				return null;
			} else {
				int var5;
				if (var1 != null) {
					var5 = var1.getId();
				} else {
					var5 = 0;
				}

				if (var5 == -1 && var7 == -1 && var9 == null) {
					throw new IllegalArgumentException(
							var4.getPositionDescription()
									+ ": Must specify unique android:id, android:tag, or have a parent with an id for "
									+ var8);
				} else {
					Fragment var12;
					if (var7 != -1) {
						var12 = this.a(var7);
					} else {
						var12 = null;
					}

					Fragment var10 = var12;
					if (var12 == null) {
						var10 = var12;
						if (var9 != null) {
							var10 = a((String) var9);
						}
					}

					var12 = var10;
					if (var10 == null) {
						var12 = var10;
						if (var5 != -1) {
							var12 = this.a(var5);
						}
					}

					if (a) {
						Log.v("FragmentManager", "onCreateView: id=0x"
								+ Integer.toHexString(var7) + " fname=" + var8
								+ " existing=" + var12);
					}

					if (var12 == null) {
						var10 = var12.a(var3, (String) var8);
						var12.p = true;
						int var6;
						if (var7 != 0) {
							var6 = var7;
						} else {
							var6 = var5;
						}

						var10.x = var6;
						var10.y = var5;
						var10.z = var9;
						var10.q = true;
						var10.t = this;
						var10.a((Activity) this.o, (AttributeSet) var4, var10.e);
						this.a((Fragment) var10, true);
					} else {
						if (var12.q) {
							throw new IllegalArgumentException(
									var4.getPositionDescription()
											+ ": Duplicate id 0x"
											+ Integer.toHexString(var7)
											+ ", tag " + var9
											+ ", or parent id 0x"
											+ Integer.toHexString(var5)
											+ " with another fragment for "
											+ var8);
						}

						var12.q = true;
						if (!var12.D) {
							var12.a((Activity) this.o, (AttributeSet) var4,
									var12.e);
						}

						var10 = var12;
					}

					if (this.n < 1 && var10.p) {
						this.a(var10, 1, 0, 0, false);
					} else {
						this.b((Fragment) var10);
					}

					if (var10.J == null) {
						throw new IllegalStateException("Fragment " + var8
								+ " did not create a view.");
					} else {
						if (var7 != 0) {
							var10.J.setId(var7);
						}

						if (var10.J.getTag() == null) {
							var10.J.setTag(var9);
						}

						return var10.J;
					}
				}
			}
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	Animation a(Fragment fragment, int n, boolean bl, int n2) {
		Animation animation = fragment.a(n, bl, fragment.H);
		if (animation != null
				|| fragment.H != 0
				&& (animation = AnimationUtils.loadAnimation((Context) this.o,
						(int) fragment.H)) != null) {
			return animation;
		}
		if (n == 0) {
			return null;
		}
		int n3 = b(n, bl);
		if (n3 < 0) {
			return null;
		}
		switch (n3) {
		default: {
			if (n2 == 0 && this.o.getWindow() != null) {
				n2 = this.o.getWindow().getAttributes().windowAnimations;
			}
			if (n2 != 0)
				break;
			return null;
		}
		case 1: {
			return a((Context) this.o, 1.125f, 1.0f, 0.0f, 1.0f);
		}
		case 2: {
			return a((Context) this.o, 1.0f, 0.975f, 1.0f, 0.0f);
		}
		case 3: {
			return a((Context) this.o, 0.975f, 1.0f, 0.0f, 1.0f);
		}
		case 4: {
			return a((Context) this.o, 1.0f, 1.075f, 1.0f, 0.0f);
		}
		case 5: {
			return a((Context) this.o, 0.0f, 1.0f);
		}
		case 6: {
			return a((Context) this.o, 1.0f, 0.0f);
		}
		}
		return null;
	}

	@Override
	public q a() {
		return new d(this);
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	void a(int i1, int j1, int k1, boolean flag) {
		if (o == null && i1 != 0) {
			throw new IllegalStateException("No activity");
		}
		if (flag || n != i1) {
			n = i1;
			if (f != null) {
				int l1 = 0;
				boolean flag1 = false;
				for (; l1 < f.size(); l1++) {
					Fragment fragment = (Fragment) f.get(l1);
					if (fragment == null) {
						continue;
					}
					a(fragment, i1, j1, k1, false);
					if (fragment.N != null) {
						flag1 |= fragment.N.a();
					}
				}

				if (!flag1) {
					d();
				}
				if (r && o != null && n == 5) {
					o.d();
					r = false;
					return;
				}
			}
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a(int n, d d) {
		n n2 = this;
		synchronized (n2) {
			int n3;
			if (this.k == null) {
				this.k = new ArrayList();
			}
			if (n < (n3 = this.k.size())) {
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("Setting back stack index " + n + " to " + (Object) d));
				}
				this.k.set(n, (Object) d);
			} else {
				for (; n3 < n; ++n3) {
					this.k.add((Object) null);
					if (this.l == null) {
						this.l = new ArrayList();
					}
					if (a) {
						Log.v((String) "FragmentManager",
								(String) ("Adding available back stack index " + n3));
					}
					this.l.add((Object) n3);
				}
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("Adding back stack index " + n + " with " + (Object) d));
				}
				this.k.add((Object) d);
			}
			return;
		}
	}

	void a(int n, boolean bl) {
		this.a(n, 0, 0, bl);
	}

	public void a(Configuration configuration) {
		if (this.g != null) {
			for (int i = 0; i < this.g.size(); ++i) {
				Fragment fragment = (Fragment) this.g.get(i);
				if (fragment == null)
					continue;
				fragment.a(configuration);
			}
		}
	}

	public void a(Bundle bundle, String string, Fragment fragment) {
		if (fragment.g < 0) {
			this.a((RuntimeException) new IllegalStateException("Fragment "
					+ (Object) fragment
					+ " is not currently in the FragmentManager"));
		}
		bundle.putInt(string, fragment.g);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void a(Parcelable parcelable, ArrayList arrayList) {
		if (parcelable == null) {
			return;
		}
		FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
		Fragment fragment = null;
		if (fragmentManagerState.a == null)
			return;
		if (arrayList != null) {
			for (int i = 0; i < arrayList.size(); ++i) {
				fragment = (Fragment) arrayList.get(i);
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("restoreAllState: re-attaching retained " + (Object) fragment));
				}
				FragmentState fragmentState = fragmentManagerState.a[fragment.g];
				fragmentState.k = fragment;
				fragment.f = null;
				fragment.s = 0;
				fragment.q = false;
				fragment.m = false;
				fragment.j = null;
				if (fragmentState.j == null)
					continue;
				fragmentState.j.setClassLoader(this.o.getClassLoader());
				fragment.f = fragmentState.j
						.getSparseParcelableArray("android:view_state");
				fragment.e = fragmentState.j;
			}
		}
		this.f = new ArrayList(fragmentManagerState.a.length);
		if (this.h != null) {
			this.h.clear();
		}
		for (int i = 0; i < fragmentManagerState.a.length; ++i) {
			FragmentState fragmentState = fragmentManagerState.a[i];
			if (fragmentState != null) {
				fragment = fragmentState.a(fragment.i, this.q);
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("restoreAllState: active #" + i + ": " + (Object) fragment));
				}
				this.f.add((Object) fragment);
				fragmentState.k = null;
				continue;
			}
			this.f.add((Object) null);
			if (this.h == null) {
				this.h = new ArrayList();
			}
			if (a) {
				Log.v((String) "FragmentManager",
						(String) ("restoreAllState: avail #" + i));
			}
			this.h.add((Object) i);
		}
		if (arrayList != null) {
			for (int j = 0; j < arrayList.size(); ++j) {
				fragment = (Fragment) arrayList.get(j);
				if (fragment.k < 0)
					continue;
				if (fragment.k < this.f.size()) {
					fragment.j = (Fragment) this.f.get(fragment.k);
					continue;
				}
				Log.w((String) "FragmentManager",
						(String) ("Re-attaching retained fragment "
								+ (Object) fragment
								+ " target no longer exists: " + fragment.k));
				fragment.j = null;
			}
		}
		if (fragmentManagerState.b == null) {
			this.g = null;
		} else {
			this.g = new ArrayList(fragmentManagerState.b.length);
			for (int j = 0; j < fragmentManagerState.b.length; ++j) {
				fragment = (Fragment) this.f.get(fragmentManagerState.b[j]);
				if (fragment == null) {
					this.a((RuntimeException) new IllegalStateException(
							"No instantiated fragment for index #"
									+ fragmentManagerState.b[j]));
				}
				fragment.m = true;
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("restoreAllState: added #" + j + ": " + (Object) fragment));
				}
				if (this.g.contains((Object) fragment)) {
					throw new IllegalStateException("Already added!");
				}
				this.g.add((Object) fragment);
			}
		}
		if (fragmentManagerState.c == null) {
			this.i = null;
			return;
		}
		this.i = new ArrayList(fragmentManagerState.c.length);
		for (int j = 0; j < fragmentManagerState.c.length; ++j) {
			d d = fragmentManagerState.c[j].a(this);
			if (a) {
				Log.v((String) "FragmentManager",
						(String) ("restoreAllState: back stack #" + j
								+ " (index " + d.p + "): " + (Object) d));
				d.a("  ", new PrintWriter((Writer) new ci("FragmentManager")),
						false);
			}
			this.i.add((Object) d);
			if (d.p < 0)
				continue;
			this.a(d.p, d);
		}
	}

	public void a(Fragment fragment) {
		if (fragment.L) {
			if (this.e) {
				this.v = true;
			}
		} else {
			return;
		}
		fragment.L = false;
		this.a(fragment, this.n, 0, 0, false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(Fragment fragment, int n, int n2) {
		if (a) {
			Log.v((String) "FragmentManager", (String) ("remove: "
					+ (Object) fragment + " nesting=" + fragment.s));
		}
		boolean bl = !fragment.a();
		if (!fragment.B || bl) {
			if (this.g != null) {
				this.g.remove((Object) fragment);
			}
			if (fragment.E && fragment.F) {
				this.r = true;
			}
			fragment.m = false;
			fragment.n = true;
			int n3 = bl ? 0 : 1;
			this.a(fragment, n3, n, n2, false);
		}
	}

	void a(final Fragment var1, int var2, int var3, int var4, boolean var5) {
		int var6;
		// label238: {
		if (var1.m) {
			var6 = var2;
			if (!var1.B) {
				// break label238;
			}
		}

		var6 = var2;
		if (var2 > 1) {
			var6 = 1;
		}
		// }

		int var7 = var6;
		if (var1.n) {
			var7 = var6;
			if (var6 > var1.b) {
				var7 = var1.b;
			}
		}

		var2 = var7;
		if (var1.L) {
			var2 = var7;
			if (var1.b < 4) {
				var2 = var7;
				if (var7 > 3) {
					var2 = 3;
				}
			}
		}

		if (var1.b < var2) {
			if (var1.p && !var1.q) {
				return;
			}

			if (var1.c != null) {
				var1.c = null;
				this.a(var1, var1.d, 0, 0, true);
			}

			var6 = var2;
			int var8 = var2;
			var7 = var2;
			switch (var1.b) {
			case 0:
				if (a) {
					Log.v("FragmentManager", "moveto CREATED: " + var1);
				}

				var7 = var2;
				if (var1.e != null) {
					var1.e.setClassLoader(this.o.getClassLoader());
					var1.f = var1.e
							.getSparseParcelableArray("android:view_state");
					var1.j = this.a((Bundle) var1.e,
							(String) "android:target_state");
					if (var1.j != null) {
						var1.l = var1.e.getInt("android:target_req_state", 0);
					}

					var1.M = var1.e.getBoolean("android:user_visible_hint",
							true);
					var7 = var2;
					if (!var1.M) {
						var1.L = true;
						var7 = var2;
						if (var2 > 3) {
							var7 = 3;
						}
					}
				}

				var1.u = this.o;
				var1.w = this.q;
				n var9;
				if (this.q != null) {
					var9 = this.q.v;
				} else {
					var9 = this.o.b;
				}

				var1.t = var9;
				var1.G = false;
				var1.a((Activity) this.o);
				if (!var1.G) {
					throw new bt("Fragment " + var1
							+ " did not call through to super.onAttach()");
				}

				if (var1.w == null) {
					o.a(var1.c);
				}

				if (!var1.D) {
					var1.g(var1.e);
				}

				var1.D = false;
				var6 = var7;
				if (var1.p) {
					var1.J = var1.b(var1.b((Bundle) var1.e), (ViewGroup) null,
							var1.e);
					if (var1.J != null) {
						var1.K = var1.J;
						if (VERSION.SDK_INT >= 11) {
							// dx.a(var1.J, false);
						} else {
							// var1.J = var1.a(var1.J);
						}

						if (var1.A) {
							var1.J.setVisibility(8);
						}

						var1.a((View) var1.J, (Bundle) var1.e);
						var6 = var7;
					} else {
						var1.K = null;
						var6 = var7;
					}
				}
			case 1:
				var8 = var6;
				if (var6 > 1) {
					if (a) {
						Log.v("FragmentManager", "moveto ACTIVITY_CREATED: "
								+ var1);
					}

					if (!var1.p) {
						ViewGroup var11;
						if (var1.y != 0) {
							ViewGroup var10 = (ViewGroup) this.p.a(var1.y);
							var11 = var10;
							if (var10 == null) {
								var11 = var10;
								if (!var1.r) {
									this.a((RuntimeException) (new IllegalArgumentException(
											"No view found for id 0x"
													+ Integer
															.toHexString(var1.y)
													+ " ("
													+ var1.c().getResourceName(
															var1.y)
													+ ") for fragment " + var1)));
									var11 = var10;
								}
							}
						} else {
							var11 = null;
						}

						var1.I = var11;
						var1.J = var1.b(var1.b((Bundle) var1.e), var11, var1.e);
						if (var1.J != null) {
							var1.K = var1.J;
							if (VERSION.SDK_INT >= 11) {
								// dx.a(var1.J, false);
							} else {
								// var1.J = y.a(var1.J);
							}

							if (var11 != null) {
								Animation var12 = this
										.a(var1, var3, true, var4);
								if (var12 != null) {
									var1.J.startAnimation(var12);
								}

								var11.addView(var1.J);
							}

							if (var1.A) {
								var1.J.setVisibility(8);
							}

							var1.a((View) var1.J, (Bundle) var1.e);
						} else {
							var1.K = null;
						}
					}

					var1.h(var1.e);
					if (var1.J != null) {
						var1.a((Bundle) var1.e);
					}

					var1.e = null;
					var8 = var6;
				}
			case 2:
			case 3:
				var7 = var8;
				if (var8 > 3) {
					if (a) {
						Log.v("FragmentManager", "moveto STARTED: " + var1);
					}

					var1.A();
					var7 = var8;
				}
			case 4:
				var6 = var7;
				if (var7 > 4) {
					if (a) {
						Log.v("FragmentManager", "moveto RESUMED: " + var1);
					}

					var1.o = true;
					var1.B();
					var1.e = null;
					var1.f = null;
					var6 = var7;
				}
				break;
			default:
				var6 = var2;
			}
		} else {
			var6 = var2;
			if (var1.b > var2) {
				switch (var1.b) {
				case 5:
					if (var2 < 5) {
						if (a) {
							Log.v("FragmentManager", "movefrom RESUMED: "
									+ var1);
						}

						var1.D();
						var1.o = false;
					}
				case 4:
					if (var2 < 4) {
						if (a) {
							Log.v("FragmentManager", "movefrom STARTED: "
									+ var1);
						}

						var1.E();
					}
				case 3:
					if (var2 < 3) {
						if (a) {
							Log.v("FragmentManager", "movefrom STOPPED: "
									+ var1);
						}

						var1.F();
					}
				case 2:
					if (var2 < 2) {
						if (a) {
							Log.v("FragmentManager",
									"movefrom ACTIVITY_CREATED: " + var1);
						}

						if (var1.J != null && !this.o.isFinishing()
								&& var1.f == null) {
							this.e(var1);
						}

						var1.G();
						if (var1.J != null && var1.I != null) {
							Animation var13;
							if (this.n > 0 && !this.t) {
								var13 = this.a(var1, var3, false, var4);
							} else {
								var13 = null;
							}

							if (var13 != null) {
								var1.c = var1.J;
								var1.d = var2;
								var13.setAnimationListener(new AnimationListener() {
									public void onAnimationEnd(Animation var1x) {
										if (var1.c != null) {
											var1.c = null;
											n.this.a(var1, var1.d, 0, 0, false);
										}

									}

									public void onAnimationRepeat(
											Animation var1x) {
									}

									public void onAnimationStart(Animation var1x) {
									}
								});
								var1.J.startAnimation(var13);
							}

							var1.I.removeView(var1.J);
						}

						var1.I = null;
						var1.J = null;
						var1.K = null;
					}
				case 1:
					var6 = var2;
					if (var2 < 1) {
						if (this.t && var1.c != null) {
							View var14 = var1.c;
							var1.c = null;
							var14.clearAnimation();
						}

						if (var1.c != null) {
							var1.d = var2;
							var6 = 1;
						} else {
							if (a) {
								Log.v("FragmentManager", "movefrom CREATED: "
										+ var1);
							}

							if (!var1.D) {
								var1.H();
							}

							var1.G = false;
							var1.p();
							if (!var1.G) {
								throw new bt(
										"Fragment "
												+ var1
												+ " did not call through to super.onDetach()");
							}

							var6 = var2;
							if (!var5) {
								if (!var1.D) {
									this.d(var1);
									var6 = var2;
								} else {
									var1.u = null;
									var1.w = null;
									var1.t = null;
									var1.v = null;
									var6 = var2;
								}
							}
						}
					}
					break;
				default:
					var6 = var2;
				}
			}
		}

		var1.b = var6;
	}

	public void a(Fragment fragment, boolean bl) {
		if (this.g == null) {
			this.g = new ArrayList();
		}
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("add: " + (Object) fragment));
		}
		this.c(fragment);
		if (!fragment.B) {
			if (this.g.contains((Object) fragment)) {
				throw new IllegalStateException("Fragment already added: "
						+ (Object) fragment);
			}
			this.g.add((Object) fragment);
			fragment.m = true;
			fragment.n = false;
			if (fragment.E && fragment.F) {
				this.r = true;
			}
			if (bl) {
				this.b(fragment);
			}
		}
	}

	public void a(i i, k k, Fragment fragment) {
		if (this.o != null) {
			throw new IllegalStateException("Already attached");
		}
		this.o = i;
		this.p = k;
		this.q = fragment;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void a(Runnable runnable, boolean bl) {
		if (!bl) {
			this.u();
		}
		n n = this;
		synchronized (n) {
			if (this.t || this.o == null) {
				throw new IllegalStateException("Activity has been destroyed");
			}
			if (this.c == null) {
				this.c = new ArrayList();
			}
			this.c.add((Object) runnable);
			if (this.c.size() == 1) {
				this.o.a.removeCallbacks(this.y);
				this.o.a.post(this.y);
			}
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * Converted monitor instructions to comments Lifted jumps to return sites
	 */
	public void a(String string, FileDescriptor fileDescriptor,
			PrintWriter printWriter, String[] arrstring) {
		int n;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		int n7 = 0;
		String string2 = string + "    ";
		if (this.f != null && (n6 = this.f.size()) > 0) {
			printWriter.print(string);
			printWriter.print("Active Fragments in ");
			printWriter.print(Integer.toHexString((int) System
					.identityHashCode((Object) this)));
			printWriter.println(":");
			for (int i = 0; i < n6; ++i) {
				Fragment fragment = (Fragment) this.f.get(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(i);
				printWriter.print(": ");
				printWriter.println((Object) fragment);
				if (fragment == null)
					continue;
				a(string2, fileDescriptor, printWriter, arrstring);
			}
		}
		if (this.g != null && (n = this.g.size()) > 0) {
			printWriter.print(string);
			printWriter.println("Added Fragments:");
			for (int i = 0; i < n; ++i) {
				Fragment fragment = (Fragment) this.g.get(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(i);
				printWriter.print(": ");
				printWriter.println(fragment.toString());
			}
		}
		if (this.j != null && (n5 = this.j.size()) > 0) {
			printWriter.print(string);
			printWriter.println("Fragments Created Menus:");
			for (int i = 0; i < n5; ++i) {
				Fragment fragment = (Fragment) this.j.get(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(i);
				printWriter.print(": ");
				printWriter.println(fragment.toString());
			}
		}
		if (this.i != null && (n4 = this.i.size()) > 0) {
			printWriter.print(string);
			printWriter.println("Back Stack:");
			for (int i = 0; i < n4; ++i) {
				d d = (d) this.i.get(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(i);
				printWriter.print(": ");
				printWriter.println(d.toString());
				d.a(string2, fileDescriptor, printWriter, arrstring);
			}
		}
		n n8 = this;
		// MONITORENTER : n8
		if (this.k != null && (n3 = this.k.size()) > 0) {
			printWriter.print(string);
			printWriter.println("Back Stack Indices:");
			for (int i = 0; i < n3; ++i) {
				d d = (d) this.k.get(i);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(i);
				printWriter.print(": ");
				printWriter.println((Object) d);
			}
		}
		if (this.l != null && this.l.size() > 0) {
			printWriter.print(string);
			printWriter.print("mAvailBackStackIndices: ");
			printWriter.println(Arrays.toString((Object[]) this.l.toArray()));
		}
		// MONITOREXIT : n8
		if (this.c != null && (n2 = this.c.size()) > 0) {
			printWriter.print(string);
			printWriter.println("Pending Actions:");
			for (; n7 < n2; ++n7) {
				Runnable runnable = (Runnable) this.c.get(n7);
				printWriter.print(string);
				printWriter.print("  #");
				printWriter.print(n7);
				printWriter.print(": ");
				printWriter.println((Object) runnable);
			}
		}
		printWriter.print(string);
		printWriter.println("FragmentManager misc state:");
		printWriter.print(string);
		printWriter.print("  mActivity=");
		printWriter.println((Object) this.o);
		printWriter.print(string);
		printWriter.print("  mContainer=");
		printWriter.println((Object) this.p);
		if (this.q != null) {
			printWriter.print(string);
			printWriter.print("  mParent=");
			printWriter.println((Object) this.q);
		}
		printWriter.print(string);
		printWriter.print("  mCurState=");
		printWriter.print(this.n);
		printWriter.print(" mStateSaved=");
		printWriter.print(this.s);
		printWriter.print(" mDestroyed=");
		printWriter.println(this.t);
		if (this.r) {
			printWriter.print(string);
			printWriter.print("  mNeedMenuInvalidate=");
			printWriter.println(this.r);
		}
		if (this.u != null) {
			printWriter.print(string);
			printWriter.print("  mNoTransactionsBecause=");
			printWriter.println(this.u);
		}
		if (this.h == null)
			return;
		if (this.h.size() <= 0)
			return;
		printWriter.print(string);
		printWriter.print("  mAvailIndices: ");
		printWriter.println(Arrays.toString((Object[]) this.h.toArray()));
	}

	/*
	 * Enabled aggressive block sorting
	 */
	boolean a(Handler handler, String string, int n, int n2) {
		if (this.i == null) {
			return false;
		}
		if (string == null && n < 0 && (n2 & 1) == 0) {
			int n3 = -1 + this.i.size();
			if (n3 < 0)
				return false;
			d d = (d) this.i.remove(n3);
			SparseArray sparseArray = new SparseArray();
			SparseArray sparseArray2 = new SparseArray();
			d.a(sparseArray, sparseArray2);
			d.a(true, null, sparseArray, sparseArray2);
			this.f();
			return true;
		}
		int n4 = -1;
		if (string != null || n >= 0) {
			int n5;
			for (n5 = -1 + this.i.size(); n5 >= 0; --n5) {
				d d = (d) this.i.get(n5);
				if (string != null && string.equals((Object) d.b()) || n >= 0
						&& n == d.p)
					break;
			}
			if (n5 < 0)
				return false;
			if ((n2 & 1) != 0) {
				--n5;
				for (; n5 >= 0; --n5) {
					d d = (d) this.i.get(n5);
					if ((string == null || !string.equals((Object) d.b()))
							&& (n < 0 || n != d.p))
						break;
				}
			}
			n4 = n5;
		}
		if (n4 == -1 + this.i.size())
			return false;
		ArrayList arrayList = new ArrayList();
		for (int i = -1 + this.i.size(); i > n4; --i) {
			arrayList.add(this.i.remove(i));
		}
		int n6 = -1 + arrayList.size();
		SparseArray sparseArray = new SparseArray();
		SparseArray sparseArray3 = new SparseArray();
		for (int j = 0; j <= n6; ++j) {
			((d) arrayList.get(j)).a(sparseArray, sparseArray3);
		}
		f f = null;
		int n7 = 0;
		do {
			if (n7 > n6) {
				this.f();
				return true;
			}
			if (a) {
				Log.v((String) "FragmentManager",
						(String) ("Popping back stack state: " + arrayList
								.get(n7)));
			}
			d d = (d) arrayList.get(n7);
			boolean bl = n7 == n6;
			f f2 = d.a(bl, f, sparseArray, sparseArray3);
			++n7;
			f = f2;
		} while (true);
	}

	public boolean a(Menu menu) {
		boolean bl;
		if (this.g != null) {
			bl = false;
			for (int i = 0; i < this.g.size(); ++i) {
				Fragment fragment = (Fragment) this.g.get(i);
				if (fragment == null || !fragment.c(menu))
					continue;
				bl = true;
			}
		} else {
			bl = false;
		}
		return bl;
	}

	// public boolean a(Menu menu, MenuInflater menuInflater) {
	// boolean bl;
	// ArrayList arrayList = null;
	// if (this.g != null) {
	// bl = false;
	// for (int i = 0; i < this.g.size(); ++i) {
	// Fragment fragment = (Fragment) this.g.get(i);
	// if (fragment != null && fragment.b(menu, menuInflater)) {
	// bl = true;
	// if (arrayList == null) {
	// arrayList = new ArrayList();
	// }
	// arrayList.add((Object) fragment);
	// }
	// boolean bl2 = bl;
	// bl = bl2;
	// }
	// } else {
	// bl = false;
	// }
	// ArrayList arrayList2 = this.j;
	// if (arrayList2 != null) {
	// for (int i = 0; i < this.j.size(); ++i) {
	// Fragment fragment = (Fragment) this.j.get(i);
	// if (arrayList != null && arrayList.contains((Object) fragment))
	// continue;
	// fragment.q();
	// }
	// }
	// this.j = arrayList;
	// return bl;
	// }
	public boolean a(Menu menu, MenuInflater menuinflater) {
		boolean flag = false;
		ArrayList arraylist1 = null;
		ArrayList arraylist = null;
		boolean flag2;
		if (g != null) {
			int i1 = 0;
			boolean flag1 = false;
			do {
				arraylist1 = arraylist;
				flag2 = flag1;
				if (i1 >= g.size()) {
					break;
				}
				Fragment fragment = (Fragment) g.get(i1);
				arraylist1 = arraylist;
				flag2 = flag1;
				if (fragment != null) {
					arraylist1 = arraylist;
					flag2 = flag1;
					if (fragment.b(menu, menuinflater)) {
						flag2 = true;
						arraylist1 = arraylist;
						if (arraylist == null) {
							arraylist1 = new ArrayList();
						}
						arraylist1.add(fragment);
					}
				}
				i1++;
				flag1 = flag2;
				arraylist = arraylist1;
			} while (true);
		} else {
			flag2 = false;
		}
		if (j != null) {
			for (int j1 = ((flag) ? 1 : 0); j1 < j.size(); j1++) {
				Fragment fragment = (Fragment) j.get(j1);
				if (arraylist1 == null || !arraylist1.contains(menu)) {
					fragment.q();
				}
			}

		}
		j = arraylist1;
		return flag2;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public boolean a(MenuItem menuItem) {
		ArrayList arrayList = this.g;
		boolean bl = false;
		if (arrayList == null)
			return bl;
		int n = 0;
		do {
			int n2 = this.g.size();
			bl = false;
			if (n >= n2)
				return bl;
			Fragment fragment = (Fragment) this.g.get(n);
			if (fragment != null && fragment.c(menuItem)) {
				return true;
			}
			++n;
		} while (true);
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void b(int n) {
		n n2 = this;
		synchronized (n2) {
			this.k.set(n, (Object) null);
			if (this.l == null) {
				this.l = new ArrayList();
			}
			if (a) {
				Log.v((String) "FragmentManager",
						(String) ("Freeing back stack index " + n));
			}
			this.l.add((Object) n);
			return;
		}
	}

	void b(Fragment fragment) {
		this.a(fragment, this.n, 0, 0, false);
	}

	public void b(Fragment fragment, int n, int n2) {
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("hide: " + (Object) fragment));
		}
		if (!fragment.A) {
			fragment.A = true;
			if (fragment.J != null) {
				Animation animation = this.a(fragment, n, false, n2);
				if (animation != null) {
					fragment.J.startAnimation(animation);
				}
				fragment.J.setVisibility(8);
			}
			if (fragment.m && fragment.E && fragment.F) {
				this.r = true;
			}
			fragment.a(true);
		}
	}

	public void b(Menu menu) {
		if (this.g != null) {
			for (int i = 0; i < this.g.size(); ++i) {
				Fragment fragment = (Fragment) this.g.get(i);
				if (fragment == null)
					continue;
				fragment.d(menu);
			}
		}
	}

	void b(d d) {
		if (this.i == null) {
			this.i = new ArrayList();
		}
		this.i.add((Object) d);
		this.f();
	}

	@Override
	public boolean b() {
		return this.e();
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public boolean b(MenuItem menuItem) {
		ArrayList arrayList = this.g;
		boolean bl = false;
		if (arrayList == null)
			return bl;
		int n = 0;
		do {
			int n2 = this.g.size();
			bl = false;
			if (n >= n2)
				return bl;
			Fragment fragment = (Fragment) this.g.get(n);
			if (fragment != null && fragment.d(menuItem)) {
				return true;
			}
			++n;
		} while (true);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	void c(Fragment fragment) {
		if (fragment.g >= 0) {
			return;
		}
		if (this.h == null || this.h.size() <= 0) {
			if (this.f == null) {
				this.f = new ArrayList();
			}
			fragment.a(this.f.size(), this.q);
			this.f.add((Object) fragment);
		} else {
			fragment.a(
					((Integer) this.h.remove(-1 + this.h.size())).intValue(),
					this.q);
			this.f.set(fragment.g, (Object) fragment);
		}
		if (!a)
			return;
		Log.v((String) "FragmentManager",
				(String) ("Allocated fragment index " + (Object) fragment));
	}

	public void c(Fragment fragment, int n, int n2) {
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("show: " + (Object) fragment));
		}
		if (fragment.A) {
			fragment.A = false;
			if (fragment.J != null) {
				Animation animation = this.a(fragment, n, true, n2);
				if (animation != null) {
					fragment.J.startAnimation(animation);
				}
				fragment.J.setVisibility(0);
			}
			if (fragment.m && fragment.E && fragment.F) {
				this.r = true;
			}
			fragment.a(false);
		}
	}

	public boolean c() {
		this.u();
		this.b();
		return this.a(this.o.a, null, -1, 0);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	void d() {
		if (this.f == null) {
			return;
		}
		for (int i = 0; i < this.f.size(); ++i) {
			Fragment fragment = (Fragment) this.f.get(i);
			if (fragment == null)
				continue;
			this.a(fragment);
		}
	}

	void d(Fragment fragment) {
		if (fragment.g < 0) {
			return;
		}
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("Freeing fragment index " + (Object) fragment));
		}
		this.f.set(fragment.g, (Object) null);
		if (this.h == null) {
			this.h = new ArrayList();
		}
		this.h.add((Object) fragment.g);
		this.o.a(fragment.h);
		fragment.o();
	}

	public void d(Fragment fragment, int n, int n2) {
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("detach: " + (Object) fragment));
		}
		if (!fragment.B) {
			fragment.B = true;
			if (fragment.m) {
				if (this.g != null) {
					if (a) {
						Log.v((String) "FragmentManager",
								(String) ("remove from detach: " + (Object) fragment));
					}
					this.g.remove((Object) fragment);
				}
				if (fragment.E && fragment.F) {
					this.r = true;
				}
				fragment.m = false;
				this.a(fragment, 1, n, n2, false);
			}
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	void e(Fragment fragment) {
		if (fragment.K == null) {
			return;
		}
		if (this.x == null) {
			this.x = new SparseArray();
		} else {
			this.x.clear();
		}
		fragment.K.saveHierarchyState(this.x);
		if (this.x.size() <= 0)
			return;
		fragment.f = this.x;
		this.x = null;
	}

	public void e(Fragment fragment, int n, int n2) {
		if (a) {
			Log.v((String) "FragmentManager",
					(String) ("attach: " + (Object) fragment));
		}
		if (fragment.B) {
			fragment.B = false;
			if (!fragment.m) {
				if (this.g == null) {
					this.g = new ArrayList();
				}
				if (this.g.contains((Object) fragment)) {
					throw new IllegalStateException("Fragment already added: "
							+ (Object) fragment);
				}
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("add from attach: " + (Object) fragment));
				}
				this.g.add((Object) fragment);
				fragment.m = true;
				if (fragment.E && fragment.F) {
					this.r = true;
				}
				this.a(fragment, this.n, n, n2, false);
			}
		}
	}

	/*
	 * Exception decompiling
	 */
	public boolean e() {
		if (e) {
			throw new IllegalStateException(
					"Recursive entry to executePendingTransactions");
		}
		if (Looper.myLooper() != o.a.getLooper()) {
			throw new IllegalStateException(
					"Must be called from main thread of process");
		}
		boolean flag = false;
		// _L2:

		// JVM INSTR monitorenter ;
		if (c != null && c.size() != 0) {
			// break MISSING_BLOCK_LABEL_141;
		}
		// this;
		// JVM INSTR monitorexit ;
		int k1;
		if (!v) {
			// break MISSING_BLOCK_LABEL_274;
		}
		int i1 = 0;
		int l1;
		for (k1 = 0; i1 < f.size(); k1 = l1) {
			Fragment fragment = (Fragment) f.get(i1);
			l1 = k1;
			if (fragment != null) {
				l1 = k1;
				if (fragment.N != null) {
					l1 = k1 | fragment.b;
				}
			}
			i1++;
		}

		// break; /* Loop/switch isn't completed */
		k1 = c.size();
		if (d == null || d.length < k1) {
			d = new Runnable[k1];
		}
		c.toArray(d);
		c.clear();
		o.a.removeCallbacks(y);
		// this;
		// JVM INSTR monitorexit ;
		e = true;
		for (int j1 = 0; j1 < k1; j1++) {
			d[j1].run();
			d[j1] = null;
		}

		e = false;
		flag = true;
		// if (true) goto _L2; else goto _L1
		// _L1:
		if (k1 == 0) {
			v = false;
			d();
		}
		return flag;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	Bundle f(Fragment fragment) {
		Bundle bundle;
		if (this.w == null) {
			this.w = new Bundle();
		}
		fragment.i(this.w);
		if (!this.w.isEmpty()) {
			bundle = this.w;
			this.w = null;
		} else {
			bundle = null;
		}
		if (fragment.J != null) {
			this.e(fragment);
		}
		if (fragment.f != null) {
			if (bundle == null) {
				bundle = new Bundle();
			}
			bundle.putSparseParcelableArray("android:view_state", fragment.f);
		}
		if (!fragment.M) {
			if (bundle == null) {
				bundle = new Bundle();
			}
			bundle.putBoolean("android:user_visible_hint", fragment.M);
		}
		return bundle;
	}

	void f() {
		if (this.m != null) {
			for (int i = 0; i < this.m.size(); ++i) {
				((m) this.m.get(i)).a();
			}
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	ArrayList g() {
		ArrayList arrayList = this.f;
		ArrayList arrayList2 = null;
		if (arrayList == null) {
			return arrayList2;
		}
		for (int i = 0; i < this.f.size(); ++i) {
			Fragment fragment = (Fragment) this.f.get(i);
			if (fragment == null || !fragment.C)
				continue;
			if (arrayList2 == null) {
				arrayList2 = new ArrayList();
			}
			arrayList2.add((Object) fragment);
			fragment.D = true;
			int n = fragment.j != null ? fragment.j.g : -1;
			fragment.k = n;
			if (!a)
				continue;
			Log.v((String) "FragmentManager",
					(String) ("retainNonConfig: keeping retained " + (Object) fragment));
		}
		return arrayList2;
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public Parcelable h() {
		this.e();
		if (b) {
			this.s = true;
		}
		if (this.f == null)
			return null;
		if (this.f.size() <= 0) {
			return null;
		}
		int n = this.f.size();
		FragmentState[] arrfragmentState = new FragmentState[n];
		int n2 = 0;
		boolean bl = false;
		do {
			boolean bl2;
			if (n2 >= n) {
				if (!a)
					return null;
				Log.v((String) "FragmentManager",
						(String) "saveAllState: no fragments!");
				return null;
			}
			Fragment fragment = (Fragment) this.f.get(n2);
			if (fragment != null) {
				FragmentState fragmentState;
				if (fragment.g < 0) {
					this.a((RuntimeException) new IllegalStateException(
							"Failure saving state: active " + (Object) fragment
									+ " has cleared index: " + fragment.g));
				}
				arrfragmentState[n2] = fragmentState = new FragmentState(
						fragment);
				if (fragment.b > 0 && fragmentState.j == null) {
					fragmentState.j = this.f(fragment);
					if (fragment.j != null) {
						if (fragment.j.g < 0) {
							this.a((RuntimeException) new IllegalStateException(
									"Failure saving state: "
											+ (Object) fragment
											+ " has target not in fragment manager: "
											+ (Object) fragment.j));
						}
						if (fragmentState.j == null) {
							fragmentState.j = new Bundle();
						}
						this.a(fragmentState.j, "android:target_state",
								fragment.j);
						if (fragment.l != 0) {
							fragmentState.j.putInt("android:target_req_state",
									fragment.l);
						}
					}
				} else {
					fragmentState.j = fragment.e;
				}
				if (a) {
					Log.v((String) "FragmentManager",
							(String) ("Saved state of " + (Object) fragment
									+ ": " + (Object) fragmentState.j));
				}
				bl2 = true;
			} else {
				bl2 = bl;
			}
			++n2;
			bl = bl2;
		} while (true);
	}

	public void i() {
		this.s = false;
	}

	public void j() {
		this.s = false;
		this.a(1, false);
	}

	public void k() {
		this.s = false;
		this.a(2, false);
	}

	public void l() {
		this.s = false;
		this.a(4, false);
	}

	public void m() {
		this.s = false;
		this.a(5, false);
	}

	public void n() {
		this.a(4, false);
	}

	public void o() {
		this.s = true;
		this.a(3, false);
	}

	public void p() {
		this.a(2, false);
	}

	public void q() {
		this.a(1, false);
	}

	public void r() {
		this.t = true;
		this.e();
		this.a(0, false);
		this.o = null;
		this.p = null;
		this.q = null;
	}

	public void s() {
		if (this.g != null) {
			for (int i = 0; i < this.g.size(); ++i) {
				Fragment fragment = (Fragment) this.g.get(i);
				if (fragment == null)
					continue;
				fragment.C();
			}
		}
	}

	public dh t() {
		return this;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(128);
		stringBuilder.append("FragmentManager{");
		stringBuilder.append(Integer.toHexString((int) System
				.identityHashCode((Object) this)));
		stringBuilder.append(" in ");
		if (this.q != null) {
			ch.a((Object) this.q, stringBuilder);
		} else {
			ch.a((Object) this.o, stringBuilder);
		}
		stringBuilder.append("}}");
		return stringBuilder.toString();
	}

}
