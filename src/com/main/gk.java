package com.main;
public class gk
{
  public static final gk a = new gk(1000, "Network Error");
  public static final gk b = new gk(1001, "No Fill");
  public static final gk c = new gk(1002, "Ad was re-loaded too frequently");
  public static final gk d = new gk(2000, "Server Error");
  public static final gk e = new gk(2001, "Internal Error");
  @Deprecated
  public static final gk f = new gk(2002, "Native ad failed to load due to missing properties");
  private final int g;
  private final String h;
  
  public gk(int paramInt, String paramString)
  {
    if (hh.a(paramString)) {
      paramString = "unknown error";
    }
    this.g = paramInt;
    this.h = paramString;
  }
  
  public int a()
  {
    return this.g;
  }
  
  public String b()
  {
    return this.h;
  }
}
