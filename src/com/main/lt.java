package com.main;
import android.view.animation.Interpolator;

public class lt
  implements Interpolator
{
  private boolean a = false;
  
  public lt()
  {
    this(false);
  }
  
  public lt(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  private float a(float paramFloat)
  {
    return paramFloat * (4.8F + (paramFloat * (3.1F * paramFloat) - 6.9F * paramFloat));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (!this.a) {}
    for (float f = a(paramFloat);; f = 1.0F - a(1.0F - paramFloat)) {
      return f;
    }
  }
}
