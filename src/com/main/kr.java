package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kr implements BaseColumns {
	public static final Uri a = Uri.parse("content://com.lazyswipe/touch_fix");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS touch_fix (_id INTEGER PRIMARY KEY, package TEXT NOT NULL, data TEXT )");
		paramSQLiteDatabase
				.execSQL("CREATE UNIQUE INDEX index_touch_fix_package ON touch_fix (package)");
	}
}
