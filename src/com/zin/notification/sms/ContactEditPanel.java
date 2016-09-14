/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.CheckBox
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.lazyswipe.notification.sms;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.lazyswipe.fan.friend.FriendSector;
import com.main.ja;
import com.main.kg;
import com.main.mq;
import com.main.ng;
import com.main.pv;
import com.main.pw;
import com.main.px;
import com.main.sw;
import com.main.uk;
import com.main.wz;

/*
 * Failed to analyse overrides
 */
public class ContactEditPanel extends FrameLayout {
	private ListView a;
	private sw b;
	private px c;
	private List d;
	private List e;
	public static long f;
	static ContactEditPanel panel;

	public ContactEditPanel(Context context) {
		super(context);
		panel = null;
		panel = ContactEditPanel.this;
	}

	public ContactEditPanel(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		panel = null;
		panel = ContactEditPanel.this;
	}

	// public static void a(Context context, final pv pv,
	// final WeakReference weakReference) {
	// ContactEditPanel contactEditPanel = (ContactEditPanel) LayoutInflater
	// .from((Context) context).inflate(R.layout.panel_edit_friend, null,
	// false);
	// contactEditPanel.setData(pv);
	// new wz(context)
	// .c(R.string.edit_contact_title)
	// .a((View) contactEditPanel)
	// .a(17039370,
	// (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
	//
	// public void onClick(
	// DialogInterface dialogInterface, int n) {
	// if (Math.abs((long) (f - System
	// .currentTimeMillis())) < 200) {
	// return;
	// }
	// ContactEditPanel.this.f = System
	// .currentTimeMillis();
	// ContactEditPanel.this.a(pv);
	// if (weakReference != null
	// && weakReference.get() != null) {
	// ((FriendSector) weakReference.get()).c();
	// }
	// dialogInterface.dismiss();
	// }
	// }).d(17039360).e(-1).e();
	// }
	public static void a(Context context, final pv pv1,
			final WeakReference weakreference) {
		ContactEditPanel contacteditpanel = (ContactEditPanel) LayoutInflater
				.from(context).inflate(0x7f040035, null, false);
		contacteditpanel.setData(pv1);
		(new wz(context))
				.c(0x7f0f0027)
				.a(contacteditpanel)
				.a(0x104000a,
						new android.content.DialogInterface.OnClickListener() {

							final ContactEditPanel a = panel;
							final pv b;
							final WeakReference c;

							public void onClick(
									DialogInterface dialoginterface, int i) {
								if (Math.abs(ContactEditPanel.b(a)
										- System.currentTimeMillis()) < 200L) {
									return;
								}
								ContactEditPanel.a(a,
										System.currentTimeMillis());
								a.a(b);
								if (c != null && c.get() != null) {
									((FriendSector) c.get()).c();
								}
								dialoginterface.dismiss();
							}

							{
								// a = ContactEditPanel.this;
								b = pv1;
								c = weakreference;
								// super();
							}
						}).d(0x1040000).e(-1).e();
	}

	static long b(ContactEditPanel contacteditpanel) {
		return contacteditpanel.f;
	}

	static long a(ContactEditPanel contacteditpanel, long l) {
		contacteditpanel.f = l;
		return l;
	}

	static List a(ContactEditPanel contacteditpanel) {
		return contacteditpanel.d;
	}

