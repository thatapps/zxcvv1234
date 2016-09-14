package com.main;
import android.util.FloatMath;
import android.view.View;

public class mg
{

    public int a;
    public int b;

    public mg(int i, int j)
    {
        a = i;
        b = j;
    }

    public mg(int i, int j, View view, boolean flag)
    {
        this(i, j);
        if (view != null)
        {
            b = view.getHeight() - j;
            if (!flag)
            {
                a = i - view.getWidth();
            }
        }
    }

    public float a()
    {
        return FloatMath.sqrt(a * a + b * b);
    }

    public String toString()
    {
        return String.format("(%d, %d)", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
