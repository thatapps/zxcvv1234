/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.app.LoaderManager
 *  android.app.LoaderManager$LoaderCallbacks
 *  android.content.CursorLoader
 *  android.content.Loader
 *  android.database.Cursor
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.CursorAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.lazyswipe.ui;

import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.main.vj;

/*
 * Failed to analyse overrides
 */
public abstract class CursorLoaderFragment extends BaseFragment implements
		LoaderManager.LoaderCallbacks, AdapterView.OnItemClickListener {
	protected ListView q;
	protected CursorAdapter r;
	protected int s;

	public abstract Loader a(int var1, Bundle var2);

	public void a(Loader loader, Cursor cursor) {
		this.r.swapCursor(cursor);
	}

	public abstract void a(Cursor var1);

	public void a(View view) {
		super.a(view);
		this.q = (ListView) view.findViewById(16908298);
		this.q.setEmptyView(view.findViewById(16908292));
		this.q.setOnScrollListener((AbsListView.OnScrollListener) new AbsListView.OnScrollListener() {

			public void onScroll(AbsListView absListView, int n, int n2, int n3) {
			}

			public void onScrollStateChanged(AbsListView absListView, int n) {
			}
		});
	}

	public abstract int b();

	public abstract CursorAdapter c();

	public void onActivityCreated(Bundle bundle) {
		super.onActivityCreated(bundle);
		try {
			this.r = this.c();
			this.q.setOnItemClickListener((AdapterView.OnItemClickListener) this);
			this.q.setAdapter((ListAdapter) this.r);
			if (this.s <= 0) {
				this.s = this.b();
			}
			this.getLoaderManager().initLoader(this.s, null,
					(LoaderManager.LoaderCallbacks) this);
			return;
		} catch (Throwable var2_2) {
			vj.a("Swipe.CursorLoaderFrag", "Exception in onActivityCreated",
					var2_2);
			return;
		}
	}

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		Bundle bundle2 = this.getArguments();
		if (bundle2 != null) {
			this.s = bundle2.getInt("loaderId");
		}
	}

	public Loader onCreateLoader(int n, Bundle bundle) {
		CursorLoader cursorLoader = (CursorLoader) this.a(n, bundle);
		cursorLoader.setUpdateThrottle(2000);
		return cursorLoader;
	}

	public void onDestroy() {
		if (this.q != null) {
			this.q.setAdapter(null);
			this.q = null;
		}
		if (this.r != null) {
			this.r.swapCursor(null);
			this.r = null;
		}
		super.onDestroy();
	}

	public void onItemClick(AdapterView adapterView, View view, int n, long l) {
		this.a((Cursor) adapterView.getItemAtPosition(n));
	}

	public/* synthetic */void onLoadFinished(Loader loader, Object object) {
		this.a(loader, (Cursor) object);
	}

	public void onLoaderReset(Loader loader) {
		if (this.r != null) {
			this.r.swapCursor(null);
		}
	}

}
