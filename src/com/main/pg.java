package com.main;

public class pg {

	public String a;
	public int b;
	public String c;
	public String d;

	public pg(int i, String s, String s1, String s2) {
		b = i;
		a = s;
		c = s1;
		d = s2;
	}

	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (!(object instanceof pg))
			return false;
		pg pg = (pg) object;
		if (this.b != pg.b)
			return false;
		if (!vk.a((Object) this.a, (Object) pg.a))
			return false;
		if (!vk.a((Object) this.c, (Object) pg.c))
			return false;
		if (!vk.a((Object) this.d, (Object) pg.d))
			return false;
		return true;
	}

	public int hashCode() {
		int k = 0;
		int l = b;
		int i;
		int j;
		if (a != null) {
			i = a.hashCode();
		} else {
			i = 0;
		}
		if (c != null) {
			j = c.hashCode();
		} else {
			j = 0;
		}
		if (d != null) {
			k = d.hashCode();
		}
		return (j + (i + (l + 527) * 31) * 31) * 31 + k;
	}

	public String toString() {
		return (new StringBuilder()).append("Id=").append(b).append(",tag=")
				.append(a).append(",key=").append(c).append(",identity=")
				.append(d).toString();
	}
}
