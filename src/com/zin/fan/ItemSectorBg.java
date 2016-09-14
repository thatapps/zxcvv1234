//zevienin

package com.lazyswipe.fan;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.features.guide.NewGuide;
import com.main.ox;
import com.main.tf;
import com.main.to;

// Referenced classes of package com.lazyswipe.fan:
//            Fan

public class ItemSectorBg extends ImageView {

	public static boolean a = false;
	private static int d = -1;
	private Fan b;
	private TransitionDrawable c;
	private Handler e = new Handler() {

		ItemSectorBg a = ItemSectorBg.this;

		public void handleMessage(Message message) {
			// message.what;
			// JVM INSTR tableswitch 0 1: default 28
			// 0 29
			// 1 62;
			// goto _L1 _L2 _L3

			switch (message.what) {

			default:
				return;
			case 0:
				if (a.getLayerType() != a.getSuggestLayerType()) {
					a.setLayerType(a.getSuggestLayerType(), null);
					return;
				}
				return;
			case 1:
				if (a.getLayerType() != 0) {
					a.setLayerType(0, null);
				}
				a.e();

			}

			{
				a = ItemSectorBg.this;
				// super();
			}
		}

	};

	public ItemSectorBg(Context context) {
		super(context);
	}

	public ItemSectorBg(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	public ItemSectorBg(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
	}

	public static boolean d() {
		return android.os.Build.VERSION.SDK_INT < 16 || to.g();
	}

	public void a() {
		if (c != null) {
			c.resetTransition();
		}
		a = false;
	}

	public void a(int i) {
		if (c != null) {
			c.startTransition(i);
		}
		a = true;
	}

	void b() {
		e.removeMessages(1);
		e.sendEmptyMessageDelayed(0, 200L);
	}

	public void b(int i) {
		if (c != null) {
			c.reverseTransition(i);
		}
		a = false;
	}

	void c() {
		e.removeMessages(0);
		e.sendEmptyMessageDelayed(1, 200L);
	}

	void e() {
		if (getBackground() instanceof BitmapDrawable) {
			tf.a(((BitmapDrawable) getBackground()).getBitmap());
		}
	}

	public void f() {
		float f1 = b.getHandTrackRatio();
		setScaleX(f1);
		setScaleY(f1);
	}

	public void g() {
		b();
	}

	int getSuggestLayerType() {
		if (d == -1) {
			int i;
			if (d()) {
				i = 1;
			} else {
				i = 2;
			}
			d = i;
		}
		return d;
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
	}

	protected void onMeasure(int i, int j) {
		super.onMeasure(i, j);
		float f1;
		if (b.i()) {
			f1 = 0.0F;
		} else {
			f1 = getMeasuredWidth();
		}
		setPivotX(f1);
		setPivotY(getMeasuredHeight());
	}

	void setDirection(boolean bl) {
		try {
			Drawable[] arrdrawable = new Drawable[2];
			ox ox1 = ox.d();
			arrdrawable[0] = ox1.b(this.getContext(), this.b);
			arrdrawable[1] = ox1.a(this.getContext(), this.b);
			this.c = new TransitionDrawable(arrdrawable);
			if (bl) {
				this.c.setLayerInset(
						0,
						0,
						arrdrawable[1].getIntrinsicHeight()
								- arrdrawable[0].getIntrinsicHeight(),
						arrdrawable[1].getIntrinsicWidth()
								- arrdrawable[0].getIntrinsicWidth(), 0);
			} else {
				this.c.setLayerInset(
						0,
						arrdrawable[1].getIntrinsicWidth()
								- arrdrawable[0].getIntrinsicWidth(),
						arrdrawable[1].getIntrinsicHeight()
								- arrdrawable[0].getIntrinsicHeight(), 0, 0);
			}
			this.c.setCrossFadeEnabled(true);
			int n = arrdrawable[1].getIntrinsicWidth();
			ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
			if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
				this.setLayoutParams((ViewGroup.LayoutParams) new FrameLayout.LayoutParams(
						n, -2));
			} else if (n > this.getContext().getResources().getDisplayMetrics().widthPixels) {
				((FrameLayout.LayoutParams) layoutParams).width = n;
			}
			FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
			int n2 = bl ? 3 : 5;
			layoutParams2.gravity = n2 | 80;
			this.setBackgroundDrawable((Drawable) this.c);
			int n3 = NewGuide.k() ? 4 : 0;
			this.setVisibility(n3);
			return;
		} catch (Throwable var2_9) {
			Log.w((String) "Swipe.ItemSectorBg",
					(String) "Failed to set direction of item sector background",
					(Throwable) var2_9);
			return;
		}
	}

	void setFan(Fan fan) {
		b = fan;
	}

}
