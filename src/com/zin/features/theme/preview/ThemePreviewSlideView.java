package com.lazyswipe.features.theme.preview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

import com.lazyswipe.widget.GridGallery;
import com.main.to;

public class ThemePreviewSlideView extends GridGallery {

	   private float a;
	   private Matrix b = new Matrix();


	   public ThemePreviewSlideView(Context var1) {
	      super(var1);
	   }

	   public ThemePreviewSlideView(Context var1, AttributeSet var2) {
	      super(var1, var2);
	   }

	   protected boolean drawChild(Canvas var1, View var2, long var3) {
	      int var7;
	      if(this.a == 0.0F && var2 instanceof ThemePreviewItem) {
	         var7 = ((ThemePreviewItem)var2).getImage().getMeasuredWidth();
	         if(var7 != 0) {
	            this.a = (float)(to.p(this.getContext()) - var7) * 3.0F / 4.0F;
	         }
	      }

	      if(this.a != 0.0F) {
	         var7 = var2.getLeft();
	         int var8 = var2.getWidth();
	         int var9 = var2.getHeight();
	         float var5 = (float)var7 * 1.0F / (float)var8;
	         this.b.reset();
	         this.b.postTranslate((float)(-var7), (float)(-var9 / 2));
	         if(var5 < 0.0F) {
	            this.b.postTranslate((float)(-var8), 0.0F);
	         }

	         float var6 = 0.8F + (1.0F - Math.abs(var5)) * 0.2F;
	         this.b.postScale(var6, var6);
	         if(var5 < 0.0F) {
	            this.b.postTranslate((float)var8, 0.0F);
	         }

	         this.b.postTranslate((float)var7, (float)(var9 / 2));
	         this.b.postTranslate(-var5 * this.a, 0.0F);
	         var1.save();
	         var1.concat(this.b);
	         boolean var10 = super.drawChild(var1, var2, var3);
	         var1.restore();
	         return var10;
	      } else {
	         return super.drawChild(var1, var2, var3);
	      }
	   }
	}
