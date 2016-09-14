package com.main;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class tj {
	public static Bitmap a(Bitmap bitmap) {
		return tf.a(bitmap, vk.a((Context) SwipeApplication.e(), 1.0f),
				Integer.MAX_VALUE);
	}

	public static Drawable a(Context context, String string, Uri uri) {
		int n = context.getResources().getDimensionPixelSize(
				R.dimen.text_drawable_default_text_size);
		return tj.a(
				context,
				string,
				uri,
				context.getResources().getColor(
						R.color.text_drawable_default_text_color), n);
	}

	public static Drawable a(Context context, String s, Uri uri, int i, int j) {
		Bitmap bitmap = null;
		if (uri == null) {
			return new tk(s, i, j);
		} else {
			try {
				bitmap = a(BitmapFactory.decodeStream(context
						.getContentResolver().openInputStream(uri)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new BitmapDrawable(context.getResources(), bitmap);
		}
	}

	public static Drawable a(Context context, pv pv) {
		Bitmap bitmap = pv.a();
		if (tf.b(bitmap)) {
			return new BitmapDrawable(SwipeApplication.c(), bitmap);
		}
		try {
			Drawable drawable = tj.a(context, pv.d, null);
			return drawable;
		} catch (Throwable var3_4) {
			return tj.a(context.getResources(),
					(int) System.currentTimeMillis());
		}
	}

	public static Drawable a(Resources resources, int n) {
		int n2 = Math.abs((int) n) % tk.a.length;
		return new ColorDrawable(resources.getColor(tk.a[n2]));
	}

	// public static String a(Uri uri, Context context) {
	// Object obj;
	// StringBuilder stringbuilder;
	// obj = null;
	// stringbuilder = new StringBuilder();
	// ContentResolver cResolver = context.getContentResolver();
	// Cursor cursor = cResolver
	// .query(Uri.withAppendedPath(uri, "entities"),
	// new String[] { "account_type", "data1", "mimetype" },
	// "mimetype=? ",
	// new String[] { "vnd.android.cursor.item/vnd.com.whatsapp.profile" },
	// null);
	//
	// if (!cursor.moveToNext()) {
	//
	// if (cursor != null) {
	// cursor.close();
	// }
	//
	// return stringbuilder.toString();
	//
	// } else {
	// if (stringbuilder.length() != 0) {
	// stringbuilder.append(",");
	// }
	// if (cursor.getString(2).equals(
	// "vnd.android.cursor.item/vnd.com.whatsapp.profile")) {
	// stringbuilder.append(cursor.getString(1));
	// }
	//
	//
	// }
	//
	// if (cursor != null) {
	// cursor.close();
	// }
	// return stringbuilder.toString();
	//
	// }
	public static String a(Uri uri, Context context) {
		Object obj;
		StringBuilder stringbuilder;
		obj = null;
		stringbuilder = new StringBuilder();
		ContentResolver contentResolver = context.getContentResolver();
		Cursor cursor = contentResolver
				.query(Uri.withAppendedPath(uri, "entities"),
						new String[] { "account_type", "data1", "mimetype" },
						"mimetype=? ",
						new String[] { "vnd.android.cursor.item/vnd.com.whatsapp.profile" },
						null);

		while (cursor.moveToNext()) {

			{

				if (stringbuilder.length() != 0) {
					stringbuilder.append(",");
				}
				if (cursor.getString(2).equals(
						"vnd.android.cursor.item/vnd.com.whatsapp.profile")) {
					stringbuilder.append(cursor.getString(1));
				}
			}
		}
		if (cursor != null) {
			cursor.close();
		}
		return stringbuilder.toString();

	}

	// public static String a(String var0, Context var1_1) {
	// StringBuilder var2_2 = new StringBuilder();
	// Cursor var5_3 = null;
	// Cursor var4_4 = var1_1.getContentResolver().query(
	// ContactsContract.CommonDataKinds.Email.CONTENT_URI,
	// new String[] { "data1" }, "contact_id=?",
	// new String[] { var0 }, null);
	// var4_4 = var5_3;
	// try {
	// while (var4_4.moveToNext()) {
	// if (var2_2.length() != 0) {
	// var2_2.append(",");
	// }
	// var2_2.append(var4_4.getString(var4_4.getColumnIndex("data1")));
	// }
	// } catch (Throwable var3_5) // 2 sources:
	// {
	// do {
	// if (var4_4 == null)
	// var4_4.close();
	//
	// break;
	// } while (true);
	// }
	// if (var4_4 == null)
	// return var2_2.toString();
	// var4_4.close();
	// return var2_2.toString();
	//
	// }
	// public static String a(String s, Context context) {
	// Object obj = new StringBuilder();
	// Cursor cursor = context
	// .getContentResolver()
	// .query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI,
	// new String[] { "data1" }, "contact_id=?",
	// new String[] { s }, null);
	// while (cursor.moveToNext()) {
	// if (((StringBuilder) (obj)).length() != 0) {
	// ((StringBuilder) (obj)).append(",");
	// }
	// ((StringBuilder) (obj)).append(cursor.getString(cursor
	// .getColumnIndex("data1")));
	// }
	// if (cursor != null) {
	// cursor.close();
	// }
	//
	// return ((StringBuilder) (obj)).toString();
	//
	// }
	public static String a(String var0, Context var1_1) {
		StringBuilder var2_2 = new StringBuilder();
		Cursor var5_3;
		Cursor var4_4 = var5_3 = var1_1.getContentResolver().query(
				ContactsContract.CommonDataKinds.Email.CONTENT_URI,
				new String[] { "data1" }, "contact_id=?",
				new String[] { var0 }, null);
		try {
			while (var4_4.moveToNext()) {
				if (var2_2.length() != 0) {
					var2_2.append(",");
				}
				var2_2.append(var4_4.getString(var4_4.getColumnIndex("data1")));
			}
		} catch (Throwable var3_5) // 2 sources:
		{
			do {
				if (var4_4 == null)
					var4_4.close();

				break;
			} while (true);
		}
		if (var4_4 == null)
			return var2_2.toString();
		var4_4.close();
		return var2_2.toString();

	}

	@SuppressWarnings("unchecked")
	public static List a(Context context, int n, String string) {
		ArrayList arrayList = new ArrayList(n);
		Map<Entry, Entry> map = tj.a(context, string);
		if (map == null) {
			return null;
		} else {
			Map map2 = tj.b(context, string);
			if (map.size() <= 0 && map2.size() <= 0) {
				return Collections.EMPTY_LIST;
			}

			try {
				HashMap hashMap = new HashMap(map2);
				for (Map.Entry entry : map.entrySet()) {
					Integer n2 = (Integer) entry.getValue();
					if (n2 == null)
						continue;
					pv pv = (pv) entry.getKey();
					Integer n3 = (Integer) hashMap.get((Object) pv);
					int n4 = n3 != null ? n3 : 0;
					hashMap.put((Object) pv, (Object) (n4 + n2));
				}
				LinkedList linkedList = new LinkedList(
						(Collection) hashMap.entrySet());
				Collections.sort((List) linkedList,
						(Comparator) new Comparator() {

							public int a(Map.Entry entry, Map.Entry entry2) {
								return ((Integer) entry2.getValue())
										.compareTo((Integer) entry.getValue());
							}

							public int compare(Object object, Object object2) {
								return this.a((Map.Entry) object,
										(Map.Entry) object2);
							}
						});
				Iterator iterator = linkedList.iterator();
				int n5 = 0;
				while (iterator.hasNext()) {
					Map.Entry entry2 = (Map.Entry) iterator.next();
					if (n5 >= n)
						break;
					arrayList.add(entry2.getKey());
					++n5;
				}
				hashMap.clear();
				linkedList.clear();
				return arrayList;
			} catch (Throwable var7_17) {
				// empty catch block
			}
		}
		return arrayList;
	}

	@SuppressWarnings("rawtypes")
	public static Map a(Context context, String s) {
		HashMap hashmap;
		ContentResolver contentresolver = context.getContentResolver();
		hashmap = new HashMap();
		pv pv = null;
		Integer integer;
		String cont;
		int i = 0;
		Cursor cursor;
		if (TextUtils.isEmpty(s)) {
			cont = "(type=2 OR type=4)) GROUP BY (address ";
		} else {
			cont = (new StringBuilder())
					.append("(type=2 OR type=4) AND DATE(date/1000, 'unixepoch')>=DATE('now', '")
					.append(s).append("')) GROUP BY (address ").toString();
		}
		cursor = contentresolver.query(qb.a, new String[] { "address",
				" COUNT(*)  AS c_" }, cont, null, "c_ DESC LIMIT 80");
		if (cursor.getCount() == 0) {
			return null;
		}
		String address = null;
		try {
			address = cursor.getString(cursor.getColumnIndex("address"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pv = a(contentresolver, address);
		try {
			i = cursor.getInt(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (cursor != null) {

			integer = (Integer) hashmap.get(s);
			if (integer != null) {

				i = integer.intValue() + i;
				hashmap.put(s, Integer.valueOf(i));
			}

		}

		vj.b("Swipe.ContactUtils",
				(new StringBuilder()).append("Query SMS count failed: \n\t")
						.toString());
		if (context != null) {
			cursor.close();
		}
		cursor.close();
		return hashmap;

	}

	public static pv a(ContentResolver contentresolver, String s) {
		Object obj = null;
		Uri uri = Uri
				.withAppendedPath(
						android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI,
						Uri.encode(s));
		Cursor cursor = contentresolver
				.query(uri, new String[] { "_id", "lookup", "display_name",
						"photo_thumb_uri" }, null, null, null);
		// s = contentresolver;
		if (!cursor.moveToFirst()) {

			if (contentresolver != null) {
				cursor.close();
			}

		} else {

			String s1 = cursor.getString(2);

			if (!cursor.isNull(3)) {

				obj = Uri.parse(cursor.getString(3));
				if (contentresolver != null) {
					cursor.close();
				}
				return ((pv) (obj));

			}

		}

		Log.w("Swipe.ContactUtils", "Failed to query contact by number");
		if (contentresolver != null) {
			cursor.close();
		}
		return ((pv) (obj));
	}

	public static String b(ContentResolver contentresolver, String s) {
		String s1;
		Uri uri;
		s1 = null;
		uri = Uri
				.withAppendedPath(
						android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI,
						Uri.encode(s));
		Cursor cursor = contentresolver.query(uri,
				new String[] { "display_name" }, null, null, null);
		if (!cursor.moveToFirst()) {

			s1 = s;
			if (cursor != null) {

				cursor.close();
				return s;

			}

		} else {
			s1 = cursor.getString(0);
			s = s1;
			s1 = s;
			if (cursor != null) {
				cursor.close();
				s1 = s;
			}
		}

		if (cursor != null) {
			cursor.close();
		}
		return s1;

	}

	public static String b(Uri uri, Context context) {
		Object obj;
		StringBuilder stringbuilder;
		obj = null;
		String s = "";
		stringbuilder = new StringBuilder();
		ContentResolver resolver = context.getContentResolver();
		Cursor cursor = resolver
				.query(Uri.withAppendedPath(uri, "entities"),
						new String[] { "account_type", "data_id", "mimetype" },
						"mimetype=? ",
						new String[] { "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile" },
						null);
		do {
			if (cursor.moveToNext()) {
				// break MISSING_BLOCK_LABEL_127;

				if (stringbuilder.length() != 0) {
					stringbuilder.append(",");
				}
			}
		} while (!cursor.getString(2).equals(
				"vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile"));
		stringbuilder.append(cursor.getString(1));
		s = stringbuilder.toString();
		if (cursor != null) {
			cursor.close();
		}

		return s;

	}

	public static String b(String s, Context context) {
		Object obj;
		Object obj1;
		ContentResolver contentresolver;
		StringBuilder stringbuilder;
		obj1 = null;
		obj = null;
		contentresolver = context.getContentResolver();
		stringbuilder = new StringBuilder();
		Cursor cursor = contentresolver.query(
				android.provider.ContactsContract.Contacts.CONTENT_URI,
				new String[] { "has_phone_number" }, "_id=?",
				new String[] { s }, null);
		context = ((Context) (obj));

		if (!cursor.moveToNext()) {

			if (cursor != null) {
				cursor.close();
			}
			return stringbuilder.toString();

		} else {
			if (Integer.parseInt(cursor.getString(cursor
					.getColumnIndex("has_phone_number"))) <= 0) {

				// obj = context;

			} else {
				obj = contentresolver
						.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
								new String[] { "data1" }, "contact_id=? ",
								new String[] { s }, null);
				cursor = (Cursor) obj;

			}
		}

		if (!cursor.moveToNext()) {

		}
		if (stringbuilder.length() != 0) {
			stringbuilder.append(",");
		}
		s = stringbuilder.append(
				context.getString(cursor.getColumnIndex("data1"))).toString();
		return s;

	}

	public static Map b(Context context, String s) {
		HashMap hashmap;
		ContentResolver contentresolver;
		hashmap = new HashMap();
		String ss = null;
		int i;
		i = 0;
		Object obj;
		Cursor cursor = null;

		contentresolver = context.getContentResolver();
		String s2 = "type=2";
		if (!TextUtils.isEmpty(s)) {
			ss = (new StringBuilder()).append("type=2")
					.append(" AND DATE(date/1000, 'unixepoch')>=DATE('now', '")
					.append(s).append("')").toString();
		}
		cursor = contentresolver.query(
				android.provider.CallLog.Calls.CONTENT_URI,
				new String[] { "number" }, s2, null, "number");

		// _L7:

		if (!cursor.moveToNext()) {
			// break MISSING_BLOCK_LABEL_174;
		}
		obj = cursor.getString(0);
		if (((String) (obj)).equals(s)) {
			// break MISSING_BLOCK_LABEL_321;
		}
		if (s == null) {
			// break MISSING_BLOCK_LABEL_316;
		}
		// s = a(contentresolver, s);
		if (s == null) {
			// break MISSING_BLOCK_LABEL_316;
		}
		Integer integer = (Integer) hashmap.get(s);
		int j;
		j = i;
		if (integer == null) {
			// break MISSING_BLOCK_LABEL_158;
		}
		j = i + integer.intValue();
		hashmap.put(s, Integer.valueOf(j));

		if (s == null) {
			// break MISSING_BLOCK_LABEL_230;
		}
		// s = a(contentresolver, s);
		if (s == null) {
			// break MISSING_BLOCK_LABEL_230;
		}
		obj = (Integer) hashmap.get(s);
		j = i;
		if (obj == null) {
			// break MISSING_BLOCK_LABEL_217;
		}
		j = i + ((Integer) (obj)).intValue();
		hashmap.put(s, Integer.valueOf(j));
		if (context != null) {
			cursor.close();
		}
		if (context != null) {
			cursor.close();
		}

		i = 0;
		s = ((String) (obj));
		i++;
		// vj.b("Swipe.ContactUtils", (new
		// StringBuilder()).append("Query top call count failed: \n\t").append(s.getMessage()).toString());
		if (context == null) {

			return hashmap;

		} else {

			cursor.close();
			return hashmap;

		}

	}

	public static String c(Context paramContext, String paramString) {
		return b(paramContext.getContentResolver(), paramString);
	}
}
