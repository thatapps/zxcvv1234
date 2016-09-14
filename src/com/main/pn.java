package com.main;

import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.util.SparseIntArray;

import com.lazyswipe.SwipeApplication;
import com.lazyswipe.notification.SwipeAccessibilityService;
import com.lazyswipe.util.Native$CryptoUtils;

public final class pn implements Runnable {
	final SwipeAccessibilityService a;

	pn(SwipeAccessibilityService swipeaccessibilityservice) {
		super();
		a = swipeaccessibilityservice;

	}

	public void run() {
		 a.b.clear();
		Context context = null;
		Iterator iterator1 = null;
		Iterator iterator;
		SparseArray sparsearray;
		SparseIntArray sparseintarray = null;
		int i=0;
		int j = 0;
		String s1;
		String s2 = null;
		String s = null;
		JSONObject jsonobject;
		Object obj2=null;

		Object obj3, obj, obj1;
		obj=null;
		obj3=null;
		obj1 = null;
		context = SwipeApplication.e();
		if (jl.a(context)) {

		
			s = ir.c(context);
			obj = (context.getContentResolver().query(kr.a,
					new String[] { "package", "data" }, null, null, null));
		} else {
			context.getContentResolver().delete(kr.a, null, null);

		}

		if (!((Cursor) (obj)).moveToNext()) {

		}
		s1 = Native$CryptoUtils.b(context,
				((Cursor) (obj)).getString(0), s);
		obj2 = Native$CryptoUtils.b(context,
				((Cursor) (obj)).getString(1), s);

		try {
			obj2 = new JSONObject(((String) (obj2)));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		iterator = ((JSONObject) (obj2)).keys();
		sparsearray = new SparseArray(4);

		if (!iterator.hasNext()) {

			if (sparsearray.size() <= 0) {

				if (!((Cursor) (obj)).moveToNext()) {

				}
				s1 = Native$CryptoUtils.b(context,
						((Cursor) (obj)).getString(0), s);
				obj2 = Native$CryptoUtils.b(context,
						((Cursor) (obj)).getString(1), s);
				// Iterator iterator;
				// SparseArray sparsearray;
				try {
					obj2 = new JSONObject(((String) (obj2)));
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				iterator = ((JSONObject) (obj2)).keys();
				sparsearray = new SparseArray(4);

			} else {

				a.b.put(s1, sparsearray);

				if (obj == null) {

					return;
				} else {
					((Cursor) (obj)).close();
					return;

				}

			}
		} else {

			obj3 = (String) iterator.next();
			j = Integer.parseInt(((String) (obj3)));
			i = Math.abs(j);
			if (i == 3 || i == 2) {

				if (!iterator.hasNext()) {

					if (sparsearray.size() <= 0) {

						if (!((Cursor) (obj)).moveToNext()) {

						}
						s1 = Native$CryptoUtils.b(((Context) (obj1)),
								((Cursor) (obj)).getString(0), s);
						obj2 = Native$CryptoUtils.b(context,
								((Cursor) (obj)).getString(1), s);
						// Iterator iterator;
						// SparseArray sparsearray;
						try {
							obj2 = new JSONObject(((String) (obj2)));
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						iterator = ((JSONObject) (obj2)).keys();
						sparsearray = new SparseArray(4);

					} else {

						a.b.put(s1, sparsearray);

						if (obj == null) {

							return;
						} else {
							((Cursor) (obj)).close();
							return;

						}

					}

				} else {

					try {
						obj3 = ((JSONObject) (obj2))
								.getJSONObject(((String) (obj3)));
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sparseintarray = new SparseIntArray(4);
					iterator1 = ((JSONObject) (obj3)).keys();

				}
			}

		}

		if (!iterator1.hasNext()) {

			sparsearray.put(j, sparseintarray);

		} else {

			s2 = (String) iterator1.next();
			jsonobject = ((JSONObject) (obj3)).optJSONObject(s2);
			if (jsonobject == null) {
				///break MISSING_BLOCK_LABEL_374;
			}
			i = jsonobject.optInt("width");
		}

		sparseintarray.put(Integer.parseInt(s2), i);

		if (obj1 != null) {
			((Cursor) (obj1)).close();
		}

		// _L4:
		if (sparsearray.size() <= 0) {

			if (!((Cursor) (obj)).moveToNext()) {

			}
			s1 = Native$CryptoUtils.b(context,
					((Cursor) (obj)).getString(0), s);
			obj2 = Native$CryptoUtils.b(((Context) (obj1)),
					((Cursor) (obj)).getString(1), s);

			try {
				obj2 = new JSONObject(((String) (obj2)));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			iterator = ((JSONObject) (obj2)).keys();
			sparsearray = new SparseArray(4);

		}
	}
}
