package com.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

public class gg {
	public static String a() {
		Object localObject = "";
		try {
			String str = Build.MODEL.replace(" ", "_");
			localObject = str;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		}
		return (String) localObject;
	}

	private static String a(int paramInt, long paramLong, String paramString) {
		return paramInt + "," + paramLong + "," + paramString + ";";
	}

	public static String a(int paramInt, long paramLong, String paramString1,
			String paramString2) {
		if (TextUtils.isEmpty(paramString2)) {
		}
		for (String str = a(paramInt, paramLong, paramString1);; str = paramInt
				+ "," + paramLong + "," + paramString1 + "," + paramString2
				+ ";") {
			return str;
		}
	}

	public static String a(Context paramContext) {
		String str1 = "";
		try {
			String str2 = ((TelephonyManager) paramContext
					.getSystemService("phone")).getNetworkOperator();
			str1 = str2;
		} catch (Exception localException) {

		}
		return str1;
	}

	public static String a(String paramString, int paramInt) {
		String str1 = paramString.trim();
		if ((paramInt == 1) || (paramInt == 4)) {
		}
		for (String str2 = str1.replace(" ", "_").replace(",", "_");; str2 = str1
				.replace(" ", "_").replace("^", "_").replace("`", "_")
				.replace("[", "_").replace("]", "_").replace(",", "_")
				.replace(":", "_").replace(";", "_")) {
			return str2;
		}
	}

	public static String a(String paramString1, String paramString2) {
		return "U:" + paramString1 + "~L:{" + paramString2 + "}";
	}

	public static String a(HashMap[] paramArrayOfHashMap) {
		StringBuilder localStringBuilder1 = null;
		StringBuilder localStringBuilder2 = null;
		int j = 0;
		StringBuilder localStringBuilder3 = null;
		Object localObject = null;
		try {
			localStringBuilder1 = new StringBuilder();
			localStringBuilder2 = new StringBuilder();
			localStringBuilder1.append("[");
			int i = paramArrayOfHashMap.length;
			j = 0;
			if (j < i) {
				HashMap localHashMap = paramArrayOfHashMap[j];
				localStringBuilder3 = new StringBuilder();
				Iterator localIterator = localHashMap.entrySet().iterator();
				while (localIterator.hasNext()) {
					Map.Entry localEntry = (Map.Entry) localIterator.next();
					String str2 = (String) localEntry.getKey();
					String str3 = a((String) localEntry.getValue(), 2);
					localStringBuilder3.append(str2).append(":").append(str3)
							.append("`");
					// continue;
					return (String) localObject;
				}
			}
		} catch (Exception localException) {
			localException.printStackTrace();
			localObject = "";
		}
		for (;;) {
			localStringBuilder2.append(
					localStringBuilder3.toString().substring(0,
							-1 + localStringBuilder3.length())).append("^");
			j++;
			// break;
			localStringBuilder2.append("]");
			localStringBuilder1.append(localStringBuilder2.toString().trim());
			String str1 = localStringBuilder1.toString().trim();
			localObject = str1;
		}
	}

	public static HashMap a(String paramString) {
		HashMap localHashMap;
		if ((TextUtils.isEmpty(paramString))
				|| (paramString.startsWith("<html>"))
				|| (paramString.startsWith("<!DOCTYPE"))) {
			localHashMap = null;
		}

		localHashMap = new HashMap();
		String[] arrayOfString1 = paramString.replace("{", "").replace("}", "")
				.replace(" ", "").replace("\"", "").split(",");
		int i = arrayOfString1.length;
		for (int j = 0; j < i; j++) {
			String[] arrayOfString2 = arrayOfString1[j].split(":");
			if ((arrayOfString2 != null) && (arrayOfString2.length == 2)) {
				localHashMap.put(arrayOfString2[0], arrayOfString2[1]);
			}

		}
		return localHashMap;
	}

