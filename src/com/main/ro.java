package com.main;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;

import com.lazyswipe.tile.light.LedLightCameraActivity;

public class ro extends rn implements Camera.PreviewCallback,
		SurfaceHolder.Callback {
	public static boolean a = false;
	private Camera b;
	private boolean c = false;
	private SurfaceView d;
	private FrameLayout e;
	private Camera.Size f;
	private int g = 0;
	private String h;
	private String i;
	private String j;
	private final Context k;
	private rp l;

	public ro(Context context) {
		this.k = context;
	}

	private boolean f() {
		if (this.b == null) {
			return false;
		}
		this.b.setPreviewCallback((Camera.PreviewCallback) this);
		Camera.Parameters parameters = this.b.getParameters();
		if (this.g > 0) {
			parameters.setPreviewFrameRate(this.g);
		}
		parameters.setPreviewSize(this.f.width, this.f.height);
		parameters.setFlashMode(this.j);
		parameters.setFocusMode("infinity");
		try {
			this.b.setParameters(parameters);
		} catch (Exception var2_2) {
			vj.c("Swipe.Light", "Failed to set camera parameters [flash mode="
					+ this.j + ",focus mode=" + "infinity" + ",preview size="
					+ this.f.width + "*" + this.f.height + "]. "
					+ "Try again with focus mode " + this.h);
			parameters.setFocusMode(this.h);
			try {
				this.b.setParameters(parameters);
			} catch (Exception var3_3) {
				vj.c("Swipe.Light", "Failed to set camera parameters again");
			}
		}
		this.b.startPreview();
		this.l = new rp(this.k, this.b);
		if (this.g()) {
			this.h();
		}
		return true;
	}

	private boolean g() {
		if (!to.f()) {
			return true;
		}
		return false;
	}

	private void h() {
		this.d = new SurfaceView(this.k);
		this.d.setBackgroundColor(0);
		this.d.getHolder().setType(3);
		this.d.getHolder().setSizeFromLayout();
		this.d.getHolder().addCallback((SurfaceHolder.Callback) this);
		LedLightCameraActivity.c();
		LedLightCameraActivity.a = this.d;
		Intent intent = new Intent(this.k, (Class) LedLightCameraActivity.class);
		intent.addFlags(1048576);
		intent.addFlags(268435456);
		this.k.startActivity(intent);
	}

	private void i() {
		if (this.d == null) {
			return;
		}
		if (this.e != null) {
			this.e.removeView((View) this.d);
		}
		this.d.getHolder().removeCallback((SurfaceHolder.Callback) this);
		this.d = null;
	}

	private boolean j() {
		return false;
	}

	public void a(FrameLayout frameLayout) {
		this.i();
		this.e = frameLayout;
	}

	public boolean a() {
		List list;
		int n;
		Iterator iterator;
		try {
			if (this.j()) {
				return false;
			}
			this.b = Camera.open();
			if (this.b == null) {
				vj.c("Swipe.Light",
						"light camera is not available cannot get a camera");
				return false;
			}
			Camera.Parameters parameters = this.b.getParameters();
			List list2 = parameters.getSupportedFlashModes();
			if (list2 == null) {
				return false;
			}
			this.j = (String) vk.a((Collection) list2, "torch", "on");
			list2.clear();
			if (this.j == null) {
				this.b.release();
				this.b = null;
				vj.c("Swipe.Light", "light camera is not available have no led");
				return false;
			}
			this.i = parameters.getFlashMode();
			parameters.setFlashMode(this.j);
			this.h = parameters.getFocusMode();
			this.g = parameters.getPreviewFrameRate();
			List list3 = parameters.getSupportedPreviewFrameRates();
			if (list3 == null) {
				vj.c("Swipe.Light",
						"light camera is not available have no frameRates");
				this.b.release();
				this.b = null;
				return false;
			}
			list3.clear();
			List list4 = parameters.getSupportedPreviewSizes();
			if (list4 == null) {
				vj.b("Swipe.Light", "getSupportedPreviewSizes returned NULL!");
				List list5 = parameters.getSupportedPictureSizes();
				if (list5 == null) {
					vj.b("Swipe.Light",
							"getSupportedPictureSizes returned NULL!");
					this.b.release();
					this.b = null;
					return false;
				}
				this.f = parameters.getPictureSize();
				list = list5;
			} else {
				this.f = parameters.getPreviewSize();
				list = list4;
			}
			n = this.f.height;
			iterator = list.iterator();
		} catch (Exception var1_11) {
			vj.b("Swipe.Light", "light camera is not available with: ",
					(Throwable) var1_11);
			if (this.b != null) {
				this.b.release();
				this.b = null;
			}
			return false;
		}
		do {
			int n2;
			if (!iterator.hasNext()) {
				list.clear();
				a = false;
				this.b.setPreviewCallback((Camera.PreviewCallback) this);
				return true;
			}
			Camera.Size size = (Camera.Size) iterator.next();
			if (size.height < n) {
				this.f = size;
				n2 = this.f.height;
			} else {
				n2 = n;
			}
			n = n2;
		} while (true);
	}

	public boolean b() {
		return this.c;
	}

	public void c() {
		if ((this.c) && (!to.p())) {
			e();
		}
		if (this.d != null) {
			i();
		}
		LedLightCameraActivity.b();
		if (this.b != null) {
			this.b.setPreviewCallback(null);
		}
		try {
			this.b.setPreviewDisplay(null);
		} catch (IOException localIOException) {

			vj.b("Swipe.Light", "mCamera setPreviewDisplay exception",
					localIOException);
			this.b.release();
			this.b = null;

		} finally {
			this.b.release();
			this.b = null;
		}
		this.d = null;
	}

	public void d() {
		if (!this.c) {
			this.c = f();
		}
	}

	public void e() {
		if (this.c) {
		}
		try {
			Camera.Parameters localParameters = this.b.getParameters();
			localParameters.setFlashMode(this.i);
			this.b.setParameters(localParameters);
			if (this.l != null) {
				this.l.b();
				this.l = null;
			}
			this.b.stopPreview();
			this.c = false;
			a = false;
			return;
		} catch (Exception localException) {
			for (;;) {
			}
		}
	}

	public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera) {
		if (LedLightCameraActivity.a()) {
			this.b.setPreviewCallback(null);
		}
	}

	public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1,
			int paramInt2, int paramInt3) {
	}

	public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {
		try {
			this.b.setPreviewDisplay(paramSurfaceHolder);
			return;
		} catch (IOException localIOException) {
			for (;;) {
				vj.b("Swipe.Light", "mCamera setPreviewDisplay exception",
						localIOException);
			}
		}
	}

	public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {
	}
}
