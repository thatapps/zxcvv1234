package com.main;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.text.TextUtils;

public class nd {

	private static ArrayList a(Context context, int i) {
		if (TextUtils.isEmpty("")) {
			return mp.a();
		}
		ArrayList list = new ArrayList();
		String as[] = ve.a("", ',');
		int j = i;
		if (i <= 0) {
			j = as.length;
		}
		i = 0;
		while (i < as.length && i < j) {
			String s = as[i];
			if (!TextUtils.isEmpty(s)) {
				list.add(a(s));
			}
			i++;
		}
		return list;
	}

	public static List a(Context context) {
		return a(context, 3);
	}
	private static nc a(String var0) {
	      byte var1 = -1;
	      switch(var0.hashCode()) {
	      case -176414240:
	         if(var0.equals("mostUsed")) {
	            var1 = 0;
	         }
	         break;
	      case -85276959:
	         if(var0.equals("switcher")) {
	            var1 = 3;
	         }
	         break;
	      case 2095953157:
	         if(var0.equals("recentlyUsed")) {
	            var1 = 2;
	         }
	         break;
	      case 2142698290:
	         if(var0.equals("recentlyInstalled")) {
	            var1 = 1;
	         }
	      }

	      switch(var1) {
	      case 0:
	         return new mv();
	      case 1:
	         return new mz();
	      case 2:
	         return new my();
	      case 3:
	         return new nb();
	      default:
	         return new nf(var0);
	      }
	}
//	private static nc a(String var0) {
//		int var1_1 = -1;
//		switch (var0.hashCode()) {
//		case -176414240: {
//			if (var0.equals((Object) "mostUsed")) {
//				var1_1 = 0;
//				break;
//			} else {
//
//				switch (var1_1) {
//				default: {
//					return new nf(var0);
//				}
//				case 0: {
//					return new mv();
//				}
//				case 1: {
//					return new mz();
//				}
//				case 2: {
//					return new my();
//				}
//				case 3:
//				
//				return new nb();
//				}
//			}
//		}
//		case 2142698290: {
//			if (var0.equals((Object) "recentlyInstalled")) {
//				var1_1 = 1;
//				// ** break;
//			} else {
//
//				switch (var1_1) {
//				default: {
//					return new nf(var0);
//				}
//				case 0: {
//					return new mv();
//				}
//				case 1: {
//					return new mz();
//				}
//				case 2: {
//					return new my();
//				}
//				case 3:
//				
//				return new nb();
//				}
//			}
//		}
//
//		// case -85276959:
//
//		case 2095953157:
//			if (var0.equals((Object) "recentlyUsed")) {
//				var1_1 = 2;
//			}
//
//			if (var0.equals((Object) "switcher")) {
//				var1_1 = 3;
//			}
//			// lbl19: // 4 sources:
//
//		}
//		return null;
//	}
}
