//zevienin

package com.lazyswipe.features.theme.preview;

import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.lazyswipe.SwipeService;
import com.lazyswipe.ui.DialogActivity;
import com.lazyswipe.zev.R;
import com.main.ja;
import com.main.ol;
import com.main.ox;
import com.main.oz;
import com.main.sf;
import com.main.tb;
import com.main.tc;
import com.main.td;
import com.main.te;
import com.main.tf;
import com.main.tq;
import com.main.um;
import com.main.us;
import com.main.ux;
import com.main.uy;
import com.main.va;
import com.main.vj;
import com.main.vk;
import com.main.wo;
import com.main.xd;

// Referenced classes of package com.lazyswipe.features.theme.preview:
//            ThemePreviewItem, ThemePreviewSlideView

public class ThemePreviewActivity extends sf implements
		android.content.DialogInterface.OnClickListener,
		android.view.View.OnClickListener, td, te, uy, wo {

	private static final String a = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.features.theme.preview.ThemePreviewActivity.class
					.getSimpleName()).toString();
	private static int q = 0;
	private tb b;
	private List c;
	private int d;
	private Map e;
	private ThemePreviewSlideView f;
	private View g;
	private ViewSwitcher h;
	private ViewSwitcher i;
	private ViewSwitcher j;
	private ViewSwitcher k;
	private TextView l;
	private Bitmap m;
	private TextView n;
	private TextView o;
	private File p;
	private final Handler r = new Handler() {

		final ThemePreviewActivity a;

		public void handleMessage(Message message) {
			if (!a.isFinishing()) {
				switch (message.what) {
				default:
					return;

				case 1: // '\001'
					break;
				}
				if (message.obj instanceof oz) {
					ThemePreviewActivity.a(a, (oz) message.obj);
					return;
				}
			}
		}

		{
			a = ThemePreviewActivity.this;
			// super();
		}
	};
	private Bitmap s;

	public ThemePreviewActivity() {
		c = ox.b();
	}

	static ThemePreviewSlideView a(ThemePreviewActivity themepreviewactivity) {
		return themepreviewactivity.f;
	}

	static void a(ThemePreviewActivity themepreviewactivity, oz oz1) {
		themepreviewactivity.a(oz1);
	}

	// private void a(ox ox1) {
	// Object obj1;
	// int i1;
	// i1 = f(ox1);
	// Object obj = null;
	// h.getNextView().setBackgroundColor(i1);
	// h.showNext();
	// g.setBackgroundColor(i1);
	// i1 = c(ox1);
	// obj1 = (ViewGroup) i.getNextView();
	// if (!(((ViewGroup) (obj1)).findViewById(0x7f0c0017) instanceof TextView))
	// {
	// obj = (TextView) ((ViewGroup) (obj1)).findViewById(0x7f0c001b);
	//
	// } else {
	// obj = (TextView) ((ViewGroup) (obj1)).findViewById(0x7f0c0017);
	// }
	//
	// if (obj instanceof TextView) {
	// ((TextView) (obj)).setTextColor(i1);
	// }
	// n.setTextColor(i1);
	// o.setTextColor(i1);
	// if (!(((ViewGroup) (obj1)).findViewById(0x7f0c0016) instanceof
	// ImageView)) {
	// obj = (ImageView) ((ViewGroup) (obj1)).findViewById(0x7f0c001a);
	// if (obj == null) {
	//
	// i.showNext();
	// obj1 = new ColorDrawable(e(ox1));
	// ColorDrawable colordrawable = new ColorDrawable(d(ox1));
	// obj = new StateListDrawable();
	// ((StateListDrawable) (obj)).addState(new int[] { 0x10100a7 },
	// colordrawable);
	// ((StateListDrawable) (obj)).addState(new int[] { 0x101009c },
	// colordrawable);
	// ((StateListDrawable) (obj)).addState(new int[] { 0x101009e },
	// ((android.graphics.drawable.Drawable) (obj1)));
	// obj1 = (TextView) j.getNextView();
	// ((TextView) (obj1))
	// .setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
	// ((TextView) (obj1)).setTextColor(b(ox1));
	// int j1;
	// if (ox1.i()) {
	// j1 = 0x7f0f0099;
	// } else {
	// j1 = 0x7f0f009a;
	// }
	// try {
	// ((TextView) (obj1)).setText(j1);
	// j.showNext();
	// ((ImageView) k.getNextView()).setColorFilter(e(ox1),
	// android.graphics.PorterDuff.Mode.SRC_IN);
	// k.showNext();
	// l.setText(getString(ox1.h));
	// return;
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// vj.b(a, "failed in onSwitch().", exception);
	// }
	// return;
	//
	// } else {
	// if (tf.b(m)) {
	// ((ImageView) (obj)).setImageBitmap(m);
	// }
	// if (ox1.g != 10 && ox1.g != 9) {
	//
	// ((ImageView) (obj)).setColorFilter(-1,
	// android.graphics.PorterDuff.Mode.SRC_IN);
	// i.showNext();
	// obj1 = new ColorDrawable(e(ox1));
	// ColorDrawable colordrawable = new ColorDrawable(d(ox1));
	// obj = new StateListDrawable();
	// ((StateListDrawable) (obj)).addState(
	// new int[] { 0x10100a7 }, colordrawable);
	// ((StateListDrawable) (obj)).addState(
	// new int[] { 0x101009c }, colordrawable);
	// ((StateListDrawable) (obj)).addState(
	// new int[] { 0x101009e },
	// ((android.graphics.drawable.Drawable) (obj1)));
	// obj1 = (TextView) j.getNextView();
	// ((TextView) (obj1))
	// .setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
	// ((TextView) (obj1)).setTextColor(b(ox1));
	// int j1;
	// if (ox1.i()) {
	// j1 = 0x7f0f0099;
	// } else {
	// j1 = 0x7f0f009a;
	// }
	// try {
	// ((TextView) (obj1)).setText(j1);
	// j.showNext();
	// ((ImageView) k.getNextView()).setColorFilter(e(ox1),
	// android.graphics.PorterDuff.Mode.SRC_IN);
	// k.showNext();
	// l.setText(getString(ox1.h));
	// return;
	// }
	// // Misplaced declaration of an exception variable
	// catch (Exception exception) {
	// vj.b(a, "failed in onSwitch().", exception);
	// }
	// return;
	//
	// } else {
	//
	// (((ImageView) obj)).setColorFilter(null);
	//
	// }
	//
	// }
	//
	// } else {
	//
	// obj = (ImageView) ((ViewGroup) (obj1)).findViewById(0x7f0c0016);
	// }
	//
	// }
	private void a(ox ox) {
		try {
			int n = this.f(ox);
			this.h.getNextView().setBackgroundColor(n);
			this.h.showNext();
			this.g.setBackgroundColor(n);
			int n2 = this.c(ox);
			ViewGroup viewGroup = (ViewGroup) this.i.getNextView();
			TextView textView = viewGroup.findViewById(R.id.title_bar_txt_1) instanceof TextView ? (TextView) viewGroup
					.findViewById(R.id.title_bar_txt_1) : (TextView) viewGroup
					.findViewById(R.id.title_bar_txt_2);
			if (textView instanceof TextView) {
				textView.setTextColor(n2);
			}
			this.n.setTextColor(n2);
			this.o.setTextColor(n2);
			ImageView imageView = viewGroup
					.findViewById(R.id.title_bar_arrow_1) instanceof ImageView ? (ImageView) viewGroup
					.findViewById(R.id.title_bar_arrow_1)
					: (ImageView) viewGroup
							.findViewById(R.id.title_bar_arrow_2);
			if (imageView != null) {
				if (tf.b(this.m)) {
					imageView.setImageBitmap(this.m);
				}
				if (ox.g == 10 || ox.g == 9) {
					imageView.setColorFilter(null);
				} else {
					imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
				}
			}
			this.i.showNext();
			ColorDrawable colorDrawable = new ColorDrawable(this.e(ox));
			ColorDrawable colorDrawable2 = new ColorDrawable(this.d(ox));
			StateListDrawable stateListDrawable = new StateListDrawable();
			int[] arrn = new int[] { 16842919 };
			int[] arrn2 = new int[] { 16842910 };
			int[] arrn3 = new int[] { 16842908 };
			stateListDrawable.addState(arrn, (Drawable) colorDrawable2);
			stateListDrawable.addState(arrn3, (Drawable) colorDrawable2);
			stateListDrawable.addState(arrn2, (Drawable) colorDrawable);
			TextView textView2 = (TextView) this.j.getNextView();
			textView2.setBackgroundDrawable((Drawable) stateListDrawable);
			textView2.setTextColor(this.b(ox));
			int n3 = ox.i() ? R.string.theme_preview_applied
					: R.string.theme_preview_apply;
			textView2.setText(n3);
			this.j.showNext();
			((ImageView) this.k.getNextView()).setColorFilter(this.e(ox),
					PorterDuff.Mode.SRC_IN);
			this.k.showNext();
			this.l.setText((CharSequence) this.getString(ox.h));
			return;
		} catch (Exception var2_15) {
			vj.b(a, "failed in onSwitch().", (Throwable) var2_15);
			return;
		}
	}

	private void a(oz oz1) {
		if (tf.b(oz1.b()) && oz1.c == oz1.b.getTag()) {
			oz1.b.setImage(oz1.b());
		}
	}

	private int b(ox ox1) {
		return -1;
	}

	static List b(ThemePreviewActivity themepreviewactivity) {
		return themepreviewactivity.c;
	}

	private int c(ox ox1) {
		switch (ox1.g) {
		default:
			return -1;

		case 9: // '\t'
		case 10: // '\n'
			return 0xff666666;
		}
	}

	static tb c(ThemePreviewActivity themepreviewactivity) {
		return themepreviewactivity.b;
	}

	// private void c() {
	// LayoutInflater layoutinflater = LayoutInflater.from(this);
	// f.setAdapter(new ArrayAdapter(this, 0, c, layoutinflater) {
	//
	// final LayoutInflater a;
	// final ThemePreviewActivity b;
	//
	// public View getView(int i1, View view, ViewGroup viewgroup) {
	// if (view == null) {
	// view = (ThemePreviewItem) a.inflate(0x7f040048,
	// ThemePreviewActivity.a(b), false);
	// } else {
	// view = (ThemePreviewItem) view;
	// }
	// viewgroup = (ox) ThemePreviewActivity.b(b).get(i1);
	// view.a(i1, viewgroup);
	// view.setImage(null);
	// ThemePreviewActivity.c(b).a(new oz(i1, view, viewgroup));
	// return view;
	// }
	//
	// {
	// b = ThemePreviewActivity.this;
	// a = layoutinflater;
	// super(context, i1, list);
	// }
	// });
	// c(0);
	// }

	@SuppressWarnings("unchecked")
	private void c() {
		final LayoutInflater var1 = LayoutInflater.from(this);
		this.f.setAdapter(new ArrayAdapter(this, 0, this.c) {
			public View getView(int var1x, View var2, ViewGroup var3) {
				ThemePreviewItem var4;
				if (var2 == null) {
					var4 = (ThemePreviewItem) var1.inflate(0x7f040048,
							ThemePreviewActivity.this.f, false);
				} else {
					var4 = (ThemePreviewItem) var2;
				}

				ox ox = (ox) ThemePreviewActivity.this.c.get(var1x);
				var4.a(var1x, ox);
				var4.setImage((Bitmap) null);
				ThemePreviewActivity.this.b.a((new oz(var1x, var4, ox)));
				return var4;
			}
		});
		this.c(0);
	}

	private void c(int i1) {
		if (d < 0 && d >= c.size()) {
			return;
		} else {
			d = i1;
			a((ox) c.get(i1));
			return;
		}
	}

	private int d(ox ox1) {
		try {
			return ox1.a(18, 0x106000d);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Integer) null;
	}

	private void d() {
		if (e != null) {
			for (Iterator iterator = e.values().iterator(); iterator.hasNext(); tf
					.a((Bitmap) ((SoftReference) iterator.next()).get())) {
			}
			e.clear();
		}
	}

	private int e(ox ox1) {
		switch (ox1.g) {
		default:
			try {
				return ox1.a(2, 0x7f0a0012);
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		case 9: // '\t'
		case 10: // '\n'
			return getResources().getColor(0x7f0a0018);

		case 1: // '\001'
			return 0xff5d6d80;

		case 8: // '\b'
			return 0xff00ccff;
		}
	}

	private String e() {
		return (new File(um.c(), "themes")).getAbsolutePath();
	}

	private int f(ox ox1) {
		switch (ox1.g) {
		default:
			try {
				return ox1.a(2, 0x7f0a0012);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		case 9: // '\t'
		case 10: // '\n'
			return -1;

		case 1: // '\001'
			return 0xff5d6d80;

		case 8: // '\b'
			return 0xff00ccff;
		}
	}

	private void f() {
		ja.a().a("HolaTheme\u70B9\u51FB");
		if (vk.b(this, "com.hola.launcher")) {
			vk.c(this, (new Intent(
					"com.hola.launcher.component.themes.action_store"))
					.putExtra("ROUTE", 1));
			return;
		}
		if (s == null) {
			try {
				s = tf.a(
						(new StringBuilder())
								.append(getExternalCacheDir().getAbsolutePath())
								.append("/app_promotion.png").toString(), 2560,
						2560);
			} catch (Throwable throwable) {
			}
		}
		if (s != null) {
			DialogActivity.a(this, s);
			return;
		} else {
			vk.f(this,
					"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_theme");
			return;
		}
	}

	private void g() {
		us.a(this, 0x7f0f0032, new va() {

			final ThemePreviewActivity a;

			public String a(Context context, String s1) {
				return context.getString(0x7f0f009c);
			}

			public String a(Context context, String s1, boolean flag) {
				return context.getString(0x7f0f009b);
			}

			{
				a = ThemePreviewActivity.this;
				// super();
			}
		}, null, this, true, new ux[0]);
	}

	// public Bitmap a(String s1) {
	// SoftReference reference = null;
	// if (e == null) {
	// reference = null;
	// } else {
	// reference = (SoftReference) e.get(s1);
	// }
	// if (s1 == null) {
	// return null;
	// } else {
	// return (Bitmap) reference.get();
	// }
	// }
	public Bitmap a(String var1) {
		SoftReference var2;
		if (this.e == null) {
			var2 = null;
		} else {
			var2 = (SoftReference) this.e.get(var1);
		}

		return var2 == null ? null : (Bitmap) var2.get();
	}

	public File a() {
		if (d >= 0 && d < c.size()) {
			Object obj = (ox) c.get(d);
			if (e != null && !e.isEmpty()) {
				obj = ((ox) (obj)).h();
				obj = (SoftReference) e.get(obj);
				if (obj == null) {
					obj = null;
				} else {
					obj = (Bitmap) ((SoftReference) (obj)).get();
				}
				if (tf.b(((Bitmap) (obj)))) {
					if (p != null) {
						tq.b(p);
					}
					String s1 = (new StringBuilder())
							.append("theme_share_capture_").append(q)
							.append(".jpg").toString();
					q++;
					q %= 10;
					Bitmap bitmap = tf.a(getApplicationContext(),
							((Bitmap) (obj)));
					try {
						tf.a(bitmap, s1,
								android.graphics.Bitmap.CompressFormat.JPEG);
					} catch (Throwable e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					p = new File(um.d(), (new StringBuilder()).append("files/")
							.append(s1).toString());
					if (obj != bitmap) {
						tf.a(bitmap);
					}
					return p;
				}
			}
		}
		return null;
	}

	public void a(int i1) {
		TextView textview = (TextView) j.getCurrentView();
		if (((ox) c.get(i1)).i()) {
			textview.setText(0x7f0f0099);
		}
	}

	public void a(tc tc1) {
		r.obtainMessage(1, tc1).sendToTarget();
	}

	public void b(int i1) {
		c(i1);
	}

	public void b(tc tc1) {
	}

	public void c(tc tc1) {
		if (e == null) {
			e = new HashMap();
		}
		e.put(tc1.a(), new SoftReference(tc1.b()));
	}

	public void onClick(DialogInterface dialoginterface, int i1) {
		ja.a().a("HolaLauncher\u4E0B\u8F7D");
		vk.f(this,
				"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_theme");
	}

	public void onClick(View view) {
		

		switch (view.getId()) {
		default:
			return;
		case 2131492884:
			f();
			return;
		case 2131492885:
			finish();
			return;
		case 2131492888:

			f();
			return;
		case 2131492889:
			finish();
			return;
		case 2131492896:
			g();
			return;

		case 2131492900:

			if (d >= 0 && d < c.size()) {
				ox ox1 = (ox) c.get(d);
				((TextView) view).setText(0x7f0f0099);
				SwipeService.a(this, ox1.g);
				return;
			}
			return;
		case 2131492901:

			if (d >= 0 && d < c.size()) {
				ox ox1 = (ox) c.get(d);
				((TextView) view).setText(0x7f0f0099);
				SwipeService.a(this, ox1.g);
				return;
			}
		}

	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(0x7f040005);
		b = new tb(this, this, e());
		b.a(this);
		g = findViewById(0x7f0c0011);
		l = (TextView) findViewById(0x7f0c001d);
		findViewById(0x7f0c0024).setOnClickListener(this);
		findViewById(0x7f0c0025).setOnClickListener(this);
		f = (ThemePreviewSlideView) findViewById(0x7f0c001e);
		f.setOnScreenSwitchedListener(this);
		h = (ViewSwitcher) findViewById(0x7f0c0012);
		i = (ViewSwitcher) findViewById(0x7f0c0013);
		j = (ViewSwitcher) findViewById(0x7f0c0023);
		int i1 = getResources().getColor(0x7f0a0025);
		float f1 = vk.a(this, 2.0F);
		j.getCurrentView().setBackgroundDrawable(xd.a(i1, f1));
		j.getNextView().setBackgroundDrawable(xd.a(i1, f1));
		findViewById(0x7f0c0015).setOnClickListener(this);
		findViewById(0x7f0c0019).setOnClickListener(this);
		m = tf.a(this, 0x7f020005);
		k = (ViewSwitcher) findViewById(0x7f0c0020);
		k.setOnClickListener(this);
		n = (TextView) findViewById(0x7f0c0014);
		o = (TextView) findViewById(0x7f0c0018);
		if (ol.a()
				&& getExternalCacheDir() != null
				&& (new File(getExternalCacheDir(), "app_promotion.png"))
						.exists()) {
			n.setOnClickListener(this);
			o.setOnClickListener(this);
			return;
		} else {
			n.setVisibility(8);
			o.setVisibility(8);
			return;
		}
	}

	public void onDestroy() {
		super.onDestroy();
		d();
		if (f != null) {
			f.setAdapter(null);
		}
		b.a();
		tf.a(m);
	}

	protected void onResume() {
		super.onResume();
		c();
		SwipeService.b(this);
	}

}
