package com.main;

import android.database.DataSetObserver;
import android.view.View;
import android.widget.BaseAdapter;
import com.lazyswipe.widget.GridGallery;
import java.util.LinkedList;

public class wn extends DataSetObserver {

	final GridGallery a;

	private wn(GridGallery gridgallery) {
		super();
		a = gridgallery;

	}

	public wn(GridGallery gridgallery, com.lazyswipe.widget.GridGallery _pcls1) {
		this(gridgallery);
	}

	public void onChanged() {
		do {
			Object obj = (View) GridGallery.a(a).poll();
			if (obj == null) {
				GridGallery.b(a);
				GridGallery.a(a, true);
				obj = a;
				int i;
				if (GridGallery.c(a) == null) {
					i = 0;
				} else {
					i = GridGallery.c(a).getCount();
				}
				GridGallery.a(((GridGallery) (obj)), i);
				a.requestLayout();
				return;
			}
			a.a(((View) (obj)), false);
		} while (true);
	}
}
