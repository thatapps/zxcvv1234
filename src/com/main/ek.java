package com.main;
import android.view.View;

class ek
{
  public static void a(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
}
