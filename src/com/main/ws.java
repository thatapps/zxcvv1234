package com.main;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.widget.HorizontalGridList;

public class ws extends BaseAdapter {

	private HorizontalGridList a;

	public ws(HorizontalGridList horizontalgridlist) {
		a = horizontalgridlist;
	}

	private wt a(ViewGroup viewgroup, int i) {
		return new wt(this, (GridLayout) LayoutInflater.from(
				viewgroup.getContext()).inflate(0x7f040008, viewgroup, false),
				HorizontalGridList.a(a));
	}

	private void a(wt wt1, int i) {
		int k = HorizontalGridList.a(a);
		int l = a();
		i *= k;
		int j = 0;
		while (j < k) {
			FanItem fanitem = wt.b(wt1)[j];
			if (i > l - 1) {
				if (fanitem.getVisibility() == 0) {
					fanitem.setVisibility(4);
				}
			} else {
				if (fanitem.getVisibility() != 0) {
					fanitem.setVisibility(0);
				}
				a(fanitem, i);
				b(fanitem);
			}
			j++;
			i++;
		}
	}

	private void b(FanItem fanitem) {
		if (android.os.Build.VERSION.SDK_INT >= 15
				&& !fanitem.hasOnClickListeners()) {
			fanitem.setOnClickListener(HorizontalGridList.b(a));
		}
	}

	protected int a() {
		return 0;
	}

	protected void a(FanItem fanitem) {
		fanitem.setTextColor(Color.parseColor("#4e4e4e"));
		fanitem.a
				.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
	}

	protected void a(FanItem fanitem, int i) {
	}

	public int b() {
		if (HorizontalGridList.a(a) == 0) {
			return 0;
		} else {
			return (int) Math.ceil((float) a()
					/ ((float) HorizontalGridList.a(a) * 1.0F));
		}
	}

	public int getCount() {
		return b();
	}

	public Object getItem(int i) {
		return Integer.valueOf(i);
	}

	public long getItemId(int i) {
		return (long) i;
	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		wt wt = null;
		if (view == null) {
			wt = a(viewgroup, i);
		} else {
			wt = (wt) view.getTag();
		}
		a(wt, i);
		return wt.a(wt);
	}
}
