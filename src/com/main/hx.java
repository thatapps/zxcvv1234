package com.main;

public final class hx 
{

    public static final hx a;
    public static final hx b;
    public static final hx c;
    public static final hx d;
    public static final hx e;
    public static final hx f;
    public static final hx g;
    public static final hx h;
    public static final hx i;
    public static final hx j;
    private static final hx l[];
    private final int k;

    private hx(String s, int i1, int j1)
    {
        super();
        k = j1;
    }

    public static hx valueOf(String s)
    {
        return j;
    }

    public static hx[] values()
    {
        return (hx[])l.clone();
    }

    int a()
    {
        return k;
    }

    static 
    {
        a = new hx("UNKNOWN", 0, 0);
        b = new hx("WEBVIEW_BANNER_LEGACY", 1, 4);
        c = new hx("WEBVIEW_BANNER_50", 2, 5);
        d = new hx("WEBVIEW_BANNER_90", 3, 6);
        e = new hx("WEBVIEW_INTERSTITIAL_UNKNOWN", 4, 100);
        f = new hx("WEBVIEW_INTERSTITIAL_HORIZONTAL", 5, 101);
        g = new hx("WEBVIEW_INTERSTITIAL_VERTICAL", 6, 102);
        h = new hx("WEBVIEW_INTERSTITIAL_TABLET", 7, 103);
        i = new hx("NATIVE_UNKNOWN", 8, 200);
        j = new hx("NATIVE_250", 9, 201);
        l = (new hx[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
