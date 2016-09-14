package com.main;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kl implements BaseColumns {
	public static final Uri a = Uri
			.parse("content://com.lazyswipe/promotion_app");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS promotion_app (_id INTEGER PRIMARY KEY, offer_id INTEGER NOT NULL, packageName TEXT NOT NULL, adUrl TEXT NOT NULL, market_url TEXT , resolve_failed INTEGER DEFAULT 0, clickLogUrl TEXT , title TEXT , icon TEXT , size INTEGER , ratingScore TEXT , downloadCount INTEGER , impressionLogUrl TEXT , placement INTEGER DEFAULT 0, shortDesc TEXT , category TEXT , vendor INTEGER DEFAULT 0, vendor_addition TEXT , data_1 TEXT , data_2 TEXT , data_3 TEXT )");
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_promotion_offer_id ON promotion_app (offer_id)");
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_promotion_placement ON promotion_app (placement)");
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_promotion_type ON promotion_app (category)");
		paramSQLiteDatabase
				.execSQL("CREATE INDEX index_promotion_vendor ON promotion_app (vendor)");
	}

	public static void b(SQLiteDatabase paramSQLiteDatabase) {
		try {
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN title TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN icon TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN size INTEGER ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN ratingScore TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN downloadCount INTEGER ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN impressionLogUrl TEXT ");
			return;
		} catch (Throwable localThrowable) {

		}
	}

	public static void c(SQLiteDatabase paramSQLiteDatabase) {
		try {
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN placement INTEGER DEFAULT 0");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN shortDesc TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN category TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN vendor INTEGER DEFAULT 0");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN vendor_addition TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN data_1 TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN data_2 TEXT ");
			paramSQLiteDatabase
					.execSQL("ALTER TABLE promotion_app ADD COLUMN data_3 TEXT ");
			paramSQLiteDatabase
					.execSQL("CREATE INDEX index_promotion_placement ON promotion_app (placement)");
			paramSQLiteDatabase
					.execSQL("CREATE INDEX index_promotion_type ON promotion_app (category)");
			paramSQLiteDatabase
					.execSQL("DROP INDEX  IF EXISTS index_promotion_offer_id");
			paramSQLiteDatabase
					.execSQL("CREATE INDEX index_promotion_offer_id ON promotion_app (offer_id)");
			paramSQLiteDatabase
					.execSQL("CREATE INDEX index_promotion_vendor ON promotion_app (vendor)");
			return;
		} catch (Throwable localThrowable) {

		}
	}
}
