package com.main;

import java.io.IOException;
import java.lang.ref.WeakReference;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.lazyswipe.ui.MainActivity;
import com.lazyswipe.zev.R;

public class pa {
	private static final String b = "Swipe." + pa.class.getSimpleName();
	final Handler a;
	private ProgressDialog c;
	private Dialog d;
	private boolean e = true;
	private pd f = null;
	private WeakReference g;

	public pa(Activity activity) {
		this.a = new Handler() {

			/*
			 * Enabled aggressive block sorting Lifted jumps to return sites
			 */
			public void handleMessage(Message message) {
				int n = R.string.download_checking_error;
				Activity activity = (Activity) pa.this.g.get();
				if (activity == null) {
					return;
				}
				switch (message.what) {
				default: {
					return;
				}
				case 6: {
					pd pd;
					if (pa.this.c != null) {
						tp.a(pa.this.c, (Context) activity);
						pa.this.c = null;
					}
					if ((pd = pa.this.f) == null)
						return;
					Intent intent = pe
							.a((Context) activity, MainActivity.class);
					pa.this.d = pa.a((Context) activity, pd, null,
							pa.this.a((Context) activity), intent,
							pa.this.a(activity, intent), pa.this.d());
					return;
				}
				case 7: {
					if (pa.this.c != null) {
						tp.a(pa.this.c, (Context) activity);
						pa.this.c = null;
					}
					pa.this.e = true;
					tp.a((Context) activity,
							(CharSequence) activity
									.getString(R.string.version_update),
							(CharSequence) activity
									.getString(R.string.version_is_already_newest),
							(CharSequence) activity.getString(17039370),
							(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

								public void onClick(
										DialogInterface dialogInterface, int n) {
									dialogInterface.dismiss();
								}
							});
					return;
				}
				case 8:

					if (pa.this.c != null) {
						tp.a(pa.this.c, (Context) activity);
						pa.this.c = null;
					}
					pa.this.e = true;
				}
				Bundle bundle = message.getData();
				if (bundle == null)
					return;
				if (!bundle.containsKey("checkUpgradeError"))
					return;
				switch (bundle.getInt("checkUpgradeError")) {
				case 1: {
					n = R.string.download_checking_connection_failed;
				}
				default: {
					break;
				}
				case 2: {
					n = R.string.download_checking_connection_server_error;
				}
				}
				tp.a((Context) activity,
						(CharSequence) activity
								.getString(R.string.version_update),
						(CharSequence) activity.getString(n),
						(CharSequence) activity.getString(17039370),
						(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

							public void onClick(
									DialogInterface dialogInterface, int n) {
								dialogInterface.dismiss();
							}
						});
			}

		};
		this.g = new WeakReference((Object) activity);
	}

	// public static Dialog a(final Context context, final pd pd,
	// final DialogInterface.OnClickListener onClickListener,
	// DialogInterface.OnClickListener onClickListener2,
	// final Intent intent, final vs vs, final pf pf) {
	// if (pd == null) {
	// return null;
	// }
	// wc wc = new wc(context);
	// wc.b((CharSequence) pd.n())
	// .a((CharSequence) pd.m())
	// .a(true)
	// .e(-1)
	// .a((CharSequence) context.getString(R.string.upgrade_go),
	// (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
	//
	// public void onClick(
	// DialogInterface dialogInterface, int n) {
	// if (pe.a(context, pd, intent, vs, pf, pd)
	// && onClickListener != null) {
	// onClickListener.onClick(dialogInterface, n);
	// }
	// }
	// })
	// .b((CharSequence) context.getString(R.string.upgrade_later),
	// (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
	//
	// public void onClick(
	// DialogInterface dialogInterface, int n) {
	// dialogInterface.dismiss();
	// // if (OnClickListener.this != null) {
	// // OnClickListener.this.onClick(
	// // dialogInterface, n);
	// // }
	// }
	// })
	// .a((DialogInterface.OnCancelListener) new
	// DialogInterface.OnCancelListener() {
	//
	// public void onCancel(DialogInterface dialogInterface) {
	// // if (OnClickListener.this != null) {
	// // OnClickListener.this.onClick(dialogInterface, 0);
	// // }
	// }
	// });
	// wb wb = wc.d();
	// wb.show();
	// return wb;
	// }
	public static Dialog a(
			final Context context,
			final pd pd1,
			final android.content.DialogInterface.OnClickListener onclicklistener,
			final android.content.DialogInterface.OnClickListener onclicklistener1,
			final Intent intent, final vs vs, final pf pf) {
		if (pd1 == null) {
			return null;
		} else {
			wc wc1 = new wc(context);
			wc1.b(pd1.n())
					.a(pd1.m())
					.a(true)
					.e(-1)
					.a(context.getString(0x7f0f00e5),
							new android.content.DialogInterface.OnClickListener() {

								final Context a;
								final pd b;
								final Intent c;
								final vs d;
								final pf e;
								final pd f;
								final android.content.DialogInterface.OnClickListener g;

								public void onClick(
										DialogInterface dialoginterface, int i) {
									if (pe.a(a, b, c, d, e, f) && g != null) {
										g.onClick(dialoginterface, i);
									}
								}

								{
									a = context;
									b = pd1;
									c = intent;
									d = vs;
									e = pf;
									f = pd1;
									g = onclicklistener;
									// super();
								}
							})
					.b(context.getString(0x7f0f00e6),
							new android.content.DialogInterface.OnClickListener() {

								final android.content.DialogInterface.OnClickListener a;

								public void onClick(
										DialogInterface dialoginterface, int i) {
									dialoginterface.dismiss();
									if (a != null) {
										a.onClick(dialoginterface, i);
									}
								}

								{
									a = onclicklistener;
									// super();
								}
							})
					.a(new android.content.DialogInterface.OnCancelListener() {

						final android.content.DialogInterface.OnClickListener a;

						public void onCancel(DialogInterface dialoginterface) {
							if (a != null) {
								a.onClick(dialoginterface, 0);
							}
						}

						{
							a = onclicklistener;
							// super();
						}
					});
			wb wb = wc1.d();
			((Dialog) wb).show();
			return wb;
		}
	}

