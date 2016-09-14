package com.main;
//zevienin

import android.view.LayoutInflater;

class dg
{

  static void a(LayoutInflater layoutinflater, dh dh)
  {df df = null;
      if (dh != null)
      {
    	  df = new df(dh);
      } else
      {
    	  df = null;
      }
      layoutinflater.setFactory2(df);
  }
}
