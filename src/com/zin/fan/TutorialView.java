//zevienin

package com.lazyswipe.fan;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;
import com.lazyswipe.ui.FullscreenTipActivity;
import com.lazyswipe.ui.NotificationSettingsActivity;
import com.lazyswipe.ui.TutorialService;
import com.main.ir;
import com.main.ja;
import com.main.pq;
import com.main.sy;
import com.main.vj;
import com.main.vk;

// Referenced classes of package com.lazyswipe.fan:
//            Fan, FanItem

public class TutorialView extends LinearLayout implements
		android.view.View.OnClickListener {

	private int a;
	private SharedPreferences b;
	private TextView c;
	private View d;
	private TextView e;
	private TextView f;
	private TextView g;
	private TextView h;
	private TextView i;
	private TextView j;
	private LinearLayout k;
	private LinearLayout l;
	private int m;
	private Fan n;
	private String o[];
	private boolean p;

	public TutorialView(Context context) {
		this(context, null);
	}

	public TutorialView(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public TutorialView(Context context, AttributeSet attributeset, int i1) {
		super(context, attributeset, i1);
	}

	@SuppressLint("NewApi")
	public TutorialView(Context context, AttributeSet attributeset, int i1,
			int j1) {
		super(context, attributeset, i1, j1);
	}

	private void a(int i1) {
		switch (i1) {
		default:
			return;

		case 2131493061:
			c();
			return;

		case 2131493067:
			e();
			return;

		case 2131493071:
			f();
			return;

		case 2131493069:
			d();
			return;
		}
	}

	private void b() {
		n.removeView(this);
		SwipeApplication.d = false;
	}

	private void c() {
		n.removeView(this);
		SwipeApplication.c = false;
		ir.K(getContext());
		if (a == 108) {
			ir.a(getContext()).edit()
					.putLong("key_booster_start_counting", -1L).apply();
		}
	}

	private void d() {
	}

	private void e() {
		switch (a) {
		case 100: // 'd'
		case 103: // 'g'
		case 105: // 'i'
		case 106: // 'j'
		default:
			return;

		case 107: // 'k'
			b();
			return;

		case 98: // 'b'
			c();
			return;

		case 99: // 'c'
		case 102: // 'f'
			n.a(false);
			Context context = getContext().getApplicationContext();
			NotificationSettingsActivity.a(getContext(), o,
					TutorialService.a(context, -1),
					TutorialService.a(context, 0));
			return;

		case 101: // 'e'
			ir.a(getContext(), -1L);
			b();
			return;

		case 104: // 'h'
			ir.c(getContext(), false);
			b();
			return;
		}
	}

	private void f() {
		switch (a) {
		case 100: // 'd'
		case 103: // 'g'
		case 105: // 'i'
		case 106: // 'j'
		default:
			return;

		case 107: // 'k'
			b();
			n.a(false);
			FullscreenTipActivity.b(getContext());
			return;

		case 99: // 'c'
			c();
			return;

		case 104: // 'h'
			if (SwipeService.g()) {
				b();
				return;
			}
			// fall through

		case 98: // 'b'
		case 101: // 'e'
			n.a(false);
			pq.d(getContext());
			FullscreenTipActivity.e(getContext());
			return;

		case 102: // 'f'
			ir.f(getContext(), false);
			b();
			return;

		case 108: // 'l'
			n.a(false);
			ja.a().a("BoosterHolaGet");
			vk.f(getContext(),
					"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_booster");
			b();
			return;
		}
	}

	private void g() {
		b.edit().putInt("key_tutorial_step", a).apply();
	}

	private void h() {
		if (a < 98) {
			a = 98;
		}
		if (98 == a && pq.c(getContext())) {
			a = 99;
		}
		g();
	}

	private void i() {
		if (p) {
			ViewPropertyAnimator viewpropertyanimator = animate().alpha(0.0F);
			if (android.os.Build.VERSION.SDK_INT >= 16) {
				viewpropertyanimator.withEndAction(new Runnable() {

					final TutorialView a;

					public void run() {
						a.a();
						a.animate().alpha(1.0F).start();
					}

					{
						a = TutorialView.this;
						// super();
					}
				});
			} else {
				viewpropertyanimator.setListener(new sy() {

					final TutorialView a;

					public void onAnimationEnd(Animator animator) {
						a.a();
						a.animate().alpha(1.0F).setListener(null).start();
					}

					{
						a = TutorialView.this;
						// super();
					}
				});
			}
			viewpropertyanimator.start();
			return;
		} else {
			p = true;
			a();
			animate().alpha(1.0F).setStartDelay(400L).start();
			return;
		}
	}

	private void j() {
		k.removeAllViewsInLayout();
		Object obj = b.getString("key_notification_apps_selected", null);
		if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
			o = ((String) (obj)).split(",");
			int k1 = Math.min(o.length, 4);
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(
					0, m, 1.0F);
			int i1 = 0;
			int j1;
			do {
				j1 = i1;
				if (i1 >= k1) {
					break;
				}
				obj = new ImageView(getContext());
				k.addView(((View) (obj)), layoutparams);
				FanItem.g.a(getResources(), ((ImageView) (obj)), o[i1]);
				i1++;
			} while (true);
			for (; j1 < 4; j1++) {
				obj = new View(getContext());
				k.addView(((View) (obj)), layoutparams);
			}

			if (o.length < 5) {
				obj = new View(getContext());
			} else if (o.length > 5) {
				obj = new TextView(getContext());
				((TextView) (obj)).setGravity(17);
				((TextView) (obj)).setText("...");
				((TextView) (obj)).setIncludeFontPadding(false);
				((TextView) (obj)).setTextSize(0,
						getResources().getDimension(0x7f0b006a));
				((TextView) (obj)).setTextColor(getResources().getColor(
						0x7f0a0023));
			} else {
				obj = new ImageView(getContext());
				FanItem.g.a(getResources(), ((ImageView) (obj)), o[4]);
			}
			k.addView(((View) (obj)), layoutparams);
		}
	}

	void a() {
		int i1 = 0;
		Object obj;
		switch (a) {
		case 100: // 'd'
		case 103: // 'g'
		case 105: // 'i'
		case 106: // 'j'
		default:
			vj.c("Swipe.TutorialView",
					(new StringBuilder()).append("Unrecognized step: ")
							.append(a).toString());
			SwipeApplication.d = false;
			c();
			return;

		case 107: // 'k'
			h.setText(0x7f0f00d1);
			i.setText(0x7f0f00d3);
			e.setText(0x7f0f000e);
			f.setText(0x7f0f00d4);
			k.setVisibility(8);
			return;

		case 98: // 'b'
			h.setText(0x7f0f00e4);
			i.setText(0x7f0f00e0);
			e.setText(0x1040000);
			f.setText(0x7f0f00a1);
			j();
			return;

		case 99: // 'c'
			h.setText(0x7f0f00e3);
			i.setText(0x7f0f00e1);
			j.setText(0x7f0f00e2);
			j.setVisibility(0);
			e.setText(0x7f0f00cc);
			f.setText(0x7f0f00d0);
			j();
			return;

		case 102: // 'f'
			SwipeApplication.d = false;
			h.setText(0x7f0f00e3);
			i.setText(0x7f0f00e1);
			j.setText(0x7f0f00e2);
			j.setVisibility(0);
			e.setText(0x7f0f00cc);
			f.setText(0x7f0f00cf);
			j();
			return;

		case 101: // 'e'
			SwipeApplication.d = false;
			h.setText(0x7f0f00e4);
			i.setText(0x7f0f000d);
			e.setText(0x7f0f00a0);
			f.setText(0x7f0f00a1);
			k.setVisibility(8);
			return;

		case 104: // 'h'
			SwipeApplication.d = false;
			h.setVisibility(8);
			e.setText(0x7f0f00a0);
			ImageView imageview;
			android.widget.LinearLayout.LayoutParams layoutparams;
			if (SwipeService.g()) {
				i.setText(getResources().getString(0x7f0f00dd,
						new Object[] { getResources().getString(0x7f0f0084) }));
				f.setText(0x7f0f00ce);
			} else {
				i.setText(0x7f0f00dc);
				f.setText(0x7f0f00a1);
			}
			k.removeAllViewsInLayout();
			k.setGravity(SwipeApplication.a | 0x10);
			imageview = new ImageView(getContext());
			FanItem.g.a(getResources(), imageview, ir.z(getContext()));
			layoutparams = new android.widget.LinearLayout.LayoutParams(m, m);
			k.addView(imageview, layoutparams);
			return;

		case 108: // 'l'
			SwipeApplication.d = false;
			c.setText(0x7f0f00a0);
			c.setVisibility(0);
			k.setVisibility(8);
			e.setVisibility(8);
			d.setVisibility(8);
			f.setText(0x7f0f00d6);
			h.setText(0x7f0f00d8);
			i.setText(0x7f0f00d7);
			obj = getContext().getResources().getDrawable(0x7f02003a);
			break;
		}
		if (obj != null) {
			f.setCompoundDrawablesWithIntrinsicBounds(((Drawable) (obj)), null,
					null, null);
			Rect rect = new Rect();
			String s = f.getText().toString();
			f.getPaint().getTextBounds(s, 0, s.length(), rect);
			int j1 = f.getPaddingTop();
			int l1 = f.getPaddingBottom();
			int k2 = f.getPaddingLeft();
			int i2 = f.getPaddingRight();
			int l2 = getResources().getDisplayMetrics().widthPixels;
			int i3 = getResources().getDimensionPixelSize(0x7f0b0068);
			int j3 = ((Drawable) (obj)).getIntrinsicWidth();
			int j2 = vk.a(getContext(), 6F);
			k2 = (l2 - (i3 << 1) - j3 - j2 - rect.width() - k2 - i2 >> 1) + k2;
			f.setCompoundDrawablePadding(j2);
			f.setGravity(16);
			if (k2 > 0) {
				f.setPadding(k2, j1, i2, l1);
			}
		}
		ja.a().a("BoosterHolaShow");
		obj = ir.a(getContext());
		int k1 = ((SharedPreferences) (obj)).getInt("key_booster_times", 0);
		long l3 = System.currentTimeMillis();
		if (k1 > 100) {
			l3 = -1L;
		} else if (k1 > 10) {
			l3 = 0x240c8400L + l3;
			i1 = 100;
		} else {
			l3 = 0xf731400L + l3;
			i1 = 10;
		}
		((SharedPreferences) (obj)).edit()
				.putLong("key_booster_start_counting", l3)
				.putInt("key_booster_times", i1).apply();
	}

	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		n = (Fan) getParent();
		h();
		i();
	}

	public void onClick(View view) {
		a(view.getId());
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		b = ir.a(getContext());
		a = b.getInt("key_tutorial_step", 4);
		c = (TextView) findViewById(0x7f0c00c5);
		d = findViewById(0x7f0c00cc);
		e = (TextView) findViewById(0x7f0c00cb);
		f = (TextView) findViewById(0x7f0c00cf);
		g = (TextView) findViewById(0x7f0c00cd);
		h = (TextView) findViewById(0x7f0c00c6);
		i = (TextView) findViewById(0x7f0c00c7);
		j = (TextView) findViewById(0x7f0c00c9);
		k = (LinearLayout) findViewById(0x7f0c00c8);
		l = (LinearLayout) findViewById(0x7f0c00ca);
		m = getResources().getDimensionPixelSize(0x7f0b0021);
		c.setOnClickListener(this);
		e.setOnClickListener(this);
		f.setOnClickListener(this);
		g.setOnClickListener(this);
		p = false;
		setAlpha(0.0F);
		if (SwipeApplication.c) {
			setBackgroundResource(0x7f02000f);
		}
	}
}
