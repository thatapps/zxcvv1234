package com.main;

import android.content.Context;
import android.content.Intent;

public abstract class qz extends rc {

	public qz(Context context, rd rd) {
		super(context, rd);
	}

	public Intent b(Context context) {
		Intent intent = new Intent("android.settings.SOUND_SETTINGS");
		if (!vk.a(context, intent)) {
			intent.setClassName("com.android.settings",
					"com.android.settings.audioprofile.AudioProfileSettings");
			if (!vk.a(context, intent)) {
				intent.setClassName("com.android.settings",
						"com.android.settings.profile.ProfileSettings");
				if (!vk.a(context, intent)) {
					intent.setClassName("com.android.settings",
							"com.android.settings.audioprofile.SoundSettings");
					return intent;
				}
			}
		}
		return intent;
	}
}
