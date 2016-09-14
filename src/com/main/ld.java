package com.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class ld extends BaseAdapter {

	final lc a;
	private ky b;

	public ld(lc lc1, ky ky1) {
		super();
		a = lc1;

		b = ky1;
	}

	static ky a(ld ld1) {
		return ld1.b;
	}

	public lb a(int i) {
		ArrayList arraylist;
		if (lc.a(a)) {
			arraylist = b.i();
		} else {
			arraylist = b.g();
		}
		return (lb) arraylist.get(i);
	}

	public int getCount() {
		ArrayList arraylist;
		if (lc.a(a)) {
			arraylist = b.i();
		} else {
			arraylist = b.g();
		}
		return arraylist.size();
	}

	public Object getItem(int i) {
		return a(i);
	}

	public long getItemId(int i) {
		return (long) i;
	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		if (view == null) {
			view = lc.b(a).inflate(0x7f040038, viewgroup, false);
		}
		((lh) view).a(a(i));
		return view;
	}
}
