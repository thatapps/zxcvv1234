package com.main;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.widget.Button;

import com.lazyswipe.zev.R;

public class wb extends Dialog {
	public static final DialogInterface.OnClickListener d = new DialogInterface.OnClickListener() {

		public void onClick(DialogInterface dialogInterface, int n) {
			dialogInterface.dismiss();
		}
	};
	private final Context a;
	private Window b;
	Handler c;

	public wb(Context context) {
		this(context, R.style.CustomDialog);
	}

	public wb(Context context, int n) {
		super(context, n);
		this.a = context;
		this.b();
	}

	/*
	 * Unable to fully structure code Enabled aggressive block sorting Enabled
	 * unnecessary exception pruning Lifted jumps to return sites
	 */
	// private void b() {
	// TypedArray var1_1 = null;
	// this.b = this.getWindow();
	// try {
	// var1_1 = this.a.getTheme().obtainStyledAttributes(null,
	// in.CustomDialog, R.attr.customDialogStyle, 0);
	// TypedArray var6_2 = var1_1;
	//
	// Drawable var8_3 = var1_1.getDrawable(0);
	// this.b.setBackgroundDrawable((android.graphics.drawable.Drawable)
	// var8_3);
	// } catch (Throwable var2_5) {
	//
	// }
	//
	// }
	private void b() {
		Object obj1;
		obj1 = null;
		b = getWindow();
		TypedArray obj = a.getTheme().obtainStyledAttributes(null, in.CustomDialog,
				0x7f01002d, 0);
		
		obj1 = obj;
		Object obj2 =  obj.getDrawable(0);
		obj1 = obj;
		b.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
		if (obj != null) {
			((TypedArray) (obj)).recycle();
		}
		if (obj2 != null) {
			((TypedArray) (obj2)).recycle();
		}
//		if (obj1 != null) {
//
//			((TypedArray) (obj1)).recycle();
//			return;
//
//		}

		

	}

	public Button a() {
		if (this.b != null) {
			return (Button) this.b
					.findViewById(R.id.custom_dialog_positive_button);
		} else {
			return null;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void dismiss() {
		try {
			super.dismiss();
		} catch (Throwable throwable) {
			Log.w("Swipe.CustomDialog", "Could not dismiss this dialog",
					throwable);
		}
		if (c != null) {
			c.removeMessages(1);
		}
	}

	public Button e() {
		if (this.b != null) {
			return (Button) this.b
					.findViewById(R.id.custom_dialog_negative_button);
		} else {
			return null;
		}
	}

	public Button f() {
		if (this.b != null) {
			return (Button) this.b
					.findViewById(R.id.custom_dialog_neutral_button);
		} else {
			return null;
		}
	}

}