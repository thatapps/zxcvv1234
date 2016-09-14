package com.main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;

import com.lazyswipe.SwipeApplication;

/*
 * Failed to analyse overrides
 */
public class ww extends PopupWindow {
	private Field a;
	private Field b;
	private Field c;
	private Field d;
	private Field e;
	private Field f;
	private Field g;
	private Method h;
	private Method i;
	private Method j;
	private Method k;
	private Method l;

	public ww() {
		this(null, 0, 0);
	}

	public ww(View view, int n, int n2) {
		super(view, n, n2);
		this.a();
	}

	private void a() {
		try {
			this.a = PopupWindow.class.getDeclaredField("mContentView");
			this.a.setAccessible(true);
			this.b = PopupWindow.class.getDeclaredField("mIsShowing");
			this.b.setAccessible(true);
			this.c = PopupWindow.class.getDeclaredField("mIsDropdown");
			this.c.setAccessible(true);
			this.e = PopupWindow.class.getDeclaredField("mLastHeight");
			this.e.setAccessible(true);
			this.d = PopupWindow.class.getDeclaredField("mHeightMode");
			this.d.setAccessible(true);
			this.g = PopupWindow.class.getDeclaredField("mLastWidth");
			this.g.setAccessible(true);
			this.f = PopupWindow.class.getDeclaredField("mWidthMode");
			this.f.setAccessible(true);
			this.h = PopupWindow.class.getDeclaredMethod(
					"unregisterForScrollChanged", new Class[0]);
			this.h.setAccessible(true);
			this.i = PopupWindow.class.getDeclaredMethod("createPopupLayout",
					new Class[] { IBinder.class });
			this.i.setAccessible(true);
			this.j = PopupWindow.class.getDeclaredMethod(
					"computeAnimationResource", new Class[0]);
			this.j.setAccessible(true);
			this.k = PopupWindow.class.getDeclaredMethod("preparePopup",
					new Class[] { WindowManager.LayoutParams.class });
			this.k.setAccessible(true);
			this.l = PopupWindow.class.getDeclaredMethod("invokePopup",
					new Class[] { WindowManager.LayoutParams.class });
			this.l.setAccessible(true);
			return;
		} catch (Throwable var1_1) {
			return;
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	@TargetApi(value = 19)
	public void a(IBinder iBinder, int n, int n2, int n3) {
		try {
			if (this.isShowing()) {
				return;
			}

			int n4;
			if (this.a.get((Object) this) == null) {
				return;
			}
			this.h.invoke((Object) this, new Object[0]);
			this.b.set((Object) this, (Object) true);
			this.c.set((Object) this, (Object) false);
			WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.i
					.invoke((Object) this, new Object[] { iBinder });
			layoutParams.windowAnimations = (Integer) this.j.invoke(
					(Object) this, new Object[0]);
			this.k.invoke((Object) this, new Object[] { layoutParams });
			if (n == 0) {
				n = 48 | SwipeApplication.a;
			}
			layoutParams.gravity = n;
			layoutParams.x = n2;
			layoutParams.y = n3;
			int n5 = (Integer) this.d.get((Object) this);
			if (n5 < 0) {
				layoutParams.height = n5;
				this.e.set((Object) this, (Object) n5);
			}
			if ((n4 = ((Integer) this.f.get((Object) this)).intValue()) < 0) {
				layoutParams.width = n4;
				this.g.set((Object) this, (Object) n4);
			}
			layoutParams.flags = 201327360 | layoutParams.flags;
			this.l.invoke((Object) this, new Object[] { layoutParams });
			return;

		} catch (Throwable var5_8) {
			// empty catch block
		}
	}

	// public void a(IBinder ibinder, int i1, int j1, int k1) {
	// if (isShowing()) {
	// return;
	// }
	// try {
	// if (a.get(this) == null) {
	// return;
	// }
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// try {
	// h.invoke(this, new Object[0]);
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (InvocationTargetException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// try {
	// b.set(this, Boolean.valueOf(true));
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// try {
	// c.set(this, Boolean.valueOf(false));
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// android.view.WindowManager.LayoutParams params = null;
	// try {
	// params = (android.view.WindowManager.LayoutParams) i.invoke(this,
	// new Object[] { ibinder });
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (InvocationTargetException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// try {
	// params.windowAnimations = ((Integer) j.invoke(this, new Object[0]))
	// .intValue();
	// } catch (IllegalAccessException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// } catch (IllegalArgumentException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// } catch (InvocationTargetException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// }
	// try {
	// k.invoke(this, new Object[] { ibinder });
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (InvocationTargetException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// int l1;
	// l1 = i1;
	// if (i1 != 0) {
	// // break MISSING_BLOCK_LABEL_130;
	// }
	// l1 = SwipeApplication.a | 0x30;
	// params.gravity = l1;
	// params.x = j1;
	// params.y = k1;
	// try {
	// i1 = ((Integer) d.get(this)).intValue();
	// } catch (IllegalAccessException e3) {
	// // TODO Auto-generated catch block
	// e3.printStackTrace();
	// } catch (IllegalArgumentException e3) {
	// // TODO Auto-generated catch block
	// e3.printStackTrace();
	// }
	// if (i1 >= 0) {
	// // break MISSING_BLOCK_LABEL_183;
	// }
	// params.height = i1;
	// try {
	// e.set(this, Integer.valueOf(i1));
	// } catch (IllegalAccessException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IllegalArgumentException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// try {
	// i1 = ((Integer) f.get(this)).intValue();
	// } catch (IllegalAccessException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// } catch (IllegalArgumentException e2) {
	// // TODO Auto-generated catch block
	// e2.printStackTrace();
	// }
	// if (i1 >= 0) {
	// // break MISSING_BLOCK_LABEL_219;
	// }
	// params.width = i1;
	// try {
	// g.set(this, Integer.valueOf(i1));
	// } catch (IllegalAccessException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IllegalArgumentException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// params.flags = ((android.view.WindowManager.LayoutParams)
	// (ibinder)).flags | 0xc000300;
	// try {
	// l.invoke(this, new Object[] { ibinder });
	// } catch (IllegalAccessException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (IllegalArgumentException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } catch (InvocationTargetException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// return;
	//
	// }

	public void showAtLocation(View view, int n, int n2, int n3) {
		this.a(view.getWindowToken(), n, n2, n3);
	}
}
