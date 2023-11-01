package com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.res.Resources;
import android.view.View;
import p.xj0;
import p.n6;
import com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import p.lj0;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;
import android.view.ViewGroup;
import android.view.ViewParent;
import p.ae4;
import android.widget.ImageView;
import android.view.View$MeasureSpec;
import java.lang.Math;
import p.ok2;
import android.widget.ProgressBar;

public class GlueContextMenuLayout extends LinearLayout	// class@0008e3 from classes.dex
{
    public StretchingGradientDrawable a;
    public ProgressBar b;
    public final ArrayList c;
    public ok2 t;
    public final int v;
    public int w;
    public int x;
    public boolean y;

    public void GlueContextMenuLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new ArrayList();
       this.v = xj0.d0(16.00f, this.getResources());
       int i = n6.b(this.getContext(), R.color.black);
       StretchingGradientDrawable stretchingGr = new StretchingGradientDrawable(lj0.h(i, 0), i);
       this.a = stretchingGr;
       dh7.q(this, stretchingGr);
       this.setClipToPadding(0);
    }
    private int getHeaderCount(){
       int i = (this.t == null)? 0: 1;
       return i;
    }
    private int getVisibleItemsLimit(){
       return this.x;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.b.setVisibility(8);
       super.onLayout(p0, p1, p2, p3, p4);
       this.b.setVisibility(this.b.getVisibility());
       if (this.b.getVisibility() != 8) {
          GlueContextMenuLayout tb = this.b;
          int i = this.getParent().getMeasuredHeight() / 2;
          tb.layout(0, i, tb.getMeasuredWidth(), (this.b.getMeasuredHeight() + i));
       }
       if ((this.c.isEmpty() ^ 0x01)) {
          GlueContextMenuLayout tt = this.t;
          ae4 e = tt.e;
          this.a.setGradientHeight(((e.getHeight() / 2) + (e.getTop() + tt.d.getTop())));
       }else {
          this.a.setGradientHeight((this.getMeasuredHeight() / 2));
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       int i3;
       int i4;
       int visibility = this.b.getVisibility();
       this.b.setVisibility(8);
       GlueContextMenuLayout tv = this.v;
       int i = 0;
       this.setPadding(tv, i, tv, tv);
       super.onMeasure(p0, p1);
       GlueContextMenuLayout tc = this.c;
       if ((tc.isEmpty() ^ 0x01)) {
          int size = (this.y != null)? View$MeasureSpec.getSize(p1): Math.max(View$MeasureSpec.getSize(p1), this.getParent().getMeasuredHeight());
          int measuredHeig = this.getMeasuredHeight();
          int i1 = tc.size() + this.getHeaderCount();
          if (((size - this.w)) > measuredHeig && i1 <= this.getVisibleItemsLimit()) {
             size = size - measuredHeig;
          }else {
             i1 = Math.min(i1, this.getVisibleItemsLimit());
             measuredHeig = 0;
             for (; i <= i1; i = i3) {
                int measuredHeig1 = this.getChildAt(i).getMeasuredHeight();
                int i2 = measuredHeig + measuredHeig1;
                if ((i3 = i + 1) <= i1) {
                   float f = (float)this.getChildAt(i3).getMeasuredHeight() * 0.47f;
                   f = f + (float)i2;
                   i4 = (int)f;
                }else {
                   i4 = i2;
                }
                if (i != i1) {
                   i = size - this.w;
                   if (i4 <= i) {
                      measuredHeig = i2;
                   }
                }
                measuredHeig = (int)(((float)measuredHeig1 * 0.47f) + (float)measuredHeig);
                break ;
             }
             size = Math.max((size - measuredHeig), xj0.e0(16.00f, this.getResources()));
          }
          this.setPadding(tv, size, tv, tv);
          super.onMeasure(p0, p1);
       }else {
          this.setMeasuredDimension(View$MeasureSpec.getSize(p0), View$MeasureSpec.getSize(p1));
       }
       this.b.measure(p0, p1);
       this.b.setVisibility(visibility);
       return;
    }
    public void setHeader(ok2 p0){
       this.t = p0;
    }
    public void setIsInLandscapeAndAdaptive(boolean p0){
       this.y = p0;
    }
    public void setMinTopMarginPx(int p0){
       this.w = p0;
       this.requestLayout();
    }
    public void setNumberOfVisibleItems(int p0){
       this.x = p0;
    }
    public void setProgressBarVisibility(int p0){
       this.b.setVisibility(p0);
    }
    public void setSpinner(View p0){
       this.b = p0;
    }
}
