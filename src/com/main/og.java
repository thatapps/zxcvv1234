package com.main;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.features.poptime.PopTimeBlackListLayout;
import com.lazyswipe.zev.R;

public class og extends ArrayAdapter {
	/* synthetic */PopTimeBlackListLayout a;
	private List b;

	public og(PopTimeBlackListLayout paramPopTimeBlackListLayout,
			Context paramContext, List paramList) {
		super(paramContext, 0, paramList);
		this.b = paramList;
		this.a = paramPopTimeBlackListLayout;
		this.b.add(0, null);
	}

	private of a(ViewGroup paramViewGroup, int paramInt) {
		FanItem localFanItem = (FanItem) LayoutInflater.from(getContext())
				.inflate(R.layout.fan_item, null);
		localFanItem.b.setVisibility(8);
		int i = vk.a(getContext(), 5.0F);
		localFanItem.setPadding(i, 0, i, 0);
		return new of(localFanItem);
	}

	public void a() {
		this.b.clear();
		this.b.add(0, null);
		this.b.addAll(PopTimeBlackListLayout.a(this.a));
		notifyDataSetChanged();
	}

	private void a(of of, int n) {
		FanItem fanItem = of.a;
		if (n == 0) {
			fanItem.a(R.drawable.ic_add, (CharSequence) "");
		} else {
			fanItem.setIcon(((jq) this.b.get((int) n)).h.getPackageName());
		}
		if (PopTimeBlackListLayout.b(this.a) && n != 0) {
			fanItem.b();
			return;
		}
		fanItem.e();
	}

	public View getView(int n, View view, ViewGroup viewGroup) {
		of of = view == null ? this.a(viewGroup, n) : (of) view.getTag();
		this.a(of, n);
		return of.a;
	}
}
