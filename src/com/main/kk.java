package com.main;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

public class kk implements BaseColumns {
	public static final Uri a = Uri.parse("content://com.lazyswipe/op_log");

	public static void a(SQLiteDatabase paramSQLiteDatabase) {
		paramSQLiteDatabase
				.execSQL("CREATE TABLE  IF NOT EXISTS op_log (_id INTEGER PRIMARY KEY, code INTEGER , last_op INTEGER )");
		paramSQLiteDatabase
				.execSQL("CREATE UNIQUE INDEX index_op_log_code ON op_log (code)");
	}

	public static boolean a(Context context, long l) {
		ContentValues contentValues = new ContentValues(3);
		contentValues.put("code", Long.valueOf((long) l));
		contentValues.put("last_op",
				Long.valueOf((long) System.currentTimeMillis()));
		contentValues.put("key_replace_if_exists",
				Boolean.valueOf((boolean) true));
		try {
			Uri uri = context.getContentResolver().insert(a, contentValues);
			if (uri != null) {
				return true;
			}
			return false;
		} catch (Throwable var4_4) {
			return false;
		}
	}

	public static boolean a(Context context, long l, long l1) {
		Cursor cursor = context.getContentResolver().query(
				ContentUris.withAppendedId(a, l), new String[] { "last_op" },
				null, null, null);
		// context = (Context) cursor;
		if (!cursor.moveToFirst()) {
			// break MISSING_BLOCK_LABEL_72;
		}

		long l2 = System.currentTimeMillis();

		long l3 = cursor.getLong(0);
		if (l2 - l3 <= l1) {
			// break MISSING_BLOCK_LABEL_86;
		}
		if (cursor != null) {
			cursor.close();
		}

		if (cursor != null) {
			cursor.close();
		}

		vj.b("Swipe.Provider",
				(new StringBuilder())
						.append("Failed to get the time when the operation ")
						.append(l).append(" was performed: ").toString()/*
																	 * .append(
																	 * throwable
																	 * .
																	 * getMessage
																	 * (
																	 * )).toString
																	 * ()
																	 */);
		if (cursor != null) {
			cursor.close();
		}
		return false;

		

	}
}
