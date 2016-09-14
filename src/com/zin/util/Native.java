/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.lazyswipe.util;

import com.main.vj;


public class Native {
    static {
        try {
            System.loadLibrary((String)"nu");
           // return;
        }
        catch (Throwable var0) {
            vj.b("Swipe.Native", "Could not load library", var0);
            //return;
        }
    }
}

