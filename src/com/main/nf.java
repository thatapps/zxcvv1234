package com.main;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.lazyswipe.SwipeApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class nf extends nc {

	private static int d = -1;
	private String a;

	public nf(String s) {
		a = s;
	}

	public String a(Context context) {
		return a;
	}

	public void a(SwipeApplication swipeapplication) {
		boolean flag = false;
		if (c == null) {
			c = new ArrayList();
			String s = ir
					.a(swipeapplication, (new StringBuilder()).append("tab_")
							.append(b()).toString(), "");
			if (!TextUtils.isEmpty(s)) {
				String as[] = s.split(",");
				int l = as.length;
				int i = 0;
				while (i < l) {
					Object obj = ComponentName.unflattenFromString(as[i]);
					if (obj == null) {
						c.add(null);
					} else {
						obj = swipeapplication.b().a(((ComponentName) (obj)));
						c.add(new mo(((jq) (obj))));
					}
					i++;
				}
			}
			int l1 = nc.f() - c.size();
			int i1;
			if (l1 > 0) {
				int j = 0;
				do {
					i1 = ((flag) ? 1 : 0);
					if (j >= l1) {
						break;
					}
					c.add(null);
					j++;
				} while (true);
			} else {
				i1 = ((flag) ? 1 : 0);
				if (l1 < 0) {
					i1 = c.size();
					int k = 0;
					i1--;
					while (c.size() > nc.f()) {
						if ((mt) c.get(i1) == null) {
							c.remove(i1);
							k = 1;
						}
						int k1;
						if (i1 > 0) {
							int j1 = i1 - 1;
							i1 = k;
							k = j1;
						} else {
							c.remove(c.size() - 1);
							k = i1;
							i1 = 1;
						}
						k1 = i1;
						i1 = k;
						k = k1;
					}
					i1 = k;
				}
			}
			if (i1 != 0) {
				c(swipeapplication);
			}
		}
	}

	public String b() {
		return a;
	}

	public void c(Context context) {
		if (c == null) {
			return;
		}
		StringBuilder stringbuilder = new StringBuilder();
		Iterator iterator = c.iterator();
		boolean flag = true;
		while (iterator.hasNext()) {
			Object obj = (mt) iterator.next();
			if (flag) {
				flag = false;
			} else {
				stringbuilder.append(",");
			}
			if (obj == null) {
				obj = "null";
			} else {
				obj = ((mt) (obj)).e();
			}
			stringbuilder.append(((String) (obj)));
		}
		ir.b(context, (new StringBuilder()).append("tab_").append(b())
				.toString(), stringbuilder.toString());
	}

}
