package com.main;
public class vc
{
  public int a;
  public String b;
  public String c;
  public boolean d;
  
  public vc(int i)
  {
      a = i;
      boolean flag;
      if (i == 0)
      {
          flag = true;
      } else
      {
          flag = false;
      }
      d = flag;
  }
  
  public vc(int paramInt, String paramString1, String paramString2)
  {
    this(paramInt);
    this.b = paramString1;
    this.c = paramString2;
  }
}
