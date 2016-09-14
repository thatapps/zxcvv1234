package com.main;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;

public class rr extends rn implements Camera.AutoFocusCallback,
		Handler.Callback {
	private Camera a;
	private boolean b = false;
	private Handler c;

	public rr(Context context) {
		this.c = new Handler((Handler.Callback) this);
	}

	private void e() {
		if (this.a != null) {
			Camera.Parameters parameters = this.a.getParameters();
			parameters.setFlashMode("on");
			this.a.setParameters(parameters);
			this.a.cancelAutoFocus();
			this.a.stopPreview();
			this.a.startPreview();
			parameters.setFlashMode("on");
			this.a.setParameters(parameters);
			this.c.sendEmptyMessageDelayed(1, 100);
		}
	}

	private void f() {
		if (!this.b) {
			this.a = Camera.open();
			Camera.Parameters parameters = this.a.getParameters();
			parameters.setFlashMode("on");
			this.a.startPreview();
			this.a.stopPreview();
			this.a.setParameters(parameters);
			this.a.startPreview();
			this.a.autoFocus((Camera.AutoFocusCallback) this);
			this.b = true;
		}
	}

	private void g() {
		if (!this.b) {
			this.a = Camera.open();
			Camera.Parameters parameters = this.a.getParameters();
			parameters.setFlashMode("on");
			this.a.cancelAutoFocus();
			this.a.startPreview();
			this.a.stopPreview();
			this.a.setParameters(parameters);
			this.a.startPreview();
			this.a.autoFocus((Camera.AutoFocusCallback) this);
			this.c.sendEmptyMessageDelayed(0, 100);
			this.b = true;
		}
	}

	public boolean a() {
		return true;
	}

	public boolean b() {
		return this.b;
	}

	public void c() {
		if (this.a != null) {
			if (to.m()) {
				this.e();
			}
		} else {
			return;
		}
		this.a.release();
		this.a = null;
	}

	public void d() {
		if (to.n() || to.s() || to.e()) {
			this.f();
			return;
		}
		this.g();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public boolean handleMessage(Message message) {
		switch (message.what) {
		case 0: {
			if (this.a == null)
				return true;
			Camera.Parameters parameters = this.a.getParameters();
			parameters.setFlashMode("off");
			this.a.setParameters(parameters);
		}
		default: {
			return true;
		}
		case 1:
		
		this.a.autoFocus((Camera.AutoFocusCallback) this);
		Camera.Parameters parameters = this.a.getParameters();
		parameters.setFlashMode("on");
		this.a.setParameters(parameters);
		this.a.stopPreview();
		this.a.release();
		this.a = null;
		this.b = false;
		}
		return true;
	}

	public void onAutoFocus(boolean bl, Camera camera) {
		if (camera != null && this.b && (to.l() || to.m())) {
			camera.autoFocus((Camera.AutoFocusCallback) this);
		}
	}
}
