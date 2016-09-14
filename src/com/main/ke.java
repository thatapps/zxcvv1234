package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class ke implements BaseColumns {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/blocked_contact");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS blocked_contact (_id INTEGER PRIMARY KEY, uri TEXT NOT NULL, ts INTEGER NOT NULL, name TEXT , thumb TEXT )");
		paramSQLiteDatabase
				.execSQL("CREATE UNIQUE INDEX index_contact_uri ON blocked_contact (uri)");
	}

	public static void b(SQLiteDatabase paramSQLiteDatabase) {
		try {
			paramSQLiteDatabase
					.execSQL("ALTER TABLE blocked_contact ADD COLUMN name TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE blocked_contact ADD COLUMN thumb TEXT ");
			return;
		} catch (Throwable localThrowable) {

		}
	}
}
