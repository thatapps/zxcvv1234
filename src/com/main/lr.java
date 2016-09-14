package com.main;

public class lr {

	public boolean a;
	public int b;
	public int c;
	String d;
	String e;
	public String f;
	public int g;
	public int h;
	public int i;
	public boolean j;
	public boolean k;

	public lr() { 
		g = -1;
		h = -1;
		a();
	}

	public lr a(boolean flag, int l, int i1) {
		a();
		a = flag;
		b = l;
		c = i1;
		return this;
	}

	public lr a(boolean flag, int l, int i1, int j1, int k1, int l1) {
		a(flag, l, i1);
		g = j1;
		h = k1;
		i = l1;
		return this;
	}

	public lr a(boolean flag, boolean flag1) {
		a();
		k = flag1;
		a = flag;
		b = 99;
		c = -1;
		return this;
	}

	public void a() {
       		a = false;
		b = 99;
		c = 0;
		e = null;
		d = null;
		f = null;
		h = -1;
		g = -1;
		i = 0;
		k = false;
	}

	public String toString() {
		return (new StringBuilder()).append("FanOpenParams:{left=").append(a)
				.append(",tab=").append(f).append(",toucher=").append(b)
				.append(",degree=").append(c).append(",x=").append(g)
				.append(",y=").append(h).append(",index=").append(i)
				.append(",component=").append(d).append("/").append(e)
				.append(",suppressNotifications=").append(k).append("}")
				.toString();
	}
}
