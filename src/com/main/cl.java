package com.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class cl implements Set {

	final cj a;

	cl(cj cj1) {
		super();
		a = cj1;

	}

	public boolean a(java.util.Map.Entry entry) {
		throw new UnsupportedOperationException();
	}

	public boolean add(Object obj) {
		return a((java.util.Map.Entry) obj);
	}

	public boolean addAll(Collection collection) {
		int i = a.a();
		java.util.Map.Entry entry;
		Iterator iterator = null;
		for (iterator = collection.iterator(); iterator.hasNext(); a.a(
				entry.getKey(), entry.getValue())) {
			entry = (java.util.Map.Entry) iterator.next();
		}

		return i != a.a();
	}

	public void clear() {
		a.c();
	}

	public boolean contains(Object obj) {
		if (obj instanceof java.util.Map.Entry) {
			obj = (java.util.Map.Entry) obj;
			int i = a.a(((java.util.Map.Entry) (obj)).getKey());
			if (i >= 0) {
				return cg
						.a(a.a(i, 1), ((java.util.Map.Entry) (obj)).getValue());
			}
		}
		return false;
	}

	public boolean containsAll(Collection collection) {
		Iterator iterator = null;
		for (iterator = collection.iterator(); iterator.hasNext();) {
			if (!contains(iterator.next())) {
				return false;
			}
		}

		return true;
	}

	public boolean equals(Object obj) {
		return cj.a(this, obj);
	}

	public int hashCode() {
		int j = a.a() - 1;
		int i = 0;
		while (j >= 0) {
			Object obj = a.a(j, 0);
			Object obj1 = a.a(j, 1);
			int k;
			int l;
			if (obj == null) {
				k = 0;
			} else {
				k = obj.hashCode();
			}
			if (obj1 == null) {
				l = 0;
			} else {
				l = obj1.hashCode();
			}
			j--;
			i += l ^ k;
		}
		return i;
	}

	public boolean isEmpty() {
		return a.a() == 0;
	}

	public Iterator iterator() {
		return new cn(a);
	}

	public boolean remove(Object obj) {
		throw new UnsupportedOperationException();
	}

	public boolean removeAll(Collection collection) {
		throw new UnsupportedOperationException();
	}

	public boolean retainAll(Collection collection) {
		throw new UnsupportedOperationException();
	}

	public int size() {
		return a.a();
	}

	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	public Object[] toArray(Object aobj[]) {
		throw new UnsupportedOperationException();
	}
}
