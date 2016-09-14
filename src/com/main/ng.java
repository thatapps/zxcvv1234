package com.main;

import java.lang.ref.WeakReference;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.notification.sms.ContactEditPanel;
import com.lazyswipe.zev.R;

//zevienin

public class ng {

	public static final ng a;
	public static final ng b;
	public static final ng c;
	public static final ng d;
	public static final ng e;
	public static final ng f;
	private static final String h = (new StringBuilder()).append("Swipe.")
			.append(ng.class.getSimpleName()).toString();
	private static final ng n[];
	public final int g;
	private String i;
	private int j;
	private int k;
	private boolean l;
	private WeakReference m;

	enum Foo {
		
	}

	static Class cls = Foo.class;

	private ng(String s, int i1, String s1, int j1, int k1, boolean flag) {
		this(s, i1, s1, j1, k1, flag, 0);
	}

	private ng(String s, int i1, String s1, int j1, int k1, boolean flag, int l1) {
		super();
		g = l1;
		i = s1;
		j = j1;
		k = k1;
		l = flag;
	}

	public static String a(int i1) {
		return SwipeApplication.e().getString(i1);
	}

	public static ng c(String s) {
		if (uk.a.equals(s)) {
			return d;
		} else {
			return a;
		}
	}

	public static Context f() {
		return SwipeApplication.e();
	}

	public static ng valueOf(String s) {

		return Enum.valueOf(cls, s);
	}

	public static ng[] values() {
		return (ng[]) n.clone();
	}

	public String a() {
		return i;
	}

	public String a(String s) {
		return s;
	}

	public boolean a(pv pv1) {
		return b(pv1) != null;
	}

	// public boolean a(pv pv, WeakReference weakReference) {
	// final String[] arrstring = this.b(pv);
	// if (arrstring == null || arrstring.length == 0) {
	// return true;
	// }
	// if (arrstring.length == 1) {
	// return this.b(arrstring[0]);
	// }
	// String[] arrstring2 = new String[arrstring.length];
	// for (int i = 0; i < arrstring.length; ++i) {
	// arrstring2[i] = this.a(arrstring[i]);
	// }
	// new wz(ng.f())
	// .a((CharSequence) pv.d)
	// .a((CharSequence[]) arrstring2,
	// (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
	//
	// public void onClick(
	// DialogInterface dialogInterface, int n) {
	// if (n >= 0 && n < arrstring.length
	// && ng.this.b(arrstring[n])) {
	// Fan.k();
	// }
	// }
	// }).e();
	// return false;
	// }
	public boolean a(pv pv1, WeakReference weakreference) {
		String[] str = b(pv1);
		if (str == null || str.length == 0) {
			return true;
		}
		if (str.length == 1) {
			return b(str[0]);
		}
		final String as[] = new String[str.length];
		for (int i1 = 0; i1 < str.length; i1++) {
			as[i1] = a(str[i1]);
		}

		(new wz(f())).a((CharSequence) pv1.d)
				.a(as, new android.content.DialogInterface.OnClickListener() {

					final String a[];
					final ng b;

					public void onClick(DialogInterface dialoginterface, int j1) {
						if (j1 >= 0 && j1 < a.length && b.b(a[j1])) {
							Fan.k();
						}
					}

					{
						b = ng.this;
						a = as;
						// super();
					}
				}).e();
		return false;
	}

	public String b() {
		return "";
	}

	public boolean b(String s) {
		Log.i(h, (new StringBuilder()).append("handleIntent ").append(s)
				.toString());
		return true;
	}

	// public String[] b(pv pv) {
	// pu pu = (pu) pv.g.get((Object) this.i);
	// if (pu == null) {
	// return null;
	// }
	// return (String[]) pu.a().toArray((Object[]) new String[pu.a().size()]);
	// }
	public String[] b(pv pv1) {
		pu pu = (pu) pv1.g.get(i);
		if (pu == null) {
			return null;
		} else {
			return (String[]) pu.a().toArray(new String[pu.a().size()]);
		}
	}

	public Drawable c() {
		if (m != null && m.get() != null) {
			return (Drawable) m.get();
		} else {
			m = new WeakReference(d());
			return (Drawable) m.get();
		}
	}

