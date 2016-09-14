package com.main;

import java.lang.ref.WeakReference;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

public class uc extends Handler {

	private static WeakReference a;

	public uc() {
	}

	private View a(uf uf1) {
		View view = (View) uf1.b.get();
		uf uf2;
		if (view instanceof ImageView) {
			uf2 = a((ImageView) view);
		} else {
			uf2 = a((TextView) view);
		}
		if (uf1 == uf2) {
			return view;
		} else {
			return null;
		}
	}

	private static uf a(ImageView imageview) {
		if (imageview != null) {
			Drawable drawable = imageview.getDrawable();
			if (drawable instanceof ud) {
				return ((ud) drawable).a();
			}
		}
		return null;
	}

	private static uf a(TextView textview) {
		if (textview != null) {
			int i = ((Integer) textview.getTag(0x7f0c0003)).intValue();
			Drawable drawable = textview.getCompoundDrawables()[i];
			if (drawable instanceof ud) {
				return ((ud) drawable).a();
			}
		}
		return null;
	}

	public static void a() {
		a = new WeakReference(ox.d().j());
	}

	private void a(View view, Drawable drawable) {
		drawable = a(drawable);
		TransitionDrawable transitionDrawable = new TransitionDrawable(
				new Drawable[] { new ColorDrawable(0x106000d), drawable });
		if (!(view instanceof ImageView)) {

			if (view instanceof TextView) {
				a((TextView) view, transitionDrawable);
			}

		} else {
			((ImageView) view).setImageDrawable(transitionDrawable);
		}

		transitionDrawable.startTransition(200);
		return;

	}

	private void a(TextView textview, Drawable drawable) {
		int i = ((Integer) textview.getTag(0x7f0c0003)).intValue();
		Drawable adrawable[] = new Drawable[4];
		adrawable[0] = null;
		adrawable[1] = null;
		adrawable[2] = null;
		adrawable[3] = null;
		adrawable[i] = drawable;
		textview.setCompoundDrawablesWithIntrinsicBounds(adrawable[0],
				adrawable[1], adrawable[2], adrawable[3]);
	}

	public static void b() {
		if (a != null) {
			tf.a((Bitmap) a.get());
			a.clear();
		}
		a = null;
	}

	private Bitmap c() {
		if (a == null || !tf.b((Bitmap) a.get())) {
			a();
		}
		if (tf.b((Bitmap) a.get())) {
			return (Bitmap) a.get();
		} else {
			return BitmapFactory.decodeResource(SwipeApplication.e()
					.getResources(), 0x7f030000);
		}
	}

	protected Drawable a(Drawable drawable) {
		return drawable;
	}

	protected ud a(Resources resources, int i, uf uf1) {
		Bitmap bitmap;
		if (i > 0) {
			bitmap = BitmapFactory.decodeResource(resources, i);
		} else {
			bitmap = null;
		}
		return new ud(resources, bitmap, uf1);
	}

	protected ud a(Resources resources, Bitmap bitmap, uf uf1) {
		return new ud(resources, bitmap, uf1);
	}

	public void a(Resources resources, ImageView imageview, String s) {
		a(resources, imageview, s, null);
	}

	public void a(Resources resources, ImageView imageview, String s,
			String s1, int i) {
		a(resources, imageview, s, s1, i, null);
	}

	public void a(Resources resources, ImageView imageview, String s,
			String s1, int i, int j, int k, ue ue1) {
		uf uf = new uf(this, imageview, s, s1, j, k, ue1);
		imageview.setImageDrawable(a(resources, i, ((uf) (uf))));
		ui.a(ji.a, uf);
	}

	public void a(Resources resources, ImageView imageview, String s,
			String s1, int i, ue ue1) {
		a(resources, imageview, s, s1, i, 0, 0, ue1);
	}

	public void a(Resources resources, ImageView imageview, String s, ue ue1) {
		uf uf = new uf(this, imageview, s, ue1);
		imageview.setImageDrawable(a(resources, c(), ((uf) (uf))));
		ui.a(uf);
	}

	public void a(Resources resources, ImageView imageview, jq jq1) {
		a(resources, imageview, jq1, null);
	}

	public void a(Resources resources, ImageView imageview, jq jq1, ue ue1) {
		if (jq1.c == null || jq1.c.get() == null) {
			uf uf = new uf(this, imageview, jq1, ue1);
			imageview.setImageDrawable(a(resources, c(), ((uf) (uf))));
			ui.a(uf);
			return;
		} else {
			imageview.setImageDrawable((Drawable) jq1.c.get());
			return;
		}
	}

	public void handleMessage(Message message) {
		if (1 != message.what) {
			return;

		} else {

			uf uf1 = (uf) message.obj;
			View view = a(uf1);
			if (view == null) {
				// break MISSING_BLOCK_LABEL_178;
			}
			Object obj;
			obj = uf1.g;
			if (uf1.a != null && uf1.a.get() != null) {
				((ue) uf1.a.get()).a(((Drawable) (obj)));
			}
			if (obj != null) {
				// break MISSING_BLOCK_LABEL_172;
			}
			// obj = (new StringBuilder()).append("App icon is null! ");
			if (uf1.c == null) {

				if (uf1.i == null) {
					a(view, ((Drawable) (obj)));
					// break label0;
				}
				// view = uf1.i;

				// goto _L5
				// message = uf1.j;
				// goto _L5

				uf1.g = null;
				uf1.h = null;
				return;

			} else {

			}

			String str = (new StringBuilder()).append(uf1.c.b).append("; ")
					.append(uf1.c.h).toString();

		}

	}
}
