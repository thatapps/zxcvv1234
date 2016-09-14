package com.main;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;

public class tp {

	private static final String a = (new StringBuilder()).append("Swipe.")
			.append(tp.class.getSimpleName()).toString();

	public tp() {
	}

	public static ProgressDialog a(Context context, CharSequence charsequence,
			boolean flag,
			android.content.DialogInterface.OnCancelListener oncancellistener) {
		return a(context, charsequence, flag, true, oncancellistener);
	}

	public static ProgressDialog a(Context context, CharSequence charsequence,
			boolean flag, boolean flag1,
			android.content.DialogInterface.OnCancelListener oncancellistener) {
		ProgressDialog progressDialog = new ProgressDialog(context);
		progressDialog.setMessage(charsequence);
		progressDialog.setCancelable(flag1);
		progressDialog.setOnCancelListener(oncancellistener);
		progressDialog.setIndeterminate(flag);
		progressDialog
				.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

					public boolean onKey(DialogInterface dialoginterface,
							int i, KeyEvent keyevent) {
						switch (i) {
						default:
							return false;

						case 84: // 'T'
							return true;
						}
					}

				});
		try {
			progressDialog.show();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			return progressDialog;
		}
		return progressDialog;
	}

	public static wb a(Context context, CharSequence charsequence,
			CharSequence charsequence1) {
		return a(context, charsequence, charsequence1, null, null, null, null,
				null, null, null);
	}

	public static wb a(Context context, CharSequence charsequence,
			CharSequence charsequence1, CharSequence charsequence2,
			android.content.DialogInterface.OnClickListener onclicklistener) {
		return a(context, charsequence, charsequence1, charsequence2,
				onclicklistener, null, null, null, null, null);
	}

	public static wb a(Context context, CharSequence charsequence,
			CharSequence charsequence1, CharSequence charsequence2,
			android.content.DialogInterface.OnClickListener onclicklistener,
			CharSequence charsequence3,
			android.content.DialogInterface.OnClickListener onclicklistener1) {
		return a(context, charsequence, charsequence1, charsequence2,
				onclicklistener, charsequence3, onclicklistener1, null, null,
				null);
	}

	public static wb a(Context context, CharSequence charsequence,
			CharSequence charsequence1, CharSequence charsequence2,
			android.content.DialogInterface.OnClickListener onclicklistener,
			CharSequence charsequence3,
			android.content.DialogInterface.OnClickListener onclicklistener1,
			CharSequence charsequence4,
			android.content.DialogInterface.OnClickListener onclicklistener2,
			android.content.DialogInterface.OnCancelListener oncancellistener) {
		return a(context, charsequence, charsequence1, charsequence2,
				onclicklistener, charsequence3, onclicklistener1,
				charsequence4, onclicklistener2, oncancellistener, -1);
	}

	public static wb a(Context context, CharSequence charsequence,
			CharSequence charsequence1, CharSequence charsequence2,
			android.content.DialogInterface.OnClickListener onclicklistener,
			CharSequence charsequence3,
			android.content.DialogInterface.OnClickListener onclicklistener1,
			CharSequence charsequence4,
			android.content.DialogInterface.OnClickListener onclicklistener2,
			android.content.DialogInterface.OnCancelListener oncancellistener,
			int i) {
		if (a(context)) {
			return null;
		}
		wc wc = new wc(context);
		if (charsequence != null) {
			wc.a(charsequence);
		}
		if (charsequence1 != null) {
			wc.b(charsequence1);
		}
		if (charsequence2 != null) {
			wc.a(charsequence2, onclicklistener);
			if (i == -1) {
				wc.e(i);
			}
		}
		if (charsequence3 != null) {
			wc.b(charsequence3, onclicklistener1);
			if (i == -2) {
				wc.e(i);
			}
		}
		if (charsequence4 != null) {
			wc.c(charsequence4, onclicklistener2);
			if (i == -3) {
				wc.e(i);
			}
		}
		if (oncancellistener != null) {
			wc.a(oncancellistener);
		}
		wb wb = null;
		try {
			wb = wc.e();
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e(a, "Show dialog failed and safely ignored.", exception);
			return null;
		}
		return wb;
	}

	public static void a(Dialog dialog) {
		if (dialog == null) {
			return;
		}
		try {
			dialog.dismiss();
			return;
		}
		// Misplaced declaration of an exception variable
		catch (Exception exception) {
			Log.e(a, "dismiss dialog failed and safely ignored.", exception);
		}
	}

	public static void a(ProgressDialog progressdialog, Context context) {
		if (a(context)) {
			Log.e(a,
					(new StringBuilder())
							.append("[Silent Exception] Activity [")
							.append(context.getClass().getName())
							.append("]finished. No need to Dismiss progress dialog ")
							.toString());
		} else if (progressdialog != null && progressdialog.isShowing()) {
			try {
				progressdialog.dismiss();
				return;
			}
		
			catch (Exception exception) {
				Log.e(a, "[Silent Exception] Dismiss progress dialog failed. ",
						exception);
			}
			return;
		}
	}

	private static boolean a(Context context) {
		return (context instanceof Activity)
				&& ((Activity) context).isFinishing();
	}

}
