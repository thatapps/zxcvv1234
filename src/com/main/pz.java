package com.main;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.lazyswipe.SwipeApplication;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pz {

	public static boolean a = true;
	public static boolean b = false;
	final Handler c = new Handler(Looper.getMainLooper());
	private Map d;
	private Set e;
	private ExecutorService f;

	public pz() {
		d = new HashMap();
		e = new HashSet();
		f = Executors.newFixedThreadPool(5);
	}

	private Bitmap a(String s, Context context) {
		Bitmap bitmap = null;
		
		Uri uri = ContentUris.withAppendedId(
				android.provider.ContactsContract.Contacts.CONTENT_URI,
				Long.parseLong(s));
		InputStream inputStream = android.provider.ContactsContract.Contacts
				.openContactPhotoInputStream(context.getContentResolver(), uri);
		s = null;
		if (context != null) {
			bitmap = BitmapFactory.decodeStream(inputStream);
			try {
				inputStream.close();
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				exception.printStackTrace();
				return bitmap;
			}
		}
		return bitmap;
	}

	static Bitmap a(pz pz1, String s, Context context) {
		return pz1.a(s, context);
	}

	static Map a(pz pz1) {
		return pz1.d;
	}

	static Set b(pz pz1) {
		return pz1.e;
	}

	public Bitmap a(final String s, final qa qa) {
		Object obj1 = null;
		Object obj = null;
		if (!d.containsKey(s)) {
			// obj = obj1;
			if (!e.contains(s)) {
				if (a) {
					f.submit(new Runnable() {

						final String a;
						final qa b;
						final pz c;

						public void run() {
							try {
								final Bitmap bitmap = pz.a(c, a,
										SwipeApplication.e());
								if (tf.b(bitmap)) {
									pz.a(c).put(a, new SoftReference(bitmap));
									c.c.post(new Runnable() {

										final Bitmap a;

										// final _cls1 b;

										public void run() {
											a(s, SwipeApplication.e());
										}

										{
											// b = _pcls1;
											a = bitmap;
											// super();
										}
									});
									return;
								}
							} catch (Exception exception) {
								throw new RuntimeException(exception);
							}
							pz.b(c).add(a);
							return;
						}

						{
							c = pz.this;
							a = s;
							b = qa;
							// super();
						}
					});
					return null;
				} else {
					b = true;
					return null;
				}
			}

		} else {

			obj = (SoftReference) d.get(s);
			if (obj == null) {
				obj = null;
			} else {
				obj = (Bitmap) ((SoftReference) (obj)).get();
			}
			if (!tf.b(((Bitmap) (obj)))) {

				obj = obj1;
				if (!e.contains(s)) {
					if (a) {
						f.submit(new Runnable() {

							final String a;
							final qa b;
							final pz c;

							public void run() {
								try {
									final Bitmap bitmap = pz.a(c, a,
											SwipeApplication.e());
									if (tf.b(bitmap)) {
										pz.a(c).put(a,
												new SoftReference(bitmap));
										c.c.post(new Runnable() {

											final Bitmap a;

											public void run() {
												a(s, SwipeApplication.e());
											}

											{

												a = bitmap;
												// super();
											}
										});
										return;
									}
								} catch (Exception exception) {
									throw new RuntimeException(exception);
								}
								pz.b(c).add(a);
								return;
							}

							{
								c = pz.this;
								a = s;
								b = qa;
								// super();
							}
						});
						return null;
					} else {
						b = true;
						return null;
					}
				}

			} else {

				return ((Bitmap) (obj));

			}

		}
		return (Bitmap) obj;

	}

	public void a() {
		for (Iterator iterator = d.values().iterator(); iterator.hasNext(); tf
				.a((Bitmap) ((SoftReference) iterator.next()).get())) {
		}
		d.clear();
		e.clear();
	}

}
