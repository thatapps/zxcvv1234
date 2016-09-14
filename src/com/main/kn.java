package com.main;

import android.database.Cursor;
import android.net.Uri;
import com.lazyswipe.SwipeApplication;
import java.util.List;
import java.util.Map;

public class kn {

	public static final Uri a = Uri
			.parse("content://com.lazyswipe/public_pref");

	public static Cursor a(Uri uri, String s, String as[]) {
		String str = null;
		List list = uri.getPathSegments();
		if (list.size() < 2) {
			return null;
		}
		if ("is_lazy_enabled".equals((String) list.get(1))) {
			if (a(s)) {
				str = "1";
			} else {
				str = "0";
			}
			try {
				return new ko(str);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				return null;
			}
		} else {
			return null;
		}
	}

	private static boolean a(String s) {
		SwipeApplication swipeapplication;
		swipeapplication = SwipeApplication.e();

		if (ir.L(swipeapplication) && ir.b(swipeapplication) != 1) {
			s = (String) vk.i(s).get("isLeft");
			if ("0".equals(s)) {
				int i = ir.D(swipeapplication);
				boolean flag;
				if (2 == (i & 2) || 8 == (i & 8)) {
					flag = true;
				} else {
					flag = false;
				}
				return flag;
			}
			if ("1".equals(s)) {
				int j = ir.D(swipeapplication);
				if (1 == (j & 1) || 4 == (j & 4)) {
					return true;
				}
			} else {
				return true;
			}
		}
		return false;
	}

}
