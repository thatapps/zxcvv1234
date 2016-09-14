package com.main;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import com.lazyswipe.ui.HorizontalListView;

public class ry extends android.view.GestureDetector.SimpleOnGestureListener {

	final HorizontalListView a;

	private ry(HorizontalListView horizontallistview) {
		super();
		a = horizontallistview;

	}

	public ry(HorizontalListView horizontallistview,
			com.lazyswipe.ui.HorizontalListView _pcls1) {
		this(horizontallistview);
	}

	public boolean onDown(MotionEvent motionevent) {
		return a.a(motionevent);
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1,
			float f, float f1) {
		return a.a(motionevent, motionevent1, f, f1);
	}

	public void onLongPress(MotionEvent motionevent) {
		HorizontalListView.b(a);
		int i = HorizontalListView.a(a, (int) motionevent.getX(),
				(int) motionevent.getY());
		if (i >= 0 && !HorizontalListView.d(a)) {
			View ciew = a.getChildAt(i);
			android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener = a
					.getOnItemLongClickListener();
			if (onitemlongclicklistener != null) {
				i = HorizontalListView.e(a) + i;
				if (onitemlongclicklistener.onItemLongClick(a, ciew, i,
						a.b.getItemId(i))) {
					a.performHapticFeedback(0);
				}
			}
		}
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1,
			float f, float f1) {
		HorizontalListView.a(a, Boolean.valueOf(true));
		HorizontalListView.a(a, sc.b);
		HorizontalListView.b(a);
		HorizontalListView horizontalListView = a;
		horizontalListView.d = ((HorizontalListView) (horizontalListView)).d
				+ (int) f;
		HorizontalListView.a(a, Math.round(f));
		a.requestLayout();
		return true;
	}

	public boolean onSingleTapConfirmed(MotionEvent motionevent) {
		HorizontalListView.b(a);
		android.widget.AdapterView.OnItemClickListener onitemclicklistener = a
				.getOnItemClickListener();
		int i = HorizontalListView.a(a, (int) motionevent.getX(),
				(int) motionevent.getY());
		if (i >= 0 && !HorizontalListView.d(a)) {
			View view = a.getChildAt(i);
			i = HorizontalListView.e(a) + i;
			if (onitemclicklistener != null) {
				onitemclicklistener.onItemClick(a, view, i, a.b.getItemId(i));
				return true;
			}
		}
		if (HorizontalListView.f(a) != null && !HorizontalListView.d(a)) {
			HorizontalListView.f(a).onClick(a);
		}
		return false;
	}
}
