package com.main;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ky {

	private final Context a;
	private final Resources b;
	private ArrayList c;
	private ArrayList d;
	private boolean e;
	private ArrayList f;
	private ArrayList g;
	private boolean h;
	private int i;
	private boolean j;
	private boolean k;
	private boolean l;
	private CopyOnWriteArrayList m;

	public ky(Context context) {
		i = 0;
		j = false;
		k = false;
		l = false;
		m = new CopyOnWriteArrayList();
		a = context;
		b = context.getResources();
		c = new ArrayList();
		d = new ArrayList();
		e = true;
		f = new ArrayList();
		g = new ArrayList();
		h = true;
	}

	private kz b(int i1, CharSequence charsequence) {
		lb lb = new lb(this, i1, charsequence, i);
		c.add(lb);
		b(true);
		return lb;
	}

	private void c(boolean flag) {
		if (m.isEmpty()) {
			return;
		}
		e();
		for (Iterator iterator = m.iterator(); iterator.hasNext();) {
			WeakReference weakreference = (WeakReference) iterator.next();
			le le1 = (le) weakreference.get();
			if (le1 == null) {
				m.remove(weakreference);
			} else {
				le1.a(flag);
			}
		}

		f();
	}

	public kz a(int i1) {
		return (kz) c.get(i1);
	}

	public kz a(int i1, CharSequence charsequence) {
		return b(i1, charsequence);
	}

	public void a() {
		c.clear();
		b(true);
	}

	public void a(le le1) {
		m.add(new WeakReference(le1));
		le1.a(a, this);
		h = true;
	}

	final void a(boolean flag) {
		if (l) {
			return;
		}
		l = true;
		for (Iterator iterator = m.iterator(); iterator.hasNext();) {
			WeakReference weakreference = (WeakReference) iterator.next();
			le le1 = (le) weakreference.get();
			if (le1 == null) {
				m.remove(weakreference);
			} else {
				le1.a(this, flag);
			}
		}

		l = false;
	}

	public boolean a(kz kz1, int i1) {
		lb lb = (lb) kz1;
		if (lb == null || !lb.d()) {
			return false;
		} else {
			return lb.c();
		}
	}

	public int b() {
		return c.size();
	}

	public void b(boolean flag) {
		if (!j) {
			if (flag) {
				e = true;
				h = true;
			}
			c(flag);
			return;
		} else {
			k = true;
			return;
		}
	}

	public Context c() {
		return a;
	}

	public void d() {
		a(true);
	}

	public void e() {
		if (!j) {
			j = true;
			k = false;
		}
	}

	public void f() {
		j = false;
		if (k) {
			k = false;
			b(true);
		}
	}
//	public ArrayList g() {
//        if (!this.e) {
//            return this.d;
//        }
//        this.d.clear();
//        int n = this.c.size();
//        for (int i = 0; i < n; ++i) {
//            lb lb = (lb)this.c.get(i);
//            if (!lb.i()) continue;
//            this.d.add((Object)lb);
//        }
//        this.e = false;
//        this.h = true;
//        return this.d;
//    }
	public ArrayList g() {
		if (!e) {
			return d;
		}
		d.clear();
		int j1 = c.size();
		for (int i1 = 0; i1 < j1; i1++) {
			lb lb1 = (lb) c.get(i1);
			if (lb1.i()) {
				d.add(lb1);
			}
		}

		e = false;
		h = true;
		return d;
	}

	public void h() {
		if (!h) {
			return;
		}
		Iterator iterator = m.iterator();
		boolean flag = false;
		while (iterator.hasNext()) {
			WeakReference weakreference = (WeakReference) iterator.next();
			le le1 = (le) weakreference.get();
			if (le1 == null) {
				m.remove(weakreference);
			} else {
				flag = le1.d() | flag;
			}
		}
		if (flag) {
			f.clear();
			g.clear();
			ArrayList arraylist = g();
			int j1 = arraylist.size();
			int i1 = 0;
			while (i1 < j1) {
				lb lb1 = (lb) arraylist.get(i1);
				if (lb1.j()) {
					f.add(lb1);
				} else {
					g.add(lb1);
				}
				i1++;
			}
		} else {
			f.clear();
			g.clear();
			g.addAll(g());
		}
		h = false;
	}

	public ArrayList i() {
		h();
		return g;
	}
}
