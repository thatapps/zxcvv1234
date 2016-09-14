package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.lazyswipe.widget.FixedTip;

public class wj {

	private final Context a;
	private CharSequence b;
	private SpannableString c;
	private MovementMethod d;
	private android.view.View.OnClickListener e;
	private android.view.View.OnClickListener f;
	private CharSequence g;
	private CharSequence h;

	public wj(Context context) {
		a = context;
	}

	static android.view.View.OnClickListener a(wj wj1) {
		return wj1.e;
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

	private SpannableString b(int i, String s, Object obj, int j) {
		String s1 = a.getResources().getString(i, new Object[] { s });
		SpannableString spannablestring = new SpannableString(s1);
		if (obj != null) {
			i = s1.indexOf(s);
			spannablestring.setSpan(obj, i, s.length() + i, j);
		}
		return spannablestring;
	}

	static android.view.View.OnClickListener b(wj wj1) {
		return wj1.f;
	}

	public FixedTip a() {
		final FixedTip fixedtip = (FixedTip) LayoutInflater.from(a).inflate(
				0x7f04001d, null);
		fixedtip.d();
		float f1;
		if (!a(FixedTip.a(fixedtip), c, d)) {
			if (TextUtils.isEmpty(b)) {
				FixedTip.a(fixedtip).setVisibility(8);
			} else {
				FixedTip.a(fixedtip).setText(b);
			}
		}
		if (!TextUtils.isEmpty(g)) {
			FixedTip.b(fixedtip).setText(g);
		}
		if (!TextUtils.isEmpty(h)) {
			FixedTip.c(fixedtip).setText(h);
		}
		f1 = vk.a(a, 2.0F);
		FixedTip.b(fixedtip).setBackgroundDrawable(xd.a(0xff52ade7, f1));
		FixedTip.c(fixedtip).setBackgroundDrawable(xd.b(0xff999999, f1));
		FixedTip.b(fixedtip).setOnClickListener(
				new android.view.View.OnClickListener() {

					final FixedTip a;
					final wj b;

					public void onClick(View view) {
						if (wj.a(b) != null) {
							wj.a(b).onClick(view);
						}
						a.b();
					}

					{
						b = wj.this;
						a = fixedtip;
						// super();
					}
				});
		FixedTip.c(fixedtip).setOnClickListener(
				new android.view.View.OnClickListener() {

					final FixedTip a;
					final wj b;

					public void onClick(View view) {
						if (wj.b(b) != null) {
							wj.b(b).onClick(view);
						}
						a.b();
					}

					{
						b = wj.this;
						a = fixedtip;
						// super();
					}
				});
		return fixedtip;
	}

	public wj a(int i, String s, Object obj, int j) {
		c = b(i, s, obj, j);
		return this;
	}

	public wj a(String s, android.view.View.OnClickListener onclicklistener) {
		g = s;
		e = onclicklistener;
		return this;
	}

	public FixedTip b() {
		FixedTip fixedtip = a();
		fixedtip.a();
		return fixedtip;
	}

	public wj b(String s, android.view.View.OnClickListener onclicklistener) {
		h = s;
		f = onclicklistener;
		return this;
	}
}