	/*
	 * Exception decompiling
	 */
	// private List b(pv pv1) {
	// Cursor cursor;
	// ArrayList arraylist;
	// cursor = null;
	// String s;
	// String s2;
	// String s3;
	//
	// arraylist = new ArrayList();
	// Object obj;
	// obj = getContext().getContentResolver();
	// pv1.a(((ContentResolver) (obj)));
	// android.net.Uri uri = kg.a;
	// String s1 = (new StringBuilder()).append("contact_id=").append(pv1.b)
	// .toString();
	// obj = ((ContentResolver) (obj)).query(uri, new String[] { "app",
	// "is_enable", "key" }, s1, null, null);
	// cursor = ((Cursor) (obj));
	//
	// if (!cursor.moveToNext()) {
	//
	// Collections.sort(arraylist, new pw(this));
	// if (cursor != null)
	//
	// {
	//
	// cursor.close();
	//
	// if (cursor != null) {
	// cursor.close();
	// }
	// return arraylist;
	// }
	//
	// } else {
	//
	// obj = new mq();
	// s = cursor.getString(0);
	// s2 = cursor.getString(1);
	// s3 = cursor.getString(2);
	// boolean flag;
	// if (s2.equals("1")) {
	// flag = true;
	// } else {
	// flag = false;
	// }
	// ((mq) (obj)).a(flag);
	// ((mq) (obj)).a(pv1.b);
	// ((mq) (obj)).b(s);
	// if (!s.equals(uk.b)) {
	//
	// if (!s.equals(uk.c)) {
	//
	// if (!s.equals(uk.d)) {
	//
	// ((mq) (obj)).a(ng.a.c());
	// ((mq) (obj)).c(ng.a.b());
	// ((mq) (obj)).b(1);
	// }
	// ((mq) (obj)).a(s3);
	// if (!s3.isEmpty()) {
	// arraylist.add(obj);
	// }
	//
	// } else {
	//
	// ((mq) (obj)).a(ng.c.c());
	// ((mq) (obj)).c(ng.c.b());
	// ((mq) (obj)).b(3);
	//
	// ((mq) (obj)).a(s3);
	// if (!s3.isEmpty()) {
	// arraylist.add(obj);
	// }
	//
	// }
	//
	// } else {
	//
	// ((mq) (obj)).a(ng.e.c());
	// ((mq) (obj)).c(ng.e.b());
	// ((mq) (obj)).b(5);
	//
	// }
	//
	// }
	// return arraylist;
	//
	// }
	private List b(pv pv1) {
		Cursor cursor;
		ArrayList arraylist;
		cursor = null;
		arraylist = new ArrayList();
		Object obj;
		obj = getContext().getContentResolver();
		pv1.a(((ContentResolver) (obj)));
		android.net.Uri uri = kg.a;
		String s1 = (new StringBuilder()).append("contact_id=").append(pv1.b)
				.toString();
		obj = ((ContentResolver) (obj)).query(uri, new String[] { "app",
				"is_enable", "key" }, s1, null, null);
		String s;
		String s2;
		String s3;

		cursor = ((Cursor) (obj));
		
		if (!cursor.moveToNext()) {

			Collections.sort(arraylist, new pw(this));
			if (cursor == null) {

				return arraylist;

			} else {

				cursor.close();
				return arraylist;

			}

		} else {

			mq mq = new mq();
			s = cursor.getString(0);
			s2 = cursor.getString(1);
			s3 = cursor.getString(2);
			boolean flag;
			if (s2.equals("1")) {
				flag = true;
			} else {
				flag = false;
			}
			((mq) (mq)).a(flag);
			((mq) (mq)).a(pv1.b);
			((mq) (mq)).b(s);
			if (!s.equals(uk.b)) {

				if (!s.equals(uk.c)) {

					if (!s.equals(uk.d)) {
					
					}
					((mq) (mq)).a(ng.a.c());
					((mq) (mq)).c(ng.a.b());
					((mq) (mq)).b(1);
					((mq) (mq)).a(s3);
					if (!s3.isEmpty()) {
						arraylist.add(mq);
					}
					if (!s.equals(uk.a)) {

						if (!s.equals(uk.e)) {

							((mq) (mq)).a(s3);
							if (!s3.isEmpty()) {
								arraylist.add(mq);
							}

						} else {

							((mq) (mq)).a(ng.b.c());
							((mq) (mq)).c(ng.b.b());
							((mq) (mq)).b(2);
							((mq) (mq)).a(s3);
							if (!s3.isEmpty()) {
								arraylist.add(mq);
							}

						}

					} else {

						((mq) (mq)).a(ng.d.c());
						((mq) (mq)).c(ng.d.b());
						((mq) (mq)).b(4);
						((mq) (mq)).a(s3);
						if (!s3.isEmpty()) {
							arraylist.add(mq);
						}

					}

				} else {

					((mq) (mq)).a(ng.c.c());
					((mq) (mq)).c(ng.c.b());
					((mq) (mq)).b(3);

					((mq) (mq)).a(s3);
					if (!s3.isEmpty()) {
						arraylist.add(mq);
					}

				}

			} else {
			}

			((mq) (mq)).a(ng.e.c());
			((mq) (mq)).c(ng.e.b());
			((mq) (mq)).b(5);
		}

		cursor.close();
		return arraylist;

	}

