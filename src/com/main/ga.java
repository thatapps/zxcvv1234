package com.main;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.http.HttpResponse;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;

public class ga {
	public static String a(Context context) {
		Object obj;
		Object obj1;
		Object obj2;
		StringBuilder stringbuilder;
		HashMap hashmap;
		boolean flag;
		boolean flag3;
		Object obj3;
		Iterator iterator;
		int i;
		int j;
		String as[];
		CharSequence charsequence;
		boolean flag1;
		int k;
		boolean flag2;
		int l;

		stringbuilder = new StringBuilder();
		hashmap = new HashMap();
		obj3 = context.getPackageManager().getInstalledPackages(4096);

		// Misplaced declaration of an exception variable

		obj = "0";
		obj2 = "0";
		obj1 = "0";
		iterator = ((List) (obj3)).iterator();

		if (!iterator.hasNext()) {

			hashmap.put("hags", URLEncoder.encode(((String) (obj))));
			stringbuilder.append((new StringBuilder()).append("?hags=")
					.append(URLEncoder.encode(((String) (obj)))).toString());
			hashmap.put("hagp", URLEncoder.encode(((String) (obj2))));
			stringbuilder.append((new StringBuilder()).append("&hagp=")
					.append(URLEncoder.encode(((String) (obj2)))).toString());
			hashmap.put("hafb", URLEncoder.encode(((String) (obj1))));
			stringbuilder.append((new StringBuilder()).append("&hafb=")
					.append(URLEncoder.encode(((String) (obj1)))).toString());
			obj = context.getPackageName();
			if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
				hashmap.put("pkg", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&pkg=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
			obj = ge.c().e();
			if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
				hashmap.put("w", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&w=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
			obj = gg.k(context);
			if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
				hashmap.put("n", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&n=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
			i = gg.b(gg.a(context)) / 100;
			obj = (String) fx.d.get(i, "UN");
			if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
				hashmap.put("iso", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&iso=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
			obj = Locale.getDefault().getLanguage();
			if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
				hashmap.put("lang", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&lang=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
			obj = ge.c().f();
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {
				flag = true;

				obj = ge.c().i();
				if (TextUtils.isEmpty(((CharSequence) (obj)))) {
					flag = true;

					obj = ge.c().d();
					if (TextUtils.isEmpty(((CharSequence) (obj)))) {
						flag = true;

						obj = ge.c().j();
						if (TextUtils.isEmpty(((CharSequence) (obj)))) {
							obj = ge.c().k();
							if (TextUtils.isEmpty(((CharSequence) (obj)))) {
								flag = true;

								obj = gg.d();
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									hashmap.put("b",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&b=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								obj = gg.a();
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									hashmap.put("m",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&m=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								obj = String.valueOf(gg.b());
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									hashmap.put("aos",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&aos=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								obj = gg.c();
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									hashmap.put("aon",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&aon=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								obj = gg.a(context);
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									hashmap.put("o",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&o=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								obj1 = ge.c().h();
								if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
									hashmap.put("cid", URLEncoder
											.encode(((String) (obj1))));
									stringbuilder.append((new StringBuilder())
											.append("&cid=")
											.append(URLEncoder
													.encode(((String) (obj1))))
											.toString());
								}
								obj = ge.c().u();
								if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
									hashmap.put("gaid",
											URLEncoder.encode(((String) (obj))));
									stringbuilder.append((new StringBuilder())
											.append("&gaid=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
								}
								j = ge.c().v();
								hashmap.put("ladt",
										URLEncoder.encode(String.valueOf(j)));
								stringbuilder.append((new StringBuilder())
										.append("&ladt=")
										.append(URLEncoder.encode(String
												.valueOf(j))).toString());
								if (flag) {
									return "notEnoughParameters";
								}
								obj = URLDecoder.decode(ge.c().b(context));
								obj2 = new gh(context);
								flag3 = ((gh) (obj2)).O();
								if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
									as = ((String) (obj)).split("&");
									l = as.length;
									k = 0;
									flag = false;

								} else {

									obj = ge.c().t();
									if (!TextUtils
											.isEmpty(((CharSequence) (obj1)))
											&& ge.c().s()) {
										hashmap.put("c", URLEncoder
												.encode(((String) (obj1))));
										stringbuilder
												.append((new StringBuilder())
														.append("&c=")
														.append(URLEncoder
																.encode(((String) (obj1))))
														.toString());
										obj1 = gd
												.a("0zRm7PbpmpBrWXCDkUPkCQXKIMJmaLN0r",
														(new StringBuilder())
																.append(ge.c()
																		.d())
																.append("tgpPPsiJWz2LF8Vv8")
																.append(((String) (obj1)))
																.toString());
										hashmap.put("aq_tranid", URLEncoder
												.encode(((String) (obj1))));
										stringbuilder
												.append((new StringBuilder())
														.append("&aq_tranid=")
														.append(URLEncoder
																.encode(((String) (obj1))))
														.toString());
									}
									if (!flag3) {
										if (ge.c().s()) {
											if (TextUtils
													.isEmpty(((CharSequence) (obj)))) {
												obj1 = "Promotion";
											} else {
												obj1 = obj;
											}
										} else {
											obj1 = "Organic_up";
										}
										hashmap.put("pid", URLEncoder
												.encode(((String) (obj1))));
										obj3 = (new StringBuilder())
												.append("&pid=");
										if (!ge.c().s()) {

											obj1 = "Organic_up";
											stringbuilder
													.append(((StringBuilder) (obj3))
															.append(URLEncoder
																	.encode(((String) (obj1))))
															.toString());
											hashmap.put("af_status", URLEncoder
													.encode("Organic_up"));
											stringbuilder
													.append((new StringBuilder())
															.append("&af_status=")
															.append(URLEncoder
																	.encode("Organic_up"))
															.toString());

										} else {
											obj1 = obj;
											if (TextUtils
													.isEmpty(((CharSequence) (obj)))) {
												obj1 = "Promotion";
											}
										}
									}

								}
								if (ge.c().q()) {

									if (ge.c().s()) {
										if (TextUtils
												.isEmpty(((CharSequence) (obj)))) {
											obj1 = "Promotion";
										} else {
											obj1 = obj;
										}
									} else {
										obj1 = "Organic";
									}
									hashmap.put("pid", URLEncoder
											.encode(((String) (obj1))));
									obj3 = (new StringBuilder())
											.append("&pid=");
									if (!ge.c().s()) {
										obj1 = "Organic";

										stringbuilder
												.append(((StringBuilder) (obj3))
														.append(URLEncoder
																.encode(((String) (obj1))))
														.toString());
										if (ge.c().s()) {
											obj = "Non-organic";
										} else {
											obj = "Organic";
										}
										hashmap.put("af_status", URLEncoder
												.encode(((String) (obj))));
										obj1 = (new StringBuilder())
												.append("&af_status=");
										if (ge.c().s()) {
											obj = "Non-organic";
										} else {
											obj = "Organic";
										}
										String clickid = null;
										stringbuilder
												.append(((StringBuilder) (obj1))
														.append(URLEncoder
																.encode(((String) (obj))))
														.toString());
										ge.c().c = context.getFilesDir()
												.getAbsolutePath();
										if (ge.c().b == null) {
											ge.c().b = new fw(
													(new StringBuilder())
															.append(ge.c().c)
															.append("/ConfigData/")
															.append("reffer.ini")
															.toString());
										}
										obj = ge.c().b;
										obj1 = (new StringBuilder())
												.append(URLDecoder
														.decode((String) hashmap
																.get("pid")))
												.append(",");
										if (!TextUtils
												.isEmpty((CharSequence) hashmap
														.get("c"))) {

											String path = URLDecoder
													.decode((String) hashmap
															.get("c"));

											obj1 = ((StringBuilder) (obj1))
													.append(path).append(",");
											if (!TextUtils
													.isEmpty((CharSequence) hashmap
															.get("clickid"))) {
												clickid = URLDecoder
														.decode((String) hashmap
																.get("clickid"));

												((fw) (obj))
														.a("pid_c",
																URLEncoder
																		.encode(((StringBuilder) (obj1))
																				.append(clickid)
																				.toString()));
												ge.c().b.b();
												((gh) (obj2)).a();
												Log.i("DF_HTTP",
														(new StringBuilder())
																.append("sendAppsflyer url:")
																.append("http://stat.haloapps.com/install")
																.append(stringbuilder)
																.toString());
												HttpResponse httpResponse = fz
														.b("http://stat.haloapps.com/install",
																hashmap, null);
												Log.i("DF_HTTP",
														(new StringBuilder())
																.append("sendAppsflyer resp code:")
																.append(((HttpResponse) httpResponse)
																		.getStatusLine()
																		.getStatusCode())
																.toString());
												if (httpResponse
														.getStatusLine()
														.getStatusCode() != 200) {
													return "false";
												} else {
													return "ok";
												}

											} else {
												path = "";

											}

										} else {
											clickid = "";

										}
									} else {

										obj1 = obj;
										if (TextUtils
												.isEmpty(((CharSequence) (obj)))) {
											obj1 = "Promotion";
										}
									}

								}
								if (ge.c().s()) {
									if (TextUtils
											.isEmpty(((CharSequence) (obj)))) {
										obj1 = "Promotion";
									} else {
										obj1 = obj;
									}
								} else {
									obj1 = "Organic_up";
								}
								hashmap.put("pid",
										URLEncoder.encode(((String) (obj1))));
								obj3 = (new StringBuilder()).append("&pid=");
								if (!ge.c().s()) {
									obj1 = "Organic_up";

									stringbuilder
											.append(((StringBuilder) (obj3))
													.append(URLEncoder
															.encode(((String) (obj1))))
													.toString());
									hashmap.put("af_status",
											URLEncoder.encode("Organic_up"));
									stringbuilder.append((new StringBuilder())
											.append("&af_status=")
											.append(URLEncoder
													.encode("Organic_up"))
											.toString());
								} else {

									obj1 = obj;
									if (TextUtils
											.isEmpty(((CharSequence) (obj)))) {
										obj1 = "Promotion";
									}
								}

							}

						} else {
							hashmap.put("par2",
									URLEncoder.encode(((String) (obj))));
							stringbuilder
									.append((new StringBuilder())
											.append("&par2=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());

						}
					} else {

						hashmap.put("par2", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&par2=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());

					}

				} else {
					hashmap.put("u", URLEncoder.encode(((String) (obj))));
					stringbuilder.append((new StringBuilder()).append("&u=")
							.append(URLEncoder.encode(((String) (obj))))
							.toString());
				}

			} else {
				hashmap.put("pvc", URLEncoder.encode(((String) (obj))));
				stringbuilder
						.append((new StringBuilder()).append("&pvc=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
			}
		} else {
			hashmap.put("pdtid", URLEncoder.encode(((String) (obj))));
			stringbuilder.append((new StringBuilder()).append("&pdtid=")
					.append(URLEncoder.encode(((String) (obj)))).toString());
			flag = false;

		}

		obj3 = (PackageInfo) iterator.next();
		if (!((PackageInfo) (obj3)).packageName
				.equals("com.google.android.gms")) {
			if (!((PackageInfo) (obj3)).packageName
					.equals("com.android.vending")) {

				if (((PackageInfo) (obj3)).packageName
						.equals("com.facebook.katana")) {
					obj3 = "1";
					obj1 = obj2;
					obj2 = obj;
					obj = obj3;
				} else {
					Object obj4 = obj1;
					obj1 = obj2;
					obj2 = obj;
					obj = obj4;
				}

			} else {
				obj2 = obj;
				obj = obj1;
				obj1 = "1";
			}

		} else {
			flag = true;

			obj = ge.c().j();
			if (TextUtils.isEmpty(((CharSequence) (obj)))) {

				flag = true;

				obj = ge.c().k();
				if (TextUtils.isEmpty(((CharSequence) (obj)))) {
					flag = true;

					obj = gg.d();
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						hashmap.put("b", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&b=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					obj = gg.a();
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						hashmap.put("m", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&m=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					obj = String.valueOf(gg.b());
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						hashmap.put("aos", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&aos=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					obj = gg.c();
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						hashmap.put("aon", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&aon=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					obj = gg.a(context);
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						hashmap.put("o", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&o=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					obj1 = ge.c().h();
					if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
						hashmap.put("cid", URLEncoder.encode(((String) (obj1))));
						stringbuilder.append((new StringBuilder())
								.append("&cid=")
								.append(URLEncoder.encode(((String) (obj1))))
								.toString());
					}
					obj = ge.c().u();
					if (!TextUtils.isEmpty(((CharSequence) (obj1)))) {
						hashmap.put("gaid", URLEncoder.encode(((String) (obj))));
						stringbuilder.append((new StringBuilder())
								.append("&gaid=")
								.append(URLEncoder.encode(((String) (obj))))
								.toString());
					}
					j = ge.c().v();
					hashmap.put("ladt", URLEncoder.encode(String.valueOf(j)));
					stringbuilder.append((new StringBuilder()).append("&ladt=")
							.append(URLEncoder.encode(String.valueOf(j)))
							.toString());
					if (flag) {
						return "notEnoughParameters";
					}
					obj = URLDecoder.decode(ge.c().b(context));
					obj2 = new gh(context);
					flag3 = ((gh) (obj2)).O();
					if (!TextUtils.isEmpty(((CharSequence) (obj)))) {
						as = ((String) (obj)).split("&");
						l = as.length;
						k = 0;
						flag = false;

					} else {
						obj = ge.c().t();
						if (!TextUtils.isEmpty(((CharSequence) (obj1)))
								&& ge.c().s()) {
							hashmap.put("c",
									URLEncoder.encode(((String) (obj1))));
							stringbuilder.append((new StringBuilder())
									.append("&c=")
									.append(URLEncoder
											.encode(((String) (obj1))))
									.toString());
							obj1 = gd.a("0zRm7PbpmpBrWXCDkUPkCQXKIMJmaLN0r",
									(new StringBuilder()).append(ge.c().d())
											.append("tgpPPsiJWz2LF8Vv8")
											.append(((String) (obj1)))
											.toString());
							hashmap.put("aq_tranid",
									URLEncoder.encode(((String) (obj1))));
							stringbuilder.append((new StringBuilder())
									.append("&aq_tranid=")
									.append(URLEncoder
											.encode(((String) (obj1))))
									.toString());
						}
						if (!flag3) {

							if (ge.c().s()) {
								if (TextUtils.isEmpty(((CharSequence) (obj)))) {
									obj1 = "Promotion";
								} else {
									obj1 = obj;
								}
							} else {
								obj1 = "Organic_up";
							}
							hashmap.put("pid",
									URLEncoder.encode(((String) (obj1))));
							obj3 = (new StringBuilder()).append("&pid=");
							if (!ge.c().s()) {

								obj1 = "Organic_up";

								stringbuilder.append(((StringBuilder) (obj3))
										.append(URLEncoder
												.encode(((String) (obj1))))
										.toString());
								hashmap.put("af_status",
										URLEncoder.encode("Organic_up"));
								stringbuilder
										.append((new StringBuilder())
												.append("&af_status=")
												.append(URLEncoder
														.encode("Organic_up"))
												.toString());

							} else {

								obj1 = obj;
								if (TextUtils.isEmpty(((CharSequence) (obj)))) {
									obj1 = "Promotion";
								}

							}

						} else {
							hashmap.put("par2",
									URLEncoder.encode(((String) (obj))));
							stringbuilder
									.append((new StringBuilder())
											.append("&par2=")
											.append(URLEncoder
													.encode(((String) (obj))))
											.toString());
						}
					}
				} else {
					hashmap.put("par1", URLEncoder.encode(((String) (obj))));
					stringbuilder.append((new StringBuilder()).append("&par1=")
							.append(URLEncoder.encode(((String) (obj))))
							.toString());
				}

			}
		}
		/*
		 * _L30: obj1 = "Organic"; goto _L51 _L35: k++; flag = flag2; goto _L52
		 */
		return stringbuilder.toString();
	}

	public static String a(String paramString) {
		String str1 = "";
		String str2 = "";

		try {
			if (TextUtils.isEmpty(paramString)) {
				if (fx.a) {
					Log.i("DF_HTTP", "sendErr 无userId.........");
				}
			} else {
				if (ge.c().c == null) {
					if (!fx.a) {
						str1 = "";
					}
					Log.i("DF_HTTP",
							"sendErr 未获�?�内部存储路径.........");
					str1 = "";
				}
				HashMap localHashMap = new HashMap();
				localHashMap.put("uid", paramString);
				localHashMap.put("pid", ge.c().f());
				localHashMap.put("cid", ge.c().h());
				localHashMap.put("vc", ge.c().i());
				switch (2) {
				case 1:
					if (!ge.c().m()) {
						str2 = "http://st.holaworld.cn/r";
					}
					str2 = "http://st.holalauncher.com/r";
					if (fx.a) {
						Log.i("DF_HTTP", "sendReal url: " + str2 + "?uid="
								+ paramString + "&pid=" + ge.c().f() + "&cid="
								+ ge.c().h() + "&vc=" + ge.c().i());
					}
					if (fz.b(str2, localHashMap, null).getStatusLine()
							.getStatusCode() != 200) {
						str1 = "false";
					}
					break;
				case 2:
					if (!ge.c().m()) {
						str2 = "http://st.lazyswipe.cn/r";
					}
					str2 = "http://st.lazyswipe.com/r";
					// continue;
					str1 = "ok";

				}

			}
		}

		catch (Exception localException) {
			if (fx.a) {
				Log.w("system.err", localException);
			}
			localException.printStackTrace();
			str1 = "";
		}
		return str1;

	}

	// public static String a(String paramString1, String paramString2,
	// String paramString3) {
	// Object localObject = null;
	// try {
	// if (TextUtils.isEmpty(paramString1)) {
	// if (fx.a) {
	// Log.i("DF_HTTP", "requestSendRule 无userId.........");
	// }
	// } else if (ge.c().c == null) {
	// if (!fx.a) {
	// return (String) localObject;
	// }
	// Log.i("DF_HTTP",
	// "requestSendRule 未获�?�内部存储路径.........");
	// }
	// } catch (Exception localException) {
	// if (fx.a) {
	// Log.w("system.err", localException);
	// }
	// localException.printStackTrace();
	// }
	// HashMap localHashMap = new HashMap();
	// localHashMap.put("userId", paramString1);
	// localHashMap.put("sdk", String.valueOf(3));
	// String str1 = "";
	// switch (2) {
	// }
	//
	// if (ge.c().l()) {
	// str1 = "http://log.test.qiigame.com/l/api/eventCollectRule/rule";
	// }
	// if (!TextUtils.isEmpty(paramString2)) {
	// }
	// String str2;
	//
	// if (fx.a) {
	// Log.i("DF_HTTP", "requestSendRule url:" + paramString2);
	// }
	// str2 = fz.a(paramString2, localHashMap, paramString3);
	// if (!fx.a) {
	// localObject = str2;
	// }
	// Log.i("DF_HTTP", "requestSendRule result:" + str2);
	// localObject = str2;
	// if (!ge.c().m()) {
	// str1 = "http://dc.qiigame.com/l/api/eventCollectRule/rule";
	// return str1;
	// }
	// str1 = "http://locker.dc.lockerma.com/l/api/eventCollectRule/rule";
	// // break;
	// if (!ge.c().m()) {
	// str1 = "http://dc.holaworld.cn/l/api/eventCollectRule/rule";
	// return str1;
	// }
	// str1 = "http://dc.holalauncher.com/l/api/eventCollectRule/rule";
	// // break;
	// if (!ge.c().m()) {
	// str1 = "http://dc.lazyswipe.cn/l/api/eventCollectRule/rule";
	// return str1;
	// }
	// str1 = "http://dc.lazyswipe.com/l/api/eventCollectRule/rule";
	// // break;
	// if (ge.c().m()) {
	// str1 = "http://dc.privacyace.com/l/api/eventCollectRule/rule";
	// return str1;
	// }
	// str1 = "http://dc.privacyace.cn/l/api/eventCollectRule/rule";
	// return paramString2 = str1;
	//
	//
	//
	// }
	public static String a(String s, String s1, String s2) {
		if (!TextUtils.isEmpty(s)) {

			if (ge.c().c != null) {

				HashMap hashmap;
				try {
					hashmap = new HashMap();
					hashmap.put("userId", s);
					hashmap.put("sdk", String.valueOf(3));
				}
				// Misplaced declaration of an exception variable
				catch (Exception exception) {
					if (fx.a) {
						Log.w("system.err", s);
					}
					exception.printStackTrace();
					return null;
				}
				// s = "";
				// 2;
				// JVM INSTR tableswitch 0 3: default 314
				// 0 236
				// 1 252
				// 2 268
				// 3 284;
				// goto _L8 _L9 _L10 _L11 _L12

				if (ge.c().l()) {
					s = "http://log.test.qiigame.com/l/api/eventCollectRule/rule";
				}
				if (TextUtils.isEmpty(s1)) {
					s1 = s;
				}
				if (fx.a) {
					Log.i("DF_HTTP",
							(new StringBuilder())
									.append("requestSendRule url:").append(s1)
									.toString());
				}
				s = fz.a(s1, hashmap, s2);
				if (fx.a) {
					Log.i("DF_HTTP",
							(new StringBuilder())
									.append("requestSendRule result:")
									.append(s).toString());
				}

				// _L9:
				if (ge.c().m()) {
					s = "http://locker.dc.lockerma.com/l/api/eventCollectRule/rule";
				} else {
					s = "http://dc.qiigame.com/l/api/eventCollectRule/rule";
				}
				// continue; /* Loop/switch isn't completed */
				// _L10:
				if (ge.c().m()) {
					s = "http://dc.holalauncher.com/l/api/eventCollectRule/rule";
				} else {
					s = "http://dc.holaworld.cn/l/api/eventCollectRule/rule";
				}
				// continue; /* Loop/switch isn't completed */
				// _L11:
				if (ge.c().m()) {
					s = "http://dc.lazyswipe.com/l/api/eventCollectRule/rule";
				} else {
					s = "http://dc.lazyswipe.cn/l/api/eventCollectRule/rule";
				}
				// continue; /* Loop/switch isn't completed */
				// _L12:
				if (ge.c().m()) {
					s = "http://dc.privacyace.com/l/api/eventCollectRule/rule";
				} else {
					s = "http://dc.privacyace.cn/l/api/eventCollectRule/rule";
				}
				return s;

			} else {
				if (!fx.a) {
					return null;
				} else {

					Log.i("DF_HTTP",
							"requestSendRule \u672A\u83B7\u53D6\u5185\u90E8\u5B58\u50A8\u8DEF\u5F84.........");
					return null;

				}

			}

		} else {

			if (!fx.a) {
				return null;
			} else {
				Log.i("DF_HTTP", "requestSendRule \u65E0userId.........");
				return null;

			}

		}

	}

	public static String a(String string, String string2, String string3,
			String string4, boolean bl, String string5) {
		try {
			String string6;
			if (TextUtils.isEmpty((CharSequence) string)) {
				boolean bl2 = fx.a;
				string6 = null;
				if (!bl2)
					return string6;
				Log.i((String) "DF_HTTP",
						(String) "sendData \u65e0userId.........");
				return null;
			}
			if (ge.c().c == null) {
				boolean bl3 = fx.a;
				string6 = null;
				if (!bl3)
					return string6;
				Log.i((String) "DF_HTTP",
						(String) "sendData \u672a\u83b7\u53d6\u5185\u90e8\u5b58\u50a8\u8def\u5f84.........");
				return null;
			}
			if (bl) {
				string2 = gg.a(string, string2);
			}
		} catch (Exception var6_9) {
			if (fx.a) {
				Log.w((String) "system.err", (Throwable) var6_9);
			}
			var6_9.printStackTrace();
			return null;
		}
		long l = string2.getBytes().length;
		byte[] arrby = gg.a(gg.d(string2), string2.getBytes());
		if (fx.a) {
			Log.i((String) "DF_HTTP", (String) ("sendData url:" + string3));
		}
		HashMap hashMap = new HashMap();
		hashMap.put((Object) "userId", (Object) string);
		hashMap.put((Object) "pid", (Object) ge.c().f());
		if (bl) {
			hashMap.put((Object) "vc", (Object) ge.c().i());
			hashMap.put((Object) "cid", (Object) ge.c().h());
		}
		hashMap.put((Object) "iso", (Object) string5);
		hashMap.put((Object) "ver", (Object) String.valueOf((int) 3));
		hashMap.put((Object) "len", (Object) String.valueOf((long) l));
		String string7 = fz.a(string3, (Map) hashMap, arrby, string4);
		if (!fx.a)
			return string7;
		Log.i((String) "DF_HTTP", (String) ("sendData result:" + string7));
		return string7;
	}

	public static void a(Context paramContext, String paramString1,
			String paramString2, String paramString3) {
		try {
			HashMap localHashMap = new HashMap();
			localHashMap.put("hc", paramString2);
			localHashMap.put("ct", ge.c().e());
			localHashMap.put("op", gg.a(paramContext));
			localHashMap.put("net", gg.k(paramContext));
			localHashMap.put("uid", paramString1);
			localHashMap.put("pid", ge.c().f());
			localHashMap.put("at", paramString3);
			if (ge.c().m()) {
			}
			for (String str1 = "http://gbsta.haloall.com/err";; str1 = "http://sta.haloall.com/err") {
				if (fx.a) {
					Log.i("DF_HTTP",
							"send360 url:" + str1 + "?hc=" + paramString2
									+ "&ct=" + ge.c().e() + "&op="
									+ gg.a(paramContext) + "&net="
									+ gg.k(paramContext) + "&uid="
									+ paramString1 + "&pid=" + ge.c().f()
									+ "&at=" + paramString3);
				}
				String str2 = fz.a(str1, localHashMap, null);
				if (!fx.a) {
					break;
				}
				Log.i("DF_HTTP", "send360 result:" + str2);
				break;
			}
			return;
		} catch (Exception localException) {
			if (fx.a) {
				Log.w("system.err", localException);
			}
			localException.printStackTrace();
		}
	}
}
