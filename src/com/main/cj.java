package com.main;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class cj {

	cl b;
	cm c;
	co d;

	cj() {
	}

	public static boolean a(Map map, Collection collection) {
		Iterator iterator = null;
		for (iterator = collection.iterator(); iterator.hasNext();) {
			if (!map.containsKey(iterator.next())) {
				return false;
			}
		}

		return true;
	}

	public static boolean a(Set set, Object object) {
		boolean bl = true;
		if (set == object) {
			return bl;
		}
		boolean bl2 = object instanceof Set;
		boolean bl3 = false;
		if (!bl2)
			return bl3;
		Set set2 = (Set) object;
		try {
			if (set.size() != set2.size())
				return false;
			boolean bl4 = set.containsAll((Collection) set2);
			if (!bl4)
				return false;
		} catch (ClassCastException var7_7) {
			return false;
		} catch (NullPointerException var6_8) {
			return false;
		}
		return bl;
	}

	public static boolean b(Map map, Collection collection) {
		int i = map.size();
		Iterator   iterator = null;
		for (iterator = collection.iterator(); iterator.hasNext(); map
				.remove(iterator.next())) {
		}
		return i != map.size();
	}

	public static boolean c(Map map, Collection collection) {
		int i = map.size();
		Iterator iterator = map.keySet().iterator();
		do {
			if (!iterator.hasNext()) {
				break;
			}
			if (!collection.contains(iterator.next())) {
				iterator.remove();
			}
		} while (true);
		return i != map.size();
	}

	protected abstract int a();

	protected abstract int a(Object obj);

	protected abstract Object a(int i, int j);

	protected abstract Object a(int i, Object obj);

	protected abstract void a(int i);

	protected abstract void a(Object obj, Object obj1);

	public Object[] a(Object aobj[], int i) {
		int k = a();
		if (aobj.length < k) {
			aobj = (Object[]) (Object[]) Array.newInstance(((Object) (aobj))
					.getClass().getComponentType(), k);
		}
		for (int j = 0; j < k; j++) {
			aobj[j] = a(j, i);
		}

		if (aobj.length > k) {
			aobj[k] = null;
		}
		return aobj;
	}

	protected abstract int b(Object obj);

	protected abstract Map b();

	public Object[] b(int i) {
		int k = a();
		Object aobj[] = new Object[k];
		for (int j = 0; j < k; j++) {
			aobj[j] = a(j, i);
		}

		return aobj;
	}

	protected abstract void c();

	public Set d() {
		if (b == null) {
			b = new cl(this);
		}
		return b;
	}

	public Set e() {
		if (c == null) {
			c = new cm(this);
		}
		return c;
	}

	public Collection f() {
		if (d == null) {
			d = new co(this);
		}
		return d;
	}
}
