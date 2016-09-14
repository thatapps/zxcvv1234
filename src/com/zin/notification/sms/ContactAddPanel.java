/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package com.lazyswipe.notification.sms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.widget.SideBar;
import com.lazyswipe.zev.R;
import com.main.kf;
import com.main.mu;
import com.main.ps;
import com.main.pv;
import com.main.pz;
import com.main.sw;
import com.main.th;
import com.main.un;
import com.main.vi;
import com.main.vk;
import com.main.wb;
import com.main.wz;
import com.main.xb;
import com.main.xc;

/*
 * Failed to analyse overrides
 */
public class ContactAddPanel extends FrameLayout implements
		AbsListView.OnScrollListener {
	private static boolean k = false;
	private static int l = -1;
	private TextView a;
	private LinearLayout b;
	public ListView c;
	private pz d;
	private ps e;
	private SideBar f;
	private long g;
	private int h = -1;
	private List i;
	private sw j;
	static wb wb1;

	public ContactAddPanel(Context context) {
		super(context);
		h = -1;
	}

	public ContactAddPanel(Context context, AttributeSet attributeset) {
		super(context, attributeset);
		h = -1;
	}

	static long a(ContactAddPanel contactaddpanel, long l1) {
		contactaddpanel.g = l1;
		return l1;
	}

	public static ListView a(ContactAddPanel contactaddpanel) {
		return contactaddpanel.c;
	}

	static List a(ContactAddPanel contactaddpanel, List list) {
		contactaddpanel.i = list;
		return list;
	}

	// public static void a(final Context context) {
	// k = false;
	// AsyncTask.execute(new Runnable() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void run() {
	// Looper.prepare();
	//
	// wb1 = new wb(context);
	// long l = System.currentTimeMillis();
	// final List list = ContactAddPanel.b();
	// if (k) {
	// return;
	// }
	// Collections.sort((List) list, (Comparator) new un());
	// Iterator iterator = list.iterator();
	// mu mu = null;
	// while (iterator.hasNext()) {
	// mu mu2 = (mu) iterator.next();
	// if (mu == null) {
	// mu2.a(true);
	// } else {
	// boolean bl = mu.f() != mu2.f();
	// mu2.a(bl);
	// }
	// if (mu != null) {
	// boolean bl = mu.f() != mu2.f();
	// mu.b(bl);
	// }
	// mu = mu2;
	// }
	// long l2 = 1000 - (System.currentTimeMillis() - l);
	// if (l2 > 0) {
	// SystemClock.sleep((long) l2);
	// }
	// new Handler(Looper.getMainLooper())
	// .post((Runnable) new Runnable() {
	//
	// public void run() {
	// if (k) {
	// return;
	// }
	// if (list.isEmpty()) {
	// wb1.dismiss();
	// vi.a(context,
	// R.string.contact_add_no_data_toast);
	// return;
	// }
	// ContactAddPanel contactAddPanel = (ContactAddPanel) LayoutInflater
	// .from((Context) context).inflate(
	// R.layout.panel_add_friends,
	// null, false);
	// contactAddPanel.i = list;
	// contactAddPanel.a();
	// wb1.dismiss();
	// contactAddPanel.setBaseActionListener(new sw() {
	// /* synthetic */Dialog a;
	//
	// @Override
	// public void a() {
	// if (this.a != null) {
	// this.a.dismiss();
	// }
	// }
	// });
	// }
	//
	// });
	// Looper.loop();
	// }
	//
	// });
	// }
	// public static void a(final Context context) {
	// k = false;
	//
	// AsyncTask.execute(new Runnable(/*
	// * (new
	// * xb(context)).f(0x7f0f0031).a(true
	// * ).a(new
	// * android.content.DialogInterface
	// * .OnCancelListener() {
	// *
	// * public void onCancel(DialogInterface
	// * dialoginterface) {
	// * ContactAddPanel.a(true); }
	// *
	// * }).b(2003).e(), context
	// */) {
	//
	// final wb a;
	// final Context b;
	//
	// public void run() {
	// if (Looper.myLooper() == null) {
	// Looper.prepare();
	// }
	//
	// boolean flag;
	// wb1 = new wb(context);
	// long l1 = System.currentTimeMillis();
	// final List list = ContactAddPanel.b();
	// if (ContactAddPanel.c()) {
	// return;
	// }
	// // Collections.sort(list, new un());
	// Iterator iterator = list.iterator();
	// mu mu1 = null;
	// while (iterator.hasNext()) {
	// mu mu2 = (mu) iterator.next();
	// if (mu1 == null) {
	// mu2.a(true);
	// } else {
	// if (mu1.f() != mu2.f()) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// mu2.a(flag);
	// }
	// if (mu1 != null) {
	//
	// if (mu1.f() != mu2.f()) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// mu1.b(flag);
	// }
	// mu1 = mu2;
	// }
	// l1 = 1000L - (System.currentTimeMillis() - l1);
	// if (l1 > 0L) {
	// SystemClock.sleep(l1);
	// }
	// (new Handler(Looper.getMainLooper())).post(new Runnable() {
	//
	// final List a;
	//
	// // final _cls4 b;
	//
	// public void run() {
	// if (ContactAddPanel.c()) {
	// return;
	// }
	// if (a.isEmpty()) {
	// wb1.dismiss();
	// vi.a(context, 0x7f0f000b);
	// return;
	// } else {
	// ContactAddPanel contactaddpanel = (ContactAddPanel) LayoutInflater
	// .from(context).inflate(0x7f040034, null,
	// false);
	// ContactAddPanel.a(contactaddpanel, a);
	// contactaddpanel.a();
	// wb1.dismiss();
	// contactaddpanel.setBaseActionListener(new sw(/*
	// * this,
	// * (new
	// * wz
	// * (context
	// * )).c(
	// * 0x7f0f000c
	// * ) .a(
	// * contactaddpanel
	// * ).e()
	// */) {
	//
	// final Dialog a;
	//
	// public void a() {
	// if (a != null) {
	// a.dismiss();
	// }
	// }
	//
	// {
	//
	// a = wb1;
	//
	// }
	// });
	// return;
	// }
	// }
	//
	// {
	//
	// a = list;
	//
	// }
	// });
	// // Looper.loop();
	// }
	//
	// {
	// a = wb1;
	// b = context;
	// // super();
	// }
	// });
	// }

	@SuppressWarnings("unchecked")
	public static void a(final Context context) {
		k = false;
		new AsyncTask() {
			List a;
			private wb c;

			/*
			 * Enabled aggressive block sorting Lifted jumps to return sites
			 */
			public Void a(Void... arrvoid) {
				long l = System.currentTimeMillis();
				this.a = ContactAddPanel.b();
				if (k) {
					return null;
				}
				Collections.sort((List) this.a, (Comparator) new un());
				Iterator iterator = this.a.iterator();
				mu mu = null;
				boolean flag;
				mu mu1 = null;
				while (iterator.hasNext()) {
					mu mu2 = (mu) iterator.next();
					if (mu1 == null) {
						mu2.a(true);
					} else {
						if (mu1.f() != mu2.f()) {
							flag = true;
						} else {
							flag = false;
						}
						mu2.a(flag);
					}
					if (mu1 != null) {

						if (mu1.f() != mu2.f()) {
							flag = true;
						} else {
							flag = false;
						}
						mu1.b(flag);
					}
					mu1 = mu2;
				}
				return null;
			}

			public void a(Void void_) {
				if (k) {
					return;
				}
				if (this.a.isEmpty()) {
					this.c.dismiss();
					vi.a(context, 0x7f0f000b);
					return;
				}
				final ContactAddPanel contactChoosePanel = (ContactAddPanel) LayoutInflater
						.from(context).inflate(0x7f040034, null, false);
				contactChoosePanel.i = this.a;
				contactChoosePanel.a();
				this.c.dismiss();
				final Dialog dialog = (Dialog) new wz(context).c(0x7f0f000c)
						.a((View) contactChoosePanel).e();
				contactChoosePanel.setBaseActionListener(new sw(/*
																 * (Dialog) new
																 * aaa
																 * (Context.this
																 * )
																 * .c(2131558413
																 * ) .a((View)
																 * contactChoosePanel
																 * ).e()
																 */) {

					final Dialog a = dialog;

					public void a() {
						if (this.a != null) {
							this.a.dismiss();
						}
					}
				});
			}

			public Object doInBackground(Object[] arrobject) {
				return this.a((Void[]) arrobject);
			}

			public void onPostExecute(Object object) {
				this.a((Void) object);
			}

			public void onPreExecute() {
				// this.c = new xb(context).f(0x7f0f0031).a(false).b(2003).e();

				c = (new xb(context)).f(0x7f0f0031).b(true)
						.a(new DialogInterface.OnCancelListener() {

							public void onCancel(DialogInterface dialoginterface) {
								ContactAddPanel.a(true);
							}

						}).b(vk.n(context)).e();

			}

		}.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,
				(Object[]) new Void[0]);
	}

	/*
	 * Exception decompiling
	 */
	// public static List b() {
	// Object obj2 =null;
	// Cursor cursor = null;
	// Object obj3;
	// ArrayList arraylist;
	// Object obj1=null;
	// Object obj=null;
	// arraylist = new ArrayList();
	// obj3 = SwipeApplication.e().getContentResolver();
	// obj2 = new StringBuilder();
	// cursor = ((ContentResolver) (obj3)).query(kf.a,
	// new String[] { "uri" }, null, null, null);
	// // _L3:
	//
	// boolean flag = k;
	// boolean flag1;
	// char c1;
	//
	// if (!((Cursor) (cursor)).moveToNext()) {
	//
	// //obj1 = obj;
	// obj2 = ((StringBuilder) (obj2)).toString();
	// //obj1 = obj2;
	// if (cursor != null) {
	//
	// //obj = obj1;
	//
	// c1 = '\0';
	//
	// obj1 = android.provider.ContactsContract.Contacts.CONTENT_URI;
	// obj2 = (new StringBuilder()).append("_id");
	//
	// if (TextUtils.isEmpty(((CharSequence) (obj)))) {
	// obj = "";
	// } else {
	// obj = (new StringBuilder()).append(" NOT IN (")
	// .append(((String) (obj))).append(")").toString();
	// }
	// obj = ((StringBuilder) (obj2)).append(((String) (obj)))
	// .toString();
	// cursor = ((ContentResolver) (obj3)).query(((Uri) (obj1)),
	// new String[] { "_id", "display_name",
	// "photo_thumb_uri", "has_phone_number" },
	// ((String) (obj)), null, null);
	// if (c1 < 'A' || c1 > 'Z') {
	//
	// //((mu) (obj3)).a('#');
	// //arraylist.add(obj3);
	// // obj;
	// if (cursor != null) {
	// cursor.close();
	// }
	//
	// } else {
	//
	// ((mu) (obj3)).a(c1);
	//
	// }
	//
	// } else {
	//
	// //((Cursor) (obj)).close();
	// obj = obj2;
	// // goto _L10
	//
	// obj1 = null;
	//
	// }
	//
	// } else {
	//
	// //obj1 = obj;
	//
	// if (flag) {
	// if (obj != null) {
	// // ((Cursor) (obj)).close();
	// }
	// return arraylist;
	// }
	// //obj1 = obj;
	// long l1 = Long.parseLong(Uri.parse(((Cursor) (obj)).getString(0))
	// .getLastPathSegment());
	// //obj1 = obj;
	// if (((StringBuilder) (obj2)).length() <= 0) {
	// // break MISSING_BLOCK_LABEL_120;
	// }
	// // obj1 = obj;
	// ((StringBuilder) (obj2)).append(",");
	// // obj1 = obj;
	// ((StringBuilder) (obj2)).append(l1);
	//
	// }
	//
	//
	// if (!cursor.moveToNext()) {
	//
	// if (cursor != null) {
	// cursor.close();
	// }
	// return arraylist;
	//
	// } else {
	//
	// flag1 = k;
	// if (flag1) {
	// if (cursor != null) {
	// cursor.close();
	// }
	// return arraylist;
	// }
	// obj = cursor.getString(cursor.getColumnIndex("_id"));
	// obj3 = cursor.getString(cursor.getColumnIndex("display_name"));
	// if (!cursor.isNull(cursor.getColumnIndex("photo_thumb_uri"))) {
	//
	// obj1 = Uri.parse(cursor.getString(cursor
	// .getColumnIndex("photo_thumb_uri")));
	//
	// if (Integer.parseInt(cursor.getString(cursor
	// .getColumnIndex("has_phone_number"))) <= 0) {
	//
	// // l24
	// } else {
	//
	// obj2 = obj3;
	// if (obj3 == null) {
	// obj2 = "";
	// }
	//
	// obj3 = new mu();
	// ((mu) (obj3)).a(((String) (obj)));
	// ((mu) (obj3)).b(((String) (obj2)));
	// ((mu) (obj3))
	// .b(ContentUris
	// .withAppendedId(
	// android.provider.ContactsContract.Contacts.CONTENT_URI,
	// Long.valueOf(((String) (obj)))
	// .longValue()));
	// ((mu) (obj3)).a(((Uri) (obj1)));
	// obj1 = th.a().b(((String) (obj2)));
	// if (((String) (obj1)).length() <= 0) {
	// // break MISSING_BLOCK_LABEL_677;
	// }
	// c1 = Character.toUpperCase(((String) (obj1)).charAt(0));
	//
	// }
	//
	// } else {
	//
	// obj1 = null;
	//
	// }
	//
	// Log.e("Swipe.ContactAddPanel",
	// (new StringBuilder()).append("Failed to load the contact ")
	// .append(((String) (obj1))).append(".").toString(),
	// ((Throwable) (obj)));
	//
	// Log.e("Swipe.ContactAddPanel", "Failed to load the new contacts.",
	// ((Throwable) (obj)));
	//
	// }
	// return arraylist;
	// }
	// public static List b() {
	// Object obj2;
	// char c1 = 0;
	// Object obj3;
	// Cursor cursor = null;
	// Object obj1;
	// ArrayList arraylist;
	// arraylist = new ArrayList();
	// obj3 = SwipeApplication.e().getContentResolver();
	// obj2 = new StringBuilder();
	// Object obj = ((ContentResolver) (obj3)).query(kf.a,
	// new String[] { "uri" }, null, null, null);
	//
	// obj1 = obj;
	// if (!((Cursor) (obj)).moveToNext()) {
	//
	// obj1 = obj;
	// obj2 = ((StringBuilder) (obj2)).toString();
	// obj1 = obj2;
	// if (obj != null) {
	//
	// obj1 = android.provider.ContactsContract.Contacts.CONTENT_URI;
	// obj2 = (new StringBuilder()).append("_id");
	// obj = obj2;
	// boolean flag1;
	// if (TextUtils.isEmpty(((CharSequence) (obj)))) {
	// obj = "";
	// } else {
	// try {
	// obj = (new StringBuilder()).append(" NOT IN (")
	// .append(((obj))).append(")").toString();
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// // obj = ((StringBuilder) (obj2)).append(((String) (obj)))
	// // .toString();
	// cursor = ((ContentResolver) (obj3)).query(((Uri) (obj1)),
	// new String[] { "_id", "display_name",
	// "photo_thumb_uri", "has_phone_number" }, null,
	// null, null);
	// while (cursor.moveToNext()) {
	// String id = cursor.getString(cursor.getColumnIndex("_id"));
	// String name = cursor.getString(cursor
	// .getColumnIndex("display_name"));
	//
	// /*
	// * Uri android = Uri.parse(cursor.getString(cursor
	// * .getColumnIndex("photo_thumb_uri"))); String uri =
	// * cursor.getString(cursor
	// * .getColumnIndex("photo_thumb_uri"));
	// */
	// String hasphone = cursor.getString(cursor
	// .getColumnIndex("has_phone_number"));
	// if (c1 < 'A' || c1 > 'Z') {
	// mu mu = new mu();
	// mu.a(id);
	// mu.b(name);
	// mu.a(c1);
	// // /mu.a(android);
	// /*
	// * if (Integer.parseInt(cursor.getString(cursor
	// * .getColumnIndex("has_phone_number"))) <= 0) {
	// * mu.b(ContentUris.withAppendedId(
	// * ContactsContract.Contacts.CONTENT_URI, Long
	// * .valueOf(((String) (uri))) .longValue())); }
	// */
	// mu.a(Boolean.getBoolean(hasphone));
	// arraylist.add(mu);
	// c1 = '\0';
	//
	// // ((mu) (obj3)).a('#');
	// // arraylist.add(obj3);
	// // if (!cursor.moveToNext()) {
	// //
	// // if (cursor != null) {
	// // cursor.close();
	// // }
	// // return arraylist;
	// //
	// // } else {
	//
	// // while (cur.moveToNext()) {
	// // String id1 = cur
	// // .getString(cur
	// // .getColumnIndex(ContactsContract.Contacts._ID));
	// // String name1 = cur
	// // .getString(cur
	// // .getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
	// // // mu1.a(id1);
	// // // mu1.a(name1);
	// // // mu.a(theImage);
	// //
	// // // arraylist.add(mu1);
	// //
	// // if (Integer
	// // .parseInt(cur.getString(cur
	// // .getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER)))
	// // > 0) {
	// // Cursor pCur = cr
	// // .query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
	// // null,
	// // ContactsContract.CommonDataKinds.Phone.CONTACT_ID
	// // + " = ?",
	// // new String[] { id }, null);
	// // // while (pCur.moveToNext()) {
	// // // int phoneType = pCur
	// // // .getInt(pCur
	// // //
	// // .getColumnIndex(ContactsContract.CommonDataKinds.Phone.TYPE));
	// // // String phoneNumber = pCur
	// // // .getString(pCur
	// // //
	// // .getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
	// // // String name1 = pCur
	// // // .getString(pCur
	// // //
	// // .getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
	// // // /*
	// // // * byte[] bitmap = pCur .getBlob(pCur
	// // // * .getColumnIndex
	// // // * (ContactsContract.CommonDataKinds
	// // // * .Phone.PHOTO_URI));
	// // // ByteArrayInputStream
	// // // * imageStream = new ByteArrayInputStream(
	// // // * bitmap); Bitmap theImage =
	// // // BitmapFactory
	// // // * .decodeStream(imageStream);
	// // // */
	// // //
	// // // // switch (phoneType) {
	// // // // case Phone.TYPE_MOBILE:
	// // // // Log.e(name + "(mobile number)",
	// // // // phoneNumber);
	// // // // break;
	// // // // case Phone.TYPE_HOME:
	// // // // Log.e(name + "(home number)",
	// // // // phoneNumber);
	// // // // break;
	// // // // case Phone.TYPE_WORK:
	// // // // Log.e(name + "(work number)",
	// // // // phoneNumber);
	// // // // break;
	// // // // case Phone.TYPE_OTHER:
	// // // // Log.e(name + "(other number)",
	// // // // phoneNumber);
	// // // // break;
	// // // // default:
	// // // // break;
	// // // // }
	// // // }
	// // // pCur.close();
	// // return arraylist;
	// // }
	// // }
	//
	// // flag1 = k;
	// // if (flag1) {
	// // if (cursor != null) {
	// // cursor.close();
	// // }
	// // return arraylist;
	// // }
	// // obj = cursor.getString(cursor.getColumnIndex("_id"));
	// // obj3 = cursor.getString(cursor
	// // .getColumnIndex("display_name"));
	// // if (!cursor.isNull(cursor
	// // .getColumnIndex("photo_thumb_uri"))) {
	// //
	// // obj1 = Uri.parse(cursor.getString(cursor
	// // .getColumnIndex("photo_thumb_uri")));
	// //
	// // if (Integer.parseInt(cursor.getString(cursor
	// // .getColumnIndex("has_phone_number"))) <= 0) {
	// //
	// // if (!cursor.moveToNext()) {
	// //
	// // if (cursor != null) {
	// // cursor.close();
	// // }
	// //
	// // } else {
	// //
	// // flag1 = k;
	// // if (flag1) {
	// // if (cursor != null) {
	// // cursor.close();
	// // }
	// // return arraylist;
	// // }
	// //
	// // }
	// //
	// // } else {
	// //
	// // obj2 = obj3;
	// // if (obj3 == null) {
	// // obj2 = "";
	// // }
	// //
	// // obj3 = new mu();
	// // ((mu) (obj3)).a(((String) (obj)));
	// // ((mu) (obj3)).b(((String) (obj2)));
	// // ((mu) (obj3))
	// // .b(ContentUris
	// // .withAppendedId(
	// // android.provider.ContactsContract.Contacts.CONTENT_URI,
	// // Long.valueOf(
	// // ((String) (obj)))
	// // .longValue()));
	// // ((mu) (obj3)).a(((Uri) (obj1)));
	// // obj1 = th.a().b(((String) (obj2)));
	// // if (((String) (obj1)).length() > 0) {
	// // c1 = Character
	// // .toUpperCase(((String) (obj1))
	// // .charAt(0));
	// //
	// // }
	// //
	// // }
	// //
	// // } else {
	// //
	// // obj1 = null;
	// //
	// // }
	// //
	// // // }
	// // if (cursor != null) {
	// // cursor.close();
	// // }
	//
	// }
	// }
	// return arraylist;
	//
	// }
	//
	// } else {
	//
	// obj1 = obj;
	// boolean flag = k;
	// if (flag) {
	// if (obj != null) {
	// ((Cursor) (obj)).close();
	// }
	// return arraylist;
	// }
	// obj1 = obj;
	// long l1 = Long.parseLong(Uri.parse(((Cursor) (obj)).getString(0))
	// .getLastPathSegment());
	// obj1 = obj;
	// if (((StringBuilder) (obj2)).length() > 0) {
	// ((StringBuilder) (obj2)).append(",");
	// }
	// obj1 = obj;
	//
	// obj1 = obj;
	// }
	//
	// /*
	// * Log.e("Swipe.ContactAddPanel", (new
	// * StringBuilder()).append("Failed to load the contact ")
	// * .append(((String) (obj1))).append(".").toString(), ((Throwable)
	// * (obj)));
	// *
	// * Log.e("Swipe.ContactAddPanel", "Failed to load the new contacts.",
	// * ((Throwable) (obj)));
	// */
	// if (cursor != null) {
	// cursor.close();
	// }
	//
	// return arraylist;
	//
	// }

	public static List b() {
		Object obj1 = null;
		Object obj = null;
		Cursor cursor;
		char c1;
		Object obj2;
		Object obj3;
		ArrayList arraylist = null;
		try {
			arraylist = new ArrayList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj3 = SwipeApplication.e().getContentResolver();
		obj2 = new StringBuilder();
		obj = ((ContentResolver) (obj3)).query(kf.a, new String[] { "uri" },
				null, null, null);

		obj1 = obj;
		// if (!((Cursor) (obj)).moveToNext()) {
		obj1 = obj;
		obj2 = ((StringBuilder) (obj2)).toString();
		obj1 = obj2;
		if (obj == null) {
			obj = obj1;

			obj1 = android.provider.ContactsContract.Contacts.CONTENT_URI;
			obj2 = (new StringBuilder()).append("_id");
			boolean flag1;
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				obj = "";
			} else {
				obj = (new StringBuilder()).append(" NOT IN (")
						.append(((String) (obj))).append(")").toString();
			}
			obj = ((StringBuilder) (obj2)).append(((String) (obj))).toString();
			cursor = ((ContentResolver) (obj3)).query(((Uri) (obj1)),
					new String[] { "_id", "display_name", "photo_thumb_uri",
							"has_phone_number" }, ((String) (obj)), null, null);
			c1 = '\0';
			if (c1 < 'A' || c1 > 'Z') {
				((mu) (obj3)).a('#');
				arraylist.add(obj3);
				if (!cursor.moveToNext()) {
					if (cursor != null) {
						cursor.close();
					}
				} else {
					flag1 = k;
					if (flag1) {
						if (cursor != null) {
							cursor.close();
						}
						return arraylist;
					}
					obj = cursor.getString(cursor.getColumnIndex("_id"));
					obj3 = cursor.getString(cursor
							.getColumnIndex("display_name"));
					if (!cursor
							.isNull(cursor.getColumnIndex("photo_thumb_uri"))) {
						obj1 = Uri.parse(cursor.getString(cursor
								.getColumnIndex("photo_thumb_uri")));
						if (Integer.parseInt(cursor.getString(cursor
								.getColumnIndex("has_phone_number"))) > 0) {
							obj2 = obj3;
							if (obj3 == null) {
								obj2 = "";
							}

							obj3 = new mu();
							((mu) (obj3)).a(((String) (obj)));
							((mu) (obj3)).b(((String) (obj2)));
							((mu) (obj3))
									.b(ContentUris
											.withAppendedId(
													android.provider.ContactsContract.Contacts.CONTENT_URI,
													Long.valueOf(
															((String) (obj)))
															.longValue()));
							((mu) (obj3)).a(((Uri) (obj1)));
							obj1 = th.a().b(((String) (obj2)));
							if (((String) (obj1)).length() > 0) {
								c1 = Character.toUpperCase(((String) (obj1))
										.charAt(0));
							}

						}
					}
				}

				obj1 = obj;
				obj = obj2;

				if (cursor != null) {
					cursor.close();
				}

			} else {
				((mu) (obj3)).a(c1);
			}
		} else {
			((Cursor) (obj)).close();
			obj = obj2;

			obj1 = android.provider.ContactsContract.Contacts.CONTENT_URI;
			obj2 = (new StringBuilder()).append("_id");
			boolean flag1;
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				obj = "";
			} else {
				obj = (new StringBuilder()).append(" NOT IN (")
						.append(((String) (obj))).append(")").toString();
			}
			obj = ((StringBuilder) (obj2)).append(((String) (obj))).toString();
			cursor = ((ContentResolver) (obj3)).query(((Uri) (obj1)),
					new String[] { "_id", "display_name", "photo_thumb_uri",
							"has_phone_number" }, ((String) (obj)), null, null);

			c1 = '\0';
			mu mu1 = new mu();
			if (c1 < 'A' || c1 > 'Z') {
				((mu) (mu1)).a('#');
				// arraylist.add(mu1);
				while (cursor.moveToNext()) {
					mu mu = new mu();
					flag1 = k;
					if (flag1) {
						if (cursor != null) {
							cursor.close();
						}
						return arraylist;
					}
					obj = cursor.getString(cursor.getColumnIndex("_id"));
					obj3 = cursor.getString(cursor
							.getColumnIndex("display_name"));
					if (!cursor
							.isNull(cursor.getColumnIndex("photo_thumb_uri"))) {
						obj1 = Uri.parse(cursor.getString(cursor
								.getColumnIndex("photo_thumb_uri")));
						if (Integer.parseInt(cursor.getString(cursor
								.getColumnIndex("has_phone_number"))) > 0) {
							mu.b(true);
							/*Cursor pCur = SwipeApplication
									.e()
									.getContentResolver()
									.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,

											null,
											ContactsContract.CommonDataKinds.Phone.CONTACT_ID
													+ " = ?",
											new String[] { (String) obj }, null);
							String phn = null;
							while (pCur.moveToLast()) {

								int phNumber = pCur
										.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER);

								phn = pCur.getString(phNumber);
							}*/

							obj2 = obj3;
							if (obj3 == null) {
								obj2 = "";
							}

							((mu) (mu)).a(((String) (obj)));

							((mu) (mu)).b(((String) (obj2)));
							((mu) (mu))
									.b(ContentUris
											.withAppendedId(
													android.provider.ContactsContract.Contacts.CONTENT_URI,
													Long.valueOf(
															((String) (obj)))
															.longValue()));
							((mu) (mu)).a(((Uri) (obj1)));
							obj1 = th.a().b(((String) (obj2)));
							if (((String) (obj1)).length() > 0) {
								c1 = Character.toUpperCase(((String) (obj1))
										.charAt(0));
							}
							mu.a(c1);
							arraylist.add(mu);
						}
					}
				}

				obj1 = obj;
				obj = obj2;

				if (cursor != null) {
					cursor.close();
				}
				return arraylist;
			}
		}
		// }
		/*
		 * else { obj1 = obj; boolean flag = k; if (flag) { if (obj != null) {
		 * ((Cursor) (obj)).close(); } return arraylist; } obj1 = obj; long l1 =
		 * Long.parseLong(Uri.parse(((Cursor) (obj)).getString(0))
		 * .getLastPathSegment()); obj1 = obj; if (((StringBuilder)
		 * (obj2)).length() > 0) { obj1 = obj; ((StringBuilder)
		 * (obj2)).append(","); obj1 = obj; ((StringBuilder) (obj2)).append(l1);
		 * }
		 */

		// }

		return arraylist;

	}

	public static pz f(ContactAddPanel contactAddPanel) {
		return contactAddPanel.d;
	}

	public int a(int i1) {
		for (int j1 = 0; j1 < i.size(); j1++) {
			if (((mu) i.get(j1)).f() >= i1) {
				return j1;
			}
		}

		return -1;
	}

	static sw c(ContactAddPanel contactaddpanel) {
		return contactaddpanel.j;
	}

	static boolean c() {
		return k;
	}

	static int d(ContactAddPanel contactaddpanel) {
		return contactaddpanel.h;
	}

	// public void a() {
	// b = (LinearLayout) findViewById(R.id.title_layout);
	// a = (TextView) findViewById(R.id.title_layout_catalog);
	// c = (ListView) findViewById(R.id.friends_listview);
	// f = (SideBar) findViewById(R.id.sidebar);
	// f.setOnTouchingLetterChangedListener(new xc() {
	//
	// final ContactAddPanel a;
	//
	// public void a(String s) {
	// int i1 = a.a(s.charAt(0));
	// if (i1 != -1) {
	// ContactAddPanel.a(a).setSelection(i1);
	// }
	// }
	//
	// {
	// a = ContactAddPanel.this;
	// // super();
	// }
	// });
	// d = new pz();
	// e = new ps(this, SwipeApplication.e(), i);
	// c.setAdapter(e);
	// c.setOnScrollListener(this);
	// c.setOnItemClickListener(new
	// android.widget.AdapterView.OnItemClickListener() {
	//
	// final ContactAddPanel a;
	//
	// public void onItemClick(AdapterView adapterview, View view, int i1,
	// long l1) {
	// if (Math.abs((long) (ContactAddPanel.this.g - System
	// .currentTimeMillis())) < 200) {
	// return;
	// }
	// ContactAddPanel.a(a, System.currentTimeMillis());
	// if (ContactAddPanel.this.j != null) {
	// ContactAddPanel.this.j.a();
	// }
	// l = ContactAddPanel.this.h;
	// AsyncTask.execute(new Runnable() {
	//
	// int a;
	// wb b;
	// ContactAddPanel addPanel = ContactAddPanel.this;
	//
	// // final _cls2 c;
	//
	// public void run() {
	// java.io.InputStream inputstream;
	// java.io.InputStream inputstream1;
	// java.io.InputStream inputstream2;
	// mu mu1;
	// Object obj2;
	// Object obj3;
	// mu1 = (mu) ContactAddPanel.e(addPanel).getItem(a);
	// mu1.d();
	// obj2 = c.getContext().getContentResolver();
	// obj3 = mu1.a();
	// inputstream1 = null;
	// inputstream2 = null;
	// inputstream = null;
	// if (obj3 == null) {
	// // break MISSING_BLOCK_LABEL_132;
	// }
	// try {
	// inputstream = ((ContentResolver) (obj2))
	// .openInputStream(((Uri) (obj3)));
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// obj2 = BitmapFactory.decodeStream(inputstream);
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// obj3 = tf.a(((android.graphics.Bitmap) (obj2)),
	// c.getContext());
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// mu1.a(tj.a(((android.graphics.Bitmap) (obj3))));
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// tf.a(((android.graphics.Bitmap) (obj3)));
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// tf.a(((android.graphics.Bitmap) (obj2)));
	// ub.a(inputstream);
	// // _L2:
	// boolean flag = false;
	// Object obj = pv.a(c.getContext());
	// int i1 = ((flag) ? 1 : 0);
	// if (obj != null) {
	// int j1 = ((List) (obj)).size();
	// i1 = ((flag) ? 1 : 0);
	// if (j1 > 0) {
	// i1 = ((pv) ((List) (obj)).get(j1 - 1)).f + 1;
	// }
	// }
	// obj = mu1.i();
	// obj = i1;
	// pv.h.add(obj);
	// ((pv) (obj)).a(c.getContext(), ((pv) (obj)));
	// (new Handler(Looper.getMainLooper()))
	// .post(new Runnable() {
	//
	// // final _cls1 a;
	//
	// public void run() {
	// b.dismiss();
	// if (Fan.getInstance() != null) {
	// Fan.getInstance().b(false);
	// if (Fan.getInstance()
	// .getItemLayer() != null) {
	// Fan.getInstance()
	// .getItemLayer().g();
	// }
	// }
	// }
	//
	// });
	// ub.a(inputstream2);
	// return;
	//
	// }
	//
	// });
	// }
	//
	// {
	// a = ContactAddPanel.this;
	//
	// }
	// });
	// if (l >= 0) {
	// c.setSelection(l);
	// }
	// }
	static boolean a(boolean flag) {
		k = flag;
		return flag;
	}

	static int b(int i1) {
		l = i1;
		return i1;
	}

	static long b(ContactAddPanel contactaddpanel) {
		return contactaddpanel.g;
	}

	// public void a() {
	// b = (LinearLayout) findViewById(0x7f0c009d);
	// a = (TextView) findViewById(0x7f0c009e);
	// c = (ListView) findViewById(R.id.friends_listview);
	// f = (SideBar) findViewById(0x7f0c009f);
	// f.setOnTouchingLetterChangedListener(new xc() {
	//
	// final ContactAddPanel a;
	//
	// public void a(String s) {
	// int i1 = a.a(s.charAt(0));
	// if (i1 != -1) {
	// ContactAddPanel.a(a).setSelection(i1);
	// }
	// }
	//
	// {
	// a = ContactAddPanel.this;
	// // super();
	// }
	// });
	// d = new pz();
	// e = new ps(this, SwipeApplication.e(), i);
	// c.setAdapter(e);
	// c.setOnScrollListener(this);
	// c.setOnItemClickListener(new
	// android.widget.AdapterView.OnItemClickListener() {
	//
	// final ContactAddPanel a;
	//
	// public void onItemClick(AdapterView adapterview, View view,
	// final int i1, long l1) {
	// if (Math.abs(ContactAddPanel.b(a) - System.currentTimeMillis()) < 200L) {
	// return;
	// }
	// ContactAddPanel.a(a, System.currentTimeMillis());
	// if (ContactAddPanel.c(a) != null) {
	// ContactAddPanel.c(a).a();
	// }
	// ContactAddPanel.b(ContactAddPanel.d(a));
	// AsyncTask.execute(new Runnable(/*
	// * this, i1, (new
	// * xb(a.getContext
	// * ())).f(0x7f0f0031
	// * ).a(false).b(2003).e()
	// */) {
	//
	// final int a;
	// final wb b;
	//
	// // final _cls2 c;
	//
	// public void run() {
	// java.io.InputStream inputstream;
	// java.io.InputStream inputstream1;
	// java.io.InputStream inputstream2;
	// mu mu1;
	// Object obj2;
	// Object obj3;
	// mu1 = (mu) ContactAddPanel.e(ContactAddPanel.this)
	// .getItem(a);
	// mu1.d();
	// obj2 = SwipeApplication.e().getContentResolver();
	// obj3 = mu1.a();
	// inputstream1 = null;
	// inputstream2 = null;
	// inputstream = null;
	// if (obj3 == null) {
	// return;
	// // break MISSING_BLOCK_LABEL_132;
	// }
	// try {
	// inputstream = ((ContentResolver) (obj2))
	// .openInputStream(((Uri) (obj3)));
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// obj2 = BitmapFactory.decodeStream(inputstream);
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// obj3 = tf.a(((android.graphics.Bitmap) (obj2)),
	// ContactAddPanel.this.getContext());
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// mu1.a(tj.a(((android.graphics.Bitmap) (obj3))));
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// tf.a(((android.graphics.Bitmap) (obj3)));
	// inputstream1 = inputstream;
	// inputstream2 = inputstream;
	// tf.a(((android.graphics.Bitmap) (obj2)));
	// ub.a(inputstream);
	//
	// boolean flag = false;
	// Object obj = pv.a(SwipeApplication.e());
	// int i1 = ((flag) ? 1 : 0);
	// if (obj != null) {
	// int j1 = ((List) (obj)).size();
	// i1 = ((flag) ? 1 : 0);
	// if (j1 > 0) {
	// i1 = ((pv) ((List) (obj)).get(j1 - 1)).f + 1;
	// }
	// }
	// pv pv = mu1.i();
	// pv.f = i1;
	// pv.h.add(pv);
	// ((pv) (obj)).a(ContactAddPanel.this.getContext(),
	// ((pv) (obj)));
	// (new Handler(Looper.getMainLooper()))
	// .post(new Runnable() {
	//
	// public void run() {
	// wb1.dismiss();
	// if (Fan.getInstance() != null) {
	// Fan.getInstance().b(false);
	// if (Fan.getInstance()
	// .getItemLayer() != null) {
	// Fan.getInstance()
	// .getItemLayer().g();
	// }
	// }
	// }
	//
	// });
	// return;
	//
	// }
	//
	// {
	//
	// a = i1;
	// b = wb1;
	//
	// }
	// });
	// }
	//
	// {
	// a = ContactAddPanel.this;
	//
	// }
	// });
	// if (l >= 0) {
	// c.setSelection(l);
	// }
	// }

	public void a() {
		b = (LinearLayout) findViewById(0x7f0c009d);
		a = (TextView) findViewById(0x7f0c009e);
		c = (ListView) findViewById(R.id.friends_listview);
		f = (SideBar) findViewById(0x7f0c009f);
		f.setOnTouchingLetterChangedListener(new xc() {

			final ContactAddPanel a;

			public void a(String s) {
				int i1 = a.a(s.charAt(0));
				if (i1 != -1) {
					ContactAddPanel.a(a).setSelection(i1);
				}
			}

			{
				a = ContactAddPanel.this;
				// super();
			}
		});
		d = new pz();
		e = new ps(this, SwipeApplication.e(), i);
		c.setAdapter(e);
		c.setOnScrollListener(this);
		this.c.setOnItemClickListener((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener() {

			@SuppressWarnings("unchecked")
			public void onItemClick(AdapterView adapterView, View view,
					final int n, long l) {
				if (Math.abs((long) (ContactAddPanel.this.g - System
						.currentTimeMillis())) < 200) {
					return;
				}
				ContactAddPanel.a(ContactAddPanel.this,
						System.currentTimeMillis());
				if (ContactAddPanel.c(ContactAddPanel.this) != null) {
					ContactAddPanel.c(ContactAddPanel.this).a();
				}
				ContactAddPanel.b(ContactAddPanel.d(ContactAddPanel.this));
				new AsyncTask() {
					private wb c = wb1;
					private mu d;

					public Void a(Void... arrvoid) {
						ContactAddPanel.this.a(ContactAddPanel.this);
						return null;
					}

					public void a(Void void_) {
						c.dismiss();
					}

					public Object doInBackground(Object[] arrobject) {
						return this.a((Void[]) arrobject);
					}

					public void onPostExecute(Object object) {
						this.a((Void) object);
					}

					public void onPreExecute() {
						this.c = new xb(a.getContext()).f(0x7f0f0031).a(false)
								.b(2003).e();
						this.d = (mu) ContactAddPanel.this.e.getItem(n);
						java.io.InputStream inputstream;
						java.io.InputStream inputstream1;
						java.io.InputStream inputstream2;
						// mu mu1;
						Object obj2;
						Object obj3;
						// mu1 = (mu)ContactAddPanel.e(c.a).getItem(a);
						d.d();
						obj2 = ContactAddPanel.this.getContext()
								.getContentResolver();
						obj3 = d.a();
						inputstream1 = null;
						inputstream2 = null;
						inputstream = null;
						if (obj3 != null) {
							try {
								inputstream = ((ContentResolver) (obj2))
										.openInputStream(((Uri) (obj3)));
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

						// inputstream1 = inputstream;
						// inputstream2 = inputstream;
						// obj2 = BitmapFactory.decodeStream(inputstream);
						// inputstream1 = inputstream;
						// inputstream2 = inputstream;
						// obj3 = tf.a(((android.graphics.Bitmap) (obj2)),
						// ContactAddPanel.this.getContext());
						// inputstream1 = inputstream;
						// inputstream2 = inputstream;
						// d.a(tj.a(((android.graphics.Bitmap) (obj3))));
						// inputstream1 = inputstream;
						// inputstream2 = inputstream;
						// tf.a(((android.graphics.Bitmap) (obj3)));
						// inputstream1 = inputstream;
						// inputstream2 = inputstream;
						// tf.a(((android.graphics.Bitmap) (obj2)));
						// ub.a(inputstream);
						// _L2:
						boolean flag = false;
						Object obj = pv.a(ContactAddPanel.this.getContext());
						int i1 = ((flag) ? 1 : 0);
						if (obj != null) {
							int j1 = ((List) (obj)).size();
							i1 = ((flag) ? 1 : 0);
							if (j1 > 0) {
								i1 = ((pv) ((List) (obj)).get(j1 - 1)).f + 1;
							}
						}
						pv pv = d.i();
						pv.f = i1;
						pv.h.add(pv);
						((pv) (pv)).a(ContactAddPanel.this.getContext(),
								((pv) (pv)));
						(new Handler(Looper.getMainLooper()))
								.post(new Runnable() {

									public void run() {
										c.dismiss();
										if (Fan.getInstance() != null) {
											Fan.getInstance().b(false);
											if (Fan.getInstance()
													.getItemLayer() != null) {
												Fan.getInstance()
														.getItemLayer().g();
											}
										}
									}

								});
					}
				}.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,
						(Object[]) new Void[0]);
			}

		});
		if (l >= 0) {
			this.c.setSelection(l);
		}
	}

	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		this.d.a();
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
	}

	/*
	 * Enabled aggressive block sorting
	 */

	public void onScroll(AbsListView abslistview, int i1, int j1, int k1) {
		if (i == null || i.size() == 0) {
			return;
		}
		j1 = ((mu) i.get(i1)).f();
		if (i1 != h) {
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams) b
					.getLayoutParams();
			marginlayoutparams.topMargin = 0;
			b.setLayoutParams(marginlayoutparams);
			a.setText(String.valueOf(((mu) i.get(i1)).f()));
		}
		if (i1 + 1 >= i.size() || j1 == ((mu) i.get(i1 + 1)).f()) {
			h = i1;
			return;

		} else {

			View view = abslistview.getChildAt(0);
			if (view == null) {

				h = i1;
				return;

			} else {

				j1 = b.getHeight();
				k1 = abslistview.getBottom();
				MarginLayoutParams layoutParams = (android.view.ViewGroup.MarginLayoutParams) b
						.getLayoutParams();
				if (k1 >= j1) {

					if (((android.view.ViewGroup.MarginLayoutParams) (layoutParams)).topMargin != 0) {
						layoutParams.topMargin = 0;
						b.setLayoutParams(layoutParams);
					}

				} else {

					layoutParams.topMargin = (int) (float) (k1 - j1);
					b.setLayoutParams(layoutParams);

				}

			}
		}

	}

	public void onScrollStateChanged(AbsListView abslistview, int i1) {

		switch (i1) {

		default:
			pz.a = false;
			return;
		case 0:

			pz.a = true;
			if (!pz.b) {
				return;

			} else {

				pz.b = false;
				e.notifyDataSetChanged();
				return;

			}

		case 1:
			pz.a = false;
			return;
		case 2:

			pz.a = false;
			return;
		}

	}

	public void setBaseActionListener(sw sw) {
		j = sw;
	}

	// private class ListView extends android.widget.ListView {
	//
	// protected int computeVerticalScrollOffset() {
	// int i1;
	// if (getHeight() == 0) {
	// i1 = 0;
	// } else {
	// i1 = (int) (((float) vk.a(getContext(), 18F) * 1.0F * (float) super
	// .computeVerticalScrollRange()) / (float) getHeight());
	// }
	// return i1 + super.computeVerticalScrollOffset();
	// }
	//
	// public ListView(Context context) {
	// super(context);
	// }
	//
	// public ListView(Context context, AttributeSet attributeset) {
	// super(context, attributeset);
	// }
	// }

}
