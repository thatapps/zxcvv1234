package com.main;

import android.content.Context;
import android.content.Intent;

import com.lazyswipe.zev.R;

public class qk extends rc {
	public qk(Context paramContext) {
		this(paramContext, null);
	}

	public qk(Context paramContext, rd paramrd) {
		super(paramContext, paramrd);
	}

	public static Intent a_() {
		return new Intent("android.media.action.STILL_IMAGE_CAMERA");
	}

	public int a(Context paramContext) {
		return 1;
	}

	public int a(boolean paramBoolean) {
		return R.drawable.tile_camera;
	}

	public boolean a(int paramInt) {
		return true;
	}

	public String b() {
		return "Camera";
	}

	public int c() {
		return R.string.title_tile_camera;
	}

	public boolean c(Context paramContext) {
		vi.a(paramContext, R.string.msg_no_setting_available);
		return false;
	}

	public boolean e() {
		boolean bool = false;
		try {
			this.d.startActivity(a_().addFlags(268435456));
			bool = true;
		} catch (Throwable localThrowable) {

			vi.a(this.d, "Could not start Camera");
			ja.a().a("Swipe.Tile", "Camera failed to launch: " + to.M());

		}
		return bool;
	}
}
