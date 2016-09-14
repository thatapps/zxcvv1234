package com.main;

import android.view.View;
import java.util.Comparator;

public class es implements Comparator {

	public es() {
	}

	public int a(View view, View view1) {
		en en = (en) view.getLayoutParams();
		en en2 = (en) view1.getLayoutParams();
		if (((en) (en)).a != ((en) (en2)).a) {
			return !((en) (en)).a ? -1 : 1;
		} else {
			return ((en) (en)).e - ((en) (en2)).e;
		}
	}

	public int compare(Object obj, Object obj1) {
		return a((View) obj, (View) obj1);
	}
}
