package com.main;

import android.content.Context;
import android.media.AudioManager;

public class qs extends qz {

	private static final int b[] = { 0x7f020096, 0x7f020093, 0x7f020095,
			0x7f020094 };
	private static final float c[] = { 0.0F, 0.33F, 0.66F, 1.0F };
	private final AudioManager a;
	private int i;

	public qs(Context context) {
		this(context, null);
	}

	public qs(Context context, rd rd) {
		super(context, rd);
		a = (AudioManager) context.getSystemService("audio");
	}

	public int a(Context context) {
		return 0;
	}

	public int a(boolean flag) {
		return 0;
	}

	public boolean a(int j) {
		return e(d) != 0x7f020096;
	}

	public String b() {
		return "Music volume";
	}

	public int c() {
		return 0x7f0f00bb;
	}

	public boolean d(Context context) {
		int j = i + 1;
		i = j;
		if (j >= b.length) {
			i = 0;
		}
		j = (int) ((float) a.getStreamMaxVolume(3) * c[i]);
		a.setStreamVolume(3, j, 1);
		return false;
	}

	public int e(Context context) {
		int j = a.getStreamVolume(3);
		int k = a.getStreamMaxVolume(3);
		if (j == 0) {
			i = 0;
		} else if ((float) j > (float) k * 0.66F) {
			i = 3;
		} else if ((float) j > (float) k * 0.33F) {
			i = 2;
		} else {
			i = 1;
		}
		return b[i];
	}

}
