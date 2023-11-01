package com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import p.me2;
import java.lang.Object;
import android.content.res.Resources;
import p.xj0;
import p.xe7;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import p.yq5;
import androidx.viewpager2.widget.ViewPager2;
import android.graphics.Canvas;
import p.wh7;
import p.eh7;
import java.util.List;
import p.ak7;

public final class ViewPagerIndicator extends View	// class@000908 from classes.dex
{
    public final int a;
    public final int b;
    public float c;
    public final Paint t;
    public final Paint v;
    public ViewPager2 w;
    public final me2 x;

    public void ViewPagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0304ae);
       this.x = new me2(2, this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, xe7.z, R.attr.pasteDefaultsItemIndicatorStyle, 0);
       this.a = typedArray.getDimensionPixelSize(2, xj0.e0(10.00f, p0.getResources()));
       this.b = typedArray.getDimensionPixelOffset(3, xj0.d0(6.00f, p0.getResources()));
       int color = typedArray.getColor(1, -7829368);
       int color1 = typedArray.getColor(0, -1);
       typedArray.recycle();
       Paint paint = new Paint();
       this.t = paint;
       paint.setAntiAlias(1);
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(color);
       paint = new Paint();
       this.v = paint;
       paint.setAntiAlias(1);
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(color1);
    }
    private int getItemCount(){
       ViewPagerIndicator tw;
       yq5 adapter;
       if ((tw = this.w) != null && (adapter = tw.getAdapter()) != null) {
          return adapter.d();
       }
       return 0;
    }
    public final void onDraw(Canvas p0){
       ViewPagerIndicator tb;
       int itemCount = this.getItemCount();
       int i = 1;
       if (itemCount <= i) {
          return;
       }
       int i1 = p0.save();
       p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
       ViewPagerIndicator ta = this.a;
       float f = (float)ta / 2.00f;
       int i2 = 0;
       if (eh7.d(this) != i) {
          i = 0;
       }
       int width = this.getWidth();
       while (true) {
          tb = this.b;
          if (i2 < itemCount) {
             int i3 = tb + ta;
             i3 = i3 * i2;
             float f1 = (float)i3 + f;
             if (i) {
                f1 = (float)width - f1;
             }
             p0.drawCircle(f1, f, f, this.t);
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       float f2 = (this.c * (float)(ta + tb)) + f;
       if (i) {
          f2 = (float)width - f2;
       }
       p0.drawCircle(f2, f, f, this.v);
       p0.restoreToCount(i1);
       return;
    }
    public final void onMeasure(int p0,int p1){
       p0 = this.getItemCount();
       int i = 1;
       if (p0 <= i) {
          this.setVisibility(8);
          this.setMeasuredDimension(0, 0);
          return;
       }else {
          ViewPagerIndicator ta = this.a;
          this.setVisibility(0);
          this.setMeasuredDimension(((this.getPaddingRight() + this.getPaddingLeft()) + (((p0 - i) * this.b) + (p0 * ta))), ((this.getPaddingBottom() + this.getPaddingTop()) + ta));
          return;
       }
    }
    public void setupWithViewPager(ViewPager2 p0){
       ViewPagerIndicator tw = this.w;
       ViewPagerIndicator tx = this.x;
       if (tw != null) {
          tw.c.b.remove(tx);
          this.w = null;
       }
       this.w = p0;
       p0.c.b.add(tx);
       this.c = (float)this.w.getCurrentItem();
       this.invalidate();
       return;
    }
    public void setupWithViewPager(ak7 p0){
       ViewPagerIndicator tw;
       if ((tw = this.w) != null) {
          tw.c.b.remove(this.x);
          this.w = null;
       }
       throw null;
    }
}
