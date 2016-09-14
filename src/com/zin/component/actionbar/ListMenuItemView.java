/*
 * Decompiled with CFR 0_92.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 */
package com.lazyswipe.component.actionbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lazyswipe.zev.R;
import com.main.lb;
import com.main.lh;

/*
 * Failed to analyse overrides
 */
public class ListMenuItemView
extends LinearLayout
implements lh {
    private lb a;
    private ImageView b;
    private TextView c;
    private ImageView d;
    private Drawable e;
    private int f = -1;
    private Context g;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(CharSequence charSequence, int n) {
        if (charSequence != null) {
            this.c.setText(charSequence);
            if (this.c.getVisibility() == 0) return;
            {
                this.c.setVisibility(0);
                return;
            }
        } else {
            if (this.c.getVisibility() == 8) return;
            {
                this.c.setVisibility(8);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(lb lb) {
        this.a = lb;
        int n = lb.i() ? 0 : 8;
        this.setVisibility(n);
        this.a(lb.a((lh)this), lb.k());
        this.setIcon(lb.h());
        this.setEnabled(lb.d());
        this.setIndicator(lb.g());
    }

    public boolean a() {
        return false;
    }

    public lb getItemData() {
        return this.a;
    }

    @SuppressWarnings("deprecation")
	protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackgroundDrawable(this.e);
        this.c = (TextView)this.findViewById(R.id.title);
        if (this.f != -1) {
            this.c.setTextAppearance(this.g, this.f);
        }
        this.b = (ImageView)this.findViewById(R.id.icon);
        this.d = (ImageView)this.findViewById(R.id.indicator);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.b.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
            return;
        }
        this.b.setVisibility(8);
    }

    public void setIndicator(Drawable drawable) {
        if (drawable != null) {
            this.d.setImageDrawable(drawable);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            return;
        }
        this.d.setVisibility(8);
    }
}

