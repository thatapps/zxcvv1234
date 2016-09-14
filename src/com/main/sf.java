package com.main;

import android.app.Activity;
import android.os.Bundle;

public class sf extends Activity {
	protected boolean b() {
		return true;
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		if (b()) {
			rv.a().a(this);
		}
	}

	public void onDestroy() {
		super.onDestroy();
		if (b()) {
			rv.a().b(this);
		}
	}
}
