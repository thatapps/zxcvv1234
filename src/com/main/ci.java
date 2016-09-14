package com.main;

import android.util.Log;
import java.io.Writer;

public class ci extends Writer {

	private final String a;
	private StringBuilder b;

	public ci(String s) {
		b = new StringBuilder(128);
		a = s;
	}

	private void a() {
		if (b.length() > 0) {
			Log.d(a, b.toString());
			b.delete(0, b.length());
		}
	}

	public void close() {
		a();
	}

	public void flush() {
		a();
	}

	public void write(char ac[], int i, int j) {
		int k = 0;
		while (k < j) {
			char c = ac[i + k];
			if (c == '\n') {
				a();
			} else {
				b.append(c);
			}
			k++;
		}
	}
}
