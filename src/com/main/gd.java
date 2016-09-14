package com.main;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.util.Base64;
/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.io.UnsupportedEncodingException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */

public class gd {
    public static String a;
    public static String b;
    private static String c;
    private static String d;

    static {
        c = "tgpPPsiJWz2LF8Vv8haGZtPMSfQ3Vf83";
        d = "tgpPPsiJWz2LF8Vv8haGZtPMSfQ3Vf83";
        a = "tgpPPsiJWz2LF8Vv8";
        b = "haGZtPMSfQ3Vf83";
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static String a(long l) {
        return gd.a(String.valueOf((long)l));
    }

    public static String a(String string) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance((String)"MD5");
        }
        catch (NoSuchAlgorithmException var1_2) {
            var1_2.printStackTrace();
            return null;
        }
        return gd.a(messageDigest.digest(string.getBytes()));
    }

    public static String a(String string, int n) {
        if (n > 0) {
            return string.substring(n);
        }
        return string.substring(n + string.length());
    }

    public static String a(String string, int n, int n2) {
        return string.substring(n, n + n2);
    }

    public static String a(String string, long l) {
        String string2 = "0000000000" + l;
        return string2.substring(-10 + string2.length());
    }

    public static String a(String string, String string2) {
        try {
            String string3 = gd.a(Base64.encodeToString((byte[])string.getBytes("utf-8"), (int)0), "ENCODE", string2 + b);
            return string3;
        }
        catch (UnsupportedEncodingException var2_3) {
            var2_3.printStackTrace();
            return null;
        }
    }

    public static String a(String string, String string2, String string3) {
        return gd.a(string, string2, string3, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string, String string2, String string3, int n) {
        String string4 = gd.a(string3);
        String string5 = gd.a(gd.a(string4, 0, 16));
        String string6 = gd.a(gd.a(string4, 16, 16));
        String string7 = gd.a(string, 0, 4);
        String string8 = gd.a(gd.a(gd.a()), - 4);
        if (!string2.equals((Object)"DECODE")) {
            string7 = string8;
        }
        String string9 = string5 + gd.a(new StringBuilder().append(string5).append(string7).toString());
        int n2 = string9.length();
        String string10 = gd.b(gd.a(string, 4));
        if (!string2.equals((Object)"DECODE")) {
            string10 = gd.a("%010d", 0) + gd.a(gd.a(new StringBuilder().append(string).append(string6).toString()), 0, 16) + string;
        }
        int n3 = string10.length();
        StringBuffer stringBuffer = new StringBuffer();
        int[] arrn = new int[256];
        int n4 = 0;
        while (n4 < 256) {
            arrn[n4] = n4++;
        }
        int[] arrn2 = new int[256];
        for (int i = 0; i <= 255; ++i) {
            arrn2[i] = string9.charAt(i % n2);
        }
        int n5 = 0;
        for (int j = 0; j < 256; ++j) {
            n5 = (n5 + arrn[j] + arrn2[j]) % 256;
            int n6 = arrn[j];
            arrn[j] = arrn[n5];
            arrn[n5] = n6;
        }
        int n7 = 0;
        int n8 = 0;
        for (int k = 0; k < n3; ++k) {
            n8 = (n8 + 1) % 256;
            n7 = (n7 + arrn[n8]) % 256;
            int n9 = arrn[n8];
            arrn[n8] = arrn[n7];
            arrn[n7] = n9;
            stringBuffer.append((char)(string10.charAt(k) ^ arrn[(arrn[n8] + arrn[n7]) % 256]));
        }
        if (!string2.equals((Object)"DECODE")) {
            return string7 + gd.c(stringBuffer.toString());
        }
        String string11 = stringBuffer.substring(0, stringBuffer.length());
        if (Integer.parseInt((String)gd.a(string11.toString(), 0, 10)) == 0 && gd.a(string11.toString(), 10, 16).equals((Object)gd.a(gd.a(gd.a(string11.toString(), 26) + string6), 0, 16))) {
            return gd.a(string11.toString(), 26);
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(byte[] arrby) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrby.length; ++i) {
            String string = Integer.toHexString((int)(255 & arrby[i]));
            if (string.length() == 1) {
                stringBuffer.append("0").append(string);
                continue;
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static String b(String string) {
        try {
            String string2 = new String(gc.a(string));
            return string2;
        }
        catch (Exception var2_2) {
            return var2_2.getMessage();
        }
    }

    public static String b(byte[] arrby) {
        try {
            String string = gd.a(Base64.encodeToString((byte[])arrby, (int)0), "ENCODE", c);
            return string;
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
            return null;
        }
    }

    public static String c(String string) {
        try {
            String string2 = new String(gc.a(string.getBytes()));
            return string2;
        }
        catch (Exception var2_2) {
            return var2_2.getMessage();
        }
    }
}

