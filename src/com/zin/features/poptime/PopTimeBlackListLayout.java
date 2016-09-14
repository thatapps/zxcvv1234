//zevienin

package com.lazyswipe.features.poptime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.ui.HorizontalListView;
import com.lazyswipe.ui.chooser.MultiChooserActivity;
import com.lazyswipe.zev.R;
import com.main.bx;
import com.main.js;
import com.main.oe;
import com.main.og;
import com.main.oh;
import com.main.wu;

public class PopTimeBlackListLayout extends RelativeLayout implements
		android.view.View.OnClickListener,
		android.widget.AdapterView.OnItemClickListener {

	private static final String a = "Swipe."
			+ PopTimeBlackListLayout.class.getSimpleName();
	private View b;
	private HorizontalListView c;
	private FanItem d;
	private View e;
	private og f;
	private boolean g;
	private js h;
	private BroadcastReceiver i = new BroadcastReceiver() {

		final PopTimeBlackListLayout a;

		public void onReceive(Context context1, Intent intent) {
			while (intent == null
					|| !"BROADCAST_ACTION_CHOOSE_POP_BLACK_LIST".equals(intent
							.getAction())) {
				return;
			}
			PopTimeBlackListLayout.a(a, false);
			PopTimeBlackListLayout.c(a).sendEmptyMessage(2);
		}

		{
			a = PopTimeBlackListLayout.this;
			// super();
		}
	};
	private Handler j = new Handler() {

		final PopTimeBlackListLayout a;

		public void handleMessage(Message message) {
			switch (message.what) {
			default:
				return;

			case 1: // '\001'
				if (PopTimeBlackListLayout.d(a).b) {
					sendEmptyMessage(2);
					return;
				} else {
					sendEmptyMessageDelayed(1, 8000L);
					return;
				}

			case 2: // '\002'
				PopTimeBlackListLayout.e(a).setVisibility(8);
				break;
			}
			if (PopTimeBlackListLayout.e(a).a != null
					&& (PopTimeBlackListLayout.e(a).a.getDrawable() instanceof Animatable)) {
				((Animatable) (Animatable) PopTimeBlackListLayout.e(a).a
						.getDrawable()).stop();
			}
			if (oe.f() == 0) {
				PopTimeBlackListLayout.f(a).setVisibility(0);
				PopTimeBlackListLayout.g(a).setVisibility(8);
				return;
			}
			if (PopTimeBlackListLayout.h(a) == null) {
				PopTimeBlackListLayout.a(a, new og(a, a.getContext(),
						PopTimeBlackListLayout.a(a)));
				PopTimeBlackListLayout.i(a).setAdapter(
						PopTimeBlackListLayout.h(a));
			} else {
				//og.a(PopTimeBlackListLayout.this.f,(Integer)null);
			}
			PopTimeBlackListLayout.f(a).setVisibility(8);
			PopTimeBlackListLayout.g(a).setVisibility(0);
		}

		{
			a = PopTimeBlackListLayout.this;
			// super();
		}
	};

	public PopTimeBlackListLayout(Context context) {
		super(context);
	}

	public PopTimeBlackListLayout(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public static List a(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.e();
	}

	static og a(PopTimeBlackListLayout poptimeblacklistlayout, og og1) {
		poptimeblacklistlayout.f = og1;
		return og1;
	}

	static boolean a(PopTimeBlackListLayout poptimeblacklistlayout, boolean flag) {
		poptimeblacklistlayout.g = flag;
		return flag;
	}

	public static boolean b(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.g;
	}

	static Handler c(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.j;
	}

	private void c() {
		h = SwipeApplication.e().b();
		if (h.b) {
			j.sendEmptyMessage(2);
			return;
		} else {
			wu wu1 = new wu(getContext());
			d.setText(R.string.global_loading);
			d.setIcon(wu1);
			wu1.start();
			d.setVisibility(0);
			b.setVisibility(8);
			j.sendEmptyMessage(1);
			return;
		}
	}

	static js d(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.h;
	}

	private void d() {
		Intent intent = MultiChooserActivity.a(true);
		intent.setFlags(0x10000000);
		intent.putExtra("extra.request_type", 3);
		intent.putParcelableArrayListExtra("extra.request_existing_list", null);
		getContext().startActivity(intent);
		oh.a();
	}

	static FanItem e(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.d;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List e() {
		Object obj = new ArrayList(oe.a());
		ArrayList arraylist = new ArrayList(((List) (obj)).size());
		obj = ((List) (obj)).iterator();
		do {
			if (!((Iterator) (obj)).hasNext()) {
				break;
			}
			Object obj1 = (String) ((Iterator) (obj)).next();
			obj1 = h.a(((String) (obj1)));
			if (obj1 != null) {
				arraylist.add(obj1);
			}
		} while (true);
		return arraylist;
	}

	static View f(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.e;
	}

	static View g(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.b;
	}

	static og h(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.f;
	}

	static HorizontalListView i(PopTimeBlackListLayout poptimeblacklistlayout) {
		return poptimeblacklistlayout.c;
	}

	public void a() {
		if (g) {
			g = false;
			if (f != null) {
				f.notifyDataSetChanged();
				return;
			}
		}
	}

	public boolean b() {
		return g;
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		try {
			IntentFilter intentfilter = new IntentFilter(
					"BROADCAST_ACTION_CHOOSE_POP_BLACK_LIST");
			bx.a(getContext()).a(i, intentfilter);
			return;
		} catch (Exception exception) {
			return;
		}
	}

	public void onClick(View view) {
		view.getTag();
		while (view == this || view != e) {
			return;
		}
		d();
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		try {
			bx.a(getContext()).a(i);
		} catch (Exception exception) {
		}
		j.removeMessages(1);
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		b = findViewById(R.id.black_list_container);
		c = (HorizontalListView) findViewById(R.id.black_list);
		d = (FanItem) findViewById(R.id.loading);
		e = findViewById(R.id.add_entry);
		setOnClickListener(this);
		e.setOnClickListener(this);
		c.setOnItemClickListener(this);
		c();
	}

	public void onItemClick(AdapterView adapterview, View view, int k, long l) {
		if (f == null) {
			adapterview = null;
		} else {
			adapterview = (AdapterView) f.getItem(k);
		}
		if (adapterview == null) {
			d();
		}
	}

}
