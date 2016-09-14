package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;

public class nt extends Drawable {
	Random a = new Random();
	float[] b = new float[3];
	float c;
	private PointF d;
	private float e;
	private ArrayList<nv> f;
	private ArrayList g;
	private ArrayList h;
	private Context i;
	private boolean j = false;
	private float k;
	private boolean l = false;
	private int m = 0;
	private float n = 117.64706F;
	private boolean o = false;
	private nu p;
	private int q = 2;

	public nt(Context context) {
		this.i = context;
		this.d = new PointF();
		this.f = new ArrayList(38);
		this.g = new ArrayList(19);
		this.h = new ArrayList(19);
		this.d.set((float) this.getIntrinsicWidth() / 2.0f,
				(float) this.getIntrinsicHeight() / 2.0f);
		this.e = (float) this.getIntrinsicWidth() / 2.0f;
		this.c = 17.0f * (2.0f * (this.e / 1.5f) / 500.0f);
		if (this.f.isEmpty()) {
			this.g.clear();
			this.h.clear();
			for (int i = 0; i < 38; ++i) {
				nv nv = new nv(this);
				this.f.add(nv);
				if (i < 19) {
					this.g.add((Object) nv);
					continue;
				}
				this.h.add((Object) nv);
			}
		}
		this.f();
	}

	private void b(boolean paramBoolean) {
		this.l = false;
		if (paramBoolean) {
			a(false);
		}

		f();

	}
	static boolean c(nt nt1)
    {
        return nt1.o;
    }

    static int d(nt nt1)
    {
        return nt1.q;
    }

	static Context a(nt nt1)
    {
        return nt1.i;
    }

    static float b(nt nt1)
    {
        return nt1.e;
    }
    static int e(nt nt1)
    {
        int i1 = nt1.q;
        nt1.q = i1 - 1;
        return i1;
    }
	private void d() {
		invalidateSelf();
	}

	private void e() {
		boolean bl;
		if (this.l) {
			this.m = 1 + this.m;
			boolean bl2 = (float) this.m > this.n;
			bl = bl2;
		} else {
			bl = true;
		}
		Iterator iterator = this.f.iterator();
		boolean bl3 = false;
		while (iterator.hasNext()) {
			boolean bl4;
			nv nv = (nv) iterator.next();
			if (nv.h) {
				nv.a(bl);
				boolean bl5 = !nv.b();
				bl4 = bl5 | bl3;
			} else {
				bl4 = bl3;
			}
			bl3 = bl4;
		}
		if (bl) {
			this.b(true);
		}
		if (bl3) {
			this.d();
		}
	}

	private void f() {
		boolean bl = !this.o;
		this.o = bl;
		this.p = new nu(19);
		this.q = 2;
		this.j = false;
		ArrayList arrayList = this.o ? this.g : this.h;
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			nv nv = (nv) iterator.next();
			nv.a(this.p.a());
			nv.d.set(0.0f, 0.0f);
		}
		return;
	}
	static boolean f(nt nt1)
    {
        return nt1.l;
    }

    static PointF g(nt nt1)
    {
        return nt1.d;
    }
	public void a(float paramFloat) {
		if (paramFloat > this.k) {
			this.k = paramFloat;
			d();
		}
	}
	
	public void a(boolean bl) {
        if (this.l) {
            return;
        }
        this.l = true;
        this.m = 0;
        for (nv nv : this.f) {
            if (!nv.h || !bl && !nv.b()) 
            nv.b(false);
        }
        this.d();
    }

	public boolean a() {
		return this.l;
	}

	public void b() {
		a(true);
	}

	public void c() {
		b(false);
	}

	public void draw(Canvas canvas) {
        if (this.k > 0.0f) {
            canvas.drawColor(Color.argb((int)((int)(255.0f * this.k)), (int)0, (int)0, (int)0));
        }
        canvas.save();
        Iterator iterator = this.f.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            bl|=((nv)iterator.next()).a(canvas);
        }
        canvas.restore();
        if (bl) {
            this.d();
        } else if (!this.j) {
            this.j = true;
        }
        if (this.l) {
            this.e();
        }
    }

	public int getIntrinsicHeight() {
		return to.q(this.i);
	}

	public int getIntrinsicWidth() {
		return to.p(this.i);
	}

	public int getOpacity() {
		return 0;
	}

	public void setAlpha(int paramInt) {
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
	}
}
