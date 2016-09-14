//zevienin

package com.lazyswipe.widget;

import java.lang.ref.WeakReference;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.main.vm;
import com.main.wl;

public class FloatTip extends RelativeLayout implements
		android.os.Handler.Callback {

	protected static final String a = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.widget.FloatTip.class.getSimpleName())
			.toString();
	public TextView b;
	public TextView c;
	ImageView d;
	public long e;
	protected Handler f;
	protected android.view.WindowManager.LayoutParams g;
	protected boolean h;
	public WeakReference i;

	public FloatTip(Context context) {
		this(context, null);
	}

	public FloatTip(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public FloatTip(Context context, AttributeSet attributeset, int j) {
		super(context, attributeset, j);
	}

	public void a() {
		if (!h) {
			h = true;
			vm.a(getContext(), this, g);
			if (e > 0L) {
				f.sendEmptyMessageDelayed(0, e);
			}
		}
	}

	public void a(int j) {
		DisplayMetrics displaymetrics = getContext().getResources()
				.getDisplayMetrics();
		g = new android.view.WindowManager.LayoutParams();
		int j1 = displaymetrics.widthPixels;
		int l = getMeasuredWidth();
		int k = l;
		if (l <= 0) {
			int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
			try {
				measure(i1, i1);
				k = getMeasuredWidth();
			} catch (Throwable throwable) {
				try {
					View view = getChildAt(0);
					view.measure(i1, i1);
					k = view.getMeasuredWidth();
				} catch (Throwable throwable1) {
					k = (Math.min(j1, displaymetrics.heightPixels) * 5) / 6;
				}
			}
		}
		g.width = k;
		g.height = -2;
		if (j == 3 || j == 0x800003) {
			g.x = 0;
		} else if (j == 5 || j == 0x800005) {
			g.x = j1 - k;
		} else {
			g.x = j1 - k >> 1;
		}
		g.y = (int) (displaymetrics.density * 100F);
		g.format = 1;
		g.flags = 0x10128;
		g.type = 2003;
		g.gravity = SwipeApplication.a | 0x30;
	}

	public void b() {
		if (h) {
			h = false;
			f.removeMessages(0);
			vm.a(getContext(), this);
			if (i != null && i.get() != null) {
				((wl) i.get()).a();
			}
		}
	}

	public boolean handleMessage(Message message) {
		// message.what;
		// JVM INSTR tableswitch 0 0: default 24
		// 0 26;
		// goto _L1 _L2
		switch (message.what) {
		default:
			return true;
		case 0:
			b();

		}
		return true;
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		f = new Handler(this);
		b = (TextView) findViewById(0x7f0c0068);
		c = (TextView) findViewById(0x7f0c0069);
		d = (ImageView) findViewById(0x7f0c0067);
	}

}
