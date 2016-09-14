package com.main;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import android.view.View.DragShadowBuilder;

class lq extends DragShadowBuilder
{

    private float a;
    private int b;
    private int c;
    private Point d;

    public lq(View view, float f)
    {
        super(view);
        a = 1.0F;
        a = f;
    }

    public lq(View view, float f, Point point)
    {
        this(view, f);
        d = point;
    }

    public void onDrawShadow(Canvas canvas)
    {
        canvas.save();
        canvas.scale(a, a);
        super.onDrawShadow(canvas);
        canvas.restore();
    }

    public void onProvideShadowMetrics(Point point, Point point1)
    {
        b = (int)((float)getView().getWidth() * a);
        c = (int)((float)getView().getHeight() * a);
        point.set(b, c);
        if (d == null)
        {
            point1.set(b / 2, c / 2);
            return;
        }
        if (d.x < 0 || d.y < 0)
        {
            point1.set(b / 2, c / 2);
            return;
        } else
        {
            point1.set(d.x, d.y);
            return;
        }
    }
}
