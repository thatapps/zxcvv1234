package com.main;

public final class uq  {
	public static final/* enum */uq a = new uq("SUCCESS", 0);
	public static final/* enum */uq b = new uq("FAILURE", 1);
	private static final/* synthetic */uq[] c;

	static {
		uq[] arruq = new uq[] { a, b };
		c = arruq;
	}

	private uq(String string2, int n2) {
		super();
	}

	public static uq valueOf(String string) {
		return /*(uq) Enum.valueOf((Class) uq.class, (String) string)*/null;
	}

	public static uq[] values() {
		return (uq[]) c.clone();
	}
}
