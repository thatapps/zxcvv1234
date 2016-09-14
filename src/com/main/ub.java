package com.main;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import android.database.Cursor;

public class ub {
	public static int a(InputStream inputStream, OutputStream outputStream) {
		long l = ub.b(inputStream, outputStream);
		if (l > Integer.MAX_VALUE) {
			return -1;
		}
		return (int) l;
	}

	public static int a(Reader reader, Writer writer) {
		long l = ub.b(reader, writer);
		if (l > Integer.MAX_VALUE) {
			return -1;
		}
		return (int) l;
	}

	public static String a(InputStream inputStream) {
		StringWriter stringWriter = new StringWriter();
		ub.a(inputStream, (Writer) stringWriter);
		return stringWriter.toString();
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static void a(Cursor cursor) {
		if (cursor == null)
			return;
		try {
			cursor.close();
			return;
		} catch (Exception var1_1) {
			return;
		}
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	public static void a(Closeable closeable) {
		if (closeable == null)
			return;
		try {
			closeable.close();
			return;
		} catch (IOException var1_1) {
			return;
		}
	}

	public static void a(InputStream inputStream, Writer writer) {
		ub.a((Reader) new InputStreamReader(inputStream), writer);
	}

	public static long b(InputStream inputStream, OutputStream outputStream) {
		int n;
		byte[] arrby = new byte[4096];
		long l = 0;
		try {
			while (-1 != (n = inputStream.read(arrby))) {
				outputStream.write(arrby, 0, n);
				l += (long) n;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	public static long b(Reader reader, Writer writer) {
		int n;
		char[] arrc = new char[4096];
		long l = 0;
		try {
			while (-1 != (n = reader.read(arrc))) {
				try {
					writer.write(arrc, 0, n);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				l += (long) n;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

}
