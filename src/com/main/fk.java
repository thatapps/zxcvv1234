package com.main;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;

public class fk {

	public fk() {
	}

	public static String a(String s) {
		try {
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
			messagedigest.reset();
			messagedigest.update(s.getBytes("UTF-8"));
			s = a(messagedigest.digest());
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return s;
	}

	private static String a(byte abyte0[]) {
		Formatter formatter = new Formatter();
		int j = abyte0.length;
		for (int i = 0; i < j; i++) {
			formatter.format("%02x", new Object[] { Byte.valueOf(abyte0[i]) });
		}

		String string = formatter.toString();
		formatter.close();
		return string;
	}

	public String a(Map map) {
		String s = (String) map.get("appsflyerKey");
		String s1 = (String) map.get("af_timestamp");
		String str = (String) map.get("uid");
		return a((new StringBuilder()).append(s.substring(0, 7))
				.append(str.substring(0, 7))
				.append(s1.substring(s1.length() - 7)).toString());
	}
}
