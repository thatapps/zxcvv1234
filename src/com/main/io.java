package com.main;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class io extends View {
	private final WindowManager a;
	private final WindowManager.LayoutParams b;
	private boolean c = false;
	private int d;
	private int e;
	private boolean f;
	private boolean g;
	private boolean h;
	private ip i;
	private iq j;
	private final int k;
	private boolean l = true;

	public io(Context paramContext) {
		super(paramContext);
		this.a = ((WindowManager) paramContext.getSystemService("window"));
		int m = 24;
		if (Build.VERSION.SDK_INT >= 11) {
			m = 131096;
		}
		this.b = new WindowManager.LayoutParams(0, -1, 2002, m, -2);
		this.b.x = 0;
		this.b.gravity = 51;
		this.k = vk.a(paramContext, 100.0F);
		a(paramContext);
	}

	private void a(Context paramContext) {
		this.d = getContext().getResources().getDisplayMetrics().heightPixels;
	}

	private void a(boolean paramBoolean) {
		if (paramBoolean == this.g) {
		}

		this.g = paramBoolean;
		if (this.i != null) {
			this.i.a(paramBoolean);
		}
		return;
	}

	private void b(boolean paramBoolean) {
		if (paramBoolean == this.h) {
		}

		this.h = paramBoolean;
		if (this.j != null) {
			this.j.b(paramBoolean);
		}
		return;
	}

	public boolean a() {
		return this.c;
	}

	public void b() {
		if ((b.flags & 0x20000) == 0) {
			return;
		} else {
			android.view.WindowManager.LayoutParams layoutparams = b;
			layoutparams.flags = layoutparams.flags & 0xfffdffff;
			a.updateViewLayout(this, b);
			return;
		}
	}

	public void c() {
		if ((b.flags & 0x20000) == 0x20000) {
			return;
		} else {
			android.view.WindowManager.LayoutParams layoutparams = b;
			layoutparams.flags = layoutparams.flags | 0x20000;
			a.updateViewLayout(this, b);
			return;
		}
	}

	public void d() {
		if (c) {
			return;
		}
		try {
			a.addView(this, b);
			c = true;
			return;
		} catch (Exception exception) {
			vj.b("Swipe.KeyboardMonitor", "failed to add view", exception);
		}
	}

	public void e() {
		if (!c) {
			return;
		}
		try {
			a.removeView(this);
			c = false;
			return;
		} catch (Exception exception) {
			vj.b("Swipe.KeyboardMonitor", "failed to remove view", exception);
		}
	}

	public boolean f() {
		return this.h;
	}

	public boolean g() {
		return i != null || j != null;
	}

	protected void onConfigurationChanged(Configuration paramConfiguration) {
		super.onConfigurationChanged(paramConfiguration);
		if (this.e != paramConfiguration.orientation) {
		}
		for (boolean bool = true;; bool = false) {
			this.f = bool;
			this.e = paramConfiguration.orientation;
			a(getContext());
			return;
		}
	}

	protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3,
			int paramInt4) {
		super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
		boolean bool;
		if (paramInt2 == this.d) {
			bool = true;
			a(bool);
			if (this.l) {
				bool = false;
				return;
			}
			if (!this.f) {
				bool = false;
				return;
			}
			this.f = false;
		}
		

		if (Math.abs(paramInt2 - paramInt4) > this.k) {
			if (paramInt2 <= paramInt4) {
				bool = false;
				return;
			}
			b(false);
		}

		if (!this.l) {
			bool = false;
			return;
		}
		this.l = false;

		b(true);
		
	}

	public void setOnFullScreenChangedListener(ip paramip) {
		this.i = paramip;
	}

	public void setOnSoftKeyboardChangedListener(iq iq) {
		this.j = iq;
		int n = this.b.flags;
		if (iq != null) {
			WindowManager.LayoutParams layoutParams = this.b;
			layoutParams.flags = 131072 | layoutParams.flags;
		} else {
			WindowManager.LayoutParams layoutParams = this.b;
			layoutParams.flags = -131073 & layoutParams.flags;
		}
		if (n != this.b.flags) {
			this.a.updateViewLayout((View) this,
					(ViewGroup.LayoutParams) this.b);
		}
	}
}