	/*
	 * Enabled aggressive block sorting
	 */
	// public void a(pv pv) {
	// StringBuilder stringBuilder = new StringBuilder();
	// Iterator iterator = this.d.iterator();
	// int n = 0;
	// while (iterator.hasNext()) {
	// mq mq = (mq) iterator.next();
	// int n2 = mq.d();
	// String string = mq.c();
	// String string2 = mq.a();
	// boolean bl = mq.b();
	// if (bl) {
	// if (!((Boolean) this.e.get(n)).booleanValue()) {
	// stringBuilder.append(string).append(' ');
	// }
	// } else if (((Boolean) this.e.get(n)).booleanValue()) {
	// stringBuilder.append('-').append(string).append(' ');
	// }
	// ContentValues contentValues = new ContentValues();
	// String string3 = bl ? "1" : "0";
	// contentValues.put("is_enable", string3);
	// ContentResolver contentResolver = this.getContext()
	// .getContentResolver();
	// Uri uri = kg.a;
	// String[] arrstring = new String[] { String.valueOf((int) n2),
	// string };
	// contentResolver.update(uri, contentValues,
	// "contact_id=? AND app=?", arrstring);
	// if (!bl) {
	// pv.a(string);
	// } else {
	// pv.a(string, string2, null, null, null);
	// }
	// ++n;
	// }
	// if (stringBuilder.length() > 0) {
	// ja.a().a("\u8054\u7cfb\u65b9\u5f0f\u53d8\u66f4", "connections",
	// stringBuilder.toString());
	// }
	// }
	public void a(pv pv1) {
		StringBuilder stringbuilder = new StringBuilder();
		Iterator iterator = d.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			mq mq = (mq) iterator.next();
			int j = ((mq) (mq)).d();
			String s = ((mq) (mq)).c();
			String s1 = ((mq) (mq)).a();
			boolean flag = ((mq) (mq)).b();
			ContentValues contentvalues;
			if (flag) {
				if (!((Boolean) e.get(i)).booleanValue()) {
					stringbuilder.append(s).append(' ');
				}
			} else if (((Boolean) e.get(i)).booleanValue()) {
				stringbuilder.append('-').append(s).append(' ');
			}
			contentvalues = new ContentValues();
			String str = null;
			if (flag) {
				str = "1";
			} else {
				str = "0";
			}
			contentvalues.put("is_enable", ((String) (str)));
			getContext().getContentResolver().update(kg.a, contentvalues,
					"contact_id=? AND app=?",
					new String[] { String.valueOf(j), s });
			if (!flag) {
				pv1.a(s);
			} else {
				pv1.a(s, s1, null, null, null);
			}
			i++;
		}
		if (stringbuilder.length() > 0) {
			ja.a().a("\u8054\u7CFB\u65B9\u5F0F\u53D8\u66F4", "connections",
					stringbuilder.toString());
		}
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
	}

	public void setBaseActionListener(sw sw) {
		this.b = sw;
	}

	// public void setData(pv pv) {
	// this.a = (ListView) this.findViewById(2131493024);
	// this.d = this.b(pv);
	// int n = this.d.size();
	// this.e = new ArrayList(this.d.size());
	// for (int i = 0; i < n; ++i) {
	// this.e.add((Object) ((mq) this.d.get(i)).b());
	// }
	// this.c = new px(this, this.getContext(), this.d);
	// this.a.setAdapter((ListAdapter) this.c);
	// this.a.setOnItemClickListener((AdapterView.OnItemClickListener) new
	// AdapterView.OnItemClickListener() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void onItemClick(AdapterView adapterView, View view, int n,
	// long l) {
	// mq mq = (mq) ContactEditPanel.this.d.get(n);
	// CheckBox checkBox = (CheckBox) view.findViewById(2131493027);
	// boolean bl = !checkBox.isChecked();
	// checkBox.setChecked(bl);
	// mq.a(checkBox.isChecked());
	// }
	// });
	// }
	public void setData(pv pv1) {
		a = (ListView) findViewById(0x7f0c00a0);
		d = b(pv1);
		int j = d.size();
		e = new ArrayList(d.size());
		for (int i = 0; i < j; i++) {
			e.add(Boolean.valueOf(((mq) d.get(i)).b()));
		}

		c = new px(this, getContext(), d);
		a.setAdapter(c);
		a.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

			final ContactEditPanel a;

			public void onItemClick(AdapterView adapterview, View view, int k,
					long l) {
				mq mq = (mq) ContactEditPanel.a(a).get(k);
				CheckBox box = (CheckBox) view.findViewById(0x7f0c00a3);
				boolean flag;
				if (!box.isChecked()) {
					flag = true;
				} else {
					flag = false;
				}
				box.setChecked(flag);
				mq.a(box.isChecked());
			}

			{
				a = ContactEditPanel.this;
				// super();
			}
		});
	}
}
