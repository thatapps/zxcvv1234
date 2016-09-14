//zevienin

package com.lazyswipe.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lazyswipe.widget.Toolbar;
import com.main.kz;
import com.main.rw;
import com.main.tf;
import com.main.xi;

public abstract class BasePreferenceFragment extends PreferenceFragment
		implements android.preference.Preference.OnPreferenceChangeListener,
		android.preference.Preference.OnPreferenceClickListener,
		android.view.View.OnClickListener,
		android.view.ViewTreeObserver.OnGlobalLayoutListener, xi {

	protected Toolbar b;
	protected TextView c;
	protected SimpleDateFormat d;

	public BasePreferenceFragment() {
	}

	protected void a() {
		b.setCallback(this);
		c();
		b.setTitle(d());
		b.setMenu(e());
		b.setButtonBackground(0x7f02005a);
		b.setTitleColor("#ffffff"/*"#000000"*/);
	}

	protected void a(View view) {
	}

	public boolean a(Preference preference, String s) {
		return false;
	}

	public boolean a(Preference preference, String s, Object obj) {
		return false;
	}

	public boolean a(kz kz) {
		return false;
	}

	public void b(View view) {
		onClick(view);
	}

	protected boolean b() {
		return true;
	}

	protected void c() {
		b.setIcon(tf.a(getActivity(), 0x7f020004));
	}

	public void c(View view) {
		a(view);
	}

	protected CharSequence d() {
		return getActivity().getTitle();
	}

	protected void d(View view) {
	}

	protected int e() {
		return 0;
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default:
			a(view);
			return;

		case 2131492909:
		case 2131493053:
			getActivity().finish();
			break;
		}
	}

	public View onCreateView(LayoutInflater layoutinflater,
			ViewGroup viewgroup, Bundle bundle) {
		if (viewgroup == null) {
			return null;
		}
		View view = layoutinflater.inflate(0x7f04003a, viewgroup, false);
		b = (Toolbar) view.findViewById(0x7f0c000a);
		if (b()) {
			a();
		} else {
			b.setVisibility(8);
			b = null;
		}
		d = new SimpleDateFormat("HH:mm", Locale.US);
		c = (TextView) view.findViewById(0x7f0c0093);
		c.setText(d.format(new Date()));
		view.getViewTreeObserver().addOnGlobalLayoutListener(this);
		d(view);
		return view;
	}

	public void onGlobalLayout() {
		View view = getView();
		if (view != null) {
			view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
			view.setBackgroundDrawable(rw.a(view.getHeight()));
		}
	}

	public boolean onPreferenceChange(Preference preference, Object obj) {
		String s;
		if (preference != null) {
			if (!TextUtils.isEmpty(s = preference.getKey())
					&& a(preference, s, obj)) {
				return true;
			}
		}
		return false;
	}

	public boolean onPreferenceClick(Preference preference) {
		String s;
		if (preference != null) {
			if (!TextUtils.isEmpty(s = preference.getKey()) && a(preference, s)) {
				return true;
			}
		}
		return false;
	}

	public void onResume() {
		super.onResume();
		if (c != null) {
			c.setText(d.format(new Date()));
		}
	}
}
