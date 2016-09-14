package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.text.TextUtils;

public class pu {
	public final String a;
	public final String b;
	public final String c;
	public final String d;
	private final List e;

//	public pu(String paramString1, String paramString2, String paramString3,
//			String paramString4, String paramString5) {
//		this.a = paramString1;
//		if (TextUtils.isEmpty(paramString2)) {
//		}
//		for (Object localObject = new ArrayList(0);; localObject = Arrays
//				.asList(paramString2.split(","))) {
//			this.e = ((List) localObject);
//			this.b = paramString3;
//			this.c = paramString4;
//			this.d = paramString5;
//			return;
//		}
//	}
	public pu(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        ArrayList list = null;
        if (TextUtils.isEmpty(s1))
        {
        	list = new ArrayList(0);
        } else
        {
        	list = (ArrayList) Arrays.asList(s1.split(","));
        }
        e = list;
        b = s2;
        c = s3;
        d = s4;
    }
	public List a() {
		return this.e;
	}
}
