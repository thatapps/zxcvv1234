package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class kd {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/blocked_app_contact");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE VIEW IF NOT EXISTS blocked_app_contact AS  SELECT uri AS key, name, thumb AS icon, ts, 0 AS type FROM blocked_contact UNION  SELECT a.intent AS key, b.label AS name,  NULL AS icon, ts, 1 AS type FROM blocked_app a, application b WHERE a.type=0 AND a.intent=b.intent AND b.uninstalled=0");
	}
}
