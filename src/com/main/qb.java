package com.main;

import android.net.Uri;

public class qb {
	public static final Uri a = Uri.parse("content://sms");
	public static final Uri b = Uri.parse("content://sms/inbox");
	public static final String[] c;
	public String d;
	public long e;
	public String f;
	public String g;
	public String h;
	public Uri i;

	static {
		String[] arrayOfString = new String[4];
		arrayOfString[0] = "address";
		arrayOfString[1] = "COUNT(_id) as _count";
		arrayOfString[2] = "date";
		arrayOfString[3] = "body";
		c = arrayOfString;
	}

	public String toString() {
		return "Message:{address=" + this.d + ",person=" + this.h + ",date="
				+ this.e + ",subject=" + this.f + ",body=" + this.g + ",thumb="
				+ this.i + '}';
	}
}
