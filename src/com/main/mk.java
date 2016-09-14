package com.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

import com.lazyswipe.zev.R;

public class mk extends Drawable {
	private static boolean c = true;
	int a;
	int b;
	private Path[] d = new Path[3];
	private Paint[] e = new Paint[3];
	private boolean f = true;
	private Paint g;

	// public mk(Context context) {
	// this.b = this.a = context.getResources().getDimensionPixelSize(
	// R.dimen.fan_bg_settings_size);
	// int[] arrn = new int[] { ox.a(R.attr.fanSettingBtnBackgroundColor),
	// ox.a(R.attr.fanSettingBtnBackgroundColorMiddle),
	// ox.a(R.attr.fanSettingBtnBackgroundColorTop) };
	// int n = ox.a(R.attr.fanSettingBtnShadowColor);
	// boolean bl = n != 0;
	// if (bl) {
	// this.b = vk.a(context, 25.0f) + this.b;
	// }
	// for (int i = 0; i < 3; ++i) {
	// Paint paint = new Paint(1);
	// paint.setColor(arrn[i]);
	// this.e[i] = paint;
	// }
	// Path path = new Path();
	// path.addCircle(0.0f, (float) this.b, (float) this.a, Path.Direction.CW);
	// path.close();
	// this.d[0] = path;
	// if (!c) {
	// int n2 = this.a >> 1;
	// Path path2 = new Path();
	// path2.addCircle((float) (-n2), (float) this.b,
	// (float) Math.sqrt((double) (n2 * n2 + this.a * this.a))
	// - (float) vk.a(context, 2.0f), Path.Direction.CW);
	// this.d[1] = path2;
	// Path path3 = new Path();
	// path3.addCircle(0.0f, (float) this.b, (float) n2, Path.Direction.CW);
	// path3.close();
	// this.d[2] = path3;
	// }
	// if (bl) {
	// this.g = new Paint(7);
	// float f = this.b;
	// float f2 = this.b;
	// int[] arrn2 = new int[] {
	// 0,
	// 0,
	// n,
	// Color.argb((int) 34, (int) Color.red((int) n),
	// (int) Color.green((int) n),
	// (int) Color.blue((int) n)), 0, 0 };
	// float[] arrf = new float[] {
	// 0.0f,
	// (float) (-1 + this.a) / (float) this.b,
	// (float) this.a / (float) this.b,
	// (float) (0.99 + (double) ((float) this.a / (float) this.b)) / 2.0f,
	// 0.99f, 1.0f };
	// RadialGradient radialGradient = new RadialGradient(0.0f, f, f2,
	// arrn2, arrf, Shader.TileMode.CLAMP);
	// this.g.setShader((Shader) radialGradient);
	// }
	// }
	public mk(Context context) {
		d = new Path[3];
		e = new Paint[3];
		f = true;
		a = context.getResources().getDimensionPixelSize(0x7f0b001f);
		b = a;
		int i1 = ox.a(0x7f01001a);
		int j1 = ox.a(0x7f01001e);
		int k1 = ox.a(0x7f01001f);
		int l = ox.a(0x7f010020);
		boolean flag;
		if (l != 0) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			b = vk.a(context, 25F) + b;
		}
		for (int j = 0; j < 3; j++) {
			Paint paint = new Paint(1);
			paint.setColor((new int[] { i1, j1, k1 })[j]);
			e[j] = paint;
		}

		Path path = new Path();
		path.addCircle(0.0F, b, a, android.graphics.Path.Direction.CW);
		path.close();
		d[0] = path;
		if (!c) {
			int k = a >> 1;
			Path path1 = new Path();
			path1.addCircle(-k, b, (float) Math.sqrt(k * k + a * a)
					- (float) vk.a(context, 2.0F),
					android.graphics.Path.Direction.CW);
			d[1] = path1;
			Path path2 = new Path();
			path2.addCircle(0.0F, b, k, android.graphics.Path.Direction.CW);
			path2.close();
			d[2] = path2;
		}
		if (flag) {
			g = new Paint(7);
			float f1 = b;
			float f2 = b;
			int i = Color.argb(34, Color.red(l), Color.green(l), Color.blue(l));
			float f3 = (float) (a - 1) / (float) b;
			float f4 = (float) a / (float) b;
			float f5 = (float) ((double) ((float) a / (float) b) + 0.98999999999999999D) / 2.0F;
			TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
			RadialGradient gradient = new RadialGradient(0.0F, f1, f2,
					new int[] { 0, 0, l, i, 0, 0 }, new float[] { 0.0F, f3, f4,
							f5, 0.99F, 1.0F }, tileMode);
			g.setShader(gradient);
		}
	}

	public void a(boolean paramBoolean) {
		if (this.f != paramBoolean) {
			this.f = paramBoolean;
		}
	}

	public void draw(Canvas canvas) {
		if (this.f) {
			if (this.g != null) {
				canvas.setDrawFilter((DrawFilter) new PaintFlagsDrawFilter(0, 7));
				canvas.drawCircle(0.0f, (float) this.b, (float) this.b, this.g);
			}
			boolean bl = c;
			if (bl) {
				canvas.drawPath(this.d[0], this.e[0]);
				return;
			}
			for (int i = 0; i < 3; ++i) {
				canvas.drawPath(this.d[i], this.e[i]);
			}
		}
	}

	public int getIntrinsicHeight() {
		return this.b;
	}

	public int getIntrinsicWidth() {
		return this.b;
	}

	public int getOpacity() {
		return -3;
	}

	public void setAlpha(int paramInt) {
	}

	public void setColorFilter(ColorFilter paramColorFilter) {
	}
}
