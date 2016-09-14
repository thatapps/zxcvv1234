//zevienin

package com.lazyswipe.features.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SplashView extends RelativeLayout {

	private ImageView a;
	private ImageView b;

	public SplashView(Context context) {
		super(context);
	}

	public SplashView(Context context, AttributeSet attributeset) {
		super(context, attributeset);
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		a = (ImageView) findViewById(0x7f0c00bb);
		b = (ImageView) findViewById(0x7f0c0080);
		b.setColorFilter(0xff000000, android.graphics.PorterDuff.Mode.SRC_IN);
	}

	public void setImage(Bitmap bitmap) {
		a.setImageBitmap(bitmap);
	}
}
