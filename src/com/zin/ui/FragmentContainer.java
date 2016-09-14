/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.content.ComponentName
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.lazyswipe.ui;

import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.lazyswipe.zev.R;

/*
 * Failed to analyse overrides
 */
public class FragmentContainer
extends Activity {
    private static final String b = "Swipe." + FragmentContainer.class.getSimpleName();
    protected String a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = null;
		try {
			activityInfo = this.getPackageManager().getActivityInfo(this.getComponentName(), 128);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (activityInfo == null) return;
        if (activityInfo.metaData == null) {
		    return;
		}
		this.a = activityInfo.metaData.getString("com.lazyswipe.FRAGMENT_CLASS");
		return;
    }

    protected int a() {
        return R.layout.fragment_container;
    }

    public int a(Fragment fragment) {
        return this.a(fragment, "def_fragment_tag");
    }

    public int a(Fragment fragment, String string) {
        return this.getFragmentManager().beginTransaction().add(R.id.fragment_container, fragment, string).commit();
    }

    protected View b() {
        return null;
    }

    protected Fragment c() {
        try {
			this.d();
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            return null;
        }
        try {
            Fragment fragment = (Fragment)Class.forName((String)this.a).newInstance();
            return fragment;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n = this.a();
        if (n > 0) {
            this.setContentView(n);
        } else {
            this.setContentView(this.b());
        }
        if (bundle == null) {
            this.a(this.c());
        }
    }
}

