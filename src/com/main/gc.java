package com.main;

public final class gc {
	private static final byte[] a;
	private static final char[] b;

	static {
		int n = 0;
		a = new byte[128];
		b = new char[64];
		for (int i = 0; i < 128; ++i) {
			gc.a[i] = -1;
		}
		for (int j = 90; j >= 65; --j) {
			gc.a[j] = (byte) (j - 65);
		}
		for (int k = 122; k >= 97; --k) {
			gc.a[k] = (byte) (26 + (k - 97));
		}
		for (int i2 = 57; i2 >= 48; --i2) {
			gc.a[i2] = (byte) (52 + (i2 - 48));
		}
		gc.a[43] = 62;
		gc.a[47] = 63;
		for (int i3 = 0; i3 <= 25; ++i3) {
			gc.b[i3] = (char) (i3 + 65);
		}
		int n2 = 26;
		int n3 = 0;
		while (n2 <= 51) {
			gc.b[n2] = (char) (n3 + 97);
			++n2;
			++n3;
		}
		int n4 = 52;
		while (n4 <= 61) {
			gc.b[n4] = (char) (n + 48);
			++n4;
			++n;
		}
		gc.b[62] = 43;
		gc.b[63] = 47;
	}

	private static int a(char[] arrc) {
		int n = 0;
		if (arrc == null) {
			return n;
		}
		int n2 = arrc.length;
		for (int i = 0; i < n2; ++i) {
			int n3;
			if (!gc.a(arrc[i])) {
				n3 = n + 1;
				arrc[n] = arrc[i];
			} else {
				n3 = n;
			}
			n = n3;
		}
		return n;
	}

	public static String a(byte[] arrby) {
		int n = 0;
		if (arrby == null) {
			return null;
		}
		int n2 = 8 * arrby.length;
		if (n2 == 0) {
			return "";
		}
		int n3 = n2 % 24;
		int n4 = n2 / 24;
		int n5 = n3 != 0 ? n4 + 1 : n4;
		char[] arrc = new char[n5 * 4];
		int n6 = 0;
		for (int i = 0; i < n4; ++i) {
			int n7 = n + 1;
			byte by = arrby[n];
			int n8 = n7 + 1;
			byte by2 = arrby[n7];
			int n9 = n8 + 1;
			byte by3 = arrby[n8];
			byte by4 = (byte) (by2 & 15);
			byte by5 = (byte) (by & 3);
			byte by6 = (by & -128) == 0 ? (byte) (by >> 2)
					: (byte) (192 ^ by >> 2);
			byte by7 = (by2 & -128) == 0 ? (byte) (by2 >> 4)
					: (byte) (240 ^ by2 >> 4);
			byte by8 = (by3 & -128) == 0 ? (byte) (by3 >> 6)
					: (byte) (252 ^ by3 >> 6);
			int n10 = n6 + 1;
			arrc[n6] = b[by6];
			int n11 = n10 + 1;
			arrc[n10] = b[by7 | by5 << 4];
			int n12 = n11 + 1;
			arrc[n11] = b[by8 | by4 << 2];
			int n13 = n12 + 1;
			arrc[n12] = b[by3 & 63];
			n6 = n13;
			n = n9;
		}
		if (n3 == 8) {
			byte by = arrby[n];
			byte by9 = (byte) (by & 3);
			byte by10 = (by & -128) == 0 ? (byte) (by >> 2)
					: (byte) (192 ^ by >> 2);
			int n14 = n6 + 1;
			arrc[n6] = b[by10];
			int n15 = n14 + 1;
			arrc[n14] = b[by9 << 4];
			int n16 = n15 + 1;
			arrc[n15] = 61;
			n16 += 1;
			arrc[n16] = 61;
			return new String(arrc);
		}
		if (n3 != 16)
			return new String(arrc);
		byte by = arrby[n];
		byte by11 = arrby[n + 1];
		byte by12 = (byte) (by11 & 15);
		byte by13 = (byte) (by & 3);
		byte by14 = (by & -128) == 0 ? (byte) (by >> 2)
				: (byte) (192 ^ by >> 2);
		byte by15 = (by11 & -128) == 0 ? (byte) (by11 >> 4)
				: (byte) (240 ^ by11 >> 4);
		int n17 = n6 + 1;
		arrc[n6] = b[by14];
		int n18 = n17 + 1;
		arrc[n17] = b[by15 | by13 << 4];
		int n19 = n18 + 1;
		arrc[n18] = b[by12 << 2];
		n19 += 1;
		arrc[n19] = 61;
		return new String(arrc);
	}

