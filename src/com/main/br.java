package com.main;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

class br {

	static Bundle a(bp bp1) {
		Bundle bundle = new Bundle();
		bundle.putString("resultKey", bp1.a());
		bundle.putCharSequence("label", bp1.b());
		bundle.putCharSequenceArray("choices", bp1.c());
		bundle.putBoolean("allowFreeFormInput", bp1.d());
		bundle.putBundle("extras", bp1.e());
		return bundle;
	}

	static bp a(Bundle bundle, bq bq1) {
		return bq1.b(bundle.getString("resultKey"),
				bundle.getCharSequence("label"),
				bundle.getCharSequenceArray("choices"),
				bundle.getBoolean("allowFreeFormInput"),
				bundle.getBundle("extras"));
	}

	static void a(bp abp[], Intent intent, Bundle bundle) {
		Bundle bundle1 = new Bundle();
		int j = abp.length;
		for (int i = 0; i < j; i++) {
			bp bp1 = abp[i];
			Object obj = bundle.get(bp1.a());
			if (obj instanceof CharSequence) {
				bundle1.putCharSequence(bp1.a(), (CharSequence) obj);
			}
		}

		Intent intent2 = new Intent();
		intent2.putExtra("android.remoteinput.resultsData", bundle1);
		intent.setClipData(ClipData.newIntent("android.remoteinput.results",
				intent2));
	}

	static Bundle[] a(bp abp[]) {
		if (abp == null) {
			return null;
		}
		Bundle abundle[] = new Bundle[abp.length];
		for (int i = 0; i < abp.length; i++) {
			abundle[i] = a(abp[i]);
		}

		return abundle;
	}

	static bp[] a(Bundle abundle[], bq bq1) {
		if (abundle == null) {
			return null;
		}
		bp abp[] = bq1.b(abundle.length);
		for (int i = 0; i < abundle.length; i++) {
			abp[i] = a(abundle[i], bq1);
		}

		return abp;
	}
}
