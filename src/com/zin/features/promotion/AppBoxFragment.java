//zevienin

package com.lazyswipe.features.promotion;

import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;

import com.lazyswipe.ui.CursorLoaderFragment;
import com.lazyswipe.zev.R;
import com.main.gj;
import com.main.gk;
import com.main.gl;
import com.main.jc;
import com.main.kl;
import com.main.oj;
import com.main.ol;
import com.main.op;
import com.main.ue;

// Referenced classes of package com.lazyswipe.features.promotion:
//            BannerAdView

public class AppBoxFragment extends CursorLoaderFragment implements gl, op, ue {

	static final String a[] = { "packageName", "adUrl", "offer_id",
			"market_url", "clickLogUrl", "resolve_failed", "icon", "_id",
			"impressionLogUrl", "size", "shortDesc", "title", "category" };
	static int b = 0;
	static int c = 1;
	public static int d = 2;
	static int e = 3;
	static int f = 4;
	static int g = 5;
	public static int h = 6;
	static int i = 7;
	public static int j = 8;
	public static int k = 9;
	public static int l = 10;
	public static int m = 11;
	public static int n = 12;
	private static final String t = "Swipe."
			+ AppBoxFragment.class.getSimpleName();
	private LinearLayout u;
	private BannerAdView v;

	public AppBoxFragment() {
	}

	public int a() {
		return R.layout.fragment_app_box;
	}

	public Loader a(int i1, Bundle bundle) {
		return new CursorLoader(
				getActivity(),
				kl.a,
				a,
				"placement=? AND packageName NOT IN( SELECT DISTINCT package FROM application WHERE uninstalled<>?) AND vendor=?",
				new String[] { String.valueOf(0), "1", String.valueOf(0) },
				null);
	}

	public void a(int i1, int j1) {
	}

	public void a(int i1, int j1, String s) {
	}

	public void a(Cursor cursor) {
		boolean flag = true;
		Context context = getActivity().getApplicationContext();
		if (cursor.getInt(g) != 1) {
			flag = false;
		}
		ol.a(context, flag, cursor.getInt(d), 0, cursor.getString(e),
				cursor.getString(c), cursor.getString(f), cursor.getString(b),
				0, this);
	}

	public void a(Drawable drawable) {
		if (drawable != null) {
			u.setAlpha(0.0F);
			u.setVisibility(0);
			u.animate().alpha(1.0F);
			return;
		} else {
			Log.w(t, "Banner failed to download");
			return;
		}
	}

	public void a(View view) {
		super.a(view);
		u = (LinearLayout) view.findViewById(R.id.banner_container);
		v = (BannerAdView) LayoutInflater.from(getActivity()).inflate(
				R.layout.banner_ad_view, null);
		u.addView(v, 0);
		v.setPlacement("774443062592078_835714899798227");
		v.setAdListener(this);
		v.setIconLoadListener(this);
		v.a();
	}

	public void a(gj gj) {
		jc.a(0, 1, 1, "fb");
		try {
			if (v.getAd() != gj) {
				Log.w(t, "The returned AD is not the one started the load");
				return;
			}
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
		v.b();
		return;
	}

	public void a(gj gj, gk gk1) {
		jc.a(0, gk1);
		Log.w(t,
				(new StringBuilder())
						.append("Failed to load Facebook AD; error: ")
						.append(gk1.a()).append("/").append(gk1.b()).toString());
	}

	public int b() {
		return 1;
	}

	public void b(gj gj) {
		jc.b("fb", 0);
		u.setVisibility(8);
		v.a();
	}

	public CursorAdapter c() {
		return new CursorAdapter(getActivity(), null) {

			 AppBoxFragment a;

			public void bindView(View view, Context context, Cursor cursor) {
				((oj) view.getTag()).a(view, context, cursor);
			}

			public View newView(Context context, Cursor cursor,
					ViewGroup viewgroup) {
				View view = LayoutInflater.from(context).inflate(R.layout.app_box_item,
						viewgroup, false);
				view.setTag(new oj(view));
				return view;
			}

		};
	}

	@Override
	public void onLoadFinished(Loader arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}
