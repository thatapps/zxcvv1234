/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentProviderResult
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.UriMatcher
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package com.lazyswipe.app;

import java.util.ArrayList;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.jv;
import com.main.ka;
import com.main.kn;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
public class LazyProvider extends ContentProvider {
	private static final UriMatcher a = new UriMatcher(-1);
	private SQLiteOpenHelper b;
	private boolean c;

	static {
		a.addURI("com.lazyswipe", "application", 1);
		a.addURI("com.lazyswipe", "application/#", 2);
		a.addURI("com.lazyswipe", "banner", 3);
		a.addURI("com.lazyswipe", "banner/*", 4);
		a.addURI("com.lazyswipe", "op_log", 5);
		a.addURI("com.lazyswipe", "op_log/#", 6);
		a.addURI("com.lazyswipe", "blocked_contact", 7);
		a.addURI("com.lazyswipe", "blocked_contact/*", 8);
		a.addURI("com.lazyswipe", "default_favorites", 9);
		a.addURI("com.lazyswipe", "best_match_favorites", 10);
		a.addURI("com.lazyswipe", "promotion_app", 11);
		a.addURI("com.lazyswipe", "promotion_app/#", 12);
		a.addURI("com.lazyswipe", "lucky_app_sorted", 13);
		a.addURI("com.lazyswipe", "blocked_app", 14);
		a.addURI("com.lazyswipe", "blocked_app/*", 15);
		a.addURI("com.lazyswipe", "blocked_app_contact", 16);
		a.addURI("com.lazyswipe", "app_click", 17);
		a.addURI("com.lazyswipe", "notify_app_sorted", 18);
		a.addURI("com.lazyswipe", "touch_fix", 19);
		a.addURI("com.lazyswipe", "touch_fix/*", 20);
		a.addURI("com.lazyswipe", "contact", 21);
		a.addURI("com.lazyswipe", "contact_app_key", 22);
	}

