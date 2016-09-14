package com.main;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import java.util.Calendar;

public class rw {

	static final float a[] = { 0.0F, 0.25F, 0.5F, 0.75F, 1.0F };
	static final float b[] = { 0.0F, 0.33F, 0.67F, 1.0F };

	public static Drawable a(final int i) {
		android.graphics.drawable.ShapeDrawable.ShaderFactory shaderfactory = new android.graphics.drawable.ShapeDrawable.ShaderFactory() {

			final int a;

			public Shader resize(int j, int k) {
				int ai[] = rw.a();
				float f = a;
				float af[];
				if (ai.length == 5) {
					af = rw.a;
				} else {
					af = rw.b;
				}
				return new LinearGradient(0.0F, 0.0F, 0.0F, f, ai, af,
						android.graphics.Shader.TileMode.REPEAT);
			}

			{
				a = i;
				// super();
			}
		};
		PaintDrawable paintdrawable = new PaintDrawable();
		paintdrawable.setShape(new RectShape());
		paintdrawable.setShaderFactory(shaderfactory);
		return paintdrawable;
	}

	static int[] a() {
		return b(Calendar.getInstance().get(11));
	}

	static int[] b(int i) {
		if (i < 3) {
			return (new int[] { Color.parseColor("#071e2e"),
					Color.parseColor("#122948"), Color.parseColor("#1c3460"),
					Color.parseColor("#253e76"), Color.parseColor("#2f488c") });
		}
		if (i < 6) {
			return (new int[] { Color.parseColor("#071e2e"),
					Color.parseColor("#0c2a3a"), Color.parseColor("#123647"),
					Color.parseColor("#2a3d40"), Color.parseColor("#444538") });
		}
		if (i < 7) {
			return (new int[] { Color.parseColor("#08154c"),
					Color.parseColor("#36186e"), Color.parseColor("#452e98"),
					Color.parseColor("#2a6bce"), Color.parseColor("#009ece") });
		}
		if (i < 8) {
			return (new int[] { Color.parseColor("#45104e"),
					Color.parseColor("#334064"), Color.parseColor("#266273"),
					Color.parseColor("#11998c"), Color.parseColor("#37cb8d") });
		}
		if (i < 9) {
			return (new int[] { Color.parseColor("#004567"),
					Color.parseColor("#005973"), Color.parseColor("#00818c"),
					Color.parseColor("#dbcc93"), Color.parseColor("#fbf593") });
		}
		if (i < 12) {
			return (new int[] { Color.parseColor("#004a6a"),
					Color.parseColor("#1b7f9f"), Color.parseColor("#7dc5b8"),
					Color.parseColor("#e0df97") });
		}
		if (i < 15) {
			return (new int[] { Color.parseColor("#157494"),
					Color.parseColor("#218bab"), Color.parseColor("#34b2d1"),
					Color.parseColor("#91d5e6"), Color.parseColor("#ceecf4") });
		}
		if (i < 18) {
			return (new int[] { Color.parseColor("#004a6a"),
					Color.parseColor("#1b7f9f"), Color.parseColor("#7dc5b8"),
					Color.parseColor("#e0df97") });
		}
		if (i < 19) {
			return (new int[] { Color.parseColor("#00255f"),
					Color.parseColor("#005368"), Color.parseColor("#008b72"),
					Color.parseColor("#6f9f72"), Color.parseColor("#ffb973") });
		}
		if (i < 20) {
			return (new int[] { Color.parseColor("#1e0661"),
					Color.parseColor("#452d83"), Color.parseColor("#7b508d"),
					Color.parseColor("#b36141"), Color.parseColor("#e1a74c") });
		}
		if (i < 21) {
			return (new int[] { Color.parseColor("#38398a"),
					Color.parseColor("#634d98"), Color.parseColor("#8f61a6"),
					Color.parseColor("#b971ab"), Color.parseColor("#e582b1") });
		} else {
			return (new int[] { Color.parseColor("#071e2e"),
					Color.parseColor("#0d2a3b"), Color.parseColor("#123647"),
					Color.parseColor("#094056"), Color.parseColor("#004a65") });
		}
	}

}
