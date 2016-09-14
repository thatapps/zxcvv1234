package com.main;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.fan.NotificationView;
import com.lazyswipe.zev.R;

public class mb extends BaseAdapter implements View.OnClickListener, gl, lz, op {
	gp a;
	final/* synthetic */NotificationView b;
	private final na c;
	private final Context d;
	private int e;
	private String f;

	public mb(NotificationView notificationView, Context context, na na) {
		this.b = notificationView;
		this.d = context;
		this.c = na;
		this.e = this.a(na.j());
	}

	private int a(int paramInt) {
		if (paramInt == 2) {
		}
		for (int i = 0;; i = 1) {
			return i;
		}
	}

	private View b() {
		nt localnt = new nt(this.d);
		ImageView localImageView = new ImageView(this.d);
		localImageView.setImageDrawable(localnt);
		localnt.b();
		return localImageView;
	}

	private View c() {
		try {
			ol.a(this.d, na.a.j, na.a.c, 2);
			View view = LayoutInflater.from((Context) this.d).inflate(
					R.layout.notification_alliance_item, null, false);
			((TextView) view.findViewById(R.id.title))
					.setText((CharSequence) na.a.e);
			((TextView) view.findViewById(R.id.body))
					.setText((CharSequence) na.a.n);
			((TextView) view.findViewById(R.id.date))
					.setText((CharSequence) na.a.a());
			ImageView imageView = (ImageView) view.findViewById(R.id.icon);
			FanItem.g.a(this.d.getResources(), imageView,
					ol.a(this.d, na.a.c, na.a.q), na.a.f, R.mipmap.ic_launcher);
			view.findViewById(R.id.update_icon).setOnClickListener(
					(View.OnClickListener) this);
			return view;
		} catch (Throwable var1_3) {
			this.e = 3;
			return this.e();
		}
	}

	private View d() {
		jc.a("fb", 2);
		try {
			View view = LayoutInflater.from((Context) this.d).inflate(
					R.layout.notification_facebook_item, null, false);
			((TextView) view.findViewById(R.id.title))
					.setText((CharSequence) this.a.e());
			((TextView) view.findViewById(R.id.body))
					.setText((CharSequence) this.a.g());
			ImageView imageView = (ImageView) view.findViewById(R.id.icon);
			FanItem.g.a(this.d.getResources(), imageView,
					ol.a(this.d, this.f.hashCode(), 2, 0), "null", 0, 0, 0,
					null);
			this.a.a(view);
			view.findViewById(R.id.update_icon).setOnClickListener(
					(View.OnClickListener) this);
			return view;
		} catch (Throwable var1_3) {
			this.e = 1;
			return this.c();
		}
	}

	private View e() {
		TextView localTextView = new TextView(this.d);
		localTextView.setGravity(17);
		int i = vk.a(this.d, 24.0F);
		localTextView.setPadding(i, i, i, i);
		localTextView.setText(R.string.msg_no_data);
		return localTextView;
	}

	void a() {
		this.e = 2;
		notifyDataSetChanged();
	}

	public void a(int paramInt1, int paramInt2) {
		if ((na.a != null) && (na.a.c == paramInt1)) {
			na.a.l = true;
		}
	}

	public void a(int paramInt1, int paramInt2, String paramString) {
	}

	public void a(AdapterView adapterView, View view, int n, long l) {
		boolean bl = true;
		if (na.a == null)
			return;
		if (this.e == n/* bl */) {
			boolean bl2 = ol.a(this.d.getApplicationContext(), na.a, (op) this);
			int n2 = na.a.c;
			int n3 = na.a.q;
			na.a = null;
			Context context = this.d;
			if (bl2) {
				bl = false;
			}
			ol.a(context, n2, n3, 2, bl);
		}
	}

	public void a(gj paramgj) {
		jc.a(2, 1, 1, "fb");
		try {
			if (this.a == paramgj) {
				gq localgq = this.a.d();
				if (localgq != null) {
					this.f = localgq.a();
					if (!TextUtils.isEmpty(this.f)) {
						new lx(this.d, this).execute(new Void[0]);
					}
				}
			}
		} catch (Throwable localThrowable) {
		}
	}

	public void a(gj paramgj, gk paramgk) {
		if (paramgj != null) {
			Log.w("Swipe.NotificationView", "Failed to load Facebook; error: "
					+ paramgk.a() + "/" + paramgk.b());
			jc.a(2, paramgk);
		}
		if (na.a == null) {
		}
		for (int i = 3;; i = 1) {
			this.e = i;
			notifyDataSetChanged();
			return;
		}
	}

	public void b(gj paramgj) {
		NotificationView.b(this.b, false);
		NotificationView.e(this.b);
		ol.a(this.d, this.f.hashCode(), 2, 2, false);
	}

	public int getCount() {
		return 1;
	}

	public Object getItem(int paramInt) {
		return this.c;
	}

	public long getItemId(int paramInt) {
		return 0L;
	}

	public View getView(int var1_1, View var2_2, ViewGroup var3_3) {
		switch (this.e) {
		default: {
			do {
				return this.b();
				// break;
			} while (true);
		}
		case 1: {
			return this.c();
		}
		case 2: {
			return this.d();
		}
		case 3: {
			return this.e();
		}
		case 0:
		}
		if (this.a != null) {
			this.a.h();
		}
		// lbl15: // 4 sources:
		do {
			this.a = new gp(this.d, "774443062592078_836557529713964");
			this.a.a((gl) this);
			this.a.a();
			return this.b();
			// break;
		} while (true);

	}

	public void onClick(View paramView) {
		int i = na.a((SwipeApplication) this.b.getContext()
				.getApplicationContext());
		if (i == -1) {
		}
		for (this.e = 3;; this.e = a(i)) {
			notifyDataSetChanged();
			return;
		}
	}
}
