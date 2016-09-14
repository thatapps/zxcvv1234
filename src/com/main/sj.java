package com.main;

import android.content.Context;
import android.content.Intent;
import com.lazyswipe.fan.Fan;

public class sj extends wy implements sn {

	protected sl a;
	protected boolean b;
	private Intent e;

	public sj(Context context, Intent intent) {
		super(context);
		e = intent;
		b = intent.getBooleanExtra("EXTRA_CHOOSE_APP", true);
	}

	public void b() {
		dismiss();
		if (Fan.getInstance() != null) {
			Fan.getInstance().b(false);
			Fan.getInstance().getBaseSectorArea().c();
		}
	}

	public void c() {
		dismiss();
	}

	public void d() {
		dismiss();
	}

	public void dismiss() {
		super.dismiss();
		a.i();
		a.j();
		a.b();
	}

	public void show() {
		super.show();
		a = (sl) findViewById(0x7f0c000f);
		a.setMultiChooserCallBack(this);
		a.setIntent(e);
		a.a();
		a.f();
		a.g();
		a.h();
	}
}
