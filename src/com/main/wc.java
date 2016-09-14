package com.main;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.lazyswipe.zev.R;

public class wc {
	private int A;
	private ListAdapter B;
	private CharSequence[] C;
	private Cursor D;
	private String E;
	private DialogInterface.OnClickListener F;
	private int G;
	private AdapterView.OnItemSelectedListener H;
	private boolean I;
	private boolean[] J;
	private String K;
	private boolean L;
	private DialogInterface.OnMultiChoiceClickListener M;
	private Drawable N;
	private boolean O = true;
	private boolean P;
	private int Q;
	private int R1;
	private int S;
	private ColorStateList T;
	private ColorStateList U;
	private int V;
	private int W;
	private int X;
	private int Y;
	private DialogInterface.OnShowListener Z;
	protected final Context a;
	protected wb b;
	protected final LayoutInflater c;
	protected CharSequence d = null;
	public DialogInterface.OnCancelListener e;
	public DialogInterface.OnDismissListener f;
	protected CharSequence g;
	Drawable[] h;
	protected int i;
	protected int j = 0;
	View k;
	View l;
	int m;
	int n;
	private CharSequence o;
	private DialogInterface.OnClickListener p;
	private CharSequence q;
	private DialogInterface.OnClickListener r;
	private CharSequence s;
	private DialogInterface.OnClickListener t;
	private int u;
	private View v;
	private boolean w;
	private int x;
	private int y;
	private int z;

	public wc(Context context) {
		this.a = context;
		this.c = LayoutInflater.from((Context) context);
	}

	private void a() {
		Resources resources = this.a.getResources();
		int n = resources
				.getColor(R.color.custom_dialog_title_text_color_default);
		resources.getColor(R.color.custom_dialog_title_separator_color_default);
		ColorStateList colorStateList = resources
				.getColorStateList(R.color.custom_dialog_button_text_color_default);
		ColorStateList colorStateList2 = resources
				.getColorStateList(R.color.custom_dialog_button_text_color_highlighted_default);
		int n2 = resources
				.getColor(R.color.custom_dialog_button_separator_color_default);
		int n3 = resources
				.getColor(R.color.custom_dialog_button_background_color_normal_default);
		int n4 = resources
				.getColor(R.color.custom_dialog_button_background_color_pressed_default);
		int n5 = resources
				.getColor(R.color.custom_dialog_button_background_color_focused_default);
		int n6 = resources
				.getColor(R.color.custom_dialog_message_text_color_default);
		int n7 = resources
				.getInteger(R.integer.custom_dialog_message_text_min_lines_default);
		TypedArray typedArray = this.a.getTheme().obtainStyledAttributes(null,
				in.CustomDialog, R.attr.customDialogStyle, 0);
		this.Q = typedArray.getColor(1, n);
		this.R1 = typedArray.getColor(3, n6);
		this.S = typedArray.getInt(4, n7);
		this.T = typedArray.getColorStateList(5);
		if (this.T == null) {
			this.T = colorStateList;
		}
		this.U = typedArray.getColorStateList(6);
		if (this.U == null) {
			this.U = colorStateList2;
		}
		this.V = typedArray.getColor(7, n2);
		this.W = typedArray.getColor(8, n3);
		this.X = typedArray.getColor(9, n4);
		this.Y = typedArray.getColor(10, n5);
		typedArray.recycle();
	}

	static CharSequence a(wc wc1) {
		return wc1.o;
	}

	static void a(wc wc1, int i1) {
		wc1.g(i1);
	}

	static int b(wc wc1, int i1) {
		wc1.G = i1;
		return i1;
	}

	static CharSequence b(wc wc1) {
		return wc1.q;
	}

	static CharSequence c(wc wc1) {
		return wc1.s;
	}

	static boolean[] d(wc wc1) {
		return wc1.J;
	}

	static String e(wc wc1) {
		return wc1.E;
	}

	static String f(wc wc1) {
		return wc1.K;
	}

	static boolean g(wc wc1) {
		return wc1.L;
	}

	static int h(wc wc1) {
		return wc1.G;
	}

	static android.content.DialogInterface.OnClickListener i(wc wc1) {
		return wc1.F;
	}

	static android.content.DialogInterface.OnMultiChoiceClickListener j(wc wc1) {
		return wc1.M;
	}

	static android.content.DialogInterface.OnClickListener k(wc wc1) {
		return wc1.r;
	}

	static android.content.DialogInterface.OnClickListener l(wc wc1) {
		return wc1.p;
	}

