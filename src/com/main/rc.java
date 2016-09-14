package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.zev.R;

@SuppressWarnings("unchecked")
public abstract class rc extends BroadcastReceiver implements Handler.Callback {
	public static final List h;
	private static final Map k;
	private static final Map l;
	private static final Map m;
	private boolean a;
	private Boolean b;
	private Boolean c;
	final Context d;
	protected rd e;
	protected boolean f;
	protected final Handler g = new Handler(this);
	private boolean i;
	private IntentFilter j;

	public rc(Context context, rd rd1) {
		a = false;
		b = null;
		c = null;
		i = false;
		d = context;
		e = rd1;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	static {
		l = new HashMap();
		m = new HashMap();
		h = new ArrayList();
		h.add("Camera");
		h.add("Music volume");
		h.add("Sound");
		h.add("Brightness");
		h.add("Booster");
		h.add("Flashlight");
		h.add("Wi-Fi");
		h.add("Mobile data");
		h.add("Swipe settings");
		k = Collections.unmodifiableMap(l);
		a(new re("Airplane mode", 0x7f0f00b0, 0x7f020085));
		a(new re("Bluetooth", 0x7f0f00b2, 0x7f020087));
		a(new re("Brightness", 0x7f0f00b5, 0x7f02008c));
		a(new re("Camera", 0x7f0f00b6, 0x7f02008d));
		a(new re("Mobile data", 0x7f0f00ba, 0x7f020092));
		a(new re("Screen rotation", 0x7f0f00bf, 0x7f02009c));
		a(new re("Screen timeout", 0x7f0f00c0, 0x7f02009d));
		a(new re("Sound", 0x7f0f00bd, 0x7f020099));
		a(new re("Flashlight", 0x7f0f00b8, 0x7f02008f));
		a(new re("Music volume", 0x7f0f00bb, 0x7f020096));
		a(new re("Wi-Fi", 0x7f0f00c4, 0x7f0200a4));
		a(new re("Wi-Fi AP", 0x7f0f00c5, 0x7f0200a5));
		a(new re("Booster", 0x7f0f00b4, 0x7f020088));
		a(new re("Home", 0x7f0f00b9, 0x7f020090));
		a(new re("Sleep", 0x7f0f00c1, 0x7f0200a1));
		a(new re("Swipe settings", 0x7f0f00c2, 0x7f0200a2));
		a(new re("System settings", 0x7f0f00c3, 0x7f0200a3));
		if (android.os.Build.VERSION.SDK_INT >= 21) {
			l.put("Screen capture", new re("Screen capture", 0x7f0f00be,
					0x7f02009b));
		} else {
			m.put("Screen capture", new re("Screen capture", 0x7f0f00be,
					0x7f02009b));
		}
		l.put("Recent apps", new re("Recent apps", 0x7f0f00bc, 0x7f020097));
		if (android.os.Build.VERSION.SDK_INT >= 16) {
			l.put("Back", new re("Back", 0x7f0f00b1, 0x7f020086));
		}
	}

	public static String a(List list) {
		if (list == null || list.size() <= 0) {
			return "";
		}
		StringBuilder stringbuilder = new StringBuilder((String) list.get(0));
		for (int i1 = 1; i1 < list.size(); i1++) {
			stringbuilder.append("|").append((String) list.get(i1));
		}

		return stringbuilder.toString();
	}

	public static List a(String s1) {
		if (TextUtils.isEmpty(s1)) {
			return new ArrayList(0);
		} else {
			return new ArrayList(Arrays.asList(s1.split("\\|")));
		}
	}

	private static void a(re re1) {
		l.put(re1.a(), re1);
	}

	public static List b(Context context, boolean flag) {
		return a(c(context, flag));
	}

	public static rc b(Context var0, String var1_1) {
		int var2_2 = -1;
		switch (var1_1.hashCode()) {
		case 931691921: {
			if (var1_1.equals((Object) "Airplane mode")) {
				var2_2 = 0;
				break;
			}
		}
		case -322116978: {
			if (var1_1.equals((Object) "Bluetooth")) {
				var2_2 = 1;
				break;
			}
		}
		case 1729588080: {
			if (var1_1.equals((Object) "Booster")) {
				var2_2 = 2;
				break;
			}
		}
		case -1653340047: {
			if (var1_1.equals((Object) "Brightness")) {
				var2_2 = 3;
				break;
			}
		}
		case 2011082565: {
			if (var1_1.equals((Object) "Camera")) {
				var2_2 = 4;
				break;
			}
		}
		case 295439432: {
			if (var1_1.equals((Object) "Mobile data")) {
				var2_2 = 5;
				break;
			}
		}
		case 810391366: {
			if (var1_1.equals((Object) "Flashlight")) {
				var2_2 = 6;
				break;
			}
		}
		case -163077998: {
			if (var1_1.equals((Object) "Screen rotation")) {
				var2_2 = 7;
				break;
			}
		}
		case 1730169293: {
			if (var1_1.equals((Object) "Screen timeout")) {
				var2_2 = 8;
				break;
			}
		}
		case 80074991: {
			if (var1_1.equals((Object) "Sound")) {
				var2_2 = 9;
				break;
			}
		}
		case 83519902: {
			if (var1_1.equals((Object) "Wi-Fi")) {
				var2_2 = 10;
				break;
			}
		}
		case 1355368945: {
			if (var1_1.equals((Object) "Wi-Fi AP")) {
				var2_2 = 11;
				break;
			}
		}
		case -2104856171: {
			if (var1_1.equals((Object) "Music volume")) {
				var2_2 = 12;
				break;
			}
		}
		case 2255103: {
			if (var1_1.equals((Object) "Home")) {
				var2_2 = 13;
				break;
			}
		}
		case 79969975: {
			if (var1_1.equals((Object) "Sleep")) {
				var2_2 = 14;
				break;
			}
		}
		case -698301518: {
			if (var1_1.equals((Object) "Screen capture")) {
				var2_2 = 15;
				break;
			}
		}
		case -1530549655: {
			if (var1_1.equals((Object) "Swipe settings")) {
				var2_2 = 16;
				break;
			}
		}
		case 618850004: {
			if (var1_1.equals((Object) "System settings")) {
				var2_2 = 17;
				break;
			}
		}
		case 1040988030: {
			if (var1_1.equals((Object) "Bluetooth tethering")) {
				var2_2 = 18;
				break;
			}
		}
		case -413606665: {
			if (var1_1.equals((Object) "Recent apps")) {
				var2_2 = 19;
				break;
			}
		}
		case 2062599: {
			if (var1_1.equals((Object) "Back")) {
				var2_2 = 20;
				break;
			}
		}

		default: {
			break;
		}
		case -991782967:

			if (var1_1.equals((Object) "Expand SystemUI")) {
				var2_2 = 21;
			}
		}

		switch (var2_2) {
		default: {
			return null;
		}
		case 0: {
			return new qe(var0);
		}
		case 1: {
			return new qh(var0);
		}
		case 2: {
			return new qi(var0);
		}
		case 3: {
			return new qj(var0);
		}
		case 4: {
			return new qk(var0);
		}
		case 5: {
			return new qr(var0);
		}
		case 6: {
			return new qn(var0);
		}
		case 7: {
			return new qw(var0);
		}
		case 8: {
			return new qx(var0);
		}
		case 9: {
			return new qu(var0);
		}
		case 10: {
			return new rg(var0);
		}
		case 11: {
			return new rf(var0);
		}
		case 12: {
			return new qs(var0);
		}
		case 13: {
			return new qo(var0);
		}
		case 14: {
			return new qy(var0);
		}
		case 15: {
			return new qv(var0);
		}
		case 16: {
			return new ra(var0);
		}
		case 17: {
			return new rb(var0);
		}
		case 18: {
			return new qg(var0);
		}
		case 19: {
			return new qt(var0);
		}
		case 20: {
			return new qf(var0);
		}
		case 21:
			return new qm(var0);
		}

	}

	private static void b(String paramString) {
		l.remove(paramString);
		m.remove(paramString);
		h.remove(paramString);
	}

	public static String c(Context paramContext, boolean paramBoolean) {
		String str = ir.a(paramContext).getString("key_switchers", null);
		if ((paramBoolean) && (TextUtils.isEmpty(str))) {
			str = l(paramContext);
			c(paramContext, str);
		}
		return str;
	}

	public static void c(Context paramContext, String paramString) {
		ir.a(paramContext).edit().putString("key_switchers", paramString)
				.apply();
	}

	private static void c(String paramString) {
		if (l.containsKey(paramString)) {
			m.put(paramString, l.remove(paramString));
		}
	}

	private static void d(String paramString) {
		if (m.containsKey(paramString)) {
			l.put(paramString, m.remove(paramString));
		}
	}

	public static Map j(Context paramContext) {
		if (ir.y(paramContext)) {
			d("Screen capture");
		} else if (Build.VERSION.SDK_INT < 21) {
			c("Screen capture");
		}
		return k;
	}

	public static List k(Context context) {
		boolean flag;
		if (!s()) {
			flag = true;
		} else {
			flag = false;
		}
		return b(context, flag);
	}

	// public static String l(Context context) {
	// rc.m(context);
	// int n = nc.f() - h.size();
	// if (n <= 0)
	// return TextUtils.join((CharSequence) "|", (Iterable) h);
	// ArrayList arrayList = new ArrayList((Collection) h);
	// Iterator iterator = l.keySet().iterator();
	// int n2 = 0;
	// while (iterator.hasNext()) {
	// int n3;
	// String string = (String) iterator.next();
	// if (!arrayList.contains((Object) string)) {
	// arrayList.add((Object) string);
	// n3 = n2 + 1;
	// if (n3 >= n) {
	// return TextUtils.join((CharSequence) "|",
	// (Iterable) arrayList);
	// }
	// } else {
	// n3 = n2;
	// }
	// n2 = n3;
	// }
	// return TextUtils.join((CharSequence) "|", (Iterable) arrayList);
	// }
	public static String l(Context context) {
		m(context);
		int k1 = nc.f() - h.size();
		if (k1 > 0) {
			ArrayList list = new ArrayList(h);
			Iterator iterator = l.keySet().iterator();
			int i1 = 0;
			int j1;

			do {
				String s1 = "";

				do {
					if (iterator.hasNext()) {
						s1 = (String) iterator.next();
					}

				} while (list.contains(s1));
				list.add(s1);
				j1 = i1 + 1;
				i1 = j1;
			} while (j1 < k1);
			return TextUtils.join("|", list);
		} else {
			return TextUtils.join("|", h);
		}
	}

	/* Error */
	/**
	 * @deprecated
	 */
	// protected static void m(Context context) {
	// // reference var2_1 = rc.class;
	// synchronized (rc.class) {
	// if (!vk.j(context)) {
	// rc.b("Mobile data");
	// rc.b("Wi-Fi AP");
	// }
	// if (!vk.e()) {
	// rc.b("Bluetooth");
	// rc.b("Bluetooth tethering");
	// } else if (!vk.l(context)) {
	// rc.b("Bluetooth tethering");
	// }
	// if (!vk.f()) {
	// rc.b("Camera");
	// rc.b("Flashlight");
	// }
	// // ** MonitorExit[var2_1] (shouldn't be in output)
	// return;
	// }
	// }
	protected static void m(Context context) {

		if (!vk.j(context)) {
			b("Mobile data");
			b("Wi-Fi AP");
		}
		if (vk.e()) {

			if (vk.l(context)) {

				if (!vk.f()) {
					b("Camera");
					b("Flashlight");
				}

			} else {

				b("Bluetooth tethering");
				if (!vk.f()) {
					b("Camera");
					b("Flashlight");
				}

			}

		} else {

			b("Bluetooth");
			b("Bluetooth tethering");
		}

	}

	public static void r() {
		ir.c(SwipeApplication.e(), "key_switchers_ever_changed", true);
	}

	public static boolean s() {
		return ir.d(SwipeApplication.e(), "key_switchers_ever_changed", false);
	}

	public abstract int a(Context paramContext);

	public abstract int a(boolean paramBoolean);

	public Intent a(String paramString1, String paramString2) {
		Intent localIntent = new Intent("android.intent.action.VIEW");
		localIntent.setClassName(paramString1, paramString2);
		return localIntent;
	}

	public String a() {
		return null;
	}

//	protected void a(Context var1_1, int var2_2) {
//		boolean var3_3 = this.k();
//		switch (var2_2) {
//		case 0: {
//			this.a_(false);
//			this.b = false;
//			break;
//		}
//		case 1: {
//			this.a_(false);
//			this.b = true;
//			break;
//		}
//		case 2: {
//			this.a_(true);
//			this.b = false;
//		}
//		case 3:
//
//			this.a_(true);
//			this.b = true;
//			// lbl14: // 4 sources:
//		default: {
//			if (var3_3 == false)
//				return;
//			if (this.k() != false)
//				return;
//			if (this.i == false)
//				return;
//			if (!(this.c == null || this.b != null
//					&& this.c.equals((Object) this.b))) {
//				this.a_(true);
//				try {
//					this.a(var1_1, this.c);
//				} catch (Exception var4_4) {
//					Log.e((String) "Swipe.Tile", (String) "exception",
//							(Throwable) var4_4);
//				}
//			}
//			this.i = false;
//		}
//		}
//
//		// lbl19: // 2 sources:
//
//	}
	protected void a(Context context, int i1)
    {
        boolean flag = k();
      //  i1;
       // JVM INSTR tableswitch 0 3: default 36
    //                   0 106
    //                   1 122
    //                   2 138
    //                   3 154;
          // goto _L1 _L2 _L3 _L4 _L5
        
        switch(i1){
        	default:
        		break;
        	case 0:
        		a_(false);
                b = Boolean.valueOf(false);
                break;
        	case 1:
        		 a_(false);
        	        b = Boolean.valueOf(true);
        	        break;
        	case 2:
        		 a_(true);
        	        b = Boolean.valueOf(false);
        		break;
        	case 3:
        		 a_(true);
        	        b = Boolean.valueOf(true);
        		break;
        }

        if (flag && !k() && i)
        {
            if (c != null && (b == null || !c.equals(b)))
            {
                a_(true);
                try
                {
                    a(context, c.booleanValue());
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    Log.e("Swipe.Tile", "exception", exception);
                }
            }
            i = false;
        }
        return;

    }
	public void a(Context paramContext, Intent paramIntent) {
	}

	public void a(rd paramrd) {
		this.e = paramrd;
	}

	public boolean a(int paramInt) {
		return h(this.d);
	}

	public boolean a(Context paramContext, boolean paramBoolean) {
		return false;
	}

	public void a_(boolean paramBoolean) {
		this.a = paramBoolean;
	}

	protected Intent b(Context paramContext) {
		return null;
	}

	public abstract String b();

	public String b_() {
		return this.d.getString(c());
	}

	public abstract int c();

	protected void c(boolean paramBoolean) {
	}

	public boolean c(Context paramContext) {
		return true;
	}

	protected String c_() {
		return getClass().getName() + ".REFRESH";
	}

	public boolean d() {
		return true;
	}

	public boolean d(Context var1_1) {
		boolean var2_2 = false;
		boolean var3_3 = false;
		switch (this.g(var1_1)) {
		case 1: {
			var3_3 = false;
			this.c = var3_3;
			if (this.k()) {
				this.i = true;
			} else {
				this.a_(true);
				var2_2 = this.a(var1_1, var3_3);
			}
			break;
		}
		case 0: {
			var3_3 = true;
			this.c = var3_3;
			if (this.k()) {
				this.i = true;
			} else {
				this.a_(true);
				var2_2 = this.a(var1_1, var3_3);
			}
			break;
		}
		case 5: {
			if (this.c == null)
				break;
			var3_3 = this.c == false;
		}
		}

		// lbl13: // 4 sources:

		this.q();
		this.c(this.c);
		return var2_2;
	}

	public int e(Context paramContext) {
		return a(h(paramContext));
	}

	public boolean e() {
		boolean bool = d(this.d);
		Intent localIntent = new Intent(c_());
		if (this.c != null) {
			localIntent.putExtra("extra.intend_state", this.c.booleanValue());
		}
		this.d.sendBroadcast(localIntent);
		return bool;
	}

	public List f() {
		return Collections.EMPTY_LIST;
	}

	public final int g(Context context) {
		if (k()) {
			return 5;
		}
		switch (a(context)) {
		default:
			return 5;

		case 0: // '\0'
			return 0;

		case 1: // '\001'
			return 1;
		}
	}

	public void g() {
		if (this.j == null) {
			this.j = new IntentFilter(this.c_());
			List<String> list = this.f();
			if (list.size() > 0) {
				for (String string : list) {
					this.j.addAction(string);
				}
			} else {
				String string = this.a();
				if (string != null) {
					this.j.addAction(string);
				}
			}
		}
		this.f = true;
		try {
			this.d.registerReceiver((BroadcastReceiver) this, this.j);
			return;
		} catch (Exception var1_5) {
			return;
		}
	}

	public void h() {
		try {
			this.d.unregisterReceiver((BroadcastReceiver) this);
			return;
		} catch (Exception var1_1) {
			return;
		}
	}

	protected boolean h(Context context) {
		switch (this.g(context)) {
		default: {
			return false;
		}
		case 1: {
			return true;
		}
		case 5:

			return this.p();
		}
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	public boolean handleMessage(Message message) {
		if (vk.d(this.d)) {
			return true;
		}
		switch (message.what) {
		default: {
			return true;
		}
		case 100: {
			if (!this.p())
				return true;
			if (this.c == null)
				return true;
			boolean bl = this.c == false;
			this.c = bl;
			return true;
		}
		case 101:

			this.o();
		}
		return true;
	}

	public boolean i(Context context) {
		Intent intent = this.b(context);
		if (intent != null) {
			try {
				if (intent.getAction() == null) {
					intent.setAction("android.intent.action.MAIN");
				}
				intent.addFlags(270532608);
				context.startActivity(intent);
				return true;
			} catch (Exception var3_3) {
				Log.e((String) "Swipe.Tile",
						(String) ("start activity error! intent:" + (Object) intent),
						(Throwable) var3_3);
			}
		}
		return false;
	}

	public boolean k() {
		return this.a;
	}

	public void o() {
		if (this.e != null) {
			this.e.k();
		}
	}

	/*
	 * Enabled aggressive block sorting Enabled unnecessary exception pruning
	 */
	public void onReceive(Context context, Intent intent) {
		try {
			String string = intent.getAction();
			if (vk.a((Object) this.c_(), (Object) string)) {
				this.c = intent.getBooleanExtra("extra.intend_state", true);
				this.g.sendEmptyMessageDelayed(100, 10000);
			} else {
				List list = this.f();
				if (list.size() > 0) {
					if (list.contains((Object) string)) {
						this.a(context, intent);
					}
				} else {
					String string2 = this.a();
					if (string2 != null && string2.equals((Object) string)) {
						this.a(context, intent);
					}
				}
			}
			this.g.sendEmptyMessage(101);
			return;
		} catch (Throwable var3_5) {
			Log.e((String) "Swipe.Tile", (String) "Unexpected error occurs",
					(Throwable) var3_5);
			return;
		}
	}

	public boolean p() {
		if (this.c != null && this.c.booleanValue()) {
			return true;
		}
		return false;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public void q() {
		if (this.d()) {
			String string;
			Context context = this.d;
			if (this.c.booleanValue()) {
				Context context2 = this.d;
				Object[] arrobject = new Object[] { this.d.getString(this.c()) };
				string = context2.getString(R.string.msg_switching_on,
						arrobject);
			} else {
				Context context3 = this.d;
				Object[] arrobject = new Object[] { this.d.getString(this.c()) };
				string = context3.getString(R.string.msg_switching_off,
						arrobject);
			}
			vi.a(context, string);
		}
	}
}
