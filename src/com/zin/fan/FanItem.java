//zevienin

package com.lazyswipe.fan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.main.jq;
import com.main.ls;
import com.main.lu;
import com.main.lv;
import com.main.md;
import com.main.mg;
import com.main.mn;
import com.main.mr;
import com.main.mt;
import com.main.mx;
import com.main.na;
import com.main.oy;
import com.main.pk;
import com.main.rk;
import com.main.tf;
import com.main.uc;
import com.main.vk;
import com.main.wx;

// Referenced classes of package com.lazyswipe.fan:
//            Fan, FanLayer

public class FanItem extends RelativeLayout implements
		android.view.View.OnLongClickListener, rk {

	private static final float L[] = { 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
			1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F,
			0.0F, 1.0F, 0.0F };
	private static final ColorFilter O = new ColorMatrixColorFilter(L);
	public static final uc g = new uc();
	private static final String h = (new StringBuilder()).append("Swipe.")
			.append(com.lazyswipe.fan.FanItem.class.getSimpleName()).toString();
	private static Bitmap m;
	private int A;
	private boolean B;
	private lv C;
	private float D;
	private final int E;
	private final int F;
	private boolean G;
	private int H;
	private Point I;
	private RectF J;
	private Path K;
	private boolean M;
	private boolean N;
	private ColorFilter P;
	public ImageView a;
	public TextView b;
	public final int c;
	public boolean d;
	public mg e;
	public mg f;
	public ImageView i;
	private final int j;
	private final int k[];
	private boolean l;
	private final Rect n;
	private final Rect o;
	private final Paint p;
	private int q;
	private int r;
	private int s;
	private int t;
	private ShapeDrawable u;
	private wx v;
	private android.view.View.OnLongClickListener w;
	private android.view.View.OnClickListener x;
	private int y;
	private int z;
	float fff;

	public FanItem(Context context) {
		this(context, null);
	}

	public FanItem(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		boolean flag = false;

		k = new int[2];
		d = false;
		l = false;
		n = new Rect();
		o = new Rect();
		p = new Paint(7);
		B = false;
		D = 0.9F;
		I = new Point();
		M = false;
		N = false;
		c = context.getResources().getDimensionPixelSize(0x7f0b0021);
		j = vk.a(context, 12F);
		E = getResources().getDimensionPixelSize(0x7f0b0023);
		F = E >> 1;
		if (Fan.getInstance() != null) {
			flag = Fan.getInstance().i();
		}
		G = flag;
	}

	public static float a(float f1) {
		return f1;
	}

	static float a(FanItem fanitem, float f1) {
		fanitem.D = f1;
		return f1;
	}

	public static Drawable a(Bitmap bitmap) {
		if (tf.b(bitmap)) {
			Bitmap bitmap1 = bitmap;
			if (oy.a()) {
				bitmap1 = oy.a(bitmap);
			}
			return new BitmapDrawable(SwipeApplication.c(), bitmap1);
		} else {
			return null;
		}
	}

	public static Drawable a(Drawable drawable) {
		Drawable drawable1 = drawable;
		try {
			if (oy.a()) {
				drawable1 = oy.a(drawable);
			}
		} catch (Exception exception) {
			return drawable;
		}
		return drawable1;
	}

	public static android.view.View.OnLongClickListener a(FanItem fanitem) {
		return fanitem.w;
	}

	private void a(float f1, boolean flag) {
		if (getLayoutParams() == null || e == null || f == null) {
			return;
		}
		int i1 = (int) ((float) e.a + (float) (f.a - e.a) * f1);
		int j1 = (int) ((float) e.b + (float) (f.b - e.b) * f1);
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
		if (flag) {
			layoutparams.rightMargin = 0;
			layoutparams.leftMargin = i1 - F;
		} else {
			layoutparams.leftMargin = 0;
			layoutparams.rightMargin = -i1 - F;
		}
		layoutparams.bottomMargin = j1 - F;
		b(f1);
		f1 = a(f1);
		setScaleX(f1);
		setScaleY(f1);
	}

	private void a(Canvas canvas, mx mx1) {
		a(((mt) (mx1)), canvas);
	}

	private void a(Drawable drawable, int i1, int j1) {
		float f1 = 0;
		float f2;

		f2 = drawable.getIntrinsicWidth();
		float f3 = drawable.getIntrinsicHeight();
		if (f2 < 0.0F) {
			Rect rect = drawable.getBounds();
			f2 = ((Rect) (rect)).right - ((Rect) (rect)).left;
			f1 = ((Rect) (rect)).bottom - ((Rect) (rect)).top;
			f1 = f3;

		}

		if (f2 <= 0.0F || f1 <= 0.0F) {
			k[0] = 0;
			k[1] = 0;
			return;
		} else {
			float f4 = Math.max(f2 / (float) i1, f1 / (float) j1);
			k[0] = (int) Math.max((float) i1 - f2 / f4, 0.0F) / 2;
			k[1] = (int) Math.max((float) j1 - f1 / f4, 0.0F) / 2;
			return;
		}
	}

	static void a(FanItem fanitem, float f1, boolean flag) {
		fanitem.a(f1, flag);
	}

	private void a(mt mt1, Canvas canvas) {
		int i1 = 0;
		int k1 = 0;
		if (!(mt1 instanceof pk) && !(mt1 instanceof na)) {

			int j1 = vk.a(getContext(), 12F);
			int l1 = Math.max(a.getRight() - k[1] - j1, 0);
			int i2 = Math.max((a.getTop() + k[1]) - j1 / 3, 0);
			u.setBounds(l1, i2, l1 + j1, j1 + i2);
			u.draw(canvas);
			return;

		} else {

			try {
				k1 = ((pk) mt1).m();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e(h, "Failed to load the notification count.");
				// continue; /* Loop/switch isn't completed */
			}
			i1 = k1;
		}

		if (i1 == 0) {
			v.a("...");
		} else {
			String str;
			wx wx1 = v;
			if (i1 >= 100) {
				str = "99+";
			} else {
				str = String.valueOf(i1);
			}
			wx1.a(str);
		}
		v.a(canvas, a.getLeft(), a.getTop(), a.getRight(), a.getBottom());
		return;

	}

	public static boolean a(FanItem fanitem, boolean flag) {
		fanitem.B = flag;
		return flag;
	}

	public static float b(float f1) {
		if (f1 < 0.0F) {
			return 0.0F;
		}
		if ((double) f1 < 0.75D) {
			return 1.333F * f1;
		} else {
			return 1.0F;
		}
	}

	private void c(Canvas canvas) {
		if (J == null) {
			J = new RectF();
		}
		J.set(0.0F, 0.0F, a.getMeasuredWidth(), a.getMeasuredHeight());
		J.offset(a.getLeft(), a.getTop());
		if (getLayerType() == 1) {
			if (K == null) {
				K = new Path();
			}
			K.reset();
			K.addCircle(J.centerX(), J.centerY(), (int) J.width() >> 1,
					android.graphics.Path.Direction.CCW);
			K.close();
			canvas.clipPath(K);
			return;
		} else {
			canvas.clipRect(J);
			return;
		}
	}

	public static void d() {
		tf.a(m);
	}

	private void i() {
		int i1 = Math.max((a.getRight() + k[0]) - j, 0);
		int j1 = Math.max((a.getTop() + k[1]) - j, 0);
		i.layout(i1, j1, i.getMeasuredWidth() + i1, i.getMeasuredHeight() + j1);
	}

	private void j() {
		if (i == null) {
			i = new ImageView(getContext());
			i.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(
					-2, -2));
			i.setImageResource(0x7f020002);
		}
		removeView(i);
		addView(i);
	}

	private void k() {
		if (i != null) {
			removeView(i);
		}
	}

	private void l() {
		if (C == null) {
			C = new lv(this);
		}
		postDelayed(C, 90L);
	}

	private void m() {
		if (C != null) {
			removeCallbacks(C);
		}
	}

	protected android.widget.FrameLayout.LayoutParams a(int i1, mg mg1,
			boolean flag) {
		android.widget.FrameLayout.LayoutParams layoutparams = null;

		android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
		if (!flag) {
			layoutparams = layoutparams1;
			if (layoutparams1 != null) {

			}
		}
		layoutparams = new android.widget.FrameLayout.LayoutParams(E, -2);

		H = i1;
		if (Fan.getInstance() == null) {
			return layoutparams;
		}
		flag = Fan.getInstance().i();
		layoutparams.width = E;
		layoutparams.height = E;
		if (flag) {
			i1 = SwipeApplication.a;
		} else {
			i1 = SwipeApplication.b;
		}
		layoutparams.gravity = i1 | 0x50;
		layoutparams.topMargin = 0;
		layoutparams.bottomMargin = mg1.b - F;
		if (flag) {
			layoutparams.rightMargin = 0;
			layoutparams.leftMargin = mg1.a - F;
			return layoutparams;
		} else {
			layoutparams.leftMargin = 0;
			layoutparams.rightMargin = -mg1.a - F;
			return layoutparams;
		}
	}

	public void a(int i1, CharSequence charsequence) {
		setText(charsequence);
		setIcon(i1);
	}

	public void a(Drawable drawable, boolean flag) {
		if (drawable == null) {
			a.setVisibility(8);
			return;
		}
		if (a.getVisibility() != 0) {
			a.setVisibility(0);
		}
		Object obj = drawable;
		if (drawable instanceof BitmapDrawable) {
			obj = new BitmapDrawable(getResources(),
					((BitmapDrawable) drawable).getBitmap());
		}
		int i1 = c;
		if (flag) {
			i1 = (int) (b.getTextSize()
					+ (float) b.getCompoundDrawablePadding() + (float) c);
			a.getLayoutParams().height = i1;
			b.setVisibility(8);
		}
		a.setImageDrawable(((Drawable) (obj)));
		a(((Drawable) (obj)), c, i1);
	}

	public void a(android.view.View.OnClickListener onclicklistener,
			boolean flag) {
		x = onclicklistener;
		if (flag) {
			super.setOnClickListener(null);
			a.setOnClickListener(onclicklistener);
			b.setOnClickListener(onclicklistener);
			a.setClickable(true);
			b.setClickable(true);
			return;
		} else {
			super.setOnClickListener(onclicklistener);
			a.setOnClickListener(null);
			b.setOnClickListener(null);
			a.setOnTouchListener(null);
			a.setClickable(false);
			b.setClickable(false);
			return;
		}
	}

	public void a(android.view.View.OnLongClickListener onlongclicklistener,
			boolean flag) {
		w = onlongclicklistener;
		if (flag) {
			super.setOnLongClickListener(null);
			a.setOnLongClickListener(this);
			b.setOnLongClickListener(this);
			a.setLongClickable(true);
			b.setLongClickable(true);
			return;
		} else {
			super.setOnLongClickListener(this);
			a.setOnLongClickListener(null);
			b.setOnLongClickListener(null);
			a.setLongClickable(false);
			b.setLongClickable(false);
			return;
		}
	}

	public void a(CharSequence charsequence, int i1, boolean flag) {
		Drawable drawable = null;
		b.setText(charsequence);
		Object obj;
		if (i1 > 0) {
			drawable = getResources().getDrawable(i1);
		} else {
			drawable = null;
		}
		if (charsequence != null || i1 >= 0) {
			obj = charsequence;
			if (charsequence == null) {

			}
		}
		obj = charsequence;
		if (charsequence == null) {
			Context context = getContext();
			if (!flag) {
				i1 = 0x7f0a0023;
			} else {
				i1 = 0x7f0a0021;
			}
			obj = md.a(context, i1);
		}
		b.setCompoundDrawablePadding(getResources().getDimensionPixelSize(
				0x7f0b0022));

		b.setCompoundDrawablesWithIntrinsicBounds(null, null,
				((Drawable) (drawable)), null);
	}

	public void a(boolean flag) {
		if (d || getTag() != null && (getTag() instanceof mt)
				&& !((mt) getTag()).g()) {
			return;
		}
		d = true;
		c();
		if (flag) {
			ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
					0.0F, 0.9F });
			valueanimator.setDuration(70L);
			valueanimator.setInterpolator(new AccelerateInterpolator());
			valueanimator
					.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

						final FanItem a;

						public void onAnimationUpdate(
								ValueAnimator valueanimator1) {
							FanItem.a(a, ((Float) valueanimator1
									.getAnimatedValue()).floatValue());
							a.invalidate();
						}

						{
							a = FanItem.this;
							// super();
						}
					});
			valueanimator.addListener(new AnimatorListenerAdapter() {

				final FanItem a;

				public void onAnimationEnd(Animator animator) {
					FanItem.a(a, 0.9F);
					a.invalidate();
				}

				{
					a = FanItem.this;
					// super();
				}
			});
			valueanimator.start();
			return;
		} else {
			D = 0.9F;
			invalidate();
			return;
		}
	}

	public void a(boolean flag, final lu lu) {
		if (!d) {
			return;
		}
		if (flag) {
			ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
					0.9F, 0.0F });
			valueanimator.setDuration(70L);
			valueanimator.setInterpolator(new AccelerateInterpolator());
			valueanimator
					.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

						final FanItem a;

						public void onAnimationUpdate(
								ValueAnimator valueanimator1) {
							FanItem.a(a, ((Float) valueanimator1
									.getAnimatedValue()).floatValue());
							a.invalidate();
						}

						{
							a = FanItem.this;
							// super();
						}
					});
			valueanimator.addListener(new AnimatorListenerAdapter() {

				final lu a;
				final FanItem b;

				public void onAnimationEnd(Animator animator) {
					b.d = false;
					b.invalidate();
					if (a != null) {
						b.post(new Runnable() {

							public void run() {
								a.b();
							}

						});
					}
				}

				public void onAnimationStart(Animator animator) {
					if (a != null) {
						a.a();
					}
				}

				{
					b = FanItem.this;
					a = lu;
					// super();
				}
			});
			valueanimator.start();
			return;
		} else {
			d = false;
			invalidate();
			return;
		}
	}

	public boolean a() {
		return i != null && i.isShown();
	}

	public boolean a(Canvas canvas) {
		try {
			draw(canvas);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return true;
	}

	public void b() {
		a(false);
	}

	public void b(Canvas canvas) {
		if (d) {
			c();
			if (tf.b(m)) {
				int i1 = (int) ((float) q * (1.0F - D) * 0.5F);
				int j1 = (int) ((float) r * (1.0F - D) * 0.5F);
				n.set(s + i1, t + j1, (s + q) - i1, (t + r) - j1);
				canvas.drawBitmap(m, null, n, p);
				o.set(n);
				double d2 = A;
				double d1;
				if (oy.a()) {
					d1 = 0.69999999999999996D;
				} else {
					d1 = 0.40000000000000002D;
				}
				i1 = (int) (d1 * d2);
				o.inset(-i1, -i1);
				return;
			}
		}
	}

	protected void c() {
		if (!tf.b(m)) {
			m = BitmapFactory.decodeResource(getResources(), 0x7f020036);
		}
		if (q <= 0 || r <= 0 || s <= 0 || t <= 0) {
			q = m.getWidth();
			r = m.getHeight();
			s = Math.max((a.getLeft() + k[0]) - q / 3, 0);
			t = Math.max((a.getTop() + k[1]) - r / 3, 0);
		}
	}

	public boolean dispatchDragEvent(DragEvent dragevent) {
		boolean flag;
		try {
			flag = super.dispatchDragEvent(dragevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return flag;
	}

	protected void dispatchDraw(Canvas canvas) {
		Object obj;
		super.dispatchDraw(canvas);
		b(canvas);
		obj = getTag();
		if (obj != null) {

			if (!(obj instanceof pk) && !(obj instanceof na)) {

				if (!(obj instanceof mx)) {

					if (obj instanceof mt) {
						obj = (mt) obj;
						if (((mt) (obj)).r()) {
							canvas.save();
							c(canvas);
						}
						((mt) (obj)).a(canvas);
						if (((mt) (obj)).r()) {
							canvas.restore();
							return;
						}
					}
					// goto _L1

					vk.b(null, 5, h, "dispatchDraw");
					return;

				} else {

					a(canvas, (mx) obj);
					// goto _L6

				}

			} else {

				a((mt) obj, canvas);

			}

		} else {

			return;
		}

	}

	public boolean dispatchTouchEvent(MotionEvent motionevent) {
		boolean flag;
		try {
			flag = super.dispatchTouchEvent(motionevent);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return false;
		}
		return flag;
	}

	protected void drawableStateChanged() {
		if (N && !M && a.getDrawable() != null) {
			int ai[] = getDrawableState();
			int j1 = ai.length;
			for (int i1 = 0; i1 < j1; i1++) {
				if (ai[i1] == 0x10100a7) {
					Drawable drawable = a.getDrawable();
					ColorFilter colorfilter;
					if (P == null) {
						colorfilter = O;
					} else {
						colorfilter = P;
					}
					drawable.setColorFilter(colorfilter);
					a.invalidate();
					return;
				}
			}

			a.getDrawable().clearColorFilter();
			a.invalidate();
			return;
		} else {
			super.drawableStateChanged();
			return;
		}
	}

	public void e() {
		a(false, ((lu) (null)));
	}

	public boolean f() {
		boolean flag = l;
		l = false;
		return flag;
	}

	public boolean g() {
		return true;
	}

	public int[] getIconPadding() {
		return k;
	}

	public ImageView getIconView() {
		return a;
	}

	public Point getTouchDownPoint() {
		return I;
	}

	public void h() {
		while (e == null || f == null || Fan.getInstance() == null) {
			return;
		}
		Fan fan = Fan.getInstance();
		fff = Fan.getInstance().getHandTrackRatio();
		fff = fan.getHandTracker().a(fff);
		final boolean flag = Fan.getInstance().i();
		if (fan.getHandTracker().c()) {
			postDelayed(new Runnable() {

				final float a;
				final boolean b;
				final FanItem c;

				public void run() {
					FanItem.a(c, a, b);
					if (c.getParent() instanceof ViewGroup) {
						((ViewGroup) c.getParent()).requestLayout();
					}
				}

				{
					c = FanItem.this;
					a = fff;
					b = flag;
					// super();
				}
			}, H * ls.b());
			return;
		} else {
			a(fff, flag);
			return;
		}
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		Drawable drawable = a.getDrawable();
		if (drawable != null && (drawable instanceof Animatable)) {
			((Animatable) drawable).start();
		}
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		m();
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		a = (ImageView) findViewById(0x7f0c005b);
		b = (TextView) findViewById(0x7f0c005c);
		A = ViewConfiguration.get(getContext()).getScaledTouchSlop();
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent) {
		if (motionevent == null) {
			return super.onTouchEvent(motionevent);
		}
		if ((motionevent.getAction() & 0xff) == 0) {
			I.set((int) motionevent.getX(), (int) motionevent.getY());
		}
		return d && !(getTag() instanceof mn);
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1) {
		super.onLayout(flag, i1, j1, k1, l1);
		if (i != null) {
			i();
		}
	}

	public boolean onLongClick(View view) {
		if (w != null) {
			w.onLongClick(this);
		}
		return true;
	}

	public void onMeasure(int i1, int j1) {
		super.onMeasure(i1, j1);
		float f1;
		if (G) {
			f1 = 0.0F;
		} else {
			f1 = getMeasuredWidth();
		}
		setPivotX(f1);
		setPivotY(getMeasuredHeight());
	}

	public boolean onTouchEvent(MotionEvent motionevent) {
		if (d) {

			if (g()) {
				// break; /* Loop/switch isn't completed */
			}
			if ((getParent() instanceof FanLayer)
					|| !super.onTouchEvent(motionevent)) {
				return false;
			}

		} else {

			if ((getParent() instanceof FanLayer)
					|| !super.onTouchEvent(motionevent)) {

				return false;

			} else {

				return true;

			}
		}

		int i1;
		int j1;
		i1 = (int) motionevent.getX();
		j1 = (int) motionevent.getY();

		switch (motionevent.getAction() & 0xff) {
		default:
			return true;
		case 0:
			y = i1;
			z = j1;
			B = false;
			if (o.contains(i1, j1)) {
				l = true;
				return true;
			} else {
				l();
				return true;
			}
		case 2:
		case 3:
		case 1:
			m();
			if (!l || !o.contains(i1, j1) || B) {

				return true;

			} else {

				l = true;
				if (x == null) {
					return true;
				} else {
					x.onClick(this);
					// return true;
					if (Math.abs(i1 - y) <= A && Math.abs(j1 - z) <= A) {
						return true;
					} else {

						m();
						return true;
					}

				}
			}

		}

	}

	public void setChecked(boolean flag) {
		if (flag) {
			j();
			return;
		} else {
			k();
			return;
		}
	}

	public void setColorFilter(ColorFilter colorfilter) {
		P = colorfilter;
	}

	public void setColorFilterEnabled(boolean flag) {
		N = flag;
	}

	protected void setIcon(int i1) {
		a(getContext().getResources().getDrawable(i1), false);
	}

	public void setIcon(Drawable drawable) {
		a(drawable, false);
	}

	public void setIcon(String s1) {
		g.a(getResources(), a, s1);
	}

	public void setIcon(jq jq) {
		if (a.getVisibility() != 0) {
			a.setVisibility(0);
		}
		g.a(getResources(), a, jq);
	}

	public void setIconAndLabel(String s1) {
		try {
			PackageManager packagemanager = getContext().getPackageManager();
			ApplicationInfo applicationinfo = packagemanager
					.getApplicationInfo(s1, 0);
			b.setText(applicationinfo.loadLabel(packagemanager));
		} catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) {
		}
		g.a(getResources(), a, s1);
	}

	public void setOnClickListener(
			android.view.View.OnClickListener onclicklistener) {
		a(onclicklistener, false);
	}

	public void setOnLongClickListener(
			android.view.View.OnLongClickListener onlongclicklistener) {
		a(onlongclicklistener, false);
	}

	public void setTag(Object obj) {
		super.setTag(obj);
		if ((obj instanceof pk) || (obj instanceof na) || (obj instanceof mr)
				|| (obj instanceof mx)) {
			Resources resources = getResources();
			if (u == null) {
				u = new ShapeDrawable(new OvalShape());
				u.getPaint().setColor(resources.getColor(0x7f0a0000));
			}
			if (v == null && ((obj instanceof pk) || (obj instanceof na))) {
				v = new wx(getContext(), this);
				return;
			}
		}
	}

	public void setText(int i1) {
		b.setText(i1);
	}

	public void setText(CharSequence charsequence) {
		a(charsequence, 0, true);
	}

	public void setTextColor(int i1) {
		b.setTextColor(i1);
	}

}