	static android.content.DialogInterface.OnClickListener m(wc wc1) {
		return wc1.t;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	@SuppressWarnings("unchecked")
	// private void a(ViewGroup viewGroup) {
	// BaseAdapter var4_3 = null;
	// final ListView listView = (ListView)
	// this.c.inflate(R.layout.custom_dialog_list,
	// viewGroup, false);
	// if (Build.VERSION.SDK_INT >= 11) {
	// listView.setSelector((Drawable) this.h());
	// }
	// if (this.I) {
	// var4_3 = this.D == null ? new ArrayAdapter(this.a,
	// R.layout.select_dialog_multi_choices,
	// 16908308, this.C) {
	//
	// public View getView(int n, View view, ViewGroup viewGroup) {
	// View view2 = super.getView(n, view, viewGroup);
	// if (wc.this.J != null) {
	// boolean bl = wc.this.J[n];
	// if (wc.this.k != null) {
	// ++n;
	// }
	// listView.setItemChecked(n, bl);
	// }
	// if (Build.VERSION.SDK_INT < 11) {
	// view2.setBackgroundDrawable((Drawable) wc.this.h());
	// }
	// return view2;
	// }
	// } : new CursorAdapter(this.a, this.D, false) {
	// private int c;
	// private int d;
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void bindView(View view, Context context, Cursor cursor) {
	// ((CheckedTextView) view.findViewById(16908308))
	// .setText((CharSequence) cursor.getString(this.c));
	// ListView listView2 = listView;
	// int n = cursor.getPosition();
	// boolean bl = cursor.getInt(this.d) == 1;
	// listView2.setItemChecked(n, bl);
	// }
	//
	// public View newView(Context context, Cursor cursor,
	// ViewGroup viewGroup) {
	// View view = wc.this.c.inflate(R.layout.select_dialog_multi_choices,
	// viewGroup, false);
	// if (Build.VERSION.SDK_INT < 11) {
	// view.setBackgroundDrawable((Drawable) wc.this.h());
	// }
	// return view;
	// }
	// };
	// } else if (this.h == null) {
	// int n=-1;
	// if (L)
	// {
	// n= R.layout.select_dialog_single_choice;
	// } else
	// {
	// n = R.layout.select_dialog_item;
	// }
	// if (this.D == null) {
	// var4_3 = (BaseAdapter) (this.B != null ? this.B
	// : new ArrayAdapter(this.a, n, 16908308, this.C) {
	//
	// public View getView(int n, View view,
	// ViewGroup viewGroup) {
	// View view2 = super.getView(n, view, viewGroup);
	// if (Build.VERSION.SDK_INT < 11) {
	// view2.setBackgroundDrawable((Drawable) wc.this
	// .h());
	// }
	// return view2;
	// }
	// });
	// } else {
	// Context context = this.a;
	// Cursor cursor = this.D;
	// String[] arrstring = new String[] { this.E };
	// int[] arrn = new int[] { 16908308 };
	// var4_3 = new SimpleCursorAdapter(context, n, cursor, arrstring,
	// arrn) {
	//
	// public View newView(Context context, Cursor cursor,
	// ViewGroup viewGroup) {
	// View view = super.newView(context, cursor, viewGroup);
	// if (Build.VERSION.SDK_INT < 11) {
	// view.setBackgroundDrawable((Drawable) wc.this.h());
	// }
	// return view;
	// }
	// };
	// }
	// } else {
	// int n =-1;
	// if (L)
	// {
	// n= R.layout.select_dialog_single_choice_with_icon;
	// } else
	// {
	// n = R.layout.select_dialog_item_with_icon;
	// }
	// var4_3 = new ArrayAdapter(this.a, n, 16908308, this.C) {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public View getView(int n, View view, ViewGroup viewGroup) {
	// boolean bl = true;
	// ViewGroup viewGroup2 = (ViewGroup) super.getView(n, view,
	// viewGroup);
	// if (Build.VERSION.SDK_INT < 11) {
	// viewGroup2
	// .setBackgroundDrawable((Drawable) wc.this.h());
	// }
	// int n2 = (int) this.getItemId(n);
	// ((ImageView) viewGroup2.getChildAt(0))
	// .setImageDrawable(wc.this.h[n2]);
	// if (wc.this.L) {
	// CheckedTextView checkedTextView = (CheckedTextView) viewGroup2
	// .getChildAt((boolean) bl ? 1 : 0);
	// if (n2 != wc.this.G) {
	// bl = false;
	// }
	// checkedTextView.setChecked(bl);
	// }
	// return viewGroup2;
	// }
	// };
	// }
	// if (this.F != null) {
	// listView.setOnItemClickListener((AdapterView.OnItemClickListener) new
	// AdapterView.OnItemClickListener() {
	//
	// /*
	// * Enabled aggressive block sorting
	// */
	// public void onItemClick(AdapterView adapterView, View view,
	// int n, long l) {
	// wc.this.F.onClick((DialogInterface) wc.this.b, n);
	// if (!wc.this.L) {
	// wc.this.b.dismiss();
	// return;
	// } else {
	// if (wc.this.h == null)
	// return;
	// {
	// ListView listView = (ListView) adapterView;
	// int n2 = listView.getFirstVisiblePosition();
	// long l2 = listView.getItemIdAtPosition(n2);
	// long l3 = listView.getItemIdAtPosition(listView
	// .getLastVisiblePosition());
	// if ((long) wc.this.G >= l2
	// && (long) wc.this.G <= l3) {
	// ((CheckedTextView) ((ViewGroup) adapterView
	// .getChildAt(n2
	// + (int) ((long) wc.this.G - l2)))
	// .getChildAt(1)).setChecked(false);
	// }
	// wc.this.G = (int) l;
	// ((CheckedTextView) ((ViewGroup) view).getChildAt(1))
	// .setChecked(true);
	// return;
	// }
	// }
	// }
	// });
	// } else if (this.M != null) {
	// listView.setOnItemClickListener((AdapterView.OnItemClickListener) new
	// AdapterView.OnItemClickListener() {
	//
	// public void onItemClick(AdapterView adapterView, View view,
	// int n, long l) {
	// if (l >= 0 && l < (long) wc.this.J.length) {
	// int n2 = (int) l;
	// boolean bl = listView.isItemChecked(n);
	// if (wc.this.J != null) {
	// wc.d((wc) wc.this)[n2] = bl;
	// }
	// wc.this.M.onClick(null, n2, bl);
	// }
	// }
	// });
	// }
	// if (this.H != null) {
	// listView.setOnItemSelectedListener(this.H);
	// }
	// if (this.L) {
	// listView.setChoiceMode(1);
	// } else if (this.I) {
	// listView.setChoiceMode(2);
	// }
	// if (this.k != null) {
	// listView.addHeaderView(this.k);
	// }
	// if (this.l != null) {
	// listView.addFooterView(this.l);
	// }
	// listView.setAdapter((ListAdapter) var4_3);
	// if (-1 != this.G) {
	// listView.setItemChecked(this.G, true);
	// }
	// if (!this.i()) {
	// listView.setPadding(listView.getPaddingLeft(),
	// listView.getPaddingTop(), listView.getPaddingRight(),
	// /*(int)
	// this.a.getResources().getDimension(R.dimen.custom_dialog_window_padding)*/0);
	// }
	// viewGroup.addView((View) listView);
	// }
	private void a(ViewGroup var1) {
		final ListView var4 = (ListView) this.c
				.inflate(0x7f040012, var1, false);
		if (VERSION.SDK_INT >= 11) {
			var4.setSelector(this.h());
		}

		Object var3;
		if (this.I) {
			if (this.D == null) {
				var3 = new ArrayAdapter(this.a, 0x7f040043, 0x1020014, this.C) {
					public View getView(int var1, View var2, ViewGroup var3) {
						var2 = super.getView(var1, var2, var3);
						if (wc.this.J != null) {
							boolean var5 = wc.this.J[var1];
							int var4x = var1;
							if (wc.this.k != null) {
								var4x = var1 + 1;
							}

							var4.setItemChecked(var4x, var5);
						}

						if (VERSION.SDK_INT < 11) {
							var2.setBackgroundDrawable(wc.this.h());
						}

						return var2;
					}
				};
			} else {
				var3 = new CursorAdapter(this.a, this.D, false) {

					private final int c;
					private final int d;

					{
						Cursor var6 = this.getCursor();
						this.c = var6.getColumnIndexOrThrow(wc.this.E);
						this.d = var6.getColumnIndexOrThrow(wc.this.K);
					}

					public void bindView(View var1, Context var2, Cursor var3) {
						((CheckedTextView) var1.findViewById(0x1020014))
								.setText(var3.getString(this.c));
						ListView var6 = var4;
						int var4x = var3.getPosition();
						boolean var5;
						if (var3.getInt(this.d) == 1) {
							var5 = true;
						} else {
							var5 = false;
						}

						var6.setItemChecked(var4x, var5);
					}

					public View newView(Context var1, Cursor var2,
							ViewGroup var3) {
						View var4x = wc.this.c.inflate(0x7f040043, var3, false);
						if (VERSION.SDK_INT < 11) {
							var4x.setBackgroundDrawable(wc.this.h());
						}

						return var4x;
					}
				};
			}
		} else {
			final int var2;
			if (this.h == null) {
				if (this.L) {
					var2 = 0x7f040044;
				} else {
					var2 = 0x7f040040;
				}

				if (this.D == null) {
					if (this.B != null) {
						var3 = this.B;
					} else {
						var3 = new ArrayAdapter(this.a, var2, 0x1020014, this.C) {
							public View getView(int var1, View var2,
									ViewGroup var3) {
								var2 = super.getView(var1, var2, var3);
								if (VERSION.SDK_INT < 11) {
									var2.setBackgroundDrawable(wc.this.h());
								}

								return var2;
							}
						};
					}
				} else {
					var3 = new SimpleCursorAdapter(this.a, var2, this.D,
							new String[] { this.E }, new int[] { 0x1020014 }) {
						public View newView(Context var1, Cursor var2,
								ViewGroup var3) {
							View var4 = super.newView(var1, var2, var3);
							if (VERSION.SDK_INT < 11) {
								var4.setBackgroundDrawable(wc.this.h());
							}

							return var4;
						}
					};
				}
			} else {
				if (this.L) {
					var2 = 0x7f040045;
				} else {
					var2 = 0x7f040042;
				}

				var3 = new ArrayAdapter(this.a, var2, 0x1020014, this.C) {
					public View getView(int var1, View var2, ViewGroup var3) {
						boolean var4 = true;
						ViewGroup var5 = (ViewGroup) super.getView(var1, var2,
								var3);
						if (VERSION.SDK_INT < 11) {
							var5.setBackgroundDrawable(wc.this.h());
						}

						var1 = (int) this.getItemId(var1);
						((ImageView) var5.getChildAt(0))
								.setImageDrawable(wc.this.h[var1]);
						if (wc.this.L) {
							CheckedTextView var6 = (CheckedTextView) var5
									.getChildAt(1);
							if (var1 != wc.this.G) {
								var4 = false;
							}

							var6.setChecked(var4);
						}

						return var5;
					}
				};
			}
		}

		if (this.F != null) {
			var4.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView var1, View var2, int var3,
						long var4) {
					wc.this.F.onClick(wc.this.b, var3);
					if (!wc.this.L) {
						wc.this.b.dismiss();
					} else if (wc.this.h != null) {
						ListView var10 = (ListView) var1;
						var3 = var10.getFirstVisiblePosition();
						long var6 = var10.getItemIdAtPosition(var3);
						long var8 = var10.getItemIdAtPosition(var10
								.getLastVisiblePosition());
						if ((long) wc.this.G >= var6
								&& (long) wc.this.G <= var8) {
							((CheckedTextView) ((ViewGroup) var1
									.getChildAt((int) ((long) wc.this.G - var6)
											+ var3)).getChildAt(1))
									.setChecked(false);
						}

						wc.this.G = (int) var4;
						((CheckedTextView) ((ViewGroup) var2).getChildAt(1))
								.setChecked(true);
						return;
					}

				}
			});
		} else if (this.M != null) {
			var4.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView var1, View var2, int var3,
						long var4x) {
					if (var4x >= 0L && var4x < (long) wc.this.J.length) {
						int var6 = (int) var4x;
						boolean var7 = var4.isItemChecked(var3);
						if (wc.this.J != null) {
							wc.this.J[var6] = var7;
						}

						wc.this.M.onClick((DialogInterface) null, var6, var7);
					}

				}
			});
		}

		if (this.H != null) {
			var4.setOnItemSelectedListener(this.H);
		}

		if (this.L) {
			var4.setChoiceMode(1);
		} else if (this.I) {
			var4.setChoiceMode(2);
		}

		if (this.k != null) {
			var4.addHeaderView(this.k);
		}

		if (this.l != null) {
			var4.addFooterView(this.l);
		}

		var4.setAdapter((ListAdapter) var3);
		if (-1 != this.G) {
			var4.setItemChecked(this.G, true);
		}

		if (!this.i()) {
			var4.setPadding(var4.getPaddingLeft(), var4.getPaddingTop(), var4
					.getPaddingRight(), (int) this.a.getResources()
					.getDimension(0x7f0b001e));
		}

		var1.addView(var4);
	}

	/*
	 * Enabled aggressive block sorting
	 */
