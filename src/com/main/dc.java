package com.main;

import android.view.LayoutInflater;

class dc
{

    static void a(LayoutInflater layoutinflater, dh dh)
    {
    	dd dd = null;
        if (dh != null)
        {
        	dd = new dd(dh);
        } else
        {
        	dd = null;
        }
        layoutinflater.setFactory(dd);
    }
}
