package com.main;

import java.util.HashMap;
import java.util.HashSet;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public class ti {
	private static final String a = "Swipe." + ti.class.getSimpleName();
	private static ti b;
	private final HashMap c = new HashMap();
	private final HashMap d = new HashMap();
	private final HashSet e = new HashSet();
	private final sz f;

	public ti() {
		this.f = new sz() {

			protected void a(String string) {
				ti.this.a(string);
			}

			protected void b(String string) {
				ti.this.b(string);
			}

			protected void c(String string) {
			}
		};
	}

	public static ti a() {
		if (b == null) {
			b = new ti();
		}
		return b;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private void a(String string) {
		HashSet hashSet;
		HashSet hashSet2 = hashSet = this.e;
		synchronized (hashSet2) {
			this.e.add((Object) string);
			this.d.remove((Object) string);
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private void b(String string) {
		HashSet hashSet;
		HashSet hashSet2 = hashSet = this.e;
		synchronized (hashSet2) {
			this.e.remove((Object) string);
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public Class a(Context context, CharSequence charSequence,
			CharSequence object) {
		HashSet hashSet;
		HashSet hashSet2;
		if (TextUtils.isEmpty((CharSequence) charSequence)) {
			return null;
		}
		if (TextUtils.isEmpty((CharSequence) object)) {
			int n = TextUtils.lastIndexOf((CharSequence) charSequence,
					(char) '.');
			if (n < 0) {
				return null;
			}
			object = TextUtils.substring((CharSequence) charSequence, (int) 0,
					(int) n);
		}
		String string = charSequence.toString();
		String string2 = object.toString();
		HashSet hashSet3 = hashSet = this.e;
		synchronized (hashSet3) {
			hashSet2 = (HashSet) this.d.get((Object) string2);
			if (hashSet2 != null && hashSet2.contains((Object) string)) {
				return null;
			}
		}
		Class class_ = (Class) this.c.get((Object) string);
		if (class_ != null)
			return class_;
		try {
			Class class_2 = this.getClass().getClassLoader().loadClass(string);
			if (class_2 != null) {
				this.c.put((Object) string, (Object) class_2);
				return class_2;
			}
		} catch (ClassNotFoundException var10_12) {
			// empty catch block
		}
		if (context == null) {
			return null;
		}
		try {
			Class class_3 = context.createPackageContext(string2, 3)
					.getClassLoader().loadClass(string);
			if (class_3 != null) {
				this.c.put((Object) string, (Object) class_3);
				return class_3;
			}
		} catch (Exception var11_14) {
			Log.e((String) a,
					(String) ("Error encountered. Failed to load outside class: " + string));
		}
		if (hashSet2 == null) {
			hashSet2 = new HashSet();
			this.d.put((Object) string2, (Object) hashSet2);
		}
		hashSet2.add((Object) string);
		return null;
	}

}
