/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.preference.Preference
 *  android.preference.Preference$OnPreferenceClickListener
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.lazyswipe.preference;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.main.qc;
import com.main.qd;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public class MyPreference extends Preference implements qc {

	// private static final
	// android.preference.Preference.OnPreferenceClickListener c = new
	// android.preference.Preference.OnPreferenceClickListener() {
	//
	// public boolean onPreferenceClick(Preference preference) {
	// Intent intent;
	// boolean bl = true;
	// if (preference == null)
	// return false;
	// if (!(preference instanceof qc)) {
	// return false;
	// }
	// Preference.OnPreferenceClickListener onPreferenceClickListener =
	// preference
	// .getOnPreferenceClickListener();
	// boolean bl2 = onPreferenceClickListener != null
	// && onPreferenceClickListener.onPreferenceClick(preference) ? bl
	// : false;
	// qd qd = ((MyPreference) preference).a();
	// if (qd != null) {
	// if (!qd.a()) {
	// qd.a(bl, bl);
	// }
	// if (bl2)
	// return bl;
	// }
	// if ((intent = preference.getIntent()) == null) {
	// return false;
	// }
	// try {
	// preference.getContext().startActivity(intent);
	// return bl;
	// } catch (Exception exception) {
	// Toast.makeText(
	// (Context) preference.getContext(),
	// (CharSequence) ("No activity found to handle intent: " + (Object)
	// intent),
	// (int) 0).show();
	// Log.e("Message", "Themes Status" + intent);
	// return bl;
	// }
	// }
	//
	// };
	private static final OnPreferenceClickListener c = new OnPreferenceClickListener() {
		public boolean onPreferenceClick(Preference var1) {
			boolean var3 = true;
			if (var1 != null && var1 instanceof qc) {
				OnPreferenceClickListener var4 = var1
						.getOnPreferenceClickListener();
				boolean var2;
				if (var4 != null && var4.onPreferenceClick(var1)) {
					var2 = true;
				} else {
					var2 = false;
				}

				qd var7 = ((MyPreference) var1).a();
				if (var7 != null && !var7.a()) {
					var7.a(true, true);
				}

				if (!var2) {
					Intent var8 = var1.getIntent();
					if (var8 != null) {
						try {
							var1.getContext().startActivity(var8);
							return true;
						} catch (Throwable var6) {
							Toast.makeText(
									var1.getContext(),
									"No activity found to handle intent: "
											+ var8, 0).show();
							return true;
						}
					}

					return false;
				}
			} else {
				var3 = false;
			}

			return var3;
		}
	};
	private qd a;
	private android.preference.Preference.OnPreferenceClickListener b;

	public MyPreference(Context context) {
		this(context, null);
	}

	public MyPreference(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public MyPreference(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
		setLayoutResource(0x7f040039);
		setWidgetLayoutResource(0x7f04003c);
		a = new qd(this, context, attributeset, i);
	}

	public qd a() {
		return a;
	}

	public android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() {
		return b;
	}

	public View getView(View view, ViewGroup viewgroup) {
		super.setOnPreferenceClickListener(c);
		try {
			view = super.getView(view, viewgroup);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.a("Swipe.MyPreference", "Exception in Preference.getView()"
					+ view);
			return null;
		}
		return view;
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

	public void setOnPreferenceClickListener(
			android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener) {
		b = onpreferenceclicklistener;
	}

}
