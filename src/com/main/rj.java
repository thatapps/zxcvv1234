package com.main;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.tile.booster.ui.BoostingCircular;

public class rj
{

    static int a = 0;
    private static final String b = (new StringBuilder()).append("Swipe.").append(rj.class.getSimpleName()).toString();
    private static boolean c = false;
    private static int d = -1;

    public rj()
    {
    }

    public static void a()
    {
        a++;
    }

    public static void a(Context context, Fan fan)
    {
        while (context == null || fan == null || c) 
        {
            return;
        }
        c = true;
        a = 0;
        BoostingCircular.a(context, fan.getItemLayer(), fan, true);
        BoostingCircular.a(context, fan.getTabSector(), fan, false);
        rl.a(context, fan, 0);
        rl.a(context, fan, 1);
    }

    public static void a(View view)
    {
        a--;
        if (a <= 0)
        {
            a = 0;
            c = false;
            bx.a(SwipeApplication.e()).a(new Intent("ACTION_BOOST_ANIMATE_FINISH"));
        }
    }

    public static boolean b()
    {
        return c;
    }

    public static void c()
    {
        c = false;
        a = 0;
    }

    public static int d()
    {
        boolean flag = false;
        if (d == -1)
        {
            int i;
            if (android.os.Build.VERSION.SDK_INT < 16 || to.g())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 2;
            }
            d = i;
        }
        return d;
    }

}
