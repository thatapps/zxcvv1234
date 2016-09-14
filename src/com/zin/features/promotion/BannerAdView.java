/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.String
 */
package com.lazyswipe.features.promotion;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.zev.R;
import com.main.gl;
import com.main.gp;
import com.main.gq;
import com.main.jc;
import com.main.ol;
import com.main.to;
import com.main.ue;

/*
 * Failed to analyse overrides
 */
@SuppressLint("NewApi")
public class BannerAdView extends FrameLayout {
	private gp a;
	private TextView b;
	private TextView c;
	private ImageView d;
	private View e;
	private ue f;
	private int g;
	private gl h;
	private String i;
	private int j;
	private boolean k;

	public BannerAdView(Context context) {
		this(context, null);
	}

	public BannerAdView(Context context, AttributeSet attributeSet) {
		this(context, attributeSet, 0);
	}

	public BannerAdView(Context context, AttributeSet attributeSet, int n) {
		super(context, attributeSet, n);
	}

	public BannerAdView(Context context, AttributeSet attributeSet, int n,
			int n2) {
		super(context, attributeSet, n, n2);
	}

	public void a() {
		if (this.a != null) {
			this.a.h();
		}
		this.a = new gp(this.getContext(), this.i);
		this.a.a(this.h);
		this.a.a();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(boolean bl) {
		int n;
		int n2;
		jc.a("fb", ol.a(this.i));
		this.c.setText((CharSequence) this.a.e());
		this.b.setText((CharSequence) this.a.g());
		if (bl) {
			this.a.a((View) this.getParent());
		}
		gq gq = this.a.d();
		String string = gq.a();
		int n3 = gq.b();
		if (n3 > this.j) {
			int n4 = gq.c();
			float f = 1.0f * (float) n3 / (float) n4;
			n = this.j;
			n2 = (int) ((float) n / f);
		} else {
			n = 0;
			n2 = 0;
		}
		this.g = string.hashCode();
		String string2 = ol.a(this.getContext(), this.g, 2, 0);
		FanItem.g.a(this.getResources(), this.d, string2, string, 0, n, n2,
				this.f);
	}

	public void b() {
		this.a(true);
	}

	public gp getAd() {
		return this.a;
	}

	public int getOfferId() {
		return this.g;
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		this.b = (TextView) this.findViewById(R.id.action);
		this.c = (TextView) this.findViewById(R.id.title);
		this.d = (ImageView) this.findViewById(R.id.icon);
		this.e = this.findViewById(R.id.title_action_container);
		if (Build.VERSION.SDK_INT > 17) {
			this.d.setAdjustViewBounds(true);
		}
		this.j = to.r(this.getContext());
	}

	protected void onLayout(boolean bl, int n, int n2, int n3, int n4) {
		super.onLayout(bl, n, n2, n3, n4);
		if (this.k && n4 - n2 > 0) {
			((android.widget.FrameLayout.LayoutParams) this.e.getLayoutParams()).height = this
					.getMeasuredHeight() >> 1;
		}
	}

	public void setActionText(int n) {
		this.b.setText(n);
	}

	public void setAd(gp gp) {
		this.a = gp;
	}

	public void setAdListener(gl gl) {
		this.h = gl;
	}

	public void setIconLoadListener(ue ue) {
		this.f = ue;
	}

	public void setImage(Drawable drawable) {
		this.d.setImageDrawable(drawable);
	}

	public void setImageScaleType(ImageView.ScaleType scaleType) {
		this.d.setScaleType(scaleType);
	}

	public void setPlacement(String string) {
		this.i = string;
	}

	public void setTitleActionContainerBackgroundResource(int n) {
		this.e.setBackgroundResource(n);
		this.k = true;
	}
}
