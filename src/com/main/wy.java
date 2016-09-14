package com.main;
import android.content.Context;

public class wy
  extends wb
{
  private static boolean a;
  
  public wy(Context paramContext)
  {
    super(paramContext);
  }
  
  public static boolean g()
  {
    return a;
  }
  
  public void dismiss()
  {
    super.dismiss();
    a = false;
  }
  
  public void show()
  {
    super.show();
    a = true;
  }
}
