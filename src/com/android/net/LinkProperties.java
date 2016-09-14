// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.net;

import java.util.Collection;

import android.os.Parcelable;

public abstract class LinkProperties
    implements Parcelable
{

    public LinkProperties()
    {
    }

    public abstract Collection getAllAddresses();
}
