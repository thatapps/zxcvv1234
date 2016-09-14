package com.main;

import java.util.Locale;

import org.json.JSONException;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;

import com.lazyswipe.SwipeApplication;

public class ol {
	private static final Object D;
	private static ol E;
	public static final String a;
	public static final String[] b;
	public static final String[] c;
	public static final String[] d;
	public static int e;
	public static int f;
	public static int g;
	public static int h;
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int n;
	public static int o;
	public static int p;
	public static int q;
	public static int r;
	public static final int s;
	public static final on t;
	public static  boolean u;
	volatile ok A;
	volatile ok B;
	tw C;
	final Context v;
	volatile int w;
	volatile int x;
	volatile ok y;
	volatile ok z;

	static {
		a = "Swipe." + ol.class.getSimpleName();
		b = new String[] { "af", "gg", "fb" };
		c = new String[] { "appbox", "lucky", "message" };
		d = new String[] { "packageName", "adUrl", "offer_id", "market_url",
				"clickLogUrl", "resolve_failed", "icon", "_id", "title",
				"shortDesc", "category", "size", "vendor", "vendor_addition" };
		e = 0;
		f = 1;
		g = 2;
		h = 3;
		i = 4;
		j = 5;
		k = 6;
		l = 7;
		m = 8;
		n = 9;
		o = 10;
		p = 11;
		q = 12;
		r = 13;
		D = new Object();
		u = false;
		t = new on();
		if (ol.a()) {
			on.a(t);
		}
		s = SwipeApplication.e().getResources()
				.getDimensionPixelSize(0x7f0b0052);
	}

	private ol(Context paramContext) {
		this.v = paramContext.getApplicationContext();
		this.y = new ok();
		this.z = this.y;
		this.A = new ok();
		this.B = this.A;
		try {
			this.v.getContentResolver().delete(km.a, "ts<=0", null);
			new oo(this, new Handler()).a();
			return;
		} catch (Throwable localThrowable) {

		}
	}

	public static int a(Context paramContext, String paramString, int paramInt) {
		return b(paramContext, paramString, paramInt, 1);
	}

	public boolean a(ContentResolver contentresolver, int i1, int j1) {
		ContentResolver contentresolver1;
		StringBuilder stringbuilder;
		int l1;
		contentresolver1 = null;
		l1 = t.a(i1, j1);
		if (l1 >= 100) {
			return true;
		}
		stringbuilder = new StringBuilder();
		for (int k1 = 0; k1 < 3; k1++) {
			stringbuilder.append("SUM(CASE ").append("vendor").append(" WHEN ")
					.append(k1).append(" THEN 1 ELSE 0 END), ");
		}

		stringbuilder.append("COUNT(*)");
		Cursor cursor = contentresolver.query(km.a,
				new String[] { stringbuilder.toString() }, "placement=?",
				new String[] { String.valueOf(i1) }, null);
		if (!cursor.moveToFirst()) {
			// break MISSING_BLOCK_LABEL_186;
		}
		i1 = cursor.getInt(3);
		j1 = cursor.getInt(j1);
		boolean flag;
		if ((int) (((float) j1 * 100F) / (float) i1) < l1) {
			flag = true;
		} else {
			flag = false;
		}
		if (cursor != null) {
			cursor.close();
		}

		if (contentresolver != null) {
			cursor.close();
		}
		return flag;
	}

