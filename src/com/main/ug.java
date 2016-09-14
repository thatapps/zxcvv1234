package com.main;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;

import java.util.Arrays;

public class ug {

	public static as a(Notification notification) {
		as as1 = new as(notification);
		Bundle bundle = ab.a(notification);
		if (bundle != null) {
			Parcelable[] parcelable = bundle
					.getParcelableArray("android.support.wearable.actions");
			if (parcelable != null && parcelable.length > 0) {
				as1.b();
				int j = parcelable.length;
				for (int i = 0; i < j; i++) {
					as1.a(b((Bundle) parcelable[i]));
				}

			}
		}
		return as1;
	}

	private static bh a(Bundle bundle) {
		return (new bi(bundle.getString("return_key")))
				.a(bundle.getString("label"))
				.a(bundle.getStringArray("choices"))
				.a(bundle.getBoolean("allowFreeFormInput")).a();
	}

	public static Bundle[] a(Bundle bundle, String string) {
		Object[] arrobject = bundle.getParcelableArray(string);
		if (arrobject instanceof Bundle[] || arrobject == null) {
			return (Bundle[]) arrobject;
		}
		Bundle[] arrbundle = (Bundle[]) Arrays.copyOf((Object[]) arrobject,
				(int) arrobject.length, (Class) Bundle[].class);
		bundle.putParcelableArray(string, (Parcelable[]) arrbundle);
		return arrbundle;
	}

	private static bh[] a(Bundle abundle[]) {
		if (abundle != null)
			;
		bh abh[] = new bh[abundle.length];
		for (int i = 0; i < abundle.length; i++) {
			abh[i] = a(abundle[i]);
		}

		return abh;
	}

	private static ac b(Bundle bundle) {
		int i = bundle.getInt("icon");
		Object obj = bundle.getCharSequence("title");
		PendingIntent pendingintent = (PendingIntent) bundle
				.getParcelable("action_intent");
		bundle = (Bundle) bundle.getParcelable("extras");
		obj = new ad(i, ((CharSequence) (obj)), pendingintent);
		if (bundle != null) {
			((ad) (obj)).a(bundle);
			bh[] bhs = a(a(bundle, "android.support.wearable.remoteInputs"));
			if (bundle != null) {
				int k = bhs.length;
				for (int j = 0; j < k; j++) {
					((ad) (obj)).a(bhs[j]);
				}

			}
		}
		return ((ad) (obj)).a();
	}
}
