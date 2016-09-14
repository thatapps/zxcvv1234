package com.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.util.Log;
import com.lazyswipe.SwipeApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class us {

	private static final float a[] = { 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
			0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F,
			0.0F, 1.0F, 0.0F };
	private static final ColorFilter b = new ColorMatrixColorFilter(a);
	private static final String c = (new StringBuilder()).append("Swipe.")
			.append(us.class.getSimpleName()).toString();
	private static ArrayList d;

	public us() {
	}

	public static Intent a(ComponentName componentname, String s, String s1,
			File file) {
		Intent intent = new Intent("android.intent.action.SEND");
		intent.addFlags(0x3000000);
		intent.setComponent(componentname);
		intent.putExtra("android.intent.extra.SUBJECT", s);
		intent.putExtra("android.intent.extra.TEXT", s1);
		intent.putExtra("sms_body", s1);
		intent.putExtra("desc", s1);
		intent.putExtra("Kdescription", s1);
		if (file != null) {
			intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
			if (componentname.getPackageName().contains("mail")) {
				intent.setType("application/octet-stream");
				return intent;
			}
			if (componentname.getPackageName().contains("kaixin")
					|| componentname.getPackageName().contains(
							"com.qihoo360.contacts")) {
				intent.setType("text/plain");
				return intent;
			} else {
				intent.setType("image/*");
				return intent;
			}
		} else {
			intent.setType("text/plain");
			return intent;
		}
	}

	public static String a() {
		return (new StringBuilder())
				.append("https://play.google.com/store/apps/details?id=")
				.append(SwipeApplication.e().getPackageName()).toString();
	}

	private static String a(Context context, va va1, String s, boolean flag,
			String s1) {
		String str = va1.a(context, s, s1, flag);

		if (str == null) {
			str = "";
		}
		return str;
	}

	public static void a(Activity activity, int i, va va1, String s, uy uy1,
			boolean flag, ux aux[]) {
		a(activity, activity.getString(i), va1, s, uy1, flag, aux);
	}

	static void a(Activity activity, ComponentName componentname, va va1,
			String s, uy uy1) {
		b(activity, componentname, va1, s, uy1);
	}

	private static void a(Activity activity, String s, String s1, va va1,
			String s2, uy uy1, boolean flag, ux aux[]) {
		Object obj;
		if (uy1 == null) {
			obj = "text/plain";
		} else {
			obj = "image/*";
		}
		obj = new ut(activity, s, "android.intent.action.SEND",
				((String) (obj)), aux);
		uz uz = new uz(activity, ((ut) (obj)), va1, s2, uy1, flag, aux);
		List list = ((ut) (obj)).a();
		if (list.size() == 1 && (list.get(0) instanceof uu)) {
			uz.a(activity, s2, ((uu) list.get(0)).a, va1, uy1, flag);
			return;
		}
		wc wc = new wc(activity);
		wc.a(s1);
		wc.a(uz.a(uz));
		try {
			wb xxx = wc.d();
			uz.a(uz);
			xxx.show();
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e(c, "Show dialog failed and safe ignored.", exception);
		}
	}

	public static void a(Activity activity, String s, va va1, String s1,
			uy uy1, boolean flag, ux aux[]) {
		a(activity, null, s, va1, s1, uy1, flag, aux);
	}

	static ArrayList b() {
		return d();
	}

	private static void b(Activity activity, ComponentName componentname,
			va va1, String s, uy uy1) {
		File file = null;
		if (uy1 == null) {
			file = null;
		} else {
			file = uy1.a();
		}
		Intent intent = a(componentname,
				va1.a(activity, componentname.getPackageName()),
				a(activity, va1, componentname.getPackageName(), true, s), file);
		try {
			activity.startActivity(intent);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception activity1) {
			Log.e(c, "start activity failed and safe ignored.", activity1);
		}
	}

	static ColorFilter c() {
		return b;
	}

	private static ArrayList d() {
		if (d == null) {
			d = new ArrayList();
			d.add("com.facebook.katana");
			d.add("com.twitter.android");
			d.add("com.whatsapp");
			d.add("com.sgiggle.production");
			d.add("jp.naver.line.android");
			d.add("com.kakao.talk");
			d.add("com.facebook.orca");
			d.add("com.viber.voip");
			d.add("com.bbm");
			d.add("com.undefware.vkchat");
			d.add("com.google.android.apps.plus");
			d.add("com.snapchat.android");
			d.add("com.pinterest");
			d.add("com.tumblr");
			d.add("com.linkedin.android");
			d.add("com.instagram.android");
			d.add("com.tencent.mm/com.tencent.mm.ui.tools.ShareToTimeLineUI");
			d.add("com.tencent.mm/com.tencent.mm.ui.tools.ShareImgUI");
			d.add("com.qzone");
			d.add("com.google.android.gm");
			d.add("com.android.email");
			d.add("com.path");
			d.add("com.google.android.talk");
			d.add("com.android.mms");
			d.add("com.sina.weibo");
			d.add("com.tencent.mobileqq/com.tencent.mobileqq.activity.JumpActivity");
			d.add("com.ucmobile");
			d.add("com.mt.mtxx.mtxx");
			d.add("com.android.bluetooth");
			d.add("com.mediatek.bluetooth");
		}
		return d;
	}

}
