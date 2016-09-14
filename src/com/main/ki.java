package com.main;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.provider.BaseColumns;

public class ki implements BaseColumns {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/application");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS application (_id INTEGER PRIMARY KEY, intent TEXT , last_called_time INTEGER , called_num INTEGER , alias TEXT , on_sdcard INTEGER DEFAULT 0, package TEXT , uninstalled INTEGER DEFAULT 0, label TEXT , is_system INTEGER , updated INTEGER )");
		d(paramSQLiteDatabase);
		e(paramSQLiteDatabase);
	}

	public static void a(SQLiteDatabase paramSQLiteDatabase,
			SQLiteOpenHelper paramSQLiteOpenHelper) {
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN on_sdcard INTEGER DEFAULT 0");
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN package TEXT ");
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN uninstalled INTEGER DEFAULT 0");
		paramSQLiteDatabase
				.execSQL(" DELETE FROM application WHERE _id NOT IN( SELECT  MIN(_id) FROM application GROUP BY intent)");
		d(paramSQLiteDatabase);
		e(paramSQLiteDatabase);
		c(paramSQLiteDatabase, paramSQLiteOpenHelper);
	}

	public static void b(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN alias TEXT ");
	}

	public static void b(SQLiteDatabase sqlitedatabase,
			SQLiteOpenHelper sqliteopenhelper) {
		ContentValues contentvalues;
		contentvalues = null;
		sqlitedatabase
				.execSQL("ALTER TABLE application ADD COLUMN label TEXT ");
		PackageManager packagemanager;
		packagemanager = ((Context) uo.a(sqliteopenhelper, uo.c(
				android.database.sqlite.SQLiteOpenHelper.class, "mContext")))
				.getPackageManager();
		String ss = vd.b;
		Cursor cursor = sqlitedatabase.query("application", new String[] {
				"_id", "intent" }, "uninstalled=?", new String[] { ss

		}, null, null, null);
		contentvalues = new ContentValues(1);
		// _L1:
		boolean flag = cursor.moveToNext();
		// label0:
		// {
		if (!flag) {
			// break label0;
		}
		try {
			contentvalues.put(
					"label",
					packagemanager
							.getActivityInfo(
									ComponentName.unflattenFromString(cursor
											.getString(1)), 0)
							.loadLabel(packagemanager).toString());
			sqlitedatabase.update("application", contentvalues, "_id=?",
					new String[] { cursor.getString(0) });
		} catch (Throwable throwable) {
		} finally {
		}
		// }
		// goto _L1
		if (sqliteopenhelper != null) {
			sqliteopenhelper.close();
		}

		else if (cursor == null) {
			return;

		}

	}

	public static void c(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN is_system INTEGER ");
		paramSQLiteDatabase
				.execSQL("ALTER TABLE application ADD COLUMN updated INTEGER ");
	}

	private static void c(SQLiteDatabase sqlitedatabase,
			SQLiteOpenHelper sqliteopenhelper) {
		Object obj;
		obj = null;
		Cursor cursor = null;
		sqlitedatabase
				.execSQL(" UPDATE application SET uninstalled=0, on_sdcard=0, package=SUBSTR(intent, 1, LENGTH(RTRIM(intent, '[._1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM]'))-1)");
		PackageManager packagemanager;
		packagemanager = ((Context) uo.a(sqliteopenhelper, uo.c(
				android.database.sqlite.SQLiteOpenHelper.class, "mContext")))
				.getPackageManager();
		cursor = sqlitedatabase.query("application", new String[] { "_id",
				"package" }, null, null, null, null, null);
		// _L4:
		if (!cursor.moveToNext()) {

			if (sqliteopenhelper == null) {

				return;

			} else {

				sqliteopenhelper.close();
				return;

			}

		} else {

			boolean flag = (Boolean) null;
			try {
				if ((packagemanager.getApplicationInfo(cursor.getString(1), 0).flags & 0x40000) != 0) {
					flag = true;
				} else {
					flag = false;
				}
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!flag) {

				if (sqliteopenhelper == null) {

					return;

				} else {

					sqliteopenhelper.close();
					return;

				}

			} else {

				sqlitedatabase
						.execSQL((new StringBuilder())
								.append(" UPDATE application SET on_sdcard=1 WHERE _id=")
								.append(cursor.getInt(0)).toString());
				// goto _L4

			}

		}

	}

	private static void d(SQLiteDatabase paramSQLiteDatabase) {
		try {
			paramSQLiteDatabase
					.execSQL("CREATE UNIQUE INDEX index_intent ON application (intent)");
			paramSQLiteDatabase
					.execSQL("CREATE INDEX  IF NOT EXISTS index_intent ON application (intent)");
			return;
		} catch (Throwable localThrowable) {

		}
	}

	private static void e(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_package ON application (package)");
	}
}
