package com.main;

public class ch {

	public static void a(Object obj, StringBuilder stringbuilder) {
		String s;

		if (obj == null) {
			stringbuilder.append("null");
			return;
		}
		String s1 = obj.getClass().getSimpleName();
		if (s1 != null) {
			s = s1;
			if (s1.length() > 0) {
				
			}
		}
		s1 = obj.getClass().getName();
		int i = s1.lastIndexOf('.');
		s = s1;
		if (i > 0) {
			s = s1.substring(i + 1);
		}

		stringbuilder.append(s);
		stringbuilder.append('{');
		stringbuilder.append(Integer.toHexString(System.identityHashCode(obj)));
	}
}