	/* Error */
	public static int a(Context context, String s1, int i1, int j1, int k1,
			int l1) {
		Object obj;
		a(context, true);
		obj = String
				.format(Locale.US,
						"%6$slocale=%1$s&level=%2$d&app=%3$s&category=%4$s&placement=%5$s&page=%7$d&psize=%8$d",
						new Object[] {
								vk.j(),
								Integer.valueOf(android.os.Build.VERSION.SDK_INT),
								"400105", "902", c[i1], s1,
								Integer.valueOf(j1), Integer.valueOf(k1) });
		vj.a(a, (new StringBuilder()).append("Getting app data #").append(j1)
				.append("...").toString());
		obj = tz.a(context, ((String) (obj)), 30000, 30000);
		if (uq.a != ((up) (obj)).a) {

			return 0;
		} else {

			jh jh1 = null;
			int i2;
			try {
				jh1 = new jh(((up) (obj)).c, i1);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i2 = jh1.a(context, j1);
			if (j1 != 1) {
				// break MISSING_BLOCK_LABEL_174;
			}
			int j2 = jh1.a();
			l1 = j2;
			if (i2 > 0) {

				if (j1 >= l1) {
					return 0;
				} else {

					return a(context, s1, i1, j1 + 1, k1, l1) + i2;
				}

			} else {
				vj.b(a,
						(new StringBuilder())
								.append("Could not parse the json string: ")
								.append(((up) (obj)).c).toString());
				return 0;
			}

		}

	}

	public static int a(String s1) {
		byte byte1 = 0;
		s1.hashCode();
		// JVM INSTR lookupswitch 3: default 40
		// -853968690: 87
		// -181391574: 72
		// 1884723983: 102;
		// goto _L1 _L2 _L3 _L4
		// _L1:
		byte byte0 = -1;

		if (!s1.equals("774443062592078_841894569180260")) {
			byte0 = -1;
		} else {
			byte0 = 1;

			switch (byte0) {
			default:
				byte1 = -1;
				// fall through

			case 0: // '\0'
				return byte1;

			case 1: // '\001'
				return 1;

			case 2: // '\002'
				return 2;
			}

		}
		if (!s1.equals("774443062592078_835714899798227")) {
			byte0 = -1;

		} else {

			byte0 = 0;
			switch (byte0) {
			default:
				byte1 = -1;
				// fall through

			case 0: // '\0'
				return byte1;

			case 1: // '\001'
				return 1;

			case 2: // '\002'
				return 2;
			}

		}

		if (!s1.equals("774443062592078_836557529713964")) {
			byte0 = -1;
		} else {
			byte0 = 2;
			switch (byte0) {
			default:
				byte1 = -1;
				// fall through

			case 0: // '\0'
				return byte1;

			case 1: // '\001'
				return 1;

			case 2: // '\002'
				return 2;
			}

		}
		return (Integer) null;
	}

	public static String a(Context paramContext, int paramInt1, int paramInt2) {
		return a(paramContext, paramInt1, paramInt2, s);
	}

	public static String a(Context paramContext, int paramInt1, int paramInt2,
			int paramInt3) {
		StringBuilder localStringBuilder = new StringBuilder()
				.append(paramContext.getExternalCacheDir()).append("/")
				.append(paramInt1).append("_").append(paramInt2);
		if (paramInt3 > 0) {
		}
		for (String str = "_" + s;; str = "") {
			return str + ".png";
		}
	}

	public static ok a(Context paramContext, int paramInt) {
		ol localol = a(paramContext);
		if (localol != null) {
		}
		for (ok localok = localol.a(paramInt);; localok = null) {
			return localok;
		}
	}

	public static ol a(Context paramContext) {
		return a(paramContext, false);
	}

	public static ol a(Context paramContext, boolean paramBoolean) {
		synchronized (D) {
			if ((E == null) && (paramBoolean)) {
				E = new ol(paramContext);
			}
			return E;
		}
	}

	public static void a(final Context context, final int n, final int n2,
			final int n3, boolean bl) {
		ui.a((Runnable) new Runnable() {

			/*
			 * Enabled aggressive block sorting Enabled unnecessary exception
			 * pruning
			 */
			public void run() {
				int n4 = a != null ? 6 : 5;
				ContentValues contentValues = new ContentValues(n4);
				contentValues.put("offer_id", Integer.valueOf((int) n));
				contentValues.put("ts",
						Long.valueOf((long) System.currentTimeMillis()));
				contentValues.put("placement", Integer.valueOf((int) n3));
				contentValues.put("vendor", Integer.valueOf((int) n2));
				if (a != null) {
					contentValues.put("key_suppress_notify",
							Integer.valueOf((int) 0));
				}
				contentValues.put("key_replace_if_exists",
						Integer.valueOf((int) 0));
				try {
					context.getContentResolver().insert(km.a, contentValues);
					return;
				} catch (Throwable var3_3) {
					return;
				}
			}
		});
		if (2 == n2) {
			jc.b("fb", n3);
		}
	}

	private static void a(Context context, int n, int n2, String string,
			String string2, int n3, boolean bl, op op, boolean bl2) {
		if (n == or.a) {
			return;
		}
		or or = new or(context, n, n2, string, string2, n3, bl, op, bl2);
		if (!vk.o()) {
			or.run();
			return;
		}
		ui.a(ji.a, (Runnable) or);
	}

	public static void a(final Context context, final String string, int n,
			int n2) {
		if (!TextUtils.isEmpty((CharSequence) string)) {
			ui.a((Runnable) new Runnable() {

				public void run() {
					tz.a(context, string);
				}
			});
		}
		jc.a(n, n2);
	}

	public static boolean a() {
		if (E != null && E.C == null && vk.o()) {
			E.C = tu.a(SwipeApplication.e());
		}
		return !vk.k();
	}

	public static boolean a(Context paramContext, ok paramok, op paramop) {
		return a(paramContext, paramok, paramop, false);
	}

	public static boolean a(Context paramContext, ok paramok, op paramop,
			boolean paramBoolean) {
		return a(paramContext, paramok.l, paramok.c, paramok.q, paramok.k,
				paramok.b, paramok.d, paramok.a, paramok.m, paramop,
				paramBoolean);
	}

	public static boolean a(Context paramContext, boolean paramBoolean,
			int paramInt1, int paramInt2, String paramString1,
			String paramString2, String paramString3, String paramString4,
			int paramInt3, op paramop) {
		return a(paramContext, paramBoolean, paramInt1, paramInt2,
				paramString1, paramString2, paramString3, paramString4,
				paramInt3, paramop, false);
	}

	public static boolean a(final Context context, boolean bl, int n, int n2,
			final String string, String string2, String string3,
			String string4, int n3, op op, boolean bl2) {
		boolean bl3;
		if (!TextUtils.isEmpty((CharSequence) string3)) {
			ui.a((Runnable) new Runnable() {

				public void run() {
					tz.a(context, string);
				}
			});
		}
		if (!bl) {
			if (TextUtils.isEmpty((CharSequence) string)) {
				ol.a(context, n, n2, string2, string4, n3, true, op, bl2);
				return false;
			}
			vk.f(context, string);
			jc.d(n, n3);
			bl3 = true;
		} else {
			vk.f(context, string4);
			bl3 = true;
		}
		if (bl3) {
			if (bl2)
				return false;
			return true;
		}
		return false;
	}

	public static int b(Context paramContext, String paramString,
			int paramInt1, int paramInt2) {
		return a(paramContext, paramString, paramInt1, paramInt2, 30, 1);
	}

	private ok b() {
		int i1;
		int j1;
		int k1;
		j1 = 0;
		k1 = 0;
		i1 = 0;
		ok ok1 = null;
		boolean flag = false;
		Object obj;
		if (w <= 0) {

			y = null;

			i1 = j1;
			j1 = ((flag) ? 1 : 0);
			a(j1, 1, i1);

		} else {
			if (y == null) {
				// break MISSING_BLOCK_LABEL_88;
			}
			j1 = y.c;
			i1 = k1;
			k1 = y.q;
			i1 = k1;
			ok1 = y.b();
			y = null;

		}
		return ok1;

	}

	static void b(Context context) {
		if (vk.o()) {
			ui.a(ji.a, (Runnable) new oq(context));
			return;
		}
		oq.a(context);
	}

	private ok c() {
		int i1;
		int j1;
		int k1;
		j1 = 0;
		k1 = 0;
		i1 = 0;
		Object obj;

		if (x <= 0) {
			boolean flag = false;
			i1 = j1;
			j1 = ((flag) ? 1 : 0);
			a(j1, 2, i1);
			return null;

		} else {

			if (A == null) {
				// break MISSING_BLOCK_LABEL_88;
			}
			j1 = 0;
			j1 = A.c;
			i1 = k1;
			k1 = A.q;
			i1 = k1;
			ok ok1 = A.b();
			A = null;

			return ok1;
		}

	}

	public ok a(int n) {
		switch (n) {
		default: {
			return null;
		}
		case 1: {
			return this.b();
		}
		case 2:
		
		return this.c();
	}}

	void a(final int n, final int n2, final int n3) {
		ui.a((Runnable) new Runnable() {

			/*
			 * Unable to fully structure code Enabled force condition
			 * propagation Lifted jumps to return sites
			 */
			public void run() {
				if (n > 0) {
					ol.this.a(n, n2, n3, true);
				}
				// lbl4: // 4 sources:
				do {
					try {
						ol.this.b(n2);
						return;
					} catch (Throwable var1_1) {
						return;
					}
					// break;
				} while (true);

			}
		});
	}

	void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
		ContentResolver localContentResolver = this.v.getContentResolver();
		if (paramBoolean) {
			ContentValues localContentValues = new ContentValues(6);
			localContentValues
					.put("key_suppress_notify", Boolean.valueOf(true));
			localContentValues.put("offer_id", Integer.valueOf(paramInt1));
			localContentValues.put("ts", Integer.valueOf(0));
			localContentValues.put("placement", Integer.valueOf(paramInt2));
			localContentValues.put("vendor", Integer.valueOf(paramInt3));
			localContentValues.put("key_replace_if_exists", Integer.valueOf(0));
			localContentResolver.insert(km.a, localContentValues);
		}

		Uri localUri = km.a;
		String[] arrayOfString = new String[3];
		arrayOfString[0] = String.valueOf(paramInt2);
		arrayOfString[1] = String.valueOf(this.z.c);
		arrayOfString[2] = String.valueOf(paramInt3);
		localContentResolver.delete(localUri,
				"placement=?  AND offer_id=? AND vendor=?key_suppress_notify",
				arrayOfString);
		return;
	}

