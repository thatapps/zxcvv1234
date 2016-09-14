//zevienin

package com.lazyswipe.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.widget.Toolbar;
import com.main.kz;
import com.main.tf;
import com.main.xi;

public abstract class BaseFragment extends Fragment implements
		android.view.View.OnClickListener, xi {

	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.ui.BaseFragment.class.getSimpleName())
			.toString();
	protected Toolbar o;
	protected int p;

	public BaseFragment() {
	}

	public abstract int a();

	public void a(View view) {
	}

	public boolean a(kz kz) {
		return false;
	}

	public void b(View view) {
		onClick(view);
	}

	public void c(View view) {
		d(view);
	}

	protected void d() {
		o.setCallback(this);
		f();
		o.setTitle(g());
		o.setMenu(h());
	}

	protected void d(View view) {
	}

	protected boolean e() {
		return true;
	}

	protected void f() {
		o.setIcon(tf.a(getActivity(), 0x7f020005));
	}

	protected CharSequence g() {
		return getActivity().getTitle();
	}

	protected int h() {
		return 0;
	}

	protected View i() {
		return null;
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default:
			d(view);
			return;

		case 2131492909:
		case 2131493053:
			getActivity().finish();
			break;
		}
	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		bundle = getArguments();
		if (bundle != null) {
			p = bundle.getInt("layoutResId");
		}
	}

	public View onCreateView(LayoutInflater layoutinflater,
			ViewGroup viewgroup, Bundle bundle) {
		View view = null;
		if (viewgroup == null) {
			return null;
		}
		if (p <= 0) {
			p = a();
		}
		if (p > 0) {
			view = layoutinflater.inflate(p, viewgroup, false);
		} else {
			view = i();
		}
		o = (Toolbar) view.findViewById(0x7f0c000a);
		if (!e()) {

			if (o != null) {
				o.setVisibility(8);
				o = null;
			}

		} else {

			d();
		}

		a(view);
		return view;

	}
}
