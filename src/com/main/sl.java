package com.main;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.widget.HorizontalGridList;
import com.lazyswipe.zev.R;

public class sl extends RelativeLayout implements View.OnClickListener {

	public int a;
	public boolean b[];
	public boolean c[];
	public int d;
	public int e;
	public TextView f;
	protected HorizontalGridList g;
	public sn h;
	protected Intent i;
	public PendingIntent j;
	public PendingIntent k;

	public sl(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public static int a(boolean flag) {
		return !flag ? 0x7f040003 : 0x7f040002;
	}

	public static void a(Context context, Intent intent) {
		(new sk(context)).a(intent).e();
	}

	private void m() {
		android.content.res.ColorStateList colorstatelist = getResources()
				.getColorStateList(0x7f0a002e);
		Object obj = getResources().getColorStateList(0x7f0a002f);
		TextView textview = (TextView) findViewById(0x7f0c0083);
		textview.setOnClickListener(this);
		textview.setTextColor(((android.content.res.ColorStateList) (obj)));
		textview.setBackgroundDrawable(getResources().getDrawable(0x7f02001e));
		obj = (TextView) findViewById(0x7f0c0081);
		((TextView) (obj)).setOnClickListener(this);
		((TextView) (obj)).setTextColor(colorstatelist);
		((TextView) (obj)).setBackgroundDrawable(getResources().getDrawable(
				0x7f02001e));
	}

	public void a() {
	}

	public void a(int i1) {
		f.setText(i1);
	}

	protected void a(View view) {
		int i1 = 1;
		int j1 = ((Integer) view.getTag()).intValue();
		boolean flag = ((FanItem) view).a();
		if (d <= 0 || e < d || flag) {
			if (!flag) {
				flag = true;
			} else {
				flag = false;
			}
			((FanItem) view).setChecked(flag);
			b[j1] = flag;
			j1 = e;
			if (!flag) {
				i1 = -1;
			}
			e = j1 + i1;
			if (d > 0) {
				l();
				return;
			}
		}
	}

	public void a(FanItem fanitem) {
	}

	public void a(FanItem fanitem, int i1) {
		fanitem.setChecked(b[i1]);
		fanitem.setTag(Integer.valueOf(i1));
	}

	public void b() {
	}

	public void c() {
		b = new boolean[a];
		c = new boolean[a];
	}

	public void d() {
		m();
		if (d > 0) {
			l();
		}
	}

	public void e() {
	}

	public void f() {
		g = (HorizontalGridList) findViewById(0x7f0c0085);
		f = (TextView) findViewById(0x7f0c0089);
		g.setOnItemClickListener(this);
		g.setAdapter(getAdapter());
		d();
		try {
			c();
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	public void g() {
	}

	protected ws getAdapter() {
		return new sm(this, g);
	}

	public int getChosenCount() {
		int i1 = 0;
		int j1;
		int k1;
		for (j1 = 0; i1 < a; j1 = k1) {
			k1 = j1;
			if (b[i1]) {
				k1 = j1 + 1;
			}
			i1++;
		}

		return j1;
	}

	public Intent getIntent() {
		return i;
	}

	public void h() {
	}

	public void i() {
	}

	public void j() {
	}

	protected void k() {
	}

	public void l() {
		f.setText(getResources().getString(0x7f0f00ae,
				new Object[] { Integer.valueOf(e), Integer.valueOf(d) }));
	}

	public void onClick(View view) {
		try {
			if (view instanceof FanItem) {
				a(view);
				return;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.MultiChooserPanel",
					"Error occurred when handling onClick", exception);
			return;
		}
		// JVM INSTR tableswitch 2131492993 2131492995: default 96
		// 2131492993 44
		// 2131492994 96
		// 2131492995 75;
		// goto _L1 _L2 _L1 _L3

		switch (view.getId()) {

		case 2131492993:

			k();
			if (h != null) {
				h.c();
				return;
			}
			break;
		case 2131492994:
		default:
			return;
		case 2131492995:

			e();
			if (h != null) {
				h.b();
			}
			return;

		}

	}

	protected void onMeasure(int i1, int j1) {
		super.onMeasure(i1,i1);
		setMeasuredDimension(
				getResources().getDimensionPixelOffset(0x7f0b0007),
				getResources().getDimensionPixelOffset(0x7f0b0001));
	}

	public void setIntent(Intent intent) {
		i = intent;
	}

	public void setMultiChooserCallBack(sn sn1) {
		h = sn1;
	}
}