	protected BitmapDrawable d() {
		int j1 = vk.a(SwipeApplication.e(), 40F);
		Object obj1 = new Paint(7);
		Object obj;
		Canvas canvas;
		int i1;
		int k1;
		if (l) {
			obj = android.graphics.Paint.Style.FILL;
		} else {
			obj = android.graphics.Paint.Style.STROKE;
		}
		((Paint) (obj1)).setStyle(((android.graphics.Paint.Style) (obj)));
		((Paint) (obj1)).setStrokeWidth(2.0F);
		((Paint) (obj1)).setColor(j);
		obj = Bitmap.createBitmap(j1, j1,
				android.graphics.Bitmap.Config.ARGB_8888);
		canvas = new Canvas(((Bitmap) (obj)));
		if (l) {
			i1 = j1 / 2;
		} else {
			i1 = (j1 - 2) / 2;
		}
		canvas.drawCircle(j1 / 2, j1 / 2, i1, ((Paint) (obj1)));
		obj1 = tf.a(SwipeApplication.c(), k);
		i1 = (int) ((float) ((Bitmap) (obj1)).getWidth() * 0.8F);
		k1 = (int) ((float) ((Bitmap) (obj1)).getHeight() * 0.8F);
		canvas.drawBitmap(((Bitmap) (obj1)), null, new Rect((j1 - i1) / 2,
				(j1 - k1) / 2, (i1 + j1) / 2, (j1 + k1) / 2), null);
		return new BitmapDrawable(SwipeApplication.c(), ((Bitmap) (obj)));
	}

	public TextView e() {
		TextView textview = new TextView(f());
		textview.setTextColor(-1);
		textview.setGravity(17);
		textview.setTextSize(10F);
		textview.setTag(this);
		textview.setCompoundDrawablePadding(vk.a(f(), 3F));
		textview.setCompoundDrawablesWithIntrinsicBounds(null, c(), null, null);
		textview.setText(b());
		return textview;
	}

	static {
		a = new ng("PHONE", 0, "phone", 0xff00dba2, 0x7f020045, true, 1) {

			public String b() {
				return a(0x7f0f0006);
			}

			public boolean b(String s) {
				vh.b(f(), s);
				return true;
			}

		};
		b = new ng("SMS", 1, "sms", -16128, 0x7f020044, true, 2) {

			public String b() {
				return a(0x7f0f0062);
			}

			public boolean b(String s) {
				vh.a(f(), s);
				return true;
			}

		};
		c = new ng("MAIL", 2, "email", -64904, 0x7f020043, true) {

			public boolean a(pv pv1) {
				return /*a(pv1) &&*/ vk.a(vk.j("test@gmail.com"));
			}

			public String b() {
				return a(0x7f0f0060);
			}

			public boolean b(String s) {
				Intent intent = vk.j(s);
				vk.c(f(), intent);
				return false;
			}

		};
		d = new ng("WHATSAPP", 3, "com.whatsapp", 0xff43b800, 0x7f020048, true,
				3) {

			private Intent d(String s) {
				Intent intent = new Intent("android.intent.action.MAIN");
				intent.setComponent(new ComponentName(uk.a,
						"com.whatsapp.Conversation"));
				intent.putExtra("jid", s);
				return intent;
			}

			public String a(String s) {
				String s1;
				try {
					s1 = s.split("@")[0];
				} catch (Exception exception) {
					return s;
				}
				return s1;
			}

			public boolean a(pv pv1) {
				return /*a(pv1) &&*/ vk.a(d("test@s.whatsapp.net"));
			}

			public String b() {
				return vk.d(f(), a());
			}

			public boolean b(String s) {
				Intent intent = d(s);
				vk.c(f(), intent);
				return true;
			}

		};
		e = new ng("WEIXIN", 4, "com.tencent.mm", 0xff43b800, 0x7f020047, true,
				4) {

			public String b() {
				return vk.d(f(), a());
			}

			public boolean b(String s) {
				Intent intent = new Intent("android.intent.action.VIEW");
				intent.setDataAndType(Uri.withAppendedPath(
						android.provider.ContactsContract.Data.CONTENT_URI, s),
						"vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile");
				vk.c(f(), intent);
				return b(s);
			}

		};
		f = new ng("EDITOR", 5, "editor", -1, 0x7f020031, false) {

			public boolean a(pv pv1) {
				return true;
			}

			public boolean a(pv pv1, WeakReference weakreference) {
				ContactEditPanel.a(f(), pv1, weakreference);
				return false;
			}

			public String b() {
				return "";
			}

		};
		n = (new ng[] { a, b, c, d, e, f });
	}
}
