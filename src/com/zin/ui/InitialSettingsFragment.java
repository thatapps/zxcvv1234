//zevienin

package com.lazyswipe.ui;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;

import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.preference.MyCheckBoxPreference;
import com.lazyswipe.zev.R;
import com.main.to;

// Referenced classes of package com.lazyswipe.ui:
//            BasePreferenceFragment, FullscreenTipActivity

public class InitialSettingsFragment extends BasePreferenceFragment {

	private MyCheckBoxPreference a;
	private int e;

	public InitialSettingsFragment() {
	}

	public static int a(Context context) {
		if (to.z()) {
			return 1;
		}
		if (to.y() || to.k()) {
			return 2;
		}
		return !to.D() || !to.i(context) ? 0 : 3;
	}

	private void a(Preference preference, Preference preference1) {
		e = a(((Context) (getActivity())));
		PreferenceScreen preferencescreen = getPreferenceScreen();
		switch (e) {
		default:
			preferencescreen.removePreference(preference);
			preferencescreen.removePreference(preference1);
			return;

		case 1: // '\001'
			preferencescreen.removePreference(preference1);
			preference.setTitle(0x7f0f0077);
			preference.setSummary(0x7f0f0066);
			preference.setOnPreferenceClickListener(this);
			return;

		case 2: // '\002'
			preferencescreen.removePreference(preference1);
			preference.setTitle(0x7f0f0078);
			preference.setSummary(0x7f0f0066);
			preference.setOnPreferenceClickListener(this);
			return;

		case 3: // '\003'
			preference.setTitle(0x7f0f0077);
			break;
		}
		preference.setSummary(0x7f0f0066);
		preference1.setTitle(0x7f0f0076);
		preference1.setSummary(0x7f0f0065);
		preference.setOnPreferenceClickListener(this);
		preference1.setOnPreferenceClickListener(this);
	}

	private void f() {
		switch (e) {
		default:
			return;

		case 1: // '\001'
			FullscreenTipActivity.a(getActivity());
			return;

		case 2: // '\002'
			FullscreenTipActivity.d(getActivity());
			return;

		case 3: // '\003'
			FullscreenTipActivity.c(getActivity());
			break;
		}
	}

	private void g() {
		switch (e) {
		default:
			return;

		case 3: // '\003'
			FullscreenTipActivity.b(getActivity());
			break;
		}
	}

	public boolean a(Preference preference, String s) {
		byte byte0 = -1;
		// s.hashCode();
		// JVM INSTR lookupswitch 3: default 40
		// -1072164622: 70
		// 1705792230: 84
		// 1705792231: 98;
		// goto _L1 _L2 _L3 _L4

		switch (s.hashCode()) {
		default:
			break;
		case -1072164622:
			if (s.equals("pref_accessibility_touch")) {
				byte0 = 0;
			}
			break;
		case 1705792230:
			if (s.equals("pref_setting_1")) {
				byte0 = 1;
			}

			break;
		case 1705792231:
			if (s.equals("pref_setting_2")) {
				byte0 = 2;
			}

		}

		switch (byte0) {
		default:
			return false;

		case 0: // '\0'
			SwipeAccessibilityService.a(getActivity(), a.isChecked());
			return true;

		case 1: // '\001'
			f();
			return true;

		case 2: // '\002'
			g();
			break;
		}

		return true;
	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		addPreferencesFromResource(R.xml.pref_initial_settings);
		a = (MyCheckBoxPreference) findPreference("pref_accessibility_touch");
		if (android.os.Build.VERSION.SDK_INT >= 18) {
			a.setOnPreferenceClickListener(this);
		} else {
			getPreferenceScreen().removePreference(a);
			a = null;
		}
		a(findPreference("pref_setting_1"), findPreference("pref_setting_2"));
	}

	public void onResume() {
		super.onResume();
		android.app.Activity activity = getActivity();
		try {

			if (a != null) {
				a.setChecked(SwipeAccessibilityService.a(activity));
			}
			return;
		} catch (Throwable throwable) {
			return;
		}
	}
}
