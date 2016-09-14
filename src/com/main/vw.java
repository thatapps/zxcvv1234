package com.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;

public class vw extends Thread {
	private Context a;
	private vv b;
	private vp c;
	private Handler d;
	private boolean e = false;

	public vw(Context context, File file, String string, String string2,
			Handler handler, vv vv) {
		this.a = context;
		this.b = vv;
		this.d = handler;
		this.c = new vp();
		this.c.f = file;
		this.c.c = string;
		this.c.h = string2;
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private static String a(String string) {
		int n;
		String string2;
		try {
			string2 = string.trim().toLowerCase(Locale.ENGLISH);
			n = string2.indexOf(59);
			if (n == -1)
				return string2;
		} catch (NullPointerException var1_4) {
			return null;
		}
		String string3 = string2.substring(0, n);
		return string3;
	}

	private HttpResponse a(HttpClient httpClient, HttpGet httpGet) {
		HttpResponse httpResponse = this.b(httpClient, httpGet);
		int n = httpResponse.getStatusLine().getStatusCode();
		if (this.a(httpResponse)) {
			return httpResponse;
		}
		if (301 == n || 302 == n) {
			this.a(httpClient, httpResponse);
			return null;
		}
		if (416 == n) {
			if (this.c.h != null && vy.a(this.c.f, this.c.h)) {
				this.c.d();
				return null;
			}
			Log.i((String) "Swipe..DownloadManager",
					(String) "debug operation\uff1adownload new file");
			tq.b(this.c.f);
			return null;
		}
		Log.e((String) "Swipe..DownloadManager",
				(String) ("response statuc code:" + n));
		try {
			throw new vx(3, null);
		} catch (vx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return httpResponse;
	}

	private void a(int paramInt) {
		Bundle localBundle = new Bundle();
		localBundle.putInt("errorNo", paramInt);
		Message localMessage = vk.a(this.d, 4, localBundle, null);
		this.d.sendMessage(localMessage);
	}

	private void a(HttpClient httpClient, HttpResponse httpResponse) {
		Header header = httpResponse.getFirstHeader("Location");
		if (header == null) {
			try {
				throw new vx(3, null);
			} catch (vx e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			URI uRI = new URI(this.b.a()).resolve(new URI(header.getValue()));
			this.c.d = uRI.toString();
		} catch (URISyntaxException var4_5) {
			Log.e((String) "Swipe..DownloadManager",
					(String) ("Couldn't resolve redirect URI "
							+ header.getValue() + " for " + this.b.a()));
			try {
				throw new vx(4, (Throwable) var4_5);
			} catch (vx e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			throw new vx(4, null);
		} catch (vx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void a(byte[] arrby, int n) {
		this.c.a(arrby, 0, n);
		return;
	}

	private boolean a(HttpResponse httpResponse) {
		int n;
		if (httpResponse == null
				|| 200 != (n = httpResponse.getStatusLine().getStatusCode())
				&& 206 != n) {
			return false;
		}
		return true;
	}

	private HttpResponse b(HttpClient httpClient, HttpGet httpGet) {

		HttpResponse httpResponse = null;
		try {
			httpResponse = httpClient.execute((HttpUriRequest) httpGet);
			return httpResponse;
		} catch (ClientProtocolException var5_4) {
			try {
				throw new vx(2, (Throwable) var5_4);
			} catch (vx e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception var3_5) {
			Log.e((String) "Swipe..DownloadManager", (String) ("connecting to "
					+ (Object) httpGet.getURI() + " failed! "),
					(Throwable) var3_5);
			try {
				throw new vx(3, (Throwable) var3_5);
			} catch (vx e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return httpResponse;
	}

	private void b(HttpResponse paramHttpResponse) {
		c(paramHttpResponse);
		e(paramHttpResponse);
	}

	private void c() {
		boolean bl = !TextUtils.isEmpty((CharSequence) this.c.k.c)
				&& this.c.f.length() != this.c.g;
		if (!bl) {
			if (this.c.h == null)
				return;
			boolean bl2 = vy.a(this.c.f, this.c.h);
			boolean bl3 = false;
			if (bl2)
				return;
			if (bl3) {
				return;
			}
			Log.e((String) "Swipe..DownloadManager",
					(String) ("file mismatch! check sum result:" + bl3));
		} else {
			Log.e((String) "Swipe..DownloadManager",
					(String) ("file mismatch! excepted size:" + this.c.g
							+ ", actual size:" + this.c.f.length()));
		}
		tq.b(this.c.f);

	}

	private void c(HttpResponse httpResponse) {
		Header header;
		Header header2;
		Header header3;
		Header header4;
		Header header5 = httpResponse.getFirstHeader("Content-Disposition");
		if (header5 != null) {
			this.c.k.d = header5.getValue();
		}
		if ((header4 = httpResponse.getFirstHeader("Content-Location")) != null) {
			this.c.k.e = header4.getValue();
		}
		if (this.c.k.b == null
				&& (header = httpResponse.getFirstHeader("Content-Type")) != null) {
			this.c.k.b = vw.a(header.getValue());
		}
		if ((header2 = httpResponse.getFirstHeader("ETag")) != null) {
			this.c.k.a = header2.getValue();
		}
		String string = (header3 = httpResponse
				.getFirstHeader("Transfer-Encoding")) != null ? header3
				.getValue() : null;
		if (string == null) {
			this.d(httpResponse);
		}
		if (this.c.k.c != null || string != null
				&& string.equalsIgnoreCase("chunked"))
			return;
		{
			boolean bl = true;
			if (!bl)
				return;
			{

			}
		}
	}

	private void d() {
	}

	private void d(HttpResponse httpResponse) {
		Header header = httpResponse.getFirstHeader("Content-Length");
		if (header == null)
			return;
		{
			this.c.k.c = header.getValue();
			int n = httpResponse.getStatusLine().getStatusCode();
			if (n == 200) {
				tq.b(this.c.f);
				this.c.g = Long.parseLong((String) this.c.k.c);
				return;
			} else {
				if (n != 206)
					return;
				{
					this.c.g = Long.parseLong((String) this.c.k.c) + this.c.j;
					return;
				}
			}
		}
	}

	private void e(HttpResponse var1_1) {
		if (!this.c.f.exists()) {
			if (!this.c.f.getParentFile().exists()) {
				this.c.f.getParentFile().mkdirs();
			}
			try {
				this.c.f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		InputStream var3_2 = null;
		try {
			var3_2 = var1_1.getEntity().getContent();
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] var4_3 = new byte[2048];
		do {
			if (this.b()) {
				return;
			}
			try {
				int var7_4 = var3_2.read(var4_3);
				if (var7_4 != -1) {
					this.a(var4_3, var7_4);
					this.d();
				}
			}

			catch (Exception var5_7) {
				Log.e((String) "Swipe..DownloadManager",
						(String) "read data error", (Throwable) var5_7);

			}

			this.c.d();
			this.d();
			this.c();
			return;
		} while (true);

	}

	public int a() {
		if (!(this.c.f != null && this.c.f.exists() && this.c.g != 0)) {
			return 0;
		}
		if (this.c.f.length() > this.c.g) {
			Log.i((String) "Swipe..DownloadManager",
					(String) "downloaded File is larger than given size");
			return 100;
		}
		return (int) (100 * this.c.f.length() / this.c.g);
	}

	public boolean b() {
		return this.e;
	}

	public void run() {
		Object obj1 = null;
		if (uj.e(a)) {
			Object obj;
			d.sendEmptyMessage(1);
			obj = obj1;
			if (!c.f.exists()) {
				/* Loop/switch isn't completed */
			}
			obj = obj1;
			if (c.h == null) {
				/* Loop/switch isn't completed */
			}
			obj = obj1;
			if (!vy.a(c.f, c.h)) {
				/* Loop/switch isn't completed */
			}
			obj = obj1;
			c.d();
			obj = obj1;
			d.sendEmptyMessage(3);
			d.sendEmptyMessage(5);
			if (false) {
				throw new NullPointerException();
			}
			if (c.i != null) {
				try {
					c.f();
					return;
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					Log.e("Swipe..DownloadManager", "close stream error",
							((Throwable) (obj)));
				}
				return;
			}

		} else {
			a(3);
		}

		Object obj;
		d.sendEmptyMessage(1);
		obj = obj1;
		if (!c.f.exists()) {
			/* Loop/switch isn't completed */
		}
		obj = obj1;
		if (c.h == null) {
			/* Loop/switch isn't completed */
		}
		obj = obj1;
		if (!vy.a(c.f, c.h)) {
			/* Loop/switch isn't completed */
		}
		obj = obj1;
		c.d();
		obj = obj1;
		d.sendEmptyMessage(3);
		d.sendEmptyMessage(5);
		if (false) {
			throw new NullPointerException();
		}
		if (c.i != null) {
			try {
				c.f();
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe..DownloadManager", "close stream error",
						((Throwable) (obj)));
			}
			return;
		}

		// _L3:
		obj = obj1;
		android.os.PowerManager.WakeLock wakelock = ((PowerManager) a
				.getSystemService("power")).newWakeLock(1,
				"Swipe..DownloadManager");
		obj = wakelock;
		wakelock.acquire();
		obj = wakelock;
		HttpClient httpclient = su.a();
		// _L10:
		obj = wakelock;
		if (!c.e()) {
			// break MISSING_BLOCK_LABEL_252;
		}
		obj = wakelock;
		d.sendEmptyMessage(3);
		d.sendEmptyMessage(5);
		if (wakelock != null) {
			wakelock.release();
		}
		if (c.i != null) {
			try {
				c.f();
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe..DownloadManager", "close stream error",
						((Throwable) (obj)));
			}
			return;
		}

		if (!c.b()) {

		}

		a(3);
		d.sendEmptyMessage(5);
		if (wakelock != null) {
			wakelock.release();
		}
		if (c.i != null) {
			try {
				c.f();
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe..DownloadManager", "close stream error",
						((Throwable) (obj)));
			}
			return;
		}

		obj = wakelock;
		if (!c.c()) {
			// break MISSING_BLOCK_LABEL_384;
		}
		obj = wakelock;
		a(3);
		d.sendEmptyMessage(5);
		if (wakelock != null) {
			wakelock.release();
		}
		if (c.i != null) {
			try {
				c.f();
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe..DownloadManager", "close stream error",
						((Throwable) (obj)));
			}
			return;
		}

		obj = wakelock;
		if (!b()) {
			// break MISSING_BLOCK_LABEL_452;
		}
		obj = wakelock;
		d.sendEmptyMessage(6);
		d.sendEmptyMessage(5);
		if (wakelock != null) {
			wakelock.release();
		}
		if (c.i != null) {
			try {
				c.f();
				return;
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe..DownloadManager", "close stream error",
						((Throwable) (obj)));
			}
			return;
		}

		obj = wakelock;
		if (c.e != 2) {

			obj = wakelock;
			obj1 = b.a(a, c);

			obj = wakelock;
			a(3);
			d.sendEmptyMessage(5);
			if (wakelock != null) {
				wakelock.release();
			}
			if (c.i != null) {
				try {
					c.f();
					return;
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					Log.e("Swipe..DownloadManager", "close stream error",
							((Throwable) (obj)));
				}
				return;
			}

			else {
				obj = wakelock;
				obj1 = b.a(a, c, c.d);

			}

			if (obj1 != null) {
				// break; /* Loop/switch isn't completed */
			}
			obj = wakelock;
			d.sendEmptyMessage(3);
			d.sendEmptyMessage(5);
			if (wakelock != null) {
				wakelock.release();
			}
			if (c.i != null) {
				try {
					c.f();
					return;
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					Log.e("Swipe..DownloadManager", "close stream error",
							((Throwable) (obj)));
				}
				return;
			}

			obj = wakelock;
			obj1 = a(httpclient, ((HttpGet) (obj1)));
			if (obj1 == null) {

			} else {

				obj = wakelock;
				b(((HttpResponse) (obj1)));

				Object obj2 = null;

				obj = wakelock;
				Log.e("Swipe..DownloadManager", "download error",
						((Throwable) (obj2)));
				obj = wakelock;
				if (!((vx) (obj2)).c()) {
					// break MISSING_BLOCK_LABEL_735;
				}
				obj = wakelock;
				a(((vx) (obj2)).a());
				d.sendEmptyMessage(5);
				if (wakelock != null) {
					wakelock.release();
				}
				if (c.i != null) {
					try {
						c.f();
						return;
					}
					// Misplaced declaration of an exception variable
					catch (Exception exception) {
						Log.e("Swipe..DownloadManager", "close stream error",
								((Throwable) (obj)));
					}
					return;
				}
				obj = wakelock;
				if (((vx) (obj2)).a() != 3) {
					// break MISSING_BLOCK_LABEL_795;
				}
				obj = wakelock;
				c.b(((vx) (obj2)));

				d.sendEmptyMessage(5);
				if (obj != null) {
					((android.os.PowerManager.WakeLock) (obj)).release();
				}
				IOException ioexception;
				if (c.i != null) {
					c.f();
				}

				obj = wakelock;
				if (((vx) (obj2)).a() != 4) {
				} else {

					obj = wakelock;
					c.a(((vx) (obj2)));

					obj = wakelock;
					Log.e("Swipe..DownloadManager", "download error",
							((Throwable) (obj2)));
					obj = wakelock;
					a(3);
					d.sendEmptyMessage(5);
					if (wakelock != null) {
						wakelock.release();
					}
					if (c.i != null) {
						try {
							c.f();
							return;
						}
						// Misplaced declaration of an exception variable
						catch (Exception ert) {
							Log.e("Swipe..DownloadManager",
									"close stream error", ert);
						}
						return;
					}

				}

			}
		}
	}
}
