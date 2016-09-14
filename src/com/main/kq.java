package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kq implements BaseColumns {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/notify_app_sorted");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE VIEW IF NOT EXISTS notify_app_sorted AS  SELECT a.*,  CASE  WHEN b._id IS NULL  THEN  0 ELSE 1 END AS _order, ts FROM promotion_app a LEFT JOIN application b ON a.packageName=b.package LEFT JOIN app_click c ON a.offer_id=c.offer_id AND a.placement=c.placement WHERE  (uninstalled=1 OR uninstalled IS NULL ) AND a.placement='2' AND shortDesc IS NOT NULL  AND  TRIM(shortDesc)<>''");
	}
}
