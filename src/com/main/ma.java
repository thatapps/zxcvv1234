package com.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.NotificationView;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class ma extends BaseAdapter implements
		android.view.View.OnClickListener, lz {

	final NotificationView a;
	private pi b[];

	@SuppressWarnings("unchecked")
	public ma(final NotificationView notificationview, pk pk1) {
		super();
		ts ts = null;
		Iterator iterator = null;
		a = notificationview;

		pg pg = pk1.l();
		if (pg == null) {
			ts = (ts) SwipeService.n().get(pv.a);
		} else {
			ts = pq.a(pk1.i(), pg);
		}
		if (ts == null) {
			b = new pi[0];
		} else {
			int i = ts.size();
			b = new pi[i];
			for (iterator = ts.iterator(); iterator.hasNext();) {
				pi api[] = b;
				i--;
				api[i] = (pi) iterator.next();
			}

			if (pg == null) {
				Arrays.sort(b, new Comparator() {

					final NotificationView a;
					final ma b;

					public int a(pi pi1, pi pi2) {
						return (int) (pi2.a - pi1.a);
					}

					public int compare(Object obj, Object obj1) {
						return a((pi) obj, (pi) obj1);
					}

					{
						b = ma.this;
						a = notificationview;
						// super();
					}
				});
				return;
			}
		}
	}

	public void a(AdapterView adapterview, View view, int i, long l) {
		((pk) NotificationView.b(a)).a(a.getContext(), null);
	}

	public int getCount() {
		return b.length;
	}

	public Object getItem(int i) {
		return b[i];
	}

	public long getItemId(int i) {
		return 0L;
	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		Object obj;
		String s;
		pi pi1;
		mc cmc = null;
		TextView textview;
		if (view == null) {
			view = LayoutInflater.from(a.getContext()).inflate(0x7f040030,
					null, false);
			cmc = new mc();
			cmc.b = (TextView) view.findViewById(0x7f0c0073);
			cmc.c = (TextView) view.findViewById(0x7f0c0093);
			cmc.a = (TextView) view.findViewById(0x7f0c000d);
			cmc.e = (TextView) view.findViewById(0x7f0c0094);
			((mc) (cmc)).e.setOnClickListener(this);
			view.setTag(viewgroup);
		} else {
			cmc = (mc) view.getTag();
		}
		pi1 = (pi) getItem(i);
		((mc) (cmc)).c.setText(vk.a(a.getContext(), pi1.a));
		((mc) (cmc)).a.setText(pi1.d);
		s = NotificationView.b(a).i();
		if ("com.tencent.qqlite".equals(s) || "com.tencent.mobileqq".equals(s)) {
			i = 1;
		} else {
			i = 0;
		}
		textview = ((mc) (cmc)).b;
		if (i != 0) {
			obj = pi1.f;
		} else {
			obj = pi1.b();
		}
		textview.setText(((CharSequence) (obj)));
		obj = pi1.d();
		if (obj != null) {
			((mc) (cmc)).e.setVisibility(0);
			((mc) (cmc)).e.setTag(0x7f0c0003, obj);
			((mc) (cmc)).e.setTag(s);
			return view;
		} else {
			((mc) (cmc)).e.setVisibility(8);
			return view;
		}
	}

	public void onClick(View view) {
		if (view.getId() == 0x7f0c0094) {
			a.a((String) view.getTag(),
					(com.lazyswipe.notification.AppNotification$Action) view
							.getTag(0x7f0c0003));
		}
	}
}
