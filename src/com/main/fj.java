package com.main;
import java.util.Date;

public class fj
{
  private String a;
  private long b;
  
  public fj(String paramString)
  {
    this.a = paramString;
    this.b = new Date().getTime();
  }
}
