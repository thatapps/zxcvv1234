package com.main;

import java.util.Map;

public class cp {
	static Object[] b;
	static int c;
	static Object[] d;
	static int e;
	int[] f = cg.a;
	Object[] g = cg.c;
	int h = 0;

	private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject,
			int paramInt) {
		if (paramArrayOfInt.length == 8) {
			try {
				if (e < 10) {
					paramArrayOfObject[0] = d;
					paramArrayOfObject[1] = paramArrayOfInt;
					for (int j = -1 + (paramInt << 1); j >= 2; j--) {
						paramArrayOfObject[j] = null;
					}
					d = paramArrayOfObject;
					e = 1 + e;
				}
				return;
			} finally {
				// localObject2 = finally;
				// throw ((Throwable)localObject2);
			}
		} else if (paramArrayOfInt.length == 4) {
			try {
				if (c < 10) {
					paramArrayOfObject[0] = b;
					paramArrayOfObject[1] = paramArrayOfInt;
					for (int i = -1 + (paramInt << 1); i >= 2; i--) {
						paramArrayOfObject[i] = null;
					}
					b = paramArrayOfObject;
					c = 1 + c;
				}
			} finally {
				// localObject1 = finally;
				// throw ((Throwable)localObject1);
			}
		}
	}

	private void e(int paramInt) {
		if (paramInt == 8) {
		}

		try {
			if (d != null) {
				Object[] arrayOfObject2 = d;
				this.g = arrayOfObject2;
				d = (Object[]) arrayOfObject2[0];
				this.f = ((int[]) arrayOfObject2[1]);
				arrayOfObject2[1] = null;
				arrayOfObject2[0] = null;
				e = -1 + e;
			} else {
				this.f = new int[paramInt];
				this.g = new Object[paramInt << 1];
			}
		} finally {
		}
		if (paramInt == 4) {
			try {
				if (b != null) {
					Object[] arrayOfObject1 = b;
					this.g = arrayOfObject1;
					b = (Object[]) arrayOfObject1[0];
					this.f = ((int[]) arrayOfObject1[1]);
					arrayOfObject1[1] = null;
					arrayOfObject1[0] = null;
					c = -1 + c;
				}
			} finally {
				// throw ((Throwable)localObject1);
			}
		}

	}

	int a() {
		int i = this.h;
		int j;
		int k;
		if (i == 0) {
			j = -1;
		}

		j = cg.a(this.f, i, 0);
		if ((j >= 0) && (this.g[(j << 1)] != null)) {
			for (k = j + 1;; k++) {
				if ((k >= i) || (this.f[k] != 0)) {
					j--;
				}
				if (this.g[(k << 1)] == null) {
					j = k;
					break;
				}
			}

			if ((j < 0) || (this.f[j] != 0)) {
				j = k ^ 0xFFFFFFFF;
			}
			if (this.g[(j << 1)] != null) {
				j--;
			}

		}

		return j;

	}

	public int a(Object obj) {
		if (obj == null) {
			return a();
		} else {
			return a(obj, obj.hashCode());
		}
	}

	int a(Object paramObject, int paramInt) {
		int i = this.h;
		int j = 0, k;
		if (i == 0) {
			j = -1;
		}

		if ((j >= 0) && (!paramObject.equals(this.g[(j << 1)]))) {
			for (k = j + 1;; k++) {
				if ((k >= i) || (this.f[k] != paramInt)) {
					j--;
				}
				if (paramObject.equals(this.g[(k << 1)])) {
					j = k;
					break;
				}
			}

			if ((j < 0) || (this.f[j] != paramInt)) {
				j = k ^ 0xFFFFFFFF;
			}
			if (paramObject.equals(this.g[(j << 1)])) {
				j--;

			}

		}

		j = cg.a(this.f, i, paramInt);
		return j;
	}

	public Object a(int paramInt, Object paramObject) {
		int i = 1 + (paramInt << 1);
		Object localObject = this.g[i];
		this.g[i] = paramObject;
		return localObject;
	}

	public void a(int paramInt) {
		if (this.f.length < paramInt) {
			int[] arrayOfInt = this.f;
			Object[] arrayOfObject = this.g;
			e(paramInt);
			if (this.h > 0) {
				System.arraycopy(arrayOfInt, 0, this.f, 0, this.h);
				System.arraycopy(arrayOfObject, 0, this.g, 0, this.h << 1);
			}
			a(arrayOfInt, arrayOfObject, this.h);
		}
	}

	int b(Object paramObject) {
		int i = 1;
		int j = 2 * this.h;
		Object[] arrayOfObject = this.g;
		int k;
		if (paramObject == null) {
			if (i >= j) {
				k = -1;
			}
			if (arrayOfObject[i] == null) {
				k = i >> 1;
			}
		}

		i += 2;

		do {
			i += 2;
			if (i >= j) {
				break;
			}
		} while (!paramObject.equals(arrayOfObject[i]));
		k = i >> 1;
		// continue;
		// label72: k = -1;
		return k;
	}

	public Object b(int paramInt) {
		return this.g[(paramInt << 1)];
	}

	public Object c(int paramInt) {
		return this.g[(1 + (paramInt << 1))];
	}

	public void clear() {
		if (this.h != 0) {
			a(this.f, this.g, this.h);
			this.f = cg.a;
			this.g = cg.c;
			this.h = 0;
		}
	}

	public boolean containsKey(Object obj) {
		return a(obj) >= 0;
	}

	public boolean containsValue(Object obj) {
		return b(obj) >= 0;
	}

	public Object d(int i) {
		int j = 8;
		Object obj = g[(i << 1) + 1];
		if (h <= 1) {
			a(f, g, h);
			f = cg.a;
			g = cg.c;
			h = 0;
		} else if (f.length > 8 && h < f.length / 3) {
			if (h > 8) {
				j = h + (h >> 1);
			}
			int ai[] = f;
			Object aobj[] = g;
			e(j);
			h = h - 1;
			if (i > 0) {
				System.arraycopy(ai, 0, f, 0, i);
				System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0,
						i << 1);
			}
			if (i < h) {
				System.arraycopy(ai, i + 1, f, i, h - i);
				System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (g)),
						i << 1, h - i << 1);
				return obj;
			}
		} else {
			h = h - 1;
			if (i < h) {
				System.arraycopy(f, i + 1, f, i, h - i);
				System.arraycopy(((Object) (g)), i + 1 << 1, ((Object) (g)),
						i << 1, h - i << 1);
			}
			g[h << 1] = null;
			g[(h << 1) + 1] = null;
			return obj;
		}
		return obj;
	}

	public boolean equals(Object paramObject) {
		boolean bool1 = true;
		if (this == paramObject) {
		}

		if ((paramObject instanceof Map)) {
			Map localMap = (Map) paramObject;
			if (size() != localMap.size()) {
				bool1 = false;
			} else {
				int i = 0;
				try {
					while (i < this.h) {
						Object localObject1 = b(i);
						Object localObject2 = c(i);
						Object localObject3 = localMap.get(localObject1);
						if (localObject2 == null) {
							if (localObject3 != null) {
								bool1 = false;
							}
							if (!localMap.containsKey(localObject1)) {
								bool1 = false;
							}
						} else {
							boolean bool2 = localObject2.equals(localObject3);
							if (!bool2) {
								bool1 = false;
								break;
							}
						}
						i++;
					}
				} catch (NullPointerException localNullPointerException) {
					bool1 = false;
				} catch (ClassCastException localClassCastException) {
					bool1 = false;
				}
			}
		} else {
			bool1 = false;
			// continue;
			label145: bool1 = false;
		}
		return bool1;
	}

	public Object get(Object obj) {
		int i = a(obj);
		if (i >= 0) {
			return g[(i << 1) + 1];
		} else {
			return null;
		}
	}

	public int hashCode() {
		int ai[] = f;
		Object aobj[] = g;
		int i1 = h;
		int i = 1;
		int j = 0;
		int k = 0;
		while (j < i1) {
			Object obj = aobj[i];
			int j1 = ai[j];
			int l;
			if (obj == null) {
				l = 0;
			} else {
				l = obj.hashCode();
			}
			k += l ^ j1;
			j++;
			i += 2;
		}
		return k;
	}

	public boolean isEmpty() {
		return h <= 0;
	}

	public Object put(Object paramObject1, Object paramObject2) {
		int i = 8;
		int k = 0;
		int j = 0;
		if (paramObject1 == null) {
			k = a();
			j = 0;
		}
		Object localObject = null;
		while (k >= 0) {
			int n = 1 + (k << 1);
			localObject = this.g[n];
			this.g[n] = paramObject2;

			j = paramObject1.hashCode();
			k = a(paramObject1, j);
		}
		int m = k ^ 0xFFFFFFFF;
		if (this.h >= this.f.length) {
			if (this.h < i) {
				if (this.h < 4) {
					i = 4;
				}
			}
			i = this.h + (this.h >> 1);
		}

		int[] arrayOfInt = this.f;
		Object[] arrayOfObject = this.g;
		e(i);
		if (this.f.length > 0) {
			System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
			System.arraycopy(arrayOfObject, 0, this.g, 0, arrayOfObject.length);
		}
		a(arrayOfInt, arrayOfObject, this.h);
		if (m < this.h) {
			System.arraycopy(this.f, m, this.f, m + 1, this.h - m);
			System.arraycopy(this.g, m << 1, this.g, m + 1 << 1,
					this.h - m << 1);
		}
		this.f[m] = j;
		this.g[(m << 1)] = paramObject1;
		this.g[(1 + (m << 1))] = paramObject2;
		this.h = (1 + this.h);

		/*
		 * break; label280: if (this.h < 4) { i = 4; }
		 */

		return localObject;
	}

	public Object remove(Object obj) {
		int i = a(obj);
		if (i >= 0) {
			return d(i);
		} else {
			return null;
		}
	}

	public int size() {
		return h;
	}

	public String toString() {
		if (isEmpty()) {
			return "{}";
		}
		StringBuilder stringbuilder = new StringBuilder(h * 28);
		stringbuilder.append('{');
		int i = 0;
		while (i < h) {
			if (i > 0) {
				stringbuilder.append(", ");
			}
			Object obj = b(i);
			if (obj != this) {
				stringbuilder.append(obj);
			} else {
				stringbuilder.append("(this Map)");
			}
			stringbuilder.append('=');
			obj = c(i);
			if (obj != this) {
				stringbuilder.append(obj);
			} else {
				stringbuilder.append("(this Map)");
			}
			i++;
		}
		stringbuilder.append('}');
		return stringbuilder.toString();
	}
}
