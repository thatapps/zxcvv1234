package com.main;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

import android.util.Log;

public class tq {
	public static final File[] a = new File[0];

	public static String a(long paramLong, String paramString) {
		DecimalFormat localDecimalFormat = new DecimalFormat("#.##",
				new DecimalFormatSymbols(Locale.US));
		String str;
		if (paramLong / 1073741824L > 0L) {
			str = localDecimalFormat
					.format(1.0F * (float) paramLong / 1.07374182E9F)
					+ paramString + "GB";
		}

		if (paramLong / 1048576L > 0L) {
			str = localDecimalFormat
					.format(1.0F * (float) paramLong / 1048576.0F)
					+ paramString + "MB";
		} else if (paramLong / 1024L > 0L) {
			str = localDecimalFormat.format(1.0F * (float) paramLong / 1024.0F)
					+ paramString + "KB";
		} else {
			str = String.valueOf(paramLong) + paramString + "bytes";
		}
		return str;
	}

	public static String a(File paramFile, int paramInt, String paramString) {

		String str = null;
		try {
			Class localClass = Class.forName("android.os.FileUtils");
			Class[] arrayOfClass = new Class[3];
			arrayOfClass[0] = File.class;
			arrayOfClass[1] = Integer.TYPE;
			arrayOfClass[2] = String.class;
			Method localMethod = localClass.getDeclaredMethod("readTextFile",
					arrayOfClass);
			localMethod.setAccessible(true);
			Object[] arrayOfObject = new Object[3];
			arrayOfObject[0] = paramFile;
			arrayOfObject[1] = Integer.valueOf(paramInt);
			arrayOfObject[2] = paramString;
			str = (String) localMethod.invoke(null, arrayOfObject);
			return str;
		} catch (Throwable localThrowable) {

		}
		return str;
	}