//	private void a(LinearLayout linearLayout) {
//		if (!this.i()) {
//			View view = this.c.inflate(R.layout.custom_dialog_button_panel,
//					(ViewGroup) linearLayout, false);
//			LinearLayout linearLayout2 = (LinearLayout) view
//					.findViewById(R.id.custom_dialog_button_container);
//			view.findViewById(R.id.custom_dialog_horizontal_separator)
//					.setBackgroundColor(this.V);
//			boolean bl = Build.VERSION.SDK_INT < 14 ? this.b(
//					(ViewGroup) linearLayout2, false) : this.a(
//					(ViewGroup) linearLayout2, false);
//			boolean bl2 = this.c((ViewGroup) linearLayout2, bl);
//			if (Build.VERSION.SDK_INT > 14) {
//				this.a((ViewGroup) linearLayout2, bl2);
//			} else {
//				this.b((ViewGroup) linearLayout2, bl2);
//			}
//			linearLayout.addView(view);
//		}
//	}
	private void a(LinearLayout var1) {
	      if(this.i()) {
	         View var3 = this.c.inflate(R.layout.custom_dialog_button_panel, var1, false);
	         LinearLayout var4 = (LinearLayout)var3.findViewById(R.id.custom_dialog_button_container);
	         var3.findViewById(R.id.custom_dialog_horizontal_separator).setBackgroundColor(this.V);
	         boolean var2;
	         if(VERSION.SDK_INT < 14) {
	            var2 = this.b(var4, false);
	         } else {
	            var2 = this.a(var4, false);
	         }

	         var2 = this.c(var4, var2);
	         if(VERSION.SDK_INT < 14) {
	            this.a(var4, var2);
	         } else {
	            this.b(var4, var2);
	         }

	         var1.addView(var3);
	      }

	   }
	/*
	 * Enabled aggressive block sorting
	 */
	private boolean a(ViewGroup viewGroup, boolean bl) {
		if (this.q == null) {
			return bl;
		}
		if (bl) {
			this.b(viewGroup);
		}
		Button button = (Button) this.c.inflate(R.layout.custom_dialog_button,
				viewGroup, false);
		button.setId(R.id.custom_dialog_negative_button);
		button.setText(this.q);
		ColorStateList colorStateList = this.u == -2 ? this.U : this.T;
		button.setTextColor(colorStateList);
		button.setBackgroundDrawable((Drawable) this.h());
		button.setOnClickListener((View.OnClickListener) new View.OnClickListener() {

			public void onClick(View view) {
				if (wc.this.r != null) {
					wc.this.r.onClick((DialogInterface) wc.this.b, -2);
					return;
				}
				wb.d.onClick((DialogInterface) wc.this.b, -2);
			}
		});
		viewGroup.addView((View) button);
		return true;
	}

	/*
	 * Unable to fully structure code Enabled force condition propagation Lifted
	 * jumps to return sites
	 */
	private View b() {
		View view = c.inflate(R.layout.custom_dialog_title, null, false);
		Object obj = (TextView) view.findViewById(R.id.custom_dialog_title);
		View view1 = view.findViewById(R.id.custom_dialog_title_divider);
		if (d != null) {
			try {
				((TextView) (obj)).setText(d);
			} catch (Throwable throwable) {
			}
			((TextView) (obj)).setTextColor(Q);
			if (N != null) {
				obj = (ImageView) view.findViewById(R.id.custom_dialog_icon);
				((ImageView) (obj)).setImageDrawable(N);
				((ImageView) (obj)).setVisibility(0);
			}
			view1.setVisibility(0);
			return view;
		} else {
			((TextView) (obj)).setVisibility(8);
			view1.setVisibility(8);
			return view;
		}
	}

	private void b(ViewGroup viewGroup) {
		View view = this.c.inflate(R.layout.custom_dialog_button_separator,
				viewGroup, false);
		view.findViewById(R.id.custom_dialog_button_separator)
				.setBackgroundColor(this.V);
		viewGroup.addView(view);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean b(ViewGroup viewGroup, boolean bl) {
		if (this.o == null) {
			return bl;
		}
		if (bl) {
			this.b(viewGroup);
		}
		Button button = (Button) this.c.inflate(R.layout.custom_dialog_button,
				viewGroup, false);
		button.setId(R.id.custom_dialog_positive_button);
		button.setText(this.o);
		ColorStateList colorStateList = null;
		if (u == -1) {
			colorStateList = U;
		} else {
			colorStateList = T;
		}
		// ColorStateList colorStateList = this.u == -1 ? this.U : this.T;
		button.setTextColor(colorStateList);
		button.setBackgroundDrawable((Drawable) this.h());
		button.setOnClickListener((View.OnClickListener) new View.OnClickListener() {

			public void onClick(View view) {
				if (wc.this.p != null) {
					wc.this.p.onClick((DialogInterface) wc.this.b, -1);
					return;
				}
				wb.d.onClick((DialogInterface) wc.this.b, -1);
			}
		});
		viewGroup.addView((View) button);
		return true;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean c(ViewGroup viewGroup, boolean bl) {
		if (this.s == null) {
			return bl;
		}
		if (bl) {
			this.b(viewGroup);
		}
		Button button = (Button) this.c.inflate(R.layout.custom_dialog_button,
				viewGroup, false);
		button.setId(R.id.custom_dialog_neutral_button);
		button.setText(this.s);
		ColorStateList colorStateList = this.u == -3 ? this.U : this.T;
		button.setTextColor(colorStateList);
		button.setBackgroundDrawable((Drawable) this.h());
		button.setOnClickListener((View.OnClickListener) new View.OnClickListener() {

			public void onClick(View view) {
				if (wc.this.t != null) {
					wc.this.t.onClick((DialogInterface) wc.this.b, -3);
					return;
				}
				wb.d.onClick((DialogInterface) wc.this.b, -3);
			}
		});
		viewGroup.addView((View) button);
		return true;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void g(int n) {
		Handler handler = this.b.c;
		Message message = Message.obtain((Handler) this.b.c, (int) 1,
				(int) this.m, (int) n);
		long l = n == this.n ? 0 : 1000;
		handler.sendMessageDelayed(message, l);
	}

	/*private boolean i() {
		if (this.q != null || this.s != null || this.o != null) {
			return true;
		}
		return false;
	}*/
	private boolean i()
    {
        return q != null || s != null || o != null;
    }
	public wc a(int n) {
		this.j = n;
		return this;
	}

	public wc a(int n, int n2, DialogInterface.OnClickListener onClickListener) {
		this.C = this.a.getResources().getTextArray(n);
		this.F = onClickListener;
		this.G = n2;
		this.L = true;
		return this;
	}

	public wc a(int n, DialogInterface.OnClickListener onClickListener) {
		this.o = this.a.getText(n);
		this.p = onClickListener;
		return this;
	}

	public wc a(
			int n,
			boolean[] arrbl,
			DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
		this.C = this.a.getResources().getTextArray(n);
		this.M = onMultiChoiceClickListener;
		this.J = arrbl;
		this.I = true;
		return this;
	}

	public wc a(DialogInterface.OnCancelListener onCancelListener) {
		this.e = onCancelListener;
		return this;
	}

	public wc a(DialogInterface.OnDismissListener onDismissListener) {
		this.f = onDismissListener;
		return this;
	}

	public wc a(Drawable drawable) {
		this.N = drawable;
		return this;
	}

	public wc a(View view) {
		this.v = view;
		this.w = false;
		return this;
	}

	public wc a(CharSequence charSequence) {
		this.d = charSequence;
		return this;
	}

	public wc a(CharSequence charSequence,
			DialogInterface.OnClickListener onClickListener) {
		this.o = charSequence;
		this.p = onClickListener;
		return this;
	}

	public wc a(boolean bl) {
		this.O = bl;
		return this;
	}

	public wc a(Drawable[] arrdrawable, CharSequence[] arrcharSequence,
			DialogInterface.OnClickListener onClickListener) {
		this.h = arrdrawable;
		this.C = arrcharSequence;
		this.F = onClickListener;
		return this;
	}

	public wc a(CharSequence[] arrcharSequence,
			DialogInterface.OnClickListener onClickListener) {
		return this.a(null, arrcharSequence, onClickListener);
	}

	/*
	 * Exception decompiling
	 */
	// public void a(Dialog dialog) {
	// a();
	// View view = g();
	// android.view.WindowManager.LayoutParams layoutparams;
	// if (P) {
	// dialog.setCanceledOnTouchOutside(P);
	// } else if (!O) {
	// dialog.setCancelable(O);
	// }
	// if (e != null) {
	// dialog.setOnCancelListener(e);
	// }
	// if (f != null) {
	// dialog.setOnDismissListener(f);
	// }
	// if (Z != null) {
	// dialog.setOnShowListener(Z);
	// }
	// Window window = dialog.getWindow();
	// layoutparams = window.getAttributes();
	// if (i >= 1 && i <= 2999) {
	// layoutparams.type = i;
	// }
	// if (j != 0) {
	// layoutparams.gravity = j;
	// }
	// try {
	// dialog.setContentView(view);
	// } catch (Throwable throwable) {
	// }
	// if (android.os.Build.VERSION.SDK_INT < 11) {
	// layoutparams.width = a.getResources().getDisplayMetrics().widthPixels
	// - (a.getResources().getDimensionPixelSize(
	// R.dimen.custom_dialog_window_padding) << 1);
	// }
	// window.setAttributes(layoutparams);
	// }
	public void a(Dialog var1) {
		this.a();
		View var2 = this.g();
		if (this.P) {
			var1.setCanceledOnTouchOutside(this.P);
		} else if (!this.O) {
			var1.setCancelable(this.O);
		}

		if (this.e != null) {
			var1.setOnCancelListener(this.e);
		}

		if (this.f != null) {
			var1.setOnDismissListener(this.f);
		}

		if (this.Z != null) {
			var1.setOnShowListener(this.Z);
		}

		Window var5 = var1.getWindow();
		LayoutParams var3 = var5.getAttributes();
		if (this.i >= 1 && this.i <= 2999) {
			var3.type = this.i;
		}

		if (this.j != 0) {
			var3.gravity = this.j;
		}

		try {
			var5.setContentView(var2);
		} catch (Throwable var4) {
			
		}

		if (VERSION.SDK_INT < 11) {
			var3.width = this.a.getResources().getDisplayMetrics().widthPixels
					- (this.a.getResources().getDimensionPixelSize(2131427356) << 1);
		}

		var5.setAttributes(var3);
	}

	public wc b(int n) {
		this.i = n;
		return this;
	}

	public wc b(int n, DialogInterface.OnClickListener onClickListener) {
		this.q = this.a.getText(n);
		this.r = onClickListener;
		return this;
	}

	public wc b(View view) {
		this.k = view;
		return this;
	}

	public wc b(CharSequence charSequence) {
		this.g = charSequence;
		return this;
	}

	public wc b(CharSequence charSequence,
			DialogInterface.OnClickListener onClickListener) {
		this.q = charSequence;
		this.r = onClickListener;
		return this;
	}

	public wc b(boolean bl) {
		this.P = bl;
		return this;
	}

	protected wb c() {
		return new wb(this.a);
	}

	public wc c(int n) {
		this.d = this.a.getText(n);
		return this;
	}

	public wc c(View view) {
		this.l = view;
		return this;
	}

	public wc c(CharSequence charSequence,
			DialogInterface.OnClickListener onClickListener) {
		this.s = charSequence;
		this.t = onClickListener;
		return this;
	}

	public wb d() {
		this.b = this.c();
		this.a((Dialog) this.b);
		return this.b;
	}

	public wc d(int n) {
		return this.b(n, null);
	}

	public wb e() {
		this.d();
		try {
			this.b.show();
			if (this.m != 0 && this.n >= 5) {
				this.f();
			}
			wb wb = this.b;
			return wb;
		} catch (Throwable var2_2) {
			Log.w((String) "Swipe.CustomDialog",
					(String) "Failed to show the dialog", (Throwable) var2_2);
			return null;
		}
	}

	public wc e(int n) {
		this.u = n;
		return this;
	}

	public wc f(int n) {
		this.g = this.a.getText(n);
		return this;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	protected void f() {
		switch (this.m) {
		default: {
			this.m = 0;
			break;
		}
		case -2: {
			if (this.q != null)
				break;
			this.m = 0;
			break;
		}
		case -3: {
			if (this.s != null)
				break;
			this.m = 0;
			break;
		}
		case -1: {
			if (this.o != null)
				break;
			this.m = 0;
		}
		}
		if (this.m != 0) {
			this.b.c = new Handler() {

				/*
				 * Enabled aggressive block sorting
				 */
				public void handleMessage(Message message) {
					Button button;
					CharSequence charSequence = null;
					if (1 != message.what)
						return;
					switch (message.arg1) {
					default: {
						return;
					}
					case -1: {
						button = wc.this.b.a();
						charSequence = wc.this.o;
						break;
					}
					case -2: {
						button = wc.this.b.e();
						charSequence = wc.this.q;
						break;
					}
					case -3: {
						button = wc.this.b.f();
						charSequence = wc.this.s;
					}
					}
					if (button != null) {
						int n = message.arg2;
						if (n > 0) {
							button.setText((CharSequence) ((Object) charSequence
									+ " (" + n + "...)"));
							wc.this.g(n - 1);
						}
					} else {
						return;
					}
					button.performClick();
				}
			};
			this.g(this.n);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
//	protected View g() {
//		View view = this.b();
//		LinearLayout linearLayout = (LinearLayout) view
//				.findViewById(R.id.custom_dialog_content);
//		if (this.g != null) {
//			View view2 = this.c.inflate(R.layout.custom_dialog_message,
//					(ViewGroup) linearLayout, false);
//
//			TextView textView = (TextView) view2
//					.findViewById(R.id.custom_dialog_message);
//			textView.setTextColor(this.R1);
//			textView.setText(this.g);
//			textView.setMinLines(this.S);
//			linearLayout.addView(view2);
//		}
//		if (this.v != null) {
//			LinearLayout linearLayout2 = new LinearLayout(this.a);
//			linearLayout2.setGravity(17);
//			View view3 = this.v;
//			int n;
//			if (v instanceof ListView) {
//				n = -1;
//			} else {
//				n = -2;
//			}
//			// int n = this.v instanceof ListView ? -1 : -2;
//			linearLayout2.addView(view3,
//					(ViewGroup.LayoutParams) new LinearLayout.LayoutParams(n,
//							-2));
//			if (this.w) {
//				linearLayout2.setPadding(this.x, this.y, this.z, this.A);
//			}
//			if (this.v instanceof ListView) {
//				linearLayout.addView((View) linearLayout2,
//						(ViewGroup.LayoutParams) new LinearLayout.LayoutParams(
//								-1, -2, 1.0f));
//			} else {
//				linearLayout.addView((View) linearLayout2);
//			}
//		}
//		if (this.C != null || this.B != null || this.D != null) {
//			this.a((ViewGroup) linearLayout);
//		}
//		this.a(linearLayout);
//		return view;
//	}
	protected View g() {
	      View var2 = this.b();
	      LinearLayout var3 = (LinearLayout)var2.findViewById(R.id.custom_dialog_content);
	      if(this.g != null) {
	         View var4 = this.c.inflate(R.layout.custom_dialog_message, var3, false);
	         TextView var5 = (TextView)var4.findViewById(R.id.custom_dialog_message);
	         var5.setTextColor(this.R1);
	         var5.setText(this.g);
	         var5.setMinLines(this.S);
	         var3.addView(var4);
	      }

	      if(this.v != null) {
	         LinearLayout var6 = new LinearLayout(this.a);
	         var6.setGravity(17);
	         View var7 = this.v;
	         byte var1;
	         if(this.v instanceof ListView) {
	            var1 = -1;
	         } else {
	            var1 = -2;
	         }

	         var6.addView(var7, new android.widget.LinearLayout.LayoutParams(var1, -2));
	         if(this.w) {
	            var6.setPadding(this.x, this.y, this.z, this.A);
	         }

	         if(this.v instanceof ListView) {
	            var3.addView(var6, new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F));
	         } else {
	            var3.addView(var6);
	         }
	      }

	      if(this.C != null || this.B != null || this.D != null) {
	         this.a((ViewGroup)var3);
	      }

	      this.a((LinearLayout)var3);
	      return var2;
	   }
	protected StateListDrawable h() {
		int[] arrn = new int[] { 16842919 };
		int[] arrn2 = new int[] { 16842908 };
		int[] arrn3 = new int[] { 16842910 };
		ColorDrawable colorDrawable = new ColorDrawable(this.W);
		ColorDrawable colorDrawable2 = new ColorDrawable(this.X);
		ColorDrawable colorDrawable3 = new ColorDrawable(this.Y);
		StateListDrawable stateListDrawable = new StateListDrawable();
		stateListDrawable.addState(arrn, (Drawable) colorDrawable2);
		stateListDrawable.addState(arrn2, (Drawable) colorDrawable3);
		stateListDrawable.addState(arrn3, (Drawable) colorDrawable);
		return stateListDrawable;
	}

}
