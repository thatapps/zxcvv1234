package com.main;

import java.util.ArrayList;

import android.net.Uri;

public class ve {
	public static int a(String string, int n) {
		if (string == null) {
			return n;
		}
		try {
			int n2 = Integer.parseInt((String) string);
			return n2;
		} catch (NumberFormatException var2_3) {
			return n;
		}
	}

	public static String a(String string) {
		if (string == null) {
			return null;
		}
		int n = 0;
		do {
			if (!(n < string.length() && (Character.isWhitespace((char) string
					.charAt(n))
					|| Character.isSpaceChar((char) string.charAt(n)) || string
						.charAt(n) == '\u3000'))) {
				if (n != string.length())
					break;
				return "";
			}
			++n;
		} while (true);
		int n2 = -1 + string.length();
		while (n2 >= 0
				&& (Character.isWhitespace((char) string.charAt(n2))
						|| Character.isSpaceChar((char) string.charAt(n2)) || string
						.charAt(n2) == '\u3000')) {
			--n2;
		}
		return string.substring(n, n2 + 1);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static String a(Object[] arrobject, String string) {
		StringBuilder stringBuilder = new StringBuilder();
		boolean bl = true;
		for (Object object : arrobject) {
			boolean bl2;
			if (!bl) {
				stringBuilder.append(string);
				bl2 = bl;
			} else {
				bl2 = false;
			}
			String string2 = object == null ? "" : object.toString();
			stringBuilder.append(string2);
			bl = bl2;
		}
		return stringBuilder.toString();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static String[] a(String string, char c) {
		if (string.length() == 0) {
			return new String[0];
		}
		String string2 = string + c;
		ArrayList arrayList = new ArrayList();
		StringBuilder stringBuilder = new StringBuilder();
		int n = 0;
		do {
			if (n >= string2.length()) {
				String[] arrstring = (String[]) arrayList
						.toArray((Object[]) new String[arrayList.size()]);
				arrayList.clear();
				return arrstring;
			}
			if (string2.charAt(n) == '\\' && n + 1 < string2.length()) {
				++n;
			}
			if (string2.charAt(n) == c) {
				arrayList.add((Object) Uri.decode((String) stringBuilder
						.toString()));
				stringBuilder.delete(0, stringBuilder.length());
			} else {
				stringBuilder.append(string2.charAt(n));
			}
			++n;
		} while (true);
	}
}
