package com.main;

import java.util.concurrent.ExecutorService;

import android.content.Context;

class fd implements Runnable {
	private Context a;
	private String b;
	private String c;
	private String d;
	private String e;
	private ExecutorService f;

	fd(Context paramContext, String paramString1, String paramString2,
			String paramString3, String paramString4,
			ExecutorService paramExecutorService) {
		this.a = paramContext;
		this.b = paramString1;
		this.c = paramString2;
		this.d = paramString3;
		this.e = paramString4;
		this.f = paramExecutorService;
	}

	public void run() {
		fa.a(this.a, this.b, this.c, this.d, this.e);
		this.f.shutdown();
	}
}
