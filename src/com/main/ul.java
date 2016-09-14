package com.main;

import android.app.Notification;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

class ul {

	public int a;
	public int b;
	public int c;
	public int d;
	public int e;
	public int f;
	public int g;
	public int h;
	public int i;
	public int j;
	public int k;
	public int l;
	public int m;
	public int n;
	public int o;
	public int p;
	public int q;
	public int r;
	public int s;
	public int t;
	public int u;
	private int v;
	private int w;

	public ul(Context context) {
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = 0;
		h = 0;
		i = 0;
		j = 0;
		k = 0;
		l = 0;
		m = 0;
		n = 0;
		o = 0;
		p = 0;
		q = 0;
		r = 0;
		s = 0;
		t = 0;
		u = 0;
		v = 0;
		w = 0;
		a(context);
	}

	private void a(Context context) {
		Object obj = (new ag(context)).a(0x7f030000).a("1").b("2").d("3")
				.c("4");
		Notification notification = ((ag) (obj)).a();
		ViewGroup viewgroup = (ViewGroup) ((LayoutInflater) context
				.getSystemService("layout_inflater")).inflate(
				notification.contentView.getLayoutId(), null);
		notification.contentView.reapply(context, viewgroup);
		a(viewgroup);
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			Object obj1 = new af();
			((af) (obj1)).b("5");
			((af) (obj1)).a("6");
			((af) (obj1)).c("7");
			((ag) (obj)).a("8");
			((ag) (obj)).a(((ar) (obj1)));
			obj1 = ((ag) (obj)).a();
			w = ((Notification) (obj1)).bigContentView.getLayoutId();
			a(context, ((Notification) (obj1)));
			obj1 = new ah();
			String as[] = new String[10];
			as[0] = "10";
			as[1] = "11";
			as[2] = "12";
			as[3] = "13";
			as[4] = "14";
			as[5] = "15";
			as[6] = "16";
			as[7] = "17";
			as[8] = "18";
			as[9] = "19";
			((ah) (obj1)).a("6");
			((ag) (obj)).a("9");
			((ah) (obj1)).b("5");
			for (int i1 = 0; i1 < as.length; i1++) {
				((ah) (obj1)).c(as[i1]);
			}

			((ag) (obj)).a(((ar) (obj1)));
			obj = ((ag) (obj)).a();
			v = ((Notification) (obj)).bigContentView.getLayoutId();
			a(context, ((Notification) (obj)));
		}
	}

	private void a(Context context, Notification notification) {
		ViewGroup viewgroup = (ViewGroup) ((LayoutInflater) context
				.getSystemService("layout_inflater")).inflate(
				notification.bigContentView.getLayoutId(), null);
		notification.bigContentView.reapply(context, viewgroup);
		a(viewgroup);
	}

	private void a(ViewGroup viewgroup) {
		int i1 = 0;
		while (i1 < viewgroup.getChildCount()) {
			View view = viewgroup.getChildAt(i1);
			if (view instanceof ViewGroup) {
				a((ViewGroup) view);
			} else if (view instanceof TextView) {
				String s1 = ((TextView) view).getText().toString();
				int j1 = view.getId();
				if (s1.equals("1")) {
					b = j1;
				} else if (s1.equals("2")) {
					c = j1;
				} else if (s1.equals("3")) {
					d = j1;
				} else if (s1.equals("4")) {
					e = j1;
				} else if (s1.equals("5")) {
					f = j1;
				} else if (s1.equals("6")) {
					h = j1;
				} else if (s1.equals("7")) {
					i = j1;
				} else if (s1.equals("8")) {
					g = j1;
				} else if (s1.equals("9")) {
					j = j1;
				} else if (s1.equals("10")) {
					k = j1;
				} else if (s1.equals("11")) {
					l = j1;
				} else if (s1.equals("12")) {
					m = j1;
				} else if (s1.equals("13")) {
					n = j1;
				} else if (s1.equals("14")) {
					o = j1;
				} else if (s1.equals("15")) {
					p = j1;
				} else if (s1.equals("16")) {
					q = j1;
				} else if (s1.equals("17")) {
					r = j1;
				} else if (s1.equals("18")) {
					s = j1;
				} else if (s1.equals("19")) {
					t = j1;
				}
			} else if ((view instanceof ImageView)
					&& ((ImageView) view).getDrawable() != null) {
				a = view.getId();
			}
			i1++;
		}
	}
}
