package com.main;

import android.content.Context;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class ks
    implements la
{

    private ky a;
    private ku b;
    private kt c;
    private la d;
    private Context e;
    private Handler f;
    private View g;

    public ks(Context context, Handler handler, View view)
    {
        e = context;
        f = handler;
        g = view;
        a = new ky(context);
    }

    static kt a(ks ks1, kt kt1)
    {
        ks1.c = kt1;
        return kt1;
    }

    static ku a(ks ks1, ku ku1)
    {
        ks1.b = ku1;
        return ku1;
    }

    public ky a()
    {
        return a;
    }

    public void a(int i)
    {
        a.a();
        Object obj = new PopupMenu(e, g);
        ((PopupMenu) (obj)).inflate(i);
        obj = ((PopupMenu) (obj)).getMenu();
        i = 0;
        int j = ((Menu) (obj)).size();
        while (i < j) 
        {
            MenuItem menuitem = ((Menu) (obj)).getItem(i);
            if (menuitem.isVisible())
            {
                a.a(menuitem.getItemId(), menuitem.getTitle()).a(this);
            }
            i++;
        }
    }

    public void a(la la1)
    {
        d = la1;
    }

    public boolean a(kz kz1)
    {
        if (d != null)
        {
            d.a(kz1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b()
    {
        return b != null && b.c();
    }

    public boolean c()
    {
        if (!b() && a != null && c == null)
        {
            c = new kt(this, new ku(this, e, a, g, true));
            f.postDelayed(c, 150L);
            return true;
        } else
        {
            return false;
        }
    }
}
