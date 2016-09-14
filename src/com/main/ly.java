package com.main;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.lazyswipe.SwipeService;
import com.lazyswipe.fan.NotificationView;
import com.lazyswipe.notification.AppNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ly extends BaseAdapter implements
		android.view.View.OnClickListener, lz {

	Map a;
	pv b;
	List c;
	final NotificationView d;

	public ly(NotificationView notificationview, pk pk1) {
		super();
		d = notificationview;
		pg pg1 = null;
		b = ((ms) pk1).j();
		Map map = null;
		a = pq.a(b);
		c = new ArrayList(a.size() + 1);
		Iterator iterator = a.keySet().iterator();

		do {
			if (iterator.hasNext()) {
				pg1 = (pg) iterator.next();
			}

			Iterator iterator1 = b.g.values().iterator();
			pu pu1 = null;
			do {
				if (iterator1.hasNext()) {
					pu1 = (pu) iterator1.next();
				} else {
					map = SwipeService.n();
					if (map != null) {
						ts ts = (ts) map.get(b);
						if (ts != null) {
							a.put(AppNotification.a, ts);
							c.add(vh.g(notificationview.getContext()));
						}
					}
				}

			} while (!pu1.a().contains(pg1.d));
			c.add(pu1.a);

		} while (true);

	}

	public void a(int i) {
		Iterator iterator = a.entrySet().iterator();
		int j = 0;
		java.util.Map.Entry entry = null;
		do {

			if (iterator.hasNext()) {
				entry = (java.util.Map.Entry) iterator.next();
				if (j > i) {
					iterator.remove();
				}

			}
			if (entry != null) {
				if (getCount() <= 0) {
					NotificationView.e(d);
				}

			}

			c.remove(i);
			try {
				((pk) NotificationView.b(d)).a((pg) entry.getKey());
			} catch (Throwable throwable) {
			}
			notifyDataSetChanged();

			j++;
		} while (true);
	}

	public void a(AdapterView adapterview, View view, int i, long l) {
		((pk) NotificationView.b(d)).a(d.getContext(),
				(java.util.Map.Entry) getItem(i));
	}

	public int getCount() {
		return a.size();
	}

	public Object getItem(int i) {
		Iterator iterator = a.entrySet().iterator();
		for (int j = 0; iterator.hasNext(); j++) {
			java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
			if (j >= i) {
				return entry;
			}
		}

		return null;
	}

	public long getItemId(int i) {
		return 0L;
	}

	public View getView(int i, View view, ViewGroup viewgroup) {
		String s;
		pi pi1;
		Stack stack;
		Object obj;
		mc mc = null;
		CharSequence charsequence;
		Iterator iterator;
		if (view == null) {
			view = LayoutInflater.from(d.getContext()).inflate(0x7f040031,
					null, false);
			mc = new mc();
			mc.b = (TextView) view.findViewById(0x7f0c0073);
			mc.c = (TextView) view.findViewById(0x7f0c0093);
			mc.a = (TextView) view.findViewById(0x7f0c000d);
			mc.d = (ImageView) view.findViewById(0x7f0c0096);
			mc.e = (TextView) view.findViewById(0x7f0c0094);
			((mc) (mc)).e.setOnClickListener(this);
			view.setTag(viewgroup);
		} else {
			mc = (mc) view.getTag();
		}
		try {
			s = (String) c.get(i);
			((mc) (mc)).d.setImageDrawable(vk.e(d.getContext(), s));
			charsequence = pq.d(s);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.NotificationView", "Bind data failed", exception);
			return view;
		}
		obj = charsequence;
		if (charsequence != null) {

		}
		obj = vk.d(d.getContext(), s);
		((mc) (mc)).a.setText(((CharSequence) (obj)));
		obj = (ts) ((java.util.Map.Entry) getItem(i)).getValue();
		pi1 = (pi) ((ts) (obj)).b();
		((mc) (mc)).c.setText(vk.a(d.getContext(), pi1.a));
		stack = new Stack();
		iterator = ((ts) (obj)).iterator();

		if (!iterator.hasNext()) {

		}
		charsequence = ((pi) iterator.next()).b();
		obj = charsequence;
		if (charsequence == null) {
			obj = "";
		}
		stack.push(obj);

		Object obj1;
		obj1 = TextUtils.join("\n\n", stack);
		((mc) (mc)).b.setText(((CharSequence) (obj1)));
		obj1 = pi1.d();
		if (obj1 == null) {

		}
		((mc) (mc)).e.setVisibility(0);
		((mc) (mc)).e.setTag(0x7f0c0003, obj1);
		((mc) (mc)).e.setTag(s);

		((mc) (mc)).e.setVisibility(8);
		return view;
	}

	public void onClick(View view) {
		if (view.getId() == 0x7f0c0094) {
			d.a((String) view.getTag(),
					(com.lazyswipe.notification.AppNotification$Action) view
							.getTag(0x7f0c0003));
		}
	}
}
