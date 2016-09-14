package com.main;

import java.io.IOException;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class xh extends Drawable {

	private Drawable a;
	private CharSequence b;
	private Paint c;
	private int d;
	private int e;
	private int f;
	private float g;
	private float h;

	protected xh() {
	}

	private void a() {
		a(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
	}

	private void a(int i, int j, int k, int l) {
		Rect rect = new Rect();
		c.getTextBounds(b.toString(), 0, f, rect);
		g = (k - i - rect.width() >> 1) + i;
		h = l - (l - j - rect.height() >> 1);
	}

	protected void a(CharSequence charsequence, Drawable drawable, int i, int j) {
		b = charsequence;
		a = drawable;
		e = i;
		d = j;
		c = new Paint(7);
		c.setTextSize(d);
		c.setColor(e);
		f = charsequence.length();
		a();
	}

	public void applyTheme(android.content.res.Resources.Theme theme) {
		a.applyTheme(theme);
	}

	public boolean canApplyTheme() {
		return a.canApplyTheme();
	}

	public void clearColorFilter() {
		a.clearColorFilter();
	}

	public void draw(Canvas canvas) {
		a.draw(canvas);
		canvas.drawText(b, 0, f, g, h, c);
	}

	public int getAlpha() {
		return a.getAlpha();
	}

	public android.graphics.drawable.Drawable.Callback getCallback() {
		return a.getCallback();
	}

	public int getChangingConfigurations() {
		return a.getChangingConfigurations();
	}

	public ColorFilter getColorFilter() {
		return a.getColorFilter();
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState() {
		return a.getConstantState();
	}

	public Drawable getCurrent() {
		return a.getCurrent();
	}

	public Rect getDirtyBounds() {
		return a.getDirtyBounds();
	}

	public int getIntrinsicHeight() {
		return a.getIntrinsicHeight();
	}

	public int getIntrinsicWidth() {
		return a.getIntrinsicWidth();
	}

	public int getMinimumHeight() {
		return a.getMinimumHeight();
	}

	public int getMinimumWidth() {
		return a.getMinimumWidth();
	}

	public int getOpacity() {
		return a.getOpacity();
	}

	public void getOutline(Outline outline) {
		a.getOutline(outline);
	}

	public boolean getPadding(Rect rect) {
		return a.getPadding(rect);
	}

	public int[] getState() {
		return a.getState();
	}

	public Region getTransparentRegion() {
		return a.getTransparentRegion();
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser,
			AttributeSet attributeset) {
		try {
			a.inflate(resources, xmlpullparser, attributeset);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser,
			AttributeSet attributeset, android.content.res.Resources.Theme theme) {
		try {
			a.inflate(resources, xmlpullparser, attributeset, theme);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void invalidateSelf() {
		a.invalidateSelf();
	}

	public boolean isAutoMirrored() {
		return a.isAutoMirrored();
	}

	public boolean isStateful() {
		return a.isStateful();
	}

	public void jumpToCurrentState() {
		a.jumpToCurrentState();
	}

	public Drawable mutate() {
		return a.mutate();
	}

	public void scheduleSelf(Runnable runnable, long l) {
		a.scheduleSelf(runnable, l);
	}

	public void setAlpha(int i) {
		a.setAlpha(i);
	}

	public void setAutoMirrored(boolean flag) {
		a.setAutoMirrored(flag);
	}

	public void setBounds(int i, int j, int k, int l) {
		a.setBounds(i, j, k, l);
		a(i, j, k, l);
	}

	public void setBounds(Rect rect) {
		a.setBounds(rect);
	}

	public void setChangingConfigurations(int i) {
		a.setChangingConfigurations(i);
	}

	public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
		a.setColorFilter(i, mode);
	}

	public void setColorFilter(ColorFilter colorfilter) {
		a.setColorFilter(colorfilter);
	}

	public void setDither(boolean flag) {
		a.setDither(flag);
	}

	public void setFilterBitmap(boolean flag) {
		a.setFilterBitmap(flag);
	}

	public void setHotspot(float f1, float f2) {
		a.setHotspot(f1, f2);
	}

	public void setHotspotBounds(int i, int j, int k, int l) {
		a.setHotspotBounds(i, j, k, l);
	}

	public boolean setState(int ai[]) {
		return a.setState(ai);
	}

	public void setTint(int i) {
		a.setTint(i);
	}

	public void setTintList(ColorStateList colorstatelist) {
		a.setTintList(colorstatelist);
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode) {
		a.setTintMode(mode);
	}

	public boolean setVisible(boolean flag, boolean flag1) {
		return a.setVisible(flag, flag1);
	}

	public void unscheduleSelf(Runnable runnable) {
		a.unscheduleSelf(runnable);
	}
}
