package com.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class vz extends RelativeLayout implements
		android.widget.SeekBar.OnSeekBarChangeListener {

	private static final String e = (new StringBuilder()).append("Swipe.")
			.append(vz.class.getSimpleName()).toString();
	protected SeekBar a;
	protected int b;
	public int c;
	protected int d;
	private boolean f;
	private android.widget.SeekBar.OnSeekBarChangeListener g;

	public vz(Context context) {
		this(context, null);
	}

	public vz(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public vz(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
		a(context, attributeset, i, 0);
	}

	@SuppressLint("NewApi") public vz(Context context, AttributeSet attributeset, int i, int j) {
		super(context, attributeset, i, j);
		a(context, attributeset, i, j);
	}

	private void a(int i, boolean flag) {
		int j = i;
		if (i > c) {
			j = c;
		}
		i = j;
		if (j < d) {
			i = d;
		}
		if (i != b) {
			b = i;
			a.setProgress(b - d);
			if (g != null) {
				g.onProgressChanged(a, i, true);
			}
		}
	}

	private void a(Context context, AttributeSet attributeset, int i, int j) {
		a();
	}

	private void a(SeekBar seekbar, int i, boolean flag) {
		int k = getFragmentCount() - 1;
		int j = i;
		if (k > 1) {
			j = (int) (((float) (int) ((((float) i * 1.0F) / (float) c)
					* (float) k + 0.5F) * 1.0F * (float) c)
					/ (float) k + 0.5F);
			seekbar.setProgress(j);
		}
		if (j != b) {
			a(j, false);
		}
	}

	public void a() {
		c = 100;
		d = 0;
		b = 0;
	}

	public void a(View view) {
		addView(view, 0);
		a.bringToFront();
	}

	public int getFragmentCount() {
		return 0;
	}

	public int getProgress() {
		return b;
	}

	public SeekBar getSeekBar() {
		return a;
	}

	public void onFinishInflate() {
		super.onFinishInflate();
		a = (SeekBar) findViewById(0x7f0c00c0);
		a.setOnSeekBarChangeListener(this);
		a.setMax(c - d);
		a.setProgress(b - d);
	}

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag) {
		if (flag && !f) {
			a(seekbar, i, flag);
		}
	}

	public void onStartTrackingTouch(SeekBar seekbar) {
		f = true;
		if (g != null) {
			g.onStartTrackingTouch(seekbar);
		}
	}

	public void onStopTrackingTouch(SeekBar seekbar) {
		f = false;
		if (seekbar.getProgress() != b - d) {
			a(seekbar, seekbar.getProgress(), true);
		}
		if (g != null) {
			g.onStopTrackingTouch(seekbar);
		}
	}

	public void setOnSeekBarChangeListener(
			android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener) {
		g = onseekbarchangelistener;
	}

	public void setProgress(int i) {
		a(i, true);
	}

}
