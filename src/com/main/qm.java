package com.main;
import android.content.Context;

import com.lazyswipe.zev.R;

public class qm
  extends rc
{
  public qm(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public qm(Context paramContext, rd paramrd)
  {
    super(paramContext, paramrd);
  }
  
  public int a(Context paramContext)
  {
    return 1;
  }
  
  public int a(boolean paramBoolean)
  {
    return R.drawable.tile_expand_notifications_panel;
  }
  
  public String b()
  {
    return "Expand SystemUI";
  }
  
  public int c()
  {
    return R.string.title_tile_expand_notifications_panel;
  }
  
  public boolean c(Context paramContext)
  {
    vi.a(paramContext, R.string.msg_no_setting_available);
    return false;
  }
  
  public boolean e()
  {
    vk.h();
    return true;
  }
}
