package com.main;
import android.content.Context;
import android.content.Intent;

public abstract class ql
  extends rc
{
  public ql(Context paramContext, rd paramrd)
  {
    super(paramContext, paramrd);
  }
  
  public Intent b(Context paramContext)
  {
    return new Intent("android.settings.DISPLAY_SETTINGS");
  }
}
