package com.main;

import android.content.Context;
import android.os.Handler;

public abstract class hl {
	protected final hm a;
	protected hk b;
	private final long c;
	private final Handler d;
	private final Runnable e;
	private Context f;
	private volatile boolean g;
	private volatile boolean h;

	public hl(hm hm, long l, Context context) {
		this.e = new Runnable() {

			public void run() {
				hl.this.h = false;
				hl.this.d();
			}
		};
		this.f = context;
		this.a = hm;
		this.c = l;
		this.d = new Handler();
	}

	protected abstract void a();

	public void a(hk paramhk) {
		this.b = paramhk;
		this.g = false;
		this.h = false;
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public void b() {
		hl hl = this;
		synchronized (hl) {
			hk hk;
			if (!(this.g || this.h || (hk = this.b) == null)) {
				this.d.postDelayed(this.e, this.c);
				this.h = true;
			}
			return;
		}
	}

	public void c() {
		hl hl = this;
		synchronized (hl) {
			if (this.h) {
				this.d.removeCallbacks(this.e);
				this.h = false;
			}
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void d() {

		try {
			if (this.b != null) {
				boolean bool = this.g;
				if (!bool) {
				}
			} else {
				return;
			}
			if ((this.a != null) && (!this.a.a())) {
				b();
				// continue;
			}
			if (this.a == null) {
				a();
				this.g = true;
				hz.a(this.f, "Impression logged");
			}
		} finally {
		}
		this.a.d();
		// label68:

	}
}
