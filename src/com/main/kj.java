package com.main;
import android.database.Cursor;

public class kj
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final int j;
  public final int k;
  
  public kj(Cursor paramCursor)
  {
    this.a = paramCursor.getColumnIndexOrThrow("_id");
    this.b = paramCursor.getColumnIndexOrThrow("intent");
    this.c = paramCursor.getColumnIndexOrThrow("last_called_time");
    this.d = paramCursor.getColumnIndexOrThrow("called_num");
    this.e = paramCursor.getColumnIndexOrThrow("alias");
    this.f = paramCursor.getColumnIndexOrThrow("on_sdcard");
    this.g = paramCursor.getColumnIndexOrThrow("package");
    this.h = paramCursor.getColumnIndexOrThrow("uninstalled");
    this.i = paramCursor.getColumnIndexOrThrow("label");
    this.j = paramCursor.getColumnIndexOrThrow("is_system");
    this.k = paramCursor.getColumnIndexOrThrow("updated");
  }
}
