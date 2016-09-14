package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class km implements BaseColumns {
	public static final Uri a = Uri.parse("content://com.lazyswipe/app_click");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS app_click (_id INTEGER PRIMARY KEY, offer_id INTEGER NOT NULL, ts INTEGER DEFAULT 0, placement INTEGER NOT NULL, vendor INTEGER NOT NULL)");
		paramSQLiteDatabase
				.execSQL("CREATE UNIQUE INDEX index_promotion_record_offer_placement_vendor ON app_click (offer_id, placement, vendor)");
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_promotion_record_ts ON app_click (ts)");
	}
}
