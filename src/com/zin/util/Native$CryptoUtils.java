/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.String
 */
package com.lazyswipe.util;

import android.content.Context;
import android.text.TextUtils;

public class Native$CryptoUtils extends Native {
	public static String a(Context context, String string, String string2) {
		return Native$CryptoUtils.a(context, string, string2, false);
	}

	public static String a(Context context, String string, String string2,
			boolean bl) {
		if (TextUtils.isEmpty((CharSequence) string)
				|| TextUtils.isEmpty((CharSequence) string2)) {
			return null;
		}
		if (bl) {
			return Native$CryptoUtils.encryptApi(context, string, string2);
		}
		return Native$CryptoUtils.encryptData(context, string, string2);
	}

	public static String b(Context context, String string, String string2) {
		return Native$CryptoUtils.b(context, string, string2, false);
	}

	public static String b(Context context, String string, String string2,
			boolean bl) {
		if (TextUtils.isEmpty((CharSequence) string)
				|| TextUtils.isEmpty((CharSequence) string2)) {
			return null;
		}
		if (bl) {
			return Native$CryptoUtils.decryptApi(context, string, string2);
		}
		return Native$CryptoUtils.decryptData(context, string, string2);
	}

	private static native String decryptApi(Context var0, String var1,
			String var2);

	private static native String decryptData(Context var0, String var1,
			String var2);

	private static native String encryptApi(Context var0, String var1,
			String var2);

	private static native String encryptData(Context var0, String var1,
			String var2);
}
