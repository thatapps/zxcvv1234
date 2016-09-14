package com.main;

import java.util.Scanner;

public class fn {

	private String a;
	private String b;
	private String c;
	private String d;

	public fn(String s, String s1, String s2) {
		c = s;
		b = s1;
		a = s2;
	}

	public fn(char ac[]) {
		Scanner scanner = new Scanner(new String(ac));
		String s = "";
		do {
			if (scanner.hasNextLine()) {
				s = scanner.nextLine();
			} else {
				scanner.close();
			}

			if (s.startsWith("url=")) {
				c = s.substring("url=".length()).trim();
			} else if (s.startsWith("version=")) {
				a = s.substring("version=".length()).trim();
			} else if (s.startsWith("data=")) {
				b = s.substring("data=".length()).trim();
			}
		} while (true);

	}

	public String a() {
		return a;
	}

	public void a(String s) {
		d = s;
	}

	public String b() {
		return b;
	}

	public String c() {
		return c;
	}

	public String d() {
		return d;
	}
}
