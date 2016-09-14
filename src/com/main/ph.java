package com.main;

public class ph extends pg {
	public String e;

	public ph(int n, String string, String string2, String string3) {
		super(n, string, string2, null);
		this.e = string3;
	}

	@Override
	public boolean equals(Object object) {
		if (super.equals(object) && object instanceof ph
				&& vk.a((Object) this.e, (Object) ((ph) object).e)) {
			return true;
		}
		return false;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	@Override
	public int hashCode() {
		int j = super.hashCode();
		int i;
		if (e != null) {
			i = e.hashCode();
		} else {
			i = 0;
		}
		return i + j * 31;
	}

	@Override
	public String toString() {
		return super.toString() + ",package=" + this.e;
	}
}
