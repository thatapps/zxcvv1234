package com.main;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.WindowManager;

public class ge {
	private static final String[] C;
	private static final String[] D;
	private static ge F;
	private static int J = 0;
	private static final String f = System.getProperty("line.separator");
	private boolean A = false;
	private boolean B = false;
	private long E = 0L;
	private Handler G = null;
	private BroadcastReceiver H = null;
	private boolean I = false;
	private SparseArray K;
	private long L = 0L;
	private int M = 5;
	private boolean N = false;
	private boolean[] O;
	private boolean P = false;
	private boolean Q = false;
	private String R = "none";
	private int S = -2;
	private gb T;
	public fw a;
	public fw b;
	public String c = null;
	public boolean d = false;
	public Context e;
	private String g = null;
	private String h = null;
	private String i = null;
	private String j = null;
	private String k = null;
	private String l = null;
	private String m = null;
	private String n = null;
	private String o = null;
	private boolean p = false;
	private String q = null;
	private String r = null;
	private boolean s = true;
	private boolean t = false;
	private boolean u = false;
	private boolean v = false;
	private boolean w = false;
	private boolean x = false;
	private boolean y = false;
	private boolean z = false;

	static {
		String[] arrayOfString1 = new String[16];
		arrayOfString1[0] = "U";
		arrayOfString1[1] = "D";
		arrayOfString1[2] = "I";
		arrayOfString1[3] = "C";
		arrayOfString1[4] = "O";
		arrayOfString1[5] = "N";
		arrayOfString1[6] = "B";
		arrayOfString1[7] = "M";
		arrayOfString1[8] = "W";
		arrayOfString1[9] = "P";
		arrayOfString1[10] = "S";
		arrayOfString1[11] = "Q";
		arrayOfString1[12] = "V";
		arrayOfString1[13] = "K";
		arrayOfString1[14] = "A";
		arrayOfString1[15] = "H";
		C = arrayOfString1;
		String[] arrayOfString2 = new String[19];
		arrayOfString2[0] = "pkg";
		arrayOfString2[1] = "ms";
		arrayOfString2[2] = "c";
		arrayOfString2[3] = "w";
		arrayOfString2[4] = "n";
		arrayOfString2[5] = "iso";
		arrayOfString2[6] = "lang";
		arrayOfString2[7] = "pdtid";
		arrayOfString2[8] = "pvc";
		arrayOfString2[9] = "u";
		arrayOfString2[10] = "par1";
		arrayOfString2[11] = "par2";
		arrayOfString2[12] = "b";
		arrayOfString2[13] = "m";
		arrayOfString2[14] = "aos";
		arrayOfString2[15] = "aon";
		arrayOfString2[16] = "o";
		arrayOfString2[17] = "p1";
		arrayOfString2[18] = "p2";
		D = arrayOfString2;
	}

	private boolean A() {
		boolean flag = true;
		String s1;
		if (!Q) {
			if (!TextUtils.isEmpty(s1 = l("dataState"))) {
				if (gg.b(s1) != 1) {
					flag = false;
				}
				w = flag;
				return w;
			}
		}
		return false;
	}

