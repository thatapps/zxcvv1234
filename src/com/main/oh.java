package com.main;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;
import com.lazyswipe.SwipeApplication;
import com.lazyswipe.SwipeService;

public class oh {

	public static void a() {
		oi.a(SwipeApplication.e(), "POP_TIME_HAS_EVER_MODIFY_BLACK_LIST", true);
	}

	static void a(Context context) {
		b(context);
	}

	public static void a(String s) {
		final SwipeApplication swipeapplication;
		for (swipeapplication = SwipeApplication.e(); oi.b(swipeapplication,
				"POP_TIME_HAS_EVER_MODIFY_BLACK_LIST", false)
				|| c(s)
				|| !oe.c(s);) {
			return;
		}

		b(s);
		final jq jq1 = SwipeApplication.e().b().a(s);
		s = "";
		if (jq1 != null) {
			s = jq1.b.toString();
		}
		(new wj(swipeapplication))
				.a(0x7f0f000f, s, new ForegroundColorSpan(0xff23a4ee), 33)
				.a(swipeapplication.getString(0x104000a),
						new android.view.View.OnClickListener() {

							final Context a;

							public void onClick(View view) {
								Toast.makeText(a, 0x7f0f0011, 1).show();
							}

							{
								a = swipeapplication;
								// super();
							}
						})
				.b(swipeapplication.getString(0x1040000),
						new android.view.View.OnClickListener() {

							final jq a;
							final Context b;

							public void onClick(View view) {
								if (a != null && a.h != null) {
									oe.a(a.h.getPackageName());
								}
								oh.a(b);
								Toast.makeText(b, 0x7f0f0010, 1).show();
							}

							{
								a = jq1;
								b = swipeapplication;
								// super();
							}
						}).b();
	}

	private static void b(Context context) {
		Bundle bundle = new Bundle(1);
		bundle.putInt("operation", 9);
		SwipeService.a(context, bundle);
	}

	private static void b(String s) {
		s = d(s);
		oi.a(SwipeApplication.e(), s, true);
	}

	private static boolean c(String s) {
		s = d(s);
		return oi.b(SwipeApplication.e(), s, false);
	}

	private static String d(String s) {
		if (s == null) {
			return "HAS_EVER_SHOWN_TOP_PACKAGE_PREFIX_";
		} else {
			return (new StringBuilder())
					.append("HAS_EVER_SHOWN_TOP_PACKAGE_PREFIX_")
					.append(s.replace(".", "_")).toString();
		}
	}
}
