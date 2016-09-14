package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;

public class fl {
	private static String a = null;

	/* Error */
	/**
	 * @deprecated
	 */
	  public static String a(Context context) {
	      //  Class<fl> var5_1 = fl.class;
	        synchronized (fl.class) {
	            if (a != null) return a;
	            File file = new File(context.getFilesDir(), "AF_INSTALLATION");
	            try {
	                if (!file.exists()) {
	                    fl.a(file, context);
	                }
	                a = fl.a(file);
	            }
	            catch (Exception exception) {
	                throw new RuntimeException((Throwable)exception);
	            }
	            return a;
	        }
	    }

	private static String a(File paramFile) {
		RandomAccessFile localRandomAccessFile = null;
		try {
			localRandomAccessFile = new RandomAccessFile(paramFile, "r");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] arrayOfByte = null;
		try {
			arrayOfByte = new byte[(int) localRandomAccessFile.length()];
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			localRandomAccessFile.readFully(arrayOfByte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			localRandomAccessFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(arrayOfByte);
	}

	private static void a(File paramFile, Context paramContext) {
		FileOutputStream localFileOutputStream = null;
		try {
			localFileOutputStream = new FileOutputStream(paramFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PackageInfo localPackageInfo = null;
		try {
			localPackageInfo = paramContext.getPackageManager().getPackageInfo(
					paramContext.getPackageName(), 0);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Build.VERSION.SDK_INT >= 9) {
		}
		for (String str = localPackageInfo.firstInstallTime + "-"
				+ Math.abs(new Random().nextLong());; str = UUID.randomUUID()
				.toString()) {
			try {
				localFileOutputStream.write(str.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				localFileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
	}
}
