package com.main;

import android.annotation.SuppressLint;
import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

class bn {

	@SuppressLint("NewApi") static void a(bp abp[], Intent intent, Bundle bundle) {
		RemoteInput.addResultsToIntent(a(abp), intent, bundle);
	}

	@SuppressLint("NewApi") static RemoteInput[] a(bp abp[]) {
		if (abp == null) {
			return null;
		}
		RemoteInput aremoteinput[] = new RemoteInput[abp.length];
		for (int i = 0; i < abp.length; i++) {
			bp bp1 = abp[i];
			aremoteinput[i] = (new android.app.RemoteInput.Builder(bp1.a()))
					.setLabel(bp1.b()).setChoices(bp1.c())
					.setAllowFreeFormInput(bp1.d()).addExtras(bp1.e()).build();
		}

		return aremoteinput;
	}

	@SuppressLint("NewApi") static bp[] a(RemoteInput aremoteinput[], bq bq1) {
		if (aremoteinput == null) {
			return null;
		}
		bp abp[] = bq1.b(aremoteinput.length);
		for (int i = 0; i < aremoteinput.length; i++) {
			RemoteInput remoteinput = aremoteinput[i];
			abp[i] = bq1.b(remoteinput.getResultKey(), remoteinput.getLabel(),
					remoteinput.getChoices(),
					remoteinput.getAllowFreeFormInput(),
					remoteinput.getExtras());
		}

		return abp;
	}
}
