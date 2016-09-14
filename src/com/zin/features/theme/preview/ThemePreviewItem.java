package com.lazyswipe.features.theme.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lazyswipe.zev.R;
import com.main.ox;
import com.main.tf;

public class ThemePreviewItem extends LinearLayout
{

    private ImageView a;
    private View b;

    public ThemePreviewItem(Context context)
    {
        super(context);
    }

    public ThemePreviewItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(int i, ox ox)
    {
        setTag(ox);
    }

    public ImageView getImage()
    {
        return a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (ImageView)findViewById(0x7f0c00bb);
        b = findViewById(0x7f0c00a8);
    }

    public void setImage(Bitmap bitmap)
    {
        if (tf.b(bitmap))
        {
            a.setImageBitmap(bitmap);
            b.setVisibility(8);
        } else
        {
            b.setVisibility(0);
            if (bitmap == null)
            {
                a.setImageBitmap(null);
                return;
            }
        }
    }
}
