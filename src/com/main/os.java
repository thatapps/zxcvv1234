package com.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazyswipe.features.splash.SplashView;
import com.lazyswipe.zev.R;

public class os {
	private static final String a = new File(um.c(), "splash")
			.getAbsolutePath();
	private static Long b;
	private static List c;

	static Long a(Long long1) {
		b = long1;
		return long1;
	}

	static String a() {
		return a;
	}

	static String a(List list) {
		return c(list);
	}

	private static List a(Context context) {
		List list = null;

		try {
			list = b(b(context, "splash", "pref_local_list", ""));
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return null;
		}
		return list;
	}

	static List a(String s) {
		return b(s);
	}

	public static void a(final Activity activity) {
		long l;
		long l1;
		l = System.currentTimeMillis();
		l1 = b(activity, "splash", "pref_last_display_time", 0L);
		if (l <= l1) {
			// break MISSING_BLOCK_LABEL_43;
		}
		if (l - l1 < b(activity, "splash", "pref_display_interval", 0L)) {
			return;
		}
		long l2;
		if (!a(((Context) (activity)), l1)) {
			c(activity, "splash", "pref_display_count", 0L);
		}
		l1 = b(activity, "splash", "pref_display_count", 0L);
		l2 = b(activity, "splash", "pref_max_display_count", -1L);
		if (l2 < 0L || l1 < l2) {
			try {
				if (b == null) {
					b = Long.valueOf(b(activity, "splash",
							"pref_last_req_time", 0L));
				}
				if ((l - b.longValue() > b(activity, "splash",
						"pref_req_interval", 0x5265c00L) || b.longValue() > l)
						&& uj.e(activity) && ur.b()) {
					b(activity);
				}
				if (c == null) {
					c = a(((Context) (activity)));
				}
				if (c != null && !c.isEmpty()) {
					int i = (int) (Math.random() * (double) c.size());
					final ot ot1 = (ot) c.get(i);
					File file = new File(a, ot1.d);
					if (file.exists()) {
						final SplashView splashview = (SplashView) LayoutInflater
								.from(activity).inflate(R.layout.splash_view, null);
						splashview.setImage(BitmapFactory.decodeFile(file
								.getPath()));
						splashview
								.setOnClickListener(new android.view.View.OnClickListener() {

									final Activity a = activity;
									final ot b = ot1;

									public void onClick(View view) {
										jc.a(a, "CA", b.e);
										b.a.a(a, b);
									}

								});
						c(activity, "splash", "pref_last_display_time",
								System.currentTimeMillis());
						c(activity, "splash", "pref_display_count", l1 + 1L);
						activity.addContentView(splashview,
								new android.view.ViewGroup.LayoutParams(-1, -1));
						jc.a(activity, "CA", ot1.e);
						(new Handler()).postDelayed(new Runnable() {

							final SplashView a = splashview;

							public void run() {
								android.view.ViewParent viewparent = a
										.getParent();
								if (viewparent != null
										&& (viewparent instanceof ViewGroup)) {
									((ViewGroup) viewparent).removeView(a);
								}
							}

						}, (long) Math.min(10, ot1.c) * 1000L);
						return;
					}
				}
			}
			// Misplaced declaration of an exception variable
			catch (Exception exception) {
				Log.e("Swipe.SplashController", "Failed to show the splash");
			}
		}
		return;
	}

	static void a(Context context, String s, String s1, long l) {
		c(context, s, s1, l);
	}

	static void a(Context context, String s, String s1, List list) {
		c(list);
	}

	static void a(Context context, String s, String s1, String s2) {
		c(context, s, s1, s2);
	}

