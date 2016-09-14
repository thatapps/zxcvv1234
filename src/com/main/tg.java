package com.main;

import java.nio.charset.Charset;

public final class tg {

	public static String a(byte abyte0[], int i, int j) {
		if (abyte0 == null) {
			return null;
		}
		if (j == 0) {
			return "";
		} else {
			return new String(abyte0, i, j, Charset.forName("UTF-8"));
		}
	}
}
