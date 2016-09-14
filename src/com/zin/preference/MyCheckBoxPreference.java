/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.CheckBoxPreference
 *  android.preference.Preference
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.lazyswipe.preference;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.zev.R;
import com.main.qc;
import com.main.qd;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public class MyCheckBoxPreference extends CheckBoxPreference implements qc {

	private qd a;
	private Object b;

	public MyCheckBoxPreference(Context context) {
		this(context, null);
	}

	public MyCheckBoxPreference(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public MyCheckBoxPreference(Context context, AttributeSet attributeset,
			int i) {
		super(context, attributeset, i);
		setLayoutResource(R.layout.preference);
		setWidgetLayoutResource(R.layout.preference_widget_checkbox);
		a = new qd(this, context, attributeset, i);
	}

	public Object a() {
		return b;
	}

	public void a(Object obj) {
		b = obj;
	}

	public View getView(View view, ViewGroup viewgroup) {
		try {
			view = super.getView(view, viewgroup);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.MyCheckboxPreference",
					"Exception in Preference.getView()");
			return null;
		}
		return view;
	}

	public boolean isChecked() {
		return super.isChecked();
	}

	protected void onBindView(View view) {
		if (view == null) {
			return;
		} else {
			super.onBindView(view);
			a.b(view);
			return;
		}
	}
}
