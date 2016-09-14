package com.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.lazyswipe.fan.FanItem;
import com.lazyswipe.widget.HorizontalGridList;
import java.util.List;

class uz {

	private Dialog a;
	private View b;

	public uz(final Activity var1, ut var2, final va var3, final String var4,
			final uy var5, final boolean var6, ux var7[]) {
		OnClickListener var10 = new OnClickListener() {
			public void onClick(View var1x) {
				Object var2 = var1x.getTag();
				if (var2 instanceof uv) {
					((uv) var2).a();
				} else if (var2 instanceof uu) {
					uu var3x = (uu) var2;
					uz.this.a(var1, var4, var3x.a, var3, var5, var6);
					if (uz.this.a != null) {
						tp.a((Dialog) uz.this.a);
						return;
					}
				}

			}
		};
		final List<uw> var9 = var2.a();
		final HorizontalGridList var8 = (HorizontalGridList) LayoutInflater
				.from(var1).inflate(0x7f040046, (ViewGroup) null);
		var8.setOnItemClickListener(var10);
		var8.setAdapter(new ws(var8) {
			protected int a() {
				return var9.size();
			}

			protected void a(FanItem var1, int var2) {
				if (var2 < var9.size()) {
					uw var3 = var9.get(var2);
					var1.setColorFilter(us.c());
					var1.setIcon((Drawable) var3.d);
					var1.setText(var3.c);
					var1.setTag(var3);
				}
			}
		});
		this.b = var8;
		this.b.setLayoutParams(new LayoutParams(-1, -2));
	}

	static Dialog a(uz var0, Dialog var1) {
		var0.a = var1;
		return var1;
	}

	static View a(uz var0) {
		return var0.b;
	}

	public void a(Activity var1, String var2, ComponentName var3, va var4,
			uy var5, boolean var6) {
		if (var2 == null) {
			if (var6) {
				String var7 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_others";
				var2 = var7;
				if (var3 != null) {
					if ("com.facebook.katana".equals(var3.getPackageName())) {
						var2 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_fb";
					} else if ("com.google.android.apps.plus".equals(var3
							.getPackageName())) {
						var2 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_gp";
					} else if ("com.vkontakte.android".equals(var3
							.getPackageName())) {
						var2 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_vk";
					} else if ("jp.naver.line.android".equals(var3
							.getPackageName())) {
						var2 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_line";
					} else {
						var2 = var7;
						if ("com.whatsapp".equals(var3.getPackageName())) {
							var2 = "&referrer=aq_tranid%3d0KwjpxdKZOO86Ncx3pTYVfLDSoQ1aylzY%26pid%3dha_lazy_int%26c%3dlazy_sc_wa";
						}
					}
				}

				var2 = us.a() + var2;
			} else {
				var2 = "http://a.lazyswipe.com//clients/latest?pid=400105&channel=90003";
			}
		}

		us.a(var1, var3, var4, var2, var5);
	}
}
