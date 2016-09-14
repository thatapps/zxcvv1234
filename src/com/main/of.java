package com.main;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.zev.R;

public class of
{
  public FanItem a;
  public TextView b;
  public ImageView c;
  
  public of(View paramView)
  {
    this.a = ((FanItem)paramView);
    this.b = ((TextView)this.a.findViewById(R.id.item_label));
    this.c = ((ImageView)this.a.findViewById(R.id.item_icon));
    this.a.setTag(this);
  }
}