	private void B() {
		G = new Handler(Looper.getMainLooper()) {

			public void handleMessage(Message message) {
				int i1;
				long l1 = System.currentTimeMillis();
				long l2;
				final ge a = ge.this;
				boolean flag;
				gh gh;
				Handler handler;
				handler = ge.e(a);
				if (fx.a) {
					Log.w("DF_QA", (new StringBuilder()).append("msg.what:")
							.append(message.what).toString());
				}
				i1 = message.what;

				// JVM INSTR lookupswitch 5: default 92
				// 100: 93
				// 200: 227
				// 300: 456
				// 400: 478
				// 500: 642;
				// goto _L1 _L2 _L3 _L4 _L5 _L6

				// _L2:
				ge.b(a, null);
				try {
					ge.e(a).removeMessages(100);
					ge.e(a).sendEmptyMessageDelayed(100, 0x5265c00L);
					return;
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					exception.printStackTrace();
				}
				if (fx.a) {
					Log.w("system.err", message.toString());
				}

				if (fx.a) {
					Log.w("system.err", message.toString());
					// message.printStackTrace();
				}

				ge.e(a).removeMessages(100);
				ge.e(a).sendEmptyMessageDelayed(100, 0x5265c00L);

				// _L3:
				flag = ge.a(a);
				if (flag) {
					return;
				} else {

					gh = new gh(a.e);
					gh.c(l1);
					gh.a();
					a.o();
					ge.e(a).removeMessages(200);
					// handler = (Handler) ge.e(a);

					if (gg.f(a.e)) {
						l2 = 0x36ee80L;
					} else {
						l2 = 0x1499700L;
					}
					handler.sendEmptyMessageDelayed(200, l2);
					// return;

					if (fx.a) {
						Log.w("system.err", message.toString());
					}

					ge.e(a).removeMessages(200);
					// handler = ge.e(a);

					if (gg.f(a.e)) {
						l2 = 0x36ee80L;
					} else {
						l2 = 0x1499700L;
					}

					ge.e(a).removeMessages(200);

					if (gg.f(a.e)) {
						l2 = 0x36ee80L;
					} else {
						l2 = 0x1499700L;
					}
					handler.sendEmptyMessageDelayed(200, l2);

				}

				if (fx.a) {
					Log.w("DF_QA", "\u53D1\u9001real");
				}
				ge.f(a);
				// return;

				l2 = System.currentTimeMillis();
				gh = new gh(a.e);
				gh.b(l2);
				gh.a();
				ge.g(a);
				ge.c(a, false);
				ge.e(a).removeMessages(400);
				ge.e(a).sendEmptyMessageDelayed(400, 0x5265c00L);
				// return;
				// message;
				// message.printStackTrace();
				ge.c(a, false);
				ge.e(a).removeMessages(400);
				ge.e(a).sendEmptyMessageDelayed(400, 0x5265c00L);
				// return;
				// message;
				ge.c(a, false);
				ge.e(a).removeMessages(400);
				ge.e(a).sendEmptyMessageDelayed(400, 0x5265c00L);
				// throw message;

				try {
					(new Thread(new Runnable() {

						final ge trw = ge.this;

						public void run() {
							Object obj = null;
							String s1;
							gh gh = null;
							try {
								Thread.sleep(30000L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							gh = new gh((Context) a.a.e);
							((gh) (obj)).d(System.currentTimeMillis());
							s1 = ga.a((Context) a.a.e);
							if (fx.a) {
								Log.i("DF_QA",
										(new StringBuilder())
												.append("sendAppsflyer result:")
												.append(s1).toString());
							}
							if (!"ok".toString().trim()
									.equals(s1.toString().trim())) {
								if (!"notEnoughParameters".equals(s1)) {
									// break MISSING_BLOCK_LABEL_208;
								}
								if (ge.h(a) != null) {
									ge.h(a).a(false, 1);
								}

								ge.d(a, false);

								int i1 = ((gh) (obj)).b(
										(new StringBuilder()).append(a.i())
												.append(String.valueOf(gg.e()))
												.toString(), 0);
								((gh) (obj)).a(
										(new StringBuilder()).append(a.i())
												.append(String.valueOf(gg.e()))
												.toString(), i1 + 1);
								if (ge.h(a) != null) {
									ge.h(a).a(false, 0);
								}

								((gh) (obj)).a();
								ge.d(a, false);
								return;

							} else {

								if (ge.h(a) != null) {
									ge.h(a).a(true, 0);
								}
								((gh) (obj)).S();
							}

						}

					})).start();

				} catch (Exception exception) {
					return;
				}
				// _L7:

				handler = ge.e(a);
				l1 = System.currentTimeMillis();
				gh = new gh(a.e);
				gh.c(l1);
				gh.a();
				a.o();
				ge.e(a).removeMessages(200);
				// handler = ge.e(a);

				if (gg.f(a.e)) {
					l2 = 0x36ee80L;
				} else {
					l2 = 0x1499700L;
				}
				handler.sendEmptyMessageDelayed(200, l2);

				if (fx.a) {
					Log.w("system.err", message.toString());
				}

				ge.e(a).removeMessages(200);
				// message = ge.e(a);

				if (gg.f(a.e)) {
					l2 = 0x36ee80L;
				} else {
					l2 = 0x1499700L;
				}
				handler.sendEmptyMessageDelayed(200, l2);

				ge.e(a).removeMessages(200);

				if (gg.f(a.e)) {
					l2 = 0x36ee80L;
				} else {
					l2 = 0x1499700L;
				}
				handler.sendEmptyMessageDelayed(200, l2);

			}

		};
	}

	static SparseArray a(ge ge1, SparseArray sparsearray) {
		ge1.K = sparsearray;
		return sparsearray;
	}

	static String a(ge ge1, String s1) {
		return ge1.l(s1);
	}

	static void a(ge ge1, int i1) {
		ge1.b(i1);
	}

	static void a(ge ge1, long l1) {
		ge1.a(l1);
	}

	static void a(ge ge1, String s1, String s2) {
		ge1.c(s1, s2);
	}

	static void a(ge ge1, boolean flag) {
		ge1.g(flag);
	}

	static boolean a(ge ge1) {
		return ge1.A();
	}

	static boolean a(ge ge1, Context context) {
		return ge1.d(context);
	}

	static boolean a(ge ge1, String s1, String s2, String s3, String s4,
			String s5, boolean flag) {
		return ge1.a(s1, s2, s3, s4, s5, flag);
	}

	static boolean a(ge ge1, String s1, String s2, boolean flag) {
		return ge1.a(s1, s2, flag);
	}

	static int b(ge ge1, int i1) {
		ge1.S = i1;
		return i1;
	}

	static void b(ge ge1, String s1) {
		ge1.y(s1);
	}

	static boolean b(ge ge1) {
		return ge1.v;
	}

	static boolean b(ge ge1, boolean flag) {
		ge1.v = flag;
		return flag;
	}

	static String c(ge ge1) {
		return ge1.g;
	}

	static void c(ge ge1, int i1) {
		ge1.a(i1);
	}

	static void c(ge ge1, String s1) {
		ge1.t(s1);
	}

	static boolean c(ge ge1, boolean flag) {
		ge1.A = flag;
		return flag;
	}

	static void d(ge ge1, String s1) {
		ge1.u(s1);
	}

	static boolean d(ge ge1, boolean flag) {
		ge1.y = flag;
		return flag;
	}

	static boolean[] d(ge ge1) {
		return ge1.O;
	}

	static Handler e(ge ge1) {
		return ge1.G;
	}

	static void e(ge ge1, String s1) {
		ge1.v(s1);
	}

	static boolean e(ge ge1, boolean flag) {
		ge1.P = flag;
		return flag;
	}

	static void f(ge ge1) {
		ge1.Q();
	}

	static void f(ge ge1, String s1) {
		ge1.s(s1);
	}

	static void f(ge ge1, boolean flag) {
		ge1.h(flag);
	}

	static void g(ge ge1) {
		ge1.C();
	}

	static void g(ge ge1, String s1) {
		ge1.z(s1);
	}

	static boolean g(ge ge1, boolean flag) {
		ge1.x = flag;
		return flag;
	}

	static gb h(ge ge1) {
		return ge1.T;
	}

	static void h(ge ge1, String s1) {
		ge1.w(s1);
	}

	static void h(ge ge1, boolean flag) {
		ge1.i(flag);
	}

	static fq i(ge ge1, String s1) {
		return ge1.x(s1);
	}

	static boolean i(ge ge1) {
		return ge1.Q;
	}

	static boolean i(ge ge1, boolean flag) {
		ge1.z = flag;
		return flag;
	}

	static String j(ge ge1) {
		return ge1.E();
	}

	static void j(ge ge1, String s1) {
		ge1.r(s1);
	}

	static String k(ge ge1) {
		return ge1.F();
	}

	static SparseArray l(ge ge1) {
		return ge1.K;
	}

	static String m(ge ge1) {
		return ge1.J();
	}

	static void n(ge ge1) {
		ge1.G();
	}

	static String o(ge ge1) {
		return ge1.K();
	}

	static void p(ge ge1) {
		ge1.L();
	}

	private void C() {
		new Thread((Runnable) new Runnable() {

			/*
			 * Enabled aggressive block sorting Enabled unnecessary exception
			 * pruning
			 */
			public void run() {
				try {
					fs fs = fr.a(ge.this.e);
					String string = fs.a();
					int n = fs.b() ? 1 : 0;
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) ("getAdInfo advertisingId:" + string));
					}
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) ("getAdInfo optOutEnabled:" + n));
					}
					ge.this.z(string);
					ge.this.b(n);
					return;
				} catch (Exception var1_4) {
					var1_4.printStackTrace();
					if (fx.a) {
						Log.w((String) "DF_QA",
								(String) ("getAdInfo err:" + (Object) var1_4));
					}
					ge.this.S = -1;
					return;
				}
			}
		}).start();
	}

	private void D() {

		try {
			H = new BroadcastReceiver() {

				final ge a;

				public void onReceive(Context context, Intent intent) {
					State state = null;
					ConnectivityManager manager = null;
					if (!ge.i(a)) {

						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder()).append("mReceiver: ")
											.append(intent.getAction())
											.toString());
						}
						if (!"android.net.conn.CONNECTIVITY_CHANGE"
								.equals(intent.getAction())) {
							// continue; /* Loop/switch isn't completed */
						}
						manager = (ConnectivityManager) context
								.getSystemService("connectivity");
						if (manager.getNetworkInfo(1) == null) {
							// break MISSING_BLOCK_LABEL_432;
						}
						state = manager.getNetworkInfo(1).getState();

					} else {
						return;
					}

					// _L10:
					if (manager.getNetworkInfo(0) == null) {

						intent = null;
						// goto _L9
						context = null;
						// goto _L10

					}

					// _L9:
					if (context == null) {
						// break MISSING_BLOCK_LABEL_218;
					}
					long l1;
					long l2;
					if (android.net.NetworkInfo.State.CONNECTED != state) {
						// break MISSING_BLOCK_LABEL_218;
					}
					if (fx.a) {
						Log.i("DF_QA",
								"\u65E0\u7EBF\u7F51\u7EDC\u8FDE\u63A5\u6210\u529F");
					}
					l1 = System.currentTimeMillis();
					gh gh = new gh(a.e);
					l2 = gh.N();
					gh.a();
					if (l1 - l2 > 0L) {
						l1 -= l2;
					} else {
						l1 = 0L;
					}
					if (!ge.b(a) || 0x36ee80L - l1 >= 0L) {
						// break MISSING_BLOCK_LABEL_198;
					}
					ge.b(a, false);
					ge.f(a, true);

					if (fx.a) {
						Log.i("DF_QA",
								"\u624B\u673A\u7F51\u7EDC\u8FDE\u63A5\u6210\u529F");
					}
					l1 = System.currentTimeMillis();
					gh = new gh(a.e);
					l2 = gh.N();
					gh.a();
					if (l1 - l2 > 0L) {
						l1 -= l2;
					} else {
						l1 = 0L;
					}
					if (!ge.b(a) || 0x1499700L - l1 >= 0L) {
						// break MISSING_BLOCK_LABEL_326;
					}
					ge.b(a, false);
					ge.f(a, false);
					// return;

					// Misplaced declaration of an exception variable

					if (intent == null) {
						return;
					} else {

						if (android.net.NetworkInfo.State.CONNECTED == state) {
							return;
						} else {
							if (ge.e(a) == null) {

								return;
							} else {
								if (fx.a) {
									Log.i("DF_QA",
											"\u624B\u673A\u6CA1\u6709\u4EFB\u4F55\u7684\u7F51\u7EDC");
								}
								ge.e(a).removeCallbacksAndMessages(null);

								if (!"android.intent.action.SCREEN_OFF"
										.equals(intent.getAction())) {
									return;
								} else {

									if (fx.a) {
										Log.i("DF_QA",
												"\u5C4F\u5E55\u6697\u5C4F");
									}
									a.n();
									return;

								}
							}

						}

					}

				}

				{
					a = ge.this;

				}
			};
			return;
		} catch (Throwable throwable) {
			if (fx.a) {
				Log.w("system.err", throwable);
			}
			throwable.printStackTrace();
			return;
		}
	}

	private String E() {
		if (this.K == null)
			return null;
		if (this.K.size() == 0) {
			return null;
		}
		String string = "";
		if (this.I() < ((int[]) this.K.get(6))[0])
			return string;
		if (this.I() > ((int[]) this.K.get(6))[1])
			return string;
		List list = fv.a().g();
		if (list == null)
			return string;
		if (list.size() == 0)
			return string;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			gf gf = (gf) iterator.next();
			String string2 = gg.a(6, gf.a(), gf.b(),
					String.valueOf((long) gf.e()));
			if (string.getBytes().length + string2.getBytes().length >= 1000000)
				return string;
			string = string + string2;
			fv.a().a(gf, 1);
		}
		return string;
	}

	private String F() {
		String str2 = null;
		gh localgh = null;
		gf localgf3 = null;
		String str5 = null;
		String str1 = str2;
		try {
			if ((this.K != null) && (this.K.size() != 0)) {
				str2 = "";
				localgh = new gh(this.e);
				if ((I() >= ((int[]) this.K.get(3))[0])
						&& (I() <= ((int[]) this.K.get(3))[1])) {
					str2 = str2 + localgh.h().replaceAll("<>", "");
					if (fx.a) {
						Log.d("DF_QA", "getSendFileData onEvent_3 result: "
								+ str2);
					}
					if (!TextUtils.isEmpty(str2)) {
						this.O[3] = true;
					}
				}
				if ((I() >= ((int[]) this.K.get(4))[0])
						&& (I() <= ((int[]) this.K.get(4))[1])) {
					String str7 = localgh.j().replaceAll("<>", "");
					if (str2.getBytes().length + str7.getBytes().length >= 1000000) {
						if (fx.a) {
							Log.i("DF_QA", "Rms �?存异常，过多1");
						}
						localgh.a();
					}
					str2 = str2 + str7;
					if (!TextUtils.isEmpty(str2)) {
						this.O[4] = true;
					}
				}
				if ((I() >= ((int[]) this.K.get(5))[0])
						&& (I() <= ((int[]) this.K.get(5))[1])) {
					String str6 = localgh.l().replaceAll("<>", "");
					if (str2.getBytes().length + str6.getBytes().length >= 1000000) {
						if (fx.a) {
							Log.i("DF_QA", "Rms �?存异常，过多2");
						}
						localgh.a();
						// return str2;
						if (str2.getBytes().length + str5.getBytes().length >= 1000000) {
							// break;
						}
						str2 = str2 + str5;
						fv.a().a(localgf3, 1);
					}
					str2 = str2 + str6;
					if (!TextUtils.isEmpty(str2)) {
						this.O[5] = true;
					}
				}
				if ((I() >= ((int[]) this.K.get(3))[0])
						&& (I() <= ((int[]) this.K.get(3))[1])) {
					List localList3 = fv.a().a(3, "getSendFileData");
					if ((localList3 != null) && (localList3.size() != 0)) {
						Iterator localIterator3 = localList3.iterator();

						if (!localIterator3.hasNext()) {
							if ((I() >= ((int[]) this.K.get(4))[0])
									&& (I() <= ((int[]) this.K.get(4))[1])) {
								List localList2 = fv.a()
										.a(4, "getSendFileData");
								if ((localList2 != null)
										&& (localList2.size() != 0)) {
									Iterator localIterator2 = localList2
											.iterator();
									while (localIterator2.hasNext()) {
										gf localgf2 = (gf) localIterator2
												.next();
										String str4 = gg.a(4, localgf2.a()
												.longValue(), localgf2.b(),
												localgf2.d());
										if ((localgf2.a().longValue() == 0L)
												&& (!"E3".equals(localgf2.b()))
												&& (w() < 50)) {
											b("E3", "getSendFileData:" + str4);
											x();
											fv.a().a(localgf2.b());
										} else if (str2.getBytes().length
												+ str4.getBytes().length < 1000000) {
											str2 = str2 + str4;
											fv.a().a(localgf2, 1);
										} else {
											localgh.a();
											return str2;
										}
									}
								}
							}
							if ((I() >= ((int[]) this.K.get(5))[0])
									&& (I() <= ((int[]) this.K.get(5))[1])) {
								List localList1 = fv.a()
										.a(5, "getSendFileData");
								if ((localList1 != null)
										&& (localList1.size() != 0)) {
									Iterator localIterator1 = localList1
											.iterator();
									while (localIterator1.hasNext()) {
										gf localgf1 = (gf) localIterator1
												.next();
										String str3 = gg.a(5, localgf1.a()
												.longValue(), localgf1.b(),
												localgf1.d());
										if ((localgf1.a().longValue() == 0L)
												&& (!"E3".equals(localgf1.b()))
												&& (w() < 50)) {
											b("E3", "getSendFileData:" + str3);
											x();
											fv.a().a(localgf1.b());
										} else if (str2.getBytes().length
												+ str3.getBytes().length < 1000000) {
											str2 = str2 + str3;
											fv.a().a(localgf1, 1);
										} else {
											localgh.a();
											return str2;
										}
									}
								}
							}
							str1 = str2;
							localgh.a();
							return str1;

						}
						localgf3 = (gf) localIterator3.next();
						str5 = gg.a(3, localgf3.a().longValue(), localgf3.b(),
								null);
						if ((localgf3.a().longValue() != 0L)
								|| ("E3".equals(localgf3.b())) || (w() >= 50)) {
							// break;
						}
						b("E3", "getSendFileData:" + str5);
						x();
						fv.a().a(localgf3.b());

					}
				}
			}
		} catch (Throwable localThrowable) {
		}
		return str1;
	}

	private void G() {
		if (Q) {
			return;
		}
		try {
			(new Thread(new Runnable() {

				final ge a;
				Object obj1;
				String s3 = gd.b(gg.a(((File) (obj1))));
				Object obj = "";
				String s4;
				boolean flag1, flag;

				public void run() {
					if (ge.a(a) || !ge.a(a, a.e)) {
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("\u53D1\u9001\u666E\u901A\u4E8B\u4EF63~5 isSend:")
											.append(ge.a(a)).toString());
						}
						fv.a().e();
						return;
					}

					if (TextUtils.isEmpty(a.d())) {
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("\u53D1\u9001\u666E\u901A\u4E8B\u4EF63~5 getUseId:")
											.append(a.d()).toString());
						}
						fv.a().e();
						return;
					}
					if (gg.e(a.e) == null) {
						if (fx.a) {
							Log.i("DF_QA", "\u65E0\u7F51\u7EDC..........");
						}
						fv.a().e();
						return;
					}

					ge.a(a, true);
					String s1 = (new StringBuilder())
							.append(a.d().substring(0, 2))
							.append(a.d().substring(a.d().length() - 4,
									a.d().length())).toString();
					long l1 = System.currentTimeMillis();
					obj1 = (new StringBuilder()).append(s1).append(l1)
							.append(".txt").toString();
					String s2 = ge.k(a);
					if (fx.a) {
						Log.i("DF_QA",
								(new StringBuilder())
										.append("\u53D1\u9001\u666E\u901A\u4E8B\u4EF63~5 data:")
										.append(s2).toString());
					}
					if (TextUtils.isEmpty(s2)) {
						// continue; /* Loop/switch isn't completed */
					}
					if (!ge.a(a, s2, ((String) (obj1)), false)) {
						// break MISSING_BLOCK_LABEL_1016;
					}
					gg.a((new StringBuilder()).append(a.c).append("/")
							.append(((String) (obj1))).toString(),
							(new StringBuilder()).append(a.c).append(s1)
									.append(l1).append(".zip").toString(),
							true, "java zip");
					obj1 = new File((new StringBuilder()).append(a.c)
							.append(s1).append(l1).append(".zip").toString());
					if (((File) (obj1)).exists()) {

						// 2;
						// JVM INSTR tableswitch 0 3: default 1121
						// 0 837
						// 1 852
						// 2 867
						// 3 882;
						// goto _L4 _L5 _L6 _L7 _L8

						if (ge.c().l()) {
							obj = "http://log.test.qiigame.com/l/api/log/operate/write";
						}

						s4 = ((String) (obj)).substring("http://".length(),
								((String) (obj)).indexOf("/l/api"));
						flag1 = ge.a(a, a.d(), s3, ((String) (obj)), null, "2",
								false);
						if (flag1) {
							s3 = gg.e(s4);
							if (fx.a) {
								Log.i("DF_QA",
										(new StringBuilder())
												.append("sendFileData ip:")
												.append(s3).toString());
								Log.i("DF_QA",
										(new StringBuilder())
												.append("sendFileData newURL:")
												.append(((String) (obj))
														.replace(s4, s3))
												.toString());
							}
							flag = flag1;
							if (TextUtils.isEmpty(s3)) {

								if (flag) {
									// break MISSING_BLOCK_LABEL_993;
								}
								fv.a().e();

							} else {

								ge.a(a, "purl_ip", s3);
								flag = flag1;

								fv.a().f();
								fv.a().l();
								fv.a().h();
								if (flag) {
									// break MISSING_BLOCK_LABEL_993;
								}
								fv.a().e();

								obj = new gh(a.e);
								if (ge.d(a) != null && ge.d(a)[3]) {
									((gh) (obj)).i();
								}
								if (ge.d(a) != null && ge.d(a)[4]) {
									((gh) (obj)).k();
								}
								if (ge.d(a) != null && ge.d(a)[5]) {
									((gh) (obj)).m();
								}
								((gh) (obj)).a();
								((File) (obj1)).delete();

								try {
									if (ge.d(a) != null && ge.d(a)[3]) {
										ge.d(a)[3] = false;
									}
									if (ge.d(a) != null && ge.d(a)[4]) {
										ge.d(a)[4] = false;
									}
									if (ge.d(a) != null && ge.d(a)[5]) {
										ge.d(a)[5] = false;
									}
									fv.a().e();
								}
								// Misplaced declaration of an exception
								// variable
								catch (Throwable throwable11) {
									throwable11.printStackTrace();
									fv.a().e();
								}

							}

						} else {

							String s5 = ge.a(a, "purl_ip");
							boolean flag = flag1;
							if (!TextUtils.isEmpty(s5)) {
								flag = ge.a(a, a.d(), s3,
										((String) (obj)).replace(s4, s5), s4,
										"2", false);
							}

						}

					} else {

						fv.a().e();

					}

					if (ge.c().m()) {
						obj = "http://locker.dh.lockerma.com/l/api/log/operate/write";
					} else {
						obj = "http://dh.qiigame.com/l/api/log/operate/write";
					}

					// _L6:
					if (ge.c().m()) {
						obj = "http://dh.holalauncher.com/l/api/log/operate/write";
					} else {
						obj = "http://dh.holaworld.cn/l/api/log/operate/write";
					}

					// _L7:
					if (ge.c().m()) {
						obj = "http://dh.lazyswipe.com/l/api/log/operate/write";
					} else {
						obj = "http://dh.lazyswipe.cn/l/api/log/operate/write";
					}

					// _L8:
					if (ge.c().m()) {
						obj = "http://dh.privacyace.com/l/api/log/operate/write";
					} else {
						obj = "http://dh.privacyace.cn/l/api/log/operate/write";
					}

				}

				{
					a = ge.this;

				}
			})).start();
			return;
		} catch (Throwable throwable) {
			return;
		}
	}

	private void H() {
		try {
			String string = this.z();
			if (TextUtils.isEmpty((CharSequence) string)) {
				this.y(null);
				return;
			}
			fq fq = this.x(string);
			List<fo> list = fq.b();
			if (list != null && list.size() > 0) {
				this.K = new SparseArray();
				for (fo fo : list) {
					int n = fo.c();
					int[] arrn = new int[] { fo.a(), fo.b() };
					this.K.put(n, (Object) arrn);
				}
				this.a(fq.c());
				this.a(fq.d());
				this.i(fq.e());
				return;
			}
		} catch (Throwable var1_8) {
			var1_8.printStackTrace();
			return;
		}
		this.y(null);
	}

	private int I() {
		String string = this.d();
		boolean bl = TextUtils.isEmpty((CharSequence) string);
		int n = 0;
		if (!bl) {
			char[] arrc = string.toCharArray();
			int n2 = arrc.length;
			for (int i = 0; i < n2; ++i) {
				int n3 = n + arrc[i];
				n = n3;
			}
		}
		return Math.abs((int) n) % 100;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	private String J() {
		String string;
		String string2;
		try {
			SparseArray sparseArray = this.K;
			string2 = null;
			if (sparseArray == null)
				return string2;
			if (this.K.size() == 0) {
				return null;
			}
			gh gh = new gh(this.e);
			string = "" + gh.p().replaceAll("<>", "");
			if (!TextUtils.isEmpty((CharSequence) string)) {
				this.O[7] = true;
			}
			gh.a();
			List list = fv.a().a(7, "getEvent7Data");
			if (list == null)
				return string;
			if (list.size() == 0)
				return string;
			Iterator iterator = list.iterator();
			string2 = string;
			while (iterator.hasNext()) {
				gf gf = (gf) iterator.next();
				String string3 = gg.a(7, 0, gf.b(), null);
				if (string2.getBytes().length + string3.getBytes().length >= 1000000)
					return string2;
				string2 = string2 + string3;
				fv.a().a(gf, 1);
			}
		} catch (Throwable var1_9) {
			var1_9.printStackTrace();
			return "";
		}
		string = string2;
		return string;
	}

	private String K() {
		Object obj1;
		gh gh1;
		Object obj2;
		gh1 = new gh(e);
		obj1 = (new StringBuilder()).append("")
				.append(gh1.b().replaceAll("<>", "")).toString();
		if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
			O[0] = true;
		}
		obj2 = gh1.d().replaceAll("<>", "");
		Object obj = obj1;
		if (((String) (obj1)).getBytes().length
				+ ((String) (obj2)).getBytes().length >= 0xf4240) {
			// break MISSING_BLOCK_LABEL_330;
		}
		obj1 = (new StringBuilder()).append(((String) (obj1)))
				.append(((String) (obj2))).toString();
		if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
			O[1] = true;
		}
		obj2 = gh1.f().replaceAll("<>", "");
		obj = obj1;
		if (((String) (obj1)).getBytes().length
				+ ((String) (obj2)).getBytes().length >= 0xf4240) {
			// break MISSING_BLOCK_LABEL_330;
		}
		obj1 = (new StringBuilder()).append(((String) (obj1)))
				.append(((String) (obj2))).toString();
		if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
			O[2] = true;
		}
		obj2 = fv.a().a(0, "getEventImmediateData");
		obj = obj1;
		if (obj2 == null) {
			// break MISSING_BLOCK_LABEL_334;
		}
		obj = obj1;
		if (((List) (obj2)).size() == 0) {
			// break MISSING_BLOCK_LABEL_334;
		}
		obj2 = ((List) (obj2)).iterator();
		obj = obj1;
		// break MISSING_BLOCK_LABEL_239;
		// obj;
		((Throwable) (obj)).printStackTrace();
		obj = "";
		// return ((String) (obj));
		do {
			if (!((Iterator) (obj2)).hasNext()) {
				// break MISSING_BLOCK_LABEL_334;
			}
			obj1 = (gf) ((Iterator) (obj2)).next();
			String s1 = gg.a(0, 0L, ((gf) (obj1)).b(), null);
			if (((String) (obj)).getBytes().length + s1.getBytes().length >= 0xf4240) {
				break;
			}
			obj = (new StringBuilder()).append(((String) (obj))).append(s1)
					.toString();
			fv.a().a(((gf) (obj1)), 1);
		} while (true);
		// return ((String) (obj));
		obj2 = fv.a().a(1, "getEventImmediateData");
		obj1 = obj;
		if (obj2 == null) {
			obj2 = fv.a().a(2, "getEventImmediateData");
			obj = obj1;
			if (obj2 == null) {
				// break MISSING_BLOCK_LABEL_580;
			}
			obj = obj1;
			if (((List) (obj2)).size() == 0) {//
												// break
												// MISSING_BLOCK_LABEL_580;
			}
			obj2 = ((List) (obj2)).iterator();
			obj = obj1;
			for (; ((Iterator) (obj2)).hasNext(); fv.a().a(((gf) (obj1)), 1)) {
				obj1 = (gf) ((Iterator) (obj2)).next();
				String s3 = gg.a(2, 0L, ((gf) (obj1)).b(), null);
				if (((String) (obj)).getBytes().length + s3.getBytes().length >= 0xf4240) {
					break; /* Loop/switch isn't completed */
				}
				obj = (new StringBuilder()).append(((String) (obj))).append(s3)
						.toString();
			}

			gh1.a();
			return ((String) (obj));

		} else {

			obj1 = obj;
			if (((List) (obj2)).size() == 0) {

				obj2 = fv.a().a(2, "getEventImmediateData");
				obj = obj1;
				if (obj2 == null) {
					// break MISSING_BLOCK_LABEL_580;
				}
				obj = obj1;
				if (((List) (obj2)).size() == 0) {
					// break MISSING_BLOCK_LABEL_580;
				}
				obj2 = ((List) (obj2)).iterator();
				obj = obj1;
				for (; ((Iterator) (obj2)).hasNext(); fv.a()
						.a(((gf) (obj1)), 1)) {
					obj1 = (gf) ((Iterator) (obj2)).next();
					String s3 = gg.a(2, 0L, ((gf) (obj1)).b(), null);
					if (((String) (obj)).getBytes().length
							+ s3.getBytes().length >= 0xf4240) {
						break; /* Loop/switch isn't completed */
					}
					obj = (new StringBuilder()).append(((String) (obj)))
							.append(s3).toString();
				}

				gh1.a();
				return ((String) (obj));

			} else {

				obj1 = ((List) (obj2)).iterator();

			}

		}

		// _L8:
		if (!((Iterator) (obj1)).hasNext()) {

			obj1 = obj;

			return ((String) (obj));

		} else {
			String s2;
			obj2 = (gf) ((Iterator) (obj1)).next();
			s2 = gg.a(1, 0L, ((gf) (obj2)).b(), null);
			if (((String) (obj)).getBytes().length + s2.getBytes().length >= 0xf4240) {

				return ((String) (obj));

			} else {
				obj = (new StringBuilder()).append(((String) (obj))).append(s2)
						.toString();
				fv.a().a(((gf) (obj2)), 1);

			}

		}
		return ((String) (obj));

	}

	private void L() {
		if (this.Q) {
			return;
		}
		new Thread((Runnable) new Runnable() {

			/*
			 * Unable to fully structure code Enabled aggressive block sorting
			 * Enabled unnecessary exception pruning Lifted jumps to return
			 * sites
			 */
			public void run() {
				String var5_3 = null;
				CharSequence var4_2 = null;
				try {
					if (TextUtils.isEmpty((CharSequence) ge.this.d())) {
						if (fx.a == false)
							return;
						Log.i((String) "DF_QA",
								(String) ("sendAdvertisementData getUseId:" + ge.this
										.d()));
						return;
					}
					if (ge.a(ge.this) || gg.e(ge.this.e) == null) {
						if (fx.a == false)
							return;
						Log.i((String) "DF_QA",
								(String) ("\u65e0\u7f51\u7edc.........." + ge
										.a(ge.this)));
						return;
					}
					ge.a(ge.this, true);
					var4_2 = ge.m(ge.this);
					if (!TextUtils.isEmpty((CharSequence) var4_2)) {
						var5_3 = ge.c().m() != false ? "http://mo.haloapps.com/ad/api/log/ad/write"
								: "http://mo.haloapps.cn/ad/api/log/ad/write";
					} else {
						ge.a(ge.this, false);
						ge.n(ge.this);
						return;
					}
				} catch (Throwable var1_1) {
					if (fx.a) {
						Log.w((String) "system.err", (Throwable) var1_1);
					}
					var1_1.printStackTrace();
					ge.a(ge.this, false);
					ge.n(ge.this);

					if (ge.c().l()) {
						var5_3 = "http://mo.test.haloapps.com/ad/api/log/ad/write";
					}
					String var6_4 = var5_3.substring("http://".length(),
							var5_3.indexOf("/ad/api"));
					boolean var7_5 = ge.a(ge.this, ge.this.d(),
							(String) var4_2, var5_3, null, "4", true);
					if (!var7_5) {
						String var8_6 = ge.a(ge.this, "adurl_ip");
						if (!TextUtils.isEmpty((CharSequence) var8_6)) {
							var7_5 = ge.a(ge.this, ge.this.d(),
									(String) var4_2, var5_3.replace(
											(CharSequence) var6_4,
											(CharSequence) var8_6), var6_4,
									"4", true);
						}
					} else {
						String var12_8 = gg.e(var6_4);
						if (fx.a) {
							Log.i((String) "DF_QA",
									(String) ("sendAdvertisementData() ip:" + var12_8));
							Log.i((String) "DF_QA",
									(String) ("sendAdvertisementData() newURL:" + var5_3
											.replace((CharSequence) var6_4,
													(CharSequence) var12_8)));
						}
						if (!TextUtils.isEmpty((CharSequence) var12_8)) {
							ge.a(ge.this, "adurl_ip", var12_8);
						}
					}
					if (!var7_5) {
						gh var9_7 = new gh(ge.this.e);
						if (ge.d(ge.this) != null && ge.d(ge.this)[7]) {
							ge.d((ge) ge.this)[7] = false;
						}
						var9_7.a();
						fv.a().e();
					} else {
						gh var10_9 = new gh(ge.this.e);
						if (ge.d(ge.this) != null && ge.d(ge.this)[7]) {
							var10_9.q();
							ge.d((ge) ge.this)[7] = false;
						}
						var10_9.a();
						fv.a().f();
						fv.a().h();
					}
					// lbl48: // 5 sources:
					// ge.a(ge.this, false);
					// ge.n(ge.this);
					// return;
				}
			}
		}).start();
	}

	private boolean M() {
		String string;
		int n = 1;
		if (this.Q
				|| TextUtils.isEmpty((CharSequence) (string = this
						.l("onlyWifi")))) {
			return Boolean.valueOf(String.valueOf(n));
		}
		if (gg.b(string) != n) {
			n = 0;
		}
		this.t = Boolean.valueOf(String.valueOf(n));
		return this.t;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private long N() {
		String string;
		if (this.Q
				|| TextUtils.isEmpty((CharSequence) (string = this
						.l("interval")))) {
			return 0;
		}
		this.L = gg.c(string);
		return this.L;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private long O() {
		String string;
		if (this.Q
				|| TextUtils
						.isEmpty((CharSequence) (string = this.l("recount")))) {
			return 0;
		}
		this.M = gg.b(string);
		return this.M;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean P() {
		String string;
		int n = 1;
		if (this.Q
				|| TextUtils
						.isEmpty((CharSequence) (string = this.l("stable")))) {
			return false;
		}
		if (gg.b(string) != n) {
			n = 0;
		}
		this.N = Boolean.valueOf(String.valueOf(n));
		return this.N;
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * Lifted jumps to return sites
	 */
	private void Q() {
		if (fx.a) {
			Log.i((String) "DF_QA",
					(String) ("sendReal ................." + this.P()));
		}
		if (this.z)
			return;
		if (!this.P()) {
			return;
		}
		gh gh = new gh(this.e);
		boolean bl = gh.Q();
		gh.a();
		if (bl)
			return;
		this.z = true;
		try {
			new Thread((Runnable) new Runnable() {

				/*
				 * Enabled force condition propagation Lifted jumps to return
				 * sites
				 */
				public void run() {
					try {
						String string = ga.a(ge.this.d());
						if (fx.a) {
							Log.i((String) "DF_QA",
									(String) ("sendReal result:" + string));
						}
						if ("ok".toString().trim()
								.equals((Object) string.toString().trim())) {
							gh gh = new gh(ge.this.e);
							gh.P();
							gh.a();
							do {
								return;
								// break;
							} while (true);
						}
						ge.this.G.sendEmptyMessageDelayed(300, 1800000);
						return;
					} catch (Throwable var3_3) {
						var3_3.printStackTrace();
						return;
					} finally {
						ge.this.z = false;
					}
				}
			}).start();
			return;
		} catch (Throwable var3_3) {
			return;
		}
	}

	private void a(int paramInt) {
		if (this.Q) {
		}

		this.M = paramInt;
		c("recount", String.valueOf(this.M));
		if (fx.a) {
			Log.i("DF_QA", "setInterval:" + this.L);
		}
		return;
	}

	private void a(long paramLong) {
		if (this.Q) {
		}

		this.L = paramLong;
		c("interval", String.valueOf(this.L));
		if (fx.a) {
			Log.i("DF_QA", "setInterval:" + this.L);
		}
		return;
	}

	private void a(String string, String string2, String string3,
			String string4, String string5) {
		if (fx.a) {
			Log.i((String) "DF_QA", (String) ("startAgent ............. " + J));
		}
		this.m(string);
		this.n(string2);
		this.o(string3);
		this.p(string4);
		this.q(string5);
		if (this.O == null) {
			this.O = new boolean[10];
		}
		if (this.K == null || this.K.size() == 0) {
			this.H();
		}
		if (J == 0) {
			try {
				if (!this.I) {
					IntentFilter intentFilter = new IntentFilter();
					intentFilter
							.addAction("android.net.conn.CONNECTIVITY_CHANGE");
					intentFilter.addAction("android.intent.action.SCREEN_OFF");
					this.e.registerReceiver(this.H, intentFilter);
					this.I = true;
				}
			} catch (Throwable var6_7) {
				var6_7.printStackTrace();
			}
		}
		this.h(gg.f(this.e));
		J = 1 + J;
		this.Q();
	}

	private boolean a(String string, String string2, String string3,
			String string4, String string5, boolean bl) {
		try {
			HashMap hashMap;
			int n = gg.b(gg.a(this.e)) / 100;
			String string6 = ga.a(string, string2, string3, string4, bl,
					(String) fx.d.get(n, (Object) "UN"));
			if (fx.a) {
				Log.i((String) "DF_QA",
						(String) ("onEvent_immediate address:" + string4));
			}
			if ((hashMap = gg.a(string6)) != null && hashMap.size() != 0
					&& "ok".equals(hashMap.get((Object) "content"))) {
				long l = gg.c((String) hashMap.get((Object) "date"));
				if (l == 0)
					return true;
				this.E = l - System.currentTimeMillis();
				return true;
			}
			if (fx.a) {
				Log.i((String) "DF_QA",
						(String) "\u53d1\u9001\u6570\u636e\u5931\u8d25");
			}
			if (hashMap == null)
				return false;
			if ("error".equals(hashMap.get((Object) "content")))
				return false;
			if (TextUtils.isEmpty((CharSequence) ((CharSequence) hashMap
					.get((Object) "hc"))))
				return false;
			if (!TextUtils.isEmpty((CharSequence) string4))
				return false;
			ga.a(this.e, string, (String) hashMap.get((Object) "hc"), string5);
			return false;
		} catch (Throwable var7_11) {
			var7_11.printStackTrace();
			return false;
		}
	}

	/**
	 * @deprecated
	 */
	private boolean a(String paramString1, String paramString2,
			boolean paramBoolean) {
		boolean bool1 = false;
		for (;;) {
			int i2;
			try {
				boolean bool2 = TextUtils.isEmpty(paramString1);
				if (bool2) {
					return bool1;
				}
				try {
					if (TextUtils.isEmpty(this.c)) {
						if (this.e == null) {
							bool1 = false;
						}
						a(this.e);
					}
					File localFile1 = new File(this.c + "/" + paramString2);
					File localFile2 = localFile1.getParentFile();
					if (localFile2 != null) {
					}
					StringBuffer localStringBuffer = null;
					try {
						if (!localFile2.exists()) {
							localFile2.mkdirs();
						}
						localStringBuffer = new StringBuffer();
						if (!paramBoolean) {
							localStringBuffer.append(c(this.e)).append(f);
							String[] arrayOfString3 = paramString1.split(";");
							int i3 = arrayOfString3.length;
							int i4 = 0;
							if (i4 >= i3) {
								continue;
							}
							localStringBuffer.append(arrayOfString3[i4])
									.append(f);
							i4++;
							continue;
						}
					} catch (Throwable localThrowable2) {
						localThrowable2.printStackTrace();
						bool1 = false;
					}
					String[] arrayOfString1 = paramString1.split(";");
					int i1 = arrayOfString1.length;
					i2 = 0;
					if (i2 < i1) {
						String[] arrayOfString2 = arrayOfString1[i2].split(",");
						if (arrayOfString2.length != 4) {
							i2++;
						}
						localStringBuffer.append("[").append(f);
						long l1 = gg.c(arrayOfString2[1]);
						localStringBuffer.append(
								new SimpleDateFormat("yyyy-MM-dd kk:mm:ss",
										Locale.US).format(new Date(l1)))
								.append(f);
						localStringBuffer.append(arrayOfString2[2]).append(f);
						localStringBuffer.append("]").append(f);
						i2++;
					}
					String str = localStringBuffer.toString();
					if (fx.a) {
						Log.i("DF_QA", "con:" + str);
					}
					FileOutputStream localFileOutputStream = new FileOutputStream(
							localFile1);
					OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(
							localFileOutputStream, "utf-8");
					localOutputStreamWriter.write(str);
					localOutputStreamWriter.close();
					localFileOutputStream.close();
					bool1 = true;
				} catch (Throwable localThrowable1) {
					localThrowable1.printStackTrace();
				}
				// continue;
				bool1 = false;
			} finally {
			}
			// label446: continue;
			// label452: i2++;
		}
	}

	private void b(int n) {
		if (this.Q) {
			return;
		}
		this.S = n;
		this.c("optOutEnabled", String.valueOf((int) this.S));
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setOptOutEnabled:" + this.S));
	}

	/* Error */
	/**
	 * @deprecated
	 */
	// private void b(final int n, final String string, final String string2) {
	// final ge ge = this;
	// // MONITORENTER : ge
	// try {
	// new Thread((Runnable) new Runnable() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// @SuppressWarnings("static-access")
	// public void run() {
	// String string8 = ge.this.d();
	// if (fx.a) {
	// Log.i((String) "DF_QA",
	// (String) ("onEvent_immediate id :" + ge.this.g));
	// }
	// String string22 = gg.a(n, 0, string, string2);
	// if (fx.a) {
	// Log.i((String) "DF_QA",
	// (String) ("onEvent_immediate data1:" + string22));
	// }
	// String string3 = "";
	// switch (2) {
	// case 0: {
	// if (ge.c().m()) {
	// string3 = "http://locker.dr.lockerma.com/l/api/log/timely/write";
	// break;
	// }
	// string3 = "http://dr.qiigame.com/l/api/log/timely/write";
	// break;
	// }
	// case 1: {
	// if (ge.c().m()) {
	// string3 = "http://dr.holalauncher.com/l/api/log/timely/write";
	// break;
	// }
	// string3 = "http://dr.holaworld.cn/l/api/log/timely/write";
	// break;
	// }
	// case 2: {
	// if (ge.c().m()) {
	// string3 = "http://dr.lazyswipe.com/l/api/log/timely/write";
	// break;
	// }
	// string3 = "http://dr.lazyswipe.cn/l/api/log/timely/write";
	// break;
	// }
	// case 3: {
	// string3 = ge.c().m() ? "http://dr.privacyace.com/l/api/log/timely/write"
	// : "http://dr.privacyace.cn/l/api/log/timely/write";
	// }
	// }
	// String string4 = ge.c().l() ?
	// "http://log.test.qiigame.com/l/api/log/timely/write"
	// : string3;
	// String string5 = string4.substring("http://".length(),
	// string4.indexOf("/l/api"));
	// boolean bl = ge.this.a(string8, string22, string4, null,
	// "1", true);
	// if (!bl) {
	// String string6 = ge.this.l("iurl_ip");
	// if (!TextUtils.isEmpty((CharSequence) string6)) {
	// bl = ge.this.a(string8, string22, string4.replace(
	// (CharSequence) string5,
	// (CharSequence) string6), string5, "1", true);
	// }
	// } else {
	// String string7 = gg.e(string5);
	// if (fx.a) {
	// Log.i((String) "DF_QA",
	// (String) ("onEvent_immediate ip:" + string7));
	// Log.i((String) "DF_QA",
	// (String) ("onEvent_immediate newURL:" + string4
	// .replace((CharSequence) string5,
	// (CharSequence) string7)));
	// }
	// if (!TextUtils.isEmpty((CharSequence) string7)) {
	// ge.this.c("iurl_ip", string7);
	// }
	// }
	// if (!(bl || ge.this.O == null || ge.this.O[n])) {
	// gh gh = new gh(ge.this.e);
	// if (n == 2) {
	// gh.c(string22);
	// } else if (n == 0) {
	// gh.a(string22);
	// } else if (n == 1) {
	// gh.b(string22);
	// }
	// gh.a();
	// }
	// }
	// }).start();
	//
	// return;
	// } catch (Throwable var4_5) {
	// return;
	// }
	// }
	private void b(final int i1, final String s1, final String s2) {

		new Thread(new Runnable() {

			int a = i1;
			String b = s1;
			String c = s2;
			ge d = ge.this;

			public void run() {
				Object obj;
				String s3;
				String s4;
				s4 = d.d();
				if (fx.a) {
					Log.i("DF_QA",
							(new StringBuilder())
									.append("onEvent_immediate id :")
									.append(ge.c(d)).toString());
				}
				s3 = gg.a(a, 0L, b, c);
				if (fx.a) {
					Log.i("DF_QA",
							(new StringBuilder())
									.append("onEvent_immediate data1:")
									.append(s3).toString());
				}
				obj = "";
				// 2;
				// JVM INSTR tableswitch 0 3: default 128
				// 0 288
				// 1 309
				// 2 330
				// 3 351;
				// goto _L1 _L2 _L3 _L4 _L5
				switch (i1) {
				case 1:

					if (ge.c().m()) {
						obj = "http://locker.dr.lockerma.com/l/api/log/timely/write";
					} else {
						obj = "http://dr.qiigame.com/l/api/log/timely/write";
					}
					if (ge.c().l()) {
						obj = "http://log.test.qiigame.com/l/api/log/timely/write";
					}
					String s6 = ((String) (obj)).substring("http://".length(),
							((String) (obj)).indexOf("/l/api"));
					boolean flag1 = ge.a(d, s4, s3, ((String) (obj)), null,
							"1", true);
					boolean flag;
					if (!flag1) {
						String s7 = ge.a(d, "iurl_ip");
						flag = flag1;
						if (!TextUtils.isEmpty(s7)) {
							flag = ge.a(d, s4, s3,
									((String) (obj)).replace(s6, s7), s6, "1",
									true);
						}
					} else {
						String s5 = gg.e(s6);
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate ip:")
											.append(s5).toString());
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate newURL:")
											.append(((String) (obj)).replace(
													s6, s5)).toString());
						}
						flag = flag1;
						if (!TextUtils.isEmpty(s5)) {
							ge.a(d, "iurl_ip", s5);
							flag = flag1;
						}
					}
					if (!flag && ge.d(d) != null && !ge.d(d)[a]) {
						obj = new gh(d.e);
						if (a == 2) {
							((gh) (obj)).c(s3);
						} else if (a == 0) {
							((gh) (obj)).a(s3);
						} else if (a == 1) {
							((gh) (obj)).b(s3);
						}
						((gh) (obj)).a();
					}
					return;
				case 2:
					if (ge.c().m()) {
						obj = "http://dr.holalauncher.com/l/api/log/timely/write";
					} else {
						obj = "http://dr.holaworld.cn/l/api/log/timely/write";
					}
					if (ge.c().l()) {
						obj = "http://log.test.qiigame.com/l/api/log/timely/write";
					}
					s6 = ((String) (obj)).substring("http://".length(),
							((String) (obj)).indexOf("/l/api"));
					flag1 = ge.a(d, s4, s3, ((String) (obj)), null, "1", true);

					if (!flag1) {
						String s7 = ge.a(d, "iurl_ip");
						flag = flag1;
						if (!TextUtils.isEmpty(s7)) {
							flag = ge.a(d, s4, s3,
									((String) (obj)).replace(s6, s7), s6, "1",
									true);
						}
					} else {
						String s5 = gg.e(s6);
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate ip:")
											.append(s5).toString());
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate newURL:")
											.append(((String) (obj)).replace(
													s6, s5)).toString());
						}
						flag = flag1;
						if (!TextUtils.isEmpty(s5)) {
							ge.a(d, "iurl_ip", s5);
							flag = flag1;
						}
					}
					if (!flag && ge.d(d) != null && !ge.d(d)[a]) {
						obj = new gh(d.e);
						if (a == 2) {
							((gh) (obj)).c(s3);
						} else if (a == 0) {
							((gh) (obj)).a(s3);
						} else if (a == 1) {
							((gh) (obj)).b(s3);
						}
						((gh) (obj)).a();
					}
					return;
				case 3:
					if (ge.c().m()) {
						obj = "http://dr.lazyswipe.com/l/api/log/timely/write";
					} else {
						obj = "http://dr.lazyswipe.cn/l/api/log/timely/write";
					}
					if (ge.c().l()) {
						obj = "http://log.test.qiigame.com/l/api/log/timely/write";
					}
					s6 = ((String) (obj)).substring("http://".length(),
							((String) (obj)).indexOf("/l/api"));
					flag1 = ge.a(d, s4, s3, ((String) (obj)), null, "1", true);

					if (!flag1) {
						String s7 = ge.a(d, "iurl_ip");
						flag = flag1;
						if (!TextUtils.isEmpty(s7)) {
							flag = ge.a(d, s4, s3,
									((String) (obj)).replace(s6, s7), s6, "1",
									true);
						}
					} else {
						String s5 = gg.e(s6);
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate ip:")
											.append(s5).toString());
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate newURL:")
											.append(((String) (obj)).replace(
													s6, s5)).toString());
						}
						flag = flag1;
						if (!TextUtils.isEmpty(s5)) {
							ge.a(d, "iurl_ip", s5);
							flag = flag1;
						}
					}
					if (!flag && ge.d(d) != null && !ge.d(d)[a]) {
						obj = new gh(d.e);
						if (a == 2) {
							((gh) (obj)).c(s3);
						} else if (a == 0) {
							((gh) (obj)).a(s3);
						} else if (a == 1) {
							((gh) (obj)).b(s3);
						}
						((gh) (obj)).a();
					}
					return;
				case 4:
					if (ge.c().m()) {
						obj = "http://dr.privacyace.com/l/api/log/timely/write";
					} else {
						obj = "http://dr.privacyace.cn/l/api/log/timely/write";
					}
					if (ge.c().l()) {
						obj = "http://log.test.qiigame.com/l/api/log/timely/write";
					}
					s6 = ((String) (obj)).substring("http://".length(),
							((String) (obj)).indexOf("/l/api"));
					flag1 = ge.a(d, s4, s3, ((String) (obj)), null, "1", true);

					if (!flag1) {
						String s7 = ge.a(d, "iurl_ip");
						flag = flag1;
						if (!TextUtils.isEmpty(s7)) {
							flag = ge.a(d, s4, s3,
									((String) (obj)).replace(s6, s7), s6, "1",
									true);
						}
					} else {
						String s5 = gg.e(s6);
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate ip:")
											.append(s5).toString());
							Log.i("DF_QA",
									(new StringBuilder())
											.append("onEvent_immediate newURL:")
											.append(((String) (obj)).replace(
													s6, s5)).toString());
						}
						flag = flag1;
						if (!TextUtils.isEmpty(s5)) {
							ge.a(d, "iurl_ip", s5);
							flag = flag1;
						}
					}
					if (!flag && ge.d(d) != null && !ge.d(d)[a]) {
						obj = new gh(d.e);
						if (a == 2) {
							((gh) (obj)).c(s3);
						} else if (a == 0) {
							((gh) (obj)).a(s3);
						} else if (a == 1) {
							((gh) (obj)).b(s3);
						}
						((gh) (obj)).a();
					}
					return;

				}

				{
					d = ge.this;
					a = i1;
					b = s1;
					c = s2;
					// super();
				}
			}
		}).start();

		// Misplaced declaration of an exception variable

	}

	public static ge c() {
		if (F == null) {
			F = new ge();
		}
		return F;
	}

	private String c(Context paramContext) {
		String str = null;
		if (TextUtils.isEmpty(d())) {
			if (fx.a) {
				Log.i("DF_QA", "未获�?�到useId");
			}
		}

		int i1 = gg.b(gg.a(paramContext)) / 100;
		DisplayMetrics localDisplayMetrics = new DisplayMetrics();
		((WindowManager) paramContext.getSystemService("window"))
				.getDefaultDisplay().getMetrics(localDisplayMetrics);
		int i2 = localDisplayMetrics.widthPixels;
		int i3 = localDisplayMetrics.heightPixels;
		if (fx.a) {
			Log.i("DF_QA", "mSW1:" + i2 + ",mSH1:" + i3);
		}
		str = C[0] + ":" + d() + "`" + C[1] + ":" + gg.b(paramContext) + "`"
				+ C[2] + ":" + gg.c(paramContext) + "`" + C[3] + ":"
				+ (String) fx.d.get(i1, "UN") + "`" + C[4] + ":"
				+ gg.a(paramContext) + "`" + C[5] + ":" + gg.k(paramContext)
				+ "`" + C[6] + ":" + gg.d() + "`" + C[7] + ":" + gg.a() + "`"
				+ C[8] + ":" + e() + "`" + C[9] + ":" + f() + "`" + C[10] + ":"
				+ g() + "`" + C[11] + ":" + h() + "`" + C[12] + ":" + i() + "`"
				+ C[13] + ":" + gg.b() + "`" + C[14] + ":" + Math.min(i2, i3)
				+ "`" + C[15] + ":" + Math.max(i2, i3);
		return str;

	}

	private void c(String paramString1, String paramString2) {
		try {
			if (TextUtils.isEmpty(this.c)) {
				if (this.e != null) {
					a(this.e);
				}
			} else {
				if (this.a == null) {
					this.a = new fw(this.c + "/ConfigData/" + "config.ini");
				}
				this.a.a(paramString1, paramString2);
				this.a.b();
			}
			return;
		} catch (Throwable localThrowable) {

			localThrowable.printStackTrace();

		}
	}

	private boolean d(Context context) {
		boolean bl = true;
		if (this.Q) {
			return false;
		}
		if (!this.M())
			return bl;
		if (!gg.f(context))
			return false;
		return bl;
	}

	private void g(boolean paramBoolean) {
		this.w = paramBoolean;
		if (this.w) {
		}
		for (String str = "1";; str = "0") {
			c("dataState", str);
			if (fx.a) {
				Log.i("DF_QA", "setSend:" + this.w);
			}
			return;
		}
	}

	private void h(boolean bl) {
		long l = System.currentTimeMillis();
		gh gh = new gh(this.e);
		long l2 = gh.L();
		long l3 = gh.N();
		long l4 = gh.M();
		long l5 = l - l2 > 0 ? l - l2 : 0;
		long l6 = l - l3 > 0 ? l - l3 : 0;
		long l7 = l - l4 > 0 ? l - l4 : 0;
		if (!this.G.hasMessages(100)) {
			Handler handler = this.G;
			long l8 = 86400000 - l5 > 0 ? 86400000 - l5 : 50;
			handler.sendEmptyMessageDelayed(100, l8);
		}
		if (!(this.G.hasMessages(200) || this.v)) {
			long l9;
			this.v = true;
			Handler handler = this.G;
			long l10 = bl ? 3600000 : 21600000;
			if (l10 - l6 > 0) {
				long l11 = bl ? 3600000 : 21600000;
				l9 = l11 - l6;
			} else {
				l9 = 50;
			}
			handler.sendEmptyMessageDelayed(200, l9);
		}
		if (!this.A) {
			this.A = true;
			Handler handler = this.G;
			long l12 = 86400000 - l7 > 0 ? 86400000 - l7 : 50;
			handler.sendEmptyMessageDelayed(400, l12);
		}
		if (bl) {
			boolean bl2 = gh.Q();
			if (fx.a) {
				Log.i((String) "DF_QA",
						(String) ("sendMessage \u53d1\u9001real" + bl2));
			}
			if (!(bl2 || this.G.hasMessages(300))) {
				this.G.sendEmptyMessageDelayed(300, 50);
			}
			gh.a();
		}
	}

	private void i(boolean paramBoolean) {
		if (this.Q) {
			return;
		}
		this.N = paramBoolean;
		if (this.N) {
		}
		for (String str = "1";; str = "0") {
			c("stable", str);
			if (!fx.a) {
				break;
			}
			Log.i("DF_QA", "setStable:" + this.N);
			break;
		}
	}

	private String l(String s1) {
		// label0:
		// {
		if (TextUtils.isEmpty(c)) {
			if (e == null) {

			}
			a(e);
		}
		if (a == null) {
			a = new fw((new StringBuilder()).append(c).append("/ConfigData/")
					.append("config.ini").toString());
		}
		if (!TextUtils.isEmpty(a.c(s1))) {
			return a.c(s1);
		}

		// }

		return "";
	}

	private void m(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		} else {
			this.h = string;
			if (TextUtils.isEmpty((CharSequence) this.c)) {
				if (this.e == null)
					return;
				{
					this.a(this.e);
				}
			}
			this.c("woeId", string);
			if (!fx.a) {
				return;
			}
			Log.i((String) "DF_QA", (String) ("setWoeId:" + this.h));
		}
	}

	private void n(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		this.i = string;
		this.c("productId", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setProductId:" + this.i));
	}

	private void o(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		this.j = string;
		this.c("supplierId", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setSupplierId:" + this.j));
	}

	private void p(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		this.k = string;
		this.c("channelId", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setChannelId:" + this.k));
	}

	private void q(String string) {
		if (TextUtils.isEmpty((CharSequence) string))
			return;
		this.l = string;
		if (TextUtils.isEmpty((CharSequence) this.c)) {
			if (this.e == null)
				return;
			{
				this.a(this.e);
			}
		}
		this.c("versionCode", string);
		if (!fx.a) {
			return;
		}
		Log.i((String) "DF_QA", (String) ("setVersionCode:" + this.l));
	}

	private void r(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		this.r = string;
		this.c("sendRule", string);
	}

	private void s(String string) {
		if (!TextUtils.isEmpty((CharSequence) string)) {
			String[] arrstring = string.split("<>");
			fv.a().b();
			int n = arrstring.length;
			for (int i = 0; i < n; ++i) {
				String[] arrstring2 = arrstring[i].replaceAll(";", "").split(
						",");
				if (arrstring2.length != 4)
					continue;
				fv.a().b(arrstring2[3]);
				fv.a().a(gg.c(arrstring2[1]), arrstring2[2],
						gg.b(arrstring2[0]), arrstring2[3], 0);
			}
			fv.a().c();
		}
	}

	private void t(String paramString) {

		int i2 = 0;
		try {
			if (!TextUtils.isEmpty(paramString)) {
				String[] arrayOfString1 = paramString.split("<>");
				fv.a().b();
				int i1 = arrayOfString1.length;
				i2 = 0;
				if (i2 >= i1) {
					fv.a().c();
				}
				String[] arrayOfString2 = arrayOfString1[i2]
						.replaceAll(";", "").split(",");
				if (arrayOfString2.length == 3) {
					fv.a().a(gg.c(arrayOfString2[1]), arrayOfString2[2],
							gg.b(arrayOfString2[0]), "", 0L);
				} else if (arrayOfString2.length == 4) {
					fv.a().a(gg.c(arrayOfString2[1]), arrayOfString2[2],
							gg.b(arrayOfString2[0]), arrayOfString2[3], 0L);
				}
			}
		} catch (Throwable localThrowable) {
			localThrowable.printStackTrace();
		}

		i2++;

	}

	private void u(String string) {
		if (!TextUtils.isEmpty((CharSequence) string)) {
			String[] arrstring = string.split("<>");
			fv.a().b();
			int n = arrstring.length;
			for (int i = 0; i < n; ++i) {
				String string2 = arrstring[i].replaceAll(";", "");
				String[] arrstring2 = string2.split(",");
				if (arrstring2.length < 3)
					continue;
				long l = gg.c(arrstring2[1]);
				if (!(l != 0 || "E3".equals((Object) arrstring2[2]) || this.w() >= 50)) {
					this.b("E3", "writeSQL s:" + string2);
					this.x();
					continue;
				}
				if (arrstring2.length == 3) {
					if (fv.a().j() >= 12000) {
						fv.a().k();
					}
					fv.a().a(l, arrstring2[2], gg.b(arrstring2[0]), "", 0);
					continue;
				}
				if (arrstring2.length != 4)
					continue;
				if (fv.a().j() >= 12000) {
					fv.a().k();
				}
				fv.a().a(l, arrstring2[2], gg.b(arrstring2[0]), arrstring2[3],
						0);
			}
			fv.a().c();
		}
	}

	private void v(String paramString) {
		if (!TextUtils.isEmpty(paramString)) {
			String[] arrayOfString1 = paramString.split("<>");
			fv.a().b();
			int i1 = arrayOfString1.length;
			for (int i2 = 0; i2 < i1; i2++) {
				String[] arrayOfString2 = arrayOfString1[i2]
						.replaceAll(";", "").split(",");
				if (arrayOfString2.length == 3) {
					if (fv.a().j() >= 12000) {
						fv.a().k();
					}
					fv.a().a(arrayOfString2[2], gg.c(arrayOfString2[1]));
				}
			}
			fv.a().c();
		}
	}

	private void w(String paramString) {
		if (this.Q) {
		}

		try {
			new Thread().start();
		} catch (Throwable localThrowable) {
		}

	}

	private fq x(String string) {
		int n = 1;
		int n2 = 0;
		fq fq = new fq();
		try {
			JSONObject jSONObject = new JSONObject(string);
			boolean bl = jSONObject.getBoolean("success");
			int n3 = jSONObject.getInt("statusCode");
			fq.a(bl);
			fq.a(n3);
			fq.a(jSONObject.getLong("interval"));
			fq.b(jSONObject.getInt("recount"));
			if (jSONObject.getInt("stable") != n) {
				n = 0;
			}
			fq.b(bl);
			ArrayList arrayList = new ArrayList();
			JSONArray jSONArray = jSONObject.getJSONArray("rules");
			int n4 = jSONArray.length();
			for (; n2 < n4; ++n2) {
				JSONObject jSONObject2 = jSONArray.getJSONObject(n2);
				fo fo = new fo();
				fo.a(jSONObject2.getInt("start"));
				fo.b(jSONObject2.getInt("end"));
				fo.c(jSONObject2.getInt("type"));
				arrayList.add((Object) fo);
			}
			fq.a((List) arrayList);
			return fq;
		} catch (JSONException var6_13) {
			var6_13.printStackTrace();
			return fq;
		}
	}

	private void y(final String s1) {
		if (fx.a) {
			Log.d("DF_QA", "requestSendRule");
		}
		if (x) {
			return;
		}
		try {
			(new Thread(new Runnable() {

				final String a;
				final ge b;

				public void run() {
					ge.g(b, true);
					Object obj = "";
					String str = null;

					// JVM INSTR tableswitch 0 3: default 822
					// 0 235
					// 1 250
					// 2 265
					// 3 280;
					// goto _L1 _L2 _L3 _L4 _L5
					// _L1:
					// if (ge.c().l()) {
					str = "http://log.test.qiigame.com/l/api/eventCollectRule/rule";
					// }
					Object obj2;
					String s2;
					String s4;
					obj2 = ((String) (str)).substring("http://".length(),
							((String) (str)).indexOf("/l/api"));
					s2 = b.d();
					s4 = a;
					Object obj1;
					long l1;
					if (TextUtils.isEmpty(a)) {
						obj1 = null;
					} else {
						obj1 = obj2;
					}
					s2 = ga.a(s2, s4, ((String) (obj1)));
					if (fx.a) {
						Log.i("DF_QA",
								(new StringBuilder())
										.append("requestSendRule address:")
										.append(((String) (obj2))).toString());
					}
					l1 = System.currentTimeMillis();
					obj1 = new gh(b.e);
					((gh) (obj1)).a(l1 - 0x44aa200L);
					((gh) (obj1)).a();
					if (TextUtils.isEmpty(s2)) {

						if (fx.a) {
							Log.e("DF_QA", "requestSendRule return null");
						}
						ge.g(b, false);
						return;

					} else {

						if (!s2.startsWith("<html>")
								&& !s2.startsWith("<!DOCTYPE")) {

							obj1 = ge.i(b, s2);
							if (!((fq) (obj1)).a()) {
								HashMap hashmap = gg.a(s2);
								if (!TextUtils.isEmpty((CharSequence) hashmap
										.get("hc"))) {
									String s3 = ge.a(b, "surl_ip");
									if (TextUtils.isEmpty(a)) {
										ga.a(b.e, b.d(),
												(String) hashmap.get("hc"), "0");
										if (!TextUtils.isEmpty(s3)) {
											ge.b(b,
													((String) (str))
															.replace(
																	((CharSequence) (obj2)),
																	s3));
										}
									}
								}
								if (fx.a) {
									Log.e("DF_QA", "requestSendRule Failt");
								}

								try {
									ge.g(b, false);

								}
								// Misplaced declaration of an exception
								// variable
								catch (Exception exception) {
								} finally {
									ge.g(b, false);

								}
								ge.g(b, false);
								return;

							} else {

								if (TextUtils.isEmpty(a)) {
									String s5 = gg.e(((String) (obj2)));
									if (fx.a) {
										Log.i("DF_QA", (new StringBuilder())
												.append("requestSendRule ip:")
												.append(s5).toString());
										Log.i("DF_QA",
												(new StringBuilder())
														.append("requestSendRule newURL:")
														.append(((String) (str))
																.replace(
																		((CharSequence) (obj2)),
																		s5))
														.toString());
									}
									if (!TextUtils.isEmpty(s5)) {
										ge.a(b, "surl_ip", s5);
									}
								}
								ge.j(b, s2);
								long l2 = System.currentTimeMillis();
								obj = new gh(b.e);
								((gh) (obj)).a(l2);
								((gh) (obj)).a();
								obj = ((fq) (obj1)).b();
								ge.a(b, new SparseArray());
								int i1;
								int j1;
								int k1;
								for (obj = ((List) (obj)).iterator(); ((Iterator) (obj))
										.hasNext(); ge.l(b).put(i1,
										new int[] { j1, k1 })) {
									obj2 = (fo) ((Iterator) (obj)).next();
									i1 = ((fo) (obj2)).c();
									j1 = ((fo) (obj2)).a();
									k1 = ((fo) (obj2)).b();
								}

								ge.a(b, ((fq) (obj1)).c());
								ge.c(b, ((fq) (obj1)).d());
								ge.h(b, ((fq) (obj1)).e());
								// obj;
								((Throwable) (obj)).printStackTrace();
								ge.g(b, false);
								return;
								//

							}

						} else {

							if (fx.a) {
								Log.e("DF_QA", "requestSendRule Err");
							}
							ge.g(b, false);
						}

					}

					if (ge.c().m()) {
						str = "http://locker.dc.lockerma.com/l/api/eventCollectRule/rule";
					} else {
						str = "http://dc.qiigame.com/l/api/eventCollectRule/rule";
					}
					if (ge.c().m()) {
						str = "http://dc.holalauncher.com/l/api/eventCollectRule/rule";
					} else {
						str = "http://dc.holaworld.cn/l/api/eventCollectRule/rule";
					}
					if (ge.c().m()) {
						str = "http://dc.lazyswipe.com/l/api/eventCollectRule/rule";
					} else {
						str = "http://dc.lazyswipe.cn/l/api/eventCollectRule/rule";
					}

					if (ge.c().m()) {
						str = "http://dc.privacyace.com/l/api/eventCollectRule/rule";
					} else {
						str = "http://dc.privacyace.cn/l/api/eventCollectRule/rule";
					}

				}

				{
					b = ge.this;
					a = s1;

				}
			})).start();
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return;
		}
	}

	private String y() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.o)) {
			this.o = this.l("appsflyer_productid");
		}
		return this.o;
	}

	private String z() {
		if (this.Q) {
		}
		for (String str = "";; str = this.r) {

			if (TextUtils.isEmpty(this.r)) {
				this.r = l("sendRule");
				return str;
			}
		}

	}

	private void z(String string) {
		if (this.Q) {
			return;
		}
		if (TextUtils.isEmpty((CharSequence) string)) {
			string = "none";
		}
		this.R = string;
		this.c("advertisingId", URLEncoder.encode((String) this.R));
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setAdvertisingId:" + this.R));
	}

	public void a() {
		if (fx.a) {
			Log.i((String) "DF_QA", (String) ("stopAgent ............. " + J
					+ ",pid:" + Process.myPid() + ",tid:" + Process.myTid()));
		}
		if ((ge.J = -1 + J) == 0) {
			this.b();
		}
		if (J < 0) {
			J = 0;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public void a(final int n, final String string, final String string2) {
		final ge ge = this;
		// MONITORENTER : ge
		try {
			new Thread((Runnable) new Runnable() {

				/*
				 * Enabled aggressive block sorting
				 */
				public void run() {
					String string8 = ge.this.d();
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) ("sendADData id :" + ge.this.g));
					}
					String string22 = gg.a(n, 0, string, string2);
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) ("sendADData data1:" + string22));
					}
					String string3 = ge.c().m() ? "http://mo.haloapps.com/ad/api/log/ad/write"
							: "http://mo.haloapps.cn/ad/api/log/ad/write";
					String string4 = ge.c().l() ? "http://mo.test.haloapps.com/ad/api/log/ad/write"
							: string3;
					String string5 = string4.substring("http://".length(),
							string4.indexOf("/ad/api"));
					boolean bl = ge.this.a(string8, string22, string4, null,
							"4", true);
					if (!bl) {
						String string6 = ge.this.l("adurl_ip");
						if (!TextUtils.isEmpty((CharSequence) string6)) {
							bl = ge.this.a(string8, string22, string4.replace(
									(CharSequence) string5,
									(CharSequence) string6), string5, "4", true);
						}
					} else {
						String string7 = gg.e(string5);
						if (fx.a) {
							Log.i((String) "DF_QA",
									(String) ("onEvent_immediate ip:" + string7));
							Log.i((String) "DF_QA",
									(String) ("onEvent_immediate newURL:" + string4
											.replace((CharSequence) string5,
													(CharSequence) string7)));
						}
						if (!TextUtils.isEmpty((CharSequence) string7)) {
							ge.this.c("adurl_ip", string7);
						}
					}
					if (!(bl || ge.this.O == null || ge.this.O[n])) {
						gh gh = new gh(ge.this.e);
						gh.h(string22);
						gh.a();
					}
				}
			}).start();
			// MONITOREXIT : ge
			return;
		} catch (Throwable var4_5) {
			return;
		}
	}

	public void a(Context paramContext) {
		this.c = ("" + paramContext.getFilesDir());
	}

	public void a(Context context, String string, String string2,
			String string3, String string4, String string5) {
		try {
			if (this.Q) {
				return;
			}
			this.e = context;
			this.a(context);
			if (fx.a) {
				Log.i((String) "DF_QA", (String) ("mSavePath:" + this.c));
			}
			if (!fv.a().d()) {
				fv.a().a(context);
				this.d = true;
			}
			new Thread((Runnable) new Runnable() {

				/*
				 * Enabled aggressive block sorting
				 */
				public void run() {
					long l = System.currentTimeMillis();
					gh gh = new gh(ge.this.e);
					long l2 = gh.N();
					gh.a();
					long l3 = l - l2 > 0 ? l - l2 : 0;
					if ((ge.this.A() || ge.this.v) && 3600000 - l3 < 0) {
						fv.a().e();
						ge.this.g(false);
						ge.this.v = false;
					}
				}
			}).start();
			this.B();
			this.D();
			this.a(string, string2, string3, string4, string5);
			return;
		} catch (Throwable var7_7) {
			var7_7.printStackTrace();
			if (fx.a) {
				Log.e((String) "DF_QA", (String) "start \u5931\u8d25!");
			}
			return;
		}
	}

	public void a(gb gb) {
		this.T = gb;
		if (!fx.b) {
			return;
		}
		if (fx.a) {
			Log.d((String) "DF_QA", (String) "sendAppsflyer");
		}
		if (this.y) {
			if (!fx.a)
				return;
			Log.d((String) "DF_QA", (String) "sendAppsflyer ing ...");
			return;
		}
		gh gh = new gh(this.e);
		if (gh.T() > 2 || System.currentTimeMillis() - gh.R() < 60000) {
			if (fx.a) {
				Log.d((String) "DF_QA", (String) "send too frequent");
			}
			gh.a();
			return;
		}
		if (!gg.j(this.e)) {
			if (gb != null) {
				gb.a(false, 4);
			}
			gh.a();
			return;
		}
		if (!this.y().equals((Object) this.f())) {
			if (gb != null) {
				gb.a(true, 2);
			}
			gh.a();
			return;
		}
		if ((long) gh.b(this.i() + String.valueOf((long) gg.e()), 0) <= this
				.O() && System.currentTimeMillis() - gh.R() >= this.N()) {
			this.y = true;
			gh.a();
			this.G.sendEmptyMessageDelayed(500, 50);
			return;
		}
		if (gb != null) {
			gb.a(false, 3);
		}
		gh.a();
	}

	public void a(String string) {
		if (this.Q) {
			return;
		}
		if (TextUtils.isEmpty((CharSequence) string))
			return;
		this.g = string;
		this.c("useId", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA",
				(String) ("setUseId:" + string + ", value:" + this.I()));
	}

	/**
	 * @deprecated
	 */
	public void a(String string, String string2) {
		ge ge = this;
		synchronized (ge) {
			boolean bl = this.Q;
			if (!bl) {
				if (TextUtils.isEmpty((CharSequence) string)) {
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) "onEvent_immediate1 ei null ....");
					}
				} else {
					this.b(1, string, gg.a(string2, 1));
				}
			}
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void a(String string, HashMap[] arrhashMap) {
		ge ge = this;
		synchronized (ge) {
			boolean bl = this.Q;
			if (!bl) {
				if (TextUtils.isEmpty((CharSequence) string)) {
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) "onEvent_immediate2 ei null ....");
					}
				} else {
					this.b(2, string, gg.a(arrhashMap));
				}
			}
			return;
		}
	}

	public void a(boolean bl) {
		if (this.Q) {
			return;
		}
		this.s = bl;
		String string = this.s ? "1" : "0";
		this.c("debug", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setmDebug:" + this.s));
	}

	public String b(Context paramContext) {
		String str = "";
		try {
			this.c = ("" + paramContext.getFilesDir());
			if (this.b == null) {
				this.b = new fw(this.c + "/ConfigData/" + "reffer.ini");
			}
			while (!TextUtils.isEmpty(this.b.c("referrer"))) {
				str = this.b.c("referrer");

				this.b.a();
				break;
			}

		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return str;
	}

	public void b() {

		try {
			J = 0;
			if (this.K != null) {
				this.K.clear();
				this.K = null;
			}
			if (fv.a().d()) {
				fv.a().i();
				this.d = false;
			}
		} catch (Throwable localThrowable1) {
			localThrowable1.printStackTrace();
			// continue;
		}
		try {
			if ((this.I) && (this.H != null)) {
				this.e.unregisterReceiver(this.H);
				this.I = false;
				this.H = null;
			}
			return;
		} catch (Throwable localThrowable2) {
			this.I = false;
		}

	}

	public void b(String paramString) {
		if (TextUtils.isEmpty(paramString)) {
		}

		this.o = paramString;
		c("appsflyer_productid", paramString);
		if (fx.a) {
			Log.i("DF_QA", "setAppsflyerProductId:" + this.o);
		}

	}

	public void b(String string, String string2) {
		try {
			if (this.Q) {
				return;
			}
			if (TextUtils.isEmpty((CharSequence) string)) {
				if (!fx.a)
					return;
				{
					Log.i((String) "DF_QA", (String) "onEvent_4 ei null ....");
					return;
				}
			} else {
				String string3 = gg.a(4, System.currentTimeMillis() + this.E,
						string, gg.a(string2, 4));
				if (fx.a) {
					Log.i((String) "DF_QA",
							(String) ("onEvent_4 data:" + string3));
				}
				if (this.O == null || this.O[4])
					return;
				{
					gh gh = new gh(this.e);
					gh.e(string3);
					gh.a();
					return;
				}
			}
		} catch (Throwable var3_3) {
			var3_3.printStackTrace();
			return;
		}
	}

	/**
	 * @deprecated
	 */
	public void b(String string, HashMap[] arrhashMap) {
		ge ge = this;
		synchronized (ge) {
			boolean bl = this.Q;
			if (!bl) {
				if (TextUtils.isEmpty((CharSequence) string)) {
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) "onEvent_Advertisement ei null ....");
					}
				} else {
					String string2 = gg.a(arrhashMap);
					if (fx.a) {
						Log.i((String) "DF_QA",
								(String) ("onEvent_Advertisement newEm:" + string2));
					}
					this.a(7, string, string2);
				}
			}
			return;
		}
	}

	public void b(boolean paramBoolean) {
		if (this.Q) {
			return;
		}
		this.u = paramBoolean;
		if (this.u) {
		}
		for (String str = "1";; str = "0") {
			c("abroad", str);
			break;
		}
	}

	public void c(String paramString) {
		if (TextUtils.isEmpty(paramString)) {
		}

		this.m = paramString;
		c("par1", paramString);
		if (fx.a) {
			Log.i("DF_QA", "setPar1:" + this.m);
		}

	}

	public void c(String string, HashMap[] arrhashMap) {
		try {
			if (this.Q) {
				return;
			}
			if (TextUtils.isEmpty((CharSequence) string)) {
				if (!fx.a)
					return;
				{
					Log.i((String) "DF_QA", (String) "onEvent_5 ei null ....");
					return;
				}
			} else {
				String string2 = gg.a(5, System.currentTimeMillis() + this.E,
						string, gg.a(arrhashMap));
				if (fx.a) {
					Log.i((String) "DF_QA",
							(String) ("onEvent_5 data:" + string2));
				}
				if (this.O == null || this.O[5])
					return;
				{
					gh gh = new gh(this.e);
					gh.f(string2);
					gh.a();
					return;
				}
			}
		} catch (Throwable var3_3) {
			var3_3.printStackTrace();
			return;
		}
	}

	public void c(boolean bl) {
		if (this.Q) {
			return;
		}
		fx.a = bl;
	}

	public String d() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.g)) {
			this.g = this.l("useId");
		}
		return this.g;
	}

	public void d(String string) {
		if (TextUtils.isEmpty((CharSequence) string)) {
			return;
		}
		this.n = string;
		this.c("par2", string);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setPar2:" + this.n));
	}

	public void d(boolean bl) {
		fx.b = bl;
	}

	public String e() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.h)) {
			this.h = this.l("woeId");
		}
		return this.h;
	}

	/**
	 * @deprecated
	 */
	public void e(String paramString) {

		try {
			boolean bool = this.Q;
			if (bool) {
				return;
			}
			if (TextUtils.isEmpty(paramString)) {
				if (fx.a) {
					Log.i("DF_QA", "onEvent_immediate0 ei null ....");
				}
			} else {
				b(0, paramString, null);
			}
		} finally {
		}

	}

	public void e(boolean paramBoolean) {
		if (this.Q) {
			return;
		}
		this.B = paramBoolean;
		if (this.B) {
		}
		for (String str = "1";; str = "0") {
			c("is_new_user", str);
			if (!fx.a) {
				break;
			}
			Log.i("DF_QA", "setIsNewUser:" + this.B);
			break;
		}
	}

	public String f() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.i)) {
			this.i = this.l("productId");
		}
		return this.i;
	}

	/**
	 * @deprecated
	 */
	public void f(String paramString) {
		try {
			a(paramString, String.valueOf(System.currentTimeMillis() + this.E));
			return;
		} catch (Throwable localThrowable) {
			for (;;) {
				localThrowable.printStackTrace();
			}
		} finally {
		}
	}

	public void f(boolean paramBoolean) {
		if (this.Q) {
			return;
		}
		if ((s()) && (!paramBoolean)) {
			String str2 = "";
			String[] arrayOfString = r().split(",");
			if (arrayOfString.length >= 2) {
				str2 = arrayOfString[1];
			}
			b("D1", t() + "_" + str2);
		}
		this.p = paramBoolean;
		if (this.p) {
		}
		for (String str1 = "1";; str1 = "0") {
			c("promotionpackage", str1);
			if (!fx.a) {
				break;
			}
			Log.i("DF_QA", "setPromotionPackage:" + this.p);
			break;
		}
	}

	public String g() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.j)) {
			this.j = this.l("supplierId");
		}
		return this.j;
	}

	public void g(String string) {
		try {
			if (this.Q) {
				return;
			}
			if (TextUtils.isEmpty((CharSequence) string)) {
				if (!fx.a)
					return;
				{
					Log.i((String) "DF_QA", (String) "onEvent_3 ei null ....");
					return;
				}
			} else {
				String string2 = gg.a(3, System.currentTimeMillis() + this.E,
						string, null);
				if (fx.a) {
					Log.i((String) "DF_QA",
							(String) ("onEvent_3 data:" + string2));
				}
				if (this.O == null || this.O[3])
					return;
				{
					gh gh = new gh(this.e);
					gh.d(string2);
					gh.a();
					return;
				}
			}
		} catch (Throwable var2_2) {
			var2_2.printStackTrace();
			return;
		}
	}

	public String h() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.k)) {
			this.k = this.l("channelId");
		}
		return this.k;
	}

	public void h(String string) {
		try {
			if (this.Q) {
				return;
			}
			if (TextUtils.isEmpty((CharSequence) string)) {
				if (!fx.a)
					return;
				{
					Log.i((String) "DF_QA", (String) "onEvent_6 ei null ....");
					return;
				}
			} else {
				String string2 = gg.a(6, gg.e(), string, null);
				if (fx.a) {
					Log.i((String) "DF_QA",
							(String) ("onEvent_6 data:" + string2));
				}
				if (this.O == null || this.O[6])
					return;
				{
					gh gh = new gh(this.e);
					gh.g(string2);
					gh.a();
					return;
				}
			}
		} catch (Throwable var2_2) {
			var2_2.printStackTrace();
			return;
		}
	}

	public String i() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.l)) {
			this.l = this.l("versionCode");
		}
		return this.l;
	}

	public void i(String string) {
		try {
			if (this.Q) {
				return;
			}
			if (TextUtils.isEmpty((CharSequence) string)) {
				if (!fx.a)
					return;
				{
					Log.i((String) "DF_QA", (String) "onEvent_9 err null ....");
					return;
				}
			} else {
				String string2 = gg.a(9, System.currentTimeMillis() + this.E,
						string, this.i());
				if (fx.a) {
					Log.i((String) "DF_QA",
							(String) ("onEvent_9 data:" + string2));
				}
				if (this.O == null || this.O[9])
					return;
				{
					gh gh = new gh(this.e);
					gh.i(string2);
					gh.a();
					return;
				}
			}
		} catch (Throwable var2_2) {
			var2_2.printStackTrace();
			return;
		}
	}

	public String j() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.m)) {
			this.m = this.l("par1");
		}
		return this.m;
	}

	public void j(final String string) {
		try {
			new Thread((Runnable) new Runnable() {

				public void run() {
					try {
						fv.a().b(string);
						return;
					} catch (Throwable var1_1) {
						return;
					}
				}
			}).start();
			return;
		} catch (Throwable var2_2) {
			return;
		}
	}

	public String k() {
		if (this.Q) {
			return "";
		}
		if (TextUtils.isEmpty((CharSequence) this.n)) {
			this.n = this.l("par2");
		}
		return this.n;
	}

	public void k(String string) {
		if (this.Q) {
			return;
		}
		this.q = string;
		this.c("promotion_id", this.q);
		if (!fx.a)
			return;
		Log.i((String) "DF_QA", (String) ("setPromotionId:" + this.q));
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public boolean l() {
		boolean bool = false;
		if (this.Q) {
		}

		try {
			String str = l("debug");
			if (TextUtils.isEmpty(str)) {
				return bool;
			}
			if (gg.b(str) == 1) {
				bool = true;
			}
			this.s = bool;
			// bool = this.s;
		} catch (Throwable localThrowable) {

			localThrowable.printStackTrace();

		}
		return bool;
	}

	public boolean m() {
		if (this.Q) {
			return false;
		}
		try {
			String string = this.l("abroad");
			if (TextUtils.isEmpty((CharSequence) string))
				return false;
			int n = gg.b(string);
			boolean bl = false;
			if (n == 1) {
				bl = true;
			}
			
			this.u = bl;
			return this.u;
		} catch (Throwable var1_4) {
			var1_4.printStackTrace();
			return this.u;
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	public void n() {
		ge ge = this;
		synchronized (ge) {
			boolean bl = this.Q;
			if (!(bl || this.P)) {
				this.P = true;
				try {
					new Thread((Runnable) new Runnable() {

						public void run() {
							try {
								if (fx.a) {
									Log.i((String) "DF_QA",
											(String) "saveSQLDataByRMS start ...................");
								}
								gh gh = new gh(ge.this.e);
								String string = gh.b().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.t(string);
								gh.c();
								String string2 = gh.d().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.t(string2);
								gh.e();
								String string3 = gh.f().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.t(string3);
								gh.g();
								String string4 = gh.h().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.u(string4);
								gh.i();
								String string5 = gh.j().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.u(string5);
								gh.k();
								String string6 = gh.l().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.u(string6);
								gh.m();
								String string7 = gh.n().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.v(string7);
								gh.o();
								String string8 = gh.p().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.t(string8);
								gh.q();
								String string9 = gh.r().replace(
										(CharSequence) "\r\n",
										(CharSequence) "<>");
								ge.this.s(string9);
								gh.s();
								ge.this.P = false;
								gh.a(gh.t());
								gh.u();
								gh.b(gh.v());
								gh.w();
								gh.c(gh.x());
								gh.y();
								gh.d(gh.z());
								gh.A();
								gh.e(gh.B());
								gh.C();
								gh.f(gh.D());
								gh.E();
								gh.g(gh.F());
								gh.G();
								gh.h(gh.H());
								gh.I();
								gh.i(gh.J());
								gh.K();
								gh.a();
								if (fx.a) {
									Log.i((String) "DF_QA",
											(String) "saveSQLDataByRMS end ...................");
								}
								return;
							} catch (Throwable var3_11) {
								var3_11.printStackTrace();
								return;
							} finally {
								ge.this.P = false;
							}
						}
					}).start();
				} catch (Throwable var3_3) {
				}
			}
			return;
		}
	}

	public void o() {
		if (Q) {
			return;
		} else {
			new Thread(new Runnable() {

				ge a = ge.this;
				String s2;
				boolean flag1;
				String s3 = ge.a(a, "iurl_ip");
				boolean flag = flag1;

				public void run() {
					if (!TextUtils.isEmpty(a.d())) {
						if (!ge.a(a) && gg.e(a.e) != null) {

							String s1;
							ge.a(a, true);
							s1 = ge.o(a);
							if (fx.a) {
								Log.d("DF_QA",
										(new StringBuilder())
												.append("sendImmediateData() data:")
												.append(s1).toString());
							}
							if (TextUtils.isEmpty(s1)) {
								// continue; /* Loop/switch isn't completed */
							}
							Object obj = "";
							// 2;
							// JVM INSTR tableswitch 0 2: default 750
							// 0 467
							// 1 482
							// 2 497;
							// goto _L6 _L7 _L8 _L9

							if (ge.c().l()) {
								obj = "http://log.test.qiigame.com/l/api/log/timely/write";
							}

							s2 = ((String) (obj)).substring("http://".length(),
									((String) (obj)).indexOf("/l/api"));
							flag1 = ge.a(a, a.d(), s1, ((String) (obj)), null,
									"1", true);
							if (flag1) {

								s1 = gg.e(s2);
								if (fx.a) {
									Log.i("DF_QA", (new StringBuilder())
											.append("sendImmediateData() ip:")
											.append(s1).toString());
									Log.i("DF_QA",
											(new StringBuilder())
													.append("sendImmediateData() newURL:")
													.append(((String) (obj))
															.replace(s2, s1))
													.toString());
								}
								flag = flag1;
								if (TextUtils.isEmpty(s1)) {

									if (!flag) {
										try {
											obj = new gh(a.e);
											if (ge.d(a) != null && ge.d(a)[0]) {
												ge.d(a)[0] = false;
											}
											if (ge.d(a) != null && ge.d(a)[1]) {
												ge.d(a)[1] = false;
											}
											if (ge.d(a) != null && ge.d(a)[2]) {
												ge.d(a)[2] = false;
											}
											((gh) (obj)).a();
											fv.a().e();
										}
										// Misplaced declaration of an exception
										// variable
										catch (Throwable throwable) {
											if (fx.a) {
												Log.w("system.err", throwable);
											}
											throwable.printStackTrace();
										}
										/* Loop/switch isn't completed */
									}

								} else {

									ge.a(a, "iurl_ip", s1);
									flag = flag1;

									obj = new gh(a.e);
									if (ge.d(a) != null && ge.d(a)[0]) {
										((gh) (obj)).c();
										ge.d(a)[0] = false;
									}
									if (ge.d(a) != null && ge.d(a)[1]) {
										((gh) (obj)).e();
										ge.d(a)[1] = false;
									}
									if (ge.d(a) != null && ge.d(a)[2]) {
										((gh) (obj)).g();
										ge.d(a)[2] = false;
									}
									((gh) (obj)).a();
									fv.a().f();
									fv.a().h();

									ge.a(a, false);
									ge.p(a);
									return;

								}

								if (ge.c().m()) {
									obj = "http://locker.dr.lockerma.com/l/api/log/timely/write";
								} else {
									obj = "http://dr.qiigame.com/l/api/log/timely/write";
								}
								// goto _L6
								// _L8:
								if (ge.c().m()) {
									obj = "http://dr.holalauncher.com/l/api/log/timely/write";
								} else {
									obj = "http://dr.holaworld.cn/l/api/log/timely/write";
								}
								// goto _L6
								// _L9:
								if (ge.c().m()) {
									obj = "http://dr.lazyswipe.com/l/api/log/timely/write";
								} else {
									obj = "http://dr.lazyswipe.cn/l/api/log/timely/write";
								}
								// goto _L6

							} else {

								if (!TextUtils.isEmpty(s3)) {
									flag = ge.a(a, a.d(), s1,
											((String) (obj)).replace(s2, s3),
											s2, "1", true);
								}

							}

						} else {

							Throwable throwable;
							if (fx.a) {
								Log.i("DF_QA",
										(new StringBuilder())
												.append("\u65E0\u7F51\u7EDC..........")
												.append(ge.a(a)).toString());
								return;
							}
							// goto _L3

						}

					} else {
						if (fx.a) {
							Log.i("DF_QA",
									(new StringBuilder())
											.append("\u53D1\u9001\u666E\u901A\u4E8B\u4EF60~2 getUseId:")
											.append(a.d()).toString());
							return;
						}
					}

				}

			}).start();
			return;
		}
	}

	public boolean p() {
		return this.P;
	}

	public boolean q() {
		String string;
		int n = 1;
		if (this.Q
				|| TextUtils.isEmpty((CharSequence) (string = this
						.l("is_new_user")))) {
			return false;
		}
		if (gg.b(string) != n) {
			n = 0;
		}
		this.B = Boolean.valueOf(String.valueOf(n));
		return this.B;
	}

	public String r() {
		if (this.Q) {
			return "unknow";
		}
		String string = "unknow";
		try {
			if (TextUtils.isEmpty((CharSequence) this.c)) {
				if (this.e == null)
					return "unknow";
				this.a(this.e);
			}
			if (this.b == null) {
				this.b = new fw(this.c + "/ConfigData/" + "reffer.ini");
			}
			if (TextUtils.isEmpty((CharSequence) this.b.c("pid_c")))
				return string;
			return URLDecoder.decode((String) this.b.c("pid_c"));
		} catch (Throwable var2_2) {
			var2_2.printStackTrace();
			return string;
		}
	}

	public boolean s() {
		String string;
		int n = 1;
		if (this.Q
				|| TextUtils.isEmpty((CharSequence) (string = this
						.l("promotionpackage")))) {
			return false;
		}
		if (gg.b(string) != n) {
			n = 0;
		}
		this.p = Boolean.valueOf(String.valueOf(n));
		return this.p;
	}

	public String t() {
		if (this.Q) {
			return "";
		}
		String string = this.l("promotion_id");
		if (TextUtils.isEmpty((CharSequence) string)) {
			return "";
		}
		this.q = string;
		return this.q;
	}

	public String u() {
		if (this.Q) {
			return this.R;
		}
		String string = this.l("advertisingId");
		if (TextUtils.isEmpty((CharSequence) string)) {
			return "";
		}
		this.R = URLDecoder.decode((String) string);
		return this.R;
	}

	public int v() {
		String string;
		if (this.Q
				|| TextUtils.isEmpty((CharSequence) (string = this
						.l("optOutEnabled")))) {
			return -1;
		}
		this.S = gg.b(string);
		return this.S;
	}

	public int w() {
		gh gh = new gh(this.e);
		int n = gh.V();
		gh.a();
		return n;
	}

	public void x() {
		gh localgh = new gh(this.e);
		localgh.U();
		localgh.a();
	}
}
