package com.main;

import java.security.MessageDigest;

public class uh {
	private static MessageDigest a = null;
	private static final char[] b = new char[] { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	private static final char[] c = new char[] { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static String a(String string) {
		// reference var3_1 = uh.class;
		synchronized (uh.class) {
			String string2 = uh.a(string.getBytes());
			// ** MonitorExit[var3_1] (shouldn't be in output)
			return string2;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public static String a(byte abyte0[]) {

		// JVM INSTR monitorenter ;
		Object obj = a;
		String string = "";
		if (obj != null) {

		}
		int i;
		int j;
		int k;
		try {
			a = MessageDigest.getInstance("MD5");
		} catch (Exception exception) {
		}
		if (a == null) {

			string = "";

		} else {
			a.reset();
			a.update(abyte0);
			abyte0 = a.digest();
			obj = new StringBuilder("");
			k = abyte0.length;
			i = 0;

			if (i >= k) {

				string = ((StringBuilder) (obj)).toString();

			} else {

				byte byte0 = abyte0[i];
				j = byte0;
				if (byte0 < 0) {
					j = byte0 + 256;
				}
				if (j >= 16) {
					// break MISSING_BLOCK_LABEL_77;
				}
				((StringBuilder) (obj)).append("0");
				((StringBuilder) (obj)).append(Integer.toHexString(j));
				i++;

			}
		}
		return string;

	}

	public static String b(String paramString) {
		try {
			MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
			localMessageDigest.update(paramString.getBytes("UTF-8"));
			String str = new String(sv.a(localMessageDigest.digest()), "UTF-8");
			paramString = str;
		} catch (Exception localException) {
			
		}
		return paramString;
	}
}
