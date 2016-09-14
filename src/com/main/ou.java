package com.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public abstract class ou {

	public static final ou a;
	public static final ou b;
	private static final ou d[];
	public final int c;

	private ou(String s, int i, int j) {
		super();
		c = j;
	}

	ou(String s, int i, int j, os _pcls1) {
		this(s, i, j);
	}

	public static ou valueOf(String s) {
		return /*(ou) Enum.valueOf(ou,s)*/null;
	}

	public static ou[] values() {
		return (ou[]) d.clone();
	}

	public abstract void a(Context context, ot ot);

	static {
		a = new ou("NONE", 0, 0) {

			public void a(Context context, ot ot) {
			}

		};
		b = new ou("URL", 1, 1) {

			public void a(Context context, ot ot1) {
				if (!TextUtils.isEmpty(ot1.b)) {
					Intent intent = new Intent("android.intent.action.VIEW");
					intent.addCategory("android.intent.category.DEFAULT");
					intent.addCategory("android.intent.category.BROWSABLE");
					intent.setData(Uri.parse(ot1.b));
					intent.putExtra("com.android.browser.application_id",
							context.getPackageName());
					intent.addFlags(0x10000000);
					intent.addFlags(0x200000);
					context.startActivity(intent);
				}
			}

		};
		d = (new ou[] { a, b });
	}
}
