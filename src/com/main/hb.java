package com.main;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class hb implements gj {
	private static final String a = hb.class.getSimpleName();
	private static WeakHashMap o = new WeakHashMap();
	private final Context b;
	private hs c;
	private gl d;
	private go e;
	private static gz f;
	private View g;
	private List h;
	public static ha i;
	private hc j;
	private final String k;
	private int l;
	private hd m;
	private static View.OnTouchListener n;

	public hb(Context context, String string, gn gn, hx hx, boolean bl) {
		this.b = context;
		this.h = new ArrayList();
		this.k = UUID.randomUUID().toString();
		this.c = new hs(this.b, string, gn, hx, bl, hy.b, 1, new hr() {

			@Override
			public void a(gk gk) {
				if (hb.this.d != null) {
					hb.this.d.a(hb.this, gk);
				}
			}

			/*
			 * Enabled aggressive block sorting
			 */
			@Override
			public void a(hv hv) {
				if (!(hv.d() == null || hv.d() instanceof gz)) {
					if (hb.this.d != null) {
						hb.this.d.a(hb.this, gk.e);
					}
					if (hb.this.c == null)
						return;
					{
						hb.this.c.a("on internal error");
						return;
					}
				} else {
					gz gz = (gz) hv.d();
					if (gz != null) {
						hb.this.f = gz;
						hb.this.i();
						if (hb.this.d != null) {
							hb.this.d.a(hb.this);
						}
						hb.this.l = hv.c();
						return;
					}
					if (hb.this.d != null) {
						gl gl = hb.this.d;
						hb hb = hb.this;
						gk gk = null;
						gk = hv.e() != null ? hv.e() : gk.e;
						gl.a(hb, gk);
					}
					if (hb.this.c == null)
						return;
					{
						hb.this.c.a("on no fill");
						return;
					}
				}
			}
		});
	}

	private void a(List paramList, View paramView) {
		paramList.add(paramView);
		if ((paramView instanceof ViewGroup)) {
			ViewGroup localViewGroup = (ViewGroup) paramView;
			for (int i1 = 0; i1 < localViewGroup.getChildCount(); i1++) {
				a(paramList, localViewGroup.getChildAt(i1));
			}
		}
	}

	private void b(View paramView) {
		this.h.add(paramView);
		paramView.setOnClickListener(this.j);
		paramView.setOnTouchListener(this.j);
	}

	private void i() {
		if (f != null && f.h()) {
			m = new hd(this);
			m.a();
			i = new ha(new he(null) {

				final hb a;

				public boolean a() {
					return true;
				}

				public boolean b() {
					return true;
				}

				{
					a = hb.this;
					//super(hb.this);
				}
			}, 1000L, f, b);
		}
	}

	private void j() {
		if (this.c == null) {
			RuntimeException localRuntimeException = new RuntimeException(
					"No request controller available, has the NativeAd been destroyed?");
			hj.a(hi.a(localRuntimeException));
			throw localRuntimeException;
		}
	}

	private void k() {
		Iterator localIterator = this.h.iterator();
		while (localIterator.hasNext()) {
			View localView = (View) localIterator.next();
			localView.setOnClickListener(null);
			localView.setOnTouchListener(null);
		}
		this.h.clear();
	}

	private boolean l() {
		if ((b())
				&& (hz.a(this.b, this.g, this.g.getWidth(), this.g.getHeight(),
						this.l))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public void a() {
		j();
		this.c.a();
	}

	public void a(View paramView) {
		ArrayList localArrayList = new ArrayList();
		a(localArrayList, paramView);
		a(paramView, localArrayList);
	}

	public void a(View paramView, List paramList) {
		if (paramView == null) {
			IllegalArgumentException localIllegalArgumentException1 = new IllegalArgumentException(
					"Must provide a View");
			hj.a(hi.a(localIllegalArgumentException1));
			throw localIllegalArgumentException1;
		}
		if ((paramList == null) || (paramList.size() == 0)) {
			IllegalArgumentException localIllegalArgumentException2 = new IllegalArgumentException(
					"Invalid set of clickable views");
			hj.a(hi.a(localIllegalArgumentException2));
			throw localIllegalArgumentException2;
		}
		if (!b()) {
			Log.e(a, "Ad not loaded");
		}

		if (this.g != null) {
			Log.w(a,
					"Native Ad was already registered with a View. Auto unregistering and proceeding.");
			h();
		}
		if (o.containsKey(paramView)) {
			Log.w(a,
					"View already registered with a NativeAd. Auto unregistering and proceeding.");
			((hb) ((WeakReference) o.get(paramView)).get()).h();
		}
		this.j = new hc(this);
		this.g = paramView;
		Iterator localIterator = paramList.iterator();
		while (localIterator.hasNext()) {
			b((View) localIterator.next());
		}
		this.i = new ha(new he(this), 1000L, this.f, this.b);
		this.i.d();
		o.put(paramView, new WeakReference(this));

	}

	public void a(gl paramgl) {
		this.d = paramgl;
	}

	public static boolean b() {
		if (f != null) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public gq c() {
		if (!b()) {
		}
		for (gq localgq = null;; localgq = this.f.c()) {
			return localgq;
		}
	}

	public gq d() {
		if (!b()) {
		}
		for (gq localgq = null;; localgq = this.f.d()) {
			return localgq;
		}
	}

	public String e() {
		if (!b()) {
		}
		for (String str = null;; str = this.f.e()) {
			return str;
		}
	}

	static int a(hb hb1, int i1) {
		hb1.l = i1;
		return i1;
	}

	static gl a(hb hb1) {
		return hb1.d;
	}

	static gz a(hb hb1, gz gz1) {
		hb1.f = gz1;
		return gz1;
	}

	static hs b(hb hb1) {
		return hb1.c;
	}

	public static String f() {
		if (!b()) {
		}
		for (String str = null;; str = f.f()) {
			return str;
		}
	}

	public String g() {
		if (!b()) {
		}
		for (String str = null;; str = this.f.g()) {
			return str;
		}
	}

	static void c(hb hb1) {
		hb1.i();
	}

	static Context d(hb hb1) {
		return hb1.b;
	}

	static View g(hb hb1) {
		return (View) n;
	}

	static gz e(hb hb1) {
		return hb1.f;
	}

	static View f(hb hb1) {
		return hb1.g;
	}

	static ha h(hb hb1) {
		return hb1.i;
	}

	static String i(hb hb1) {
		return hb1.k;
	}

	static boolean j(hb hb1) {
		return hb1.l();
	}

	static go k(hb hb1) {
		return hb1.e;
	}

	public void h() {
		if (this.g == null) {
		}

		if ((!o.containsKey(this.g))
				|| (((WeakReference) o.get(this.g)).get() != this)) {
			IllegalStateException localIllegalStateException = new IllegalStateException(
					"View not registered with this NativeAd");
			hj.a(hi.a(localIllegalStateException));
			throw localIllegalStateException;
		}
		o.remove(this.g);
		k();
		this.i.c();
		this.i = null;
		this.g = null;

	}
}
