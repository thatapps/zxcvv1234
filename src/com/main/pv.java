package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;

public class pv {
	public static final pv a;
	public static List h;
	private static final String i = "Swipe." + pv.class.getSimpleName();
	private static final String[] j;
	public int b;
	public final Uri c;
	public String d;
	public final Uri e;
	public int f;
	public HashMap g = new HashMap(0);
	private Bitmap k;

	static {
		a = new pv(Uri.parse("INVALID_CONTACT_URI"));
		String[] arrayOfString = new String[6];
		arrayOfString[0] = "uri";
		arrayOfString[1] = "name";
		arrayOfString[2] = "thumb";
		arrayOfString[3] = "_id";
		arrayOfString[4] = "_order";
		arrayOfString[5] = "image";
		j = arrayOfString;
	}

	public pv(Cursor paramCursor) {
		this.c = Uri.parse(paramCursor.getString(0));
		this.d = paramCursor.getString(1);
		String str = paramCursor.getString(2);
		if (TextUtils.isEmpty(str)) {
		}
		// for (Uri localUri = null;; localUri = Uri.parse(str)) {
		Uri localUri = Uri.parse(str);
		this.e = localUri;
		byte[] arrayOfByte = paramCursor.getBlob(5);
		if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
			this.k = BitmapFactory.decodeByteArray(arrayOfByte, 0,
					arrayOfByte.length);
		}
		this.b = paramCursor.getInt(3);
		this.f = paramCursor.getInt(4);
		return;
		// }
	}

	public pv(Uri paramUri) {
		this.c = paramUri;
		this.d = null;
		this.e = null;
	}

	public pv(Uri paramUri1, String paramString, Uri paramUri2,
			Bitmap paramBitmap) {
		this.c = paramUri1;
		this.d = paramString;
		this.e = paramUri2;
		this.k = paramBitmap;
	}

	/**
	 * @deprecated
	 */
	// public static List a(Context paramContext) {
	// List localList = null;
	// try {
	// localList = a(paramContext, false);
	// return localList;
	// } catch (Exception exception) {
	//
	// }
	// return localList;
	// }
	public static List a(Context context) {
		List list = null;

		list = a(context, false);

		return list;

	}

	/* Error */
	/**
	 * @deprecated
	 */
	// public static List a(Context context, boolean flag) {
	// Object obj = null;
	// ContentResolver contentresolver = null;
	// Iterator iterator = null;
	// Cursor cursor = null;
	// // pv;
	// // JVM INSTR monitorenter ;
	// if (h != null && !flag) {
	// // context = (Context) h;
	//
	// iterator = h.iterator();
	// ub.a((cursor));
	// ub.a(cursor);
	// ub.a(cursor);
	// ub.a(cursor);
	//
	// // return cursor;
	//
	// } else {
	// if (h == null) {
	// h = new ArrayList(13);
	// contentresolver = context.getContentResolver();
	// cursor = contentresolver.query(kf.a, j, null, null, "_order");
	// while (((Cursor) cursor).moveToNext()) {
	// h.add(new pv((Cursor) cursor));
	// }
	// ub.a(cursor);
	//
	// iterator = h.iterator();
	//
	// } else {
	// h.clear();
	//
	// }
	//
	// }
	//
	// if (!iterator.hasNext()) {
	// ub.a(cursor);
	//
	// } else {
	//
	// pv pv1 = (pv) iterator.next();
	// // context = kg.a;
	// int l = pv1.b;
	// cursor = contentresolver.query(kg.a, new String[] { "app", "key",
	// "data_1", "data_2", "data_3" }, "contact_id=?",
	// new String[] { String.valueOf(l) }, "app");
	// while (((Cursor) cursor).moveToNext()) {
	// pv1.a(cursor.getString(0), cursor.getString(1),
	// cursor.getString(2), cursor.getString(3),
	// cursor.getString(4));
	// }
	// ub.a(cursor);
	// }
	// return h;
	//
	// }
	// public static List a(Context context, boolean flag) {
	// Object obj = null;
	// Cursor cursor = null;
	// Iterator iterator = null;
	// List list = null;
	// ContentResolver contentresolver = null;
	// if (h != null && !flag) {
	// // h.clear();
	//
	// list = h;
	//
	// return h;
	//
	// } /*
	// * else {
	// *
	// * if (h == null) {
	// *
	// * h = new ArrayList(13);
	// *
	// * } else {
	// *
	// * h.clear();
	// *
	// * }
	// *
	// * }
	// */
	// if (h == null) {
	//
	// h = new ArrayList(13);
	//
	// }
	// contentresolver = context.getContentResolver();
	// cursor = contentresolver.query(kf.a, j, null, null, "_order");
	// while (cursor.moveToNext()) {
	// h.add(new pv(cursor));
	// }
	//
	// iterator = h.iterator();
	// if (!iterator.hasNext()) {
	//
	// list = h;
	//
	// return h;
	//
	// } else {
	//
	// pv pv1 = (pv) iterator.next();
	// Uri uri = kg.a;
	// int l = pv1.b;
	// cursor = contentresolver.query(uri, new String[] { "app", "key",
	// "data_1", "data_2", "data_3" }, "contact_id=?",
	// new String[] { String.valueOf(l) }, "app");
	// while (cursor.moveToNext()) {
	// pv1.a(cursor.getString(0), cursor.getString(1),
	// cursor.getString(2), cursor.getString(3),
	// cursor.getString(4));
	// }
	//
	// }
	// ub.a(cursor);
	// return h;
	//
	// }
	public static List a(Context context, boolean flag) {
		Object obj = null;
		List list = null;
		Iterator iterator = null;
		Cursor cursor = null;
		ContentResolver contentresolver = context.getContentResolver();
		if (h != null && !flag) {

			list = h;

			return list;

		} else {

			if (h == null) {
				h = new ArrayList(13);

				cursor = contentresolver.query(kf.a, j, null, null, "_order");
				while (cursor.moveToNext()) {
					h.add(new pv(cursor));
				}
				list = h;
				ub.a(cursor);
				iterator = h.iterator();

			} else {
				h.clear();

			}
		}

		if (!iterator.hasNext()) {

			// list = h;

			return list;

		} else {

			pv pv1 = (pv) iterator.next();
			Uri uri = kg.a;
			int l = pv1.b;
			cursor = contentresolver.query(uri, new String[] { "app", "key",
					"data_1", "data_2", "data_3" }, "contact_id=?",
					new String[] { String.valueOf(l) }, "app");
			while (cursor.moveToNext()) {
				pv1.a(cursor.getString(0), cursor.getString(1),
						cursor.getString(2), cursor.getString(3),
						cursor.getString(4));
			}
			ub.a(cursor);

		}
		return list;

	}

	/**
	 * @deprecated
	 */
	public static void a(pv parampv) {
		try {
			if (h != null) {
				h.remove(parampv);
				String[] arrayOfString = new String[1];
				arrayOfString[0] = String.valueOf(parampv.b);
				ui.a(null);
			}
			return;
		} finally {
			// localObject = finally;
			// throw ((Throwable)localObject);
		}
	}

	public Bitmap a() {
		return this.k;
	}

	// public void a(ContentResolver contentresolver) {
	// Cursor cursor;
	// Cursor cursor1;
	// ContentValues contentvalues;
	// cursor = null;
	// contentvalues = new ContentValues();
	// cursor1 = cursor;
	// Object obj = android.provider.ContactsContract.Contacts.CONTENT_URI;
	// cursor1 = cursor;
	// String s = c.getLastPathSegment();
	// cursor1 = cursor;
	// cursor = contentresolver.query(((Uri) (obj)), new String[] { "_id",
	// "display_name" }, "_id=?", new String[] { s }, null);
	// cursor1 = cursor;
	// if (cursor.getCount() != 0) {
	// cursor1 = cursor;
	// obj = String.valueOf(b);
	// } else {
	// cursor1 = cursor;
	// a(uk.b, null, null, null, null);
	// /*
	// * if (cursor != null) { cursor.close(); }
	// */
	//
	// }
	// // _L1:
	// cursor1 = cursor;
	// a(uk.b, null, null, null, null);
	// /*
	// * if (cursor != null) { cursor.close(); }
	// */
	// // _L6: return;
	// // _L2:
	// cursor1 = cursor;
	// obj = String.valueOf(b);
	// // _L4:
	// cursor1 = cursor;
	// if (!cursor.moveToNext()) {
	// // break; /* Loop/switch isn't completed */
	// }
	// cursor1 = cursor;
	// s = cursor.getString(1);
	// cursor1 = cursor;
	// if (TextUtils.isEmpty(s)) {
	//
	// } else {
	// cursor1 = cursor;
	// d = s;
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("name", s);
	// cursor1 = cursor;
	// contentresolver.update(kf.a, contentvalues, "_id=?",
	// new String[] { (String) obj });
	//
	// }
	// // _L3:
	// cursor1 = cursor;
	// d = s;
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("name", s);
	// cursor1 = cursor;
	// contentresolver.update(kf.a, contentvalues, "_id=?",
	// new String[] { (String) obj });
	// // goto _L4
	// // contentresolver;
	// // _L8:
	// if (cursor != null) {
	// cursor.close();
	// return;
	// }
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("contact_id", Integer.valueOf(b));
	// cursor1 = cursor;
	// contentvalues.put("app", uk.b);
	// cursor1 = cursor;
	// s = tj.b(c, SwipeApplication.e());
	// cursor1 = cursor;
	// contentvalues.put("key", s);
	// cursor1 = cursor;
	// if (contentresolver.update(kg.a, contentvalues,
	// "contact_id=? and app=?", new String[] { (String) obj, uk.b }) != 0) {
	// // break MISSING_BLOCK_LABEL_311;
	// }
	// cursor1 = cursor;
	// contentresolver.insert(kg.a, contentvalues);
	// cursor1 = cursor;
	// a(uk.b, s, null, null, null);
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("contact_id", Integer.valueOf(b));
	// cursor1 = cursor;
	// contentvalues.put("app", uk.a);
	// cursor1 = cursor;
	// s = tj.a(c, SwipeApplication.e());
	// cursor1 = cursor;
	// contentvalues.put("key", s);
	// cursor1 = cursor;
	// if (contentresolver.update(kg.a, contentvalues,
	// "contact_id=? and app=?", new String[] { (String) obj, uk.a }) != 0) {
	// // break MISSING_BLOCK_LABEL_430;
	// }
	// cursor1 = cursor;
	// contentresolver.insert(kg.a, contentvalues);
	// cursor1 = cursor;
	// a(uk.a, s, null, null, null);
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("contact_id", ((String) (obj)));
	// cursor1 = cursor;
	// contentvalues.put("app", uk.c);
	// cursor1 = cursor;
	// s = tj.a(c.getLastPathSegment(), SwipeApplication.e());
	// cursor1 = cursor;
	// contentvalues.put("key", s);
	// cursor1 = cursor;
	// if (contentresolver.update(kg.a, contentvalues,
	// "contact_id=? and app=?", new String[] { (String) obj, uk.c }) != 0) {
	// // break MISSING_BLOCK_LABEL_547;
	// }
	// cursor1 = cursor;
	// contentresolver.insert(kg.a, contentvalues);
	// cursor1 = cursor;
	// a(uk.c, s, null, null, null);
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("contact_id", ((String) (obj)));
	// cursor1 = cursor;
	// contentvalues.put("app", uk.d);
	// cursor1 = cursor;
	// s = tj.b(c.getLastPathSegment(), SwipeApplication.e());
	// cursor1 = cursor;
	// contentvalues.put("key", s);
	// cursor1 = cursor;
	// if (contentresolver.update(kg.a, contentvalues,
	// "contact_id=? and app=?", new String[] { (String) obj, uk.d }) != 0) {
	// // break MISSING_BLOCK_LABEL_664;
	// }
	// cursor1 = cursor;
	// contentresolver.insert(kg.a, contentvalues);
	// cursor1 = cursor;
	// a(uk.d, s, null, null, null);
	// cursor1 = cursor;
	// contentvalues.clear();
	// cursor1 = cursor;
	// contentvalues.put("contact_id", ((String) (obj)));
	// cursor1 = cursor;
	// contentvalues.put("app", uk.e);
	// cursor1 = cursor;
	// contentvalues.put("key", s);
	// cursor1 = cursor;
	// if (contentresolver.update(kg.a, contentvalues,
	// "contact_id=? and app=?", new String[] { (String) obj, uk.e }) != 0) {
	// // break MISSING_BLOCK_LABEL_764;
	// }
	// cursor1 = cursor;
	// contentresolver.insert(kg.a, contentvalues);
	// cursor1 = cursor;
	// a(uk.e, s, null, null, null);
	// if (cursor == null) {
	//
	// return;
	// } else {
	// cursor.close();
	//
	// if (cursor != null) {
	// cursor.close();
	// return;
	// }
	//
	// }
	//
	// }
	public void a(ContentResolver contentresolver) {
		Cursor cursor;
		Cursor cursor1;
		ContentValues contentvalues;
		cursor = null;
		contentvalues = new ContentValues();
		cursor1 = cursor;
		Object obj = android.provider.ContactsContract.Contacts.CONTENT_URI;
		cursor1 = cursor;
		String s = c.getLastPathSegment();
		cursor1 = cursor;
		cursor = contentresolver.query(((Uri) (obj)), new String[] { "_id",
				"display_name" }, "_id=?", new String[] { s }, null);
		cursor1 = cursor;
		if (cursor.getCount() != 0) {

			cursor1 = cursor;
			obj = String.valueOf(b);

		} else {
			cursor1 = cursor;
			a(uk.b, null, null, null, null);

		}

		cursor1 = cursor;
		if (cursor.moveToNext()) {
			cursor1 = cursor;
			s = cursor.getString(1);
			cursor1 = cursor;
			if (!TextUtils.isEmpty(s)) {

				cursor1 = cursor;
				d = s;
				cursor1 = cursor;
				contentvalues.clear();
				cursor1 = cursor;
				contentvalues.put("name", s);
				cursor1 = cursor;
				contentresolver.update(kf.a, contentvalues, "_id=?",
						new String[] { (String) obj });
				// goto _L4

			}
		}

		// cursor1 = cursor;
		// contentvalues.clear();
		// cursor1 = cursor;
		// contentvalues.put("contact_id", Integer.valueOf(b));
		// cursor1 = cursor;
		// contentvalues.put("app", uk.b);
		// cursor1 = cursor;
		// s = tj.b(c, SwipeApplication.e());
		// cursor1 = cursor;
		// contentvalues.put("key", s);
		cursor1 = cursor;
		if (contentresolver.update(kg.a, contentvalues,
				"contact_id=? and app=?", new String[] { (String) obj, uk.b }) != 0) {
			cursor1 = cursor;
			contentresolver.insert(kg.a, contentvalues);
			cursor1 = cursor;
			a(uk.b, s, null, null, null);
			cursor1 = cursor;
			contentvalues.clear();
			cursor1 = cursor;
			contentvalues.put("contact_id", Integer.valueOf(b));
			cursor1 = cursor;
			contentvalues.put("app", uk.a);
			cursor1 = cursor;
			s = tj.a(c, SwipeApplication.e());
			cursor1 = cursor;
			contentvalues.put("key", s);
		}

		cursor1 = cursor;
		if (contentresolver.update(kg.a, contentvalues,
				"contact_id=? and app=?", new String[] { (String) obj, uk.a }) != 0) {
			cursor1 = cursor;
			contentresolver.insert(kg.a, contentvalues);
			cursor1 = cursor;
			a(uk.a, s, null, null, null);
			cursor1 = cursor;
			contentvalues.clear();
			cursor1 = cursor;
			contentvalues.put("contact_id", ((String) (obj)));
			cursor1 = cursor;
			contentvalues.put("app", uk.c);
			cursor1 = cursor;
			s = tj.a(c.getLastPathSegment(), SwipeApplication.e());
			cursor1 = cursor;
			contentvalues.put("key", s);
		}

		cursor1 = cursor;
		if (contentresolver.update(kg.a, contentvalues,
				"contact_id=? and app=?", new String[] { (String) obj, uk.c }) != 0) {
			cursor1 = cursor;
			contentresolver.insert(kg.a, contentvalues);
			cursor1 = cursor;
			a(uk.c, s, null, null, null);
			cursor1 = cursor;
			contentvalues.clear();
			cursor1 = cursor;
			contentvalues.put("contact_id", ((String) (obj)));
			cursor1 = cursor;
			contentvalues.put("app", uk.d);
			cursor1 = cursor;
			s = tj.b(c.getLastPathSegment(), SwipeApplication.e());
			cursor1 = cursor;
			contentvalues.put("key", s);
		}

		cursor1 = cursor;
		if (contentresolver.update(kg.a, contentvalues,
				"contact_id=? and app=?", new String[] { (String) obj, uk.d }) != 0) {
			cursor1 = cursor;
			contentresolver.insert(kg.a, contentvalues);
			cursor1 = cursor;
			a(uk.d, s, null, null, null);
			cursor1 = cursor;
			contentvalues.clear();
			cursor1 = cursor;
			contentvalues.put("contact_id", ((String) (obj)));
			cursor1 = cursor;
			contentvalues.put("app", uk.e);
			cursor1 = cursor;
			contentvalues.put("key", s);
		}

		cursor1 = cursor;
		if (contentresolver.update(kg.a, contentvalues,
				"contact_id=? and app=?", new String[] { (String) obj, uk.e }) != 0) {
			cursor1 = cursor;
			contentresolver.insert(kg.a, contentvalues);
			cursor1 = cursor;
			a(uk.e, s, null, null, null);
		}

		cursor.close();

		if (cursor1 != null) {
			cursor1.close();
		}

		return;

	}

	public void a(ContentResolver contentresolver, pv pv1) {
		ContentValues contentvalues = new ContentValues();
		contentvalues.put("uri", c.toString());
		if (!TextUtils.isEmpty(d)) {
			contentvalues.put("name", d);
		}
		if (e != null) {
			contentvalues.put("thumb", e.toString());
		}
		if (k != null) {
			contentvalues.put("image", tf.d(k));
		}
		contentvalues.put("_order", Integer.valueOf(f));
		try {
			if (contentresolver.update(kf.a, contentvalues, "uri=?",
					new String[] { c.toString() }) == 0) {
				pv1.b = Integer.parseInt(contentresolver.insert(kf.a,
						contentvalues).getLastPathSegment());
				if (pv1.b > 0) {
					contentvalues.clear();
					contentvalues.put("contact_id", Integer.valueOf(pv1.b));
					contentvalues.put("app", uk.b);
					String s = tj.b(c, SwipeApplication.e());
					contentvalues.put("key", s);
					contentresolver.insert(kg.a, contentvalues);
					a(uk.b, s, null, null, null);
					contentvalues.clear();
					contentvalues.put("contact_id", Integer.valueOf(pv1.b));
					contentvalues.put("app", uk.a);
					s = tj.a(c, SwipeApplication.e());
					contentvalues.put("key", s);
					contentresolver.insert(kg.a, contentvalues);
					a(uk.a, s, null, null, null);
					contentvalues.clear();
					contentvalues.put("contact_id", Integer.valueOf(pv1.b));
					contentvalues.put("app", uk.c);
					s = tj.a(c.getLastPathSegment(), SwipeApplication.e());
					contentvalues.put("key", s);
					contentresolver.insert(kg.a, contentvalues);
					a(uk.c, s, null, null, null);
					contentvalues.clear();
					contentvalues.put("contact_id", Integer.valueOf(pv1.b));
					contentvalues.put("app", uk.d);
					s = tj.b(c.getLastPathSegment(), SwipeApplication.e());
					contentvalues.put("key", s);
					contentresolver.insert(kg.a, contentvalues);
					a(uk.d, s, null, null, null);
					contentvalues.clear();
					contentvalues.put("contact_id", Integer.valueOf(pv1.b));
					contentvalues.put("app", uk.e);
					contentvalues.put("key", s);
					contentresolver.insert(kg.a, contentvalues);
					a(uk.e, s, null, null, null);
				}
			}
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {

			Log.e(i, "Failed to insert the contact", exception);
		}
		return;
	}

	// public void a(ContentResolver paramContentResolver, pv parampv) {
	// ContentValues localContentValues = new ContentValues();
	// localContentValues.put("uri", this.c.toString());
	// if (!TextUtils.isEmpty(this.d)) {
	// localContentValues.put("name", this.d);
	// }
	// if (this.e != null) {
	// localContentValues.put("thumb", this.e.toString());
	// }
	// if (this.k != null) {
	// localContentValues.put("image", tf.d(this.k));
	// }
	// localContentValues.put("_order", Integer.valueOf(this.f));
	// try {
	// Uri localUri = kf.a;
	// String[] arrayOfString = new String[1];
	// arrayOfString[0] = this.c.toString();
	// if (paramContentResolver.update(localUri, localContentValues,
	// "uri=?", arrayOfString) == 0) {
	// parampv.b = Integer.parseInt(paramContentResolver.insert(kf.a,
	// localContentValues).getLastPathSegment());
	// if (parampv.b > 0) {
	// localContentValues.clear();
	// localContentValues.put("contact_id",
	// Integer.valueOf(parampv.b));
	// localContentValues.put("app", uk.b);
	// String str1 = tj.b(this.c, SwipeApplication.e());
	// localContentValues.put("key", str1);
	// paramContentResolver.insert(kg.a, localContentValues);
	// a(uk.b, str1, null, null, null);
	// localContentValues.clear();
	// localContentValues.put("contact_id",
	// Integer.valueOf(parampv.b));
	// localContentValues.put("app", uk.a);
	// String str2 = tj.a(this.c, SwipeApplication.e());
	// localContentValues.put("key", str2);
	// paramContentResolver.insert(kg.a, localContentValues);
	// a(uk.a, str2, null, null, null);
	// localContentValues.clear();
	// localContentValues.put("contact_id",
	// Integer.valueOf(parampv.b));
	// localContentValues.put("app", uk.c);
	// String str3 = tj.a(this.c.getLastPathSegment(),
	// SwipeApplication.e());
	// localContentValues.put("key", str3);
	// paramContentResolver.insert(kg.a, localContentValues);
	// a(uk.c, str3, null, null, null);
	// localContentValues.clear();
	// localContentValues.put("contact_id",
	// Integer.valueOf(parampv.b));
	// localContentValues.put("app", uk.d);
	// String str4 = tj.b(this.c.getLastPathSegment(),
	// SwipeApplication.e());
	// localContentValues.put("key", str4);
	// paramContentResolver.insert(kg.a, localContentValues);
	// a(uk.d, str4, null, null, null);
	// localContentValues.clear();
	// localContentValues.put("contact_id",
	// Integer.valueOf(parampv.b));
	// localContentValues.put("app", uk.e);
	// localContentValues.put("key", str4);
	// paramContentResolver.insert(kg.a, localContentValues);
	// a(uk.e, str4, null, null, null);
	// }
	// }
	// return;
	// } catch (Exception localException) {
	//
	// localException = localException;
	// Log.e(i, "Failed to insert the contact", localException);
	// } finally {
	// }
	//
	// }

	public void a(Context paramContext, pv parampv) {
		a(paramContext.getContentResolver(), parampv);
	}

	public void a(String paramString) {
		this.g.remove(paramString);
	}

	public void a(String s, String s1, String s2, String s3, String s4) {
		if (TextUtils.isEmpty(s1)) {
			g.remove(s1);
			return;
		} else {
			g.put(s, new pu(s, s1, s2, s3, s4));
			return;
		}
	}

	public List b() {
		ArrayList localArrayList = new ArrayList();
		for (ng localng : ng.values()) {
			if (localng.a(this)) {
				localArrayList.add(localng);
			}
		}
		return localArrayList;
	}

	public boolean equals(Object obj) {
		return obj != null && (obj instanceof pv) && vk.a(c, ((pv) obj).c);
	}

	public int hashCode() {
		return this.c.hashCode();
	}

	public String toString() {
		StringBuilder localStringBuilder = new StringBuilder();
		localStringBuilder.append("Contact:{name=").append(this.d)
				.append(",order=").append(this.f).append(",uri=")
				.append(this.c).append(",contactAppSize=");
		localStringBuilder.append(this.g.size());
		localStringBuilder.append("}");
		return localStringBuilder.toString();
	}
}
