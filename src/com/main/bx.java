package com.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public class bx {

	private static final Object f = new Object();
	private static bx g;
	private final Context a;
	private final HashMap b = new HashMap();
	private final HashMap c = new HashMap();
	private final ArrayList d = new ArrayList();
	private final Handler e;

	private bx(Context context) {
		a = context;
		e = new Handler(context.getMainLooper()) {

			final bx a;

			public void handleMessage(Message message) {
				switch (message.what) {
				default:
					super.handleMessage(message);
					return;

				case 1:
					bx.a(a);
					break;
				}
			}

			{
				a = bx.this;

			}
		};
	}

	public static bx a(Context context) {
		synchronized (f) {
			if (g == null) {
				g = new bx(context.getApplicationContext());
			}
			// context = g;
		}
		return g;

	}

	private void a() {

		Object obj = b;

		int i = d.size();
		if (i <= 0) {
			return;
		}

		by aby[];
		aby = new by[i];
		d.toArray(aby);
		d.clear();
		i = 0;

		while (i < aby.length) {
			obj = aby[i];
			for (int j = 0; j < ((by) (obj)).b.size(); j++) {
				((bz) ((by) (obj)).b.get(j)).b.onReceive(a, ((by) (obj)).a);
			}

			i++;
		}

	}

	static void a(bx bx1) {
		bx1.a();
	}

	public void a(BroadcastReceiver broadcastreceiver) {
		HashMap hashmap = b;
		int j;
		int k = 0;
		int i = 0;
		String s;
		IntentFilter intentfilter = null;
		ArrayList arraylist1;
		ArrayList arraylist = (ArrayList) b.remove(broadcastreceiver);
		if (arraylist != null) {

			j = 0;

		} else {
			return;
		}

		if (j >= arraylist.size()) {

			return;

		} else {
			intentfilter = (IntentFilter) arraylist.get(j);

		}

		if (k >= intentfilter.countActions()) {
			/* Loop/switch isn't completed */
		}
		s = intentfilter.getAction(k);
		arraylist1 = (ArrayList) c.get(s);
		if (arraylist1 == null) {
			k++;

		}

		if (i >= arraylist1.size()) {

			if (arraylist1.size() <= 0) {
				c.remove(s);
			}

		} else {
			if (((bz) arraylist1.get(i)).b != broadcastreceiver) {
				i++;

			} else {
				arraylist1.remove(i);
				i--;

			}
		}

	}

	// public void a(BroadcastReceiver broadcastreceiver, IntentFilter
	// intentfilter) {
	// HashMap hashmap = b;
	//
	// Object obj;
	// bz bz1;
	// bz1 = new bz(intentfilter, broadcastreceiver);
	// obj = (ArrayList) b.get(broadcastreceiver);
	// ArrayList arraylist;
	// arraylist = ((ArrayList) (obj));
	// if (obj != null) {
	//
	// }
	// arraylist = new ArrayList(1);
	// b.put(broadcastreceiver, arraylist);
	// arraylist.add(intentfilter);
	// int i = 0;
	// if (i >= intentfilter.countActions()) {
	//
	// }
	// obj = intentfilter.getAction(i);
	// arraylist = (ArrayList) c.get(obj);
	// // broadcastreceiver = arraylist;
	// if (arraylist != null) {
	//
	// }
	// arraylist = new ArrayList(1);
	// c.put(obj, arraylist);
	// arraylist.add(bz1);
	// i++;
	//
	// return;
	//
	// }
	@SuppressWarnings("rawtypes")
	public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
		HashMap hashMap;
		HashMap hashMap2 = hashMap = this.b;
		synchronized (hashMap2) {
			bz bz = new bz(intentFilter, broadcastReceiver);
			ArrayList arrayList = (ArrayList) this.b
					.get((Object) broadcastReceiver);
			if (arrayList == null) {
				arrayList = new ArrayList(1);
				this.b.put((Object) broadcastReceiver, (Object) arrayList);
			}
			arrayList.add((Object) intentFilter);
			for (int i = 0; i < intentFilter.countActions(); ++i) {
				String string = intentFilter.getAction(i);
				ArrayList arrayList2 = (ArrayList) this.c.get((Object) string);
				if (arrayList2 == null) {
					arrayList2 = new ArrayList(1);
					this.c.put((Object) string, (Object) arrayList2);
				}
				arrayList2.add((Object) bz);
			}
			return;
		}
	}

	public boolean a(Intent intent) {
		HashMap hashmap = b;

		String s;
		String s1;
		android.net.Uri uri;
		String s2;
		java.util.Set set;
		s = intent.getAction();
		s1 = intent.resolveTypeIfNeeded(a.getContentResolver());
		uri = intent.getData();
		s2 = intent.getScheme();
		set = intent.getCategories();
		ArrayList arraylist;
		Object obj;
		int i;
		ArrayList arraylist1;
		int j;
		int k;
		if ((intent.getFlags() & 8) != 0) {
			i = 1;
		} else {
			i = 0;
		}
		if (i == 0) {

		}
		Log.v("LocalBroadcastManager",
				(new StringBuilder()).append("Resolving type ").append(s1)
						.append(" scheme ").append(s2).append(" of intent ")
						.append(intent).toString());
		arraylist1 = (ArrayList) c.get(intent.getAction());
		if (arraylist1 == null) {

			return false;

		} else {
			if (i == 0) {

				arraylist = null;
				j = 0;

			} else {

				Log.v("LocalBroadcastManager",
						(new StringBuilder()).append("Action list: ")
								.append(arraylist1).toString());
				arraylist = null;
				j = 0;
			}

		}

		if (j >= arraylist1.size()) {

			if (arraylist == null) {
				return false;

			} else {

				i = 0;
				if (i >= arraylist.size()) {

				}
				((bz) arraylist.get(i)).c = false;
				i++;

				d.add(new by(intent, arraylist));
				if (!e.hasMessages(1)) {
					e.sendEmptyMessage(1);
				}

				return true;

			}

		} else {

			obj = (bz) arraylist1.get(j);
			if (i == 0) {

			}
			Log.v("LocalBroadcastManager",
					(new StringBuilder()).append("Matching against filter ")
							.append(((bz) (obj)).a).toString());
			if (!((bz) (obj)).c) {

				k = ((bz) (obj)).a.match(s, s1, s2, uri, set,
						"LocalBroadcastManager");
				if (k < 0) {

					if (i == 0) {

						j++;
						// goto _L20

					} else {

						switch (k) {
						default:
							obj = "unknown reason";
							break;
						case -4:

							obj = "category";
							Log.v("LocalBroadcastManager",
									(new StringBuilder())
											.append("  Filter did not match: ")
											.append(((String) (obj)))
											.toString());
							// goto _L20
							break;
						case -3:
							obj = "action";
							Log.v("LocalBroadcastManager",
									(new StringBuilder())
											.append("  Filter did not match: ")
											.append(((String) (obj)))
											.toString());
							// goto _L20
							break;
						case -2:

							obj = "data";
							Log.v("LocalBroadcastManager",
									(new StringBuilder())
											.append("  Filter did not match: ")
											.append(((String) (obj)))
											.toString());
							// goto _L20
							break;
						case -1:
							obj = "type";
							Log.v("LocalBroadcastManager",
									(new StringBuilder())
											.append("  Filter did not match: ")
											.append(((String) (obj)))
											.toString());
							// goto _L20
							break;
						}

					}

				} else {

					if (i == 0) {

					}
					Log.v("LocalBroadcastManager",
							(new StringBuilder())
									.append("  Filter matched!  match=0x")
									.append(Integer.toHexString(k)).toString());
					if (arraylist != null) {

					}
					arraylist = new ArrayList();
					arraylist.add(obj);
					((bz) (obj)).c = true;

				}

			} else {
				if (i == 0) {

					j++;

				} else {
					Log.v("LocalBroadcastManager",
							"  Filter's target already added");
				}

			}

		}

		k = ((bz) (obj)).a.match(s, s1, s2, uri, set, "LocalBroadcastManager");
		if (k < 0) {
			if (i == 0) {

				j++;

			} else {
				switch (k) {
				default:
					obj = "unknown reason";
					break;
				case -4:

					obj = "category";
					Log.v("LocalBroadcastManager",
							(new StringBuilder())
									.append("  Filter did not match: ")
									.append(((String) (obj))).toString());
					// goto _L20
					break;
				case -3:
					obj = "action";
					Log.v("LocalBroadcastManager",
							(new StringBuilder())
									.append("  Filter did not match: ")
									.append(((String) (obj))).toString());
					// goto _L20
					break;
				case -2:

					obj = "data";
					Log.v("LocalBroadcastManager",
							(new StringBuilder())
									.append("  Filter did not match: ")
									.append(((String) (obj))).toString());
					// goto _L20
					break;
				case -1:
					obj = "type";
					Log.v("LocalBroadcastManager",
							(new StringBuilder())
									.append("  Filter did not match: ")
									.append(((String) (obj))).toString());
					// goto _L20
					break;
				}

			}

		} else {
			if (i == 0) {

			}
			Log.v("LocalBroadcastManager",
					(new StringBuilder()).append("  Filter matched!  match=0x")
							.append(Integer.toHexString(k)).toString());
			if (arraylist != null) {

			}
			arraylist = new ArrayList();
			arraylist.add(obj);
			((bz) (obj)).c = true;

		}

		if (i >= arraylist.size()) {

		}
		((bz) arraylist.get(i)).c = false;
		i++;

		d.add(new by(intent, arraylist));
		if (!e.hasMessages(1)) {
			e.sendEmptyMessage(1);
		}

		return true;

	}
}
