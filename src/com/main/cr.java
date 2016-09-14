package com.main;

import android.view.KeyEvent;

public class cr
{

    static final cv a;

    public static boolean a(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static boolean a(KeyEvent keyevent, int i)
    {
        return a.a(keyevent.getMetaState(), i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new cu();
        } else
        {
            a = new cs();
        }
    }
}
