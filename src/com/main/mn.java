package com.main;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

public final class mn
  extends mt
{
  private final CharSequence a;
  private final Drawable b;
  
  public mn(String paramString, Drawable paramDrawable)
  {
    this.a = paramString;
    this.b = paramDrawable;
  }
  
  public CharSequence a()
  {
    return this.a;
  }
  
  public boolean a(Context paramContext)
  {
    return false;
  }
  
  public Drawable b()
  {
    return this.b;
  }
  
  public boolean b(Context paramContext)
  {
    return false;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public int d()
  {
    int i = super.d();
    return Color.argb(127, Color.red(i), Color.green(i), Color.blue(i));
  }
  
  public String e()
  {
    return null;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public boolean g()
  {
    return false;
  }
}
