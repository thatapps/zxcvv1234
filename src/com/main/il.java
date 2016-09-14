package com.main;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import android.content.Context;
import android.os.Build;
import android.os.Process;

public class il implements Thread.UncaughtExceptionHandler {
	protected final DateFormat a;
	protected final Context b;
	protected final String c;
	private final Thread.UncaughtExceptionHandler d;
	private final Map e;

	public il(Context paramContext, String paramString) {
		this.c = paramString;
		this.b = paramContext.getApplicationContext();
		this.a = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US);
		this.d = Thread.getDefaultUncaughtExceptionHandler();
		this.e = new LinkedHashMap();
		Thread.setDefaultUncaughtExceptionHandler(this);
	}

	private void a(StringBuilder paramStringBuilder, File paramFile,
			String paramString) {
		tq.a(new File(paramFile, paramString), paramStringBuilder.toString());
	}

	private void b() {
		try {
			this.e.put("[Product]", "");
			a();
			this.e.put("[Device]", "");
			Field[] arrayOfField = Build.class.getFields();
			int i = arrayOfField.length;
			int j = 0;

			Field localField = null;
			if (j < i) {
				localField = arrayOfField[j];
			}
			try {
				this.e.put(localField.getName(), localField.get(null)
						.toString());
				j++;
				// continue;
				// return;
			} catch (Exception localException2) {

			}

		} catch (Exception localException1) {

		}
	}

	protected void a() {
		this.e.put("VersionName", "2.0");
		this.e.put("VersionCode", String.valueOf(2001));
		this.e.put("PackageName", "com.lazyswipe.zev");
	}

	protected void a(Throwable paramThrowable) {
		StringBuilder localStringBuilder = new StringBuilder();
		Iterator localIterator = this.e.entrySet().iterator();
		while (localIterator.hasNext()) {
			Map.Entry localEntry = (Map.Entry) localIterator.next();
			localStringBuilder.append((String) localEntry.getKey()).append('=')
					.append((String) localEntry.getValue()).append("\n");
		}
		localStringBuilder.append("\n[Exception]\n");
		StringWriter localStringWriter = new StringWriter();
		PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
		paramThrowable.printStackTrace(localPrintWriter);
		for (Throwable localThrowable = paramThrowable.getCause(); localThrowable != null; localThrowable = localThrowable
				.getCause()) {
			localThrowable.printStackTrace(localPrintWriter);
		}
		localPrintWriter.close();
		localStringBuilder.append(localStringWriter.toString());
		String str = "crash-" + this.a.format(new Date()) + ".txt";
		File localFile = new File(this.c);
		if (localFile.exists()) {
			a(localStringBuilder, localFile, str);
		}

		a(localStringBuilder, this.b.getFilesDir(), str);
		return;
	}

	public boolean a(Thread paramThread, Throwable paramThrowable) {
		b();
		a(paramThrowable);
		return false;
	}

	public void uncaughtException(Thread paramThread, Throwable paramThrowable) {
		if (!a(paramThread, paramThrowable)) {
			vj.d();
			this.d.uncaughtException(paramThread, paramThrowable);
		}

		try {
			Thread.sleep(1500L);
			Process.killProcess(Process.myPid());
			System.exit(-1);
		} catch (InterruptedException localInterruptedException) {

		}
		return;
	}
}
