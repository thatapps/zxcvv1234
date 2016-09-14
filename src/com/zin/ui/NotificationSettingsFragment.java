//zevienin

package com.lazyswipe.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import com.lazyswipe.SwipeService;
import com.lazyswipe.preference.MyCheckBoxPreference;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.jc;
import com.main.pq;
import com.main.uk;
import com.main.vk;

// Referenced classes of package com.lazyswipe.ui:
//            BasePreferenceFragment, NotificationSettingsActivity

public class NotificationSettingsFragment extends BasePreferenceFragment {

	private Preference a;
	private boolean e;
	private android.content.SharedPreferences.OnSharedPreferenceChangeListener f;
	private HashSet g;
	private List h;
	private android.view.WindowManager.LayoutParams i;
	private WindowManager j;
	private View k;
	private boolean l;

	public NotificationSettingsFragment() {
		g = new HashSet();
		h = new ArrayList();
		l = false;
	}

	static List a(NotificationSettingsFragment notificationsettingsfragment) {
		return notificationsettingsfragment.h;
	}

	private void a(SharedPreferences sharedpreferences) {
		String string = sharedpreferences.getString(
				"key_notification_apps_selected", "");
		g.clear();
		if (!TextUtils.isEmpty(string)) {
			String[] strings = string.split(",");
			g.addAll(Arrays.asList(strings));
		}
	}

	static void a(NotificationSettingsFragment notificationsettingsfragment,
			SharedPreferences sharedpreferences) {
		notificationsettingsfragment.a(sharedpreferences);
	}

	// private void a(String s, String s1) {
	// MyCheckBoxPreference myCheckBoxPreference = (MyCheckBoxPreference)
	// findPreference(s);
	// if (!vk.b(getActivity(), s1) || !uk.a(s1)) {
	// getPreferenceScreen().removePreference(myCheckBoxPreference);
	// return;
	// }
	// myCheckBoxPreference.setOnPreferenceChangeListener(this);
	// boolean flag;
	// if (pq.c(getActivity()) && g.contains(s1)) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// myCheckBoxPreference.setChecked(flag);
	// myCheckBoxPreference.a(s1);
	// myCheckBoxPreference.setTitle(vk.d(getActivity(), s1));
	// h.add(myCheckBoxPreference);
	// }
	private void a(String var1, String var2) {
		MyCheckBoxPreference var4 = (MyCheckBoxPreference) this
				.findPreference(var1);
		if (vk.b(this.getActivity(), (String) var2) && uk.a((String) var2)) {
			var4.setOnPreferenceChangeListener(this);
			boolean var3;
			if (pq.c((Context) this.getActivity()) && this.g.contains(var2)) {
				var3 = true;
			} else {
				var3 = false;
			}

			var4.setChecked(var3);
			var4.a(var2);
			var4.setTitle(vk.d(this.getActivity(), (String) var2));
			this.h.add(var4);
		} else {
			this.getPreferenceScreen().removePreference(var4);
		}
	}

	static boolean a(NotificationSettingsFragment notificationsettingsfragment,
			boolean flag) {
		notificationsettingsfragment.l = flag;
		return flag;
	}

	private boolean a(String s, boolean flag) {
		if (!flag) {
			if (g.remove(s)) {
				ir.a(getActivity())
						.edit()
						.putString("key_notification_apps_selected",
								TextUtils.join(",", g)).apply();
			}
		} else if (e) {
			if (g.add(s)) {
				ir.a(getActivity())
						.edit()
						.putString("key_notification_apps_selected",
								TextUtils.join(",", g)).apply();
				return true;
			}
		} else {
			l = true;
			SwipeService.a = System.currentTimeMillis();
			pq.d(getActivity());
			return false;
		}
		return true;
	}

	static HashSet b(NotificationSettingsFragment notificationsettingsfragment) {
		return notificationsettingsfragment.g;
	}

	static WindowManager c(
			NotificationSettingsFragment notificationsettingsfragment) {
		return notificationsettingsfragment.j;
	}

	static View d(NotificationSettingsFragment notificationsettingsfragment) {
		return notificationsettingsfragment.k;
	}

