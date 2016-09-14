package com.main;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.android.support.v4.app1.Fragment;

public class i extends Activity {
	Handler a;
	public n b;
	k c;
	boolean d;
	boolean e;
	boolean f;
	boolean g;
	public boolean h;
	boolean i;
	boolean j;
	boolean k;
	cp l;
	w m;

	static String a(View view) {
		byte byte0;
		byte byte1;
		StringBuilder stringbuilder;
		byte1 = 70;
		byte0 = 46;
		stringbuilder = new StringBuilder(128);
		stringbuilder.append(view.getClass().getName());
		stringbuilder.append('{');
		stringbuilder
				.append(Integer.toHexString(System.identityHashCode(view)));
		stringbuilder.append(' ');
		view.getVisibility();
		// JVM INSTR lookupswitch 3: default 100
		// 0: 523
		// 4: 534
		// 8: 545;
		// goto _L1 _L2 _L3 _L4
		// _L1: stringbuilder.append('.');
		// _L11:
		char c1;
		Object obj;
		String s;
		int i1;
		if (view.isFocusable()) {
			c1 = 'F';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isEnabled()) {
			c1 = 'E';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.willNotDraw()) {
			c1 = '.';
		} else {
			c1 = 'D';
		}
		stringbuilder.append(c1);
		if (view.isHorizontalScrollBarEnabled()) {
			c1 = 'H';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isVerticalScrollBarEnabled()) {
			c1 = 'V';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isClickable()) {
			c1 = 'C';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isLongClickable()) {
			c1 = 'L';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		if (view.isFocused()) {
			c1 = (char) byte1;
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isSelected()) {
			c1 = 'S';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		c1 = (char) byte0;
		if (view.isPressed()) {
			c1 = 'P';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		stringbuilder.append(view.getLeft());
		stringbuilder.append(',');
		stringbuilder.append(view.getTop());
		stringbuilder.append('-');
		stringbuilder.append(view.getRight());
		stringbuilder.append(',');
		stringbuilder.append(view.getBottom());
		i1 = view.getId();
		if (i1 == -1) {
			stringbuilder.append("}");
			return stringbuilder.toString();

		} else {
			stringbuilder.append(" #");
			stringbuilder.append(Integer.toHexString(i1));
			obj = view.getResources();
			if (i1 == 0 || obj == null) {
				stringbuilder.append("}");
				return stringbuilder.toString();
			} else {

				String view1 = ((Resources) (obj)).getResourcePackageName(i1);
				if (view1 == "android") {
					s = ((Resources) (obj)).getResourceTypeName(i1);
					obj = ((Resources) (obj)).getResourceEntryName(i1);
					stringbuilder.append(" ");
					stringbuilder.append(view);
					stringbuilder.append(":");
					stringbuilder.append(s);
					stringbuilder.append("/");
					stringbuilder.append(((String) (obj)));

					stringbuilder.append("}");
					return stringbuilder.toString();
				} else if (view1 == "app") {

					s = ((Resources) (obj)).getResourceTypeName(i1);
					obj = ((Resources) (obj)).getResourceEntryName(i1);
					stringbuilder.append(" ");
					stringbuilder.append(view);
					stringbuilder.append(":");
					stringbuilder.append(s);
					stringbuilder.append("/");
					stringbuilder.append(((String) (obj)));
				}
			}
		}

		stringbuilder.append('V');

		if (view.isFocusable()) {
			c1 = 'F';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isEnabled()) {
			c1 = 'E';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.willNotDraw()) {
			c1 = '.';
		} else {
			c1 = 'D';
		}
		stringbuilder.append(c1);
		if (view.isHorizontalScrollBarEnabled()) {
			c1 = 'H';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isVerticalScrollBarEnabled()) {
			c1 = 'V';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isClickable()) {
			c1 = 'C';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isLongClickable()) {
			c1 = 'L';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		if (view.isFocused()) {
			c1 = (char) byte1;
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isSelected()) {
			c1 = 'S';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		c1 = (char) byte0;
		if (view.isPressed()) {
			c1 = 'P';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		stringbuilder.append(view.getLeft());
		stringbuilder.append(',');
		stringbuilder.append(view.getTop());
		stringbuilder.append('-');
		stringbuilder.append(view.getRight());
		stringbuilder.append(',');
		stringbuilder.append(view.getBottom());
		i1 = view.getId();
		stringbuilder.append('I');

		if (view.isFocusable()) {
			c1 = 'F';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isEnabled()) {
			c1 = 'E';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.willNotDraw()) {
			c1 = '.';
		} else {
			c1 = 'D';
		}
		stringbuilder.append(c1);
		if (view.isHorizontalScrollBarEnabled()) {
			c1 = 'H';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isVerticalScrollBarEnabled()) {
			c1 = 'V';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isClickable()) {
			c1 = 'C';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isLongClickable()) {
			c1 = 'L';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		if (view.isFocused()) {
			c1 = (char) byte1;
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isSelected()) {
			c1 = 'S';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		c1 = (char) byte0;
		if (view.isPressed()) {
			c1 = 'P';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		stringbuilder.append(view.getLeft());
		stringbuilder.append(',');
		stringbuilder.append(view.getTop());
		stringbuilder.append('-');
		stringbuilder.append(view.getRight());
		stringbuilder.append(',');
		stringbuilder.append(view.getBottom());
		i1 = view.getId();
		stringbuilder.append('G');

		if (view.isFocusable()) {
			c1 = 'F';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isEnabled()) {
			c1 = 'E';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.willNotDraw()) {
			c1 = '.';
		} else {
			c1 = 'D';
		}
		stringbuilder.append(c1);
		if (view.isHorizontalScrollBarEnabled()) {
			c1 = 'H';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isVerticalScrollBarEnabled()) {
			c1 = 'V';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isClickable()) {
			c1 = 'C';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isLongClickable()) {
			c1 = 'L';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		if (view.isFocused()) {
			c1 = (char) byte1;
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		if (view.isSelected()) {
			c1 = 'S';
		} else {
			c1 = '.';
		}
		stringbuilder.append(c1);
		c1 = (char) byte0;
		if (view.isPressed()) {
			c1 = 'P';
		}
		stringbuilder.append(c1);
		stringbuilder.append(' ');
		stringbuilder.append(view.getLeft());
		stringbuilder.append(',');
		stringbuilder.append(view.getTop());
		stringbuilder.append('-');
		stringbuilder.append(view.getRight());
		stringbuilder.append(',');
		stringbuilder.append(view.getBottom());
		return stringbuilder.toString();
	}

	private void a(String paramString, PrintWriter paramPrintWriter,
			View paramView) {
		paramPrintWriter.print(paramString);
		if (paramView == null) {
			paramPrintWriter.println("null");
		}

		paramPrintWriter.println(a(paramView));
		if ((paramView instanceof ViewGroup)) {
			ViewGroup localViewGroup = (ViewGroup) paramView;
			int n = localViewGroup.getChildCount();
			if (n > 0) {
				String str = paramString + "  ";
				for (int i1 = 0; i1 < n; i1++) {
					a(str, paramPrintWriter, localViewGroup.getChildAt(i1));
				}
			}

		}
	}

	  public w a(String s, boolean flag, boolean flag1)
	    {
	        if (l == null)
	        {
	            l = new cp();
	        }
	        w w1 = (w)l.get(s);
	        if (w1 == null)
	        {
	            if (flag1)
	            {
	                w1 = new w(s, this, flag);
	                l.put(s, w1);
	            }
	            return w1;
	        } else
	        {
	            w1.a(this);
	            return w1;
	        }
	    }

	    public void a()
	    {
	       //  a.a();
	    }

	    public void a(Fragment fragment)
	    {
	    }

	    void a(String s)
	    {
	        if (l != null)
	        {
	            w w1 = (w)l.get(s);
	            if (w1 != null && !w1.g)
	            {
	                w1.h();
	                l.remove(s);
	            }
	        }
	    }

	    void a(boolean flag)
	    {
	        if (!g)
	        {
	            g = true;
	            h = flag;
	            a.removeMessages(1);
	            e();
	        }
	    }

	    protected boolean a(View view, Menu menu)
	    {
	        return super.onPreparePanel(0, view, menu);
	    }

	    protected void b()
	    {
	        b.m();
	    }

	    public Object c()
	    {
	        return null;
	    }

	    public void d()
	    {
	        if (android.os.Build.VERSION.SDK_INT >= 11)
	        {
	            c.a();
	            return;
	        } else
	        {
	            i = true;
	            return;
	        }
	    }


	public void dump(String s, FileDescriptor filedescriptor,
			PrintWriter printwriter, String as[]) {
		if (android.os.Build.VERSION.SDK_INT < 11)
			;
		printwriter.print(s);
		printwriter.print("Local FragmentActivity ");
		printwriter.print(Integer.toHexString(System.identityHashCode(this)));
		printwriter.println(" State:");
		String s1 = (new StringBuilder()).append(s).append("  ").toString();
		printwriter.print(s1);
		printwriter.print("mCreated=");
		printwriter.print(d);
		printwriter.print("mResumed=");
		printwriter.print(e);
		printwriter.print(" mStopped=");
		printwriter.print(f);
		printwriter.print(" mReallyStopped=");
		printwriter.println(g);
		printwriter.print(s1);
		printwriter.print("mLoadersStarted=");
		printwriter.println(k);
		if (m != null) {
			printwriter.print(s);
			printwriter.print("Loader Manager ");
			printwriter.print(Integer.toHexString(System.identityHashCode(m)));
			printwriter.println(":");
			m.a((new StringBuilder()).append(s).append("  ").toString(),
					filedescriptor, printwriter, as);
		}
		b.a(s, filedescriptor, printwriter, as);
		printwriter.print(s);
		printwriter.println("View Hierarchy:");
		a((new StringBuilder()).append(s).append("  ").toString(), printwriter,
				getWindow().getDecorView());
	}

	void e() {
		if (k) {
			k = false;
			if (m != null) {
				if (!h) {
					m.c();
				} else {
					m.d();
				}
			}
		}
		b.p();
	}

	protected void onActivityResult(int i1, int j1, Intent intent) {
		b.i();
		int k1 = i1 >> 16;
		if (k1 != 0) {
			k1--;
			if (b.f == null || k1 < 0 || k1 >= b.f.size()) {
				Log.w("FragmentActivity",
						(new StringBuilder())
								.append("Activity result fragment index out of range: 0x")
								.append(Integer.toHexString(i1)).toString());
				return;
			}
			Fragment fragment = (Fragment) b.f.get(k1);
			if (fragment == null) {
				Log.w("FragmentActivity",
						(new StringBuilder())
								.append("Activity result no fragment exists for index: 0x")
								.append(Integer.toHexString(i1)).toString());
				return;
			} else {
				fragment.a(0xffff & i1, j1, intent);
				return;
			}
		} else {
			super.onActivityResult(i1, j1, intent);
			return;
		}
	}

	public void onBackPressed() {
		if (!this.b.c()) {
			a();
		}
	}

	public void onConfigurationChanged(Configuration paramConfiguration) {
		super.onConfigurationChanged(paramConfiguration);
		this.b.a(paramConfiguration);
	}

	protected void onCreate(Bundle bundle) {
		b.a(this, c, null);
		if (getLayoutInflater().getFactory() == null) {
			getLayoutInflater().setFactory(this);
		}
		super.onCreate(bundle);
		j j1 = (j) getLastNonConfigurationInstance();
		if (j1 != null) {
			l = j1.e;
		}
		ArrayList arrayList = null;
		if (bundle != null) {
			android.os.Parcelable parcelable = bundle
					.getParcelable("android:support:fragments");
			n n1 = b;
			if (j1 != null) {
				arrayList = j1.d;
			} else {
				arrayList = null;
			}
			n1.a(parcelable, arrayList);
		}
		b.j();
	}

	public boolean onCreatePanelMenu(int i1, Menu menu) {
		if (i1 == 0) {
			boolean flag = super.onCreatePanelMenu(i1, menu);
			boolean flag1 = b.a(menu, getMenuInflater());
			if (android.os.Build.VERSION.SDK_INT >= 11) {
				return flag | flag1;
			} else {
				return true;
			}
		} else {
			return super.onCreatePanelMenu(i1, menu);
		}
	}

	public View onCreateView(String s, Context context,
			AttributeSet attributeset) {
		View view;
		if (!"fragment".equals(s)) {
			view = super.onCreateView(s, context, attributeset);
		} else {
			View view1 = b.a(null, s, context, attributeset);
			view = view1;
			if (view1 == null) {
				return super.onCreateView(s, context, attributeset);
			}
		}
		return view;
	}

	protected void onDestroy() {
		super.onDestroy();
		a(false);
		b.r();
		if (m != null) {
			m.h();
		}
	}

	public boolean onKeyDown(int i1, KeyEvent keyevent) {
		if (android.os.Build.VERSION.SDK_INT < 5 && i1 == 4
				&& keyevent.getRepeatCount() == 0) {
			onBackPressed();
			return true;
		} else {
			return super.onKeyDown(i1, keyevent);
		}
	}

	public void onLowMemory() {
		super.onLowMemory();
		this.b.s();
	}

	public boolean onMenuItemSelected(int i1, MenuItem menuitem) {
		if (super.onMenuItemSelected(i1, menuitem)) {
			return true;
		}
		switch (i1) {
		default:
			return false;

		case 0: // '\0'
			return b.a(menuitem);

		case 6: // '\006'
			return b.b(menuitem);
		}
	}

	protected void onNewIntent(Intent paramIntent) {
		super.onNewIntent(paramIntent);
		this.b.i();
	}

	public void onPanelClosed(int i1, Menu menu) {

		// JVM INSTR tableswitch 0 0: default 20
		// 0 27;

		switch (i1) {
		default:

			super.onPanelClosed(i1, menu);
			return;
		case 0:
			b.b(menu);
		}

	}

	protected void onPause() {
		super.onPause();
		e = false;
		if (a.hasMessages(2)) {
			a.removeMessages(2);
			b();
		}
		b.n();
	}

	protected void onPostResume() {
		super.onPostResume();
		a.removeMessages(2);
		b();
		b.e();
	}

	public boolean onPreparePanel(int i1, View view, Menu menu) {
		if (i1 == 0 && menu != null) {
			if (i) {
				i = false;
				menu.clear();
				onCreatePanelMenu(i1, menu);
			}
			return a(view, menu) | b.a(menu);
		} else {
			return super.onPreparePanel(i1, view, menu);
		}
	}

	protected void onResume() {
		super.onResume();
		a.sendEmptyMessage(2);
		e = true;
		b.e();
	}

	public final Object onRetainNonConfigurationInstance() {
		int k1 = 0;
		if (f) {
			a(true);
		}
		Object obj = c();
		ArrayList arraylist = b.g();
		boolean flag1;
		if (l != null) {
			int l1 = l.size();
			w aw[] = new w[l1];
			for (int i1 = l1 - 1; i1 >= 0; i1--) {
				aw[i1] = (w) l.c(i1);
			}

			boolean flag = false;
			do {
				flag1 = flag;
				if (k1 >= l1) {
					break;
				}
				w w1 = aw[k1];
				if (w1.g) {
					flag = true;
				} else {
					w1.h();
					l.remove(w1.d);
				}
				k1++;
			} while (true);
		} else {
			flag1 = false;
		}
		if (arraylist == null && !flag1 && obj == null) {
			return null;
		} else {
			j j1 = new j();
			j1.a = null;
			j1.b = obj;
			j1.c = null;
			j1.d = arraylist;
			j1.e = l;
			return j1;
		}
	}

	protected void onSaveInstanceState(Bundle bundle) {
		super.onSaveInstanceState(bundle);
		android.os.Parcelable parcelable = b.h();
		if (parcelable != null) {
			bundle.putParcelable("android:support:fragments", parcelable);
		}
	}

	protected void onStart() {
		super.onStart();
		f = false;
		g = false;
		a.removeMessages(1);
		if (!d) {
			d = true;
			b.k();
		}
		b.i();
		b.e();
		if (!k) {
			k = true;
			int i1;
			if (m != null) {
				m.b();
			} else if (!j) {
				m = a("(root)", k, false);
				if (m != null && !m.f) {
					m.b();
				}
			}
			j = true;
		}
		b.l();
		if (l != null) {
			int k1 = l.size();
			w aw[] = new w[k1];
			for (int i1 = k1 - 1; i1 >= 0; i1--) {
				aw[i1] = (w) l.c(i1);
			}

			for (int j1 = 0; j1 < k1; j1++) {
				w w1 = aw[j1];
				w1.e();
				w1.g();
			}

		}
	}

	protected void onStop() {
		super.onStop();
		f = true;
		a.sendEmptyMessage(1);
		b.o();
	}

	public void startActivityForResult(Intent intent, int i1) {
		if (i1 != -1 && (0xffff0000 & i1) != 0) {
			throw new IllegalArgumentException(
					"Can only use lower 16 bits for requestCode");
		} else {
			super.startActivityForResult(intent, i1);
			return;
		}
	}
}
