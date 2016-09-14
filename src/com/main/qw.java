package com.main;

import android.content.Context;

public class qw extends ql
{

    public qw(Context context)
    {
        this(context, null);
    }

    public qw(Context context, rd rd)
    {
        super(context, rd);
    }

    public int a(Context context)
    {
        boolean flag;
        if (android.provider.Settings.System.getInt(d.getContentResolver(), "accelerometer_rotation", 0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag ? 0 : 1;
    }

    public int a(boolean flag)
    {
        return 0x7f02009c;
    }

    public String b()
    {
        return "Screen rotation";
    }

    public int c()
    {
        return 0x7f0f00bf;
    }

    public boolean d(Context context)
    {
        android.content.ContentResolver contentresolver = context.getContentResolver();
        int i;
        if (a(context) == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        android.provider.Settings.System.putInt(contentresolver, "accelerometer_rotation", i);
        return false;
    }
}
