package com.main;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ei
{
  static long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
}