	public void a(Uri paramUri) {
		a(0, 0, 0);
	}

	public boolean a(Cursor contentresolver, int i1, int j1) {
		ContentResolver contentresolver1;
		StringBuilder stringbuilder;
		int l1;
		contentresolver1 = null;
		l1 = t.a(i1, j1);
		if (l1 >= 100) {
			return true;
		}
		stringbuilder = new StringBuilder();
		for (int k1 = 0; k1 < 3; k1++) {
			stringbuilder.append("SUM(CASE ").append("vendor").append(" WHEN ")
					.append(k1).append(" THEN 1 ELSE 0 END), ");
		}

		stringbuilder.append("COUNT(*)");
		contentresolver = contentresolver1.query(km.a,
				new String[] { stringbuilder.toString() }, "placement=?",
				new String[] { String.valueOf(i1) }, null);
		if (!((Cursor) contentresolver).moveToFirst()) {
			// break MISSING_BLOCK_LABEL_186;
		}
		i1 = contentresolver.getInt(3);
		j1 = contentresolver.getInt(j1);
		boolean flag;
		if ((int) (((float) j1 * 100F) / (float) i1) < l1) {
			flag = true;
		} else {
			flag = false;
		}
		if (contentresolver != null) {
			contentresolver.close();
		}

		if (contentresolver != null) {
			contentresolver.close();
		}

		if (contentresolver != null) {
			contentresolver.close();
		}

		return flag;

	}

