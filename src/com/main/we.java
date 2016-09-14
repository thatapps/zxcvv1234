package com.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.lazyswipe.zev.R;

public class we extends wc {
	public we(Context paramContext) {
		super(paramContext);
	}

	protected wb c() {
		return new wd(this.a);
	}

	// protected View g() {
	// int i = this.a.getResources().getColor(
	// R.color.custom_dialog_message_text_color_default);
	// TypedArray localTypedArray = this.a.getTheme().obtainStyledAttributes(
	// null, in.CustomDialog, R.attr.customDialogStyle, 0);
	// int j = localTypedArray.getColor(3, i);
	// localTypedArray.recycle();
	// View localView = this.c.inflate(R.layout.custom_dialog_progress, null,
	// false);
	// TextView localTextView = (TextView) localView.findViewById(R.id.msg);
	// localTextView.setTextColor(j);
	// localTextView.setText(this.g);
	// this.g = null;
	// ProgressBar localProgressBar = (ProgressBar) localView
	// .findViewById(R.id.progress);
	// wf localwf = new wf(this.a);
	// localProgressBar.setProgressDrawable(localwf);
	// localProgressBar.setIndeterminateDrawable(localwf);
	// a(localView);
	// return super.g();
	// }
	protected View g() {
		int i = a.getResources().getColor(0x7f0a000d);
		Object obj = a.getTheme().obtainStyledAttributes(null, in.CustomDialog,
				0x7f01002d, 0);
		i = ((TypedArray) (obj)).getColor(3, i);
		((TypedArray) (obj)).recycle();
		obj = c.inflate(0x7f040014, null, false);
		Object obj1 = (TextView) ((View) (obj)).findViewById(0x7f0c0047);
		((TextView) (obj1)).setTextColor(i);
		((TextView) (obj1)).setText(g);
		g = null;
		obj1 = (ProgressBar) ((View) (obj)).findViewById(0x7f0c0046);
		wf wf1 = new wf(a);
		((ProgressBar) (obj1)).setProgressDrawable(wf1);
		((ProgressBar) (obj1)).setIndeterminateDrawable(wf1);
		a(((View) (obj)));
		return super.g();
	}
	// protected View g()
	// {
	// int i = a.getResources().getColor(0x7f0a000d);
	// Object obj = a.getTheme().obtainStyledAttributes(null, in.CustomDialog,
	// 0x7f01002d, 0);
	// i = ((TypedArray) (obj)).getColor(3, i);
	// ((TypedArray) (obj)).recycle();
	// obj = c.inflate(0x7f040014, null, false);
	// Object obj1 = (TextView)((View) (obj)).findViewById(0x7f0c0047);
	// ((TextView) (obj1)).setTextColor(i);
	// ((TextView) (obj1)).setText(g);
	// g = null;
	// obj1 = (ProgressBar)((View) (obj)).findViewById(0x7f0c0046);
	// wf wf1 = new wf(a);
	// ((ProgressBar) (obj1)).setProgressDrawable(wf1);
	// ((ProgressBar) (obj1)).setIndeterminateDrawable(wf1);
	// a(((View) (obj)));
	// return super.g();
	// }
}
