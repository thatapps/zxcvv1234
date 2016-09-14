/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.ScrollView
 *  android.widget.Scroller
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Queue
 */
package com.lazyswipe.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;

import com.main.dw;
import com.main.et;
import com.main.ry;
import com.main.rz;
import com.main.sa;
import com.main.sb;
import com.main.sc;
import com.main.sd;

/*
 * Failed to analyse overrides
 */
public class HorizontalListView extends AdapterView {
	private boolean A;
	private boolean B;
	private View.OnClickListener C;
	private DataSetObserver D;
	private Runnable E;
	protected Scroller a;
	public ListAdapter b;
	protected int c;
	public int d;
	private final ry e;
	private GestureDetector f;
	private int g;
	private List h;
	private boolean i;
	private Rect j;
	private View k;
	private int l;
	private Drawable m;
	private Integer n;
	private int o;
	private int p;
	private int q;
	private int r;
	private sd s;
	private int t;
	private boolean u;
	private sb v;
	private sc w;
	private et x;
	private et y;
	private int z;

	public static int a(HorizontalListView horizontallistview, int i1, int j1) {
		return horizontallistview.c(i1, j1);
	}

	static GestureDetector a(HorizontalListView horizontallistview) {
		return horizontallistview.f;
	}

	public HorizontalListView(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);
		this.a = new Scroller(this.getContext());
		this.e = new ry(this, null);
		this.h = new ArrayList();
		this.i = false;
		this.j = new Rect();
		this.k = null;
		this.l = 0;
		this.m = null;
		this.n = null;
		this.o = Integer.MAX_VALUE;
		this.s = null;
		this.t = 0;
		this.u = false;
		this.v = null;
		this.w = sc.a;
		this.A = false;
		this.B = false;
		this.D = new DataSetObserver() {

			public void onChanged() {
				HorizontalListView.this.i = true;
				HorizontalListView.this.u = false;
				HorizontalListView.this.f();
				HorizontalListView.this.invalidate();
				HorizontalListView.this.requestLayout();
			}

			public void onInvalidated() {
				HorizontalListView.this.u = false;
				HorizontalListView.this.f();
				HorizontalListView.this.c();
				HorizontalListView.this.invalidate();
				HorizontalListView.this.requestLayout();
			}
		};
		this.E = new Runnable() {

			public void run() {
				HorizontalListView.this.requestLayout();
			}
		};
		this.x = new et(context);
		this.y = new et(context);
		this.f = new GestureDetector(context,
				(GestureDetector.OnGestureListener) this.e);
		this.a();
		this.b();
		this.a(context, attributeSet);
		this.setWillNotDraw(false);
		if (Build.VERSION.SDK_INT >= 11) {
			rz.a(this.a, 0.009f);
		}
	}

	private void a() {
		this.setOnTouchListener((View.OnTouchListener) new View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionEvent) {
				return HorizontalListView.this.f.onTouchEvent(motionEvent);
			}
		});
	}

	private void a(int n) {
		this.h.clear();
		for (int i = 0; i < n; ++i) {
			this.h.add((Object) new LinkedList());
		}
	}

	static boolean a(HorizontalListView horizontallistview, boolean flag) {
		horizontallistview.i = flag;
		return flag;
	}

	public static void b(HorizontalListView horizontallistview) {
		horizontallistview.f();
	}

	static boolean b(HorizontalListView horizontallistview, boolean flag) {
		horizontallistview.u = flag;
		return flag;
	}

	static void c(HorizontalListView horizontallistview) {
		horizontallistview.c();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(int n, int n2) {
		while (n + n2 + this.l < this.getWidth()
				&& 1 + this.q < this.b.getCount()) {
			this.q = 1 + this.q;
			if (this.p < 0) {
				this.p = this.q;
			}
			View view = this.b
					.getView(this.q, this.b(this.q), (ViewGroup) this);
			this.a(view, -1);
			int n3 = this.q == 0 ? 0 : this.l;
			n += n3 + view.getMeasuredWidth();
			this.h();
		}
	}

	private void a(int n, View view) {
		int n2 = this.b.getItemViewType(n);
		if (this.c(n2)) {
			((Queue) this.h.get(n2)).offer((Object) view);
		}
	}

	private void a(Context context, AttributeSet attributeSet) {
		if (attributeSet != null) {
			// empty if block
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(Canvas canvas) {
		if (this.x != null && !this.x.a() && this.i()) {
			int n = canvas.save();
			int n2 = this.getHeight();
			canvas.rotate(-90.0f, 0.0f, 0.0f);
			canvas.translate((float) (-n2 + this.getPaddingBottom()), 0.0f);
			this.x.a(this.getRenderHeight(), this.getRenderWidth());
			if (this.x.a(canvas)) {
				this.invalidate();
			}
			canvas.restoreToCount(n);
			return;
		} else {
			if (this.y == null || this.y.a() || !this.i())
				return;
			{
				int n = canvas.save();
				int n3 = this.getWidth();
				canvas.rotate(90.0f, 0.0f, 0.0f);
				canvas.translate((float) this.getPaddingTop(), (float) (-n3));
				this.y.a(this.getRenderHeight(), this.getRenderWidth());
				if (this.y.a(canvas)) {
					this.invalidate();
				}
				canvas.restoreToCount(n);
				return;
			}
		}
	}

	private void a(Canvas canvas, Rect rect) {
		if (this.m != null) {
			this.m.setBounds(rect);
			this.m.draw(canvas);
		}
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void a(View view) {
		ViewGroup.LayoutParams layoutParams = this.b(view);
		int n = ViewGroup.getChildMeasureSpec((int) this.z,
				(int) (this.getPaddingTop() + this.getPaddingBottom()),
				(int) layoutParams.height);
		int n2 = layoutParams.width > 0 ? View.MeasureSpec.makeMeasureSpec(
				(int) layoutParams.width, (int) 1073741824) : View.MeasureSpec
				.makeMeasureSpec((int) 0, (int) 0);
		view.measure(n2, n);
	}

	private void a(View view, int n) {
		this.addViewInLayout(view, n, this.b(view), true);
		this.a(view);
	}

	public static/* synthetic */void a(HorizontalListView horizontalListView,
			int n) {
		horizontalListView.i(n);
	}

	public static/* synthetic */void a(HorizontalListView horizontalListView,
			Boolean bl) {
		horizontalListView.a(bl);
	}

	public static/* synthetic */void a(HorizontalListView horizontalListView,
			sc sc) {
		horizontalListView.setCurrentScrollState(sc);
	}

	/*
	 * Enabled force condition propagation Lifted jumps to return sites
	 */
	private void a(Boolean bl) {
		if (this.B == bl)
			return;
		HorizontalListView horizontalListView = this;
		while (horizontalListView.getParent() instanceof View) {
			if (horizontalListView.getParent() instanceof ListView
					|| horizontalListView.getParent() instanceof ScrollView) {
				horizontalListView.getParent()
						.requestDisallowInterceptTouchEvent(bl.booleanValue());
				this.B = bl;
				return;
			}
			horizontalListView = (HorizontalListView) horizontalListView
					.getParent();
		}
	}

	private View b(int n) {
		int n2 = this.b.getItemViewType(n);
		if (this.c(n2)) {
			return (View) ((Queue) this.h.get(n2)).poll();
		}
		return null;
	}

	public static ViewGroup.LayoutParams b(View view) {
		ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new ViewGroup.LayoutParams(-2, -1);
		}
		return layoutParams;
	}

	private void b() {
		this.p = -1;
		this.q = -1;
		this.g = 0;
		this.c = 0;
		this.d = 0;
		this.o = Integer.MAX_VALUE;
		this.setCurrentScrollState(sc.a);
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void b(int n, int n2) {
		while (n + n2 - this.l > 0 && this.p >= 1) {
			this.p = -1 + this.p;
			View view = this.b
					.getView(this.p, this.b(this.p), (ViewGroup) this);
			this.a(view, 0);
			int n3 = this.p == 0 ? view.getMeasuredWidth() : this.l
					+ view.getMeasuredWidth();
			int n4 = this.g;
			int n5 = (n -= n3) + n2 == 0 ? view.getMeasuredWidth() : this.l
					+ view.getMeasuredWidth();
			this.g = n4 - n5;
		}
	}

	private void b(Canvas canvas) {
		int n = this.getChildCount();
		Rect rect = this.j;
		this.j.top = this.getPaddingTop();
		this.j.bottom = this.j.top + this.getRenderHeight();
		for (int i = 0; i < n; ++i) {
			if (i == n - 1 && this.h(this.q))
				continue;
			View view = this.getChildAt(i);
			rect.left = view.getRight();
			rect.right = view.getRight() + this.l;
			if (rect.left < this.getPaddingLeft()) {
				rect.left = this.getPaddingLeft();
			}
			if (rect.right > this.getWidth() - this.getPaddingRight()) {
				rect.right = this.getWidth() - this.getPaddingRight();
			}
			this.a(canvas, rect);
			if (i != 0 || view.getLeft() <= this.getPaddingLeft())
				continue;
			rect.left = this.getPaddingLeft();
			rect.right = view.getLeft();
			this.a(canvas, rect);
		}
	}

	private int c(int n, int n2) {
		int n3 = this.getChildCount();
		for (int i = 0; i < n3; ++i) {
			this.getChildAt(i).getHitRect(this.j);
			if (!this.j.contains(n, n2))
				continue;
			return i;
		}
		return -1;
	}

	private void c() {
		this.b();
		this.removeAllViewsInLayout();
		this.requestLayout();
	}

	private boolean c(int n) {
		if (n < this.h.size()) {
			return true;
		}
		return false;
	}

	private float d() {
		if (Build.VERSION.SDK_INT >= 14) {
			return sa.a(this.a);
		}
		return 30.0f;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void d(int n) {
		View view = this.getRightmostChild();
		int n2 = view != null ? view.getRight() : 0;
		this.a(n2, n);
		View view2 = this.getLeftmostChild();
		int n3 = 0;
		if (view2 != null) {
			n3 = view2.getLeft();
		}
		this.b(n3, n);
	}

	public static/* synthetic */boolean d(HorizontalListView horizontalListView) {
		return horizontalListView.A;
	}

	public static/* synthetic */int e(HorizontalListView horizontalListView) {
		return horizontalListView.p;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void e(int n) {
		View view = this.getLeftmostChild();
		while (view != null && n + view.getRight() <= 0) {
			int n2 = this.g;
			int n3 = this.h(this.p) ? view.getMeasuredWidth() : this.l
					+ view.getMeasuredWidth();
			this.g = n3 + n2;
			this.a(this.p, view);
			this.removeViewInLayout(view);
			this.p = 1 + this.p;
			view = this.getLeftmostChild();
		}
		View view2 = this.getRightmostChild();
		while (view2 != null && n + view2.getLeft() >= this.getWidth()) {
			this.a(this.q, view2);
			this.removeViewInLayout(view2);
			this.q = -1 + this.q;
			view2 = this.getRightmostChild();
		}
	}

	private boolean e() {
		boolean bl = this.h(this.q);
		boolean bl2 = false;
		if (bl) {
			View view = this.getRightmostChild();
			bl2 = false;
			if (view != null) {
				int n = this.o;
				this.o = this.c + (view.getRight() - this.getPaddingLeft())
						- this.getRenderWidth();
				if (this.o < 0) {
					this.o = 0;
				}
				int n2 = this.o;
				bl2 = false;
				if (n2 != n) {
					bl2 = true;
				}
			}
		}
		return bl2;
	}

	public static/* synthetic */View.OnClickListener f(
			HorizontalListView horizontalListView) {
		return horizontalListView.C;
	}

	private void f() {
		if (this.k != null) {
			this.k.setPressed(false);
			this.refreshDrawableState();
			this.k = null;
		}
	}

	private void f(int n) {
		int n2 = this.getChildCount();
		if (n2 > 0) {
			int n3 = this.g = n + this.g;
			for (int i = 0; i < n2; ++i) {
				View view = this.getChildAt(i);
				int n4 = n3 + this.getPaddingLeft();
				int n5 = this.getPaddingTop();
				view.layout(n4, n5, n4 + view.getMeasuredWidth(),
						n5 + view.getMeasuredHeight());
				n3 += view.getMeasuredWidth() + this.l;
			}
		}
	}

	private View g(int n) {
		if (n >= this.p && n <= this.q) {
			return this.getChildAt(n - this.p);
		}
		return null;
	}

	private void g() {
		if (this.x != null) {
			this.x.c();
		}
		if (this.y != null) {
			this.y.c();
		}
	}

	private View getLeftmostChild() {
		return this.getChildAt(0);
	}

	private int getRenderHeight() {
		return this.getHeight() - this.getPaddingTop()
				- this.getPaddingBottom();
	}

	private int getRenderWidth() {
		return this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
	}

	private View getRightmostChild() {
		return this.getChildAt(-1 + this.getChildCount());
	}

	private void h() {
		if (!(this.s == null || this.b == null
				|| this.b.getCount() - (1 + this.q) >= this.t || this.u)) {
			this.u = true;
			this.s.a();
		}
	}

	private boolean h(int n) {
		if (n == -1 + this.b.getCount()) {
			return true;
		}
		return false;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private void i(int n) {
		if (this.x == null || this.y == null)
			return;
		int n2 = n + this.c;
		if (this.a != null && !this.a.isFinished())
			return;
		if (n2 < 0) {
			int n3 = Math.abs((int) n);
			this.x.a((float) n3 / (float) this.getRenderWidth());
			if (this.y.a())
				return;
			{
				this.y.c();
				return;
			}
		}
		if (n2 <= this.o)
			return;
		int n4 = Math.abs((int) n);
		this.y.a((float) n4 / (float) this.getRenderWidth());
		if (this.x.a()) {
			return;
		}
		this.x.c();
	}

	/*
	 * Enabled aggressive block sorting
	 */
	private boolean i() {
		if (this.b == null || this.b.isEmpty() || this.o <= 0) {
			return false;
		}
		return true;
	}

	private void setCurrentScrollState(sc sc) {
		if (this.w != sc && this.v != null) {
			this.v.a(sc);
		}
		this.w = sc;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public boolean a(MotionEvent motionEvent) {
		int n;
		boolean bl = !this.a.isFinished();
		this.A = bl;
		this.a.forceFinished(true);
		this.setCurrentScrollState(sc.a);
		this.f();
		if (!(this.A || (n = this.c((int) motionEvent.getX(),
				(int) motionEvent.getY())) < 0)) {
			this.k = this.getChildAt(n);
			if (this.k != null) {
				this.k.setPressed(true);
				this.refreshDrawableState();
			}
		}
		return true;
	}

	public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2,
			float f, float f2) {
		this.a.fling(this.d, 0, (int) (-f), 0, 0, this.o, 0, 0);
		this.setCurrentScrollState(sc.c);
		this.requestLayout();
		return true;
	}

	protected void dispatchDraw(Canvas canvas) {
		super.dispatchDraw(canvas);
		this.a(canvas);
	}

	protected void dispatchSetPressed(boolean bl) {
	}

	public ListAdapter getAdapter() {
		return this.b;
	}

	public int getFirstVisiblePosition() {
		return this.p;
	}

	public int getLastVisiblePosition() {
		return this.q;
	}

	protected float getLeftFadingEdgeStrength() {
		int n = this.getHorizontalFadingEdgeLength();
		if (this.c == 0) {
			return 0.0f;
		}
		if (this.c < n) {
			return (float) this.c / (float) n;
		}
		return 1.0f;
	}

	protected float getRightFadingEdgeStrength() {
		int n = this.getHorizontalFadingEdgeLength();
		if (this.c == this.o) {
			return 0.0f;
		}
		if (this.o - this.c < n) {
			return (float) (this.o - this.c) / (float) n;
		}
		return 1.0f;
	}

	public View getSelectedView() {
		return this.g(this.r);
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		this.b(canvas);
	}

	/*
	 * Enabled aggressive block sorting Lifted jumps to return sites
	 */
	@SuppressLint(value = { "WrongCall" })
	protected void onLayout(boolean bl, int n, int n2, int n3, int n4) {
		super.onLayout(bl, n, n2, n3, n4);
		if (this.b == null) {
			return;
		}
		this.invalidate();
		if (this.i) {
			int n5 = this.c;
			this.b();
			this.removeAllViewsInLayout();
			this.d = n5;
			this.i = false;
		}
		if (this.n != null) {
			this.d = this.n;
			this.n = null;
		}
		if (this.a.computeScrollOffset()) {
			this.d = this.a.getCurrX();
		}
		if (this.d < 0) {
			this.d = 0;
			if (this.x.a()) {
				this.x.a((int) this.d());
			}
			this.a.forceFinished(true);
			this.setCurrentScrollState(sc.a);
		} else if (this.d > this.o) {
			this.d = this.o;
			if (this.y.a()) {
				this.y.a((int) this.d());
			}
			this.a.forceFinished(true);
			this.setCurrentScrollState(sc.a);
		}
		int n6 = this.c - this.d;
		this.e(n6);
		this.d(n6);
		this.f(n6);
		this.c = this.d;
		if (this.e()) {
			this.onLayout(bl, n, n2, n3, n4);
			return;
		}
		if (this.a.isFinished()) {
			if (this.w != sc.c)
				return;
			this.setCurrentScrollState(sc.a);
			return;
		}
		dw.a((View) this, this.E);
	}

	protected void onMeasure(int n, int n2) {
		super.onMeasure(n, n2);
		this.z = n2;
	}

	public void onRestoreInstanceState(Parcelable parcelable) {
		if (parcelable instanceof Bundle) {
			Bundle bundle = (Bundle) parcelable;
			this.n = bundle.getInt("BUNDLE_ID_CURRENT_X");
			super.onRestoreInstanceState(bundle
					.getParcelable("BUNDLE_ID_PARENT_STATE"));
		}
	}

	public Parcelable onSaveInstanceState() {
		Bundle bundle = new Bundle();
		bundle.putParcelable("BUNDLE_ID_PARENT_STATE",
				super.onSaveInstanceState());
		bundle.putInt("BUNDLE_ID_CURRENT_X", this.c);
		return bundle;
	}

	/*
	 * Enabled aggressive block sorting
	 */
	public boolean onTouchEvent(MotionEvent motionEvent) {
		if (motionEvent.getAction() != 1) {
			if (motionEvent.getAction() != 3)
				return super.onTouchEvent(motionEvent);
			this.f();
			this.g();
			this.a(false);
			return super.onTouchEvent(motionEvent);
		}
		if (this.a == null || this.a.isFinished()) {
			this.setCurrentScrollState(sc.a);
		}
		this.a(false);
		this.g();
		return super.onTouchEvent(motionEvent);
	}

	public void setAdapter(ListAdapter listAdapter) {
		if (this.b != null) {
			this.b.unregisterDataSetObserver(this.D);
		}
		if (listAdapter != null) {
			this.u = false;
			this.b = listAdapter;
			this.b.registerDataSetObserver(this.D);
		}
		this.a(this.b.getViewTypeCount());
		this.c();
	}

	public void setDivider(Drawable drawable) {
		this.m = drawable;
		if (drawable != null) {
			this.setDividerWidth(drawable.getIntrinsicWidth());
			return;
		}
		this.setDividerWidth(0);
	}

	public void setDividerWidth(int n) {
		this.l = n;
		this.requestLayout();
		this.invalidate();
	}

	public void setOnClickListener(View.OnClickListener onClickListener) {
		this.C = onClickListener;
	}

	public void setOnScrollStateChangedListener(sb sb) {
		this.v = sb;
	}

	public void setSelection(int n) {
		this.r = n;
	}

	@Override
	public void setAdapter(Adapter arg0) {
		// TODO Auto-generated method stub

	}

}