	private DialogInterface.OnClickListener a(Context context) {
		return new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialogInterface, int n) {
				dialogInterface.dismiss();
				pa.this.e = true;
			}
		};
	}

	private vs a(Activity activity, Intent intent) {
		return new vs() {
			pd a;
			Activity b;
			Intent c;

			@Override
			public void a() {
				pe.b(this.a.g());
				pa.this.e = false;
			}

			/*
			 * Enabled aggressive block sorting
			 */
			@Override
			public void a(int n) {
				int n2;
				pe.c(this.a.g());
				switch (n) {
				default: {
					// Log.e((String)b, (String)("Error no is :" + n));
					n2 = R.string.download_error;
					break;
				}
				case 2:
				case 3: {
					n2 = R.string.download_error_connection;
					break;
				}
				case 1:
				case 5: {
					n2 = R.string.download_error_savefile;
					break;
				}
				case 7: {
					n2 = R.string.download_error_validatefile;
				}
				}
				if (!(n != 7 || this.b.isFinishing())) {
					pa.b((Context) this.b, this.a, null,
							pa.this.a((Context) this.b), this.c,
							pa.this.a(this.b, this.c), pa.this.d());
					return;
				}
				vi.a((Context) this.b, n2);
				pa.this.e = true;
			}

			@Override
			public void b() {
				pe.c(this.a.g());
				pa.this.e = true;
				vk.a((Context) this.b, this.a.l());
			}
		};
	}

	public static void b(final Context context, final pd pd,
			final DialogInterface.OnClickListener onClickListener,
			DialogInterface.OnClickListener onClickListener2,
			final Intent intent, final vs vs, final pf pf) {
		if (pd == null) {
			return;
		}
		tp.a(context,
				(CharSequence) (pd.a() + context.getResources().getString(
						R.string.download_title_suffix)),
				(CharSequence) context.getString(R.string.download_retry),
				(CharSequence) context.getString(R.string.download_again),
				(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialogInterface, int n) {
						pe.a(context, pd, intent, vs, pf);
						if (onClickListener != null) {
							onClickListener.onClick(dialogInterface, n);
						}
					}
				},
				(CharSequence) context
						.getString(R.string.download_confirm_noDownload),
				(DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialogInterface, int n) {
						dialogInterface.dismiss();
						if (context != null) {
							((OnClickListener) context).onClick(
									dialogInterface, n);
						}
					}
				});
	}

	private pf d() {
		return new pf() {

			@Override
			public void a(int n) {
				if (n == -1 || n == 1000) {
					pa.this.e = true;
				}
			}
		};
	}

	/*
	 * public void a() { final Activity activity; if (!this.e || (activity =
	 * (Activity) this.g.get()) == null || this.c != null && this.c.isShowing())
	 * { return; } this.e = false; if (!uj.e((Context) activity)) {
	 * tp.a((Context) activity, (CharSequence)
	 * activity.getString(R.string.download_error), (CharSequence) activity
	 * .getString(R.string.download_error_noconnection), (CharSequence)
	 * activity.getString(17039370), (DialogInterface.OnClickListener) new
	 * DialogInterface.OnClickListener() {
	 * 
	 * public void onClick(DialogInterface dialogInterface, int n) { pa.this.e =
	 * true; dialogInterface.dismiss(); } }); this.e = false; return; }
	 * pe.a((Context) activity, System.currentTimeMillis()); Thread var2_2 = new
	 * Thread() {
	 * 
	 * private void a(Handler handler, int n) { Bundle bundle = new Bundle();
	 * bundle.putInt("checkUpgradeError", n); handler.sendMessage(vk.a(handler,
	 * 8, bundle, (Object) null)); }
	 * 
	 * 
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 * 
	 * public void run() { try { pd pd = pe.a((Context) activity, "manual"); if
	 * (this.isInterrupted()) return; { if (pd == null) {
	 * pa.this.a.sendEmptyMessage(7); return; } pa.this.f = pd;
	 * pa.this.a.sendEmptyMessage(6); return; } } catch (Exception var1_6) {
	 * this.a(pa.this.a, 3); } } }; var2_2.start(); this.c = tp.a((Context)
	 * activity, (CharSequence) activity.getString(R.string.download_checking),
	 * true, new DialogInterface.OnCancelListener() { synthetic Thread a;
	 * 
	 * public void onCancel(DialogInterface dialogInterface) { pa.this.e = true;
	 * try { if (this.a.isAlive()) { this.a.interrupt(); } return; } catch
	 * (Exception var3_2) { Log.e((String) b, (String)
	 * "close background thread", (Throwable) var3_2); return; } } }); }
	 */

	static android.content.DialogInterface.OnClickListener a(pa pa1,
			Context context) {
		return pa1.a(context);
	}

	static WeakReference a(pa pa1) {
		return pa1.g;
	}

	static ProgressDialog a(pa pa1, ProgressDialog progressdialog) {
		pa1.c = progressdialog;
		return progressdialog;
	}

	static Dialog a(pa pa1, Dialog dialog) {
		pa1.d = dialog;
		return dialog;
	}

	static pd a(pa pa1, pd pd1) {
		pa1.f = pd1;
		return pd1;
	}

	static boolean a(pa pa1, boolean flag) {
		pa1.e = flag;
		return flag;
	}

	public void a() {
		final Activity activity;
		if (e) {
			if ((activity = (Activity) g.get()) != null
					&& (c == null || !c.isShowing())) {
				e = false;
				if (!uj.e(activity)) {
					tp.a(activity,
							activity.getString(R.string.download_error),
							activity.getString(R.string.download_error_noconnection),
							activity.getString(0x104000a),
							new android.content.DialogInterface.OnClickListener() {

								final pa a;

								public void onClick(
										DialogInterface dialoginterface, int i) {
									pa.a(a, true);
									dialoginterface.dismiss();
								}

								{
									a = pa.this;
									// super();
								}
							});
					e = false;
					return;
				} else {
					pe.a(activity, System.currentTimeMillis());
					final Thread thread = new Thread() {

						final Activity a;
						final pa b;

						private void a(Handler handler, int i) {
							Bundle bundle = new Bundle();
							bundle.putInt("checkUpgradeError", i);
							handler.sendMessage(vk.a(handler, 8, bundle, null));
						}

						public void run() {
							pd pd1;
							pd1 = pe.a(a, "manual");
							if (!isInterrupted()) {
								// break MISSING_BLOCK_LABEL_115;

								if (pd1 == null) {
									try {
										b.a.sendEmptyMessage(7);
										return;
									} catch (Exception exception) {
										a(b.a, 3);
									}
									// break MISSING_BLOCK_LABEL_115;
								}
							}
							pa.a(b, pd1);
							b.a.sendEmptyMessage(6);
							return;
						}

						{
							b = pa.this;
							a = activity;
							// super();
						}
					};
					thread.start();
					c = tp.a(
							activity,
							activity.getString(R.string.download_checking),
							true,
							new android.content.DialogInterface.OnCancelListener() {

								final Thread a;
								final pa b;

								public void onCancel(
										DialogInterface dialoginterface) {
									pa.a(b, true);
									try {
										if (a.isAlive()) {
											a.interrupt();
										}
										return;
									}
									// Misplaced declaration of an exception
									// variable
									catch (Exception pa) {
										// Log.e(pa.c(),
										// "close background thread",
										// dialoginterface);
									}
								}

								{
									b = pa.this;
									a = thread;
									// super();
								}
							});
					return;
				}
			}
		}
	}

	public void a(Intent intent) {
		pd pd = null;
		Activity activity = (Activity) this.g.get();
		if (activity == null) {
			return;
		}
		if (this.d != null) {
			if (this.d.isShowing())
				return;
		}
		if ((pd = pd.a(intent)) == null)
			return;
		try {
			PackageInfo packageInfo = activity.getPackageManager()
					.getPackageInfo(pd.g(), 0);
			if (packageInfo == null)
				return;
			if (packageInfo.versionCode >= pd.b())
				return;
			Intent intent2 = pe.a((Context) activity, MainActivity.class);
			this.d = pa.a((Context) activity, pd, null, null, intent2,
					pe.a(pd, (Context) activity, intent2), this.d());
			return;
		} catch (PackageManager.NameNotFoundException var4_6) {
			Log.e((String) b, (String) "name not found", (Throwable) var4_6);
			return;
		}
	}

	public void b() {
		Activity activity = (Activity) this.g.get();
		if (activity == null) {
			return;
		}
		tp.a(this.d);
		tp.a(this.c, (Context) activity);
	}
}
