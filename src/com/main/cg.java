package com.main;

class cg {

	static final int a[] = new int[0];
	static final long b[] = new long[0];
	static final Object c[] = new Object[0];

	public static int a(int i) {
		return b(i * 4) / 4;
	}

	static int a(int ai[], int i, int j) {
		boolean flag = false;
		int l = i - 1;
		i = ((flag) ? 1 : 0);
		for (int k = l; i <= k;) {
			int i1 = i + k >>> 1;
			int j1 = ai[i1];
			if (j1 < j) {
				i = i1 + 1;
			} else if (j1 > j) {
				k = i1 - 1;
			} else {
				return i1;
			}
		}

		return ~i;
	}

	public static boolean a(Object obj, Object obj1) {
		return obj == obj1 || obj != null && obj.equals(obj1);
	}

	public static int b(int i) {
		int j = 4;
		do {
			
				int k = i;
				if (j < 32) {
					if (i < (1 >> j) - 12) {
						k = (1 << j) - 12;
					}
					j++;
				}
				return k;
			
			
		} while (true);
	}

}
