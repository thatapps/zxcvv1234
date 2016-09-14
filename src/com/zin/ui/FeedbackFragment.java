/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 */
package com.lazyswipe.ui;

import java.util.Locale;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.lazyswipe.zev.R;
import com.main.bx;
import com.main.ji;
import com.main.uj;
import com.main.vi;
import com.main.vj;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class FeedbackFragment extends BaseFragment {
	private static final String c = "Swipe."
			+ FeedbackFragment.class.getSimpleName();
	View a;
	EditText b;
	private BroadcastReceiver d;
	private EditText e;

	public static void a(Context context) {
		try {
			context.startActivity(vk
					.c("http://www.lazyswipe.com/help.html?lang="
							+ Locale.getDefault().getLanguage()));
			return;
		} catch (Exception var1_1) {
			return;
		}
	}

	private void b() {
		if (!uj.d((Context) this.getActivity())) {
			vi.a((Context) this.getActivity(),
					R.string.download_checking_connection_failed);
			return;
		}
		if (TextUtils.isEmpty((CharSequence) this.e.getText())) {
			vi.a((Context) this.getActivity(), R.string.feedback_email_missing);
			return;
		}
		if (TextUtils.isEmpty((CharSequence) this.b.getText())) {
			vi.a((Context) this.getActivity(),
					R.string.feedback_content_missing);
			return;
		}
		this.d = new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent) {
				FeedbackFragment.this.a.setEnabled(true);
				FeedbackFragment.this.b.setText(null);
				bx.a(context).a((BroadcastReceiver) this);
				FeedbackFragment.this.d = null;
				vi.a(context, R.string.feedback_thanks);
			}
		};
		bx.a((Context) this.getActivity()).a(this.d,
				new IntentFilter("Swipe..intent.action.FEEDBACK_SENT"));
		this.a.setEnabled(false);
		vi.a((Context) this.getActivity(), R.string.feedback_sending);
		ji.a(this.getActivity().getApplicationContext(), null, this.b.getText()
				.toString(), this.e.getText().toString());
	}

	private void c() {
		try {
			Account[] arraccount = AccountManager.get(
					(Context) this.getActivity()).getAccountsByType(
					"com.google");
			if (arraccount.length > 0) {
				this.e.setText((CharSequence) arraccount[0].name);
			}
			return;
		} catch (Throwable var1_2) {
			return;
		}
	}

	public int a() {
		return R.layout.fragment_feedback;
	}

	public void a(View view) {
		super.a(view);
		this.b = (EditText) view.findViewById(R.id.feedback_content);
		this.e = (EditText) view.findViewById(R.id.feedback_email);
		((TextView) view.findViewById(R.id.feedback_email_contact))
				.setText((CharSequence) this.getActivity().getString(
						R.string.feedback_send,
						new Object[] { "lazyswipe@gmail.com" }));
		this.a = view.findViewById(R.id.feedback_send);
		this.a.setOnClickListener((View.OnClickListener) this);
		this.c();
	}

	public void c(View view) {
		FeedbackFragment.a((Context) this.getActivity());
	}

	protected void d() {
		super.d();
		this.o.setActionTitle(R.string.pref_title_faq);
	}

	protected void d(View view) {
		switch (view.getId()) {
		default: {
			return;
		}
		case 2131492984:
		}
		this.b();
	}

	protected CharSequence g() {
		return this.getText(R.string.activity_title_feedback);
	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		vj.c();
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public void onDestroyView() {
		super.onDestroyView();
		if (this.d == null)
			return;
		try {
			bx.a((Context) this.getActivity()).a(this.d);
		} catch (Exception exception) {
			return;
		} finally {
			this.d = null;
		}
		return;
	}

}
