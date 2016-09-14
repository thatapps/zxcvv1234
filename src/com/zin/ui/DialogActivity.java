/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.ImageView
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.lazyswipe.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.zev.R;
import com.main.ir;
import com.main.ja;
import com.main.tf;
import com.main.vb;
import com.main.vk;
import com.main.wc;

/*
 * Failed to analyse overrides
 */
public class DialogActivity extends Activity implements
		DialogInterface.OnCancelListener, DialogInterface.OnClickListener,
		DialogInterface.OnDismissListener {
	private static Dialog b;
	public int a;

	public static void a(Context context) {
		DialogActivity.a(context, 3);
	}

	private static void a(Context context, int n) {
		DialogActivity.a(context, new Intent(context,
				(Class) DialogActivity.class).putExtra("extra.dialog_id", n));

	}

	private static void a(Context context, Intent intent) {
		intent.addFlags(268435456);
		try {
			context.startActivity(intent);
			return;
		} catch (Exception var3_2) {
			return;
		}
	}

	public static void a(Context context, Bitmap bitmap) {
		DialogActivity.a(context, bitmap, false);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private static void a(final Context context, Bitmap bitmap, final boolean bl) {
		View view = LayoutInflater.from((Context) context).inflate(
				R.layout.app_promotion_download_dialog, null);
		((ImageView) view.findViewById(R.id.app_promotion_image))
				.setImageBitmap(bitmap);
		view.findViewById(R.id.action_download).setOnClickListener(
				(View.OnClickListener) new View.OnClickListener() {

					public void onClick(View view) {
						ja ja1 = ja.a();
						String string = "";
						if (!bl) {
							string = "HolaLauncher\u4E0B\u8F7D-Theme";
						} else {
							string = "HolaLauncher\u4E0B\u8F7D-Fan";
						}
						ja1.a(string);
						if (b != null) {
							b.dismiss();
						}
						vk.f(context,
								"com.hola.launcher&referrer=aq_tranid%3d0RWlnwbEN226OotMDF7l8IWSeoPaxvAeL%26pid%3dha_lazy_int%26c%3dlazyswipe_gp_theme");
					}
				});
		wc wc = new wc(context).a(view).b(true);
		DialogInterface.OnCancelListener onCancelListener = bl ? (DialogInterface.OnCancelListener) context
				: new DialogInterface.OnCancelListener() {

					public void onCancel(DialogInterface dialogInterface) {
						b = null;
					}
				};
		wc wc2 = wc.a(onCancelListener);
		DialogInterface.OnDismissListener onDismissListener = bl ? (DialogInterface.OnDismissListener) context
				: new DialogInterface.OnDismissListener() {

					public void onDismiss(DialogInterface dialogInterface) {
						b = null;
					}
				};
		b = wc2.a(onDismissListener).e();
		b.getWindow().setBackgroundDrawable(
				(Drawable) new ColorDrawable(context.getResources().getColor(
						17170445)));
	}

	public static void b(Context context) {
		DialogActivity.a(context, 2);
	}

	public static void c(Context context) {
		DialogActivity.a(context, 0);
	}

	public static void d(Context context) {
		DialogActivity.a(context, 1);
	}

	public void onCancel(DialogInterface dialogInterface) {
		this.finish();
		b = null;
	}

	public void onClick(DialogInterface dialogInterface, int n) {
		dialogInterface.dismiss();
		switch (this.a) {
		default: {
			return;
		}
		case 0: {
			vk.f((Context) this,
					"com.hola.screenlock&referrer=aq_tranid%3d0OBV7rbnknKGmMtXRSrNfpJt00La0EJyA%26pid%3dha_lazy_int%26c%3dlazyswipe_gp");
			return;
		}
		case 1: {
			if (vk.b((Context) this, "com.hola.screenlock")) {
				vk.c((Context) this,
						new Intent("com.hola.screenlock.action.main")
								.setPackage("com.hola.screenlock").addFlags(32));
				return;
			}
			vk.g((Context) this);
			return;
		}
		case 2: {
			SwipeAccessibilityService.a((Context) this, false);
			return;
		}
		case 3:
		}
		ir.b((Context) this, vb.a());
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	protected void onCreate(Bundle bundle) {
		int n;
		super.onCreate(bundle);
		Intent intent = this.getIntent();
		this.a = intent.getIntExtra("extra.dialog_id", -1);
		switch (this.a) {
		default: {
			this.finish();
			return;
		}
		case 4: {
			try {
				DialogActivity.a((Context) this, tf.a(
						intent.getStringExtra("extra.param_1"), 2560, 2560),
						true);
				return;
			} catch (Throwable var5_3) {
				return;
			}
		}
		case 0: {
			n = R.string.msg_install_lockscreen;
			break;
		}
		case 1: {
			n = R.string.msg_activate_lockscreen;
			break;
		}
		case 2: {
			n = R.string.msg_enable_accessibility_service;
					
			break;
		}
		case 3: {
			n = R.string.title_enable_root;
		}
		}
		new wc((Context) this).f(n).b(17039369, null)
				.a(17039379, (DialogInterface.OnClickListener) this).e(-1)
				.a((DialogInterface.OnDismissListener) this).e();
	}

	public void onDismiss(DialogInterface dialogInterface) {
		this.finish();
		b = null;
	}

	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		this.setIntent(intent);
	}

}
