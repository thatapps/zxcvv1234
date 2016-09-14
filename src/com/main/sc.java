package com.main;

public final class sc {

	public static final sc a;
	public static final sc b;
	public static final sc c;
	private static final sc d[];

	private sc(String s, int i) {
		super();
	}

	public static sc valueOf(String s) {
		return null; /* (sc) Enum.valueOf( s); */
	}

	public static sc[] values() {
		return (sc[]) d.clone();
	}

	static {
		a = new sc("SCROLL_STATE_IDLE", 0);
		b = new sc("SCROLL_STATE_TOUCH_SCROLL", 1);
		c = new sc("SCROLL_STATE_FLING", 2);
		d = (new sc[] { a, b, c });
	}
}
