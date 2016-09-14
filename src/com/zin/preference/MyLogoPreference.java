/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.preference.Preference
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package com.lazyswipe.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lazyswipe.ui.MainActivity;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.vb;
import com.main.wc;

/*
 * Failed to analyse overrides
 */
public class MyLogoPreference extends Preference implements
		View.OnClickListener {
	private int a;
	private MainActivity b;

	public MyLogoPreference(Context context) {
		this(context, null);
	}

	public MyLogoPreference(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public MyLogoPreference(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
		this.setLayoutResource(R.layout.preference_logo);
	}

	private void a() {
		if (this.a > 0) {
			this.a = -1 + this.a;
			if (this.a == 0) {
				new wc((Context) this.b)
						.c(R.string.title_enable_root)
						.f(R.string.msg_enable_root)
						.b(17039369, null)
						.a(R.string.title_action_check_root,
								(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

									public void onClick(
											DialogInterface dialogInterface,
											int n) {
										dialogInterface.dismiss();
										ir.b((Context) MyLogoPreference.this.b,
												vb.a());
									}
								}).e(-1).b(false).a(false).e();
			}
		}
	}

	public void a(MainActivity mainActivity) {
		this.b = mainActivity;
	}

	public View getView(View view, ViewGroup viewGroup) {
		this.a = 5;
		return super.getView(view, viewGroup);
	}

	protected void onBindView(View view) {
		super.onBindView(view);
		view.findViewById(R.id.logo).setOnClickListener(
				(View.OnClickListener) this);
		((TextView) view.findViewById(R.id.version))
				.setText((CharSequence) "v 2.0");
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default: {
			return;
		}
		case 2131493038:
		}
		this.a();
	}

}
