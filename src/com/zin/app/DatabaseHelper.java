package com.lazyswipe.app;

/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */

import java.util.Iterator;
import java.util.List;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.features.guide.UpgradeGuideActivity;
import com.main.ir;
import com.main.ja;
import com.main.ji;
import com.main.ju;
import com.main.jz;
import com.main.ka;
import com.main.kb;
import com.main.kc;
import com.main.kd;
import com.main.ke;
import com.main.kf;
import com.main.kg;
import com.main.kh;
import com.main.ki;
import com.main.kk;
import com.main.kl;
import com.main.km;
import com.main.kp;
import com.main.kq;
import com.main.kr;
import com.main.oy;
import com.main.pv;
import com.main.rc;
import com.main.tf;
import com.main.tj;
import com.main.ub;
import com.main.uj;
import com.main.uk;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public final class DatabaseHelper extends SQLiteOpenHelper {
	public DatabaseHelper(Context context) {
		super(context, "data.db", null, 16);
	}

	private void a(Context context) {
		List list = rc.k(context);
		if (list != null && list.size() > 0) {
			Iterator iterator = list.iterator();
			boolean bl = false;
			while (iterator.hasNext()) {
				String string = (String) iterator.next();
				if (!string.equals((Object) "GPS")
						&& !string.equals((Object) "Sync"))
					continue;
				iterator.remove();
				if (!bl) {
					bl = true;
				}
				Log.i((String) "Swipe.Provider", (String) ("Removed tile "
						+ string + " which is no longer available"));
			}
			if (bl) {
				rc.c(context, rc.a(list));
			}
		}
	}

	private void a(SQLiteDatabase sQLiteDatabase) {
		ka.a(sQLiteDatabase);
		kk.a(sQLiteDatabase);
	}

	private void b(SQLiteDatabase sQLiteDatabase) {
		kh.a(sQLiteDatabase);
	}

	private void c(SQLiteDatabase sQLiteDatabase) {
		ke.a(sQLiteDatabase);
	}

	private void d(SQLiteDatabase sQLiteDatabase) {
		kb.a(sQLiteDatabase);
	}

	private void e(SQLiteDatabase sQLiteDatabase) {
		kl.a(sQLiteDatabase);
	}

	private void f(SQLiteDatabase sQLiteDatabase) {
		kc.a(sQLiteDatabase);
		kd.a(sQLiteDatabase);
	}

	private void g(SQLiteDatabase sQLiteDatabase) {
		km.a(sQLiteDatabase);
		kp.b(sQLiteDatabase);
		kq.a(sQLiteDatabase);
	}

	private void h(SQLiteDatabase sQLiteDatabase) {
		kr.a(sQLiteDatabase);
	}

	private void i(SQLiteDatabase sqlitedatabase) {
		Object obj;
		kf.a(sqlitedatabase);
		kg.a(sqlitedatabase);
		SwipeApplication swipeapplication = SwipeApplication.e();
		ContentValues contentvalues;
		Iterator iterator;
		pv pv1;
		android.graphics.Bitmap bitmap;
		android.graphics.Bitmap bitmap1;
		byte abyte0[];
		int j;
		int k;
		long l;
		if (oy.a()) {
			j = 13;
		} else {
			j = 9;
		}
		obj = tj.a(swipeapplication, j, "-7 days");
		if (obj != null) {
			k = ((List) (obj)).size();
			ja.a().a("\u8054\u7CFB\u4EBA\u521D\u59CB\u5316", "count",
					String.valueOf(k));
			if (k < j) {
				obj = tj.a(swipeapplication, j, "-30 days");
			}
			if (k <= 0) {

				return;

			} else {
				contentvalues = new ContentValues(4);
				iterator = ((List) (obj)).iterator();
				j = 0;
			}

			if (!iterator.hasNext()) {

				return;
			} else {

				pv1 = (pv) iterator.next();
				contentvalues.put("_order", Integer.valueOf(j));
				contentvalues.put("uri", pv1.c.toString());
				if (!TextUtils.isEmpty(pv1.d)) {
					contentvalues.put("name", pv1.d);
				}
				if (pv1.e != null) {

					contentvalues.put("thumb", pv1.e.toString());
					obj = ContentUris
							.withAppendedId(
									android.provider.ContactsContract.Contacts.CONTENT_URI,
									Long.parseLong(pv1.c.getLastPathSegment()));
					obj = android.provider.ContactsContract.Contacts
							.openContactPhotoInputStream(
									swipeapplication.getContentResolver(),
									((Uri) (obj)));
					bitmap1 = tf.a(swipeapplication,
							((java.io.InputStream) (obj)));
					bitmap = tj.a(bitmap1);
					tf.a(bitmap1);
					abyte0 = tf.d(bitmap);
					tf.a(bitmap);

					if (abyte0.length > 0) {
						contentvalues.put("image", abyte0);
					}
					ub.a(((java.io.Closeable) (obj)));
				}

			}

			l = sqlitedatabase.insert("contact", null, contentvalues);
			if (l > 0L) {

				obj = pv1.c.getLastPathSegment();
			
				try {
					contentvalues.clear();
					contentvalues.put("contact_id", Long.valueOf(l));
					contentvalues.put("app", uk.b);
					contentvalues.put("key", tj.b(pv1.c, SwipeApplication.e()));
					sqlitedatabase.insert("contact_app_key", null,
							contentvalues);
					contentvalues.clear();
					contentvalues.put("contact_id", Long.valueOf(l));
					contentvalues.put("app", uk.a);
					contentvalues.put("key", tj.a(pv1.c, SwipeApplication.e()));
					sqlitedatabase.insert("contact_app_key", null,
							contentvalues);
					contentvalues.clear();
					contentvalues.put("contact_id", Long.valueOf(l));
					contentvalues.put("app", uk.c);
					contentvalues.put("key",
							tj.a(((String) (obj)), SwipeApplication.e()));
					sqlitedatabase.insert("contact_app_key", null,
							contentvalues);
					contentvalues.clear();
					contentvalues.put("contact_id", Long.valueOf(l));
					contentvalues.put("app", uk.d);
					obj = tj.b(((String) (obj)), SwipeApplication.e());
					contentvalues.put("key", ((String) (obj)));
					sqlitedatabase.insert("contact_app_key", null,
							contentvalues);
					contentvalues.clear();
					contentvalues.put("contact_id", Long.valueOf(l));
					contentvalues.put("app", uk.e);
					contentvalues.put("key", ((String) (obj)));
					sqlitedatabase.insert("contact_app_key", null,
							contentvalues);
				} catch (Throwable throwable1) {
				} finally {
				}
				contentvalues.clear();
				j++;
			}
		}
		ub.a(((java.io.Closeable) (obj)));

	}

	public SQLiteDatabase getWritableDatabase() {
		try {
			SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
			return sQLiteDatabase;
		} catch (ju var1_2) {
			vj.a("Swipe.Provider", "Delete the database file for downgrade");
			SwipeApplication.e().deleteDatabase("data.db");
			return super.getWritableDatabase();
		}
	}

	public void onCreate(SQLiteDatabase sQLiteDatabase) {
		vj.a("Swipe.Provider", "Database create: 16");
		ki.a(sQLiteDatabase);
		this.a(sQLiteDatabase);
		this.b(sQLiteDatabase);
		this.c(sQLiteDatabase);
		this.d(sQLiteDatabase);
		this.e(sQLiteDatabase);
		this.f(sQLiteDatabase);
		this.g(sQLiteDatabase);
		this.h(sQLiteDatabase);
		this.i(sQLiteDatabase);
	}

	public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
		vj.a("Swipe.Provider", "Database downgrade: " + n + " -> " + n2);
		// throw new ju(null);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
		boolean bl;
		vj.a("Swipe.Provider", "Database upgrade: " + n + " -> " + n2);
		if (n < 2) {
			ki.b(sQLiteDatabase);
		}
		if (n < 3) {
			ki.a(sQLiteDatabase, (SQLiteOpenHelper) this);
		}
		if (n < 4) {
			this.a(sQLiteDatabase);
			bl = false;
		} else {
			bl = true;
		}
		if (n < 5) {
			ki.b(sQLiteDatabase, (SQLiteOpenHelper) this);
		}
		SwipeApplication swipeApplication = SwipeApplication.e();
		if (n < 6) {
			this.b(sQLiteDatabase);
			ki.c(sQLiteDatabase);
			ir.a((Context) swipeApplication, "", false);
			if (uj.d((Context) swipeApplication)) {
				ji.a((Context) swipeApplication);
			}
			ir.e((Context) swipeApplication, false);
			ir.a((Context) swipeApplication).edit()
					.remove("key_settings_launch_count").apply();
		}
		if (n < 7) {
			this.c(sQLiteDatabase);
		}
		if (n < 8 && bl) {
			ka.b(sQLiteDatabase);
		}
		if (n < 9) {
			kh.b(sQLiteDatabase);
			jz.a(sQLiteDatabase);
			this.d(sQLiteDatabase);
			ir.a((Context) swipeApplication).edit()
					.putInt("key_tutorial_step", 98).apply();
		}
		if (n < 10) {
			ir.j((Context) swipeApplication);
		}
		if (n < 11) {
			this.e(sQLiteDatabase);
		}
		if (n < 12) {
			ke.b(sQLiteDatabase);
			kl.b(sQLiteDatabase);
			this.f(sQLiteDatabase);
		}
		if (n < 13) {
			ir.j((Context) swipeApplication);
			kl.c(sQLiteDatabase);
			this.g(sQLiteDatabase);
		}
		if (n < 14) {
			this.h(sQLiteDatabase);
			ka.c(sQLiteDatabase);
		}
		if (n < 15) {
			this.a((Context) swipeApplication);
			SharedPreferences sharedPreferences = ir
					.a((Context) swipeApplication);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			if (!sharedPreferences.contains("key_toucher_size_scale")) {
				editor.putInt("key_toucher_size_scale", 48);
			}
			editor.remove("key_hint_edit_switcher")
					.remove("key_hint_edit_favorites").apply();
		}
		if (n < 16) {
			UpgradeGuideActivity.a = true;
			this.i(sQLiteDatabase);
			ir.a((Context) swipeApplication).edit()
					.remove("key_recent_contacts")
					.remove("key_notification_details")
					.remove("key_hint_dismiss_notifications")
					.remove("key_last_accessibility_action_tip_shown").apply();
		}
	}

}