	/*
	 * Loose catch block Enabled aggressive block sorting Enabled unnecessary
	 * exception pruning Lifted jumps to return sites
	 */
	private void a() {
		Context context = this.getContext();
		SharedPreferences sharedPreferences = ir.a(context);
		if (sharedPreferences.contains("key_notification_apps_selected"))
			return;
		String[] arrstring = context.getString(
				R.string.config_default_notification_apps).split(",");
		StringBuilder stringBuilder = new StringBuilder();
		PackageManager packageManager = context.getPackageManager();
		int n = arrstring.length;
		int n2 = 0;
		do {
			if (n2 < n) {
				String string = arrstring[n2];
				try {
					packageManager.getPackageInfo(string, 0);
				} catch (NameNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stringBuilder.append(string).append(',');
			} else {
				int n3 = stringBuilder.length();
				String string = n3 > 0 ? stringBuilder.substring(0, n3 - 1)
						: "";
				sharedPreferences.edit()
						.putString("key_notification_apps_selected", string)
						.apply();
				return;

			}
			++n2;
		} while (true);
	}

	private boolean a(ContentValues contentValues) {
		return this.a(contentValues, "key_suppress_notify");
	}

	private boolean a(ContentValues contentValues, String string) {
		boolean bl = contentValues.containsKey(string);
		if (bl) {
			contentValues.remove(string);
		}
		return bl;
	}

	private boolean a(Bundle bundle) {
		return this.a(bundle, "key_suppress_notify");
	}

	private boolean a(Bundle bundle, String string) {
		boolean bl = bundle.containsKey(string);
		if (bl) {
			bundle.remove(string);
		}
		return bl;
	}

	private boolean a(String string, long l) {
		try {
			SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
			Object[] arrobject = new Object[] { l, System.currentTimeMillis(),
					string };
			sQLiteDatabase
					.execSQL(
							" UPDATE banner SET time_showed=time_showed+?, seen=? WHERE code=?",
							arrobject);
			return true;
		} catch (Throwable var4_5) {
			vj.b("Swipe.Provider", "Could not update showed time for banner "
					+ string + ": " + var4_5.getMessage());
			return false;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private boolean a(String[] arrstring, int n) {
		StringBuilder stringBuilder = new StringBuilder()
				.append(" UPDATE application SET called_num=");
		String string = (String) (1 == n ? " CASE  WHEN 1==is_system THEN 15 ELSE 25 END "
				: Integer.valueOf((int) 2));
		String string2 = stringBuilder
				.append((Object) string)
				.append(" WHERE ")
				.append("package")
				.append(" IN(")
				.append("'")
				.append(TextUtils.join((CharSequence) "','",
						(Object[]) arrstring)).append("'").append(")")
				.append(" AND ").append("called_num").append("<=0").toString();
		try {
			this.b.getWritableDatabase().execSQL(string2, new Object[0]);
			return true;
		} catch (Throwable var6_6) {
			vj.b("Swipe.Provider",
					"Could not update call count of running packages: "
							+ var6_6.getMessage());
			return false;
		}
	}

	private boolean b(ContentValues contentValues) {
		return this.a(contentValues, "key_replace_if_exists");
	}

	public ContentProviderResult[] applyBatch(ArrayList arrayList) {
		try {
			return super.applyBatch(arrayList);
		} catch (OperationApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * Exception decompiling
	 */
	public int bulkInsert(Uri uri, ContentValues acontentvalues[]) {
		SQLiteDatabase sqlitedatabase;
		SQLiteDatabase sqlitedatabase1;
		String s;
		int i;
		int j, k;
		boolean flag;
		boolean flag1;
		boolean flag2;
		if (uri.getPathSegments().size() != 1) {
			throw new IllegalArgumentException((new StringBuilder())
					.append("Invalid uri: ").append(uri).toString());
		}
		s = jv.a(uri);
		i = acontentvalues.length;
		sqlitedatabase1 = null;
		sqlitedatabase = null;
		c = true;
		flag2 = false;
		flag1 = false;
		flag = flag2;
		j = i;
		SQLiteDatabase sqlitedatabase2 = b.getWritableDatabase();
		flag = flag2;
		sqlitedatabase = sqlitedatabase2;
		j = i;
		sqlitedatabase1 = sqlitedatabase2;
		sqlitedatabase2.beginTransaction();
		int l;
		l = 0;
		long l1 = 0;
		flag = flag2;
		sqlitedatabase = sqlitedatabase2;
		j = i;
		sqlitedatabase1 = sqlitedatabase2;
		int j1 = acontentvalues.length;
		int i1;
		boolean flag3;
		i1 = 0;
		flag3 = false;
		// _L6:
		if (i1 >= j1) {
			flag = flag1;
			sqlitedatabase = sqlitedatabase2;
			j = i;
			sqlitedatabase1 = sqlitedatabase2;
			sqlitedatabase2.setTransactionSuccessful();
			c = false;
			flag2 = flag1;
			k = i;
			if (sqlitedatabase2 != null) {
				flag2 = flag1;
				k = i;
				if (sqlitedatabase2.inTransaction()) {
					sqlitedatabase2.endTransaction();
					k = i;
					flag2 = flag1;
				}
			}

		} else {

			ContentValues contentvalues;
			contentvalues = acontentvalues[i1];
			flag2 = flag1;
			if (l != 0) {

			}
			flag = flag1;
			sqlitedatabase = sqlitedatabase2;
			j = i;
			sqlitedatabase1 = sqlitedatabase2;
			flag3 = b(contentvalues);
			flag = flag1;
			sqlitedatabase = sqlitedatabase2;
			j = i;
			sqlitedatabase1 = sqlitedatabase2;
			flag2 = a(contentvalues);
			if (!flag3) {

				flag = flag2;
				sqlitedatabase = sqlitedatabase2;
				j = i;
				sqlitedatabase1 = sqlitedatabase2;
				l1 = sqlitedatabase2.insert(s, null, contentvalues);
				// break MISSING_BLOCK_LABEL_506;

			} else {

				flag = flag2;
				sqlitedatabase = sqlitedatabase2;
				j = i;
				sqlitedatabase1 = sqlitedatabase2;
				try {
					l1 = sqlitedatabase2.replace(s, null, contentvalues);
					// break MISSING_BLOCK_LABEL_506;
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					sqlitedatabase1 = sqlitedatabase;
				} finally {
					c = false;
					if (sqlitedatabase1 != null
							&& sqlitedatabase1.inTransaction()) {
						sqlitedatabase1.endTransaction();
					}
					// throw uri;
				}
				vj.b("Swipe.Provider",
						(new StringBuilder()).append("bulkInsert failed: ")
								.append("").toString());
				c = false;
				flag2 = flag;
				k = j;
				if (sqlitedatabase != null) {
					flag2 = flag;
					k = j;
					if (sqlitedatabase.inTransaction()) {
						sqlitedatabase.endTransaction();
						flag2 = flag;
						k = j;
					}
				}
				k = i;
				if (0L > l1) {
					k = i - 1;
				}
				flag = flag2;
				sqlitedatabase = sqlitedatabase2;
				j = k;
				sqlitedatabase1 = sqlitedatabase2;
				sqlitedatabase2.yieldIfContendedSafely();
				i1++;
				l++;
				flag1 = flag2;
				i = k;

				if (k > 0 && !flag2) {
					getContext().getContentResolver().notifyChange(uri, null);
				}
				return k;

			}

		}
		return i1;

	}

	public Bundle call(String s, String s1, Bundle bundle) {
		byte byte0;
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag1 = true;
		flag = true;
		flag2 = a(bundle);
		int j;
		Bundle bundle2 = null;
		byte0 = -1;
		boolean flag4;
		s.hashCode();
		// JVM INSTR lookupswitch 2: default 48
		// -231680217: 90
		// 595358846: 74;
		// goto _L1 _L2 _L3

		switch (s.hashCode()) {
		default:
			break;
		case 595358846:

			if (s.equals("updateBannerShowedTime")) {
				byte0 = 0;
			}
			break;

		case -231680217:

			if (s.equals("initFavorites")) {
				byte0 = 1;
			}

		}

		switch (byte0) {
		default:
			return null;

		case 0: // '\0'
			boolean flag3 = a(bundle.getString("extra_param_1"),
					bundle.getLong("extra_param_2"));
			bundle2 = new Bundle(1);
			int i;
			if (flag3) {
				i = ((flag) ? 1 : 0);
			} else {
				i = 0;
			}
			bundle2.putInt("result_affected_row_count", i);
			if (flag3 && flag2) {
				getContext().getContentResolver().notifyChange(ka.a, null);
			}
			return bundle2;

		case 1: // '\001'
			flag4 = a(bundle.getStringArray("extra_param_1"),
					bundle.getInt("extra_param_2"));
			bundle2 = new Bundle(1);
			break;
		}

		if (flag4) {
			j = ((flag1) ? 1 : 0);
		} else {
			j = 0;
		}
		bundle2.putInt("result_affected_row_count", j);
		if (flag4 && flag2) {
			getContext().getContentResolver().notifyChange(ka.a, null);
		}
		return bundle2;
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Lifted
	 * jumps to return sites
	 */
	// public Bundle call(String var1_1, String var2_2, Bundle var3_3) {
	// int var4_4 = 1;
	// boolean var5_5 = this.a(var3_3);
	// int var6_6 = -1;
	// switch (var1_1.hashCode()) {
	// case 595358846: {
	// if (var1_1.equals((Object) "updateBannerShowedTime")) {
	// var6_6 = 0;
	// }
	// }
	//
	// switch (var6_6) {
	// default: {
	// return null;
	// }
	// case 0: {
	// boolean var9_7 = this.a(var3_3.getString("extra_param_1"),
	// var3_3.getLong("extra_param_2"));
	// Bundle var10_8 = new Bundle(var4_4);
	// if (!var9_7) {
	// var4_4 = 0;
	// }
	// var10_8.putInt("result_affected_row_count", var4_4);
	// if (var9_7 == false)
	// return var10_8;
	// if (var5_5 == false)
	// return var10_8;
	// this.getContext().getContentResolver().notifyChange(ka.a, null);
	// return var10_8;
	// }
	// case 1:
	// }
	//
	// case -231680217:
	// }
	// if (var1_1.equals((Object) "initFavorites")) {
	// var6_6 = var4_4;
	// }
	//
	// boolean var7_9 = this.a(var3_3.getStringArray("extra_param_1"),
	// var3_3.getInt("extra_param_2"));
	// Bundle var8_10 = new Bundle(var4_4);
	// if (!var7_9) {
	// var4_4 = 0;
	// }
	// var8_10.putInt("result_affected_row_count", var4_4);
	// if (var7_9 == false)
	// return var8_10;
	// if (var5_5 == false)
	// return var8_10;
	// this.getContext().getContentResolver().notifyChange(ka.a, null);
	// return var8_10;
	// }

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public int delete(Uri uri, String string, String[] arrstring) {
		int n;
		jv jv = new jv(this, uri, string, arrstring);
		try {
			n = this.b.getWritableDatabase().delete(jv.a, jv.b, jv.c);
			if (n <= 0)
				return n;
		} catch (Throwable var5_6) {
			vj.b("Swipe.Provider", "delete failed: " + var5_6.getMessage());
			return 0;
		}
		if (this.c || jv.d)
			return n;
		this.getContext().getContentResolver().notifyChange(uri, null);
		return n;
	}

	public String getType(Uri uri) {
		switch (a.match(uri)) {
		default: {
			return "";
		}
		case 1: {
			return "vnd.android.cursor.dir/com.lazyswipe.application";
		}
		case 2: {
			return "vnd.android.cursor.item/com.lazyswipe.application";
		}
		case 3: {
			return "vnd.android.cursor.dir/com.lazyswipe.banner";
		}
		case 4: {
			return "vnd.android.cursor.item/com.lazyswipe.banner";
		}
		case 5: {
			return "vnd.android.cursor.dir/com.lazyswipe.op_log";
		}
		case 6: {
			return "vnd.android.cursor.item/com.lazyswipe.op_log";
		}
		case 7: {
			return "vnd.android.cursor.dir/com.lazyswipe.blocked_contact";
		}
		case 8: {
			return "vnd.android.cursor.item/com.lazyswipe.blocked_contact";
		}
		case 9: {
			return "vnd.android.cursor.dir/com.lazyswipe.default_favorites";
		}
		case 10: {
			return "vnd.android.cursor.dir/com.lazyswipe.best_match_favorites";
		}
		case 11: {
			return "vnd.android.cursor.dir/com.lazyswipe.promotion_app";
		}
		case 12: {
			return "vnd.android.cursor.item/com.lazyswipe.promotion_app";
		}
		case 13: {
			return "vnd.android.cursor.dir/com.lazyswipe.lucky_app_sorted";
		}
		case 15: {
			return "vnd.android.cursor.item/com.lazyswipe.blocked_app";
		}
		case 14: {
			return "vnd.android.cursor.dir/com.lazyswipe.blocked_app";
		}
		case 16: {
			return "vnd.android.cursor.dir/com.lazyswipe.blocked_app_contact";
		}
		case 17: {
			return "vnd.android.cursor.dir/com.lazyswipe.app_click";
		}
		case 18: {
			return "vnd.android.cursor.dir/com.lazyswipe.notify_app_sorted";
		}
		case 20: {
			return "vnd.android.cursor.item/com.lazyswipe.touch_fix";
		}
		case 19: {
			return "vnd.android.cursor.dir/com.lazyswipe.touch_fix";
		}
		case 21: {
			return "vnd.android.cursor.dir/com.lazyswipe.contact";
		}
		case 22:

			return "vnd.android.cursor.dir/com.lazyswipe.contact_app_key";
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public Uri insert(Uri uri, ContentValues contentValues) {
		if (uri.getPathSegments().size() != 1) {
			throw new IllegalArgumentException("Invalid uri: " + (Object) uri);
		}
		String string = jv.a(uri);
		boolean bl = this.a(contentValues);
		boolean bl2 = this.b(contentValues);
		try {
			long l;
			SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
			long l2 = bl2 ? sQLiteDatabase.replace(string, null, contentValues)
					: (l = sQLiteDatabase.insert(string, null, contentValues));
			if (l2 < 0)
				return null;
			Uri uri2 = ContentUris.withAppendedId((Uri) uri, (long) l2);
			if (this.c)
				return uri2;
			if (bl)
				return uri2;
			this.getContext().getContentResolver().notifyChange(uri2, null);
			return uri2;
		} catch (Throwable var6_10) {
			vj.b("Swipe.Provider", "insert failed: " + var6_10.getMessage());
		}
		return null;
	}

	public boolean onCreate() {
		this.b = new DatabaseHelper(this.getContext());
		this.a();
		return true;
	}

	// public Cursor query(Uri uri, String[] arrstring, String string,
	// String[] arrstring2, String string2) {
	// jv jv = new jv(this, uri, string, arrstring2);
	// try {
	// if ("public_pref".equals((Object) jv.a)) {
	// return kn.a(uri, string, arrstring2);
	// }
	// Cursor cursor = this.b.getReadableDatabase().query(jv.a, arrstring,
	// jv.b, jv.c, null, null, string2);
	// cursor.setNotificationUri(this.getContext().getContentResolver(),
	// uri);
	// return cursor;
	// } catch (Throwable var7_8) {
	// vj.b("Swipe.Provider", "query failed: " + var7_8.getMessage());
	// return null;
	// }
	// }
	public Cursor query(Uri uri, String as[], String s, String as1[], String s1) {
		Cursor cursor = null;
		jv jv1 = new jv(this, uri, s, as1);
		try {
			if ("public_pref".equals(jv1.a)) {
				return kn.a(uri, s, as1);
			}
			cursor = b.getReadableDatabase().query(jv1.a, as, jv1.b, jv1.c,
					null, null, s1);
			cursor.setNotificationUri(getContext().getContentResolver(), uri);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b("Swipe.Provider",
					(new StringBuilder()).append("query failed: ")
							.append(exception.getMessage()).toString());
			return null;
		}
		return cursor;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public int update(Uri uri, ContentValues contentValues, String string,
			String[] arrstring) {
		int n;
		jv jv = new jv(this, uri, string, arrstring);
		boolean bl = this.a(contentValues);
		try {
			n = this.b.getWritableDatabase().update(jv.a, contentValues, jv.b,
					jv.c);
			if (n <= 0)
				return n;
		} catch (Throwable var7_8) {
			vj.b("Swipe.Provider", "update failed: " + var7_8.getMessage());
			return 0;
		}
		if (this.c || bl)
			return n;
		this.getContext().getContentResolver().notifyChange(uri, null);
		return n;
	}
}
