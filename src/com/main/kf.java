package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kf implements BaseColumns {

	public static final Uri a = Uri.parse("content://com.lazyswipe/contact");

	public static void a(SQLiteDatabase sqlitedatabase) {
		sqlitedatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS contact (_id INTEGER PRIMARY KEY, uri TEXT , name TEXT , thumb TEXT , image BLOB , _order INTEGER )");
		sqlitedatabase
				.execSQL("CREATE INDEX  IF NOT EXISTS index_contact_uri ON contact (uri)");
		sqlitedatabase
				.execSQL("CREATE INDEX  IF NOT EXISTS index_contact_order ON contact (_order)");
	}

}