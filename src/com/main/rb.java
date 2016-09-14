package com.main;

import android.content.Context;
import android.content.Intent;

import com.lazyswipe.zev.R;

public class rb extends rc {
	public rb(Context paramContext) {
		this(paramContext, null);
	}

	public rb(Context paramContext, rd paramrd) {
		super(paramContext, paramrd);
	}

	public int a(Context paramContext) {
		return 1;
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_system_settings;
	}

	public boolean a(int paramInt) {
		return true;
	}

	protected Intent b(Context paramContext) {
		return vk.i();
	}

	public String b() {
		return "System settings";
	}

	public int c() {
		return R.string.title_tile_system_settings;
	}

	public boolean e() {
		return vk.o(this.d);
	}
}
