package com.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cf extends cp implements Map {

	cj a;

	public cf() {
	}

	private cj b() {
		if (a == null) {
			a = new cj() {

				final cf a;

				protected int a() {
					return a.h;
				}

				protected int a(Object obj) {
					return a.a(obj);
				}

				protected Object a(int i, int j) {
					return a.g[(i << 1) + j];
				}

				protected Object a(int i, Object obj) {
					return a.a(i, obj);
				}

				protected void a(int i) {
					a.d(i);
				}

				protected void a(Object obj, Object obj1) {
					a.put(obj, obj1);
				}

				protected int b(Object obj) {
					return a.b(obj);
				}

				protected Map b() {
					return a;
				}

				protected void c() {
					a.clear();
				}

				{
					a = cf.this;
					// super();
				}
			};
		}
		return a;
	}

	public boolean a(Collection collection) {
		return cj.c(this, collection);
	}

	public Set entrySet() {
		return b().d();
	}

	public Set keySet() {
		return b().e();
	}

	public void putAll(Map map) {
		a(h + map.size());
		Iterator iterator = null;
		java.util.Map.Entry entry;
		for (iterator = map.entrySet().iterator(); iterator.hasNext(); put(
				entry.getKey(), entry.getValue())) {
			entry = (java.util.Map.Entry) iterator.next();
		}

	}

	public Collection values() {
		return b().f();
	}
}
