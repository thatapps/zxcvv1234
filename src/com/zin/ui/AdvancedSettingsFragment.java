package com.lazyswipe.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;

import com.lazyswipe.SwipeService;
import com.lazyswipe.features.poptime.PopTimeBlackListLayout;
import com.lazyswipe.ui.chooser.MultiChooserActivity;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.jb;
import com.main.jc;
import com.main.jw;
import com.main.ve;
import com.main.vi;
import com.main.vk;
import com.main.vz;
import com.main.wb;
import com.main.wc;

public class AdvancedSettingsFragment extends BasePreferenceFragment implements
		DialogInterface.OnMultiChoiceClickListener,
		SeekBar.OnSeekBarChangeListener {
	Preference a;
	private Preference e;
	private Preference f;
	private boolean[] g;
	private int h;
	private Preference i;
	private Dialog j;
	PopTimeBlackListLayout popTimeBlackListLayout;

	private void f() {
		boolean bl = 1 == ir.b((Context) this.getActivity());

		if (!bl) {
			popTimeBlackListLayout = (PopTimeBlackListLayout) LayoutInflater
					.from((Context) this.getActivity()).inflate(
							R.layout.pop_time_black_list, null, false);
		}
		final String string = ir.M((Context) this.getActivity());
		final int n = vk.a(
				this.getResources().getStringArray(R.array.pop_option_values),
				string);
		wb wb = new wc((Context) this.getActivity())
				.c(R.string.pref_title_when_to_pop)
				.a(R.array.pop_option_titles,
						n,
						(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

							public void onClick(
									DialogInterface dialogInterface, int n) {
								try {
									String string3 = AdvancedSettingsFragment.this
											.getResources().getStringArray(
													R.array.pop_option_values)[n];
									if (!string.equals((Object) string3)) {
										ir.e((Context) AdvancedSettingsFragment.this
												.getActivity(), string3);
										jw.d();
										String string2 = AdvancedSettingsFragment.this
												.getResources()
												.getStringArray(
														R.array.pop_option_titles)[n];
										AdvancedSettingsFragment.this.a
												.setSummary((CharSequence) string2);
										Bundle bundle = new Bundle(3);
										bundle.putInt("operation", 5);
										bundle.putInt("type", 0);
										bundle.putString("param_1", string3);
										SwipeService
												.a((Context) AdvancedSettingsFragment.this
														.getActivity(), bundle);
										jc.a((Context) AdvancedSettingsFragment.this
												.getActivity(), "BI", string3);
									}
									return;
								} catch (Exception var4_6) {
									return;
								} finally {
									dialogInterface.dismiss();
								}
							}
						}).b(true).c((View) popTimeBlackListLayout).e();
		if (popTimeBlackListLayout != null) {
			wb.setOnKeyListener((DialogInterface.OnKeyListener) new DialogInterface.OnKeyListener() {

				@Override
				public boolean onKey(DialogInterface dialog, int keyCode,
						KeyEvent event) {
					if (n == 4 && popTimeBlackListLayout.b()) {
						popTimeBlackListLayout.a();
						return true;
					}
					return false;
				}
			});
		}
	}

	static Preference a(AdvancedSettingsFragment advancedsettingsfragment) {
		return advancedsettingsfragment.i;
	}

	static Preference b(AdvancedSettingsFragment advancedsettingsfragment) {
		return advancedsettingsfragment.f;
	}

	static int c(AdvancedSettingsFragment advancedsettingsfragment) {
		return advancedsettingsfragment.j();
	}

	private void g() {
		final int k = ir.b(getActivity());
		int l = vk.a(
				getResources().getStringArray(R.array.toucher_type_values),
				String.valueOf(k));
		(new wc(getActivity()))
				.c(R.string.pref_title_toucher_type)
				.a(R.array.toucher_type_titles, l,
						new android.content.DialogInterface.OnClickListener() {

							final int a;
							final AdvancedSettingsFragment b;

							public void onClick(
									DialogInterface dialoginterface, int i1) {
								boolean flag = true;
								Object obj;
								int j1;
								j1 = ve.a(
										b.getResources().getStringArray(
												R.array.toucher_type_values)[i1],
										0);
								if (a == j1) {
									// break MISSING_BLOCK_LABEL_90;
								}
								ir.a(b.getActivity(), j1);
								obj = b.getResources().getStringArray(
										R.array.toucher_type_titles)[i1];
								AdvancedSettingsFragment.a(b).setSummary(
										((CharSequence) (obj)));
								obj = AdvancedSettingsFragment.b(b);
								if (1 == j1) {
									flag = false;
								}
								try {
									((Preference) (obj)).setEnabled(flag);
								} catch (Throwable throwable) {
								}
								dialoginterface.dismiss();
								return;
							}

							{
								b = AdvancedSettingsFragment.this;
								a = k;
								// super();
							}
						}).e();
	}

	// private void h() {
	// jc.a((Context) this.getActivity(), "BJ");
	// vz vz = (vz) LayoutInflater.from((Context) this.getActivity()).inflate(
	// R.layout.toucher_size_seek_bar, null, false);
	// vz.setProgress(ir.t((Context) this.getActivity()));
	// vz.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this);
	// this.j = new wc((Context) this.getActivity())
	// .c(R.string.pref_title_toucher_position)
	// .a(R.array.toucher_position_titles, this.g,
	// (DialogInterface.OnMultiChoiceClickListener) this)
	// .b(false)
	// .a(false)
	// .e(-1)
	// .a(R.string.done,
	// (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
	//
	// public void onClick(
	// DialogInterface dialogInterface, int n) {
	// if (AdvancedSettingsFragment.this.j() == 0) {
	// vi.a((Context) AdvancedSettingsFragment.this
	// .getActivity(),
	// R.string.msg_no_toucher_selected);
	// return;
	// }
	// dialogInterface.dismiss();
	// Bundle bundle = new Bundle(1);
	// bundle.putInt("operation", 7);
	// SwipeService.a(
	// (Context) AdvancedSettingsFragment.this
	// .getActivity(), bundle);
	// }
	// }).b((View) vz).e();
	// Bundle bundle = new Bundle(2);
	// bundle.putInt("operation", 7);
	// bundle.putBoolean("param_1", true);
	// SwipeService.a((Context) this.getActivity(), bundle);
	// }
	private void h() {
		jc.a(getActivity(), "BJ");
		Object obj = (vz) LayoutInflater.from(getActivity()).inflate(
				R.layout.toucher_size_seek_bar, null, false);
		((vz) (obj)).setProgress(ir.t(getActivity()));
		((vz) (obj)).setOnSeekBarChangeListener(this);
		j = (new wc(getActivity()))
				.c(0x7f0f007c)
				.a(0x7f080002, g, this)
				.b(false)
				.a(false)
				.e(-1)
				.a(0x7f0f000e,
						new android.content.DialogInterface.OnClickListener() {

							final AdvancedSettingsFragment a;

							public void onClick(
									DialogInterface dialoginterface, int k) {
								if (AdvancedSettingsFragment.c(a) == 0) {
									vi.a(a.getActivity(), 0x7f0f0047);
									return;
								} else {
									dialoginterface.dismiss();
									Bundle bundle = new Bundle(1);
									bundle.putInt("operation", 7);
									SwipeService.a(
											AdvancedSettingsFragment.this
													.getActivity(), bundle);
									return;
								}
							}

							{
								a = AdvancedSettingsFragment.this;
								// super();
							}
						}).b(((android.view.View) (obj))).e();
		Bundle bundle = new Bundle(2);
		((Bundle) (bundle)).putInt("operation", 7);
		((Bundle) (bundle)).putBoolean("param_1", true);
		SwipeService.a(getActivity(), ((Bundle) (bundle)));
	}

	private void i() {
		if (g == null) {
			g = new boolean[ir.a.length];
		}
		int k = 0;
		while (k < ir.a.length) {
			boolean aflag[] = g;
			boolean flag;
			if (ir.a[k] == (h & ir.a[k])) {
				flag = true;
			} else {
				flag = false;
			}
			aflag[k] = flag;
			k++;
		}
	}

	private int j() {
		this.i();
		String[] arrstring = this.getResources().getStringArray(
				R.array.toucher_position_titles);
		StringBuilder stringBuilder = new StringBuilder();
		int n = 0;
		for (int i = 0; i < this.g.length; ++i) {
			if (!this.g[i])
				continue;
			++n;
			stringBuilder.append(arrstring[i]).append(", ");
		}
		if (n == 0) {
			return n;
		}
		this.f.setSummary(stringBuilder.subSequence(0,
				-2 + stringBuilder.length()));
		return n;
	}

	public boolean a(Preference var1, String var2) {
		byte var3 = -1;
		switch (var2.hashCode()) {
		case -503985843:
			if (var2.equals("key_toucher_type")) {
				var3 = 3;
			}
			break;
		case 998503917:
			if (var2.equals("key_tab_mode")) {
				var3 = 4;
			}
			break;
		case 1168227666:
			if (var2.equals("key_when_to_pop")) {
				var3 = 0;
			}
			break;
		case 1227919804:
			if (var2.equals("key_toucher_position")) {
				var3 = 2;
			}
			break;
		case 1956652244:
			if (var2.equals("key_white_list")) {
				var3 = 1;
			}
		}

		switch (var3) {
		case 0:
			this.f();
			return true;
		case 1:
			jc.a((Context) this.getActivity(), (String) "BK");
			Intent var4 = MultiChooserActivity.a(true);
			var4.putExtra("extra.request_type", 0);
			this.startActivityForResult(var4, 1);
			return true;
		case 2:
			this.h();
			return true;
		case 3:
			this.g();
			return true;

		default:
			return false;
		}
	}

	public void onActivityResult(int var1, int var2, Intent var3) {
		if (-1 == var2) {
			switch (var1) {
			case 1:
				var1 = var3.getIntExtra("extra.result_chosen_count", 0);
				this.e.setSummary(this.getString(0x7f0f005b,
						new Object[] { Integer.valueOf(var1) }));
				return;
			default:
			}
		}
	}

	/*
	 * public void onClick(DialogInterface dialogInterface, int n, boolean bl) {
	 * this.h = bl ? (this.h |= ir.a[n]) : (this.h &= -1 ^ ir.a[n]);
	 * ir.e((Context) this.getActivity(), this.h); Bundle bundle = new
	 * Bundle(3); bundle.putInt("operation", 6); bundle.putInt("param_1",
	 * this.h); bundle.putBoolean("param_2", true); SwipeService.a((Context)
	 * this.getActivity(), bundle); }
	 */
	// public void onClick(DialogInterface dialoginterface, int k, boolean flag)
	// {
	// if (flag) {
	// h = h | ir.a[k];
	// } else {
	// h = h & /*~*/ir.a[k];
	// }
	// ir.e(getActivity(), h);
	// Bundle bundle = null;
	// bundle = new Bundle(3);
	// bundle.putInt("operation", 6);
	// bundle.putInt("param_1", h);
	// bundle.putBoolean("param_2", true);
	// SwipeService.a(getActivity(), bundle);
	// }
	public void onClick(DialogInterface dialoginterface, int k, boolean flag) {
		if (flag) {
			h = h | ir.a[k];
		} else {
			h = h & ~ir.a[k];
		}
		ir.e(getActivity(), h);
		Bundle bundle = new Bundle(3);
		bundle.putInt("operation", 6);
		bundle.putInt("param_1", h);
		bundle.putBoolean("param_2", true);
		SwipeService.a(getActivity(), bundle);
	}

	public void onCreate(Bundle bundle) {
		int n = 1;
		super.onCreate(bundle);
		Activity activity = this.getActivity();
		this.addPreferencesFromResource(R.xml.pref_advanced_settings);
		this.a = this.findPreference((CharSequence) "key_when_to_pop");
		this.a.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		int n2 = vk.a(
				this.getResources().getStringArray(R.array.pop_option_values),
				ir.M((Context) activity));
		this.a.setSummary((CharSequence) this.getResources().getStringArray(
				R.array.pop_option_titles)[n2]);
		this.e = this.findPreference((CharSequence) "key_white_list");
		this.e.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		int n3 = ir.Q((Context) activity);
		Preference preference = this.e;
		Object[] arrobject = new Object[n];
		arrobject[0] = n3;
		preference.setSummary((CharSequence) this.getString(
				R.string.pref_description_apps_selected, arrobject));
		this.h = ir.D((Context) this.getActivity());
		this.f = this.findPreference((CharSequence) "key_toucher_position");
		this.f.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		this.j();
		this.i = this.findPreference((CharSequence) "key_toucher_type");
		this.i.setOnPreferenceClickListener((Preference.OnPreferenceClickListener) this);
		int n4 = ir.b((Context) this.getActivity());
		Preference preference2 = this.f;
		if (n == n4) {
			n = 0;
		}
		preference2.setEnabled(Boolean.valueOf(String.valueOf(n)));
		this.i.setSummary((CharSequence) this.getResources().getStringArray(
				R.array.toucher_type_titles)[n4]);
	}

	public void onDestroy() {
		if (this.j != null && this.j.isShowing()) {
			this.j.dismiss();
			Bundle bundle = new Bundle(1);
			bundle.putInt("operation", 7);
			SwipeService.a((Context) this.getActivity(), bundle);
		}
		super.onDestroy();
	}

	public void onProgressChanged(SeekBar seekBar, int n, boolean bl) {
		ir.c((Context) this.getActivity(), n);
		Bundle bundle = new Bundle(1);
		bundle.putInt("operation", 8);
		SwipeService.a((Context) this.getActivity(), bundle);
	}

	public void onResume() {
		super.onResume();
	}

	public void onStartTrackingTouch(SeekBar seekBar) {
	}

	public void onStopTrackingTouch(SeekBar seekBar) {
	}

}
