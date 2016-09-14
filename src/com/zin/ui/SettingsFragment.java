/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.preference.Preference
 *  android.preference.Preference$OnPreferenceChangeListener
 *  android.preference.Preference$OnPreferenceClickListener
 *  android.preference.PreferenceScreen
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.lazyswipe.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.SwipeService;
import com.lazyswipe.preference.MyLogoPreference;
import com.lazyswipe.preference.MyPreference;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.ja;
import com.main.jc;
import com.main.jd;
import com.main.kz;
import com.main.ol;
import com.main.ox;
import com.main.pa;
import com.main.pe;
import com.main.qd;
import com.main.se;
import com.main.tf;
import com.main.to;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class SettingsFragment extends BasePreferenceFragment {
	private se a;
	private boolean e;
	private int f = -1;
	private MyPreference g;
	private MyPreference h;
	private MyPreference i;
	private FloatWindowHintView j;
	private pa k;
	private int l;
	private Drawable m;

	private void a(boolean flag) {
		if (i == null) {
			return;
		}
		if (!flag) {
			getPreferenceScreen().removePreference(i);
			i = null;
			return;
		}
		if (h == null) {
			getPreferenceScreen().addPreference(i);
			i = null;
			return;
		} else {
			getPreferenceScreen().removePreference(i);
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void g() {
		if (pe.a()) {
			l = l | 4;
		} else {
			l = l & -5;
		}
		if (!ir.k(getActivity())) {
			l = l | 2;
		} else {
			l = l & -3;
		}
		if ((l & 1) == 0) {
			if (b.getPopupMenu() != null) {
				if (m == null) {
					m = qd.a((int) (4.666667F * getResources()
							.getDisplayMetrics().density), Color
							.parseColor("#ff5c26"));
				}
				int j1 = b.getPopupMenu().a().b();
				int i1 = 0;
				while (i1 < j1) {
					kz kz1 = b.getPopupMenu().a().a(i1);
					if (kz1.a() == R.id.menu_upgrade) {
						if ((l & 4) != 0) {
							kz1.a(m);
						} else {
							kz1.b();
						}
					} else if (kz1.a() == R.id.menu_facebook) {
						if ((l & 2) != 0) {
							kz1.a(m);
						} else {
							kz1.b();
						}
					} else {
						kz1.b();
					}
					i1++;
				}
			}
			if ((l & 4) != 0 || (l & 2) != 0) {
				b.b();
			} else {
				b.c();
				if (!ir.o(getActivity())) {
					MyPreference mypreference = (MyPreference) findPreference("pref_app_box");
					if (mypreference != null) {
						mypreference.a().a(false, true);
						return;
					}
				}
			}
		}
	}

	private void h() {
		jc.g();
		this.a.a("\u4e3b\u52a8", R.string.msg_rate_settings, true);
	}

	private void i() {
		jc.h();
		if ((2 & this.l) != 0) {
			this.l = -3 & this.l;
			ir.l((Context) this.getActivity());
		}
		try {
			this.startActivity(vk.c("fb://page/758491187563051").setClassName(
					"com.facebook.katana",
					"com.facebook.katana.IntentUriHandler"));
			return;
		} catch (Exception var1_1) {
			try {
				this.startActivity(vk
						.c("https://www.facebook.com/758491187563051"));
				return;
			} catch (Exception var2_2) {
				return;
			}
		}
	}

	private void j() {
		if ((1 & this.l) != 0) {
			ir.i((Context) this.getActivity());
			this.l = -2 & this.l;
		}
	}

	private void k() {
		ir.h((Context) this.getActivity(), false);
		Bundle bundle = new Bundle(1);
		bundle.putInt("operation", 2);
		SwipeService.a((Context) this.getActivity(), bundle);
	}

	private void l() {
		ir.n(getActivity());
		getPreferenceScreen().removePreference(h);
		h = null;
		m();
		if (vk.b(getActivity(), "com.hola.launcher")) {
			jd.a(1);
			vk.c(getActivity(), vk.b("com.hola.launcher"));
			return;
		} else {
			jd.a(0);
			vk.f(getActivity(),
					"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_setting");
			return;
		}
	}

	private void m() {
		this.a(ol.a());
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	public boolean a(Preference var1, String var2) {
		Activity var4 = this.getActivity();
		byte var3 = -1;
		switch (var2.hashCode()) {
		case -1645022231:
			if (var2.equals("key_theme")) {
				var3 = 1;
			}
			break;
		case -506956055:
			if (var2.equals("pref_app_promotion")) {
				var3 = 4;
			}
			break;
		case -51191454:
			if (var2.equals("pref_facebook")) {
				var3 = 3;
			}
			break;
		case 514560440:
			if (var2.equals("key_hint_rate")) {
				var3 = 2;
			}
			break;
		case 2098177169:
			if (var2.equals("pref_app_box")) {
				var3 = 0;
			}
		}

		switch (var3) {
		case 0:
			ir.p(var4);
			return false;
		case 1: // '\001'

			this.e = ir.d(var4, false);
			if (this.e) {
				this.f = ir.U(var4);
			}

			this.j();
			return false;

		case 2:
			this.h();
			return true;
		case 3:
			this.i();
			return true;
		case 4:
			this.l();
			return true;
		default:
			return false;
		}
	}

	/*
	 * Exception decompiling
	 */

	public boolean a(Preference var1, String var2, Object var3) {
		Activity var5 = this.getActivity();
		byte var4 = -1;
		switch (var2.hashCode()) {
		case -1959629169:
			if (var2.equals("key_enable_float_window")) {
				var4 = 0;
			}
		default:
			switch (var4) {
			case 0:
				if (((Boolean) var3).booleanValue()) {
					MainActivity.b(var5);
					jc.a((Context) var5, "BG", (String) "1");
				} else {
					this.k();
					jc.a((Context) var5, "BG", (String) "0");
				}

				return true;
			default:
				return false;
			}
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	/*
	 * public boolean a(kz var1) { boolean var2 = true; switch (var1.a()) { case
	 * 2131493083: this.i(); return true; case 2131493084:
	 * this.startActivity(new Intent(this.getActivity(),
	 * FragmentContainer$FeedbackActivity.class)); return true; case 2131493085:
	 * FeedbackFragment.a((Context) this.getActivity()); return true; case
	 * 2131493086: this.l &= -5; ja.a().a((String) "Upgrade点击"); if (this.k !=
	 * null) { this.k.a(); return true; } break; case 2131493087: //
	 * this.startActivity(new Intent(this.getActivity(), //
	 * AllAppsActivity.class)); return true; default: var2 = false; }
	 * 
	 * return var2; }
	 */
	public boolean a(kz kz) {
		boolean bl = true;
		switch (kz.a()) {
		default: {
			return false;
		}
		case 2131493073: {
			this.i();
			return bl;
		}
		case 2131493075: {
			FeedbackFragment.a((Context) this.getActivity());
			return bl;
		}
		case 2131493074: {
			this.startActivity(new Intent((Context) this.getActivity(),
					(Class) FragmentContainer$FeedbackActivity.class));
			return bl;
		}
		case 2131493076:

			this.l = -5 & this.l;
			ja.a().a("Upgrade\u70b9\u51fb");
			if (this.k == null)
				return bl;
			this.k.a();
			return bl;
		}
	}

	protected void c() {
		this.b.setIcon((Drawable) null);
	}

	protected CharSequence d() {
		return null;
	}

	protected int e() {
		return R.menu.settings_options;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	@SuppressWarnings("deprecation")
	void f() {
		Object obj;
		if (j != null) {

			obj = j.getParent();
			if (obj != null) {
				return;
			}
			// a.showFloatWindowView(j);
			return;

		} else {

			j = (FloatWindowHintView) LayoutInflater
					.from(getActivity())
					.inflate(R.layout.float_window_permission_hint, null, false);
			obj = tf.a(getView().getRootView());
			if (obj == null) {

				try {
					j.setBackgroundResource(R.color.fan_background_color);
				} catch (Throwable throwable) {
					return;
				}

				a.showFloatWindowView(j);
				return;
			} else {

				tf.a(((android.graphics.Bitmap) (obj)), 40, true);
				j.setBackgroundDrawable(new BitmapDrawable(getResources(),
						((android.graphics.Bitmap) (obj))));

			}

		}

	}

	public void onAttach(Activity activity) {
		super.onAttach(activity);
		this.a = (se) activity;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		boolean bl;
		boolean bl2 = false;
		try {
			bl2 = ol.a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.l = 0;
		this.k = new pa(this.getActivity());
		// addPreferencesFromResource(0x7f070003);
		this.addPreferencesFromResource(R.xml.pref_main_settings);
		this.findPreference((CharSequence) "key_enable_float_window")
				.setOnPreferenceChangeListener(
						(Preference.OnPreferenceChangeListener) this);
		this.findPreference((CharSequence) "key_hint_rate")
				.setOnPreferenceClickListener(
						(Preference.OnPreferenceClickListener) this);
		((MyLogoPreference) this.findPreference((CharSequence) "pref_logo"))
				.a((MainActivity) this.getActivity());
		this.g = (MyPreference) this.findPreference((CharSequence) "key_theme");
		this.g.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		if (!ir.h((Context) this.getActivity())) {
			this.l = 1 | this.l;
			this.g.a().a(false, false);
		}

		this.h = (MyPreference) this
				.findPreference((CharSequence) "pref_app_promotion");
		if (!(bl2 || !vk.b((Context) this.getActivity(), "com.hola.launcher") || !ir
				.m((Context) this.getActivity()))) {
			this.h.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		} else {
			this.getPreferenceScreen().removePreference((Preference) this.h);
			this.h = null;
		}
		this.i = (MyPreference) this
				.findPreference((CharSequence) "pref_app_box");
		this.i.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		this.a(bl2);
		try {
			boolean bl3;
			bl = bl3 = TextUtils.isEmpty((CharSequence) this
					.getText(R.string.config_exclusively_launch));
		} catch (Resources.NotFoundException var4_5) {
			bl = true;
		}
		if (bl) {
			this.getPreferenceScreen()
					.removePreference(
							this.findPreference((CharSequence) "pref_exclusively_launch"));
		}
		if (InitialSettingsFragment.a((Context) this.getActivity()) == 0
				&& Build.VERSION.SDK_INT < 18) {
			this.getPreferenceScreen()
					.removePreference(
							this.findPreference((CharSequence) "pref_initial_settings"));
		}
	}

	public void onDestroy() {
		super.onDestroy();
		if (this.k != null) {
			this.k.b();
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public void onResume() {
		super.onResume();
		this.g();
		if (Build.VERSION.SDK_INT >= 19 || to.k() && to.A()) {
			if (!to.a((Context) this.getActivity())) {
				new Handler().postDelayed((Runnable) new Runnable() {

					public void run() {
						 SettingsFragment.this.f();
					}
				}, 20);
				return;
			}
			if (this.j != null && this.j.isShown()) {
				((ViewGroup) this.j.getParent()).removeView((View) this.j);
			}
		}
		MyPreference myPreference = this.g;
		Object[] arrobject = new Object[] { ox.b((Context) this.getActivity()) };
		myPreference.setSummary((CharSequence) this.getString(
				R.string.pref_description_theme, arrobject));
		if (!this.e)
			return;
		this.e = false;
		if (this.f < 0)
			return;
		if (ir.U((Context) this.getActivity()) == this.f)
			return;
		ir.e((Context) this.getActivity(), true);
		this.a.a("\u4e3b\u9898", R.string.pref_description_theme, false);
	}

}
