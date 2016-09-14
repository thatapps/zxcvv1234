/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.lazyswipe.fan.hetero.iwatch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.zev.R;
import com.main.mt;
import com.main.ni;
import com.main.nj;
import com.main.nn;
import com.main.oy;
import com.main.tf;
import com.main.to;
import com.main.vk;

/*
 * Failed to analyse overrides
 */
public class WatchFanItem extends FanItem implements Handler.Callback {
	public static int i;
	public static ni k[][];
	private static final String l = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.fan.hetero.iwatch.WatchFanItem.class
					.getSimpleName()).toString();
	private static Bitmap o;
	public nj h;
	public Rect j;
	private mt m;
	private final int n = getResources().getDimensionPixelSize(
			R.dimen.fan_item_watch_text_fading_size);
	private Paint p;
	private Rect q;
	private WatchItemSector r;
	private Handler s;

	static {
		k = new ni[13][];
		k[6] = a(45F, 90F);
		k[7] = a(75F, 90F);
		k[8] = a(15F, 90F);
		k[0] = a(45F, 60F);
		k[1] = a(65F, 60F);
		k[2] = a(25F, 60F);
		k[3] = a(45F, 85F);
		k[4] = a(62F, 85F);
		k[5] = a(28F, 85F);
		k[9] = a(11F, 85F);
		k[10] = a(79F, 85F);
		k[11] = (new ni[] { new ni(0, 72), new ni(45, 90), new ni(90, 135),
				new ni(172, 0), new ni(180, 5), new ni(244, 30),
				new ni(245, 60), new ni(270, 72) });
		k[12] = (new ni[] { new ni(0, 18), new ni(25, 30), new ni(26, 60),
				new ni(90, 85), new ni(135, 135), new ni(180, 180),
				new ni(225, 0), new ni(270, 18) });
	}

	public WatchFanItem(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		p = new Paint();
		j = new Rect();
		i = n >> 1;
		s = new Handler(this);
	}

	private float a(float f, float f1, float f2, float f3, float f4) {
		if (f4 < f1) {
			return f;
		}
		if (f4 < f2) {
			return f + ((f4 - f1) * (f3 - f)) / (f2 - f1);
		} else {
			return ((f4 - f2) * (0.16F - f3)) / (45F - f2) + f3;
		}
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	private float a(ni[] var1, float var2) {
		int var8 = 0;
		int var9 = 0;

		while (true) {
			if (var8 >= var1.length) {
				var8 = var9;
				break;
			}

			if (var1[var8].a >= var2) {
				break;
			}

			var9 = var8++;
		}

		if (var2 != var1[var8].a && var8 != 0) {
			float var5 = var1[var8 - 1].a;
			float var6 = var1[var8].a;
			float var7 = var1[var8 - 1].b;
			float var4 = var1[var8].b;
			float var3 = var4;
			if (var7 > var4) {
				var3 = var4 + 360.0F;
			}

			return (var3 - var7) * (var2 - var5) / (var6 - var5) + var7;
		} else {
			return var1[var8].b;
		}
	}

	public static WatchFanItem a(mt mt, int n, int n2, boolean bl,
			WatchItemSector watchItemSector) {
		WatchFanItem watchFanItem = (WatchFanItem) LayoutInflater.from(
				(Context) SwipeApplication.e()).inflate(
				R.layout.fan_item_iwatch, null, false);
		watchFanItem.r = watchItemSector;
		watchFanItem.h = new nj(n, n2, bl);
		watchFanItem.a(mt);
		return watchFanItem;
	}

	public static ni[] a(float f, float f2) {
		ni[] arrni = new ni[] { new ni(0.0f, f), new ni(90.0f, oy.a(f + f2)),
				new ni(180.0f, oy.a(f + (360.0f - f2))), new ni(270.0f, f) };
		return arrni;
	}

	private void b(mt mt1) {
		if (mt1 != null && mt1.r()) {
			setLayerType(1, null);
			return;
		}
		if (h.i == 3 || h.i == 1) {
			if (to.x() || !to.u()) {
				setLayerType(1, tf.b);
				return;
			} else {
				setLayerType(2, null);
				return;
			}
		} else {
			setLayerType(0, null);
			return;
		}
	}

	private void d(float f) {
		f = a(h.l, f);
		nj.a(h, oy.a(f));
		nj.a(h, oy.a(h.e, nj.a(h)));
		double d1 = Math.toRadians(nj.a(h));
		h.j = (int) ((double) h.h * Math.cos(d1));
		nj nj1 = h;
		double d2 = h.h;
		nj1.k = (int) (Math.sin(d1) * d2);
		l();
		b(false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private float e(float f) {
		float f1 = 45F;
		if (f > 135F && f < 225F) {
			return 0.6F;
		}
		f = Math.abs(f - 45F);
		if (f > 45F) {
			f = f1;
		}
		switch (h.i) {
		default:
			return 1.0F;

		case 0: // '\0'
			return a(0.85F, 30F, 38F, 0.68F, f);

		case 1: // '\001'
			return a(1.0F, 29F, 32.5F, 0.75F, f);

		case 2: // '\002'
			return a(1.0F, 30F, 38F, 0.8F, f);

		case 3: // '\003'
			return a(0.45F, 38F, 39F, 0.45F, f);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private int getBaseScaleFrame() {
		int i1;
		for (i1 = k[h.g].length; i1 < 2 || r.g != 1;) {
			return 0;
		}

		switch (h.f) {
		case 1: // '\001'
		default:
			return 0;

		case 0: // '\0'
			return 1;

		case 2: // '\002'
			return i1 - 2;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void l() {
		float f = nj.a(this.h);
		float f2 = oy.a(this.h.e, f);
		if (f2 > 135.0f && f2 < 225.0f) {
			return;
		}
		float f3 = Math.abs((float) (f2 - 45.0f));
		if (f3 > 45.0f) {
			f3 = 45.0f;
		}
		int n = this.h.i;
		int n2 = 0;
		switch (n) {
		case 1: {
			n2 = vk.a(this.getContext(), 18.0f);
			break;
		}
		case 2: {
			n2 = vk.a(this.getContext(), 27.0f);
			break;
		}
		case 3: {
			n2 = vk.a(this.getContext(), 26.0f);
		}
		}
		int n3 = (int) (f3 * (float) n2 / 45.0f);
		if (f2 > 45.0f) {
			nj nj = this.h;
			nj.k -= n3;
			return;
		}
		if (this.h.e) {
			nj nj = this.h;
			nj.j -= n3;
			return;
		}
		nj nj = this.h;
		nj.j = n3 + nj.j;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void m() {
		float f2;
		float f1;
		float f3;
		f2 = 0.0F;
		if (h.i != 3) {
			return;
		}
		float f = nj.a(h);
		f3 = oy.a(h.e, f);
		if (f3 > 70F || f3 < 20F) {
			setAlpha(1.0F);
			return;
		}
		if (f3 > 30F && f3 < 60F) {
			setAlpha(0.0F);
			return;
		}
		if (f3 > 70F || f3 < 60F) {
			f1 = f2;
			if (f3 <= 30F) {
				f1 = f2;
				if (f3 >= 20F) {
					f1 = f3 - 20F;
				}
			}
			setAlpha(1.0F - f1 / 10F);
			return;

		} else {
			f1 = 70F - f3;
		}

	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void n() {
		if (h.i != 1) {
			return;
		}
		float f = Math.abs(oy.a(h.e, nj.a(h)) - 45F);
		int i1;
		if (f < 28F) {
			f = 1.0F;
		} else if (f > 38F) {
			f = 0.0F;
		} else {
			f = (38F - f) / (38F - 28F);
		}
		i1 = (int) (f * 255F);
		b.setTextColor(Color.argb(i1, 255, 255, 255));
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(mt mt) {
		this.m = mt;
		this.s.removeMessages(0);
		this.b(mt);
		if (mt == null) {
			this.a.setBackgroundDrawable(null);
			this.setIcon((Drawable) null);
			this.setText(null);
			this.setTag((Object) null);
		} else {
			mt.a((FanItem) this);
		}
		if (this.h.i == 3) {
			this.setText((CharSequence) "");
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public android.widget.FrameLayout.LayoutParams b(boolean flag) {
		android.widget.FrameLayout.LayoutParams layoutparams = null;

		android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
		if (!flag) {
			layoutparams = layoutparams1;
			if (layoutparams1 == null) {
				layoutparams = new android.widget.FrameLayout.LayoutParams(n,
						-2);
			}
		}

		layoutparams.width = n;
		layoutparams.height = n;
		byte byte0;
		if (h.e) {
			byte0 = 3;
		} else {
			byte0 = 5;
		}
		layoutparams.gravity = byte0 | 0x50;
		layoutparams.topMargin = 0;
		layoutparams.bottomMargin = h.k - i;
		if (h.e) {
			layoutparams.leftMargin = h.j - i;
			layoutparams.rightMargin = 0;
			return layoutparams;
		} else {
			layoutparams.leftMargin = 0;
			layoutparams.rightMargin = -h.j - i;
			return layoutparams;
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void b(Canvas canvas) {
		if (!(m instanceof nn)) {
			super.b(canvas);
		} else {
			if (d) {
				k();
			}
			if (d && tf.b(o)) {
				canvas.drawBitmap(o, null, q, p);
				return;
			}
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public float c(boolean bl) {
		if (bl) {
			return this.e(WatchFanItem.k[this.h.g][n].b);
		}
		int n = this.getBaseScaleFrame();
		return this.e(WatchFanItem.k[this.h.g][n].b);
	}

	public boolean c(float f) {
		if (h == null || h.l == null || h.l.length < 2) {
			return false;
		} else {
			d(oy.b(f));
			m();
			j();
			n();
			return true;
		}
	}

	public boolean g() {
		return !(m instanceof nn);
	}

	public mt getInfo() {
		return this.m;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public Rect getRect() {
		int i1 = h.j;
		int j1 = h.k;
		int k1 = (int) ((float) i * getScaleX());
		int l1 = (int) ((float) i * getScaleY());
		if (h.e) {
			j.set(i1 - k1, r.getHeight() - j1 - l1, i1 + k1,
					(r.getHeight() - j1) + l1);
		} else {
			j.set((r.getWidth() + i1) - k1, r.getHeight() - j1 - l1,
					i1 + r.getWidth() + k1, (r.getHeight() - j1) + l1);
		}
		return j;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void h() {
		if (Fan.getInstance() == null) {
			return;
		}
		Fan fan = Fan.getInstance();
		float f = Fan.getInstance().getHandTrackRatio();
		float f2 = fan.getHandTracker().a(f);
		FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this
				.getLayoutParams();
		layoutParams.topMargin = 0;
		layoutParams.bottomMargin = (int) (f2 * (float) this.h.k - (float) i);
		if (this.h.e) {
			layoutParams.leftMargin = (int) (f2 * (float) this.h.j - (float) i);
			layoutParams.rightMargin = 0;
		} else {
			layoutParams.leftMargin = 0;
			layoutParams.rightMargin = (int) (f2 * (float) (-this.h.j) - (float) i);
		}
		this.setAlpha(WatchFanItem.b((float) f2));
		float f3 = this.c(false) * WatchFanItem.a((float) f2);
		this.setScaleX(f3);
		this.setScaleY(f3);
	}

	public boolean handleMessage(Message message) {
		switch (message.what) {
		default: {
			return false;
		}
		case 0:
			break;
		}
		try {
			this.setLayerType(0, null);
			return false;
		} catch (Exception var2_2) {
			return false;
		}
	}

	void i() {
		if (this.getLayerType() != 0) {
			this.s.sendEmptyMessageDelayed(0, 100);
		}
	}

	protected void j() {
		float f = nj.a(this.h);
		float f2 = this.e(oy.a(this.h.e, f));
		this.setScaleX(f2);
		this.setScaleY(f2);
	}

	protected void k() {
		if (!tf.b(o)) {
			o = BitmapFactory.decodeResource(getResources(),
					R.drawable.iwatch_add_icon);
		}
		if (q == null) {
			q = new Rect(a.getLeft() + (a.getMeasuredWidth() - o.getWidth())
					/ 2, a.getTop() + (a.getMeasuredHeight() - o.getHeight())
					/ 2, a.getLeft() + (a.getMeasuredWidth() + o.getWidth())
					/ 2, a.getTop() + (a.getMeasuredHeight() + o.getHeight())
					/ 2);
		}
	}

	public void onMeasure(int n, int n2) {
		super.onMeasure(n, n2);
		this.setPivotX((float) (this.getMeasuredWidth() / 2));
		this.setPivotY((float) (this.getMeasuredHeight() / 2));
	}
}