	public static void a(String paramString1, String paramString2,
			boolean paramBoolean, String paramString3) {
		CheckedOutputStream localCheckedOutputStream = null;
		try {
			localCheckedOutputStream = new CheckedOutputStream(
					new FileOutputStream(paramString2), new CRC32());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ZipOutputStream localZipOutputStream = new ZipOutputStream(
				localCheckedOutputStream);
		BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(
				localZipOutputStream);
		localZipOutputStream.setComment(paramString3);
		localZipOutputStream.setMethod(8);
		localZipOutputStream.setLevel(9);
		File localFile = new File(paramString1);
		if ((!localFile.exists())
				|| ((localFile.isDirectory()) && (localFile.list().length == 0))) {
			try {
				throw new FileNotFoundException(
						"File must exist and ZIP file must have at least one entry.");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (localFile.isFile()) {
		}
		for (String str = paramString1.substring(0,
				1 + paramString1.lastIndexOf("/"));; str = paramString1
				.replaceAll("/$", "") + "/") {
			if ((localFile.isDirectory())
					&& (str.indexOf("/") != -1 + str.length())) {
				str = str.replaceAll("[^/]+/$", "");
			}
			a(localZipOutputStream, localBufferedOutputStream, localFile, str);
			try {
				localBufferedOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fx.a) {
				Log.i("zipFile", "Checksum: "
						+ localCheckedOutputStream.getChecksum().getValue());
			}
			if (paramBoolean) {
				localFile.delete();
			}
			return;
		}
	}

	private static void a(ZipOutputStream paramZipOutputStream,
			BufferedOutputStream paramBufferedOutputStream, File paramFile,
			String paramString) {
		String str1 = paramFile.getAbsolutePath();
		if (paramFile.isDirectory()) {
			str1 = str1.replaceAll("/$", "") + "/";
		}
		String str2 = str1.replace(paramString, "").replaceAll("/$", "");
		if (paramFile.isDirectory()) {
			if (!"".equals(str2)) {
				if (fx.a) {
					Log.i("zipFile",
							"正在创建目录 - "
									+ paramFile.getAbsolutePath()
									+ " entryName=" + str2);
				}
				try {
					paramZipOutputStream.putNextEntry(new ZipEntry(str2 + "/"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			File[] arrayOfFile = paramFile.listFiles();
			for (int j = 0; j < arrayOfFile.length; j++) {
				a(paramZipOutputStream, paramBufferedOutputStream,
						arrayOfFile[j], paramString);
			}
		}
		if (fx.a) {
			Log.i("zipFile", "正在写文件 - " + paramFile.getAbsolutePath()
					+ " entryName=" + str2);
		}
		BufferedInputStream localBufferedInputStream = null;
		try {
			localBufferedInputStream = new BufferedInputStream(
					new FileInputStream(paramFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			paramZipOutputStream.putNextEntry(new ZipEntry(str2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] arrayOfByte = new byte[1024];
		try {
			for (int i = localBufferedInputStream.read(arrayOfByte); i != -1; i = localBufferedInputStream
					.read(arrayOfByte)) {
				paramBufferedOutputStream.write(arrayOfByte, 0, i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			paramBufferedOutputStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			localBufferedInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static byte[] a(long paramLong) {
		byte[] arrayOfByte = new byte[8];
		for (int i = 0; i < arrayOfByte.length; i++) {
			arrayOfByte[i] = new Long(0xFF & paramLong).byteValue();
			paramLong >>= 8;
		}
		return arrayOfByte;
	}

	/* Error */
	public static byte[] a(File file) {
		try {
			int n;
			FileInputStream fileInputStream = new FileInputStream(file);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(
					1000);
			byte[] arrby = new byte[1000];
			while ((n = fileInputStream.read(arrby)) != -1) {
				byteArrayOutputStream.write(arrby, 0, n);
			}
			fileInputStream.close();
			byteArrayOutputStream.close();
			return byteArrayOutputStream.toByteArray();
		} catch (FileNotFoundException var4_5) {
			var4_5.printStackTrace();
			return null;
		} catch (IOException var3_7) {
			var3_7.printStackTrace();
			return null;
		}
	}

	public static byte[] a(short paramShort) {
		byte[] arrayOfByte = new byte[2];
		for (int i = 0; i < arrayOfByte.length; i++) {
			arrayOfByte[i] = new Integer(paramShort & 0xFF).byteValue();
			paramShort >>= 8;
		}
		return arrayOfByte;
	}

	public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) {
		byte[] arrayOfByte = new byte[paramArrayOfByte1.length
				+ paramArrayOfByte2.length];
		System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0,
				paramArrayOfByte1.length);
		System.arraycopy(paramArrayOfByte2, 0, arrayOfByte,
				paramArrayOfByte1.length, paramArrayOfByte2.length);
		return arrayOfByte;
	}

	public static int b() {
		int i = 0;
		try {
			i = Build.VERSION.SDK_INT;
			return i;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		}
	}

	public static int b(String paramString) {
		if (TextUtils.isEmpty(paramString)) {
		}
		for (int i = 0;; i = Integer.parseInt(paramString)) {
			return i;
		}
	}

	public static String b(Context paramContext) {
		String str2;
		String str3;
		String str1 = "";
		try {
			String str4 = Settings.Secure.getString(
					paramContext.getContentResolver(), "android_id");
			str1 = str4;
		} catch (Exception localException) {
			for (;;) {

			}
		}
		if (str1 == null) {
			str1 = "";
		}
		str2 = c(paramContext);
		if (str2 == null) {
			str2 = "";
		}
		if (str2.equals(str1)) {
			str2 = "";
		}
		str3 = null;
		if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2))) {
			str3 = d(paramContext);
		}
		if (str3 == null) {
			str3 = "";
		}
		return str1 + "_" + str2 + "_" + str3;
	}

	public static long c(String paramString) {
		if (TextUtils.isEmpty(paramString)) {
		}
		for (long l = 0L;; l = Long.parseLong(paramString)) {
			return l;
		}
	}

	public static String c() {
		String str = "";
		try {
			str = Build.VERSION.RELEASE;
			return str;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		}
	}

	public static String c(Context paramContext) {
		String str1 = "";
		try {
			String str2 = ((TelephonyManager) paramContext
					.getSystemService("phone")).getDeviceId();
			str1 = str2;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();

			}
		}
		return str1;
	}

	public static String d() {
		Object localObject = "";
		try {
			String str = Build.MANUFACTURER.replace(" ", "_");
			localObject = str;
		} catch (Exception localException) {

		}
		return (String) localObject;
	}

	public static String d(Context paramContext) {
		String str1 = "";
		try {
			String str2 = ((WifiManager) paramContext.getSystemService("wifi"))
					.getConnectionInfo().getMacAddress();
			str1 = str2;
		} catch (Exception localException) {

		}
		return str1;
	}

	public static byte[] d(String paramString) {
		Object localObject = null;
		try {
			byte[] arrayOfByte1 = a((short) 3);
			long l = paramString.getBytes().length;
			if (fx.a) {
				Log.i("http", "size:" + l);
			}
			byte[] arrayOfByte2 = a(arrayOfByte1, a(l));
			localObject = arrayOfByte2;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		}
		return (byte[]) localObject;
	}

	public static long e() {
		long l1 = 0L;
		try {
			Calendar localCalendar = Calendar.getInstance();
			localCalendar.set(11, 0);
			localCalendar.set(12, 0);
			localCalendar.set(13, 0);
			localCalendar.set(14, 0);
			long l2 = localCalendar.getTimeInMillis();
			l1 = l2;
		} catch (Exception localException) {
			for (;;) {
				localException.printStackTrace();
			}
		}
		return l1;
	}

	public static NetworkInfo e(Context paramContext) {
		NetworkInfo localNetworkInfo;
		if (paramContext == null) {
			localNetworkInfo = null;
		}

		ConnectivityManager localConnectivityManager = (ConnectivityManager) paramContext
				.getSystemService("connectivity");
		if (localConnectivityManager == null) {
			localNetworkInfo = null;
		} else {
			localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
		}
		return localNetworkInfo;
	}

	public static String e(String paramString) {
		Object localObject = "";
		try {
			String str = InetAddress.getByName(paramString).getHostAddress();
			localObject = str;
		} catch (UnknownHostException localUnknownHostException) {
			for (;;) {
				localUnknownHostException.printStackTrace();
			}
		}
		return (String) localObject;
	}

	public static boolean f(Context paramContext) {
		NetworkInfo localNetworkInfo = ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
		if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 1)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean g(Context paramContext) {
		NetworkInfo localNetworkInfo = ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
		if ((localNetworkInfo != null) && (localNetworkInfo.getSubtype() == 13)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean h(Context paramContext) {
		NetworkInfo localNetworkInfo = ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
		if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 0)) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean i(Context paramContext) {
		NetworkInfo localNetworkInfo = ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
		if ((localNetworkInfo != null)
				&& ((localNetworkInfo.getSubtype() == 2)
						|| (localNetworkInfo.getSubtype() == 1) || (localNetworkInfo
						.getSubtype() == 4))) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static boolean j(Context paramContext) {
		NetworkInfo localNetworkInfo = l(paramContext);
		if ((localNetworkInfo != null)
				&& (localNetworkInfo.isConnectedOrConnecting())) {
		}
		for (boolean bool = true;; bool = false) {
			return bool;
		}
	}

	public static String k(Context paramContext) {
		String str = "";
		try {
			if (f(paramContext)) {
				str = "1";
			} else if (i(paramContext)) {
				str = "2";
			} else if (h(paramContext)) {
				str = "3";
			} else if (g(paramContext)) {
				str = "4";
			} else {
				str = "0";
			}
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return str;
	}

	private static NetworkInfo l(Context paramContext) {
		return ((ConnectivityManager) paramContext
				.getSystemService("connectivity")).getActiveNetworkInfo();
	}
}
