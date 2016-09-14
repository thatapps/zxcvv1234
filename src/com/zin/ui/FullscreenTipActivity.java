//zevienin

package com.lazyswipe.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.lazyswipe.SwipeService;
import com.main.rx;
import com.main.to;
import com.main.vk;

public class FullscreenTipActivity extends Activity implements
		android.view.View.OnClickListener {

	int a;
	Paint b;
	Path c;
	String d;

	public FullscreenTipActivity() {
	}

	private Drawable a(TextView textview) {
		int i = textview.getPaddingLeft();
		return new rx(this, getResources(), i);
	}

	public static void a(Context context) {
		to.c(context);
		a(context, 0x7f0f0049);
	}

	public static void a(Context context, int i) {
		a(context, i, null);
	}

	public static void a(final Context context, final int i, final String s) {
		Handler handler1 = SwipeService.a();
		Handler handler = handler1;
		if (handler1 == null) {
			handler = new Handler();
		}
		handler.postDelayed(new Runnable() {

			final Context a;
			final int b;
			final String c;

			public void run() {
				Intent intent = (new Intent(a,
						com.lazyswipe.ui.FullscreenTipActivity.class))
						.putExtra("extra.MESSAGE_RES_ID", b).addFlags(
								0x10000000);
				if (!TextUtils.isEmpty(c)) {
					intent.putExtra("extra.MESSAGE", c);
				}
				a.startActivity(intent);
			}

			{
				a = context;
				b = i;
				c = s;
				// super();
			}
		}, 400L);
	}

	public static void b(Context context) {
		to.e(context);
		a(context, 0x7f0f003d);
	}

	public static void c(Context context) {
		to.d(context);
		a(context, 0x7f0f003d);
	}

	public static void d(Context context) {
		int i;
		if (to.g(context)) {
			i = 0x7f0f00d3;
		} else {
			i = 0x7f0f0043;
		}
		a(context, i);
	}

	public static void e(Context context) {
		a(context, 0x7f0f003d);
	}

	public static void f(Context context) {
		a(context, 0x7f0f0038);
	}

	public Paint a(DisplayMetrics displaymetrics) {
		if (b == null) {
			b = new Paint(7);
			b.setAntiAlias(true);
			b.setStyle(android.graphics.Paint.Style.STROKE);
			b.setColor(-1);
			float f1 = 4F * displaymetrics.density;
			float f2 = f1 / 2.0F;
			b.setPathEffect(new DashPathEffect(new float[] { f1, f2, f1, f2 },
					0.0F));
		}
		return b;
	}

	public Path a(int i, int j, int k, int l) {
		Path path = new Path();
		path.moveTo(i, j);
		path.lineTo(k, j);
		path.lineTo(k, l);
		path.lineTo(i, l);
		path.close();
		return path;
	}

	public void onClick(View view) {
		finish();
		if (0x7f0f0041 == a && to.B()) {
			System.exit(0);
		}
	}

	public void onCreate(Bundle bundle) {
		Object obj = null;
		super.onCreate(bundle);
		int l = getResources().getDimensionPixelSize(0x7f0b0009);
		Intent intent = getIntent();
		d = intent.getStringExtra("extra.MESSAGE");
		a = intent.getIntExtra("extra.MESSAGE_RES_ID", 0);
		Drawable drawable;
		TextView textview;
		int j;
		int k;

		if (0x7f0f0038 == a) {
			d = getString(0x7f0f0038);
			a = 0;
			drawable = getResources().getDrawable(0x7f0200a7);
		} else {
			drawable = null;
		}
		if (0x7f0f003c == a && !to.E()) {
			d = getString(a);
			a = 0;
			int i = d.indexOf('\n');
			if (i > 0) {
				d = d.substring(0, i);
			}
			DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
			b = a(displaymetrics);
			i = displaymetrics.widthPixels;
			c = a((int) ((double) (displaymetrics.density * 180F) + 0.5D), 0, i
					- (int) ((double) (displaymetrics.density * 30F) + 0.5D),
					(int) ((double) (displaymetrics.density * 45F) + 0.5D));
		}
		textview = new TextView(FullscreenTipActivity.this) {

			final FullscreenTipActivity a;

			protected void onDraw(Canvas canvas) {
				super.onDraw(canvas);
				if (a.c != null) {
					canvas.drawPath(a.c, a.b);
				}
			}

			{
				a = FullscreenTipActivity.this;
				// super(context);
			}
		};
		textview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
		textview.setGravity(17);
		textview.setTextColor(getResources().getColor(0x7f0a002b));
		textview.setTextSize(0, getResources().getDimension(0x7f0b0051));
		textview.setPadding(l, 0, l, 0);
		textview.setOnClickListener(this);
		if (a <= 0) {
			// break MISSING_BLOCK_LABEL_537;
		}
		textview.setText(a);
		d = textview.getText().toString();
		// _L5:
		if (a > 0 && a == 0x7f0f003f) {

			drawable = a(textview);

		} else {

			if (a > 0) {

				if (drawable != null) {
					try {
						textview.setCompoundDrawablesWithIntrinsicBounds(null,
								drawable, null, null);
						j = drawable.getIntrinsicHeight() + 0;
					}
					// Misplaced declaration of an exception variable
					catch (Exception exception) {
						finish();
						return;
					}
				} else {
					j = 0;
				}
				k = j;
				if (drawable != null) {
					textview.setCompoundDrawablesWithIntrinsicBounds(null,
							null, null, drawable);
					j += drawable.getIntrinsicHeight() + l;
				}

				k = j;
				if (vk.l()) {
					textview.setTextSize(0, vk.a(this, 20F));
				}
				Rect rect = null;
				k = j;
				if (k > 0) {
					rect = new Rect();
					textview.getPaint().getTextBounds(d, 0, 1, rect);
					j = rect.height() << 1;
				}

				
				
				j = (getResources().getDisplayMetrics().heightPixels - k - j >> 1)
						- j;
				textview.setPadding(l, j, l, j - l - l);
				setContentView(textview);

				textview.setText(d);
				return;
				// goto _L5

			} else {

				if (!d.startsWith(getString(0x7f0f003f))) {
					if (drawable != null) {
						try {
							textview.setCompoundDrawablesWithIntrinsicBounds(
									null, drawable, null, null);
							j = drawable.getIntrinsicHeight() + 0;
						}
						// Misplaced declaration of an exception variable
						catch (Exception exception) {
							finish();
							return;
						}
					} else {
						j = 0;
					}
					k = j;
					if (drawable!= null) {
						textview.setCompoundDrawablesWithIntrinsicBounds(null,
								null, null, drawable);
						j += drawable.getIntrinsicHeight() + l;
					}
					
					k = j;
					if (!vk.l()) {
						// break MISSING_BLOCK_LABEL_452;
					}
					textview.setTextSize(0, vk.a(this, 20F));
					k = j;
					if (k <= 0) {
						// break MISSING_BLOCK_LABEL_530;
					}
					Rect rect = new Rect();
					textview.getPaint().getTextBounds(d, 0, 1, rect);
					j = rect.height() << 1;
					j = (getResources().getDisplayMetrics().heightPixels - k
							- j >> 1)
							- j;
					textview.setPadding(l, j, l, j - l - l);
					setContentView(textview);
					textview.setText(d);
					return;

					// goto _L5

				} else {
					drawable = a(textview);

				}

			}

		}

	}
}
