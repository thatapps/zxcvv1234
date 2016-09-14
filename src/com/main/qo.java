package com.main;

import android.content.Context;

import com.lazyswipe.zev.R;

public class qo extends rc {
	public qo(Context paramContext) {
		this(paramContext, null);
	}

	public qo(Context paramContext, rd paramrd) {
		super(paramContext, paramrd);
	}

	public int a(Context paramContext) {
		return 1;
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_home;
	}

	public String b() {
		return "Home";
	}

	public int c() {
		return R.string.title_tile_home;
	}

	public boolean c(Context paramContext) {
		vi.a(paramContext, R.string.msg_no_setting_available);
		return false;
	}

	public boolean e() {
		vk.f(this.d);
		return true;
	}
}
