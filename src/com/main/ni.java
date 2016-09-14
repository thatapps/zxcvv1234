package com.main;

import com.lazyswipe.fan.hetero.iwatch.WatchFanItem;

public class ni {

	public float a;
	public float b;

	public ni(float f, float f1) {
		a = f;
		b = f1;
	}

	public ni(int i, int j) {
		a = i;
		b = j;
	}

	public static ni[] a(int i, int j) {
		ni ani[] = WatchFanItem.k[j];
		if (i == 1) {
			return ani;
		}
		if (i == 0) {
			i = -90;
		} else {
			i = 90;
		}
		return a(ani, i);
	}

	public static ni[] a(ni ani[], int i) {
		ni ani1[] = new ni[ani.length];
		for (int j = 0; j < ani.length; j++) {
			ani1[j] = ani[j].a(i);
		}

		int k = 0;
		i = 0;
		do {
			if (k >= ani1.length || ani1[k].a == 0.0F) {
				ani = new ni[ani.length];
				boolean flag = false;
				k = i;
				i = ((flag) ? 1 : 0);
				for (; k < ani1.length - 1; k++) {
					ani[i] = ani1[k];
					i++;
				}

				break;
			}
			i++;
			k++;
		} while (true);
		k = 0;
		for (; i < ani1.length - 1; i++) {
			ani[i] = ani1[k];
			k++;
		}

		if (ani1.length > 0) {
			ani[ani1.length - 1] = new ni(270F, ani[0].b);
		}
		return ani;
	}

	public ni a(int i) {
		return new ni(oy.b(a + (float) i), b);
	}

	public String toString() {
		return (new StringBuilder()).append("(").append(a).append(" - ")
				.append(b).append(")").toString();
	}
}
