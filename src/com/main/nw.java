package com.main;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;

public class nw extends FrameLayout implements ns {

	private oa a;
	private nt b;
	private nx c;
	private boolean d;
	private nz e;
	private float f;
	private boolean g;

	public nw(Context context, oa oa1) {
		super(context);
		f = 0.7F;
		a = oa1;
		b = new nt(context);
		setBackgroundDrawable(b);
		e = new nz(getContext(), this);
		addView(e.a());
		c = new nx(getContext(), this);
	}

	static nz a(nw nw1) {
		return nw1.e;
	}

	static void a(nw nw1, boolean flag) {
		nw1.b(flag);
	}

	private void b(boolean flag) {
		if (!flag) {
			jc.b(getContext(), "CC");
			b.a(f);
		} else {
			jc.b(getContext(), "CD");
		}
		setBackgroundDrawable(b);
		b.b();
		c.a(getContext());
	}

	void a(float f1) {
		float f2 = f1;
		if (f1 <= 0.0F) {
			f2 = 0.0F;
		}
		f2 = (3F * f2) / (float) b.getIntrinsicHeight();
		f1 = f2;
		if (f2 >= 1.0F) {
			f1 = 1.0F;
		}
		b.a(f1 * f);
	}

	public void a(boolean flag) {
		if (!flag) {
			a.g();
			return;
		}
		if (b.a()) {
			b.c();
		}
		setBackgroundDrawable(new ColorDrawable(0xb2000000));
		e.b();
		g = true;
	}

	public boolean a() {
		return !d;
	}

	public void b() {
		e.a(new Runnable() {

			final nw a;

			public void run() {
				nw.a(a).d();
				nw.a(a, false);
			}

			{
				a = nw.this;
			//	super();
			}
		});
	}

	public void c() {
		a.getController().a(false);
	}

	public void d() {
		a.g();
	}

	public boolean e() {
		return a.l();
	}

	public boolean f() {
		return g;
	}

	void g() {
		if (e.c()) {
			e.a(new Runnable() {

				final nw a;

				public void run() {
					nw.a(a).d();
					nw.a(a, false);
				}

				{
					a = nw.this;
					//super();
				}
			});
			return;
		} else {
			b(true);
			return;
		}
	}

	public nz getAdView() {
		return e;
	}

	boolean h() {
		return b.a();
	}

	boolean i() {
		return e.c();
	}

	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		d = true;
	}

	public void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		d = false;
		if (b.a()) {
			b.c();
		}
		e.d();
		c.a();
	}
}
