package com.main;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

class jn
  extends jj
{
  private final Uri[] b;
  private final String c;
  private final String d;
  
  public jn(Context paramContext, Uri[] paramArrayOfUri, String paramString1, String paramString2)
  {
    super(paramContext);
    this.b = paramArrayOfUri;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  protected void a()
  {
    ji.b(this.a, this.b, this.c, this.d);
    bx.a(this.a).a(new Intent("Swipe..intent.action.FEEDBACK_SENT"));
  }
}
