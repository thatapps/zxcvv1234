//zevienin

package com.lazyswipe.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.main.in;
import com.main.wo;
import com.main.ws;

// Referenced classes of package com.lazyswipe.widget:
//            ScrollIndicator, GridGallery

public class HorizontalGridList extends RelativeLayout implements wo {

	private static final String b = (new StringBuilder())
			.append("Swipe.")
			.append(com.lazyswipe.widget.HorizontalGridList.class
					.getSimpleName()).toString();
	protected ScrollIndicator a;
	private GridGallery c;
	private android.view.View.OnClickListener d;
	private int e;
	private int f;

	public HorizontalGridList(Context context) {
		this(context, null);
	}

	public HorizontalGridList(Context context, AttributeSet attributeset) {
		this(context, attributeset, 0);
	}

	public HorizontalGridList(Context context, AttributeSet attributeset, int i) {
		super(context, attributeset, i);
		a(context, attributeset, i);
	}

	public static int a(HorizontalGridList horizontalgridlist) {
		return horizontalgridlist.getCountPerPage();
	}

	private void a(Context context, AttributeSet attributeset, int i)
    {
        Context context1;
        int j;
        int k;
        j = getResources().getInteger(0x7f0d0002);
        k = getResources().getInteger(0x7f0d0001);
        context1 = null;
        TypedArray typedArray = context.obtainStyledAttributes(attributeset, in.HorizontalGridList, i, 0);
        context1 = context;
        e = typedArray.getInt(0, j);
        context1 = context;
        f = typedArray.getInt(1, k);
        if (typedArray != null)
        {
        	typedArray.recycle();
        }
//        if (typedArray != null)
//        {
//        	typedArray.recycle();
//        }
        if (e < 1)
        {
            e = j;
        }
        if (f < 1)
        {
            f = k;
        }
        return;
       
       
        
    }

	public static android.view.View.OnClickListener b(
			HorizontalGridList horizontalgridlist) {
		return horizontalgridlist.d;
	}

	private int getCountPerPage() {
		return e * f;
	}

	public void a(int i) {
		a.setSelected(i);
	}

	public void b(int i) {
	}

	protected void onFinishInflate() {
		super.onFinishInflate();
		c = (GridGallery) findViewById(0x7f0c0087);
		a = (ScrollIndicator) findViewById(0x7f0c0088);
		a.a(0);
		a.setSelected(0);
		c.setOnScreenSwitchedListener(this);
	}

	public void setAdapter(ws ws1) {
		c.setAdapter(ws1);
		a.a(ws1.b());
		a.setSelected(0);
	}

	public void setOnItemClickListener(
			android.view.View.OnClickListener onclicklistener) {
		d = onclicklistener;
	}

}
