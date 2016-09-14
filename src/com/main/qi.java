package com.main;

import java.text.DecimalFormat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.ui.chooser.MultiChooserActivity;
import com.lazyswipe.widget.FloatTip;
import com.lazyswipe.zev.R;

public class qi extends rc {
	private static final String b = "Swipe." + re.class.getSimpleName();
	boolean a;
	private boolean c;
	private long i;
	private BroadcastReceiver j;

	public qi(Context var1) {
		this(var1, null);
	}

	public qi(Context var1, rd var2) {
		super(var1, var2);
		this.j = new BroadcastReceiver() {
			private void a(final Context var1) {
				vk.b();
				if (Fan.getInstance() != null) {
					Fan.getInstance().postDelayed(new Runnable() {
						public void run() {
							b(var1);
						}
					}, 120L);
				}
			}

			private void b(Context var1) {
				tn.a();
				long var4 = tn.c(var1);
				long jjj =qi.this.i;
				long var6 = var4 - qi.this.i;
				float var2;
				if (var6 >= var4) {
					var2 = 50.0F;
				} else {
					var2 = (float) var6 * 100.0F / (float) qi.this.i;
				}

				int var3 = Math.round(var2);
				DecimalFormat var8;
				if (var6 > 1073741824L) {
					var8 = vk.b;
				} else {
					var8 = vk.c;
				}

				String var11 = vk.a(var6, var8);
				Object var9;
				if (var6 > 0L && var3 > 0) {
					var9 = Html.fromHtml(String.format(
							var1.getString(0x7f0f0089),
							new Object[] { "<b><font color=\"#00aeff\">"
									+ var11 + "</font></b>" }));
					var11 = var1.getString(0x7f0f008a, new Object[] { var3
							+ "%" });
				} else {
					var9 = var1.getString(0x7f0f008b);
					var11 = var1.getString(0x7f0f008c);
				}

				wk var10 = (new wk(var1)).a((CharSequence) var9).b(var11)
						.a((OnClickListener) (new OnClickListener() {
							public void onClick(View var1) {
								((FloatTip) var1).b();
							}
						}));
				if (qi.this.a) {
					var10.a((wl) (new wl() {
						public void a() {
							if (Fan.j()) {
								Fan.getInstance().b();
								SwipeApplication.d = false;
							}

						}
					}));
				}

				var10.a(2000L);
			}

			public void onReceive(Context var1, Intent var2) {
				if (var2 != null) {
					String var3 = var2.getAction();
					if (("ACTION_BOOST_LOGIC_FINISH".equals(var3) || "ACTION_BOOST_ANIMATE_FINISH"
							.equals(var3)) && !vf.c() && !rj.b()) {
						this.a(var1);
						return;
					}
				}

			}
		};
	}

	static long a(qi qi1) {
		return qi1.i;
	}

	private void l() {
		if (ol.a() && !vk.b(this.d, (String) "com.hola.launcher")) {
			SharedPreferences var4 = ir.a((Context) this.d);
			long var2 = var4.getLong("key_booster_start_counting", 0L);
			if (var2 != -1L && System.currentTimeMillis() > var2) {
				int var1 = var4.getInt("key_booster_times", 0);
				if (var1 % 10 < 4) {
					var4.edit().putInt("key_booster_times", var1 + 1).apply();
					return;
				}

				this.a = true;
				SwipeApplication.d = true;
				ir.f(this.d, 108);
				return;
			}
		}

	}

	protected Intent b(Context var1) {
		Intent var2 = MultiChooserActivity.a(true);
		var2.addFlags(268435456);
		var2.putExtra("extra.request_type", 0);
		return var2;
	}

	public String b() {
		return "Booster";
	}

	public int a(boolean flag) {
		return 0x7f020088;
	}

	public boolean a(int k) {
		return true;
	}

	public int a(Context context) {
		return 1;
	}

	public int c() {
		return 0x7f0f00b4;
	}

	public boolean e() {
		a = false;
		SwipeApplication.d = false;
		if (!rj.b()) {
			l();
			rj.a(d, Fan.getInstance());
			i = tn.c(d);
			vf.a();
		}
		return false;
	}

	public void g() {
		super.g();

		try {
			if (!this.c) {
				IntentFilter var1 = new IntentFilter();
				var1.addAction("ACTION_BOOST_LOGIC_FINISH");
				var1.addAction("ACTION_BOOST_ANIMATE_FINISH");
				bx.a((Context) this.d).a(this.j, var1);
				this.c = true;
			}
		} catch (Exception var2) {
			;
		}
	}

	public void h() {
		super.h();

		try {
			if (this.c) {
				bx.a((Context) this.d).a((BroadcastReceiver) this.j);
				this.c = false;
			}
		} catch (Exception var2) {
			;
		}
	}
}
