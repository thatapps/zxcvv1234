package com.main;

import java.io.UnsupportedEncodingException;

public class sv {
	static final byte[] a = new byte[] { 13, 10 };
	private static final byte[] b = new byte[] { 65, 66, 67, 68, 69, 70, 71,
			72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88,
			89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108,
			109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121,
			122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
	private static final byte[] c = new byte[] { 65, 66, 67, 68, 69, 70, 71,
			72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88,
			89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108,
			109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121,
			122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
	private static final byte[] d = new byte[] { -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61,
			-1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1,
			-1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
			40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
	private final byte[] e;
	private final int f;
	private final byte[] g;
	private final int h;
	private final int i;
	private byte[] j;
	private int k;
	private int l;
	private int m;
	private int n;
	private boolean o;
	private int p;

	public sv() {
		this(false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public sv(int n, byte[] arrby, boolean bl) {
		if (arrby == null) {
			arrby = a;
			n = 0;
		}
		int n2 = n > 0 ? 4 * (n / 4) : 0;
		this.f = n2;
		this.g = new byte[arrby.length];
		System.arraycopy((Object) arrby, (int) 0, (Object) this.g, (int) 0,
				(int) arrby.length);
		this.i = n > 0 ? 4 + arrby.length : 4;
		this.h = -1 + this.i;
		if (sv.c(arrby)) {
			String string = sv.d(arrby);
			throw new IllegalArgumentException(
					"lineSeperator must not contain base64 characters: ["
							+ string + "]");
		}
		byte[] arrby2 = bl ? c : b;
		this.e = arrby2;
	}

	public sv(boolean bl) {
		this(76, a, bl);
	}

	private static long a(byte[] arrby, int n, byte[] arrby2) {
		int n2 = 4 * (n / 4);
		long l = 4 * arrby.length / 3;
		long l2 = l % 4;
		if (l2 != 0) {
			l += 4 - l2;
		}
		if (n2 > 0) {
			boolean bl = l % (long) n2 == 0;
			l += l / (long) n2 * (long) arrby2.length;
			if (!bl) {
				return l + (long) arrby2.length;
			}
		}
		return l;
	}

	public static boolean a(byte byte0) {
		return byte0 == 61 || byte0 >= 0 && byte0 < d.length && d[byte0] != -1;
	}

	public static byte[] a(byte[] paramArrayOfByte) {
		return a(paramArrayOfByte, false);
	}

	public static byte[] a(byte[] paramArrayOfByte, boolean paramBoolean) {
		return a(paramArrayOfByte, paramBoolean, false);
	}

	public static byte[] a(byte[] paramArrayOfByte, boolean paramBoolean1,
			boolean paramBoolean2) {
		return a(paramArrayOfByte, paramBoolean1, paramBoolean2,
				Integer.MAX_VALUE);
	}

	public static byte[] a(byte[] arrby, boolean bl, boolean bl2, int n) {
		sv sv = null;
		if (arrby == null || arrby.length == 0) {
			return arrby;
		}
		long l = sv.a(arrby, 76, a);
		if (l > (long) n) {
			throw new IllegalArgumentException(
					"Input array too big, the output array would be bigger ("
							+ l + ") than the specified maxium size of " + n);
		}
		if (bl) {
			sv = new sv(bl2);
			do {
				return sv.b(arrby);
				// break;
			} while (true);
		}
		sv = new sv(0, a, bl2);
		return sv.b(arrby);
	}

	private void c() {
		if (this.j == null) {
			this.j = new byte[8192];
			this.k = 0;
			this.l = 0;
			return;
		}
		byte[] arrby = new byte[2 * this.j.length];
		System.arraycopy((Object) this.j, (int) 0, (Object) arrby, (int) 0,
				(int) this.j.length);
		this.j = arrby;
	}

	private static boolean c(byte[] paramArrayOfByte) {
		boolean bool = false;
		int i1 = paramArrayOfByte.length;
		for (int i2 = 0;; i2++) {
			if (i2 < i1) {
				if (a(paramArrayOfByte[i2])) {
					bool = true;
				}
			} else {
				return bool;
			}
		}
	}

	private static String d(byte[] arrby) {
		try {
			String string = new String(arrby, "UTF-8");
			return string;
		} catch (UnsupportedEncodingException var2_2) {
			return new String(arrby);
		}
	}

	private void d() {
		this.j = null;
		this.k = 0;
		this.l = 0;
		this.m = 0;
		this.n = 0;
		this.o = false;
	}

	int a(byte[] arrby, int n, int n2) {
		if (this.j != null) {
			int n3 = Math.min((int) this.b(), (int) n2);
			if (this.j != arrby) {
				System.arraycopy((Object) this.j, (int) this.l, (Object) arrby,
						(int) n, (int) n3);
				this.l = n3 + this.l;
				if (this.l >= this.k) {
					this.j = null;
				}
				return n3;
			}
			this.j = null;
			return n3;
		}
		if (this.o) {
			return -1;
		}
		return 0;
	}

	public boolean a() {
		if (this.e == c) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	int b() {
		if (this.j != null) {
		}
		for (int i1 = this.k - this.l;; i1 = 0) {
			return i1;
		}
	}

	void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
		if ((paramArrayOfByte != null)
				&& (paramArrayOfByte.length == paramInt2)) {
			this.j = paramArrayOfByte;
			this.k = paramInt1;
			this.l = paramInt1;
		}
	}

	public byte[] b(byte[] arrby) {
		this.d();
		if (arrby == null || arrby.length == 0) {
			return arrby;
		}
		byte[] arrby2 = new byte[(int) sv.a(arrby, this.f, this.g)];
		this.b(arrby2, 0, arrby2.length);
		this.c(arrby, 0, arrby.length);
		this.c(arrby, 0, -1);
		if (this.j != arrby2) {
			this.a(arrby2, 0, arrby2.length);
		}
		if (this.a() && this.k < arrby2.length) {
			byte[] arrby3 = new byte[this.k];
			System.arraycopy((Object) arrby2, (int) 0, (Object) arrby3,
					(int) 0, (int) this.k);
			return arrby3;
		}
		return arrby2;
	}

	void c(byte abyte0[], int i1, int j1) {
		if (!o) {
			if (j1 >= 0) {
				int k1 = 0;
				while (k1 < j1) {
					if (j == null || j.length - k < i) {
						c();
					}
					int l1 = n + 1;
					n = l1;
					n = l1 % 3;
					byte byte0 = abyte0[i1];
					l1 = byte0;
					if (byte0 < 0) {
						l1 = byte0 + 256;
					}
					p = l1 + (p << 8);
					if (n == 0) {
						byte abyte1[] = j;
						int i2 = k;
						k = i2 + 1;
						abyte1[i2] = e[p >> 18 & 0x3f];
						abyte1 = j;
						i2 = k;
						k = i2 + 1;
						abyte1[i2] = e[p >> 12 & 0x3f];
						abyte1 = j;
						i2 = k;
						k = i2 + 1;
						abyte1[i2] = e[p >> 6 & 0x3f];
						abyte1 = j;
						i2 = k;
						k = i2 + 1;
						abyte1[i2] = e[p & 0x3f];
						m = m + 4;
						if (f > 0 && f <= m) {
							System.arraycopy(g, 0, j, k, g.length);
							k = k + g.length;
							m = 0;
						}
					}
					k1++;
					i1++;
				}
				return;

			} else {
				o = true;
				if (j == null || j.length - k < i) {
					c();
				}
				// n;
				// JVM INSTR tableswitch 1 2: default 72
				// 1 122
				// 2 247;
				// goto _L5 _L6 _L7

				if (f > 0 && k > 0) {
					System.arraycopy(g, 0, j, k, g.length);
					k = k + g.length;
					return;
				}
				abyte0 = j;
				i1 = k;
				k = i1 + 1;
				abyte0[i1] = e[p >> 2 & 0x3f];
				abyte0 = j;
				i1 = k;
				k = i1 + 1;
				abyte0[i1] = e[p << 4 & 0x3f];
				if (e == b) {
					abyte0 = j;
					i1 = k;
					k = i1 + 1;
					abyte0[i1] = 61;
					abyte0 = j;
					i1 = k;
					k = i1 + 1;
					abyte0[i1] = 61;
				}
				abyte0 = j;
				i1 = k;
				k = i1 + 1;
				abyte0[i1] = e[p >> 10 & 0x3f];
				abyte0 = j;
				i1 = k;
				k = i1 + 1;
				abyte0[i1] = e[p >> 4 & 0x3f];
				abyte0 = j;
				i1 = k;
				k = i1 + 1;
				abyte0[i1] = e[p << 2 & 0x3f];
				if (e == b) {
					abyte0 = j;
					i1 = k;
					k = i1 + 1;
					abyte0[i1] = 61;
				}

			}
		} else {
			return;
		}

	}
}
