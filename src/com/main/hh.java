package com.main;

import java.security.MessageDigest;

public class hh {
	public static boolean a(String paramString) {
		if ((paramString == null) || (paramString.length() <= 0)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static String b(String paramString) {
		String str1 = null;
		try {
			byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(
					paramString.getBytes("utf-8"));
			StringBuilder localStringBuilder = new StringBuilder();
			for (int i = 0; i < arrayOfByte.length; i++) {
				localStringBuilder.append(Integer.toString(
						256 + (0xFF & arrayOfByte[i]), 16).substring(1));
			}
			String str2 = localStringBuilder.toString();
			str1 = str2;
		} catch (Exception localException) {

		}
		return str1;
	}
}
