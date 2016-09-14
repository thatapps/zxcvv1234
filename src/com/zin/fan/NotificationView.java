//zevienin

package com.lazyswipe.fan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.main.bh;
import com.main.ir;
import com.main.ja;
import com.main.ly;
import com.main.lz;
import com.main.ma;
import com.main.mb;
import com.main.ms;
import com.main.mt;
import com.main.mw;
import com.main.na;
import com.main.pk;
import com.main.pq;
import com.main.rw;
import com.main.to;
import com.main.tt;
import com.main.vk;
import com.main.wb;
import com.main.wz;
import com.main.xe;
import com.main.xf;

// Referenced classes of package com.lazyswipe.fan:
//            Fan, FanItem

public class NotificationView extends RelativeLayout implements
		android.view.View.OnClickListener,
		android.widget.AdapterView.OnItemClickListener {

	InputMethodManager a;
	EditText b;
	boolean c;
	wb d;
	private View e;
	private TextView f;
	private ImageView g;
	private ListView h;
	private mt i;
	private FanItem j;
	private Point k;
	private Point l;
	private Point m;
	private Path n;
	private boolean o;
	private boolean p;

	public NotificationView(Context context) {
		this(context, null);
	}

	public NotificationView(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public NotificationView(Context context, AttributeSet attributeset, int i1) {
		super(context, attributeset, i1);
		k = new Point();
		l = new Point();
		m = new Point();
		o = false;
		p = false;
	}

	@SuppressLint("NewApi")
	public NotificationView(Context context, AttributeSet attributeset, int i1,
			int j1) {
		super(context, attributeset, i1, j1);
		k = new Point();
		l = new Point();
		m = new Point();
		o = false;
		p = false;
	}

	static Path a(NotificationView notificationview, Path path) {
		notificationview.n = path;
		return path;
	}

	static void a(NotificationView notificationview) {
		notificationview.b();
	}

	private void a(final boolean flag) {
		ValueAnimator valueanimator;
		Object obj;
		int i1;
		int j1;
		int k1;
		if (flag) {
			i1 = 380;
		} else {
			i1 = 270;
		}
		j1 = to.p(SwipeApplication.e());
		k1 = to.q(SwipeApplication.e());
		if (!flag && o && k.x > 0) {
			m = k;
		} else {
			m = l;
		}
		j1 = tt.c(new int[] { (int) Math.hypot(m.x + 0, m.y + 0),
				(int) Math.hypot(m.x + 0, m.y - k1),
				(int) Math.hypot(m.x - j1, m.y + 0),
				(int) Math.hypot(m.x - j1, m.y - k1) });
		if (flag) {
			valueanimator = ValueAnimator.ofInt(new int[] { 0, j1 });
		} else {
			valueanimator = ValueAnimator.ofInt(new int[] { j1, 0 });
		}
		valueanimator.setDuration(i1);
		if (flag) {
			obj = new AccelerateInterpolator();
		} else {
			obj = new LinearInterpolator();
		}
		valueanimator
				.setInterpolator(((android.animation.TimeInterpolator) (obj)));
		valueanimator
				.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					final NotificationView a;

					public void onAnimationUpdate(ValueAnimator valueanimator1) {
						int l1 = ((Integer) valueanimator1.getAnimatedValue())
								.intValue();
						if (NotificationView.c(a) != null) {
							NotificationView.c(a).reset();
							NotificationView.c(a).addCircle(
									NotificationView.d(a).x,
									NotificationView.d(a).y, l1,
									android.graphics.Path.Direction.CCW);
						}
						a.invalidate();
					}

					{
						a = NotificationView.this;
						// super();
					}
				});
		valueanimator.addListener(new AnimatorListenerAdapter() {

			final boolean a;
			final NotificationView b;

			public void onAnimationEnd(Animator animator) {
				NotificationView.a(b, null);
				if (!a) {
					b.setLayerType(0, null);
					b.setVisibility(8);
				}
			}

			public void onAnimationStart(Animator animator) {
				NotificationView.a(b, new Path());
				if (a) {
					b.setLayerType(1, null);
					b.setVisibility(0);
				}
			}

			{
				b = NotificationView.this;
				a = flag;
				// super();
			}
		});
		valueanimator.start();
	}

	static boolean a(NotificationView notificationview, boolean flag) {
		notificationview.o = flag;
		return flag;
	}

	public static mt b(NotificationView notificationview) {
		return notificationview.i;
	}

	private void b() {
		c = true;
		String s = b.getText().toString();
		com.lazyswipe.notification.AppNotification$Action action = (com.lazyswipe.notification.AppNotification$Action) b
				.getTag(0x7f0c0003);
		Intent intent = new Intent();
		Bundle bundle = new Bundle();
		bundle.putCharSequence(action.d[0].a(), s);
		bh.a(action.d, intent, bundle);
		try {
			action.c.send(getContext(), 0, intent);
			ja.a().a("\u56DE\u590D\u6210\u529F", "app", (String) b.getTag());
		} catch (android.app.PendingIntent.CanceledException canceledexception) {
			Log.e("Swipe.NotificationView", "Failed to reply.",
					canceledexception);
		}
		b.clearFocus();
		a.hideSoftInputFromWindow(b.getWindowToken(), 0);
		d.dismiss();
		p = false;
		c();
	}

	private void b(FanItem fanitem, mt mt1) {
		j = fanitem;
		i = mt1;
		String str = null;
		g.setImageDrawable(mt1.b());
		if (mt1 instanceof na) {
			f.setText(0x7f0f0003);
			g.setImageResource(0x7f030000);
			h.setAdapter(new mb(this, getContext(), (na) mt1));
		} else if (mt1 instanceof mw) {
			TextView textview = f;
			if (((pk) i).l() == null) {
				str = vk.d(getContext(), mt1.i());
			} else {
				str = (String) pq.d(mt1.i());
			}
			textview.setText(str);
			h.setAdapter(new ma(this, (pk) mt1));
		} else {
			f.setText(mt1.a());
			h.setAdapter(new ly(this, (pk) mt1));
		}
		xe xe = new xe(h, new xf() {

			final NotificationView a;

			public void a(ListView listview, int ai[]) {
				((ly) listview.getAdapter()).a(ai[0]);
			}

			public boolean a(int i1) {
				return NotificationView.b(a) instanceof ms;
			}

			public boolean a(ListView listview) {
				NotificationView.a(a, true);
				a.a();
				return true;
			}

			{
				a = NotificationView.this;
				// super();
			}
		});
		h.setOnTouchListener(xe);
		h.setOnScrollListener(xe.a());
	}

	public static boolean b(NotificationView notificationview, boolean flag) {
		notificationview.p = flag;
		return flag;
	}

	static Path c(NotificationView notificationview) {
		return notificationview.n;
	}

	private void c() {
		Fan fan = Fan.getInstance();
		if (fan != null) {
			try {
				fan.getItemLayer().a(j, i, false);
			} catch (Throwable throwable) {
			}
		}
		a();
	}

	static Point d(NotificationView notificationview) {
		return notificationview.m;
	}

	private void d() {
		a(true);
	}

	private void e() {
		if (!p && !o) {
			setVisibility(8);
			setLayerType(0, null);
		}
		try {
			a(false);
			return;
		} catch (Exception exception) {
			setVisibility(8);
		}
	}

	public static void e(NotificationView notificationview) {
		notificationview.c();
	}

	public void a() {
		e();
	}

	public void a(FanItem fanitem, mt mt1) {
		b(fanitem, mt1);
		if (fanitem != null && fanitem.a != null) {
			int[] ifg = new int[2];
			fanitem.a.getLocationOnScreen(ifg);
			l.x = ifg[0] + fanitem.a.getWidth() / 2;
			l.y = ifg[1] + fanitem.a.getHeight() / 2;
			d();
			return;
		} else {
			setVisibility(0);
			return;
		}
	}

	public void a(String s,
			com.lazyswipe.notification.AppNotification$Action action) {
		ja.a().a("\u70B9\u51FB\u56DE\u590D", "app", s);
		if (d == null) {
			b = (EditText) LayoutInflater.from(getContext()).inflate(
					0x7f040032, null, false);
			b.addTextChangedListener(new TextWatcher() {

				final NotificationView a;

				public void afterTextChanged(Editable editable) {
					if (a.d != null) {
						String string = a.b.getText().toString();
						Button button = a.d.a();
						boolean flag;
						if (!TextUtils.isEmpty(string)) {
							flag = true;
						} else {
							flag = false;
						}
						button.setEnabled(flag);
					}
				}

				public void beforeTextChanged(CharSequence charsequence,
						int i1, int j1, int k1) {
				}

				public void onTextChanged(CharSequence charsequence, int i1,
						int j1, int k1) {
				}

				{
					a = NotificationView.this;
					// super();
				}
			});
			a = (InputMethodManager) getContext().getSystemService(
					"input_method");
			d = (new wz(getContext().getApplicationContext()))
					.a(f.getText())
					.a(g.getDrawable())
					.a(48)
					.b(0x1040000, null)
					.a(0x104000a,
							new android.content.DialogInterface.OnClickListener() {

								final NotificationView a;

								public void onClick(
										DialogInterface dialoginterface, int i1) {
									NotificationView.a(a);
								}

								{
									a = NotificationView.this;
									// super();
								}
							}).e(-1).a(b).b(ir.r(getContext()))
					.a(new android.content.DialogInterface.OnDismissListener() {

						final NotificationView a;

						public void onDismiss(DialogInterface dialoginterface) {
							if (a.c) {
								return;
							} else {
								a.a.toggleSoftInput(2, 2);
								return;
							}
						}

						{
							a = NotificationView.this;
							// super();
						}
					}).d();
			d.a().setEnabled(false);
			d.getWindow().setSoftInputMode(4);
		} else {
			b.getText().clear();
		}
		c = false;
		b.setTag(s);
		b.setTag(0x7f0c0003, action);
		d.show();
	}

	protected void dispatchDraw(Canvas canvas) {
		if (n != null) {
			canvas.save();
			canvas.clipPath(n);
		}
		super.dispatchDraw(canvas);
		if (n != null) {
			canvas.restore();
		}
	}

	public void onClick(View view) {
		switch (view.getId()) {
		default:
			o = true;
			a();
			return;

		case 2131492924:
			ja.a().a("\u901A\u77E5\u8BE6\u60C5\u70B9\u51FB\u6E05\u7406", "app",
					i.i());
			break;
		}
		o = true;
		c();
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (d != null && d.isShowing()) {
			d.cancel();
		}
		setLayerType(0, null);
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		h = (ListView) findViewById(0x102000a);
		f = (TextView) findViewById(0x7f0c000d);
		g = (ImageView) findViewById(0x7f0c002d);
		e = findViewById(0x7f0c0098);
		findViewById(0x7f0c003c).setOnClickListener(this);
		((TextView) findViewById(0x7f0c0093)).setText((new SimpleDateFormat(
				"HH:mm", Locale.US)).format(new Date()));
		h.setOnItemClickListener(this);
		setOnClickListener(this);
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent) {
		motionevent.getAction();
		// JVM INSTR tableswitch 0 0: default 24
		// 0 30;
		// goto _L1 _L2

		switch (motionevent.getAction()) {
		default:

			return super.onInterceptTouchEvent(motionevent);
		case 0:

			o = false;
			p = false;
			k.set((int) motionevent.getX(), (int) motionevent.getY());

		}
		return true;

	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1) {
		Fan.k();
		((lz) h.getAdapter()).a(adapterview, view, i1, l1);
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1) {
		super.onLayout(flag, i1, j1, k1, l1);
		if (flag) {
			android.graphics.drawable.Drawable drawable = rw.a(l1 - j1);
			e.setBackgroundDrawable(drawable);
		}
	}
}
