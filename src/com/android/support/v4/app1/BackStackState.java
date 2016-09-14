package com.android.support.v4.app1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import com.main.n;
import com.main.e;
import com.main.d;
// Referenced classes of package android.support.v4.app:
//            Fragment

public final class BackStackState implements Parcelable {

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public BackStackState a(Parcel parcel) {
			return new BackStackState(parcel);
		}

		public BackStackState[] a(int l) {
			return new BackStackState[l];
		}

		public Object createFromParcel(Parcel parcel) {
			return a(parcel);
		}

		public Object[] newArray(int l) {
			return a(l);
		}

	};
	final int a[];
	final int b;
	final int c;
	final String d;
	final int e;
	final int f;
	final CharSequence g;
	final int h;
	final CharSequence i;
	final ArrayList j;
	final ArrayList k;

	public BackStackState(Parcel parcel) {
		a = parcel.createIntArray();
		b = parcel.readInt();
		c = parcel.readInt();
		d = parcel.readString();
		e = parcel.readInt();
		f = parcel.readInt();
		g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR
				.createFromParcel(parcel);
		h = parcel.readInt();
		i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR
				.createFromParcel(parcel);
		j = parcel.createStringArrayList();
		k = parcel.createStringArrayList();
	}

	public BackStackState(n n1, com.main.d d1) {
		e e = d1.c;
		int l;
		int i1;
		for (l = 0; n1 != null; l = i1) {
			i1 = l;
			if (((e) (e)).i != null) {
				i1 = l + ((e) (e)).i.size();
			}
			e = ((e) (e)).a;
		}

		a = new int[l + d1.e * 7];
		if (!d1.l) {
			throw new IllegalStateException("Not on back stack");
		}
		e = d1.c;
		l = 0;
		while (n1 != null) {
			int ai[] = a;
			int j1 = l + 1;
			ai[l] = ((e) (e)).c;
			ai = a;
			int k1 = j1 + 1;
			if (((e) (e)).d != null) {
				l = ((e) (e)).d.g;
			} else {
				l = -1;
			}
			ai[j1] = l;
			ai = a;
			l = k1 + 1;
			ai[k1] = ((e) (e)).e;
			ai = a;
			j1 = l + 1;
			ai[l] = ((e) (e)).f;
			ai = a;
			l = j1 + 1;
			ai[j1] = ((e) (e)).g;
			ai = a;
			j1 = l + 1;
			ai[l] = ((e) (e)).h;
			if (((e) (e)).i != null) {
				int l1 = ((e) (e)).i.size();
				int ai1[] = a;
				l = j1 + 1;
				ai1[j1] = l1;
				for (j1 = 0; j1 < l1;) {
					a[l] = ((Fragment) ((e) (e)).i.get(j1)).g;
					j1++;
					l++;
				}

			} else {
				int ai2[] = a;
				l = j1 + 1;
				ai2[j1] = 0;
			}
			e = ((e) (e)).a;
		}
		b = d1.j;
		c = d1.k;
		d = d1.n;
		this.e = d1.p;
		f = d1.q;
		g = d1.r;
		h = d1.s;
		i = d1.t;
		j = d1.u;
		k = d1.v;
	}

	public d a(n n1) {
		d d1 = new d(n1);
		int j1 = 0;
		for (int l = 0; l < a.length;) {
			e e1 = new e();
			int ai[] = a;
			int i1 = l + 1;
			e1.c = ai[l];
			if (n.a) {
				Log.v("FragmentManager",
						(new StringBuilder()).append("Instantiate ").append(d1)
								.append(" op #").append(j1)
								.append(" base fragment #").append(a[i1])
								.toString());
			}
			ai = a;
			l = i1 + 1;
			i1 = ai[i1];
			int l1;
			if (i1 >= 0) {
				e1.d = (Fragment) n1.f.get(i1);
			} else {
				e1.d = null;
			}
			ai = a;
			i1 = l + 1;
			e1.e = ai[l];
			ai = a;
			l = i1 + 1;
			e1.f = ai[i1];
			ai = a;
			i1 = l + 1;
			e1.g = ai[l];
			ai = a;
			l = i1 + 1;
			e1.h = ai[i1];
			ai = a;
			i1 = l + 1;
			l1 = ai[l];
			l = i1;
			if (l1 > 0) {
				e1.i = new ArrayList(l1);
				int k1 = 0;
				do {
					l = i1;
					if (k1 >= l1) {
						break;
					}
					if (n.a) {
						Log.v("FragmentManager",
								(new StringBuilder()).append("Instantiate ")
										.append(d1)
										.append(" set remove fragment #")
										.append(a[i1]).toString());
					}
					Fragment fragment = (Fragment) n1.f.get(a[i1]);
					e1.i.add(fragment);
					k1++;
					i1++;
				} while (true);
			}
			d1.a(e1);
			j1++;
		}

		d1.j = b;
		d1.k = c;
		d1.n = d;
		d1.p = e;
		d1.l = true;
		d1.q = f;
		d1.r = g;
		d1.s = h;
		d1.t = i;
		d1.u = j;
		d1.v = k;
		d1.a(1);
		return d1;
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel parcel, int l) {
		parcel.writeIntArray(a);
		parcel.writeInt(b);
		parcel.writeInt(c);
		parcel.writeString(d);
		parcel.writeInt(e);
		parcel.writeInt(f);
		TextUtils.writeToParcel(g, parcel, 0);
		parcel.writeInt(h);
		TextUtils.writeToParcel(i, parcel, 0);
		parcel.writeStringList(j);
		parcel.writeStringList(k);
	}

}
