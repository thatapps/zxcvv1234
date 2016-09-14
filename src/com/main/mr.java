package com.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.lazyswipe.fan.friend.FriendSector;

public class mr extends mt {

	protected final pv a;
	protected final Context b;
	protected Drawable c;

	public mr(Context context, pv pv1) {
		b = context;
		a = pv1;
	}

	public CharSequence a() {
		return a.d;
	}

	public boolean a(Context context) {
		ja.a().a("\u70B9\u51FB\u8054\u7CFB\u4EBA");
		FriendSector.a(e);
		return false;
	}

	public Drawable b() {
		if (c == null) {
			c = tj.a(b, a);
		}
		return c;
	}

	public boolean b(Context context) {
		return false;
	}

	public String e() {
		return a.toString();
	}

	public String i() {
		return "Contact";
	}

	public pv j() {
		return a;
	}
}