	private void f() {
		jc.a(getActivity(), "BL");
		if (e) {
			NotificationSettingsActivity.a(getActivity(),
					(String[]) g.toArray(new String[g.size()]));
			return;
		} else {
			l = true;
			SwipeService.a = System.currentTimeMillis();
			pq.d(getActivity());
			return;
		}
	}

	// private void g() {
	// i = new android.view.WindowManager.LayoutParams();
	// i.height = -1;
	// i.width = -1;
	// i.format = -3;
	// i.type = 2003;
	// i.flags = 1032;
	// j = (WindowManager) getActivity().getApplicationContext()
	// .getSystemService("window");
	// k = getActivity().getLayoutInflater().inflate(0x7f040026, null);
	// j.addView(k, i);
	// k.setOnClickListener(new android.view.View.OnClickListener() {
	//
	// final NotificationSettingsFragment a;
	//
	// public void onClick(View view) {
	// if (NotificationSettingsFragment.c(a) != null) {
	// NotificationSettingsFragment.c(a).removeView(
	// NotificationSettingsFragment.d(a));
	// NotificationSettingsFragment.a(a, false);
	// return;
	// }
	//
	// }
	//
	// {
	// a = NotificationSettingsFragment.this;
	// // super();
	// }
	// });
	// }
	private void g() {
		this.i = new LayoutParams();
		this.i.height = -1;
		this.i.width = -1;
		this.i.format = -3;
		this.i.type = 2003;
		this.i.flags = 1032;
		this.j = (WindowManager) this.getActivity().getApplicationContext()
				.getSystemService("window");
		this.k = this.getActivity().getLayoutInflater()
				.inflate(0x7f040026, (ViewGroup) null);
		this.j.addView(this.k, this.i);
		this.k.setOnClickListener(new OnClickListener() {
			public void onClick(View var1) {
				if (NotificationSettingsFragment.this.j != null) {
					try {
						NotificationSettingsFragment.this.j
								.removeView(NotificationSettingsFragment.this.k);
						NotificationSettingsFragment.this.l = false;
					} catch (Exception var2) {
						return;
					}
				}

			}
		});
	}

	public boolean a(Preference preference, String s) {
		byte byte0 = -1;
		s.hashCode();
		// JVM INSTR tableswitch -74681516 -74681516: default 24
		// -74681516 46;
		// goto _L1 _L2

		switch (s.hashCode()) {

		default:
			return false;
		case -74681516:
			if (s.equals("key_notification_apps_selected")) {
				byte0 = 0;
			}
		}
		switch (byte0) {
		default:
			return false;

		case 0: // '\0'
			f();
			break;
		}
		return true;
	}

	public boolean a(Preference preference, String s, Object obj) {
		byte byte0 = -1;
		// s.hashCode();
		// JVM INSTR lookupswitch 4: default 48
		// -2138514447: 82
		// -1310023988: 130
		// 105479044: 114
		// 437675160: 98;
		// goto _L1 _L2 _L3 _L4 _L5

		switch (s.hashCode()) {

		default:
			break;
		case -2138514447:
			if (s.equals("key_sms_notification")) {
				byte0 = 0;
			}
			break;
		case -1310023988:
			if (s.equals("key_gmail_notification")) {
				byte0 = 3;
			}
			break;
		case 105479044:
			if (s.equals("key_wechat_notification")) {
				byte0 = 2;
			}

			break;
		case 437675160:
			if (s.equals("key_whatsapp_notification")) {
				byte0 = 1;
			}

		}
		switch (byte0) {
		default:
			return false;

		case 0: // '\0'
			if (((Boolean) obj).booleanValue()) {
				SwipeService.b();
				jc.a(true);
				return true;
			} else {
				SwipeService.c();
				jc.a(false);
				return true;
			}

		case 1: // '\001'
			return a(uk.a, ((Boolean) obj).booleanValue());

		case 2: // '\002'
			return a(uk.b, ((Boolean) obj).booleanValue());

		case 3: // '\003'
			return a("com.google.android.gm", ((Boolean) obj).booleanValue());
		}

	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		addPreferencesFromResource(0x7f070004);
		a(ir.a(getActivity()));
		findPreference("key_sms_notification").setOnPreferenceChangeListener(
				this);
		a("key_whatsapp_notification", uk.a);
		a("key_wechat_notification", uk.b);
		a("key_gmail_notification", "com.google.android.gm");
		a = findPreference("key_notification_apps_selected");
		a.setOnPreferenceClickListener(this);
		f = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {

			final NotificationSettingsFragment a;

			public void onSharedPreferenceChanged(
					SharedPreferences sharedpreferences, String s) {
				if ("key_notification_apps_selected".equals(s)) {
					NotificationSettingsFragment.a(a, sharedpreferences);
					Iterator iterator = NotificationSettingsFragment.a(a)
							.iterator();
					while (iterator.hasNext()) {
						MyCheckBoxPreference boxPreference = (MyCheckBoxPreference) iterator
								.next();
						boolean flag;
						if (pq.c(a.getActivity())
								&& NotificationSettingsFragment.b(a).contains(
										boxPreference.a())) {
							flag = true;
						} else {
							flag = false;
						}
						boxPreference.setChecked(flag);
					}
				}
			}

			{
				a = NotificationSettingsFragment.this;
				// super();
			}
		};
		ir.a(getActivity()).registerOnSharedPreferenceChangeListener(f);
	}

