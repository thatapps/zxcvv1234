package com.main;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.Log;

public final class vh {

	public static boolean a(Context context) {
		ContentResolver resolver = context.getContentResolver();
		if (android.os.Build.VERSION.SDK_INT < 17) {
			if (android.provider.Settings.System.getInt(resolver,
					"airplane_mode_on", 0) == 0) {
				return false;
			}

		} else {
			if (android.provider.Settings.Global.getInt(resolver,
					"airplane_mode_on", 0) == 0) {

				return false;

			} else {
				return true;
			}

		}
		return false;
	}

	public static boolean a(Context context, String s) {
		Intent intent = (new Intent("android.intent.action.SENDTO"))
				.setData(
						Uri.parse((new StringBuilder()).append("smsto:")
								.append(s).toString())).setFlags(0x10000000)
				.setPackage(e(context));
		try {
			context.startActivity(intent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.Telephony",
					(new StringBuilder())
							.append("No activity found to handle intent ")
							.append(s).toString());
			return false;
		}
		return true;
	}

	public static String b(Context context) {
		String string = null;
		try {
			string = ((TelephonyManager) context.getSystemService("phone"))
					.getDeviceId();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return string;
	}

	public static void b(Context context, String s) {
		Intent intent = (new Intent("android.intent.action.DIAL",
				Uri.parse((new StringBuilder()).append("tel:").append(s)
						.toString()))).addFlags(0x10000000);
		try {
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	public static String c(Context context) {
		String s = null;
		String s1;
		s = (new StringBuilder()).append(context).append("_").append(s)
				.toString();

		if (s.length() > 61) {
			s1 = s.substring(0, 61);
			return s1;
		}

		try {
			TelephonyManager telephonyManager = (TelephonyManager) context
					.getSystemService("phone");
			s = telephonyManager.getSimSerialNumber();
			s1 = telephonyManager.getSubscriberId();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return "";
		}
		return s1;

	}

	public static Intent d(Context context) {
		String str = e(context);
		Intent intent = new Intent("android.intent.action.MAIN");
		if (context != null) {
			intent.setPackage(str);
		} else {
			intent.setType("vnd.android-dir/mms-sms");
		}
		intent.setFlags(0x10000000);
		return intent;
	}

	public static String e(Context context) {
		if (android.os.Build.VERSION.SDK_INT >= 19) {
			return android.provider.Telephony.Sms.getDefaultSmsPackage(context);
		}

		if (f(context)) {
			return "com.google.android.talk";
		}

		return null;
	}

	public static boolean f(Context context) {
		int i;
		try {
			i = context.getPackageManager().getComponentEnabledSetting(
					new ComponentName("com.google.android.talk",
							"com.google.android.apps.babel.sms.SmsReceiver"));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return 1 == i;
	}

	public static String g(Context context) {
		String s = e(context);
		// context = s;
		if (s == null) {
			s = "com.android.mms";
		}
		return s;
	}

	public static void h(Context context) {
		Intent intent = d(context);
		try {
			context.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.Telephony",
					(new StringBuilder()).append("Failed to launch SMS: ")
							.append(exception.getMessage()).toString());
		}
	}
}
