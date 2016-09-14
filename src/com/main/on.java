package com.main;

import java.util.Arrays;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONObject;

import android.text.TextUtils;

public class on {
	String[] a = new String[3];
	boolean[] b = new boolean[3];
	int[][] c = new int[3][];
	long[] d = new long[3];
	long[] e = new long[3];
	long[] f = new long[3];
	long[] g = new long[3];
	int[][] h = new int[3][];
	int[] i = new int[3];

	static void a(on on1, String s) {
		on1.a(s);
	}

	private void a(String paramString) {
		Arrays.fill(this.a, "http://i.haloapps.com/ads?");
		Arrays.fill(this.b, false);
		Arrays.fill(this.d, 72000000L);
		Arrays.fill(this.e, 2L);
		Arrays.fill(this.f, 7200000L);
		Arrays.fill(this.c, null);
		Arrays.fill(this.h, null);
		Arrays.fill(this.g, 86400000L);
		Arrays.fill(this.i, 3);
		if (!TextUtils.isEmpty(paramString)) {
		}

		int j = 0;
		try {
			JSONObject localJSONObject1 = new JSONObject(paramString);
			j = 0;
			if (j < 3) {
				JSONObject localJSONObject2 = localJSONObject1
						.optJSONObject(ol.c[j]);
				if (localJSONObject2 == null) {
					j++;
				}
				String str = localJSONObject2.optString("url");
				if (!TextUtils.isEmpty(str)) {
					this.a[j] = str;
				}
				boolean bool = localJSONObject2.optBoolean("random");
				if (bool) {
					this.b[j] = bool;
				}
				long l1 = localJSONObject2.optInt("start", 72000);
				if (l1 != 72000L) {
					this.d[j] = (l1 * 1000L);
				}
				long l2 = localJSONObject2.optInt("max", 2);
				if (l2 != 2L) {
					this.e[j] = l2;
				}
				long l3 = localJSONObject2.optInt("gap", 7200);
				if (l3 != 7200L) {
					this.f[j] = (l3 * 1000L);
				}
				long l4 = localJSONObject2.optInt("ttl", 86400);
				if (l4 != 86400L) {
					this.g[j] = (l4 * 1000L);
				}
				JSONArray localJSONArray = localJSONObject2
						.optJSONArray("hash");
				if (localJSONArray != null) {
					int k = localJSONArray.length();
					int[] arrayOfInt2 = new int[k];
					int m = 0;
					while (m < k) {
						arrayOfInt2[m] = localJSONArray.optInt(m);
						
						// continue;
					}
					m++;
					Arrays.sort(arrayOfInt2);
					this.c[j] = arrayOfInt2;
				}
				JSONObject localJSONObject3 = localJSONObject2
						.optJSONObject("percent");
				if (localJSONObject3 != null) {
					int[] arrayOfInt1 = new int[3];
					arrayOfInt1[1] = localJSONObject3.optInt("gg");
					arrayOfInt1[2] = localJSONObject3.optInt("fb");
					arrayOfInt1[0] = localJSONObject3.optInt("af", 100);
					this.h[j] = arrayOfInt1;
				}
				long l5 = localJSONObject2.optInt("keep", 3);
				if (l5 != 3L) {
					this.i[j] = ((int) l5);
				}
				if (j != 0) {
					j++;
				}
				this.i[j] = localJSONObject2.optInt("debug1", 100);
			}
		} catch (Throwable localThrowable) {
			vj.a(ol.a, "Could not parse CONFIG string: " + paramString,
					localThrowable);
		}

		j++;

	}

	public static void a(on on1) {
		om om = new om(on1);
		if (vk.o()) {
			ui.a(ji.a, om);
			return;
		} else {
			om.run();
			return;
		}
	}

	public int a(int paramInt1, int paramInt2) {
		int[] arrayOfInt = this.h[paramInt1];
		int j;
		if (arrayOfInt != null) {
			j = arrayOfInt[paramInt2];
		}

		if (paramInt2 == 0) {
			j = 100;
		} else {
			j = 0;
		}
		return j;
	}

	public boolean a(int j) {
		Calendar calendar = Calendar.getInstance();
		int k = calendar.get(11);
		long l = (calendar.get(12) + k * 60) * 60;
		return d[j] <= l * 1000L;
	}

	public boolean a(int j, long l) {
		return f[j] < System.currentTimeMillis() - l;
	}

	public int b(int paramInt) {
		return this.i[paramInt];
	}

	public boolean b(int j, int k) {
		return e[j] > (long) k;
	}

	public boolean c(int j, int k) {
		int ai[] = c[j];
		return ai == null || Arrays.binarySearch(ai, k) >= 0;
	}

	public boolean d(int j, int k) {
		return i[j] > k;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder("Configurations:");
		for (int j = 0; j < 3; j++) {
			stringbuilder.append("\n\t").append(ol.c[j]).append(": ")
					.append("url=").append(a[j]).append(',').append("ttl=")
					.append(g[j]).append(',').append("random=").append(b[j])
					.append(',').append("start=").append(d[j]).append(',')
					.append("max=").append(e[j]).append(',').append("gap=")
					.append(f[j]).append(',').append("hash=")
					.append(Arrays.toString(c[j])).append(',')
					.append("percent=").append(Arrays.toString(h[j]))
					.append(',').append("keep=").append(i[j]);
		}

		return stringbuilder.toString();
	}
}
