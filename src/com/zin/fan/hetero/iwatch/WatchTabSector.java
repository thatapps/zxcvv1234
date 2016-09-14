//zevienin

package com.lazyswipe.fan.hetero.iwatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;

import com.lazyswipe.fan.Fan;
import com.main.ls;
import com.main.lt;
import com.main.nc;
import com.main.nk;
import com.main.rk;

// Referenced classes of package com.lazyswipe.fan.hetero.iwatch:
//            WatchItemSector, WatchSectorArea

public class WatchTabSector extends FrameLayout
    implements rk
{

    public static int a;
    List b;
    private int c;
    private Fan d;
    private WatchSectorArea e;
    private boolean f;

    public WatchTabSector(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList(12);
        a = getResources().getDimensionPixelSize(0x7f0b003e);
    }

    static Fan a(WatchTabSector watchtabsector)
    {
        return watchtabsector.d;
    }

    private void a(int i, nc nc1, int j, int k)
    {
        if (b.size() > i && b.get(i) != null)
        {
            ((nk)b.get(i)).b(nc1.b(), j, k, this);
            return;
        } else
        {
            nk NK = nk.a(nc1.b(), j, k, this);
            b.add(NK);
            addView(NK, NK.a(false));
            return;
        }
    }

    private void a(nk nk1)
    {
        if (nk1.a > 90F)
        {
            return;
        } else
        {
            AnimationSet animationset = new AnimationSet(false);
            animationset.setFillAfter(true);
            float f1 = nk1.b;
            float f2 = nk1.c;
            Object obj = new TranslateAnimation(-f1, 0.0F, f2, 0.0F);
            ((TranslateAnimation) (obj)).setDuration(WatchItemSector.getDuration());
            ((TranslateAnimation) (obj)).setInterpolator(new lt());
            animationset.addAnimation(((android.view.animation.Animation) (obj)));
            obj = new AlphaAnimation(0.0F, 1.0F);
            ((AlphaAnimation) (obj)).setDuration(WatchItemSector.getDuration());
            animationset.addAnimation(((android.view.animation.Animation) (obj)));
            nk1.startAnimation(animationset);
            return;
        }
    }

    private void b(nk nk1)
    {
        if (nk1.a > 90F)
        {
            return;
        } else
        {
            AnimationSet animationset = new AnimationSet(false);
            animationset.setFillAfter(true);
            Object obj = new AlphaAnimation(1.0F, 0.0F);
            ((AlphaAnimation) (obj)).setDuration(ls.a() * 3);
            animationset.addAnimation(((android.view.animation.Animation) (obj)));
            float f1 = nk1.b;
            float f2 = nk1.c;
            obj = new TranslateAnimation(0.0F, -f1, 0.0F, f2);
            ((TranslateAnimation) (obj)).setDuration(ls.a() * 4);
            ((TranslateAnimation) (obj)).setInterpolator(new lt(true));
            animationset.addAnimation(((android.view.animation.Animation) (obj)));
            nk1.startAnimation(animationset);
            return;
        }
    }

    public void a()
    {
        nc nc1 = e.getCurrentTab();
        nc nc2 = e.getPreviousTab();
        nc nc3 = e.getNextTab();
        a(0, nc1, 45, 0);
        a(1, nc2, 75, 0);
        a(2, nc3, 15, 0);
        a(3, nc1, 45, 90);
        a(4, nc2, 75, 90);
        a(5, nc3, 15, 90);
        a(6, nc1, 45, 180);
        a(7, nc2, 75, 180);
        a(8, nc3, 15, 180);
        a(9, nc1, 45, 270);
        a(10, nc2, 75, 270);
        a(11, nc3, 15, 270);
        setDegree(0);
    }

    public void a(Fan fan, WatchSectorArea watchsectorarea)
    {
        d = fan;
        e = watchsectorarea;
    }

    public void a(boolean flag)
    {
        a();
        if (Fan.n())
        {
            d();
        } else
        if (flag)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); a((nk)iterator.next())) { }
            postDelayed(new Runnable() {

                final WatchTabSector a;

                public void run()
                {
                    WatchTabSector.a(a).a();
                }

            
            {
                a = WatchTabSector.this;
              // super();
            }
            }, ls.b());
            return;
        }
    }

    public boolean a(Canvas canvas)
    {
        try
        {
            draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception )
        {
            return false;
        }
        return true;
    }

    public void b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); b((nk)iterator.next())) { }
        postDelayed(new Runnable() {

            final WatchTabSector a;

            public void run()
            {
                try
                {
                    WatchTabSector.a(a).setVisibility(4);
                }
                catch (Throwable throwable) { }
                a.post(new Runnable() {

                   

                    public void run()
                    {
                        WatchTabSector.a(a).a(false);
                    }

            
            
                });
            }

            
            {
                a = WatchTabSector.this;
              
            }
        }, ls.a() * 4);
    }

    public boolean c()
    {
        return f;
    }

    public void d()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((nk)iterator.next()).a()) { }
        requestLayout();
    }

    public void e()
    {
        d.a();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(a, a);
    }

    public void setDegree(int i)
    {
        c = i;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((nk)iterator.next()).a(i)) { }
        requestLayout();
    }

    public void setDirection(boolean flag)
    {
        f = flag;
		WatchSectorArea.a(this, flag);
	}
}
