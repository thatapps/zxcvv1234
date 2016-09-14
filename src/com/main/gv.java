package com.main;

import android.content.Context;
import android.net.Uri;

public class gv {
	public static gu a(Context paramContext, Uri paramUri) {
		String str1 = paramUri.getAuthority();
		String str2 = paramUri.getQueryParameter("video_url");
		Object localObject;
		if ("store".equals(str1)) {
			if (str2 != null) {
				localObject = new gy(paramContext, paramUri);
			}
		}

		localObject = new gw(paramContext, paramUri);

		if ("open_link".equals(str1)) {
			localObject = new gx(paramContext, paramUri);
		} else {
			localObject = null;
		}
		return (gu) localObject;
	}
}
