package com.main;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public class ab {

	private static final ai a;

	static ai a() {
		return a;
	}

	public static Bundle a(Notification notification) {
		return a.a(notification);
	}

	static void a(aa aa, ar ar) {
		b(aa, ar);
	}

	static void a(z z1, ArrayList arraylist) {
		b(z1, arraylist);
	}

	static Notification[] a(Bundle bundle, String s) {
		return b(bundle, s);
	}

	private static void b(aa aa, ar ar) {
		if (ar != null) {
			if (ar instanceof af) {
				ar = (af) ar;
				bd.a(aa, ((af) (ar)).e, ((af) (ar)).g, ((af) (ar)).f,
						((af) (ar)).a);
			} else {
				if (ar instanceof ah) {
					ar = (ah) ar;
					bd.a(aa, ((ah) (ar)).e, ((ah) (ar)).g, ((ah) (ar)).f,
							((ah) (ar)).a);
					return;
				}
				if (ar instanceof ae) {
					ar = (ae) ar;
					bd.a(aa, ((ae) (ar)).e, ((ae) (ar)).g, ((ae) (ar)).f,
							((ae) (ar)).a, ((ae) (ar)).b, ((ae) (ar)).c);
					return;
				}
			}
		}
	}

	private static void b(z z1, ArrayList arraylist) {
		Iterator iterator = null;
		for (iterator = arraylist.iterator(); iterator.hasNext(); z1
				.a((ac) iterator.next())) {
		}
	}

	static Notification[] b(Bundle bundle, String s) {
		android.os.Parcelable aparcelable[] = bundle.getParcelableArray(s);
		if ((aparcelable instanceof Notification[]) || aparcelable == null) {
			return (Notification[]) (Notification[]) aparcelable;
		}
		Notification anotification[] = new Notification[aparcelable.length];
		for (int i = 0; i < aparcelable.length; i++) {
			anotification[i] = (Notification) aparcelable[i];
		}

		bundle.putParcelableArray(s, anotification);
		return anotification;
	}

	static {
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			a = new ak();
		} else if (android.os.Build.VERSION.SDK_INT >= 20) {
			a = new aj();
		} else if (android.os.Build.VERSION.SDK_INT >= 19) {
			a = new aq();
		} else if (android.os.Build.VERSION.SDK_INT >= 16) {
			a = new ap();
		} else if (android.os.Build.VERSION.SDK_INT >= 14) {
			a = new ao();
		} else if (android.os.Build.VERSION.SDK_INT >= 11) {
			a = new an();
		} else if (android.os.Build.VERSION.SDK_INT >= 9) {
			a = new am();
		} else {
			a = new al();
		}
	}
}
