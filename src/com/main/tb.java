package com.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class tb implements android.os.Handler.Callback {

	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(tb.class.getSimpleName()).toString();
	private Context b;
	private td c;
	private te d;
	private Handler e;
	private ExecutorService f;
	private String g;
	private ArrayList h;
	private ArrayList i;
	private Map j;
	private Object k;

	public tb(Context context, td td1, String s) {
		h = new ArrayList();
		i = new ArrayList();
		j = new HashMap();
		k = new Object();
		b = context;
		c = td1;
		g = s;
		e = new Handler(this);
		f = new ThreadPoolExecutor(
				5,
				10,
				60L,
				TimeUnit.SECONDS,
				new ArrayBlockingQueue(30),
				Executors.defaultThreadFactory(),
				new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
	}

	static ArrayList a(tb tb1) {
		return tb1.i;
	}

	static tc a(tb tb1, tc tc1) {
		return tb1.b(tc1);
	}

	private void a(tc tc1, boolean flag) {
		ArrayList arraylist = f(tc1);
		if (tf.b(tc.b(tc1)) && flag) {
			c.a(tc1);
			if (d != null) {
				d.c(tc1);
			}
			if (arraylist != null) {
				Iterator iterator = arraylist.iterator();
				do {
					if (!iterator.hasNext()) {
						break;
					}
					tc tc2 = (tc) iterator.next();
					if (tc2 != tc1) {
						tc.a(tc2, tc.b(tc1));
						c.a(tc2);
					}
				} while (true);
			}
		} else {
			c.a(tc1);
			if (arraylist != null) {
				Iterator iterator1 = arraylist.iterator();
				do {
					if (!iterator1.hasNext()) {
						break;
					}
					tc tc3 = (tc) iterator1.next();
					if (tc3 != tc1) {
						c.b(tc3);
					}
				} while (true);
			}
		}
		i.remove(tc1.a());
		if (arraylist != null) {
			arraylist.clear();
		}
	}

	static Handler b(tb tb1) {
		return tb1.e;
	}

	private tc b(tc tc1) {
		if (TextUtils.isEmpty(tc1.a())) {
			return null;
		}
		if (d != null) {
			Bitmap bitmap = d.a(tc1.a());
			if (tf.b(bitmap)) {
				tc.a(tc1, bitmap);
				return tc1;
			}
		}
		Object obj = c(tc1);
		if (tf.b(((Bitmap) (obj)))) {
			tc.a(tc1, ((Bitmap) (obj)));
			return tc1;
		}
		obj = tc1.a();
		if (!ur.b()) {
			obj = (new ty(b)).a(((String) (obj)), null, tc1.d);
			if (tf.b(((Bitmap) (obj)))) {
				tc.a(tc1, ((Bitmap) (obj)));
				return tc1;
			} else {
				return null;
			}
		}
		File file = new File(g, (new StringBuilder()).append(tc.a(tc1))
				.append("_temp").toString());
		if ((new ty(b)).a(((String) (obj)), null, file)) {
			if (file != null && file.exists()) {
				file.renameTo(new File(g, tc.a(tc1)));
			}
			tc.a(tc1, c(tc1));
			return tc1;
		} else {
			return null;
		}
	}

	private void b() {
		for (int l = 0; l < j.size() - 1; l++) {
			ArrayList arraylist = (ArrayList) j.get(Integer.valueOf(l));
			if (arraylist != null) {
				arraylist.clear();
			}
		}

		j.clear();
	}

	private Bitmap c(tc tc1) {
		if (!d(tc1)) {
			return null;
		}
		Bitmap bitmap;
		try {
			bitmap = tf.a((new File(g, tc.a(tc1))).getPath(), tc1.d);
		} catch (OutOfMemoryError outofmemoryerror) {
			try {
				vk.a();
				bitmap = tf.a((new File(g, tc.a(tc1))).getPath(), tc1.d);
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				vk.a();
				return null;
			}
			return bitmap;
		}
		return bitmap;
	}

	private boolean d(tc tc1) {
		String string = "";
		if (g != null && !"".equals(g)) {
			if ((string = tc.a(tc1)) != null && !"".equals(string)) {
				return (new File(g, string)).exists();
			}
		}
		return false;
	}

	private void e(tc tc1) {
		ArrayList arraylist1 = (ArrayList) j.get(tc1.a());
		ArrayList arraylist = arraylist1;
		if (arraylist1 == null) {
			arraylist = new ArrayList();
			j.put(tc1.a(), arraylist);
		}
		arraylist.add(tc1);
	}

	private ArrayList f(tc tc1) {
		return (ArrayList) j.remove(tc1);
	}

	public void a() {
		try {
			i.clear();
			h.clear();
			b();
			f.shutdownNow();
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	public void a(final tc tc1) {
		if (d != null) {
			Bitmap bitmap = d.a(tc1.a());
			if (tf.b(bitmap)) {
				tc.a(tc1, bitmap);
				e.obtainMessage(0, tc1).sendToTarget();
				return;
			}
		}
		if (i.contains(tc1.a())) {
			e(tc1);
			return;
		}
		try {
			f.execute(new Runnable() {

				final tc a;
				final tb b;

				public void run() {
					tb.a(b).add(a.a());
					try {
						tb.a(b, a);
						tb.b(b).obtainMessage(0, a).sendToTarget();
						return;
					} catch (Throwable throwable1) {
						tb.b(b).obtainMessage(1, a).sendToTarget();
					}
				}

				{
					b = tb.this;
					a = tc1;
					//super();
				}
			});
			return;
		} catch (Throwable throwable) {
			e.obtainMessage(1, tc1).sendToTarget();
		}
	}

	public void a(te te1) {
		d = te1;
	}

	public boolean handleMessage(Message message) {
		tc tc1 = (tc) message.obj;
		switch (message.what) {
		default:
			return false;

		case 0: // '\0'
			a(tc1, true);
			return false;

		case 1: // '\001'
			a(tc1, false);
			break;
		}
		return false;
	}

}
