package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;

public class gs {
	private static SensorManager a = null;
	private static Sensor b = null;
	private static Sensor c = null;
	private static volatile float[] d;
	private static volatile float[] e;
	private static Map f = new ConcurrentHashMap();
	private static String[] g;

	static {
		String[] arrayOfString = new String[3];
		arrayOfString[0] = "x";
		arrayOfString[1] = "y";
		arrayOfString[2] = "z";
		g = arrayOfString;
	}

	public static Map a() {
		HashMap hashMap = new HashMap();
		hashMap.putAll(f);
		gs.a((Map) hashMap);
		return hashMap;
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public static void a(Context context) {
		// reference var5_1 = gs.class;
		synchronized (gs.class) {
			SensorManager sensorManager;
			gs.b(context);
			gs.c(context);
			gs.d(context);
			if (a != null
					|| (sensorManager = (gs.a = (SensorManager) context
							.getSystemService("sensor"))) != null) {
				if (b == null) {
					b = a.getDefaultSensor(1);
				}
				if (c == null) {
					c = a.getDefaultSensor(4);
				}
				if (b != null) {
					a.registerListener((SensorEventListener) new gt(), b, 3);
				}
				if (c != null) {
					a.registerListener((SensorEventListener) new gt(), c, 3);
				}
			}
			// ** MonitorExit[var5_1] (shouldn't be in output)
			return;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public static void a(gt gt) {
		// reference var3_1 = gs.class;
		synchronized (gs.class) {
			SensorManager sensorManager = a;
			if (sensorManager != null) {
				a.unregisterListener((SensorEventListener) gt);
			}
			// ** MonitorExit[var3_1] (shouldn't be in output)
			return;
		}
	}

	private static void a(Map paramMap) {
		int i = 0;
		float[] arrayOfFloat1 = d;
		float[] arrayOfFloat2 = e;
		if (arrayOfFloat1 != null) {
			int k = Math.min(g.length, arrayOfFloat1.length);
			for (int m = 0; m < k; m++) {
				paramMap.put("accelerometer_" + g[m],
						Float.valueOf(arrayOfFloat1[m]));
			}
		}
		if (arrayOfFloat2 != null) {
			int j = Math.min(g.length, arrayOfFloat2.length);
			while (i < j) {
				paramMap.put("rotation_" + g[i],
						Float.valueOf(arrayOfFloat2[i]));
				i++;
			}
		}
	}

	static void b(Context paramContext) {
		ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
		((ActivityManager) paramContext.getSystemService("activity"))
				.getMemoryInfo(localMemoryInfo);
		f.put("available_memory", String.valueOf(localMemoryInfo.availMem));
	}

	static Sensor b() {
		return b;
	}

	static Sensor c() {
		return c;
	}

	private static void c(Context paramContext) {
		StatFs localStatFs = new StatFs(Environment.getDataDirectory()
				.getPath());
		long l1 = localStatFs.getBlockSize();
		long l2 = localStatFs.getAvailableBlocks();
		f.put("free_space", Long.valueOf(l2 * l1));
	}

	private static void d(Context context) {
		Intent intent = context.registerReceiver(null, new IntentFilter(
				"android.intent.action.BATTERY_CHANGED"));
		if (intent == null) {
			return;
		}
		int n = intent.getIntExtra("level", -1);
		int n2 = intent.getIntExtra("scale", -1);
		int n3 = intent.getIntExtra("status", -1);
		boolean bl = n3 == 2 || n3 == 5;
		float f = 0.0f;
		if (n2 > 0) {
			f = 100.0f * ((float) n / (float) n2);
		}
		gs.f.put((Object) "battery", (Object) Float.valueOf((float) f));
		Map map = gs.f;
		int n4 = bl ? 1 : 0;
		map.put((Object) "charging", (Object) n4);
	}
}
