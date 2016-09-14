package com.main;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class fm {

	private static fm a = new fm();

	private fm() {
	}

	public static fm a() {
		return a;
	}

	private fn a(File file) {
		fn fn1;
		try {
			FileReader filereader = new FileReader(file);
			char ac[] = new char[(int) file.length()];
			filereader.read(ac);
			fn1 = new fn(ac);
			fn1.a(file.getName());
			filereader.close();
		}
		// Misplaced declaration of an exception variable
		catch (Exception ex) {
			return null;
		}
		return fn1;
	}

	private File c(Context context) {
		return new File(context.getFilesDir(), "AFRequestCache");
	}

	public void a(Context context) {
		try {
			if (!c(context).exists()) {
				c(context).mkdir();
			}
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.i("AppsFlyer_1.13", "Could not create cache directory");
		}
	}

	public void a(fn fn1, Context context) {
		File file;
		try {
			file = c(context);
			if (!file.exists()) {
				file.mkdir();
				return;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.i("AppsFlyer_1.13", "Could not cache request");
			return;
		}
		if (file.listFiles().length > 20) {
			Log.i("AppsFlyer_1.13", "reached cache limit, not caching request");
			return;
		}
		Log.i("AppsFlyer_1.13", "caching request...");
		File file2 = new File(c(context), Long.toString(System
				.currentTimeMillis()));
		try {
			file2.createNewFile();
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
					new FileOutputStream(file2.getPath(), true));
			outputStreamWriter.write("version=");
			outputStreamWriter.write(fn1.a());
			outputStreamWriter.write(10);
			outputStreamWriter.write("url=");
			outputStreamWriter.write(fn1.c());
			outputStreamWriter.write(10);
			outputStreamWriter.write("data=");
			outputStreamWriter.write(fn1.b());
			outputStreamWriter.write(10);
			outputStreamWriter.flush();
			outputStreamWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return;
	}

	public void a(String s, Context context) {
		File file = new File(c(context), s);
		Log.i("AppsFlyer_1.13", (new StringBuilder()).append("Deleting ")
				.append(s).append(" from cache").toString());
		if (file.exists()) {
			file.delete();
		}

		return;

	}

	public List b(Context context) {
		int j;
		ArrayList arraylist = new ArrayList();
		File file = c(context);
		if (!file.exists()) {
			file.mkdir();

		}

		File[] files = file.listFiles();
		j = files.length;
		int i = 0;

		while (i < j) {
			file = files[i];
			arraylist.add(a(file));
			i++;
		}

		Log.i("AppsFlyer_1.13",
				(new StringBuilder()).append("Found cached request")
						.append(file.getName()).toString());

		return arraylist;
	}
}
