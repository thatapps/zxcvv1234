//zevienin

package com.lazyswipe.fan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.LevelListDrawable;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.SwipeApplication;
import com.main.lm;
import com.main.mg;
import com.main.mi;

// Referenced classes of package com.lazyswipe.fan:
//            Fan, TabSectorBg, TabSector

public class DeleteZone extends FrameLayout {

	private ImageView a;
	private LevelListDrawable b;
	private ImageView c;
	private boolean d;
	private boolean e;
	private int f;
	private int g;
	private mg h;
	private int i;
	private Runnable j = new Runnable() {

		final DeleteZone a;

		public void run() {
			if (DeleteZone.b(a)) {
				if (DeleteZone.c(a) >= 0 && DeleteZone.c(a) < 3) {
					DeleteZone.d(a).setLevel(DeleteZone.c(a));
					if (DeleteZone.c(a) < 2) {
						DeleteZone.e(a);
						a.postDelayed(this, 50L);
					}
				}
			} else if (DeleteZone.c(a) >= 0 && DeleteZone.c(a) < 3) {
				DeleteZone.d(a).setLevel(DeleteZone.c(a));
				if (DeleteZone.c(a) > 0) {
					DeleteZone.f(a);
					a.postDelayed(this, 50L);
					return;
				}
			}
		}

		{
			a = DeleteZone.this;
			// super();
		}
	};

	public DeleteZone(Context context) {
		super(context);
	}

	public DeleteZone(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	static ImageView a(DeleteZone deletezone) {
		return deletezone.a;
	}

	public static DeleteZone a(Fan fan) {
		DeleteZone deletezone = (DeleteZone) LayoutInflater.from(
				SwipeApplication.e()).inflate(0x7f040016, null);
		deletezone.c(fan);
		if (fan.getTabSectorBg() instanceof TabSectorBg) {
			((TabSectorBg) fan.getTabSectorBg())
					.setTripleFanDrawableVisible(false);
		}
		return deletezone;
	}

	static boolean b(DeleteZone deletezone) {
		return deletezone.d;
	}

	static int c(DeleteZone deletezone) {
		return deletezone.i;
	}

	private void c(Fan fan) {
		float f1;
		int l;
		f1 = 0.0F;
		e = fan.i();
		f = fan.getTabSectorOuterSize();
		g = android.view.View.MeasureSpec.makeMeasureSpec(f, 0x40000000);
		h = fan.getStartPosition();
		LayoutParams params = new android.widget.FrameLayout.LayoutParams(-2,
				-2);
		int k;
		int i1;
		if (e) {
			k = 3;
		} else {
			k = 5;
		}
		params.gravity = k | 0x50;
		k = getResources().getDimensionPixelSize(0x7f0b0030);
		i1 = getResources().getDimensionPixelSize(0x7f0b002f);
		params.topMargin = 0;
		params.bottomMargin = i1;
		if (e) {
			params.leftMargin = k;
		} else {
			params.rightMargin = k;
		}
		fan.addView(this, ((android.view.ViewGroup.LayoutParams) (params)));
		c.setImageDrawable(new mi(0, f, 0xffe34a4a, e, null));
		ImageView imageView = c;
		if (!e) {

			l = f;
			f1 = l;

		}

		try {
			((imageView)).setPivotX(f1);
			c.setPivotY(f);
			c.setScaleX(0.0F);
			c.setScaleY(0.0F);
			a.setScaleX(0.0F);
			a.setScaleY(0.0F);
			if (fan.getTabSector() instanceof TabSector) {
				((TabSector) fan.getTabSector())
						.b(new AnimatorListenerAdapter() {

							final DeleteZone a;

							public void onAnimationEnd(Animator animator) {
								DeleteZone.a(a).animate().scaleX(1.0F)
										.scaleY(1.0F).setDuration(75L).start();
							}

							{
								a = DeleteZone.this;
								// super();
							}
						});
			}
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}

	}

	static LevelListDrawable d(DeleteZone deletezone) {
		return deletezone.b;
	}

	static int e(DeleteZone deletezone) {
		int k = deletezone.i;
		deletezone.i = k + 1;
		return k;
	}

	static int f(DeleteZone deletezone) {
		int k = deletezone.i;
		deletezone.i = k - 1;
		return k;
	}

	public void a() {
		if (!d) {
			d = true;
			post(j);
			c.animate().scaleX(1.0F).scaleY(1.0F).setDuration(80L).start();
		}
	}

	public void a(DragEvent dragevent, lm lm1) {
		if (dragevent == null || !(getParent() instanceof Fan)) {
			return;
		}
		if (lm1 != null) {
			lm1.a();
		}
		postDelayed(new Runnable() {

			final DeleteZone a;

			public void run() {
				a.b();
			}

			{
				a = DeleteZone.this;
				// super();
			}
		}, 150L);
		postDelayed(new Runnable() {

			final DeleteZone a;

			public void run() {
				a.b((Fan) a.getParent());
			}

			{
				a = DeleteZone.this;
				// super();
			}
		}, 300L);
	}

	public void b() {
		if (d) {
			d = false;
			post(j);
			c.animate().scaleX(0.0F).scaleY(0.0F).setDuration(80L).start();
		}
	}

	public void b(final Fan fan) {
		try {
			a.animate().scaleX(1.0F).scaleY(1.0F).setDuration(75L)
					.setListener(new AnimatorListenerAdapter() {

						final Fan a;
						final DeleteZone b;

						public void onAnimationEnd(Animator animator) {
							if (a == null) {
								return;
							}
							if (a.getTabSector() instanceof TabSector) {
								((TabSector) a.getTabSector()).a((TabSector) a
										.getTabSector());
							}
							if (a.getTabSectorBg() instanceof TabSectorBg) {
								((TabSectorBg) a.getTabSectorBg())
										.setTripleFanDrawableVisible(true);
							}
							b.post(new Runnable() {

								public void run() {
									a.removeView(b);
								}

							});
						}

						{
							b = DeleteZone.this;
							a = fan;
							// super();
						}
					}).start();
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		d = false;
		a = (ImageView) findViewById(0x7f0c004d);
		b = (LevelListDrawable) getResources().getDrawable(0x7f020021);
		a.setImageDrawable(b);
		c = (ImageView) findViewById(0x7f0c004c);
	}

	protected void onLayout(boolean flag, int k, int l, int i1, int j1) {
		super.onLayout(flag, k, l, i1, j1);
		k = (h.b - a.getMeasuredHeight() / 2) + 1;
		if (e) {
			l = h.a - a.getMeasuredWidth() / 2 - 3;
			a.layout(l, getMeasuredHeight() - a.getMeasuredHeight() - k,
					a.getMeasuredWidth() + l, getMeasuredHeight() - k);
			return;
		} else {
			l = -h.a - a.getMeasuredWidth() / 2 - 3;
			a.layout(getMeasuredWidth() - l - a.getMeasuredWidth(),
					getMeasuredHeight() - a.getMeasuredHeight() - k,
					getMeasuredWidth() - l, getMeasuredHeight() - k);
			return;
		}
	}

	protected void onMeasure(int k, int l) {
		super.onMeasure(k, l);
		if (f > 0) {
			setMeasuredDimension(f, f);
			c.measure(g, g);
		}
	}
}
