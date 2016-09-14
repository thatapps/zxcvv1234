package com.main;

import java.util.Arrays;

import android.os.Bundle;
import android.os.Parcelable;

class g {
	public static Bundle[] a(Bundle paramBundle, String paramString) {
		Parcelable[] arrayOfParcelable = paramBundle
				.getParcelableArray(paramString);
		Bundle[] arrayOfBundle;
		if (((arrayOfParcelable instanceof Bundle[]))
				|| (arrayOfParcelable == null)) {
			arrayOfBundle = (Bundle[]) arrayOfParcelable;
		}

		arrayOfBundle = (Bundle[]) Arrays.copyOf(arrayOfParcelable,
				arrayOfParcelable.length, Bundle[].class);
		paramBundle.putParcelableArray(paramString, arrayOfBundle);
		return arrayOfBundle;

	}
}
