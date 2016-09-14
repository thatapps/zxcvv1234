package com.android.support.v4.app1;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.main.bs;
import com.main.bt;
import com.main.ch;
import com.main.cp;
import com.main.cx;
import com.main.h;
import com.main.i;
import com.main.l;
import com.main.n;
import com.main.w;

public class Fragment implements ComponentCallbacks,
		View.OnCreateContextMenuListener {
	static final Object a = new Object();
	private static final cp aa = new cp();
	public boolean A;
	public boolean B;
	public boolean C;
	public boolean D;
	public boolean E;
	public boolean F = true;
	public boolean G;
	public int H;
	public ViewGroup I;
	public View J;
	public View K;
	public boolean L;
	public boolean M = true;
	public w N;
	boolean O;
	boolean P;
	Object Q = null;
	Object R = a;
	Object S = null;
	Object T = a;
	Object U = null;
	Object V = a;
	Boolean W;
	Boolean X;
	public bs Y = null;
	public bs Z = null;
	public int b = 0;
	public View c;
	public int d;
	public Bundle e;
	public SparseArray f;
	public int g = -1;
	public String h;
	public Bundle i;
	public Fragment j;
	public int k = -1;
	public int l;
	public boolean m;
	public boolean n;
	public boolean o;
	public boolean p;
	public boolean q;
	public boolean r;
	public int s;
	public n t;
	public i u;
	public n v;
	public Fragment w;
	public int x;
	public int y;
	public String z;

	public static Fragment a(Context paramContext, String paramString) {
		return a(paramContext, paramString, null);
	}

	public static Fragment a(Context paramContext, String paramString,
			Bundle paramBundle) {
		try {
			Class localClass = (Class) aa.get(paramString);
			if (localClass == null) {
				localClass = paramContext.getClassLoader().loadClass(
						paramString);
				aa.put(paramString, localClass);
			}
			Fragment localFragment = (Fragment) localClass.newInstance();
			if (paramBundle != null) {
				paramBundle.setClassLoader(localFragment.getClass()
						.getClassLoader());
				localFragment.i = paramBundle;
			}
			return localFragment;
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new h("Unable to instantiate fragment " + paramString
					+ ": make sure class name exists, is public, and has an"
					+ " empty constructor that is public",
					localClassNotFoundException);
		} catch (InstantiationException localInstantiationException) {
			throw new h("Unable to instantiate fragment " + paramString
					+ ": make sure class name exists, is public, and has an"
					+ " empty constructor that is public",
					localInstantiationException);
		} catch (IllegalAccessException localIllegalAccessException) {
			throw new h("Unable to instantiate fragment " + paramString
					+ ": make sure class name exists, is public, and has an"
					+ " empty constructor that is public",
					localIllegalAccessException);
		}
	}

	public static boolean b(Context paramContext, String paramString) {
		boolean bool1 = false;

		try {
			Class localClass = (Class) aa.get(paramString);
			if (localClass == null) {
				localClass = paramContext.getClassLoader().loadClass(
						paramString);
				aa.put(paramString, localClass);
			}
			boolean bool2 = Fragment.class.isAssignableFrom(localClass);
			bool1 = bool2;
		} catch (ClassNotFoundException localClassNotFoundException) {

		}
		return bool1;
	}

	public void A() {
		if (this.v != null) {
			this.v.i();
			this.v.e();
		}
		this.G = false;
		i();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onStart()");
		}
		if (this.v != null) {
			this.v.l();
		}
		if (this.N != null) {
			this.N.g();
		}
	}

	public void B() {
		if (this.v != null) {
			this.v.i();
			this.v.e();
		}
		this.G = false;
		j();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onResume()");
		}
		if (this.v != null) {
			this.v.m();
			this.v.e();
		}
	}

	public void C() {
		onLowMemory();
		if (this.v != null) {
			this.v.s();
		}
	}

	public void D() {
		if (this.v != null) {
			this.v.n();
		}
		this.G = false;
		k();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onPause()");
		}
	}

	public void E() {
		if (this.v != null) {
			this.v.o();
		}
		this.G = false;
		l();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onStop()");
		}
	}

	public void F() {
		if (this.v != null) {
			this.v.p();
		}
		if (this.O) {
			this.O = false;
			if (!this.P) {
				this.P = true;
				this.N = this.u.a(this.h, this.O, false);
			}
			if (this.N != null) {
				if (this.u.h) {
					this.N.d();
				}
				this.N.c();
			}
		}

	}

	public void G() {
		if (this.v != null) {
			this.v.q();
		}
		this.G = false;
		m();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onDestroyView()");
		}
		if (this.N != null) {
			this.N.f();
		}
	}

	public void H() {
		if (this.v != null) {
			this.v.r();
		}
		this.G = false;
		n();
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onDestroy()");
		}
	}

	public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup,
			Bundle paramBundle) {
		return null;
	}

	public Animation a(int paramInt1, boolean paramBoolean, int paramInt2) {
		return null;
	}

	public void a(int paramInt1, int paramInt2, Intent paramIntent) {
	}

	public final void a(int paramInt, Fragment paramFragment) {
		this.g = paramInt;
		if (paramFragment != null) {
		}
		for (this.h = (paramFragment.h + ":" + this.g);; this.h = ("android:fragment:" + this.g)) {
			return;
		}
	}

	public void a(Activity paramActivity) {
		this.G = true;
	}

	public void a(Activity paramActivity, AttributeSet paramAttributeSet,
			Bundle paramBundle) {
		this.G = true;
	}

	public void a(Configuration paramConfiguration) {
		onConfigurationChanged(paramConfiguration);
		if (this.v != null) {
			this.v.a(paramConfiguration);
		}
	}

	public final void a(Bundle paramBundle) {
		if (this.f != null) {
			this.K.restoreHierarchyState(this.f);
			this.f = null;
		}
		this.G = false;
		e(paramBundle);
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onViewStateRestored()");
		}
	}

	public void a(Menu paramMenu) {
	}

	public void a(Menu paramMenu, MenuInflater paramMenuInflater) {
	}

	public void a(View paramView, Bundle paramBundle) {
	}

	public void a(String paramString, FileDescriptor paramFileDescriptor,
			PrintWriter paramPrintWriter, String[] paramArrayOfString) {
		paramPrintWriter.print(paramString);
		paramPrintWriter.print("mFragmentId=#");
		paramPrintWriter.print(Integer.toHexString(this.x));
		paramPrintWriter.print(" mContainerId=#");
		paramPrintWriter.print(Integer.toHexString(this.y));
		paramPrintWriter.print(" mTag=");
		paramPrintWriter.println(this.z);
		paramPrintWriter.print(paramString);
		paramPrintWriter.print("mState=");
		paramPrintWriter.print(this.b);
		paramPrintWriter.print(" mIndex=");
		paramPrintWriter.print(this.g);
		paramPrintWriter.print(" mWho=");
		paramPrintWriter.print(this.h);
		paramPrintWriter.print(" mBackStackNesting=");
		paramPrintWriter.println(this.s);
		paramPrintWriter.print(paramString);
		paramPrintWriter.print("mAdded=");
		paramPrintWriter.print(this.m);
		paramPrintWriter.print(" mRemoving=");
		paramPrintWriter.print(this.n);
		paramPrintWriter.print(" mResumed=");
		paramPrintWriter.print(this.o);
		paramPrintWriter.print(" mFromLayout=");
		paramPrintWriter.print(this.p);
		paramPrintWriter.print(" mInLayout=");
		paramPrintWriter.println(this.q);
		paramPrintWriter.print(paramString);
		paramPrintWriter.print("mHidden=");
		paramPrintWriter.print(this.A);
		paramPrintWriter.print(" mDetached=");
		paramPrintWriter.print(this.B);
		paramPrintWriter.print(" mMenuVisible=");
		paramPrintWriter.print(this.F);
		paramPrintWriter.print(" mHasMenu=");
		paramPrintWriter.println(this.E);
		paramPrintWriter.print(paramString);
		paramPrintWriter.print("mRetainInstance=");
		paramPrintWriter.print(this.C);
		paramPrintWriter.print(" mRetaining=");
		paramPrintWriter.print(this.D);
		paramPrintWriter.print(" mUserVisibleHint=");
		paramPrintWriter.println(this.M);
		if (this.t != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mFragmentManager=");
			paramPrintWriter.println(this.t);
		}
		if (this.u != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mActivity=");
			paramPrintWriter.println(this.u);
		}
		if (this.w != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mParentFragment=");
			paramPrintWriter.println(this.w);
		}
		if (this.i != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mArguments=");
			paramPrintWriter.println(this.i);
		}
		if (this.e != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mSavedFragmentState=");
			paramPrintWriter.println(this.e);
		}
		if (this.f != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mSavedViewState=");
			paramPrintWriter.println(this.f);
		}
		if (this.j != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mTarget=");
			paramPrintWriter.print(this.j);
			paramPrintWriter.print(" mTargetRequestCode=");
			paramPrintWriter.println(this.l);
		}
		if (this.H != 0) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mNextAnim=");
			paramPrintWriter.println(this.H);
		}
		if (this.I != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mContainer=");
			paramPrintWriter.println(this.I);
		}
		if (this.J != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mView=");
			paramPrintWriter.println(this.J);
		}
		if (this.K != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mInnerView=");
			paramPrintWriter.println(this.J);
		}
		if (this.c != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mAnimatingAway=");
			paramPrintWriter.println(this.c);
			paramPrintWriter.print(paramString);
			paramPrintWriter.print("mStateAfterAnimating=");
			paramPrintWriter.println(this.d);
		}
		if (this.N != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.println("Loader Manager:");
			this.N.a(paramString + "  ", paramFileDescriptor, paramPrintWriter,
					paramArrayOfString);
		}
		if (this.v != null) {
			paramPrintWriter.print(paramString);
			paramPrintWriter.println("Child " + this.v + ":");
			this.v.a(paramString + "  ", paramFileDescriptor, paramPrintWriter,
					paramArrayOfString);
		}
	}

	public void a(boolean paramBoolean) {
	}

	public final boolean a() {
		if (this.s > 0) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public boolean a(MenuItem paramMenuItem) {
		return false;
	}

	public LayoutInflater b(Bundle paramBundle) {
		LayoutInflater localLayoutInflater = this.u.getLayoutInflater()
				.cloneInContext(this.u);
		d();
		cx.a(localLayoutInflater, this.v.t());
		return localLayoutInflater;
	}

	public View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup,
			Bundle paramBundle) {
		if (this.v != null) {
			this.v.i();
		}
		return a(paramLayoutInflater, paramViewGroup, paramBundle);
	}

	public final i b() {
		return this.u;
	}

	public void b(Menu paramMenu) {
	}

	public boolean b(Menu paramMenu, MenuInflater paramMenuInflater) {
		boolean bool = false;
		if (!this.A) {
			if ((this.E) && (this.F)) {
				bool = true;
				a(paramMenu, paramMenuInflater);
			}
			if (this.v != null) {
				bool |= this.v.a(paramMenu, paramMenuInflater);
			}
		}
		return bool;
	}

	public boolean b(MenuItem paramMenuItem) {
		return false;
	}

	public final Resources c() {
		if (this.u == null) {
			throw new IllegalStateException("Fragment " + this
					+ " not attached to Activity");
		}
		return this.u.getResources();
	}

	public void c(Bundle paramBundle) {
		this.G = true;
	}

	public boolean c(Menu paramMenu) {
		boolean bool = false;
		if (!this.A) {
			if ((this.E) && (this.F)) {
				bool = true;
				a(paramMenu);
			}
			if (this.v != null) {
				bool |= this.v.a(paramMenu);
			}
		}
		return bool;
	}

	public boolean c(MenuItem paramMenuItem) {
		boolean bool = true;
		if (!this.A) {
			if ((!this.E) || (!this.F) || (!a(paramMenuItem))) {
			}
		}

		if ((this.v == null) || (!this.v.a(paramMenuItem))) {
			bool = false;
		}
		return bool;
	}

	public final l d() {
		if (this.v == null) {
			z();
			if (this.b < 5) {
				if (this.b >= 4) {
					this.v.l();
				} else if (this.b >= 2) {
					this.v.k();
				} else if (this.b >= 1) {
					this.v.j();
				}
			}
			this.v.m();
		}

		return this.v;

	}

	public void d(Bundle paramBundle) {
		this.G = true;
	}

	public void d(Menu paramMenu) {
		if (!this.A) {
			if ((this.E) && (this.F)) {
				b(paramMenu);
			}
			if (this.v != null) {
				this.v.b(paramMenu);
			}
		}
	}

	public boolean d(MenuItem paramMenuItem) {
		boolean bool = true;
		if (!this.A) {
			if (!b(paramMenuItem)) {
			}
		}

		if ((this.v == null) || (!this.v.b(paramMenuItem))) {
			bool = false;
		}
		return bool;
	}

	public void e(Bundle paramBundle) {
		this.G = true;
	}

	public final boolean e() {
		if ((this.u != null) && (this.m)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public final boolean equals(Object paramObject) {
		return super.equals(paramObject);
	}

	public void f(Bundle paramBundle) {
	}

	public final boolean f() {
		return this.B;
	}

	public void g(Bundle paramBundle) {
		if (this.v != null) {
			this.v.i();
		}
		this.G = false;
		c(paramBundle);
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onCreate()");
		}
		if (paramBundle != null) {
			Parcelable localParcelable = paramBundle
					.getParcelable("android:support:fragments");
			if (localParcelable != null) {
				if (this.v == null) {
					z();
				}
				this.v.a(localParcelable, null);
				this.v.j();
			}
		}
	}

	public final boolean g() {
		return this.A;
	}

	public View h() {
		return this.J;
	}

	public void h(Bundle paramBundle) {
		if (this.v != null) {
			this.v.i();
		}
		this.G = false;
		d(paramBundle);
		if (!this.G) {
			throw new bt("Fragment " + this
					+ " did not call through to super.onActivityCreated()");
		}
		if (this.v != null) {
			this.v.k();
		}
	}

	public final int hashCode() {
		return super.hashCode();
	}

	public void i() {
		this.G = true;
		if (!this.O) {
			this.O = true;
			if (!this.P) {
				this.P = true;
				this.N = this.u.a(this.h, this.O, false);
			}
			if (this.N != null) {
				this.N.b();
			}
		}
	}

	public void i(Bundle paramBundle) {
		f(paramBundle);
		if (this.v != null) {
			Parcelable localParcelable = this.v.h();
			if (localParcelable != null) {
				paramBundle.putParcelable("android:support:fragments",
						localParcelable);
			}
		}
	}

	public void j() {
		this.G = true;
	}

	public void k() {
		this.G = true;
	}

	public void l() {
		this.G = true;
	}

	public void m() {
		this.G = true;
	}

	public void n() {
		this.G = true;
		if (!this.P) {
			this.P = true;
			this.N = this.u.a(this.h, this.O, false);
		}
		if (this.N != null) {
			this.N.h();
		}
	}

	public void o() {
		this.g = -1;
		this.h = null;
		this.m = false;
		this.n = false;
		this.o = false;
		this.p = false;
		this.q = false;
		this.r = false;
		this.s = 0;
		this.t = null;
		this.v = null;
		this.u = null;
		this.x = 0;
		this.y = 0;
		this.z = null;
		this.A = false;
		this.B = false;
		this.D = false;
		this.N = null;
		this.O = false;
		this.P = false;
	}

	public void onConfigurationChanged(Configuration paramConfiguration) {
		this.G = true;
	}

	public void onCreateContextMenu(ContextMenu paramContextMenu,
			View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
		b().onCreateContextMenu(paramContextMenu, paramView,
				paramContextMenuInfo);
	}

	public void onLowMemory() {
		this.G = true;
	}

	public void p() {
		this.G = true;
	}

	public void q() {
	}

	public Object r() {
		return this.Q;
	}

	public Object s() {
		if (this.R == a) {
		}
		for (Object localObject = r();; localObject = this.R) {
			return localObject;
		}
	}

	public Object t() {
		return this.S;
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder(128);
		ch.a(this, localStringBuilder);
		if (this.g >= 0) {
			localStringBuilder.append(" #");
			localStringBuilder.append(this.g);
		}
		if (this.x != 0) {
			localStringBuilder.append(" id=0x");
			localStringBuilder.append(Integer.toHexString(this.x));
		}
		if (this.z != null) {
			localStringBuilder.append(" ");
			localStringBuilder.append(this.z);
		}
		localStringBuilder.append('}');
		return localStringBuilder.toString();
	}

	public Object u() {
		if (this.T == a) {
		}
		for (Object localObject = t();; localObject = this.T) {
			return localObject;
		}
	}

	public Object v() {
		return this.U;
	}

	public Object w() {
		if (this.V == a) {
		}
		for (Object localObject = v();; localObject = this.V) {
			return localObject;
		}
	}

	public boolean x() {
		if (this.X == null) {
		}
		for (boolean bool = true;; bool = this.X.booleanValue()) {
			return bool;
		}
	}

	public boolean y() {
		if (this.W == null) {
		}
		for (boolean bool = true;; bool = this.W.booleanValue()) {
			return bool;
		}
	}

	void z()
  {
    this.v = new n();
//  this.v.a(this.u, new Fragment(), this);
  }
}
