package com.lazyswipe.ui;

import android.app.Fragment;

public class AdvancedSettingsActivity
  extends FragmentContainer
{
  private AdvancedSettingsFragment b;
  
  public void onAttachFragment(Fragment paramFragment)
  {
    super.onAttachFragment(paramFragment);
    this.b = ((AdvancedSettingsFragment)paramFragment);
  }
}