	private static boolean a(char c) {
		if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
			return true;
		}
		return false;
	}

	public static byte[] a(String string) {
		byte by;
		char[] arrc;
		int n;
		int n2;
		if (string == null || (n = gc.a(arrc = string.toCharArray())) % 4 != 0)
			return null;
		int n3 = n / 4;
		if (n3 == 0) {
			return new byte[0];
		}
		byte[] arrby = new byte[n3 * 3];
		int n4 = 0;
		int n5 = 0;
		for (n2 = 0; n2 < n3 - 1; ++n2) {
			int n6 = n4 + 1;
			char c = arrc[n4];
			if (!gc.c(c))
				return null;
			{
				int n7 = n6 + 1;
				char c2 = arrc[n6];
				if (!gc.c(c2))
					return null;
				{
					int n8 = n7 + 1;
					char c3 = arrc[n7];
					if (!gc.c(c3))
						return null;
					{
						n4 = n8 + 1;
						char c4 = arrc[n8];
						if (!gc.c(c4))
							return null;
						{
							byte by2 = a[c];
							byte by3 = a[c2];
							byte by4 = a[c3];
							byte by5 = a[c4];
							int n9 = n5 + 1;
							arrby[n5] = (byte) (by2 << 2 | by3 >> 4);
							int n10 = n9 + 1;
							arrby[n9] = (byte) ((by3 & 15) << 4 | 15 & by4 >> 2);
							n5 = n10 + 1;
							arrby[n10] = (byte) (by5 | by4 << 6);
							continue;
						}
					}
				}
			}
		}
		int n11 = n4 + 1;
		char c = arrc[n4];
		if (!gc.c(c))
			return null;
		int n12 = n11 + 1;
		char c5 = arrc[n11];
		if (!gc.c(c5))
			return null;
		byte by6 = a[c];
		byte by7 = a[c5];
		int n13 = n12 + 1;
		char c6 = arrc[n12];
		n13 += 1;
		char c7 = arrc[n13];
		if (gc.c(c6) && gc.c(c7)) {
			byte by8 = a[c6];
			byte by9 = a[c7];
			int n14 = n5 + 1;
			arrby[n5] = (byte) (by6 << 2 | by7 >> 4);
			int n15 = n14 + 1;
			arrby[n14] = (byte) ((by7 & 15) << 4 | 15 & by8 >> 2);
			n15 += 1;
			arrby[n15] = (byte) (by9 | by8 << 6);
			return arrby;
		}
		if (gc.b(c6) && gc.b(c7)) {
			if ((by7 & 15) != 0)
				return null;
			{
				byte[] arrby2 = new byte[1 + n2 * 3];
				System.arraycopy((Object) arrby, (int) 0, (Object) arrby2,
						(int) 0, (int) (n2 * 3));
				arrby2[n5] = (byte) (by6 << 2 | by7 >> 4);
				return arrby2;
			}
		}
		if (gc.b(c6) || !gc.b(c7) || ((by = a[c6]) & 3) != 0) {
			return null;
		}
		byte[] arrby3 = new byte[2 + n2 * 3];
		System.arraycopy((Object) arrby, (int) 0, (Object) arrby3, (int) 0,
				(int) (n2 * 3));
		int n16 = n5 + 1;
		arrby3[n5] = (byte) (by6 << 2 | by7 >> 4);
		arrby3[n16] = (byte) ((by7 & 15) << 4 | 15 & by >> 2);
		return arrby3;
	}

	private static boolean b(char c) {
		if (c == '=') {
			return true;
		}
		return false;
	}

	private static boolean c(char c) {
		if (c < '' && a[c] != -1) {
			return true;
		}
		return false;
	}
}
