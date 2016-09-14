package com.main;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class ix
  extends Drawable
{
  private final float a;
  private final float b;
  private final float c;
  private final Paint d;
  private final float e;
  private final float f;
  private float g;
  private float h;
  private int i;
  private boolean j;
  private final float k;
  private final float l;
  private final float m;
  
  ix(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.e = paramFloat3;
    this.f = paramFloat4;
    this.g = (this.b + this.e / 2.0F);
    this.h = (this.b + this.e + this.f / 2.0F);
    this.c = (this.a / 2.0F);
    this.i = -1711276033;
    this.k = paramFloat5;
    this.d = new Paint(7);
    float f1 = (float)Math.sqrt(Math.pow(this.b + this.e + this.f, 2.0D) / 2.0D);
    this.l = (f1 + this.c);
    this.m = (this.c - f1);
  }
  
  static ix a(Context paramContext)
  {
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    return new ix(120.0F * f1 / 3.0F, 64.0F * f1 / 3.0F / 2.0F, 21.0F * f1 / 2.0F / 3.0F, 35.0F * f1 / 2.0F / 3.0F, f1 * 23.0F / 3.0F / 2.0F);
  }
  
  public void a(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.j = paramBoolean1;
    if (paramBoolean2) {
      invalidateSelf();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.d.setStyle(Paint.Style.FILL);
    this.d.setColor(this.i);
    paramCanvas.drawCircle(this.c, this.c, this.b, this.d);
    this.d.setStyle(Paint.Style.STROKE);
    this.d.setStrokeWidth(this.e);
    this.d.setColor(872415231);
    paramCanvas.drawCircle(this.c, this.c, this.g, this.d);
    this.d.setStrokeWidth(this.f);
    this.d.setColor(437326097);
    paramCanvas.drawCircle(this.c, this.c, this.h, this.d);
    if (this.j)
    {
      this.d.setStyle(Paint.Style.FILL);
      this.d.setColor(-65536);
      paramCanvas.drawCircle(this.l, this.m, this.k, this.d);
    }
  }
  
  public int getAlpha()
  {
    return Color.alpha(this.i);
  }
  
  public int getIntrinsicHeight()
  {
    return (int)this.a;
  }
  
  public int getIntrinsicWidth()
  {
    return (int)this.a;
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt)
  {
    this.i = Color.argb(paramInt, Color.red(this.i), Color.green(this.i), Color.blue(this.i));
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}