	private static boolean a(Context context, long l) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(l);
		Calendar calendar = Calendar.getInstance();
		return calendar.get(1) == calendar1.get(1)
				&& calendar.get(2) == calendar1.get(2)
				&& calendar.get(5) == calendar1.get(5);
	}

	private static long b(Context context, String s, String s1, long l) {
		return context.getSharedPreferences(s, 1).getLong(s1, l);
	}

	static Long b() {
		return b;
	}

	private static String b(Context context, String s, String s1, String s2) {
		return context.getSharedPreferences(s, 1).getString(s1, s2);
	}

	private static List b(String paramString) {
		ArrayList localArrayList = new ArrayList();
		JSONArray localJSONArray = null;
		if (!TextUtils.isEmpty(paramString)) {
			try {
				localJSONArray = new JSONArray(paramString);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0;; i++) {
			if (i < localJSONArray.length()) {
			}

			int m;
			try {
				JSONObject localJSONObject = localJSONArray.getJSONObject(i);
				ot localot = new ot();
				localot.e = localJSONObject.optString("id");
				localot.d = localJSONObject.getString("imgUrl");
				localot.b = localJSONObject.optString("param");
				localot.c = localJSONObject.optInt("stayTime", 3);
				int j = localJSONObject.getInt("type");
				ou[] arrayOfou = ou.values();
				int k = arrayOfou.length;
				m = 0;
				if (m < k) {
					ou localou = arrayOfou[m];
					if (j != localou.c) {
						m++;
					}
					localot.a = localou;
					m++;
				}
				if (localot.a == null) {
					Log.w("Swipe.SplashController", "Splash type " + j
							+ " is not supported and ignored.");
				} else {
					localArrayList.add(localot);
				}
			} catch (Throwable localThrowable) {
				Log.e("Swipe.SplashController", "Failed to parse the " + i
						+ "th element", localThrowable);
			}
			return localArrayList;
			// label257:
		}
	}

	private static void b(final Context context) {
		final Context a = null;
		//final  = true;
		 
		final Object obj1 = new HashSet();
		final List list = os.a((context));
		
	
		final Iterator iterator1 = list.iterator();

		final ot ot2;
		final String s;
		final File file;
		final File file1;
		ot2 = (ot) iterator1.next();
		s = uh.a(ot2.d);
		file = new File((File) os.a(context), (new StringBuilder()).append(s)
				.append("_temp").toString());
		file1 = new File((File) os.a(context), s);

	//	obj1 = new HashSet();

		AsyncTask.execute(new Runnable() {

			@Override
			public void run() {

				Object	obj = String
						.format("http://a.lazyswipe.com//splashs?w=%s&pcode=%s&vcode=%s",
								new Object[] { Integer.valueOf(to.r(a)),
										"400105", "00" });
				obj = (new ty(a)).a(((String) (obj)), null);
				if (TextUtils.isEmpty(((CharSequence) (obj)))) {

					return;

				} else {

					try {
						obj = new JSONObject(((String) (obj)));
					} catch (JSONException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Object		obj1 = ((JSONObject) (obj)).getString("results");
					} catch (JSONException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (TextUtils.isEmpty(((CharSequence) (obj1)))) {

						if (((JSONObject) (obj)).has("reqInterval")) {
							int i = 0;
							try {
								i = ((JSONObject) (obj)).getInt("reqInterval");
							} catch (JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							os.a(a, "splash", "pref_req_interval", i * 1000);
						}
						if (((JSONObject) (obj)).has("displayInterval")) {
							int j = 0;
							try {
								j = ((JSONObject) (obj))
										.getInt("displayInterval");
							} catch (JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							os.a(a, "splash", "pref_display_interval", j * 1000);
						}
						if (((JSONObject) (obj)).has("maxDisplay")) {
							int k = 0;
							try {
								k = ((JSONObject) (obj)).getInt("maxDisplay");
							} catch (JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							os.a(a, "splash", "pref_max_display_count", k);
							return;
						}

						boolean flag	 = false;
						if (!flag) {

							Log.w("Swipe.SplashController",
									(new StringBuilder())
											.append("Failed to load the splash image from ")
											.append(ot2.d)
											.append(" and ignored.").toString());
							iterator1.remove();
							if (!iterator1.hasNext()) {

								os.a(a, "splash", "pref_local_list",
										os.a(context));
								os.a(Long.valueOf(System.currentTimeMillis()));
								os.a(a, "splash", "pref_last_req_time", os.b()
										.longValue());
								if (os.c(list) != null) {
									Iterator iterator = (new ArrayList(os.c()))
											.iterator();
									do {
										if (!iterator.hasNext()) {
											break;
										}
										ot ot1 = (ot) iterator.next();
										if (!(((SharedPreferences) obj1))
												.contains(ot1.d)) {
											tq.b(new File(ot1.d));
										}
									} while (true);
								}
								os.b((String) null);

							} else {

								if (!file1.exists()) {

									if (!(new ty(a)).a(ot2.d, null, file)
											|| file == null) {
										// break MISSING_BLOCK_LABEL_546;
									}
									if (!file.exists()) {
										// break MISSING_BLOCK_LABEL_546;
									}
									flag = file.renameTo(file1);
									if (!flag) {

										Log.w("Swipe.SplashController",
												(new StringBuilder())
														.append("Failed to load the splash image from ")
														.append(ot2.d)
														.append(" and ignored.")
														.toString());
										iterator1.remove();

									} else {
										ot2.d = s;
										(((List) obj1)).add(ot2.d);

										;
										Log.e("Swipe.SplashController",
												"Failed to query from the server.",
												((Throwable) (obj)));

									}

								}

							}

						} else {

							ot2.d = s;
							(((List) obj1)).add(ot2.d);
							// goto _L11

							Log.e("Swipe.SplashController",
									"Failed to query from the server.",
									((Throwable) (obj)));
						}

					} else {

					}
				}
			}
		});

	}

	static List b(List list) {
		c = list;
		return list;
	}

	static List c() {
		return c;
	}

	private static String c(List paramList) {
		JSONArray localJSONArray = new JSONArray();
		Iterator localIterator = paramList.iterator();
		while (localIterator.hasNext()) {
			ot localot = (ot) localIterator.next();
			JSONObject localJSONObject = new JSONObject();
			if (!TextUtils.isEmpty(localot.e)) {
				try {
					localJSONObject.put("id", localot.e);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				localJSONObject.put("imgUrl", localot.d);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				localJSONObject.put("param", localot.b);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				localJSONObject.put("stayTime", localot.c);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				localJSONObject.put("type", localot.a.c);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			localJSONArray.put(localJSONObject);
		}
		return localJSONArray.toString();
	}

	private static void c(Context paramContext, String paramString1,
			String paramString2, long paramLong) {
		SharedPreferences.Editor localEditor = paramContext
				.getSharedPreferences(paramString1, 1).edit();
		localEditor.putLong(paramString2, paramLong);
		localEditor.commit();
	}

	private static void c(Context paramContext, String paramString1,
			String paramString2, String paramString3) {
		SharedPreferences.Editor localEditor = paramContext
				.getSharedPreferences(paramString1, 1).edit();
		localEditor.putString(paramString2, paramString3);
		localEditor.commit();
	}
}
