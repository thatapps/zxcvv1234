package com.main;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.lazyswipe.widget.FloatTip;
import java.lang.ref.WeakReference;

public class wk {

	private final Context a;
	private CharSequence b;
	private CharSequence c;
	private SpannableString d;
	private SpannableString e;
	private MovementMethod f;
	private MovementMethod g;
	private boolean h;
	private int i;
	private android.view.View.OnClickListener j;
	private View k;
	private int l;
	private wl m;

	public wk(Context context) {
		h = true;
		l = 1;
		a = context;
	}

	private boolean a(TextView textview, SpannableString spannablestring,
			MovementMethod movementmethod) {
		if (spannablestring != null) {
			textview.setText(spannablestring);
			if (movementmethod != null) {
				textview.setMovementMethod(movementmethod);
			}
			return true;
		} else {
			return false;
		}
	}

	public FloatTip a() {
		Object obj;
		LayoutInflater inflater = LayoutInflater.from(a);
		int i1;
		if (i > 0) {
			i1 = i;
		} else {
			i1 = 0x7f04001e;
		}
		FloatTip floatTip = (FloatTip) ((LayoutInflater) (inflater)).inflate(
				i1, null);
		if (k == null) {

			if (!a(((FloatTip) (floatTip)).b, d, f)) {
				if (TextUtils.isEmpty(b)) {
					((FloatTip) (floatTip)).b.setVisibility(8);
				} else {
					((FloatTip) (floatTip)).b.setText(b);
				}
			}
			if (!a(((FloatTip) (floatTip)).c, e, g)) {
				if (TextUtils.isEmpty(c)) {
					((FloatTip) (floatTip)).c.setVisibility(8);
				} else {
					((FloatTip) (floatTip)).c.setText(c);
				}
			}

		} else {
			((FloatTip) (floatTip)).removeAllViewsInLayout();
			((FloatTip) (floatTip)).addView(k);
		}

		if (j != null) {
			((FloatTip) (floatTip)).setOnClickListener(j);
		}
		if (m != null) {
			floatTip.i = new WeakReference(m);
		}
		((FloatTip) (floatTip)).a(l);
		return ((FloatTip) (floatTip));

	}

	public FloatTip a(long l1) {
		FloatTip floattip = a();
		floattip.e = l1;
		floattip.a();
		return floattip;
	}

	public wk a(android.view.View.OnClickListener onclicklistener) {
		j = onclicklistener;
		return this;
	}

	public wk a(CharSequence charsequence) {
		b = charsequence;
		return this;
	}

	public wk a(wl wl) {
		m = wl;
		return this;
	}

	public wk b(CharSequence charsequence) {
		c = charsequence;
		return this;
	}
}
