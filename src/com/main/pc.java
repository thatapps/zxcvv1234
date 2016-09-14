package com.main;

import java.lang.ref.WeakReference;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.fan.Fan;
import com.lazyswipe.fan.ItemSector;

public class pc {
	private boolean a = false;
	private WeakReference b;
	private WeakReference c;

	public pc(Fan paramFan) {
		this.b = new WeakReference(paramFan);
	}

	private void a(pd parampd) {
		if (this.a) {
		}

		if ((this.b != null) && (this.b.get() != null)) {
			try {
				d();
				View localView = b(parampd);
				((Fan) this.b.get()).addView(localView, 1,
						new FrameLayout.LayoutParams(-1, -2));
				((Fan) this.b.get()).c();
				this.c = new WeakReference(localView);
				this.a = true;
				pb.a().d();
			} catch (Exception localException) {
				this.a = false;
			}
		}
	}

	// private View b(pd parampd) {
	// Object localObject = null;
	// if (parampd == null) {
	// return (View) localObject;
	// }
	// SwipeApplication localSwipeApplication = SwipeApplication.e();
	// localObject = (ViewGroup) LayoutInflater.from(localSwipeApplication)
	// .inflate(R.layout.auto_upgrade_tip, null);
	// ((ViewGroup) localObject)
	// .addOnLayoutChangeListener((OnLayoutChangeListener) new pc(null));
	// TextView localTextView1 = (TextView) ((ViewGroup) localObject)
	// .findViewById(R.id.upgrade_tip_title);
	// TextView localTextView2 = (TextView) ((ViewGroup) localObject)
	// .findViewById(R.id.upgrade_tip_message);
	// View localView = ((ViewGroup) localObject)
	// .findViewById(R.id.upgrade_tip_action_positive);
	// TextView localTextView3 = (TextView) ((ViewGroup) localObject)
	// .findViewById(R.id.upgrade_tip_action_negative);
	// if (parampd.p()) {
	// }
	// for (int i = 2131689703;; i = 2131689702) {
	// localTextView3.setText(i);
	// localTextView1.setText(parampd.m());
	// localTextView2.setText(parampd.n());
	// // pc.2 local2 = new pc.2(this, localSwipeApplication, parampd);
	// // pc.3 local3 = new pc.3(this, localView, localSwipeApplication,
	// // parampd, pe.a(localSwipeApplication, MainActivity.class), local2,
	// // localTextView3);
	// // localView.setOnClickListener(local3);
	// // localTextView3.setOnClickListener(local3);
	// break;
	// }
	// return (View) localObject;
	// }
	private View b(final pd pd1) {
		if (pd1 == null) {
			return null;
		}
		final SwipeApplication swipeapplication = SwipeApplication.e();
		final ViewGroup viewgroup = (ViewGroup) LayoutInflater.from(
				swipeapplication).inflate(0x7f04000a, null);
		viewgroup
				.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

					final Context a;
					final ViewGroup b;
					final pc c;

					public void onLayoutChange(View view1, int j, int k, int l,
							int i1, int j1, int k1, int l1, int i2) {
						if (a.getResources().getConfiguration().orientation != 1) {
							b.post(new Runnable() {

								public void run() {
									c.a(pd1);
								}

							});
						}
					}

					{
						c = pc.this;
						a = swipeapplication;
						b = viewgroup;
						// super();
					}
				});
		Object obj = (TextView) viewgroup.findViewById(0x7f0c0035);
		final TextView textview1 = (TextView) viewgroup
				.findViewById(0x7f0c0036);
		final View view = viewgroup.findViewById(0x7f0c003a);
		final TextView textview = (TextView) viewgroup.findViewById(0x7f0c0038);
		int i;
		if (pd1.p()) {
			i = 0x7f0f00e7;
		} else {
			i = 0x7f0f00e6;
		}
		textview.setText(i);
		((TextView) (obj)).setText(pd1.m());
		textview1.setText(pd1.n());
		final vs vs = new vs() {

			final Context a;
			final pd b;
			final pc c;

			public void a() {
			}

			public void a(int j) {
				// j;
				// JVM INSTR tableswitch 1 7: default 44
				// 1 88
				// 2 82
				// 3 82
				// 4 44
				// 5 88
				// 6 44
				// 7 94;
				// goto _L1 _L2 _L3 _L3 _L1 _L2 _L1 _L4

				switch (j) {
				default:
					Log.e(pb.a, (new StringBuilder()).append("Error no is :")
							.append(j).toString());
					j = 0x7f0f001e;
					break;
				case 1:
					j = 0x7f0f0022;
					break;
				case 2:
					j = 0x7f0f001f;
					break;
				case 3:
					j = 0x7f0f001f;
					break;
				case 4:
					Log.e(pb.a, (new StringBuilder()).append("Error no is :")
							.append(j).toString());
					j = 0x7f0f001e;
				case 5:
					j = 0x7f0f0022;
					break;
				case 6:
					Log.e(pb.a, (new StringBuilder()).append("Error no is :")
							.append(j).toString());
					j = 0x7f0f001e;
					break;
				case 7:
					j = 0x7f0f0023;
				}

			}

			public void b() {
				vk.a(a, b.l());
				if (pc.b(c) != null && pc.b(c).get() != null) {
					((Fan) pc.b(c).get()).a(false);
				}
			}

			{
				c = pc.this;
				a = swipeapplication;
				b = pd1;
				// super();
			}
		};
		OnClickListener onClickListener = new android.view.View.OnClickListener() {

			final View a;
			final Context b;
			final pd c;
			Intent d;
			final vs e;
			final TextView f;
			final pc g;

			public void onClick(View view1) {
				if (view1 == a) {
					pd.t();
					pc.this.c();
					pe.a(b, c, d, e, null);
				} else if (view1 == f) {
					pd.t();
					pc.this.c();
					if (c.p()) {
						pe.a(b, c.b().intValue());
						return;
					}
				}
			}

			{
				g = pc.this;
				a = view;
				b = swipeapplication;
				c = pd1;
				// d = intent;
				e = vs;
				f = textview;
				// super();
			}
		};
		view.setOnClickListener(onClickListener);
		textview.setOnClickListener(onClickListener);
		return viewgroup;
	}

	static WeakReference b(pc pc1) {
		return pc1.b;
	}

	private void c() {
		while (!a || b == null || b.get() == null || c == null
				|| c.get() == null) {
			return;
		}
		try {
			Fan fan = (Fan) b.get();
			fan.removeView((View) c.get());
			fan.d();
			if (fan.getItemSector() instanceof ItemSector) {
				((ItemSector) fan.getItemSector()).getNextFanLayer()
						.setVisibility(4);
			}
			c.clear();
			a = false;
			return;
		} catch (Exception exception) {
			return;
		}
	}

	private static void d() {
		SwipeApplication swipeapplication = SwipeApplication.e();
		String s = ir.a(swipeapplication, "PREF_SHOW_UPGRADE_TIP_DATE", "");
		String s1 = vk.m();
		if (s1.equals(s)) {
			ir.b(swipeapplication,
					"PREF_SHOW_UPGRADE_TODAY_TIMES",
					ir.a(swipeapplication, "PREF_SHOW_UPGRADE_TODAY_TIMES", 0) + 1);
			return;
		} else {
			ir.b(swipeapplication, "PREF_SHOW_UPGRADE_TIP_DATE", s1);
			ir.b(swipeapplication, "PREF_SHOW_UPGRADE_TODAY_TIMES", 1);
			return;
		}
	}

	private static int e() {
		int i = 0;
		SwipeApplication swipeapplication = SwipeApplication.e();
		String s = ir.a(swipeapplication, "PREF_SHOW_UPGRADE_TIP_DATE", "");
		if (vk.m().equals(s)) {
			i = ir.a(swipeapplication, "PREF_SHOW_UPGRADE_TODAY_TIMES", 0);
		}
		return i;
	}

	public boolean a() {
		pd pd1 = pd.s();
		if (pd1 != null && pd1.o() && e() < 3) {
			a(pd1);
			return true;
		} else {
			pb.a().b();
			return false;
		}
	}

	public void b() {
		try {
			b.clear();
			c.clear();
			return;
		} catch (Exception exception) {
			return;
		}
	}
}