	public void onDestroy() {
		super.onDestroy();
		ir.a(getActivity()).unregisterOnSharedPreferenceChangeListener(f);
	}

	public void onPause() {
		super.onPause();
		if (l) {
			g();
		}
	}

	// public void onResume() {
	// super.onResume();
	// l = false;
	// Object obj;
	// Exception exception;
	// MyCheckBoxPreference mycheckboxpreference;
	// int i1;
	// boolean flag;
	// if (j != null) {
	// try {
	// j.removeView(k);
	// } catch (Exception exception1) {
	// }
	// }
	// obj = getActivity();
	// e = pq.c(((Context) (obj)));
	// if (!e) {
	//
	// }
	// i1 = g.size();
	// obj = h.iterator();
	//
	// if (!((Iterator) (obj)).hasNext()) {
	// return;
	// }
	// mycheckboxpreference = (MyCheckBoxPreference) ((Iterator) (obj)).next();
	// if (g.contains(mycheckboxpreference.a())) {
	// i1--;
	// }
	//
	// try {
	// a.setSummary(getString(0x7f0f005b,
	// new Object[] { Integer.valueOf(i1) }));
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception1) {
	// vk.b(exception1, 5, "Swipe.NotificationSettings", "onResume failed");
	// }
	// obj = h.iterator();
	// while (((Iterator) (obj)).hasNext()) {
	// mycheckboxpreference = (MyCheckBoxPreference) ((Iterator) (obj))
	// .next();
	// if (pq.c(getActivity()) && g.contains(mycheckboxpreference.a())) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// mycheckboxpreference.setChecked(flag);
	// }
	//
	// a.setSummary(getString(R.string.pref_description_notification_apps_off));
	//
	// }
	public void onResume() {
		super.onResume();
		l = false;
		Object obj;
		Exception exception;
		MyCheckBoxPreference mycheckboxpreference;
		int i1 = -1;
		boolean flag;
		Iterator iterator = null;
		if (j != null) {
			try {
				j.removeView(k);
			} catch (Exception exception1) {
			}
		}
		obj = getActivity();
		e = pq.c(((Context) (obj)));
		if (e) {
			i1 = g.size();
			iterator = h.iterator();
		}
		if (iterator != null) {
			while (((Iterator) (iterator)).hasNext()) {
				mycheckboxpreference = (MyCheckBoxPreference) ((Iterator) (iterator))
						.next();
				if (g.contains(mycheckboxpreference.a())) {
					i1--;
				}
			}
		}
		try {
			a.setSummary(getString(0x7f0f005b,
					new Object[] { Integer.valueOf(i1) }));
		}
		// Misplaced declaration of an exception variable
		catch (Exception ex) {
			vk.b(ex, 5, "Swipe.NotificationSettings", "onResume failed");
		}
		iterator = null;
		iterator = h.iterator();
		while (((Iterator) (iterator)).hasNext()) {
			mycheckboxpreference = (MyCheckBoxPreference) ((Iterator) (iterator))
					.next();
			if (pq.c(getActivity()) && g.contains(mycheckboxpreference.a())) {
				flag = true;
			} else {
				flag = false;
			}
			mycheckboxpreference.setChecked(flag);
		}

	//	a.setSummary(R.string.pref_description_apps_selected);

	}
}
