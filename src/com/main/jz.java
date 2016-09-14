package com.main;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class jz
{
  public static final Uri a = Uri.parse("content://com.lazyswipe/app_group");
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE  IF EXISTS app_group");
  }
}
