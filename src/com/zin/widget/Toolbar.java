package com.lazyswipe.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.main.ks;
import com.main.kz;
import com.main.la;
import com.main.xi;

// Referenced classes of package com.lazyswipe.widget:
//            OverflowImageView

public class Toolbar extends LinearLayout implements
		android.view.View.OnClickListener, la {

	private View a;
	private TextView b;
	private ImageView c;
	private TextView d;
	private OverflowImageView e;
	private ks f;
	private xi g;

	public Toolbar(Context context) {
		this(context, null);
	}

	public Toolbar(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public Toolbar(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
	}

	@SuppressLint("NewApi")
	public Toolbar(Context context, AttributeSet attributeset, int i, int j) {
		super(context, attributeset, i, j);
	}

	private void a(Drawable drawable) {
		if (drawable != null && c.getVisibility() != 0) {
			c.setVisibility(0);
		}
		d();
	}

	private void d() {
		if (c.getVisibility() == 0 || b.getVisibility() == 0) {
			a.setOnClickListener(this);
		}
	}

	public void a() {
		if (f != null) {
			f.c();
		}
	}

	public void a(Drawable drawable, CharSequence charsequence) {
		boolean flag1 = true;
		boolean flag;
		if (!TextUtils.isEmpty(charsequence)) {
			d.setText(charsequence);
			flag = true;
		} else {
			flag = false;
		}
		if (drawable != null) {
			d.setCompoundDrawablesWithIntrinsicBounds(null, null, null,
					drawable);
			flag = flag1;
		}
		if (flag && d.getVisibility() != 0) {
			d.setVisibility(0);
		}
	}

	public boolean a(kz kz) {
		return g != null && g.a(kz);
	}

	public void b() {
		e.setUnread(true);
	}

	public void c() {
		e.setUnread(false);
	}

	public ks getPopupMenu() {
		return f;
	}

	public void onClick(View view) {
		view.getId();
		// JVM INSTR lookupswitch 3: default 40
		// 2131492924: 41
		// 2131493053: 59
		// 2131493054: 77;
		// goto _L1 _L2 _L3 _L4

		switch (view.getId()) {

		default:
			return;
		case 2131492924:
			if (g != null) {
				g.c(view);
				return;
			}
		case 2131493053:
			if (g != null) {
				g.b(view);
				return;
			}
		case 2131493054:
			a();
			return;
		}

	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		d = (TextView) findViewById(0x7f0c003c);
		b = (TextView) findViewById(0x7f0c000d);
		c = (ImageView) findViewById(0x7f0c002d);
		e = (OverflowImageView) findViewById(0x7f0c00be);
		a = findViewById(0x7f0c00bd);
		d.setOnClickListener(this);
		e.setOnClickListener(this);
	}

	public void setActionImage(int i) {
		setActionImage(getResources().getDrawable(i));
	}

	public void setActionImage(Drawable drawable) {
		a(drawable, null);
	}

	public void setActionTitle(int i) {
		setActionTitle(getResources().getText(i));
	}

	public void setActionTitle(CharSequence charsequence) {
		a(null, charsequence);
	}

	public void setButtonBackground(int i) {
		a.setBackgroundResource(i);
		d.setBackgroundResource(i);
		e.setBackgroundResource(i);
	}

	public void setCallback(xi xi1) {
		g = xi1;
	}

	public void setIcon(int i) {
		Drawable drawable;
		if (i > 0) {
			drawable = getResources().getDrawable(i);
		} else {
			drawable = null;
		}
		setIcon(drawable);
	}

	public void setIcon(Bitmap bitmap) {
		c.setImageBitmap(bitmap);
		a(c.getDrawable());
	}

	public void setIcon(Drawable drawable) {
		c.setImageDrawable(drawable);
		a(drawable);
	}

	public void setMenu(int i) {
		if (i != 0) {
			if (e.getVisibility() != 0) {
				e.setVisibility(0);
			}
			if (f == null) {
				f = new ks(getContext(), new Handler(), e);
				f.a(i);
				f.a(this);
			}
		}
	}

	public void setTitle(int i) {
		setTitle(getResources().getText(i));
	}

	public void setTitle(CharSequence charsequence) {
		b.setText(charsequence);
		if (!TextUtils.isEmpty(charsequence) && b.getVisibility() != 0) {
			b.setVisibility(0);
			d();
		}
	}

	public void setTitleColor(int i) {
		b.setTextColor(i);
	}

	public void setTitleColor(String s) {
		setTitleColor(Color.parseColor(s));
	}
}
