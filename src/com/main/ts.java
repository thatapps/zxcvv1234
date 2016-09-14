package com.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ts implements Queue {

	private final Queue a = new LinkedList();
	private final int b;

	public ts(int i) {
		b = i;
	}

	public Object a() {
		return peek();
	}

	public boolean add(Object obj) {
		return offer(obj);
	}

	public boolean addAll(Collection collection) {
		boolean flag = false;
		int i;
		int j;
		int k;
		if (a.size() >= b) {
			i = b;
		} else {
			i = a.size();
		}
		Iterator iterator = a.iterator();
		j = 0;
		do {
			if (!iterator.hasNext()) {
				break;
			}
			a.add(iterator.next());
			k = j + 1;
			j = k;
		} while (k != i);
		if (i > 0) {
			flag = true;
		}
		return flag;
	}

	public Object b() {
		Iterator iterator1 = iterator();
		Object obj;
		for (obj = null; iterator1.hasNext(); obj = iterator1.next()) {
		}
		return obj;
	}

	public void clear() {
		a.clear();
	}

	public boolean contains(Object obj) {
		return a.contains(obj);
	}

	public boolean containsAll(Collection collection) {
		return a.containsAll(collection);
	}

	public Object element() {
		return a.element();
	}

	public boolean equals(Object obj) {
		return a.equals(obj);
	}

	public int hashCode() {
		return a.hashCode();
	}

	public boolean isEmpty() {
		return a.isEmpty();
	}

	public Iterator iterator() {
		return a.iterator();
	}

	public boolean offer(Object obj) {
		if (a.size() == b) {
			poll();
		}
		return a.offer(obj);
	}

	public Object peek() {
		return a.peek();
	}

	public Object poll() {
		return a.poll();
	}

	public Object remove() {
		return a.remove();
	}

	public boolean remove(Object obj) {
		return a.remove(obj);
	}

	public boolean removeAll(Collection collection) {
		return a.removeAll(collection);
	}

	public boolean retainAll(Collection collection) {
		return a.retainAll(collection);
	}

	public int size() {
		return a.size();
	}

	public Object[] toArray() {
		return a.toArray();
	}

	public Object[] toArray(Object aobj[]) {
		return a.toArray(aobj);
	}

	public String toString() {
		return a.toString();
	}
}
