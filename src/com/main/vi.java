package com.main;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class vi {
	private static Toast a;

	public static void a(Context paramContext, int paramInt) {
		a(paramContext, paramInt, 0);
	}

	public static void a(Context paramContext, int paramInt1, int paramInt2) {
		a(paramContext, paramInt1, paramInt2, -1);
	}

	public static void a(Context paramContext, int paramInt1, int paramInt2,
			int paramInt3) {
		int i = 1;
		if ((to.H()) && (paramContext.getApplicationContext() == null)) {
			return;
		}
		if ((a != null) && (!to.v())) {
			a.cancel();
		}
		Context localContext = paramContext.getApplicationContext();
		if (paramInt2 == i) {
		}

		a = Toast.makeText(localContext, paramInt1, i);
		b(paramContext, paramInt1);
		if (paramInt3 >= 0) {
			a.setGravity(paramInt3, 0, 0);
		}
		a.show();

		i = 0;

	}

	private static void a(Context context, CharSequence charsequence) {
		Object obj = null;
		Object obj1 = uo.c(android.widget.Toast.class, "mTN");
		Object obj2 = null;
		((Field) (obj1)).setAccessible(true);
		try {
			obj2 = ((Field) (obj1)).get(a);
		} catch (IllegalAccessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IllegalArgumentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		((Field) (obj1)).setAccessible(false);
		if (obj2 == null) {
			// break MISSING_BLOCK_LABEL_70;
		}
		obj1 = uo.c(obj2.getClass(), "mParams");
		((Field) (obj1)).setAccessible(true);
		try {
			((android.view.WindowManager.LayoutParams) ((Field) (obj1))
					.get(obj2)).type = 2010;
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		int i = 0;
		try {
			((Field) (obj1)).setAccessible(false);
		} catch (Throwable throwable) {
		}
		try {
			i = Integer.parseInt(Class.forName("com.android.internal.R$id")
					.getField("message").get(null).toString());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1 = (TextView) a.getView().findViewById(i);
		obj = obj1;
		// _L2:
		if (obj != null) {
			obj1 = ((TextView) (obj)).getLayoutParams();
			android.content.res.ColorStateList colorstatelist = ((TextView) (obj))
					.getTextColors();
			((ViewGroup) a.getView()).removeView(((View) (obj)));

			TextView textView = new TextView(context);
			textView.setGravity(((TextView) (obj)).getGravity());
			textView.setPadding(((TextView) (obj)).getPaddingLeft(),
					((TextView) (obj)).getPaddingTop(),
					((TextView) (obj)).getPaddingRight(),
					((TextView) (obj)).getPaddingBottom());
			((ViewGroup) a.getView()).addView(textView,
					((android.view.ViewGroup.LayoutParams) (obj1)));
			textView.setTextColor(colorstatelist);
			textView.setText(charsequence);
		}

		// ((AccessibleObject) obj1).setAccessible(false);

		//((AccessibleObject) obj1).setAccessible(false);
		return;

	}

	public static void a(Context paramContext, CharSequence paramCharSequence,
			int paramInt) {
		a(paramContext, paramCharSequence, paramInt, -1);
	}

	public static void a(Context paramContext, CharSequence paramCharSequence,
			int paramInt1, int paramInt2) {
		a(paramContext, paramCharSequence, paramInt1, paramInt2, 0, 0);
	}

	public static void a(Context paramContext, CharSequence paramCharSequence,
			int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
		int i = 1;
		if ((to.H()) && (paramContext.getApplicationContext() == null)) {
			return;
		}
		if ((a != null) && (!to.v())) {
			a.cancel();
		}
		Context localContext = paramContext.getApplicationContext();
		if (paramInt1 == i) {
		}

		a = Toast.makeText(localContext, paramCharSequence, i);
		a(paramContext, paramCharSequence);
		if (paramInt2 >= 0) {
			a.setGravity(paramInt2, paramInt3, paramInt4);
		}
		a.show();

	}

	public static void a(Context paramContext, String paramString) {
		if ((to.H()) && (paramContext.getApplicationContext() == null)) {
			 return;
		}

		if ((a != null) && (!to.v())) {
			a.cancel();
		}
		a = Toast
				.makeText(paramContext.getApplicationContext(), paramString, 0);
		  a(paramContext, ((CharSequence) (paramString)));
		a.show();
	}
//	public static void a(Context context, String s)
//    {
//        if (to.H() && context.getApplicationContext() == null)
//        {
//            return;
//        }
//        if (a != null && !to.v())
//        {
//            a.cancel();
//        }
//        a = Toast.makeText(context.getApplicationContext(), s, 0);
//        a(context, ((CharSequence) (s)));
//        a.show();
//    }

	private static void b(Context paramContext, int paramInt) {
		a(paramContext, paramContext.getResources().getText(paramInt));
	}
}
