package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kc implements BaseColumns {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/blocked_app");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS blocked_app (_id INTEGER PRIMARY KEY, intent TEXT NOT NULL, type INTEGER DEFAULT 0, ts INTEGER )");
		paramSQLiteDatabase
				.execSQL("CREATE UNIQUE INDEX index_blocked_app_intent ON blocked_app (intent)");
	}
}
