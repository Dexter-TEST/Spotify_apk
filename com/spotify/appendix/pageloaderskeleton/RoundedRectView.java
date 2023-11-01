package com.spotify.appendix.pageloaderskeleton.RoundedRectView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import p.io2;
import android.content.res.TypedArray;
import android.graphics.Canvas;

public class RoundedRectView extends View	// class@000537 from classes.dex
{
    public final Paint a;
    public float b;

    public void RoundedRectView(Context p0,AttributeSet p1){
       int index;
       super(p0, p1);
       Paint paint = new Paint();
       this.a = paint;
       paint.setAntiAlias(true);
       paint.setColor(0xffff0000);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, io2.y);
       int i = 0;
       while (i < typedArray.getIndexCount()) {
          if (!(index = typedArray.getIndex(i))) {
             this.setColor(typedArray.getColor(index, this.a.getColor()));
          }else if(index == 1){
             this.setCornerRadius((float)typedArray.getDimensionPixelSize(index, 0));
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public final void onDraw(Canvas p0){
       super.onDraw(p0);
       RoundedRectView tb = this.b;
       p0.drawRoundRect(0, 0, (float)(this.getWidth() + 0), (float)(this.getHeight() + 0), tb, tb, this.a);
    }
    public void setColor(int p0){
       this.a.setColor(p0);
    }
    public void setCornerRadius(float p0){
       this.b = p0;
    }
}
