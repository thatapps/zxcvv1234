package com.main;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.Uri;

public class jt {
	private static final String a = "Swipe." + jt.class.getSimpleName();
	private static final Uri b = ki.a;

	public static void a(Context paramContext, ResolveInfo paramResolveInfo,
			ComponentName paramComponentName) {
		ContentResolver localContentResolver = paramContext
				.getContentResolver();
		ContentValues localContentValues = new ContentValues(1);
		localContentValues.put("label",
				paramResolveInfo.loadLabel(paramContext.getPackageManager())
						.toString());
		try {
			Uri localUri = ki.a;
			String[] arrayOfString = new String[1];
			arrayOfString[0] = paramComponentName.flattenToString();
			localContentResolver.update(localUri, localContentValues,
					"intent=?", arrayOfString);
			return;
		} catch (Throwable localThrowable) {

			vj.b(a, "Error updating package " + paramComponentName + ": "
					+ localThrowable.getMessage());

		}
	}

	public static void a(Context context, jq jq1) {
		Object obj;
		obj = null;
		ContentResolver resolver = context.getContentResolver();
		ContentValues contentvalues = new ContentValues();
		jq1.a(contentvalues);
		Throwable throwable;
		Object obj1 = null;
		String as[];
		String inteString;
		Uri uri = null;
		try {
			uri = resolver.insert(b, contentvalues);
		}
		// Misplaced declaration of an exception variable
		catch (Exception c) {
			return;
		}
		if (obj1 == null) {

		}
		try {
			jq1.a = /* ContentUris.parseId(uri) */1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		inteString = contentvalues.getAsString("intent");
		as = new String[1];
		as[0] = (inteString);
		contentvalues.remove("intent");
		contentvalues.remove("last_called_time");
		if (-1 != jq1.f) {
			contentvalues.remove("called_num");
		}
		contentvalues.put("uninstalled", Integer.valueOf(0));
		resolver.update(b, contentvalues, "intent=?", as);

	}

	public static void b(Context paramContext, jq paramjq) {
		if (paramjq.a < 0L) {
			vj.b(a, "Delete item with invalid id " + paramjq.a);
		}

		ContentResolver localContentResolver = paramContext
				.getContentResolver();
		Uri localUri = ContentUris.withAppendedId(b, paramjq.a);
		ContentValues localContentValues = new ContentValues(1);
		if (paramjq.j == 1) {
			localContentValues.put("on_sdcard", Integer.valueOf(-1));
		}
		try {

			localContentResolver.update(localUri, localContentValues, null,
					null);
			try {
				localContentResolver.delete(
						kc.a.buildUpon()
								.appendPath(paramjq.h.flattenToString())
								.build(), null, null);
			} catch (Throwable localThrowable2) {
			}

			localContentValues.put("uninstalled", Integer.valueOf(1));

		} catch (Throwable localThrowable1) {

			vj.b(a,
					"Error deleting " + paramjq.a + ": "
							+ localThrowable1.getMessage());

		}
	}

	public static void c(Context paramContext, jq paramjq) {
		if (paramjq.a < 0L) {
			vj.b(a, "Update item with invalid id " + paramjq.a);
		}

		ContentResolver localContentResolver = paramContext
				.getContentResolver();
		ContentValues localContentValues = new ContentValues(1);
		localContentValues.put("label", paramjq.b.toString());
		Uri localUri = ContentUris.withAppendedId(b, paramjq.a);
		try {
			localContentResolver.update(localUri, localContentValues, null,
					null);
		} catch (Throwable localThrowable) {
			vj.b(a, "Error updating package " + paramjq.h + ": "
					+ localThrowable.getMessage());
		}

	}

	// public static void d(Context paramContext, jq paramjq) {
	// if (paramjq.a < 0L) {
	// vj.b(a, "Update item with invalid id " + paramjq.a);
	// }
	//
	// ContentResolver localContentResolver = paramContext
	// .getContentResolver();
	// ContentValues localContentValues = new ContentValues();
	// paramjq.a(localContentValues);
	// Uri localUri = ContentUris.withAppendedId(b, paramjq.a);
	// try {
	// localContentResolver.update(localUri, localContentValues, null,
	// null);
	// } catch (Throwable localThrowable) {
	// vj.b(a, "Error updating package " + paramjq.h + ": "
	// + localThrowable.getMessage());
	// }
	// return;
	// }
	public static void d(Context context, jq jq1) {
		if (jq1.a < 0L) {
			vj.b(a, (new StringBuilder())
					.append("Update item with invalid id ").append(jq1.a)
					.toString());
			return;
		}
		ContentResolver resolver = context.getContentResolver();
		ContentValues contentvalues = new ContentValues();
		jq1.a(contentvalues);
		Uri uri = ContentUris.withAppendedId(b, jq1.a);
		try {
			resolver.update(uri, contentvalues, null, null);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			vj.b(a, (new StringBuilder()).append("Error updating package ")
					.append(jq1.h).append(": ").append(exception.getMessage())
					.toString());
		}
	}

}
