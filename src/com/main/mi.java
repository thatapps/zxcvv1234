package com.main;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class mi extends Drawable {

	public int a;
	public int b;
	public int c;
	private Paint d;
	private boolean e;
	private PorterDuffXfermode f;
	private Drawable g;
	private int h;

	public mi(int i, int j, int k, boolean flag, Drawable drawable) {
		d = new Paint(1);
		a = i;
		b = j;
		e = flag;
		d.setColor(k);
		h = Color.alpha(k);
		g = drawable;
		if (drawable != null) {
			drawable.setBounds(0, 0, drawable.getIntrinsicWidth(),
					drawable.getIntrinsicHeight());
		}
		try {
			f = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	public void draw(Canvas canvas) {
		if (b > 0) {
			Rect rect = getBounds();
			float f3 = ((float) Math.min(rect.width(), rect.height()) * 1.0F)
					/ (float) b;
			canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom,
					null, 31);
			d.setXfermode(null);
			float f1;
			float f4;
			if (e) {
				f1 = rect.left;
			} else {
				f1 = rect.right;
			}
			canvas.drawCircle(f1, rect.bottom, (float) b * f3, d);
			if (a > 0) {
				d.setXfermode(f);

				if (e) {
					f1 = rect.left;
				} else {
					f1 = rect.right;
				}
				canvas.drawCircle(f1, rect.bottom, (float) a * f3, d);
			}
			canvas.restore();
			if (g != null) {
				if (e) {
					f1 = 0.0F;
				} else {
					f1 = rect.right - g.getIntrinsicWidth();
				}
				f4 = rect.bottom - g.getIntrinsicHeight();
				canvas.save();
				if (f3 != 1.0F) {
					float f2;
					if (e) {
						f2 = rect.left;
					} else {
						f2 = rect.right;
					}
					canvas.scale(f3, f3, f2, rect.bottom);
				}
				canvas.translate(f1, f4);
				if (e) {
					f1 = c;
				} else {
					f1 = -c;
				}
				canvas.translate(f1, -c);
				if (!e) {
					canvas.scale(-1F, 1.0F, g.getIntrinsicWidth() / 2,
							g.getIntrinsicHeight() / 2);
				}
				g.draw(canvas);
				canvas.restore();
				return;
			}
		}
	}

	public int getIntrinsicHeight() {
		return b;
	}

	public int getIntrinsicWidth() {
		return b;
	}

	public int getOpacity() {
		return -3;
	}

	public void setAlpha(int i) {
		d.setAlpha((int) (((float) i / 255F) * (float) h));
	}

	public void setColorFilter(ColorFilter colorfilter) {
		d.setColorFilter(colorfilter);
	}
}
