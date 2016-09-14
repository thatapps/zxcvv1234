package com.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.fan.FanItem;
import com.lazyswipe.zev.R;

public class nz implements View.OnClickListener {
	private Context a;
	private ns b;
	private View c;
	private int d;
	private ImageView e;
	private ImageView f;
	private ImageView g;
	private TextView h;
	private TextView i;
	private TextView j;
	private View k;
	private View l;

	public nz(Context context, ns ns) {
		this.a = context;
		this.b = ns;
		this.c = LayoutInflater.from((Context) context).inflate(
				R.layout.fragment_facebook_lucky, null, false);
		this.e = (ImageView) this.c.findViewById(R.id.cover);
		this.g = (ImageView) this.c.findViewById(R.id.ad);
		this.k = this.c.findViewById(R.id.body_container);
		this.l = this.c.findViewById(R.id.update_icon);
		this.f = (ImageView) this.c.findViewById(R.id.icon);
		this.h = (TextView) this.c.findViewById(R.id.title);
		this.i = (TextView) this.c.findViewById(R.id.body);
		this.j = (TextView) this.c.findViewById(R.id.action);
		this.c.findViewById(R.id.lucky_root).setOnClickListener(
				(View.OnClickListener) this);
		this.l.setOnClickListener((View.OnClickListener) this);
		this.d = to.r(context);
		this.c.setVisibility(8);
	}

	public View a() {
		return this.c;
	}

	public void a(Bitmap bitmap, String string,
			View.OnClickListener onClickListener) {
		this.k.setVisibility(8);
		this.g.setVisibility(8);
		this.j.setText((CharSequence) string);
		this.e.setImageBitmap(bitmap);
		this.c.findViewById(R.id.lucky_container).setOnClickListener(
				onClickListener);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void a(gp gp, String string, String string2, int n, int n2) {
		int n3;
		int n4;
		String string3 = gp.f();
		if (TextUtils.isEmpty((CharSequence) string3)) {
			this.i.setVisibility(8);
		} else {
			this.i.setText((CharSequence) string3);
		}
		this.h.setText((CharSequence) gp.e());
		this.j.setText((CharSequence) gp.g());
		if (n2 > this.d) {
			float f = 1.0f * (float) n2 / (float) n;
			n3 = this.d;
			n4 = (int) ((float) n3 / f);
		} else {
			n3 = 0;
			n4 = 0;
		}
		FanItem.g.a(this.a.getResources(), this.e, string, "null", 0, n3, n4,
				null);
		if (!TextUtils.isEmpty((CharSequence) string2)) {
			FanItem.g.a(this.a.getResources(), this.f, string2, "null", 0, 0,
					0, null);
		} else {
			this.f.setVisibility(8);
		}
		jc.a("fb", 1);
		gp.a(this.c.findViewById(R.id.lucky_container));
	}

	public void a(final Runnable runnable) {
		vk.a(this.c.animate().alpha(0.0f).setDuration(300),
				(Runnable) new Runnable() {

					public void run() {
						nz.this.c.setVisibility(8);
						if (runnable != null) {
							runnable.run();
						}
					}
				});
	}

	public void b() {
		this.c.setVisibility(0);
		this.c.animate().alpha(1.0f).setDuration(300).start();
	}

	public boolean c() {
		if (this.c.getVisibility() == 0) {
			return true;
		}
		return false;
	}

	public void d() {
		tf.a(this.e.getDrawable());
		this.e.setImageDrawable(null);
		tf.a(this.f.getDrawable());
		this.f.setImageDrawable(null);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void onClick(View view) {
		if (view == this.l) {
			this.b.b();
			return;
		} else {
			if (view.getId() != R.id.lucky_root)
				return;
			{
				ja.a().a("FbLucky-FbOutsideClick");
				this.b.d();
				return;
			}
		}
	}

}
