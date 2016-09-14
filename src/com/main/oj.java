package com.main;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.features.promotion.AppBoxFragment;
import com.lazyswipe.zev.R;

public class oj {
	TextView a;
	TextView b;
	TextView c;
	ImageView d;
	ImageView e;

	public oj(View paramView) {
		this.a = ((TextView) paramView.findViewById(R.id.title));
		this.c = ((TextView) paramView.findViewById(R.id.desc));
		this.b = ((TextView) paramView.findViewById(R.id.size));
		this.d = ((ImageView) paramView.findViewById(R.id.icon));
		this.e = ((ImageView) paramView.findViewById(R.id.download));
	}

	public void a(View view, Context context, Cursor cursor) {
		this.a.setText((CharSequence) cursor.getString(AppBoxFragment.m));
		String string = cursor.getString(AppBoxFragment.l);
		if (!TextUtils.isEmpty((CharSequence) string)) {
			if (this.c.getVisibility() != 0) {
				this.c.setVisibility(0);
			}
			this.c.setText((CharSequence) string);
		} else if (8 != this.c.getVisibility()) {
			this.c.setVisibility(8);
		}
		this.b.setText((CharSequence) ok.a(cursor.getInt(AppBoxFragment.k),
				cursor.getString(AppBoxFragment.n)));
		int n = cursor.getInt(AppBoxFragment.d);
		FanItem.g.a(context.getResources(), this.d, ol.a(context, n, 0),
				cursor.getString(AppBoxFragment.h), R.drawable.tile_lucky_draw);
		ol.a(context.getApplicationContext(),
				cursor.getString(AppBoxFragment.j), n, 0);
	}
}
