package com.main;

public final class hy {
	public static final/* enum */hy a = new hy("HTML", 0, 0);
	public static final/* enum */hy b = new hy("NATIVE", 1, 1);
	private static final/* synthetic */hy[] d;
	private final int c;

	static {
		hy[] arrhy = new hy[] { a, b };
		d = arrhy;
	}

	private hy(String string2, int n2, int n3) {
		super();
		this.c = n3;
	}

	public static hy valueOf(String string) {
		return /*(hy)Enum.valueOf(hy, string)*/null;
	}

	public static hy[] values() {
		return (hy[]) d.clone();
	}

	public int a() {
		return this.c;
	}
}
