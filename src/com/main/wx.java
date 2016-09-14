package com.main;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;

public class wx {

	private Context a;
	private View b;
	private String c;
	private Rect d;
	private ShapeDrawable e;
	private Paint f;
	private int g;
	private int h;

	public wx(Context context, View view) {
		d = new Rect();
		a = context;
		b = view;
		int i = vk.a(context, 18F);
		h = i;
		g = i;
	}

	public void a(Canvas canvas, int i, int j, int k, int l) {
		if (d == null) {
			d = new Rect();
		}
		if (e == null) {
			i = a.getResources().getDimensionPixelSize(0x7f0b0045);
			e = new ShapeDrawable(new RoundRectShape(new float[] { (float) i,
					(float) i, (float) i, (float) i, (float) i, (float) i,
					(float) i, (float) i }, null, null));
			e.getPaint().setColor(a.getResources().getColor(0x7f0a0000));
		}
		if (f == null) {
			f = new Paint();
			f.setTextSize(a.getResources().getDimensionPixelSize(0x7f0b005b));
			f.setColor(-1);
			f.setAntiAlias(true);
			f.setFakeBoldText(true);
			f.setTextAlign(android.graphics.Paint.Align.CENTER);
		}
		f.getTextBounds(c, 0, c.length(), d);
		i = d.top;
		int i1 = d.right;
		int j1 = d.left;
		int k1 = d.bottom - d.top;
		l = Math.max(h, k1);
		float f1 = (float) (l - k1) / 2.0F;
		f.getTextBounds("0", 0, 1, d);
		float f2 = (float) ((l - d.bottom) + d.top) / 2.0F;
		i1 = (int) Math.max(g, (float) (i1 - j1) + f2 * 2.0F);
		f2 = Math
				.min(Math.min((float) i1 / 2.0F,
						(b.getScrollX() + b.getWidth()) - k) / (float) i1,
						Math.min((float) l / 2.0F, j - b.getScrollY())
								/ (float) l);
		k = (int) ((float) k - (float) i1 * (1.0F - f2));
		j = (int) ((float) j - f2 * (float) l);
		d.set(e.getBounds());
		e.setBounds(k, j, k + i1, l + j);
		e.draw(canvas);
		e.setBounds(d);
		f2 = i1 / 2 + k;
		float f3 = j;
		float f4 = i;
		canvas.drawText(c, f2, (f1 + f3) - f4 - 1.0F, f);
	}

	public void a(String s) {
		c = s;
	}
}
