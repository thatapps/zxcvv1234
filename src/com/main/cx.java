package com.main;
import android.view.LayoutInflater;

public class cx
{

    static final cy a;

    public static void a(LayoutInflater layoutinflater, dh dh)
    {
        a.a(layoutinflater, dh);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new db();
        } else
        if (i >= 11)
        {
            a = new da();
        } else
        {
            a = new cz();
        }
    }
}