	public static String a(InputStream inputStream) {
		StringBuilder stringBuilder = new StringBuilder();
		try {
			String string;
			BufferedReader bufferedReader = new BufferedReader(
					(Reader) new InputStreamReader(inputStream));
			try {
				while ((string = bufferedReader.readLine()) != null) {
					stringBuilder.append(string).append("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return stringBuilder.toString();
		} catch (OutOfMemoryError var3_4) {
			Log.e((String) "Swipe.FileUtils", (String) "readTextStream failed",
					(Throwable) var3_4);
		}
		return stringBuilder.toString();
	}

	// private static Checksum a(File file, Checksum checksum) {
	// if (file.isDirectory()) {
	// throw new IllegalArgumentException(
	// "Checksums can't be computed on directories");
	// }
	// CheckedInputStream checkedinputstream = null;
	// try {
	// checkedinputstream = new CheckedInputStream(new FileInputStream(
	// file), checksum);
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// ub.a(checkedinputstream, new tr());
	// if (checkedinputstream != null) {
	// a(((Closeable) (checkedinputstream)));
	// }
	//
	// if (checksum != null) {
	// a(((Closeable) (checksum)));
	// return checksum;
	// }
	//
	// checksum = (Checksum) checkedinputstream;
	// return checksum;
	// }
	private static Checksum a(File var0, Checksum var1_1) {
		CheckedInputStream var2_2 = null;
		if (var0.isDirectory()) {
			throw new IllegalArgumentException(
					"Checksums can't be computed on directories");
		}
		try {
			var2_2 = new CheckedInputStream((InputStream) new FileInputStream(
					var0), var1_1);
		} catch (Throwable var3_3) {
			var2_2 = null;

			if (var2_2 == null)
				tq.a((Closeable) var2_2);

		}
		ub.a((InputStream) var2_2, (OutputStream) new tr());
		if (var2_2 == null)
			return var1_1;
		{

		}
		tq.a((Closeable) var2_2);
		return var1_1;
	}

	public static void a(Closeable paramCloseable) {
		try {
			paramCloseable.close();
			return;
		} catch (Throwable localThrowable) {

		}
	}

	public static void a(File file) {
		if (!file.exists()) {
			return;
		}
		tq.c(file);
		if (file.delete())
			return;
		// throw new IOException("Unable to delete directory " + (Object)file +
		// ".");
	}

	public static void a(File file, int n, long l) {
		try {
			Class class_ = Class.forName((String) "android.os.FileUtils");
			Class[] arrclass = new Class[] { File.class, Integer.TYPE,
					Long.TYPE };
			Method method = class_.getDeclaredMethod("deleteOlderFiles",
					arrclass);
			method.setAccessible(true);
			Object[] arrobject = new Object[] { file, n, l };
			method.invoke((Object) null, arrobject);
			return;
		} catch (Throwable var4_7) {
			tq.b(file, n, l);
			return;
		}
	}

	public static void a(File paramFile, long paramLong) {
		a(paramFile, 0, paramLong);
	}

	// public static void a(File file, FilenameFilter filenameFilter)
	// throws IOException {
	// if (!file.exists()) {
	// throw new IllegalArgumentException((Object) file
	// + " does not exist");
	// }
	// if (!file.isDirectory()) {
	// throw new IllegalArgumentException((Object) file
	// + " is not a directory");
	// }
	// File[] arrfile = filenameFilter == null ? file.listFiles() : file
	// .listFiles(filenameFilter);
	// if (arrfile == null) {
	// // throw new IOException("Failed to list contents of " + (Object)
	// // file);
	// }
	// int n = arrfile.length;
	// Object var4_4 = null;
	// for (int i = 0; i < n; ++i) {
	// File file2 = arrfile[i];
	// tq.d(file2);
	//
	// }
	// }
	public static void a(File file, FilenameFilter filenameFilter) {
		if (!file.exists()) {
			throw new IllegalArgumentException((Object) file
					+ " does not exist");
		}
		if (!file.isDirectory()) {
			throw new IllegalArgumentException((Object) file
					+ " is not a directory");
		}
		File[] arrfile = filenameFilter == null ? file.listFiles() : file
				.listFiles(filenameFilter);
		if (arrfile == null) {

		}
		int n = arrfile.length;
		Object var4_4 = null;
		for (int i = 0; i < n; ++i) {
			File file2 = arrfile[i];
			tq.d(file2);
			
		}
	}

	public static void a(File paramFile, String paramString) {
		a(paramFile.getAbsolutePath(), paramString);
	}

	public static void a(String paramString1, String paramString2) {
		try {
			Class localClass = Class.forName("android.os.FileUtils");
			Class[] arrayOfClass = new Class[2];
			arrayOfClass[0] = String.class;
			arrayOfClass[1] = String.class;
			Method localMethod = localClass.getDeclaredMethod("stringToFile",
					arrayOfClass);
			localMethod.setAccessible(true);
			Object[] arrayOfObject = new Object[2];
			arrayOfObject[0] = paramString1;
			arrayOfObject[1] = paramString2;
			localMethod.invoke(null, arrayOfObject);
			return;
		} catch (Throwable localThrowable) {

		}
	}

	public static boolean a(InputStream paramInputStream, File paramFile) {
		boolean bool1 = false;
		try {
			Class localClass = Class.forName("android.os.FileUtils");
			Class[] arrayOfClass = new Class[2];
			arrayOfClass[0] = InputStream.class;
			arrayOfClass[1] = File.class;
			Method localMethod = localClass.getDeclaredMethod("copyToFile",
					arrayOfClass);
			localMethod.setAccessible(true);
			Object[] arrayOfObject = new Object[2];
			arrayOfObject[0] = paramInputStream;
			arrayOfObject[1] = paramFile;
			boolean bool2 = ((Boolean) localMethod.invoke(null, arrayOfObject))
					.booleanValue();
			bool1 = bool2;
		} catch (Throwable localThrowable) {

		}
		return bool1;
	}

	public static String b(InputStream paramInputStream) {
		String str1 = null;
		try {
			String str2 = a(paramInputStream);
			str1 = str2;
		} catch (Throwable localThrowable) {

		}
		return str1;
	}

	public static void b(File file, int n, long l) {
		boolean bl;
		int n2 = 0;
		if (n < 0 || l < 0) {
			throw new IllegalArgumentException(
					"Constraints must be positive or 0");
		}
		Object[] arrobject = file.listFiles();
		Comparator var6_5 = new Comparator() {

			public int a(File file, File file2) {
				return (int) (file.lastModified() - file2.lastModified());
			}

			public int compare(Object object, Object object2) {
				return this.a((File) object, (File) object2);
			}
		};
		try {
			Arrays.sort((Object[]) arrobject, (Comparator) var6_5);
			bl = true;
		} catch (Throwable var7_7) {
			bl = false;
		}
		long l2 = System.currentTimeMillis();
		int n3 = arrobject.length - n;
		int n4 = arrobject.length;
		int n5 = 0;
		for (; n2 < n4; ++n2) {
			Object object = arrobject[n2];
			int n6 = n5 + 1;
			if (n5 >= n3) {
				return;
			}
			if (l2 - ((File) object).lastModified() > l) {
				((File) object).delete();
			} else if (bl) {
				return;
			}
			n5 = n6;
		}
	}

	public static boolean b(File file) {
		if (file == null) {
			return false;
		}
		File file1 = new File((new StringBuilder())
				.append(file.getAbsolutePath())
				.append(System.currentTimeMillis()).toString());
		file.renameTo(file1);
		boolean flag;
		try {
			if (file1.isDirectory()) {
				c(file1);
			}
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
		}
		try {
			flag = file1.delete();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.w("Swipe.FileUtils",
					(new StringBuilder()).append("Delete file failed: ")
							.append(file1).toString());
			return false;
		}
		return flag;
	}

	public static void c(File file) {
		a(file, ((FilenameFilter) (null)));
	}

	public static void d(File file) {
		if (file.isDirectory()) {
			tq.a(file);
			return;
		} else {
			if (!file.exists()) {
				try {
					throw new FileNotFoundException("File does not exist: "
							+ (Object) file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (file.delete())
				return;
			{
				try {
					throw new IOException("Unable to delete file: "
							+ (Object) file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static String e(File paramFile) {
		return a(paramFile, 0, null);
	}

	public static long f(File file) {
		try {
			Method method = Class.forName((String) "android.os.FileUtils")
					.getDeclaredMethod("checksumCrc32",
							new Class[] { File.class });
			method.setAccessible(true);
			long l = (Long) method.invoke((Object) null, new Object[] { file });
			return l;
		} catch (Throwable var1_3) {
			return tq.h(file);
		}
	}

	public static boolean g(File file) {
		Object obj = null;
		RandomAccessFile randomAccessFile = null;
		try {
			randomAccessFile = new RandomAccessFile(file, "rw");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		long l = file.length();
		try {
			randomAccessFile.setLength(1L + l);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			randomAccessFile.setLength(l);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (file != null) {
			a(file);
		}

		file = ((File) (obj));

		if (file != null) {
			a(file);
		}
		obj = file;
		return false;

	}

	private static long h(File file) {
		try {
			CRC32 cRC32 = new CRC32();
			tq.a(file, (Checksum) cRC32);
			long l = cRC32.getValue();
			return l;
		} catch (Throwable var2_3) {
			return -1;
		}
	}
}
