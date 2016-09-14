//zevienin

package com.lazyswipe.tile.booster.ui;

import java.lang.ref.WeakReference;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.ItemSectorBg;
import com.main.mf;
import com.main.ow;
import com.main.ox;
import com.main.oy;
import com.main.ri;
import com.main.rj;
import com.main.rk;
import com.main.tf;
import com.main.vk;

public class BoostingCircular extends FrameLayout implements
		android.os.Handler.Callback {

	private static final String b = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.tile.booster.ui.BoostingCircular.class
					.getSimpleName()).toString();
	private int A;
	protected Fan a;
	private ImageView c;
	private ImageView d;
	private ImageView e;
	private WeakReference f;
	private WeakReference g;
	private WeakReference h;
	private WeakReference i;
	private boolean j;
	private boolean k;
	private int l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private boolean s;
	private boolean t;
	private boolean u;
	private float v;
	private boolean w;
	private Handler x;
	private int y;
	private int z;

	public BoostingCircular(Context context) {
		super(context);
	}

	public BoostingCircular(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	static float a(BoostingCircular boostingcircular, float f1) {
		boostingcircular.v = f1;
		return f1;
	}

	private int a(int i1, float f1) {
		float f2 = 1.0F;
		float f3 = 0.0F;
		if (f1 < 0.0F) {
			f1 = f3;
		}
		if (f1 > 1.0F) {
			f1 = f2;
		}
		return (int) (f1 * 255F) << 24 | 0xffffff & i1;
	}

	public static BoostingCircular a(Context context, View view, Fan fan,
			boolean flag) {
		if (!(view instanceof rk)) {
			return null;
		} else {
			BoostingCircular boostingCircular = (BoostingCircular) LayoutInflater
					.from(context).inflate(0x7f04000c, null);
			boostingCircular.a(view, fan, flag);
			boostingCircular.b();
			return boostingCircular;
		}
	}

	private void a(Canvas canvas, Paint paint, int i1, int j1, int k1, int l1,
			RectF rectf) {
		a(canvas, paint, rectf, i1, j1, 0.1F, 0, 20F, -90, 90);
		a(canvas, paint, rectf, i1, j1, 0.15F, 5, 3F, -80, 50);
		a(canvas, paint, rectf, i1, k1, 0.07F, 0, 6F, -30, 15);
		a(canvas, paint, rectf, i1, j1, 0.12F, 7, 2.0F, -80, 50);
		a(canvas, paint, rectf, i1, j1, 0.12F, 18, 2.0F, -80, 50);
		a(canvas, paint, rectf, i1, k1, 0.08F, 18, 8F, -80, 60);
		a(canvas, paint, rectf, i1, j1, 0.07F, 16, 6F, -60, 18);
		a(canvas, paint, rectf, i1, k1, 0.08F, 5, 10F, -80, 60);
		a(canvas, paint, rectf, i1, k1, 0.12F, 15, 2.5F, -80, 70);
		a(canvas, paint, rectf, i1, k1, 0.12F, 1, 2.5F, -70, 70);
		a(canvas, paint, rectf, i1, l1, 0.12F, 12, 2.5F, -70, 70);
		a(canvas, paint, rectf, i1, k1, 0.12F, 24, 2.0F, -80, 80);
	}

	private void a(Canvas canvas, Paint paint, RectF rectf, int i1, float f1,
			int j1, float f2, int k1, int l1) {
		int i2 = n / 2;
		paint.setColor(a(i1, f1));
		paint.setStrokeWidth(vk.a(getContext(), f2));
		paint.setStyle(android.graphics.Paint.Style.STROKE);
		rectf.set(i2 - j1, i2 - j1, i2 + j1, i2 + j1);
		canvas.drawArc(rectf, k1, l1, false, paint);
		canvas.drawArc(rectf, k1 + 180, l1, false, paint);
	}

	private void a(Canvas canvas, Paint paint, RectF rectf, int i1, int j1,
			float f1, int k1, float f2, int l1, int i2) {
		a(canvas, paint, rectf, j1, f1, i1 + vk.a(getContext(), k1), f2, l1, i2);
	}

	private void a(Canvas canvas, View view) {
		int j1 = o / 2;
		for (int i1 = 0; i1 < 360; i1 += 90) {
			canvas.rotate(i1, j1, j1);
			b(canvas, view);
			canvas.rotate(-i1, j1, j1);
		}

	}

	private void a(View view, Fan fan, boolean flag) {
		f = new WeakReference(view);
		a = fan;
		j = fan.i();
		k = flag;
		m = view.getWidth();
		int i1;
		if (k) {
			i1 = fan.getTileSectorOuterSize() << 1;
		} else {
			i1 = fan.getTabSectorOuterSize() << 1;
		}
		n = i1;
		n = n - vk.a(getContext(), 4.5F);
		l = m << 1;
		o = m / 1;
		p = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
		q = android.view.View.MeasureSpec.makeMeasureSpec(n, 0x40000000);
		if (rj.d() == 2) {
			flag = true;
		} else {
			flag = false;
		}
		u = flag;
		y = (fan.getTileSectorInnerSize() + fan.getTabSectorOuterSize()) / 2;
		z = (fan.getTileSectorInnerSize() + fan.getTileSectorOuterSize()) / 2;
		A = fan.getTabSectorInnerSize();
		if (f()) {
			i1 = l;
		} else {
			i1 = getCircularRadius() * 2;
		}
		r = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
		LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(
				l, l);
		if (j) {
			i1 = 3;
		} else {
			i1 = 5;
		}
		layoutParams.gravity = i1 | 0x50;
		layoutParams.bottomMargin = -m;
		if (j) {
			layoutParams.leftMargin = -m;
		} else {
			layoutParams.rightMargin = -m;
		}
		a.addView(this, layoutParams);
		a.setClipChildren(false);
		if (!u) {
			// break MISSING_BLOCK_LABEL_359;
		}
		d.setLayerType(2, null);
		e.setLayerType(2, null);
		c.setLayerType(2, null);

		rj.a();

		try {
			setLayerType(rj.d(), null);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
		return;
	}

	static void a(BoostingCircular boostingcircular) {
		boostingcircular.o();
	}

	static boolean a(BoostingCircular boostingcircular, boolean flag) {
		boostingcircular.w = flag;
		return flag;
	}

	private void b() {
		g();
		h();
	}

	private void b(Canvas canvas, View view) {
		float f1 = 0.0F;
		int i1 = canvas.save();
		int j1 = view.getWidth();
		int k1 = view.getHeight();
		float f2 = (float) (o / 2) / (float) j1;
		canvas.scale(f2, f2, 0.0F, 0.0F);
		if (j) {
			f1 = j1;
		}
		canvas.translate(f1, j1 + -k1);
		((rk) view).a(canvas);
		canvas.restoreToCount(i1);
	}

	static void b(BoostingCircular boostingcircular) {
		boostingcircular.c();
	}

	private void c() {
		View view = getBaseBgView();
		if (view != null) {
			view.setVisibility(0);
		}
		((View) f.get()).setVisibility(0);
	}

	static boolean c(BoostingCircular boostingcircular) {
		return boostingcircular.u;
	}

	static ImageView d(BoostingCircular boostingcircular) {
		return boostingcircular.d;
	}

	private void d() {
		Object obj = e();
		c.setImageDrawable(((Drawable) (obj)));
		obj = getBaseBgView();
		if (obj != null) {
			((View) (obj)).clearAnimation();
			((View) (obj)).setVisibility(8);
		}
		obj = (View) f.get();
		((View) (obj)).clearAnimation();
		((View) (obj)).setVisibility(8);
	}

	private Drawable e() {
		if (!f()) {
			// break MISSING_BLOCK_LABEL_159;
		}
		Object obj1;
		Fan fan;
		obj1 = getContext();
		fan = a;
		Object obj;
		int i1;
		if (ItemSectorBg.a) {
			obj = "BIG_SECTOR_OUTER";
		} else {
			obj = "SMALL_SECTOR";
		}
		try {
			obj1 = ow.a(((Context) (obj1)), fan, ((String) (obj)));
			if (tf.b(((Bitmap) (obj1)))) {
				Bitmap bitmap = Bitmap.createBitmap(l, l,
						android.graphics.Bitmap.Config.ARGB_8888);
				Canvas canvas = new Canvas(bitmap);
				if (j) {
					obj = new Rect(m, 0, m * 2, m);
				} else {
					obj = new Rect(0, 0, m, m);
				}
				canvas.drawBitmap(((Bitmap) (obj1)), null, ((Rect) (obj)), null);
				i = new WeakReference(bitmap);
				tf.a(((Bitmap) (obj1)));
				return new BitmapDrawable(getContext().getResources(), bitmap);
			}
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
		}
		obj = getResources().getDrawable(0x7f020010);
		if (obj instanceof GradientDrawable) {
			if (k) {
				i1 = 0x7f010013;
			} else {
				i1 = 0x7f010015;
			}
			if (ox.f() && k) {
				i1 = ow.a[0];
			} else {
				i1 = ox.a(i1);
			}
			((GradientDrawable) obj).setColor(i1);
			return ((Drawable) (obj));
		} else {
			return ((Drawable) (obj));
		}
	}

	static ImageView e(BoostingCircular boostingcircular) {
		return boostingcircular.e;
	}

	private boolean f() {
		return k && u && ox.f();
	}

	static boolean f(BoostingCircular boostingcircular) {
		return boostingcircular.w;
	}

	static float g(BoostingCircular boostingcircular) {
		return boostingcircular.v;
	}

	private void g() {
		s = false;
		Bitmap bitmap = i();
		if (tf.b(bitmap)) {
			x.obtainMessage(0, bitmap).sendToTarget();
			return;
		}
		try {
			x.sendEmptyMessage(2);
			return;
		} catch (Throwable throwable) {
			x.sendEmptyMessage(2);
		}
		return;
	}

	static ImageView h(BoostingCircular boostingcircular) {
		return boostingcircular.c;
	}

	private void h() {
		t = false;
		Bitmap bitmap = j();
		if (tf.b(bitmap)) {
			x.obtainMessage(1, bitmap).sendToTarget();
			return;
		}
		try {
			x.sendEmptyMessage(3);
			return;
		} catch (Throwable throwable) {
			Log.e(b, "prepareFastImage failed.", throwable);
		}
		x.sendEmptyMessage(3);
		return;
	}

	private Bitmap i() {
		View view = (View) f.get();
		if (view == null) {
			return null;
		} else {
			Bitmap bitmap = Bitmap.createBitmap(o, o,
					android.graphics.Bitmap.Config.ARGB_8888);
			a(new Canvas(bitmap), view);
			return bitmap;
		}
	}

	static void i(BoostingCircular boostingcircular) {
		boostingcircular.m();
	}

	private Bitmap j() {
		if (k) {
			return k();
		} else {
			return l();
		}
	}

	private Bitmap k() {
		System.currentTimeMillis();
		Bitmap bitmap = Bitmap.createBitmap(n, n,
				android.graphics.Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		Paint paint = new Paint();
		int i1 = ox.a(0x7f01001b);
		int j1 = ox.a(0x7f01001c);
		RectF rectf = new RectF();
		a(canvas, paint, y, i1, j1, -1, rectf);
		if (ItemSectorBg.a) {
			a(canvas, paint, z, i1, j1, -1, rectf);
		} else if (oy.a()) {
			a(canvas, paint, z, i1, j1, -1, rectf);
			a(canvas, paint, (y + z) / 2, i1, j1, -1, rectf);
			return bitmap;
		}
		return bitmap;
	}

	private Bitmap l() {
		System.currentTimeMillis();
		Bitmap bitmap = Bitmap.createBitmap(n, n,
				android.graphics.Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		Paint paint = new Paint();
		int i1 = ox.a(0x7f010016);
		if (i1 == 0) {
			i1 = ox.a(0x7f010016);
		}
		int k1 = ox.a(0x7f010019);
		int j1 = k1;
		if (k1 == 0) {
			j1 = ox.a(0x7f010017);
		}
		RectF rectf = new RectF();
		k1 = vk.a(getContext(), n / 2 - A);
		int j2 = A;
		int k2 = (n / 2 - A) / 2;
		int i2 = vk.a(getContext(), 20F);
		a(canvas, paint, rectf, j1, 0.05F, k2 + j2, k1, -90, 90);
		for (int l1 = A + i2; l1 < n / 2 - i2; l1 += i2) {
			a(canvas, paint, rectf, i1, 0.025F, l1, vk.a(getContext(), 8F),
					-90, 90);
			a(canvas, paint, rectf, j1, 0.025F, l1 + vk.a(getContext(), 10F),
					vk.a(getContext(), 8F), -90, 90);
		}

		return bitmap;
	}

	private void m() {
		s = false;
		t = false;
		x.removeMessages(0);
		x.removeMessages(1);
		x.removeMessages(2);
		x.removeMessages(3);
		post(new Runnable() {

			final BoostingCircular a;

			public void run() {
				BoostingCircular.b(a);
				a.a();
			}

			{
				a = BoostingCircular.this;
				// super();
			}
		});
	}

	private void n() {
		if (!s || !t) {
			return;
		}
		d();
		float f1;
		final ValueAnimator valueanimator;
		ValueAnimator valueanimator1;
		final ImageView imageView = null;
		AnimatorSet animatorset;
		if (k ^ j) {
			f1 = -getTargetDegreeDiff();
		} else {
			f1 = getTargetDegreeDiff();
		}
		valueanimator = ValueAnimator.ofFloat(new float[] { 1.0F, f1 });
		valueanimator.setInterpolator(new TimeInterpolator() {

			final BoostingCircular a;

			public float getInterpolation(float f2) {
				if (f2 < 0.09090909F) {
					BoostingCircular.a(a, true);
					return f2 * f2 * 121F;
				} else {
					BoostingCircular.a(a, false);
					return 1.0F;
				}
			}

			{
				a = BoostingCircular.this;
				// super();
			}
		});
		valueanimator
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final BoostingCircular a;
					View boostingCircular = (BoostingCircular.this.u ? BoostingCircular.this.d
							: BoostingCircular.this);

					public void onAnimationUpdate(ValueAnimator valueanimator2) {
						float f = ((Float) valueanimator.getAnimatedValue())
								.floatValue();
						View boostingCircular = BoostingCircular.this.u ? BoostingCircular.this.d
								: BoostingCircular.this;
						float f2 = f + boostingCircular.getRotation();
						if (BoostingCircular.this.u) {
							BoostingCircular.this.d.setRotation(f2);
							BoostingCircular.this.e.setRotation(f2);
						} else {
							BoostingCircular.this.setRotation(f2);
						}
						if (BoostingCircular.this.w) {
							BoostingCircular.this.v = f2;
						}
					}

					{
						a = BoostingCircular.this;
						// super();
					}
				});
		valueanimator.addListener(new AnimatorListenerAdapter() {

			final BoostingCircular a;

			public void onAnimationEnd(Animator animator) {
				View boostingCircular = BoostingCircular.this.u ? BoostingCircular.this.d
						: BoostingCircular.this;
				int n = 90 * ((int) (boostingCircular.getRotation() + 250.0f * BoostingCircular.this.v / 250.0f) / 90);
				float f = boostingCircular.getRotation();
				float[] arrf = new float[] { f, n };
				ValueAnimator valueAnimator = ValueAnimator
						.ofFloat((float[]) arrf);
				valueAnimator
						.setInterpolator((TimeInterpolator) new DecelerateInterpolator(
								2.0f));
				valueAnimator
						.addUpdateListener((ValueAnimator.AnimatorUpdateListener) new ValueAnimator.AnimatorUpdateListener() {

							public void onAnimationUpdate(
									ValueAnimator valueAnimator) {
								float f = ((Float) valueAnimator
										.getAnimatedValue()).floatValue();
								if (BoostingCircular.this.u) {
									BoostingCircular.this.d.setRotation(f);
									BoostingCircular.this.e.setRotation(f);
									return;
								}
								BoostingCircular.this.setRotation(f);
							}
						});
				valueAnimator.setDuration(250);
				valueAnimator.start();
			}

			{
				a = BoostingCircular.this;
				// super();
			}
		});
		valueanimator.setDuration(2750L);
		valueanimator1 = ValueAnimator.ofFloat(new float[] { 1.0F,
				getTargetScale() });
		valueanimator1.setInterpolator(new ri());
		valueanimator1.setDuration(3000L);
		valueanimator1
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final BoostingCircular a;

					public void onAnimationUpdate(ValueAnimator valueanimator2) {
						float f2 = ((Float) valueanimator2.getAnimatedValue())
								.floatValue();
						if (BoostingCircular.c(a)) {
							BoostingCircular.d(a).setScaleX(f2);
							BoostingCircular.d(a).setScaleY(f2);
							BoostingCircular.e(a).setScaleX(f2);
							BoostingCircular.e(a).setScaleY(f2);
							BoostingCircular.h(a).setScaleX(f2);
							BoostingCircular.h(a).setScaleY(f2);
							return;
						} else {
							a.setScaleX(f2);
							a.setScaleY(f2);
							return;
						}
					}

					{
						a = BoostingCircular.this;
						// super();
					}
				});
		animatorset = new AnimatorSet();
		animatorset
				.playTogether(new Animator[] { valueanimator, valueanimator1 });
		animatorset.addListener(new AnimatorListenerAdapter() {

			final BoostingCircular a;

			public void onAnimationEnd(Animator animator) {
				BoostingCircular.i(a);
			}

			{
				a = BoostingCircular.this;
				// super();
			}
		});
		animatorset.start();
		postDelayed(new Runnable() {

			final BoostingCircular a;

			public void run() {
				ViewPropertyAnimator viewpropertyanimator = BoostingCircular
						.d(a).animate().alpha(0.0F).setDuration(250L);
				vk.a(viewpropertyanimator, new Runnable() {

					public void run() {
						BoostingCircular.d(a).setVisibility(8);
					}

				});
				viewpropertyanimator.start();
				BoostingCircular.e(a).animate().alpha(1.0F).setDuration(250L)
						.start();
			}

			{
				a = BoostingCircular.this;

			}
		}, 100L);
		postDelayed(new Runnable() {

			final BoostingCircular a;

			public void run() {
				BoostingCircular.d(a).setVisibility(0);
				BoostingCircular.d(a).animate().alpha(1.0F).setDuration(250L)
						.start();
				BoostingCircular.e(a).animate().alpha(0.0F).setDuration(250L)
						.start();
			}

			{
				a = BoostingCircular.this;

			}
		}, 2750L);
	}

	private void o() {
		a.setClipChildren(true);
		if (u) {
			c.setLayerType(0, null);
			d.setLayerType(0, null);
			e.setLayerType(0, null);
		} else {
			setLayerType(0, null);
		}
		c.setImageBitmap(null);
		d.setImageBitmap(null);
		e.setImageBitmap(null);
		if (g != null) {
			tf.a((Bitmap) g.get());
			g.clear();
		}
		if (h != null) {
			tf.a((Bitmap) h.get());
			h.clear();
		}
		if (i != null) {
			tf.a((Bitmap) i.get());
			i.clear();
		}
	}

	public void a() {
		try {
			post(new Runnable() {

				final BoostingCircular a;

				public void run() {
					BoostingCircular.a(a);
					a.a.removeView(a);
					rj.a(a);
				}

				{
					a = BoostingCircular.this;

				}
			});
			return;
		} catch (Exception exception) {
			return;
		}
	}

	protected void dispatchDraw(Canvas canvas) {
		try {
			super.dispatchDraw(canvas);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	protected View getBaseBgView() {
		if (k) {
			return a.getItemSectorBg();
		} else {
			return a.getTabSectorBg();
		}
	}

	protected int getCircularRadius() {
		if (!oy.a()) {
			if (k) {
				return mf.a(a);
			} else {
				return a.getTabSectorOuterSize();
			}
		}
		if (k) {
			return a.getTileSectorOuterSize();
		} else {
			return a.getTabSectorOuterSize();
		}
	}

	protected int getTargetDegreeDiff() {
		return !k ? 45 : 53;
	}

	protected float getTargetScale() {
		return !k ? 1.2F : 0.6F;
	}

	public boolean handleMessage(Message message) {
		// message.what;
		// JVM INSTR tableswitch 0 3: default 36
		// 0 38
		// 1 78
		// 2 118
		// 3 118;
		// goto _L1 _L2 _L3 _L4 _L4
		Bitmap bitmap = null;
		switch (message.what) {
		default:
			return false;
		case 0:

			bitmap = (Bitmap) message.obj;
			h = new WeakReference(bitmap);
			d.setImageBitmap(bitmap);
			s = true;
			n();
			break;
		case 1:
			bitmap = (Bitmap) message.obj;
			g = new WeakReference(bitmap);
			e.setImageBitmap(bitmap);
			t = true;
			n();
			break;
		case 2:
			m();
			return false;

		case 3:
			m();
			return false;
		}
		return false;

	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		x = new Handler(this);
		d = (ImageView) findViewById(0x7f0c003e);
		e = (ImageView) findViewById(0x7f0c003f);
		c = (ImageView) findViewById(0x7f0c003d);
		d.setAlpha(1.0F);
		e.setAlpha(0.0F);
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1) {
		super.onLayout(flag, i1, j1, k1, l1);
		c.layout((l - c.getMeasuredWidth()) / 2,
				(l - c.getMeasuredWidth()) / 2, (l + c.getMeasuredWidth()) / 2,
				(l + c.getMeasuredWidth()) / 2);
		e.layout((l - e.getMeasuredWidth()) / 2,
				(l - e.getMeasuredWidth()) / 2, (l + e.getMeasuredWidth()) / 2,
				(l + e.getMeasuredWidth()) / 2);
		d.layout((l - d.getMeasuredWidth()) / 2,
				(l - d.getMeasuredWidth()) / 2, (l + d.getMeasuredWidth()) / 2,
				(l + d.getMeasuredWidth()) / 2);
	}

	protected void onMeasure(int i1, int j1) {
		super.onMeasure(i1, j1);
		setMeasuredDimension(l, l);
		d.measure(p, p);
		e.measure(q, q);
		c.measure(r, r);
	}

}