	void b(int i1) {
		Object obj;
		Uri uri;
		Object obj2 = null;
		String[] obj1;
		if (i1 != 0) {
			ContentResolver contentresolver = v.getContentResolver();
			StringBuilder stringbuilder = (new StringBuilder(
					"resolve_failed<>1")).append(" AND ").append("vendor")
					.append("=?");

			if (t.b[i1]) {
				obj = " RANDOM() LIMIT 1";
			} else {
				obj = "ts, _order, _id LIMIT 1";
			}
			if (i1 == 1) {
				if (y != null) {
					z = y;
					y = null;

					if (z.c > 0) {
						try {
							b(z.c, i1, z.q);
						} catch (Throwable throwable1) {
						}
					}
				}
				obj1 = new String[1];
				obj1[0] = String.valueOf(0);
			} else {
				if (A != null) {
					B = A;
					A = null;
					if (B.c > 0) {
						try {
							b(B.c, i1, B.q);
						}
						// Misplaced declaration of an exception variable
						catch (Throwable throwable) {
						}
					}
				}
				obj1 = new String[1];
				obj1[0] = String.valueOf(0);
			}
			if (i1 != 1) {

				uri = kq.a;
				obj = contentresolver.query((Uri) uri, d,
						stringbuilder.toString(), ((String[]) (obj1)),
						((String) (obj)));
				if (i1 != 1) {
					obj = obj1;
					if (!((Cursor) (obj)).moveToFirst()) {

						obj = obj1;
						x = 0;
						if (obj1 != null) {
							
							((Cursor) (obj)).close();
							return;

						}

					} else {

						obj = obj1;
						A = B.a(((Cursor) (obj)));
						obj = obj1;
						x = 1;

						// obj1 = obj;
						obj = obj2;
						if (obj1 == null) {

							return;
						} else {
							((Cursor) (obj)).close();
							return;
						}

					}

				} else {
					obj = obj1;
					if (!((Cursor) (obj)).moveToFirst()) {

						obj = obj1;
						w = 0;
						if (obj1 == null) {
							return;
						} else {
							((Cursor) (obj)).close();
							return;

						}
					}

					else {

						obj = obj1;
						w = 1;
						obj = obj1;
						y = z.a(((Cursor) (obj)));

					}

				}

			} else {

				uri = kp.a;

			}

		} else {
			b(1);
			if (ir.d(v)) {
				b(2);
			}
		}

	}

	void b(int paramInt1, int paramInt2, int paramInt3) {
		a(paramInt1, paramInt2, paramInt3, false);
	}
}
