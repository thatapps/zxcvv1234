package com.main;

import java.util.Collection;
import java.util.Iterator;

final class co implements Collection {

	final cj a;

	co(cj cj1) {
		super();
		a = cj1;

	}

	public boolean add(Object obj) {
		throw new UnsupportedOperationException();
	}

	public boolean addAll(Collection collection) {
		throw new UnsupportedOperationException();
	}

	public void clear() {
		a.c();
	}

	public boolean contains(Object obj) {
		return a.b(obj) >= 0;
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

	public boolean isEmpty() {
		return a.a() == 0;
	}

	public Iterator iterator() {
		return new ck(a, 1);
	}

	public boolean remove(Object obj) {
		int i = a.b(obj);
		if (i >= 0) {
			a.a(i);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeAll(Collection collection) {
		int i = 0;
		int j = a.a();
		boolean flag = false;
		int k;
		for (; i < j; j = k) {
			int l = i;
			k = j;
			if (collection.contains(a.a(i, 1))) {
				a.a(i);
				l = i - 1;
				k = j - 1;
				flag = true;
			}
			i = l + 1;
		}

		return flag;
	}

	public boolean retainAll(Collection collection) {
		int i = 0;
		int j = a.a();
		boolean flag = false;
		int k;
		for (; i < j; j = k) {
			int l = i;
			k = j;
			if (!collection.contains(a.a(i, 1))) {
				a.a(i);
				l = i - 1;
				k = j - 1;
				flag = true;
			}
			i = l + 1;
		}

		return flag;
	}

	public int size() {
		return a.a();
	}

	public Object[] toArray() {
		return a.b(1);
	}

	public Object[] toArray(Object aobj[]) {
		return a.a(aobj, 1);
	}
}
