package com.main;

import java.util.Arrays;
import java.util.List;

import android.net.Uri;
import android.text.TextUtils;

import com.lazyswipe.app.LazyProvider;

public class jv {
	public String a;
	public String b;
	public String[] c;
	public boolean d;

	public jv(LazyProvider var1, Uri var2, String var3, String[] var4) {
		List var6 = var2.getPathSegments();
		this.a = (String) var6.get(0);
		if ("public_pref".equals(this.a)) {
			this.b = var3;
		} else {
			if ("notification".equals(this.a)) {
				this.a = "memory_db." + this.a;
			}

			switch (var6.size()) {
			case 1:

				if (!TextUtils.isEmpty(var3)) {
					int i = var3.indexOf("key_suppress_notify");
					if (i >= 0) {
						d = true;
						if (i != 0) {
							b = var3.substring(0, i);
							c = var4;
							
						}
					} else {
						b = var3;
						c = var4;
						
					}
				}
				break;
				
			case 2:
				if (var3 != null) {
					if (!var3.equals("key_suppress_notify")) {
						throw new IllegalArgumentException(
								"Ambiguous query. Uri: " + var2 + ", where: "
										+ var3 + ", args: "
										+ Arrays.toString(var4));
					}

					this.d = true;
				}

				String var7 = var1.getType(var2);
				byte var5 = -1;
				switch (var7.hashCode()) {
				case -940777946:
					if (var7.equals("vnd.android.cursor.item/com.lazyswipe.banner")) {
						var5 = 0;
					}
					break;
				case -555194656:
					if (var7.equals("vnd.android.cursor.item/com.lazyswipe.op_log")) {
						var5 = 1;
					}
					break;
				case 5859803:
					if (var7.equals("vnd.android.cursor.item/com.lazyswipe.touch_fix")) {
						var5 = 4;
					}
					break;
				case 703177364:
					if (var7.equals("vnd.android.cursor.item/com.lazyswipe.blocked_app")) {
						var5 = 3;
					}
					break;
				case 1755306771:
					if (var7.equals("vnd.android.cursor.item/com.lazyswipe.blocked_contact")) {
						var5 = 2;
					}
				}

				switch (var5) {
				case 0:
					var7 = "code";
					break;
				case 1:
					var7 = "code";
					break;
				case 2:
					var7 = "uri";
					break;
				case 3:
					var7 = "intent";
					break;
				case 4:
					var7 = "package";
					break;
				default:
					var7 = "_id";
				}

				this.b = var7 + "=?";
				this.c = new String[] { var2.getLastPathSegment() };
				return;
			default:
				throw new IllegalArgumentException("Invalid uri: " + var2);
			}
		}

	}

	public static String a(Uri paramUri) {
		return (String) paramUri.getPathSegments().get(0);
	}
}
