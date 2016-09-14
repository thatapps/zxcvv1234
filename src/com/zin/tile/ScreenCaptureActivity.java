/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.hardware.display.VirtualDisplay
 *  android.hardware.display.VirtualDisplay$Callback
 *  android.media.ImageReader
 *  android.media.ImageReader$OnImageAvailableListener
 *  android.media.projection.MediaProjection
 *  android.media.projection.MediaProjectionManager
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.KeyEvent
 *  android.view.Surface
 *  android.view.WindowManager
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.lazyswipe.tile;

import java.io.FileOutputStream;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;

import com.main.qv;
import com.main.tq;
import com.main.vj;

/*
 * Failed to analyse overrides
 */
@TargetApi(value = 21)
public class ScreenCaptureActivity extends Activity implements
		ImageReader.OnImageAvailableListener {
	private MediaProjectionManager a;
	private MediaProjection b;
	private int c;
	private int d;
	private boolean e;

	public static void a(Context context) {
		context.startActivity(new Intent(context,
				(Class) ScreenCaptureActivity.class).addFlags(268435456));
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void onActivityResult(int n, int n2, Intent intent) {
		if (n == 1) {
			this.b = this.a.getMediaProjection(n2, intent);
			if (this.b != null) {
				DisplayMetrics displayMetrics = this.getResources()
						.getDisplayMetrics();
				Display display = this.getWindowManager().getDefaultDisplay();
				Point point = new Point();
				display.getSize(point);
				this.c = point.x;
				this.d = point.y;
				ImageReader imageReader = ImageReader.newInstance((int) this.c,
						(int) this.d, (int) 1, (int) 1);
				this.b.createVirtualDisplay("screen_capture", this.c, this.d,
						displayMetrics.densityDpi, 16,
						imageReader.getSurface(), null, null);
				imageReader.setOnImageAvailableListener(
						(ImageReader.OnImageAvailableListener) this, null);
			} else {
				this.finish();
			}
		}
		super.onActivityResult(n, n2, intent);
	}

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		this.e = false;
		this.a = (MediaProjectionManager) this
				.getSystemService("media_projection");
		this.startActivityForResult(this.a.createScreenCaptureIntent(), 1);
	}

	/*
	 * Exception decompiling
	 */
	public void onImageAvailable(ImageReader imagereader) {
		Object obj2;
		String s;
		s = null;
		obj2 = null;
		if (e) {
			Log.w("Swipe.ScreenCapture", "Duplicate screenshots captured?!");
			finish();
			return;
		}
		Image image = imagereader.acquireLatestImage();
		Object obj1;
		Object obj;
		Exception exception1;
		try {
			obj = image.getPlanes()[0];
			int j = ((android.media.Image.Plane) (obj)).getPixelStride();
			int k = ((android.media.Image.Plane) (obj)).getRowStride();
			int l = c;
			int i = c;
			j = (k - l * j) / j;
			obj1 = ((android.media.Image.Plane) (obj)).getBuffer().rewind();
			obj = Bitmap.createBitmap(j + i, d,
					android.graphics.Bitmap.Config.ARGB_8888);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			obj = null;
			/* Loop/switch isn't completed */
		} finally {
			obj1 = null;
			obj2 = s;
			/* Loop/switch isn't completed */
		}
		try {

			((Bitmap) (obj)).copyPixelsFromBuffer(((java.nio.Buffer) (obj1)));
			s = qv.n();
			obj1 = new FileOutputStream(s);
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			// continue; /* Loop/switch isn't completed */
		} finally {
			obj1 = null;
			obj2 = obj;
			// obj = exception;
			// continue; /* Loop/switch isn't completed */
		}
		((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG,
				100, ((java.io.OutputStream) (obj1)));
		e = true;
		qv.a(this, s);
		if (obj1 != null) {
			tq.a(((java.io.Closeable) (obj1)));
		}
		if (obj != null) {
			((Bitmap) (obj)).recycle();
		}
		if (imagereader != null) {
			imagereader.close();
		}
		b.stop();

		vj.a("Swipe.ScreenCapture", "Failed to save screenshots",
				((Throwable) (obj1)));
		qv.f(this);
		if (obj2 != null) {
			tq.a(((java.io.Closeable) (obj2)));
		}
		if (obj != null) {
			((Bitmap) (obj)).recycle();
		}
		if (imagereader != null) {
			imagereader.close();
		}
		b.stop();

		if (obj1 != null) {
			tq.a(((java.io.Closeable) (obj1)));
		}
		if (obj2 != null) {
			((Bitmap) (obj2)).recycle();
		}
		if (imagereader != null) {
			imagereader.close();
		}
		b.stop();
		finish();

	}

	public boolean onKeyUp(int n, KeyEvent keyEvent) {
		this.finish();
		return super.onKeyUp(n, keyEvent);
	}
}
