package com.main;

import java.util.List;

import android.content.Context;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

/*
 * Failed to analyse overrides
 */
public class jl extends jj {
	private final boolean b;

	public jl(Context context, boolean bl) {
		super(context);
		this.b = bl;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public static boolean a(Context context) {
		boolean flag = false;
		int i;
		if (ol.u) {
			i = ol.t.b(0);
		} else {
			i = 100;
		}
		if (i == 0 || ir.d(context, i) == 1) {
			flag = true;
		}
		return flag;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	// protected void a() {
	// if (!(this.b || kk.a(this.a, 6, 86400000))) {
	// return;
	// }
	// kk.a(this.a, 6);
	// if (!jl.a(this.a)) {
	// try {
	// this.a.getContentResolver().delete(kr.a, null, null);
	// return;
	// } catch (Throwable var9_1) {
	// return;
	// }
	// }
	// List list = SwipeApplication.e().b().d();
	// int n = list.size();
	// int n2 = (int) Math.ceil((double) (1.0f * (float) n / 20.0f));
	// for (int i = 0; i < n2; ++i) {
	// vj.a("Swipe.API", "Getting touch fixes #" + i + "...");
	// int n3 = i * 20;
	// int n4 = i == n2 - 1 ? n : 20 * (i + 1);
	// String string = TextUtils.join((CharSequence) ",",
	// (Iterable) list.subList(n3, n4));
	// if (!ji.b(this.a, string))
	// break;
	// }
	// this.a.getContentResolver().notifyChange(kr.a, null);
	// }
	protected void a() {
		if (!b && !kk.a(a, 6L, 0x5265c00L)) {
			return;
		}
		kk.a(a, 6L);
		if (!a(a)) {
			try {
				a.getContentResolver().delete(kr.a, null, null);
				return;
			} catch (Throwable throwable) {
				return;
			}
		}
		List list = SwipeApplication.e().b().d();
		int k = list.size();
		int l = (int) Math.ceil(((float) k * 1.0F) / 20F);
		int i = 0;
		do {

			if (i < l) {
				vj.a("Swipe.API",
						(new StringBuilder()).append("Getting touch fixes #")
								.append(i).append("...").toString());
				String s;
				int j;
				if (i == l - 1) {
					j = k;
				} else {
					j = (i + 1) * 20;
				}
				s = TextUtils.join(",", list.subList(i * 20, j));
				if (!ji.b(a, s)) {
					a.getContentResolver().notifyChange(kr.a, null);
					return;
				}
			}

			i++;
		} while (true);
	}
}
